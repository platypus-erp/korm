package org.platypus.ui.search

import org.platypus.model.Model
import org.platypus.ui.tree.TreeViewBuilderExtend
import org.platypus.ui.tree.TreeViewDelegateExtend

fun <M : Model<M>> SearchViewBuilderExtend<M>.extend(function: TreeViewBuilderExtend<M>.(M) -> Unit): TreeViewDelegateExtend<M> {
    return TreeViewDelegateExtend(this.model, function)

}

fun <M : Model<M>> SearchViewBuilder<M>.extend(function: TreeViewBuilderExtend<M>.(M) -> Unit): TreeViewDelegateExtend<M> {
    return TreeViewDelegateExtend(this.model, function)

}

fun <M : Model<M>> M.newSearch(function: SearchViewBuilder<M>.(M) -> Unit): SearchViewDelegate<M> {
    return SearchViewDelegate(this, function)
}

class SearchViewDelegate<M : Model<M>>(val model: M, val function: SearchViewBuilder<M>.(M) -> Unit)

class SearchViewDelegateExtend<M : Model<M>>(val model: M, val function: SearchViewBuilder<M>.(M) -> Unit)