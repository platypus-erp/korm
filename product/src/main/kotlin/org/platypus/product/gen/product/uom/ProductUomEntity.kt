package org.platypus.product.gen.product.uom

import org.platypus.PlatypusEnvironment
import org.platypus.entity.Record
import org.platypus.product.models.ProductUomModel
import org.platypus.repository.RecordRepository


typealias EmptyProductUomRepository = RecordRepository<ProductUomModel>
typealias ProductUom = Record<ProductUomModel>

val PlatypusEnvironment.ProductUom: EmptyProductUomRepository
    get() = ProductUomModel.newRepo(this)


var ProductUom.category by ProductUomModel.category
var ProductUom.factor by ProductUomModel.factor
var ProductUom.factor_inv by ProductUomModel.factor_inv
var ProductUom.rounding by ProductUomModel.rounding
var ProductUom.uomType by ProductUomModel.uomType

