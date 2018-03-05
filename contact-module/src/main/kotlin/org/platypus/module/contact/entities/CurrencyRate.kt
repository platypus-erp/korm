package org.platypus.module.contact.entities

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.data.DataRef
import org.platypus.entity.impl.StoredEntity
import org.platypus.module.contact.models.CurrencyRateModel

class CurrencyRate(id: Int, env: PlatypusEnvironment) : StoredEntity<CurrencyRate, CurrencyRateModel>(id, env, CurrencyRateModel, { it.currencyRateRepo })

typealias  CurrencyRateRepository = StoredRepository<CurrencyRate, CurrencyRateModel>
typealias  CurrencyRateBag = Bag<CurrencyRate, CurrencyRateModel>
typealias  CurrencyRateData = DataRef<CurrencyRate, CurrencyRateModel>

val PlatypusEnvironment.currencyRateRepo: CurrencyRateRepository
    get() = CurrencyRateRepository(this, CurrencyRateModel, { id, env -> CurrencyRate(id, env) })