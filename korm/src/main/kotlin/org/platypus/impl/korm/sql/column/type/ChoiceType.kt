package org.platypus.impl.korm.sql.column.type

import org.platypus.impl.korm.model.ModelColumnType
import org.platypus.impl.korm.sql.vendors.currentDialect

class EnumerationColumnType<T:Enum<T>>(val klass: Class<T>): ColumnType(false) {
    override val modelColumnType = ModelColumnType.ENUM
    override fun sqlType(): String  = currentDialect.dataTypeProvider.shortType()

    override fun notNullValueToDB(value: Any): Any = when(value) {
        is Int -> value
        is Enum<*> -> value.ordinal
        else -> error("$value is not valid for enum ${klass.name}")
    }

    override fun valueFromDB(value: Any): Any = when (value) {
        is Number -> klass.enumConstants!![value.toInt()]
        is Enum<*> -> value
        else -> error("$value is not valid for enum ${klass.name}")
    }
}

class EnumerationNameColumnType<T:Enum<T>>(val klass: Class<T>, length: Int): StringColumnType(length, required = false) {
    override val modelColumnType = ModelColumnType.ENUM
    override fun notNullValueToDB(value: Any): Any = when (value) {
        is String -> value
        is Enum<*> -> value.name
        else -> error("$value is not valid for enum ${klass.name}")
    }

    override fun valueFromDB(value: Any): Any = when (value) {
        is String ->  klass.enumConstants!!.first { it.name == value }
        is Enum<*> -> value
        else -> error("$value is not valid for enum ${klass.name}")
    }
}