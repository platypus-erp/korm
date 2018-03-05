package org.platypus.module.base.models

import org.platypus.model.Model

object Groups : Model<Groups>("base.group") {
    val users = many2manyR("users", { userGroupRel })
}