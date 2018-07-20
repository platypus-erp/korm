package org.platypus.orm.sql.dml;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b\u00a2\u0006\u0002\u0010\nJ\"\u0010\u0018\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001a0\u00190\u0019H&J\r\u0010\u001c\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u001dJ!\u0010\u001e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\b0\u001aH\u0000\u00a2\u0006\u0002\b J\b\u0010!\u001a\u00020\"H\u0014J\b\u0010#\u001a\u00020\"H\u0014J\b\u0010$\u001a\u00020%H&J\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020%H\u0016J\u0013\u0010)\u001a\u0004\u0018\u00018\u0000*\u00020\'H&\u00a2\u0006\u0002\u0010*R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u001b\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006+"}, d2 = {"Lorg/platypus/orm/sql/dml/Statement;", "T", "", "cr", "Lorg/platypus/orm/transaction/TransactionExecutor;", "type", "Lorg/platypus/orm/sql/dml/StatementType;", "targets", "", "Lorg/platypus/model/IModel;", "(Lorg/platypus/orm/transaction/TransactionExecutor;Lorg/platypus/orm/sql/dml/StatementType;Ljava/util/List;)V", "getCr", "()Lorg/platypus/orm/transaction/TransactionExecutor;", "dialect", "Lorg/platypus/orm/PersistenceDialect;", "getDialect", "()Lorg/platypus/orm/PersistenceDialect;", "isAlwaysBatch", "", "()Z", "getTargets", "()Ljava/util/List;", "getType", "()Lorg/platypus/orm/sql/dml/StatementType;", "arguments", "", "Lkotlin/Pair;", "Lorg/platypus/model/field/api/type/SqlFieldType;", "execute", "()Ljava/lang/Object;", "executeIn", "Lorg/platypus/orm/sql/dml/StatementContext;", "executeIn$korm", "postExecute", "", "preExecute", "prepareSQL", "", "prepared", "Ljava/sql/PreparedStatement;", "sql", "executeInternal", "(Ljava/sql/PreparedStatement;)Ljava/lang/Object;", "korm"})
public abstract class Statement<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.transaction.TransactionExecutor cr = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.sql.dml.StatementType type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.platypus.model.IModel<?>> targets = null;
    
    @org.jetbrains.annotations.Nullable()
    public abstract T executeInternal(@org.jetbrains.annotations.NotNull()
    java.sql.PreparedStatement $receiver);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String prepareSQL();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.Iterable<java.lang.Iterable<kotlin.Pair<org.platypus.model.field.api.type.SqlFieldType, java.lang.Object>>> arguments();
    
    @org.jetbrains.annotations.NotNull()
    public java.sql.PreparedStatement prepared(@org.jetbrains.annotations.NotNull()
    java.lang.String sql) {
        return null;
    }
    
    public boolean isAlwaysBatch() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final org.platypus.orm.PersistenceDialect getDialect() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T execute() {
        return null;
    }
    
    protected void postExecute() {
    }
    
    protected void preExecute() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<T, java.util.List<org.platypus.orm.sql.dml.StatementContext>> executeIn$korm() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final org.platypus.orm.transaction.TransactionExecutor getCr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.dml.StatementType getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.platypus.model.IModel<?>> getTargets() {
        return null;
    }
    
    public Statement(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.transaction.TransactionExecutor cr, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.StatementType type, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.platypus.model.IModel<?>> targets) {
        super();
    }
}