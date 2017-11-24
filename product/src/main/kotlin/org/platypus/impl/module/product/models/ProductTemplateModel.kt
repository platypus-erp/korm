package org.platypus.impl.module.product.models

import org.platypus.impl.korm.entity.PlatypusSelection
import org.platypus.impl.korm.entity.PlatypusSelectionCompanion
import org.platypus.impl.korm.model.ModelNamed
import org.platypus.impl.korm.model.property.KormProperty
import org.platypus.impl.korm.sql.intLiteral
import org.platypus.impl.module.product.entities.ProductTemplate
import org.platypus.impl.module.product.entities.ProductUom
import org.platypus.impl.module.product.models.UomType.Companion.reference

class ProductTemplateType(value: String, label: String) : PlatypusSelection<ProductTemplateModel, ProductTemplate>(value, label) {
    companion object : PlatypusSelectionCompanion<ProductTemplateModel, ProductTemplate, ProductTemplateType>(ProductTemplateType::class, { v, l -> ProductTemplateType(v, l) }) {
        val consu by "Consumable"
        val service by "Service"

        init {
            _default = consu
        }
    }
}

object ProductTemplateModel : ModelNamed<ProductTemplateModel, ProductTemplate>("product.template") {
    override val modelHelp: String
        get() = "Product Template"
    override val order: KormProperty<ProductTemplateModel, *>
        get() = name

//    TODO _inherit = ['mail.thread']

    init {
        name.extend(required = true, l10n = true, index = true)
    }

    //    sequence = fields.Integer('Sequence', default=1, help='Gives the sequence order when displaying a product list')
    val sequence = field.integer("sequence", defaultValue = intLiteral(1),
        help = "Gives the sequence order when displaying a product list")
    val description = field.text("modelHelp", l10n=true,
        help = "A precise modelHelp of the Product, used only for internal information purposes.")
    val descriptionPurchase = field.text("descriptionPurchase", l10n = true,
        help="""A description of the Product that you want to communicate to your vendors.
            |This description will be copied to every Purchase Order, Receipt and Vendor Bill/Refund.
        """.trimMargin())

    val descriptionSale = field.text("descriptionSale", l10n = true,
        help="""A description of the Product that you want to communicate to your customers.
            |This description will be copied to every Sale Order, Delivery Order and Customer Invoice/Refund
        """.trimMargin())

    val type = field.selection("type", label = "Product Type", required = true, selection = ProductTemplateType,
        help = """A stockable product is a product for which you manage stock. The "Inventory" app has to be installed.
            |A consumable product, on the other hand, is a product for which stock is not managed.
            |A service is a non-material product you provide.
            |A digital content is a non-material product you sell online. The files attached to the products are the one that are sold on
            |the e-commerce such as e-books, music, pictures,... The "Digital Product" module has to be installed.
        """.trimMargin())

    val rental = field.boolean("rental", "Can be Rent")
}

