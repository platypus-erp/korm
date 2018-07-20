package org.platypus.orm.sql.logging;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H&J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u001c\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH&\u00a8\u0006\f"}, d2 = {"Lorg/platypus/orm/sql/logging/SqlLogger;", "", "log", "", "s", "context", "Lorg/platypus/orm/sql/dml/StatementContext;", "env", "Lorg/platypus/PlatypusEnvironment;", "logError", "e", "", "korm"})
public abstract interface SqlLogger {
    
    public abstract void log(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.StatementContext context, @org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env);
    
    public abstract void log(@org.jetbrains.annotations.NotNull()
    java.lang.Object s);
    
    public abstract void logError(@org.jetbrains.annotations.NotNull()
    java.lang.Object s, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable e);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
    }
}