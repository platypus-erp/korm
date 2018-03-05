package org.platypus.module.contact.entities

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.data.DataRef
import org.platypus.entity.impl.StoredEntity
import org.platypus.bag.relation.link
import org.platypus.module.contact.models.AddressInfos

class AddressInfo(id: Int, env: PlatypusEnvironment) : StoredEntity<AddressInfo, AddressInfos>(id, env, AddressInfos, { it.addressInfosRepo })

typealias AddressInfoRepository = StoredRepository<AddressInfo, AddressInfos>
typealias AddressInfoBag = Bag<AddressInfo, AddressInfos>
typealias AddressInfoData = DataRef<AddressInfo, AddressInfos>

val PlatypusEnvironment.addressInfosRepo: AddressInfoRepository
    get() = AddressInfoRepository(this, AddressInfos, { id, env -> AddressInfo(id, env) })

var AddressInfo.street by AddressInfos.street
var AddressInfo.street2 by AddressInfos.street2
var AddressInfo.zip by AddressInfos.zip
var AddressInfo.city by AddressInfos.city
var AddressInfo.state by AddressInfos.state link { it.countriesStateRepo }
var AddressInfo.country by AddressInfos.country link { it.countriesRepo }
