package org.platypus.orm.sql

import org.platypus.PlatypusEnvironment
import org.platypus.model.Alias
import org.platypus.model.IModel
import org.platypus.model.Model
import org.platypus.model.field.api.IModelField
import org.platypus.orm.sql.dml.ColumnSet
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.expression.ExpressionAlias
import org.platypus.orm.sql.query.Join
import org.platypus.orm.sql.query.Query


class QueryAlias(val query: Query, val alias: String) : ColumnSet {

//    override fun describe(s: Transaction): String = "(${query.prepareSQL(QueryBuilder(false))}) $alias"

    override val fields: Set<IModelField<*, *>>
        get() = query.fieldSet.source.fields.filter { it in query.fieldSet.fieldsExpression }.toSet()

    override fun targetTables(): List<IModel<*>> = query.fieldSet.source.targetTables()
    override fun describe(env: PlatypusEnvironment): String {
        TODO("not implemented")
    }

    @Suppress("UNCHECKED_CAST")
    operator fun <KT : Any> get(original: IModelField<*, KT>): IModelField<*, KT> =
            query.fieldSet.source.fields.find { it == original } as? IModelField<*, KT>
                    ?: error("TableColumn not found in original models")

    @Suppress("UNCHECKED_CAST")
    operator fun <T : Any?> get(original: Expression<T>): Expression<T> = (query.fieldSet.fieldsExpression.find { it == original } as? ExpressionAlias<T>)?.aliasOnlyExpression()
            ?: error("IModelField not found in original models fieldsExpression")

    override fun join(otherTable: ColumnSet, joinType: Join.JoinType,
                      onColumn: Expression<*>?,
                      otherColumn: Expression<*>?,
                      additionalConstraint: (() -> Expression<Boolean>)?): Join =
            Join(this, otherTable, joinType, onColumn, otherColumn, additionalConstraint)

    override infix fun innerJoin(otherTable: ColumnSet): Join = Join(this, otherTable, Join.JoinType.INNER)

    override infix fun leftJoin(otherTable: ColumnSet): Join = Join(this, otherTable, Join.JoinType.LEFT)

    override infix fun crossJoin(otherTable: ColumnSet): Join = Join(this, otherTable, Join.JoinType.CROSS)
}

fun <T : Model<T>> T.alias(alias: String) = Alias(this, alias)
fun <T : Query> T.alias(alias: String) = QueryAlias(this, alias)
fun <T : Expression<*>> T.alias(alias: String) = ExpressionAlias(this, alias)

//fun Join.joinQuery(on: ((QueryAlias) -> Expression<Boolean>), joinType: JoinType = JoinType.INNER, joinPart: () -> Query): Join {
//    val qAlias = joinPart().alias("q${joinParts.count { it.joinPart is QueryAlias }}")
//    return join(qAlias, joinType, additionalConstraint = { on(qAlias) })
//}
//
//val Join.lastQueryAlias: QueryAlias? get() = joinParts.map { it.joinPart as? QueryAlias }.firstOrNull()