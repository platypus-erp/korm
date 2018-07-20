package org.platypus.orm.sql.expression;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u0002H\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0003B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u00a2\u0006\u0002\u0010\u0006J5\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0002\u0010\f\"\u0004\b\u0003\u0010\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u000b0\u000e2\u0006\u0010\u000f\u001a\u0002H\fH\u0016\u00a2\u0006\u0002\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lorg/platypus/orm/sql/expression/DivideOp;", "T", "S", "Lorg/platypus/orm/sql/expression/Expression;", "expr1", "expr2", "(Lorg/platypus/orm/sql/expression/Expression;Lorg/platypus/orm/sql/expression/Expression;)V", "getExpr1", "()Lorg/platypus/orm/sql/expression/Expression;", "getExpr2", "accept", "RETURN", "PARAM", "visitor", "Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "param", "(Lorg/platypus/orm/sql/expression/ExpressionVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "korm"})
public final class DivideOp<T extends java.lang.Object, S extends T> implements org.platypus.orm.sql.expression.Expression<T> {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.sql.expression.Expression<T> expr1 = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.sql.expression.Expression<S> expr2 = null;
    
    @java.lang.Override()
    public <PARAM extends java.lang.Object, RETURN extends java.lang.Object>RETURN accept(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.ExpressionVisitor<PARAM, RETURN> visitor, PARAM param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.expression.Expression<T> getExpr1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.expression.Expression<S> getExpr2() {
        return null;
    }
    
    public DivideOp(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<T> expr1, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<S> expr2) {
        super();
    }
}