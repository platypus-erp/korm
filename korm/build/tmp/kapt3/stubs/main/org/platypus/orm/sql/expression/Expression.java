package org.platypus.orm.sql.expression;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J5\u0010\u0003\u001a\u0002H\u0004\"\u0004\b\u0001\u0010\u0005\"\u0004\b\u0002\u0010\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00040\u00072\u0006\u0010\b\u001a\u0002H\u0005H&\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lorg/platypus/orm/sql/expression/Expression;", "T", "", "accept", "RETURN", "PARAM", "visitor", "Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "param", "(Lorg/platypus/orm/sql/expression/ExpressionVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "korm"})
public abstract interface Expression<T extends java.lang.Object> {
    
    public abstract <PARAM extends java.lang.Object, RETURN extends java.lang.Object>RETURN accept(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.ExpressionVisitor<PARAM, RETURN> visitor, PARAM param);
}