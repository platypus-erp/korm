package org.platypus.module.contact.entities

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.data.DataRef
import org.platypus.entity.Record
import org.platypus.module.contact.models.ResCompanies
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

typealias ResCompany = Record<ResCompanies>
typealias ResCompanyRepository = RecordRepository<ResCompanies>
typealias ResCompanyBag = Bag<ResCompanies>
typealias ResCompanyData = DataRef<ResCompanies>

val PlatypusEnvironment.resCompanyRepo: ResCompanyRepository
    get() = RecordRepositoryImpl(this, ResCompanies)


var ResCompany.currency by ResCompanies.currency
var ResCompany.partner by ResCompanies.partner
//var ResCompany.logo by ResCompanies.logo
var ResCompany.logoWeb by ResCompanies.logoWeb
var ResCompany.users by ResCompanies.users
var ResCompany.accountNo by ResCompanies.accountNo
var ResCompany.address by ResCompanies.address
var ResCompany.banks by ResCompanies.banks
var ResCompany.companyRegistry by ResCompanies.companyRegistry
var ResCompany.sequence by ResCompanies.sequence




