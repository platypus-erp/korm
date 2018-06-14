package org.platypus.orm.sql.dml.statements

import org.platypus.PlatypusEnvironment
import org.platypus.model.IModel
import org.platypus.model.Model
import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.orm.sql.QueryBuilder
import org.platypus.orm.sql.dml.Statement
import org.platypus.orm.sql.dml.StatementType
import org.platypus.orm.sql.expression.Expression
import java.sql.PreparedStatement

class DeleteStatement (env: PlatypusEnvironment, val model: IModel<*>, val where: Expression<Boolean>? = null, val isIgnore: Boolean = false) : Statement<Int>(env.internal.cr, StatementType.DELETE, listOf(model)) {

    override fun PreparedStatement.executeInternal(): Int {
        return executeUpdate()
    }

    override fun prepareSQL(): String = dialect.delete(model,where?.accept(dialect.expressionVisitor, QueryBuilder(true)), cr)

    override fun arguments(): Iterable<Iterable<Pair<SqlFieldType, Any?>>> = QueryBuilder(true).run {
        where?.accept(dialect.expressionVisitor, this)
        listOf(args)
    }

    companion object {

        fun where(env: PlatypusEnvironment,
                  model: Model<*>,
                  op: Expression<Boolean>,
                  isIgnore: Boolean = false): Int = DeleteStatement(env, model, op, isIgnore).execute()
                ?: 0

        fun all(env: PlatypusEnvironment, model: Model<*>): Int = DeleteStatement(env, model).execute() ?: 0
    }
}
