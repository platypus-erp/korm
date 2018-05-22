package org.platypus.module.contact.entities

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.data.DataRef
import org.platypus.entity.Record
import org.platypus.module.contact.models.CountriesGroup
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

typealias CountryGroup = Record<CountriesGroup>
typealias CountryGroupRepository = RecordRepository<CountriesGroup>
typealias CountryGroupBag = Bag<CountriesGroup>
typealias CountryGroupData = DataRef<CountriesGroup>

val PlatypusEnvironment.countryGroupRepo: CountryGroupRepository
    get() = RecordRepositoryImpl(this, CountriesGroup)


val CountryGroup.countries by CountriesGroup.countries