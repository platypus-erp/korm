package org.platypus.orm.sql.dml;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u00000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001ae\u0010\u0006\u001a\u00020\u0007\"\b\b\u0000\u0010\b*\u00020\u0003\"\b\b\u0001\u0010\t*\u00020\u0003*\u0002H\b2\u0006\u0010\n\u001a\u0002H\t2\u001b\u0010\u000b\u001a\u0017\u0012\u0004\u0012\u0002H\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\f\u00a2\u0006\u0002\b\u000e2\u001b\u0010\u000f\u001a\u0017\u0012\u0004\u0012\u0002H\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\f\u00a2\u0006\u0002\b\u000e\u00a2\u0006\u0002\u0010\u0010\u001ae\u0010\u0011\u001a\u00020\u0007\"\b\b\u0000\u0010\b*\u00020\u0003\"\b\b\u0001\u0010\t*\u00020\u0003*\u0002H\b2\u0006\u0010\n\u001a\u0002H\t2\u001b\u0010\u000b\u001a\u0017\u0012\u0004\u0012\u0002H\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\f\u00a2\u0006\u0002\b\u000e2\u001b\u0010\u000f\u001a\u0017\u0012\u0004\u0012\u0002H\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\f\u00a2\u0006\u0002\b\u000e\u00a2\u0006\u0002\u0010\u0010\"#\u0010\u0000\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005*2\u0010\u0012\"\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u00132\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u0013\u00a8\u0006\u0014"}, d2 = {"storeFields", "", "Lorg/platypus/model/field/api/IModelField;", "Lorg/platypus/orm/sql/dml/ColumnSet;", "getStoreFields", "(Lorg/platypus/orm/sql/dml/ColumnSet;)Ljava/util/Set;", "innerJoin", "Lorg/platypus/orm/sql/query/Join;", "C1", "C2", "otherTable", "onColumn", "Lkotlin/Function1;", "Lorg/platypus/orm/sql/expression/Expression;", "Lkotlin/ExtensionFunctionType;", "otherColumn", "(Lorg/platypus/orm/sql/dml/ColumnSet;Lorg/platypus/orm/sql/dml/ColumnSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lorg/platypus/orm/sql/query/Join;", "leftJoin", "JoinCondition", "Lkotlin/Pair;", "korm"})
public final class TableKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.Set<org.platypus.model.field.api.IModelField<?, ?>> getStoreFields(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.ColumnSet $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <C1 extends org.platypus.orm.sql.dml.ColumnSet, C2 extends org.platypus.orm.sql.dml.ColumnSet>org.platypus.orm.sql.query.Join innerJoin(@org.jetbrains.annotations.NotNull()
    C1 $receiver, @org.jetbrains.annotations.NotNull()
    C2 otherTable, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super C1, ? extends org.platypus.orm.sql.expression.Expression<?>> onColumn, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super C2, ? extends org.platypus.orm.sql.expression.Expression<?>> otherColumn) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <C1 extends org.platypus.orm.sql.dml.ColumnSet, C2 extends org.platypus.orm.sql.dml.ColumnSet>org.platypus.orm.sql.query.Join leftJoin(@org.jetbrains.annotations.NotNull()
    C1 $receiver, @org.jetbrains.annotations.NotNull()
    C2 otherTable, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super C1, ? extends org.platypus.orm.sql.expression.Expression<?>> onColumn, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super C2, ? extends org.platypus.orm.sql.expression.Expression<?>> otherColumn) {
        return null;
    }
}