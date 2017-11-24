package org.platypus.base.models

import org.platypus.base.entities.ResCurrency
import org.platypus.impl.korm.model.ModelNamed

object ResCurrencyModel : ModelNamed<ResCurrencyModel, ResCurrency>("res.currency"){
    val currency = field.many2one("currency", target = ResCurrencyModel)
}
