package org.platypus.orm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u000fH&J\u0010\u00101\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u0003H&J\u0010\u00103\u001a\u00020\u000f2\u0006\u00104\u001a\u000205H&J.\u00106\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\u000f2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000f0;H&J&\u0010<\u001a\u00020\u000f2\n\u0010=\u001a\u0006\u0012\u0002\b\u00030>2\b\u0010?\u001a\u0004\u0018\u00010\u000f2\u0006\u0010@\u001a\u00020AH&J\u0018\u0010B\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\u000fH&J\u0014\u0010C\u001a\u00020\u000f2\n\u0010D\u001a\u0006\u0012\u0002\b\u00030>H&J\u0018\u0010C\u001a\u00020\u000f2\u000e\u0010D\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030EH&J\u0010\u0010F\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u000fH&J:\u0010H\u001a\u00020\u000f2\n\u0010=\u001a\u0006\u0012\u0002\b\u00030>2\u0014\u0010:\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030E0;2\u0006\u0010I\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020AH&J\u0014\u0010J\u001a\u00020\u00032\n\u0010K\u001a\u0006\u0012\u0002\b\u00030LH\u0016J$\u0010M\u001a\u00020\u000f2\u0006\u0010N\u001a\u00020\u00182\b\b\u0002\u0010O\u001a\u00020\u00182\b\b\u0002\u0010P\u001a\u00020\u0003H&J\u0018\u0010Q\u001a\u00020\u000f2\u000e\u0010R\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030EH&J\u0010\u0010S\u001a\u00020\u00032\u0006\u0010T\u001a\u00020\u000fH\u0016J@\u0010U\u001a\u00020\u000f2\n\u0010=\u001a\u0006\u0012\u0002\b\u00030>2\"\u0010V\u001a\u001e\u0012\u001a\u0012\u0018\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030E\u0012\u0006\u0012\u0004\u0018\u00010\u00010W0;2\u0006\u0010@\u001a\u00020AH&J\b\u0010X\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0018X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011R\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0012\u0010!\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u0005R\u0012\u0010#\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u0005R\u0012\u0010%\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010\u0005R\u0012\u0010\'\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b(\u0010\u0005R\u0012\u0010)\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b*\u0010\u0005R\u0012\u0010+\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b,\u0010\u0005R\u0012\u0010-\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b.\u0010\u0005\u00a8\u0006Y"}, d2 = {"Lorg/platypus/orm/PersistenceDialect;", "", "blobAsStream", "", "getBlobAsStream", "()Z", "defaultReferenceOption", "Lorg/platypus/orm/ReferenceOption;", "getDefaultReferenceOption", "()Lorg/platypus/orm/ReferenceOption;", "dialectDDL", "Lorg/platypus/orm/database/vendors/DialectDDL;", "getDialectDDL", "()Lorg/platypus/orm/database/vendors/DialectDDL;", "dialectName", "", "getDialectName", "()Ljava/lang/String;", "expressionVisitor", "Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "Lorg/platypus/orm/sql/QueryBuilder;", "getExpressionVisitor", "()Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "identifierLengthLimit", "", "getIdentifierLengthLimit", "()I", "identityQuoteString", "getIdentityQuoteString", "keywords", "", "getKeywords", "()Ljava/util/Set;", "needsQuotesWhenSymbolsInNames", "getNeedsQuotesWhenSymbolsInNames", "needsSequenceToAutoInc", "getNeedsSequenceToAutoInc", "shouldQuoteIdentifiers", "getShouldQuoteIdentifiers", "supportsAlterTableWithAddColumn", "getSupportsAlterTableWithAddColumn", "supportsIfNotExists", "getSupportsIfNotExists", "supportsMultipleGeneratedKeys", "getSupportsMultipleGeneratedKeys", "supportsMultipleResultSets", "getSupportsMultipleResultSets", "booleanFromStringToBoolean", "value", "booleanToStatementString", "b", "catalog", "transaction", "Lorg/platypus/orm/transaction/TransactionApi;", "createIndex", "unique", "tableName", "indexName", "columns", "", "delete", "table", "Lorg/platypus/model/IModel;", "where", "cr", "Lorg/platypus/orm/transaction/TransactionExecutor;", "dropIndex", "identity", "mod", "Lorg/platypus/model/field/api/IModelField;", "inProperCase", "s", "insert", "expr", "isAllowedAsColumnDefault", "e", "Lorg/platypus/orm/sql/expression/Expression;", "limit", "size", "offset", "alreadyOrdered", "modifyColumn", "column", "needQuotes", "token", "replace", "data", "Lkotlin/Pair;", "supportsSelectForUpdate", "korm"})
public abstract interface PersistenceDialect {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getDialectName();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String identity(@org.jetbrains.annotations.NotNull()
    org.platypus.model.IModel<?> mod);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String identity(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<?, ?> mod);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.database.vendors.DialectDDL getDialectDDL();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.expression.ExpressionVisitor<org.platypus.orm.sql.QueryBuilder, java.lang.String> getExpressionVisitor();
    
