package org.platypus.orm.sql.logging;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016\u00a8\u0006\u000e"}, d2 = {"Lorg/platypus/orm/sql/logging/StdOutSqlLogger;", "Lorg/platypus/orm/sql/logging/SqlLogger;", "()V", "log", "", "s", "", "context", "Lorg/platypus/orm/sql/dml/StatementContext;", "env", "Lorg/platypus/PlatypusEnvironment;", "logError", "e", "", "korm"})
public final class StdOutSqlLogger implements org.platypus.orm.sql.logging.SqlLogger {
    public static final org.platypus.orm.sql.logging.StdOutSqlLogger INSTANCE = null;
    
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
    
    private StdOutSqlLogger() {
        super();
    }
}