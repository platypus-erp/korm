package org.platypus.product.models

import org.platypus.entity.Selection
import org.platypus.model.Model
import org.platypus.product.models.ProductTemplateType.getValue

object ProductTemplateType : Selection<ProductTemplateType>()

val ProductTemplateType.consu by "Consumable"
val ProductTemplateType.service by "Service"

object ProductTemplateModel : Model<ProductTemplateModel>("product.domModule") {
    override val modelHelp: String = "Product Template"

//    TODO _inherit = ['mail.thread']

    init {
        name.extend {
            required = true
            l10n = true
            index = true
        }
    }

    //    sequence = fieldsExpression.Integer('Sequence', default=1, help='Gives the sequence order when displaying a product list')
    val sequence = integer("sequence") {
        default = 1
        help = "Gives the sequence order when displaying a product list"
    }
    val description = text("modelHelp") {
        l10n = true
        help = "A precise modelHelp of the Product, used only for internal information purposes."
    }
    val descriptionPurchase = text("descriptionPurchase") {
        l10n = true
        help = """A description of the Product that you want to communicate to your vendors.
            |This description will be copied to every Purchase Order, Receipt and Vendor Bill/Refund.
        """.trimMargin()
    }

    val descriptionSale = text("descriptionSale") {
        l10n = true
        help = """A description of the Product that you want to communicate to your customers.
            |This description will be copied to every Sale Order, Delivery Order and Customer Invoice/Refund
        """.trimMargin()
    }

    val type = selection("type", ProductTemplateType) {
        label = "Product Type"
        required = true
        help = """A stockable product is a product for which you manage stock. The "Inventory" app has to be installed.
            |A consumable product, on the other hand, is a product for which stock is not managed.
            |A service is a non-material product you provide.
            |A digital content is a non-material product you sell online. The files attached to the products are the one that are sold on
            |the e-commerce such as e-books, music, pictures,... The "Digital Product" module has to be installed.
        """.trimMargin()
    }

    val rental = boolean("rental") {
        label = "Can be Rent"
    }

}

