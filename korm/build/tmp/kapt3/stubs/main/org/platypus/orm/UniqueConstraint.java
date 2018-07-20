package org.platypus.orm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B/\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\t0\b\u00a2\u0006\u0002\u0010\nR\u001b\u0010\u000b\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR!\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r\u00a8\u0006\u0013"}, d2 = {"Lorg/platypus/orm/UniqueConstraint;", "M", "Lorg/platypus/model/Model;", "", "name", "", "msg", "fields", "", "Lorg/platypus/model/field/api/ModelField;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "errorMsg", "getErrorMsg", "()Ljava/lang/String;", "errorMsg$delegate", "Lkotlin/Lazy;", "getFields", "()Ljava/util/Set;", "getName", "korm"})
public final class UniqueConstraint<M extends org.platypus.model.Model<M>> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy errorMsg$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final java.lang.String msg = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<org.platypus.model.field.api.ModelField<M, ?>> fields = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getErrorMsg() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.platypus.model.field.api.ModelField<M, ?>> getFields() {
        return null;
    }
    
    public UniqueConstraint(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String msg, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends org.platypus.model.field.api.ModelField<M, ?>> fields) {
        super();
    }
}