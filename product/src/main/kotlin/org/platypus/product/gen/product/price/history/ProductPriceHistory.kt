package org.platypus.product.gen.product.price.history

import org.platypus.PlatypusEnvironment
import org.platypus.entity.Record
import org.platypus.product.models.ProductPriceHistoryModel
import org.platypus.repository.RecordRepository


//<editor-fold desc="ProductPriceHistory">
typealias ProductPriceHistoryRepo = RecordRepository<ProductPriceHistoryModel>
typealias ProductPriceHistory = Record<ProductPriceHistoryModel>

val PlatypusEnvironment.ProductPriceHistoryRepo: ProductPriceHistoryRepo
    get() = ProductPriceHistoryModel.newRepo(this)
//</editor-fold>