package org.platypus.bag;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B%\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\tB%\b\u0016\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\rB5\b\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u000fJ \u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0010\u0010\"\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030#H\u0016J\b\u0010$\u001a\u00020%H\u0016J\u0017\u0010&\u001a\u00020\u00162\f\u0010\'\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0096\u0002J\u001c\u0010)\u001a\u00020\u00162\u0012\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(0+H\u0016J\b\u0010,\u001a\u00020\fH\u0016J(\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0018\u0010.\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(\u0012\u0004\u0012\u00020\u00160/H\u0016J(\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0018\u00100\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(\u0012\u0004\u0012\u00020\u00160/H\u0016J\u0017\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0006\u00102\u001a\u00020\fH\u0096\u0002J\u001c\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0016\u00104\u001a\u00020\f2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016J\b\u00105\u001a\u00020\u0016H\u0016J\u0015\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(07H\u0096\u0002J\u0016\u00108\u001a\u00020\f2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016J\u001e\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u00109\u001a\u00020\f2\u0006\u0010:\u001a\u00020\fH\u0016J\u0014\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(0<H\u0016J\u001c\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(0<2\u0006\u00102\u001a\u00020\fH\u0016J\b\u0010=\u001a\u00020%H\u0002J2\u0010>\u001a\b\u0012\u0004\u0012\u0002H?0\u0003\"\u000e\b\u0001\u0010?*\b\u0012\u0004\u0012\u0002H?0\u00022\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H?0AH\u0016J2\u0010>\u001a\b\u0012\u0004\u0012\u0002H?0\u0003\"\u000e\b\u0001\u0010?*\b\u0012\u0004\u0012\u0002H?0\u00022\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H?0BH\u0016J,\u0010>\u001a\b\u0012\u0004\u0012\u0002HC0\u000b\"\b\b\u0001\u0010C*\u00020D2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002HC0EH\u0016J\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002J\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0096\u0002J\b\u0010H\u001a\u00020%H\u0016JW\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032B\u0010J\u001a\"\u0012\u001e\b\u0001\u0012\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020D0M\u0012\u0004\u0012\u00020N0L0K\"\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020D0M\u0012\u0004\u0012\u00020N0LH\u0016\u00a2\u0006\u0002\u0010OJ4\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032$\u0010J\u001a \u0012\u001c\u0012\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020D0M\u0012\u0004\u0012\u00020N0L0\u000bH\u0016J*\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020D0M2\u0006\u0010I\u001a\u00020NH\u0016J\u001d\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002J\u001d\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0096\u0002J\u001e\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010S\u001a\u00020\f2\u0006\u0010T\u001a\u00020\fH\u0016J\u001e\u0010U\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(0VH\u0002J\u001e\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(0V*\b\u0012\u0004\u0012\u00020\f0+H\u0002R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\b\u001a\u00028\u0000X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 \u00a8\u0006X"}, d2 = {"Lorg/platypus/bag/BagSearchQuery;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/bag/Bag;", "loader", "Lorg/platypus/orm/sql/query/SearchQuery;", "env", "Lorg/platypus/PlatypusEnvironment;", "model", "(Lorg/platypus/orm/sql/query/SearchQuery;Lorg/platypus/PlatypusEnvironment;Lorg/platypus/model/Model;)V", "_ids", "", "", "(Ljava/util/List;Lorg/platypus/PlatypusEnvironment;Lorg/platypus/model/Model;)V", "query", "(Lorg/platypus/orm/sql/query/SearchQuery;Ljava/util/List;Lorg/platypus/PlatypusEnvironment;Lorg/platypus/model/Model;)V", "getEnv", "()Lorg/platypus/PlatypusEnvironment;", "ids", "getIds", "()Ljava/util/List;", "loaded", "", "getLoaded", "()Z", "setLoaded", "(Z)V", "getModel", "()Lorg/platypus/model/Model;", "Lorg/platypus/model/Model;", "size", "getSize", "()I", "addField", "f", "Lorg/platypus/model/field/impl/RealModelField;", "and", "", "contains", "element", "Lorg/platypus/entity/Record;", "containsAll", "elements", "", "delete", "deleteIf", "filter", "Lkotlin/Function1;", "predicate", "get", "index", "inMemory", "indexOf", "isEmpty", "iterator", "", "lastIndexOf", "limit", "offset", "listIterator", "", "loadQuery", "mapped", "MT", "field", "Lorg/platypus/model/field/api/MultiReferencedField;", "Lorg/platypus/model/field/api/ReferencedField;", "T", "", "Lorg/platypus/model/field/api/SimpleModelField;", "minus", "other", "or", "orderBy", "columns", "", "Lkotlin/Pair;", "Lorg/platypus/model/field/api/ModelField;", "Lorg/platypus/orm/sql/query/ORDERBY_TYPE;", "([Lkotlin/Pair;)Lorg/platypus/bag/Bag;", "column", "plus", "subList", "fromIndex", "toIndex", "toIds", "Ljava/util/stream/Stream;", "toStreamRecord", "korm"})
public final class BagSearchQuery<M extends org.platypus.model.Model<M>> implements org.platypus.bag.Bag<M> {
    private boolean loaded;
    private final org.platypus.orm.sql.query.SearchQuery<M> query = null;
    private java.util.List<java.lang.Integer> _ids;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.PlatypusEnvironment env = null;
    @org.jetbrains.annotations.NotNull()
    private final M model = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.Integer> getIds() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getLoaded() {
        return false;
    }
    
