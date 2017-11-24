package org.platypus.impl.korm.sql.statements

import org.platypus.impl.korm.sql.Transaction
import java.sql.PreparedStatement

interface StatementInterceptor {
    fun beforeExecution(transaction: Transaction, context: StatementContext) {}
    fun afterExecution(transaction: Transaction, contexts: List<StatementContext>, executedStatement: PreparedStatement) {}
    fun onError(transaction: Transaction, contexts: List<StatementContext>, e: Throwable) {}
}

class StatementMonitor {
    private val interceptors: MutableList<StatementInterceptor> = arrayListOf()

    fun register(interceptor: StatementInterceptor) = interceptors.add(interceptor)
    fun unregister(interceptor: StatementInterceptor) = interceptors.remove(interceptor)

    fun notifyBeforeExecution(transaction: Transaction, context: StatementContext) {
        interceptors.forEach { it.beforeExecution(transaction, context) }
    }

    fun notifyAfterExecution(transaction: Transaction, executedContexts: List<StatementContext>, executedStatement: PreparedStatement) {
        interceptors.forEach { it.afterExecution(transaction, executedContexts, executedStatement) }
    }

    fun notifyOnError(transaction: Transaction, executedContexts: List<StatementContext>, e: Throwable) {
        interceptors.forEach { it.onError(transaction, executedContexts, e) }
    }
}