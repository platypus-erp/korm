package org.platypus.cache;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u00a6\u0002J/\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t2\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\rH\u00a6\u0002J/\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000eH\u00a6\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0003H&J \u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0012\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0013H&J7\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tH\u00a6\u0002J7\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000e2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\tH\u00a6\u0002JC\u0010\u0014\u001a\u00020\u0015\"\b\b\u0000\u0010\u0017*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\f\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u0002H\u00170\u00182\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00170\tH\u00a6\u0002\u00a8\u0006\u0019"}, d2 = {"Lorg/platypus/cache/PlatypusCacheApi;", "", "cacheId", "Lorg/platypus/cache/ModelID;", "modelId", "delete", "", "get", "Lorg/platypus/cache/CacheData;", "Lkotlin/Pair;", "Lorg/platypus/cache/CacheState;", "Lorg/platypus/cache/ModelIDS;", "field", "Lorg/platypus/model/field/api/MultiReferencedField;", "Lorg/platypus/model/field/api/ReferencedField;", "isInDB", "isNotInDB", "isToUpdate", "prop", "Lorg/platypus/model/field/api/IModelField;", "set", "", "value", "T", "Lorg/platypus/model/field/api/SimpleModelField;", "korm"})
public abstract interface PlatypusCacheApi {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.cache.CacheData get(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.Pair<org.platypus.cache.CacheState, org.platypus.cache.ModelID> get(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ReferencedField<?, ?> field);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.Pair<org.platypus.cache.CacheState, org.platypus.cache.ModelIDS> get(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.MultiReferencedField<?, ?> field);
    
    public abstract <T extends java.lang.Object>void set(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.SimpleModelField<?, T> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<? extends org.platypus.cache.CacheState, ? extends T> value);
    
    public abstract void set(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ReferencedField<?, ?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<? extends org.platypus.cache.CacheState, org.platypus.cache.ModelID> value);
    
    public abstract void set(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.MultiReferencedField<?, ?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<? extends org.platypus.cache.CacheState, org.platypus.cache.ModelIDS> value);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.cache.ModelID cacheId(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId);
    
    public abstract boolean isNotInDB(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId);
    
    public abstract boolean isInDB(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId);
    
    public abstract boolean isToUpdate(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<?, ?> prop);
    
    public abstract boolean delete(@org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelId);
}