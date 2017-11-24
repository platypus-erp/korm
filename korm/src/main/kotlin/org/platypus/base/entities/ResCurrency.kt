package org.platypus.base.entities

import org.platypus.api.data.DataRef
import org.platypus.api.env.PlatypusEnvironement
import org.platypus.base.models.ResCurrencyModel
import org.platypus.impl.korm.entity.stored.EmptyEntity
import org.platypus.impl.korm.entity.stored.RWNamedEntity

//<editor-fold desc="ResCurrency">
typealias EmptyResCurrency = EmptyEntity<ResCurrency, ResCurrencyModel>

typealias ResCurrencyData = DataRef<ResCurrency, ResCurrencyModel>

val PlatypusEnvironement.ResCurrency: EmptyResCurrency
    get() = EmptyEntity(this, ResCurrencyModel, { id, env -> ResCurrency(id, env) })

class ResCurrency(id: Long, env: PlatypusEnvironement) : RWNamedEntity<ResCurrency, ResCurrencyModel>(id, env, ResCurrencyModel, { e: PlatypusEnvironement -> e.ResCurrency })
//</editor-fold>