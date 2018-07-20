package org.platypus.orm.database.ddl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00c0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH&J\u0018\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fH&J\u001c\u0010\r\u001a\u00020\u00032\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u001c\u0010\r\u001a\u00020\u00032\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u001c\u0010\r\u001a\u00020\u00032\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u001c\u0010\r\u001a\u00020\u00032\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u001c\u0010\r\u001a\u00020\u00032\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u001c\u0010\r\u001a\u00020\u00032\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u001c\u0010\r\u001a\u00020\u00032\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u001c\u0010\r\u001a\u00020\u00032\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u001c\u0010\r\u001a\u00020\u00032\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00182\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J \u0010\r\u001a\u00020\u00032\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00192\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u001c\u0010\r\u001a\u00020\u00032\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u001a2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J \u0010\r\u001a\u00020\u00032\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001b2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J \u0010\r\u001a\u00020\u00032\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001c2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J \u0010\r\u001a\u00020\u00032\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001d2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u001c\u0010\r\u001a\u00020\u00032\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u001e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J \u0010\r\u001a\u00020\u00032\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J \u0010\r\u001a\u00020\u00032\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030 2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u001c\u0010\r\u001a\u00020\u00032\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030!2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J \u0010\r\u001a\u00020\u00032\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\"2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J \u0010\r\u001a\u00020\u00032\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030#2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u001c\u0010\r\u001a\u00020\u00032\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030$2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u001c\u0010\r\u001a\u00020\u00032\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030%2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u001c\u0010\r\u001a\u00020\u00032\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030&2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u001c\u0010\r\u001a\u00020\u00032\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\'2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u001c\u0010\r\u001a\u00020\u00032\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030(2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u001e\u0010)\u001a\u00020\u00032\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030*2\u0006\u0010\u0010\u001a\u00020\u0002J(\u0010+\u001a\n -*\u0004\u0018\u00010,0,*\u00060,j\u0002`.2\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fH\u0002J \u0010/\u001a\u00060,j\u0002`.*\u00060,j\u0002`.2\n\u00100\u001a\u0006\u0012\u0002\b\u000301H\u0002J=\u00102\u001a\u00020\u0003*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f2\u0006\u0010\u0010\u001a\u00020\u00022\u001f\u00103\u001a\u001b\u0012\b\u0012\u00060,j\u0002`.\u0012\b\u0012\u00060,j\u0002`.04\u00a2\u0006\u0002\b5H\u0002J\f\u00106\u001a\u00020\t*\u00020\tH&J(\u00107\u001a\n -*\u0004\u0018\u00010,0,*\u00060,j\u0002`.2\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00068"}, d2 = {"Lorg/platypus/orm/database/ddl/DefaultDDLFieldCreator;", "Lorg/platypus/model/field/api/FieldVisitor;", "Lorg/platypus/orm/database/vendors/DDL_MODE;", "Lorg/platypus/orm/database/ddl/FieldDDL;", "inlineConstraint", "", "Lorg/platypus/orm/database/ddl/InlineConstraintType;", "(Ljava/util/Set;)V", "identity", "", "mod", "Lorg/platypus/model/IModel;", "Lorg/platypus/model/field/api/IModelField;", "visit", "field", "Lorg/platypus/model/field/impl/ArchivedModelField;", "p", "Lorg/platypus/model/field/impl/BinaryField;", "Lorg/platypus/model/field/impl/BooleanField;", "Lorg/platypus/model/field/impl/CreateDateModelField;", "Lorg/platypus/model/field/impl/CreateUID;", "Lorg/platypus/model/field/impl/DateField;", "Lorg/platypus/model/field/impl/DateTimeField;", "Lorg/platypus/model/field/impl/DecimalField;", "Lorg/platypus/model/field/impl/ExternalRefModelField;", "Lorg/platypus/model/field/impl/FieldAlias;", "Lorg/platypus/model/field/impl/IntField;", "Lorg/platypus/model/field/impl/Many2ManyField;", "Lorg/platypus/model/field/impl/Many2OneField;", "Lorg/platypus/model/field/impl/Many2OneFieldLink;", "Lorg/platypus/model/field/impl/NameModelField;", "Lorg/platypus/model/field/impl/One2ManyField;", "Lorg/platypus/model/field/impl/One2OneField;", "Lorg/platypus/model/field/impl/PKModelField;", "Lorg/platypus/model/field/impl/RevOne2OneField;", "Lorg/platypus/model/field/impl/SelectionField;", "Lorg/platypus/model/field/impl/StringField;", "Lorg/platypus/model/field/impl/TextField;", "Lorg/platypus/model/field/impl/TimeField;", "Lorg/platypus/model/field/impl/WriteDateModelField;", "Lorg/platypus/model/field/impl/WriteUID;", "visitReference", "Lorg/platypus/model/field/impl/ReferenceField;", "NotNull", "Ljava/lang/StringBuilder;", "kotlin.jvm.PlatformType", "Lkotlin/text/StringBuilder;", "check", "ck", "Lorg/platypus/orm/OrmConstraint;", "createFieldDDL", "fieldType", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "inProperCase", "unique", "korm"})
public abstract class DefaultDDLFieldCreator implements org.platypus.model.field.api.FieldVisitor<org.platypus.orm.database.vendors.DDL_MODE, org.platypus.orm.database.ddl.FieldDDL> {
    private final java.util.Set<org.platypus.orm.database.ddl.InlineConstraintType> inlineConstraint = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String identity(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<?, ?> mod);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String identity(@org.jetbrains.annotations.NotNull()
    org.platypus.model.IModel<?> mod);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String inProperCase(@org.jetbrains.annotations.NotNull()
    java.lang.String $receiver);
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.ddl.FieldDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.PKModelField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    private final java.lang.StringBuilder NotNull(@org.jetbrains.annotations.NotNull()
    java.lang.StringBuilder $receiver, org.platypus.model.field.api.IModelField<?, ?> field) {
        return null;
    }
    
