package org.platypus.product.models

import org.platypus.model.Model
import org.platypus.module.contact.models.Currencies
import org.platypus.module.contact.models.Partners
import org.platypus.module.contact.models.ResCompanies
import org.platypus.orm.ReferenceOption
import org.platypus.orm.sql.predicate.eq
import java.math.BigDecimal

object ProductSupplierInfoModel : Model<ProductSupplierInfoModel>("product.supplierinfo") {
    override val modelHelp: String = "Information about a product vendor"

//    _order = 'sequence, min_qty desc, price'

    val vendor = many2one("vendor", Partners) {
        label = "Vendor"
        required = true
        help = "Vendor of this product"
        domain = { supplier eq true }

    }

    val productName = string("productName") {
        label = "Vendor Product Name"
        help = "This vendor's product fieldName will be used when printing a request for quotation. Keep empty to use the internal one."
    }
    val productCode = string("productCode") {
        help = "This vendor's product code will be used when printing a request for quotation. Keep empty to use the internal one."
    }
    val sequence = integer("sequence") {
        label = "Sequence"
        default = 1
        help = "Assigns the priority to the list of product vendor."
    }

    //    related='product_tmpl_id.uom_po_id'
    val productUom = many2one("productUom", ProductUomModel) {
        readonly = true
        help = "This comes from the product form."
    }

    val minQty = decimal("minQty") {
        label = "Minimal Quantity"
        default = BigDecimal.ZERO
        required = true
        help = "The minimal quantity to purchase from this vendor, expressed in the vendor Product Unit of Measure if not any, in the default unit of measure of the product otherwise."
    }

    val price = decimal("price") {
        label = "Price"
        default = BigDecimal.ZERO
        precision = productPrice
        required = true
        help = "The price to purchase a product"
    }
    val company = many2one("company", ResCompanies) {
        label = "Company"
//        defaultValueFun = { env -> env.envUser.company }
        index = true
    }
    val currency = many2one("currency", Currencies) {
        label = "Currency"
//        defaultValueFun = { env -> env.envUser.company.currency }
        required = true
    }
    val dateStart = date("dateStart") {
        help = "Start date for this vendor price"
    }
    val dateEnd = date("dateEnd") {
        help = "End date for this vendor price"
    }
    val product = many2one("product", ProductProductModel) {
        label = "Product Variant"
        index = true
        onDelete = ReferenceOption.CASCADE
        help = "When this field is filled in, the vendor data will only apply to the variant."
    }
    val productTemplate = many2one("productTemplate", ProductTemplateModel) {
        label = "Product Template"
        index = true
        onDelete = ReferenceOption.CASCADE
    }
    val delay = integer("delay") {
        label = "Delivery Lead Time"
        default = 1
        required = true
        help = "Lead time in days between the confirmation of the purchase order and the receipt of the products in your warehouse. Used by the scheduler for automatic computation of the purchase order planning."
    }
}