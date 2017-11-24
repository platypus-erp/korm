package org.platypus.impl.korm.sql

import org.platypus.api.env.PlatypusEnvironement
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.sql.statements.BatchDataInconsistentException
import org.platypus.impl.korm.sql.statements.BatchInsertStatement
import org.platypus.impl.korm.sql.statements.InsertSelectStatement
import org.platypus.impl.korm.sql.statements.InsertStatement
import org.platypus.impl.korm.sql.statements.ReplaceStatement
import org.platypus.impl.korm.sql.statements.UpdateBuilder
import org.platypus.impl.korm.sql.transactions.TransactionManager
import org.platypus.impl.korm.sql.vendors.currentDialect
import java.util.*

/**
 * @sample org.chmuche.korm.sql.tests.shared.DMLTests.testSelect01
 */
inline fun FieldSet.select(where: () -> Op<Boolean>): Query = select(where())

inline fun <M : BaseModel<M, *>> M.select(env: PlatypusEnvironement, where: () -> Op<Boolean>): ModelQuery<M> = select(env, where())

fun FieldSet.select(where: Op<Boolean>): Query = Query(TransactionManager.current(), this, where)
fun <M : BaseModel<M, *>> M.select(env: PlatypusEnvironement, where: Op<Boolean>): ModelQuery<M> = ModelQuery(env, this, where)

/**
 * @sample org.chmuche.korm.sql.tests.shared.DMLTests.testSelectDistinct
 */
fun FieldSet.selectAll(): Query = Query(TransactionManager.current(), this, null)

/**
 * @sample org.chmuche.korm.sql.tests.shared.DMLTests.testInsert01
 */
fun <T : KormTable> T.insert(body: T.(InsertStatement<Number>) -> Unit): InsertStatement<Number> = InsertStatement<Number>(this).apply {
    body(this)
    execute(TransactionManager.current())
}

/**
 * @sample org.chmuche.korm.sql.tests.shared.DMLTests.testGeneratedKey03
 */
//fun <Key:Any, T: IdTable<Key>> T.insertAndGetId(ignore: Boolean = false, body: T.(InsertStatement<EntityID<Key>>)->Unit) =
//    InsertStatement<EntityID<Key>>(this, ignore).run {
//        body(this)
//        execute(TransactionManager.current())
//        generatedKey
//    }

/**
 * @sample org.chmuche.korm.sql.tests.shared.DMLTests.testBatchInsert01
 */
fun <T : KormTable, E : Any> T.batchInsert(data: Iterable<E>, ignore: Boolean = false, body: BatchInsertStatement.(E) -> Unit): List<Map<Column<*>, Any>> {
    if (data.count() == 0) return emptyList()
    fun newBatchStatement() = BatchInsertStatement(this, ignore)
    var statement = newBatchStatement()

    val result = ArrayList<Map<Column<*>, Any>>()
    fun BatchInsertStatement.handleBatchException(body: BatchInsertStatement.() -> Unit) {
        try {
            body()
        } catch (e: BatchDataInconsistentException) {
            execute(TransactionManager.current())
            result += generatedKey.orEmpty()
            statement = newBatchStatement()
        }
    }

    for (element in data) {
        statement.handleBatchException { addBatch() }
        statement.handleBatchException {
            body(element)
            validateLastBatch()
        }
    }
    if (statement.data.isNotEmpty()) {
        statement.execute(TransactionManager.current())
        result += statement.generatedKey.orEmpty()
    }
    return result
}

fun <T : KormTable> T.insertIgnore(body: T.(UpdateBuilder<*>) -> Unit): InsertStatement<Long> = InsertStatement<Long>(this, isIgnore = true).apply {
    body(this)
    execute(TransactionManager.current())
}

//fun <Key:Any, T: IdTable<Key>> T.insertIgnoreAndGetId(body: T.(UpdateBuilder<*>)->Unit) = InsertStatement<EntityID<Key>>(this, isIgnore = true).run {
//    body(this)
//    execute(TransactionManager.current())
//    generatedKey
//}

/**
 * @sample org.chmuche.korm.sql.tests.shared.DMLTests.testReplace01
 */
fun <T : KormTable> T.replace(body: T.(UpdateBuilder<*>) -> Unit): ReplaceStatement<Long> = ReplaceStatement<Long>(this).apply {
    body(this)
    execute(TransactionManager.current())
}

/**
 * @sample org.chmuche.korm.sql.tests.shared.DMLTests.testInsertSelect01
 */
fun <T : KormTable> T.insert(selectQuery: Query, columns: List<Column<*>> = this.columns.filterNot { it.columnType.isAutoInc }) =
        InsertSelectStatement(columns, selectQuery).execute(TransactionManager.current())


fun <T : KormTable> T.insertIgnore(selectQuery: Query, columns: List<Column<*>> = this.columns.filterNot { it.columnType.isAutoInc }) =
        InsertSelectStatement(columns, selectQuery, true).execute(TransactionManager.current())


