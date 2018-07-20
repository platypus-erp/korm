package org.platypus.orm.sql.dml.statements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bJ\"\u0010\u0011\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00130\u00120\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0011\u0010\u0018\u001a\u00020\u0002*\u00020\u0019H\u0016\u00a2\u0006\u0002\u0010\u001aR\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\fR\u0015\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lorg/platypus/orm/sql/dml/statements/DeleteStatement;", "Lorg/platypus/orm/sql/dml/Statement;", "", "env", "Lorg/platypus/PlatypusEnvironment;", "model", "Lorg/platypus/model/IModel;", "where", "Lorg/platypus/orm/sql/expression/Expression;", "", "isIgnore", "(Lorg/platypus/PlatypusEnvironment;Lorg/platypus/model/IModel;Lorg/platypus/orm/sql/expression/Expression;Z)V", "()Z", "getModel", "()Lorg/platypus/model/IModel;", "getWhere", "()Lorg/platypus/orm/sql/expression/Expression;", "arguments", "", "Lkotlin/Pair;", "Lorg/platypus/model/field/api/type/SqlFieldType;", "", "prepareSQL", "", "executeInternal", "Ljava/sql/PreparedStatement;", "(Ljava/sql/PreparedStatement;)Ljava/lang/Integer;", "Companion", "korm"})
public final class DeleteStatement extends org.platypus.orm.sql.dml.Statement<java.lang.Integer> {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.IModel<?> model = null;
    @org.jetbrains.annotations.Nullable()
    private final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> where = null;
    private final boolean isIgnore = false;
    public static final org.platypus.orm.sql.dml.statements.DeleteStatement.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Integer executeInternal(@org.jetbrains.annotations.NotNull()
    java.sql.PreparedStatement $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String prepareSQL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Iterable<java.lang.Iterable<kotlin.Pair<org.platypus.model.field.api.type.SqlFieldType, java.lang.Object>>> arguments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.IModel<?> getModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> getWhere() {
        return null;
    }
    
    public final boolean isIgnore() {
        return false;
    }
    
    public DeleteStatement(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    org.platypus.model.IModel<?> model, @org.jetbrains.annotations.Nullable()
    org.platypus.orm.sql.expression.Expression<java.lang.Boolean> where, boolean isIgnore) {
        super(null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bJ2\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\f\u00a8\u0006\u000e"}, d2 = {"Lorg/platypus/orm/sql/dml/statements/DeleteStatement$Companion;", "", "()V", "all", "", "env", "Lorg/platypus/PlatypusEnvironment;", "model", "Lorg/platypus/model/Model;", "where", "op", "Lorg/platypus/orm/sql/expression/Expression;", "", "isIgnore", "korm"})
    public static final class Companion {
        
        public final int where(@org.jetbrains.annotations.NotNull()
        org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
        org.platypus.model.Model<?> model, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.Expression<java.lang.Boolean> op, boolean isIgnore) {
            return 0;
        }
        
        public final int all(@org.jetbrains.annotations.NotNull()
        org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
        org.platypus.model.Model<?> model) {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}