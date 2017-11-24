package org.platypus.base.models

import org.platypus.base.MainCompany
import org.platypus.base.entities.*
import org.platypus.impl.korm.model.ModelNamed
import org.platypus.impl.korm.model.functions.PublicApiReturn
import org.platypus.impl.korm.model.functions.createResult
import org.platypus.impl.korm.sql.eq
import java.util.*

object UserModel : ModelNamed<UserModel, User>("users") {

    init {
        name.extend(label = "Login")
        defaulGet.addExtend { empty ->
            val res = empty.callSuper()
            res.company = empty.env.ResCompany.dataRef.MainCompany
            res
        }
    }

    val password = field.string("password", label = "Password")
    val groups = field.many2many("groups", propGet = { GroupModel.users })
    val locale = field.string("locale", label = "The User Language", required = true,
            default = Locale.US.displayName)
    val company = field.many2one("company", required = true, target = ResCompanyModel)

    val hasGroup = api.private(
            fun(self: User, group: Group): Boolean {
                return group in self.groups
            }
    )

    val hasGroups = api.private(
            fun(self: User, param: HasGroupsParam): Boolean {
                var res = false
                for (group in param.groups) {
                    res = self.hasGroup(group)
                    if (param.all && res) break
                }
                return res
            }
    )


    val login = api.public(
            fun(u: User): PublicApiReturn<UserLoginSuccess> {
                val user = u.env.User.search(where = { UserModel.name eq u.name }).firstOrNull()
                return createResult(if (user != null && u.password.isNotBlank() && u.hashPassword() == user.password) {
                    UserLoginSuccess(true)
                } else {
                    UserLoginSuccess(false, "Wrong password ou login please try again")
                })
            }
    )

    val disconect = api.public(
            fun(u: User): PublicApiReturn<UserDisconnectReturn> {
                return createResult(UserDisconnectReturn(true))
            }
    )

    val hashPassword = api.private({ u: User -> u.password })
}