package org.platypus.module.contact.entities

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.data.DataRef
import org.platypus.entity.Record
import org.platypus.module.contact.models.Partners
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

typealias Partner = Record<Partners>
typealias PartnerRepository = RecordRepository<Partners>
typealias PartnerBag = Bag<Partners>
typealias PartnerData = DataRef<Partners>

val PlatypusEnvironment.partnerRepo: PartnerRepository
    get() = RecordRepositoryImpl(this, Partners)

var Partner.displayName by Partners.displayName
var Partner.title by Partners.title
var Partner.ref by Partners.ref
var Partner.lang by Partners.lang
var Partner.tz by Partners.tz
var Partner.tzOffset by Partners.tzOffset
var Partner.user by Partners.user
var Partner.vat by Partners.vat
val Partner.banks by Partners.banks
var Partner.webSite by Partners.webSite
var Partner.comment by Partners.comment
val Partner.categories by Partners.categories
var Partner.creditLimit by Partners.creditLimit
var Partner.barcode by Partners.barcode
var Partner.customer by Partners.customer
var Partner.vendor by Partners.vendor
var Partner.employee by Partners.employee
var Partner.isCompany by Partners.isCompany
var Partner.function by Partners.function
var Partner.type by Partners.type
var Partner.adresseInfo by Partners.adresseInfo
var Partner.email by Partners.email
var Partner.emailFormated by Partners.emailFormated
var Partner.phone by Partners.phone
var Partner.fax by Partners.fax
var Partner.mobile by Partners.mobile
var Partner.companyType by Partners.companyType
var Partner.company by Partners.company
var Partner.color by Partners.color
var Partner.partnerShare by Partners.partnerShare
var Partner.contactAddress by Partners.contactAddress
var Partner.commercialPartner by Partners.commercialPartner
var Partner.commercialCompanyName by Partners.commercialCompanyName
var Partner.companyName by Partners.companyName
var Partner.image by Partners.image
var Partner.imageMedium by Partners.imageMedium
var Partner.imageSmall by Partners.imageSmall
