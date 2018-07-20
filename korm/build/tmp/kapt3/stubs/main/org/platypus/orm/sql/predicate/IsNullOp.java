package org.platypus.orm.sql.predicate;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0001\u00a2\u0006\u0002\u0010\u0004J5\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\b0\u000b2\u0006\u0010\f\u001a\u0002H\tH\u0016\u00a2\u0006\u0002\u0010\rR\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lorg/platypus/orm/sql/predicate/IsNullOp;", "Lorg/platypus/orm/sql/expression/Expression;", "", "expr", "(Lorg/platypus/orm/sql/expression/Expression;)V", "getExpr", "()Lorg/platypus/orm/sql/expression/Expression;", "accept", "RETURN", "PARAM", "visitor", "Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "param", "(Lorg/platypus/orm/sql/expression/ExpressionVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "korm"})
public final class IsNullOp implements org.platypus.orm.sql.expression.Expression<java.lang.Boolean> {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.sql.expression.Expression<?> expr = null;
    
    @java.lang.Override()
    public <PARAM extends java.lang.Object, RETURN extends java.lang.Object>RETURN accept(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.ExpressionVisitor<PARAM, RETURN> visitor, PARAM param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.expression.Expression<?> getExpr() {
        return null;
    }
    
    public IsNullOp(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<?> expr) {
        super();
    }
}