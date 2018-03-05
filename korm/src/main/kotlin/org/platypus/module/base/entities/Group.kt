package org.platypus.module.base.entities

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.data.DataRef
import org.platypus.entity.Record
import org.platypus.module.base.models.Groups
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

typealias GroupRepository = RecordRepository<Groups>
typealias GroupBag = Bag<Groups>
typealias GroupData = DataRef<Groups>
typealias Group = Record<Groups>

val PlatypusEnvironment.groupsRepo: GroupRepository
    get() = RecordRepositoryImpl(this, Groups)