    public void setLoaded(boolean p0) {
    }
    
    private final void loadQuery() {
    }
    
    private final org.platypus.bag.Bag<M> inMemory(java.util.List<java.lang.Integer> ids) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.entity.Record<M> get(int index) {
        return null;
    }
    
    @java.lang.Override()
    public int indexOf(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<M> element) {
        return 0;
    }
    
    @java.lang.Override()
    public final int indexOf(java.lang.Object p0) {
        return 0;
    }
    
    @java.lang.Override()
    public int lastIndexOf(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<M> element) {
        return 0;
    }
    
    @java.lang.Override()
    public final int lastIndexOf(java.lang.Object p0) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.ListIterator<org.platypus.entity.Record<M>> listIterator() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.ListIterator<org.platypus.entity.Record<M>> listIterator(int index) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.bag.Bag<M> subList(int fromIndex, int toIndex) {
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
    public org.platypus.bag.Bag<M> plus(@org.jetbrains.annotations.NotNull()
    org.platypus.bag.Bag<M> other) {
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
    public org.platypus.bag.Bag<M> minus(@org.jetbrains.annotations.NotNull()
    org.platypus.bag.Bag<M> other) {
        return null;
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
    public java.util.Iterator<org.platypus.entity.Record<M>> iterator() {
        return null;
    }
    
    @java.lang.Override()
    public int delete() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.bag.Bag<M> filter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.entity.Record<M>, java.lang.Boolean> predicate) {
        return null;
    }
    
    private final java.util.List<java.lang.Integer> toIds(@org.jetbrains.annotations.NotNull()
    java.util.stream.Stream<org.platypus.entity.Record<M>> $receiver) {
        return null;
    }
    
    private final java.util.stream.Stream<org.platypus.entity.Record<M>> toStreamRecord(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Integer> $receiver) {
        return null;
    }
    
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
    public org.platypus.bag.Bag<M> limit(int limit, int offset) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.bag.Bag<M> addField(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RealModelField<M, ?> f) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.bag.Bag<M> deleteIf(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.entity.Record<M>, java.lang.Boolean> filter) {
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
    public org.platypus.PlatypusEnvironment getEnv() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public M getModel() {
        return null;
    }
    
    private BagSearchQuery(org.platypus.orm.sql.query.SearchQuery<M> query, java.util.List<java.lang.Integer> _ids, org.platypus.PlatypusEnvironment env, M model) {
        super();
    }
    
    public BagSearchQuery(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.SearchQuery<M> loader, @org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    M model) {
        super();
    }
    
    public BagSearchQuery(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> _ids, @org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    M model) {
        super();
    }
    
    /**
     * * Make a clone of this bag
     */
    @org.jetbrains.annotations.NotNull()
    @org.platypus.IShouldRefractorThis(why = "don\'tknow if usefull")
    public org.platypus.bag.Bag<M> clone() {
        return null;
    }
}