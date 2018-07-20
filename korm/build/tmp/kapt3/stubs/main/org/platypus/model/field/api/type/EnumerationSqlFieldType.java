package org.platypus.model.field.api.type;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u001d\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lorg/platypus/model/field/api/type/EnumerationSqlFieldType;", "T", "", "Lorg/platypus/model/field/api/type/SqlFieldType;", "required", "", "klass", "Ljava/lang/Class;", "(ZLjava/lang/Class;)V", "getRequired", "()Z", "typeEnum", "Lorg/platypus/model/field/api/ModelFieldType;", "getTypeEnum", "()Lorg/platypus/model/field/api/ModelFieldType;", "notNullValueToDB", "", "value", "valueFromDB", "korm"})
public final class EnumerationSqlFieldType<T extends java.lang.Enum<T>> implements org.platypus.model.field.api.type.SqlFieldType {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.field.api.ModelFieldType typeEnum = null;
    private final boolean required = false;
    private final java.lang.Class<T> klass = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.ModelFieldType getTypeEnum() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Object notNullValueToDB(@org.jetbrains.annotations.NotNull()
    java.lang.Object value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Object valueFromDB(@org.jetbrains.annotations.NotNull()
    java.lang.Object value) {
        return null;
    }
    
    @java.lang.Override()
    public boolean getRequired() {
        return false;
    }
    
    public EnumerationSqlFieldType(boolean required, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> klass) {
        super();
    }
    
    public boolean isAutoInc() {
        return false;
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