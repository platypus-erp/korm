package org.platypus.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003J(\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&J(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&J(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&\u00a8\u0006\f"}, d2 = {"Lorg/platypus/model/ModelMetaData;", "M", "Lorg/platypus/model/Model;", "", "deleteRule", "Lorg/platypus/orm/sql/expression/Expression;", "", "user", "Lorg/platypus/security/PlatypusUser;", "expr", "readRule", "updateRule", "korm"})
public abstract interface ModelMetaData<M extends org.platypus.model.Model<M>> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract org.platypus.orm.sql.expression.Expression<java.lang.Boolean> deleteRule(@org.jetbrains.annotations.NotNull()
    org.platypus.security.PlatypusUser user, @org.jetbrains.annotations.Nullable()
    org.platypus.orm.sql.expression.Expression<java.lang.Boolean> expr);
    
    @org.jetbrains.annotations.Nullable()
    public abstract org.platypus.orm.sql.expression.Expression<java.lang.Boolean> updateRule(@org.jetbrains.annotations.NotNull()
    org.platypus.security.PlatypusUser user, @org.jetbrains.annotations.Nullable()
    org.platypus.orm.sql.expression.Expression<java.lang.Boolean> expr);
    
    @org.jetbrains.annotations.Nullable()
    public abstract org.platypus.orm.sql.expression.Expression<java.lang.Boolean> readRule(@org.jetbrains.annotations.NotNull()
    org.platypus.security.PlatypusUser user, @org.jetbrains.annotations.Nullable()
    org.platypus.orm.sql.expression.Expression<java.lang.Boolean> expr);
}