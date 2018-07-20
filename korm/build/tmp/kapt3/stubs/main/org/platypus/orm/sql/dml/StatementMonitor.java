package org.platypus.orm.sql.dml;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\fJ$\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lorg/platypus/orm/sql/dml/StatementMonitor;", "", "()V", "interceptors", "", "Lorg/platypus/orm/sql/dml/StatementInterceptor;", "notifyAfterExecution", "", "transaction", "Lorg/platypus/orm/transaction/TransactionApi;", "executedContexts", "", "Lorg/platypus/orm/sql/dml/StatementContext;", "executedStatement", "Ljava/sql/PreparedStatement;", "notifyBeforeExecution", "context", "notifyOnError", "e", "", "register", "", "interceptor", "unregister", "korm"})
public final class StatementMonitor {
    private final java.util.List<org.platypus.orm.sql.dml.StatementInterceptor> interceptors = null;
    
    public final boolean register(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.StatementInterceptor interceptor) {
        return false;
    }
    
    public final boolean unregister(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.StatementInterceptor interceptor) {
        return false;
    }
    
    public final void notifyBeforeExecution(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.transaction.TransactionApi transaction, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.StatementContext context) {
    }
    
    public final void notifyAfterExecution(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.transaction.TransactionApi transaction, @org.jetbrains.annotations.NotNull()
    java.util.List<org.platypus.orm.sql.dml.StatementContext> executedContexts, @org.jetbrains.annotations.NotNull()
    java.sql.PreparedStatement executedStatement) {
    }
    
    public final void notifyOnError(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.transaction.TransactionApi transaction, @org.jetbrains.annotations.NotNull()
    java.util.List<org.platypus.orm.sql.dml.StatementContext> executedContexts, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
    }
    
    public StatementMonitor() {
        super();
    }
}