package org.platypus.orm.sql.dml.statements;

import java.lang.System;

/**
 * * @author max
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000fJ\'\u0010\u0016\u001a\u00020\u00172\u000e\u0010\u0015\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010H\u0000\u00a2\u0006\u0002\b\u0019J2\u0010\u001a\u001a\u00020\u0017\"\b\b\u0001\u0010\u001b*\u00020\u00102\u0010\u0010\u0015\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u0002H\u001b0\u000f2\u0006\u0010\u0018\u001a\u0002H\u001bH\u0096\u0002\u00a2\u0006\u0002\u0010\u001cJ2\u0010\u001d\u001a\u00020\u0017\"\b\b\u0001\u0010\u001b*\u00020\u00102\u0010\u0010\u0015\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u0002H\u001b0\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u001eH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR*\u0010\r\u001a\u0018\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lorg/platypus/orm/sql/dml/statements/UpdateBuilder;", "T", "Lorg/platypus/orm/sql/dml/Statement;", "env", "Lorg/platypus/PlatypusEnvironment;", "type", "Lorg/platypus/orm/sql/dml/StatementType;", "targets", "", "Lorg/platypus/model/IModel;", "(Lorg/platypus/PlatypusEnvironment;Lorg/platypus/orm/sql/dml/StatementType;Ljava/util/List;)V", "getEnv", "()Lorg/platypus/PlatypusEnvironment;", "values", "", "Lorg/platypus/model/field/api/IModelField;", "", "getValues", "()Ljava/util/Map;", "containsKey", "", "column", "forceSet", "", "value", "forceSet$korm", "set", "S", "(Lorg/platypus/model/field/api/IModelField;Ljava/lang/Object;)V", "update", "Lorg/platypus/orm/sql/expression/Expression;", "korm"})
public abstract class UpdateBuilder<T extends java.lang.Object> extends org.platypus.orm.sql.dml.Statement<T> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<org.platypus.model.field.api.IModelField<?, ?>, java.lang.Object> values = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.PlatypusEnvironment env = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.Map<org.platypus.model.field.api.IModelField<?, ?>, java.lang.Object> getValues() {
        return null;
    }
    
    public <S extends java.lang.Object>void set(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<?, S> column, @org.jetbrains.annotations.NotNull()
    S value) {
    }
    
    public final boolean containsKey(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<?, ?> column) {
        return false;
    }
    
    public final void forceSet$korm(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<?, ?> column, @org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
    }
    
    public <S extends java.lang.Object>void update(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<?, S> column, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<S> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final org.platypus.PlatypusEnvironment getEnv() {
        return null;
    }
    
    public UpdateBuilder(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.StatementType type, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.platypus.model.IModel<?>> targets) {
        super(null, null, null);
    }
}