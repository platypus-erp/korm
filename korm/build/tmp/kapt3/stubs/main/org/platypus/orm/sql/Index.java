package org.platypus.orm.sql;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ5\u0010\u0011\u001a\u0002H\u0012\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u00120\u00152\u0006\u0010\u0016\u001a\u0002H\u0013H\u0016\u00a2\u0006\u0002\u0010\u0017J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\bH\u00c6\u0003J7\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\u000e\u0010\"\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0000J\b\u0010#\u001a\u00020\u0003H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006%"}, d2 = {"Lorg/platypus/orm/sql/Index;", "Lorg/platypus/orm/sql/SqlConstraint;", "indexName", "", "tableName", "columns", "", "unique", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "getColumns", "()Ljava/util/List;", "getIndexName", "()Ljava/lang/String;", "getTableName", "getUnique", "()Z", "accept", "RETURN", "PARAM", "visitor", "Lorg/platypus/orm/sql/ConstraintsVisitor;", "param", "(Lorg/platypus/orm/sql/ConstraintsVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "onlyNameDiffer", "toString", "Companion", "korm"})
public final class Index extends org.platypus.orm.sql.SqlConstraint {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String indexName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String tableName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> columns = null;
    private final boolean unique = false;
    public static final org.platypus.orm.sql.Index.Companion Companion = null;
    
    @java.lang.Override()
    public <PARAM extends java.lang.Object, RETURN extends java.lang.Object>RETURN accept(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.ConstraintsVisitor<PARAM, RETURN> visitor, PARAM param) {
        return null;
    }
    
    public final boolean onlyNameDiffer(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.Index other) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIndexName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTableName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getColumns() {
        return null;
    }
    
    public final boolean getUnique() {
        return false;
    }
    
    public Index(@org.jetbrains.annotations.NotNull()
    java.lang.String indexName, @org.jetbrains.annotations.NotNull()
    java.lang.String tableName, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> columns, boolean unique) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component3() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.Index copy(@org.jetbrains.annotations.NotNull()
    java.lang.String indexName, @org.jetbrains.annotations.NotNull()
    java.lang.String tableName, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> columns, boolean unique) {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J?\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\"\u0010\t\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b0\n\"\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Lorg/platypus/orm/sql/Index$Companion;", "", "()V", "forColumns", "Lorg/platypus/orm/sql/Index;", "tr", "Lorg/platypus/orm/PersistenceDialect;", "unique", "", "columns", "", "Lorg/platypus/model/field/api/ModelField;", "(Lorg/platypus/orm/PersistenceDialect;Z[Lorg/platypus/model/field/api/ModelField;)Lorg/platypus/orm/sql/Index;", "korm"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.platypus.orm.sql.Index forColumns(@org.jetbrains.annotations.NotNull()
        org.platypus.orm.PersistenceDialect tr, boolean unique, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.api.ModelField<?, ?>... columns) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}