package org.platypus.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00030\u0001:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0006J*\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J,\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016J*\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\n\u001a\u00020\u0002H\u0016J*\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\n\u001a\u00020\u0002H\u0016J,\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\n\u001a\u00020\u0002H\u0016J*\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\n\u001a\u00020\u0002H\u0016J*\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\n\u001a\u00020\u0002H\u0016J*\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\n\u001a\u00020\u0002H\u0016J*\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\n\u001a\u00020\u0002H\u0016J0\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00032\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00132\u0006\u0010\n\u001a\u00020\u0002H\u0016J*\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\n\u001a\u00020\u0002H\u0016J.\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00152\u0006\u0010\n\u001a\u00020\u0002H\u0016J.\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00162\u0006\u0010\n\u001a\u00020\u0002H\u0016J0\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00032\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00172\u0006\u0010\n\u001a\u00020\u0002H\u0016J*\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00182\u0006\u0010\n\u001a\u00020\u0002H\u0016J.\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00192\u0006\u0010\n\u001a\u00020\u0002H\u0016J.\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001a2\u0006\u0010\n\u001a\u00020\u0002H\u0016J*\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u001b2\u0006\u0010\n\u001a\u00020\u0002H\u0016J.\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001c2\u0006\u0010\n\u001a\u00020\u0002H\u0016J.\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001d2\u0006\u0010\n\u001a\u00020\u0002H\u0016J*\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u001e2\u0006\u0010\n\u001a\u00020\u0002H\u0016J*\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u001f2\u0006\u0010\n\u001a\u00020\u0002H\u0016J*\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030 2\u0006\u0010\n\u001a\u00020\u0002H\u0016J*\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030!2\u0006\u0010\n\u001a\u00020\u0002H\u0016J,\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\"2\u0006\u0010\n\u001a\u00020\u0002H\u0016J6\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\"\b\b\u0000\u0010$*\u00020\u0005*\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u0002H$0%2\u0006\u0010\n\u001a\u00020\u0002H\u0002\u00a8\u0006\'"}, d2 = {"Lorg/platypus/utils/FieldToJsonVisitor;", "Lorg/platypus/model/field/api/FieldVisitor;", "Lorg/platypus/utils/FieldToJsonVisitor$Parameter;", "Lkotlin/Pair;", "", "", "()V", "visit", "field", "Lorg/platypus/model/field/impl/ArchivedModelField;", "p", "Lorg/platypus/model/field/impl/BinaryField;", "Lorg/platypus/model/field/impl/BooleanField;", "Lorg/platypus/model/field/impl/CreateDateModelField;", "Lorg/platypus/model/field/impl/CreateUID;", "Lorg/platypus/model/field/impl/DateField;", "Lorg/platypus/model/field/impl/DateTimeField;", "Lorg/platypus/model/field/impl/DecimalField;", "Lorg/platypus/model/field/impl/ExternalRefModelField;", "Lorg/platypus/model/field/impl/FieldAlias;", "Lorg/platypus/model/field/impl/IntField;", "Lorg/platypus/model/field/impl/Many2ManyField;", "Lorg/platypus/model/field/impl/Many2OneField;", "Lorg/platypus/model/field/impl/Many2OneFieldLink;", "Lorg/platypus/model/field/impl/NameModelField;", "Lorg/platypus/model/field/impl/One2ManyField;", "Lorg/platypus/model/field/impl/One2OneField;", "Lorg/platypus/model/field/impl/PKModelField;", "Lorg/platypus/model/field/impl/RevOne2OneField;", "Lorg/platypus/model/field/impl/SelectionField;", "Lorg/platypus/model/field/impl/StringField;", "Lorg/platypus/model/field/impl/TextField;", "Lorg/platypus/model/field/impl/TimeField;", "Lorg/platypus/model/field/impl/WriteDateModelField;", "Lorg/platypus/model/field/impl/WriteUID;", "visitSimple", "T", "Lorg/platypus/model/field/impl/SimpleField;", "Parameter", "korm"})
public final class FieldToJsonVisitor implements org.platypus.model.field.api.FieldVisitor<org.platypus.utils.FieldToJsonVisitor.Parameter, kotlin.Pair<? extends java.lang.String, ? extends java.lang.Object>> {
    
