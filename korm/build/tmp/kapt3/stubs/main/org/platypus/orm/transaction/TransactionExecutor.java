package org.platypus.orm.transaction;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00d0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0003J\b\u0010Z\u001a\u00020[H\u0016J\u0006\u0010\\\u001a\u00020[J\b\u0010]\u001a\u00020[H\u0016J\u0015\u0010^\u001a\u00020\u00192\u0006\u0010_\u001a\u00020\u0019H\u0000\u00a2\u0006\u0002\b`J\u0018\u0010a\u001a\u00020\u00192\u0006\u0010b\u001a\u00020\r2\u0006\u0010c\u001a\u00020\u0019H\u0002J!\u0010d\u001a\u0004\u0018\u0001He\"\u0004\b\u0000\u0010e2\f\u0010c\u001a\b\u0012\u0004\u0012\u0002He0f\u00a2\u0006\u0002\u0010gJL\u0010d\u001a\u0004\u0018\u0001Hh\"\u0004\b\u0000\u0010e\"\u0004\b\u0001\u0010h2\f\u0010c\u001a\b\u0012\u0004\u0012\u0002He0f2#\u0010i\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u0002He0f\u0012\u0004\u0012\u0002He\u0012\u0004\u0012\u0002Hh0j\u00a2\u0006\u0002\bk\u00a2\u0006\u0002\u0010lJ\u0016\u0010m\u001a\u00020\u00192\u000e\u0010n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030oJ\u0012\u0010_\u001a\u00020\u00192\n\u0010p\u001a\u0006\u0012\u0002\b\u00030qJ\u0016\u0010_\u001a\u00020\u00192\u000e\u0010n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030rJ\u0015\u0010s\u001a\u0004\u0018\u00010[2\u0006\u0010c\u001a\u00020\u0019\u00a2\u0006\u0002\u0010tJ3\u0010s\u001a\u0004\u0018\u0001He\"\b\b\u0000\u0010e*\u00020u2\u0006\u0010c\u001a\u00020\u00192\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020x\u0012\u0004\u0012\u0002He0w\u00a2\u0006\u0002\u0010yJ\u0015\u0010z\u001a\u00020\u00192\u0006\u0010_\u001a\u00020\u0019H\u0000\u00a2\u0006\u0002\b{J\u0010\u0010|\u001a\u00020\u00192\u0006\u0010}\u001a\u00020\u0019H\u0002J\b\u0010~\u001a\u00020[H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0019X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0012\u0010\"\u001a\u00020#X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u000f\"\u0004\b(\u0010\u0011R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130*X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020.\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0012\u00101\u001a\u000202X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u00105\u001a\u000206\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u001a\u00109\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001f\"\u0004\b;\u0010!R\u0011\u0010<\u001a\u00020=\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u001a\u0010@\u001a\u00020AX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ERE\u0010F\u001a6\u0012\u0004\u0012\u00020\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\r0H0Gj\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\r0H`I\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0015\u0010L\u001a\u00060Mj\u0002`N\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010Q\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010V\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0018\u0010W\u001a\u00020\u0019*\u00020\u00198BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bX\u0010Y\u00a8\u0006\u007f"}, d2 = {"Lorg/platypus/orm/transaction/TransactionExecutor;", "Lorg/platypus/orm/transaction/TransactionApi;", "transactionImpl", "(Lorg/platypus/orm/transaction/TransactionApi;)V", "cache", "Lorg/platypus/cache/PlatypusCache;", "getCache", "()Lorg/platypus/cache/PlatypusCache;", "connection", "Ljava/sql/Connection;", "getConnection", "()Ljava/sql/Connection;", "counter", "", "getCounter", "()J", "setCounter", "(J)V", "currentStatement", "Ljava/sql/PreparedStatement;", "getCurrentStatement", "()Ljava/sql/PreparedStatement;", "setCurrentStatement", "(Ljava/sql/PreparedStatement;)V", "dbName", "", "getDbName", "()Ljava/lang/String;", "debug", "", "getDebug", "()Z", "setDebug", "(Z)V", "dialect", "Lorg/platypus/orm/PersistenceDialect;", "getDialect", "()Lorg/platypus/orm/PersistenceDialect;", "duration", "getDuration", "setDuration", "executedStatements", "", "getExecutedStatements$korm", "()Ljava/util/List;", "logger", "Lorg/platypus/orm/sql/logging/CompositeSqlLogger;", "getLogger", "()Lorg/platypus/orm/sql/logging/CompositeSqlLogger;", "mode", "Lorg/platypus/orm/transaction/TransactionMode;", "getMode", "()Lorg/platypus/orm/transaction/TransactionMode;", "monitor", "Lorg/platypus/orm/sql/dml/statements/StatementMonitor;", "getMonitor", "()Lorg/platypus/orm/sql/dml/statements/StatementMonitor;", "selectsForUpdate", "getSelectsForUpdate", "setSelectsForUpdate", "stat", "Lorg/platypus/orm/transaction/TransactionStat;", "getStat", "()Lorg/platypus/orm/transaction/TransactionStat;", "statementCount", "", "getStatementCount", "()I", "setStatementCount", "(I)V", "statementStats", "Ljava/util/HashMap;", "Lkotlin/Pair;", "Lkotlin/collections/HashMap;", "getStatementStats", "()Ljava/util/HashMap;", "statements", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "getStatements", "()Ljava/lang/StringBuilder;", "warnLongQueriesDuration", "getWarnLongQueriesDuration", "()Ljava/lang/Long;", "setWarnLongQueriesDuration", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "quoted", "getQuoted", "(Ljava/lang/String;)Ljava/lang/String;", "close", "", "closeExecutedStatements", "commit", "cutIfNecessary", "identity", "cutIfNecessary$korm", "describeStatement", "delta", "stmt", "exec", "T", "Lorg/platypus/orm/sql/dml/Statement;", "(Lorg/platypus/orm/sql/dml/Statement;)Ljava/lang/Object;", "R", "body", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Lorg/platypus/orm/sql/dml/Statement;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "fullIdentity", "column", "Lorg/platypus/model/field/api/ModelField;", "table", "Lorg/platypus/model/Model;", "Lorg/platypus/model/field/api/IModelField;", "native", "(Ljava/lang/String;)Lkotlin/Unit;", "", "transform", "Lkotlin/Function1;", "Ljava/sql/ResultSet;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "quoteIfNecessary", "quoteIfNecessary$korm", "quoteTokenIfNecessary", "token", "rollback", "korm"})
public final class TransactionExecutor implements org.platypus.orm.transaction.TransactionApi {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.sql.dml.statements.StatementMonitor monitor = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.sql.logging.CompositeSqlLogger logger = null;
    private int statementCount;
    private long duration;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long warnLongQueriesDuration;
    private boolean debug;
    private boolean selectsForUpdate;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.transaction.TransactionStat stat = null;
    private long counter;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.cache.PlatypusCache cache = null;
    @org.jetbrains.annotations.Nullable()
    private java.sql.PreparedStatement currentStatement;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.sql.PreparedStatement> executedStatements = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.StringBuilder statements = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.HashMap<java.lang.String, kotlin.Pair<java.lang.Integer, java.lang.Long>> statementStats = null;
    private final org.platypus.orm.transaction.TransactionApi transactionImpl = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.dml.statements.StatementMonitor getMonitor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.logging.CompositeSqlLogger getLogger() {
        return null;
    }
    
    public final int getStatementCount() {
        return 0;
    }
    
    public final void setStatementCount(int p0) {
    }
    
    public final long getDuration() {
        return 0L;
    }
    
    public final void setDuration(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getWarnLongQueriesDuration() {
        return null;
    }
    
    public final void setWarnLongQueriesDuration(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    public final boolean getDebug() {
        return false;
    }
    
    public final void setDebug(boolean p0) {
    }
    
    public final boolean getSelectsForUpdate() {
        return false;
    }
    
    public final void setSelectsForUpdate(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.transaction.TransactionStat getStat() {
        return null;
    }
    
    public final long getCounter() {
        return 0L;
    }
    
    public final void setCounter(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.cache.PlatypusCache getCache() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.sql.PreparedStatement getCurrentStatement() {
        return null;
    }
    
    public final void setCurrentStatement(@org.jetbrains.annotations.Nullable()
    java.sql.PreparedStatement p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.sql.PreparedStatement> getExecutedStatements$korm() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.StringBuilder getStatements() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, kotlin.Pair<java.lang.Integer, java.lang.Long>> getStatementStats() {
        return null;
    }
    
    @java.lang.Override()
    public void close() {
    }
    
    @java.lang.Override()
    public void rollback() {
    }
    
    @java.lang.Override()
    public void commit() {
    }
    
    private final java.lang.String describeStatement(long delta, java.lang.String stmt) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>T exec(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.Statement<? extends T> stmt) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object, R extends java.lang.Object>R exec(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.Statement<? extends T> stmt, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.orm.sql.dml.Statement<? extends T>, ? super T, ? extends R> body) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String quoteIfNecessary$korm(@org.jetbrains.annotations.NotNull()
    java.lang.String identity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String cutIfNecessary$korm(@org.jetbrains.annotations.NotNull()
    java.lang.String identity) {
        return null;
    }
    
    private final java.lang.String quoteTokenIfNecessary(java.lang.String token) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String identity(@org.jetbrains.annotations.NotNull()
    org.platypus.model.Model<?> table) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String fullIdentity(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ModelField<?, ?> column) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String identity(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<?, ?> column) {
        return null;
    }
    
    public final void closeExecutedStatements() {
    }
    
    private final java.lang.String getQuoted(@org.jetbrains.annotations.NotNull()
    java.lang.String $receiver) {
        return null;
    }
    
    public TransactionExecutor(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.transaction.TransactionApi transactionImpl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.sql.Connection getConnection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getDbName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.PersistenceDialect getDialect() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.transaction.TransactionMode getMode() {
        return null;
    }
}