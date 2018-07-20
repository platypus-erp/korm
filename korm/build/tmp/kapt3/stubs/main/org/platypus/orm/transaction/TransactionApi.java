package org.platypus.orm.transaction;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0013H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0015"}, d2 = {"Lorg/platypus/orm/transaction/TransactionApi;", "Ljava/lang/AutoCloseable;", "connection", "Ljava/sql/Connection;", "getConnection", "()Ljava/sql/Connection;", "dbName", "", "getDbName", "()Ljava/lang/String;", "dialect", "Lorg/platypus/orm/PersistenceDialect;", "getDialect", "()Lorg/platypus/orm/PersistenceDialect;", "mode", "Lorg/platypus/orm/transaction/TransactionMode;", "getMode", "()Lorg/platypus/orm/transaction/TransactionMode;", "commit", "", "rollback", "korm"})
public abstract interface TransactionApi extends java.lang.AutoCloseable {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getDbName();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.sql.Connection getConnection();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.transaction.TransactionMode getMode();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.PersistenceDialect getDialect();
    
    public abstract void commit();
    
    public abstract void rollback();
}