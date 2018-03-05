package org.platypus.module.contact.views

import org.platypus.module.contact.models.AddressInfos
import org.platypus.ui.form.ModelFormViews
import org.platypus.ui.form.newForm

val ModelFormViews.condensedAddressInfo by AddressInfos.newForm {
    label(label = "Address")
    div {
        field(it.street, placeHolder = "Street...", cssClass = "o_address_street")
        field(it.street2, placeHolder = "Street 2...", cssClass = "o_address_street")
        field(it.city, placeHolder = "City", cssClass = "o_address_city")
        field(it.state, cssClass = "o_address_state", placeHolder = "State", options = """{"no_open": True}""")
        field(it.zip, placeHolder = "ZIP", cssClass = "o_address_zip")
        field(it.country, placeHolder = "Country", cssClass = "o_address_country", options = """{"no_open": True, "no_create": True}""")
    }
}