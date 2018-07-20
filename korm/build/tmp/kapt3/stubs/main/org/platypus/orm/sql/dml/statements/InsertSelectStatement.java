package org.platypus.orm.sql.dml.statements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\"\u0010\u0012\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00140\u00130\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0002*\u00020\u001aH\u0016\u00a2\u0006\u0002\u0010\u001bR\u001f\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001c"}, d2 = {"Lorg/platypus/orm/sql/dml/statements/InsertSelectStatement;", "Lorg/platypus/orm/sql/dml/Statement;", "", "env", "Lorg/platypus/PlatypusEnvironment;", "columns", "", "Lorg/platypus/model/field/api/ModelField;", "selectQuery", "Lorg/platypus/orm/sql/query/Query;", "isIgnore", "", "(Lorg/platypus/PlatypusEnvironment;Ljava/util/List;Lorg/platypus/orm/sql/query/Query;Z)V", "getColumns", "()Ljava/util/List;", "()Z", "getSelectQuery", "()Lorg/platypus/orm/sql/query/Query;", "arguments", "", "Lkotlin/Pair;", "Lorg/platypus/model/field/api/type/SqlFieldType;", "", "prepareSQL", "", "executeInternal", "Ljava/sql/PreparedStatement;", "(Ljava/sql/PreparedStatement;)Ljava/lang/Integer;", "korm"})
public final class InsertSelectStatement extends org.platypus.orm.sql.dml.Statement<java.lang.Integer> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.platypus.model.field.api.ModelField<?, ?>> columns = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.sql.query.Query selectQuery = null;
    private final boolean isIgnore = false;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer executeInternal(@org.jetbrains.annotations.NotNull()
    java.sql.PreparedStatement $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Iterable<java.lang.Iterable<kotlin.Pair<org.platypus.model.field.api.type.SqlFieldType, java.lang.Object>>> arguments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String prepareSQL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.platypus.model.field.api.ModelField<?, ?>> getColumns() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.query.Query getSelectQuery() {
        return null;
    }
    
    public final boolean isIgnore() {
        return false;
    }
    
    public InsertSelectStatement(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.platypus.model.field.api.ModelField<?, ?>> columns, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.Query selectQuery, boolean isIgnore) {
        super(null, null, null);
    }
}