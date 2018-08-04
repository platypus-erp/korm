package org.platypus.orm.sql.query

import org.platypus.model.IModel
import org.platypus.model.field.api.ModelField
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.predicate.PredicateField

interface SearchQuery<M : IModel<M>> {
    val currentPredicate: (M) -> Expression<Boolean>?
    fun adjustSelect(select : SearchQuerySelectPart<M>.(M) -> Unit): SearchQuery<M>

    fun orderBy(column: ModelField<*, *>, orderBy: ORDERBY_TYPE = ORDERBY_TYPE.ASC): SearchQuery<M>
    fun orderBy(vararg columns: Pair<ModelField<*, *>, ORDERBY_TYPE>): SearchQuery<M>
    fun orderBy(columns: List<Pair<ModelField<*, *>, ORDERBY_TYPE>>): SearchQuery<M>
    fun limit(limit: Int, offset: Int = 0): SearchQuery<M>
    fun where(predicate: SearchQueryWherePart<M>.(M) -> PredicateField): SearchQuery<M>
    fun or(predicate: SearchQueryWherePart<M>.(M) -> PredicateField): SearchQuery<M>
    fun and(predicate: SearchQueryWherePart<M>.(M) -> PredicateField): SearchQuery<M>
    fun execute(): List<Int>
}

interface SearchQueryBuilder<M : IModel<M>>:SearchQuerySelectPart<M>,SearchQueryWherePart<M>  {
    fun orderBy(column: ModelField<*, *>, orderBy: ORDERBY_TYPE = ORDERBY_TYPE.ASC)
    fun orderBy(vararg columns: Pair<ModelField<*, *>, ORDERBY_TYPE>)
    fun orderBy(columns: List<Pair<ModelField<*, *>, ORDERBY_TYPE>>)
    fun limit(limit: Int, offset: Int = 0)
    fun execute(): List<Int>
}