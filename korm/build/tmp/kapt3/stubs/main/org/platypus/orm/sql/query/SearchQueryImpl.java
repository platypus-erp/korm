package org.platypus.orm.sql.query;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003Bk\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u001e\b\u0002\u0010\u000f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u00a2\u0006\u0002\u0010\u0013J3\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032#\u0010 \u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020#0!\u00a2\u0006\u0002\b$H\u0016J9\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002)\u0010\t\u001a%\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0!\u00a2\u0006\u0002\b$H\u0016J\u0015\u0010\'\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\b)J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0+H\u0016J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rH\u0016J9\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002)\u0010\t\u001a%\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0!\u00a2\u0006\u0002\b$H\u0016JO\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032:\u0010.\u001a\u001e\u0012\u001a\b\u0001\u0012\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u000300\u0012\u0004\u0012\u00020\u00120\u00110/\"\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u000300\u0012\u0004\u0012\u00020\u00120\u0011H\u0016\u00a2\u0006\u0002\u00101J0\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032 \u0010.\u001a\u001c\u0012\u0018\u0012\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u000300\u0012\u0004\u0012\u00020\u00120\u00110+H\u0016J&\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u000e\u00102\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003002\u0006\u0010-\u001a\u00020\u0012H\u0016J9\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032)\u0010\t\u001a%\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0!\u00a2\u0006\u0002\b$H\u0016R$\u0010\u000f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u00120\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lorg/platypus/orm/sql/query/SearchQueryImpl;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/orm/sql/query/SearchQuery;", "model", "env", "Lorg/platypus/PlatypusEnvironment;", "searchPart", "Lorg/platypus/orm/sql/query/SearchQuerySelectPartImpl;", "predicate", "Lorg/platypus/orm/sql/expression/Expression;", "", "offset", "", "limit", "_orderByColumns", "", "Lkotlin/Pair;", "Lorg/platypus/orm/sql/query/ORDERBY_TYPE;", "(Lorg/platypus/model/Model;Lorg/platypus/PlatypusEnvironment;Lorg/platypus/orm/sql/query/SearchQuerySelectPartImpl;Lorg/platypus/orm/sql/expression/Expression;IILjava/util/List;)V", "currentPredicate", "Lkotlin/Function1;", "getCurrentPredicate", "()Lkotlin/jvm/functions/Function1;", "getEnv", "()Lorg/platypus/PlatypusEnvironment;", "Lorg/platypus/model/Model;", "modelAlias", "Lorg/platypus/model/Alias;", "getModelAlias", "()Lorg/platypus/model/Alias;", "adjustSelect", "select", "Lkotlin/Function2;", "Lorg/platypus/orm/sql/query/SearchQuerySelectPart;", "", "Lkotlin/ExtensionFunctionType;", "and", "Lorg/platypus/orm/sql/query/SearchQueryWherePart;", "buildQuery", "Lorg/platypus/orm/sql/query/Query;", "buildQuery$korm", "execute", "", "or", "orderBy", "columns", "", "Lorg/platypus/model/field/api/ModelField;", "([Lkotlin/Pair;)Lorg/platypus/orm/sql/query/SearchQuery;", "column", "where", "korm"})
public final class SearchQueryImpl<M extends org.platypus.model.Model<M>> implements org.platypus.orm.sql.query.SearchQuery<M> {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.Alias<M> modelAlias = null;
    private final M model = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.PlatypusEnvironment env = null;
    private final org.platypus.orm.sql.query.SearchQuerySelectPartImpl<M> searchPart = null;
    private final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> predicate = null;
    private final int offset = 0;
    private final int limit = 0;
    private final java.util.List<kotlin.Pair<org.platypus.orm.sql.expression.Expression<?>, org.platypus.orm.sql.query.ORDERBY_TYPE>> _orderByColumns = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.jvm.functions.Function1<M, org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> getCurrentPredicate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.Alias<M> getModelAlias() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.query.Query buildQuery$korm(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.SearchQuery<M> adjustSelect(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.orm.sql.query.SearchQuerySelectPart<M>, ? super M, kotlin.Unit> select) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.Integer> execute() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.SearchQuery<M> orderBy(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ModelField<?, ?> column, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.ORDERBY_TYPE orderBy) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.SearchQuery<M> orderBy(@org.jetbrains.annotations.NotNull()
    kotlin.Pair<? extends org.platypus.model.field.api.ModelField<?, ?>, ? extends org.platypus.orm.sql.query.ORDERBY_TYPE>... columns) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.SearchQuery<M> orderBy(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends kotlin.Pair<? extends org.platypus.model.field.api.ModelField<?, ?>, ? extends org.platypus.orm.sql.query.ORDERBY_TYPE>> columns) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.SearchQuery<M> limit(int limit, int offset) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.SearchQueryImpl<M> or(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.orm.sql.query.SearchQueryWherePart<M>, ? super M, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> predicate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.SearchQueryImpl<M> and(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.orm.sql.query.SearchQueryWherePart<M>, ? super M, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> predicate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.SearchQuery<M> where(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.orm.sql.query.SearchQueryWherePart<M>, ? super M, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> predicate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.PlatypusEnvironment getEnv() {
        return null;
    }
    
    public SearchQueryImpl(@org.jetbrains.annotations.NotNull()
    M model, @org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.SearchQuerySelectPartImpl<M> searchPart, @org.jetbrains.annotations.Nullable()
    org.platypus.orm.sql.expression.Expression<java.lang.Boolean> predicate, int offset, int limit, @org.jetbrains.annotations.NotNull()
    java.util.List<kotlin.Pair<org.platypus.orm.sql.expression.Expression<?>, org.platypus.orm.sql.query.ORDERBY_TYPE>> _orderByColumns) {
        super();
    }
}