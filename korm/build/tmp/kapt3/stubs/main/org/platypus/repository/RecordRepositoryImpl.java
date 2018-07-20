package org.platypus.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001dH\u0016J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u0010\u0010%\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0016\u0010%\u001a\u00020\"2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0002J-\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u001d\u0010+\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0012\u0004\u0012\u00020\'0,\u00a2\u0006\u0002\b-H\u0016J-\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u001d\u0010+\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0012\u0004\u0012\u00020\'0,\u00a2\u0006\u0002\b-H\u0016J-\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u001d\u0010+\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0012\u0004\u0012\u00020\'0,\u00a2\u0006\u0002\b-H\u0016J-\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u001d\u0010+\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0012\u0004\u0012\u00020\'0,\u00a2\u0006\u0002\b-H\u0016J\u001c\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J3\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122#\u0010\u0013\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\'03\u00a2\u0006\u0002\b-H\u0016J3\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182#\u0010+\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\'03\u00a2\u0006\u0002\b-H\u0016J\u0016\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u00106\u001a\u000207H\u0016J9\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122)\u00109\u001a%\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000:\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0;03\u00a2\u0006\u0002\b-H\u0016J9\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182)\u00109\u001a%\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000:\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0;03\u00a2\u0006\u0002\b-H\u0016J/\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u001a\u0010>\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030@0?\"\u0006\u0012\u0002\b\u00030@H\u0016\u00a2\u0006\u0002\u0010AJ\u0012\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018*\u00020\u0005H\u0002J\u0012\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018*\u00020DH\u0002J\f\u0010E\u001a\u00020\"*\u00020DH\u0002J\u0018\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001a0G*\b\u0012\u0004\u0012\u00020\u001a0\u001dH\u0002J\u0018\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001a0G*\b\u0012\u0004\u0012\u00020\u001a0\u001dH\u0002J\f\u0010I\u001a\u00020\"*\u00020DH\u0002R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00028\u0000X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006J"}, d2 = {"Lorg/platypus/repository/RecordRepositoryImpl;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/repository/RecordRepository;", "env", "Lorg/platypus/PlatypusEnvironment;", "model", "(Lorg/platypus/PlatypusEnvironment;Lorg/platypus/model/Model;)V", "datas", "Lorg/platypus/data/DataRef;", "getDatas", "()Lorg/platypus/data/DataRef;", "getEnv", "()Lorg/platypus/PlatypusEnvironment;", "getModel", "()Lorg/platypus/model/Model;", "Lorg/platypus/model/Model;", "bagOf", "Lorg/platypus/bag/Bag;", "query", "Lorg/platypus/orm/sql/query/Query;", "Lorg/platypus/orm/sql/query/SearchQuery;", "buildQuery", "byId", "Lorg/platypus/entity/Record;", "id", "", "byIds", "ids", "", "byRef", "ref", "", "throwError", "", "create", "entity", "delete", "loadInCache", "", "modelID", "Lorg/platypus/cache/ModelIDS;", "new", "init", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "newTmp", "newTmpWithDefault", "newWithDefault", "recordOf", "search", "Lkotlin/Function2;", "searchFirst", "sudo", "user", "Lorg/platypus/security/PlatypusUser;", "where", "predicate", "Lorg/platypus/orm/sql/query/SearchQueryWherePart;", "Lorg/platypus/orm/sql/expression/Expression;", "whereFirst", "withContext", "vals", "", "Lorg/platypus/context/ContextKey$Value;", "([Lorg/platypus/context/ContextKey$Value;)Lorg/platypus/repository/RecordRepository;", "empty", "emptyEntity", "Lorg/platypus/cache/ModelID;", "exist", "filterInCache", "", "filterInDb", "testCache", "korm"})
public final class RecordRepositoryImpl<M extends org.platypus.model.Model<M>> implements org.platypus.repository.RecordRepository<M> {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.PlatypusEnvironment env = null;
    @org.jetbrains.annotations.NotNull()
    private final M model = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.data.DataRef<M> getDatas() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.entity.Record<M> byId(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.bag.Bag<M> byIds(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Integer> ids) {
        return null;
    }
    
    private final java.util.List<java.lang.Integer> filterInDb(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Integer> $receiver) {
        return null;
    }
    
    private final java.util.List<java.lang.Integer> filterInCache(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Integer> $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.entity.Record<M> byRef(@org.jetbrains.annotations.NotNull()
    java.lang.String ref, boolean throwError) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.bag.Bag<M> where(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.orm.sql.query.SearchQueryWherePart<M>, ? super M, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> predicate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.entity.Record<M> whereFirst(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.orm.sql.query.SearchQueryWherePart<M>, ? super M, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> predicate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.entity.Record<M> newWithDefault(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.entity.Record<M>, kotlin.Unit> init) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.entity.Record<M> newTmp(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.entity.Record<M>, kotlin.Unit> init) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.entity.Record<M> newTmpWithDefault(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.entity.Record<M>, kotlin.Unit> init) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.entity.Record<M> create(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<M> entity) {
        return null;
    }
    
    private final void loadInCache(org.platypus.cache.ModelIDS modelID) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.bag.Bag<M> bagOf(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.Query query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.bag.Bag<M> bagOf(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.SearchQuery<M> query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.entity.Record<M> recordOf(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.SearchQuery<M> query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.SearchQuery<M> buildQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.entity.Record<M> searchFirst(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.orm.sql.query.SearchQuery<M>, ? super M, kotlin.Unit> init) {
        return null;
    }
    
    private final boolean testCache(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID $receiver) {
        return false;
    }
    
    private final boolean exist(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID $receiver) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.bag.Bag<M> search(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.orm.sql.query.SearchQuery<M>, ? super M, kotlin.Unit> query) {
        return null;
    }
    
    private final org.platypus.entity.Record<M> empty(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment $receiver) {
        return null;
    }
    
    @java.lang.Override()
    public boolean delete(int id) {
        return false;
    }
    
    @java.lang.Override()
    public boolean delete(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<M> id) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.repository.RecordRepository<M> withContext(@org.jetbrains.annotations.NotNull()
    org.platypus.context.ContextKey.Value<?>... vals) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.repository.RecordRepository<M> sudo(@org.jetbrains.annotations.NotNull()
    org.platypus.security.PlatypusUser user) {
        return null;
    }
    
    private final org.platypus.entity.Record<M> emptyEntity(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.PlatypusEnvironment getEnv() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public M getModel() {
        return null;
    }
    
    public RecordRepositoryImpl(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    M model) {
        super();
    }
}