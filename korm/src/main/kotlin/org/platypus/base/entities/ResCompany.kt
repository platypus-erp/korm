package org.platypus.base.entities

import org.platypus.api.data.DataRef
import org.platypus.api.env.PlatypusEnvironement
import org.platypus.base.models.ResCompanyModel
import org.platypus.impl.korm.entity.stored.EmptyEntity
import org.platypus.impl.korm.entity.stored.RWNamedEntity

//<editor-fold desc="ResCompany">
typealias EmptyResCompany = EmptyEntity<ResCompany, ResCompanyModel>
typealias ResCompanyData = DataRef<ResCompany, ResCompanyModel>

val PlatypusEnvironement.ResCompany: EmptyResCompany
    get() = EmptyEntity(this, ResCompanyModel, { id, env -> ResCompany(id, env) })

class ResCompany(id: Long, env: PlatypusEnvironement) : RWNamedEntity<ResCompany, ResCompanyModel>(id, env, ResCompanyModel, { e: PlatypusEnvironement -> e.ResCompany })
val ResCompany.currency by ResCurrencyModel.currency many2one {e -> e.ResCurrency}
//</editor-fold>