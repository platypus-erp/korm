package org.platypus.model.field.api.type

import org.platypus.cache.ModelID
import org.platypus.model.field.api.ModelFieldType

class Many2OneFieldType(override val required: Boolean) : SqlFieldType {
    override val typeEnum: ModelFieldType = ModelFieldType.MANY_TO_ONE

    override fun notNullValueToDB(value: Any): Any {
        return when (value) {
            is ModelID -> value.id
            is Int -> value
            is Long -> value.toInt()
            is String -> value.toInt()
            else -> value
        }
    }
}