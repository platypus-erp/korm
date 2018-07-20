package org.platypus.orm.sql.predicate;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J5\u0010\b\u001a\u0002H\t\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\t0\f2\u0006\u0010\r\u001a\u0002H\nH\u0016\u00a2\u0006\u0002\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000f"}, d2 = {"Lorg/platypus/orm/sql/predicate/Exists;", "Lorg/platypus/orm/sql/expression/Expression;", "", "query", "Lorg/platypus/orm/sql/query/Query;", "(Lorg/platypus/orm/sql/query/Query;)V", "getQuery", "()Lorg/platypus/orm/sql/query/Query;", "accept", "RETURN", "PARAM", "visitor", "Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "param", "(Lorg/platypus/orm/sql/expression/ExpressionVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "korm"})
public final class Exists implements org.platypus.orm.sql.expression.Expression<java.lang.Boolean> {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.sql.query.Query query = null;
    
    @java.lang.Override()
    public <PARAM extends java.lang.Object, RETURN extends java.lang.Object>RETURN accept(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.ExpressionVisitor<PARAM, RETURN> visitor, PARAM param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.query.Query getQuery() {
        return null;
    }
    
    public Exists(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.Query query) {
        super();
    }
}