package org.platypus.model.field.api.type

import org.platypus.model.field.api.ModelFieldType

class IntegerSqlFieldType(override val required: Boolean = false) : SqlFieldType {
    override val typeEnum: ModelFieldType = ModelFieldType.INTEGER
    override fun valueFromDB(value: Any): Any = when (value) {
        is Int -> value
        is Number -> value.toInt()
        else -> error("Unexpected value of type Int: $value")
    }
}