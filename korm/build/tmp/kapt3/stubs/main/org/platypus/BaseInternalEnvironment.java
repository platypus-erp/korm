package org.platypus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016R$\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005@RX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lorg/platypus/BaseInternalEnvironment;", "Lorg/platypus/PlatypusEnvironmentInternal;", "trApi", "Lorg/platypus/orm/transaction/TransactionApi;", "initialCache", "Lorg/platypus/cache/PlatypusCache;", "(Lorg/platypus/orm/transaction/TransactionApi;Lorg/platypus/cache/PlatypusCache;)V", "<set-?>", "cache", "getCache", "()Lorg/platypus/cache/PlatypusCache;", "setCache", "(Lorg/platypus/cache/PlatypusCache;)V", "cr", "Lorg/platypus/orm/transaction/TransactionExecutor;", "getCr", "()Lorg/platypus/orm/transaction/TransactionExecutor;", "dbName", "", "getDbName", "()Ljava/lang/String;", "dialect", "Lorg/platypus/orm/PersistenceDialect;", "getDialect", "()Lorg/platypus/orm/PersistenceDialect;", "close", "", "resetCache", "korm"})
public final class BaseInternalEnvironment implements org.platypus.PlatypusEnvironmentInternal {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String dbName = null;
    @org.jetbrains.annotations.NotNull()
    private org.platypus.cache.PlatypusCache cache;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.PersistenceDialect dialect = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.transaction.TransactionExecutor cr = null;
    private final org.platypus.cache.PlatypusCache initialCache = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getDbName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.cache.PlatypusCache getCache() {
        return null;
    }
    
    private void setCache(org.platypus.cache.PlatypusCache p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.PersistenceDialect getDialect() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.transaction.TransactionExecutor getCr() {
        return null;
    }
    
    @java.lang.Override()
    public void resetCache() {
    }
    
    @java.lang.Override()
    public void close() {
    }
    
    public BaseInternalEnvironment(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.transaction.TransactionApi trApi, @org.jetbrains.annotations.NotNull()
    org.platypus.cache.PlatypusCache initialCache) {
        super();
    }
}