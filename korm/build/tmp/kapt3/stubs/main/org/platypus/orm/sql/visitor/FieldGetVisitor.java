package org.platypus.orm.sql.visitor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00030\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\n2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\r2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00112\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00122\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00142\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00152\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00162\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00172\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00182\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00192\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001a2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001b2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u001c2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u001d2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u001e2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u001f2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030 2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016\u00a8\u0006!"}, d2 = {"Lorg/platypus/orm/sql/visitor/FieldGetVisitor;", "Lorg/platypus/model/field/api/FieldVisitor;", "", "Lorg/platypus/model/field/api/IModelField;", "()V", "visit", "field", "Lorg/platypus/model/field/impl/ArchivedModelField;", "p", "Lorg/platypus/model/field/impl/BinaryField;", "Lorg/platypus/model/field/impl/BooleanField;", "Lorg/platypus/model/field/impl/CreateDateModelField;", "Lorg/platypus/model/field/impl/CreateUID;", "Lorg/platypus/model/field/impl/DateField;", "Lorg/platypus/model/field/impl/DateTimeField;", "Lorg/platypus/model/field/impl/DecimalField;", "Lorg/platypus/model/field/impl/ExternalRefModelField;", "Lorg/platypus/model/field/impl/FieldAlias;", "Lorg/platypus/model/field/impl/IntField;", "Lorg/platypus/model/field/impl/Many2ManyField;", "Lorg/platypus/model/field/impl/Many2OneField;", "Lorg/platypus/model/field/impl/Many2OneFieldLink;", "Lorg/platypus/model/field/impl/NameModelField;", "Lorg/platypus/model/field/impl/One2ManyField;", "Lorg/platypus/model/field/impl/One2OneField;", "Lorg/platypus/model/field/impl/PKModelField;", "Lorg/platypus/model/field/impl/RevOne2OneField;", "Lorg/platypus/model/field/impl/SelectionField;", "Lorg/platypus/model/field/impl/StringField;", "Lorg/platypus/model/field/impl/TextField;", "Lorg/platypus/model/field/impl/TimeField;", "Lorg/platypus/model/field/impl/WriteDateModelField;", "Lorg/platypus/model/field/impl/WriteUID;", "korm"})
public final class FieldGetVisitor implements org.platypus.model.field.api.FieldVisitor<java.lang.Object, org.platypus.model.field.api.IModelField<?, ?>> {
    public static final org.platypus.orm.sql.visitor.FieldGetVisitor INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.IModelField<?, ?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.StringField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.IModelField<?, ?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DateField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.IModelField<?, ?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DateTimeField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.IModelField<?, ?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.TimeField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.IModelField<?, ?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.BooleanField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.IModelField<?, ?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.TextField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.IModelField<?, ?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DecimalField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.IModelField<?, ?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.IntField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.IModelField<?, ?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.BinaryField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.IModelField<?, ?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2ManyField<?, ?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.IModelField<?, ?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2OneField<?, ?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.IModelField<?, ?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2OneFieldLink<?, ?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.IModelField<?, ?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2OneField<?, ?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.IModelField<?, ?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RevOne2OneField<?, ?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.IModelField<?, ?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2ManyField<?, ?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.IModelField<?, ?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.PKModelField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.IModelField<?, ?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.FieldAlias<?, ?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.IModelField<?, ?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.SelectionField<?, ?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.IModelField<?, ?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.NameModelField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.IModelField<?, ?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ExternalRefModelField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.IModelField<?, ?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.WriteDateModelField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.IModelField<?, ?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.CreateDateModelField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.IModelField<?, ?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ArchivedModelField<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.IModelField<?, ?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.CreateUID<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.IModelField<?, ?> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.WriteUID<?> field, @org.jetbrains.annotations.Nullable()
    java.lang.Object p) {
        return null;
    }
    
    private FieldGetVisitor() {
        super();
    }
}