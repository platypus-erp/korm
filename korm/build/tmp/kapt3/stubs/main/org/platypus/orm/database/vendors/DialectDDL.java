package org.platypus.orm.database.vendors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lorg/platypus/orm/database/vendors/DialectDDL;", "", "constraintVisitor", "Lorg/platypus/orm/sql/ConstraintsVisitor;", "", "", "getConstraintVisitor", "()Lorg/platypus/orm/sql/ConstraintsVisitor;", "dataTypeProvider", "Lorg/platypus/model/field/api/FieldVisitor;", "Lorg/platypus/orm/database/vendors/DDL_MODE;", "Lorg/platypus/orm/database/ddl/FieldDDL;", "getDataTypeProvider", "()Lorg/platypus/model/field/api/FieldVisitor;", "modelTypeProvider", "Lorg/platypus/model/ModelVisitor;", "Lorg/platypus/orm/database/ddl/TableDDL;", "getModelTypeProvider", "()Lorg/platypus/model/ModelVisitor;", "korm"})
public abstract interface DialectDDL {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.model.field.api.FieldVisitor<org.platypus.orm.database.vendors.DDL_MODE, org.platypus.orm.database.ddl.FieldDDL> getDataTypeProvider();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.model.ModelVisitor<org.platypus.orm.database.vendors.DDL_MODE, org.platypus.orm.database.ddl.TableDDL> getModelTypeProvider();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.ConstraintsVisitor<kotlin.Unit, java.lang.String> getConstraintVisitor();
}