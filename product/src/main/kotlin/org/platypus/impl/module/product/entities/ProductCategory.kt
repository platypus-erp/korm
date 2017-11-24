package org.platypus.impl.module.product.entities

import org.platypus.api.env.PlatypusEnvironement
import org.platypus.impl.korm.entity.stored.EmptyEntity
import org.platypus.impl.korm.entity.stored.HerarchicalRWNamedEntity
import org.platypus.impl.module.product.models.ProductCategoryModel

//<editor-fold desc="ProductCategory">
typealias EmptyProductCategory = EmptyEntity<ProductCategory, ProductCategoryModel>

val PlatypusEnvironement.ProductCategory: EmptyProductCategory
    get() = EmptyEntity(this, ProductCategoryModel, { id, env -> ProductCategory(id, env) })

class ProductCategory(id: Long, env: PlatypusEnvironement) : HerarchicalRWNamedEntity<ProductCategory, ProductCategoryModel>(id, env, ProductCategoryModel, { e: PlatypusEnvironement -> e.ProductCategory })

var ProductCategory.type by ProductCategoryModel.type
var ProductCategory.productCount by ProductCategoryModel.productCount
//</editor-fold>