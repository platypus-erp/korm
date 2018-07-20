package org.platypus.orm.sql.dml;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lorg/platypus/orm/sql/dml/FieldSet;", "", "fieldsExpression", "", "Lorg/platypus/orm/sql/expression/Expression;", "getFieldsExpression", "()Ljava/util/Set;", "source", "Lorg/platypus/orm/sql/dml/ColumnSet;", "getSource", "()Lorg/platypus/orm/sql/dml/ColumnSet;", "korm"})
public abstract interface FieldSet {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Set<org.platypus.orm.sql.expression.Expression<?>> getFieldsExpression();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.dml.ColumnSet getSource();
}