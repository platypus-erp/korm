package org.platypus.orm.sql;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0002\b\u0003\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0096\u0002J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0010"}, d2 = {"Lorg/platypus/orm/sql/SizedCollection;", "T", "Lorg/platypus/orm/sql/SizedIterable;", "delegate", "", "(Ljava/util/Collection;)V", "getDelegate", "()Ljava/util/Collection;", "count", "", "empty", "", "iterator", "", "limit", "offset", "korm"})
public final class SizedCollection<T extends java.lang.Object> implements org.platypus.orm.sql.SizedIterable<T> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Collection<T> delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.SizedIterable<T> limit(int limit, int offset) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Iterator<T> iterator() {
        return null;
    }
    
    @java.lang.Override()
    public int count() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean empty() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Collection<T> getDelegate() {
        return null;
    }
    
    public SizedCollection(@org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends T> delegate) {
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