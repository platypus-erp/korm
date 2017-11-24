package org.platypus.impl.korm.sql

import org.platypus.Platypus
import org.platypus.api.env.PlatypusEnvironement
import org.platypus.impl.korm.sql.column.type.BooleanColumnType
import org.platypus.impl.korm.sql.transactions.TransactionManager
import org.platypus.impl.korm.sql.vendors.currentDialect
import org.platypus.impl.korm.sql.vendors.inProperCase

object SchemaUtils {
    fun createStatements(vararg tables: KormTable): Set<String> {
        return createStatements(tables.toList())
    }

    fun createStatements(tables: Collection<KormTable>): Set<String> {
        val statements = LinkedHashSet<String>()
        if (tables.isEmpty())
            return statements


        for (table in tables) {

            if (table.exists()) continue

            // create table
            statements.addAll(table.ddl)

            // create indices
            for ((columns, isUnique) in table.indices) {
                statements.addAll(createIndex(columns, isUnique))
            }
        }

        return statements
    }

    fun createSequence(name: String) = Seq(name).createStatement()

    fun createFKey(reference: Column<*>) = ForeignKeyConstraint.from(reference).createStatement()

    fun createIndex(columns: Array<out Column<*>>, isUnique: Boolean) = Index.forColumns(*columns, unique = isUnique).createStatement()

    private fun addMissingColumnsStatements(vararg tables: KormTable): List<String> {
        with(TransactionManager.current()) {
            val statements = ArrayList<String>()
            if (tables.isEmpty())
                return statements

            val existingTableColumns = logTimeSpent("Extracting table columns") {
                currentDialect.tableColumns(*tables)
            }

            for (table in tables) {
                //create columns
                val thisTableExistingColumns = existingTableColumns[table].orEmpty()
                val missingTableColumns = table.columns.filterNot { c -> thisTableExistingColumns.any { it.first.equals(c.name, true) } }
                missingTableColumns.flatMapTo(statements) { it.ddl }

                if (db.supportsAlterTableWithAddColumn) {
                    // create indexes with new columns
                    for ((columns, isUnique) in table.indices) {
                        if (columns.any { missingTableColumns.contains(it) }) {
                            statements.addAll(createIndex(columns, isUnique))
                        }
                    }

                    // sync nullability of existing columns
                    val incorrectNullabilityColumns = table.columns.filter { c ->
                        thisTableExistingColumns.any { c.name.equals(it.first, true) && it.second != c.columnType.required }
                    }
                    incorrectNullabilityColumns.flatMapTo(statements) { it.modifyStatement() }
                }
            }

            if (db.supportsAlterTableWithAddColumn) {
                val existingColumnConstraint = logTimeSpent("Extracting column constraints") {
                    db.dialect.columnConstraints(*tables)
                }

                for (table in tables) {
                    for (column in table.columns) {
                        if (column.referee != null) {
                            val existingConstraint = existingColumnConstraint[table.tableName.inProperCase() to column.name.inProperCase()]!!.firstOrNull()
                            if (existingConstraint == null) {
                                statements.addAll(createFKey(column))
                            } else if (existingConstraint.referencedTable != column.referee!!.table.tableName.inProperCase()
                                    || column.onDelete != existingConstraint.deleteRule) {
                                statements.addAll(existingConstraint.dropStatement())
                                statements.addAll(createFKey(column))
                            }
                        }
                    }
                }
            }

            return statements
        }

    }

    fun <T : KormTable> create(env: PlatypusEnvironement, vararg tables: T) {
        create(env, tables.toList())
    }

    fun create(env: PlatypusEnvironement, tables: List<KormTable>) {
        with(env.cr) {
            val statements = createStatements(tables)
            for (statement in statements) {
                logger.log(statement)
                exec(statement)
            }
            currentDialect.resetCaches()
        }
    }

    fun create(env: PlatypusEnvironement) {
        create(env, Platypus.get().tableRegistry.values + Platypus.get().m2mregistry.values)
    }

    /**
     * This function should be used in cases when you want an easy-to-use auto-actualization of database scheme.
     * It will create all absent tables, add missing columns for existing tables if it's possible (columns are required or have default values).
     *
     * Also if there is inconsistency in DB vs code mappings (excessive or absent indexes)
     * then DDLs to fix it will be logged to exposedLogger.
     *
     * This functionality is based on jdbc metadata what might be a bit slow, so it is recommended to call this function once
     * at application startup and provide all tables you want to actualize.
     *
     * Please note, that execution of this function concurrently might lead to unpredictable state in database due to
     * non-transactional behavior of some DBMS on processing DDL statements (e.g. MySQL) and metadata caches.

     * To prevent such cases is advised to use any "global" synchronization you prefer (via redis, memcached, etc) or
     * with Exposed's provided lock based on synchronization on a dummy "Buzy" table (@see SchemaUtils#withDataBaseLock).
     */
    fun createMissingTablesAndColumns(vararg tables: KormTable) {
        with(TransactionManager.current()) {
            db.dialect.resetCaches()
            val createStatements = logTimeSpent("Preparing create tables statements") {
                createStatements(*tables)
            }
            logTimeSpent("Executing create tables statements") {
                for (statement in createStatements) {
                    exec(statement)
                }
                commit()
            }

            val alterStatements = logTimeSpent("Preparing alter table statements") {
                addMissingColumnsStatements(*tables)
            }
            logTimeSpent("Executing alter table statements") {
                for (statement in alterStatements) {
                    exec(statement)
                }
                commit()
            }
            logTimeSpent("Checking mapping consistence") {
                for (statement in checkMappingConsistence(*tables).filter { it !in statements }) {
                    exec(statement)
                }
                commit()
            }
            db.dialect.resetCaches()
        }
    }


    /**
     * Creates table with name "busy" (if not present) and single column to be used as "synchronization" point. KormTable wont be dropped after execution.
     *
     * All code provided in _body_ closure will be executed only if there is no another code which running under "withDataBaseLock" at same time.
     * That means that concurrent execution of long running tasks under "database lock" might lead to that only first of them will be really executed.
     */
    fun <T> Transaction.withDataBaseLock(env: PlatypusEnvironement, body: () -> T) {
        val buzyTable = object : KormTable("busy") {
            val busy = registerColumn<Boolean>("busy", BooleanColumnType(false)).uniqueIndex()
        }
        create(env, buzyTable)
        val isBusy = buzyTable.selectAll().forUpdate().any()
        if (!isBusy) {
            buzyTable.insert { it[buzyTable.busy] = true }
            try {
                body()
            } finally {
//                buzyTable.deleteAll()
                connection.commit()
            }
        }
    }

//    fun drop(vararg tables: KormTable) {
//        var tablesForDeletion = EntityCache
//                .sortTablesByReferences(tables.toList())
//                .reversed()
//                .filter { it in tables }
//        if (!currentDialect.supportsIfNotExists) {
//            tablesForDeletion = tablesForDeletion.filter { it.exists()}
//        }
//        tablesForDeletion
//                .flatMap { it.dropStatement() }
//                .forEach {
//                    TransactionManager.current().exec(it)
//                }
//        currentDialect.resetCaches()
//    }
}