package org.platypus.model.field.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u00e0\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012%\b\u0002\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u0016\u0012\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190\u0016\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u001dJ\u000e\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000IH\u0016R&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u0016X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010\u000e\u001a\u0004\u0018\u00018\u0000X\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010+\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R7\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001f\"\u0004\b1\u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\b6\u0010#\"\u0004\b7\u0010%R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00103\"\u0004\b9\u00105R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0007X\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\b:\u0010#\"\u0004\b;\u0010%R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0007X\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\b<\u0010#\"\u0004\b=\u0010%R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u0007X\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\b>\u0010#\"\u0004\b?\u0010%R&\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190\u0016X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001f\"\u0004\bA\u0010!R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\bB\u0010#\"\u0004\bC\u0010%R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G\u00a8\u0006J"}, d2 = {"Lorg/platypus/model/field/api/MutableFieldSlotsImpl;", "KOTLIN_TYPE", "Lorg/platypus/model/field/api/MutableFieldSlots;", "label", "", "help", "copy", "", "defaultValueFun", "Lkotlin/Function1;", "Lorg/platypus/PlatypusEnvironment;", "Lkotlin/ParameterName;", "name", "env", "default", "unique", "index", "groups", "", "widget", "Lorg/platypus/UIWidget;", "constraint", "", "Lorg/platypus/orm/OrmConstraint;", "transformer", "Lorg/platypus/model/field/api/FieldTransformer;", "readonly", "required", "store", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Set;Lorg/platypus/UIWidget;Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getConstraint", "()Ljava/util/Set;", "setConstraint", "(Ljava/util/Set;)V", "getCopy", "()Ljava/lang/Boolean;", "setCopy", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getDefault", "()Ljava/lang/Object;", "setDefault", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getDefaultValueFun", "()Lkotlin/jvm/functions/Function1;", "setDefaultValueFun", "(Lkotlin/jvm/functions/Function1;)V", "getGroups", "setGroups", "getHelp", "()Ljava/lang/String;", "setHelp", "(Ljava/lang/String;)V", "getIndex", "setIndex", "getLabel", "setLabel", "getReadonly", "setReadonly", "getRequired", "setRequired", "getStore", "setStore", "getTransformer", "setTransformer", "getUnique", "setUnique", "getWidget", "()Lorg/platypus/UIWidget;", "setWidget", "(Lorg/platypus/UIWidget;)V", "toSlots", "Lorg/platypus/model/field/api/FieldSlotsImpl;", "korm"})
public final class MutableFieldSlotsImpl<KOTLIN_TYPE extends java.lang.Object> implements org.platypus.model.field.api.MutableFieldSlots<KOTLIN_TYPE> {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String label;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String help;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean copy;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super org.platypus.PlatypusEnvironment, ? extends KOTLIN_TYPE> defaultValueFun;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean unique;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean index;
    @org.jetbrains.annotations.NotNull()
    private java.util.Set<java.lang.String> groups;
    @org.jetbrains.annotations.Nullable()
    private org.platypus.UIWidget widget;
    @org.jetbrains.annotations.NotNull()
    private java.util.Set<org.platypus.orm.OrmConstraint<KOTLIN_TYPE>> constraint;
    @org.jetbrains.annotations.NotNull()
    private java.util.Set<org.platypus.model.field.api.FieldTransformer<KOTLIN_TYPE>> transformer;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean readonly;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean required;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean store;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.FieldSlotsImpl<KOTLIN_TYPE> toSlots() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getLabel() {
        return null;
    }
    
    @java.lang.Override()
    public void setLabel(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getHelp() {
        return null;
    }
    
    @java.lang.Override()
    public void setHelp(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Boolean getCopy() {
        return null;
    }
    
    @java.lang.Override()
    public void setCopy(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public kotlin.jvm.functions.Function1<org.platypus.PlatypusEnvironment, KOTLIN_TYPE> getDefaultValueFun() {
        return null;
    }
    
    @java.lang.Override()
    public void setDefaultValueFun(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super org.platypus.PlatypusEnvironment, ? extends KOTLIN_TYPE> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public KOTLIN_TYPE getDefault() {
        return null;
    }
    
    @java.lang.Override()
    public void setDefault(@org.jetbrains.annotations.Nullable()
    KOTLIN_TYPE p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Boolean getUnique() {
        return null;
    }
    
    @java.lang.Override()
    public void setUnique(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Boolean getIndex() {
        return null;
    }
    
    @java.lang.Override()
    public void setIndex(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<java.lang.String> getGroups() {
        return null;
    }
    
    public void setGroups(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.platypus.UIWidget getWidget() {
        return null;
    }
    
    @java.lang.Override()
    public void setWidget(@org.jetbrains.annotations.Nullable()
    org.platypus.UIWidget p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<org.platypus.orm.OrmConstraint<KOTLIN_TYPE>> getConstraint() {
        return null;
    }
    
    @java.lang.Override()
    public void setConstraint(@org.jetbrains.annotations.NotNull()
    java.util.Set<org.platypus.orm.OrmConstraint<KOTLIN_TYPE>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<org.platypus.model.field.api.FieldTransformer<KOTLIN_TYPE>> getTransformer() {
        return null;
    }
    
    @java.lang.Override()
    public void setTransformer(@org.jetbrains.annotations.NotNull()
    java.util.Set<org.platypus.model.field.api.FieldTransformer<KOTLIN_TYPE>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Boolean getReadonly() {
        return null;
    }
    
    @java.lang.Override()
    public void setReadonly(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Boolean getRequired() {
        return null;
    }
    
    @java.lang.Override()
    public void setRequired(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Boolean getStore() {
        return null;
    }
    
    @java.lang.Override()
    public void setStore(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    public MutableFieldSlotsImpl(@org.jetbrains.annotations.Nullable()
    java.lang.String label, @org.jetbrains.annotations.Nullable()
    java.lang.String help, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean copy, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super org.platypus.PlatypusEnvironment, ? extends KOTLIN_TYPE> defaultValueFun, @org.jetbrains.annotations.Nullable()
    KOTLIN_TYPE p4_772401952, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean unique, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean index, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.Nullable()
    org.platypus.UIWidget widget, @org.jetbrains.annotations.NotNull()
    java.util.Set<org.platypus.orm.OrmConstraint<KOTLIN_TYPE>> constraint, @org.jetbrains.annotations.NotNull()
    java.util.Set<org.platypus.model.field.api.FieldTransformer<KOTLIN_TYPE>> transformer, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean readonly, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean required, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean store) {
        super();
    }
    
    public MutableFieldSlotsImpl() {
        super();
    }
}