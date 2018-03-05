package org.platypus.module.contact.entities

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.data.DataRef
import org.platypus.entity.impl.StoredEntity
import org.platypus.bag.relation.link
import org.platypus.module.contact.models.CountriesState

class CountryState(id: Int, env: PlatypusEnvironment) : StoredEntity<CountryState, CountriesState>(id, env, CountriesState, { it.countriesStateRepo })

typealias CountryStateRepository = StoredRepository<CountryState, CountriesState>
typealias CountryStateBag = Bag<CountryState, CountriesState>
typealias CountryStateData = DataRef<CountryState, CountriesState>

val PlatypusEnvironment.countriesStateRepo: CountryStateRepository
    get() = CountryStateRepository(this, CountriesState, { id, env -> CountryState(id, env) })

var CountryState.code by CountriesState.code
var CountryState.country by CountriesState.country link { it.countriesRepo }