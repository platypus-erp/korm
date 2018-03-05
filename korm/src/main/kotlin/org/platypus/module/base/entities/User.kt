package org.platypus.module.base.entities

import org.platypus.PlatypusEnvironment
import org.platypus.data.DataRef
import org.platypus.entity.Record
import org.platypus.module.base.models.HasGroupsParam
import org.platypus.module.base.models.UserLoginSuccess
import org.platypus.module.base.models.Users
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

typealias UserRepository = RecordRepository<Users>
typealias UserData = DataRef<Users>
typealias User = Record<Users>

val PlatypusEnvironment.users: UserRepository
    get() = RecordRepositoryImpl(this, Users)

//User Entity IModelField
var User.password by Users.password
var User.locale by Users.locale
var User.groups by Users.groups


//User Entity Method
fun User.hasGroup(g: Group): Boolean = Users.hasGroup.call(this, g)

fun User.hasGroups(groups: Collection<Group>, all: Boolean = true): Boolean = Users.hasGroups.call(this, HasGroupsParam(groups, all))

fun User.login(): UserLoginSuccess = Users.login.call(this).result
fun User.hashPassword(): String? = Users.hashPassword.call(this)