package org.platypus.orm.sql;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001c\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J!\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u0002H\u000f\u00a2\u0006\u0002\u0010\u0012J1\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00162\u0006\u0010\u0011\u001a\u0002H\u000f\u00a2\u0006\u0002\u0010\u0017J(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u001bR%\u0010\u0005\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001c"}, d2 = {"Lorg/platypus/orm/sql/QueryBuilder;", "", "prepared", "", "(Z)V", "args", "Ljava/util/ArrayList;", "Lkotlin/Pair;", "Lorg/platypus/model/field/api/type/SqlFieldType;", "getArgs", "()Ljava/util/ArrayList;", "getPrepared", "()Z", "registerArgument", "", "T", "sqlType", "argument", "(Lorg/platypus/model/field/api/type/SqlFieldType;Ljava/lang/Object;)Ljava/lang/String;", "executor", "Lorg/platypus/orm/transaction/TransactionExecutor;", "column", "Lorg/platypus/model/field/api/IModelField;", "(Lorg/platypus/orm/transaction/TransactionExecutor;Lorg/platypus/model/field/api/IModelField;Ljava/lang/Object;)Ljava/lang/String;", "registerArguments", "", "arguments", "", "korm"})
public final class QueryBuilder {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<kotlin.Pair<org.platypus.model.field.api.type.SqlFieldType, java.lang.Object>> args = null;
    private final boolean prepared = false;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<kotlin.Pair<org.platypus.model.field.api.type.SqlFieldType, java.lang.Object>> getArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>java.lang.String registerArgument(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.transaction.TransactionExecutor executor, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<?, ?> column, T argument) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>java.lang.String registerArgument(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.type.SqlFieldType sqlType, T argument) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>java.util.List<java.lang.String> registerArguments(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.type.SqlFieldType sqlType, @org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends T> arguments) {
        return null;
    }
    
    public final boolean getPrepared() {
        return false;
    }
    
    public QueryBuilder(boolean prepared) {
        super();
    }
    
    public QueryBuilder() {
        super();
    }
}