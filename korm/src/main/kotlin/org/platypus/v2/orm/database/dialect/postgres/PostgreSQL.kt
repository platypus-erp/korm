package org.platypus.v2.orm.database.dialect.postgres

import org.platypus.model.IModel
import org.platypus.orm.database.ddl.FieldDDL
import org.platypus.orm.database.ddl.InlineConstraintType
import org.platypus.orm.database.vendors.DDL_MODE
import org.platypus.orm.database.vendors.ModelNameVisitor
import org.platypus.v2.model.field.api.BaseField
import org.platypus.v2.orm.database.DDLFieldCreator
import org.platypus.v2.orm.database.DDLModelCreator
import org.platypus.v2.orm.database.dialect.SqlDialect
import org.platypus.v2.orm.database.dialect.SqlDialectFactory
import org.platypus.v2.visitor.BaseFieldVisitor
import java.sql.DatabaseMetaData


internal class PostgreSQLDialect private constructor(metadata: DatabaseMetaData) : SqlDialect("postgres", metadata) {

    override val needsSequenceToAutoInc: Boolean = true

    private val PostgresqlDDLFieldCreator = object : DDLFieldCreator {
        override val inlineConstraint = setOf(InlineConstraintType.NOT_NULL, InlineConstraintType.UNIQ)

        override fun identity(mod: BaseField<*, *>) = this@PostgreSQLDialect.identity(mod)
        override fun identity(mod: IModel<*>): String = this@PostgreSQLDialect.identity(mod)
        override fun String.inProperCase(): String = this.inProperCase
    }
    private val PostgresqlDDLModelCreator = object : DDLModelCreator, BaseFieldVisitor<DDL_MODE, FieldDDL> by PostgresqlDDLFieldCreator {

        override val pretty: Boolean = true
        override val acceptIfNotExist: Boolean = true

        override fun identity(mod: BaseField<*, *>): String = this@PostgreSQLDialect.identity(mod)
        override fun identity(mod: IModel<*>): String = this@PostgreSQLDialect.identity(mod)
        override fun String.inProperCase(): String = this.inProperCase
    }

    companion object : SqlDialectFactory {
        override fun create(meta: DatabaseMetaData) = PostgreSQLDialect(meta)

    }


    private val privateModelNameVisitor: ModelNameVisitor = object : ModelNameVisitor {
        override fun String.inProperCase(): String = this@PostgreSQLDialect.inProperCase(this)
        override fun String.quotedIfNeeded(): String = this@PostgreSQLDialect.quoteIfNecessary(this)
    }

    override val modelNameVisitor: ModelNameVisitor = privateModelNameVisitor

    override val dbCreator: DDLModelCreator
        get() = TODO("not implemented")
}