    private final java.lang.StringBuilder check(@org.jetbrains.annotations.NotNull()
    java.lang.StringBuilder $receiver, org.platypus.orm.OrmConstraint<?> ck) {
        return null;
    }
    
    private final java.lang.StringBuilder unique(@org.jetbrains.annotations.NotNull()
    java.lang.StringBuilder $receiver, org.platypus.model.field.api.IModelField<?, ?> field) {
        return null;
    }
    
    private final org.platypus.orm.database.ddl.FieldDDL createFieldDDL(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<?, ?> $receiver, org.platypus.orm.database.vendors.DDL_MODE p, kotlin.jvm.functions.Function1<? super java.lang.StringBuilder, java.lang.StringBuilder> fieldType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.ddl.FieldDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.StringField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.ddl.FieldDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DateField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.ddl.FieldDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DateTimeField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.ddl.FieldDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.TimeField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.ddl.FieldDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.BooleanField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.ddl.FieldDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.TextField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.ddl.FieldDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.DecimalField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.ddl.FieldDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.IntField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.ddl.FieldDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.BinaryField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.ddl.FieldDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2ManyField<?, ?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.ddl.FieldDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2OneField<?, ?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.ddl.FieldDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.One2OneField<?, ?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.database.ddl.FieldDDL visitReference(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ReferenceField<?, ?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.ddl.FieldDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RevOne2OneField<?, ?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.ddl.FieldDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2ManyField<?, ?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.ddl.FieldDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2OneFieldLink<?, ?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.ddl.FieldDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.SelectionField<?, ?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.ddl.FieldDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.NameModelField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.ddl.FieldDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ExternalRefModelField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.ddl.FieldDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.WriteDateModelField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.ddl.FieldDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.CreateDateModelField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.ddl.FieldDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.ArchivedModelField<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.ddl.FieldDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.FieldAlias<?, ?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.ddl.FieldDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.CreateUID<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.ddl.FieldDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.WriteUID<?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    public DefaultDDLFieldCreator(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends org.platypus.orm.database.ddl.InlineConstraintType> inlineConstraint) {
        super();
    }
    
    public DefaultDDLFieldCreator() {
        super();
    }
}