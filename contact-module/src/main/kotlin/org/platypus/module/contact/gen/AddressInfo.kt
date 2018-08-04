package org.platypus.module.contact.gen

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.data.DataRef
import org.platypus.entity.Record
import org.platypus.module.contact.models.AddressInfos
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

typealias AddressInfo = Record<AddressInfos>
typealias AddressInfoRepository = RecordRepository<AddressInfos>
typealias AddressInfoBag = Bag<AddressInfos>
typealias AddressInfoData = DataRef<AddressInfos>

val PlatypusEnvironment.addressInfoRepo: AddressInfoRepository
    get() = RecordRepositoryImpl(this, AddressInfos)


var AddressInfo.street by AddressInfos.street
var AddressInfo.street2 by AddressInfos.street2
var AddressInfo.zip by AddressInfos.zip
var AddressInfo.city by AddressInfos.city
var AddressInfo.state by AddressInfos.state
var AddressInfo.country by AddressInfos.country
