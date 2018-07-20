package org.platypus.orm.sql.dml.statements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0002\u0010\u000bJ\"\u0010\u001a\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e0\u001b0\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0011\u0010\u001f\u001a\u00020\u0002*\u00020 H\u0016\u00a2\u0006\u0002\u0010!R0\u0010\f\u001a\u001e\u0012\u001a\u0012\u0018\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e0\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006\""}, d2 = {"Lorg/platypus/orm/sql/dml/statements/UpdateStatement;", "Lorg/platypus/orm/sql/dml/statements/UpdateBuilder;", "", "env", "Lorg/platypus/PlatypusEnvironment;", "targetsSet", "Lorg/platypus/orm/sql/dml/ColumnSet;", "where", "Lorg/platypus/orm/sql/expression/Expression;", "", "limit", "(Lorg/platypus/PlatypusEnvironment;Lorg/platypus/orm/sql/dml/ColumnSet;Lorg/platypus/orm/sql/expression/Expression;Ljava/lang/Integer;)V", "firstDataSet", "", "Lkotlin/Pair;", "Lorg/platypus/model/field/api/IModelField;", "", "getFirstDataSet", "()Ljava/util/List;", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTargetsSet", "()Lorg/platypus/orm/sql/dml/ColumnSet;", "getWhere", "()Lorg/platypus/orm/sql/expression/Expression;", "arguments", "", "Lorg/platypus/model/field/api/type/SqlFieldType;", "prepareSQL", "", "executeInternal", "Ljava/sql/PreparedStatement;", "(Ljava/sql/PreparedStatement;)Ljava/lang/Integer;", "korm"})
public class UpdateStatement extends org.platypus.orm.sql.dml.statements.UpdateBuilder<java.lang.Integer> {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.sql.dml.ColumnSet targetsSet = null;
    @org.jetbrains.annotations.Nullable()
    private final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> where = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer limit = null;
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<kotlin.Pair<org.platypus.model.field.api.IModelField<?, ?>, java.lang.Object>> getFirstDataSet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Integer executeInternal(@org.jetbrains.annotations.NotNull()
    java.sql.PreparedStatement $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String prepareSQL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Iterable<java.lang.Iterable<kotlin.Pair<org.platypus.model.field.api.type.SqlFieldType, java.lang.Object>>> arguments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.dml.ColumnSet getTargetsSet() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> getWhere() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getLimit() {
        return null;
    }
    
    public UpdateStatement(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.ColumnSet targetsSet, @org.jetbrains.annotations.Nullable()
    org.platypus.orm.sql.expression.Expression<java.lang.Boolean> where, @org.jetbrains.annotations.Nullable()
    java.lang.Integer limit) {
        super(null, null, null);
    }
}