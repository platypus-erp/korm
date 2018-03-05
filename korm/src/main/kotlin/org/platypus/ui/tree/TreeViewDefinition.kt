package org.platypus.ui.tree

import org.platypus.SearchTreeParam
import org.platypus.model.Model
import org.platypus.orm.sql.query.SmartQueryBuilder
import org.platypus.ui.ToViewApi
import org.platypus.ui.ViewApi
import org.platypus.ui.search.SearchViews


class TreeViewDefinition<M : Model<M>>(
        override val uniqueName: String,
        override val model: M,
        private val def: TreeViewBuilder<M>.(M) -> Unit
) : ToViewApi<M> {

    private val builder by lazy {
        val b = TreeViewBuilderImpl(model)
        b.def(model)
        b
    }

    override fun toViewApi(): ViewApi {
        return TreeViewGenerator(uniqueName, model, builder)
    }

    override fun querySearch(param: SearchTreeParam): SmartQueryBuilder<M> {
        val q = builder.querySearch
        val searchView = builder.searchView ?: SearchViews.getDefaultView(model)
        return q.merge(searchView.querySearch(param))
    }
}

