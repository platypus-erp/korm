package org.platypus.v2.orm.database

import org.platypus.model.IModel
import org.platypus.orm.ReferenceOption
import org.platypus.orm.transaction.TransactionApi
import org.platypus.orm.transaction.TransactionExecutor
import org.platypus.v2.model.field.api.BaseField

interface DbDialect {
    val dialectName: String
    fun identity(mod: IModel<*>): String
    fun identity(mod: BaseField<*, *>): String

    val dbCreator: DDLModelCreator

    fun supportsSelectForUpdate(): Boolean
    val supportsMultipleGeneratedKeys: Boolean

    // --> REVIEW
    val supportsIfNotExists: Boolean
    val supportsMultipleResultSets: Boolean
    val needsSequenceToAutoInc: Boolean
    val needsQuotesWhenSymbolsInNames: Boolean
    val identifierLengthLimit: Int
    fun catalog(transaction: TransactionApi): String
    // <-- REVIEW

    val defaultReferenceOption: ReferenceOption
    val identityQuoteString: String
    val shouldQuoteIdentifiers: Boolean
    val supportsAlterTableWithAddColumn: Boolean
    val blobAsStream: Boolean
    val keywords: Set<String>

    // Specific SQL statements

    fun insert(table: IModel<*>, columns: List<BaseField<*, *>>, expr: String, cr: TransactionExecutor): String
    fun delete(table: IModel<*>, where: String?, cr: TransactionExecutor): String
    fun replace(table: IModel<*>, data: List<Pair<BaseField<*, *>, Any?>>, cr: TransactionExecutor): String

    fun createIndex(unique: Boolean, tableName: String, indexName: String, columns: List<String>): String
    fun dropIndex(tableName: String, indexName: String): String
    fun modifyColumn(column: BaseField<*, *>): String

    fun limit(size: Int, offset: Int = 0, alreadyOrdered: Boolean = true): String
    fun inProperCase(s: String): String
    fun needQuotes(token: String): Boolean = true
    fun booleanFromStringToBoolean(value: String): Boolean
    fun booleanToStatementString(b: Boolean): String
}