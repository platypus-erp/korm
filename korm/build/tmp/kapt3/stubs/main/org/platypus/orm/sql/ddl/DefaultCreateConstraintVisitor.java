package org.platypus.orm.sql.ddl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\t\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\rJ\u001d\u0010\t\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lorg/platypus/orm/sql/ddl/DefaultCreateConstraintVisitor;", "PARAM", "RETURN", "Lorg/platypus/orm/sql/ConstraintsVisitor;", "dialect", "Lorg/platypus/orm/PersistenceDialect;", "(Lorg/platypus/orm/PersistenceDialect;)V", "getDialect", "()Lorg/platypus/orm/PersistenceDialect;", "accept", "fk", "Lorg/platypus/orm/sql/ForeignKeyConstraint;", "param", "(Lorg/platypus/orm/sql/ForeignKeyConstraint;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/Index;", "(Lorg/platypus/orm/sql/Index;Ljava/lang/Object;)Ljava/lang/Object;", "korm"})
public abstract class DefaultCreateConstraintVisitor<PARAM extends java.lang.Object, RETURN extends java.lang.Object> implements org.platypus.orm.sql.ConstraintsVisitor<PARAM, RETURN> {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.PersistenceDialect dialect = null;
    
    @java.lang.Override()
    public RETURN accept(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.ForeignKeyConstraint fk, PARAM param) {
        return null;
    }
    
    @java.lang.Override()
    public RETURN accept(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.Index fk, PARAM param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.PersistenceDialect getDialect() {
        return null;
    }
    
    public DefaultCreateConstraintVisitor(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.PersistenceDialect dialect) {
        super();
    }
}