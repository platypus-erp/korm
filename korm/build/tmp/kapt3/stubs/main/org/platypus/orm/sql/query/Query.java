package org.platypus.orm.sql.query;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001]B%\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u00a2\u0006\u0002\u0010\fJ\u001f\u0010:\u001a\u00020\u00002\u0017\u0010;\u001a\u0013\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020=0<\u00a2\u0006\u0002\b>J\u001f\u0010?\u001a\u00020\u00002\u0017\u0010;\u001a\u0013\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\b0<\u00a2\u0006\u0002\b>J*\u0010@\u001a\u00020\u00002\"\u0010;\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0<J\"\u0010A\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020C\u0012\u0006\u0012\u0004\u0018\u00010D0\u000f0B0\u001fH\u0016J\b\u0010\u0011\u001a\u00020*H\u0016J\b\u0010E\u001a\u00020\u000bH\u0016J\b\u0010\u001d\u001a\u00020\u0000H\u0016J\'\u0010F\u001a\u00020\u00002\u001a\u0010G\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0H\"\u0006\u0012\u0002\b\u00030\n\u00a2\u0006\u0002\u0010IJ\u0006\u0010J\u001a\u00020\u000bJ\u001a\u0010%\u001a\u00020\u00002\u0012\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0LJ\u0006\u0010M\u001a\u00020\u000bJ\u000f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00020OH\u0096\u0002J\u0018\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u00101\u001a\u00020*H\u0016J\b\u0010P\u001a\u00020\u0000H\u0016JG\u0010Q\u001a\u00020\u00002:\u0010G\u001a\u001e\u0012\u001a\b\u0001\u0012\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030R\u0012\u0004\u0012\u00020\u00100\u000f0H\"\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030R\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0002\u0010SJ\u001c\u0010Q\u001a\u00020\u00002\n\u0010T\u001a\u0006\u0012\u0002\b\u00030\n2\b\b\u0002\u0010Q\u001a\u00020\u0010J\b\u0010U\u001a\u00020VH\u0016J\u000e\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020XJ\u0010\u0010Y\u001a\u00020\u00002\b\b\u0002\u0010Z\u001a\u00020\u000bJ\u000e\u0010[\u001a\u0004\u0018\u00010\u0004*\u00020\\H\u0016R$\u0010\r\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001eR8\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\u001f2\u0010\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\u001f@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R4\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R*\u0010+\u001a\u0004\u0018\u00010*2\b\u0010\u0012\u001a\u0004\u0018\u00010*@BX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00100\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00101\u001a\u00020*2\u0006\u0010\u0012\u001a\u00020*@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\'\u00106\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u00100\u000f0\u001f8F\u00a2\u0006\u0006\u001a\u0004\b7\u0010\"R4\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\'\"\u0004\b9\u0010)\u00a8\u0006^"}, d2 = {"Lorg/platypus/orm/sql/query/Query;", "Lorg/platypus/orm/sql/SizedIterable;", "Lorg/platypus/orm/sql/query/ResultRow;", "Lorg/platypus/orm/sql/dml/Statement;", "Ljava/sql/ResultSet;", "env", "Lorg/platypus/PlatypusEnvironment;", "set", "Lorg/platypus/orm/sql/dml/FieldSet;", "where", "Lorg/platypus/orm/sql/expression/Expression;", "", "(Lorg/platypus/PlatypusEnvironment;Lorg/platypus/orm/sql/dml/FieldSet;Lorg/platypus/orm/sql/expression/Expression;)V", "_orderByColumns", "", "Lkotlin/Pair;", "Lorg/platypus/orm/sql/query/ORDERBY_TYPE;", "count", "<set-?>", "distinct", "getDistinct", "()Z", "setDistinct", "(Z)V", "fieldSet", "getFieldSet", "()Lorg/platypus/orm/sql/dml/FieldSet;", "setFieldSet", "(Lorg/platypus/orm/sql/dml/FieldSet;)V", "forUpdate", "Ljava/lang/Boolean;", "", "groupedByColumns", "getGroupedByColumns", "()Ljava/util/List;", "setGroupedByColumns", "(Ljava/util/List;)V", "having", "getHaving", "()Lorg/platypus/orm/sql/expression/Expression;", "setHaving", "(Lorg/platypus/orm/sql/expression/Expression;)V", "", "limit", "getLimit", "()Ljava/lang/Integer;", "setLimit", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "offset", "getOffset", "()I", "setOffset", "(I)V", "orderByColumns", "getOrderByColumns", "getWhere", "setWhere", "adjustColumnSet", "body", "Lkotlin/Function1;", "Lorg/platypus/orm/sql/dml/ColumnSet;", "Lkotlin/ExtensionFunctionType;", "adjustSlice", "adjustWhere", "arguments", "Ljava/util/ArrayList;", "Lorg/platypus/model/field/api/type/SqlFieldType;", "", "empty", "groupBy", "columns", "", "([Lorg/platypus/orm/sql/expression/Expression;)Lorg/platypus/orm/sql/query/Query;", "hasCustomForUpdateState", "op", "Lkotlin/Function0;", "isForUpdate", "iterator", "", "notForUpdate", "orderBy", "Lorg/platypus/model/field/api/ModelField;", "([Lkotlin/Pair;)Lorg/platypus/orm/sql/query/Query;", "column", "prepareSQL", "", "builder", "Lorg/platypus/orm/sql/QueryBuilder;", "withDistinct", "value", "executeInternal", "Ljava/sql/PreparedStatement;", "ResultIterator", "korm"})
public class Query extends org.platypus.orm.sql.dml.Statement<java.sql.ResultSet> implements org.platypus.orm.sql.SizedIterable<org.platypus.orm.sql.query.ResultRow> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends org.platypus.orm.sql.expression.Expression<?>> groupedByColumns;
    private java.util.List<kotlin.Pair<org.platypus.orm.sql.expression.Expression<?>, org.platypus.orm.sql.query.ORDERBY_TYPE>> _orderByColumns;
    @org.jetbrains.annotations.Nullable()
    private org.platypus.orm.sql.expression.Expression<java.lang.Boolean> having;
    private boolean distinct;
    private java.lang.Boolean forUpdate;
    @org.jetbrains.annotations.NotNull()
    private org.platypus.orm.sql.dml.FieldSet fieldSet;
    @org.jetbrains.annotations.Nullable()
    private org.platypus.orm.sql.expression.Expression<java.lang.Boolean> where;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer limit;
    private int offset;
    private boolean count;
    private final org.platypus.PlatypusEnvironment env = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.platypus.orm.sql.expression.Expression<?>> getGroupedByColumns() {
        return null;
    }
    
    private final void setGroupedByColumns(java.util.List<? extends org.platypus.orm.sql.expression.Expression<?>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<kotlin.Pair<org.platypus.orm.sql.expression.Expression<?>, org.platypus.orm.sql.query.ORDERBY_TYPE>> getOrderByColumns() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> getHaving() {
        return null;
    }
    
    private final void setHaving(org.platypus.orm.sql.expression.Expression<java.lang.Boolean> p0) {
    }
    
    public final boolean getDistinct() {
        return false;
    }
    
    private final void setDistinct(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.dml.FieldSet getFieldSet() {
        return null;
    }
    
    private final void setFieldSet(org.platypus.orm.sql.dml.FieldSet p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.platypus.orm.sql.expression.Expression<java.lang.Boolean> getWhere() {
        return null;
    }
    
    private final void setWhere(org.platypus.orm.sql.expression.Expression<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getLimit() {
        return null;
    }
    
    private final void setLimit(java.lang.Integer p0) {
    }
    
    public final int getOffset() {
        return 0;
    }
    
    private final void setOffset(int p0) {
    }
    
    /**
     * * Changes [fieldSet.fields] field of a Query, [fieldSet.source] will be preserved
     *     * @param body builder for new column fieldSet, current [fieldSet.source] used as a receiver, you are expected to slice it
     *     * @sample org.chmuche.korm.sql.tests.shared.DMLTests.testAdjustQuerySlice
     */
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.query.Query adjustSlice(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.orm.sql.dml.ColumnSet, ? extends org.platypus.orm.sql.dml.FieldSet> body) {
        return null;
    }
    
    /**
     * * Changes [fieldSet.source] field of a Query, [fieldSet.fields] will be preserved
     *     * @param body builder for new column fieldSet, previous value used as a receiver
     *     * @sample org.chmuche.korm.sql.tests.shared.DMLTests.testAdjustQueryColumnSet
     */
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.query.Query adjustColumnSet(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.orm.sql.dml.ColumnSet, ? extends org.platypus.orm.sql.dml.ColumnSet> body) {
        return null;
    }
    
    /**
     * * Changes [where] field of a Query.
     *     * @param body new WHERE condition builder, previous value used as a receiver
     *     * @sample org.chmuche.korm.sql.tests.shared.DMLTests.testAdjustQueryWhere
     */
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.query.Query adjustWhere(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.orm.sql.expression.Expression<java.lang.Boolean>, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> body) {
        return null;
    }
    
    public final boolean hasCustomForUpdateState() {
        return false;
    }
    
    public final boolean isForUpdate() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.sql.ResultSet executeInternal(@org.jetbrains.annotations.NotNull()
    java.sql.PreparedStatement $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.util.ArrayList<kotlin.Pair<org.platypus.model.field.api.type.SqlFieldType, java.lang.Object>>> arguments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String prepareSQL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String prepareSQL(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.QueryBuilder builder) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.Query forUpdate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.Query notForUpdate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.query.Query withDistinct(boolean value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.query.Query groupBy(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<?>... columns) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.query.Query having(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> op) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.query.Query orderBy(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<?> column, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.ORDERBY_TYPE orderBy) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.query.Query orderBy(@org.jetbrains.annotations.NotNull()
    kotlin.Pair<? extends org.platypus.model.field.api.ModelField<?, ?>, ? extends org.platypus.orm.sql.query.ORDERBY_TYPE>... columns) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.Query limit(int limit, int offset) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Iterator<org.platypus.orm.sql.query.ResultRow> iterator() {
        return null;
    }
    
    @java.lang.Override()
    public int count() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean empty() {
        return false;
    }
    
    public Query(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.FieldSet set, @org.jetbrains.annotations.Nullable()
    org.platypus.orm.sql.expression.Expression<java.lang.Boolean> where) {
        super(null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u000bH\u0096\u0002J\t\u0010\u000f\u001a\u00020\u0002H\u0096\u0002R\u001e\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0010"}, d2 = {"Lorg/platypus/orm/sql/query/Query$ResultIterator;", "", "Lorg/platypus/orm/sql/query/ResultRow;", "rs", "Ljava/sql/ResultSet;", "(Lorg/platypus/orm/sql/query/Query;Ljava/sql/ResultSet;)V", "fieldsIndex", "Ljava/util/HashMap;", "Lorg/platypus/orm/sql/expression/Expression;", "", "hasNext", "", "Ljava/lang/Boolean;", "getRs", "()Ljava/sql/ResultSet;", "next", "korm"})
    final class ResultIterator implements java.util.Iterator<org.platypus.orm.sql.query.ResultRow>, kotlin.jvm.internal.markers.KMappedMarker {
        private java.lang.Boolean hasNext;
        private final java.util.HashMap<org.platypus.orm.sql.expression.Expression<?>, java.lang.Integer> fieldsIndex = null;
        @org.jetbrains.annotations.NotNull()
        private final java.sql.ResultSet rs = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.platypus.orm.sql.query.ResultRow next() {
            return null;
        }
        
        @java.lang.Override()
        public boolean hasNext() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.sql.ResultSet getRs() {
            return null;
        }
        
        public ResultIterator(@org.jetbrains.annotations.NotNull()
        java.sql.ResultSet rs) {
            super();
        }
    }
}