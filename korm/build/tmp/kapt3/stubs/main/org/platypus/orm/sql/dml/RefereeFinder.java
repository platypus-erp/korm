package org.platypus.orm.sql.dml;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00c0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004J#\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u0010\nJ#\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u0010\fJ#\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u0010\u000eJ#\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u0010\u0010J!\u0010\u0005\u001a\u00020\u00112\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u0010\u0013J#\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u0010\u0015J#\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u0010\u0017J#\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00182\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u0010\u0019J#\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u001a2\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u0010\u001bJ+\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00032\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001c2\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u0010\u001dJ#\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u001e2\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u0010\u001fJ=\u0010\u0005\u001a\u001a\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030!\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030!0 2\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\"2\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u0010#J)\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030!2\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030$2\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u0010%J)\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030!2\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030&2\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u0010\'J#\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030(2\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u0010)J)\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030!2\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030*2\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u0010+J)\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030!2\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030,2\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u0010-J#\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030.2\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u0010/J\'\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003002\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u00101J\'\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003022\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u00103J#\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u0003042\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u00105J#\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u0003062\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u00107J#\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u0003082\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u00109J#\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030:2\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u0010;J!\u0010\u0005\u001a\u00020\u00112\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030<2\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u0010=\u00a8\u0006>"}, d2 = {"Lorg/platypus/orm/sql/dml/RefereeFinder;", "Lorg/platypus/model/field/api/FieldVisitor;", "", "Lorg/platypus/model/IModel;", "()V", "visit", "", "field", "Lorg/platypus/model/field/impl/ArchivedModelField;", "p", "(Lorg/platypus/model/field/impl/ArchivedModelField;Lkotlin/Unit;)Ljava/lang/Void;", "Lorg/platypus/model/field/impl/BinaryField;", "(Lorg/platypus/model/field/impl/BinaryField;Lkotlin/Unit;)Ljava/lang/Void;", "Lorg/platypus/model/field/impl/BooleanField;", "(Lorg/platypus/model/field/impl/BooleanField;Lkotlin/Unit;)Ljava/lang/Void;", "Lorg/platypus/model/field/impl/CreateDateModelField;", "(Lorg/platypus/model/field/impl/CreateDateModelField;Lkotlin/Unit;)Ljava/lang/Void;", "Lorg/platypus/module/base/models/Users;", "Lorg/platypus/model/field/impl/CreateUID;", "(Lorg/platypus/model/field/impl/CreateUID;Lkotlin/Unit;)Lorg/platypus/module/base/models/Users;", "Lorg/platypus/model/field/impl/DateField;", "(Lorg/platypus/model/field/impl/DateField;Lkotlin/Unit;)Ljava/lang/Void;", "Lorg/platypus/model/field/impl/DateTimeField;", "(Lorg/platypus/model/field/impl/DateTimeField;Lkotlin/Unit;)Ljava/lang/Void;", "Lorg/platypus/model/field/impl/DecimalField;", "(Lorg/platypus/model/field/impl/DecimalField;Lkotlin/Unit;)Ljava/lang/Void;", "Lorg/platypus/model/field/impl/ExternalRefModelField;", "(Lorg/platypus/model/field/impl/ExternalRefModelField;Lkotlin/Unit;)Ljava/lang/Void;", "Lorg/platypus/model/field/impl/FieldAlias;", "(Lorg/platypus/model/field/impl/FieldAlias;Lkotlin/Unit;)Lorg/platypus/model/IModel;", "Lorg/platypus/model/field/impl/IntField;", "(Lorg/platypus/model/field/impl/IntField;Lkotlin/Unit;)Ljava/lang/Void;", "Lorg/platypus/model/LinkModel;", "Lorg/platypus/model/Model;", "Lorg/platypus/model/field/impl/Many2ManyField;", "(Lorg/platypus/model/field/impl/Many2ManyField;Lkotlin/Unit;)Lorg/platypus/model/LinkModel;", "Lorg/platypus/model/field/impl/Many2OneField;", "(Lorg/platypus/model/field/impl/Many2OneField;Lkotlin/Unit;)Lorg/platypus/model/Model;", "Lorg/platypus/model/field/impl/Many2OneFieldLink;", "(Lorg/platypus/model/field/impl/Many2OneFieldLink;Lkotlin/Unit;)Lorg/platypus/model/Model;", "Lorg/platypus/model/field/impl/NameModelField;", "(Lorg/platypus/model/field/impl/NameModelField;Lkotlin/Unit;)Ljava/lang/Void;", "Lorg/platypus/model/field/impl/One2ManyField;", "(Lorg/platypus/model/field/impl/One2ManyField;Lkotlin/Unit;)Lorg/platypus/model/Model;", "Lorg/platypus/model/field/impl/One2OneField;", "(Lorg/platypus/model/field/impl/One2OneField;Lkotlin/Unit;)Lorg/platypus/model/Model;", "Lorg/platypus/model/field/impl/PKModelField;", "(Lorg/platypus/model/field/impl/PKModelField;Lkotlin/Unit;)Ljava/lang/Void;", "Lorg/platypus/model/field/impl/RevOne2OneField;", "(Lorg/platypus/model/field/impl/RevOne2OneField;Lkotlin/Unit;)Ljava/lang/Void;", "Lorg/platypus/model/field/impl/SelectionField;", "(Lorg/platypus/model/field/impl/SelectionField;Lkotlin/Unit;)Ljava/lang/Void;", "Lorg/platypus/model/field/impl/StringField;", "(Lorg/platypus/model/field/impl/StringField;Lkotlin/Unit;)Ljava/lang/Void;", "Lorg/platypus/model/field/impl/TextField;", "(Lorg/platypus/model/field/impl/TextField;Lkotlin/Unit;)Ljava/lang/Void;", "Lorg/platypus/model/field/impl/TimeField;", "(Lorg/platypus/model/field/impl/TimeField;Lkotlin/Unit;)Ljava/lang/Void;", "Lorg/platypus/model/field/impl/WriteDateModelField;", "(Lorg/platypus/model/field/impl/WriteDateModelField;Lkotlin/Unit;)Ljava/lang/Void;", "Lorg/platypus/model/field/impl/WriteUID;", "(Lorg/platypus/model/field/impl/WriteUID;Lkotlin/Unit;)Lorg/platypus/module/base/models/Users;", "korm"})
public final class RefereeFinder implements org.platypus.model.field.api.FieldVisitor<kotlin.Unit, org.platypus.model.IModel<?>> {
    public static final org.platypus.orm.sql.dml.RefereeFinder INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.PKModelField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Unit p) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.StringField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Unit p) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DateField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Unit p) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DateTimeField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Unit p) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.TimeField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Unit p) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.BooleanField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Unit p) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.TextField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Unit p) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DecimalField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Unit p) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.IntField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Unit p) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.BinaryField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Unit p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.Model<?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2ManyField<?, ?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Unit p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.Model<?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2OneField<?, ?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Unit p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.Model<?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2OneFieldLink<?, ?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Unit p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.LinkModel<? extends org.platypus.model.Model<?>, ? extends org.platypus.model.Model<?>> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2ManyField<?, ?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Unit p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.module.base.models.Users visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.CreateUID<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Unit p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.module.base.models.Users visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.WriteUID<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Unit p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.Model<?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2OneField<?, ?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Unit p) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RevOne2OneField<?, ?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Unit p) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.SelectionField<?, ?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Unit p) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.NameModelField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Unit p) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ExternalRefModelField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Unit p) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.WriteDateModelField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Unit p) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.CreateDateModelField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Unit p) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ArchivedModelField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Unit p) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.platypus.model.IModel<?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.FieldAlias<?, ?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Unit p) {
        return null;
    }
    
    private RefereeFinder() {
        super();
    }
}