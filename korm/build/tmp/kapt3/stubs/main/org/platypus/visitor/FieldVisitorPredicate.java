package org.platypus.visitor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/platypus/visitor/FieldVisitorPredicate;", "PARAM", "Lorg/platypus/visitor/FieldVisitorDefault;", "", "default", "getDefault", "()Ljava/lang/Boolean;", "korm"})
public abstract interface FieldVisitorPredicate<PARAM extends java.lang.Object> extends org.platypus.visitor.FieldVisitorDefault<PARAM, java.lang.Boolean> {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public abstract java.lang.Boolean getDefault();
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean getDefault(org.platypus.visitor.FieldVisitorPredicate<PARAM> $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.FieldVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.StringField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.FieldVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.DateField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.FieldVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.DateTimeField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.FieldVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.TimeField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.FieldVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.BooleanField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.FieldVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.TextField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.FieldVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.DecimalField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.FieldVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.IntField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.FieldVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.BinaryField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.FieldVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.One2ManyField<?, ?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.FieldVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.Many2OneField<?, ?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.FieldVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.One2OneField<?, ?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.FieldVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.RevOne2OneField<?, ?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.FieldVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.Many2ManyField<?, ?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.FieldVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.PKModelField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.FieldVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.Many2OneFieldLink<?, ?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.FieldVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.FieldAlias<?, ?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.FieldVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.SelectionField<?, ?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.FieldVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.NameModelField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.FieldVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.ExternalRefModelField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.FieldVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.WriteDateModelField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.FieldVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.CreateDateModelField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.FieldVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.ArchivedModelField<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.FieldVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.CreateUID<?> field, PARAM p) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static <PARAM extends java.lang.Object>java.lang.Boolean visit(org.platypus.visitor.FieldVisitorPredicate<PARAM> $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.WriteUID<?> field, PARAM p) {
            return null;
        }
    }
}