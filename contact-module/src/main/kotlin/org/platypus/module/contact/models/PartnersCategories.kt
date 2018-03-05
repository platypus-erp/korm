package org.platypus.module.contact.models

import org.platypus.model.type.RecursiveStoredModel
import org.platypus.module.contact.entities.PartnerCategory

object PartnersCategories : RecursiveStoredModel<PartnersCategories, PartnerCategory>("res.partner") {
    val color = integer("color")
    val partners = many2many("partners", { partner_to_partner_rel })
    init {
        archived.enable()
    }
}