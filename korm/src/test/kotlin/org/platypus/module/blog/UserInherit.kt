package org.platypus.module.blog

import org.platypus.model.ExtendModel
import org.platypus.model.field.impl.StringField
import org.platypus.module.base.models.Users

object UserInherit : ExtendModel<Users>(Users) {

    init {
        original.locale extend {

        }
        original.name extend {

        }
    }

    val email = string("email") {
        lenght = 100
        index = true
    }
}

val Users.email: StringField<Users>
    get() = UserInherit.email