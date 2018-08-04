package org.platypus.orm.sql.query

import org.platypus.PlatypusEnvironment
import org.platypus.model.IModel
import org.platypus.model.Model
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.impl.Many2OneField
import org.platypus.orm.sql.visitor.FieldGetVisitor
import org.platypus.orm.sql.visitor.IdPkVisitor

internal class SearchQueryBuilderImpl<M : Model<M>>(
        private val model: M,
        val env: PlatypusEnvironment
) : SearchQueryBuilder<M> {

    private var searchQuery: SearchQuery<M> = SearchQueryImpl(model, env)

    override fun <M1 : IModel<M1>, M2 : IModel<M2>> Many2OneField<M, M1>.join(getter: M1.() -> Many2OneField<M1, M2>): Join3<M, M1, M2> {
        searchQuery = searchQuery.adjustSelect {
            this@join.join(getter)
        }
    }

    override fun <M1 : IModel<M1>, M2 : IModel<M2>, M3 : IModel<M3>> Join3<M, M1, M2>.join(getter: M2.() -> Many2OneField<M2, M3>): Join4<M, M1, M2, M3> {
        TODO("not implemented")
    }

    override fun <M1 : IModel<M1>, M2 : IModel<M2>, M3 : IModel<M3>, M4 : IModel<M4>> Join4<M, M1, M2, M3>.join(getter: M3.() -> Many2OneField<M3, M4>): Join5<M, M1, M2, M3, M4> {
        TODO("not implemented")
    }

    override fun <M1 : IModel<M1>, M2 : IModel<M2>, M3 : IModel<M3>, M4 : IModel<M4>, M5 : IModel<M5>> Join5<M, M1, M2, M3, M4>.join(getter: M4.() -> Many2OneField<M4, M5>): Join6<M, M1, M2, M3, M4, M5> {
        TODO("not implemented")
    }

    override fun <M1 : IModel<M1>, M2 : IModel<M2>, M3 : IModel<M3>, M4 : IModel<M4>, M5 : IModel<M5>, M6 : IModel<M6>> Join6<M, M1, M2, M3, M4, M5>.join(getter: M5.() -> Many2OneField<M5, M6>): Join7<M, M1, M2, M3, M4, M5, M6> {
        TODO("not implemented")
    }

    override fun <M1 : IModel<M1>, M2 : IModel<M2>, M3 : IModel<M3>, M4 : IModel<M4>, M5 : IModel<M5>, M6 : IModel<M6>, M7 : IModel<M7>> Join7<M, M1, M2, M3, M4, M5, M6>.join(getter: M6.() -> Many2OneField<M6, M7>): Join8<M, M1, M2, M3, M4, M5, M6, M7> {
        TODO("not implemented")
    }

    override fun <M1 : IModel<M1>, M2 : IModel<M2>, M3 : IModel<M3>, M4 : IModel<M4>, M5 : IModel<M5>, M6 : IModel<M6>, M7 : IModel<M7>, M8 : IModel<M8>> Join8<M, M1, M2, M3, M4, M5, M6, M7>.join(getter: M7.() -> Many2OneField<M7, M8>): Join9<M, M1, M2, M3, M4, M5, M6, M7, M8> {
        TODO("not implemented")
    }

    override fun <M1 : IModel<M1>, M2 : IModel<M2>, M3 : IModel<M3>, M4 : IModel<M4>, M5 : IModel<M5>, M6 : IModel<M6>, M7 : IModel<M7>, M8 : IModel<M8>, M9 : IModel<M9>> Join9<M, M1, M2, M3, M4, M5, M6, M7, M8>.join(getter: M8.() -> Many2OneField<M8, M9>): Join10<M, M1, M2, M3, M4, M5, M6, M7, M8, M9> {
        TODO("not implemented")
    }

    override fun execute(): List<Int> {
        return searchQuery.execute()
    }

    override fun orderBy(column: ModelField<*, *>, orderBy: ORDERBY_TYPE) = orderBy(column to orderBy)


    override fun orderBy(vararg columns: Pair<ModelField<*, *>, ORDERBY_TYPE>) = orderBy(columns.toList())

    override fun orderBy(columns: List<Pair<ModelField<*, *>, ORDERBY_TYPE>>) {
        searchQuery = searchQuery.orderBy(columns)
    }

    override fun limit(limit: Int, offset: Int) {
        searchQuery = searchQuery.limit(limit, offset)
    }
}

