package org.platypus.orm.transaction;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\u001d\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/platypus/orm/transaction/SqlTransactionFactory;", "", "dialectFactory", "Lorg/platypus/orm/transaction/SqlDialectFactory;", "connector", "Lkotlin/Function0;", "Ljava/sql/Connection;", "(Lorg/platypus/orm/transaction/SqlDialectFactory;Lkotlin/jvm/functions/Function0;)V", "getConnector", "()Lkotlin/jvm/functions/Function0;", "dialect", "Lorg/platypus/orm/PersistenceDialect;", "newTransaction", "Lorg/platypus/orm/transaction/TransactionApi;", "mode", "Lorg/platypus/orm/transaction/TransactionMode;", "Companion", "TransactionApiImpl", "korm"})
public final class SqlTransactionFactory {
    private final org.platypus.orm.PersistenceDialect dialect = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<java.sql.Connection> connector = null;
    public static final org.platypus.orm.transaction.SqlTransactionFactory.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.transaction.TransactionApi newTransaction(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.transaction.TransactionMode mode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<java.sql.Connection> getConnector() {
        return null;
    }
    
    private SqlTransactionFactory(org.platypus.orm.transaction.SqlDialectFactory dialectFactory, kotlin.jvm.functions.Function0<? extends java.sql.Connection> connector) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0017"}, d2 = {"Lorg/platypus/orm/transaction/SqlTransactionFactory$TransactionApiImpl;", "Lorg/platypus/orm/transaction/TransactionApi;", "mode", "Lorg/platypus/orm/transaction/TransactionMode;", "connection", "Ljava/sql/Connection;", "dialect", "Lorg/platypus/orm/PersistenceDialect;", "(Lorg/platypus/orm/transaction/TransactionMode;Ljava/sql/Connection;Lorg/platypus/orm/PersistenceDialect;)V", "getConnection", "()Ljava/sql/Connection;", "dbName", "", "getDbName", "()Ljava/lang/String;", "getDialect", "()Lorg/platypus/orm/PersistenceDialect;", "getMode", "()Lorg/platypus/orm/transaction/TransactionMode;", "close", "", "commit", "rollback", "korm"})
    static final class TransactionApiImpl implements org.platypus.orm.transaction.TransactionApi {
        @org.jetbrains.annotations.NotNull()
        private final org.platypus.orm.transaction.TransactionMode mode = null;
        @org.jetbrains.annotations.NotNull()
        private final java.sql.Connection connection = null;
        @org.jetbrains.annotations.NotNull()
        private final org.platypus.orm.PersistenceDialect dialect = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getDbName() {
            return null;
        }
        
        @java.lang.Override()
        public void commit() {
        }
        
        @java.lang.Override()
        public void rollback() {
        }
        
        @java.lang.Override()
        public void close() {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.platypus.orm.transaction.TransactionMode getMode() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.sql.Connection getConnection() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.platypus.orm.PersistenceDialect getDialect() {
            return null;
        }
        
        public TransactionApiImpl(@org.jetbrains.annotations.NotNull()
        org.platypus.orm.transaction.TransactionMode mode, @org.jetbrains.annotations.NotNull()
        java.sql.Connection connection, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.PersistenceDialect dialect) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JH\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u00a8\u0006\u0010"}, d2 = {"Lorg/platypus/orm/transaction/SqlTransactionFactory$Companion;", "", "()V", "connect", "Lorg/platypus/orm/transaction/SqlTransactionFactory;", "dialect", "Lorg/platypus/orm/transaction/SqlDialectFactory;", "url", "", "driver", "user", "password", "onOpenConnection", "Lkotlin/Function1;", "Ljava/sql/Connection;", "", "korm"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.platypus.orm.transaction.SqlTransactionFactory connect(@org.jetbrains.annotations.NotNull()
        org.platypus.orm.transaction.SqlDialectFactory dialect, @org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        java.lang.String driver, @org.jetbrains.annotations.NotNull()
        java.lang.String user, @org.jetbrains.annotations.NotNull()
        java.lang.String password, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.sql.Connection, kotlin.Unit> onOpenConnection) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}