package org.platypus.impl.module.product.entities

import org.platypus.api.env.PlatypusEnvironement
import org.platypus.impl.korm.entity.stored.EmptyEntity
import org.platypus.impl.korm.entity.stored.RWNamedEntity
import org.platypus.impl.module.product.models.ProductTemplateModel

//<editor-fold desc="ProductTemplate">
typealias EmptyProductTemplate = EmptyEntity<ProductTemplate, ProductTemplateModel>

val PlatypusEnvironement.ProductTemplate: EmptyProductTemplate
    get() = EmptyEntity(this, ProductTemplateModel, { id, env -> ProductTemplate(id, env) })

class ProductTemplate(id: Long, env: PlatypusEnvironement) : RWNamedEntity<ProductTemplate, ProductTemplateModel>(id, env, ProductTemplateModel, { e: PlatypusEnvironement -> e.ProductTemplate })
//</editor-fold>