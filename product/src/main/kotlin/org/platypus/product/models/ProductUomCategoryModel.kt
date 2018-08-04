package org.platypus.product.models

import org.platypus.model.Model

object ProductUomCategoryModel : Model<ProductUomCategoryModel>("product.uom.categ") {
    override val modelHelp: String = "Product UoM Categories"

    init {
        name extend {
            label = "Name"
            required = true
            l10n = true
        }
    }
}