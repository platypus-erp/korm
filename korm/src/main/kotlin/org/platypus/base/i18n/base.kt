package org.platypus.base.i18n

import org.platypus.base.models.GroupModel
import org.platypus.base.models.UserModel
import org.platypus.base.ui.UIActionsModel
import org.platypus.base.ui.UIMenuModel
import org.platypus.api.i18n.baseTranslate
import java.util.*

val i18n_base = baseTranslate(Locale.ENGLISH) {
    model(UserModel) {
        field(UserModel.name)
        field(UserModel.password)
        field(UserModel.groups)
    }
    model(GroupModel) {
        field(GroupModel.users)
    }
    model(UIMenuModel) {
        field(UIMenuModel.name)
        field(UIMenuModel.action)
        field(UIMenuModel.icon)
        field(UIMenuModel.parent)
    }
    model(UIActionsModel) {
        field(UIActionsModel.name)
        field(UIActionsModel.defaultViewType)
        field(UIActionsModel.model)
        field(UIActionsModel.viewType)
    }
}