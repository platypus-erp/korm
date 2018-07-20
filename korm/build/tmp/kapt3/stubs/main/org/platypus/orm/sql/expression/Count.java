package org.platypus.orm.sql.expression;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J5\u0010\f\u001a\u0002H\r\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\r0\u00102\u0006\u0010\u0011\u001a\u0002H\u000eH\u0016\u00a2\u0006\u0002\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0013"}, d2 = {"Lorg/platypus/orm/sql/expression/Count;", "Lorg/platypus/orm/sql/expression/Function;", "", "expr", "Lorg/platypus/orm/sql/expression/Expression;", "distinct", "", "(Lorg/platypus/orm/sql/expression/Expression;Z)V", "getDistinct", "()Z", "getExpr", "()Lorg/platypus/orm/sql/expression/Expression;", "accept", "RETURN", "PARAM", "visitor", "Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "param", "(Lorg/platypus/orm/sql/expression/ExpressionVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "korm"})
public final class Count extends org.platypus.orm.sql.expression.Function<java.lang.Integer> {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.sql.expression.Expression<?> expr = null;
    private final boolean distinct = false;
    
    @java.lang.Override()
    public <PARAM extends java.lang.Object, RETURN extends java.lang.Object>RETURN accept(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.ExpressionVisitor<PARAM, RETURN> visitor, PARAM param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.expression.Expression<?> getExpr() {
        return null;
    }
    
    public final boolean getDistinct() {
        return false;
    }
    
    public Count(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<?> expr, boolean distinct) {
    }
}