package org.platypus.impl.korm.sql.transactions

import org.platypus.impl.korm.sql.Database
import org.platypus.impl.korm.sql.Transaction
import org.platypus.impl.korm.sql.exposedLogger
import java.sql.Connection
import java.sql.SQLException

class ThreadLocalTransactionManager(private val db: Database,
                                    @Volatile override var defaultIsolationLevel: Int) : TransactionManager {

    val threadLocal = ThreadLocal<Transaction>()

    override fun newTransaction(isolation: Int): Transaction =
            Transaction(ThreadLocalTransaction(db, isolation, threadLocal)).apply {
                threadLocal.set(this)
            }

    override fun currentOrNull(): Transaction? = threadLocal.get()

    private class ThreadLocalTransaction(override val db: Database, isolation: Int, val threadLocal: ThreadLocal<Transaction>) : TransactionInterface {

        private val connectionLazy = lazy(LazyThreadSafetyMode.NONE) {
            db.connector().apply {
                autoCommit = false
                transactionIsolation = isolation
            }
        }
        override val connection: Connection
            get() = connectionLazy.value

        override val outerTransaction: Transaction? = threadLocal.get()

        override fun commit() {
            if (connectionLazy.isInitialized())
                connection.commit()
        }

        override fun rollback() {
            if (connectionLazy.isInitialized() && !connection.isClosed) {
                connection.rollback()
            }
        }

        override fun close() {
            try {
                if (connectionLazy.isInitialized()) connection.close()
            } finally {
                threadLocal.set(outerTransaction)
            }
        }

    }
}

fun <T> transaction(statement: Transaction.() -> T): T = transaction(TransactionManager.manager.defaultIsolationLevel, 3, statement)

fun <T> transaction(transactionIsolation: Int, repetitionAttempts: Int, statement: Transaction.() -> T): T {
    val outer = TransactionManager.currentOrNull()

    return if (outer != null) {
        outer.statement()
    } else {
        inTopLevelTransaction(transactionIsolation, repetitionAttempts, statement)
    }
}

private fun TransactionInterface.rollbackLoggingException(log: (Exception) -> Unit) {
    try {
        rollback()
    } catch (e: Exception) {
        log(e)
    }
}

private inline fun TransactionInterface.closeLoggingException(log: (Exception) -> Unit) {
    try {
        close()
    } catch (e: Exception) {
        log(e)
    }
}

fun <T> inTopLevelTransaction(transactionIsolation: Int, repetitionAttempts: Int, statement: Transaction.() -> T): T {
    var repetitions = 0

    while (true) {

        val transaction = TransactionManager.manager.newTransaction(transactionIsolation)

        try {
            val answer = transaction.statement()
            transaction.commit()
            return answer
        } catch (e: SQLException) {
            val currentStatement = transaction.currentStatement
            exposedLogger.info("Transaction attempt #$repetitions failed: ${e.message}. Statement: $currentStatement", e)
            transaction.rollbackLoggingException { exposedLogger.warn("Transaction rollback failed: ${it.message}. See previous log line for statement", it) }
            repetitions++
            if (repetitions >= repetitionAttempts) {
                throw e
            }
        } catch (e: Throwable) {
            val currentStatement = transaction.currentStatement
            transaction.rollbackLoggingException { exposedLogger.warn("Transaction rollback failed: ${it.message}. Statement: $currentStatement", it) }
            throw e
        } finally {
            TransactionManager.removeCurrent()
            val currentStatement = transaction.currentStatement
            try {
                currentStatement.let {
                    if (!it!!.isClosed) it!!.close()
                    transaction.currentStatement = null
                }
                transaction.closeExecutedStatements()
            } catch (e: Exception) {
                exposedLogger.warn("Statements close failed", e)
            }
            transaction.closeLoggingException { exposedLogger.warn("Transaction close failed: ${it.message}. Statement: $currentStatement", it) }
        }
    }
}