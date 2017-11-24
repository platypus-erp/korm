package org.platypus.base.models

import org.platypus.base.entities.ResCurrency
import org.platypus.base.entities.ResPartner
import org.platypus.impl.korm.model.ModelNamed

object ResPartnerModel : ModelNamed<ResPartnerModel, ResPartner>("res.partner"){
    val supplier = field.boolean("supplier")
}