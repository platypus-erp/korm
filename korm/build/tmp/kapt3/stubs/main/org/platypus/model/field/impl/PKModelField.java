package org.platypus.model.field.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u00032\b\u0012\u0004\u0012\u00020\u00040\u00052\b\u0012\u0004\u0012\u00020\u00040\u00062\b\u0012\u0004\u0012\u00020\u00040\u0007B\r\u0012\u0006\u0010\b\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\tJ5\u0010=\u001a\u0002H>\"\u0004\b\u0001\u0010?\"\u0004\b\u0002\u0010>2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u0002H?\u0012\u0004\u0012\u0002H>0A2\u0006\u0010B\u001a\u0002H?H\u0016\u00a2\u0006\u0002\u0010CJ5\u0010=\u001a\u0002H>\"\u0004\b\u0001\u0010D\"\u0004\b\u0002\u0010>2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u0002HD\u0012\u0004\u0012\u0002H>0E2\u0006\u0010F\u001a\u0002HDH\u0016\u00a2\u0006\u0002\u0010GJ!\u0010H\u001a\u00020\u00042\b\u0010I\u001a\u0004\u0018\u00010\u00042\b\u0010J\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0002\u0010KJ\u0019\u0010L\u001a\u00020\u00042\u000e\u0010M\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003H\u0096\u0002R\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f0\u000bX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R/\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0015\u00a2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000bX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b \u0010\u000eR\u0014\u0010!\u001a\u0004\u0018\u00010\u001cX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u001eR\u0012\u0010#\u001a\u00020\u0010X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u0012R\u0014\u0010%\u001a\u0004\u0018\u00010\u001cX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b&\u0010\u001eR\u0016\u0010\b\u001a\u00028\u0000X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010)\u001a\u0004\b\'\u0010(R\u0012\u0010*\u001a\u00020\u0010X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b+\u0010\u0012R\u0012\u0010,\u001a\u00020\u0010X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b-\u0010\u0012R\u0012\u0010.\u001a\u00020\u0010X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b/\u0010\u0012R\u001e\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0004010\u000bX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b2\u0010\u000eR\u0014\u00103\u001a\u000204X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0012\u00107\u001a\u00020\u0010X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b8\u0010\u0012R\u0014\u00109\u001a\u0004\u0018\u00010:X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b;\u0010<\u00a8\u0006N"}, d2 = {"Lorg/platypus/model/field/impl/PKModelField;", "M", "Lorg/platypus/model/IModel;", "Lorg/platypus/model/field/api/IModelField;", "", "Lorg/platypus/model/field/api/FieldSlots;", "Lorg/platypus/orm/sql/expression/FieldExpression;", "Lorg/platypus/orm/sql/expression/Expression;", "model", "(Lorg/platypus/model/IModel;)V", "constraint", "", "Lorg/platypus/orm/OrmConstraint;", "getConstraint", "()Ljava/util/Set;", "copy", "", "getCopy", "()Z", "defaultValueFun", "Lkotlin/Function1;", "Lorg/platypus/PlatypusEnvironment;", "Lkotlin/ParameterName;", "name", "env", "getDefaultValueFun", "()Lkotlin/jvm/functions/Function1;", "fieldName", "", "getFieldName", "()Ljava/lang/String;", "groups", "getGroups", "help", "getHelp", "index", "getIndex", "label", "getLabel", "getModel", "()Lorg/platypus/model/IModel;", "Lorg/platypus/model/IModel;", "readonly", "getReadonly", "required", "getRequired", "store", "getStore", "transformer", "Lorg/platypus/model/field/api/FieldTransformer;", "getTransformer", "type", "Lorg/platypus/model/field/api/type/SqlFieldType;", "getType", "()Lorg/platypus/model/field/api/type/SqlFieldType;", "unique", "getUnique", "widget", "Lorg/platypus/UIWidget;", "getWidget", "()Lorg/platypus/UIWidget;", "accept", "RETURN", "PARAM_TYPE", "visitor", "Lorg/platypus/model/field/api/FieldVisitor;", "p", "(Lorg/platypus/model/field/api/FieldVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "PARAM", "Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "param", "(Lorg/platypus/orm/sql/expression/ExpressionVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "compare", "o1", "o2", "(Ljava/lang/Integer;Ljava/lang/Integer;)I", "compareTo", "other", "korm"})
public final class PKModelField<M extends org.platypus.model.IModel<M>> implements org.platypus.model.field.api.IModelField<M, java.lang.Integer>, org.platypus.model.field.api.FieldSlots<java.lang.Integer>, org.platypus.orm.sql.expression.FieldExpression<java.lang.Integer>, org.platypus.orm.sql.expression.Expression<java.lang.Integer> {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.field.api.type.SqlFieldType type = null;
    @org.jetbrains.annotations.NotNull()
    private final M model = null;
    
    @java.lang.Override()
    public int compare(@org.jetbrains.annotations.Nullable()
    java.lang.Integer o1, @org.jetbrains.annotations.Nullable()
    java.lang.Integer o2) {
        return 0;
    }
    
    @java.lang.Override()
    public int compareTo(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<?, ?> other) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFieldName() {
        return null;
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public M getModel() {
        return null;
    }
    
    public PKModelField(@org.jetbrains.annotations.NotNull()
    M model) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getCompleteName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.Integer anyToType(@org.jetbrains.annotations.NotNull()
    java.lang.Object value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Set<java.lang.String> validateUnsafe(@org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<java.lang.String> validateNullable(@org.jetbrains.annotations.Nullable()
    java.lang.Integer value) {
        return null;
    }
    
    @java.lang.Override()
    public void validateAndThrow(@org.jetbrains.annotations.Nullable()
    java.lang.Integer value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<org.platypus.orm.OrmConstraint<java.lang.Integer>> getConstraint() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getCopy() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.jvm.functions.Function1<org.platypus.PlatypusEnvironment, java.lang.Integer> getDefaultValueFun() {
        return null;
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
    public boolean getIndex() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getLabel() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getReadonly() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getRequired() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getStore() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<org.platypus.model.field.api.FieldTransformer<java.lang.Integer>> getTransformer() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getUnique() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.platypus.UIWidget getWidget() {
        return null;
    }
}