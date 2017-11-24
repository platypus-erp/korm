package org.platypus.impl.module.product.models

import org.platypus.UserError
import org.platypus.impl.korm.entity.PlatypusSelection
import org.platypus.impl.korm.entity.PlatypusSelectionCompanion
import org.platypus.impl.korm.model.ModelNamed
import org.platypus.impl.korm.model.functions.PublicApiReturn
import org.platypus.impl.korm.model.property.KormProperty
import org.platypus.impl.korm.model.property.KormSelectionProperty
import org.platypus.impl.korm.sql.ReferenceOption
import org.platypus.impl.korm.sql.decimalLiteral
import org.platypus.impl.korm.sql.neq
import org.platypus.impl.module.product.entities.ProductUom
import org.platypus.impl.module.product.entities.ProductUomCategory
import org.platypus.impl.module.product.entities.category
import org.platypus.impl.module.product.entities.factor
import org.platypus.impl.module.product.entities.rounding
import org.platypus.impl.module.product.entities.uomType
import org.platypus.api.context.throwError
import java.math.BigDecimal
import java.math.MathContext
import java.math.RoundingMode


class UomType(value: String, label: String) : PlatypusSelection<ProductUomModel, ProductUom>(value, label) {
    companion object : PlatypusSelectionCompanion<ProductUomModel, ProductUom, UomType>(UomType::class, { v, l -> UomType(v, l) }) {
        val bigger by "Bigger than the reference Unit of Measure"
        val reference by "Reference Unit of Measure for this category"
        val smaller by "Smaller than the reference Unit of Measure"

        init {
            _default = reference
        }
    }
}

object ProductUomCategoryModel : ModelNamed<ProductUomCategoryModel, ProductUomCategory>("product.uom.categ") {
    override val modelHelp: String
        get() = "Product UoM Categories"

    init {
        name.extend(label = "Name", required = true, l10n = true)
    }
}

object ProductUomModel : ModelNamed<ProductUomModel, ProductUom>("product.uom") {
    override val modelHelp: String
        get() = "Product Unit of Measure"
    override val order: KormProperty<ProductUomModel, *>
        get() = name

    init {
        name.extend(label = "Unit of Measure", required = true, l10n = true)
//        archived.extend(help="Uncheck the active field to disable a unit of measure without deleting it."))
    }

    val category = field.many2one("category", label = "Category", required = true,
        onDelete = ReferenceOption.CASCADE, target = ProductUomCategoryModel,
        help = "Conversion between Units of Measure can only occur if they belong to the same category. The conversion will be made based on the ratios."
    )
    val factor = field.decimal("factor", defaultValue = decimalLiteral(BigDecimal.ZERO), required = true,
        help = "How much bigger or smaller this unit is compared to the reference Unit of Measure for this category: 1 * (reference unit) = ratio * (this unit)")

    //    TODO _compute_factor_inv
    val factor_inv = field.decimal("factor_inv", "Bigger Ratio",
        help = "How many times this Unit of Measure is bigger than the reference Unit of Measure in this category: 1 * (this unit) = ratio * (reference unit)")

    val rounding = field.decimal("rounding", "Rounding Precision", defaultValue = decimalLiteral(BigDecimal.valueOf(0.01)),
        required = true, help = """The computed quantity will be a multiple of this value.
            |Use 1.0 for a Unit of Measure that cannot be further split, such as a piece.
        """.trimMargin())

    val uomType: KormSelectionProperty<ProductUomModel, UomType.Companion, UomType> = field.selection("uomType", label = "Type of the Unit of Measure", selection = UomType, required = true)

    //TODO replace with by
    val factorGtZero = checkConstaint("factorGtZero", factor neq BigDecimal.ZERO, "The conversion ratio for a unit of measure cannot be 0!")
    val roundingGtZero = checkConstaint("factorGtZero", rounding neq BigDecimal.ZERO, "The rounding precision must be greater than 0!")

    val _computeFactorInv = api.compute(factor_inv) { e ->
        val factor_inv = if (e.factor != BigDecimal.ZERO) {
            BigDecimal.ONE / e.factor
        } else {
            BigDecimal.ZERO
        }
        PublicApiReturn(factor_inv)
    }

    val _onchangeUomType = api.onChange(uomType) {
        if (it.uomType == UomType.reference) {
            it.factor = BigDecimal.ONE
        }
        PublicApiReturn()
    }

    val computeQuantity = api.private(
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

    val computePrice = api.private(
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