///**
// * @sample org.chmuche.korm.sql.tests.shared.DMLTests.testUpdate01
// */
//fun <T: KormTable> T.update(where: SqlExpressionBuilder.()-> Op<Boolean>, limit: Int? = null, body: T.(UpdateStatement)->Unit): Int {
//    val query = UpdateStatement(this, limit, SqlExpressionBuilder.where())
//    body(query)
//    return query.execute(TransactionManager.current())!!
//}
//
//fun Join.update(where: (SqlExpressionBuilder.()-> Op<Boolean>)? =  null, limit: Int? = null, body: (UpdateStatement)->Unit) : Int {
//    val query = UpdateStatement(this, limit, where?.let { SqlExpressionBuilder.it() })
//    body(query)
//    return query.execute(TransactionManager.current())!!
//}

/**
 * @sample org.chmuche.korm.sql.tests.shared.DDLTests.tableExists02
 */
fun KormTable.exists(): Boolean = currentDialect.tableExists(this)

/**
 * Log Exposed table mappings <-> real database mapping problems and returns DDL Statements to fix them
 */
fun checkMappingConsistence(vararg tables: KormTable): List<String> {
    checkExcessiveIndices(*tables)
    return checkMissingIndices(*tables).flatMap { it.createStatement() }
}

fun checkExcessiveIndices(vararg tables: KormTable) {

    val excessiveConstraints = currentDialect.columnConstraints(*tables).filter { it.value.size > 1 }

    if (!excessiveConstraints.isEmpty()) {
        exposedLogger.warn("List of excessive foreign key constraints:")
        excessiveConstraints.forEach {
            val (pair, fk) = it
            val constraint = fk.first()
            exposedLogger.warn("\t\t\t'${pair.first}'.'${pair.second}' -> '${constraint.referencedTable}'.'${constraint.referencedColumn}':\t${fk.joinToString(", ") { it.fkName }}")
        }

        exposedLogger.info("SQL Queries to remove excessive keys:")
        excessiveConstraints.forEach {
            it.value.take(it.value.size - 1).forEach {
                exposedLogger.info("\t\t\t${it.dropStatement()};")
            }
        }
    }

    val excessiveIndices = currentDialect.existingIndices(*tables).flatMap { it.value }.groupBy { Triple(it.tableName, it.unique, it.columns.joinToString()) }.filter { it.value.size > 1 }
    if (!excessiveIndices.isEmpty()) {
        exposedLogger.warn("List of excessive indices:")
        excessiveIndices.forEach {
            val (triple, indices) = it
            exposedLogger.warn("\t\t\t'${triple.first}'.'${triple.third}' -> ${indices.joinToString(", ") { it.indexName }}")
        }
        exposedLogger.info("SQL Queries to remove excessive indices:")
        excessiveIndices.forEach {
            it.value.take(it.value.size - 1).forEach {
                exposedLogger.info("\t\t\t${it.dropStatement()};")
            }
        }
    }
}

/** Returns list of indices missed in database **/
private fun checkMissingIndices(vararg tables: KormTable): List<Index> {
    fun Collection<Index>.log(mainMessage: String) {
        if (isNotEmpty()) {
            exposedLogger.warn(mainMessage)
            forEach {
                exposedLogger.warn("\t\t$it")
            }
        }
    }

    val fKeyConstraints = currentDialect.columnConstraints(*tables).keys

    fun List<Index>.filterFKeys() = filterNot { it.tableName to it.columns.singleOrNull().orEmpty() in fKeyConstraints }

    val missingIndices = HashSet<Index>()
    val notMappedIndices = HashMap<String, MutableSet<Index>>()
    val nameDiffers = HashSet<Index>()
    for (table in tables) {
        val existingTableIndices = currentDialect.existingIndices(table)[table].orEmpty().filterFKeys()
        val mappedIndices = table.indices.map { Index.forColumns(*it.first, unique = it.second) }.filterFKeys()

        existingTableIndices.forEach { index ->
            mappedIndices.firstOrNull { it.onlyNameDiffer(index) }?.let {
                exposedLogger.trace("Index on table '${table.tableName}' differs only in name: in db ${index.indexName} -> in mapping ${it.indexName}")
                nameDiffers.add(index)
                nameDiffers.add(it)
            }
        }

        notMappedIndices.getOrPut(table.nameInDatabaseCase(), { hashSetOf() }).addAll(existingTableIndices.subtract(mappedIndices))

        missingIndices.addAll(mappedIndices.subtract(existingTableIndices))
    }

    val toCreate = missingIndices.subtract(nameDiffers)
    toCreate.log("Indices missed from database (will be created):")
    notMappedIndices.forEach { e -> e.value.subtract(nameDiffers).log("Indices exist in database and not mapped in code on class '${e.key}':") }
    return toCreate.toList()
}
