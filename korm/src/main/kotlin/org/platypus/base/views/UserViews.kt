package org.platypus.base.views

import org.platypus.base.models.UserModel
import org.platypus.impl.ui.tree.tree


val userTree = tree(UserModel) {
    field(UserModel.name)
    field(UserModel.password)
    field(UserModel.locale)
}