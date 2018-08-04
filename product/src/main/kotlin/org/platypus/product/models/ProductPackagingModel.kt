package org.platypus.product.models

import org.platypus.model.Model

object ProductPackagingModel : Model<ProductPackagingModel>("product.packaging") {
    override val modelHelp: String = "Packaging"

    init {
        name.extend {
            label = "Packaging Type"
            required = true
        }
    }

    val sequence = integer("sequence") {
        default = 1
        help = "The first in the sequence is the default one."
    }

    val productTemplate = many2one("productTemplate", ProductTemplateModel) {
        label = "Product"
    }
    val qty = decimal("qty") {
        label = "Quantity per Package"
        help = "The total number of products you can have per pallet or box."
    }
}