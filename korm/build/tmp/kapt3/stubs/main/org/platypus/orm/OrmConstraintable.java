package org.platypus.orm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/platypus/orm/OrmConstraintable;", "", "contraints", "", "Lorg/platypus/orm/OrmConstraint;", "getContraints", "()Ljava/util/Set;", "korm"})
public abstract interface OrmConstraintable {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Set<org.platypus.orm.OrmConstraint<?>> getContraints();
}