package org.platypus.impl.korm.sql.vendors

import org.platypus.impl.korm.sql.*
import org.platypus.impl.korm.sql.column.type.IColumnType
import org.platypus.impl.korm.sql.transactions.TransactionManager
import org.platypus.orm.database.ddl.DDLUtils
import java.nio.ByteBuffer
import java.sql.ResultSet
import java.util.*

interface DataTypeProvider {
    fun shortAutoincType() = "INT AUTO_INCREMENT"

    fun shortType() = "INT"

    fun longAutoincType() = "BIGINT AUTO_INCREMENT"

    fun longType() = "BIGINT"

    fun uuidType() = "BINARY(16)"

    fun dateTimeType() = "DATETIME"
    fun dateType() = "DATE"

    fun timeType() = "DATETIME"

    fun blobType(): String = "BLOB"

    fun binaryType(length: Int): String = "VARBINARY($length)"

    fun booleanType(): String = "BOOLEAN"

    fun booleanToStatementString(bool: Boolean) = bool.toString()

    fun uuidToDB(value: UUID): Any =
            ByteBuffer.allocate(16).putLong(value.mostSignificantBits).putLong(value.leastSignificantBits).array()

    fun booleanFromStringToBoolean(value: String): Boolean = value.toBoolean()

    fun textType() = "TEXT"
    val blobAsStream get() = false
    val defaultVarcharLength: Int
        get() = 50

    fun processForDefaultValue(e: Expression<*>): String = when (e) {
        is LiteralOp<*> -> e.toSQL(QueryBuilder(false))
        else -> "(${e.toSQL(QueryBuilder(false))})"
    }
}

open class FunctionProvider {

    open fun substring(expr: Expression<String?>, start: ExpressionWithColumnType<Int>, length: ExpressionWithColumnType<Int>, builder: QueryBuilder): String =
            "SUBSTRING(${expr.toSQL(builder)}, ${start.toSQL(builder)}, ${length.toSQL(builder)})"

    open fun random(seed: Int?): String = "RANDOM(${seed?.toString().orEmpty()})"

    open fun cast(expr: Expression<*>, type: IColumnType, builder: QueryBuilder) = "CAST(${expr.toSQL(builder)} AS ${type.sqlType()})"

    open fun <T : String?> ExpressionWithColumnType<T>.match(pattern: String, mode: MatchMode? = null): Op<Boolean> = this@match.like(pattern)

    interface MatchMode {
        fun mode(): String
    }
}

interface DatabaseDialect {
    val name: String
    val dataTypeProvider: DataTypeProvider
    val ddlUtils: DDLUtils
    val functionProvider: FunctionProvider

    fun getDatabase(): String

    fun allTablesNames(): List<String>
    /**
     * returns list of pairs (column name + required) for every table
     */
    fun tableColumns(vararg tables: KormTable): Map<KormTable, List<Pair<String, Boolean>>> = emptyMap()

    /**
     * returns map of constraint for a table name/column name pair
     */
    fun columnConstraints(vararg tables: KormTable): Map<Pair<String, String>, List<ForeignKeyConstraint>> = emptyMap()

    /**
     * return set of indices for each table
     */
    fun existingIndices(vararg tables: KormTable): Map<KormTable, List<Index>> = emptyMap()

    fun tableExists(table: KormTable): Boolean

    fun checkTableMapping(table: KormTable) = true

    fun resetCaches()

    fun supportsSelectForUpdate(): Boolean
    val supportsMultipleGeneratedKeys: Boolean
    fun isAllowedAsColumnDefault(e: Expression<*>) = e is LiteralOp<*>

    // --> REVIEW
    val supportsIfNotExists: Boolean get() = true
    val needsSequenceToAutoInc: Boolean get() = false
    val needsQuotesWhenSymbolsInNames: Boolean get() = true
    val identifierLengthLimit: Int get() = 100
    fun catalog(transaction: Transaction): String = transaction.connection.catalog
    // <-- REVIEW

    val defaultReferenceOption: ReferenceOption get() = ReferenceOption.RESTRICT

    // Specific SQL statements

    fun insert(ignore: Boolean, table: KormTable, columns: List<Column<*>>, expr: String, transaction: Transaction): String
    fun delete(ignore: Boolean, table: KormTable, where: String?, transaction: Transaction): String
    fun replace(table: KormTable, data: List<Pair<Column<*>, Any?>>, transaction: Transaction): String

