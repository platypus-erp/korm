package org.platypus.orm.sql.dml.statements;

import java.lang.System;

/**
 * * isIgnore is supported for mysql only
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ5\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"2%\u0010.\u001a!\u0012\u0013\u0012\u00110$\u00a2\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(\'\u0012\b\u0012\u0006\u0012\u0002\b\u00030(0#J\"\u0010\f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020/\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e0\r0\rH\u0016J!\u00100\u001a\u0004\u0018\u00018\u00002\b\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u00020\u0004H\u0014\u00a2\u0006\u0002\u00104J\u0015\u00105\u001a\u00020\u00042\n\u00106\u001a\u0006\u0012\u0002\b\u000307H\u0086\u0006J\b\u00108\u001a\u00020\"H\u0016J\u0010\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\"H\u0016J>\u0010<\u001a\u0018\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00020=2\u001e\b\u0002\u0010>\u001a\u0018\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00020=H\u0014J\u0011\u0010?\u001a\u00020\u0004*\u00020:H\u0016\u00a2\u0006\u0002\u0010@R@\u0010\f\u001a&\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e0\r\u0018\u00010\r8TX\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f0\rX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\nX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u001e\u0010\u001a\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR9\u0010 \u001a-\u0012\u0004\u0012\u00020\"\u0012#\u0012!\u0012\u0013\u0012\u00110$\u00a2\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(\'\u0012\b\u0012\u0006\u0012\u0002\b\u00030(0#0!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0015\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*\u00a8\u0006A"}, d2 = {"Lorg/platypus/orm/sql/dml/statements/InsertStatement;", "Key", "", "Lorg/platypus/orm/sql/dml/statements/UpdateBuilder;", "", "env", "Lorg/platypus/PlatypusEnvironment;", "table", "Lorg/platypus/model/IModel;", "avoidAutoInc", "", "(Lorg/platypus/PlatypusEnvironment;Lorg/platypus/model/IModel;Z)V", "arguments", "", "Lkotlin/Pair;", "Lorg/platypus/model/field/api/IModelField;", "getArguments", "()Ljava/util/List;", "setArguments", "(Ljava/util/List;)V", "autoIncColumns", "getAutoIncColumns", "getAvoidAutoInc", "()Z", "flushCache", "getFlushCache", "generatedKey", "getGeneratedKey", "()Ljava/lang/Object;", "setGeneratedKey", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "postStatement", "", "", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "selfId", "Lorg/platypus/orm/sql/dml/Statement;", "getTable", "()Lorg/platypus/model/IModel;", "addPostExecute", "", "uniqueKey", "stmt", "Lorg/platypus/model/field/api/type/SqlFieldType;", "generatedKeyFun", "rs", "Ljava/sql/ResultSet;", "inserted", "(Ljava/sql/ResultSet;I)Ljava/lang/Object;", "get", "idPk", "Lorg/platypus/model/field/impl/PKModelField;", "prepareSQL", "prepared", "Ljava/sql/PreparedStatement;", "sql", "valuesAndDefaults", "", "values", "executeInternal", "(Ljava/sql/PreparedStatement;)Ljava/lang/Integer;", "korm"})
public class InsertStatement<Key extends java.lang.Object> extends org.platypus.orm.sql.dml.statements.UpdateBuilder<java.lang.Integer> {
    private final boolean flushCache = true;
    @org.jetbrains.annotations.Nullable()
    private Key generatedKey;
    private final java.util.Map<java.lang.String, kotlin.jvm.functions.Function1<java.lang.Long, org.platypus.orm.sql.dml.Statement<?>>> postStatement = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.platypus.model.field.api.IModelField<?, ?>> autoIncColumns = null;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<? extends java.util.List<? extends kotlin.Pair<? extends org.platypus.model.field.api.IModelField<?, ?>, ? extends java.lang.Object>>> arguments;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.IModel<?> table = null;
    private final boolean avoidAutoInc = false;
    
    protected boolean getFlushCache() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final Key getGeneratedKey() {
        return null;
    }
    
    public final void setGeneratedKey(@org.jetbrains.annotations.Nullable()
    Key p0) {
    }
    
    public final int get(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.PKModelField<?> idPk) {
        return 0;
    }
    
    public final void addPostExecute(@org.jetbrains.annotations.NotNull()
    java.lang.String uniqueKey, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends org.platypus.orm.sql.dml.Statement<?>> stmt) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected Key generatedKeyFun(@org.jetbrains.annotations.Nullable()
    java.sql.ResultSet rs, int inserted) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected java.util.Map<org.platypus.model.field.api.IModelField<?, ?>, java.lang.Object> valuesAndDefaults(@org.jetbrains.annotations.NotNull()
    java.util.Map<org.platypus.model.field.api.IModelField<?, ?>, ? extends java.lang.Object> values) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String prepareSQL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Integer executeInternal(@org.jetbrains.annotations.NotNull()
    java.sql.PreparedStatement $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.List<org.platypus.model.field.api.IModelField<?, ?>> getAutoIncColumns() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.sql.PreparedStatement prepared(@org.jetbrains.annotations.NotNull()
    java.lang.String sql) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected java.util.List<java.util.List<kotlin.Pair<org.platypus.model.field.api.IModelField<?, ?>, java.lang.Object>>> getArguments() {
        return null;
    }
    
    protected void setArguments(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.util.List<? extends kotlin.Pair<? extends org.platypus.model.field.api.IModelField<?, ?>, ? extends java.lang.Object>>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.util.List<kotlin.Pair<org.platypus.model.field.api.type.SqlFieldType, java.lang.Object>>> arguments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.IModel<?> getTable() {
        return null;
    }
    
    public final boolean getAvoidAutoInc() {
        return false;
    }
    
    public InsertStatement(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    org.platypus.model.IModel<?> table, boolean avoidAutoInc) {
        super(null, null, null);
    }
}