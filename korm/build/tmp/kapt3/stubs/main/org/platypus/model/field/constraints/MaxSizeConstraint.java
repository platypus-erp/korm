package org.platypus.model.field.constraints;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0016R\u0011\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0002X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lorg/platypus/model/field/constraints/MaxSizeConstraint;", "Lorg/platypus/orm/OrmConstraint;", "", "model", "Lorg/platypus/model/Model;", "fieldName", "max", "", "(Lorg/platypus/model/Model;Ljava/lang/String;I)V", "getFieldName", "()Ljava/lang/String;", "getMax", "()I", "getModel", "()Lorg/platypus/model/Model;", "name", "getName", "toSQL", "query", "Lorg/platypus/orm/sql/QueryBuilder;", "validate", "", "value", "korm"})
public final class MaxSizeConstraint implements org.platypus.orm.OrmConstraint<java.lang.String> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = "maxSize";
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.Model<?> model = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String fieldName = null;
    private final int max = 0;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toSQL(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.QueryBuilder query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<java.lang.String> validate(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.Model<?> getModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFieldName() {
        return null;
    }
    
    public final int getMax() {
        return 0;
    }
    
    public MaxSizeConstraint(@org.jetbrains.annotations.NotNull()
    org.platypus.model.Model<?> model, @org.jetbrains.annotations.NotNull()
    java.lang.String fieldName, int max) {
        super();
    }
}