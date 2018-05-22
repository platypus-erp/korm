package org.platypus.module.base.models

import org.platypus.model.Model

/**
 * This model don't have a generated entity but an hand coded one to fit to some feature the platypus framework need
 */
object Groups : Model<Groups>("base.group") {
    val users = many2manyR("users", { userGroupRel })
}