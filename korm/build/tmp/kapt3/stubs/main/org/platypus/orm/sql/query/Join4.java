package org.platypus.orm.sql.query;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\u000e\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0002*\u000e\b\u0003\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u00022\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0006BA\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00030\f\u00a2\u0006\u0002\u0010\rJ\u001b\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\bH\u00c6\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\nH\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00030\fH\u00c6\u0003Jc\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00030\fH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001JH\u0010\u001e\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u0002H 0\u001f\"\u000e\b\u0004\u0010 *\b\u0012\u0004\u0012\u0002H 0\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u0002H 0\nJ\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\t\u0010%\u001a\u00020&H\u00d6\u0001R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00030\fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\'"}, d2 = {"Lorg/platypus/orm/sql/query/Join4;", "M1", "Lorg/platypus/model/Model;", "M2", "M3", "M4", "Lorg/platypus/orm/sql/query/JoinStatementPart;", "join", "Lorg/platypus/orm/sql/query/Join3;", "field", "Lorg/platypus/model/field/impl/ReferenceField;", "alias", "Lorg/platypus/model/Alias;", "(Lorg/platypus/orm/sql/query/Join3;Lorg/platypus/model/field/impl/ReferenceField;Lorg/platypus/model/Alias;)V", "getAlias", "()Lorg/platypus/model/Alias;", "getField", "()Lorg/platypus/model/field/impl/ReferenceField;", "getJoin", "()Lorg/platypus/orm/sql/query/Join3;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "join5", "Lorg/platypus/orm/sql/query/Join5;", "M5", "queryJoin", "Lorg/platypus/orm/sql/query/Join;", "from", "Lorg/platypus/orm/sql/dml/ColumnSet;", "toString", "", "korm"})
public final class Join4<M1 extends org.platypus.model.Model<M1>, M2 extends org.platypus.model.Model<M2>, M3 extends org.platypus.model.Model<M3>, M4 extends org.platypus.model.Model<M4>> implements org.platypus.orm.sql.query.JoinStatementPart<M3, M4> {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.sql.query.Join3<M1, M2, M3> join = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.field.impl.ReferenceField<M3, M4> field = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.Alias<M4> alias = null;
    
    @org.jetbrains.annotations.NotNull()
    public final <M5 extends org.platypus.model.Model<M5>>org.platypus.orm.sql.query.Join5<M1, M2, M3, M4, M5> join5(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ReferenceField<M4, M5> field) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.Join queryJoin(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.ColumnSet from) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.query.Join3<M1, M2, M3> getJoin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.impl.ReferenceField<M3, M4> getField() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.Alias<M4> getAlias() {
        return null;
    }
    
    public Join4(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.Join3<M1, M2, M3> join, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ReferenceField<M3, M4> field, @org.jetbrains.annotations.NotNull()
    org.platypus.model.Alias<M4> alias) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.query.Join3<M1, M2, M3> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.ReferenceField<M3, M4> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.Alias<M4> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.query.Join4<M1, M2, M3, M4> copy(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.Join3<M1, M2, M3> join, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ReferenceField<M3, M4> field, @org.jetbrains.annotations.NotNull()
    org.platypus.model.Alias<M4> alias) {
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