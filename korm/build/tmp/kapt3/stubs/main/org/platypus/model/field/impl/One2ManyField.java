package org.platypus.model.field.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004:\u0001-Bd\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\n0\t\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\f\u0012\u001f\u0010\u000e\u001a\u001b\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f\u00a2\u0006\u0002\b\u0012\u00a2\u0006\u0002\u0010\u0013J5\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0002\u0010\u001f\"\u0004\b\u0003\u0010\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H\u001e0!2\u0006\u0010\"\u001a\u0002H\u001fH\u0016\u00a2\u0006\u0002\u0010#J5\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0002\u0010$\"\u0004\b\u0003\u0010\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u0002H$\u0012\u0004\u0012\u0002H\u001e0%2\u0006\u0010&\u001a\u0002H$H\u0016\u00a2\u0006\u0002\u0010\'J!\u0010(\u001a\u00020)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010+H\u0000\u00a2\u0006\u0002\b,R\u0014\u0010\u0014\u001a\u00020\u0011X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R#\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006."}, d2 = {"Lorg/platypus/model/field/impl/One2ManyField;", "M", "Lorg/platypus/model/Model;", "TM", "Lorg/platypus/model/field/impl/MutliReferenceField;", "name", "", "model", "targetField", "Lkotlin/Function0;", "Lorg/platypus/model/field/impl/Many2OneField;", "slots", "Lorg/platypus/model/field/api/FieldSlotsImpl;", "Lorg/platypus/bag/Bag;", "defaultDomain", "Lkotlin/Function1;", "Lorg/platypus/orm/sql/expression/Expression;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lorg/platypus/model/Model;Lkotlin/jvm/functions/Function0;Lorg/platypus/model/field/api/FieldSlotsImpl;Lkotlin/jvm/functions/Function1;)V", "store", "getStore", "()Z", "getTargetField", "()Lkotlin/jvm/functions/Function0;", "type", "Lorg/platypus/model/field/api/type/SqlFieldType;", "getType", "()Lorg/platypus/model/field/api/type/SqlFieldType;", "accept", "RETURN", "PARAM_TYPE", "visitor", "Lorg/platypus/model/field/api/FieldVisitor;", "p", "(Lorg/platypus/model/field/api/FieldVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "PARAM", "Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "param", "(Lorg/platypus/orm/sql/expression/ExpressionVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "merge", "", "f", "Lorg/platypus/model/field/impl/One2ManyField$Builder;", "merge$korm", "Builder", "korm"})
public final class One2ManyField<M extends org.platypus.model.Model<M>, TM extends org.platypus.model.Model<TM>> extends org.platypus.model.field.impl.MutliReferenceField<M, TM> {
    private final boolean store = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<org.platypus.model.field.impl.Many2OneField<TM, M>> targetField = null;
    
    @java.lang.Override()
    public boolean getStore() {
        return false;
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
    
    public final void merge$korm(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2ManyField.Builder<M, TM> f) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<org.platypus.model.field.impl.Many2OneField<TM, M>> getTargetField() {
        return null;
    }
    
    public One2ManyField(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    M model, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<org.platypus.model.field.impl.Many2OneField<TM, M>> targetField, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.FieldSlotsImpl<org.platypus.bag.Bag<TM>> slots, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super TM, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> defaultDomain) {
        super(null, null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u000e\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u000e\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00022\u001a\u0012\u0004\u0012\u0002H\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00050\u00042\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00070\u0006B1\b\u0016\u0012\u0006\u0010\b\u001a\u00028\u0002\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00020\r0\f\u00a2\u0006\u0002\u0010\u000eBE\b\u0002\u0012\u0006\u0010\b\u001a\u00028\u0002\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00020\r0\f\u0012\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00070\u0010\u00a2\u0006\u0002\u0010\u0011J\u001a\u0010\\\u001a\u00020]2\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00070\u0014J\u0014\u0010^\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005H\u0016J\u0015\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00070`H\u0096\u0001R*\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00070\u00140\u0013X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0096\u000f\u00a2\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\n\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u0007X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R;\u0010$\u001a%\u0012\u0013\u0012\u00110&\u00a2\u0006\f\b\'\u0012\b\b(\u0012\u0004\b\b()\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u0007\u0018\u00010%X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u0010.\u001a\u001b\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0/\u0018\u00010%\u00a2\u0006\u0002\b0\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010+R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0018\u00104\u001a\b\u0012\u0004\u0012\u00020\n05X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b6\u0010\u0016R\u001a\u00107\u001a\u0004\u0018\u00010\nX\u0096\u000f\u00a2\u0006\f\u001a\u0004\b8\u00103\"\u0004\b9\u0010:R\u001a\u0010;\u001a\u0004\u0018\u00010\u001aX\u0096\u000f\u00a2\u0006\f\u001a\u0004\b<\u0010\u001c\"\u0004\b=\u0010\u001eR\u001a\u0010>\u001a\u0004\u0018\u00010\nX\u0096\u000f\u00a2\u0006\f\u001a\u0004\b?\u00103\"\u0004\b@\u0010:R\u0013\u0010\b\u001a\u00028\u0002\u00a2\u0006\n\n\u0002\u0010C\u001a\u0004\bA\u0010BR\u001a\u0010D\u001a\u0004\u0018\u00010\u001aX\u0096\u000f\u00a2\u0006\f\u001a\u0004\bE\u0010\u001c\"\u0004\bF\u0010\u001eR\u001a\u0010G\u001a\u0004\u0018\u00010\u001aX\u0096\u000f\u00a2\u0006\f\u001a\u0004\bH\u0010\u001c\"\u0004\bI\u0010\u001eR\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00070\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010J\u001a\u0004\u0018\u00010\u001aX\u0096\u000f\u00a2\u0006\f\u001a\u0004\bK\u0010\u001c\"\u0004\bL\u0010\u001eR#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010NR*\u0010O\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00070P0\u0013X\u0096\u000f\u00a2\u0006\f\u001a\u0004\bQ\u0010\u0016\"\u0004\bR\u0010\u0018R\u001a\u0010S\u001a\u0004\u0018\u00010\u001aX\u0096\u000f\u00a2\u0006\f\u001a\u0004\bT\u0010\u001c\"\u0004\bU\u0010\u001eR\u001a\u0010V\u001a\u0004\u0018\u00010WX\u0096\u000f\u00a2\u0006\f\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[\u00a8\u0006a"}, d2 = {"Lorg/platypus/model/field/impl/One2ManyField$Builder;", "M", "Lorg/platypus/model/Model;", "TM", "Lorg/platypus/model/field/api/ModelField$Builder;", "Lorg/platypus/model/field/impl/One2ManyField;", "Lorg/platypus/model/field/api/MutableFieldSlots;", "Lorg/platypus/bag/Bag;", "model", "fieldName", "", "targetField", "Lkotlin/Function0;", "Lorg/platypus/model/field/impl/Many2OneField;", "(Lorg/platypus/model/Model;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "slots", "Lorg/platypus/model/field/api/MutableFieldSlotsImpl;", "(Lorg/platypus/model/Model;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lorg/platypus/model/field/api/MutableFieldSlotsImpl;)V", "constraint", "", "Lorg/platypus/orm/OrmConstraint;", "getConstraint", "()Ljava/util/Set;", "setConstraint", "(Ljava/util/Set;)V", "copy", "", "getCopy", "()Ljava/lang/Boolean;", "setCopy", "(Ljava/lang/Boolean;)V", "default", "getDefault", "()Lorg/platypus/bag/Bag;", "setDefault", "(Lorg/platypus/bag/Bag;)V", "defaultValueFun", "Lkotlin/Function1;", "Lorg/platypus/PlatypusEnvironment;", "Lkotlin/ParameterName;", "name", "env", "getDefaultValueFun", "()Lkotlin/jvm/functions/Function1;", "setDefaultValueFun", "(Lkotlin/jvm/functions/Function1;)V", "domain", "Lorg/platypus/orm/sql/expression/Expression;", "Lkotlin/ExtensionFunctionType;", "getDomain", "getFieldName", "()Ljava/lang/String;", "groups", "", "getGroups", "help", "getHelp", "setHelp", "(Ljava/lang/String;)V", "index", "getIndex", "setIndex", "label", "getLabel", "setLabel", "getModel", "()Lorg/platypus/model/Model;", "Lorg/platypus/model/Model;", "readonly", "getReadonly", "setReadonly", "required", "getRequired", "setRequired", "store", "getStore", "setStore", "getTargetField", "()Lkotlin/jvm/functions/Function0;", "transformer", "Lorg/platypus/model/field/api/FieldTransformer;", "getTransformer", "setTransformer", "unique", "getUnique", "setUnique", "widget", "Lorg/platypus/UIWidget;", "getWidget", "()Lorg/platypus/UIWidget;", "setWidget", "(Lorg/platypus/UIWidget;)V", "add", "", "build", "toSlots", "Lorg/platypus/model/field/api/FieldSlotsImpl;", "korm"})
    public static final class Builder<M extends org.platypus.model.Model<M>, TM extends org.platypus.model.Model<TM>> implements org.platypus.model.field.api.ModelField.Builder<M, org.platypus.model.field.impl.One2ManyField<M, TM>>, org.platypus.model.field.api.MutableFieldSlots<org.platypus.bag.Bag<TM>> {
        @org.jetbrains.annotations.Nullable()
        private final kotlin.jvm.functions.Function1<TM, org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> domain = null;
        @org.jetbrains.annotations.NotNull()
        private final M model = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String fieldName = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<org.platypus.model.field.impl.Many2OneField<TM, M>> targetField = null;
        private final org.platypus.model.field.api.MutableFieldSlotsImpl<org.platypus.bag.Bag<TM>> slots = null;
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function1<TM, org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> getDomain() {
            return null;
        }
        
        public final void add(@org.jetbrains.annotations.NotNull()
        org.platypus.orm.OrmConstraint<org.platypus.bag.Bag<TM>> constraint) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.platypus.model.field.impl.One2ManyField<M, TM> build() {
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
        public final kotlin.jvm.functions.Function0<org.platypus.model.field.impl.Many2OneField<TM, M>> getTargetField() {
            return null;
        }
        
        private Builder(M model, java.lang.String fieldName, kotlin.jvm.functions.Function0<org.platypus.model.field.impl.Many2OneField<TM, M>> targetField, org.platypus.model.field.api.MutableFieldSlotsImpl<org.platypus.bag.Bag<TM>> slots) {
            super();
        }
        
        public Builder(@org.jetbrains.annotations.NotNull()
        M model, @org.jetbrains.annotations.NotNull()
        java.lang.String fieldName, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<org.platypus.model.field.impl.Many2OneField<TM, M>> targetField) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.Set<org.platypus.orm.OrmConstraint<org.platypus.bag.Bag<TM>>> getConstraint() {
            return null;
        }
        
        @java.lang.Override()
        public void setConstraint(@org.jetbrains.annotations.NotNull()
        java.util.Set<org.platypus.orm.OrmConstraint<org.platypus.bag.Bag<TM>>> p0) {
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
        public org.platypus.bag.Bag<TM> getDefault() {
            return null;
        }
        
        @java.lang.Override()
        public void setDefault(@org.jetbrains.annotations.Nullable()
        org.platypus.bag.Bag<TM> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public kotlin.jvm.functions.Function1<org.platypus.PlatypusEnvironment, org.platypus.bag.Bag<TM>> getDefaultValueFun() {
            return null;
        }
        
        @java.lang.Override()
        public void setDefaultValueFun(@org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super org.platypus.PlatypusEnvironment, ? extends org.platypus.bag.Bag<TM>> p0) {
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
        public java.util.Set<org.platypus.model.field.api.FieldTransformer<org.platypus.bag.Bag<TM>>> getTransformer() {
            return null;
        }
        
        @java.lang.Override()
        public void setTransformer(@org.jetbrains.annotations.NotNull()
        java.util.Set<org.platypus.model.field.api.FieldTransformer<org.platypus.bag.Bag<TM>>> p0) {
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
        public org.platypus.model.field.api.FieldSlotsImpl<org.platypus.bag.Bag<TM>> toSlots() {
            return null;
        }
    }
}