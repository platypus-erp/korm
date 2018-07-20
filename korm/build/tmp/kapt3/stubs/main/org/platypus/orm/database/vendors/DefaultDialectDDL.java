package org.platypus.orm.database.vendors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\u0002\u0010\rJ\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u00c6\u0003JK\u0010\u0017\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\fH\u00d6\u0001R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001f"}, d2 = {"Lorg/platypus/orm/database/vendors/DefaultDialectDDL;", "Lorg/platypus/orm/database/vendors/DialectDDL;", "dataTypeProvider", "Lorg/platypus/model/field/api/FieldVisitor;", "Lorg/platypus/orm/database/vendors/DDL_MODE;", "Lorg/platypus/orm/database/ddl/FieldDDL;", "modelTypeProvider", "Lorg/platypus/model/ModelVisitor;", "Lorg/platypus/orm/database/ddl/TableDDL;", "constraintVisitor", "Lorg/platypus/orm/sql/ConstraintsVisitor;", "", "", "(Lorg/platypus/model/field/api/FieldVisitor;Lorg/platypus/model/ModelVisitor;Lorg/platypus/orm/sql/ConstraintsVisitor;)V", "getConstraintVisitor", "()Lorg/platypus/orm/sql/ConstraintsVisitor;", "getDataTypeProvider", "()Lorg/platypus/model/field/api/FieldVisitor;", "getModelTypeProvider", "()Lorg/platypus/model/ModelVisitor;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "korm"})
public final class DefaultDialectDDL implements org.platypus.orm.database.vendors.DialectDDL {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.field.api.FieldVisitor<org.platypus.orm.database.vendors.DDL_MODE, org.platypus.orm.database.ddl.FieldDDL> dataTypeProvider = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.ModelVisitor<org.platypus.orm.database.vendors.DDL_MODE, org.platypus.orm.database.ddl.TableDDL> modelTypeProvider = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.sql.ConstraintsVisitor<kotlin.Unit, java.lang.String> constraintVisitor = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.FieldVisitor<org.platypus.orm.database.vendors.DDL_MODE, org.platypus.orm.database.ddl.FieldDDL> getDataTypeProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.ModelVisitor<org.platypus.orm.database.vendors.DDL_MODE, org.platypus.orm.database.ddl.TableDDL> getModelTypeProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.ConstraintsVisitor<kotlin.Unit, java.lang.String> getConstraintVisitor() {
        return null;
    }
    
    public DefaultDialectDDL(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.FieldVisitor<? super org.platypus.orm.database.vendors.DDL_MODE, org.platypus.orm.database.ddl.FieldDDL> dataTypeProvider, @org.jetbrains.annotations.NotNull()
    org.platypus.model.ModelVisitor<? super org.platypus.orm.database.vendors.DDL_MODE, org.platypus.orm.database.ddl.TableDDL> modelTypeProvider, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.ConstraintsVisitor<kotlin.Unit, java.lang.String> constraintVisitor) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.api.FieldVisitor<org.platypus.orm.database.vendors.DDL_MODE, org.platypus.orm.database.ddl.FieldDDL> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.ModelVisitor<org.platypus.orm.database.vendors.DDL_MODE, org.platypus.orm.database.ddl.TableDDL> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.ConstraintsVisitor<kotlin.Unit, java.lang.String> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.database.vendors.DefaultDialectDDL copy(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.FieldVisitor<? super org.platypus.orm.database.vendors.DDL_MODE, org.platypus.orm.database.ddl.FieldDDL> dataTypeProvider, @org.jetbrains.annotations.NotNull()
    org.platypus.model.ModelVisitor<? super org.platypus.orm.database.vendors.DDL_MODE, org.platypus.orm.database.ddl.TableDDL> modelTypeProvider, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.ConstraintsVisitor<kotlin.Unit, java.lang.String> constraintVisitor) {
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