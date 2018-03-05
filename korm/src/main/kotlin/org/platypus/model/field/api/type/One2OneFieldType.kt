package org.platypus.model.field.api.type

import org.platypus.cache.ModelID
import org.platypus.model.field.api.ModelFieldType
import java.sql.PreparedStatement

class One2OneFieldType(override val required: Boolean) : SqlFieldType {
    override val typeEnum: ModelFieldType = ModelFieldType.ONE_TO_ONE

    override fun setParameter(stmt: PreparedStatement, index: Int, value: Any?) {
        value?.let {
            println()
            print(value::class)
            print(" -> ")
            println(value)
        }
        super.setParameter(stmt, index, value)
    }

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