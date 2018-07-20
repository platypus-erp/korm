package org.platypus.orm.sql.ddl.schema;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0014\u001a\u00020\u000f2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0016JE\u0010\u0017\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b0\f2\u001a\u0010\u001a\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00160\u001b\"\u0006\u0012\u0002\b\u00030\u0016\u00a2\u0006\u0002\u0010\u001cJ=\u0010\u001d\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\b0\f2\u001a\u0010\u001a\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00160\u001b\"\u0006\u0012\u0002\b\u00030\u0016\u00a2\u0006\u0002\u0010\u001cJ\u0012\u0010\u001f\u001a\u00020\u000f2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\u0016JL\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\f*\u00020\"2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u001e\u0010#\u001a\u001a\u0012\u0004\u0012\u00020\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u00180$H\u0002J\u0010\u0010%\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u0016H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0015\u0010\u0011\u001a\u00020\u0003*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006&"}, d2 = {"Lorg/platypus/orm/sql/ddl/schema/SchemaCreatorUtils;", "", "databaseName", "", "metadata", "Ljava/sql/DatabaseMetaData;", "(Ljava/lang/String;Ljava/sql/DatabaseMetaData;)V", "allTablesNames", "", "Lorg/platypus/orm/sql/ddl/schema/ModelMetadata;", "allViewNames", "ddlMetadata", "", "Lorg/platypus/orm/sql/ddl/schema/ColumnMetadata;", "isLowerCaseIdentifiers", "", "isUpperCaseIdentifiers", "inProperCase", "getInProperCase", "(Ljava/lang/String;)Ljava/lang/String;", "checkTableMapping", "table", "Lorg/platypus/model/IModel;", "columnConstraints", "Lkotlin/Pair;", "Lorg/platypus/orm/database/vendors/ForeignKeyConstraint;", "tables", "", "([Lorg/platypus/model/IModel;)Ljava/util/Map;", "existingIndices", "Lorg/infinispan/configuration/cache/Index;", "modelExist", "model", "extractColumns", "Ljava/sql/ResultSet;", "extract", "Lkotlin/Function1;", "toMetadata", "korm"})
public final class SchemaCreatorUtils {
    private final java.util.List<org.platypus.orm.sql.ddl.schema.ModelMetadata> allTablesNames = null;
    private final java.util.List<org.platypus.orm.sql.ddl.schema.ModelMetadata> allViewNames = null;
    private final java.util.Map<org.platypus.orm.sql.ddl.schema.ModelMetadata, java.util.List<org.platypus.orm.sql.ddl.schema.ColumnMetadata>> ddlMetadata = null;
    private final boolean isUpperCaseIdentifiers = false;
    private final boolean isLowerCaseIdentifiers = false;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getInProperCase(@org.jetbrains.annotations.NotNull()
    java.lang.String $receiver) {
        return null;
    }
    
    private final java.util.Map<org.platypus.orm.sql.ddl.schema.ModelMetadata, java.util.List<org.platypus.orm.sql.ddl.schema.ColumnMetadata>> extractColumns(@org.jetbrains.annotations.NotNull()
    java.sql.ResultSet $receiver, java.util.List<org.platypus.orm.sql.ddl.schema.ModelMetadata> tables, kotlin.jvm.functions.Function1<? super java.sql.ResultSet, kotlin.Pair<java.lang.String, org.platypus.orm.sql.ddl.schema.ColumnMetadata>> extract) {
        return null;
    }
    
    /**
     * * returns map of constraint for a models name/column name pair
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<kotlin.Pair<java.lang.String, java.lang.String>, java.util.List<org.platypus.orm.database.vendors.ForeignKeyConstraint>> columnConstraints(@org.jetbrains.annotations.NotNull()
    org.platypus.model.IModel<?>... tables) {
        return null;
    }
    
    /**
     * * return fieldSet of indices for each models
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<org.platypus.model.IModel<?>, java.util.List<org.infinispan.configuration.cache.Index>> existingIndices(@org.jetbrains.annotations.NotNull()
    org.platypus.model.IModel<?>... tables) {
        return null;
    }
    
    public final boolean modelExist(@org.jetbrains.annotations.NotNull()
    org.platypus.model.IModel<?> model) {
        return false;
    }
    
    private final org.platypus.orm.sql.ddl.schema.ModelMetadata toMetadata(@org.jetbrains.annotations.NotNull()
    org.platypus.model.IModel<?> $receiver) {
        return null;
    }
    
    public final boolean checkTableMapping(@org.jetbrains.annotations.NotNull()
    org.platypus.model.IModel<?> table) {
        return false;
    }
    
    public SchemaCreatorUtils(@org.jetbrains.annotations.NotNull()
    java.lang.String databaseName, @org.jetbrains.annotations.NotNull()
    java.sql.DatabaseMetaData metadata) {
        super();
    }
}