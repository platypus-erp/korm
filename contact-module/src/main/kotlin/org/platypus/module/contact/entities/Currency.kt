package org.platypus.module.contact.entities

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.data.DataRef
import org.platypus.entity.impl.StoredEntity
import org.platypus.bag.relation.link
import org.platypus.module.contact.models.Currencies

class Currency(id: Int, env: PlatypusEnvironment) : StoredEntity<Currency, Currencies>(id, env, Currencies, { it.currenciesRepo })

typealias CurrencyRepository = StoredRepository<Currency, Currencies>
typealias CurrencyBag = Bag<Currency, Currencies>
typealias CurrencyData = DataRef<Currency, Currencies>

val PlatypusEnvironment.currenciesRepo: CurrencyRepository
    get() = CurrencyRepository(this, Currencies, { id, env -> Currency(id, env) })

var Currency.symbol by Currencies.symbol
var Currency.rate by Currencies.rate
var Currency.rates by Currencies.rates link { it.currencyRateRepo }
var Currency.rounding by Currencies.rounding
var Currency.decimalPlaces by Currencies.decimalPlaces
var Currency.position by Currencies.position
var Currency.date by Currencies.date
