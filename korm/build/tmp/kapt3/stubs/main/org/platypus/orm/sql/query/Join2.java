package org.platypus.orm.sql.query;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004B5\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\u00a2\u0006\u0002\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u00c6\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u00c6\u0003JK\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f\u00a8\u0006 "}, d2 = {"Lorg/platypus/orm/sql/query/Join2;", "M1", "Lorg/platypus/model/Model;", "M2", "Lorg/platypus/orm/sql/query/JoinStatementPart;", "fromTable", "Lorg/platypus/model/Alias;", "field", "Lorg/platypus/model/field/impl/ReferenceField;", "alias", "(Lorg/platypus/model/Alias;Lorg/platypus/model/field/impl/ReferenceField;Lorg/platypus/model/Alias;)V", "getAlias", "()Lorg/platypus/model/Alias;", "getField", "()Lorg/platypus/model/field/impl/ReferenceField;", "getFromTable", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "queryJoin", "Lorg/platypus/orm/sql/query/Join;", "from", "Lorg/platypus/orm/sql/dml/ColumnSet;", "toString", "", "korm"})
public final class Join2<M1 extends org.platypus.model.Model<M1>, M2 extends org.platypus.model.Model<M2>> implements org.platypus.orm.sql.query.JoinStatementPart<M1, M2> {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.Alias<M1> fromTable = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.field.impl.ReferenceField<M1, M2> field = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.Alias<M2> alias = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.Join queryJoin(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.ColumnSet from) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.Alias<M1> getFromTable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.impl.ReferenceField<M1, M2> getField() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.Alias<M2> getAlias() {
        return null;
    }
    
    public Join2(@org.jetbrains.annotations.NotNull()
    org.platypus.model.Alias<M1> fromTable, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ReferenceField<M1, M2> field, @org.jetbrains.annotations.NotNull()
    org.platypus.model.Alias<M2> alias) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.Alias<M1> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.ReferenceField<M1, M2> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.Alias<M2> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.query.Join2<M1, M2> copy(@org.jetbrains.annotations.NotNull()
    org.platypus.model.Alias<M1> fromTable, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ReferenceField<M1, M2> field, @org.jetbrains.annotations.NotNull()
    org.platypus.model.Alias<M2> alias) {
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
}