package org.platypus.module.base

import org.platypus.module.ModuleBuilder
import org.platypus.module.base.i18n.i18n_base
import org.platypus.module.base.i18n.i18n_en
import org.platypus.module.base.i18n.i18n_fr
import org.platypus.module.base.models.DashBoardModel
import org.platypus.module.base.models.GroupsData
import org.platypus.module.base.models.LanguageDirection
import org.platypus.module.base.models.Languages
import org.platypus.module.base.models.Users
import org.platypus.module.base.models.ltr
import org.platypus.module.base.models.rtl
import org.platypus.module.base.ui.actGroup
import org.platypus.module.base.ui.actUser
import org.platypus.module.base.ui.configGroupMenu
import org.platypus.module.base.ui.configMenu
import org.platypus.module.base.ui.configStruct
import org.platypus.module.base.ui.configUserMenu
import org.platypus.module.base.ui.menuModel
import org.platypus.module.base.ui.resAuthMenu
import org.platypus.module.base.ui.routesMenu
import org.platypus.module.base.views.basicUserTree
import org.platypus.module.base.views.default
import org.platypus.module.base.views.menu_res_lang_act_window
import org.platypus.module.base.views.res_lang_act_window
import org.platypus.module.base.views.res_lang_tree
import org.platypus.ui.action.MenuAction
import org.platypus.ui.menu.AppMenus
import org.platypus.ui.tree.TreeViews

object BaseModule : ModuleBuilder("base", {
    dependsOf()
    models {
        Users config {
            route {
                "login" pathOf Users.login
            }
            actions {
                add(MenuAction.actUser)
            }
            views {
                add(TreeViews.basicUserTree)
            }
        }
        GroupsData config {
            actions {
                add(MenuAction.actGroup)
            }
        }
        DashBoardModel config {
            actions {
                add(MenuAction.default)
            }
        }
        Languages config {
            views {
                add(TreeViews.res_lang_tree)
            }
            actions {
                add(MenuAction.res_lang_act_window)
            }
        }
    }
    datas {
        add(dataBaseModule)
        add(dataResLanguage)
    }
    i18n {
        add(i18n_base)
        add(i18n_fr)
        add(i18n_en)
    }
    menus {
        add(AppMenus.configMenu)
        add(AppMenus.resAuthMenu)
        add(AppMenus.menuModel)
        add(AppMenus.routesMenu)
        add(AppMenus.configStruct)
        add(AppMenus.configGroupMenu)
        add(AppMenus.configUserMenu)
        add(AppMenus.menu_res_lang_act_window)
    }
    LanguageDirection.rtl
    LanguageDirection.ltr
})

