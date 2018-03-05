package org.platypus.module.contact.models

import org.platypus.module.contact.entities.PartnerTitle

object PartnerTitles : StoredModel<PartnerTitles, PartnerTitle>("partner.title") {
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