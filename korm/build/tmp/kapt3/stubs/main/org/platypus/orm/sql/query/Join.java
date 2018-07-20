package org.platypus.orm.sql.query;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002-.BY\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0007\u0018\u00010\n\u00a2\u0006\u0002\u0010\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0001J\u0011\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u0096\u0004J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016JB\u0010!\u001a,\u0012&\u0012$\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0010\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00100\"0#\u0018\u00010\"2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u0001H\u0002J\u0011\u0010&\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u0096\u0004J2\u0010\'\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0007\u0018\u00010\nH\u0002JT\u0010\'\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052$\u0010(\u001a \u0012\u001c\u0012\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070#j\u0002`)0\"2\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0007\u0018\u00010\nH\u0002JJ\u0010\'\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0007\u0018\u00010\nH\u0016J\u0011\u0010*\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u0096\u0004J\u0012\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030,0\"H\u0016R\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00100\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u0016X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006/"}, d2 = {"Lorg/platypus/orm/sql/query/Join;", "Lorg/platypus/orm/sql/dml/ColumnSet;", "table", "otherTable", "joinType", "Lorg/platypus/orm/sql/query/Join$JoinType;", "onColumn", "Lorg/platypus/orm/sql/expression/Expression;", "otherColumn", "additionalConstraint", "Lkotlin/Function0;", "", "(Lorg/platypus/orm/sql/dml/ColumnSet;Lorg/platypus/orm/sql/dml/ColumnSet;Lorg/platypus/orm/sql/query/Join$JoinType;Lorg/platypus/orm/sql/expression/Expression;Lorg/platypus/orm/sql/expression/Expression;Lkotlin/jvm/functions/Function0;)V", "(Lorg/platypus/orm/sql/dml/ColumnSet;)V", "fields", "", "Lorg/platypus/model/field/api/IModelField;", "getFields", "()Ljava/util/Set;", "joinParts", "Ljava/util/LinkedHashSet;", "Lorg/platypus/orm/sql/query/Join$JoinPart;", "Lkotlin/collections/LinkedHashSet;", "getJoinParts$korm", "()Ljava/util/LinkedHashSet;", "getTable", "()Lorg/platypus/orm/sql/dml/ColumnSet;", "alreadyInJoin", "crossJoin", "describe", "", "env", "Lorg/platypus/PlatypusEnvironment;", "findKeys", "", "Lkotlin/Pair;", "a", "b", "innerJoin", "join", "cond", "Lorg/platypus/orm/sql/dml/JoinCondition;", "leftJoin", "targetTables", "Lorg/platypus/model/IModel;", "JoinPart", "JoinType", "korm"})
public final class Join implements org.platypus.orm.sql.dml.ColumnSet {
    @org.jetbrains.annotations.NotNull()
    private final java.util.LinkedHashSet<org.platypus.orm.sql.query.Join.JoinPart> joinParts = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.sql.dml.ColumnSet table = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.LinkedHashSet<org.platypus.orm.sql.query.Join.JoinPart> getJoinParts$korm() {
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
    
    private final org.platypus.orm.sql.query.Join join(org.platypus.orm.sql.dml.ColumnSet otherTable, org.platypus.orm.sql.query.Join.JoinType joinType, kotlin.jvm.functions.Function0<? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> additionalConstraint) {
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
    
    private final org.platypus.orm.sql.query.Join join(org.platypus.orm.sql.dml.ColumnSet otherTable, org.platypus.orm.sql.query.Join.JoinType joinType, java.util.List<? extends kotlin.Pair<? extends org.platypus.orm.sql.expression.Expression<?>, ? extends org.platypus.orm.sql.expression.Expression<?>>> cond, kotlin.jvm.functions.Function0<? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> additionalConstraint) {
        return null;
    }
    
    private final java.util.List<kotlin.Pair<org.platypus.model.field.api.IModelField<?, ?>, java.util.List<org.platypus.model.field.api.IModelField<?, ?>>>> findKeys(org.platypus.orm.sql.dml.ColumnSet a, org.platypus.orm.sql.dml.ColumnSet b) {
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
    public java.util.Set<org.platypus.model.field.api.IModelField<?, ?>> getFields() {
        return null;
    }
    
    public final boolean alreadyInJoin(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.ColumnSet table) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<org.platypus.model.IModel<?>> targetTables() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.dml.ColumnSet getTable() {
        return null;
    }
    
    public Join(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.ColumnSet table) {
        super();
    }
    
    public Join(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.ColumnSet table, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.ColumnSet otherTable, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.Join.JoinType joinType, @org.jetbrains.annotations.Nullable()
    org.platypus.orm.sql.expression.Expression<?> onColumn, @org.jetbrains.annotations.Nullable()
    org.platypus.orm.sql.expression.Expression<?> otherColumn, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> additionalConstraint) {
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
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lorg/platypus/orm/sql/query/Join$JoinType;", "", "(Ljava/lang/String;I)V", "INNER", "LEFT", "RIGHT", "FULL", "CROSS", "korm"})
    public static enum JoinType {
        /*public static final*/ INNER /* = new INNER() */,
        /*public static final*/ LEFT /* = new LEFT() */,
        /*public static final*/ RIGHT /* = new RIGHT() */,
        /*public static final*/ FULL /* = new FULL() */,
        /*public static final*/ CROSS /* = new CROSS() */;
        
        JoinType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012$\u0010\u0006\u001a \u0012\u001c\u0012\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bj\u0002`\n0\u0007\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t\u0018\u00010\f\u00a2\u0006\u0002\u0010\u000eJ\u0013\u0010\u0017\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u001f\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R/\u0010\u0006\u001a \u0012\u001c\u0012\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bj\u0002`\n0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001b"}, d2 = {"Lorg/platypus/orm/sql/query/Join$JoinPart;", "", "joinType", "Lorg/platypus/orm/sql/query/Join$JoinType;", "joinPart", "Lorg/platypus/orm/sql/dml/ColumnSet;", "conditions", "", "Lkotlin/Pair;", "Lorg/platypus/orm/sql/expression/Expression;", "Lorg/platypus/orm/sql/dml/JoinCondition;", "additionalConstraint", "Lkotlin/Function0;", "", "(Lorg/platypus/orm/sql/query/Join$JoinType;Lorg/platypus/orm/sql/dml/ColumnSet;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "getAdditionalConstraint", "()Lkotlin/jvm/functions/Function0;", "getConditions", "()Ljava/util/List;", "getJoinPart", "()Lorg/platypus/orm/sql/dml/ColumnSet;", "getJoinType", "()Lorg/platypus/orm/sql/query/Join$JoinType;", "equals", "other", "hashCode", "", "korm"})
    public static final class JoinPart {
        @org.jetbrains.annotations.NotNull()
        private final org.platypus.orm.sql.query.Join.JoinType joinType = null;
        @org.jetbrains.annotations.NotNull()
        private final org.platypus.orm.sql.dml.ColumnSet joinPart = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<kotlin.Pair<org.platypus.orm.sql.expression.Expression<?>, org.platypus.orm.sql.expression.Expression<?>>> conditions = null;
        @org.jetbrains.annotations.Nullable()
        private final kotlin.jvm.functions.Function0<org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> additionalConstraint = null;
        
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
        public final org.platypus.orm.sql.query.Join.JoinType getJoinType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.platypus.orm.sql.dml.ColumnSet getJoinPart() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<kotlin.Pair<org.platypus.orm.sql.expression.Expression<?>, org.platypus.orm.sql.expression.Expression<?>>> getConditions() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function0<org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> getAdditionalConstraint() {
            return null;
        }
        
        public JoinPart(@org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.query.Join.JoinType joinType, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.dml.ColumnSet joinPart, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends kotlin.Pair<? extends org.platypus.orm.sql.expression.Expression<?>, ? extends org.platypus.orm.sql.expression.Expression<?>>> conditions, @org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function0<? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> additionalConstraint) {
            super();
        }
    }
}