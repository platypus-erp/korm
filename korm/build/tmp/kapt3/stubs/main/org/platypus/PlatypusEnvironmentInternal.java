package org.platypus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0012\u001a\u00020\u0013H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0014"}, d2 = {"Lorg/platypus/PlatypusEnvironmentInternal;", "Ljava/lang/AutoCloseable;", "cache", "Lorg/platypus/cache/PlatypusCache;", "getCache", "()Lorg/platypus/cache/PlatypusCache;", "cr", "Lorg/platypus/orm/transaction/TransactionExecutor;", "getCr", "()Lorg/platypus/orm/transaction/TransactionExecutor;", "dbName", "", "getDbName", "()Ljava/lang/String;", "dialect", "Lorg/platypus/orm/PersistenceDialect;", "getDialect", "()Lorg/platypus/orm/PersistenceDialect;", "resetCache", "", "korm"})
public abstract interface PlatypusEnvironmentInternal extends java.lang.AutoCloseable {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getDbName();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.transaction.TransactionExecutor getCr();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.cache.PlatypusCache getCache();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.PersistenceDialect getDialect();
    
    public abstract void resetCache();
}