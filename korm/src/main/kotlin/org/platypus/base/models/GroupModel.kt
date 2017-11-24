package org.platypus.base.models

import org.platypus.base.entities.Group
import org.platypus.impl.korm.model.ModelNamed

object GroupModel : ModelNamed<GroupModel, Group>("group") {
    val users = field.many2many("users", target = UserModel, targetField = "groups")
}