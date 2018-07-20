package org.platypus.model.field.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003:\u0001.B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ5\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0001\u0010\u001f\"\u0004\b\u0002\u0010\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H\u001e0!2\u0006\u0010\"\u001a\u0002H\u001fH\u0016\u00a2\u0006\u0002\u0010#J5\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0001\u0010$\"\u0004\b\u0002\u0010\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u0002H$\u0012\u0004\u0012\u0002H\u001e0%2\u0006\u0010&\u001a\u0002H$H\u0016\u00a2\u0006\u0002\u0010\'J%\u0010(\u001a\u00020)2\u001d\u0010*\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,\u0012\u0004\u0012\u00020)0+\u00a2\u0006\u0002\b-R$\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006/"}, d2 = {"Lorg/platypus/model/field/impl/StringField;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/model/field/impl/SimpleField;", "", "name", "model", "slots", "Lorg/platypus/model/field/api/FieldSlotsImpl;", "defaultLength", "", "defaultL10n", "", "(Ljava/lang/String;Lorg/platypus/model/Model;Lorg/platypus/model/field/api/FieldSlotsImpl;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "<set-?>", "l10n", "getL10n", "()Z", "setL10n", "(Z)V", "length", "getLength", "()I", "setLength", "(I)V", "type", "Lorg/platypus/model/field/api/type/SqlFieldType;", "getType", "()Lorg/platypus/model/field/api/type/SqlFieldType;", "accept", "RETURN", "PARAM_TYPE", "visitor", "Lorg/platypus/model/field/api/FieldVisitor;", "p", "(Lorg/platypus/model/field/api/FieldVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "PARAM", "Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "param", "(Lorg/platypus/orm/sql/expression/ExpressionVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "extends", "", "ext", "Lkotlin/Function1;", "Lorg/platypus/model/field/impl/StringField$Builder;", "Lkotlin/ExtensionFunctionType;", "Builder", "korm"})
public final class StringField<M extends org.platypus.model.Model<M>> extends org.platypus.model.field.impl.SimpleField<M, java.lang.String> {
    private int length;
    private boolean l10n;
    
    public final int getLength() {
        return 0;
    }
    
    private final void setLength(int p0) {
    }
    
    public final boolean getL10n() {
        return false;
    }
    
    private final void setL10n(boolean p0) {
    }
    
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
    
    public StringField(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    M model, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.FieldSlotsImpl<java.lang.String> slots, @org.jetbrains.annotations.Nullable()
    java.lang.Integer defaultLength, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean defaultL10n) {
        super(null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u000e\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u00032\b\u0012\u0004\u0012\u00020\u00060\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\tB%\b\u0002\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u00a2\u0006\u0002\u0010\fJ\u0014\u0010Z\u001a\u00020[2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fJ\u000e\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\u000f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00060^H\u0096\u0001R$\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000f0\u000eX\u0096\u000f\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u0006X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR5\u0010\u001f\u001a\u001f\u0012\u0013\u0012\u00110!\u00a2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u0006\u0018\u00010 X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0018\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060+X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b,\u0010\u0011R\u001a\u0010-\u001a\u0004\u0018\u00010\u0006X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b.\u0010\u001c\"\u0004\b/\u0010\u001eR\u001a\u00100\u001a\u0004\u0018\u00010\u0015X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b1\u0010\u0017\"\u0004\b2\u0010\u0019R\u001e\u00103\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00106\u001a\u0004\b4\u0010\u0017\"\u0004\b5\u0010\u0019R\u001a\u00107\u001a\u0004\u0018\u00010\u0006X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b8\u0010\u001c\"\u0004\b9\u0010\u001eR\u001e\u0010:\u001a\u0004\u0018\u00010;X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010@\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0013\u0010\u0007\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010C\u001a\u0004\bA\u0010BR\u001a\u0010D\u001a\u0004\u0018\u00010\u0015X\u0096\u000f\u00a2\u0006\f\u001a\u0004\bE\u0010\u0017\"\u0004\bF\u0010\u0019R\u001a\u0010G\u001a\u0004\u0018\u00010\u0015X\u0096\u000f\u00a2\u0006\f\u001a\u0004\bH\u0010\u0017\"\u0004\bI\u0010\u0019R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010J\u001a\u0004\u0018\u00010\u0015X\u0096\u000f\u00a2\u0006\f\u001a\u0004\bK\u0010\u0017\"\u0004\bL\u0010\u0019R$\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060N0\u000eX\u0096\u000f\u00a2\u0006\f\u001a\u0004\bO\u0010\u0011\"\u0004\bP\u0010\u0013R\u001a\u0010Q\u001a\u0004\u0018\u00010\u0015X\u0096\u000f\u00a2\u0006\f\u001a\u0004\bR\u0010\u0017\"\u0004\bS\u0010\u0019R\u001a\u0010T\u001a\u0004\u0018\u00010UX\u0096\u000f\u00a2\u0006\f\u001a\u0004\bV\u0010W\"\u0004\bX\u0010Y\u00a8\u0006_"}, d2 = {"Lorg/platypus/model/field/impl/StringField$Builder;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/model/field/api/ModelField$Builder;", "Lorg/platypus/model/field/impl/StringField;", "Lorg/platypus/model/field/api/MutableFieldSlots;", "", "model", "fieldName", "(Lorg/platypus/model/Model;Ljava/lang/String;)V", "slots", "Lorg/platypus/model/field/api/MutableFieldSlotsImpl;", "(Lorg/platypus/model/Model;Ljava/lang/String;Lorg/platypus/model/field/api/MutableFieldSlotsImpl;)V", "constraint", "", "Lorg/platypus/orm/OrmConstraint;", "getConstraint", "()Ljava/util/Set;", "setConstraint", "(Ljava/util/Set;)V", "copy", "", "getCopy", "()Ljava/lang/Boolean;", "setCopy", "(Ljava/lang/Boolean;)V", "default", "getDefault", "()Ljava/lang/String;", "setDefault", "(Ljava/lang/String;)V", "defaultValueFun", "Lkotlin/Function1;", "Lorg/platypus/PlatypusEnvironment;", "Lkotlin/ParameterName;", "name", "env", "getDefaultValueFun", "()Lkotlin/jvm/functions/Function1;", "setDefaultValueFun", "(Lkotlin/jvm/functions/Function1;)V", "getFieldName", "groups", "", "getGroups", "help", "getHelp", "setHelp", "index", "getIndex", "setIndex", "l10n", "getL10n", "setL10n", "Ljava/lang/Boolean;", "label", "getLabel", "setLabel", "lenght", "", "getLenght", "()Ljava/lang/Integer;", "setLenght", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getModel", "()Lorg/platypus/model/Model;", "Lorg/platypus/model/Model;", "readonly", "getReadonly", "setReadonly", "required", "getRequired", "setRequired", "store", "getStore", "setStore", "transformer", "Lorg/platypus/model/field/api/FieldTransformer;", "getTransformer", "setTransformer", "unique", "getUnique", "setUnique", "widget", "Lorg/platypus/UIWidget;", "getWidget", "()Lorg/platypus/UIWidget;", "setWidget", "(Lorg/platypus/UIWidget;)V", "add", "", "build", "toSlots", "Lorg/platypus/model/field/api/FieldSlotsImpl;", "korm"})
    public static final class Builder<M extends org.platypus.model.Model<M>> implements org.platypus.model.field.api.ModelField.Builder<M, org.platypus.model.field.impl.StringField<M>>, org.platypus.model.field.api.MutableFieldSlots<java.lang.String> {
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer lenght;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Boolean l10n;
        @org.jetbrains.annotations.NotNull()
        private final M model = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String fieldName = null;
        private final org.platypus.model.field.api.MutableFieldSlotsImpl<java.lang.String> slots = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getLenght() {
            return null;
        }
        
        public final void setLenght(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getL10n() {
            return null;
        }
        
        public final void setL10n(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        public final void add(@org.jetbrains.annotations.NotNull()
        org.platypus.orm.OrmConstraint<java.lang.String> constraint) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.platypus.model.field.impl.StringField<M> build() {
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
        
        private Builder(M model, java.lang.String fieldName, org.platypus.model.field.api.MutableFieldSlotsImpl<java.lang.String> slots) {
            super();
        }
        
        public Builder(@org.jetbrains.annotations.NotNull()
        M model, @org.jetbrains.annotations.NotNull()
        java.lang.String fieldName) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.Set<org.platypus.orm.OrmConstraint<java.lang.String>> getConstraint() {
            return null;
        }
        
        @java.lang.Override()
        public void setConstraint(@org.jetbrains.annotations.NotNull()
        java.util.Set<org.platypus.orm.OrmConstraint<java.lang.String>> p0) {
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
        public java.lang.String getDefault() {
            return null;
        }
        
        @java.lang.Override()
        public void setDefault(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public kotlin.jvm.functions.Function1<org.platypus.PlatypusEnvironment, java.lang.String> getDefaultValueFun() {
            return null;
        }
        
        @java.lang.Override()
        public void setDefaultValueFun(@org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super org.platypus.PlatypusEnvironment, java.lang.String> p0) {
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
        public java.util.Set<org.platypus.model.field.api.FieldTransformer<java.lang.String>> getTransformer() {
            return null;
        }
        
        @java.lang.Override()
        public void setTransformer(@org.jetbrains.annotations.NotNull()
        java.util.Set<org.platypus.model.field.api.FieldTransformer<java.lang.String>> p0) {
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
        public org.platypus.model.field.api.FieldSlotsImpl<java.lang.String> toSlots() {
            return null;
        }
    }
}