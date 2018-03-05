package org.platypus

import java.math.BigDecimal
import java.math.MathContext
import java.math.RoundingMode

data class DecimalPrecision(
        val precision: Int = 10,
        val scale: Int = 5,
        val roundingMode: RoundingMode = RoundingMode.UP
)

fun DecimalPrecision.toMathContext(): MathContext = MathContext(precision, roundingMode)

fun BigDecimal.applyPrecision(precision: DecimalPrecision = DecimalPrecision()): BigDecimal = this.setScale(precision.scale, precision.roundingMode)


interface UIWidget