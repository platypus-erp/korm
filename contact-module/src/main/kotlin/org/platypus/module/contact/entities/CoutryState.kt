package org.platypus.module.contact.entities

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.data.DataRef
import org.platypus.entity.Record
import org.platypus.module.contact.models.CountriesState
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

typealias CountryState = Record<CountriesState>
typealias CountryStateRepository = RecordRepository<CountriesState>
typealias CountryStateBag = Bag<CountriesState>
typealias CountryStateData = DataRef<CountriesState>

val PlatypusEnvironment.countryStateRepo: CountryStateRepository
    get() = RecordRepositoryImpl(this, CountriesState)

var CountryState.code by CountriesState.code
var CountryState.country by CountriesState.country