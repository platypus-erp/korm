package org.platypus.model.field.api.type

import org.platypus.entity.Selection
import org.platypus.model.field.api.ModelFieldType

class SelectionFieldType(override val required: Boolean = false, private val selection: Selection<*>) : SqlFieldType {
    override val typeEnum = ModelFieldType.SELECTION
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
        val tmpValue:String?= if (value is java.sql.Clob) {
            return value.characterStream.readText()
        } else {
            value as String?
        }
        return selection.getUnsafe(tmpValue)!!
    }


}