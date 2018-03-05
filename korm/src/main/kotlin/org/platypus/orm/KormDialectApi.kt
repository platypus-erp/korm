package org.platypus.orm

import org.platypus.model.IModel
import org.platypus.model.field.api.IModelField
import org.platypus.orm.database.vendors.DialectDDL
import org.platypus.orm.sql.QueryBuilder
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.expression.ExpressionVisitor
import org.platypus.orm.sql.expression.LiteralOp
import org.platypus.orm.transaction.TransactionApi
import org.platypus.orm.transaction.TransactionExecutor

interface PersistenceDialect {

    val dialectName: String
    fun identity(mod: IModel<*>): String
    fun identity(mod: IModelField<*, *>): String
    val dialectDDL: DialectDDL
    val expressionVisitor: ExpressionVisitor<QueryBuilder, String>

    fun supportsSelectForUpdate(): Boolean
    val supportsMultipleGeneratedKeys: Boolean
    fun isAllowedAsColumnDefault(e: Expression<*>) = e is LiteralOp<*>

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

    fun insert(table: IModel<*>, columns: List<IModelField<*, *>>, expr: String, cr: TransactionExecutor): String
    fun delete(table: IModel<*>, where: String?, cr: TransactionExecutor): String
    fun replace(table: IModel<*>, data: List<Pair<IModelField<*, *>, Any?>>, cr: TransactionExecutor): String

    fun createIndex(unique: Boolean, tableName: String, indexName: String, columns: List<String>): String
    fun dropIndex(tableName: String, indexName: String): String
    fun modifyColumn(column: IModelField<*, *>): String

    fun limit(size: Int, offset: Int = 0, alreadyOrdered: Boolean = true): String
    fun inProperCase(s: String): String
    fun needQuotes(token: String): Boolean = true
    fun booleanFromStringToBoolean(value: String): Boolean
    fun booleanToStatementString(b: Boolean): String
}

