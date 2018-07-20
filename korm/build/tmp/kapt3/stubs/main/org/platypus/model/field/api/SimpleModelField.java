package org.platypus.model.field.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005\u00a8\u0006\u0006"}, d2 = {"Lorg/platypus/model/field/api/SimpleModelField;", "M", "Lorg/platypus/model/Model;", "T", "", "Lorg/platypus/model/field/api/IModelField;", "korm"})
public abstract interface SimpleModelField<M extends org.platypus.model.Model<M>, T extends java.lang.Object> extends org.platypus.model.field.api.IModelField<M, T> {
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <M extends org.platypus.model.Model<M>, T extends java.lang.Object>java.lang.String getCompleteName(org.platypus.model.field.api.SimpleModelField<M, T> $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <M extends org.platypus.model.Model<M>, T extends java.lang.Object>T anyToType(org.platypus.model.field.api.SimpleModelField<M, T> $this, @org.jetbrains.annotations.NotNull()
        java.lang.Object value) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <M extends org.platypus.model.Model<M>, T extends java.lang.Object>java.util.Set<java.lang.String> validateUnsafe(org.platypus.model.field.api.SimpleModelField<M, T> $this, @org.jetbrains.annotations.Nullable()
        java.lang.Object value) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <M extends org.platypus.model.Model<M>, T extends java.lang.Object>java.util.Set<java.lang.String> validateNullable(org.platypus.model.field.api.SimpleModelField<M, T> $this, @org.jetbrains.annotations.Nullable()
        T value) {
            return null;
        }
        
        @java.lang.Override()
        public static <M extends org.platypus.model.Model<M>, T extends java.lang.Object>void validateAndThrow(org.platypus.model.field.api.SimpleModelField<M, T> $this, @org.jetbrains.annotations.Nullable()
        T value) {
        }
    }
}