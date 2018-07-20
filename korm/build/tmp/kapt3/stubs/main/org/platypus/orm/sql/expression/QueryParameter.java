package org.platypus.orm.sql.expression;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0006J5\u0010\f\u001a\u0002H\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\r0\u00102\u0006\u0010\u0011\u001a\u0002H\u000eH\u0016\u00a2\u0006\u0002\u0010\u0012R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lorg/platypus/orm/sql/expression/QueryParameter;", "T", "Lorg/platypus/orm/sql/expression/Expression;", "colType", "Lorg/platypus/model/field/api/type/SqlFieldType;", "value", "(Lorg/platypus/model/field/api/type/SqlFieldType;Ljava/lang/Object;)V", "getColType", "()Lorg/platypus/model/field/api/type/SqlFieldType;", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "accept", "RETURN", "PARAM", "visitor", "Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "param", "(Lorg/platypus/orm/sql/expression/ExpressionVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "korm"})
public final class QueryParameter<T extends java.lang.Object> implements org.platypus.orm.sql.expression.Expression<T> {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.field.api.type.SqlFieldType colType = null;
    private final T value = null;
    
    @java.lang.Override()
    public <PARAM extends java.lang.Object, RETURN extends java.lang.Object>RETURN accept(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.ExpressionVisitor<PARAM, RETURN> visitor, PARAM param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.api.type.SqlFieldType getColType() {
        return null;
    }
    
    public final T getValue() {
        return null;
    }
    
    public QueryParameter(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.type.SqlFieldType colType, T value) {
        super();
    }
}