package org.platypus.impl.korm.sql

import org.platypus.EntityNotFoundById
import org.platypus.impl.korm.identifiants.ModelID
import org.platypus.impl.korm.cache.TransactionCache
import org.platypus.impl.korm.model.ModelColumnType
import org.platypus.impl.korm.model.statement.InsertModelStatement
import org.platypus.impl.korm.sql.column.type.ColumnType
import org.platypus.impl.korm.sql.statements.Statement
import org.platypus.impl.korm.sql.statements.StatementContext
import org.platypus.impl.korm.sql.statements.StatementInterceptor
import org.platypus.impl.korm.sql.statements.StatementMonitor
import org.platypus.impl.korm.sql.statements.StatementType
import org.platypus.impl.korm.sql.statements.UpdateStatement
import org.platypus.impl.korm.sql.transactions.TransactionInterface
import org.platypus.impl.korm.sql.vendors.currentDialect
import org.platypus.orm.struct.Table
import org.platypus.orm.struct.TableColumn
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.util.Random
import java.util.concurrent.ConcurrentHashMap
import kotlin.math.absoluteValue

class Key<T>

@Suppress("UNCHECKED_CAST")
open class UserDataHolder {
    protected val userdata = ConcurrentHashMap<Key<*>, Any?>()

    fun <T : Any> putUserData(key: Key<T>, value: T) {
        userdata[key] = value
    }

    fun <T : Any> removeUserData(key: Key<T>) = userdata.remove(key)

    fun <T : Any> getUserData(key: Key<T>): T? = userdata[key] as T?

    fun <T : Any> getOrCreate(key: Key<T>, init: () -> T): T = userdata.getOrPut(key, init) as T
}

class TransactionStat : StatementInterceptor {
    var nbInsert: Int = 0
    var nbUpdate: Int = 0
    var nbDelete: Int = 0
    var nbSelect: Int = 0

    override fun afterExecution(transaction: Transaction, contexts: List<StatementContext>, executedStatement: PreparedStatement) {
        contexts.forEach {
            when {
                it.statement.type == StatementType.SELECT -> nbSelect++
                it.statement.type == StatementType.INSERT -> nbInsert++
                it.statement.type == StatementType.DELETE -> nbDelete++
                it.statement.type == StatementType.UPDATE -> nbUpdate++
            }
        }
    }
}

class Transaction(private val transactionImpl: TransactionInterface) : UserDataHolder(), TransactionInterface by transactionImpl {

    val monitor = StatementMonitor()
    val logger = CompositeSqlLogger()

    var statementCount: Int = 0
    var duration: Long = 0
    var warnLongQueriesDuration: Long? = null
    var debug = true
    var selectsForUpdate = false
    var cache = TransactionCache()
    val stat = TransactionStat()
    var counter = 0L

    // currently executing statement. Used to log error properly
    var currentStatement: PreparedStatement? = null
    internal val executedStatements: MutableList<PreparedStatement> = arrayListOf()

    val statements = StringBuilder()
    // prepare statement as key and count to execution time as value
    val statementStats = hashMapOf<String, Pair<Int, Long>>()

    init {
        logger.addLogger(Slf4jSqlLogger)
        monitor.register(logger)
        monitor.register(stat)
    }

    override fun commit() {
//        val created = flushCache()
//        EntityHook.alertSubscribers()
//        val createdByHooks = flushCache()
        flushCache()
        transactionImpl.commit()
//        userdata.clear()
//        EntityCache.invalidateGlobalCaches(created + createdByHooks)
    }

    fun flushCache() {
        for (toinsert in cache.toInsert) {
            createInsert(toinsert)
        }
        for (toUpdate in cache.toUpdate) {
            val updateStatement = UpdateStatement(
                    toUpdate.modelID.model.internalTable,
                    toUpdate.modelID.model.id eq toUpdate.modelID.id)
            for (fieldToUpdate in toUpdate.props) {
                updateStatement.forceSet(fieldToUpdate, cache.getValueToUpdate(toUpdate.modelID, fieldToUpdate))
            }
            updateStatement.execute(this)
        }
        cache = TransactionCache()
    }

