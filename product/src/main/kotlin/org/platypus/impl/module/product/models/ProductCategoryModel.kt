package org.platypus.impl.module.product.models

import org.platypus.entity.PlatypusSelection
import org.platypus.entity.PlatypusSelectionCompanion
import org.platypus.impl.korm.model.HierarchyModel
import org.platypus.impl.korm.model.ModelNamed
import org.platypus.model.functions.PublicApiReturn
import org.platypus.impl.korm.sql.ReferenceOption
import org.platypus.impl.module.product.entities.ProductCategory

class ProductCategoryType(value: String, label: String) : PlatypusSelection<ProductCategoryModel, ProductCategory>(value, label) {
    companion object : PlatypusSelectionCompanion<ProductCategoryModel, ProductCategory, ProductCategoryType>(ProductCategoryType::class, { v, l -> ProductCategoryType(v, l) }) {
        val view by "View"
        val normal by "Normal"

        init {
            _default = normal
        }
    }
}

object ProductCategoryModel : HierarchyModel<ProductCategoryModel, ProductCategory>("product.category") {
    override val modelHelp = "Product Category"

    //    TODO _parent_name = "parent_id"
//    TODO _parent_store = True
//    TODO _parent_order = 'fieldName'
//    TODO _order = 'parent_left'
    init {
        name.extend(index = true, required = true, l10n = true)
    }

    override val parent = field.many2one("parent", label = "Parent Category", index = true,
        onDelete = ReferenceOption.CASCADE, target = ProductCategoryModel)
    override val children = field.one2many("children", label = "Child Categories", target = { ProductCategoryModel.parent })
    val type = field.selection("type", selection = ProductCategoryType,
        help = "A category of the view type is a virtual category that can be used as the parent of another category to create a hierarchical structure.")
    val productCount = field.integer("productCount", label = "# Products",
        help = "The number of products under this category (Does not consider the children categories)")

    //TODO but before read group :-)
    val computeProductCount = api.compute(productCount) {
        //        it.env.ProductTemplate.search({ProductTemplateModel.category})
        PublicApiReturn()
    }

//    TODO convert to api.constraint ? or automatique on hierarchique Model ?
//    val checkCategoryRecursion = api.private(
//        fun(self: ProductCategory) {
//            if (self.checkRecursoin()){
//                throw UserError("Error ! You cannot create recursive categories.")
//            }
//        }
//    )
}