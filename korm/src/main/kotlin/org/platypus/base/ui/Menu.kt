package org.platypus.base.ui

import org.platypus.impl.korm.model.MemoryModelNamed


object UIMenuModel : MemoryModelNamed<UIMenuModel, UIMenu>("ui.menu") {

    val parent = field.many2one("parent", target = UIMenuModel)
    val icon = field.string("icon")
    val children = field.one2many("children", target = { UIMenuModel.parent })
    val action = field.many2one("action", target = UIActionsModel)
}

object UIActionsModel : MemoryModelNamed<UIActionsModel, UIActions>("ui.actions") {

    val model = field.string("model")
    val viewType = field.string("viewType")
    val defaultViewType = field.string("defaultViewType")
}