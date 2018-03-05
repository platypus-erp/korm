package org.platypus.model.field.api.type

import org.platypus.model.field.api.ModelFieldType

class LongSqlFieldType(override val required: Boolean = false) : SqlFieldType {
    override val typeEnum: ModelFieldType = ModelFieldType.LONG
    override fun valueFromDB(value: Any): Any = when (value) {
        is Long -> value
        is Number -> value.toLong()
        else -> error("Unexpected value of type Long: $value")
    }
}