package org.platypus.module.base.models

import org.platypus.model.Model
import org.platypus.model.functions.PublicApiReturn
import org.platypus.model.functions.asResult
import org.platypus.module.base.entities.User
import org.platypus.module.base.entities.groups
import org.platypus.module.base.entities.hasGroup
import org.platypus.module.base.entities.hashPassword
import org.platypus.module.base.entities.password
import org.platypus.module.base.entities.users
import org.platypus.orm.sql.expression.eq
import org.platypus.security.GroupData
import java.util.*

object Users : Model<Users>("base.users") {

    init {
        name.extends { label = "Login" }
        modelLabel = "Users"
    }

    val password = string("password") {
        label = "Password"
    }
    val groups = many2many("groupsRepo", { userGroupRel })

    val locale = string("locale") {
        label = "The User Language"
        required = true
        default = Locale.US.displayName
    }

    val hasGroup = api.private("hasGroup",
            fun(self: User, group: GroupData): Boolean {
                return group in self.groups
            }
    )

    val hasGroups = api.private("hasGroups",
            fun(self: User, param: HasGroupsParam): Boolean {
                var res = false
                for (group in param.groups) {
                    res = self.hasGroup(group)
                    if (param.all && res) break
                }
                return res
            }
    )


    val login = api.public("$modelName login",
            fun(u: User): PublicApiReturn<UserLoginSuccess> {
                val user = u.env.users.search {
                    where { name eq u.name }
                }.firstOrNull()
                return if (user != null && u.password != null && u.hashPassword() == user.password) {
                    UserLoginSuccess(true)
                } else {
                    UserLoginSuccess(false, "Wrong password ou login please try again")
                }.asResult()
            }
    )

    val disconect = api.public("$modelName disconect",
            fun(u: User): PublicApiReturn<UserDisconnectReturn> {
                return UserDisconnectReturn(true).asResult()
            }
    )

    val hashPassword = api.private("hashPassword", { u: User -> u.password })

}