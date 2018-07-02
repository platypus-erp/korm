package org.platypus.orm.sql.query

import org.platypus.model.Model
import org.platypus.model.field.api.ModelField
import org.platypus.orm.sql.expression.Expression

interface SearchQueryBuilderV2<M : Model<M>> {
    val currentPredicate: (M) -> Expression<Boolean>?
    fun adjustSelect(slice : FieldUnaryPlus<M>.(M) -> Unit): SearchQueryBuilderV2<M>

    fun orderBy(column: ModelField<*, *>, orderBy: ORDERBY_TYPE = ORDERBY_TYPE.ASC): SearchQueryBuilderV2<M>
    fun orderBy(vararg columns: Pair<ModelField<*, *>, ORDERBY_TYPE>): SearchQueryBuilderV2<M>
    fun orderBy(columns: List<Pair<ModelField<*, *>, ORDERBY_TYPE>>): SearchQueryBuilderV2<M>
    fun limit(limit: Int, offset: Int = 0): SearchQueryBuilderV2<M>
    fun where(predicate: FieldGetter<M>.(M) -> Expression<Boolean>): SearchQueryBuilderV2<M>
    fun or(predicate: FieldGetter<M>.(M) -> Expression<Boolean>): SearchQueryBuilderV2<M>
    fun and(predicate: FieldGetter<M>.(M) -> Expression<Boolean>): SearchQueryBuilderV2<M>
    fun execute(): List<Int>
    fun copy(): SearchQueryBuilderV2<M>
}