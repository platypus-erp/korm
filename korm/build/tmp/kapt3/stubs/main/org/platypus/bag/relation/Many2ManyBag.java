package org.platypus.bag.relation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\"\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00030\u0004B9\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0006H\u0016J\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110$H\u0014J\b\u0010%\u001a\u00020\u0011H\u0016J\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010\'2\u0006\u0010(\u001a\u00020\u0011H\u0096\u0002J\u0016\u0010)\u001a\u00020\u00112\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010\'H\u0016J\u0016\u0010+\u001a\u00020\u00112\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010\'H\u0016J\u0014\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\'0-H\u0016J\u001c\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\'0-2\u0006\u0010(\u001a\u00020\u0011H\u0016J\u0010\u0010.\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0006H\u0016J$\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\'002\u0006\u00101\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u0011H\u0016J\n\u00103\u001a\u0004\u0018\u000104H&R$\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u00128TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00028\u00018VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u0006X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u00065"}, d2 = {"Lorg/platypus/bag/relation/Many2ManyBag;", "M", "Lorg/platypus/model/Model;", "TM", "Lorg/platypus/bag/AbstractBag;", "modelID", "Lorg/platypus/cache/ModelID;", "prop", "Lorg/platypus/model/field/impl/Many2ManyField;", "env", "Lorg/platypus/PlatypusEnvironment;", "cacheProvider", "Lkotlin/Function0;", "Lorg/platypus/cache/PlatypusCache;", "(Lorg/platypus/cache/ModelID;Lorg/platypus/model/field/impl/Many2ManyField;Lorg/platypus/PlatypusEnvironment;Lkotlin/jvm/functions/Function0;)V", "_ids", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "get_ids", "()Ljava/util/ArrayList;", "getCacheProvider", "()Lkotlin/jvm/functions/Function0;", "model", "getModel", "()Lorg/platypus/model/Model;", "getModelID", "()Lorg/platypus/cache/ModelID;", "getProp", "()Lorg/platypus/model/field/impl/Many2ManyField;", "addId", "", "modelId", "createFiltredBag", "Lorg/platypus/bag/Bag;", "filtredIds", "", "delete", "get", "Lorg/platypus/entity/Record;", "index", "indexOf", "element", "lastIndexOf", "listIterator", "", "removeId", "subList", "", "fromIndex", "toIndex", "values", "Lorg/platypus/cache/ModelIDS;", "korm"})
abstract class Many2ManyBag<M extends org.platypus.model.Model<M>, TM extends org.platypus.model.Model<TM>> extends org.platypus.bag.AbstractBag<TM> {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.cache.ModelID modelID = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.field.impl.Many2ManyField<M, TM> prop = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<org.platypus.cache.PlatypusCache> cacheProvider = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public TM getModel() {
        return null;
    }
    
    @java.lang.Override()
    public boolean addId(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId) {
        return false;
    }
    
    @java.lang.Override()
    public boolean removeId(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.util.ArrayList<java.lang.Integer> get_ids() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract org.platypus.cache.ModelIDS values();
    
    @java.lang.Override()
    public int delete() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected org.platypus.bag.Bag<TM> createFiltredBag(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Integer> filtredIds) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.entity.Record<TM> get(int index) {
        return null;
    }
    
    @java.lang.Override()
    public int indexOf(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record element) {
        return 0;
    }
    
    @java.lang.Override()
    public int lastIndexOf(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record element) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.ListIterator<org.platypus.entity.Record<TM>> listIterator() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.ListIterator<org.platypus.entity.Record<TM>> listIterator(int index) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<org.platypus.entity.Record<TM>> subList(int fromIndex, int toIndex) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final org.platypus.cache.ModelID getModelID() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final org.platypus.model.field.impl.Many2ManyField<M, TM> getProp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final kotlin.jvm.functions.Function0<org.platypus.cache.PlatypusCache> getCacheProvider() {
        return null;
    }
    
    public Many2ManyBag(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelID, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2ManyField<M, TM> prop, @org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<org.platypus.cache.PlatypusCache> cacheProvider) {
        super(null, null);
    }
}