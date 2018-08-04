package org.platypus.product.gen.product.category

import org.platypus.PlatypusEnvironment
import org.platypus.entity.Record
import org.platypus.product.models.ProductCategoryModel
import org.platypus.repository.RecordRepository

//<editor-fold desc="ProductCategory">
typealias ProductCategoryRepository  = RecordRepository<ProductCategoryModel>
typealias ProductCategory  = Record<ProductCategoryModel>



val PlatypusEnvironment.ProductCategory: ProductCategoryRepository
    get() = ProductCategoryModel.newRepo(this)


var ProductCategory.type by ProductCategoryModel.type
var ProductCategory.productCount by ProductCategoryModel.productCount
//</editor-fold>