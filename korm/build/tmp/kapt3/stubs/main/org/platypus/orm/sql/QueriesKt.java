package org.platypus.orm.sql;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aR\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004*\u0002H\u00032\u0006\u0010\u0005\u001a\u00020\u00062#\u0010\u0007\u001a\u001f\u0012\u0004\u0012\u0002H\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\u0010\u000b\u001ac\u0010\f\u001a\u00020\r\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004*\u0002H\u00032\u0006\u0010\u0005\u001a\u00020\u00062&\u0010\u000e\u001a\u0014\u0012\u0010\b\u0001\u0012\f\u0012\u0004\u0012\u0002H\u0003\u0012\u0002\b\u00030\u00100\u000f\"\f\u0012\u0004\u0012\u0002H\u0003\u0012\u0002\b\u00030\u00102\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012\u00a2\u0006\u0002\u0010\u0015\u001a)\u0010\f\u001a\u00020\r*\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012H\u0086\b\u001a$\u0010\f\u001a\u00020\r*\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u001a\'\u0010\u0017\u001a\u00020\r\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004*\u0002H\u00032\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0018\u001a;\u0010\u0019\u001a\u00020\r\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004*\u0002H\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012\u00a2\u0006\u0002\u0010\u001a\u001a5\u0010\u001b\u001a\u00020\r\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004*\u0002H\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\u0002\u0010\u001c\u00a8\u0006\u001d"}, d2 = {"insert", "Lorg/platypus/orm/sql/dml/statements/InsertStatement;", "", "M", "Lorg/platypus/model/Model;", "env", "Lorg/platypus/PlatypusEnvironment;", "body", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "(Lorg/platypus/model/Model;Lorg/platypus/PlatypusEnvironment;Lkotlin/jvm/functions/Function2;)Lorg/platypus/orm/sql/dml/statements/InsertStatement;", "select", "Lorg/platypus/orm/sql/query/Query;", "fields", "", "Lorg/platypus/model/field/impl/RealModelField;", "where", "Lkotlin/Function0;", "Lorg/platypus/orm/sql/expression/Expression;", "", "(Lorg/platypus/model/Model;Lorg/platypus/PlatypusEnvironment;[Lorg/platypus/model/field/impl/RealModelField;Lkotlin/jvm/functions/Function0;)Lorg/platypus/orm/sql/query/Query;", "Lorg/platypus/orm/sql/dml/FieldSet;", "selectAll", "(Lorg/platypus/model/Model;Lorg/platypus/PlatypusEnvironment;)Lorg/platypus/orm/sql/query/Query;", "selectIds", "(Lorg/platypus/model/Model;Lorg/platypus/PlatypusEnvironment;Lkotlin/jvm/functions/Function0;)Lorg/platypus/orm/sql/query/Query;", "selectWhere", "(Lorg/platypus/model/Model;Lorg/platypus/PlatypusEnvironment;Lorg/platypus/orm/sql/expression/Expression;)Lorg/platypus/orm/sql/query/Query;", "korm"})
public final class QueriesKt {
    
    /**
     * * @sample org.chmuche.korm.sql.tests.shared.DMLTests.testSelect01
     */
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.orm.sql.query.Query select(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.FieldSet $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> where) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.platypus.orm.sql.query.Query select(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.FieldSet $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.Nullable()
    org.platypus.orm.sql.expression.Expression<java.lang.Boolean> where) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <M extends org.platypus.model.Model<M>>org.platypus.orm.sql.query.Query select(@org.jetbrains.annotations.NotNull()
    M $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RealModelField<M, ?>[] fields, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> where) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <M extends org.platypus.model.Model<M>>org.platypus.orm.sql.query.Query selectIds(@org.jetbrains.annotations.NotNull()
    M $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> where) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <M extends org.platypus.model.Model<M>>org.platypus.orm.sql.query.Query selectWhere(@org.jetbrains.annotations.NotNull()
    M $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<java.lang.Boolean> where) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <M extends org.platypus.model.Model<M>>org.platypus.orm.sql.query.Query selectAll(@org.jetbrains.annotations.NotNull()
    M $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env) {
        return null;
    }
    
    /**
     * * @sample org.chmuche.korm.sql.tests.shared.DMLTests.testInsert01
     */
    @org.jetbrains.annotations.NotNull()
    public static final <M extends org.platypus.model.Model<M>>org.platypus.orm.sql.dml.statements.InsertStatement<java.lang.Number> insert(@org.jetbrains.annotations.NotNull()
    M $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super M, ? super org.platypus.orm.sql.dml.statements.InsertStatement<java.lang.Number>, kotlin.Unit> body) {
        return null;
    }
}