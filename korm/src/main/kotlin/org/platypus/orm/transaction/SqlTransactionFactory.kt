package org.platypus.orm.transaction

import org.platypus.orm.PersistenceDialect
import java.sql.Connection
import java.sql.DriverManager

class SqlTransactionFactory private constructor(dialectFactory: SqlDialectFactory, val connector: () -> Connection) {

    private val dialect: PersistenceDialect = dialectFactory.create(connector().metaData)

    fun newTransaction(mode: TransactionMode): TransactionApi {
        val connection = connector()
        connection.autoCommit = false
        connection.transactionIsolation = Connection.TRANSACTION_REPEATABLE_READ
        connection.isReadOnly = mode == TransactionMode.READ_ONLY
        return TransactionApiImpl(mode, connection, dialect)
    }

    private class TransactionApiImpl(
            override val mode: TransactionMode,
            override val connection: Connection,
            override val dialect: PersistenceDialect) : TransactionApi {

        override val dbName: String
            get() = connection.catalog

        override fun commit() {
            if (mode == TransactionMode.NORMAL || mode == TransactionMode.MANUAL) {
                connection.commit()
            }
        }

        override fun rollback() {
            connection.rollback()
        }

        override fun close() {
            println("Close connection")
            connection.close()
        }
    }

    companion object {

        fun connect(dialect: SqlDialectFactory, url: String, driver: String, user: String = "", password: String = "", onOpenConnection: (Connection) -> Unit = {}): SqlTransactionFactory {
            println("Connect to $url as $user")
            Class.forName(driver).newInstance()

            return SqlTransactionFactory(dialect) {
                DriverManager.getConnection(url, user, password).apply { onOpenConnection(this) }
            }
        }
    }
}
