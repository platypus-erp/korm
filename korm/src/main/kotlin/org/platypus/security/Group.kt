package org.platypus.security

import org.platypus.Environmentable
import org.platypus.PLATYPUS_ROOT_GROUP_REF
import org.platypus.PlatypusEnvironment
import org.platypus.bag.toBag
import org.platypus.module.base.entities.GroupData
import org.platypus.module.base.entities.GroupDataBag
import org.platypus.module.base.entities.groupDataRepo
import org.platypus.module.base.entities.user

val ROOT_GROUP = PlatypusGroup(PLATYPUS_ROOT_GROUP_REF)

class PlatypusGroup(val externalRef: String) {
    fun getData(env: PlatypusEnvironment): GroupData = env.groupDataRepo.byRef(externalRef, true)
    val users
        get() = internalUsers
    internal var internalUsers: Set<PlatypusUser> = emptySet()
}


fun GroupDataBag.toSetPlatypusGroup(): Set<PlatypusGroup> = this.map { PlatypusGroup(it.externalRef!!) }.toSet()


class PlatypusGroupBuilderData(override val env: PlatypusEnvironment, val group: PlatypusGroup) : Environmentable {
    val current
        get() = group.getData(env)
}

var PlatypusGroupBuilderData.users: Set<PlatypusUser>
    get() = group.users
    set(value) {
        value.forEach { it.internalGroups += group }
        group.internalUsers += value
        current.user = value.map { it.getData(env) }.toBag()
    }


var PlatypusGroupBuilderData.name: String?
    get() = current.name
    set(value) {
        current.name
    }




