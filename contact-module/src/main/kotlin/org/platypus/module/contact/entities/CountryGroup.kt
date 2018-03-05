package org.platypus.module.contact.entities

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.data.DataRef
import org.platypus.entity.impl.StoredEntity
import org.platypus.bag.relation.link
import org.platypus.module.contact.models.CountriesGroup

class CountryGroup(id: Int, env: PlatypusEnvironment) : StoredEntity<CountryGroup, CountriesGroup>(id, env, CountriesGroup, { it.countriesGroupRepo })

typealias CountryGroupRepository = StoredRepository<CountryGroup, CountriesGroup>
typealias CountryGroupBag = Bag<CountryGroup, CountriesGroup>
typealias CountryGroupData = DataRef<CountryGroup, CountriesGroup>

val PlatypusEnvironment.countriesGroupRepo: CountryGroupRepository
    get() = CountryGroupRepository(this, CountriesGroup, { id, env -> CountryGroup(id, env) })

val CountryGroup.countries by CountriesGroup.countries link { it.countriesRepo }