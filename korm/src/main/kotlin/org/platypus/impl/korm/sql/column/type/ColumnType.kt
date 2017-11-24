package org.platypus.impl.korm.sql.column.type

import org.platypus.impl.korm.model.ModelColumnType
import org.platypus.impl.korm.sql.statements.DefaultValueMarker
import java.sql.PreparedStatement
import java.sql.ResultSet

interface IColumnType {
    val required: Boolean
    val isAutoInc: Boolean get() = false
    val modelColumnType: ModelColumnType
    fun sqlType(): String = modelColumnType.toString()

    fun valueFromDB(value: Any): Any = value

    fun valueToString(value: Any?): String = when (value) {
        null -> {
            if (!required) error("NULL in non-required column")
            "NULL"
        }

        DefaultValueMarker -> "DEFAULT"

        is Iterable<*> -> {
            value.joinToString(",") { valueToString(it) }
        }

        else -> {
            nonNullValueToString(value)
        }
    }

    fun valueToDB(value: Any?): Any? = value?.let { notNullValueToDB(it) }

    fun notNullValueToDB(value: Any): Any = value

    fun nonNullValueToString(value: Any): String = notNullValueToDB(value).toString()

    fun readObject(rs: ResultSet, index: Int): Any? = rs.getObject(index)

    fun setParameter(stmt: PreparedStatement, index: Int, value: Any?) {
        stmt.setObject(index, value)
    }

    fun validateValue(value: Any?) {
        value?.let { validateNonNullValue(it) }
    }

    fun validateNonNullValue(value: Any) {

    }


    fun clone(): IColumnType = this


}

abstract class ColumnType(override var required: Boolean = false) : IColumnType {
    override fun toString(): String = sqlType()
}
