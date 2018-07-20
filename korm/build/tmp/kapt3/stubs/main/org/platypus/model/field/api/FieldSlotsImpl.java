package org.platypus.model.field.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u00d4\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012%\b\u0002\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u0016\u0012\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010C\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0015\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u0016H\u00c6\u0003J\u0015\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190\u0016H\u00c6\u0003J\t\u0010F\u001a\u00020\u0006H\u00c6\u0003J\t\u0010G\u001a\u00020\u0006H\u00c6\u0003J\t\u0010H\u001a\u00020\u0006H\u00c6\u0003J\t\u0010I\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0010\u0010K\u001a\u0004\u0018\u00018\u0000H\u00c2\u0003\u00a2\u0006\u0002\u0010LJ&\u0010M\u001a\u001f\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0006\u0012\u0004\u0018\u00018\u00000\nH\u00c6\u0003J\t\u0010N\u001a\u00020\u0006H\u00c6\u0003J\t\u0010O\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u00e3\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u00002%\b\u0002\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u00162\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010RJ\u0013\u0010S\u001a\u00020\u00062\b\u0010T\u001a\u0004\u0018\u00010UH\u00d6\u0003J\t\u0010V\u001a\u00020WH\u00d6\u0001J!\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000YH\u0000\u00a2\u0006\u0002\bZJ\t\u0010[\u001a\u00020\u0004H\u00d6\u0001R&\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190\u0016X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0012\u0010\b\u001a\u0004\u0018\u00018\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010&R7\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0006\u0012\u0004\u0018\u00018\u00000\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001f\"\u0004\b,\u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\u0010\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010#\"\u0004\b2\u0010%R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R\u001a\u0010\u001a\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010#\"\u0004\b6\u0010%R\u001a\u0010\u001b\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010#\"\u0004\b8\u0010%R\u001a\u0010\u001c\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010#\"\u0004\b:\u0010%R&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u0016X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001f\"\u0004\b<\u0010!R\u001a\u0010\u000f\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010#\"\u0004\b>\u0010%R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B\u00a8\u0006\\"}, d2 = {"Lorg/platypus/model/field/api/FieldSlotsImpl;", "KOTLIN_TYPE", "Lorg/platypus/model/field/api/FieldSlots;", "label", "", "copy", "", "help", "default", "defaultValueFun", "Lkotlin/Function1;", "Lorg/platypus/PlatypusEnvironment;", "Lkotlin/ParameterName;", "name", "env", "unique", "index", "groups", "", "widget", "Lorg/platypus/UIWidget;", "transformer", "", "Lorg/platypus/model/field/api/FieldTransformer;", "constraint", "Lorg/platypus/orm/OrmConstraint;", "readonly", "required", "store", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;ZZLjava/util/Set;Lorg/platypus/UIWidget;Ljava/util/Set;Ljava/util/Set;ZZZ)V", "getConstraint", "()Ljava/util/Set;", "setConstraint", "(Ljava/util/Set;)V", "getCopy", "()Z", "setCopy", "(Z)V", "Ljava/lang/Object;", "getDefaultValueFun", "()Lkotlin/jvm/functions/Function1;", "setDefaultValueFun", "(Lkotlin/jvm/functions/Function1;)V", "getGroups", "setGroups", "getHelp", "()Ljava/lang/String;", "setHelp", "(Ljava/lang/String;)V", "getIndex", "setIndex", "getLabel", "setLabel", "getReadonly", "setReadonly", "getRequired", "setRequired", "getStore", "setStore", "getTransformer", "setTransformer", "getUnique", "setUnique", "getWidget", "()Lorg/platypus/UIWidget;", "setWidget", "(Lorg/platypus/UIWidget;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "()Ljava/lang/Object;", "component5", "component6", "component7", "component8", "component9", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;ZZLjava/util/Set;Lorg/platypus/UIWidget;Ljava/util/Set;Ljava/util/Set;ZZZ)Lorg/platypus/model/field/api/FieldSlotsImpl;", "equals", "other", "", "hashCode", "", "merge", "Lorg/platypus/model/field/api/MutableFieldSlots;", "merge$korm", "toString", "korm"})
public final class FieldSlotsImpl<KOTLIN_TYPE extends java.lang.Object> implements org.platypus.model.field.api.FieldSlots<KOTLIN_TYPE> {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String label;
    private boolean copy;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String help;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super org.platypus.PlatypusEnvironment, ? extends KOTLIN_TYPE> defaultValueFun;
    private boolean unique;
    private boolean index;
    @org.jetbrains.annotations.NotNull()
    private java.util.Set<java.lang.String> groups;
    @org.jetbrains.annotations.Nullable()
    private org.platypus.UIWidget widget;
    @org.jetbrains.annotations.NotNull()
    private java.util.Set<org.platypus.model.field.api.FieldTransformer<KOTLIN_TYPE>> transformer;
    @org.jetbrains.annotations.NotNull()
    private java.util.Set<org.platypus.orm.OrmConstraint<KOTLIN_TYPE>> constraint;
    private boolean readonly;
    private boolean required;
    private boolean store;
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.api.FieldSlots<KOTLIN_TYPE> merge$korm(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.MutableFieldSlots<KOTLIN_TYPE> other) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getLabel() {
        return null;
    }
    
