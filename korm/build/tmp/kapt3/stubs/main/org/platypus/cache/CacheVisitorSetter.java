package org.platypus.cache;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bb\u0018\u00002\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u0004\u0012\u00020\u00050\u0001J*\u0010\u0006\u001a\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J*\u0010\u0006\u001a\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\n2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J*\u0010\u0006\u001a\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J*\u0010\u0006\u001a\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\f2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J*\u0010\u0006\u001a\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\r2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J*\u0010\u0006\u001a\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J*\u0010\u0006\u001a\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J*\u0010\u0006\u001a\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00102\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J*\u0010\u0006\u001a\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00112\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J.\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00122\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J*\u0010\u0006\u001a\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00132\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J.\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00142\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J.\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00152\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J.\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00162\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J*\u0010\u0006\u001a\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00172\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J.\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00182\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J.\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00192\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J*\u0010\u0006\u001a\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u001a2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J.\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J.\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001c2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J*\u0010\u0006\u001a\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u001d2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J*\u0010\u0006\u001a\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u001e2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J*\u0010\u0006\u001a\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u001f2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J*\u0010\u0006\u001a\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030 2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J*\u0010\u0006\u001a\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030!2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016J\b\u0010\"\u001a\u00020#H&\u00a8\u0006$"}, d2 = {"Lorg/platypus/cache/CacheVisitorSetter;", "Lorg/platypus/model/field/api/FieldVisitor;", "Lkotlin/Pair;", "Lorg/platypus/cache/ModelID;", "", "", "visit", "field", "Lorg/platypus/model/field/impl/ArchivedModelField;", "p", "Lorg/platypus/model/field/impl/BinaryField;", "Lorg/platypus/model/field/impl/BooleanField;", "Lorg/platypus/model/field/impl/CreateDateModelField;", "Lorg/platypus/model/field/impl/CreateUID;", "Lorg/platypus/model/field/impl/DateField;", "Lorg/platypus/model/field/impl/DateTimeField;", "Lorg/platypus/model/field/impl/DecimalField;", "Lorg/platypus/model/field/impl/ExternalRefModelField;", "Lorg/platypus/model/field/impl/FieldAlias;", "Lorg/platypus/model/field/impl/IntField;", "Lorg/platypus/model/field/impl/Many2ManyField;", "Lorg/platypus/model/field/impl/Many2OneField;", "Lorg/platypus/model/field/impl/Many2OneFieldLink;", "Lorg/platypus/model/field/impl/NameModelField;", "Lorg/platypus/model/field/impl/One2ManyField;", "Lorg/platypus/model/field/impl/One2OneField;", "Lorg/platypus/model/field/impl/PKModelField;", "Lorg/platypus/model/field/impl/RevOne2OneField;", "Lorg/platypus/model/field/impl/SelectionField;", "Lorg/platypus/model/field/impl/StringField;", "Lorg/platypus/model/field/impl/TextField;", "Lorg/platypus/model/field/impl/TimeField;", "Lorg/platypus/model/field/impl/WriteDateModelField;", "Lorg/platypus/model/field/impl/WriteUID;", "warmCache", "Lorg/platypus/cache/PlatypusCache;", "korm"})
abstract interface CacheVisitorSetter extends org.platypus.model.field.api.FieldVisitor<kotlin.Pair<? extends org.platypus.cache.ModelID, ? extends java.lang.Object>, kotlin.Unit> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.cache.PlatypusCache warmCache();
    
    @java.lang.Override()
    public abstract void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.StringField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p);
    
    @java.lang.Override()
    public abstract void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DateField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p);
    
    @java.lang.Override()
    public abstract void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DateTimeField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p);
    
    @java.lang.Override()
    public abstract void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.TimeField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p);
    
    @java.lang.Override()
    public abstract void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.BooleanField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p);
    
    @java.lang.Override()
    public abstract void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.TextField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p);
    
    @java.lang.Override()
    public abstract void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DecimalField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p);
    
    @java.lang.Override()
    public abstract void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.IntField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p);
    
    @java.lang.Override()
    public abstract void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.BinaryField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p);
    
    @java.lang.Override()
    public abstract void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2OneFieldLink<?, ?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p);
    
    @java.lang.Override()
    public abstract void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2ManyField<?, ?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p);
    
    @java.lang.Override()
    public abstract void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2OneField<?, ?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p);
    
    @java.lang.Override()
    public abstract void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2OneField<?, ?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p);
    
    @java.lang.Override()
    public abstract void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RevOne2OneField<?, ?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p);
    
    @java.lang.Override()
    public abstract void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2ManyField<?, ?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p);
    
    @java.lang.Override()
    public abstract void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.PKModelField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p);
    
    @java.lang.Override()
    public abstract void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.SelectionField<?, ?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p);
    
    @java.lang.Override()
    public abstract void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.NameModelField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p);
    
    @java.lang.Override()
    public abstract void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ExternalRefModelField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p);
    
    @java.lang.Override()
    public abstract void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.WriteDateModelField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p);
    
    @java.lang.Override()
    public abstract void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.CreateDateModelField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p);
    
    @java.lang.Override()
    public abstract void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ArchivedModelField<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p);
    
    @java.lang.Override()
    public abstract void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.FieldAlias<?, ?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p);
    
    @java.lang.Override()
    public abstract void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.CreateUID<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p);
    
    @java.lang.Override()
    public abstract void visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.WriteUID<?> field, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
        
        @java.lang.Override()
        public static void visit(org.platypus.cache.CacheVisitorSetter $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.StringField<?> field, @org.jetbrains.annotations.NotNull()
        kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p) {
        }
        
        @java.lang.Override()
        public static void visit(org.platypus.cache.CacheVisitorSetter $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.DateField<?> field, @org.jetbrains.annotations.NotNull()
        kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p) {
        }
        
        @java.lang.Override()
        public static void visit(org.platypus.cache.CacheVisitorSetter $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.DateTimeField<?> field, @org.jetbrains.annotations.NotNull()
        kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p) {
        }
        
        @java.lang.Override()
        public static void visit(org.platypus.cache.CacheVisitorSetter $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.TimeField<?> field, @org.jetbrains.annotations.NotNull()
        kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p) {
        }
        
        @java.lang.Override()
        public static void visit(org.platypus.cache.CacheVisitorSetter $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.BooleanField<?> field, @org.jetbrains.annotations.NotNull()
        kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p) {
        }
        
        @java.lang.Override()
        public static void visit(org.platypus.cache.CacheVisitorSetter $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.TextField<?> field, @org.jetbrains.annotations.NotNull()
        kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p) {
        }
        
        @java.lang.Override()
        public static void visit(org.platypus.cache.CacheVisitorSetter $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.DecimalField<?> field, @org.jetbrains.annotations.NotNull()
        kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p) {
        }
        
        @java.lang.Override()
        public static void visit(org.platypus.cache.CacheVisitorSetter $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.IntField<?> field, @org.jetbrains.annotations.NotNull()
        kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p) {
        }
        
        @java.lang.Override()
        public static void visit(org.platypus.cache.CacheVisitorSetter $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.BinaryField<?> field, @org.jetbrains.annotations.NotNull()
        kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p) {
        }
        
        @java.lang.Override()
        public static void visit(org.platypus.cache.CacheVisitorSetter $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.Many2OneFieldLink<?, ?> field, @org.jetbrains.annotations.NotNull()
        kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p) {
        }
        
        @java.lang.Override()
        public static void visit(org.platypus.cache.CacheVisitorSetter $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.One2ManyField<?, ?> field, @org.jetbrains.annotations.NotNull()
        kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p) {
        }
        
        @java.lang.Override()
        public static void visit(org.platypus.cache.CacheVisitorSetter $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.Many2OneField<?, ?> field, @org.jetbrains.annotations.NotNull()
        kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p) {
        }
        
        @java.lang.Override()
        public static void visit(org.platypus.cache.CacheVisitorSetter $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.One2OneField<?, ?> field, @org.jetbrains.annotations.NotNull()
        kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p) {
        }
        
        @java.lang.Override()
        public static void visit(org.platypus.cache.CacheVisitorSetter $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.RevOne2OneField<?, ?> field, @org.jetbrains.annotations.NotNull()
        kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p) {
        }
        
        @java.lang.Override()
        public static void visit(org.platypus.cache.CacheVisitorSetter $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.Many2ManyField<?, ?> field, @org.jetbrains.annotations.NotNull()
        kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p) {
        }
        
        @java.lang.Override()
        public static void visit(org.platypus.cache.CacheVisitorSetter $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.PKModelField<?> field, @org.jetbrains.annotations.NotNull()
        kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p) {
        }
        
        @java.lang.Override()
        public static void visit(org.platypus.cache.CacheVisitorSetter $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.SelectionField<?, ?> field, @org.jetbrains.annotations.NotNull()
        kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p) {
        }
        
        @java.lang.Override()
        public static void visit(org.platypus.cache.CacheVisitorSetter $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.NameModelField<?> field, @org.jetbrains.annotations.NotNull()
        kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p) {
        }
        
        @java.lang.Override()
        public static void visit(org.platypus.cache.CacheVisitorSetter $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.ExternalRefModelField<?> field, @org.jetbrains.annotations.NotNull()
        kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p) {
        }
        
        @java.lang.Override()
        public static void visit(org.platypus.cache.CacheVisitorSetter $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.WriteDateModelField<?> field, @org.jetbrains.annotations.NotNull()
        kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p) {
        }
        
        @java.lang.Override()
        public static void visit(org.platypus.cache.CacheVisitorSetter $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.CreateDateModelField<?> field, @org.jetbrains.annotations.NotNull()
        kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p) {
        }
        
        @java.lang.Override()
        public static void visit(org.platypus.cache.CacheVisitorSetter $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.ArchivedModelField<?> field, @org.jetbrains.annotations.NotNull()
        kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p) {
        }
        
        @java.lang.Override()
        public static void visit(org.platypus.cache.CacheVisitorSetter $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.FieldAlias<?, ?> field, @org.jetbrains.annotations.NotNull()
        kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p) {
        }
        
        @java.lang.Override()
        public static void visit(org.platypus.cache.CacheVisitorSetter $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.CreateUID<?> field, @org.jetbrains.annotations.NotNull()
        kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p) {
        }
        
        @java.lang.Override()
        public static void visit(org.platypus.cache.CacheVisitorSetter $this, @org.jetbrains.annotations.NotNull()
        org.platypus.model.field.impl.WriteUID<?> field, @org.jetbrains.annotations.NotNull()
        kotlin.Pair<org.platypus.cache.ModelID, ? extends java.lang.Object> p) {
        }
    }
}