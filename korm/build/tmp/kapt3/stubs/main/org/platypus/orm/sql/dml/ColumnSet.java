package org.platypus.orm.sql.dml;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0000H\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0000H\u0016JP\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b2\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\b\u0018\u00010\u001bH\u0016J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0000H\u0016J)\u0010\u001e\u001a\u00020\u00012\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\b0 \"\u0006\u0012\u0002\b\u00030\bH\u0016\u00a2\u0006\u0002\u0010!J\u001a\u0010\u001e\u001a\u00020\u00012\u0010\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0003H\u0016J\u0012\u0010\"\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030$0#H&R \u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00008VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006%"}, d2 = {"Lorg/platypus/orm/sql/dml/ColumnSet;", "Lorg/platypus/orm/sql/dml/FieldSet;", "fields", "", "Lorg/platypus/model/field/api/IModelField;", "getFields", "()Ljava/util/Set;", "fieldsExpression", "Lorg/platypus/orm/sql/expression/Expression;", "getFieldsExpression", "source", "getSource", "()Lorg/platypus/orm/sql/dml/ColumnSet;", "crossJoin", "Lorg/platypus/orm/sql/query/Join;", "otherTable", "describe", "", "env", "Lorg/platypus/PlatypusEnvironment;", "innerJoin", "join", "joinType", "Lorg/platypus/orm/sql/query/Join$JoinType;", "onColumn", "otherColumn", "additionalConstraint", "Lkotlin/Function0;", "", "leftJoin", "slice", "columns", "", "([Lorg/platypus/orm/sql/expression/Expression;)Lorg/platypus/orm/sql/dml/FieldSet;", "targetTables", "", "Lorg/platypus/model/IModel;", "korm"})
public abstract interface ColumnSet extends org.platypus.orm.sql.dml.FieldSet {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Set<org.platypus.model.field.api.IModelField<?, ?>> getFields();
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public abstract java.util.Set<org.platypus.orm.sql.expression.Expression<?>> getFieldsExpression();
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public abstract org.platypus.orm.sql.dml.ColumnSet getSource();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.platypus.model.IModel<?>> targetTables();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String describe(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.query.Join join(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.ColumnSet otherTable, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.Join.JoinType joinType, @org.jetbrains.annotations.Nullable()
    org.platypus.orm.sql.expression.Expression<?> onColumn, @org.jetbrains.annotations.Nullable()
    org.platypus.orm.sql.expression.Expression<?> otherColumn, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> additionalConstraint);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.query.Join innerJoin(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.ColumnSet otherTable);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.query.Join leftJoin(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.ColumnSet otherTable);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.query.Join crossJoin(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.ColumnSet otherTable);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.dml.FieldSet slice(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<?>... columns);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.dml.FieldSet slice(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends org.platypus.orm.sql.expression.Expression<?>> columns);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static java.util.Set<org.platypus.orm.sql.expression.Expression<?>> getFieldsExpression(org.platypus.orm.sql.dml.ColumnSet $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static org.platypus.orm.sql.dml.ColumnSet getSource(org.platypus.orm.sql.dml.ColumnSet $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static java.lang.String describe(org.platypus.orm.sql.dml.ColumnSet $this, @org.jetbrains.annotations.NotNull()
        org.platypus.PlatypusEnvironment env) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static org.platypus.orm.sql.query.Join join(org.platypus.orm.sql.dml.ColumnSet $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.dml.ColumnSet otherTable, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.query.Join.JoinType joinType, @org.jetbrains.annotations.Nullable()
        org.platypus.orm.sql.expression.Expression<?> onColumn, @org.jetbrains.annotations.Nullable()
        org.platypus.orm.sql.expression.Expression<?> otherColumn, @org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function0<? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> additionalConstraint) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static org.platypus.orm.sql.query.Join innerJoin(org.platypus.orm.sql.dml.ColumnSet $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.dml.ColumnSet otherTable) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static org.platypus.orm.sql.query.Join leftJoin(org.platypus.orm.sql.dml.ColumnSet $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.dml.ColumnSet otherTable) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static org.platypus.orm.sql.query.Join crossJoin(org.platypus.orm.sql.dml.ColumnSet $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.dml.ColumnSet otherTable) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static org.platypus.orm.sql.dml.FieldSet slice(org.platypus.orm.sql.dml.ColumnSet $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.Expression<?>... columns) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static org.platypus.orm.sql.dml.FieldSet slice(org.platypus.orm.sql.dml.ColumnSet $this, @org.jetbrains.annotations.NotNull()
        java.util.Set<? extends org.platypus.orm.sql.expression.Expression<?>> columns) {
            return null;
        }
    }
}