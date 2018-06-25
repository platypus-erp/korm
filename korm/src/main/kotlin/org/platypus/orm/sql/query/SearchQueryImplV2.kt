package org.platypus.orm.sql.query

import org.platypus.model.Model
import org.platypus.orm.PersistenceDialect
import org.platypus.orm.sql.QueryBuilder

internal class SearchQueryImplV2<M : Model<M>> private constructor(
        private val model: M,
        private val selectPart: SearchQuerySelectPart = SearchQuerySelectPartImpl(model)
) : SearchQueryV2<M> {

    override fun prepareSQL(dialect: PersistenceDialect, builder: QueryBuilder): String {
        return selectPart.prepareSQL(dialect, builder)
    }

    override fun select(slice: SearchQuerySelectPart.(M) -> Unit): SearchQueryV2<M> {
        return SearchQueryImplV2(
                model = model,
                selectPart = SearchQuerySelectPartImpl(model).apply { slice(model) }
        )
    }
}