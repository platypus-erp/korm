package org.platypus.cache.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\n\b\u0001\u0010\u0003 \u0001*\u00020\u00022\u00020\u0002J\u0019\u0010\u0004\u001a\u0004\u0018\u00018\u00012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/platypus/cache/api/CachableType;", "IN_TYPE", "", "OUT_TYPE", "toCacheValue", "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "korm"})
public abstract interface CachableType<IN_TYPE extends java.lang.Object, OUT_TYPE extends java.lang.Object> {
    
    /**
     * * Convert the given [value] to the [OUT_TYPE] of the class
     *     * if the conversion can't be performed then this should throw an [CacheTransformException]
     */
    @org.jetbrains.annotations.Nullable()
    public abstract OUT_TYPE toCacheValue(@org.jetbrains.annotations.Nullable()
    IN_TYPE value);
}