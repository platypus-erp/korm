package org.platypus.orm.sql.query;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\u000e\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0002*\u000e\b\u0003\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u0002*\u000e\b\u0004\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u0002*\u000e\b\u0005\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u0002*\u000e\b\u0006\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u0002*\u000e\b\u0007\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\u00022\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t0\nBY\u00120\u0010\u000b\u001a,\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00060\f\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00070\u0010\u00a2\u0006\u0002\u0010\u0011J3\u0010\u0018\u001a,\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00060\fH\u00c6\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u000eH\u00c6\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00070\u0010H\u00c6\u0003J\u0093\u0001\u0010\u001b\u001a2\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u000022\b\u0002\u0010\u000b\u001a,\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00060\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00070\u0010H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J`\u0010\"\u001a8\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u0002H$0#\"\u000e\b\b\u0010$*\b\u0012\u0004\u0012\u0002H$0\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u0002H$0\u000eJ\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0016J\t\u0010)\u001a\u00020*H\u00d6\u0001R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00070\u0010X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u000eX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R;\u0010\u000b\u001a,\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00060\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006+"}, d2 = {"Lorg/platypus/orm/sql/query/Join8;", "M1", "Lorg/platypus/model/Model;", "M2", "M3", "M4", "M5", "M6", "M7", "M8", "Lorg/platypus/orm/sql/query/JoinStatementPart;", "join", "Lorg/platypus/orm/sql/query/Join7;", "field", "Lorg/platypus/model/field/impl/ReferenceField;", "alias", "Lorg/platypus/model/Alias;", "(Lorg/platypus/orm/sql/query/Join7;Lorg/platypus/model/field/impl/ReferenceField;Lorg/platypus/model/Alias;)V", "getAlias", "()Lorg/platypus/model/Alias;", "getField", "()Lorg/platypus/model/field/impl/ReferenceField;", "getJoin", "()Lorg/platypus/orm/sql/query/Join7;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "join9", "Lorg/platypus/orm/sql/query/Join9;", "M9", "queryJoin", "Lorg/platypus/orm/sql/query/Join;", "from", "Lorg/platypus/orm/sql/dml/ColumnSet;", "toString", "", "korm"})
public final class Join8<M1 extends org.platypus.model.Model<M1>, M2 extends org.platypus.model.Model<M2>, M3 extends org.platypus.model.Model<M3>, M4 extends org.platypus.model.Model<M4>, M5 extends org.platypus.model.Model<M5>, M6 extends org.platypus.model.Model<M6>, M7 extends org.platypus.model.Model<M7>, M8 extends org.platypus.model.Model<M8>> implements org.platypus.orm.sql.query.JoinStatementPart<M7, M8> {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.sql.query.Join7<M1, M2, M3, M4, M5, M6, M7> join = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.field.impl.ReferenceField<M7, M8> field = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.Alias<M8> alias = null;
    
    @org.jetbrains.annotations.NotNull()
    public final <M9 extends org.platypus.model.Model<M9>>org.platypus.orm.sql.query.Join9<M1, M2, M3, M4, M5, M6, M7, M8, M9> join9(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ReferenceField<M8, M9> field) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.Join queryJoin(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.ColumnSet from) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.query.Join7<M1, M2, M3, M4, M5, M6, M7> getJoin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.impl.ReferenceField<M7, M8> getField() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.Alias<M8> getAlias() {
        return null;
    }
    
    public Join8(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.Join7<M1, M2, M3, M4, M5, M6, M7> join, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ReferenceField<M7, M8> field, @org.jetbrains.annotations.NotNull()
    org.platypus.model.Alias<M8> alias) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.query.Join7<M1, M2, M3, M4, M5, M6, M7> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.ReferenceField<M7, M8> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.Alias<M8> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.query.Join8<M1, M2, M3, M4, M5, M6, M7, M8> copy(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.Join7<M1, M2, M3, M4, M5, M6, M7> join, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ReferenceField<M7, M8> field, @org.jetbrains.annotations.NotNull()
    org.platypus.model.Alias<M8> alias) {
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