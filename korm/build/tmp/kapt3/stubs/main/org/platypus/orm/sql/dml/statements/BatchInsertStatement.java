package org.platypus.orm.sql.dml.statements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0016\u0018\u00002\"\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00020\u0001B#\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00040\u0019H\u0002J\"\u0010\u001a\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001b0\u00020\u0002H\u0016J6\u0010\u001d\u001a\u001e\u0012\u0018\u0012\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!H\u0014J2\u0010\"\u001a\u00020\u0017\"\b\b\u0000\u0010#*\u00020\u00052\u0010\u0010$\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u0002H#0\u00042\u0006\u0010%\u001a\u0002H#H\u0096\u0002\u00a2\u0006\u0002\u0010&J\r\u0010\'\u001a\u00020\u0017H\u0010\u00a2\u0006\u0002\b(J<\u0010)\u001a\u0018\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u001c\u0010*\u001a\u0018\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\u0014J\u0014\u0010+\u001a\u00020\u000b*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0002R-\u0010\r\u001a\u001e\u0012\u001a\u0012\u0018\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000bX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u000bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014\u00a8\u0006,"}, d2 = {"Lorg/platypus/orm/sql/dml/statements/BatchInsertStatement;", "Lorg/platypus/orm/sql/dml/statements/InsertStatement;", "", "", "Lorg/platypus/model/field/api/IModelField;", "", "env", "Lorg/platypus/PlatypusEnvironment;", "table", "Lorg/platypus/model/Model;", "ignore", "", "(Lorg/platypus/PlatypusEnvironment;Lorg/platypus/model/Model;Z)V", "data", "Ljava/util/ArrayList;", "", "getData", "()Ljava/util/ArrayList;", "flushCache", "getFlushCache", "()Z", "isAlwaysBatch", "addBatch", "", "allColumnsInDataSet", "", "arguments", "Lkotlin/Pair;", "Lorg/platypus/model/field/api/type/SqlFieldType;", "generatedKeyFun", "rs", "Ljava/sql/ResultSet;", "inserted", "", "set", "S", "column", "value", "(Lorg/platypus/model/field/api/IModelField;Ljava/lang/Object;)V", "validateLastBatch", "validateLastBatch$korm", "valuesAndDefaults", "values", "isDefaultable", "korm"})
public class BatchInsertStatement extends org.platypus.orm.sql.dml.statements.InsertStatement<java.util.List<? extends java.util.Map<org.platypus.model.field.api.IModelField<?, ?>, ? extends java.lang.Object>>> {
    private final boolean flushCache = false;
    private final boolean isAlwaysBatch = true;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<java.util.Map<org.platypus.model.field.api.IModelField<?, ?>, java.lang.Object>> data = null;
    
    @java.lang.Override()
    protected boolean getFlushCache() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isAlwaysBatch() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.util.Map<org.platypus.model.field.api.IModelField<?, ?>, java.lang.Object>> getData() {
        return null;
    }
    
    private final boolean isDefaultable(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<?, ?> $receiver) {
        return false;
    }
    
    @java.lang.Override()
    public <S extends java.lang.Object>void set(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<?, S> column, @org.jetbrains.annotations.NotNull()
    S value) {
    }
    
    public final void addBatch() {
    }
    
    public void validateLastBatch$korm() {
    }
    
    private final java.util.Set<org.platypus.model.field.api.IModelField<?, ?>> allColumnsInDataSet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.util.Map<org.platypus.model.field.api.IModelField<?, ?>, java.lang.Object> valuesAndDefaults(@org.jetbrains.annotations.NotNull()
    java.util.Map<org.platypus.model.field.api.IModelField<?, ?>, ? extends java.lang.Object> values) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.util.List<kotlin.Pair<org.platypus.model.field.api.type.SqlFieldType, java.lang.Object>>> arguments() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.util.List<java.util.Map<org.platypus.model.field.api.IModelField<?, ?>, java.lang.Object>> generatedKeyFun(@org.jetbrains.annotations.Nullable()
    java.sql.ResultSet rs, int inserted) {
        return null;
    }
    
    public BatchInsertStatement(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    org.platypus.model.Model<?> table, boolean ignore) {
        super(null, null, false);
    }
}