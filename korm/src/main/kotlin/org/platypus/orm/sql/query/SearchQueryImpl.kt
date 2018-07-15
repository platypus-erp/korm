package org.platypus.orm.sql.query

import org.platypus.PlatypusEnvironment
import org.platypus.cache.of
import org.platypus.model.Model
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.impl.ReferenceField
import org.platypus.orm.sql.and
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.or
import org.platypus.orm.sql.visitor.FieldGetVisitor
import org.platypus.orm.sql.visitor.IdPkVisitor

internal class SearchQueryImpl<M : Model<M>>(
        private val model: M,
        val env: PlatypusEnvironment,
        private val searchPart: SearchQuerySelectPart<M> = SearchQuerySelectPartImpl(model, false, false),
        private val predicate: Expression<Boolean>? = null,
        private val offset: Int = 0,
        private val limit: Int = -1,
        private val _orderByColumns: MutableList<Pair<Expression<*>, ORDERBY_TYPE>> = mutableListOf()
) : SearchQuery<M> {

    override val currentPredicate: (M) -> Expression<Boolean>?
        get() = { m -> predicate }

    internal fun buildQuery(env: PlatypusEnvironment): Query {
        val q = Query(env, searchPart, predicate)
        if (this.limit > 0) {
            q.limit(this.limit, this.offset)
        }
        q.orderBy()
        return q
    }

    override fun adjustSelect(slice: SearchQuerySelectPart<M>.(M) -> Unit): SearchQuery<M> {
        return SearchQueryImpl(
                model,
                env,
                searchPart.typedClone().apply {
                    slice(model)
                },
                predicate,
                offset,
                limit,
                _orderByColumns
        )
    }

    override fun execute(): List<Int> {
        val res = LinkedHashSet<Int>()
        val query = buildQuery(env)
        for (row in query) {
            for ((model, fields) in searchPart.sliceByModel) {
                val fieldPk = fields.first { it.accept(IdPkVisitor, null) }
                val pk = row.getAny(fieldPk) as Int
                res.add(pk)
                val modelID = model of pk
                for(f in fields){
                    env.internal.cache.put(f.accept(FieldGetVisitor, null), modelID, row.getAny(f))
                }
            }
        }
        return res.toList()
    }


    fun test() {

    }

    override fun orderBy(column: ModelField<*, *>, orderBy: ORDERBY_TYPE): SearchQuery<M> = orderBy(column to orderBy)


    override fun orderBy(vararg columns: Pair<ModelField<*, *>, ORDERBY_TYPE>) = orderBy(columns.toList())

    override fun orderBy(columns: List<Pair<ModelField<*, *>, ORDERBY_TYPE>>): SearchQuery<M> {
        return SearchQueryImpl(
                model,
                env,
                searchPart,
                predicate,
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
                searchPart,
                predicate,
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
                searchPart,
                if (this.predicate != null) {
                    this.predicate!!.or(FieldUniryPlusImpl<M>().predicate(model))
                } else {
                    this.predicate
                },
                offset,
                limit,
                _orderByColumns
        )
    }

    override fun and(predicate: FieldGetter<M>.(M) -> Expression<Boolean>): SearchQueryImpl<M> {
        return SearchQueryImpl(
                model,
                env,
                searchPart,
                if (this.predicate != null) {
                    this.predicate!!.and(FieldUniryPlusImpl<M>().predicate(model))
                } else {
                    this.predicate
                },
                offset,
                limit,
                _orderByColumns
        )
    }

    override fun where(predicate: FieldGetter<M>.(M) -> Expression<Boolean>): SearchQueryImpl<M> {
        return SearchQueryImpl(
                model,
                env,
                searchPart,
                FieldUniryPlusImpl<M>().predicate(model),
                offset,
                limit,
                _orderByColumns
        )
    }

}