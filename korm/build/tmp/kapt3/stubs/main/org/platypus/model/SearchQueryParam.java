package org.platypus.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003Bk\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00060\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012$\b\u0002\u0010\f\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u001b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00060\u0005H\u00c6\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u000bH\u00c6\u0003J%\u0010\u001e\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u000f0\u000e0\rH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u000bH\u00c6\u0003Ju\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00060\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\t\u0010#\u001a\u00020\u000bH\u00d6\u0001J\t\u0010$\u001a\u00020%H\u00d6\u0001R!\u0010\u0004\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R-\u0010\f\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006&"}, d2 = {"Lorg/platypus/model/SearchQueryParam;", "M", "Lorg/platypus/model/Model;", "", "fields", "", "Lorg/platypus/model/field/api/ModelField;", "where", "Lorg/platypus/orm/sql/expression/Expression;", "", "limit", "", "orderBy", "", "Lkotlin/Pair;", "Lorg/platypus/orm/sql/query/ORDERBY_TYPE;", "offset", "(Ljava/util/Set;Lorg/platypus/orm/sql/expression/Expression;ILjava/util/List;I)V", "getFields", "()Ljava/util/Set;", "getLimit", "()I", "getOffset", "getOrderBy", "()Ljava/util/List;", "getWhere", "()Lorg/platypus/orm/sql/expression/Expression;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "korm"})
public final class SearchQueryParam<M extends org.platypus.model.Model<M>> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<org.platypus.model.field.api.ModelField<M, ?>> fields = null;
    @org.jetbrains.annotations.Nullable()
    private final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> where = null;
    private final int limit = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<kotlin.Pair<org.platypus.model.field.api.ModelField<M, ?>, org.platypus.orm.sql.query.ORDERBY_TYPE>> orderBy = null;
    private final int offset = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.platypus.model.field.api.ModelField<M, ?>> getFields() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> getWhere() {
        return null;
    }
    
    public final int getLimit() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<kotlin.Pair<org.platypus.model.field.api.ModelField<M, ?>, org.platypus.orm.sql.query.ORDERBY_TYPE>> getOrderBy() {
        return null;
    }
    
    public final int getOffset() {
        return 0;
    }
    
    public SearchQueryParam(@org.jetbrains.annotations.NotNull()
    java.util.Set<org.platypus.model.field.api.ModelField<M, ?>> fields, @org.jetbrains.annotations.Nullable()
    org.platypus.orm.sql.expression.Expression<java.lang.Boolean> where, int limit, @org.jetbrains.annotations.NotNull()
    java.util.List<kotlin.Pair<org.platypus.model.field.api.ModelField<M, ?>, org.platypus.orm.sql.query.ORDERBY_TYPE>> orderBy, int offset) {
        super();
    }
    
    public SearchQueryParam() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.platypus.model.field.api.ModelField<M, ?>> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<kotlin.Pair<org.platypus.model.field.api.ModelField<M, ?>, org.platypus.orm.sql.query.ORDERBY_TYPE>> component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.SearchQueryParam<M> copy(@org.jetbrains.annotations.NotNull()
    java.util.Set<org.platypus.model.field.api.ModelField<M, ?>> fields, @org.jetbrains.annotations.Nullable()
    org.platypus.orm.sql.expression.Expression<java.lang.Boolean> where, int limit, @org.jetbrains.annotations.NotNull()
    java.util.List<kotlin.Pair<org.platypus.model.field.api.ModelField<M, ?>, org.platypus.orm.sql.query.ORDERBY_TYPE>> orderBy, int offset) {
        return null;
    }
    
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(java.lang.Object p0) {
        return false;
    }
}