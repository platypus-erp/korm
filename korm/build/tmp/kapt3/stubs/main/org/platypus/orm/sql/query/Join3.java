package org.platypus.orm.sql.query;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\u000e\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00022\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0005B;\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u00c6\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\tH\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u000bH\u00c6\u0003JW\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u000bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001JB\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u0002H\u001f0\u001e\"\u000e\b\u0003\u0010\u001f*\b\u0012\u0004\u0012\u0002H\u001f0\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u0002H\u001f0\tJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\t\u0010$\u001a\u00020%H\u00d6\u0001R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006&"}, d2 = {"Lorg/platypus/orm/sql/query/Join3;", "M1", "Lorg/platypus/model/Model;", "M2", "M3", "Lorg/platypus/orm/sql/query/JoinStatementPart;", "join", "Lorg/platypus/orm/sql/query/Join2;", "field", "Lorg/platypus/model/field/impl/ReferenceField;", "alias", "Lorg/platypus/model/Alias;", "(Lorg/platypus/orm/sql/query/Join2;Lorg/platypus/model/field/impl/ReferenceField;Lorg/platypus/model/Alias;)V", "getAlias", "()Lorg/platypus/model/Alias;", "getField", "()Lorg/platypus/model/field/impl/ReferenceField;", "getJoin", "()Lorg/platypus/orm/sql/query/Join2;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "join4", "Lorg/platypus/orm/sql/query/Join4;", "M4", "queryJoin", "Lorg/platypus/orm/sql/query/Join;", "from", "Lorg/platypus/orm/sql/dml/ColumnSet;", "toString", "", "korm"})
public final class Join3<M1 extends org.platypus.model.Model<M1>, M2 extends org.platypus.model.Model<M2>, M3 extends org.platypus.model.Model<M3>> implements org.platypus.orm.sql.query.JoinStatementPart<M2, M3> {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.sql.query.Join2<M1, M2> join = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.field.impl.ReferenceField<M2, M3> field = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.Alias<M3> alias = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.Join queryJoin(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.ColumnSet from) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <M4 extends org.platypus.model.Model<M4>>org.platypus.orm.sql.query.Join4<M1, M2, M3, M4> join4(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ReferenceField<M3, M4> field) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.query.Join2<M1, M2> getJoin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.impl.ReferenceField<M2, M3> getField() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.Alias<M3> getAlias() {
        return null;
    }
    
    public Join3(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.Join2<M1, M2> join, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ReferenceField<M2, M3> field, @org.jetbrains.annotations.NotNull()
    org.platypus.model.Alias<M3> alias) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.query.Join2<M1, M2> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.ReferenceField<M2, M3> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.Alias<M3> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.query.Join3<M1, M2, M3> copy(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.Join2<M1, M2> join, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ReferenceField<M2, M3> field, @org.jetbrains.annotations.NotNull()
    org.platypus.model.Alias<M3> alias) {
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