    public abstract boolean supportsSelectForUpdate();
    
    public abstract boolean getSupportsMultipleGeneratedKeys();
    
    public abstract boolean isAllowedAsColumnDefault(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<?> e);
    
    public abstract boolean getSupportsIfNotExists();
    
    public abstract boolean getSupportsMultipleResultSets();
    
    public abstract boolean getNeedsSequenceToAutoInc();
    
    public abstract boolean getNeedsQuotesWhenSymbolsInNames();
    
    public abstract int getIdentifierLengthLimit();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String catalog(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.transaction.TransactionApi transaction);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.ReferenceOption getDefaultReferenceOption();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getIdentityQuoteString();
    
    public abstract boolean getShouldQuoteIdentifiers();
    
    public abstract boolean getSupportsAlterTableWithAddColumn();
    
    public abstract boolean getBlobAsStream();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Set<java.lang.String> getKeywords();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String insert(@org.jetbrains.annotations.NotNull()
    org.platypus.model.IModel<?> table, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.platypus.model.field.api.IModelField<?, ?>> columns, @org.jetbrains.annotations.NotNull()
    java.lang.String expr, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.transaction.TransactionExecutor cr);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String delete(@org.jetbrains.annotations.NotNull()
    org.platypus.model.IModel<?> table, @org.jetbrains.annotations.Nullable()
    java.lang.String where, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.transaction.TransactionExecutor cr);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String replace(@org.jetbrains.annotations.NotNull()
    org.platypus.model.IModel<?> table, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends kotlin.Pair<? extends org.platypus.model.field.api.IModelField<?, ?>, ? extends java.lang.Object>> data, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.transaction.TransactionExecutor cr);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String createIndex(boolean unique, @org.jetbrains.annotations.NotNull()
    java.lang.String tableName, @org.jetbrains.annotations.NotNull()
    java.lang.String indexName, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> columns);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String dropIndex(@org.jetbrains.annotations.NotNull()
    java.lang.String tableName, @org.jetbrains.annotations.NotNull()
    java.lang.String indexName);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String modifyColumn(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<?, ?> column);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String limit(int size, int offset, boolean alreadyOrdered);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String inProperCase(@org.jetbrains.annotations.NotNull()
    java.lang.String s);
    
    public abstract boolean needQuotes(@org.jetbrains.annotations.NotNull()
    java.lang.String token);
    
    public abstract boolean booleanFromStringToBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String value);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String booleanToStatementString(boolean b);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
        
        public static boolean isAllowedAsColumnDefault(org.platypus.orm.PersistenceDialect $this, @org.jetbrains.annotations.NotNull()
        org.platypus.orm.sql.expression.Expression<?> e) {
            return false;
        }
        
        public static boolean needQuotes(org.platypus.orm.PersistenceDialect $this, @org.jetbrains.annotations.NotNull()
        java.lang.String token) {
            return false;
        }
    }
}