package org.platypus.orm.sql.query

import org.platypus.model.Model

interface SearchQueryV2<M : Model<M>>:StatementPart {
    fun select(slice : SearchQuerySelectPart.(M) -> Unit): SearchQueryV2<M>

//    fun orderBy(column: ModelField<*, *>, orderBy: ORDERBY_TYPE = ORDERBY_TYPE.ASC): SearchQueryV2<M>
//    fun orderBy(vararg columns: Pair<ModelField<*, *>, ORDERBY_TYPE>): SearchQueryV2<M>
//    fun orderBy(columns: List<Pair<ModelField<*, *>, ORDERBY_TYPE>>): SearchQueryV2<M>
//    fun limit(limit: Int, offset: Int = 0): SearchQueryV2<M>
//    fun where(predicate: FieldGetter.(M) -> Expression<Boolean>): SearchQueryV2<M>
//    fun or(predicate: FieldGetter.(M) -> Expression<Boolean>): SearchQueryV2<M>
//    fun and(predicate: FieldGetter.(M) -> Expression<Boolean>): SearchQueryV2<M>
//    fun execute(): List<Int>
//    fun copy(): SearchQueryV2<M>
}