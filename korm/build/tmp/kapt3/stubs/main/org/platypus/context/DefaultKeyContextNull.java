package org.platypus.context;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0003B!\u0012\u0010\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0007J \u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00102\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0096\u0004\u00a2\u0006\u0002\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00018\u0000X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lorg/platypus/context/DefaultKeyContextNull;", "T", "", "Lorg/platypus/context/ContextKey;", "field", "Lorg/platypus/model/field/api/ModelField;", "default", "(Lorg/platypus/model/field/api/ModelField;Ljava/lang/Object;)V", "getDefault", "()Ljava/lang/Object;", "Ljava/lang/Object;", "name", "", "getName", "()Ljava/lang/String;", "of", "Lorg/platypus/context/ContextKey$Value;", "value", "(Ljava/lang/Object;)Lorg/platypus/context/ContextKey$Value;", "korm"})
public final class DefaultKeyContextNull<T extends java.lang.Object> implements org.platypus.context.ContextKey<T> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.context.ContextKey.Value<T> of(@org.jetbrains.annotations.Nullable()
    T value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public T getDefault() {
        return null;
    }
    
    public DefaultKeyContextNull(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ModelField<?, T> field, @org.jetbrains.annotations.Nullable()
    T p1_772401952) {
        super();
    }
}