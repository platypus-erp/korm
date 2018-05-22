package org.platypus.module.contact.entities

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.data.DataRef
import org.platypus.entity.Record
import org.platypus.module.contact.models.PartnerBanks
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

typealias PartnerBank = Record<PartnerBanks>
typealias PartnerBankRepository = RecordRepository<PartnerBanks>
typealias PartnerBankBag = Bag<PartnerBanks>
typealias PartnerBankData = DataRef<PartnerBanks>

val PlatypusEnvironment.partnerBankRepo: PartnerBankRepository
    get() = RecordRepositoryImpl(this, PartnerBanks)


var PartnerBank.accType by PartnerBanks.accType
var PartnerBank.accNumber by PartnerBanks.accNumber
var PartnerBank.bank by PartnerBanks.bank
var PartnerBank.partner by PartnerBanks.partner
var PartnerBank.sequence by PartnerBanks.sequence
var PartnerBank.currency by PartnerBanks.currency
var PartnerBank.company by PartnerBanks.company
var PartnerBank.sanitized_acc_number by PartnerBanks.sanitizedAccNumber