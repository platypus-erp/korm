package org.platypus.bag;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0007J \u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0010\u0010\"\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030#H\u0016J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&H&J\b\u0010\'\u001a\u00020(H\u0016J\u0017\u0010)\u001a\u00020\u00142\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0096\u0002J\u001c\u0010,\u001a\u00020\u00142\u0012\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000+0\u0010H\u0016J\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H$J\b\u00100\u001a\u00020\nH\u0016J(\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0018\u00102\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000+\u0012\u0004\u0012\u00020\u001403H\u0016J\u0013\u00104\u001a\u00020\u00142\b\u00105\u001a\u0004\u0018\u000106H\u0096\u0002J(\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0018\u00107\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000+\u0012\u0004\u0012\u00020\u001403H\u0016J\b\u00108\u001a\u00020\nH\u0016J\b\u00109\u001a\u00020\u0014H\u0016J\u0015\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000+0;H\u0096\u0002J\u001e\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010<\u001a\u00020\n2\u0006\u0010=\u001a\u00020\nH\u0016J2\u0010>\u001a\b\u0012\u0004\u0012\u0002H?0\u0003\"\u000e\b\u0001\u0010?*\b\u0012\u0004\u0012\u0002H?0\u00022\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H?0AH\u0016J2\u0010>\u001a\b\u0012\u0004\u0012\u0002H?0\u0003\"\u000e\b\u0001\u0010?*\b\u0012\u0004\u0012\u0002H?0\u00022\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H?0BH\u0016J,\u0010>\u001a\b\u0012\u0004\u0012\u0002HD0C\"\b\b\u0001\u0010D*\u0002062\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002HD0EH\u0016J\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002J\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0096\u0002J\b\u0010G\u001a\u00020(H\u0016JW\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032B\u0010I\u001a\"\u0012\u001e\b\u0001\u0012\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002060L\u0012\u0004\u0012\u00020M0K0J\"\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002060L\u0012\u0004\u0012\u00020M0KH\u0016\u00a2\u0006\u0002\u0010NJ4\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032$\u0010I\u001a \u0012\u001c\u0012\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002060L\u0012\u0004\u0012\u00020M0K0CH\u0016J*\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002060L2\u0006\u0010H\u001a\u00020MH\u0016J\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002J\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0096\u0002J\u0010\u0010Q\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&H&J\b\u0010R\u001a\u00020SH\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u00028\u0000X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 \u00a8\u0006T"}, d2 = {"Lorg/platypus/bag/AbstractBag;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/bag/Bag;", "env", "Lorg/platypus/PlatypusEnvironment;", "model", "(Lorg/platypus/PlatypusEnvironment;Lorg/platypus/model/Model;)V", "_ids", "Ljava/util/ArrayList;", "", "get_ids", "()Ljava/util/ArrayList;", "getEnv", "()Lorg/platypus/PlatypusEnvironment;", "ids", "", "getIds", "()Ljava/util/Collection;", "loaded", "", "getLoaded", "()Z", "getModel", "()Lorg/platypus/model/Model;", "Lorg/platypus/model/Model;", "repository", "Lorg/platypus/repository/RecordRepositoryImpl;", "getRepository", "()Lorg/platypus/repository/RecordRepositoryImpl;", "size", "getSize", "()I", "addField", "f", "Lorg/platypus/model/field/impl/RealModelField;", "addId", "modelId", "Lorg/platypus/cache/ModelID;", "and", "", "contains", "element", "Lorg/platypus/entity/Record;", "containsAll", "elements", "createFiltredBag", "filtredIds", "delete", "deleteIf", "filter", "Lkotlin/Function1;", "equals", "other", "", "predicate", "hashCode", "isEmpty", "iterator", "", "limit", "offset", "mapped", "MT", "field", "Lorg/platypus/model/field/api/MultiReferencedField;", "Lorg/platypus/model/field/api/ReferencedField;", "", "T", "Lorg/platypus/model/field/api/SimpleModelField;", "minus", "or", "orderBy", "columns", "", "Lkotlin/Pair;", "Lorg/platypus/model/field/api/ModelField;", "Lorg/platypus/orm/sql/query/ORDERBY_TYPE;", "([Lkotlin/Pair;)Lorg/platypus/bag/Bag;", "column", "plus", "removeId", "toString", "", "korm"})
public abstract class AbstractBag<M extends org.platypus.model.Model<M>> implements org.platypus.bag.Bag<M> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<java.lang.Integer> _ids = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.PlatypusEnvironment env = null;
    @org.jetbrains.annotations.NotNull()
    private final M model = null;
    
    @org.jetbrains.annotations.NotNull()
    protected java.util.ArrayList<java.lang.Integer> get_ids() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Collection<java.lang.Integer> getIds() {
        return null;
    }
    
    public abstract boolean addId(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId);
    
    public abstract boolean removeId(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId);
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.bag.Bag<M> orderBy(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ModelField<M, java.lang.Object> column, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.ORDERBY_TYPE orderBy) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.bag.Bag<M> orderBy(@org.jetbrains.annotations.NotNull()
    kotlin.Pair<? extends org.platypus.model.field.api.ModelField<M, java.lang.Object>, ? extends org.platypus.orm.sql.query.ORDERBY_TYPE>... columns) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.bag.Bag<M> orderBy(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends kotlin.Pair<? extends org.platypus.model.field.api.ModelField<M, java.lang.Object>, ? extends org.platypus.orm.sql.query.ORDERBY_TYPE>> columns) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.bag.Bag<M> addField(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RealModelField<M, ?> f) {
        return null;
    }
    
    @java.lang.Override()
    public int getSize() {
        return 0;
    }
    
    @java.lang.Override()
    public final int size() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean contains(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<M> element) {
        return false;
    }
    
    @java.lang.Override()
    public final boolean contains(java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public boolean containsAll(@org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends java.lang.Object> elements) {
        return false;
    }
    
    @java.lang.Override()
    public boolean isEmpty() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.bag.Bag<M> filter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.entity.Record<M>, java.lang.Boolean> predicate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract org.platypus.bag.Bag<M> createFiltredBag(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Integer> filtredIds);
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Iterator<org.platypus.entity.Record<M>> iterator() {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.bag.Bag<M> plus(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<M> other) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.bag.Bag<M> minus(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<M> other) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.bag.Bag<M> plus(@org.jetbrains.annotations.NotNull()
    org.platypus.bag.Bag<M> other) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.bag.Bag<M> minus(@org.jetbrains.annotations.NotNull()
    org.platypus.bag.Bag<M> other) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final org.platypus.repository.RecordRepositoryImpl<M> getRepository() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getLoaded() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.bag.Bag<M> limit(int limit, int offset) {
        return null;
    }
    
    @java.lang.Override()
    public void or() {
    }
    
    @java.lang.Override()
    public void and() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.bag.Bag<M> deleteIf(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.entity.Record<M>, java.lang.Boolean> filter) {
        return null;
    }
    
    @java.lang.Override()
    public int delete() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <T extends java.lang.Object>java.util.List<T> mapped(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.SimpleModelField<M, T> field) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <MT extends org.platypus.model.Model<MT>>org.platypus.bag.Bag<MT> mapped(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ReferencedField<M, MT> field) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <MT extends org.platypus.model.Model<MT>>org.platypus.bag.Bag<MT> mapped(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.MultiReferencedField<M, MT> field) {
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
    
    public AbstractBag(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    M model) {
        super();
    }
    
    @java.lang.Override()
    public final int indexOf(java.lang.Object p0) {
        return 0;
    }
    
    public abstract int indexOf(org.platypus.entity.Record p0);
    
    @java.lang.Override()
    public final int lastIndexOf(java.lang.Object p0) {
        return 0;
    }
    
    public abstract int lastIndexOf(org.platypus.entity.Record p0);
    
    /**
     * * Make a clone of this bag
     */
    @org.jetbrains.annotations.NotNull()
    @org.platypus.IShouldRefractorThis(why = "don\'tknow if usefull")
    public org.platypus.bag.Bag<M> clone() {
        return null;
    }
}