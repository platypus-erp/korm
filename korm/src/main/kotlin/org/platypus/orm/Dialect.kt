package org.platypus.orm

import org.platypus.model.IModel
import org.platypus.model.field.api.IModelField
import org.platypus.orm.database.vendors.DialectDDL
import org.platypus.orm.sql.QueryBuilder
import org.platypus.orm.sql.expression.ExpressionVisitor
import org.platypus.orm.transaction.TransactionApi
import org.platypus.orm.transaction.TransactionExecutor
import java.util.*

object KormDialect : PersistenceDialect {


    val current: PersistenceDialect

    init {
        val dialects = ServiceLoader.load(PersistenceDialect::class.java).toList()
        if (dialects.isEmpty()) {
            throw NoKormDialectFound()
        }
        if (dialects.size > 1) {
            throw TooManyKormDialectFound(dialects.map { it.dialectName })
        }
        current = dialects.first()
    }


    override val dialectName: String
        get() = current.dialectName

    override fun identity(mod: IModel<*>): String = current.identity(mod)

    override fun identity(mod: IModelField<*,  *>): String = current.identity(mod)

    override val dialectDDL: DialectDDL
        get() = current.dialectDDL
    override val expressionVisitor: ExpressionVisitor<QueryBuilder, String>
        get() = current.expressionVisitor

    override fun supportsSelectForUpdate(): Boolean = current.supportsSelectForUpdate()

    override val supportsMultipleGeneratedKeys: Boolean
        get() = current.supportsMultipleGeneratedKeys
    override val supportsIfNotExists: Boolean
        get() = current.supportsIfNotExists
    override val supportsMultipleResultSets: Boolean
        get() = current.supportsMultipleResultSets
    override val needsSequenceToAutoInc: Boolean
        get() = current.needsSequenceToAutoInc
    override val needsQuotesWhenSymbolsInNames: Boolean
        get() = current.needsQuotesWhenSymbolsInNames
    override val identifierLengthLimit: Int
        get() = current.identifierLengthLimit

    override fun catalog(transaction: TransactionApi): String = current.catalog(transaction)

    override val defaultReferenceOption: ReferenceOption
        get() = current.defaultReferenceOption
    override val identityQuoteString: String
        get() = current.identityQuoteString
    override val shouldQuoteIdentifiers: Boolean
        get() = current.shouldQuoteIdentifiers
    override val supportsAlterTableWithAddColumn: Boolean
        get() = current.supportsAlterTableWithAddColumn
    override val blobAsStream: Boolean
        get() = current.blobAsStream
    override val keywords: Set<String>
        get() = current.keywords

    override fun insert(table: IModel<*>, columns: List<IModelField<*, *>>, expr: String, cr: TransactionExecutor): String =
            current.insert(table, columns, expr, cr)

    override fun delete(table: IModel<*>, where: String?, cr: TransactionExecutor): String =
            current.delete(table, where, cr)

    override fun replace(table: IModel<*>, data: List<Pair<IModelField<*,*>, Any?>>, cr: TransactionExecutor): String =
            current.replace(table, data, cr)

    override fun createIndex(unique: Boolean, tableName: String, indexName: String, columns: List<String>): String = current.createIndex(unique, tableName, indexName, columns)

    override fun dropIndex(tableName: String, indexName: String): String =
            current.dropIndex(tableName, indexName)

    override fun modifyColumn(column: IModelField<*, *>): String =
            current.modifyColumn(column)

    override fun limit(size: Int, offset: Int, alreadyOrdered: Boolean): String =
            current.limit(size, offset, alreadyOrdered)

    override fun inProperCase(s: String): String = current.inProperCase(s)

    override fun booleanFromStringToBoolean(value: String): Boolean = current.booleanFromStringToBoolean(value)

    override fun booleanToStatementString(b: Boolean): String = current.booleanToStatementString(b)
}

class NoKormDialectFound(dialectName: String = "") : IllegalStateException("No Dialect $dialectName found for platypus")
class TooManyKormDialectFound(dialectNames: Collection<String>) : IllegalStateException("To many Dialect found for platypus [${dialectNames.joinToString()}]")