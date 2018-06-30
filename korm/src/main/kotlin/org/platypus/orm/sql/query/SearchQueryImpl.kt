package org.platypus.orm.sql.query

import org.platypus.PlatypusEnvironment
import org.platypus.cache.of
import org.platypus.model.Model
import org.platypus.model.field.api.IModelField
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.impl.ReferenceField
import org.platypus.orm.sql.and
import org.platypus.orm.sql.dml.ColumnSet
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.or

internal class SearchQueryImpl<M : Model<M>>(
        private val model: M,
        val env: PlatypusEnvironment,
        private val expr: Set<IModelField<M, *>> = model.storeFields,
        private val predicate: Expression<Boolean>? = null,
        private val joins: LinkedHashMap<ReferenceField<*, *>, Join.JoinType> = LinkedHashMap(),
        private val offset: Int = 0,
        private val limit: Int = -1,
        private val _orderByColumns: MutableList<Pair<Expression<*>, ORDERBY_TYPE>> = mutableListOf()
) : SearchQuery<M> {

    override val currentPredicate: (M) -> Expression<Boolean>?
        get() = { m -> predicate }

    internal fun buildQuery(env: PlatypusEnvironment): Query {
        var colSet: ColumnSet = model
        for ((f, j) in joins) {
            colSet = colSet.join(f.target, j, f, f.target.id)
        }
        val q = Query(env, colSet.slice(expr), predicate)
        if (this.limit > 0) {
            q.limit(this.limit, this.offset)
        }
        q.orderBy()
        return q
    }

    override fun adjustSelect(slice: SearchQuerySelectPart<M>.(M) -> Unit): SearchQuery<M> {
        TODO("not implemented")
    }

    override fun execute(): List<Int> {
        val res = ArrayList<Int>()
        val query = buildQuery(env)
        for (row in query) {
            val id = row.get(model.id)
            res.add(id)
            env.internal.cache.store(model of id, expr, row)
        }
        return res
    }

    override fun copy(): SearchQuery<M> {
        TODO("not implemented")
    }

    override fun orderBy(column: ModelField<*, *>, orderBy: ORDERBY_TYPE): SearchQuery<M> = orderBy(column to orderBy)


    override fun orderBy(vararg columns: Pair<ModelField<*, *>, ORDERBY_TYPE>) = orderBy(columns.toList())

    override fun orderBy(columns: List<Pair<ModelField<*, *>, ORDERBY_TYPE>>): SearchQuery<M> {
        return SearchQueryImpl(
                model,
                env,
                expr,
                predicate,
                joins,
                offset,
                limit,
                _orderByColumns.toMutableList().apply {
                    addAll(columns)
                }
        )
    }

    override fun limit(limit: Int, offset: Int): SearchQuery<M> {
        return SearchQueryImpl(
                model,
                env,
                expr,
                predicate,
                joins,
                offset,
                limit,
                _orderByColumns
        )
    }

    fun <M1 : Model<M1>, M2 : Model<M2>> ReferenceField<M1, M2>.join(joinType: Join.JoinType? = null): M2 {
        joinField(this, joinType)
        return this.target
    }

    fun joinField(field: ReferenceField<*, *>, joinType: Join.JoinType? = null) {
        TODO()
//        val jType = joinType ?: if (field.required) {
//            JoinType.INNER
//        } else {
//            JoinType.LEFT
//        }
//        joins[field] = jType
//        expr.add(field.target.id)
//        expr.add(field)
    }

    override fun or(predicate: FieldGetter<M>.(M) -> Expression<Boolean>): SearchQueryImpl<M> {
        return SearchQueryImpl(
                model,
                env,
                expr,
                if (this.predicate != null) {
                    this.predicate!!.or(FieldUniryPlusImpl<M>().predicate(model))
                } else {
                    this.predicate
                },
                joins,
                offset,
                limit,
                _orderByColumns
        )
    }

    override fun and(predicate: FieldGetter<M>.(M) -> Expression<Boolean>): SearchQueryImpl<M> {
        return SearchQueryImpl(
                model,
                env,
                expr,
                if (this.predicate != null) {
                    this.predicate!!.and(FieldUniryPlusImpl<M>().predicate(model))
                } else {
                    this.predicate
                },
                joins,
                offset,
                limit,
                _orderByColumns
        )
    }

    override fun where(predicate: FieldGetter<M>.(M) -> Expression<Boolean>): SearchQueryImpl<M> {
        return SearchQueryImpl(
                model,
                env,
                expr,
                FieldUniryPlusImpl<M>().predicate(model),
                joins,
                offset,
                limit,
                _orderByColumns
        )
    }


    fun merge(other: SearchQueryImpl<M>): SearchQueryImpl<M> {
        return SearchQueryImpl(
                model,
                env,
                expr.toMutableSet().apply {
                    addAll(other.expr)
                },
                when {
                    predicate != null && other.predicate != null -> predicate!! and other.predicate!!
                    predicate == null -> other.predicate
                    else -> predicate
                },
                LinkedHashMap(joins).apply {
                    putAll(other.joins)
                },
                other.offset,
                other.limit,
                _orderByColumns.toMutableList().apply {
                    addAll(other._orderByColumns)
                }
        )
    }


}