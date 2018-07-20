package org.platypus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\u00020\u0002J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lorg/platypus/Mergable;", "M", "", "merge", "other", "(Lorg/platypus/Mergable;)Lorg/platypus/Mergable;", "korm"})
public abstract interface Mergable<M extends org.platypus.Mergable<M>> {
    
    /**
     * * Merge two object of the same type
     *     * The return object object can be [this] or a new instance
     *     * see the doc of the impl to be sure
     */
    @org.jetbrains.annotations.NotNull()
    public abstract M merge(@org.jetbrains.annotations.NotNull()
    M other);
}