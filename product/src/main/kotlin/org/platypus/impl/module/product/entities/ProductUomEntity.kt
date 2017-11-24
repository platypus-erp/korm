package org.platypus.impl.module.product.entities

import org.platypus.api.env.PlatypusEnvironement
import org.platypus.base.EmptyUser
import org.platypus.impl.korm.entity.many2one
import org.platypus.impl.korm.entity.stored.EmptyEntity
import org.platypus.impl.korm.entity.stored.RWNamedEntity
import org.platypus.impl.module.product.models.ProductUomCategoryModel
import org.platypus.impl.module.product.models.ProductUomModel

//<editor-fold desc="ProductUomCategory">
typealias EmptyProductUomCategory = EmptyEntity<ProductUomCategory, ProductUomCategoryModel>

val PlatypusEnvironement.ProductUomCategory: EmptyProductUomCategory
    get() = EmptyEntity(this, ProductUomCategoryModel, { id, env -> ProductUomCategory(id, env) })

class ProductUomCategory(id: Long, env: PlatypusEnvironement) : RWNamedEntity<ProductUomCategory, ProductUomCategoryModel>(id, env, ProductUomCategoryModel, { e: PlatypusEnvironement -> e.ProductUomCategory })
//</editor-fold>

//<editor-fold desc="ProductUom">
typealias EmptyProductUom = EmptyEntity<ProductUom, ProductUomModel>

val PlatypusEnvironement.ProductUom: EmptyProductUom
    get() = EmptyEntity(this, ProductUomModel, { id, env -> ProductUom(id, env) })

class ProductUom(id: Long, env: PlatypusEnvironement) : RWNamedEntity<ProductUom, ProductUomModel>(id, env, ProductUomModel, { e: PlatypusEnvironement -> e.ProductUom })

var ProductUom.category by ProductUomModel.category many2one {e -> e.ProductUomCategory}
var ProductUom.factor by ProductUomModel.factor
var ProductUom.factor_inv by ProductUomModel.factor_inv
var ProductUom.rounding by ProductUomModel.rounding
var ProductUom.uomType by ProductUomModel.uomType
//</editor-fold>

