package org.platypus.module.base.entities

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
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