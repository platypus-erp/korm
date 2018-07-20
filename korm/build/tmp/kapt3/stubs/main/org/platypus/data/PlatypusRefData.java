package org.platypus.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B>\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\'\u0010\u0007\u001a#\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\b\u00a2\u0006\u0002\u0010\u000eJ\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0016\u001a\u00020\tH\u0086\u0002R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R/\u0010\u0007\u001a#\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lorg/platypus/data/PlatypusRefData;", "M", "Lorg/platypus/model/Model;", "", "model", "ref", "", "loader", "Lkotlin/Function1;", "Lorg/platypus/PlatypusEnvironment;", "Lkotlin/ParameterName;", "name", "e", "Lorg/platypus/entity/Record;", "(Lorg/platypus/model/Model;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "element", "getElement", "()Lorg/platypus/entity/Record;", "setElement", "(Lorg/platypus/entity/Record;)V", "Lorg/platypus/model/Model;", "invoke", "env", "korm"})
public final class PlatypusRefData<M extends org.platypus.model.Model<M>> {
    @org.jetbrains.annotations.Nullable()
    private org.platypus.entity.Record<M> element;
    private final M model = null;
    private final java.lang.String ref = null;
    private final kotlin.jvm.functions.Function1<org.platypus.PlatypusEnvironment, org.platypus.entity.Record<M>> loader = null;
    
    @org.jetbrains.annotations.Nullable()
    public final org.platypus.entity.Record<M> getElement() {
        return null;
    }
    
    public final void setElement(@org.jetbrains.annotations.Nullable()
    org.platypus.entity.Record<M> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.entity.Record<M> invoke(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env) {
        return null;
    }
    
    public PlatypusRefData(@org.jetbrains.annotations.NotNull()
    M model, @org.jetbrains.annotations.NotNull()
    java.lang.String ref, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.PlatypusEnvironment, ? extends org.platypus.entity.Record<M>> loader) {
        super();
    }
}