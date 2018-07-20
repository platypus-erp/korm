package org.platypus.model.field.api.type;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0017"}, d2 = {"Lorg/platypus/model/field/api/type/SelectionFieldType;", "Lorg/platypus/model/field/api/type/SqlFieldType;", "required", "", "selection", "Lorg/platypus/entity/Selection;", "(ZLorg/platypus/entity/Selection;)V", "charactersToEscape", "", "", "", "getCharactersToEscape", "()Ljava/util/Map;", "getRequired", "()Z", "typeEnum", "Lorg/platypus/model/field/api/ModelFieldType;", "getTypeEnum", "()Lorg/platypus/model/field/api/ModelFieldType;", "nonNullValueToString", "value", "", "valueFromDB", "korm"})
public final class SelectionFieldType implements org.platypus.model.field.api.type.SqlFieldType {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.field.api.ModelFieldType typeEnum = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.Character, java.lang.String> charactersToEscape = null;
    private final boolean required = false;
    private final org.platypus.entity.Selection<?> selection = null;
    
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
    
    public SelectionFieldType(boolean required, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.Selection<?> selection) {
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