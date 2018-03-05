package org.platypus.cache.api

class SimpleCacheValue<TYPE : Any>(val value: TYPE) : CachableType<TYPE, TYPE>{
    override fun toCacheValue(value: TYPE?): TYPE? = value
}