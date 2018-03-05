package org.platypus.orm.sql.dml.statements

import org.platypus.PlatypusEnvironment
import org.platypus.model.field.api.IModelField
import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.orm.sql.QueryBuilder
import org.platypus.orm.sql.dml.ColumnSet
import org.platypus.orm.sql.dml.StatementType
import org.platypus.orm.sql.expression.Expression
import java.sql.PreparedStatement

open class UpdateStatement(
        env: PlatypusEnvironment,
        val targetsSet: ColumnSet,
        val where: Expression<Boolean>? = null,
        val limit: Int? = null
) : UpdateBuilder<Int>(env, StatementType.UPDATE, targetsSet.targetTables()) {

    open val firstDataSet: List<Pair<IModelField<*, *>, Any?>> get() = values.toList()

    override fun PreparedStatement.executeInternal(): Int {
        if (values.isEmpty()) return 0
        return executeUpdate()
    }

    override fun prepareSQL(): String = buildString {
        val builder = QueryBuilder(true)

        append("UPDATE ${targetsSet.describe(env)}")
        append(" SET ")
        append(firstDataSet.joinToString { (col, value) ->
            "${env.internal.cr.identity(col)}=" + builder.registerArgument(cr, col, value)
        })

        where.let { append(" WHERE " + it!!.accept(env.internal.dialect.expressionVisitor, builder)) }
        limit?.let { append(" LIMIT $it") }
    }


    override fun arguments(): Iterable<Iterable<Pair<SqlFieldType, Any?>>> = QueryBuilder(true).run {
        values.forEach {
            registerArgument(cr, it.key, it.value)
        }
        where?.accept(env.internal.dialect.expressionVisitor, this)
        if (args.isNotEmpty()) listOf(args) else emptyList()
    }

}
