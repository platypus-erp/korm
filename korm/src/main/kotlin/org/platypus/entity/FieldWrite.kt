package org.platypus.entity

import org.platypus.model.Model
import org.platypus.model.field.api.ModelField

data class FieldWrite<KT : Any>(val field: ModelField<*, KT>, val values: OnChangeValue<KT>)

class FieldsWrite<M : Model<M>>(
        initMap:Map<ModelField<M, *>, Any?> = emptyMap()
) : Iterable<Map.Entry<ModelField<M, *>, Any?>> {
    internal val datas: MutableMap<ModelField<M, *>, Any?> = HashMap(initMap)

    operator fun <KT : Any> get(field: ModelField<M, KT>): KT? = datas[field] as KT?

    operator fun <KT : Any> set(field: ModelField<M, KT>, value: KT?) {
        datas[field] = value
    }

    override fun iterator(): Iterator<Map.Entry<ModelField<M, *>, Any?>> = datas.iterator()

    operator fun contains(field: ModelField<M, *>): Boolean = field in datas

    fun remove(field: ModelField<M, *>) = datas.remove(field)

}

data class OnChangeValue<out T>(val old: T?, val new: T?)