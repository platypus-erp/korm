package org.chmuche.korm.sql.column.type

import org.chmuche.korm.sql.statements.DefaultValueMarker
import java.sql.PreparedStatement
import java.sql.ResultSet

interface IColumnType {
    var nullable: Boolean
    val isAutoInc:Boolean get() = false
    val autoIncSeqName : String? get() = null

    fun sqlType(): String

    fun valueFromDB(value: Any): Any  = value

    fun valueToString(value: Any?) : String = when (value) {
        null -> {
            if (!nullable) error("NULL in non-nullable column")
            "NULL"
        }

        DefaultValueMarker -> "DEFAULT"

        is Iterable<*> -> {
            value.joinToString(","){ valueToString(it) }
        }

        else ->  {
            nonNullValueToString (value)
        }
    }

    fun valueToDB(value: Any?): Any? = value?.let { notNullValueToDB(it) }

    fun notNullValueToDB(value: Any): Any  = value

    fun nonNullValueToString(value: Any) : String = notNullValueToDB(value).toString()

    fun readObject(rs: ResultSet, index: Int): Any? = rs.getObject(index)

    fun setParameter(stmt: PreparedStatement, index: Int, value: Any?) {
        stmt.setObject(index, value)
    }


    fun clone():IColumnType = this


}

abstract class ColumnType(override var nullable: Boolean = false) : IColumnType {
    override fun toString(): String = sqlType()
}
