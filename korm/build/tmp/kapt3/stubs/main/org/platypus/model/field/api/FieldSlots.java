package org.platypus.model.field.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u001e\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR/\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0006\u0012\u0004\u0018\u00018\u00000\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0007R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u0015X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u000bR\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u0015X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0012\u0010\u001e\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u000bR\u0012\u0010 \u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u000bR\u0012\u0010\"\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010\u000bR\u001e\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000%0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010\u0007R\u0012\u0010\'\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b(\u0010\u000bR\u0014\u0010)\u001a\u0004\u0018\u00010*X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b+\u0010,\u00a8\u0006-"}, d2 = {"Lorg/platypus/model/field/api/FieldSlots;", "KOTLIN_TYPE", "", "constraint", "", "Lorg/platypus/orm/OrmConstraint;", "getConstraint", "()Ljava/util/Set;", "copy", "", "getCopy", "()Z", "defaultValueFun", "Lkotlin/Function1;", "Lorg/platypus/PlatypusEnvironment;", "Lkotlin/ParameterName;", "name", "env", "getDefaultValueFun", "()Lkotlin/jvm/functions/Function1;", "groups", "", "getGroups", "help", "getHelp", "()Ljava/lang/String;", "index", "getIndex", "label", "getLabel", "readonly", "getReadonly", "required", "getRequired", "store", "getStore", "transformer", "Lorg/platypus/model/field/api/FieldTransformer;", "getTransformer", "unique", "getUnique", "widget", "Lorg/platypus/UIWidget;", "getWidget", "()Lorg/platypus/UIWidget;", "korm"})
public abstract interface FieldSlots<KOTLIN_TYPE extends java.lang.Object> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getLabel();
    
    public abstract boolean getCopy();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getHelp();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.jvm.functions.Function1<org.platypus.PlatypusEnvironment, KOTLIN_TYPE> getDefaultValueFun();
    
    public abstract boolean getUnique();
    
    public abstract boolean getIndex();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Set<java.lang.String> getGroups();
    
    @org.jetbrains.annotations.Nullable()
    public abstract org.platypus.UIWidget getWidget();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Set<org.platypus.orm.OrmConstraint<KOTLIN_TYPE>> getConstraint();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Set<org.platypus.model.field.api.FieldTransformer<KOTLIN_TYPE>> getTransformer();
    
    public abstract boolean getReadonly();
    
    public abstract boolean getRequired();
    
    public abstract boolean getStore();
}