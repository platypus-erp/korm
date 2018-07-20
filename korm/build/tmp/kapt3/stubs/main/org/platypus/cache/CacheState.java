package org.platypus.cache;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0000j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lorg/platypus/cache/CacheState;", "", "(Ljava/lang/String;I)V", "update", "FETCHED", "PARTIALLY", "UPDATED", "NONE", "korm"})
public enum CacheState {
    /*public static final*/ FETCHED /* = new FETCHED() */,
    /*public static final*/ PARTIALLY /* = new PARTIALLY() */,
    /*public static final*/ UPDATED /* = new UPDATED() */,
    /*public static final*/ NONE /* = new NONE() */;
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.cache.CacheState update() {
        return null;
    }
    
    CacheState() {
    }
}