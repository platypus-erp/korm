package org.platypus.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0000\u00a2\u0006\u0002\b\u000bJ,\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t*\u00020\u00062\u0006\u0010\r\u001a\u00028\u00002\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0086\u0002\u00a2\u0006\u0002\u0010\u0010R*\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/platypus/entity/Selection;", "S", "", "()V", "_selection", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getUnsafe", "Lorg/platypus/entity/SelectionValue;", "value", "getUnsafe$korm", "getValue", "receiver", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/String;Lorg/platypus/entity/Selection;Lkotlin/reflect/KProperty;)Lorg/platypus/entity/SelectionValue;", "korm"})
public abstract class Selection<S extends org.platypus.entity.Selection<S>> {
    private final java.util.HashMap<java.lang.String, java.lang.String> _selection = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.entity.SelectionValue<S> getValue(@org.jetbrains.annotations.NotNull()
    java.lang.String $receiver, @org.jetbrains.annotations.NotNull()
    S receiver, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> property) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.platypus.entity.SelectionValue<S> getUnsafe$korm(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    public Selection() {
        super();
    }
}