    private fun createInsert(toinsert: ModelID) {
        if(cache.realID(toinsert).isInDB()){
            return
        }
        if (cache[toinsert, toinsert.model.externalRef] == null){
            cache.forceSet(toinsert, toinsert.model.externalRef.column,
                "${toinsert.model}_${Random().nextInt().absoluteValue}")
        }
        val values = cache[toinsert]
        val insertStmt = InsertModelStatement(toinsert.model)
        for ((k, v) in values) {
            when (k.columnType.modelColumnType) {
                ModelColumnType.MANY_TO_MANY -> {
                    val vId = cache.realID(v as ModelID)
                    if (vId.isNotInDB()) {
                        createInsert(vId)
                    }
                    val createdId = cache.realID(v).id
                    val prop = toinsert.model.getColM2MForName(k.name)
                    insertStmt.addPostExecute("${k.name}_$createdId") { id: Long ->
                        prop.relationTable.insertRelation(prop, createdId, prop.relProp(), id)
                    }
                }
                ModelColumnType.MANY_TO_ONE -> {
                    if (v != null){
                        val vId = (v as ModelID)
                        if (vId.isNotInDB()) {
                            if (vId !in this.cache.scheduledInsert){
                                throw EntityNotFoundById(vId.id, vId.model.modelName)
                            }
                            createInsert(vId)
                        }
                        insertStmt.forceSet(k, cache.realID(v).id)
                    }

                }
                ModelColumnType.ENTITY_ID -> {}
                else -> insertStmt.forceSet(k, v)

            }
        }
        insertStmt.execute(this)
        val newId = insertStmt[toinsert.model.id]
        cache.addnewId(toinsert, newId)
    }


    private fun describeStatement(delta: Long, stmt: String): String = "[${delta}ms] ${stmt.take(1024)}\n\n"

    fun exec(stmt: String) = exec(stmt, { })

    fun <T : Any> exec(stmt: String, transform: (ResultSet) -> T): T? {
        val type = StatementType.values().find {
            stmt.trim().startsWith(it.name, true)
        } ?: StatementType.OTHER
        return exec(object : Statement<T>(type, emptyList()) {
            override fun PreparedStatement.executeInternal(transaction: Transaction): T? {
                when (type) {
                    StatementType.SELECT -> executeQuery()
                    else -> executeUpdate()
                }
                return resultSet?.let { transform(it) }
            }

            override fun prepareSQL(transaction: Transaction): String = stmt

            override fun arguments(): Iterable<Iterable<Pair<ColumnType, Any?>>> = emptyList()
        })
    }

    fun <T> exec(stmt: Statement<T>): T? = exec(stmt, { it })

    fun <T, R> exec(stmt: Statement<T>, body: Statement<T>.(T) -> R): R? {
        statementCount++

        val start = System.currentTimeMillis()
        val answer = stmt.executeIn(this)
        val delta = System.currentTimeMillis() - start

        val lazySQL = lazy(LazyThreadSafetyMode.NONE) {
            answer.second.map { it.sql(this) }.distinct().joinToString()
        }

        duration += delta

        if (debug) {
            statements.append(describeStatement(delta, lazySQL.value))
            statementStats.getOrPut(lazySQL.value, { 0 to 0L }).let { (count, time) ->
                statementStats[lazySQL.value] = (count + 1) to (time + delta)
            }
        }

        if (delta > warnLongQueriesDuration ?: Long.MAX_VALUE) {
            exposedLogger.warn("Long query: ${describeStatement(delta, lazySQL.value)}", RuntimeException())
        }

        return answer.first?.let { stmt.body(it) }
    }

    internal fun quoteIfNecessary(identity: String): String {
        if (identity.contains('.'))
            return identity.split('.').joinToString(".") { quoteTokenIfNecessary(it) }
        else {
            return quoteTokenIfNecessary(identity)
        }
    }

    // REVIEW
    internal fun cutIfNecessary(identity: String) = identity.substring(0, Math.min(currentDialect.identifierLengthLimit, identity.length))

    private fun quoteTokenIfNecessary(token: String): String = if (db.needQuotes(token)) token.quoted else token

    fun identity(table: Table): String =
            (table as? Alias<*>)?.let { "${identity(it.delegate)} ${quoteIfNecessary(it.alias)}" } ?: quoteIfNecessary(table.name.inProperCase())

    fun fullIdentity(column: TableColumn): String =
            "${quoteIfNecessary(column.table.tableName.inProperCase())}.${identity(column)}"

    fun identity(column: TableColumn): String {
        val nameInProperCase = column.name.inProperCase()
        return if (db.shouldQuoteIdentifiers && nameInProperCase != column.name)
            column.name.quoted
        else quoteIfNecessary(nameInProperCase)
    }

    fun closeExecutedStatements() {
        executedStatements.forEach {
            if (!it.isClosed) it.close()
        }
        executedStatements.clear()
    }

    private val String.quoted get() = "${db.identityQuoteString}$this${db.identityQuoteString}".trim()
}





