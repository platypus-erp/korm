package org.platypus.impl.module.product.entities

import org.platypus.api.env.PlatypusEnvironement
import org.platypus.impl.korm.entity.stored.EmptyEntity
import org.platypus.impl.korm.entity.stored.RWNamedEntity
import org.platypus.impl.module.product.models.ProductPriceHistoryModel

//<editor-fold desc="ProductPriceHistory">
typealias EmptyProductPriceHistory = EmptyEntity<ProductPriceHistory, ProductPriceHistoryModel>

val PlatypusEnvironement.ProductPriceHistory: EmptyProductPriceHistory
    get() = EmptyEntity(this, ProductPriceHistoryModel, { id, env -> ProductPriceHistory(id, env) })

class ProductPriceHistory(id: Long, env: PlatypusEnvironement) : RWNamedEntity<ProductPriceHistory, ProductPriceHistoryModel>(id, env, ProductPriceHistoryModel, { e: PlatypusEnvironement -> e.ProductPriceHistory })
//</editor-fold>