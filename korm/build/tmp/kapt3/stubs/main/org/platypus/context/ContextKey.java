package org.platypus.context;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u000eJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00028\u0000H\u00a6\u0004\u00a2\u0006\u0002\u0010\rR\u0012\u0010\u0003\u001a\u00028\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lorg/platypus/context/ContextKey;", "T", "", "default", "getDefault", "()Ljava/lang/Object;", "name", "", "getName", "()Ljava/lang/String;", "of", "Lorg/platypus/context/ContextKey$Value;", "value", "(Ljava/lang/Object;)Lorg/platypus/context/ContextKey$Value;", "Value", "korm"})
public abstract interface ContextKey<T extends java.lang.Object> {
    
    public abstract T getDefault();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getName();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.context.ContextKey.Value<T> of(T value);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u00c6\u0003J\u000e\u0010\r\u001a\u00028\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00028\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lorg/platypus/context/ContextKey$Value;", "T", "", "key", "Lorg/platypus/context/ContextKey;", "value", "(Lorg/platypus/context/ContextKey;Ljava/lang/Object;)V", "getKey", "()Lorg/platypus/context/ContextKey;", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(Lorg/platypus/context/ContextKey;Ljava/lang/Object;)Lorg/platypus/context/ContextKey$Value;", "equals", "", "other", "hashCode", "", "toString", "", "korm"})
    public static final class Value<T extends java.lang.Object> {
        @org.jetbrains.annotations.NotNull()
        private final org.platypus.context.ContextKey<T> key = null;
        private final T value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final org.platypus.context.ContextKey<T> getKey() {
            return null;
        }
        
        public final T getValue() {
            return null;
        }
        
        public Value(@org.jetbrains.annotations.NotNull()
        org.platypus.context.ContextKey<T> key, T value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.platypus.context.ContextKey<T> component1() {
            return null;
        }
        
        public final T component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.platypus.context.ContextKey.Value<T> copy(@org.jetbrains.annotations.NotNull()
        org.platypus.context.ContextKey<T> key, T value) {
            return null;
        }
        
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(java.lang.Object p0) {
            return false;
        }
    }
}