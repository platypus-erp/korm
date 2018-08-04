package org.platypus.product.gen.product.uom.categ

import org.platypus.PlatypusEnvironment
import org.platypus.entity.Record
import org.platypus.product.models.ProductUomCategoryModel
import org.platypus.repository.RecordRepository

typealias ProductUomCategoryRepository = RecordRepository<ProductUomCategoryModel>
typealias ProductUomCategory = Record<ProductUomCategoryModel>

val PlatypusEnvironment.ProductUomCategory: ProductUomCategoryRepository
    get() = ProductUomCategoryModel.newRepo(this)