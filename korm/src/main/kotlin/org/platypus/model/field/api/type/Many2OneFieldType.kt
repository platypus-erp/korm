package org.platypus.model.field.api.type

import org.platypus.cache.ModelID
import org.platypus.cache.of
import org.platypus.entity.Record
import org.platypus.model.IModel
import org.platypus.model.field.api.ModelFieldType

class Many2OneFieldType(override val required: Boolean,private val model: IModel<*>) : SqlFieldType {
    override val typeEnum: ModelFieldType = ModelFieldType.MANY_TO_ONE

    override fun notNullValueToDB(value: Any): Any {
        return when (value) {
            is ModelID -> value.id
            is Int -> value
            is Long -> value.toInt()
            is String -> value.toInt()
            is Record<*> -> value.id
            else -> value
        }
    }

    override fun valueFromDB(value: Any): Any {
        return when (value){
            is ModelID -> value
            is Int -> model of value
            is Long -> model of value.toInt()
            is String -> model of value.toInt()
            else -> value
        }
    }
}