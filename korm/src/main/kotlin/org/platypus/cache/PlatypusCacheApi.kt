package org.platypus.cache

import org.platypus.model.field.api.IModelField
import org.platypus.model.field.api.MutliReferencedField
import org.platypus.model.field.api.ReferencedField
import org.platypus.model.field.api.SimpleModelField

interface PlatypusCacheApi {

    operator fun get(modelId: ModelID): CacheData

    operator fun get(modelId: ModelID, field: ReferencedField<*, *>): Pair<CacheState, ModelID?>

    operator fun get(modelId: ModelID, field: MutliReferencedField<*, *>): Pair<CacheState, ModelIDS?>

    operator fun <T : Any> set(modelId: ModelID, field: SimpleModelField<*, T>, value: Pair<CacheState, T?>)

    operator fun set(modelId: ModelID, field: ReferencedField<*, *>, value: Pair<CacheState, ModelID?>)

    operator fun set(modelId: ModelID, field: MutliReferencedField<*, *>, value: Pair<CacheState, ModelIDS?>)

    fun cacheId(modelId: ModelID): ModelID

    fun isNotInDB(modelId: ModelID): Boolean
    fun isInDB(modelId: ModelID): Boolean

    fun isToUpdate(modelId: ModelID, prop: IModelField<*, *>): Boolean

    fun delete(modelId: ModelID): Boolean
}