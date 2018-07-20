package org.platypus.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J=\u0010&\u001a\u0002H\'\"\b\b\u0001\u0010(*\u00020)\"\b\b\u0002\u0010\'*\u00020)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u0002H(\u0012\u0004\u0012\u0002H\'0+2\u0006\u0010,\u001a\u0002H(H\u0016\u00a2\u0006\u0002\u0010-J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u001fH\u0016J\u0010\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u000203H\u0016J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010)H\u0096\u0002JB\u00107\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H908\"\b\b\u0001\u00109*\u00020)\"\u0014\b\u0002\u0010:*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H90\u000e2\u0006\u0010;\u001a\u0002H:H\u0087\u0002\u00a2\u0006\u0002\u0010<J(\u0010=\u001a\u0006\u0012\u0002\b\u00030\u0012\"\b\b\u0001\u0010>*\u00020)2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H>0\u000eJ\b\u0010?\u001a\u00020@H\u0016J\u0010\u0010A\u001a\u00020/2\u0006\u00100\u001a\u00020\u001fH\u0016JJ\u0010B\u001a\u00020/2\u0006\u00100\u001a\u00020\u001f2\u0006\u0010C\u001a\u00020D2\f\u0010E\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\f\u0010F\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\u0014\u0010G\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u0012\u0018\u00010HH\u0016J\u0010\u0010I\u001a\u00020/2\u0006\u00100\u001a\u00020\u001fH\u0016J)\u0010J\u001a\u00020K2\u001a\u0010L\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00120M\"\u0006\u0012\u0002\b\u00030\u0012H\u0016\u00a2\u0006\u0002\u0010NJ\u001a\u0010J\u001a\u00020K2\u0010\u0010L\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\rH\u0016J\u0012\u0010O\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020PH\u0016J\b\u0010Q\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR \u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000e0\rX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\r8VX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\bR\u0012\u0010\u001a\u001a\u00020\u001bX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00058VX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b#\u0010\bR\u0011\u0010$\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\b\u00a8\u0006R"}, d2 = {"Lorg/platypus/model/Alias;", "M", "Lorg/platypus/model/IModel;", "delegate", "alias", "", "(Lorg/platypus/model/IModel;Ljava/lang/String;)V", "getAlias", "()Ljava/lang/String;", "getDelegate", "()Lorg/platypus/model/IModel;", "Lorg/platypus/model/IModel;", "fields", "", "Lorg/platypus/model/field/api/IModelField;", "getFields", "()Ljava/util/Set;", "fieldsExpression", "Lorg/platypus/orm/sql/expression/Expression;", "getFieldsExpression", "id", "Lorg/platypus/model/field/impl/PKModelField;", "getId", "()Lorg/platypus/model/field/impl/PKModelField;", "modelName", "getModelName", "slots", "Lorg/platypus/model/ModelSlots;", "getSlots", "()Lorg/platypus/model/ModelSlots;", "source", "Lorg/platypus/orm/sql/dml/ColumnSet;", "getSource", "()Lorg/platypus/orm/sql/dml/ColumnSet;", "tableName", "getTableName", "tableNameWithAlias", "getTableNameWithAlias", "accept", "RETURN", "PARAM", "", "visitor", "Lorg/platypus/model/ModelVisitor;", "p", "(Lorg/platypus/model/ModelVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "crossJoin", "Lorg/platypus/orm/sql/query/Join;", "otherTable", "describe", "env", "Lorg/platypus/PlatypusEnvironment;", "equals", "", "other", "get", "Lorg/platypus/model/field/impl/FieldAlias;", "T1", "F", "original", "(Lorg/platypus/model/field/api/IModelField;)Lorg/platypus/model/field/impl/FieldAlias;", "getExpression", "T", "hashCode", "", "innerJoin", "join", "joinType", "Lorg/platypus/orm/sql/query/Join$JoinType;", "onColumn", "otherColumn", "additionalConstraint", "Lkotlin/Function0;", "leftJoin", "slice", "Lorg/platypus/orm/sql/dml/FieldSet;", "columns", "", "([Lorg/platypus/orm/sql/expression/Expression;)Lorg/platypus/orm/sql/dml/FieldSet;", "targetTables", "", "toString", "korm"})
public final class Alias<M extends org.platypus.model.IModel<M>> implements org.platypus.model.IModel<M> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String tableNameWithAlias = null;
    @org.jetbrains.annotations.NotNull()
    private final M delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String alias = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getModelName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String describe(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<org.platypus.model.IModel<?>> targetTables() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.dml.ColumnSet getSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.Join join(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.ColumnSet otherTable, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.Join.JoinType joinType, @org.jetbrains.annotations.Nullable()
    org.platypus.orm.sql.expression.Expression<?> onColumn, @org.jetbrains.annotations.Nullable()
    org.platypus.orm.sql.expression.Expression<?> otherColumn, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> additionalConstraint) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.Join innerJoin(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.ColumnSet otherTable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.Join leftJoin(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.ColumnSet otherTable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.Join crossJoin(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.ColumnSet otherTable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.dml.FieldSet slice(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<?>... columns) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.dml.FieldSet slice(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends org.platypus.orm.sql.expression.Expression<?>> columns) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <PARAM extends java.lang.Object, RETURN extends java.lang.Object>RETURN accept(@org.jetbrains.annotations.NotNull()
    org.platypus.model.ModelVisitor<? super PARAM, ? extends RETURN> visitor, @org.jetbrains.annotations.NotNull()
    PARAM p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTableNameWithAlias() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    public final <T1 extends java.lang.Object, F extends org.platypus.model.field.api.IModelField<M, T1>>org.platypus.model.field.impl.FieldAlias<M, T1> get(@org.jetbrains.annotations.NotNull()
    F original) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<?> getExpression(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<M, T> original) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final M getDelegate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAlias() {
        return null;
    }
    
    public Alias(@org.jetbrains.annotations.NotNull()
    M delegate, @org.jetbrains.annotations.NotNull()
    java.lang.String alias) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<org.platypus.model.field.api.IModelField<?, ?>> getFields() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<org.platypus.orm.sql.expression.Expression<?>> getFieldsExpression() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.impl.PKModelField<M> getId() {
        return null;
    }
    
    /**
     * * Some additional information of the models
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.ModelSlots getSlots() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTableName() {
        return null;
    }
}