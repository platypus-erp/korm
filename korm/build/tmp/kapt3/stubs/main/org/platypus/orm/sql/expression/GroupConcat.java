package org.platypus.orm.sql.expression;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001BW\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00122\u0010\b\u001a\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00070\n0\t\"\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00070\n\u00a2\u0006\u0002\u0010\u000bJ5\u0010\u0015\u001a\u0002H\u0016\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u00160\u00192\u0006\u0010\u001a\u001a\u0002H\u0017H\u0016\u00a2\u0006\u0002\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR+\u0010\b\u001a\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00070\n0\t\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001c"}, d2 = {"Lorg/platypus/orm/sql/expression/GroupConcat;", "Lorg/platypus/orm/sql/expression/Function;", "", "expr", "Lorg/platypus/orm/sql/expression/Expression;", "separator", "distinct", "", "orderBy", "", "Lkotlin/Pair;", "(Lorg/platypus/orm/sql/expression/Expression;Ljava/lang/String;Z[Lkotlin/Pair;)V", "getDistinct", "()Z", "getExpr", "()Lorg/platypus/orm/sql/expression/Expression;", "getOrderBy", "()[Lkotlin/Pair;", "[Lkotlin/Pair;", "getSeparator", "()Ljava/lang/String;", "accept", "RETURN", "PARAM", "visitor", "Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "param", "(Lorg/platypus/orm/sql/expression/ExpressionVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "korm"})
public final class GroupConcat extends org.platypus.orm.sql.expression.Function<java.lang.String> {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.sql.expression.Expression<?> expr = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String separator = null;
    private final boolean distinct = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Pair<org.platypus.orm.sql.expression.Expression<?>, java.lang.Boolean>[] orderBy = null;
    
    @java.lang.Override()
    public <PARAM extends java.lang.Object, RETURN extends java.lang.Object>RETURN accept(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.ExpressionVisitor<PARAM, RETURN> visitor, PARAM param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.expression.Expression<?> getExpr() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSeparator() {
        return null;
    }
    
    public final boolean getDistinct() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.platypus.orm.sql.expression.Expression<?>, java.lang.Boolean>[] getOrderBy() {
        return null;
    }
    
    public GroupConcat(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<?> expr, @org.jetbrains.annotations.Nullable()
    java.lang.String separator, boolean distinct, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<? extends org.platypus.orm.sql.expression.Expression<?>, java.lang.Boolean>... orderBy) {
    }
}