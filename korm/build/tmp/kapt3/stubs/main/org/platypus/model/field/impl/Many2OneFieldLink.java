package org.platypus.model.field.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00060\u00052\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00060\u00072\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00060\b2\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\tBF\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\u0006\u0010\r\u001a\u00028\u0001\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u001f\u0010\u0010\u001a\u001b\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u0011\u00a2\u0006\u0002\b\u0014\u00a2\u0006\u0002\u0010\u0015J5\u0010K\u001a\u0002HL\"\u0004\b\u0002\u0010M\"\u0004\b\u0003\u0010L2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u0002HM\u0012\u0004\u0012\u0002HL0O2\u0006\u0010P\u001a\u0002HMH\u0016\u00a2\u0006\u0002\u0010QJ5\u0010K\u001a\u0002HL\"\u0004\b\u0002\u0010R\"\u0004\b\u0003\u0010L2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u0002HR\u0012\u0004\u0012\u0002HL0S2\u0006\u0010T\u001a\u0002HRH\u0016\u00a2\u0006\u0002\u0010UJ(\u0010V\u001a\u00020W2\u000e\u0010X\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00062\u000e\u0010Y\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006H\u0016J\u0019\u0010Z\u001a\u00020W2\u000e\u0010[\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005H\u0096\u0002R$\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00180\u0017X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u00020\u0013X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR5\u0010\u001e\u001a%\u0012\u0013\u0012\u00110\u001f\u00a2\u0006\f\b \u0012\b\b\n\u0012\u0004\b\b(!\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00060\u0011X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b(\u0010\u001aR\u0014\u0010)\u001a\u0004\u0018\u00010\u000bX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b*\u0010&R\u0012\u0010+\u001a\u00020\u0013X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b,\u0010\u001dR\u0014\u0010-\u001a\u0004\u0018\u00010\u000bX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b.\u0010&R\u0016\u0010\f\u001a\u00028\u0000X\u0096\u0004\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0014\u00102\u001a\u00020\u000fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0012\u00105\u001a\u00020\u0013X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b6\u0010\u001dR\u0012\u00107\u001a\u00020\u0013X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b8\u0010\u001dR\u0012\u00109\u001a\u00020\u0013X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b:\u0010\u001dR\u0016\u0010\r\u001a\u00028\u0001X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010=\u001a\u0004\b;\u0010<R$\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060?0\u0017X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b@\u0010\u001aR\u0014\u0010A\u001a\u00020BX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0012\u0010E\u001a\u00020\u0013X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bF\u0010\u001dR\u0014\u0010G\u001a\u0004\u0018\u00010HX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bI\u0010J\u00a8\u0006\\"}, d2 = {"Lorg/platypus/model/field/impl/Many2OneFieldLink;", "M", "Lorg/platypus/model/IModel;", "TM", "Lorg/platypus/model/Model;", "Lorg/platypus/model/field/api/IModelField;", "Lorg/platypus/entity/Record;", "Lorg/platypus/model/field/api/FieldSlots;", "Lorg/platypus/orm/sql/expression/FieldExpression;", "Lorg/platypus/model/field/api/ReferencedField;", "name", "", "model", "target", "defaultOnDelete", "Lorg/platypus/orm/ReferenceOption;", "defaultDomain", "Lkotlin/Function1;", "Lorg/platypus/orm/sql/expression/Expression;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lorg/platypus/model/IModel;Lorg/platypus/model/Model;Lorg/platypus/orm/ReferenceOption;Lkotlin/jvm/functions/Function1;)V", "constraint", "", "Lorg/platypus/orm/OrmConstraint;", "getConstraint", "()Ljava/util/Set;", "copy", "getCopy", "()Z", "defaultValueFun", "Lorg/platypus/PlatypusEnvironment;", "Lkotlin/ParameterName;", "env", "getDefaultValueFun", "()Lkotlin/jvm/functions/Function1;", "fieldName", "getFieldName", "()Ljava/lang/String;", "groups", "getGroups", "help", "getHelp", "index", "getIndex", "label", "getLabel", "getModel", "()Lorg/platypus/model/IModel;", "Lorg/platypus/model/IModel;", "onDelete", "getOnDelete", "()Lorg/platypus/orm/ReferenceOption;", "readonly", "getReadonly", "required", "getRequired", "store", "getStore", "getTarget", "()Lorg/platypus/model/Model;", "Lorg/platypus/model/Model;", "transformer", "Lorg/platypus/model/field/api/FieldTransformer;", "getTransformer", "type", "Lorg/platypus/model/field/api/type/SqlFieldType;", "getType", "()Lorg/platypus/model/field/api/type/SqlFieldType;", "unique", "getUnique", "widget", "Lorg/platypus/UIWidget;", "getWidget", "()Lorg/platypus/UIWidget;", "accept", "RETURN", "PARAM_TYPE", "visitor", "Lorg/platypus/model/field/api/FieldVisitor;", "p", "(Lorg/platypus/model/field/api/FieldVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "PARAM", "Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "param", "(Lorg/platypus/orm/sql/expression/ExpressionVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "compare", "", "o1", "o2", "compareTo", "other", "korm"})
public final class Many2OneFieldLink<M extends org.platypus.model.IModel<M>, TM extends org.platypus.model.Model<TM>> implements org.platypus.model.field.api.IModelField<M, org.platypus.entity.Record<TM>>, org.platypus.model.field.api.FieldSlots<org.platypus.entity.Record<TM>>, org.platypus.orm.sql.expression.FieldExpression<org.platypus.entity.Record<TM>>, org.platypus.model.field.api.ReferencedField<M, TM> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String fieldName = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.orm.ReferenceOption onDelete = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.field.api.type.SqlFieldType type = null;
    @org.jetbrains.annotations.NotNull()
    private final M model = null;
    @org.jetbrains.annotations.NotNull()
    private final TM target = null;
    
    @java.lang.Override()
    public int compare(@org.jetbrains.annotations.Nullable()
    org.platypus.entity.Record<TM> o1, @org.jetbrains.annotations.Nullable()
    org.platypus.entity.Record<TM> o2) {
        return 0;
    }
    
    @java.lang.Override()
    public int compareTo(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<?, ?> other) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFieldName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.orm.ReferenceOption getOnDelete() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.type.SqlFieldType getType() {
        return null;
    }
    
    @java.lang.Override()
    public <PARAM_TYPE extends java.lang.Object, RETURN extends java.lang.Object>RETURN accept(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.FieldVisitor<? super PARAM_TYPE, ? extends RETURN> visitor, PARAM_TYPE p) {
        return null;
    }
    
    @java.lang.Override()
    public <PARAM extends java.lang.Object, RETURN extends java.lang.Object>RETURN accept(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.expression.ExpressionVisitor<PARAM, RETURN> visitor, PARAM param) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public M getModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public TM getTarget() {
        return null;
    }
    
    public Many2OneFieldLink(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    M model, @org.jetbrains.annotations.NotNull()
    TM target, @org.jetbrains.annotations.NotNull()
    org.platypus.orm.ReferenceOption defaultOnDelete, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super TM, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> defaultDomain) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getCompleteName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.platypus.entity.Record<TM> anyToType(@org.jetbrains.annotations.NotNull()
    java.lang.Object value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Set<java.lang.String> validateUnsafe(@org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<java.lang.String> validateNullable(@org.jetbrains.annotations.Nullable()
    org.platypus.entity.Record<TM> value) {
        return null;
    }
    
    @java.lang.Override()
    public void validateAndThrow(@org.jetbrains.annotations.Nullable()
    org.platypus.entity.Record<TM> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<org.platypus.orm.OrmConstraint<org.platypus.entity.Record<TM>>> getConstraint() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getCopy() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.jvm.functions.Function1<org.platypus.PlatypusEnvironment, org.platypus.entity.Record<TM>> getDefaultValueFun() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<java.lang.String> getGroups() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getHelp() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getIndex() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getLabel() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getReadonly() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getRequired() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getStore() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<org.platypus.model.field.api.FieldTransformer<org.platypus.entity.Record<TM>>> getTransformer() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getUnique() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.platypus.UIWidget getWidget() {
        return null;
    }
}