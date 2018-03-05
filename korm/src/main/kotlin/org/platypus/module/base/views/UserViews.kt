package org.platypus.module.base.views

import org.platypus.module.base.models.Users
import org.platypus.ui.tree.TreeViews
import org.platypus.ui.tree.TreeViews.getValue
import org.platypus.ui.tree.newTree

val TreeViews.basicUserTree by Users.newTree {
    field(it.name, true)
    field(it.password, true)
    field(it.locale, true)
}