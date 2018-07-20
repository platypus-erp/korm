package org.platypus.bag;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u00032\u00020\u0005B#\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00028\u0000\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0010\fJ\u001e\u0010\u0013\u001a\u00020\u00142\u0014\u0010\u0015\u001a\u0010\u0012\f\b\u0000\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0016H\u0016J\t\u0010\u0017\u001a\u00020\u0018H\u0096\u0002J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001b"}, d2 = {"Lorg/platypus/bag/IteratorInMemory;", "M", "Lorg/platypus/model/Model;", "", "Lorg/platypus/entity/Record;", "Lorg/platypus/Environmentable;", "env", "Lorg/platypus/PlatypusEnvironment;", "model", "ids", "", "", "(Lorg/platypus/PlatypusEnvironment;Lorg/platypus/model/Model;Ljava/util/Collection;)V", "getEnv", "()Lorg/platypus/PlatypusEnvironment;", "iterator", "getModel", "()Lorg/platypus/model/Model;", "Lorg/platypus/model/Model;", "forEachRemaining", "", "action", "Ljava/util/function/Consumer;", "hasNext", "", "next", "remove", "korm"})
public final class IteratorInMemory<M extends org.platypus.model.Model<M>> implements java.util.Iterator<org.platypus.entity.Record<M>>, org.platypus.Environmentable, kotlin.jvm.internal.markers.KMutableIterator {
    private final java.util.Iterator<java.lang.Integer> iterator = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.PlatypusEnvironment env = null;
    @org.jetbrains.annotations.NotNull()
    private final M model = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.entity.Record<M> next() {
        return null;
    }
    
    @java.lang.Override()
    public boolean hasNext() {
        return false;
    }
    
    @java.lang.Override()
    public void remove() {
    }
    
    @java.lang.Override()
    public void forEachRemaining(@org.jetbrains.annotations.NotNull()
    java.util.function.Consumer<? super org.platypus.entity.Record<M>> action) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.PlatypusEnvironment getEnv() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final M getModel() {
        return null;
    }
    
    public IteratorInMemory(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    M model, @org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Integer> ids) {
        super();
    }
}