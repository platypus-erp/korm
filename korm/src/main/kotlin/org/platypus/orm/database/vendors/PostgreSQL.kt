package org.platypus.orm.database.vendors

import org.platypus.model.IModel
import org.platypus.model.field.api.IModelField
import org.platypus.orm.PersistenceDialect
import org.platypus.orm.database.ddl.DefaultDDLFieldCreator
import org.platypus.orm.database.ddl.DefaultDDLModelCreator
import org.platypus.orm.database.ddl.InlineConstraintType
import org.platypus.orm.transaction.SqlDialectFactory
import java.sql.DatabaseMetaData


internal class PostgreSQLDialect private constructor(metadata: DatabaseMetaData) : DefaultSqlDialect("postgres", metadata) {

    override val needsSequenceToAutoInc: Boolean
        get() = true

    private val PostgresqlDDLFieldCreator = object : DefaultDDLFieldCreator(setOf(InlineConstraintType.NOT_NULL, InlineConstraintType.UNIQ)) {
        override fun identity(mod: IModelField<*, *>) = this@PostgreSQLDialect.identity(mod)
        override fun identity(mod: IModel<*>): String = this@PostgreSQLDialect.identity(mod)
        override fun String.inProperCase(): String = this.inProperCase
    }
    private val PostgresqlDDLModelCreator = object : DefaultDDLModelCreator(true, true, PostgresqlDDLFieldCreator) {
        override fun identity(mod: IModelField<*, *>): String = this@PostgreSQLDialect.identity(mod)
        override fun identity(mod: IModel<*>): String = this@PostgreSQLDialect.identity(mod)
        override fun String.inProperCase(): String = this.inProperCase
    }

    override val dialectDDL: DialectDDL = DefaultDialectDDL(
            PostgresqlDDLFieldCreator,
            PostgresqlDDLModelCreator)

//    private val privateExpressionVisitor: DefaultSqlExpressionVisitor = object : DefaultSqlExpressionVisitor {
//        override fun String.quotedIfNeeded(): String = this@PostgreSQLDialect.quoteIfNecessary(this)
//    }
//    override val expressionVisitor: ExpressionVisitor<QueryBuilder, String> = privateExpressionVisitor

    companion object : SqlDialectFactory {
        override fun create(metadata: DatabaseMetaData): PersistenceDialect = PostgreSQLDialect(metadata)

    }

    private val privateModelNameVisitor: ModelNameVisitor = object : ModelNameVisitor {
        override fun String.inProperCase(): String = this@PostgreSQLDialect.inProperCase(this)
        override fun String.quotedIfNeeded(): String = this@PostgreSQLDialect.quoteIfNecessary(this)
    }

    override val modelNameVisitor: ModelNameVisitor = privateModelNameVisitor
}