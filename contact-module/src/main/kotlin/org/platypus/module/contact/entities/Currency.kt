package org.platypus.module.contact.entities

import org.platypus.module.contact.models.Currencies
import java.util.*

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.data.DataRef
import org.platypus.entity.Record
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

typealias Currency = Record<Currencies>
typealias CurrencyRepository = RecordRepository<Currencies>
typealias CurrencyBag = Bag<Currencies>
typealias CurrencyData = DataRef<Currencies>

val PlatypusEnvironment.currencyRepo: CurrencyRepository
    get() = RecordRepositoryImpl(this, Currencies)

var Currency.symbol by Currencies.symbol
var Currency.rate by Currencies.rate
var Currency.rates by Currencies.rates
var Currency.rounding by Currencies.rounding
var Currency.decimalPlaces by Currencies.decimalPlaces
var Currency.position by Currencies.position
var Currency.date by Currencies.date
