package org.platypus.orm.sql;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003\u001a4\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0003\"\b\b\u0000\u0010\u0005*\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00050\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0003\u001a!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003*\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\fH\u0086\u0004\u001a!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u0003*\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\fH\u0086\u0004\u001a!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0003*\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\fH\u0086\u0004\u001a!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0003*\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\fH\u0086\u0004\u001a!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0003*\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\fH\u0086\u0004\u001a!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0003*\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\fH\u0086\u0004\u001a!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0003*\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\fH\u0086\u0004\u001a!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0003*\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\fH\u0086\u0004\u001a!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0003*\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\fH\u0086\u0004\u001a!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0003*\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\fH\u0086\u0004\u001a!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0003*\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\fH\u0086\u0004\u001a!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0003*\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\fH\u0086\u0004\u001a!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0003*\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\fH\u0086\u0004\u001a!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u0003*\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\fH\u0086\u0004\u00a8\u0006\u001b"}, d2 = {"case", "Lorg/platypus/orm/sql/expression/Case;", "value", "Lorg/platypus/orm/sql/expression/Expression;", "coalesce", "T", "", "expr", "alternate", "endWith", "", "Lorg/platypus/orm/sql/expression/TypedExpression;", "", "pattern", "iEndWith", "iStartWith", "ilike", "like", "notEndWith", "notIEndWith", "notILike", "notIStartWith", "notLike", "notRegexp", "notStartWith", "regexp", "startWith", "korm"})
public final class SqlExpressionBuilderKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> like(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<java.lang.String> $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String pattern) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> startWith(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<java.lang.String> $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String pattern) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> iStartWith(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<java.lang.String> $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String pattern) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> notStartWith(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<java.lang.String> $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String pattern) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> notIStartWith(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<java.lang.String> $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String pattern) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> endWith(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<java.lang.String> $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String pattern) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> iEndWith(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<java.lang.String> $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String pattern) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> notEndWith(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<java.lang.String> $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String pattern) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> notIEndWith(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<java.lang.String> $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String pattern) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> ilike(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<java.lang.String> $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String pattern) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> notLike(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<java.lang.String> $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String pattern) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> notILike(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<java.lang.String> $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String pattern) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> regexp(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<java.lang.String> $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String pattern) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> notRegexp(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<java.lang.String> $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String pattern) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<T> coalesce(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<T> expr, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<T> alternate) {
        return null;
    }
}