package org.platypus.orm.sql.dml.statements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u001e\u0010\u000b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\f\u001a\u00020\rH\u0016\u00a8\u0006\u000e"}, d2 = {"Lorg/platypus/orm/sql/dml/statements/StatementInterceptor;", "", "afterExecution", "", "contexts", "", "Lorg/platypus/orm/sql/dml/StatementContext;", "executedStatement", "Ljava/sql/PreparedStatement;", "beforeExecution", "context", "onError", "e", "", "korm"})
public abstract interface StatementInterceptor {
    
    public abstract void beforeExecution(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.StatementContext context);
    
    public abstract void afterExecution(@org.jetbrains.annotations.NotNull()
    java.util.List<org.platypus.orm.sql.dml.StatementContext> contexts, @org.jetbrains.annotations.NotNull()
    java.sql.PreparedStatement executedStatement);
    
    public abstract void onError(@org.jetbrains.annotations.NotNull()
    java.util.List<org.platypus.orm.sql.dml.StatementContext> contexts, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable e);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
        
        public static void beforeExecution(org.platypus.orm.sql.dml.statements.StatementInterceptor $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.dml.StatementContext context) {
        }
        
        public static void afterExecution(org.platypus.orm.sql.dml.statements.StatementInterceptor $this, @org.jetbrains.annotations.NotNull()
        java.util.List<org.platypus.orm.sql.dml.StatementContext> contexts, @org.jetbrains.annotations.NotNull()
        java.sql.PreparedStatement executedStatement) {
        }
        
        public static void onError(org.platypus.orm.sql.dml.statements.StatementInterceptor $this, @org.jetbrains.annotations.NotNull()
        java.util.List<org.platypus.orm.sql.dml.StatementContext> contexts, @org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
        }
    }
}