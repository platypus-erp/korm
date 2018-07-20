package org.platypus.model.field.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00000\u00052\b\u0012\u0004\u0012\u0002H\u00030\u00062\b\u0012\u0004\u0012\u0002H\u00030\u00072\b\u0012\u0004\u0012\u0002H\u00030\b2\u0012\u0012\u0004\u0012\u0002H\u00030\tj\b\u0012\u0004\u0012\u0002H\u0003`\n2\b\u0012\u0004\u0012\u0002H\u00030\u000bJ5\u0010\u0015\u001a\u0002H\u0016\"\u0004\b\u0002\u0010\u0017\"\u0004\b\u0003\u0010\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u00160\u00192\u0006\u0010\u001a\u001a\u0002H\u0017H&\u00a2\u0006\u0002\u0010\u001bJ\u0015\u0010\u001c\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u0004H\u0016\u00a2\u0006\u0002\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020 2\b\u0010\u001d\u001a\u0004\u0018\u00018\u0001H\u0016\u00a2\u0006\u0002\u0010!J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0#2\b\u0010\u001d\u001a\u0004\u0018\u00018\u0001H\u0016\u00a2\u0006\u0002\u0010$J\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0#2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0012\u0010\u0012\u001a\u00028\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006&"}, d2 = {"Lorg/platypus/model/field/api/IModelField;", "M", "Lorg/platypus/model/IModel;", "T", "", "", "Lorg/platypus/model/field/api/FieldSlots;", "Lorg/platypus/orm/sql/expression/TypedExpression;", "Lorg/platypus/model/field/api/ValidatableValue;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "Lorg/platypus/model/field/api/ValidatableValueThrow;", "completeName", "", "getCompleteName", "()Ljava/lang/String;", "fieldName", "getFieldName", "model", "getModel", "()Lorg/platypus/model/IModel;", "accept", "RETURN", "PARAM_TYPE", "visitor", "Lorg/platypus/model/field/api/FieldVisitor;", "p", "(Lorg/platypus/model/field/api/FieldVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "anyToType", "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "validateAndThrow", "", "(Ljava/lang/Object;)V", "validateNullable", "", "(Ljava/lang/Object;)Ljava/util/Set;", "validateUnsafe", "korm"})
public abstract interface IModelField<M extends org.platypus.model.IModel<M>, T extends java.lang.Object> extends java.lang.Comparable<org.platypus.model.field.api.IModelField<?, ?>>, org.platypus.model.field.api.FieldSlots<T>, org.platypus.orm.sql.expression.TypedExpression<T>, org.platypus.model.field.api.ValidatableValue<T>, java.util.Comparator<T>, org.platypus.model.field.api.ValidatableValueThrow<T> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract M getModel();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getFieldName();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getCompleteName();
    
    public abstract <PARAM_TYPE extends java.lang.Object, RETURN extends java.lang.Object>RETURN accept(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.FieldVisitor<? super PARAM_TYPE, ? extends RETURN> visitor, PARAM_TYPE p);
    
    @org.jetbrains.annotations.NotNull()
    public abstract T anyToType(@org.jetbrains.annotations.NotNull()
    java.lang.Object value);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Set<java.lang.String> validateUnsafe(@org.jetbrains.annotations.Nullable()
    java.lang.Object value);
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public abstract java.util.Set<java.lang.String> validateNullable(@org.jetbrains.annotations.Nullable()
    T value);
    
    @java.lang.Override()
    public abstract void validateAndThrow(@org.jetbrains.annotations.Nullable()
    T value);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        public static <M extends org.platypus.model.IModel<M>, T extends java.lang.Object>java.lang.String getCompleteName(org.platypus.model.field.api.IModelField<M, T> $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static <M extends org.platypus.model.IModel<M>, T extends java.lang.Object>T anyToType(org.platypus.model.field.api.IModelField<M, T> $this, @org.jetbrains.annotations.NotNull()
        java.lang.Object value) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static <M extends org.platypus.model.IModel<M>, T extends java.lang.Object>java.util.Set<java.lang.String> validateUnsafe(org.platypus.model.field.api.IModelField<M, T> $this, @org.jetbrains.annotations.Nullable()
        java.lang.Object value) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <M extends org.platypus.model.IModel<M>, T extends java.lang.Object>java.util.Set<java.lang.String> validateNullable(org.platypus.model.field.api.IModelField<M, T> $this, @org.jetbrains.annotations.Nullable()
        T value) {
            return null;
        }
        
        @java.lang.Override()
        public static <M extends org.platypus.model.IModel<M>, T extends java.lang.Object>void validateAndThrow(org.platypus.model.field.api.IModelField<M, T> $this, @org.jetbrains.annotations.Nullable()
        T value) {
        }
    }
}