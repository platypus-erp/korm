package org.platypus.module.contact.entities

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.data.DataRef
import org.platypus.entity.impl.RecursiveStoredEntity
import org.platypus.bag.relation.link
import org.platypus.module.contact.models.Partners

class Partner(id: Int, env: PlatypusEnvironment) : RecursiveStoredEntity<Partner, Partners>(id, env, Partners, { it.partnersRepo })

typealias PartnerRepository = StoredRepository<Partner, Partners>
typealias PartnerBag = Bag<Partner, Partners>
typealias PartnerData = DataRef<Partner, Partners>

val PlatypusEnvironment.partnersRepo: PartnerRepository
    get() = PartnerRepository(this, Partners, { id, env -> Partner(id, env) })

var Partner.displayName by Partners.displayName
var Partner.title by Partners.title link { it.partnerTitleRepoRepo }
var Partner.ref by Partners.ref
var Partner.lang by Partners.lang link { it.languageRepo }
var Partner.tz by Partners.tz
var Partner.tzOffset by Partners.tzOffset
var Partner.user by Partners.user link { it.users }
var Partner.vat by Partners.vat
val Partner.banks by Partners.banks link { it.partnerBankRepo }
var Partner.webSite by Partners.webSite
var Partner.comment by Partners.comment
val Partner.categories by Partners.categories link { it.partnerCategoriesRepo }
var Partner.creditLimit by Partners.creditLimit
var Partner.barcode by Partners.barcode
var Partner.customer by Partners.customer
var Partner.vendor by Partners.vendor
var Partner.employee by Partners.employee
var Partner.isCompany by Partners.isCompany
var Partner.function by Partners.function
var Partner.type by Partners.type
var Partner.adresseInfo by Partners.adresseInfo link { it.addressInfosRepo }
var Partner.email by Partners.email
var Partner.emailFormated by Partners.emailFormated
var Partner.phone by Partners.phone
var Partner.fax by Partners.fax
var Partner.mobile by Partners.mobile
var Partner.companyType by Partners.companyType
var Partner.company by Partners.company link { it.resCompaniesRepo }
var Partner.color by Partners.color
var Partner.partnerShare by Partners.partnerShare
var Partner.contactAddress by Partners.contactAddress
var Partner.commercialPartner by Partners.commercialPartner link { it.partnersRepo }
var Partner.commercialCompanyName by Partners.commercialCompanyName
var Partner.companyName by Partners.companyName
var Partner.image by Partners.image
var Partner.imageMedium by Partners.imageMedium
var Partner.imageSmall by Partners.imageSmall
