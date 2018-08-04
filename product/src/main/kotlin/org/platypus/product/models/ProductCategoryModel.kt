package org.platypus.product.models

import org.platypus.entity.Selection
import org.platypus.model.Model
import org.platypus.orm.ReferenceOption
import org.platypus.product.models.ProductCategoryType.getValue


object ProductCategoryType : Selection<ProductCategoryType>()

val ProductCategoryType.view by "View"
val ProductCategoryType.normal by "Normal"


object ProductCategoryModel : Model<ProductCategoryModel>("product.category") {
    override val modelHelp = "Product Category"

    //    TODO _parent_name = "parent_id"
//    TODO _parent_store = True
//    TODO _parent_order = 'fieldName'
//    TODO _order = 'parent_left'
    init {
        name extend {
            index = true
            required = true
            l10n = true
        }
    }

    val parent = many2one("parent", ProductCategoryModel) {
        label = "Parent Category"
        index = true
        onDelete = ReferenceOption.CASCADE
    }

    val children = one2many("children", { ProductCategoryModel.parent }) {
        label = "Child Categories"
    }
    val type = selection("type", selection = ProductCategoryType) {
        help = "A category of the view type is a virtual category that can be used as the parent of another category to create a hierarchical structure."
    }

    val productCount = integer("productCount") {
        label = "# Products"
        help = "The number of products under this category (Does not consider the children categories)"
    }

//    val t = api.compute {
//        it.env.
//    }

    //TODO but before read group :-)
//    val computeProductCount = api.compute(productCount) {
//                it.env.ProductTemplate.search({ProductTemplateModel.category})
//        PublicApiReturn()
//    }

//    TODO convert to api.constraint ? or automatique on hierarchique Model ?
//    val checkCategoryRecursion = api.private(
//        fun(self: ProductCategory) {
//            if (self.checkRecursoin()){
//                throw UserError("Error ! You cannot create recursive categories.")
//            }
//        }
//    )
}