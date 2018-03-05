package org.platypus.impl.module.product.models

import org.platypus.module.base.company
import org.platypus.module.base.models.ResCompanys
import org.platypus.module.base.models.ResCurrencys
import org.platypus.module.base.models.ResPartners
import org.platypus.impl.korm.model.ModelNamed
import org.platypus.impl.korm.sql.ReferenceOption
import org.platypus.impl.orm.sql.decimalLiteral
import org.platypus.impl.orm.sql.intLiteral
import org.platypus.impl.module.product.entities.ProductSupplierInfo
import java.math.BigDecimal

object ProductSupplierInfoModel : ModelNamed<ProductSupplierInfoModel, ProductSupplierInfo>("product.supplierinfo") {
    override val modelHelp: String
        get() = "Information about a product vendor"

//    _order = 'sequence, min_qty desc, price'

    val vendor = field.many2one("vendor", label = "Vendor", required = true, target = ResPartners,
        help = "Vendor of this product", domain = { ResPartners.supplier eq true })
    val productName = field.string("productName", label = "Vendor Product Name",
        help = "This vendor's product fieldName will be used when printing a request for quotation. Keep empty to use the internal one.")
    val productCode = field.string("productCode",
        help = "This vendor's product code will be used when printing a request for quotation. Keep empty to use the internal one.")
    val sequence = field.integer("sequence", label = "Sequence", defaultValue = intLiteral(1), help = "Assigns the priority to the list of product vendor.")

    //    related='product_tmpl_id.uom_po_id'
    val productUom = field.many2one("productUom", target = ProductUomModel, readonly = true,
        help = "This comes from the product form.")

    val minQty = field.decimal("minQty", label = "Minimal Quantity",
        defaultValue = decimalLiteral(BigDecimal.ZERO), required = true,
        help = "The minimal quantity to purchase from this vendor, expressed in the vendor Product Unit of Measure if not any, in the default unit of measure of the product otherwise.")

    val price = field.decimal("price", label = "Price", defaultValue = decimalLiteral(BigDecimal.ZERO), precision = productPrice, required = true,
        help = "The price to purchase a product")
    val company = field.many2one("company", label = "Company", target = ResCompanys,
        defaultFun = { self -> self.env.user.company }, index = true)
    val currency = field.many2one("currency", label = "Currency", target = ResCurrencys,
        defaultFun = { self -> self.env.user.company.currency }, required=true)
    val dateStart = field.date("dateStart", help="Start date for this vendor price")
    val dateEnd = field.date("dateEnd", help="End date for this vendor price")
    val product = field.many2one("product", target = ProductProductModel, label = "Product Variant",
        index = true, onDelete = ReferenceOption.CASCADE, help="When this field is filled in, the vendor data will only apply to the variant.")
    val productTemplate = field.many2one("productTemplate", label="Product Template", target = ProductTemplateModel, index = true, onDelete = ReferenceOption.CASCADE)
    val delay = field.integer("delay", label="Delivery Lead Time", defaultValue = intLiteral(1), required = true,
        help ="Lead time in days between the confirmation of the purchase order and the receipt of the products in your warehouse. Used by the scheduler for automatic computation of the purchase order planning." )

}