package org.platypus.orm.sql.query;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00022\u00020\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lorg/platypus/orm/sql/query/JoinStatementPart;", "M1", "Lorg/platypus/model/Model;", "M2", "", "alias", "Lorg/platypus/model/Alias;", "getAlias", "()Lorg/platypus/model/Alias;", "field", "Lorg/platypus/model/field/impl/ReferenceField;", "getField", "()Lorg/platypus/model/field/impl/ReferenceField;", "queryJoin", "Lorg/platypus/orm/sql/query/Join;", "from", "Lorg/platypus/orm/sql/dml/ColumnSet;", "korm"})
public abstract interface JoinStatementPart<M1 extends org.platypus.model.Model<M1>, M2 extends org.platypus.model.Model<M2>> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.model.Alias<M2> getAlias();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.model.field.impl.ReferenceField<M1, M2> getField();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.query.Join queryJoin(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.ColumnSet from);
}