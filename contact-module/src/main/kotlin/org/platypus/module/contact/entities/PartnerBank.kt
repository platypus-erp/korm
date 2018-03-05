package org.platypus.module.contact.entities

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.data.DataRef
import org.platypus.entity.impl.StoredEntity
import org.platypus.bag.relation.link
import org.platypus.module.contact.models.PartnerBanks

class PartnerBank(id: Int, env: PlatypusEnvironment) : StoredEntity<PartnerBank, PartnerBanks>(id, env, PartnerBanks, { it.partnerBankRepo })

typealias PartnerBankRepository = StoredRepository<PartnerBank, PartnerBanks>
typealias PartnerBankBag = Bag<PartnerBank, PartnerBanks>
typealias PartnerBankData = DataRef<PartnerBank, PartnerBanks>

val PlatypusEnvironment.partnerBankRepo: PartnerBankRepository
    get() = PartnerBankRepository(this, PartnerBanks, { id, env -> PartnerBank(id, env) })

var PartnerBank.accType by PartnerBanks.accType
var PartnerBank.accNumber by PartnerBanks.accNumber
var PartnerBank.bank by PartnerBanks.bank link { it.banksRepo }
var PartnerBank.partner by PartnerBanks.partner link { it.partnersRepo }
var PartnerBank.sequence by PartnerBanks.sequence
var PartnerBank.currency by PartnerBanks.currency link { it.currenciesRepo }
var PartnerBank.company by PartnerBanks.company link { it.resCompaniesRepo }
var PartnerBank.sanitized_acc_number by PartnerBanks.sanitizedAccNumber