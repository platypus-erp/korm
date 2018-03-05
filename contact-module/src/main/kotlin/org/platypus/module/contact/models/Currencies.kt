package org.platypus.module.contact.models

import org.platypus.module.contact.entities.Currency

object Currencies : StoredModel<Currencies, Currency>("res.currency") {
    init {
        archived.enable()
    }

    val symbol = string("symbol") {
        help = "Currency sign, to be used when printing amounts."
        required = true
        minSize = 1
    }
    val rate = decimal("rate") {
        label = "Current Rate"
        help = "The rate of the currency to the currency of rate 1."
    }
    val rates = one2many("rates", { CurrencyRateModel.currency }) {
        label = "Rates"
    }

    val rounding = decimal("rounding") {
        default = 0.01F.toBigDecimal()
    }

    val decimalPlaces = integer("decimalPlaces")

    val position = selection("position", CurrencySymbolPosition) {
        label = "Symbol Position"
        help = "Determines where the currency symbol should be placed after or before the amount."
    }

    val date = date("date")

    init {
        unique("unique_name", "The currency code must be unique!", name)
    }

    val compute_current_rate = rate.onGet {
        TODO()
    }

    val compute_decimal_places = decimalPlaces.onGet {
        TODO()
    }

    val compute_date = date.onGet {
        TODO()
    }
}