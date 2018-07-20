package org.platypus.orm.sql.expression;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u001a7\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0003*\u0002H\u0002\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0086\u0002\u001aS\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b*\u0014\u0012\u0004\u0012\u0002H\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\n0\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001H\u0086\u0004\u001a7\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001\"\b\b\u0000\u0010\u0003*\u0002H\u0002\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0086\u0004\u001a7\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001\"\b\b\u0000\u0010\u0003*\u0002H\u0002\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0086\u0004\u001a4\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001\"\b\b\u0000\u0010\u0003*\u0002H\u0002\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001\u001a4\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001\"\b\b\u0000\u0010\u0003*\u0002H\u0002\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001\u001a&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001\"\b\b\u0000\u0010\u0003*\u0002H\u0002\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001\"\b\b\u0000\u0010\u0003*\u0002H\u0002\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a4\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001\"\b\b\u0000\u0010\u0003*\u0002H\u0002\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001\u001a4\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001\"\b\b\u0000\u0010\u0003*\u0002H\u0002\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001\u001a7\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0003*\u0002H\u0002\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0086\u0002\u001a7\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0003*\u0002H\u0002\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0086\u0002\u001a7\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0003*\u0002H\u0002\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0086\u0002\u00a8\u0006\u0016"}, d2 = {"div", "Lorg/platypus/orm/sql/expression/Expression;", "T", "S", "other", "eq", "", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/model/field/api/IModelField;", "Lorg/platypus/entity/Record;", "", "eqOrNull", "greater", "greaterEq", "isNotNull", "isNull", "less", "lessEq", "minus", "plus", "times", "korm"})
public final class ExpressionConditionKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final <S extends T, T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<java.lang.Boolean> eq(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<T> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<S> other) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <M extends org.platypus.model.Model<M>, T extends org.platypus.model.Model<T>>org.platypus.orm.sql.expression.Expression<java.lang.Boolean> eq(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<M, org.platypus.entity.Record<T>> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<java.lang.Integer> other) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <S extends T, T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<java.lang.Boolean> eqOrNull(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<T> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<S> other) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <S extends T, T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<java.lang.Boolean> isNull(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<T> $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <S extends T, T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<java.lang.Boolean> isNotNull(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<T> $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <S extends T, T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<java.lang.Boolean> less(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<T> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<S> other) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <S extends T, T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<java.lang.Boolean> lessEq(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<T> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<S> other) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <S extends T, T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<java.lang.Boolean> greater(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<T> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<S> other) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <S extends T, T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<java.lang.Boolean> greaterEq(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<T> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<S> other) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <S extends T, T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<T> plus(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<T> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<S> other) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <S extends T, T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<T> minus(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<T> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<S> other) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <S extends T, T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<T> times(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<T> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<S> other) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <S extends T, T extends java.lang.Object>org.platypus.orm.sql.expression.Expression<T> div(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<T> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<S> other) {
        return null;
    }
}