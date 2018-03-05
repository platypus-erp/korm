package org.platypus.impl.module.product.models

import org.platypus.impl.korm.model.ModelNamed
import org.platypus.impl.korm.model.property.KormProperty
import org.platypus.impl.orm.sql.intLiteral
import org.platypus.impl.module.product.entities.ProductPackaging

object ProductPackagingModel : ModelNamed<ProductPackagingModel, ProductPackaging>("product.packaging") {
    override val modelHelp: String
        get() = "Packaging"

    override val order
        get() = sequence

    init {
        name.extend(label = "Packaging Type", required = true)
    }

    val sequence = field.integer("sequence", defaultValue = intLiteral(1),
        help = "The first in the sequence is the default one.")

    val productTemplate = field.many2one("productTemplate", label = "Product", target = ProductTemplateModel)
    val qty = field.decimal("qty", label = "Quantity per Package",
        help = "The total number of products you can have per pallet or box.")
}