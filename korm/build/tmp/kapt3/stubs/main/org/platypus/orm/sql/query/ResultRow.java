package org.platypus.orm.sql.query;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 -2\u00020\u0001:\u0002-.B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u000e\u0010\u0017\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0018J)\u0010\u0015\u001a\u0004\u0018\u0001H\u0019\"\b\b\u0000\u0010\u0019*\u00020\u00012\u0010\u0010\u0017\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u0002H\u00190\u001a\u00a2\u0006\u0002\u0010\u001bJ\u0012\u0010\u0015\u001a\u00020\u00052\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u001cJ\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0017\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001eJ!\u0010\u0013\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00190\bH\u0007\u00a2\u0006\u0002\u0010 J#\u0010!\u001a\u0004\u0018\u0001H\u0019\"\u0004\b\u0000\u0010\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00190\bH\u0003\u00a2\u0006\u0002\u0010 J\u0016\u0010\"\u001a\u0004\u0018\u00010\u00012\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J\u001a\u0010#\u001a\u00020$\"\u0004\b\u0000\u0010\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00190\bJ*\u0010%\u001a\u00020&\"\u0004\b\u0000\u0010\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00190\b2\u0006\u0010\'\u001a\u0002H\u0019H\u0086\u0002\u00a2\u0006\u0002\u0010(J\b\u0010)\u001a\u00020*H\u0016J!\u0010+\u001a\u0004\u0018\u0001H\u0019\"\u0004\b\u0000\u0010\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00190\b\u00a2\u0006\u0002\u0010 J\u0014\u0010,\u001a\u0004\u0018\u00010\u00012\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\bR\u001b\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lorg/platypus/orm/sql/query/ResultRow;", "", "dialect", "Lorg/platypus/orm/PersistenceDialect;", "size", "", "fieldIndex", "", "Lorg/platypus/orm/sql/expression/Expression;", "(Lorg/platypus/orm/PersistenceDialect;ILjava/util/Map;)V", "data", "", "getData", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "getDialect", "()Lorg/platypus/orm/PersistenceDialect;", "expr", "", "getExpr", "()Ljava/util/Set;", "get", "Lorg/platypus/cache/ModelID;", "field", "Lorg/platypus/model/field/api/ReferencedField;", "T", "Lorg/platypus/model/field/api/SimpleModelField;", "(Lorg/platypus/model/field/api/SimpleModelField;)Ljava/lang/Object;", "Lorg/platypus/model/field/impl/PKModelField;", "getAny", "Lorg/platypus/model/field/api/IModelField;", "c", "(Lorg/platypus/orm/sql/expression/Expression;)Ljava/lang/Object;", "getRaw", "getRawAny", "hasValue", "", "set", "", "value", "(Lorg/platypus/orm/sql/expression/Expression;Ljava/lang/Object;)V", "toString", "", "tryGet", "tryGetAny", "Companion", "NotInitializedValue", "korm"})
public final class ResultRow {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object[] data = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.PersistenceDialect dialect = null;
    private final java.util.Map<org.platypus.orm.sql.expression.Expression<?>, java.lang.Integer> fieldIndex = null;
    public static final org.platypus.orm.sql.query.ResultRow.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object[] getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAny(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<?, ?> field) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>T get(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.SimpleModelField<?, T> field) {
        return null;
    }
    
    public final int get(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.PKModelField<?> field) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.platypus.cache.ModelID get(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ReferencedField<?, ?> field) {
        return null;
    }
    
    /**
     * * Function might returns null. Use @tryGet if you don't sure of nullability (e.g. in left-join cases)
     */
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    public final <T extends java.lang.Object>T getExpr(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<T> c) {
        return null;
    }
    
    public final <T extends java.lang.Object>void set(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<T> c, T value) {
    }
    
    public final <T extends java.lang.Object>boolean hasValue(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<T> c) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>T tryGet(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<T> c) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object tryGetAny(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<?> c) {
        return null;
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    private final <T extends java.lang.Object>T getRaw(org.platypus.orm.sql.expression.Expression<T> c) {
        return null;
    }
    
    private final java.lang.Object getRawAny(org.platypus.orm.sql.expression.Expression<?> c) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.platypus.orm.sql.expression.Expression<?>> getExpr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.PersistenceDialect getDialect() {
        return null;
    }
    
    public ResultRow(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.PersistenceDialect dialect, int size, @org.jetbrains.annotations.NotNull()
    java.util.Map<org.platypus.orm.sql.expression.Expression<?>, java.lang.Integer> fieldIndex) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lorg/platypus/orm/sql/query/ResultRow$NotInitializedValue;", "", "()V", "korm"})
    public static final class NotInitializedValue {
        public static final org.platypus.orm.sql.query.ResultRow.NotInitializedValue INSTANCE = null;
        
        private NotInitializedValue() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J@\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\n2\u0016\u0010\f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\u000e0\r\u00a8\u0006\u000f"}, d2 = {"Lorg/platypus/orm/sql/query/ResultRow$Companion;", "", "()V", "create", "Lorg/platypus/orm/sql/query/ResultRow;", "dialect", "Lorg/platypus/orm/PersistenceDialect;", "rs", "Ljava/sql/ResultSet;", "fields", "", "Lorg/platypus/orm/sql/expression/Expression;", "fieldsIndex", "", "", "korm"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.platypus.orm.sql.query.ResultRow create(@org.jetbrains.annotations.NotNull()
        org.platypus.orm.PersistenceDialect dialect, @org.jetbrains.annotations.NotNull()
        java.sql.ResultSet rs, @org.jetbrains.annotations.NotNull()
        java.util.Set<? extends org.platypus.orm.sql.expression.Expression<?>> fields, @org.jetbrains.annotations.NotNull()
        java.util.Map<org.platypus.orm.sql.expression.Expression<?>, java.lang.Integer> fieldsIndex) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}