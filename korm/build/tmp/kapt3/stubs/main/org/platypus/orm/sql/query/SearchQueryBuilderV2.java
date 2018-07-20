package org.platypus.orm.sql.query;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003J3\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002#\u0010\u000b\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\f\u00a2\u0006\u0002\b\u000fH&J9\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002)\u0010\u0011\u001a%\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\f\u00a2\u0006\u0002\b\u000fH&J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H&J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0016H&J9\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002)\u0010\u0011\u001a%\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\f\u00a2\u0006\u0002\b\u000fH&JO\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002:\u0010\u001b\u001a\u001e\u0012\u001a\b\u0001\u0012\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001e\u0012\u0004\u0012\u00020\u001f0\u001d0\u001c\"\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001e\u0012\u0004\u0012\u00020\u001f0\u001dH&\u00a2\u0006\u0002\u0010 J0\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002 \u0010\u001b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001e\u0012\u0004\u0012\u00020\u001f0\u001d0\u0015H&J(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010!\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001e2\b\b\u0002\u0010\u001a\u001a\u00020\u001fH&J9\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002)\u0010\u0011\u001a%\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\f\u00a2\u0006\u0002\b\u000fH&R&\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006#"}, d2 = {"Lorg/platypus/orm/sql/query/SearchQueryBuilderV2;", "M", "Lorg/platypus/model/Model;", "", "currentPredicate", "Lkotlin/Function1;", "Lorg/platypus/orm/sql/expression/Expression;", "", "getCurrentPredicate", "()Lkotlin/jvm/functions/Function1;", "adjustSelect", "slice", "Lkotlin/Function2;", "Lorg/platypus/orm/sql/query/FieldUnaryPlus;", "", "Lkotlin/ExtensionFunctionType;", "and", "predicate", "Lorg/platypus/orm/sql/query/FieldGetter;", "copy", "execute", "", "", "limit", "offset", "or", "orderBy", "columns", "", "Lkotlin/Pair;", "Lorg/platypus/model/field/api/ModelField;", "Lorg/platypus/orm/sql/query/ORDERBY_TYPE;", "([Lkotlin/Pair;)Lorg/platypus/orm/sql/query/SearchQueryBuilderV2;", "column", "where", "korm"})
public abstract interface SearchQueryBuilderV2<M extends org.platypus.model.Model<M>> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.jvm.functions.Function1<M, org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> getCurrentPredicate();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.query.SearchQueryBuilderV2<M> adjustSelect(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.orm.sql.query.FieldUnaryPlus<M>, ? super M, kotlin.Unit> slice);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.query.SearchQueryBuilderV2<M> orderBy(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ModelField<?, ?> column, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.ORDERBY_TYPE orderBy);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.query.SearchQueryBuilderV2<M> orderBy(@org.jetbrains.annotations.NotNull()
    kotlin.Pair<? extends org.platypus.model.field.api.ModelField<?, ?>, ? extends org.platypus.orm.sql.query.ORDERBY_TYPE>... columns);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.query.SearchQueryBuilderV2<M> orderBy(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends kotlin.Pair<? extends org.platypus.model.field.api.ModelField<?, ?>, ? extends org.platypus.orm.sql.query.ORDERBY_TYPE>> columns);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.query.SearchQueryBuilderV2<M> limit(int limit, int offset);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.query.SearchQueryBuilderV2<M> where(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.orm.sql.query.FieldGetter<M>, ? super M, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> predicate);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.query.SearchQueryBuilderV2<M> or(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.orm.sql.query.FieldGetter<M>, ? super M, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> predicate);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.query.SearchQueryBuilderV2<M> and(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.orm.sql.query.FieldGetter<M>, ? super M, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> predicate);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.Integer> execute();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.query.SearchQueryBuilderV2<M> copy();
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
    }
}