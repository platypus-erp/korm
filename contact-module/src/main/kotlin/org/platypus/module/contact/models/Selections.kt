package org.platypus.module.contact.models

import org.platypus.entity.PlatypusSelection
import org.platypus.entity.PlatypusSelectionCompanion

class PartnerCompanyType(value: String, label: String) : PlatypusSelection<Partners>(value, label) {
    companion object : PlatypusSelectionCompanion<Partners, PartnerCompanyType>(PartnerCompanyType::class, { v, l -> PartnerCompanyType(v, l) }) {
        val person by "Individual"
        val company by "Company"
    }
}

class PartnerType(value: String, label: String) : PlatypusSelection<Partners>(value, label) {
    companion object : PlatypusSelectionCompanion<Partners, PartnerType>(PartnerType::class, { v, l -> PartnerType(v, l) }) {
        val contact by "Contact"
        val invoice by "Invoice address"
        val delivery by "Shipping address"
        val other by "Other address"

        init {
            _default = contact
        }
    }
}

class CurrencySymbolPosition(value: String, label: String) : PlatypusSelection<Currencies>(value, label) {
    companion object : PlatypusSelectionCompanion<Currencies, CurrencySymbolPosition>(CurrencySymbolPosition::class, { v, l -> CurrencySymbolPosition(v, l) }) {
        val after by "After Amount"
        val before by "Before Amount"

        init {
            _default = after
        }
    }
}