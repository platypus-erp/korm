package org.platypus.orm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u00103\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u0013H\u0016J\u0010\u00105\u001a\u00020\u00132\u0006\u00106\u001a\u00020\u0004H\u0016J\u0010\u00107\u001a\u00020\u00132\u0006\u00108\u001a\u000209H\u0016J.\u0010:\u001a\u00020\u00132\u0006\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u00132\u0006\u0010=\u001a\u00020\u00132\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00130?H\u0016J&\u0010@\u001a\u00020\u00132\n\u0010A\u001a\u0006\u0012\u0002\b\u00030B2\b\u0010C\u001a\u0004\u0018\u00010\u00132\u0006\u0010D\u001a\u00020EH\u0016J\u0018\u0010F\u001a\u00020\u00132\u0006\u0010<\u001a\u00020\u00132\u0006\u0010=\u001a\u00020\u0013H\u0016J\u0014\u0010G\u001a\u00020\u00132\n\u0010H\u001a\u0006\u0012\u0002\b\u00030BH\u0016J\u0018\u0010G\u001a\u00020\u00132\u000e\u0010H\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030IH\u0016J\u0010\u0010J\u001a\u00020\u00132\u0006\u0010K\u001a\u00020\u0013H\u0016J:\u0010L\u001a\u00020\u00132\n\u0010A\u001a\u0006\u0012\u0002\b\u00030B2\u0014\u0010>\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030I0?2\u0006\u0010M\u001a\u00020\u00132\u0006\u0010D\u001a\u00020EH\u0016J \u0010N\u001a\u00020\u00132\u0006\u0010O\u001a\u00020\u001c2\u0006\u0010P\u001a\u00020\u001c2\u0006\u0010Q\u001a\u00020\u0004H\u0016J\u0018\u0010R\u001a\u00020\u00132\u000e\u0010S\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030IH\u0016J@\u0010T\u001a\u00020\u00132\n\u0010A\u001a\u0006\u0012\u0002\b\u00030B2\"\u0010U\u001a\u001e\u0012\u001a\u0012\u0018\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030I\u0012\u0006\u0012\u0004\u0018\u00010W0V0?2\u0006\u0010D\u001a\u00020EH\u0016J\b\u0010X\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u00178VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010\u0015R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\"8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010\u0006R\u0014\u0010\'\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b(\u0010\u0006R\u0014\u0010)\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b*\u0010\u0006R\u0014\u0010+\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b,\u0010\u0006R\u0014\u0010-\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b.\u0010\u0006R\u0014\u0010/\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b0\u0010\u0006R\u0014\u00101\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b2\u0010\u0006\u00a8\u0006Y"}, d2 = {"Lorg/platypus/orm/KormDialect;", "Lorg/platypus/orm/PersistenceDialect;", "()V", "blobAsStream", "", "getBlobAsStream", "()Z", "current", "getCurrent", "()Lorg/platypus/orm/PersistenceDialect;", "defaultReferenceOption", "Lorg/platypus/orm/ReferenceOption;", "getDefaultReferenceOption", "()Lorg/platypus/orm/ReferenceOption;", "dialectDDL", "Lorg/platypus/orm/database/vendors/DialectDDL;", "getDialectDDL", "()Lorg/platypus/orm/database/vendors/DialectDDL;", "dialectName", "", "getDialectName", "()Ljava/lang/String;", "expressionVisitor", "Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "Lorg/platypus/orm/sql/QueryBuilder;", "getExpressionVisitor", "()Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "identifierLengthLimit", "", "getIdentifierLengthLimit", "()I", "identityQuoteString", "getIdentityQuoteString", "keywords", "", "getKeywords", "()Ljava/util/Set;", "needsQuotesWhenSymbolsInNames", "getNeedsQuotesWhenSymbolsInNames", "needsSequenceToAutoInc", "getNeedsSequenceToAutoInc", "shouldQuoteIdentifiers", "getShouldQuoteIdentifiers", "supportsAlterTableWithAddColumn", "getSupportsAlterTableWithAddColumn", "supportsIfNotExists", "getSupportsIfNotExists", "supportsMultipleGeneratedKeys", "getSupportsMultipleGeneratedKeys", "supportsMultipleResultSets", "getSupportsMultipleResultSets", "booleanFromStringToBoolean", "value", "booleanToStatementString", "b", "catalog", "transaction", "Lorg/platypus/orm/transaction/TransactionApi;", "createIndex", "unique", "tableName", "indexName", "columns", "", "delete", "table", "Lorg/platypus/model/IModel;", "where", "cr", "Lorg/platypus/orm/transaction/TransactionExecutor;", "dropIndex", "identity", "mod", "Lorg/platypus/model/field/api/IModelField;", "inProperCase", "s", "insert", "expr", "limit", "size", "offset", "alreadyOrdered", "modifyColumn", "column", "replace", "data", "Lkotlin/Pair;", "", "supportsSelectForUpdate", "korm"})
public final class KormDialect implements org.platypus.orm.PersistenceDialect {
    @org.jetbrains.annotations.NotNull()
    private static final org.platypus.orm.PersistenceDialect current = null;
    public static final org.platypus.orm.KormDialect INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.PersistenceDialect getCurrent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getDialectName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String identity(@org.jetbrains.annotations.NotNull()
    org.platypus.model.IModel<?> mod) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String identity(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<?, ?> mod) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.database.vendors.DialectDDL getDialectDDL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.expression.ExpressionVisitor<org.platypus.orm.sql.QueryBuilder, java.lang.String> getExpressionVisitor() {
        return null;
    }
    
