package org.platypus.module.contact.models

import org.platypus.model.Model

object PartnersCategories : Model<PartnersCategories>("res.partner.category") {
    val color = integer("color")
    val partners = many2many("partners", { partner_to_partner_rel })
    val parent = many2one("parent", PartnersCategories)
    init {
        archived.enable()
    }
}