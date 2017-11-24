package org.platypus.impl.module.product.entities

import org.platypus.api.env.PlatypusEnvironement
import org.platypus.impl.korm.entity.stored.EmptyEntity
import org.platypus.impl.korm.entity.stored.RWNamedEntity
import org.platypus.impl.module.product.models.ProductSupplierInfoModel

//<editor-fold desc="ProductSupplierInfo">
typealias EmptyProductSupplierInfo = EmptyEntity<ProductSupplierInfo, ProductSupplierInfoModel>

val PlatypusEnvironement.ProductSupplierInfo: EmptyProductSupplierInfo
    get() = EmptyEntity(this, ProductSupplierInfoModel, { id, env -> ProductSupplierInfo(id, env) })

class ProductSupplierInfo(id: Long, env: PlatypusEnvironement) : RWNamedEntity<ProductSupplierInfo, ProductSupplierInfoModel>(id, env, ProductSupplierInfoModel, { e: PlatypusEnvironement -> e.ProductSupplierInfo })
//</editor-fold>