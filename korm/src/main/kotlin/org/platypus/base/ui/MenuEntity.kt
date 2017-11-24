package org.platypus.base.ui

import org.platypus.api.env.PlatypusEnvironement
import org.platypus.impl.korm.entity.many2one
import org.platypus.impl.korm.entity.memory.EmptyMemoryEntity
import org.platypus.impl.korm.entity.memory.RWNamedMemoryEntity
import org.platypus.impl.korm.entity.one2many

typealias EmptyUIMenu = EmptyMemoryEntity<UIMenu, UIMenuModel>

class UIMenu(id: Long, env: PlatypusEnvironement) : RWNamedMemoryEntity<UIMenu, UIMenuModel>(id, env, UIMenuModel, { e: PlatypusEnvironement -> e.uiMenu })

val UIMenu.parent by UIMenuModel.parent many2one { e -> e.uiMenu }
var UIMenu.icon by UIMenuModel.icon
val UIMenu.children by UIMenuModel.children one2many { e -> e.uiMenu }
var UIMenu.action by UIMenuModel.action many2one { e -> e.uiActions }

val PlatypusEnvironement.uiMenu: EmptyUIMenu
    get() = EmptyMemoryEntity(this, UIMenuModel, { id, env -> UIMenu(id, env) })


typealias EmptyUIActions = EmptyMemoryEntity<UIActions, UIActionsModel>

class UIActions(id: Long, env: PlatypusEnvironement) : RWNamedMemoryEntity<UIActions, UIActionsModel>(id, env, UIActionsModel, { e: PlatypusEnvironement -> e.uiActions })

var UIActions.modelName by UIActionsModel.model
var UIActions.viewType by UIActionsModel.viewType
var UIActions.defaultViewType by UIActionsModel.defaultViewType

val PlatypusEnvironement.uiActions: EmptyUIActions
    get() = EmptyMemoryEntity(this, UIActionsModel, { id, env -> UIActions(id, env) })