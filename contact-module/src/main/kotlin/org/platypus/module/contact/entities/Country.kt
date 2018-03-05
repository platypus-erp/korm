package org.platypus.module.contact.entities

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.data.DataRef
import org.platypus.entity.impl.StoredEntity
import org.platypus.bag.relation.link
import org.platypus.module.contact.models.Countries

class Country(id: Int, env: PlatypusEnvironment) : StoredEntity<Country, Countries>(id, env, Countries, { it.countriesRepo })

typealias CountryRepository = StoredRepository<Country, Countries>
typealias CountryBag = Bag<Country, Countries>
typealias CountryData = DataRef<Country, Countries>

val PlatypusEnvironment.countriesRepo: CountryRepository
    get() = CountryRepository(this, Countries, { id, env -> Country(id, env) })

var Country.code by Countries.code
var Country.addressFormat by Countries.addressFormat
var Country.currency by Countries.currency link { it.currenciesRepo }
var Country.image by Countries.image
var Country.phoneCode by Countries.phoneCode
val Country.countryGroup by Countries.countryGroup link { it.countriesGroupRepo }
val Country.states by Countries.states link { it.countriesStateRepo }
