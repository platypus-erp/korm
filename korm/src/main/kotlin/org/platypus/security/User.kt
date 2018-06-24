package org.platypus.security

import org.platypus.Environmentable
import org.platypus.PLATYPUS_ROOT_USER_REF
import org.platypus.PlatypusEnvironment
import org.platypus.bag.toBag
import org.platypus.module.base.entities.User
import org.platypus.module.base.entities.UserBag
import org.platypus.module.base.entities.groups
import org.platypus.module.base.entities.users


val ROOT_USER = PlatypusUser(PLATYPUS_ROOT_USER_REF)
class NoExternalRefToCreatePlatypusUser : IllegalStateException()
class NoExternalRefToCreatePlatypusGroup : IllegalStateException()

fun UserBag.toSetPlatypusUser(): Set<PlatypusUser> = this.map { it.toPlatypusUser() }.toSet()
fun User.toPlatypusUser(): PlatypusUser = PlatypusUser(this.externalRef ?: throw NoExternalRefToCreatePlatypusUser())

class PlatypusUser(val externalRef: String) {
    val groups
        get() = internalGroups
    internal var internalGroups: Set<PlatypusGroup> = emptySet()
    fun getData(env: PlatypusEnvironment): User = env.users.byRef(externalRef, true)
}

class PlatypusUserBuilderData(override val env: PlatypusEnvironment, val user: PlatypusUser) : Environmentable {
    val current
        get() = user.getData(env)
}

var PlatypusUserBuilderData.groups: Set<PlatypusGroup>
    get() = user.groups
    set(value) {
        value.forEach { it.internalUsers += user }
        user.internalGroups += value
        current.groups = value.map { it.getData(env) }.toBag()
    }

var PlatypusUserBuilderData.name: String?
    get() = current.name
    set(value) {
        current.name
    }