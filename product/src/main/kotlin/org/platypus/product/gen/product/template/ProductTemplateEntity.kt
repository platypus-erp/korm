package org.platypus.product.gen.product.template

import org.platypus.PlatypusEnvironment
import org.platypus.entity.Record
import org.platypus.product.models.ProductTemplateModel
import org.platypus.repository.RecordRepository

//<editor-fold desc="ProductTemplate">
typealias ProductTemplateRepository = RecordRepository<ProductTemplateModel>

typealias ProductTemplate = Record<ProductTemplateModel>

val PlatypusEnvironment.ProductTemplate: ProductTemplateRepository
    get() = ProductTemplateModel.newRepo(this)
