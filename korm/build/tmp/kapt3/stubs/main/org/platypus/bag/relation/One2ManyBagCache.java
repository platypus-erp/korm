package org.platypus.bag.relation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004B9\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0014J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016\u00a8\u0006\u0016"}, d2 = {"Lorg/platypus/bag/relation/One2ManyBagCache;", "M", "Lorg/platypus/model/Model;", "TM", "Lorg/platypus/bag/relation/One2ManyBag;", "modelID", "Lorg/platypus/cache/ModelID;", "prop", "Lorg/platypus/model/field/impl/One2ManyField;", "env", "Lorg/platypus/PlatypusEnvironment;", "cacheProvider", "Lkotlin/Function0;", "Lorg/platypus/cache/PlatypusCache;", "(Lorg/platypus/cache/ModelID;Lorg/platypus/model/field/impl/One2ManyField;Lorg/platypus/PlatypusEnvironment;Lkotlin/jvm/functions/Function0;)V", "createFiltredBag", "Lorg/platypus/bag/Bag;", "filtredIds", "", "", "values", "Lorg/platypus/cache/ModelIDS;", "korm"})
final class One2ManyBagCache<M extends org.platypus.model.Model<M>, TM extends org.platypus.model.Model<TM>> extends org.platypus.bag.relation.One2ManyBag<M, TM> {
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.platypus.cache.ModelIDS values() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected org.platypus.bag.Bag<TM> createFiltredBag(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Integer> filtredIds) {
        return null;
    }
    
    public One2ManyBagCache(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelID, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2ManyField<M, TM> prop, @org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<org.platypus.cache.PlatypusCache> cacheProvider) {
        super(null, null, null, null);
    }
}