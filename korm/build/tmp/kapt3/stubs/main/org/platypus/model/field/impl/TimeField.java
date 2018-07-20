package org.platypus.model.field.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u001fB#\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u00a2\u0006\u0002\u0010\nJ5\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0001\u0010\u0011\"\u0004\b\u0002\u0010\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u00100\u00132\u0006\u0010\u0014\u001a\u0002H\u0011H\u0016\u00a2\u0006\u0002\u0010\u0015J5\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0001\u0010\u0016\"\u0004\b\u0002\u0010\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\u00100\u00172\u0006\u0010\u0018\u001a\u0002H\u0016H\u0016\u00a2\u0006\u0002\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0000\u00a2\u0006\u0002\b\u001eR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006 "}, d2 = {"Lorg/platypus/model/field/impl/TimeField;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/model/field/impl/SimpleField;", "Ljava/time/LocalTime;", "name", "", "model", "slots", "Lorg/platypus/model/field/api/FieldSlotsImpl;", "(Ljava/lang/String;Lorg/platypus/model/Model;Lorg/platypus/model/field/api/FieldSlotsImpl;)V", "type", "Lorg/platypus/model/field/api/type/SqlFieldType;", "getType", "()Lorg/platypus/model/field/api/type/SqlFieldType;", "accept", "RETURN", "PARAM_TYPE", "visitor", "Lorg/platypus/model/field/api/FieldVisitor;", "p", "(Lorg/platypus/model/field/api/FieldVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "PARAM", "Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "param", "(Lorg/platypus/orm/sql/expression/ExpressionVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "merge", "", "f", "Lorg/platypus/model/field/impl/TimeField$Builder;", "merge$korm", "Builder", "korm"})
public final class TimeField<M extends org.platypus.model.Model<M>> extends org.platypus.model.field.impl.SimpleField<M, java.time.LocalTime> {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.type.SqlFieldType getType() {
        return null;
    }
    
    public final void merge$korm(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.TimeField.Builder<M> f) {
    }
    
    @java.lang.Override()
    public <PARAM_TYPE extends java.lang.Object, RETURN extends java.lang.Object>RETURN accept(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.FieldVisitor<? super PARAM_TYPE, ? extends RETURN> visitor, PARAM_TYPE p) {
        return null;
    }
    
    @java.lang.Override()
    public <PARAM extends java.lang.Object, RETURN extends java.lang.Object>RETURN accept(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.ExpressionVisitor<PARAM, RETURN> visitor, PARAM param) {
        return null;
    }
    
