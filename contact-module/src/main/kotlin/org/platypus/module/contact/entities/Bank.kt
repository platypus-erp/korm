package org.platypus.module.contact.entities

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.data.DataRef
import org.platypus.entity.impl.StoredEntity
import org.platypus.module.contact.models.Banks
import org.platypus.ui.ModelViews

class Bank(id: Int, env: PlatypusEnvironment) : StoredEntity<Bank, Banks>(id, env, Banks, { it.banksRepo })

typealias BankRepository = StoredRepository<Bank, Banks>
typealias BankBag = Bag<Bank, Banks>
typealias BankData = DataRef<Bank, Banks>
typealias BankViews = ModelViews<Bank, Banks>

val PlatypusEnvironment.banksRepo: BankRepository
    get() = BankRepository(this, Banks, { id, env -> Bank(id, env) })

var Bank.bic by Banks.bic
var Bank.email by Banks.email
var Bank.phone by Banks.phone
var Bank.fax by Banks.fax