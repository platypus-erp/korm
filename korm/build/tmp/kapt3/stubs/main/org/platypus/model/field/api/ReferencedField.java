package org.platypus.model.field.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00060\u0005R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00028\u0001X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lorg/platypus/model/field/api/ReferencedField;", "M", "Lorg/platypus/model/IModel;", "TM", "Lorg/platypus/model/Model;", "Lorg/platypus/model/field/api/IModelField;", "Lorg/platypus/entity/Record;", "onDelete", "Lorg/platypus/orm/ReferenceOption;", "getOnDelete", "()Lorg/platypus/orm/ReferenceOption;", "target", "getTarget", "()Lorg/platypus/model/Model;", "korm"})
public abstract interface ReferencedField<M extends org.platypus.model.IModel<M>, TM extends org.platypus.model.Model<TM>> extends org.platypus.model.field.api.IModelField<M, org.platypus.entity.Record<TM>> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract TM getTarget();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.ReferenceOption getOnDelete();
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <M extends org.platypus.model.IModel<M>, TM extends org.platypus.model.Model<TM>>java.lang.String getCompleteName(org.platypus.model.field.api.ReferencedField<M, TM> $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <M extends org.platypus.model.IModel<M>, TM extends org.platypus.model.Model<TM>>org.platypus.entity.Record<TM> anyToType(org.platypus.model.field.api.ReferencedField<M, TM> $this, @org.jetbrains.annotations.NotNull()
        java.lang.Object value) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <M extends org.platypus.model.IModel<M>, TM extends org.platypus.model.Model<TM>>java.util.Set<java.lang.String> validateUnsafe(org.platypus.model.field.api.ReferencedField<M, TM> $this, @org.jetbrains.annotations.Nullable()
        java.lang.Object value) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <M extends org.platypus.model.IModel<M>, TM extends org.platypus.model.Model<TM>>java.util.Set<java.lang.String> validateNullable(org.platypus.model.field.api.ReferencedField<M, TM> $this, @org.jetbrains.annotations.Nullable()
        org.platypus.entity.Record<TM> value) {
            return null;
        }
        
        @java.lang.Override()
        public static <M extends org.platypus.model.IModel<M>, TM extends org.platypus.model.Model<TM>>void validateAndThrow(org.platypus.model.field.api.ReferencedField<M, TM> $this, @org.jetbrains.annotations.Nullable()
        org.platypus.entity.Record<TM> value) {
        }
    }
}