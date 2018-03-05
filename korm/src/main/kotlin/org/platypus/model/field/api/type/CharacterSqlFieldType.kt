package org.platypus.model.field.api.type

import org.platypus.model.field.api.ModelFieldType

class CharacterSqlFieldType(override val required: Boolean = false) : SqlFieldType {
    override val typeEnum = ModelFieldType.CHAR
    override fun valueFromDB(value: Any): Any = when (value) {
        is Char -> value
        is Number -> value.toInt().toChar()
        is String -> value.single()
        else -> error("Unexpected value of type Char: $value")
    }

    override fun notNullValueToDB(value: Any): Any = valueFromDB(value).toString()

    override fun nonNullValueToString(value: Any): String = "'$value'"
}
