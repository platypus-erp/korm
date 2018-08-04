package org.platypus.module.contact.models

import org.platypus.model.Model

object CountriesState : Model<CountriesState>("res.country.state") {
    override val modelName: String = "Country state"

    init {
//        TODO order by code
        name extend {
            label = "State Name"
            required = true
            help = "Administrative divisions of a country. E.g. Fed. State, Departement, Canton"
        }
    }

    val country = many2one("country", Countries) {
        label = "Country"
        required = true
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