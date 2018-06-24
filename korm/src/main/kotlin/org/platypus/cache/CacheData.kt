package org.platypus.cache

import org.platypus.model.field.api.IModelField
import org.platypus.model.field.api.MultiReferencedField
import org.platypus.model.field.api.ReferencedField
import org.platypus.model.field.api.SimpleModelField

class CacheData private constructor() {
    private val dataMap = HashMap<IModelField<*, *>, Any?>()
    private val stateMap = HashMap<IModelField<*, *>, CacheState>()


    operator fun <T : Any> get(field: SimpleModelField<*, T>): Pair<CacheState, T?> {
        return (stateMap[field] ?: CacheState.NONE) to dataMap[field] as T?
    }

    operator fun get(field: ReferencedField<*, *>): Pair<CacheState, ModelID?> {
        return (stateMap[field] ?: CacheState.NONE) to dataMap[field] as ModelID?
    }

    operator fun get(field: MultiReferencedField<*, *>): Pair<CacheState, ModelIDS?> {
        return (stateMap[field] ?: CacheState.NONE) to dataMap[field] as ModelIDS?
    }

    operator fun <T : Any> set(field: SimpleModelField<*, T>, value :Pair<CacheState, T?>) {
        stateMap[field] = value.first
        dataMap[field] = value.second
    }

    operator fun set(field: ReferencedField<*, *>, value: Pair<CacheState, ModelID?>) {
        stateMap[field] = value.first
        dataMap[field] = value.second
    }

    operator fun set(field: MultiReferencedField<*, *>, value: Pair<CacheState, ModelIDS?>) {
        stateMap[field] = value.first
        dataMap[field] = value.second
    }
}