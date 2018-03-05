package org.platypus.orm.sql.dml.statements

import org.platypus.orm.sql.dml.StatementContext
import java.sql.PreparedStatement

interface StatementInterceptor {
    fun beforeExecution(context: StatementContext) {}
    fun afterExecution(contexts: List<StatementContext>, executedStatement: PreparedStatement) {}
    fun onError(contexts: List<StatementContext>, e: Throwable) {}
}

class StatementMonitor {
    private val interceptors: MutableList<StatementInterceptor> = arrayListOf()

    fun register(interceptor: StatementInterceptor) = interceptors.add(interceptor)
    fun unregister(interceptor: StatementInterceptor) = interceptors.remove(interceptor)

    fun notifyBeforeExecution(context: StatementContext) {
        interceptors.forEach { it.beforeExecution(context) }
    }

    fun notifyAfterExecution(executedContexts: List<StatementContext>, executedStatement: PreparedStatement) {
        interceptors.forEach { it.afterExecution(executedContexts, executedStatement) }
    }

    fun notifyOnError(executedContexts: List<StatementContext>, e: Throwable) {
        interceptors.forEach { it.onError(executedContexts, e) }
    }
}