package org.platypus.model.field.api.type

import org.platypus.model.field.api.ModelFieldType
import java.math.BigDecimal
import java.math.RoundingMode

class DecimalSqlFieldType(override val required: Boolean = false, val precision: Int, val scale: Int) : SqlFieldType {
    override val typeEnum: ModelFieldType = ModelFieldType.DECIMAL
    override fun valueFromDB(value: Any): Any {
        val valueFromDB = super.valueFromDB(value)
        return when (valueFromDB) {
            is BigDecimal -> valueFromDB.setScale(scale, RoundingMode.HALF_EVEN)
            is Double -> BigDecimal.valueOf(valueFromDB).setScale(scale, RoundingMode.HALF_EVEN)
            is Float -> BigDecimal(java.lang.Float.toString(valueFromDB)).setScale(scale, RoundingMode.HALF_EVEN)
            is Int -> BigDecimal(valueFromDB)
            is Long -> BigDecimal.valueOf(valueFromDB)
            else -> valueFromDB
        }
    }
}