package org.platypus.product.gen.product.supplierinfo

import org.platypus.PlatypusEnvironment
import org.platypus.entity.Record
import org.platypus.product.models.ProductSupplierInfoModel
import org.platypus.repository.RecordRepository

typealias ProductSupplierInfoRepository = RecordRepository<ProductSupplierInfoModel>
typealias ProductSupplierInfo = Record<ProductSupplierInfoModel>

val PlatypusEnvironment.ProductSupplierInfo: ProductSupplierInfoRepository
    get() = ProductSupplierInfoModel.newRepo(this)