package org.platypus.module.base.ui

import org.platypus.module.base.models.Groups
import org.platypus.module.base.models.Users
import org.platypus.ui.action.MenuAction
import org.platypus.ui.action.MenuAction.getValue
import org.platypus.ui.action.newMenuAction
import org.platypus.ui.menu.AppMenus
import org.platypus.ui.menu.AppMenus.getValue
import org.platypus.ui.menu.newMenu

val AppMenus.configMenu by newMenu {
    name = "Configuration"
}

val AppMenus.resAuthMenu by newMenu {
    name = "Auth"
    parent = AppMenus.configMenu
}

val AppMenus.menuModel by newMenu {
    name = "Models"
    parent = AppMenus.configStruct
}

val AppMenus.routesMenu by newMenu {
    name = "Routes"
    parent = AppMenus.configStruct
}

val AppMenus.configStruct by newMenu {
    name = "Structure"
    parent = AppMenus.configMenu
}

val MenuAction.actGroup by Groups.newMenuAction {
    name = "Groups"
}

val AppMenus.configGroupMenu by newMenu {
    name = "Groups"
    parent = AppMenus.resAuthMenu
    action = MenuAction.actGroup
}

val MenuAction.actUser by Users.newMenuAction {
    name = "Users"
}

val AppMenus.configUserMenu by newMenu {
    name = "Users"
    parent = AppMenus.resAuthMenu
    action = MenuAction.actUser
}