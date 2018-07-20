package org.platypus.orm.sql.expression;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J5\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\f0\u000f2\u0006\u0010\u0010\u001a\u0002H\rH\u0016\u00a2\u0006\u0002\u0010\u0011J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lorg/platypus/orm/sql/expression/ExpressionAlias;", "T", "Lorg/platypus/orm/sql/expression/Expression;", "delegate", "alias", "", "(Lorg/platypus/orm/sql/expression/Expression;Ljava/lang/String;)V", "getAlias", "()Ljava/lang/String;", "getDelegate", "()Lorg/platypus/orm/sql/expression/Expression;", "accept", "RETURN", "PARAM", "visitor", "Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "param", "(Lorg/platypus/orm/sql/expression/ExpressionVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "aliasOnlyExpression", "korm"})
public final class ExpressionAlias<T extends java.lang.Object> implements org.platypus.orm.sql.expression.Expression<T> {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.sql.expression.Expression<T> delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String alias = null;
    
    @java.lang.Override()
    public <PARAM extends java.lang.Object, RETURN extends java.lang.Object>RETURN accept(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.ExpressionVisitor<PARAM, RETURN> visitor, PARAM param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.expression.Expression<T> aliasOnlyExpression() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.expression.Expression<T> getDelegate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAlias() {
        return null;
    }
    
    public ExpressionAlias(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<T> delegate, @org.jetbrains.annotations.NotNull()
    java.lang.String alias) {
        super();
    }
}