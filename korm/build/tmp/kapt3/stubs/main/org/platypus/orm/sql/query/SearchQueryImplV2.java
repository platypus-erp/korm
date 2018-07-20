package org.platypus.orm.sql.query;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B%\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u00a2\u0006\u0002\u0010\u000bJ\"\u0010\u000f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00120\u00110\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J3\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032#\u0010\u001a\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001c0\u001b\u00a2\u0006\u0002\b\u001dH\u0016J\u000e\u0010\u001e\u001a\u0004\u0018\u00010\u0005*\u00020\u001fH\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\b\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lorg/platypus/orm/sql/query/SearchQueryImplV2;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/orm/sql/query/SearchQueryV2;", "Lorg/platypus/orm/sql/dml/Statement;", "Ljava/sql/ResultSet;", "env", "Lorg/platypus/PlatypusEnvironment;", "model", "selectPart", "Lorg/platypus/orm/sql/query/SearchQuerySelectPart;", "(Lorg/platypus/PlatypusEnvironment;Lorg/platypus/model/Model;Lorg/platypus/orm/sql/query/SearchQuerySelectPart;)V", "getEnv", "()Lorg/platypus/PlatypusEnvironment;", "Lorg/platypus/model/Model;", "arguments", "", "Ljava/util/ArrayList;", "Lkotlin/Pair;", "Lorg/platypus/model/field/api/type/SqlFieldType;", "", "prepareSQL", "", "qb", "Lorg/platypus/orm/sql/QueryBuilder;", "select", "slice", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "executeInternal", "Ljava/sql/PreparedStatement;", "korm"})
public final class SearchQueryImplV2<M extends org.platypus.model.Model<M>> extends org.platypus.orm.sql.dml.Statement<java.sql.ResultSet> implements org.platypus.orm.sql.query.SearchQueryV2<M> {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.PlatypusEnvironment env = null;
    private final M model = null;
    private final org.platypus.orm.sql.query.SearchQuerySelectPart<M> selectPart = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String prepareSQL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String prepareSQL(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.QueryBuilder qb) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.sql.ResultSet executeInternal(@org.jetbrains.annotations.NotNull()
    java.sql.PreparedStatement $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.util.ArrayList<kotlin.Pair<org.platypus.model.field.api.type.SqlFieldType, java.lang.Object>>> arguments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.SearchQueryV2<M> select(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.orm.sql.query.SearchQuerySelectPart<M>, ? super M, kotlin.Unit> slice) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.PlatypusEnvironment getEnv() {
        return null;
    }
    
    public SearchQueryImplV2(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    M model, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.SearchQuerySelectPart<M> selectPart) {
        super(null, null, null);
    }
}