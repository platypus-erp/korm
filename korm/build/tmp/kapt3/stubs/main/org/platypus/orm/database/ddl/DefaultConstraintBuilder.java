package org.platypus.orm.database.ddl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u0010\tJ\u001d\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lorg/platypus/orm/database/ddl/DefaultConstraintBuilder;", "Lorg/platypus/orm/sql/ConstraintsVisitor;", "", "", "()V", "accept", "fk", "Lorg/platypus/orm/sql/ForeignKeyConstraint;", "param", "(Lorg/platypus/orm/sql/ForeignKeyConstraint;Lkotlin/Unit;)Ljava/lang/String;", "Lorg/platypus/orm/sql/Index;", "(Lorg/platypus/orm/sql/Index;Lkotlin/Unit;)Ljava/lang/String;", "korm"})
public abstract class DefaultConstraintBuilder implements org.platypus.orm.sql.ConstraintsVisitor<kotlin.Unit, java.lang.String> {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String accept(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.ForeignKeyConstraint fk, @org.jetbrains.annotations.NotNull()
    kotlin.Unit param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String accept(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.Index fk, @org.jetbrains.annotations.NotNull()
    kotlin.Unit param) {
        return null;
    }
    
    public DefaultConstraintBuilder() {
        super();
    }
}