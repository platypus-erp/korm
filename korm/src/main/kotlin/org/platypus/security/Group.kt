package org.platypus.security

import org.platypus.Environmentable
import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.bag.toBag
import org.platypus.data.DataRef
import org.platypus.entity.Record
import org.platypus.module.base.models.GroupsData
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

typealias GroupData = Record<GroupsData>
typealias GroupDataRepository = RecordRepository<GroupsData>
typealias GroupDataBag = Bag<GroupsData>
typealias GroupDataData = DataRef<GroupsData>

val PlatypusEnvironment.groupDataRepo: GroupDataRepository
    get() = RecordRepositoryImpl(this, GroupsData)

var GroupData.user by GroupsData.users


class PlatypusGroup(val externalRef: String) {
    fun getData(env: PlatypusEnvironment): GroupData = env.groupDataRepo[externalRef]
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




