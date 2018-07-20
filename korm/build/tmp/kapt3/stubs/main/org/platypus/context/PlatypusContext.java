package org.platypus.context;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u0015\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0086\u0002J!\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f\u00a2\u0006\u0002\u0010\u0011J&\u0010\u0012\u001a\u0002H\u0013\"\b\b\u0000\u0010\u0013*\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0004H\u0086\u0002\u00a2\u0006\u0002\u0010\u0014RN\u0010\u0006\u001aB\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \b*\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j \u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \b*\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lorg/platypus/context/PlatypusContext;", "", "initialContext", "", "Lorg/platypus/context/ContextKey;", "(Ljava/util/Map;)V", "context", "Ljava/util/HashMap;", "kotlin.jvm.PlatformType", "Lkotlin/collections/HashMap;", "contains", "", "key", "copy", "newCtx", "", "Lorg/platypus/context/ContextKey$Value;", "([Lorg/platypus/context/ContextKey$Value;)Lorg/platypus/context/PlatypusContext;", "get", "T", "(Lorg/platypus/context/ContextKey;)Ljava/lang/Object;", "korm"})
public final class PlatypusContext {
    private final java.util.HashMap<org.platypus.context.ContextKey<?>, java.lang.Object> context = null;
    
    public final boolean contains(@org.jetbrains.annotations.NotNull()
    org.platypus.context.ContextKey<?> key) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>T get(@org.jetbrains.annotations.NotNull()
    org.platypus.context.ContextKey<T> key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.context.PlatypusContext copy(@org.jetbrains.annotations.NotNull()
    org.platypus.context.ContextKey.Value<?>[] newCtx) {
        return null;
    }
    
    public PlatypusContext(@org.jetbrains.annotations.NotNull()
    java.util.Map<org.platypus.context.ContextKey<?>, ? extends java.lang.Object> initialContext) {
        super();
    }
    
    public PlatypusContext() {
        super();
    }
}