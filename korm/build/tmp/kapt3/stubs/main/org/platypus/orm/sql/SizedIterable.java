package org.platypus.orm.sql;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016\u00a8\u0006\u000b"}, d2 = {"Lorg/platypus/orm/sql/SizedIterable;", "T", "", "count", "", "empty", "", "forUpdate", "limit", "offset", "notForUpdate", "korm"})
public abstract interface SizedIterable<T extends java.lang.Object> extends java.lang.Iterable<T>, kotlin.jvm.internal.markers.KMappedMarker {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.SizedIterable<T> limit(int limit, int offset);
    
    public abstract int count();
    
    public abstract boolean empty();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.SizedIterable<T> forUpdate();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.SizedIterable<T> notForUpdate();
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        public static <T extends java.lang.Object>org.platypus.orm.sql.SizedIterable<T> forUpdate(org.platypus.orm.sql.SizedIterable<? extends T> $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static <T extends java.lang.Object>org.platypus.orm.sql.SizedIterable<T> notForUpdate(org.platypus.orm.sql.SizedIterable<? extends T> $this) {
            return null;
        }
    }
}