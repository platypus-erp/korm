package org.platypus.impl.korm.sql.transactions

import org.platypus.impl.korm.sql.Database
import org.platypus.impl.korm.sql.Transaction
import java.sql.Connection

interface TransactionInterface {

    val db: Database

    val connection: Connection

    val outerTransaction: Transaction?

    fun commit()

    fun rollback()

    fun close()
}

const val DEFAULT_ISOLATION_LEVEL = Connection.TRANSACTION_REPEATABLE_READ

private object NotInitializedManager : TransactionManager {
    override var defaultIsolationLevel: Int = -1

    override fun newTransaction(isolation: Int): Transaction = error("Please call Database.connect() before using this code")

    override fun currentOrNull(): Transaction? = error("Please call Database.connect() before using this code")
}

interface TransactionManager {

    var defaultIsolationLevel: Int

    fun newTransaction(isolation: Int = defaultIsolationLevel): Transaction

    fun currentOrNull(): Transaction?

    companion object {

        @Volatile private var _manager: TransactionManager = NotInitializedManager

        internal var currentThreadManager = object : ThreadLocal<TransactionManager>() {
            override fun initialValue(): TransactionManager = _manager
        }

        var manager: TransactionManager
            get() = currentThreadManager.get()
            set(value) {
                _manager = value
                removeCurrent()
            }

        fun removeCurrent() = currentThreadManager.remove()

        fun currentOrNew(isolation: Int = DEFAULT_ISOLATION_LEVEL) = currentOrNull() ?: manager.newTransaction(isolation)

        fun currentOrNull() = manager.currentOrNull()

        fun current() = currentOrNull() ?: error("No transaction in context.")

        fun isInitialized() = _manager != NotInitializedManager
    }
}