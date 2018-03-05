package org.platypus.orm.sql.dml

import org.platypus.orm.transaction.TransactionApi
import java.sql.PreparedStatement

interface StatementInterceptor {
    fun beforeExecution(transaction: TransactionApi, context: StatementContext) {}
    fun afterExecution(transaction: TransactionApi, contexts: List<StatementContext>, executedStatement: PreparedStatement) {}
    fun onError(transaction: TransactionApi, contexts: List<StatementContext>, e: Throwable) {}
}

class StatementMonitor {
    private val interceptors: MutableList<StatementInterceptor> = arrayListOf()

    fun register(interceptor: StatementInterceptor) = interceptors.add(interceptor)
    fun unregister(interceptor: StatementInterceptor) = interceptors.remove(interceptor)

    fun notifyBeforeExecution(transaction: TransactionApi, context: StatementContext) {
        interceptors.forEach { it.beforeExecution(transaction, context) }
    }

    fun notifyAfterExecution(transaction: TransactionApi, executedContexts: List<StatementContext>, executedStatement: PreparedStatement) {
        interceptors.forEach { it.afterExecution(transaction, executedContexts, executedStatement) }
    }

    fun notifyOnError(transaction: TransactionApi, executedContexts: List<StatementContext>, e: Throwable) {
        interceptors.forEach { it.onError(transaction, executedContexts, e) }
    }
}