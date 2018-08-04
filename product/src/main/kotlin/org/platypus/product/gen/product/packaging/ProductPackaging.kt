package org.platypus.product.gen.product.packaging

import org.platypus.PlatypusEnvironment
import org.platypus.entity.Record
import org.platypus.product.models.ProductPackagingModel
import org.platypus.repository.RecordRepository

typealias ProductPackagingRepository = RecordRepository<ProductPackagingModel>
typealias ProductPackaging = Record<ProductPackagingModel>

val PlatypusEnvironment.ProductPackagingRepo: ProductPackagingRepository
    get() = ProductPackagingModel.newRepo(this)
