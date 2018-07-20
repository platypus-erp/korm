package org.platypus.model.field.api.type;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lorg/platypus/model/field/api/type/StringSqlFieldType;", "Lorg/platypus/model/field/api/type/SqlFieldType;", "required", "", "(Z)V", "charactersToEscape", "", "", "", "getCharactersToEscape", "()Ljava/util/Map;", "getRequired", "()Z", "typeEnum", "Lorg/platypus/model/field/api/ModelFieldType;", "getTypeEnum", "()Lorg/platypus/model/field/api/ModelFieldType;", "nonNullValueToString", "value", "", "valueFromDB", "korm"})
public final class StringSqlFieldType implements org.platypus.model.field.api.type.SqlFieldType {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.field.api.ModelFieldType typeEnum = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.Character, java.lang.String> charactersToEscape = null;
    private final boolean required = false;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.ModelFieldType getTypeEnum() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Character, java.lang.String> getCharactersToEscape() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String nonNullValueToString(@org.jetbrains.annotations.NotNull()
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
    
    public StringSqlFieldType(boolean required) {
        super();
    }
    
    public StringSqlFieldType() {
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
    public java.lang.Object notNullValueToDB(@org.jetbrains.annotations.NotNull()
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