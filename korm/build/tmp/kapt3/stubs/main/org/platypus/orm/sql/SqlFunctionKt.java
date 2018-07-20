package org.platypus.orm.sql;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000|\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a \u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a&\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\t\"\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a$\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u001a\u0012\u0010\u0010\u001a\u00020\u0011*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r\u001a\u0012\u0010\u0012\u001a\u00020\u0011*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r\u001a\u0012\u0010\u0013\u001a\u00020\u0014*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0005\u001a\u001a\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0017*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r\u001a\u001a\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0019*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r\u001a\u0012\u0010\u001a\u001a\u00020\u001b*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0005\u001a$\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u001d*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u001a$\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u001f*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u001a\u001a\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0!*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r\u001a\u001c\u0010\"\u001a\u00020#\"\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a$\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0%*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u001a$\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\'*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u00a8\u0006("}, d2 = {"lower", "Lorg/platypus/orm/sql/expression/LowerCase;", "T", "", "expr", "Lorg/platypus/orm/sql/expression/Expression;", "not", "Lorg/platypus/orm/sql/expression/NotOp;", "upper", "Lorg/platypus/orm/sql/expression/UpperCase;", "avg", "Lorg/platypus/orm/sql/expression/Avg;", "", "Lorg/platypus/model/field/api/ModelField;", "scale", "", "count", "Lorg/platypus/orm/sql/expression/Count;", "countDistinct", "date", "Lorg/platypus/orm/sql/expression/Date;", "Ljava/time/LocalDate;", "max", "Lorg/platypus/orm/sql/expression/Max;", "min", "Lorg/platypus/orm/sql/expression/Min;", "month", "Lorg/platypus/orm/sql/expression/Month;", "stdDevPop", "Lorg/platypus/orm/sql/expression/StdDevPop;", "stdDevSamp", "Lorg/platypus/orm/sql/expression/StdDevSamp;", "sum", "Lorg/platypus/orm/sql/expression/Sum;", "trim", "Lorg/platypus/orm/sql/expression/Trim;", "varPop", "Lorg/platypus/orm/sql/expression/VarPop;", "varSamp", "Lorg/platypus/orm/sql/expression/VarSamp;", "korm"})
public final class SqlFunctionKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.orm.sql.expression.Count count(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ModelField<?, ?> $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.orm.sql.expression.Date date(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<java.time.LocalDate> $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.orm.sql.expression.Month month(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<java.time.LocalDate> $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.orm.sql.expression.Count countDistinct(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ModelField<?, ?> $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.orm.sql.expression.Min<? extends java.lang.Object> min(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ModelField<?, ?> $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.orm.sql.expression.Max<? extends java.lang.Object> max(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ModelField<?, ?> $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.orm.sql.expression.Avg<? extends java.lang.Object> avg(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ModelField<?, ?> $receiver, int scale) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.orm.sql.expression.StdDevPop<? extends java.lang.Object> stdDevPop(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ModelField<?, ?> $receiver, int scale) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.orm.sql.expression.StdDevSamp<? extends java.lang.Object> stdDevSamp(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ModelField<?, ?> $receiver, int scale) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.orm.sql.expression.VarPop<? extends java.lang.Object> varPop(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ModelField<?, ?> $receiver, int scale) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.orm.sql.expression.VarSamp<? extends java.lang.Object> varSamp(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ModelField<?, ?> $receiver, int scale) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.orm.sql.expression.Sum<? extends java.lang.Object> sum(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ModelField<?, ?> $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.String>org.platypus.orm.sql.expression.Trim trim(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<T> $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.String>org.platypus.orm.sql.expression.UpperCase<T> upper(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<T> expr) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.String>org.platypus.orm.sql.expression.LowerCase<T> lower(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<T> expr) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>org.platypus.orm.sql.expression.NotOp<T> not(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<T> expr) {
        return null;
    }
}