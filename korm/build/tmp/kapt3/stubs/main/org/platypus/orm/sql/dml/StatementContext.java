package org.platypus.orm.sql.dml;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u0005\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eR%\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2 = {"Lorg/platypus/orm/sql/dml/StatementContext;", "", "statement", "Lorg/platypus/orm/sql/dml/Statement;", "args", "", "Lkotlin/Pair;", "Lorg/platypus/model/field/api/type/SqlFieldType;", "(Lorg/platypus/orm/sql/dml/Statement;Ljava/lang/Iterable;)V", "getArgs", "()Ljava/lang/Iterable;", "getStatement", "()Lorg/platypus/orm/sql/dml/Statement;", "expandArgs", "", "sql", "korm"})
public final class StatementContext {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.sql.dml.Statement<?> statement = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Iterable<kotlin.Pair<org.platypus.model.field.api.type.SqlFieldType, java.lang.Object>> args = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String sql() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String expandArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.dml.Statement<?> getStatement() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Iterable<kotlin.Pair<org.platypus.model.field.api.type.SqlFieldType, java.lang.Object>> getArgs() {
        return null;
    }
    
    public StatementContext(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.Statement<?> statement, @org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends kotlin.Pair<? extends org.platypus.model.field.api.type.SqlFieldType, ? extends java.lang.Object>> args) {
        super();
    }
}