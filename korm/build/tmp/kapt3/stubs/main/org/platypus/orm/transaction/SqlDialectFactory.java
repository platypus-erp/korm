package org.platypus.orm.transaction;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/platypus/orm/transaction/SqlDialectFactory;", "", "create", "Lorg/platypus/orm/PersistenceDialect;", "meta", "Ljava/sql/DatabaseMetaData;", "korm"})
public abstract interface SqlDialectFactory {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.PersistenceDialect create(@org.jetbrains.annotations.NotNull()
    java.sql.DatabaseMetaData meta);
}