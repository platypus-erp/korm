package org.platypus.orm.sql.dml;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u001e\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lorg/platypus/orm/sql/dml/Slice;", "Lorg/platypus/orm/sql/dml/FieldSet;", "source", "Lorg/platypus/orm/sql/dml/ColumnSet;", "fieldsExpression", "", "Lorg/platypus/orm/sql/expression/Expression;", "(Lorg/platypus/orm/sql/dml/ColumnSet;Ljava/util/Set;)V", "getFieldsExpression", "()Ljava/util/Set;", "getSource", "()Lorg/platypus/orm/sql/dml/ColumnSet;", "korm"})
public final class Slice implements org.platypus.orm.sql.dml.FieldSet {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.sql.dml.ColumnSet source = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<org.platypus.orm.sql.expression.Expression<?>> fieldsExpression = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.dml.ColumnSet getSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<org.platypus.orm.sql.expression.Expression<?>> getFieldsExpression() {
        return null;
    }
    
    public Slice(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.ColumnSet source, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends org.platypus.orm.sql.expression.Expression<?>> fieldsExpression) {
        super();
    }
}