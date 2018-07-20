package org.platypus.orm.database.ddl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004B-\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH&J\u0018\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000fH&J\u001c\u0010\u0010\u001a\u00020\u00032\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J \u0010\u0010\u001a\u00020\u00032\u000e\u0010\u0011\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u001c\u0010\u0010\u001a\u00020\u00032\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u001c\u0010\u0010\u001a\u00020\u00032\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u001d\u0010\u0010\u001a\u00020\u00052\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00182\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0001J\u001d\u0010\u0010\u001a\u00020\u00052\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0001J\u001d\u0010\u0010\u001a\u00020\u00052\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u001a2\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0001J\u001d\u0010\u0010\u001a\u00020\u00052\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u001b2\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0001J\u001d\u0010\u0010\u001a\u00020\u00052\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u001c2\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0001J\u001d\u0010\u0010\u001a\u00020\u00052\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u001d2\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0001J\u001d\u0010\u0010\u001a\u00020\u00052\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u001e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0001J\u001d\u0010\u0010\u001a\u00020\u00052\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u001f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0001J\u001d\u0010\u0010\u001a\u00020\u00052\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030 2\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0001J!\u0010\u0010\u001a\u00020\u00052\u000e\u0010\u0017\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030!2\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0001J\u001d\u0010\u0010\u001a\u00020\u00052\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\"2\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0001J!\u0010\u0010\u001a\u00020\u00052\u000e\u0010\u0017\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030#2\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0001J!\u0010\u0010\u001a\u00020\u00052\u000e\u0010\u0017\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030$2\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0001J!\u0010\u0010\u001a\u00020\u00052\u000e\u0010\u0017\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030%2\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0001J\u001d\u0010\u0010\u001a\u00020\u00052\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030&2\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0001J!\u0010\u0010\u001a\u00020\u00052\u000e\u0010\u0017\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\'2\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0001J!\u0010\u0010\u001a\u00020\u00052\u000e\u0010\u0017\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030(2\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0001J\u001d\u0010\u0010\u001a\u00020\u00052\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030)2\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0001J!\u0010\u0010\u001a\u00020\u00052\u000e\u0010\u0017\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030*2\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0001J!\u0010\u0010\u001a\u00020\u00052\u000e\u0010\u0017\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030+2\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0001J\u001d\u0010\u0010\u001a\u00020\u00052\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030,2\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0001J\u001d\u0010\u0010\u001a\u00020\u00052\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030-2\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0001J\u001d\u0010\u0010\u001a\u00020\u00052\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030.2\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0001J\u001d\u0010\u0010\u001a\u00020\u00052\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030/2\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0001J\u001d\u0010\u0010\u001a\u00020\u00052\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u0003002\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0001J\u0014\u00101\u001a\u00020\u0003*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0014H\u0002J\u0010\u00101\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0016H\u0002J\u0014\u00102\u001a\u00020\u0003*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0014H\u0002J\u0010\u00102\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0016H\u0002J\f\u00103\u001a\u00020\f*\u00020\fH&R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lorg/platypus/orm/database/ddl/DefaultDDLModelCreator;", "Lorg/platypus/model/ModelVisitor;", "Lorg/platypus/orm/database/vendors/DDL_MODE;", "Lorg/platypus/orm/database/ddl/TableDDL;", "Lorg/platypus/model/field/api/FieldVisitor;", "Lorg/platypus/orm/database/ddl/FieldDDL;", "pretty", "", "acceptIfNotExist", "fieldVisitor", "(ZZLorg/platypus/model/field/api/FieldVisitor;)V", "identity", "", "mod", "Lorg/platypus/model/IModel;", "Lorg/platypus/model/field/api/IModelField;", "visit", "m", "Lorg/platypus/model/Alias;", "p", "Lorg/platypus/model/LinkModel;", "Lorg/platypus/model/MixinModel;", "Lorg/platypus/model/Model;", "field", "Lorg/platypus/model/field/impl/ArchivedModelField;", "Lorg/platypus/model/field/impl/BinaryField;", "Lorg/platypus/model/field/impl/BooleanField;", "Lorg/platypus/model/field/impl/CreateDateModelField;", "Lorg/platypus/model/field/impl/CreateUID;", "Lorg/platypus/model/field/impl/DateField;", "Lorg/platypus/model/field/impl/DateTimeField;", "Lorg/platypus/model/field/impl/DecimalField;", "Lorg/platypus/model/field/impl/ExternalRefModelField;", "Lorg/platypus/model/field/impl/FieldAlias;", "Lorg/platypus/model/field/impl/IntField;", "Lorg/platypus/model/field/impl/Many2ManyField;", "Lorg/platypus/model/field/impl/Many2OneField;", "Lorg/platypus/model/field/impl/Many2OneFieldLink;", "Lorg/platypus/model/field/impl/NameModelField;", "Lorg/platypus/model/field/impl/One2ManyField;", "Lorg/platypus/model/field/impl/One2OneField;", "Lorg/platypus/model/field/impl/PKModelField;", "Lorg/platypus/model/field/impl/RevOne2OneField;", "Lorg/platypus/model/field/impl/SelectionField;", "Lorg/platypus/model/field/impl/StringField;", "Lorg/platypus/model/field/impl/TextField;", "Lorg/platypus/model/field/impl/TimeField;", "Lorg/platypus/model/field/impl/WriteDateModelField;", "Lorg/platypus/model/field/impl/WriteUID;", "createStatement", "dropStatement", "inProperCase", "korm"})
public abstract class DefaultDDLModelCreator implements org.platypus.model.ModelVisitor<org.platypus.orm.database.vendors.DDL_MODE, org.platypus.orm.database.ddl.TableDDL>, org.platypus.model.field.api.FieldVisitor<org.platypus.orm.database.vendors.DDL_MODE, org.platypus.orm.database.ddl.FieldDDL> {
    private final boolean pretty = false;
    private final boolean acceptIfNotExist = false;
    private final org.platypus.model.field.api.FieldVisitor<org.platypus.orm.database.vendors.DDL_MODE, org.platypus.orm.database.ddl.FieldDDL> fieldVisitor = null;
    
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
    public org.platypus.orm.database.ddl.TableDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.Model<?> m, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.ddl.TableDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.LinkModel<?, ?> m, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    private final org.platypus.orm.database.ddl.TableDDL createStatement(@org.jetbrains.annotations.NotNull()
    org.platypus.model.LinkModel<?, ?> $receiver) {
        return null;
    }
    
