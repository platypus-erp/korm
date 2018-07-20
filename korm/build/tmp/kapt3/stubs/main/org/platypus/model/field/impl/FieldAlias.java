package org.platypus.model.field.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\'\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u00a2\u0006\u0002\u0010\tJ5\u0010C\u001a\u0002HD\"\u0004\b\u0002\u0010E\"\u0004\b\u0003\u0010D2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u0002HE\u0012\u0004\u0012\u0002HD0G2\u0006\u0010H\u001a\u0002HEH\u0016\u00a2\u0006\u0002\u0010IJ5\u0010C\u001a\u0002HD\"\u0004\b\u0002\u0010J\"\u0004\b\u0003\u0010D2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u0002HJ\u0012\u0004\u0012\u0002HD0K2\u0006\u0010L\u001a\u0002HJH\u0016\u00a2\u0006\u0002\u0010MJ\u0016\u0010N\u001a\u00028\u00012\u0006\u0010O\u001a\u00020\u0004H\u0096\u0001\u00a2\u0006\u0002\u0010PJ.\u0010Q\u001a\u00020R2\u000e\u0010S\u001a\n T*\u0004\u0018\u00018\u00018\u00012\u000e\u0010U\u001a\n T*\u0004\u0018\u00018\u00018\u0001H\u0096\u0001\u00a2\u0006\u0002\u0010VJ\u0019\u0010W\u001a\u00020R2\u000e\u0010X\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005H\u0096\u0003J\u0013\u0010Y\u001a\u00020\u00142\b\u0010X\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010Z\u001a\u00020RH\u0016J\u0018\u0010[\u001a\u00020\\2\b\u0010O\u001a\u0004\u0018\u00018\u0001H\u0096\u0001\u00a2\u0006\u0002\u0010]J\u001e\u0010^\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\b\u0010O\u001a\u0004\u0018\u00018\u0001H\u0096\u0001\u00a2\u0006\u0002\u0010_J\u0019\u0010`\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\b\u0010O\u001a\u0004\u0018\u00010\u0004H\u0096\u0001R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u000fX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R/\u0010\u0017\u001a\u001f\u0012\u0013\u0012\u00110\u0019\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0018X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0012\u0010!\u001a\u00020\u000bX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\rR\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u0012R\u0014\u0010%\u001a\u0004\u0018\u00010\u000bX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b&\u0010\rR\u0012\u0010\'\u001a\u00020\u0014X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b(\u0010\u0016R\u0014\u0010)\u001a\u0004\u0018\u00010\u000bX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b*\u0010\rR\u0012\u0010+\u001a\u00028\u0000X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b,\u0010-R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0012\u00100\u001a\u00020\u0014X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b1\u0010\u0016R\u0012\u00102\u001a\u00020\u0014X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b3\u0010\u0016R\u0012\u00104\u001a\u00020\u0014X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b5\u0010\u0016R\u001e\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0001070\u000fX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b8\u0010\u0012R\u0012\u00109\u001a\u00020:X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b;\u0010<R\u0012\u0010=\u001a\u00020\u0014X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b>\u0010\u0016R\u0014\u0010?\u001a\u0004\u0018\u00010@X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bA\u0010B\u00a8\u0006a"}, d2 = {"Lorg/platypus/model/field/impl/FieldAlias;", "M", "Lorg/platypus/model/IModel;", "T", "", "Lorg/platypus/model/field/api/IModelField;", "delegate", "newModel", "Lorg/platypus/model/Alias;", "(Lorg/platypus/model/field/api/IModelField;Lorg/platypus/model/Alias;)V", "completeName", "", "getCompleteName", "()Ljava/lang/String;", "constraint", "", "Lorg/platypus/orm/OrmConstraint;", "getConstraint", "()Ljava/util/Set;", "copy", "", "getCopy", "()Z", "defaultValueFun", "Lkotlin/Function1;", "Lorg/platypus/PlatypusEnvironment;", "Lkotlin/ParameterName;", "name", "env", "getDefaultValueFun", "()Lkotlin/jvm/functions/Function1;", "getDelegate", "()Lorg/platypus/model/field/api/IModelField;", "fieldName", "getFieldName", "groups", "getGroups", "help", "getHelp", "index", "getIndex", "label", "getLabel", "model", "getModel", "()Lorg/platypus/model/IModel;", "getNewModel", "()Lorg/platypus/model/Alias;", "readonly", "getReadonly", "required", "getRequired", "store", "getStore", "transformer", "Lorg/platypus/model/field/api/FieldTransformer;", "getTransformer", "type", "Lorg/platypus/model/field/api/type/SqlFieldType;", "getType", "()Lorg/platypus/model/field/api/type/SqlFieldType;", "unique", "getUnique", "widget", "Lorg/platypus/UIWidget;", "getWidget", "()Lorg/platypus/UIWidget;", "accept", "RETURN", "PARAM_TYPE", "visitor", "Lorg/platypus/model/field/api/FieldVisitor;", "p", "(Lorg/platypus/model/field/api/FieldVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "PARAM", "Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "param", "(Lorg/platypus/orm/sql/expression/ExpressionVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "anyToType", "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "compare", "", "p0", "kotlin.jvm.PlatformType", "p1", "(Ljava/lang/Object;Ljava/lang/Object;)I", "compareTo", "other", "equals", "hashCode", "validateAndThrow", "", "(Ljava/lang/Object;)V", "validateNullable", "(Ljava/lang/Object;)Ljava/util/Set;", "validateUnsafe", "korm"})
public final class FieldAlias<M extends org.platypus.model.IModel<M>, T extends java.lang.Object> implements org.platypus.model.field.api.IModelField<M, T> {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.field.api.IModelField<M, T> delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.Alias<M> newModel = null;
    
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
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.api.IModelField<M, T> getDelegate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.Alias<M> getNewModel() {
        return null;
    }
    
    public FieldAlias(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<M, T> delegate, @org.jetbrains.annotations.NotNull()
    org.platypus.model.Alias<M> newModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCompleteName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<org.platypus.orm.OrmConstraint<T>> getConstraint() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getCopy() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.jvm.functions.Function1<org.platypus.PlatypusEnvironment, T> getDefaultValueFun() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFieldName() {
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public M getModel() {
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
    public java.util.Set<org.platypus.model.field.api.FieldTransformer<T>> getTransformer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.type.SqlFieldType getType() {
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public T anyToType(@org.jetbrains.annotations.NotNull()
    java.lang.Object value) {
        return null;
    }
    
    @java.lang.Override()
    public int compare(T p0, T p1) {
        return 0;
    }
    
    @java.lang.Override()
    public int compareTo(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<?, ?> other) {
        return 0;
    }
    
    @java.lang.Override()
    public void validateAndThrow(@org.jetbrains.annotations.Nullable()
    T value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<java.lang.String> validateNullable(@org.jetbrains.annotations.Nullable()
    T value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<java.lang.String> validateUnsafe(@org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
        return null;
    }
}