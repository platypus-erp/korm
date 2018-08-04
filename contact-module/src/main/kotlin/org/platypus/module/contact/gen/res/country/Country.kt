package org.platypus.module.contact.gen.res.country

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.data.DataRef
import org.platypus.entity.Record
import org.platypus.module.contact.models.Countries
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

typealias Country = Record<Countries>
typealias CountryRepository = RecordRepository<Countries>
typealias CountryBag = Bag<Countries>
typealias CountryData = DataRef<Countries>

val PlatypusEnvironment.countryRepo: CountryRepository
    get() = RecordRepositoryImpl(this, Countries)


var Country.code by Countries.code
var Country.addressFormat by Countries.addressFormat
var Country.currency by Countries.currency
var Country.image by Countries.image
var Country.phoneCode by Countries.phoneCode
val Country.countryGroup by Countries.countryGroup
val Country.states by Countries.states
