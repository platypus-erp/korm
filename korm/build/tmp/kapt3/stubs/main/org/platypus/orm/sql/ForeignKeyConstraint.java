package org.platypus.orm.sql;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0001,B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ5\u0010\u0017\u001a\u0002H\u0018\"\u0004\b\u0000\u0010\u0019\"\u0004\b\u0001\u0010\u00182\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u00180\u001b2\u0006\u0010\u001c\u001a\u0002H\u0019H\u0016\u00a2\u0006\u0002\u0010\u001dJ\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\tH\u00c6\u0003JE\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u00d6\u0003J\t\u0010)\u001a\u00020*H\u00d6\u0001J\t\u0010+\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010\u00a8\u0006-"}, d2 = {"Lorg/platypus/orm/sql/ForeignKeyConstraint;", "Lorg/platypus/orm/sql/SqlConstraint;", "fkName", "", "refereeTable", "refereeColumn", "referencedTable", "referencedColumn", "deleteRule", "Lorg/platypus/orm/ReferenceOption;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/platypus/orm/ReferenceOption;)V", "getDeleteRule", "()Lorg/platypus/orm/ReferenceOption;", "setDeleteRule", "(Lorg/platypus/orm/ReferenceOption;)V", "getFkName", "()Ljava/lang/String;", "foreignKeyPart", "getForeignKeyPart$korm", "getRefereeColumn", "getRefereeTable", "getReferencedColumn", "getReferencedTable", "accept", "RETURN", "PARAM", "visitor", "Lorg/platypus/orm/sql/ConstraintsVisitor;", "param", "(Lorg/platypus/orm/sql/ConstraintsVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "korm"})
public final class ForeignKeyConstraint extends org.platypus.orm.sql.SqlConstraint {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String foreignKeyPart = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String fkName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String refereeTable = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String refereeColumn = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String referencedTable = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String referencedColumn = null;
    @org.jetbrains.annotations.NotNull()
    private org.platypus.orm.ReferenceOption deleteRule;
    public static final org.platypus.orm.sql.ForeignKeyConstraint.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getForeignKeyPart$korm() {
        return null;
    }
    
    @java.lang.Override()
    public <PARAM extends java.lang.Object, RETURN extends java.lang.Object>RETURN accept(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.ConstraintsVisitor<PARAM, RETURN> visitor, PARAM param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFkName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRefereeTable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRefereeColumn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReferencedTable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReferencedColumn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.ReferenceOption getDeleteRule() {
        return null;
    }
    
    public final void setDeleteRule(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.ReferenceOption p0) {
    }
    
    public ForeignKeyConstraint(@org.jetbrains.annotations.NotNull()
    java.lang.String fkName, @org.jetbrains.annotations.NotNull()
    java.lang.String refereeTable, @org.jetbrains.annotations.NotNull()
    java.lang.String refereeColumn, @org.jetbrains.annotations.NotNull()
    java.lang.String referencedTable, @org.jetbrains.annotations.NotNull()
    java.lang.String referencedColumn, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.ReferenceOption deleteRule) {
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
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.ReferenceOption component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.ForeignKeyConstraint copy(@org.jetbrains.annotations.NotNull()
    java.lang.String fkName, @org.jetbrains.annotations.NotNull()
    java.lang.String refereeTable, @org.jetbrains.annotations.NotNull()
    java.lang.String refereeColumn, @org.jetbrains.annotations.NotNull()
    java.lang.String referencedTable, @org.jetbrains.annotations.NotNull()
    java.lang.String referencedColumn, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.ReferenceOption deleteRule) {
        return null;
    }
    
    @java.lang.Override()
    public java.lang.String toString() {
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
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b\u00a8\u0006\t"}, d2 = {"Lorg/platypus/orm/sql/ForeignKeyConstraint$Companion;", "", "()V", "from", "Lorg/platypus/orm/sql/ForeignKeyConstraint;", "tr", "Lorg/platypus/orm/PersistenceDialect;", "column", "Lorg/platypus/model/field/impl/Many2OneField;", "korm"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.platypus.orm.sql.ForeignKeyConstraint from(@org.jetbrains.annotations.NotNull()
        org.platypus.orm.PersistenceDialect tr, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.Many2OneField<?, ?> column) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}