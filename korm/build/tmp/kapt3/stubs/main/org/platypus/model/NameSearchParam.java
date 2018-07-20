package org.platypus.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012D\b\u0002\u0010\u0007\u001a>\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003JE\u0010\u001a\u001a>\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\bH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u000eH\u00c6\u0003Ju\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052D\b\u0002\u0010\u0007\u001a>\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u000eH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011RM\u0010\u0007\u001a>\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006!"}, d2 = {"Lorg/platypus/model/NameSearchParam;", "", "value", "", "where", "Lorg/platypus/orm/sql/expression/Expression;", "", "operator", "Lkotlin/Function2;", "Lorg/platypus/orm/sql/expression/TypedExpression;", "Lkotlin/ParameterName;", "name", "nameExpr", "limit", "", "(Ljava/lang/String;Lorg/platypus/orm/sql/expression/Expression;Lkotlin/jvm/functions/Function2;I)V", "getLimit", "()I", "getOperator", "()Lkotlin/jvm/functions/Function2;", "getValue", "()Ljava/lang/String;", "getWhere", "()Lorg/platypus/orm/sql/expression/Expression;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "korm"})
public final class NameSearchParam {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String value = null;
    @org.jetbrains.annotations.Nullable()
    private final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> where = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<org.platypus.orm.sql.expression.TypedExpression<java.lang.String>, java.lang.String, org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> operator = null;
    private final int limit = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getValue() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> getWhere() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<org.platypus.orm.sql.expression.TypedExpression<java.lang.String>, java.lang.String, org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> getOperator() {
        return null;
    }
    
    public final int getLimit() {
        return 0;
    }
    
    public NameSearchParam(@org.jetbrains.annotations.NotNull()
    java.lang.String value, @org.jetbrains.annotations.Nullable()
    org.platypus.orm.sql.expression.Expression<java.lang.Boolean> where, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.orm.sql.expression.TypedExpression<java.lang.String>, ? super java.lang.String, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> operator, int limit) {
        super();
    }
    
    public NameSearchParam() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<org.platypus.orm.sql.expression.TypedExpression<java.lang.String>, java.lang.String, org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.NameSearchParam copy(@org.jetbrains.annotations.NotNull()
    java.lang.String value, @org.jetbrains.annotations.Nullable()
    org.platypus.orm.sql.expression.Expression<java.lang.Boolean> where, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.orm.sql.expression.TypedExpression<java.lang.String>, ? super java.lang.String, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> operator, int limit) {
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