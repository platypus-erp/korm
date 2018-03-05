package org.platypus.ui.tree

import org.platypus.model.Model

fun <M : Model<M>> TreeViewBuilderExtend<M>.extend(function: TreeViewBuilderExtend<M>.(M) -> Unit): TreeViewDelegateExtend<M> {
    return TreeViewDelegateExtend(this.model, function)

}

fun <M : Model<M>> TreeViewBuilder<M>.extend(function: TreeViewBuilderExtend<M>.(M) -> Unit): TreeViewDelegateExtend<M> {
    return TreeViewDelegateExtend(this.model, function)

}


fun <M : Model<M>> M.newTree(function: TreeViewBuilder<M>.(M) -> Unit): TreeViewDelegate<M> {
    return TreeViewDelegate(this, function)
}

class TreeViewDelegate<M : Model<M>>(val model: M, val function: TreeViewBuilder<M>.(M) -> Unit)
class TreeViewDelegateExtend<M : Model<M>>(val model: M, val function: TreeViewBuilderExtend<M>.(M) -> Unit)