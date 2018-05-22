package org.platypus.module.contact.models

import org.platypus.model.Model

object ResCompanies : Model<ResCompanies>("res.company") {

    val parent = many2one("parent", ResCompanies)
    val currency = many2one("currency", target = Currencies)
    val partner = many2one("partner", Partners) {
        label = "Partner"
        required = true
    }

    val logo = partner.related { image }
    val logoWeb = binary("logoWeb") {
        store = true
    }

    val users = many2manyR("users", { user_to_company_rel }) {
        label = "Accepted Users"
    }

    val accountNo = string("accountNo") {
        label = "Account No."
    }
    val address = many2one("address", AddressInfos)

    val banks = one2many("banks", { Banks.company }) {
        label = "Bank Accounts"
        help = "Bank accounts related to this company"
    }

    val email = partner.related(store = true) { email }
    val phone = partner.related(store = true) { phone }
    val webSite = partner.related { webSite }
    val vat = partner.related(label = "Tax ID") { vat }

    val companyRegistry = string("companyRegistry")
    val sequence = integer("sequence") {
        help = "Used to order Companies in the company switcher"
        default = 10
    }

    init {
        unique("name_uniq", "The company name must be unique !", name)
    }
}