package org.platypus.orm.database.vendors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0097\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0002*\u0001\u000f\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010F\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020\u0003H\u0016J\u0010\u0010H\u001a\u00020\u00032\u0006\u0010I\u001a\u00020\u000bH\u0016J\u0010\u0010J\u001a\u00020\u00032\u0006\u0010K\u001a\u00020LH\u0016J.\u0010M\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\u00032\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00030RH\u0016J&\u0010S\u001a\u00020\u00032\n\u0010T\u001a\u0006\u0012\u0002\b\u00030U2\b\u0010V\u001a\u0004\u0018\u00010\u00032\u0006\u0010W\u001a\u00020XH\u0016J\u0018\u0010Y\u001a\u00020\u00032\u0006\u0010O\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\u0003H\u0016J\u0014\u0010Z\u001a\u00020\u00032\n\u0010[\u001a\u0006\u0012\u0002\b\u00030UH\u0016J\u0018\u0010Z\u001a\u00020\u00032\u000e\u0010[\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\\H\u0016J\u0010\u0010A\u001a\u00020\u00032\u0006\u0010]\u001a\u00020\u0003H\u0016J:\u0010^\u001a\u00020\u00032\n\u0010T\u001a\u0006\u0012\u0002\b\u00030U2\u0014\u0010Q\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\\0R2\u0006\u0010_\u001a\u00020\u00032\u0006\u0010W\u001a\u00020XH\u0016J\u000e\u0010`\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020>J \u0010a\u001a\u00020\u00032\u0006\u0010b\u001a\u00020\u001e2\u0006\u0010c\u001a\u00020\u001e2\u0006\u0010d\u001a\u00020\u000bH\u0016J\u0018\u0010e\u001a\u00020\u00032\u000e\u0010f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\\H\u0016J\u0010\u0010g\u001a\u00020\u000b2\u0006\u0010Z\u001a\u00020\u0003H\u0016J\u0015\u0010h\u001a\u00020\u00032\u0006\u0010Z\u001a\u00020\u0003H\u0000\u00a2\u0006\u0002\biJ\u0010\u0010j\u001a\u00020\u00032\u0006\u0010k\u001a\u00020\u0003H\u0002J@\u0010l\u001a\u00020\u00032\n\u0010T\u001a\u0006\u0012\u0002\b\u00030U2\"\u0010m\u001a\u001e\u0012\u001a\u0012\u0018\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\\\u0012\u0006\u0012\u0004\u0018\u00010o0n0R2\u0006\u0010W\u001a\u00020XH\u0016J\b\u0010p\u001a\u00020\u000bH\u0016J\f\u0010q\u001a\u00020\u000b*\u00020\u0003H\u0002J\f\u0010r\u001a\u00020\u000b*\u00020sH\u0002J\n\u0010D\u001a\u00020\u0003*\u00020\u0003J\n\u0010t\u001a\u00020\u0003*\u00020\u0003R\u0014\u0010\u0007\u001a\u00020\u0003X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\tR \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00030\u0017X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\tR\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\tR\u000e\u0010#\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030&X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0012\u0010)\u001a\u00020*X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b.\u0010\rR\u0014\u0010/\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b0\u0010\rR\u0014\u00101\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\rR\u0014\u00103\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\rR\u0014\u00105\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b6\u0010\rR\u0014\u00107\u001a\u00020\u000bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\rR\u0014\u00109\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\rR\u0011\u0010;\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\tR\u0011\u0010=\u001a\u00020>\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0015\u0010A\u001a\u00020\u0003*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\bB\u0010CR\u0018\u0010D\u001a\u00020\u0003*\u00020\u00038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bE\u0010C\u00a8\u0006u"}, d2 = {"Lorg/platypus/orm/database/vendors/DefaultSqlDialect;", "Lorg/platypus/orm/PersistenceDialect;", "dialectName", "", "metadata", "Ljava/sql/DatabaseMetaData;", "(Ljava/lang/String;Ljava/sql/DatabaseMetaData;)V", "DEFAULT_VALUE_EXPRESSION", "getDEFAULT_VALUE_EXPRESSION", "()Ljava/lang/String;", "blobAsStream", "", "getBlobAsStream", "()Z", "checkedIdentities", "org/platypus/orm/database/vendors/DefaultSqlDialect$checkedIdentities$1", "Lorg/platypus/orm/database/vendors/DefaultSqlDialect$checkedIdentities$1;", "defaultReferenceOption", "Lorg/platypus/orm/ReferenceOption;", "getDefaultReferenceOption", "()Lorg/platypus/orm/ReferenceOption;", "getDialectName", "expressionVisitor", "Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "Lorg/platypus/orm/sql/QueryBuilder;", "getExpressionVisitor", "()Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "extraNameCharacters", "getExtraNameCharacters", "identifierLengthLimit", "", "getIdentifierLengthLimit", "()I", "identityQuoteString", "getIdentityQuoteString", "isLowerCaseIdentifiers", "isUpperCaseIdentifiers", "keywords", "", "getKeywords", "()Ljava/util/Set;", "modelNameVisitor", "Lorg/platypus/orm/database/vendors/ModelNameVisitor;", "getModelNameVisitor", "()Lorg/platypus/orm/database/vendors/ModelNameVisitor;", "needsQuotesWhenSymbolsInNames", "getNeedsQuotesWhenSymbolsInNames", "needsSequenceToAutoInc", "getNeedsSequenceToAutoInc", "shouldQuoteIdentifiers", "getShouldQuoteIdentifiers", "supportsAlterTableWithAddColumn", "getSupportsAlterTableWithAddColumn", "supportsIfNotExists", "getSupportsIfNotExists", "supportsMultipleGeneratedKeys", "getSupportsMultipleGeneratedKeys", "supportsMultipleResultSets", "getSupportsMultipleResultSets", "url", "getUrl", "version", "Ljava/math/BigDecimal;", "getVersion", "()Ljava/math/BigDecimal;", "inProperCase", "getInProperCase", "(Ljava/lang/String;)Ljava/lang/String;", "quoted", "getQuoted", "booleanFromStringToBoolean", "value", "booleanToStatementString", "b", "catalog", "transaction", "Lorg/platypus/orm/transaction/TransactionApi;", "createIndex", "unique", "tableName", "indexName", "columns", "", "delete", "table", "Lorg/platypus/model/IModel;", "where", "cr", "Lorg/platypus/orm/transaction/TransactionExecutor;", "dropIndex", "identity", "mod", "Lorg/platypus/model/field/api/IModelField;", "s", "insert", "expr", "isVersionCovers", "limit", "size", "offset", "alreadyOrdered", "modifyColumn", "column", "needQuotes", "quoteIfNecessary", "quoteIfNecessary$korm", "quoteTokenIfNecessary", "token", "replace", "data", "Lkotlin/Pair;", "", "supportsSelectForUpdate", "isIdentifier", "isIdentifierStart", "", "quotedIfNeeded", "korm"})
public abstract class DefaultSqlDialect implements org.platypus.orm.PersistenceDialect {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String url = null;
    @org.jetbrains.annotations.NotNull()
    private final java.math.BigDecimal version = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<java.lang.String> keywords = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String identityQuoteString = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String extraNameCharacters = null;
    private final boolean supportsAlterTableWithAddColumn = false;
    private final boolean supportsMultipleResultSets = false;
    private final boolean shouldQuoteIdentifiers = false;
    private final java.util.LinkedHashMap<java.lang.Object, java.lang.Object> checkedIdentities = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.sql.expression.ExpressionVisitor<org.platypus.orm.sql.QueryBuilder, java.lang.String> expressionVisitor = null;
    private final boolean blobAsStream = true;
    private final boolean supportsMultipleGeneratedKeys = false;
    private final boolean isUpperCaseIdentifiers = false;
    private final boolean isLowerCaseIdentifiers = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String DEFAULT_VALUE_EXPRESSION = "DEFAULT VALUES";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String dialectName = null;
    
    @java.lang.Override()
    public boolean getSupportsIfNotExists() {
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
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getVersion() {
        return null;
    }
    
    public final boolean isVersionCovers(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal version) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<java.lang.String> getKeywords() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getIdentityQuoteString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getExtraNameCharacters() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getSupportsAlterTableWithAddColumn() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getSupportsMultipleResultSets() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getShouldQuoteIdentifiers() {
        return false;
    }
    
    @java.lang.Override()
    public boolean needQuotes(@org.jetbrains.annotations.NotNull()
    java.lang.String identity) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String quoted(@org.jetbrains.annotations.NotNull()
    java.lang.String $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String quotedIfNeeded(@org.jetbrains.annotations.NotNull()
    java.lang.String $receiver) {
        return null;
    }
    
    private final boolean isIdentifier(@org.jetbrains.annotations.NotNull()
    java.lang.String $receiver) {
        return false;
    }
    
    private final boolean isIdentifierStart(char $receiver) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.database.vendors.ModelNameVisitor getModelNameVisitor();
    
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
    public final java.lang.String quoteIfNecessary$korm(@org.jetbrains.annotations.NotNull()
    java.lang.String identity) {
        return null;
    }
    
    private final java.lang.String quoteTokenIfNecessary(java.lang.String token) {
        return null;
    }
    
    private final java.lang.String getQuoted(@org.jetbrains.annotations.NotNull()
    java.lang.String $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.expression.ExpressionVisitor<org.platypus.orm.sql.QueryBuilder, java.lang.String> getExpressionVisitor() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getBlobAsStream() {
        return false;
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
    
    @java.lang.Override()
    public boolean supportsSelectForUpdate() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getSupportsMultipleGeneratedKeys() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getInProperCase(@org.jetbrains.annotations.NotNull()
    java.lang.String $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected java.lang.String getDEFAULT_VALUE_EXPRESSION() {
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getDialectName() {
        return null;
    }
    
    public DefaultSqlDialect(@org.jetbrains.annotations.NotNull()
    java.lang.String dialectName, @org.jetbrains.annotations.NotNull()
    java.sql.DatabaseMetaData metadata) {
        super();
    }
    
    public boolean isAllowedAsColumnDefault(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<?> e) {
        return false;
    }
}