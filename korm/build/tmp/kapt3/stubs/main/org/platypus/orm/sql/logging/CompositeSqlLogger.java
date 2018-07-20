package org.platypus.orm.sql.logging;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001J\u001e\u0010\t\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001e\u0010\u0019\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u000e\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lorg/platypus/orm/sql/logging/CompositeSqlLogger;", "Lorg/platypus/orm/sql/logging/SqlLogger;", "Lorg/platypus/orm/sql/dml/statements/StatementInterceptor;", "()V", "loggers", "Ljava/util/ArrayList;", "addLogger", "", "logger", "afterExecution", "contexts", "", "Lorg/platypus/orm/sql/dml/StatementContext;", "executedStatement", "Ljava/sql/PreparedStatement;", "beforeExecution", "context", "log", "s", "", "env", "Lorg/platypus/PlatypusEnvironment;", "logError", "e", "", "onError", "removeLogger", "korm"})
public final class CompositeSqlLogger implements org.platypus.orm.sql.logging.SqlLogger, org.platypus.orm.sql.dml.statements.StatementInterceptor {
    private final java.util.ArrayList<org.platypus.orm.sql.logging.SqlLogger> loggers = null;
    
    public final void addLogger(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.logging.SqlLogger logger) {
    }
    
    public final void removeLogger(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.logging.SqlLogger logger) {
    }
    
    @java.lang.Override()
    public void log(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.StatementContext context, @org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env) {
    }
    
    @java.lang.Override()
    public void log(@org.jetbrains.annotations.NotNull()
    java.lang.Object s) {
    }
    
    @java.lang.Override()
    public void logError(@org.jetbrains.annotations.NotNull()
    java.lang.Object s, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable e) {
    }
    
    @java.lang.Override()
    public void beforeExecution(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.StatementContext context) {
    }
    
    @java.lang.Override()
    public void afterExecution(@org.jetbrains.annotations.NotNull()
    java.util.List<org.platypus.orm.sql.dml.StatementContext> contexts, @org.jetbrains.annotations.NotNull()
    java.sql.PreparedStatement executedStatement) {
    }
    
    @java.lang.Override()
    public void onError(@org.jetbrains.annotations.NotNull()
    java.util.List<org.platypus.orm.sql.dml.StatementContext> contexts, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
    }
    
    public CompositeSqlLogger() {
        super();
    }
}