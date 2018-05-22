package org.platypus.module.contact.entities

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.data.DataRef
import org.platypus.entity.Record
import org.platypus.module.contact.models.Banks
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

typealias Bank = Record<Banks>
typealias BankRepository = RecordRepository<Banks>
typealias BankBag = Bag<Banks>
typealias BankData = DataRef<Banks>

val PlatypusEnvironment.bankRepo: BankRepository
    get() = RecordRepositoryImpl(this, Banks)

var Bank.bic by Banks.bic
var Bank.email by Banks.email
var Bank.phone by Banks.phone
var Bank.fax by Banks.fax