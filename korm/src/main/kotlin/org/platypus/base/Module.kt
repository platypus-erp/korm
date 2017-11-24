package org.platypus.base

import org.platypus.base.entities.*
import org.platypus.base.i18n.i18n_base
import org.platypus.base.i18n.i18n_en
import org.platypus.base.i18n.i18n_fr
import org.platypus.base.models.*
import org.platypus.base.ui.*
import org.platypus.base.views.userTree
import org.platypus.impl.module.declareModule

val baseModule = declareModule("base") {
    models {
        add(UserModel, { e -> e.User }) {
            route {
                "login" pathOf UserModel.login
            }
            views {
                add(userTree)
            }
        }
        add(ResCompanyModel, { env -> env.ResCompany })
        add(ResCurrencyModel, { env -> env.ResCurrency })
        add(ResPartnerModel, { env -> env.ResPartner })
        add(GroupModel, { e -> e.Group })
        add(UIMenuModel, { e -> e.uiMenu }) {
            route {
                //                TODO find a way to declare custom controller for a Model
//                lowLevelRoute(""){
//                    get("{ref?}") {
//                        val env = this@Platypus.newEnv()
//                        val lazy = call.parameters["lazy"]?.toBoolean() ?: true
//                        val ref = call.parameters["ref"] ?: "config_menu"
//                        println("/web/menu/{$ref}?lazy=$lazy")
//                        val res = env.uiMenu[ref]
//                        env.closeEnv()
//                        call.respondText(res.toJson(LazyLoadType.CHILDREN_AND_LINK, true)
//                            .toJsonString(true), ContentType.Application.Json)
//                    }
//                }
            }
        }
        add(UIActionsModel, { e -> e.uiActions })
    }
    datas {
        add(baseMenu)
    }
    i18n {
        add(i18n_base)
        add(i18n_fr)
        add(i18n_en)
    }
//                TODO find a way to declare custom controller
}

