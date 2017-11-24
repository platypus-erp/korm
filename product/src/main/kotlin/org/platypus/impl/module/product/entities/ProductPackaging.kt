package org.platypus.impl.module.product.entities

import org.platypus.api.env.PlatypusEnvironement
import org.platypus.impl.korm.entity.stored.EmptyEntity
import org.platypus.impl.korm.entity.stored.RWNamedEntity
import org.platypus.impl.module.product.models.ProductPackagingModel

//<editor-fold desc="ProductPackaging">
typealias EmptyProductPackaging = EmptyEntity<ProductPackaging, ProductPackagingModel>

val PlatypusEnvironement.ProductPackaging: EmptyProductPackaging
    get() = EmptyEntity(this, ProductPackagingModel, { id, env -> ProductPackaging(id, env) })

class ProductPackaging(id: Long, env: PlatypusEnvironement) : RWNamedEntity<ProductPackaging, ProductPackagingModel>(id, env, ProductPackagingModel, { e: PlatypusEnvironement -> e.ProductPackaging })
//</editor-fold>