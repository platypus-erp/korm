package org.platypus.module.contact.entities

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.data.DataRef
import org.platypus.entity.impl.RecursiveStoredEntity
import org.platypus.bag.relation.link
import org.platypus.module.contact.models.ResCompanies

class ResCompany(id: Int, env: PlatypusEnvironment) : RecursiveStoredEntity<ResCompany, ResCompanies>(id, env, ResCompanies, { it.resCompaniesRepo })

typealias ResCompanyRepository = StoredRepository<ResCompany, ResCompanies>
typealias ResCompanyBag = Bag<ResCompany, ResCompanies>
typealias ResCompanyData = DataRef<ResCompany, ResCompanies>

val PlatypusEnvironment.resCompaniesRepo: ResCompanyRepository
    get() = ResCompanyRepository(this, ResCompanies, { id, env -> ResCompany(id, env) })

var ResCompany.currency by ResCompanies.currency link { it.currenciesRepo }
var ResCompany.partner by ResCompanies.partner link { it.partnersRepo }
//var ResCompany.logo by ResCompanies.logo
var ResCompany.logoWeb by ResCompanies.logoWeb
var ResCompany.users by ResCompanies.users link { it.users }
var ResCompany.accountNo by ResCompanies.accountNo
var ResCompany.address by ResCompanies.address link { it.addressInfosRepo }
var ResCompany.banks by ResCompanies.banks link { it.banksRepo }
var ResCompany.companyRegistry by ResCompanies.companyRegistry
var ResCompany.sequence by ResCompanies.sequence
