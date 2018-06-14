package org.platypus.orm.sql.logging

import org.platypus.PlatypusEnvironment
import org.platypus.orm.sql.dml.StatementContext
import org.platypus.orm.sql.dml.statements.StatementInterceptor
import java.sql.PreparedStatement
import java.util.*

class CompositeSqlLogger : SqlLogger, StatementInterceptor {
    private val loggers: ArrayList<SqlLogger> = ArrayList(2)

    fun addLogger(logger: SqlLogger) {
        loggers.add(logger)
    }

    fun removeLogger(logger: SqlLogger) {
        loggers.remove(logger)
    }

    override fun log(context: StatementContext, env: PlatypusEnvironment) = loggers.forEach { it.log(context, env) }

    override fun log(s: Any) = loggers.forEach { it.log(s) }

    override fun logError(s: Any, e: Throwable?) = loggers.forEach { it.logError(s, e) }

    override fun beforeExecution(context: StatementContext) {}

    override fun afterExecution(contexts: List<StatementContext>, executedStatement: PreparedStatement) {
        contexts.forEach {
            log(it.expandArgs())
        }
    }

    override fun onError(contexts: List<StatementContext>, e: Throwable) {
        contexts.forEach {
            log(it.expandArgs())
        }
    }
}