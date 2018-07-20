package org.platypus.orm.sql;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\t\u0010\t\u001a\u00020\bH\u0096\u0002J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u000e\u0010\r\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lorg/platypus/orm/sql/EmptySizedIterable;", "T", "Lorg/platypus/orm/sql/SizedIterable;", "", "()V", "count", "", "empty", "", "hasNext", "iterator", "limit", "offset", "next", "()Ljava/lang/Object;", "korm"})
public final class EmptySizedIterable<T extends java.lang.Object> implements org.platypus.orm.sql.SizedIterable<T>, java.util.Iterator<T>, kotlin.jvm.internal.markers.KMappedMarker {
    
    @java.lang.Override()
    public int count() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.SizedIterable<T> limit(int limit, int offset) {
        return null;
    }
    
    @java.lang.Override()
    public boolean empty() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Iterator<T> iterator() {
        return null;
    }
    
    @java.lang.Override()
    public T next() {
        return null;
    }
    
    @java.lang.Override()
    public boolean hasNext() {
        return false;
    }
    
    public EmptySizedIterable() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.platypus.orm.sql.SizedIterable<T> forUpdate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.platypus.orm.sql.SizedIterable<T> notForUpdate() {
        return null;
    }
}