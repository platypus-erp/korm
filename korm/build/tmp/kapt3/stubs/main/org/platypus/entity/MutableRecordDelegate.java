package org.platypus.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J<\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00a6\u0002\u00a2\u0006\u0002\u0010\fJ7\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000eH\u00a6\u0002J<\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\u000f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00a6\u0002\u00a2\u0006\u0002\u0010\u0010J7\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00112\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0012H\u00a6\u0002J7\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0014H\u00a6\u0002J7\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00152\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0016H\u00a6\u0002J<\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00172\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0018H\u00a6\u0002\u00a2\u0006\u0002\u0010\u0019JW\u0010\u0004\u001a\u00020\u0005\"\u000e\b\u0001\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u001a0\u001b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001a0\u001d0\u001cH\u00a6\u0002JS\u0010\u0004\u001a\u00020\u0005\"\u000e\b\u0001\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u001a0\u001e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u0002H\u001a\u0018\u00010\u001dH\u00a6\u0002J7\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\u001f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\n\u001a\u0004\u0018\u00010 H\u00a6\u0002JW\u0010\u0004\u001a\u00020\u0005\"\u000e\b\u0001\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u001a0!2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001a0\u001d0\u001cH\u00a6\u0002JS\u0010\u0004\u001a\u00020\u0005\"\u000e\b\u0001\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u001a0\"2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u0002H\u001a\u0018\u00010\u001dH\u00a6\u0002JS\u0010\u0004\u001a\u00020\u0005\"\u000e\b\u0001\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u001a0#2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u0002H\u001a\u0018\u00010\u001dH\u00a6\u0002JS\u0010\u0004\u001a\u00020\u0005\"\u000e\b\u0001\u0010$*\b\u0012\u0004\u0012\u0002H$0%*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H$0&2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u0002H$\u0018\u00010\'H\u00a6\u0002J7\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000(2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\n\u001a\u0004\u0018\u00010 H\u00a6\u0002J7\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000)2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\n\u001a\u0004\u0018\u00010 H\u00a6\u0002J7\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000*2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\n\u001a\u0004\u0018\u00010+H\u00a6\u0002\u00a8\u0006,"}, d2 = {"Lorg/platypus/entity/MutableRecordDelegate;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/entity/RecordDelegate;", "setValue", "", "Lorg/platypus/model/field/impl/ArchivedModelField;", "o", "desc", "Lkotlin/reflect/KProperty;", "value", "", "(Lorg/platypus/model/field/impl/ArchivedModelField;Lorg/platypus/entity/MutableRecordDelegate;Lkotlin/reflect/KProperty;Ljava/lang/Boolean;)V", "Lorg/platypus/model/field/impl/BinaryField;", "", "Lorg/platypus/model/field/impl/BooleanField;", "(Lorg/platypus/model/field/impl/BooleanField;Lorg/platypus/entity/MutableRecordDelegate;Lkotlin/reflect/KProperty;Ljava/lang/Boolean;)V", "Lorg/platypus/model/field/impl/DateField;", "Ljava/time/LocalDate;", "Lorg/platypus/model/field/impl/DateTimeField;", "Ljava/time/LocalDateTime;", "Lorg/platypus/model/field/impl/DecimalField;", "Ljava/math/BigDecimal;", "Lorg/platypus/model/field/impl/IntField;", "", "(Lorg/platypus/model/field/impl/IntField;Lorg/platypus/entity/MutableRecordDelegate;Lkotlin/reflect/KProperty;Ljava/lang/Integer;)V", "TM", "Lorg/platypus/model/field/impl/Many2ManyField;", "", "Lorg/platypus/entity/Record;", "Lorg/platypus/model/field/impl/Many2OneField;", "Lorg/platypus/model/field/impl/NameModelField;", "", "Lorg/platypus/model/field/impl/One2ManyField;", "Lorg/platypus/model/field/impl/One2OneField;", "Lorg/platypus/model/field/impl/RevOne2OneField;", "D", "Lorg/platypus/entity/Selection;", "Lorg/platypus/model/field/impl/SelectionField;", "Lorg/platypus/entity/SelectionValue;", "Lorg/platypus/model/field/impl/StringField;", "Lorg/platypus/model/field/impl/TextField;", "Lorg/platypus/model/field/impl/TimeField;", "Ljava/time/LocalTime;", "korm"})
public abstract interface MutableRecordDelegate<M extends org.platypus.model.Model<M>> extends org.platypus.entity.RecordDelegate<M> {
    
    public abstract void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.NameModelField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    java.lang.String value);
    
    public abstract void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.IntField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    java.lang.Integer value);
    
    public abstract void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.StringField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    java.lang.String value);
    
    public abstract <D extends org.platypus.entity.Selection<D>>void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.SelectionField<M, D> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    org.platypus.entity.SelectionValue<D> value);
    
    public abstract void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.TextField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    java.lang.String value);
    
    public abstract void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DateField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate value);
    
    public abstract void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DateTimeField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    java.time.LocalDateTime value);
    
    public abstract void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.TimeField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    java.time.LocalTime value);
    
    public abstract void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.BooleanField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean value);
    
    public abstract void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DecimalField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    java.math.BigDecimal value);
    
    public abstract void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.BinaryField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    byte[] value);
    
    public abstract void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ArchivedModelField<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean value);
    
    public abstract <TM extends org.platypus.model.Model<TM>>void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2OneField<M, TM> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    org.platypus.entity.Record<TM> value);
    
    public abstract <TM extends org.platypus.model.Model<TM>>void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2OneField<M, TM> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    org.platypus.entity.Record<TM> value);
    
    public abstract <TM extends org.platypus.model.Model<TM>>void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RevOne2OneField<M, TM> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.Nullable()
    org.platypus.entity.Record<TM> value);
    
    public abstract <TM extends org.platypus.model.Model<TM>>void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2ManyField<M, TM> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends org.platypus.entity.Record<TM>> value);
    
    public abstract <TM extends org.platypus.model.Model<TM>>void setValue(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2ManyField<M, TM> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.entity.MutableRecordDelegate<M> o, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> desc, @org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends org.platypus.entity.Record<TM>> value);
}