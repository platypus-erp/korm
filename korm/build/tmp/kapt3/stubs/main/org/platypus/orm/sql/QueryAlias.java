package org.platypus.orm.sql;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0001H\u0096\u0004J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J/\u0010\u0016\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u0002H\u00170\u000b\"\b\b\u0000\u0010\u0017*\u00020\u00182\u0010\u0010\u0019\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u0002H\u00170\u000bH\u0087\u0002J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u001a\"\u0004\b\u0000\u0010\u001b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u001aH\u0087\u0002J\u0011\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0001H\u0096\u0004JJ\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001a2\f\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001a2\u0014\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u001a\u0018\u00010#H\u0016J\u0011\u0010%\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0001H\u0096\u0004J\u0012\u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030(0\'H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b0\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006)"}, d2 = {"Lorg/platypus/orm/sql/QueryAlias;", "Lorg/platypus/orm/sql/dml/ColumnSet;", "query", "Lorg/platypus/orm/sql/query/Query;", "alias", "", "(Lorg/platypus/orm/sql/query/Query;Ljava/lang/String;)V", "getAlias", "()Ljava/lang/String;", "fields", "", "Lorg/platypus/model/field/api/IModelField;", "getFields", "()Ljava/util/Set;", "getQuery", "()Lorg/platypus/orm/sql/query/Query;", "crossJoin", "Lorg/platypus/orm/sql/query/Join;", "otherTable", "describe", "env", "Lorg/platypus/PlatypusEnvironment;", "get", "KT", "", "original", "Lorg/platypus/orm/sql/expression/Expression;", "T", "innerJoin", "join", "joinType", "Lorg/platypus/orm/sql/query/Join$JoinType;", "onColumn", "otherColumn", "additionalConstraint", "Lkotlin/Function0;", "", "leftJoin", "targetTables", "", "Lorg/platypus/model/IModel;", "korm"})
public final class QueryAlias implements org.platypus.orm.sql.dml.ColumnSet {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.sql.query.Query query = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String alias = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<org.platypus.model.field.api.IModelField<?, ?>> getFields() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<org.platypus.model.IModel<?>> targetTables() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String describe(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    public final <KT extends java.lang.Object>org.platypus.model.field.api.IModelField<?, KT> get(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<?, KT> original) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    public final <T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<T> get(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<T> original) {
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
    public final org.platypus.orm.sql.query.Query getQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAlias() {
        return null;
    }
    
    public QueryAlias(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.Query query, @org.jetbrains.annotations.NotNull()
    java.lang.String alias) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<org.platypus.orm.sql.expression.Expression<?>> getFieldsExpression() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.dml.ColumnSet getSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.platypus.orm.sql.dml.FieldSet slice(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<?>... columns) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.platypus.orm.sql.dml.FieldSet slice(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends org.platypus.orm.sql.expression.Expression<?>> columns) {
        return null;
    }
}