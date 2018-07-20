package org.platypus.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\u00020\u0002J=\u0010\u0011\u001a\u0002H\u0012\"\b\b\u0001\u0010\u0013*\u00020\u0014\"\b\b\u0002\u0010\u0012*\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u00120\u00162\u0006\u0010\u0017\u001a\u0002H\u0013H&\u00a2\u0006\u0002\u0010\u0018R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lorg/platypus/model/IModel;", "M", "Lorg/platypus/orm/sql/dml/ColumnSet;", "id", "Lorg/platypus/model/field/impl/PKModelField;", "getId", "()Lorg/platypus/model/field/impl/PKModelField;", "modelName", "", "getModelName", "()Ljava/lang/String;", "slots", "Lorg/platypus/model/ModelSlots;", "getSlots", "()Lorg/platypus/model/ModelSlots;", "tableName", "getTableName", "accept", "RETURN", "PARAM", "", "visitor", "Lorg/platypus/model/ModelVisitor;", "p", "(Lorg/platypus/model/ModelVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "korm"})
public abstract interface IModel<M extends org.platypus.model.IModel<M>> extends org.platypus.orm.sql.dml.ColumnSet {
    
    /**
     * * The unique name of the model
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getModelName();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getTableName();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.model.field.impl.PKModelField<M> getId();
    
    /**
     * * Some additional information of the models
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.model.ModelSlots getSlots();
    
    @org.jetbrains.annotations.NotNull()
    public abstract <PARAM extends java.lang.Object, RETURN extends java.lang.Object>RETURN accept(@org.jetbrains.annotations.NotNull()
    org.platypus.model.ModelVisitor<? super PARAM, ? extends RETURN> visitor, @org.jetbrains.annotations.NotNull()
    PARAM p);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        public static <M extends org.platypus.model.IModel<M>>java.lang.String getTableName(org.platypus.model.IModel<M> $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <M extends org.platypus.model.IModel<M>>java.util.Set<org.platypus.orm.sql.expression.Expression<?>> getFieldsExpression(org.platypus.model.IModel<M> $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <M extends org.platypus.model.IModel<M>>org.platypus.orm.sql.dml.ColumnSet getSource(org.platypus.model.IModel<M> $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <M extends org.platypus.model.IModel<M>>java.lang.String describe(org.platypus.model.IModel<M> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.PlatypusEnvironment env) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <M extends org.platypus.model.IModel<M>>org.platypus.orm.sql.query.Join join(org.platypus.model.IModel<M> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.dml.ColumnSet otherTable, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.query.Join.JoinType joinType, @org.jetbrains.annotations.Nullable()
        org.platypus.orm.sql.expression.Expression<?> onColumn, @org.jetbrains.annotations.Nullable()
        org.platypus.orm.sql.expression.Expression<?> otherColumn, @org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function0<? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> additionalConstraint) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <M extends org.platypus.model.IModel<M>>org.platypus.orm.sql.query.Join innerJoin(org.platypus.model.IModel<M> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.dml.ColumnSet otherTable) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <M extends org.platypus.model.IModel<M>>org.platypus.orm.sql.query.Join leftJoin(org.platypus.model.IModel<M> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.dml.ColumnSet otherTable) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <M extends org.platypus.model.IModel<M>>org.platypus.orm.sql.query.Join crossJoin(org.platypus.model.IModel<M> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.dml.ColumnSet otherTable) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <M extends org.platypus.model.IModel<M>>org.platypus.orm.sql.dml.FieldSet slice(org.platypus.model.IModel<M> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.Expression<?>... columns) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <M extends org.platypus.model.IModel<M>>org.platypus.orm.sql.dml.FieldSet slice(org.platypus.model.IModel<M> $this, @org.jetbrains.annotations.NotNull()
        java.util.Set<? extends org.platypus.orm.sql.expression.Expression<?>> columns) {
            return null;
        }
    }
}