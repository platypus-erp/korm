package org.platypus.module.contact.models

import org.platypus.model.Model

object CountriesGroup : Model<CountriesGroup>("res.country.group") {
    init {
        modelLabel = "Country GroupData"
        name extends {
            required = true
        }
    }

    val countries = many2manyR("countries", { coutry_to_county_group_rel }) {
        label = "Countries"
    }
}