    fun createIndex(unique: Boolean, tableName: String, indexName: String, columns: List<String>): String
    fun dropIndex(tableName: String, indexName: String): String
    fun modifyColumn(column: Column<*>): String

    fun limit(size: Int, offset: Int = 0, alreadyOrdered: Boolean = true): String
}

internal abstract class VendorDialect(override val name: String,
                                      override val dataTypeProvider: DataTypeProvider,
                                      override val functionProvider: FunctionProvider) : DatabaseDialect {

    /* Cached values */
    private var _allTableNames: List<String>? = null
    val allTablesNames: List<String>
        get() {
            if (_allTableNames == null) {
                _allTableNames = allTablesNames()
            }
            return _allTableNames!!
        }

    private val isUpperCaseIdentifiers by lazy { TransactionManager.current().db.metadata.storesUpperCaseIdentifiers() }
    private val isLowerCaseIdentifiers by lazy { TransactionManager.current().db.metadata.storesLowerCaseIdentifiers() }
    val String.inProperCase: String
        get() = when {
            isUpperCaseIdentifiers -> toUpperCase()
            isLowerCaseIdentifiers -> toLowerCase()
            else -> this
        }

    /* Method always re-read data from DB. Using allTablesNames field is preferred way */
    override fun allTablesNames(): List<String> {
        val result = ArrayList<String>()
        val tr = TransactionManager.current()
        val resultSet = tr.db.metadata.getTables(null, null, "%", arrayOf("TABLE"))

        while (resultSet.next()) {
            result.add(resultSet.getString("TABLE_NAME").inProperCase)
        }
        return result
    }

    override fun getDatabase(): String = catalog(TransactionManager.current())

    override fun tableExists(table: KormTable) = allTablesNames.any { it == table.nameInDatabaseCase() }

    protected fun ResultSet.extractColumns(tables: Array<out KormTable>, extract: (ResultSet) -> Triple<String, String, Boolean>): Map<KormTable, List<Pair<String, Boolean>>> {
        val mapping = tables.associateBy { it.nameInDatabaseCase() }
        val result = HashMap<KormTable, MutableList<Pair<String, Boolean>>>()

        while (next()) {
            val (tableName, columnName, nullable) = extract(this)
            mapping[tableName].let { t ->
                result.getOrPut(t!!) { arrayListOf() } += columnName to nullable
            }
        }
        return result
    }

    override fun tableColumns(vararg tables: KormTable): Map<KormTable, List<Pair<String, Boolean>>> {
        val rs = TransactionManager.current().db.metadata.getColumns(getDatabase(), null, null, null)
        return rs.extractColumns(tables) {
            Triple(it.getString("TABLE_NAME"), it.getString("COLUMN_NAME")!!, it.getBoolean("NULLABLE"))
        }
    }

    private val columnConstraintsCache = HashMap<String, List<ForeignKeyConstraint>>()

    override @Synchronized
    fun columnConstraints(vararg tables: KormTable): Map<Pair<String, String>, List<ForeignKeyConstraint>> {
        val constraints = HashMap<Pair<String, String>, MutableList<ForeignKeyConstraint>>()
        for (table in tables.map { it.nameInDatabaseCase() }) {
            columnConstraintsCache.getOrPut(table, {
                val rs = TransactionManager.current().db.metadata.getImportedKeys(getDatabase(), null, table)
                val tableConstraint = arrayListOf<ForeignKeyConstraint>()
                while (rs.next()) {
                    val refereeTableName = rs.getString("FKTABLE_NAME")!!
                    val refereeColumnName = rs.getString("FKCOLUMN_NAME")!!
                    val constraintName = rs.getString("FK_NAME")!!
                    val refTableName = rs.getString("PKTABLE_NAME")!!
                    val refColumnName = rs.getString("PKCOLUMN_NAME")!!
                    val constraintDeleteRule = ReferenceOption.resolveRefOptionFromJdbc(rs.getInt("DELETE_RULE"))
                    tableConstraint.add(ForeignKeyConstraint(constraintName, refereeTableName, refereeColumnName, refTableName, refColumnName, constraintDeleteRule))
                }
                tableConstraint
            }).forEach { it ->
                constraints.getOrPut(it.refereeTable to it.refereeColumn, { arrayListOf() }).add(it)
            }

        }
        return constraints
    }

    private val existingIndicesCache = HashMap<KormTable, List<Index>>()

    override @Synchronized
    fun existingIndices(vararg tables: KormTable): Map<KormTable, List<Index>> {
        for (table in tables) {
            val tableName = table.nameInDatabaseCase()
            val transaction = TransactionManager.current()
            val metadata = transaction.db.metadata

            existingIndicesCache.getOrPut(table, {
                val pkNames = metadata.getPrimaryKeys(getDatabase(), null, tableName).let { rs ->
                    val names = arrayListOf<String>()
                    while (rs.next()) {
                        rs.getString("PK_NAME").let { names += it }
                    }
                    names
                }
                val rs = metadata.getIndexInfo(getDatabase(), null, tableName, false, false)

                val tmpIndices = hashMapOf<Pair<String, Boolean>, MutableList<String>>()

                while (rs.next()) {
                    rs.getString("INDEX_NAME").let {
                        val column = transaction.quoteIfNecessary(rs.getString("COLUMN_NAME")!!)
                        val isUnique = !rs.getBoolean("NON_UNIQUE")
                        tmpIndices.getOrPut(it to isUnique, { arrayListOf() }).add(column)
                    }
                }
                tmpIndices.filterNot { it.key.first in pkNames }.map { Index(it.key.first, tableName, it.value, it.key.second) }
            })
        }
        return HashMap(existingIndicesCache)
    }

    override @Synchronized
    fun resetCaches() {
        _allTableNames = null
        columnConstraintsCache.clear()
        existingIndicesCache.clear()
    }

    override fun replace(table: KormTable, data: List<Pair<Column<*>, Any?>>, transaction: Transaction): String {
        throw UnsupportedOperationException("There's no generic SQL for replace. There must be vendor specific implementation")
    }

    protected open val DEFAULT_VALUE_EXPRESSION = "DEFAULT VALUES"

    override fun insert(ignore: Boolean, table: KormTable, columns: List<Column<*>>, expr: String, transaction: Transaction): String {
        if (ignore) {
            throw UnsupportedOperationException("There's no generic SQL for INSERT IGNORE. There must be vendor specific implementation")
        }

        val (columnsExpr, valuesExpr) = if (columns.isNotEmpty()) {
            columns.joinToString(prefix = "(", postfix = ")") { transaction.identity(it) } to expr
        } else "" to DEFAULT_VALUE_EXPRESSION

        return "INSERT INTO ${transaction.identity(table)} $columnsExpr $valuesExpr"
    }

    override fun delete(ignore: Boolean, table: KormTable, where: String?, transaction: Transaction): String {
        if (ignore) {
            throw UnsupportedOperationException("There's no generic SQL for DELETE IGNORE. There must be vendor specific implementation")
        }

        return buildString {
            append("DELETE FROM ")
            append(transaction.identity(table))
            if (where != null) {
                append(" WHERE ")
                append(where)
            }
        }
    }

    override fun createIndex(unique: Boolean, tableName: String, indexName: String, columns: List<String>): String {
        val t = TransactionManager.current()
        val quotedTableName = t.quoteIfNecessary(tableName)
        val quotedIndexName = t.quoteIfNecessary(t.cutIfNecessary(indexName))
        val columnsList = columns.joinToString(prefix = "(", postfix = ")")
        return if (unique) {
            "ALTER TABLE $quotedTableName ADD CONSTRAINT $quotedIndexName UNIQUE $columnsList"
        } else {
            "CREATE INDEX $quotedIndexName ON $quotedTableName $columnsList"
        }

    }

    override fun dropIndex(tableName: String, indexName: String): String {
        val t = TransactionManager.current()
        return "ALTER TABLE ${t.quoteIfNecessary(tableName)} DROP CONSTRAINT ${t.quoteIfNecessary(indexName)}"
    }

    private val supportsSelectForUpdate by lazy { TransactionManager.current().db.metadata.supportsSelectForUpdate() }
    override fun supportsSelectForUpdate() = supportsSelectForUpdate

    override val supportsMultipleGeneratedKeys: Boolean = true

    override fun limit(size: Int, offset: Int, alreadyOrdered: Boolean) = "LIMIT $size" + if (offset > 0) " OFFSET $offset" else ""

    override fun modifyColumn(column: Column<*>): String = "MODIFY COLUMN ${column.descriptionDdl()}"
}

internal val currentDialect: DatabaseDialect get() = TransactionManager.current().db.dialect

internal val currentDialectIfAvailable: DatabaseDialect?
    get() =
        if (TransactionManager.isInitialized() && TransactionManager.currentOrNull() != null) {
            currentDialect
        } else null

internal fun String.inProperCase(): String = (currentDialectIfAvailable as? VendorDialect)?.run {
    this@inProperCase.inProperCase
} ?: this