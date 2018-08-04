package org.platypus.orm.sql.query

import org.platypus.PlatypusEnvironment
import org.platypus.cache.of
import org.platypus.model.Model
import org.platypus.model.field.api.ModelField
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.predicate.PredicateField
import org.platypus.orm.sql.predicate.and
import org.platypus.orm.sql.predicate.or
import org.platypus.orm.sql.visitor.FieldGetVisitor
import org.platypus.orm.sql.visitor.IdPkVisitor

internal class SearchQueryImpl<M : Model<M>>(
        private val model: M,
        val env: PlatypusEnvironment,
        private val searchPart: SearchQuerySelectPartImpl<M> = SearchQuerySelectPartImpl(model, false, false),
        private val predicate: PredicateField? = null,
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

    override fun adjustSelect(select: SearchQuerySelectPart<M>.(M) -> Unit): SearchQuery<M> {
        return SearchQueryImpl(
                model,
                env,
                SearchQuerySelectPartImpl(model,
                        false,
                        false,
                        searchPart.slice,
                        searchPart.currentColumnSet).apply {
                    select(model)
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
                for (f in fields) {
                    env.internal.cache.put(f.accept(FieldGetVisitor, null), modelID, row.getAny(f))
                }
            }
        }
        return res.toList()
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

    override fun or(predicate: SearchQueryWherePart<M>.(M) -> PredicateField): SearchQueryImpl<M> {
        return SearchQueryImpl(
                model,
                env,
                searchPart,
                if (this.predicate != null) {
                    this.predicate.or(SearchQueryWherePartImpl(model, searchPart.source).predicate(model))
                } else {
                    this.predicate
                },
                offset,
                limit,
                _orderByColumns
        )
    }

    override fun and(predicate: SearchQueryWherePart<M>.(M) -> PredicateField): SearchQueryImpl<M> {
        return SearchQueryImpl(
                model,
                env,
                searchPart,
                if (this.predicate != null) {
                    this.predicate.and(SearchQueryWherePartImpl(model, searchPart.source).predicate(model))
                } else {
                    this.predicate
                },
                offset,
                limit,
                _orderByColumns
        )
    }

    override fun where(predicate: SearchQueryWherePart<M>.(M) -> PredicateField): SearchQuery<M> {
        return SearchQueryImpl(
                model,
                env,
                searchPart,
                SearchQueryWherePartImpl(model, searchPart.source).predicate(model),
                offset,
                limit,
                _orderByColumns
        )
    }

}

