package org.platypus.module.contact.models

import org.platypus.model.Model

object PartnerTitles : Model<PartnerTitles>("partner.title") {
    init {
        name extends {
            l10n = true
            required = true
        }
        unique("name_uniq", "Title name already exists !", name)
    }

    val shortcut = string("shortcut") {
        l10n = true
    }
}