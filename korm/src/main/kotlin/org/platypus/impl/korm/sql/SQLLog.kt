package org.platypus.impl.korm.sql

import org.platypus.impl.korm.sql.statements.StatementContext
import org.platypus.impl.korm.sql.statements.StatementInterceptor
import org.platypus.impl.korm.sql.statements.expandArgs
import org.platypus.impl.korm.sql.transactions.TransactionManager
import org.slf4j.LoggerFactory
import java.sql.PreparedStatement
import java.util.*

interface SqlLogger {
    fun log(context: StatementContext, transaction: Transaction)
    fun log(s: Any)
    fun logError(s: Any, e: Throwable? = null)
}

val exposedLogger = LoggerFactory.getLogger("Exposed")!!

inline fun <R> logTimeSpent(message: String, block: () -> R): R {
    val start = System.currentTimeMillis()
    val answer = block()
    exposedLogger.info(message + " took " + (System.currentTimeMillis() - start) + "ms")
    return answer
}

object StdOutSqlLogger : SqlLogger {

    override fun log(context: StatementContext, transaction: Transaction) {
        System.out.println("SQL: ${context.expandArgs(transaction)}")
    }

    override fun log(s: Any) {
        System.out.println("SQL: $s")
    }

    override fun logError(s: Any, e: Throwable?) {
        System.out.println("ERROR SQL: $s")
        e?.let { System.out.println("ERROR SQL: $e") }
    }
}

object Slf4jSqlLogger : SqlLogger {

    override fun log(context: StatementContext, transaction: Transaction) {
        if (transaction.debug) {
            exposedLogger.info(context.expandArgs(TransactionManager.current()))
        }
    }

    override fun log(s: Any) {
        exposedLogger.info(s.toString())
    }

    override fun logError(s: Any, e: Throwable?) {
        exposedLogger.info(s.toString(), e)
    }
}

class CompositeSqlLogger : SqlLogger, StatementInterceptor {
    private val loggers: ArrayList<SqlLogger> = ArrayList(2)

    fun addLogger(logger: SqlLogger) {
        loggers.add(logger)
    }

    fun removeLogger(logger: SqlLogger) {
        loggers.remove(logger)
    }

    override fun log(context: StatementContext, transaction: Transaction) = loggers.forEach { it.log(context, transaction) }

    override fun log(s: Any) = loggers.forEach { it.log(s) }

    override fun logError(s: Any, e: Throwable?) = loggers.forEach { it.logError(s, e) }

    override fun beforeExecution(transaction: Transaction, context: StatementContext) {}

    override fun afterExecution(transaction: Transaction, contexts: List<StatementContext>, executedStatement: PreparedStatement) {
        contexts.forEach {
            log(it, transaction)
        }
    }

    override fun onError(transaction: Transaction, contexts: List<StatementContext>, e: Throwable) {
        contexts.forEach {
            log(it, transaction)
        }
    }
}
