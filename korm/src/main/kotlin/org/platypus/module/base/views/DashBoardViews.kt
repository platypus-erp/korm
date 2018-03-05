package org.platypus.module.base.views

import org.platypus.module.base.models.DashBoardModel
import org.platypus.ui.action.MenuAction
import org.platypus.ui.action.MenuAction.getValue
import org.platypus.ui.action.newMenuAction
import org.platypus.ui.tree.TreeViews

val MenuAction.default by DashBoardModel.newMenuAction {
    name = "Dashboard"
    viewMode += setOf(TreeViews)
}

