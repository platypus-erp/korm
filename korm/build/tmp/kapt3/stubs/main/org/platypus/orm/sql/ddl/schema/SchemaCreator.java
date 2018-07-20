package org.platypus.orm.sql.ddl.schema;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000f\u001a\u00020\u00102\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u0012J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u0016H\u0002J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00122\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u0012J\u0018\u0010\u0019\u001a\u00020\u00102\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u0012J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00122\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u0012J$\u0010\u001b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u00122\u0010\u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u0012H\u0002J>\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u00122\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u00132\u001e\u0010\u001f\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130 j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013`!H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lorg/platypus/orm/sql/ddl/schema/SchemaCreator;", "", "internal", "Lorg/platypus/PlatypusEnvironmentInternal;", "(Lorg/platypus/PlatypusEnvironmentInternal;)V", "dialect", "Lorg/platypus/orm/PersistenceDialect;", "getDialect", "()Lorg/platypus/orm/PersistenceDialect;", "getInternal", "()Lorg/platypus/PlatypusEnvironmentInternal;", "metadata", "Ljava/sql/DatabaseMetaData;", "utils", "Lorg/platypus/orm/sql/ddl/schema/SchemaCreatorUtils;", "create", "", "tables", "", "Lorg/platypus/model/IModel;", "createIndiceStatement", "", "", "createStatements", "Lorg/platypus/orm/database/ddl/TableDDL;", "drop", "dropStatement", "findDependsModel", "models", "recursiveFindDependsModel", "m", "n", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "Companion", "korm"})
public final class SchemaCreator {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.PersistenceDialect dialect = null;
    private final java.sql.DatabaseMetaData metadata = null;
    private final org.platypus.orm.sql.ddl.schema.SchemaCreatorUtils utils = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.PlatypusEnvironmentInternal internal = null;
    public static final org.platypus.orm.sql.ddl.schema.SchemaCreator.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.PersistenceDialect getDialect() {
        return null;
    }
    
    private final java.util.Set<org.platypus.model.IModel<?>> findDependsModel(java.util.Set<? extends org.platypus.model.IModel<?>> models) {
        return null;
    }
    
    private final java.util.Set<org.platypus.model.IModel<?>> recursiveFindDependsModel(org.platypus.model.IModel<?> m, java.util.HashSet<org.platypus.model.IModel<?>> n) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.platypus.orm.database.ddl.TableDDL> createStatements(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends org.platypus.model.IModel<?>> tables) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.platypus.orm.database.ddl.TableDDL> dropStatement(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends org.platypus.model.IModel<?>> tables) {
        return null;
    }
    
    private final java.util.Set<java.lang.String> createIndiceStatement(java.util.Collection<? extends org.platypus.model.IModel<?>> tables) {
        return null;
    }
    
    public final void drop(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends org.platypus.model.IModel<?>> tables) {
    }
    
    public final void create(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends org.platypus.model.IModel<?>> tables) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.PlatypusEnvironmentInternal getInternal() {
        return null;
    }
    
    public SchemaCreator(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironmentInternal internal) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/platypus/orm/sql/ddl/schema/SchemaCreator$Companion;", "", "()V", "create", "Lorg/platypus/orm/sql/ddl/schema/SchemaCreator;", "internal", "Lorg/platypus/PlatypusEnvironmentInternal;", "korm"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.platypus.orm.sql.ddl.schema.SchemaCreator create(@org.jetbrains.annotations.NotNull()
        org.platypus.PlatypusEnvironmentInternal internal) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}