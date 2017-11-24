package org.platypus.impl.korm.sql.column.type

import org.platypus.impl.korm.model.ModelColumnType
import org.platypus.impl.korm.sql.vendors.currentDialect
import java.math.BigDecimal
import java.math.RoundingMode

open class IntegerColumnType(required: Boolean = false) : ColumnType(required) {
    override val modelColumnType = ModelColumnType.INTEGER


    override fun sqlType(): String = currentDialect.dataTypeProvider.shortType()

    override fun valueFromDB(value: Any): Any = when(value) {
        is Int -> value
        is Number -> value.toInt()
        else -> error("Unexpected value of type Int: $value")
    }
}

open class ManyToManyColumnType(required: Boolean = false) : IntegerColumnType(required) {
    override val modelColumnType = ModelColumnType.MANY_TO_MANY


    override fun sqlType(): String = currentDialect.dataTypeProvider.shortType()

    override fun valueFromDB(value: Any): Any = when(value) {
        is Int -> value
        is Number -> value.toInt()
        else -> error("Unexpected value of type Int: $value")
    }
}

class LongColumnType(required: Boolean = false) : ColumnType(required) {
    override val modelColumnType = ModelColumnType.LONG
    override fun sqlType(): String = currentDialect.dataTypeProvider.longType()

    override fun valueFromDB(value: Any): Any = when(value) {
        is Long -> value
        is Number -> value.toLong()
        else -> error("Unexpected value of type Long: $value")
    }
}

class FloatColumnType(required: Boolean = false) : ColumnType(required) {
    override val modelColumnType = ModelColumnType.LONG
    override fun sqlType(): String = currentDialect.dataTypeProvider.longType()

    override fun valueFromDB(value: Any): Any = when(value) {
        is Float -> value
        is Number -> value.toFloat()
        else -> error("Unexpected value of type Long: $value")
    }
}

class DecimalColumnType(val precision: Int, val scale: Int, required: Boolean = false) : ColumnType(required) {
    override val modelColumnType = ModelColumnType.DECIMAL
    override fun sqlType(): String  = "DECIMAL($precision, $scale)"
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