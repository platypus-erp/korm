package org.platypus.orm.sql

import org.platypus.PlatypusEnvironment
import org.platypus.model.Model
import org.platypus.model.field.impl.RealModelField
import org.platypus.orm.sql.dml.FieldSet
import org.platypus.orm.sql.dml.statements.InsertStatement
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.query.Query

/**
 * @sample org.chmuche.korm.sql.tests.shared.DMLTests.testSelect01
 */
inline fun FieldSet.select(env: PlatypusEnvironment, where: () -> Expression<Boolean>): Query = select(env, where())

fun FieldSet.select(env: PlatypusEnvironment, where: Expression<Boolean>? = null): Query = Query(env, this, where)

fun <M : Model<M>> M.select(env: PlatypusEnvironment, vararg fields: RealModelField<M, *>, where: () -> Expression<Boolean>): Query {
    val set = HashSet<Expression<*>>(fields.size + 1)
    set.addAll(fields)
    set.add(this.id)
    return this.slice(set).select(env, where)
}


fun <M : Model<M>> M.selectIds(env: PlatypusEnvironment, where: () -> Expression<Boolean>): Query =
        this.slice(this.id).select(env, where)

fun <M : Model<M>> M.selectWhere(env: PlatypusEnvironment, where: Expression<Boolean>): Query = Query(env, this, where)

fun <M : Model<M>> M.selectAll(env: PlatypusEnvironment): Query = Query(env, this, null)

/**
 * @sample org.chmuche.korm.sql.tests.shared.DMLTests.testInsert01
 */
