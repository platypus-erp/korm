package org.platypus.orm.transaction

import org.platypus.orm.PersistenceDialect
import java.sql.Connection

interface TransactionApi : AutoCloseable {

    val dbName: String

    val connection: Connection

    val mode: TransactionMode

    val dialect: PersistenceDialect

    fun commit()

    fun rollback()
}