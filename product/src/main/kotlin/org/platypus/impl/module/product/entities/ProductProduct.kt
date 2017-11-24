package org.platypus.impl.module.product.entities

import org.platypus.api.env.PlatypusEnvironement
import org.platypus.impl.korm.entity.stored.EmptyEntity
import org.platypus.impl.korm.entity.stored.RWNamedEntity
import org.platypus.impl.module.product.models.ProductProductModel

//<editor-fold desc="ProductProduct">
typealias EmptyProductProduct = EmptyEntity<ProductProduct, ProductProductModel>

val PlatypusEnvironement.ProductProduct: EmptyProductProduct
    get() = EmptyEntity(this, ProductProductModel, { id, env -> ProductProduct(id, env) })

class ProductProduct(id: Long, env: PlatypusEnvironement) : RWNamedEntity<ProductProduct, ProductProductModel>(id, env, ProductProductModel, { e: PlatypusEnvironement -> e.ProductProduct })
//</editor-fold>