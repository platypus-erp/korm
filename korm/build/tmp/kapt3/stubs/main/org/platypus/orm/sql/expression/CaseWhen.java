package org.platypus.orm.sql.expression;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004J(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004R/\u0010\u0006\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0013"}, d2 = {"Lorg/platypus/orm/sql/expression/CaseWhen;", "T", "", "value", "Lorg/platypus/orm/sql/expression/Expression;", "(Lorg/platypus/orm/sql/expression/Expression;)V", "cases", "Ljava/util/ArrayList;", "Lkotlin/Pair;", "", "getCases", "()Ljava/util/ArrayList;", "getValue", "()Lorg/platypus/orm/sql/expression/Expression;", "Else", "e", "When", "cond", "result", "korm"})
public final class CaseWhen<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<kotlin.Pair<org.platypus.orm.sql.expression.Expression<java.lang.Boolean>, org.platypus.orm.sql.expression.Expression<T>>> cases = null;
    @org.jetbrains.annotations.Nullable()
    private final org.platypus.orm.sql.expression.Expression<?> value = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<kotlin.Pair<org.platypus.orm.sql.expression.Expression<java.lang.Boolean>, org.platypus.orm.sql.expression.Expression<T>>> getCases() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.expression.CaseWhen<T> When(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<java.lang.Boolean> cond, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<T> result) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.expression.Expression<T> Else(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<T> e) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.platypus.orm.sql.expression.Expression<?> getValue() {
        return null;
    }
    
    public CaseWhen(@org.jetbrains.annotations.Nullable()
    org.platypus.orm.sql.expression.Expression<?> value) {
        super();
    }
}