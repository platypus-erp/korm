package org.platypus.orm.sql;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J5\u0010\u0003\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00040\u00072\u0006\u0010\b\u001a\u0002H\u0005H&\u00a2\u0006\u0002\u0010\t\u0082\u0001\u0002\n\u000b\u00a8\u0006\f"}, d2 = {"Lorg/platypus/orm/sql/SqlConstraint;", "", "()V", "accept", "RETURN", "PARAM", "visitor", "Lorg/platypus/orm/sql/ConstraintsVisitor;", "param", "(Lorg/platypus/orm/sql/ConstraintsVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/ForeignKeyConstraint;", "Lorg/platypus/orm/sql/Index;", "korm"})
public abstract class SqlConstraint {
    
    public abstract <PARAM extends java.lang.Object, RETURN extends java.lang.Object>RETURN accept(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.ConstraintsVisitor<PARAM, RETURN> visitor, PARAM param);
    
    private SqlConstraint() {
        super();
    }
}