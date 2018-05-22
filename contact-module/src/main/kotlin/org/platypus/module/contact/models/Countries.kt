package org.platypus.module.contact.models

import org.platypus.model.Model
import org.platypus.model.field.constraints.maxSize
import org.platypus.module.contact.entities.Country

object Countries : Model<Countries>("res.country") {
    val code = string("code") {
        label = "Country Code"
        help = "The ISO2 country code in two chars. \nYou can use this field for quick search."
        maxSize = 2
        required = true
        readonly = true
    }

    val addressFormat = string("addressFormat") {
        help = """|You can state here the usual format to use for the
                  |addresses belonging to this country.
                  |You can use the python-style string pattern with all the field of the address
                  |(for example, use '%(street)s' to display the field 'street') plus
                  |%(state_name)s: the name of the state
                  |%(state_code)s: the code of the state
                  |%(country_name)s: the name of the country
                  |%(country_code)s: the code of the country""".trimMargin()
    }
    val currency = many2one("currency", Currencies) {
        label = "Currency"
    }

    val image = binary("image") {
        attachement = true
    }

    val phoneCode = string("phoneCode")

    val countryGroup = many2many("countryGroup", { coutry_to_county_group_rel })

    val states = one2many("states", { CountriesState.country })

    init {
        unique("name_uniq", "The name of the country must be unique !", name)
        unique("code_uniq", "The code of the country must be unique !", code)

    }

}