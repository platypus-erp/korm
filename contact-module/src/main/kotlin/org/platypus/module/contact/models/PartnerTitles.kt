package org.platypus.module.contact.models

import org.platypus.model.Model

object PartnerTitles : Model<PartnerTitles>("res.partner.title") {
    init {
        name extend {
            l10n = true
            required = true
        }
        unique("name_uniq", "Title name already exists !", name)
    }

    val shortcut = string("shortcut") {
        l10n = true
    }
}