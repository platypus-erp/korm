package org.platypus.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00030\b\u00a2\u0006\u0002\u0010\nJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u001f\u0010\u0014\u001a\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00030\bH\u00c6\u0003J?\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u001e\b\u0002\u0010\u0007\u001a\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00030\bH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R0\u0010\u0007\u001a\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00030\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001c"}, d2 = {"Lorg/platypus/model/BatchUpdateParam;", "M", "Lorg/platypus/model/Model;", "", "where", "Lorg/platypus/orm/sql/expression/Expression;", "", "vals", "", "Lorg/platypus/model/field/api/ModelField;", "(Lorg/platypus/orm/sql/expression/Expression;Ljava/util/Map;)V", "getVals", "()Ljava/util/Map;", "setVals", "(Ljava/util/Map;)V", "getWhere", "()Lorg/platypus/orm/sql/expression/Expression;", "setWhere", "(Lorg/platypus/orm/sql/expression/Expression;)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "korm"})
public final class BatchUpdateParam<M extends org.platypus.model.Model<M>> {
    @org.jetbrains.annotations.NotNull()
    private org.platypus.orm.sql.expression.Expression<java.lang.Boolean> where;
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<org.platypus.model.field.api.ModelField<M, ?>, ? extends java.lang.Object> vals;
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> getWhere() {
        return null;
    }
    
    public final void setWhere(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<org.platypus.model.field.api.ModelField<M, ?>, java.lang.Object> getVals() {
        return null;
    }
    
    public final void setVals(@org.jetbrains.annotations.NotNull()
    java.util.Map<org.platypus.model.field.api.ModelField<M, ?>, ? extends java.lang.Object> p0) {
    }
    
    public BatchUpdateParam(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<java.lang.Boolean> where, @org.jetbrains.annotations.NotNull()
    java.util.Map<org.platypus.model.field.api.ModelField<M, ?>, ? extends java.lang.Object> vals) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<org.platypus.model.field.api.ModelField<M, ?>, java.lang.Object> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.BatchUpdateParam<M> copy(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<java.lang.Boolean> where, @org.jetbrains.annotations.NotNull()
    java.util.Map<org.platypus.model.field.api.ModelField<M, ?>, ? extends java.lang.Object> vals) {
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