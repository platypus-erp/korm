package org.platypus.module.contact.gen.res.currency.rate

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.data.DataRef
import org.platypus.entity.Record
import org.platypus.module.contact.models.CurrencyRateModel
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

typealias CurrencyRate = Record<CurrencyRateModel>
typealias CurrencyRateRepository = RecordRepository<CurrencyRateModel>
typealias CurrencyRateBag = Bag<CurrencyRateModel>
typealias CurrencyRateData = DataRef<CurrencyRateModel>

val PlatypusEnvironment.currencyRateRepo: CurrencyRateRepository
    get() = RecordRepositoryImpl(this, CurrencyRateModel)
