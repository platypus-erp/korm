package org.platypus.context;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J \u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\r2\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0096\u0004\u00a2\u0006\u0002\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00018\u0000X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lorg/platypus/context/ContextKeyNull;", "T", "Lorg/platypus/context/ContextKey;", "name", "", "(Ljava/lang/String;)V", "default", "getDefault", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getName", "()Ljava/lang/String;", "of", "Lorg/platypus/context/ContextKey$Value;", "value", "(Ljava/lang/Object;)Lorg/platypus/context/ContextKey$Value;", "korm"})
public final class ContextKeyNull<T extends java.lang.Object> implements org.platypus.context.ContextKey<T> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public T getDefault() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.context.ContextKey.Value<T> of(@org.jetbrains.annotations.Nullable()
    T value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
    
    public ContextKeyNull(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        super();
    }
}