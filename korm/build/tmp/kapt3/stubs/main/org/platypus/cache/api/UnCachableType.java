package org.platypus.cache.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\n\b\u0001\u0010\u0003 \u0001*\u00020\u00022\u00020\u0002J\u0015\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/platypus/cache/api/UnCachableType;", "CACHE_TYPE", "", "REAL_TYPE", "fromCacheValue", "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "korm"})
public abstract interface UnCachableType<CACHE_TYPE extends java.lang.Object, REAL_TYPE extends java.lang.Object> {
    
    /**
     * * Convert the [value] of the type [CACHE_TYPE] to the [REAL_TYPE]
     *     * if the conversion can't be performed then this should throw an [CacheTransformException]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract REAL_TYPE fromCacheValue(@org.jetbrains.annotations.NotNull()
    CACHE_TYPE value);
}