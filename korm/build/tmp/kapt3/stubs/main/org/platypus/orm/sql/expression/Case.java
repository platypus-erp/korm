package org.platypus.orm.sql.expression;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J.\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\t0\u0003R\u0017\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lorg/platypus/orm/sql/expression/Case;", "", "value", "Lorg/platypus/orm/sql/expression/Expression;", "(Lorg/platypus/orm/sql/expression/Expression;)V", "getValue", "()Lorg/platypus/orm/sql/expression/Expression;", "When", "Lorg/platypus/orm/sql/expression/CaseWhen;", "T", "cond", "", "result", "korm"})
public final class Case {
    @org.jetbrains.annotations.Nullable()
    private final org.platypus.orm.sql.expression.Expression<?> value = null;
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>org.platypus.orm.sql.expression.CaseWhen<T> When(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<java.lang.Boolean> cond, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<T> result) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.platypus.orm.sql.expression.Expression<?> getValue() {
        return null;
    }
    
    public Case(@org.jetbrains.annotations.Nullable()
    org.platypus.orm.sql.expression.Expression<?> value) {
        super();
    }
    
    public Case() {
        super();
    }
}