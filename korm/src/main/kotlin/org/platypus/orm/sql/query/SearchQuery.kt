package org.platypus.orm.sql.query

import org.platypus.model.Model
import org.platypus.model.field.api.ModelField
import org.platypus.orm.sql.expression.Expression

interface SearchQuery<M : Model<M>> {
    val currentPredicate: (M) -> Expression<Boolean>?
    fun adjustSelect(slice : SearchQuerySelectPart<M>.(M) -> Unit): SearchQuery<M>

    fun orderBy(column: ModelField<*, *>, orderBy: ORDERBY_TYPE = ORDERBY_TYPE.ASC): SearchQuery<M>
    fun orderBy(vararg columns: Pair<ModelField<*, *>, ORDERBY_TYPE>): SearchQuery<M>
    fun orderBy(columns: List<Pair<ModelField<*, *>, ORDERBY_TYPE>>): SearchQuery<M>
    fun limit(limit: Int, offset: Int = 0): SearchQuery<M>
    fun where(predicate: FieldGetter<M>.(M) -> Expression<Boolean>): SearchQuery<M>
    fun or(predicate: FieldGetter<M>.(M) -> Expression<Boolean>): SearchQuery<M>
    fun and(predicate: FieldGetter<M>.(M) -> Expression<Boolean>): SearchQuery<M>
    fun execute(): List<Int>
}