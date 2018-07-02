package org.platypus.orm.sql.query

import org.platypus.PlatypusEnvironment
import org.platypus.model.Model
import org.platypus.orm.sql.QueryBuilder
import org.platypus.orm.sql.dml.Statement
import org.platypus.orm.sql.dml.StatementType
import java.sql.PreparedStatement
import java.sql.ResultSet

internal class SearchQueryImplV2<M : Model<M>> constructor(
        val env: PlatypusEnvironment,
        private val model: M,
        private val selectPart: SearchQuerySelectPart<M> = SearchQuerySelectPartImpl(model)
) : SearchQueryV2<M>, Statement<ResultSet>(env.internal.cr, StatementType.SELECT, listOf(model)) {

    override fun prepareSQL(): String = prepareSQL(QueryBuilder(true))


    fun prepareSQL(qb: QueryBuilder): String {
        return selectPart.prepareSQL(dialect, QueryBuilder(true))
    }

    override fun PreparedStatement.executeInternal(): ResultSet? = executeQuery()

    override fun arguments() = QueryBuilder(true).let {
        prepareSQL(it)
        if (it.args.isNotEmpty()) listOf(it.args) else emptyList()
    }

    override fun select(slice: SearchQuerySelectPart<M>.(M) -> Unit): SearchQueryV2<M> {
        return SearchQueryImplV2(
                env=env,
                model = model,
                selectPart = SearchQuerySelectPartImpl(model).apply { slice(model) }
        )
    }
}