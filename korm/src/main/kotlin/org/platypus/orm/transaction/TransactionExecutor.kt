package org.platypus.orm.transaction


import org.platypus.cache.PlatypusCache
import org.platypus.model.Model
import org.platypus.model.field.api.IModelField
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.orm.sql.dml.Statement
import org.platypus.orm.sql.dml.StatementType
import org.platypus.orm.sql.dml.statements.StatementMonitor
import org.platypus.orm.sql.logging.CompositeSqlLogger
import org.platypus.orm.sql.logging.Slf4jSqlLogger
import org.platypus.orm.sql.logging.exposedLogger
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.SQLException

class TransactionExecutor(private val transactionImpl: TransactionApi) : TransactionApi by transactionImpl {

    val monitor = StatementMonitor()
    val logger = CompositeSqlLogger()

    var statementCount: Int = 0
    var duration: Long = 0
    var warnLongQueriesDuration: Long? = null
    var debug = true
    var selectsForUpdate = false
    val stat = TransactionStat()
    var counter = 0L
    val cache = PlatypusCache()
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

    override fun close() {
        try {
            if (mode == TransactionMode.NORMAL) {
                commit()
            } else {
                rollback()
            }
        } catch (e: SQLException) {
            logger.logError("SQL ERROR", e)
            rollback()
        }
    }

    override fun rollback() {
        println("rollback")
        transactionImpl.rollback()
    }

    override fun commit() {
        println("commit")
        transactionImpl.commit()
    }

    private fun describeStatement(delta: Long, stmt: String): String = "[${delta}ms] ${stmt.take(1024)}\n\n"

    fun native(stmt: String) = native(stmt, { })

    fun <T : Any> native(stmt: String, transform: (ResultSet) -> T): T? {
        val type = StatementType.values().find {
            stmt.trim().startsWith(it.name, true)
        } ?: StatementType.OTHER
        return exec(object : Statement<T>(this, type, emptyList()) {
            override fun PreparedStatement.executeInternal(): T? {
                when (type) {
                    StatementType.SELECT -> executeQuery()
                    else -> executeUpdate()
                }
                return resultSet?.let { transform(it) }
            }

            override fun prepareSQL(): String = stmt

            override fun arguments(): Iterable<Iterable<Pair<SqlFieldType, Any?>>> = emptyList()
        })
    }

    fun <T> exec(stmt: Statement<T>): T? = exec(stmt, { it })

    fun <T, R> exec(stmt: Statement<T>, body: Statement<T>.(T) -> R): R? {
        statementCount++

        val start = System.currentTimeMillis()
        val answer = stmt.executeIn()
        val delta = System.currentTimeMillis() - start

        val lazySQL = lazy(LazyThreadSafetyMode.NONE) {
            answer.second.map { it.sql() }.distinct().joinToString()
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
    internal fun cutIfNecessary(identity: String) = identity.substring(0, Math.min(dialect.identifierLengthLimit, identity.length))

    private fun quoteTokenIfNecessary(token: String): String = if (dialect.needQuotes(token)) token.quoted else token

    fun identity(table: Model<*>): String = quoteIfNecessary(dialect.inProperCase(table.tableName))

    fun fullIdentity(column: ModelField<*, *>): String = "${identity(column)}.${identity(column)}"

    fun identity(column: IModelField<*,  *>): String {
        val nameInProperCase = dialect.inProperCase(column.fieldName)
        return if (dialect.shouldQuoteIdentifiers && nameInProperCase != column.fieldName)
            column.fieldName.quoted
        else quoteIfNecessary(nameInProperCase)
    }

    fun closeExecutedStatements() {
        executedStatements.forEach {
            if (!it.isClosed) it.close()
        }
        executedStatements.clear()
    }

    private val String.quoted get() = "${dialect.identityQuoteString}${this.trim()}${dialect.identityQuoteString}"
}





