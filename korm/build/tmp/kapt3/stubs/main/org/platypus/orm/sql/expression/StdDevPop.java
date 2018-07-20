package org.platypus.orm.sql.expression;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ5\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\f0\u000f2\u0006\u0010\u0010\u001a\u0002H\rH\u0016\u00a2\u0006\u0002\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0012"}, d2 = {"Lorg/platypus/orm/sql/expression/StdDevPop;", "T", "Lorg/platypus/orm/sql/expression/Function;", "Ljava/math/BigDecimal;", "expr", "Lorg/platypus/orm/sql/expression/Expression;", "scale", "", "(Lorg/platypus/orm/sql/expression/Expression;I)V", "getExpr", "()Lorg/platypus/orm/sql/expression/Expression;", "accept", "RETURN", "PARAM", "visitor", "Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "param", "(Lorg/platypus/orm/sql/expression/ExpressionVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "korm"})
public final class StdDevPop<T extends java.lang.Object> extends org.platypus.orm.sql.expression.Function<java.math.BigDecimal> {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.sql.expression.Expression<T> expr = null;
    
    @java.lang.Override()
    public <PARAM extends java.lang.Object, RETURN extends java.lang.Object>RETURN accept(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.ExpressionVisitor<PARAM, RETURN> visitor, PARAM param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.expression.Expression<T> getExpr() {
        return null;
    }
    
    public StdDevPop(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<T> expr, int scale) {
    }
}