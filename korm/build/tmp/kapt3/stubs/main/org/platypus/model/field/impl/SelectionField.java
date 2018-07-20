package org.platypus.model.field.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00060\u0005:\u0001&B1\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0001\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\f\u00a2\u0006\u0002\u0010\rJ5\u0010\u0015\u001a\u0002H\u0016\"\u0004\b\u0002\u0010\u0017\"\u0004\b\u0003\u0010\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u00160\u00192\u0006\u0010\u001a\u001a\u0002H\u0017H\u0016\u00a2\u0006\u0002\u0010\u001bJ5\u0010\u0015\u001a\u0002H\u0016\"\u0004\b\u0002\u0010\u001c\"\u0004\b\u0003\u0010\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u00160\u001d2\u0006\u0010\u001e\u001a\u0002H\u001cH\u0016\u00a2\u0006\u0002\u0010\u001fJ+\u0010 \u001a\u00020!2#\u0010\"\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$\u0012\u0004\u0012\u00020!0#\u00a2\u0006\u0002\b%R\u0013\u0010\n\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\'"}, d2 = {"Lorg/platypus/model/field/impl/SelectionField;", "M", "Lorg/platypus/model/Model;", "D", "Lorg/platypus/entity/Selection;", "Lorg/platypus/model/field/impl/SimpleField;", "Lorg/platypus/entity/SelectionValue;", "name", "", "model", "selection", "slots", "Lorg/platypus/model/field/api/FieldSlotsImpl;", "(Ljava/lang/String;Lorg/platypus/model/Model;Lorg/platypus/entity/Selection;Lorg/platypus/model/field/api/FieldSlotsImpl;)V", "getSelection", "()Lorg/platypus/entity/Selection;", "Lorg/platypus/entity/Selection;", "type", "Lorg/platypus/model/field/api/type/SqlFieldType;", "getType", "()Lorg/platypus/model/field/api/type/SqlFieldType;", "accept", "RETURN", "PARAM_TYPE", "visitor", "Lorg/platypus/model/field/api/FieldVisitor;", "p", "(Lorg/platypus/model/field/api/FieldVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "PARAM", "Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "param", "(Lorg/platypus/orm/sql/expression/ExpressionVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "extends", "", "ext", "Lkotlin/Function1;", "Lorg/platypus/model/field/impl/SelectionField$Builder;", "Lkotlin/ExtensionFunctionType;", "Builder", "korm"})
public final class SelectionField<M extends org.platypus.model.Model<M>, D extends org.platypus.entity.Selection<D>> extends org.platypus.model.field.impl.SimpleField<M, org.platypus.entity.SelectionValue<D>> {
    @org.jetbrains.annotations.NotNull()
    private final D selection = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.type.SqlFieldType getType() {
        return null;
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
    
    @org.jetbrains.annotations.NotNull()
    public final D getSelection() {
        return null;
    }
    
    public SelectionField(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    M model, @org.jetbrains.annotations.NotNull()
    D selection, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.FieldSlotsImpl<org.platypus.entity.SelectionValue<D>> slots) {
        super(null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u000e\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u000e\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u001a\u0012\u0004\u0012\u0002H\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00060\u00052\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\b0\u0007B\u001f\b\u0016\u0012\u0006\u0010\t\u001a\u00028\u0002\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00028\u0003\u00a2\u0006\u0002\u0010\rB3\b\u0002\u0012\u0006\u0010\t\u001a\u00028\u0002\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00028\u0003\u0012\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\b0\u000f\u00a2\u0006\u0002\u0010\u0010J\u001a\u0010X\u001a\u00020Y2\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\b0\u0013J\u0014\u0010Z\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006H\u0016J\u0015\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\b0\\H\u0096\u0001R*\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\b0\u00130\u0012X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0003\u0018\u00010\bX\u0096\u000f\u00a2\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R;\u0010#\u001a%\u0012\u0013\u0012\u00110%\u00a2\u0006\f\b&\u0012\b\b\'\u0012\u0004\b\b((\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\b\u0018\u00010$X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000b00X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b1\u0010\u0015R\u001a\u00102\u001a\u0004\u0018\u00010\u000bX\u0096\u000f\u00a2\u0006\f\u001a\u0004\b3\u0010.\"\u0004\b4\u00105R\u001a\u00106\u001a\u0004\u0018\u00010\u0019X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b7\u0010\u001b\"\u0004\b8\u0010\u001dR\u001a\u00109\u001a\u0004\u0018\u00010\u000bX\u0096\u000f\u00a2\u0006\f\u001a\u0004\b:\u0010.\"\u0004\b;\u00105R\u0013\u0010\t\u001a\u00028\u0002\u00a2\u0006\n\n\u0002\u0010>\u001a\u0004\b<\u0010=R\u001a\u0010?\u001a\u0004\u0018\u00010\u0019X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b@\u0010\u001b\"\u0004\bA\u0010\u001dR\u001a\u0010B\u001a\u0004\u0018\u00010\u0019X\u0096\u000f\u00a2\u0006\f\u001a\u0004\bC\u0010\u001b\"\u0004\bD\u0010\u001dR\u0013\u0010\f\u001a\u00028\u0003\u00a2\u0006\n\n\u0002\u0010G\u001a\u0004\bE\u0010FR\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\b0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010H\u001a\u0004\u0018\u00010\u0019X\u0096\u000f\u00a2\u0006\f\u001a\u0004\bI\u0010\u001b\"\u0004\bJ\u0010\u001dR*\u0010K\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\b0L0\u0012X\u0096\u000f\u00a2\u0006\f\u001a\u0004\bM\u0010\u0015\"\u0004\bN\u0010\u0017R\u001a\u0010O\u001a\u0004\u0018\u00010\u0019X\u0096\u000f\u00a2\u0006\f\u001a\u0004\bP\u0010\u001b\"\u0004\bQ\u0010\u001dR\u001a\u0010R\u001a\u0004\u0018\u00010SX\u0096\u000f\u00a2\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W\u00a8\u0006]"}, d2 = {"Lorg/platypus/model/field/impl/SelectionField$Builder;", "M", "Lorg/platypus/model/Model;", "D", "Lorg/platypus/entity/Selection;", "Lorg/platypus/model/field/api/ModelField$Builder;", "Lorg/platypus/model/field/impl/SelectionField;", "Lorg/platypus/model/field/api/MutableFieldSlots;", "Lorg/platypus/entity/SelectionValue;", "model", "fieldName", "", "selection", "(Lorg/platypus/model/Model;Ljava/lang/String;Lorg/platypus/entity/Selection;)V", "slots", "Lorg/platypus/model/field/api/MutableFieldSlotsImpl;", "(Lorg/platypus/model/Model;Ljava/lang/String;Lorg/platypus/entity/Selection;Lorg/platypus/model/field/api/MutableFieldSlotsImpl;)V", "constraint", "", "Lorg/platypus/orm/OrmConstraint;", "getConstraint", "()Ljava/util/Set;", "setConstraint", "(Ljava/util/Set;)V", "copy", "", "getCopy", "()Ljava/lang/Boolean;", "setCopy", "(Ljava/lang/Boolean;)V", "default", "getDefault", "()Lorg/platypus/entity/SelectionValue;", "setDefault", "(Lorg/platypus/entity/SelectionValue;)V", "defaultValueFun", "Lkotlin/Function1;", "Lorg/platypus/PlatypusEnvironment;", "Lkotlin/ParameterName;", "name", "env", "getDefaultValueFun", "()Lkotlin/jvm/functions/Function1;", "setDefaultValueFun", "(Lkotlin/jvm/functions/Function1;)V", "getFieldName", "()Ljava/lang/String;", "groups", "", "getGroups", "help", "getHelp", "setHelp", "(Ljava/lang/String;)V", "index", "getIndex", "setIndex", "label", "getLabel", "setLabel", "getModel", "()Lorg/platypus/model/Model;", "Lorg/platypus/model/Model;", "readonly", "getReadonly", "setReadonly", "required", "getRequired", "setRequired", "getSelection", "()Lorg/platypus/entity/Selection;", "Lorg/platypus/entity/Selection;", "store", "getStore", "setStore", "transformer", "Lorg/platypus/model/field/api/FieldTransformer;", "getTransformer", "setTransformer", "unique", "getUnique", "setUnique", "widget", "Lorg/platypus/UIWidget;", "getWidget", "()Lorg/platypus/UIWidget;", "setWidget", "(Lorg/platypus/UIWidget;)V", "add", "", "build", "toSlots", "Lorg/platypus/model/field/api/FieldSlotsImpl;", "korm"})
    public static final class Builder<M extends org.platypus.model.Model<M>, D extends org.platypus.entity.Selection<D>> implements org.platypus.model.field.api.ModelField.Builder<M, org.platypus.model.field.impl.SelectionField<M, D>>, org.platypus.model.field.api.MutableFieldSlots<org.platypus.entity.SelectionValue<D>> {
        @org.jetbrains.annotations.NotNull()
        private final M model = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String fieldName = null;
        @org.jetbrains.annotations.NotNull()
        private final D selection = null;
        private final org.platypus.model.field.api.MutableFieldSlotsImpl<org.platypus.entity.SelectionValue<D>> slots = null;
        
        public final void add(@org.jetbrains.annotations.NotNull()
        org.platypus.orm.OrmConstraint<org.platypus.entity.SelectionValue<D>> constraint) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.platypus.model.field.impl.SelectionField<M, D> build() {
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
        
        @org.jetbrains.annotations.NotNull()
        public final D getSelection() {
            return null;
        }
        
        private Builder(M model, java.lang.String fieldName, D selection, org.platypus.model.field.api.MutableFieldSlotsImpl<org.platypus.entity.SelectionValue<D>> slots) {
            super();
        }
        
        public Builder(@org.jetbrains.annotations.NotNull()
        M model, @org.jetbrains.annotations.NotNull()
        java.lang.String fieldName, @org.jetbrains.annotations.NotNull()
        D selection) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.Set<org.platypus.orm.OrmConstraint<org.platypus.entity.SelectionValue<D>>> getConstraint() {
            return null;
        }
        
        @java.lang.Override()
        public void setConstraint(@org.jetbrains.annotations.NotNull()
        java.util.Set<org.platypus.orm.OrmConstraint<org.platypus.entity.SelectionValue<D>>> p0) {
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
        public org.platypus.entity.SelectionValue<D> getDefault() {
            return null;
        }
        
        @java.lang.Override()
        public void setDefault(@org.jetbrains.annotations.Nullable()
        org.platypus.entity.SelectionValue<D> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public kotlin.jvm.functions.Function1<org.platypus.PlatypusEnvironment, org.platypus.entity.SelectionValue<D>> getDefaultValueFun() {
            return null;
        }
        
        @java.lang.Override()
        public void setDefaultValueFun(@org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super org.platypus.PlatypusEnvironment, org.platypus.entity.SelectionValue<D>> p0) {
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
        public java.util.Set<org.platypus.model.field.api.FieldTransformer<org.platypus.entity.SelectionValue<D>>> getTransformer() {
            return null;
        }
        
        @java.lang.Override()
        public void setTransformer(@org.jetbrains.annotations.NotNull()
        java.util.Set<org.platypus.model.field.api.FieldTransformer<org.platypus.entity.SelectionValue<D>>> p0) {
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
        public org.platypus.model.field.api.FieldSlotsImpl<org.platypus.entity.SelectionValue<D>> toSlots() {
            return null;
        }
    }
}