package org.platypus.model.field.api.type;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u000b\u001a\u00020\u0000H\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0001H\u0016J\u0010\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0001H\u0016J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\"\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0016J\u0010\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0001H\u0016J\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u0010\u001b\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lorg/platypus/model/field/api/type/SqlFieldType;", "", "isAutoInc", "", "()Z", "required", "getRequired", "typeEnum", "Lorg/platypus/model/field/api/ModelFieldType;", "getTypeEnum", "()Lorg/platypus/model/field/api/ModelFieldType;", "clone", "nonNullValueToString", "", "value", "notNullValueToDB", "readObject", "rs", "Ljava/sql/ResultSet;", "index", "", "setParameter", "", "stmt", "Ljava/sql/PreparedStatement;", "valueFromDB", "valueToDB", "valueToString", "korm"})
public abstract interface SqlFieldType {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.model.field.api.ModelFieldType getTypeEnum();
    
    public abstract boolean getRequired();
    
    public abstract boolean isAutoInc();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.Object valueFromDB(@org.jetbrains.annotations.NotNull()
    java.lang.Object value);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String valueToString(@org.jetbrains.annotations.Nullable()
    java.lang.Object value);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object valueToDB(@org.jetbrains.annotations.Nullable()
    java.lang.Object value);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.Object notNullValueToDB(@org.jetbrains.annotations.NotNull()
    java.lang.Object value);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String nonNullValueToString(@org.jetbrains.annotations.NotNull()
    java.lang.Object value);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object readObject(@org.jetbrains.annotations.NotNull()
    java.sql.ResultSet rs, int index);
    
    public abstract void setParameter(@org.jetbrains.annotations.NotNull()
    java.sql.PreparedStatement stmt, int index, @org.jetbrains.annotations.Nullable()
    java.lang.Object value);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.model.field.api.type.SqlFieldType clone();
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
        
        public static boolean isAutoInc(org.platypus.model.field.api.type.SqlFieldType $this) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static java.lang.Object valueFromDB(org.platypus.model.field.api.type.SqlFieldType $this, @org.jetbrains.annotations.NotNull()
        java.lang.Object value) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static java.lang.String valueToString(org.platypus.model.field.api.type.SqlFieldType $this, @org.jetbrains.annotations.Nullable()
        java.lang.Object value) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object valueToDB(org.platypus.model.field.api.type.SqlFieldType $this, @org.jetbrains.annotations.Nullable()
        java.lang.Object value) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static java.lang.Object notNullValueToDB(org.platypus.model.field.api.type.SqlFieldType $this, @org.jetbrains.annotations.NotNull()
        java.lang.Object value) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static java.lang.String nonNullValueToString(org.platypus.model.field.api.type.SqlFieldType $this, @org.jetbrains.annotations.NotNull()
        java.lang.Object value) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object readObject(org.platypus.model.field.api.type.SqlFieldType $this, @org.jetbrains.annotations.NotNull()
        java.sql.ResultSet rs, int index) {
            return null;
        }
        
        public static void setParameter(org.platypus.model.field.api.type.SqlFieldType $this, @org.jetbrains.annotations.NotNull()
        java.sql.PreparedStatement stmt, int index, @org.jetbrains.annotations.Nullable()
        java.lang.Object value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static org.platypus.model.field.api.type.SqlFieldType clone(org.platypus.model.field.api.type.SqlFieldType $this) {
            return null;
        }
    }
}