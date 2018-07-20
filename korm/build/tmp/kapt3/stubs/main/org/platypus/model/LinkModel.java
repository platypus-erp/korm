package org.platypus.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00000\u0004B3\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ=\u0010+\u001a\u0002H,\"\b\b\u0002\u0010-*\u00020.\"\b\b\u0003\u0010,*\u00020.2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u0002H,002\u0006\u00101\u001a\u0002H-H\u0016\u00a2\u0006\u0002\u00102J\u0010\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u000205H\u0016J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010.H\u0096\u0002J*\u00109\u001a\u00020:2\u0006\u00104\u001a\u0002052\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010<2\u0006\u0010=\u001a\u00020>J1\u00109\u001a\u00020:2\u0006\u00104\u001a\u0002052\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000<2\u0006\u0010=\u001a\u00020>H\u0007\u00a2\u0006\u0002\b?J\b\u0010@\u001a\u00020AH\u0016J\u0012\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040CH\u0016R\"\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f0\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R&\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000\u0013X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R3\u0010\u0016\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00028\u00000\u00178@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R3\u0010\u001c\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00028\u00010\u00178@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001d\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\'\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u00008FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b$\u0010%R\u0014\u0010\'\u001a\u00020(X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*\u00a8\u0006D"}, d2 = {"Lorg/platypus/model/LinkModel;", "M1", "Lorg/platypus/model/Model;", "M2", "Lorg/platypus/model/IModel;", "modelName", "", "m1", "Lkotlin/Function0;", "m2", "onDelete", "Lorg/platypus/orm/ReferenceOption;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lorg/platypus/orm/ReferenceOption;)V", "fields", "", "Lorg/platypus/model/field/api/IModelField;", "getFields", "()Ljava/util/Set;", "id", "Lorg/platypus/model/field/impl/PKModelField;", "getId", "()Lorg/platypus/model/field/impl/PKModelField;", "m1M2O", "Lorg/platypus/model/field/impl/Many2OneFieldLink;", "getM1M2O$korm", "()Lorg/platypus/model/field/impl/Many2OneFieldLink;", "m1M2O$delegate", "Lkotlin/Lazy;", "m2M2O", "getM2M2O$korm", "m2M2O$delegate", "getModelName", "()Ljava/lang/String;", "getOnDelete", "()Lorg/platypus/orm/ReferenceOption;", "reverse", "getReverse", "()Lorg/platypus/model/LinkModel;", "reverse$delegate", "slots", "Lorg/platypus/model/ModelSlots;", "getSlots", "()Lorg/platypus/model/ModelSlots;", "accept", "RETURN", "PARAM", "", "visitor", "Lorg/platypus/model/ModelVisitor;", "p", "(Lorg/platypus/model/ModelVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "describe", "env", "Lorg/platypus/PlatypusEnvironment;", "equals", "", "other", "findIds", "Lorg/platypus/cache/ModelIDS;", "prop", "Lorg/platypus/model/field/impl/Many2ManyField;", "modelID", "Lorg/platypus/cache/ModelID;", "findIdsR", "hashCode", "", "targetTables", "", "korm"})
public final class LinkModel<M1 extends org.platypus.model.Model<M1>, M2 extends org.platypus.model.Model<M2>> implements org.platypus.model.IModel<org.platypus.model.LinkModel<M1, M2>> {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.field.impl.PKModelField<org.platypus.model.LinkModel<M1, M2>> id = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.ModelSlots slots = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy m1M2O$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy m2M2O$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy reverse$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String modelName = null;
    private final kotlin.jvm.functions.Function0<M1> m1 = null;
    private final kotlin.jvm.functions.Function0<M2> m2 = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.ReferenceOption onDelete = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.impl.PKModelField<org.platypus.model.LinkModel<M1, M2>> getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.ModelSlots getSlots() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<org.platypus.model.field.api.IModelField<?, ?>> getFields() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<org.platypus.model.IModel<?>> targetTables() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String describe(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.Many2OneFieldLink<org.platypus.model.LinkModel<M1, M2>, M1> getM1M2O$korm() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.impl.Many2OneFieldLink<org.platypus.model.LinkModel<M1, M2>, M2> getM2M2O$korm() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <PARAM extends java.lang.Object, RETURN extends java.lang.Object>RETURN accept(@org.jetbrains.annotations.NotNull()
    org.platypus.model.ModelVisitor<? super PARAM, ? extends RETURN> visitor, @org.jetbrains.annotations.NotNull()
    PARAM p) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.LinkModel<M2, M1> getReverse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.cache.ModelIDS findIdsR(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2ManyField<M2, M1> prop, @org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelID) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.cache.ModelIDS findIds(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.Many2ManyField<M1, M2> prop, @org.jetbrains.annotations.NotNull()
    org.platypus.cache.ModelID modelID) {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getModelName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.ReferenceOption getOnDelete() {
        return null;
    }
    
    public LinkModel(@org.jetbrains.annotations.NotNull()
    java.lang.String modelName, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends M1> m1, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends M2> m2, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.ReferenceOption onDelete) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getTableName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<org.platypus.orm.sql.expression.Expression<?>> getFieldsExpression() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.dml.ColumnSet getSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.Join join(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.ColumnSet otherTable, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.Join.JoinType joinType, @org.jetbrains.annotations.Nullable()
    org.platypus.orm.sql.expression.Expression<?> onColumn, @org.jetbrains.annotations.Nullable()
    org.platypus.orm.sql.expression.Expression<?> otherColumn, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> additionalConstraint) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.Join innerJoin(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.ColumnSet otherTable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.Join leftJoin(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.ColumnSet otherTable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.query.Join crossJoin(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.dml.ColumnSet otherTable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.dml.FieldSet slice(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.Expression<?>... columns) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.sql.dml.FieldSet slice(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends org.platypus.orm.sql.expression.Expression<?>> columns) {
        return null;
    }
}