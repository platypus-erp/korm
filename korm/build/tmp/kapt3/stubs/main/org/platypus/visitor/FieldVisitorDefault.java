package org.platypus.visitor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00aa\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003J!\u0010\u0007\u001a\u00028\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u000bJ!\u0010\u0007\u001a\u00028\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\rJ!\u0010\u0007\u001a\u00028\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u000fJ!\u0010\u0007\u001a\u00028\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0011J!\u0010\u0007\u001a\u00028\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0013J!\u0010\u0007\u001a\u00028\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0015J!\u0010\u0007\u001a\u00028\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0017J!\u0010\u0007\u001a\u00028\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00182\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0019J!\u0010\u0007\u001a\u00028\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u001a2\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u001bJ%\u0010\u0007\u001a\u00028\u00012\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001c2\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u001dJ!\u0010\u0007\u001a\u00028\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u001e2\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u001fJ%\u0010\u0007\u001a\u00028\u00012\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030 2\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010!J%\u0010\u0007\u001a\u00028\u00012\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\"2\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010#J%\u0010\u0007\u001a\u00028\u00012\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030$2\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010%J!\u0010\u0007\u001a\u00028\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030&2\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\'J%\u0010\u0007\u001a\u00028\u00012\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030(2\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010)J%\u0010\u0007\u001a\u00028\u00012\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030*2\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010+J!\u0010\u0007\u001a\u00028\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030,2\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010-J%\u0010\u0007\u001a\u00028\u00012\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030.2\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010/J%\u0010\u0007\u001a\u00028\u00012\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003002\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u00101J!\u0010\u0007\u001a\u00028\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u0003022\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u00103J!\u0010\u0007\u001a\u00028\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u0003042\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u00105J!\u0010\u0007\u001a\u00028\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u0003062\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u00107J!\u0010\u0007\u001a\u00028\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u0003082\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u00109J!\u0010\u0007\u001a\u00028\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030:2\u0006\u0010\n\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010;R\u0012\u0010\u0004\u001a\u00028\u0001X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006<"}, d2 = {"Lorg/platypus/visitor/FieldVisitorDefault;", "PARAM", "DEFAULT", "Lorg/platypus/model/field/api/FieldVisitor;", "default", "getDefault", "()Ljava/lang/Object;", "visit", "field", "Lorg/platypus/model/field/impl/ArchivedModelField;", "p", "(Lorg/platypus/model/field/impl/ArchivedModelField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/BinaryField;", "(Lorg/platypus/model/field/impl/BinaryField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/BooleanField;", "(Lorg/platypus/model/field/impl/BooleanField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/CreateDateModelField;", "(Lorg/platypus/model/field/impl/CreateDateModelField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/CreateUID;", "(Lorg/platypus/model/field/impl/CreateUID;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/DateField;", "(Lorg/platypus/model/field/impl/DateField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/DateTimeField;", "(Lorg/platypus/model/field/impl/DateTimeField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/DecimalField;", "(Lorg/platypus/model/field/impl/DecimalField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/ExternalRefModelField;", "(Lorg/platypus/model/field/impl/ExternalRefModelField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/FieldAlias;", "(Lorg/platypus/model/field/impl/FieldAlias;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/IntField;", "(Lorg/platypus/model/field/impl/IntField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/Many2ManyField;", "(Lorg/platypus/model/field/impl/Many2ManyField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/Many2OneField;", "(Lorg/platypus/model/field/impl/Many2OneField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/Many2OneFieldLink;", "(Lorg/platypus/model/field/impl/Many2OneFieldLink;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/NameModelField;", "(Lorg/platypus/model/field/impl/NameModelField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/One2ManyField;", "(Lorg/platypus/model/field/impl/One2ManyField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/One2OneField;", "(Lorg/platypus/model/field/impl/One2OneField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/PKModelField;", "(Lorg/platypus/model/field/impl/PKModelField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/RevOne2OneField;", "(Lorg/platypus/model/field/impl/RevOne2OneField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/SelectionField;", "(Lorg/platypus/model/field/impl/SelectionField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/StringField;", "(Lorg/platypus/model/field/impl/StringField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/TextField;", "(Lorg/platypus/model/field/impl/TextField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/TimeField;", "(Lorg/platypus/model/field/impl/TimeField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/WriteDateModelField;", "(Lorg/platypus/model/field/impl/WriteDateModelField;Ljava/lang/Object;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/WriteUID;", "(Lorg/platypus/model/field/impl/WriteUID;Ljava/lang/Object;)Ljava/lang/Object;", "korm"})
public abstract interface FieldVisitorDefault<PARAM extends java.lang.Object, DEFAULT extends java.lang.Object> extends org.platypus.model.field.api.FieldVisitor<PARAM, DEFAULT> {
    
    public abstract DEFAULT getDefault();
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.StringField<?> field, PARAM p);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DateField<?> field, PARAM p);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DateTimeField<?> field, PARAM p);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.TimeField<?> field, PARAM p);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.BooleanField<?> field, PARAM p);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.TextField<?> field, PARAM p);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DecimalField<?> field, PARAM p);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.IntField<?> field, PARAM p);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.BinaryField<?> field, PARAM p);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2ManyField<?, ?> field, PARAM p);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2OneField<?, ?> field, PARAM p);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2OneField<?, ?> field, PARAM p);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RevOne2OneField<?, ?> field, PARAM p);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2ManyField<?, ?> field, PARAM p);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.PKModelField<?> field, PARAM p);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2OneFieldLink<?, ?> field, PARAM p);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.FieldAlias<?, ?> field, PARAM p);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.SelectionField<?, ?> field, PARAM p);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.NameModelField<?> field, PARAM p);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ExternalRefModelField<?> field, PARAM p);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.WriteDateModelField<?> field, PARAM p);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.CreateDateModelField<?> field, PARAM p);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ArchivedModelField<?> field, PARAM p);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.CreateUID<?> field, PARAM p);
    
    @java.lang.Override()
    public abstract DEFAULT visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.WriteUID<?> field, PARAM p);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.FieldVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.StringField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.FieldVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.DateField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.FieldVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.DateTimeField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.FieldVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.TimeField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.FieldVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.BooleanField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.FieldVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.TextField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.FieldVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.DecimalField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.FieldVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.IntField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.FieldVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.BinaryField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.FieldVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.One2ManyField<?, ?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.FieldVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.Many2OneField<?, ?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.FieldVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.One2OneField<?, ?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.FieldVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.RevOne2OneField<?, ?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.FieldVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.Many2ManyField<?, ?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.FieldVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.PKModelField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.FieldVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.Many2OneFieldLink<?, ?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.FieldVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.FieldAlias<?, ?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.FieldVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.SelectionField<?, ?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.FieldVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.NameModelField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.FieldVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.ExternalRefModelField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.FieldVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.WriteDateModelField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.FieldVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.CreateDateModelField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.FieldVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.ArchivedModelField<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.FieldVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.CreateUID<?> field, PARAM p) {
            return null;
        }
        
        @java.lang.Override()
        public static <PARAM extends java.lang.Object, DEFAULT extends java.lang.Object>DEFAULT visit(org.platypus.visitor.FieldVisitorDefault<PARAM, DEFAULT> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.WriteUID<?> field, PARAM p) {
            return null;
        }
    }
}