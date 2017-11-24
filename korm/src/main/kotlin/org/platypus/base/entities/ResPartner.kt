package org.platypus.base.entities

import org.platypus.api.data.DataRef
import org.platypus.api.env.PlatypusEnvironement
import org.platypus.base.models.ResPartnerModel
import org.platypus.impl.korm.entity.stored.EmptyEntity
import org.platypus.impl.korm.entity.stored.RWNamedEntity

//<editor-fold desc="ResPartner">
typealias EmptyResPartner = EmptyEntity<ResPartner, ResPartnerModel>

typealias ResPartnerData = DataRef<ResPartner, ResPartnerModel>

val PlatypusEnvironement.ResPartner: EmptyResPartner
    get() = EmptyEntity(this, ResPartnerModel, { id, env -> ResPartner(id, env) })

class ResPartner(id: Long, env: PlatypusEnvironement) : RWNamedEntity<ResPartner, ResPartnerModel>(id, env, ResPartnerModel, { e: PlatypusEnvironement -> e.ResPartner })
//</editor-fold>