package org.platypus.module.contact.models

import org.platypus.entity.Selection
import org.platypus.module.contact.models.CurrencySymbolPosition.getValue
import org.platypus.module.contact.models.PartnerCompanyType.getValue
import org.platypus.module.contact.models.PartnerType.getValue

object PartnerCompanyType : Selection<PartnerCompanyType>()

val PartnerCompanyType.person by "Individual"
val PartnerCompanyType.company by "Company"

object PartnerType : Selection<PartnerType>()

val PartnerType.contact by "Contact"
val PartnerType.invoice by "Invoice address"
val PartnerType.delivery by "Shipping address"
val PartnerType.other by "Other address"

object CurrencySymbolPosition : Selection<CurrencySymbolPosition>()

val CurrencySymbolPosition.after by "After Amount"
val CurrencySymbolPosition.before by "Before Amount"