    public TimeField(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    M model, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.FieldSlotsImpl<java.time.LocalTime> slots) {
        super(null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u000e\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u00032\b\u0012\u0004\u0012\u00020\u00060\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nB%\b\u0002\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u00a2\u0006\u0002\u0010\rJ\u0014\u0010R\u001a\u00020S2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010J\u000e\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\u000f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00060VH\u0096\u0001R$\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00100\u000fX\u0096\u000f\u00a2\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u0006X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR5\u0010 \u001a\u001f\u0012\u0013\u0012\u00110\"\u00a2\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u0006\u0018\u00010!X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0-X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b.\u0010\u0012R\u001a\u0010/\u001a\u0004\u0018\u00010\tX\u0096\u000f\u00a2\u0006\f\u001a\u0004\b0\u0010+\"\u0004\b1\u00102R\u001a\u00103\u001a\u0004\u0018\u00010\u0016X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b4\u0010\u0018\"\u0004\b5\u0010\u001aR\u001a\u00106\u001a\u0004\u0018\u00010\tX\u0096\u000f\u00a2\u0006\f\u001a\u0004\b7\u0010+\"\u0004\b8\u00102R\u0013\u0010\u0007\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010;\u001a\u0004\b9\u0010:R\u001a\u0010<\u001a\u0004\u0018\u00010\u0016X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b=\u0010\u0018\"\u0004\b>\u0010\u001aR\u001a\u0010?\u001a\u0004\u0018\u00010\u0016X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b@\u0010\u0018\"\u0004\bA\u0010\u001aR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010B\u001a\u0004\u0018\u00010\u0016X\u0096\u000f\u00a2\u0006\f\u001a\u0004\bC\u0010\u0018\"\u0004\bD\u0010\u001aR$\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060F0\u000fX\u0096\u000f\u00a2\u0006\f\u001a\u0004\bG\u0010\u0012\"\u0004\bH\u0010\u0014R\u001a\u0010I\u001a\u0004\u0018\u00010\u0016X\u0096\u000f\u00a2\u0006\f\u001a\u0004\bJ\u0010\u0018\"\u0004\bK\u0010\u001aR\u001a\u0010L\u001a\u0004\u0018\u00010MX\u0096\u000f\u00a2\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010Q\u00a8\u0006W"}, d2 = {"Lorg/platypus/model/field/impl/TimeField$Builder;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/model/field/api/ModelField$Builder;", "Lorg/platypus/model/field/impl/TimeField;", "Lorg/platypus/model/field/api/MutableFieldSlots;", "Ljava/time/LocalTime;", "model", "fieldName", "", "(Lorg/platypus/model/Model;Ljava/lang/String;)V", "slots", "Lorg/platypus/model/field/api/MutableFieldSlotsImpl;", "(Lorg/platypus/model/Model;Ljava/lang/String;Lorg/platypus/model/field/api/MutableFieldSlotsImpl;)V", "constraint", "", "Lorg/platypus/orm/OrmConstraint;", "getConstraint", "()Ljava/util/Set;", "setConstraint", "(Ljava/util/Set;)V", "copy", "", "getCopy", "()Ljava/lang/Boolean;", "setCopy", "(Ljava/lang/Boolean;)V", "default", "getDefault", "()Ljava/time/LocalTime;", "setDefault", "(Ljava/time/LocalTime;)V", "defaultValueFun", "Lkotlin/Function1;", "Lorg/platypus/PlatypusEnvironment;", "Lkotlin/ParameterName;", "name", "env", "getDefaultValueFun", "()Lkotlin/jvm/functions/Function1;", "setDefaultValueFun", "(Lkotlin/jvm/functions/Function1;)V", "getFieldName", "()Ljava/lang/String;", "groups", "", "getGroups", "help", "getHelp", "setHelp", "(Ljava/lang/String;)V", "index", "getIndex", "setIndex", "label", "getLabel", "setLabel", "getModel", "()Lorg/platypus/model/Model;", "Lorg/platypus/model/Model;", "readonly", "getReadonly", "setReadonly", "required", "getRequired", "setRequired", "store", "getStore", "setStore", "transformer", "Lorg/platypus/model/field/api/FieldTransformer;", "getTransformer", "setTransformer", "unique", "getUnique", "setUnique", "widget", "Lorg/platypus/UIWidget;", "getWidget", "()Lorg/platypus/UIWidget;", "setWidget", "(Lorg/platypus/UIWidget;)V", "add", "", "build", "toSlots", "Lorg/platypus/model/field/api/FieldSlotsImpl;", "korm"})
    public static final class Builder<M extends org.platypus.model.Model<M>> implements org.platypus.model.field.api.ModelField.Builder<M, org.platypus.model.field.impl.TimeField<M>>, org.platypus.model.field.api.MutableFieldSlots<java.time.LocalTime> {
        @org.jetbrains.annotations.NotNull()
        private final M model = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String fieldName = null;
        private final org.platypus.model.field.api.MutableFieldSlotsImpl<java.time.LocalTime> slots = null;
        
        public final void add(@org.jetbrains.annotations.NotNull()
        org.platypus.orm.OrmConstraint<java.time.LocalTime> constraint) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.platypus.model.field.impl.TimeField<M> build() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final M getModel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFieldName() {
            return null;
        }
        
        private Builder(M model, java.lang.String fieldName, org.platypus.model.field.api.MutableFieldSlotsImpl<java.time.LocalTime> slots) {
            super();
        }
        
        public Builder(@org.jetbrains.annotations.NotNull()
        M model, @org.jetbrains.annotations.NotNull()
        java.lang.String fieldName) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.Set<org.platypus.orm.OrmConstraint<java.time.LocalTime>> getConstraint() {
            return null;
        }
        
        @java.lang.Override()
        public void setConstraint(@org.jetbrains.annotations.NotNull()
        java.util.Set<org.platypus.orm.OrmConstraint<java.time.LocalTime>> p0) {
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
        public java.time.LocalTime getDefault() {
            return null;
        }
        
        @java.lang.Override()
        public void setDefault(@org.jetbrains.annotations.Nullable()
        java.time.LocalTime p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public kotlin.jvm.functions.Function1<org.platypus.PlatypusEnvironment, java.time.LocalTime> getDefaultValueFun() {
            return null;
        }
        
        @java.lang.Override()
        public void setDefaultValueFun(@org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super org.platypus.PlatypusEnvironment, java.time.LocalTime> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.Set<java.lang.String> getGroups() {
            return null;
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
        public java.lang.Boolean getIndex() {
            return null;
        }
        
        @java.lang.Override()
        public void setIndex(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
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
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.Set<org.platypus.model.field.api.FieldTransformer<java.time.LocalTime>> getTransformer() {
            return null;
        }
        
        @java.lang.Override()
        public void setTransformer(@org.jetbrains.annotations.NotNull()
        java.util.Set<org.platypus.model.field.api.FieldTransformer<java.time.LocalTime>> p0) {
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
        public org.platypus.UIWidget getWidget() {
            return null;
        }
        
        @java.lang.Override()
        public void setWidget(@org.jetbrains.annotations.Nullable()
        org.platypus.UIWidget p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.platypus.model.field.api.FieldSlotsImpl<java.time.LocalTime> toSlots() {
            return null;
        }
    }
}