package org.platypus.orm.sql.query;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003J3\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002#\u0010\u000b\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\f\u00a2\u0006\u0002\b\u000fH&J9\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002)\u0010\u0011\u001a%\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\f\u00a2\u0006\u0002\b\u000fH&J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H&J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0015H&J9\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002)\u0010\u0011\u001a%\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\f\u00a2\u0006\u0002\b\u000fH&JO\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002:\u0010\u001a\u001a\u001e\u0012\u001a\b\u0001\u0012\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001d\u0012\u0004\u0012\u00020\u001e0\u001c0\u001b\"\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001d\u0012\u0004\u0012\u00020\u001e0\u001cH&\u00a2\u0006\u0002\u0010\u001fJ0\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002 \u0010\u001a\u001a\u001c\u0012\u0018\u0012\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001d\u0012\u0004\u0012\u00020\u001e0\u001c0\u0014H&J(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010 \u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001d2\b\b\u0002\u0010\u0019\u001a\u00020\u001eH&J9\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002)\u0010\u0011\u001a%\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\f\u00a2\u0006\u0002\b\u000fH&R&\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\""}, d2 = {"Lorg/platypus/orm/sql/query/SearchQuery;", "M", "Lorg/platypus/model/Model;", "", "currentPredicate", "Lkotlin/Function1;", "Lorg/platypus/orm/sql/expression/Expression;", "", "getCurrentPredicate", "()Lkotlin/jvm/functions/Function1;", "adjustSelect", "select", "Lkotlin/Function2;", "Lorg/platypus/orm/sql/query/SearchQuerySelectPart;", "", "Lkotlin/ExtensionFunctionType;", "and", "predicate", "Lorg/platypus/orm/sql/query/SearchQueryWherePart;", "execute", "", "", "limit", "offset", "or", "orderBy", "columns", "", "Lkotlin/Pair;", "Lorg/platypus/model/field/api/ModelField;", "Lorg/platypus/orm/sql/query/ORDERBY_TYPE;", "([Lkotlin/Pair;)Lorg/platypus/orm/sql/query/SearchQuery;", "column", "where", "korm"})
public abstract interface SearchQuery<M extends org.platypus.model.Model<M>> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.jvm.functions.Function1<M, org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> getCurrentPredicate();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.query.SearchQuery<M> adjustSelect(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.orm.sql.query.SearchQuerySelectPart<M>, ? super M, kotlin.Unit> select);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.query.SearchQuery<M> orderBy(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ModelField<?, ?> column, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.ORDERBY_TYPE orderBy);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.query.SearchQuery<M> orderBy(@org.jetbrains.annotations.NotNull()
    kotlin.Pair<? extends org.platypus.model.field.api.ModelField<?, ?>, ? extends org.platypus.orm.sql.query.ORDERBY_TYPE>... columns);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.query.SearchQuery<M> orderBy(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends kotlin.Pair<? extends org.platypus.model.field.api.ModelField<?, ?>, ? extends org.platypus.orm.sql.query.ORDERBY_TYPE>> columns);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.query.SearchQuery<M> limit(int limit, int offset);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.query.SearchQuery<M> where(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.orm.sql.query.SearchQueryWherePart<M>, ? super M, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> predicate);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.query.SearchQuery<M> or(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.orm.sql.query.SearchQueryWherePart<M>, ? super M, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> predicate);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.query.SearchQuery<M> and(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.orm.sql.query.SearchQueryWherePart<M>, ? super M, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> predicate);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.Integer> execute();
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
    }
}