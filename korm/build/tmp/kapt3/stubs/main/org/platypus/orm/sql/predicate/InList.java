package org.platypus.orm.sql.predicate;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bJ5\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0001\u0010\u000f\"\u0004\b\u0002\u0010\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u000e0\u00112\u0006\u0010\u0012\u001a\u0002H\u000fH\u0016\u00a2\u0006\u0002\u0010\u0013R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lorg/platypus/orm/sql/predicate/InList;", "T", "Lorg/platypus/orm/sql/expression/Expression;", "", "expr", "Lorg/platypus/orm/sql/expression/TypedExpression;", "list", "", "(Lorg/platypus/orm/sql/expression/TypedExpression;Ljava/lang/Iterable;)V", "getExpr", "()Lorg/platypus/orm/sql/expression/TypedExpression;", "getList", "()Ljava/lang/Iterable;", "accept", "RETURN", "PARAM", "visitor", "Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "param", "(Lorg/platypus/orm/sql/expression/ExpressionVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "korm"})
public final class InList<T extends java.lang.Object> implements org.platypus.orm.sql.expression.Expression<java.lang.Boolean> {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.sql.expression.TypedExpression<T> expr = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Iterable<T> list = null;
    
    @java.lang.Override()
    public <PARAM extends java.lang.Object, RETURN extends java.lang.Object>RETURN accept(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.ExpressionVisitor<PARAM, RETURN> visitor, PARAM param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.expression.TypedExpression<T> getExpr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Iterable<T> getList() {
        return null;
    }
    
    public InList(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<T> expr, @org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends T> list) {
        super();
    }
}