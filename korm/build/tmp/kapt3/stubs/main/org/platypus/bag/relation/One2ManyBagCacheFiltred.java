package org.platypus.bag.relation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004BG\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00182\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0014J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lorg/platypus/bag/relation/One2ManyBagCacheFiltred;", "M", "Lorg/platypus/model/Model;", "TM", "Lorg/platypus/bag/relation/One2ManyBag;", "modelID", "Lorg/platypus/cache/ModelID;", "prop", "Lorg/platypus/model/field/impl/One2ManyField;", "env", "Lorg/platypus/PlatypusEnvironment;", "cacheProvider", "Lkotlin/Function0;", "Lorg/platypus/cache/PlatypusCache;", "ids", "", "", "(Lorg/platypus/cache/ModelID;Lorg/platypus/model/field/impl/One2ManyField;Lorg/platypus/PlatypusEnvironment;Lkotlin/jvm/functions/Function0;Ljava/util/Collection;)V", "filtredIds", "", "addId", "", "modelId", "createFiltredBag", "Lorg/platypus/bag/Bag;", "removeId", "values", "Lorg/platypus/cache/ModelIDS;", "korm"})
final class One2ManyBagCacheFiltred<M extends org.platypus.model.Model<M>, TM extends org.platypus.model.Model<TM>> extends org.platypus.bag.relation.One2ManyBag<M, TM> {
    private final java.util.List<java.lang.Integer> filtredIds = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.platypus.cache.ModelIDS values() {
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
    protected org.platypus.bag.Bag<TM> createFiltredBag(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Integer> filtredIds) {
        return null;
    }
    
    public One2ManyBagCacheFiltred(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelID, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2ManyField<M, TM> prop, @org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<org.platypus.cache.PlatypusCache> cacheProvider, @org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Integer> ids) {
        super(null, null, null, null);
    }
}