package org.platypus.model.field.api.type;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lorg/platypus/model/field/api/type/One2OneFieldType;", "Lorg/platypus/model/field/api/type/SqlFieldType;", "required", "", "(Z)V", "getRequired", "()Z", "typeEnum", "Lorg/platypus/model/field/api/ModelFieldType;", "getTypeEnum", "()Lorg/platypus/model/field/api/ModelFieldType;", "notNullValueToDB", "", "value", "setParameter", "", "stmt", "Ljava/sql/PreparedStatement;", "index", "", "korm"})
public final class One2OneFieldType implements org.platypus.model.field.api.type.SqlFieldType {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.field.api.ModelFieldType typeEnum = null;
    private final boolean required = false;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.ModelFieldType getTypeEnum() {
        return null;
    }
    
    @java.lang.Override()
    public void setParameter(@org.jetbrains.annotations.NotNull()
    java.sql.PreparedStatement stmt, int index, @org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Object notNullValueToDB(@org.jetbrains.annotations.NotNull()
    java.lang.Object value) {
        return null;
    }
    
    @java.lang.Override()
    public boolean getRequired() {
        return false;
    }
    
    public One2OneFieldType(boolean required) {
        super();
    }
    
    public boolean isAutoInc() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.Object valueFromDB(@org.jetbrains.annotations.NotNull()
    java.lang.Object value) {
        return null;
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
    
    @org.jetbrains.annotations.NotNull()
    public org.platypus.model.field.api.type.SqlFieldType clone() {
        return null;
    }
}