package org.platypus.utils

import java.util.stream.Stream

fun <T> Stream<T?>.filterNotNull(): Stream<T> = this.filter { it != null }.map { it as T }

/**
 * Groups elements of the original collection by the key returned by the given [keySelector] function
 * applied to each element and returns a map where each group key is associated with a list of corresponding elements.
 *
 * The returned map preserves the entry iteration order of the keys produced from the original collection.
 *
 * @sample samples.collections.Collections.Transformations.groupBy
 */
public inline fun <T, K> Set<T>.groupBySet(keySelector: (T) -> K): Map<K, Set<T>> {
    return groupByToSet(LinkedHashMap(), keySelector)
}

/**
 * Groups values returned by the [valueTransform] function applied to each element of the original collection
 * by the key returned by the given [keySelector] function applied to the element
 * and returns a map where each group key is associated with a list of corresponding values.
 *
 * The returned map preserves the entry iteration order of the keys produced from the original collection.
 *
 * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
 */
public inline fun <T, K, V> Set<T>.groupBySet(keySelector: (T) -> K, valueTransform: (T) -> V): Map<K, Set<V>> {
    return groupByToSet(LinkedHashMap<K, MutableSet<V>>(), keySelector, valueTransform)
}

/**
 * Groups elements of the original collection by the key returned by the given [keySelector] function
 * applied to each element and puts to the [destination] map each group key associated with a list of corresponding elements.
 *
 * @return The [destination] map.
 *
 * @sample samples.collections.Collections.Transformations.groupBy
 */
public inline fun <T, K, M : MutableMap<in K, MutableSet<T>>> Set<T>.groupByToSet(destination: M, keySelector: (T) -> K): M {
    for (element in this) {
        val key = keySelector(element)
        val list = destination.getOrPut(key) { LinkedHashSet() }
        list.add(element)
    }
    return destination
}

/**
 * Groups values returned by the [valueTransform] function applied to each element of the original collection
 * by the key returned by the given [keySelector] function applied to the element
 * and puts to the [destination] map each group key associated with a list of corresponding values.
 *
 * @return The [destination] map.
 *
 * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
 */
public inline fun <T, K, V, M : MutableMap<in K, MutableSet<V>>> Set<T>.groupByToSet(destination: M, keySelector: (T) -> K, valueTransform: (T) -> V): M {
    for (element in this) {
        val key = keySelector(element)
        val list = destination.getOrPut(key) { LinkedHashSet<V>() }
        list.add(valueTransform(element))
    }
    return destination
}