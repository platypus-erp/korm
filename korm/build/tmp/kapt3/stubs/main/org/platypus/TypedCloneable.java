package org.platypus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\r\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/platypus/TypedCloneable;", "T", "", "clone", "", "typedClone", "()Ljava/lang/Object;", "korm"})
public abstract interface TypedCloneable<T extends java.lang.Object> extends java.lang.Cloneable {
    
    public abstract T typedClone();
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public abstract java.lang.Object clone();
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <T extends java.lang.Object>java.lang.Object clone(org.platypus.TypedCloneable<T> $this) {
            return null;
        }
    }
}