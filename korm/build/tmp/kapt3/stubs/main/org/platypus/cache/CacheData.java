package org.platypus.cache;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\'\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u000e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\rH\u0086\u0002J\'\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\n2\u000e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000fH\u0086\u0002J3\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u0001H\u00100\n\"\b\b\u0000\u0010\u0010*\u00020\u00012\u0010\u0010\f\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u0002H\u00100\u0011H\u0086\u0002J/\u0010\u0012\u001a\u00020\u00132\u000e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0086\u0002J/\u0010\u0012\u001a\u00020\u00132\u000e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\nH\u0086\u0002J;\u0010\u0012\u001a\u00020\u0013\"\b\b\u0000\u0010\u0010*\u00020\u00012\u0010\u0010\f\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u0002H\u00100\u00112\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u0001H\u00100\nH\u0086\u0002R>\u0010\u0003\u001a2\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0018\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R:\u0010\u0007\u001a.\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\b0\u0004j\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\b`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lorg/platypus/cache/CacheData;", "", "()V", "dataMap", "Ljava/util/HashMap;", "Lorg/platypus/model/field/api/IModelField;", "Lkotlin/collections/HashMap;", "stateMap", "Lorg/platypus/cache/CacheState;", "get", "Lkotlin/Pair;", "Lorg/platypus/cache/ModelIDS;", "field", "Lorg/platypus/model/field/api/MultiReferencedField;", "Lorg/platypus/cache/ModelID;", "Lorg/platypus/model/field/api/ReferencedField;", "T", "Lorg/platypus/model/field/api/SimpleModelField;", "set", "", "value", "korm"})
public final class CacheData {
    private final java.util.HashMap<org.platypus.model.field.api.IModelField<?, ?>, java.lang.Object> dataMap = null;
    private final java.util.HashMap<org.platypus.model.field.api.IModelField<?, ?>, org.platypus.cache.CacheState> stateMap = null;
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>kotlin.Pair<org.platypus.cache.CacheState, T> get(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.SimpleModelField<?, T> field) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.platypus.cache.CacheState, org.platypus.cache.ModelID> get(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ReferencedField<?, ?> field) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<org.platypus.cache.CacheState, org.platypus.cache.ModelIDS> get(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.MultiReferencedField<?, ?> field) {
        return null;
    }
    
    public final <T extends java.lang.Object>void set(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.SimpleModelField<?, T> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<? extends org.platypus.cache.CacheState, ? extends T> value) {
    }
    
    public final void set(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ReferencedField<?, ?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<? extends org.platypus.cache.CacheState, org.platypus.cache.ModelID> value) {
    }
    
    public final void set(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.MultiReferencedField<?, ?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<? extends org.platypus.cache.CacheState, org.platypus.cache.ModelIDS> value) {
    }
    
    private CacheData() {
        super();
    }
}