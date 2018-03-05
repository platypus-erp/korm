package org.platypus.model.field.api.type

import org.platypus.model.field.api.ModelFieldType
import org.platypus.orm.sql.dml.DefaultValueMarker
import java.sql.PreparedStatement
import java.sql.ResultSet

interface SqlFieldType {
    val typeEnum: ModelFieldType
    val required: Boolean
    val isAutoInc: Boolean
        get() = false

    fun valueFromDB(value: Any): Any = value

    fun valueToString(value: Any?): String = when (value) {
        null -> {
            if (required) error("NULL in required column $typeEnum")
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

    fun clone(): SqlFieldType = this
}
