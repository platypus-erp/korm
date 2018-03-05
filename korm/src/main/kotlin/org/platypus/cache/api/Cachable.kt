package org.platypus.cache.api

interface CachableType<in IN_TYPE : Any, out OUT_TYPE : Any> {

    /**
     * Convert the given [value] to the [OUT_TYPE] of the class
     * if the conversion can't be performed then this should throw an [CacheTransformException]
     */
    fun toCacheValue(value: IN_TYPE?): OUT_TYPE?
}

interface UnCachableType<in CACHE_TYPE : Any, out REAL_TYPE : Any> {

    /**
     * Convert the [value] of the type [CACHE_TYPE] to the [REAL_TYPE]
     * if the conversion can't be performed then this should throw an [CacheTransformException]
     */
    fun fromCacheValue(value: CACHE_TYPE): REAL_TYPE
}

class CacheTransformException(msg: String) : IllegalArgumentException(msg)