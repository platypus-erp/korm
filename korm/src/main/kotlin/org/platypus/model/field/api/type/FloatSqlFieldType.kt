package org.platypus.model.field.api.type

import org.platypus.model.field.api.ModelFieldType

class FloatSqlFieldType(override val required: Boolean = false) : SqlFieldType {
    override val typeEnum: ModelFieldType = ModelFieldType.FLOAT
    override fun valueFromDB(value: Any): Any = when (value) {
        is Float -> value
        is Number -> value.toFloat()
        else -> error("Unexpected value of type Long: $value")
    }
}