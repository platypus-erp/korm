package org.platypus.module.contact.models

import org.platypus.module.contact.entities.AddressInfo

object AddressInfos : StoredModel<AddressInfos, AddressInfo>("adresse.infos") {

    val street = string("street")
    val street2 = string("street2")
    val zip = string("zip")
    val city = string("city")
    val state = many2one("state", CountriesState)
    val country = many2one("country", Countries)
}
