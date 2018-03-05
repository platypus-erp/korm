package org.platypus.model.field.api.type

import org.platypus.model.field.api.ModelFieldType

class EnumerationNameSqlFieldType<T : Enum<T>>(
        override val required: Boolean = false,
        private val klass: Class<T>) : SqlFieldType {
    override val typeEnum: ModelFieldType = ModelFieldType.ENUM
    override fun notNullValueToDB(value: Any): Any = when (value) {
        is String -> value
        is Enum<*> -> value.name
        else -> error("$value is not valid for enum ${klass.name}")
    }

    override fun valueFromDB(value: Any): Any = when (value) {
        is String -> klass.enumConstants!!.first { it.name == value }
        is Enum<*> -> value
        else -> error("$value is not valid for enum ${klass.name}")
    }
}