package org.platypus.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0005H\u0086\u0002J+\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u000f0\f\"\u000e\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u0002H\u000f0\u00102\u0006\u0010\u0011\u001a\u0002H\u000fH\u0016\u00a2\u0006\u0002\u0010\u0012J=\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0006\"\u000e\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u0002H\u000f0\u0010*\b\u0012\u0004\u0012\u0002H\u000f0\u00142\u0006\u0010\u0015\u001a\u00020\u00002\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0086\u0002R2\u0010\u0003\u001a&\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004j\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006`\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u0005X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lorg/platypus/ui/search/SearchViews;", "Lorg/platypus/ui/ViewType;", "()V", "map", "Ljava/util/HashMap;", "", "Lorg/platypus/ui/search/SearchViewDefinition;", "Lkotlin/collections/HashMap;", "name", "getName", "()Ljava/lang/String;", "get", "Lorg/platypus/ui/ToViewApi;", "key", "getDefaultView", "M", "Lorg/platypus/model/Model;", "model", "(Lorg/platypus/model/Model;)Lorg/platypus/ui/ToViewApi;", "getValue", "Lorg/platypus/ui/search/SearchViewDelegate;", "thisRef", "k", "Lkotlin/reflect/KProperty;", "korm"})
public final class SearchViews implements org.platypus.ui.ViewType {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String name = "search";
    private static final java.util.HashMap<java.lang.String, org.platypus.ui.search.SearchViewDefinition<?>> map = null;
    public static final org.platypus.ui.search.SearchViews INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.platypus.ui.ToViewApi<?> get(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <M extends org.platypus.model.Model<M>>org.platypus.ui.search.SearchViewDefinition<M> getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.ui.search.SearchViewDelegate<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.ui.search.SearchViews thisRef, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> k) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <M extends org.platypus.model.Model<M>>org.platypus.ui.ToViewApi<M> getDefaultView(@org.jetbrains.annotations.NotNull()
    M model) {
        return null;
    }
    
    private SearchViews() {
        super();
    }
}