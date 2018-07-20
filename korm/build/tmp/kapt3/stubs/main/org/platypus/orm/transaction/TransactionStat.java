package org.platypus.orm.transaction;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0006\u0010\u0019\u001a\u00020\u0013R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000b\u00a8\u0006\u001a"}, d2 = {"Lorg/platypus/orm/transaction/TransactionStat;", "Lorg/platypus/orm/sql/dml/statements/StatementInterceptor;", "()V", "map", "Ljava/util/EnumMap;", "Lorg/platypus/orm/sql/dml/StatementType;", "", "getMap", "()Ljava/util/EnumMap;", "nbDelete", "getNbDelete", "()I", "nbInsert", "getNbInsert", "nbSelect", "getNbSelect", "nbUpdate", "getNbUpdate", "afterExecution", "", "contexts", "", "Lorg/platypus/orm/sql/dml/StatementContext;", "executedStatement", "Ljava/sql/PreparedStatement;", "reset", "korm"})
public final class TransactionStat implements org.platypus.orm.sql.dml.statements.StatementInterceptor {
    @org.jetbrains.annotations.NotNull()
    private final java.util.EnumMap<org.platypus.orm.sql.dml.StatementType, java.lang.Integer> map = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.EnumMap<org.platypus.orm.sql.dml.StatementType, java.lang.Integer> getMap() {
        return null;
    }
    
    public final void reset() {
    }
    
    public final int getNbSelect() {
        return 0;
    }
    
    public final int getNbDelete() {
        return 0;
    }
    
    public final int getNbInsert() {
        return 0;
    }
    
    public final int getNbUpdate() {
        return 0;
    }
    
    @java.lang.Override()
    public void afterExecution(@org.jetbrains.annotations.NotNull()
    java.util.List<org.platypus.orm.sql.dml.StatementContext> contexts, @org.jetbrains.annotations.NotNull()
    java.sql.PreparedStatement executedStatement) {
    }
    
    public TransactionStat() {
        super();
    }
    
    public void beforeExecution(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.StatementContext context) {
    }
    
    public void onError(@org.jetbrains.annotations.NotNull()
    java.util.List<org.platypus.orm.sql.dml.StatementContext> contexts, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
    }
}