package org.platypus.product.models

import org.platypus.context.throwError
import org.platypus.entity.Selection
import org.platypus.model.Model
import org.platypus.model.functions.PublicApiReturn
import org.platypus.model.functions.asResult
import org.platypus.orm.ReferenceOption
import org.platypus.orm.sql.predicate.neq
import org.platypus.orm.sql.query.ORDERBY_TYPE
import org.platypus.product.gen.product.uom.ProductUom
import org.platypus.product.gen.product.uom.category
import org.platypus.product.gen.product.uom.factor
import org.platypus.product.gen.product.uom.factor_inv
import org.platypus.product.gen.product.uom.rounding
import org.platypus.product.gen.product.uom.uomType
import org.platypus.product.models.UomType.getValue
import org.platypus.utils.UserError
import java.math.BigDecimal
import java.math.MathContext
import java.math.RoundingMode


object UomType : Selection<UomType>()

val UomType.bigger by "Bigger than the reference Unit of Measure"
val UomType.reference by "Reference Unit of Measure for this category"
val UomType.smaller by "Smaller than the reference Unit of Measure"

object ProductUomModel : Model<ProductUomModel>("product.uom") {
    override val modelHelp: String = "Product Unit of Measure"

    init {
        orderBy(name, ORDERBY_TYPE.ASC)

        name extend {
            label = "Unit of Measure"
            required = true
            l10n = true
        }
        archived.enable()
    }


    val category = many2one("category", ProductUomCategoryModel) {
        label = "Category"
        required = true
        onDelete = ReferenceOption.CASCADE
        help = "Conversion between Units of Measure can only occur if they belong to the same category. The conversion will be made based on the ratios."
    }
    val factor = decimal("factor") {
        default = BigDecimal.ZERO
        required = true
        help = "How much bigger or smaller this unit is compared to the reference Unit of Measure for this category: 1 * (reference unit) = ratio * (this unit)"
    }

    //    TODO _compute_factor_inv
    val factor_inv = decimal("factor_inv") {
        label = "Bigger Ratio"
        help = "How many times this Unit of Measure is bigger than the reference Unit of Measure in this category: 1 * (this unit) = ratio * (reference unit)"
    }

    val rounding = decimal("rounding") {
        label = "Rounding Precision"
        default = BigDecimal.valueOf(0.01)
        required = true
        help = """The computed quantity will be a multiple of this min.
            |Use 1.0 for a Unit of Measure that cannot be further split, such as a piece.
        """.trimMargin()
    }

    val uomType = selection("uomType", UomType) {
        label = "Type of the Unit of Measure"
        required = true
    }

    val factorGtZero = check("factorGtZero", "The conversion ratio for a unit of measure cannot be 0!") {
        factor neq BigDecimal.ZERO
    }
    val roundingGtZero = check("factorGtZero", "The rounding precision must be greater than 0!") {
        rounding neq BigDecimal.ZERO
    }

    val _computeFactorInv = api.compute {
        it.factor_inv = if (it.factor != BigDecimal.ZERO) {
            BigDecimal.ONE / it.factor
        } else {
            BigDecimal.ZERO
        }
        Unit.asResult()
    }

    val _onchangeUomType = api.onChange(uomType) {
        if (it.uomType == UomType.reference) {
            it.factor = BigDecimal.ONE
        }
        PublicApiReturn()
    }

    val computeQuantity = api.private("computeQuantity",
            fun(self: ProductUom, param: ComputeQuantityParam): BigDecimal {
                val (qty, toUnit, round, roundingMethod) = param
                if (self.category != toUnit.category) {
                    if (self.env.context[throwError]) {
                        throw UserError("Conversion from Product UoM ${self.name} to Default UoM ${toUnit.name} is not possible as they both belong to different Category!.")
                    } else {
                        return qty
                    }
                }
                val amount = (qty / self.factor) * toUnit.factor
                return if (round) {
                    amount.round(MathContext(toUnit.rounding.scale(), roundingMethod))
                } else {
                    amount
                }

            }
    )

    val computePrice = api.private("computePrice",
            fun(self: ProductUom, param: ComputePriceParam): BigDecimal {
                val (price, toUnit) = param
                if (toUnit == self || toUnit.category != self.category) {
                    return price
                }
                return price * self.factor / toUnit.factor
            }
    )

}

data class ComputePriceParam(val price: BigDecimal, val toUnit: ProductUom)

data class ComputeQuantityParam(val qty: BigDecimal, val toUnit: ProductUom, val round: Boolean = true, val roundingMode: RoundingMode = RoundingMode.UP)
