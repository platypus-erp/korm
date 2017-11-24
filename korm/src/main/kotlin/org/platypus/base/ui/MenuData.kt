package org.platypus.base.ui

import org.platypus.base.models.GroupModel
import org.platypus.base.models.UserModel
import org.platypus.impl.module.ModuleDataType
import org.platypus.impl.module.data

val baseMenu = data(ModuleDataType.REAL, version = "1") {
    env.uiMenu.newData("config_menu") {
        name = "Configuration"
        children += env.uiMenu.newData("res_auth_menu") {
            name = "Auth"
            children += env.uiMenu.newData("config_user_menu") {
                name = "Users"
                action = env.uiActions.newData("act_user") {
                    modelName = UserModel.modelName
                    viewType = "tree"
                    defaultViewType = "form"
                }
            }
            children += env.uiMenu.newData("config_group_menu") {
                name = "Groups"
                action = env.uiActions.newData("act_group") {
                    modelName = GroupModel.modelName
                    viewType = "form"
                    defaultViewType = "form"
                }
            }
        }
        children += env.uiMenu.newData("config_struct") {
            name = "Structure"
            children += env.uiMenu.newData("models") {
                name = "Models"
            } + env.uiMenu.newData("routes_menu") {
                name = "Routes"
            }
        }
    }
}