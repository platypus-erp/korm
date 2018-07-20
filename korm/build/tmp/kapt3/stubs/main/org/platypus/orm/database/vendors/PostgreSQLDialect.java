package org.platypus.orm.database.vendors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0002\u0006\t\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lorg/platypus/orm/database/vendors/PostgreSQLDialect;", "Lorg/platypus/orm/database/vendors/DefaultSqlDialect;", "metadata", "Ljava/sql/DatabaseMetaData;", "(Ljava/sql/DatabaseMetaData;)V", "PostgresqlDDLFieldCreator", "org/platypus/orm/database/vendors/PostgreSQLDialect$PostgresqlDDLFieldCreator$1", "Lorg/platypus/orm/database/vendors/PostgreSQLDialect$PostgresqlDDLFieldCreator$1;", "PostgresqlDDLModelCreator", "org/platypus/orm/database/vendors/PostgreSQLDialect$PostgresqlDDLModelCreator$1", "Lorg/platypus/orm/database/vendors/PostgreSQLDialect$PostgresqlDDLModelCreator$1;", "dialectDDL", "Lorg/platypus/orm/database/vendors/DialectDDL;", "getDialectDDL", "()Lorg/platypus/orm/database/vendors/DialectDDL;", "modelNameVisitor", "Lorg/platypus/orm/database/vendors/ModelNameVisitor;", "getModelNameVisitor", "()Lorg/platypus/orm/database/vendors/ModelNameVisitor;", "needsSequenceToAutoInc", "", "getNeedsSequenceToAutoInc", "()Z", "privateModelNameVisitor", "Companion", "korm"})
public final class PostgreSQLDialect extends org.platypus.orm.database.vendors.DefaultSqlDialect {
    private final org.platypus.orm.database.ddl.DefaultDDLFieldCreator PostgresqlDDLFieldCreator = null;
    private final org.platypus.orm.database.ddl.DefaultDDLModelCreator PostgresqlDDLModelCreator = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.database.vendors.DialectDDL dialectDDL = null;
    private final org.platypus.orm.database.vendors.ModelNameVisitor privateModelNameVisitor = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.database.vendors.ModelNameVisitor modelNameVisitor = null;
    public static final org.platypus.orm.database.vendors.PostgreSQLDialect.Companion Companion = null;
    
    @java.lang.Override()
    public boolean getNeedsSequenceToAutoInc() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.vendors.DialectDDL getDialectDDL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.vendors.ModelNameVisitor getModelNameVisitor() {
        return null;
    }
    
    private PostgreSQLDialect(java.sql.DatabaseMetaData metadata) {
        super(null, null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/platypus/orm/database/vendors/PostgreSQLDialect$Companion;", "Lorg/platypus/orm/transaction/SqlDialectFactory;", "()V", "create", "Lorg/platypus/orm/PersistenceDialect;", "metadata", "Ljava/sql/DatabaseMetaData;", "korm"})
    public static final class Companion implements org.platypus.orm.transaction.SqlDialectFactory {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.platypus.orm.PersistenceDialect create(@org.jetbrains.annotations.NotNull()
        java.sql.DatabaseMetaData metadata) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}