    private final <T extends java.lang.Object>kotlin.Pair<java.lang.String, java.lang.Object> visitSimple(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.SimpleField<?, T> $receiver, org.platypus.utils.FieldToJsonVisitor.Parameter p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.Pair<java.lang.String, java.lang.Object> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.StringField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.utils.FieldToJsonVisitor.Parameter p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.Pair<java.lang.String, java.lang.Object> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DateField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.utils.FieldToJsonVisitor.Parameter p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.Pair<java.lang.String, java.lang.Object> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DateTimeField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.utils.FieldToJsonVisitor.Parameter p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.Pair<java.lang.String, java.lang.Object> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.TimeField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.utils.FieldToJsonVisitor.Parameter p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.Pair<java.lang.String, java.lang.Object> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.BooleanField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.utils.FieldToJsonVisitor.Parameter p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.Pair<java.lang.String, java.lang.Object> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.TextField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.utils.FieldToJsonVisitor.Parameter p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.Pair<java.lang.String, java.lang.Object> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DecimalField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.utils.FieldToJsonVisitor.Parameter p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.Pair<java.lang.String, java.lang.Object> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.IntField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.utils.FieldToJsonVisitor.Parameter p) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public kotlin.Pair<java.lang.String, java.lang.Object> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.BinaryField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.utils.FieldToJsonVisitor.Parameter p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.Pair<java.lang.String, java.lang.Object> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2ManyField<?, ?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.utils.FieldToJsonVisitor.Parameter p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.Pair<java.lang.String, java.lang.Object> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2OneField<?, ?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.utils.FieldToJsonVisitor.Parameter p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.Pair<java.lang.String, java.lang.Object> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2OneField<?, ?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.utils.FieldToJsonVisitor.Parameter p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.Pair<java.lang.String, java.lang.Object> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RevOne2OneField<?, ?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.utils.FieldToJsonVisitor.Parameter p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.Pair<java.lang.String, java.lang.Object> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2ManyField<?, ?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.utils.FieldToJsonVisitor.Parameter p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.Pair<java.lang.String, java.lang.Object> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.PKModelField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.utils.FieldToJsonVisitor.Parameter p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.Pair<java.lang.String, java.lang.Object> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.SelectionField<?, ?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.utils.FieldToJsonVisitor.Parameter p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.Pair<java.lang.String, java.lang.Object> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.NameModelField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.utils.FieldToJsonVisitor.Parameter p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.Pair<java.lang.String, java.lang.Object> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ExternalRefModelField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.utils.FieldToJsonVisitor.Parameter p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.Pair<java.lang.String, java.lang.Object> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.WriteDateModelField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.utils.FieldToJsonVisitor.Parameter p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.Pair<java.lang.String, java.lang.Object> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.CreateDateModelField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.utils.FieldToJsonVisitor.Parameter p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.Pair<java.lang.String, java.lang.Object> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ArchivedModelField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.utils.FieldToJsonVisitor.Parameter p) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public kotlin.Pair<java.lang.String, java.lang.Object> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.CreateUID<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.utils.FieldToJsonVisitor.Parameter p) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public kotlin.Pair<java.lang.String, java.lang.Object> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.WriteUID<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.utils.FieldToJsonVisitor.Parameter p) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public kotlin.Pair<java.lang.String, java.lang.Object> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2OneFieldLink<?, ?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.utils.FieldToJsonVisitor.Parameter p) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public kotlin.Pair<java.lang.String, java.lang.Object> visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.FieldAlias<?, ?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.utils.FieldToJsonVisitor.Parameter p) {
        return null;
    }
    
    public FieldToJsonVisitor() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u000bH\u00c6\u0003JK\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020\u000bH\u00d6\u0001J\t\u0010$\u001a\u00020%H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006&"}, d2 = {"Lorg/platypus/utils/FieldToJsonVisitor$Parameter;", "", "currentId", "Lorg/platypus/cache/ModelID;", "cache", "Lorg/platypus/cache/PlatypusCache;", "lazyType", "Lorg/platypus/model/LazyLoadType;", "parsedIds", "", "currentDepth", "", "maxDepth", "(Lorg/platypus/cache/ModelID;Lorg/platypus/cache/PlatypusCache;Lorg/platypus/model/LazyLoadType;Ljava/util/List;II)V", "getCache", "()Lorg/platypus/cache/PlatypusCache;", "getCurrentDepth", "()I", "getCurrentId", "()Lorg/platypus/cache/ModelID;", "getLazyType", "()Lorg/platypus/model/LazyLoadType;", "getMaxDepth", "getParsedIds", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "korm"})
    public static final class Parameter {
        @org.jetbrains.annotations.NotNull()
        private final org.platypus.cache.ModelID currentId = null;
        @org.jetbrains.annotations.NotNull()
        private final org.platypus.cache.PlatypusCache cache = null;
        @org.jetbrains.annotations.NotNull()
        private final org.platypus.model.LazyLoadType lazyType = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.platypus.cache.ModelID> parsedIds = null;
        private final int currentDepth = 0;
        private final int maxDepth = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final org.platypus.cache.ModelID getCurrentId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.platypus.cache.PlatypusCache getCache() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.platypus.model.LazyLoadType getLazyType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.platypus.cache.ModelID> getParsedIds() {
            return null;
        }
        
        public final int getCurrentDepth() {
            return 0;
        }
        
        public final int getMaxDepth() {
            return 0;
        }
        
        public Parameter(@org.jetbrains.annotations.NotNull()
        org.platypus.cache.ModelID currentId, @org.jetbrains.annotations.NotNull()
        org.platypus.cache.PlatypusCache cache, @org.jetbrains.annotations.NotNull()
        org.platypus.model.LazyLoadType lazyType, @org.jetbrains.annotations.NotNull()
        java.util.List<org.platypus.cache.ModelID> parsedIds, int currentDepth, int maxDepth) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.platypus.cache.ModelID component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.platypus.cache.PlatypusCache component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.platypus.model.LazyLoadType component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.platypus.cache.ModelID> component4() {
            return null;
        }
        
        public final int component5() {
            return 0;
        }
        
        public final int component6() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.platypus.utils.FieldToJsonVisitor.Parameter copy(@org.jetbrains.annotations.NotNull()
        org.platypus.cache.ModelID currentId, @org.jetbrains.annotations.NotNull()
        org.platypus.cache.PlatypusCache cache, @org.jetbrains.annotations.NotNull()
        org.platypus.model.LazyLoadType lazyType, @org.jetbrains.annotations.NotNull()
        java.util.List<org.platypus.cache.ModelID> parsedIds, int currentDepth, int maxDepth) {
            return null;
        }
        
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(java.lang.Object p0) {
            return false;
        }
    }
}