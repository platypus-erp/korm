package org.platypus.model.field.api.type;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000f"}, d2 = {"Lorg/platypus/model/field/api/type/PKFieldType;", "Lorg/platypus/model/field/api/type/SqlFieldType;", "()V", "isAutoInc", "", "()Z", "required", "getRequired", "typeEnum", "Lorg/platypus/model/field/api/ModelFieldType;", "getTypeEnum", "()Lorg/platypus/model/field/api/ModelFieldType;", "valueFromDB", "", "value", "korm"})
public final class PKFieldType implements org.platypus.model.field.api.type.SqlFieldType {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.field.api.ModelFieldType typeEnum = null;
    private final boolean required = false;
    private final boolean isAutoInc = true;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.ModelFieldType getTypeEnum() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getRequired() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isAutoInc() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Object valueFromDB(@org.jetbrains.annotations.NotNull()
    java.lang.Object value) {
        return null;
    }
    
    public PKFieldType() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String valueToString(@org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object valueToDB(@org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.Object notNullValueToDB(@org.jetbrains.annotations.NotNull()
    java.lang.Object value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String nonNullValueToString(@org.jetbrains.annotations.NotNull()
    java.lang.Object value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object readObject(@org.jetbrains.annotations.NotNull()
    java.sql.ResultSet rs, int index) {
        return null;
    }
    
    public void setParameter(@org.jetbrains.annotations.NotNull()
    java.sql.PreparedStatement stmt, int index, @org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.platypus.model.field.api.type.SqlFieldType clone() {
        return null;
    }
}