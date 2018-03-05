package org.platypus.model.field.api.type

import org.platypus.model.field.api.ModelFieldType

class BooleanSqlFieldType(override val required: Boolean = false) : SqlFieldType {
    override val typeEnum: ModelFieldType = ModelFieldType.BOOLEAN
    override fun valueFromDB(value: Any) = when (value) {
        is Number -> value.toLong() != 0L
//        is String -> Platypus.presitenceDialect.booleanFromStringToBoolean(value)
        is String -> value.toBoolean()
        else -> value.toString().toBoolean()
    }

    override fun nonNullValueToString(value: Any) = when (value) {
        is Number -> (value.toLong() != 0L).toString()
        else -> value.toString()
    }
}