fun <M : Model<M>> M.insert(env: PlatypusEnvironment, body: M.(InsertStatement<Number>) -> Unit): InsertStatement<Number> = InsertStatement<Number>(env, this).apply {
    body(this)
    execute()
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
//fun <T : KormTable, E : Any> T.batchInsert(data: Iterable<E>, ignore: Boolean = false, body: BatchInsertStatement.(E) -> Unit): List<Map<Column<*>, Any>> {
//    if (data.count() == 0) return emptyList()
//    fun newBatchStatement() = BatchInsertStatement(this, ignore)
//    var statement = newBatchStatement()
//
//    val result = ArrayList<Map<Column<*>, Any>>()
//    fun BatchInsertStatement.handleBatchException(body: BatchInsertStatement.() -> Unit) {
//        try {
//            body()
//        } catch (e: BatchDataInconsistentException) {
//            execute(TransactionManager.current())
//            result += generatedKey.orEmpty()
//            statement = newBatchStatement()
//        }
//    }
//
//    for (element in data) {
//        statement.handleBatchException { addBatch() }
//        statement.handleBatchException {
//            body(element)
//            validateLastBatch()
//        }
//    }
//    if (statement.data.isNotEmpty()) {
//        statement.execute(TransactionManager.current())
//        result += statement.generatedKey.orEmpty()
//    }
//    return result
//}
//
//fun <T : KormTable> T.insertIgnore(body: T.(UpdateBuilder<*>) -> Unit): InsertStatement<Long> = InsertStatement<Long>(this, isIgnore = true).apply {
//    body(this)
//    execute(TransactionManager.current())
//}
//
//fun <Key:Any, T: IdTable<Key>> T.insertIgnoreAndGetId(body: T.(UpdateBuilder<*>)->Unit) = InsertStatement<EntityID<Key>>(this, isIgnore = true).run {
//    body(this)
//    execute(TransactionManager.current())
//    generatedKey
//}
//
///**
// * @sample org.chmuche.korm.sql.tests.shared.DMLTests.testReplace01
// */
//fun <T : KormTable> T.replace(body: T.(UpdateBuilder<*>) -> Unit): ReplaceStatement<Long> = ReplaceStatement<Long>(this).apply {
//    body(this)
//    execute(TransactionManager.current())
//}
//
///**
// * @sample org.chmuche.korm.sql.tests.shared.DMLTests.testInsertSelect01
// */
//fun <T : KormTable> T.insert(selectQuery: Query, fields: List<Column<*>> = this.fields.filterNot { it.columnType.isAutoInc }) =
//        InsertSelectStatement(fields, selectQuery).execute(TransactionManager.current())
//
//
//fun <T : KormTable> T.insertIgnore(selectQuery: Query, fields: List<Column<*>> = this.fields.filterNot { it.columnType.isAutoInc }) =
//        InsertSelectStatement(fields, selectQuery, true).execute(TransactionManager.current())
//
//
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
//fun KormTable.exists(): Boolean = currentDialect.tableExists(this)

/**
 * Log Exposed models mappings <-> real database mapping problems and returns DDL Statements to fix them
 */
//fun checkMappingConsistence(vararg tables: KormTable): List<String> {
//    checkExcessiveIndices(*tables)
//    return checkMissingIndices(*tables).flatMap { it.createStatement() }
//}

//fun checkExcessiveIndices(vararg tables: KormTable) {
//
//    val excessiveConstraints = currentDialect.columnConstraints(*tables).filter { it.value.size > 1 }
//
//    if (!excessiveConstraints.isEmpty()) {
//        exposedLogger.warn("List of excessive foreign key constraints:")
//        excessiveConstraints.forEach {
//            val (pair, fk) = it
//            val constraint = fk.first()
//            exposedLogger.warn("\t\t\t'${pair.first}'.'${pair.second}' -> '${constraint.referencedTable}'.'${constraint.referencedColumn}':\t${fk.joinToString(", ") { it.fkName }}")
//        }
//
//        exposedLogger.info("SQL Queries to remove excessive keys:")
//        excessiveConstraints.forEach {
//            it.value.take(it.value.size - 1).forEach {
//                exposedLogger.info("\t\t\t${it.dropStatement()};")
//            }
//        }
//    }
//
//    val excessiveIndices = currentDialect.existingIndices(*tables).flatMap { it.value }.groupBy { Triple(it.tableName, it.unique, it.fields.joinToString()) }.filter { it.value.size > 1 }
//    if (!excessiveIndices.isEmpty()) {
//        exposedLogger.warn("List of excessive indices:")
//        excessiveIndices.forEach {
//            val (triple, indices) = it
//            exposedLogger.warn("\t\t\t'${triple.first}'.'${triple.third}' -> ${indices.joinToString(", ") { it.indexName }}")
//        }
//        exposedLogger.info("SQL Queries to remove excessive indices:")
//        excessiveIndices.forEach {
//            it.value.take(it.value.size - 1).forEach {
//                exposedLogger.info("\t\t\t${it.dropStatement()};")
//            }
//        }
//    }
//}
//
///** Returns list of indices missed in database **/
//private fun checkMissingIndices(vararg tables: KormTable): List<Index> {
//    fun Collection<Index>.log(mainMessage: String) {
//        if (isNotEmpty()) {
//            exposedLogger.warn(mainMessage)
//            forEach {
//                exposedLogger.warn("\t\t$it")
//            }
//        }
//    }
//
//    val fKeyConstraints = currentDialect.columnConstraints(*tables).keys
//
//    fun List<Index>.filterFKeys() = filterNot { it.tableName to it.fields.singleOrNull().orEmpty() in fKeyConstraints }
//
//    val missingIndices = HashSet<Index>()
//    val notMappedIndices = HashMap<String, MutableSet<Index>>()
//    val nameDiffers = HashSet<Index>()
//    for (models in tables) {
//        val existingTableIndices = currentDialect.existingIndices(models)[models].orEmpty().filterFKeys()
//        val mappedIndices = models.indices.map { Index.forColumns(*it.first, unique = it.second) }.filterFKeys()
//
//        existingTableIndices.forEach { index ->
//            mappedIndices.firstOrNull { it.onlyNameDiffer(index) }?.let {
//                exposedLogger.trace("Index on models '${models.tableName}' differs only in name: in db ${index.indexName} -> in mapping ${it.indexName}")
//                nameDiffers.add(index)
//                nameDiffers.add(it)
//            }
//        }
//
//        notMappedIndices.getOrPut(models.nameInDatabaseCase(), { hashSetOf() }).addAll(existingTableIndices.subtract(mappedIndices))
//
//        missingIndices.addAll(mappedIndices.subtract(existingTableIndices))
//    }
//
//    val toCreate = missingIndices.subtract(nameDiffers)
//    toCreate.log("Indices missed from database (will be created):")
//    notMappedIndices.forEach { e -> e.value.subtract(nameDiffers).log("Indices exist in database and not mapped in code on class '${e.key}':") }
//    return toCreate.toList()
//}
//