    public void setLabel(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public boolean getCopy() {
        return false;
    }
    
    public void setCopy(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getHelp() {
        return null;
    }
    
    public void setHelp(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.jvm.functions.Function1<org.platypus.PlatypusEnvironment, KOTLIN_TYPE> getDefaultValueFun() {
        return null;
    }
    
    public void setDefaultValueFun(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.PlatypusEnvironment, ? extends KOTLIN_TYPE> p0) {
    }
    
    @java.lang.Override()
    public boolean getUnique() {
        return false;
    }
    
    public void setUnique(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean getIndex() {
        return false;
    }
    
    public void setIndex(boolean p0) {
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
    
    public void setWidget(@org.jetbrains.annotations.Nullable()
    org.platypus.UIWidget p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<org.platypus.model.field.api.FieldTransformer<KOTLIN_TYPE>> getTransformer() {
        return null;
    }
    
    public void setTransformer(@org.jetbrains.annotations.NotNull()
    java.util.Set<org.platypus.model.field.api.FieldTransformer<KOTLIN_TYPE>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<org.platypus.orm.OrmConstraint<KOTLIN_TYPE>> getConstraint() {
        return null;
    }
    
    public void setConstraint(@org.jetbrains.annotations.NotNull()
    java.util.Set<org.platypus.orm.OrmConstraint<KOTLIN_TYPE>> p0) {
    }
    
    @java.lang.Override()
    public boolean getReadonly() {
        return false;
    }
    
    public void setReadonly(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean getRequired() {
        return false;
    }
    
    public void setRequired(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean getStore() {
        return false;
    }
    
    public void setStore(boolean p0) {
    }
    
    public FieldSlotsImpl(@org.jetbrains.annotations.Nullable()
    java.lang.String label, boolean copy, @org.jetbrains.annotations.Nullable()
    java.lang.String help, @org.jetbrains.annotations.Nullable()
    KOTLIN_TYPE p3_772401952, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.PlatypusEnvironment, ? extends KOTLIN_TYPE> defaultValueFun, boolean unique, boolean index, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.Nullable()
    org.platypus.UIWidget widget, @org.jetbrains.annotations.NotNull()
    java.util.Set<org.platypus.model.field.api.FieldTransformer<KOTLIN_TYPE>> transformer, @org.jetbrains.annotations.NotNull()
    java.util.Set<org.platypus.orm.OrmConstraint<KOTLIN_TYPE>> constraint, boolean readonly, boolean required, boolean store) {
        super();
    }
    
    public FieldSlotsImpl() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    private final KOTLIN_TYPE component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<org.platypus.PlatypusEnvironment, KOTLIN_TYPE> component5() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean component7() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.platypus.UIWidget component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.platypus.model.field.api.FieldTransformer<KOTLIN_TYPE>> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.platypus.orm.OrmConstraint<KOTLIN_TYPE>> component11() {
        return null;
    }
    
    public final boolean component12() {
        return false;
    }
    
    public final boolean component13() {
        return false;
    }
    
    public final boolean component14() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.api.FieldSlotsImpl<KOTLIN_TYPE> copy(@org.jetbrains.annotations.Nullable()
    java.lang.String label, boolean copy, @org.jetbrains.annotations.Nullable()
    java.lang.String help, @org.jetbrains.annotations.Nullable()
    KOTLIN_TYPE p3_772401952, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.PlatypusEnvironment, ? extends KOTLIN_TYPE> defaultValueFun, boolean unique, boolean index, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups, @org.jetbrains.annotations.Nullable()
    org.platypus.UIWidget widget, @org.jetbrains.annotations.NotNull()
    java.util.Set<org.platypus.model.field.api.FieldTransformer<KOTLIN_TYPE>> transformer, @org.jetbrains.annotations.NotNull()
    java.util.Set<org.platypus.orm.OrmConstraint<KOTLIN_TYPE>> constraint, boolean readonly, boolean required, boolean store) {
        return null;
    }
    
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(java.lang.Object p0) {
        return false;
    }
}