package org.platypus.api.web

import com.beust.klaxon.JsonArray
import com.beust.klaxon.JsonBase
import com.beust.klaxon.JsonObject
import org.platypus.api.env.PlatypusEnvironement
import org.platypus.impl.korm.identifiants.ModelID
import org.platypus.impl.korm.identifiants.ModelIDS
import org.platypus.impl.korm.cache.TransactionCache
import org.platypus.impl.korm.entity.Bag
import org.platypus.impl.korm.entity.Entity
import org.platypus.impl.korm.entity.PlatypusEntity
import org.platypus.impl.korm.model.LazyLoadType
import org.platypus.impl.korm.model.property.KormOneToManyProperty

object JsonEntityConverteur {


    fun toJson(obj: Any?, lazy: LazyLoadType): JsonBase
        = toJsonRecursive(obj, lazy, ArrayList(), 0, 100)
    fun toJsonObj(obj: Entity<*, *>, lazy: LazyLoadType, pretty: Boolean): JsonObject
        = toJsonRecursive(obj, lazy, ArrayList(), 0, 100) as JsonObject
    fun toJsonArray(obj: Bag<*>, lazy: LazyLoadType, pretty: Boolean): JsonArray<JsonObject>
        = toJsonRecursive(obj, lazy, ArrayList(), 0, 100) as JsonArray<JsonObject>

    private fun toJsonRecursive(value: Any?, lazy: LazyLoadType, parsedIds: List<ModelID>,
                                currentDepth: Int, maxDepth: Int): JsonBase {
        return when (value) {
            is PlatypusEntity<*, *> -> {
                value.modelID.toJsonObjectCache(
                    value.warmCache(),
                    value.env,
                    lazy,
                    parsedIds + value.modelID,
                    currentDepth,
                    maxDepth)
            }
            is Iterable<*> -> {
                JsonArray(value.map { toJson(it, lazy) })
            }
            else -> JsonObject(mapOf("value" to value.toString()))
        }
    }

    private fun ModelID.toJsonObjectCache(
            cache: TransactionCache, env: PlatypusEnvironement, lazy: LazyLoadType,
            parsedIds: List<ModelID>, currentDepth: Int = 0, maxDepth: Int = 10
    ): JsonObject {
        val values = cache[this]
        val resultMAp = HashMap<String, Any?>(values.size)
        for ((key, valueKey) in values) {
            resultMAp[key.name] =
                if (valueKey is ModelID) {
                    if ((lazy == LazyLoadType.LINK || lazy == LazyLoadType.CHILDREN_AND_LINK)
                        && valueKey.model != this.model && currentDepth <= maxDepth) {
                        valueKey.toJsonObjectCache(cache,
                            env,
                            lazy,
                            parsedIds + valueKey,
                            maxDepth,
                            maxDepth)
                    } else {
                        valueKey.id
                    }
                } else {
                    valueKey
                }
        }
        if ((lazy == LazyLoadType.CHILDREN_ONLY || lazy == LazyLoadType.CHILDREN_AND_LINK) && currentDepth <= maxDepth) {
            for (o2m in cache.mapOne2Many[this] ?: emptyMap<KormOneToManyProperty<*, *>, ModelIDS>()) {
                resultMAp[o2m.key.name] = JsonArray(
                    o2m.value.map {
                        it.toJsonObjectCache(
                            cache,
                            env,
                            lazy,
                            parsedIds + it,
                            currentDepth + 1,
                            maxDepth)
                    }
                )
            }
        }
        return JsonObject(resultMAp)
    }
}
