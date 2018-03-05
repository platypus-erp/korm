package org.platypus.module.contact.models

import org.platypus.module.contact.entities.PartnerBank


object PartnerBanks : StoredModel<PartnerBanks, PartnerBank>("res.partner.bank") {
    val accType = string("acc_type") {
        help = "Bank account type, inferred from account number"
    }
    val accNumber = string("acc_number") {
        required = true
        label = "Account Number"
    }

    val sanitizedAccNumber = string("sanitizedAccNumber") {
        label = "Sanitized Account Number"
        readonly = true
        store = true
    }
    val partner = many2one("partner", Partners)
    val bank = many2one("bank", Banks)
    val sequence = integer("sequence")
    val currency = many2one("currency", Currencies)
    val company = many2one("company", ResCompanies)

    init {
        unique("unique_number", "Account Number must be unique", sanitizedAccNumber, company)
    }

    val computeSanitizedAccNumber = sanitizedAccNumber.onGet {
        sanitize_account_number(it.accNumber!!)
    }

    val computeAccType = accType.onGet {
        "bank"
    }


}