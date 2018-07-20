package org.platypus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J)\u0010\u0003\u001a\u00028\u00002\u001a\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\"\u0006\u0012\u0002\b\u00030\u0006H&\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lorg/platypus/ContextAble;", "T", "", "withContext", "vals", "", "Lorg/platypus/context/ContextKey$Value;", "([Lorg/platypus/context/ContextKey$Value;)Ljava/lang/Object;", "korm"})
public abstract interface ContextAble<T extends java.lang.Object> {
    
    public abstract T withContext(@org.jetbrains.annotations.NotNull()
    org.platypus.context.ContextKey.Value<?>... vals);
}