package org.platypus.base.entities

import org.platypus.api.data.DataRef
import org.platypus.api.env.PlatypusEnvironement
import org.platypus.base.models.HasGroupsParam
import org.platypus.base.models.UserLoginSuccess
import org.platypus.base.models.UserModel
import org.platypus.impl.korm.entity.many2many
import org.platypus.impl.korm.entity.many2one
import org.platypus.impl.korm.entity.stored.EmptyEntity
import org.platypus.impl.korm.entity.stored.RWNamedEntity

typealias EmptyUser = EmptyEntity<User, UserModel>
typealias UserData = DataRef<User, UserModel>

val PlatypusEnvironement.User: EmptyUser
    get() = EmptyEntity(this, UserModel, { id, env -> User(id, env) })

class User(id: Long, env: PlatypusEnvironement) : RWNamedEntity<User, UserModel>(id, env, UserModel, { e: PlatypusEnvironement -> e.User })

//User Entity Field
var User.password by UserModel.password
var User.locale by UserModel.locale
val User.groups by UserModel.groups many2many { e -> e.Group }
val User.company by UserModel.company many2one { e -> e.ResCompany }


//User Entity Method
fun User.hasGroup(g: Group): Boolean = UserModel.hasGroup.call(this, g)

fun User.hasGroups(groups: Collection<Group>, all: Boolean = true): Boolean = UserModel.hasGroups.call(this, HasGroupsParam(groups, all))

fun User.login(): UserLoginSuccess = UserModel.login.call(this).result
fun User.hashPassword(): String = UserModel.hashPassword.call(this)