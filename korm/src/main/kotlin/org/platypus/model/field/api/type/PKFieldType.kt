package org.platypus.model.field.api.type

import org.platypus.model.field.api.ModelFieldType

class PKFieldType : SqlFieldType {
    override val typeEnum: ModelFieldType = ModelFieldType.PK
    override val required: Boolean = false
    override val isAutoInc: Boolean = true
    override fun valueFromDB(value: Any): Any = when (value) {
        is Int -> value
        is Number -> value.toInt()
        else -> error("Unexpected value of type Int: $value")
    }
}