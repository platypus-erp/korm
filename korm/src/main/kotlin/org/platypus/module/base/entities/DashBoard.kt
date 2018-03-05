package org.platypus.module.base.entities

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.data.DataRef
import org.platypus.entity.Record
import org.platypus.module.base.models.DashBoardModel
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

typealias  DashBoard = Record<DashBoardModel>
typealias  DashBoardRepository = RecordRepository<DashBoardModel>
typealias  DashBoardBag = Bag<DashBoardModel>
typealias  DashBoardData = DataRef<DashBoardModel>

val PlatypusEnvironment.dashboardRepo: DashBoardRepository
    get() = RecordRepositoryImpl(this, DashBoardModel)