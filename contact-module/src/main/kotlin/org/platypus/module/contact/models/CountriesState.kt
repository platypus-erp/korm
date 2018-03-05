package org.platypus.module.contact.models

import org.platypus.module.contact.entities.CountryState

object CountriesState : StoredModel<CountriesState, CountryState>("res.country.state") {

    init {
        modelLabel = "Country state"
//        TODO order by code
        name extends {
            label = "State Name"
            required = true
            help = "Administrative divisions of a country. E.g. Fed. State, Departement, Canton"
        }
    }

    val country = many2one("country", Countries) {
        label = "Country"
        required = true
        domain = { (code like "sdfj") or ((code inList listOf("TOTO", "TUTU") and name.isNotNull())) }
    }
    val code = string("code") {
        label = "State Code"
        help = "The state code."
        required = true
    }

    init {
        unique("name_code_uniq", "The code of the state must be unique by country !", country, code)
    }
}