    private final org.platypus.orm.database.ddl.TableDDL dropStatement(@org.jetbrains.annotations.NotNull()
    org.platypus.model.LinkModel<?, ?> $receiver) {
        return null;
    }
    
    private final org.platypus.orm.database.ddl.TableDDL createStatement(@org.jetbrains.annotations.NotNull()
    org.platypus.model.Model<?> $receiver) {
        return null;
    }
    
    private final org.platypus.orm.database.ddl.TableDDL dropStatement(@org.jetbrains.annotations.NotNull()
    org.platypus.model.Model<?> $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.ddl.TableDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.MixinModel<?> m, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.ddl.TableDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.Alias<?> m, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
        return null;
    }
    
    public DefaultDDLModelCreator(boolean pretty, boolean acceptIfNotExist, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.FieldVisitor<? super org.platypus.orm.database.vendors.DDL_MODE, org.platypus.orm.database.ddl.FieldDDL> fieldVisitor) {
        super();
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
    org.platypus.model.field.impl.BinaryField<?> field, @org.jetbrains.annotations.NotNull()
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
    org.platypus.model.field.impl.CreateDateModelField<?> field, @org.jetbrains.annotations.NotNull()
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
    org.platypus.model.field.impl.DecimalField<?> field, @org.jetbrains.annotations.NotNull()
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
    org.platypus.model.field.impl.FieldAlias<?, ?> field, @org.jetbrains.annotations.NotNull()
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
    org.platypus.model.field.impl.Many2ManyField<?, ?> field, @org.jetbrains.annotations.NotNull()
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
    org.platypus.model.field.impl.Many2OneFieldLink<?, ?> field, @org.jetbrains.annotations.NotNull()
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
    org.platypus.model.field.impl.One2ManyField<?, ?> field, @org.jetbrains.annotations.NotNull()
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
    @java.lang.Override()
    public org.platypus.orm.database.ddl.FieldDDL visit(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.PKModelField<?> field, @org.jetbrains.annotations.NotNull()
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
    org.platypus.model.field.impl.SelectionField<?, ?> field, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.database.vendors.DDL_MODE p) {
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
    org.platypus.model.field.impl.TextField<?> field, @org.jetbrains.annotations.NotNull()
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
    org.platypus.model.field.impl.WriteDateModelField<?> field, @org.jetbrains.annotations.NotNull()
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
}