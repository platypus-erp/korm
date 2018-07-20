package org.platypus.orm.sql;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010(\n\u0002\b\u0004\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\tH\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0013\u001a\u00020\tH\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0002J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\fX\u0088\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001b"}, d2 = {"Lorg/platypus/orm/sql/LazySizedCollection;", "T", "Lorg/platypus/orm/sql/SizedIterable;", "delegate", "(Lorg/platypus/orm/sql/SizedIterable;)V", "_empty", "", "Ljava/lang/Boolean;", "_size", "", "Ljava/lang/Integer;", "_wrapper", "", "getDelegate", "()Lorg/platypus/orm/sql/SizedIterable;", "wrapper", "getWrapper", "()Ljava/util/List;", "_count", "count", "empty", "forUpdate", "iterator", "", "limit", "offset", "notForUpdate", "korm"})
public final class LazySizedCollection<T extends java.lang.Object> implements org.platypus.orm.sql.SizedIterable<T> {
    private java.util.List<? extends T> _wrapper;
    private java.lang.Integer _size;
    private java.lang.Boolean _empty;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.sql.SizedIterable<T> delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> getWrapper() {
        return null;
    }
    
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
    @java.lang.Override()
    public org.platypus.orm.sql.SizedIterable<T> forUpdate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.SizedIterable<T> notForUpdate() {
        return null;
    }
    
    private final int _count() {
        return 0;
    }
    
    private final boolean _empty() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.SizedIterable<T> getDelegate() {
        return null;
    }
    
    public LazySizedCollection(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.SizedIterable<? extends T> delegate) {
        super();
    }
}