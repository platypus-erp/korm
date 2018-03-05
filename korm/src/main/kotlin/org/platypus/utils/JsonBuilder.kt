package org.platypus.utils

import com.beust.klaxon.JsonArray
import com.beust.klaxon.JsonBase
import com.beust.klaxon.JsonObject
import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.cache.ModelID
import org.platypus.cache.ModelIDS
import org.platypus.cache.PlatypusCache
import org.platypus.cache.modelID
import org.platypus.entity.Record
import org.platypus.model.LazyLoadType

fun AnytoJson(obj: Any?, lazy: LazyLoadType = LazyLoadType.NONE): JsonBase = toJsonRecursive(obj, lazy, ArrayList(), 0, 100)
fun toJsonObj(obj: Record<*>, lazy: LazyLoadType = LazyLoadType.NONE): JsonObject = toJsonRecursive(obj, lazy, ArrayList(), 0, 100) as JsonObject
fun toJsonArray(obj: Bag<*>, lazy: LazyLoadType = LazyLoadType.NONE): JsonArray<JsonObject> = toJsonRecursive(obj, lazy, ArrayList(), 0, 100) as JsonArray<JsonObject>

private fun toJsonRecursive(value: Any?, lazy: LazyLoadType, parsedIds: List<ModelID>,
                            currentDepth: Int, maxDepth: Int): JsonBase {
    return when (value) {
        is Record<*> -> {
            value.modelID.toJsonObjectCache(
                    value.warmCache(),
                    value.env,
                    lazy,
                    parsedIds + value.modelID,
                    currentDepth,
                    maxDepth)
        }
        is Iterable<*> -> {
            JsonArray(value.map { AnytoJson(it, lazy) })
        }
        else -> JsonObject(mapOf("value" to value.toString()))
    }
}

private fun ModelID.toJsonObjectCache(cache: PlatypusCache,
                                      env: PlatypusEnvironment,
                                      lazy: LazyLoadType,
                                      parsedIds: List<ModelID>, currentDepth: Int = 0, maxDepth: Int = 10
): JsonObject {
    val values = cache[this]
    val resultMAp = HashMap<String, Any?>(values.size)
    for ((key, valueKey) in values) {
        resultMAp[key.fieldName] = when (valueKey) {
            is ModelID -> {
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
            }
            is ModelIDS -> {

            }
            else -> {
                valueKey
            }
        }

    }
//    if ((lazy == LazyLoadType.CHILDREN_ONLY || lazy == LazyLoadType.CHILDREN_AND_LINK) && currentDepth <= maxDepth) {
//        for (o2m in cache.mapOne2Many[this] ?: emptyMap<KormOneToManyProperty<*, *>, ModelIDS>()) {
//            resultMAp[o2m.key.name] = JsonArray(
//                    o2m.value.map {
//                        it.toJsonObjectCache(
//                                cache,
//                                env,
//                                lazy,
//                                parsedIds + it,
//                                currentDepth + 1,
//                                maxDepth)
//                    }
//            )
//        }
//    }
    return JsonObject(resultMAp)
}