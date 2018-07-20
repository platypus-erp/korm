package org.platypus.model.field.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&J\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000H&\u00a2\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00018\u0001H&\u00a2\u0006\u0002\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00018\u0000H&\u00a2\u0006\u0002\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000f\u001a\u0004\u0018\u00018\u00002\b\u0010\u0006\u001a\u0004\u0018\u00018\u0001H&\u00a2\u0006\u0002\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lorg/platypus/model/field/api/ModelFieldConverter;", "SQL_TYPE", "KOTLIN_TYPE", "", "anyToString", "", "value", "fromSql", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinToString", "(Ljava/lang/Object;)Ljava/lang/String;", "nullToKotlin", "()Ljava/lang/Object;", "nullToSql", "sqlToString", "toSql", "korm"})
public abstract interface ModelFieldConverter<SQL_TYPE extends java.lang.Object, KOTLIN_TYPE extends java.lang.Object> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract KOTLIN_TYPE fromSql(@org.jetbrains.annotations.Nullable()
    SQL_TYPE value);
    
    @org.jetbrains.annotations.Nullable()
    public abstract SQL_TYPE toSql(@org.jetbrains.annotations.Nullable()
    KOTLIN_TYPE value);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String sqlToString(SQL_TYPE value);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String kotlinToString(KOTLIN_TYPE value);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String anyToString(@org.jetbrains.annotations.Nullable()
    java.lang.Object value);
    
    @org.jetbrains.annotations.Nullable()
    public abstract SQL_TYPE nullToSql();
    
    @org.jetbrains.annotations.Nullable()
    public abstract KOTLIN_TYPE nullToKotlin();
}