    @java.lang.Override()
    public boolean supportsSelectForUpdate() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getSupportsMultipleGeneratedKeys() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getSupportsIfNotExists() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getSupportsMultipleResultSets() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getNeedsSequenceToAutoInc() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getNeedsQuotesWhenSymbolsInNames() {
        return false;
    }
    
    @java.lang.Override()
    public int getIdentifierLengthLimit() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String catalog(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.transaction.TransactionApi transaction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.ReferenceOption getDefaultReferenceOption() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getIdentityQuoteString() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getShouldQuoteIdentifiers() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getSupportsAlterTableWithAddColumn() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getBlobAsStream() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<java.lang.String> getKeywords() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String insert(@org.jetbrains.annotations.NotNull()
    org.platypus.model.IModel<?> table, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.platypus.model.field.api.IModelField<?, ?>> columns, @org.jetbrains.annotations.NotNull()
    java.lang.String expr, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.transaction.TransactionExecutor cr) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String delete(@org.jetbrains.annotations.NotNull()
    org.platypus.model.IModel<?> table, @org.jetbrains.annotations.Nullable()
    java.lang.String where, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.transaction.TransactionExecutor cr) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String replace(@org.jetbrains.annotations.NotNull()
    org.platypus.model.IModel<?> table, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends kotlin.Pair<? extends org.platypus.model.field.api.IModelField<?, ?>, ? extends java.lang.Object>> data, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.transaction.TransactionExecutor cr) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String createIndex(boolean unique, @org.jetbrains.annotations.NotNull()
    java.lang.String tableName, @org.jetbrains.annotations.NotNull()
    java.lang.String indexName, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> columns) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String dropIndex(@org.jetbrains.annotations.NotNull()
    java.lang.String tableName, @org.jetbrains.annotations.NotNull()
    java.lang.String indexName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String modifyColumn(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<?, ?> column) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String limit(int size, int offset, boolean alreadyOrdered) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String inProperCase(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
        return null;
    }
    
    @java.lang.Override()
    public boolean booleanFromStringToBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String booleanToStatementString(boolean b) {
        return null;
    }
    
    private KormDialect() {
        super();
    }
    
    public boolean isAllowedAsColumnDefault(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<?> e) {
        return false;
    }
    
    public boolean needQuotes(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return false;
    }
}