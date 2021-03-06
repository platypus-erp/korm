package org.platypus.impl.korm.sql.column.type

import org.platypus.impl.korm.model.ModelColumnType
import org.platypus.impl.korm.sql.vendors.currentDialect

open class StringColumnType(val length: Int? = 255, val collate: String? = null, required: Boolean = false) : ColumnType(required) {
    override val modelColumnType = ModelColumnType.STRING

    override fun sqlType(): String = buildString {
        val colLength = this@StringColumnType.length
        append(when (colLength) {
            in 1..255 -> "VARCHAR($colLength)"
            else -> currentDialect.dataTypeProvider.textType()
        })

        if (collate != null) {
            append(" COLLATE $collate")
        }
    }

    val charactersToEscape = mapOf(
            '\'' to "\'\'",
//            '\"' to "\"\"", // no need to escape double quote as we put string in single quotes
            '\r' to "\\r",
            '\n' to "\\n")

    override fun nonNullValueToString(value: Any): String = buildString {
        append('\'')
        value.toString().forEach {
            append(charactersToEscape[it] ?: it)
        }
        append('\'')
    }

    override fun valueFromDB(value: Any): Any {
        if (value is java.sql.Clob) {
            return value.characterStream.readText()
        }
        return value
    }
}

class CharacterColumnType(required: Boolean = false) : ColumnType(required) {
    override val modelColumnType = ModelColumnType.CHAR
    override fun sqlType(): String = "CHAR"

    override fun valueFromDB(value: Any): Any = when (value) {
        is Char -> value
        is Number -> value.toInt().toChar()
        is String -> value.single()
        else -> error("Unexpected value of type Char: $value")
    }

    override fun notNullValueToDB(value: Any): Any = valueFromDB(value).toString()

    override fun nonNullValueToString(value: Any): String = "'$value'"
}
