package org.platypus.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003J-\u0010\u0007\u001a\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u00a6\u0002J/\u0010\u0007\u001a\u0004\u0018\u00010\r*\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u00a6\u0002J-\u0010\u0007\u001a\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u00a6\u0002J-\u0010\u0007\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00112\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u00a6\u0002J7\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00130\u0012j\u0002`\u0014*\b\u0012\u0004\u0012\u00028\u00000\u00152\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u00a6\u0002J/\u0010\u0007\u001a\u0004\u0018\u00010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00172\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u00a6\u0002J/\u0010\u0007\u001a\u0004\u0018\u00010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00182\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u00a6\u0002J/\u0010\u0007\u001a\u0004\u0018\u00010\u0019*\b\u0012\u0004\u0012\u00028\u00000\u001a2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u00a6\u0002J/\u0010\u0007\u001a\u0004\u0018\u00010\u001b*\b\u0012\u0004\u0012\u00028\u00000\u001c2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u00a6\u0002J4\u0010\u0007\u001a\u0004\u0018\u00010\u001d*\b\u0012\u0004\u0012\u00028\u00000\u001e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u00a6\u0002\u00a2\u0006\u0002\u0010\u001fJI\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H!0 \"\u000e\b\u0001\u0010!*\b\u0012\u0004\u0012\u0002H!0\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H!0\"2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u00a6\u0002JI\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H!0\u0012\"\u000e\b\u0001\u0010!*\b\u0012\u0004\u0012\u0002H!0\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H!0#2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u00a6\u0002J/\u0010\u0007\u001a\u0004\u0018\u00010\u001b*\b\u0012\u0004\u0012\u00028\u00000$2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u00a6\u0002JI\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H!0 \"\u000e\b\u0001\u0010!*\b\u0012\u0004\u0012\u0002H!0\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H!0%2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u00a6\u0002JI\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H!0\u0012\"\u000e\b\u0001\u0010!*\b\u0012\u0004\u0012\u0002H!0\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H!0&2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u00a6\u0002JI\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H!0\u0012\"\u000e\b\u0001\u0010!*\b\u0012\u0004\u0012\u0002H!0\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H!0\'2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u00a6\u0002JK\u0010\u0007\u001a\n\u0012\u0004\u0012\u0002H)\u0018\u00010(\"\u000e\b\u0001\u0010)*\b\u0012\u0004\u0012\u0002H)0**\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H)0+2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u00a6\u0002J/\u0010\u0007\u001a\u0004\u0018\u00010\u001b*\b\u0012\u0004\u0012\u00028\u00000,2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u00a6\u0002J/\u0010\u0007\u001a\u0004\u0018\u00010\u001b*\b\u0012\u0004\u0012\u00028\u00000-2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u00a6\u0002J/\u0010\u0007\u001a\u0004\u0018\u00010.*\b\u0012\u0004\u0012\u00028\u00000/2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u00a6\u0002J/\u0010\u0007\u001a\u0004\u0018\u00010\u0010*\b\u0012\u0004\u0012\u00028\u0000002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u00a6\u0002J7\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00130\u0012j\u0002`\u0014*\b\u0012\u0004\u0012\u00028\u0000012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u00a6\u0002R\u0012\u0010\u0004\u001a\u00028\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u00062"}, d2 = {"Lorg/platypus/entity/RecordDelegate;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/Identifiable;", "model", "getModel", "()Lorg/platypus/model/Model;", "getValue", "", "Lorg/platypus/model/field/impl/ArchivedModelField;", "o", "desc", "Lkotlin/reflect/KProperty;", "", "Lorg/platypus/model/field/impl/BinaryField;", "Lorg/platypus/model/field/impl/BooleanField;", "Ljava/time/LocalDateTime;", "Lorg/platypus/model/field/impl/CreateDateModelField;", "Lorg/platypus/entity/Record;", "Lorg/platypus/module/base/models/Users;", "Lorg/platypus/module/base/entities/User;", "Lorg/platypus/model/field/impl/CreateUID;", "Ljava/time/LocalDate;", "Lorg/platypus/model/field/impl/DateField;", "Lorg/platypus/model/field/impl/DateTimeField;", "Ljava/math/BigDecimal;", "Lorg/platypus/model/field/impl/DecimalField;", "", "Lorg/platypus/model/field/impl/ExternalRefModelField;", "", "Lorg/platypus/model/field/impl/IntField;", "(Lorg/platypus/model/field/impl/IntField;Lorg/platypus/entity/RecordDelegate;Lkotlin/reflect/KProperty;)Ljava/lang/Integer;", "Lorg/platypus/bag/Bag;", "TM", "Lorg/platypus/model/field/impl/Many2ManyField;", "Lorg/platypus/model/field/impl/Many2OneField;", "Lorg/platypus/model/field/impl/NameModelField;", "Lorg/platypus/model/field/impl/One2ManyField;", "Lorg/platypus/model/field/impl/One2OneField;", "Lorg/platypus/model/field/impl/RevOne2OneField;", "Lorg/platypus/entity/SelectionValue;", "D", "Lorg/platypus/entity/Selection;", "Lorg/platypus/model/field/impl/SelectionField;", "Lorg/platypus/model/field/impl/StringField;", "Lorg/platypus/model/field/impl/TextField;", "Ljava/time/LocalTime;", "Lorg/platypus/model/field/impl/TimeField;", "Lorg/platypus/model/field/impl/WriteDateModelField;", "Lorg/platypus/model/field/impl/WriteUID;", "korm"})
public abstract interface RecordDelegate<M extends org.platypus.model.Model<M>> extends org.platypus.Identifiable {
    
    @org.jetbrains.annotations.NotNull()
    public abstract M getModel();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.time.LocalTime getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.TimeField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.NameModelField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ExternalRefModelField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.StringField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.TextField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.time.LocalDate getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DateField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.time.LocalDateTime getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DateTimeField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc);
    
    public abstract boolean getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.BooleanField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.math.BigDecimal getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DecimalField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Integer getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.IntField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc);
    
    @org.jetbrains.annotations.Nullable()
    public abstract <D extends org.platypus.entity.Selection<D>>org.platypus.entity.SelectionValue<D> getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.SelectionField<M, D> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc);
    
    @org.jetbrains.annotations.Nullable()
    public abstract byte[] getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.BinaryField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.entity.Record<org.platypus.module.base.models.Users> getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.CreateUID<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.entity.Record<org.platypus.module.base.models.Users> getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.WriteUID<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc);
    
    @org.jetbrains.annotations.NotNull()
    public abstract <TM extends org.platypus.model.Model<TM>>org.platypus.bag.Bag<TM> getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2ManyField<M, TM> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc);
    
    @org.jetbrains.annotations.NotNull()
    public abstract <TM extends org.platypus.model.Model<TM>>org.platypus.bag.Bag<TM> getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2ManyField<M, TM> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc);
    
    @org.jetbrains.annotations.NotNull()
    public abstract <TM extends org.platypus.model.Model<TM>>org.platypus.entity.Record<TM> getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2OneField<M, TM> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc);
    
    @org.jetbrains.annotations.NotNull()
    public abstract <TM extends org.platypus.model.Model<TM>>org.platypus.entity.Record<TM> getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2OneField<M, TM> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc);
    
    @org.jetbrains.annotations.NotNull()
    public abstract <TM extends org.platypus.model.Model<TM>>org.platypus.entity.Record<TM> getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RevOne2OneField<M, TM> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.time.LocalDateTime getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.CreateDateModelField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.time.LocalDateTime getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.WriteDateModelField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc);
    
    public abstract boolean getValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ArchivedModelField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.RecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc);
}