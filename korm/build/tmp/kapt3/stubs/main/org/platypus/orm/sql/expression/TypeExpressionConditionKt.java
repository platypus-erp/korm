package org.platypus.orm.sql.expression;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u001c\n\u0002\b\n\u001a-\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u0002\u00a2\u0006\u0002\u0010\u0005\u001a1\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\t\u001a\u0002H\u00022\u0006\u0010\n\u001a\u0002H\u0002\u00a2\u0006\u0002\u0010\u000b\u001a,\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\r\u001a\u0002H\u0002H\u0086\u0002\u00a2\u0006\u0002\u0010\u000e\u001a.\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u0001H\u0002H\u0086\u0004\u00a2\u0006\u0002\u0010\u000e\u001a,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\r\u001a\u0002H\u0002H\u0086\u0004\u00a2\u0006\u0002\u0010\u000e\u001a,\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\r\u001a\u0002H\u0002H\u0086\u0004\u00a2\u0006\u0002\u0010\u000e\u001a,\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\r\u001a\u0002H\u0002H\u0086\u0004\u00a2\u0006\u0002\u0010\u000e\u001a-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0015H\u0086\u0004\u001a,\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\r\u001a\u0002H\u0002H\u0086\u0004\u00a2\u0006\u0002\u0010\u000e\u001a,\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\r\u001a\u0002H\u0002H\u0086\u0004\u00a2\u0006\u0002\u0010\u000e\u001a,\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\r\u001a\u0002H\u0002H\u0086\u0002\u00a2\u0006\u0002\u0010\u000e\u001a,\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u001a\u001a\u0002H\u0002H\u0086\u0004\u00a2\u0006\u0002\u0010\u000e\u001a-\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0015H\u0086\u0004\u001a,\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\r\u001a\u0002H\u0002H\u0086\u0002\u00a2\u0006\u0002\u0010\u000e\u001a,\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\r\u001a\u0002H\u0002H\u0086\u0002\u00a2\u0006\u0002\u0010\u000e\u001a)\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u001f"}, d2 = {"asLiteralOrNull", "Lorg/platypus/orm/sql/expression/LiteralOp;", "T", "Lorg/platypus/orm/sql/expression/TypedExpression;", "value", "(Lorg/platypus/orm/sql/expression/TypedExpression;Ljava/lang/Object;)Lorg/platypus/orm/sql/expression/LiteralOp;", "between", "Lorg/platypus/orm/sql/expression/Expression;", "", "from", "to", "(Lorg/platypus/orm/sql/expression/TypedExpression;Ljava/lang/Object;Ljava/lang/Object;)Lorg/platypus/orm/sql/expression/Expression;", "div", "t", "(Lorg/platypus/orm/sql/expression/TypedExpression;Ljava/lang/Object;)Lorg/platypus/orm/sql/expression/Expression;", "eq", "eqOrNull", "greater", "greaterEq", "inList", "list", "", "less", "lessEq", "minus", "neq", "other", "notInList", "plus", "times", "wrap", "korm"})
public final class TypeExpressionConditionKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<java.lang.Boolean> eq(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<T> $receiver, @org.jetbrains.annotations.Nullable()
    T t) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<T> wrap(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<T> $receiver, T value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<java.lang.Boolean> neq(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<T> $receiver, T other) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<java.lang.Boolean> eqOrNull(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<T> $receiver, T t) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<java.lang.Boolean> less(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<T> $receiver, T t) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<java.lang.Boolean> lessEq(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<T> $receiver, T t) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<java.lang.Boolean> greater(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<T> $receiver, T t) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<java.lang.Boolean> greaterEq(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<T> $receiver, T t) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<T> plus(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<T> $receiver, T t) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<T> minus(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<T> $receiver, T t) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<T> times(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<T> $receiver, T t) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<T> div(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<T> $receiver, T t) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<java.lang.Boolean> inList(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<T> $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends T> list) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<java.lang.Boolean> notInList(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<T> $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends T> list) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object>org.platypus.orm.sql.expression.LiteralOp<T> asLiteralOrNull(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<T> $receiver, @org.jetbrains.annotations.Nullable()
    T value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<java.lang.Boolean> between(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.TypedExpression<T> $receiver, T from, T to) {
        return null;
    }
}