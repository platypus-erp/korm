package org.platypus.module.contact.models

import org.platypus.model.Model

object AddressInfos : Model<AddressInfos>("adresse.infos") {

    val street = string("street")
    val street2 = string("street2")
    val zip = string("zip")
    val city = string("city")
    val state = many2one("state", CountriesState)
    val country = many2one("country", Countries)
}
