package org.platypus.module.contact.models

import org.platypus.model.Model

object CountriesGroup : Model<CountriesGroup>("res.country.group") {
    override val modelName: String = "Country GroupData"

    init {

        name extend {
            required = true
        }
    }

    val countries = many2manyR("countries", { coutry_to_county_group_rel }) {
        label = "Countries"
    }
}