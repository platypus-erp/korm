package org.platypus.orm.sql;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u001d\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\bJ\u001d\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lorg/platypus/orm/sql/ConstraintsVisitor;", "PARAM", "RETURN", "", "accept", "fk", "Lorg/platypus/orm/sql/ForeignKeyConstraint;", "param", "(Lorg/platypus/orm/sql/ForeignKeyConstraint;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/orm/sql/Index;", "(Lorg/platypus/orm/sql/Index;Ljava/lang/Object;)Ljava/lang/Object;", "korm"})
public abstract interface ConstraintsVisitor<PARAM extends java.lang.Object, RETURN extends java.lang.Object> {
    
    public abstract RETURN accept(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.ForeignKeyConstraint fk, PARAM param);
    
    public abstract RETURN accept(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.Index fk, PARAM param);
}