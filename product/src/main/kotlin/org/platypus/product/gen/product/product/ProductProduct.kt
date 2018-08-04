package org.platypus.product.gen.product.product

import org.platypus.PlatypusEnvironment
import org.platypus.entity.Record
import org.platypus.product.models.ProductProductModel
import org.platypus.repository.RecordRepository

typealias ProductProductRepository = RecordRepository<ProductProductModel>
typealias ProductProduct = Record<ProductProductModel>

val PlatypusEnvironment.ProductProduct: ProductProductRepository
    get() = ProductProductModel.newRepo(this)