package org.platypus.model.field.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00022\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00050\u0004:\u0001:Bc\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00028\u0000\u0012\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u000b0\n\u0012\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0018\u00010\n\u00a2\u0006\u0002\u0010\u0013J5\u0010\'\u001a\u0002H(\"\u0004\b\u0002\u0010)\"\u0004\b\u0003\u0010(2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u0002H(0+2\u0006\u0010,\u001a\u0002H)H\u0016\u00a2\u0006\u0002\u0010-J5\u0010\'\u001a\u0002H(\"\u0004\b\u0002\u0010.\"\u0004\b\u0003\u0010(2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u0002H.\u0012\u0004\u0012\u0002H(0/2\u0006\u00100\u001a\u0002H.H\u0016\u00a2\u0006\u0002\u00101J\f\u00102\u001a\b\u0012\u0004\u0012\u00020403J!\u00105\u001a\u0002062\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000108H\u0000\u00a2\u0006\u0002\b9R@\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0018\u00010\n2\u0014\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0018\u00010\n@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u0012X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R#\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0014\u0010#\u001a\u00020$8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010&\u00a8\u0006;"}, d2 = {"Lorg/platypus/model/field/impl/RevOne2OneField;", "M", "Lorg/platypus/model/Model;", "TM", "Lorg/platypus/model/field/api/ModelField;", "Lorg/platypus/entity/Record;", "name", "", "model", "targetField", "Lkotlin/Function0;", "Lorg/platypus/model/field/impl/One2OneField;", "slots", "Lorg/platypus/model/field/api/FieldSlotsImpl;", "defaultOnDelete", "Lorg/platypus/orm/ReferenceOption;", "defaultDomain", "Lorg/platypus/orm/sql/expression/Expression;", "", "(Ljava/lang/String;Lorg/platypus/model/Model;Lkotlin/jvm/functions/Function0;Lorg/platypus/model/field/api/FieldSlotsImpl;Lorg/platypus/orm/ReferenceOption;Lkotlin/jvm/functions/Function0;)V", "<set-?>", "domain", "getDomain", "()Lkotlin/jvm/functions/Function0;", "setDomain", "(Lkotlin/jvm/functions/Function0;)V", "onDelete", "getOnDelete", "()Lorg/platypus/orm/ReferenceOption;", "setOnDelete", "(Lorg/platypus/orm/ReferenceOption;)V", "store", "getStore", "()Z", "getTargetField", "type", "Lorg/platypus/model/field/api/type/SqlFieldType;", "getType", "()Lorg/platypus/model/field/api/type/SqlFieldType;", "accept", "RETURN", "PARAM_TYPE", "visitor", "Lorg/platypus/model/field/api/FieldVisitor;", "p", "(Lorg/platypus/model/field/api/FieldVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "PARAM", "Lorg/platypus/orm/sql/expression/ExpressionVisitor;", "param", "(Lorg/platypus/orm/sql/expression/ExpressionVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "asExpr", "Lorg/platypus/orm/sql/expression/TypedExpression;", "", "merge", "", "f", "Lorg/platypus/model/field/impl/RevOne2OneField$Builder;", "merge$korm", "Builder", "korm"})
public final class RevOne2OneField<M extends org.platypus.model.Model<M>, TM extends org.platypus.model.Model<TM>> extends org.platypus.model.field.api.ModelField<M, org.platypus.entity.Record<TM>> {
    private final boolean store = false;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> domain;
    @org.jetbrains.annotations.NotNull()
    private org.platypus.orm.ReferenceOption onDelete;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<org.platypus.model.field.impl.One2OneField<TM, M>> targetField = null;
    
    @java.lang.Override()
    public boolean getStore() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> getDomain() {
        return null;
    }
    
    private final void setDomain(kotlin.jvm.functions.Function0<? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.ReferenceOption getOnDelete() {
        return null;
    }
    
    private final void setOnDelete(org.platypus.orm.ReferenceOption p0) {
    }
    
    public final void merge$korm(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.impl.RevOne2OneField.Builder<M, TM> f) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.field.api.type.SqlFieldType getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.orm.sql.expression.TypedExpression<java.lang.Integer> asExpr() {
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
    public final kotlin.jvm.functions.Function0<org.platypus.model.field.impl.One2OneField<TM, M>> getTargetField() {
        return null;
    }
    
    public RevOne2OneField(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    M model, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<org.platypus.model.field.impl.One2OneField<TM, M>> targetField, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.FieldSlotsImpl<org.platypus.entity.Record<TM>> slots, @org.jetbrains.annotations.Nullable()
    org.platypus.orm.ReferenceOption defaultOnDelete, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> defaultDomain) {
        super(null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u000e\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u000e\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00022\u001a\u0012\u0004\u0012\u0002H\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00050\u00042\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00070\u0006B1\b\u0016\u0012\u0006\u0010\b\u001a\u00028\u0002\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00020\r0\f\u00a2\u0006\u0002\u0010\u000eBE\b\u0002\u0012\u0006\u0010\b\u001a\u00028\u0002\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00020\r0\f\u0012\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00070\u0006\u00a2\u0006\u0002\u0010\u0010J\u001a\u0010b\u001a\u00020c2\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00070\u0013J\u0014\u0010d\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005H\u0016J\u0015\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00070fH\u0096\u0001R*\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00070\u00130\u0012X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u0007X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R;\u0010#\u001a%\u0012\u0013\u0012\u00110%\u00a2\u0006\f\b&\u0012\b\b\'\u0012\u0004\b\b((\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u0007\u0018\u00010$X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R(\u0010-\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190.\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0018\u00105\u001a\b\u0012\u0004\u0012\u00020\n06X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b7\u0010\u0015R\u001a\u00108\u001a\u0004\u0018\u00010\nX\u0096\u000f\u00a2\u0006\f\u001a\u0004\b9\u00104\"\u0004\b:\u0010;R\u001a\u0010<\u001a\u0004\u0018\u00010\u0019X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b=\u0010\u001b\"\u0004\b>\u0010\u001dR\u001a\u0010?\u001a\u0004\u0018\u00010\nX\u0096\u000f\u00a2\u0006\f\u001a\u0004\b@\u00104\"\u0004\bA\u0010;R\u0013\u0010\b\u001a\u00028\u0002\u00a2\u0006\n\n\u0002\u0010D\u001a\u0004\bB\u0010CR\u001c\u0010E\u001a\u0004\u0018\u00010FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010K\u001a\u0004\u0018\u00010\u0019X\u0096\u000f\u00a2\u0006\f\u001a\u0004\bL\u0010\u001b\"\u0004\bM\u0010\u001dR\u001a\u0010N\u001a\u0004\u0018\u00010\u0019X\u0096\u000f\u00a2\u0006\f\u001a\u0004\bO\u0010\u001b\"\u0004\bP\u0010\u001dR\u001a\u0010Q\u001a\u0004\u0018\u00010\u0019X\u0096\u000f\u00a2\u0006\f\u001a\u0004\bR\u0010\u001b\"\u0004\bS\u0010\u001dR#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u00100R*\u0010U\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00070V0\u0012X\u0096\u000f\u00a2\u0006\f\u001a\u0004\bW\u0010\u0015\"\u0004\bX\u0010\u0017R\u001a\u0010Y\u001a\u0004\u0018\u00010\u0019X\u0096\u000f\u00a2\u0006\f\u001a\u0004\bZ\u0010\u001b\"\u0004\b[\u0010\u001dR\u001a\u0010\\\u001a\u0004\u0018\u00010]X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b^\u0010_\"\u0004\b`\u0010a\u00a8\u0006g"}, d2 = {"Lorg/platypus/model/field/impl/RevOne2OneField$Builder;", "M", "Lorg/platypus/model/Model;", "TM", "Lorg/platypus/model/field/api/ModelField$Builder;", "Lorg/platypus/model/field/impl/RevOne2OneField;", "Lorg/platypus/model/field/api/MutableFieldSlots;", "Lorg/platypus/entity/Record;", "model", "fieldName", "", "targetField", "Lkotlin/Function0;", "Lorg/platypus/model/field/impl/One2OneField;", "(Lorg/platypus/model/Model;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "slots", "(Lorg/platypus/model/Model;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lorg/platypus/model/field/api/MutableFieldSlots;)V", "constraint", "", "Lorg/platypus/orm/OrmConstraint;", "getConstraint", "()Ljava/util/Set;", "setConstraint", "(Ljava/util/Set;)V", "copy", "", "getCopy", "()Ljava/lang/Boolean;", "setCopy", "(Ljava/lang/Boolean;)V", "default", "getDefault", "()Lorg/platypus/entity/Record;", "setDefault", "(Lorg/platypus/entity/Record;)V", "defaultValueFun", "Lkotlin/Function1;", "Lorg/platypus/PlatypusEnvironment;", "Lkotlin/ParameterName;", "name", "env", "getDefaultValueFun", "()Lkotlin/jvm/functions/Function1;", "setDefaultValueFun", "(Lkotlin/jvm/functions/Function1;)V", "domain", "Lorg/platypus/orm/sql/expression/Expression;", "getDomain", "()Lkotlin/jvm/functions/Function0;", "setDomain", "(Lkotlin/jvm/functions/Function0;)V", "getFieldName", "()Ljava/lang/String;", "groups", "", "getGroups", "help", "getHelp", "setHelp", "(Ljava/lang/String;)V", "index", "getIndex", "setIndex", "label", "getLabel", "setLabel", "getModel", "()Lorg/platypus/model/Model;", "Lorg/platypus/model/Model;", "onDelete", "Lorg/platypus/orm/ReferenceOption;", "getOnDelete", "()Lorg/platypus/orm/ReferenceOption;", "setOnDelete", "(Lorg/platypus/orm/ReferenceOption;)V", "readonly", "getReadonly", "setReadonly", "required", "getRequired", "setRequired", "store", "getStore", "setStore", "getTargetField", "transformer", "Lorg/platypus/model/field/api/FieldTransformer;", "getTransformer", "setTransformer", "unique", "getUnique", "setUnique", "widget", "Lorg/platypus/UIWidget;", "getWidget", "()Lorg/platypus/UIWidget;", "setWidget", "(Lorg/platypus/UIWidget;)V", "add", "", "build", "toSlots", "Lorg/platypus/model/field/api/FieldSlotsImpl;", "korm"})
    public static final class Builder<M extends org.platypus.model.Model<M>, TM extends org.platypus.model.Model<TM>> implements org.platypus.model.field.api.ModelField.Builder<M, org.platypus.model.field.impl.RevOne2OneField<M, TM>>, org.platypus.model.field.api.MutableFieldSlots<org.platypus.entity.Record<TM>> {
        @org.jetbrains.annotations.Nullable()
        private org.platypus.orm.ReferenceOption onDelete;
        @org.jetbrains.annotations.Nullable()
        private kotlin.jvm.functions.Function0<? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> domain;
        @org.jetbrains.annotations.NotNull()
        private final M model = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String fieldName = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<org.platypus.model.field.impl.One2OneField<TM, M>> targetField = null;
        
        @org.jetbrains.annotations.Nullable()
        public final org.platypus.orm.ReferenceOption getOnDelete() {
            return null;
        }
        
        public final void setOnDelete(@org.jetbrains.annotations.Nullable()
        org.platypus.orm.ReferenceOption p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function0<org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> getDomain() {
            return null;
        }
        
        public final void setDomain(@org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function0<? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> p0) {
        }
        
        public final void add(@org.jetbrains.annotations.NotNull()
        org.platypus.orm.OrmConstraint<org.platypus.entity.Record<TM>> constraint) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.platypus.model.field.impl.RevOne2OneField<M, TM> build() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final M getModel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFieldName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<org.platypus.model.field.impl.One2OneField<TM, M>> getTargetField() {
            return null;
        }
        
        private Builder(M model, java.lang.String fieldName, kotlin.jvm.functions.Function0<org.platypus.model.field.impl.One2OneField<TM, M>> targetField, org.platypus.model.field.api.MutableFieldSlots<org.platypus.entity.Record<TM>> slots) {
            super();
        }
        
        public Builder(@org.jetbrains.annotations.NotNull()
        M model, @org.jetbrains.annotations.NotNull()
        java.lang.String fieldName, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<org.platypus.model.field.impl.One2OneField<TM, M>> targetField) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.Set<org.platypus.orm.OrmConstraint<org.platypus.entity.Record<TM>>> getConstraint() {
            return null;
        }
        
        @java.lang.Override()
        public void setConstraint(@org.jetbrains.annotations.NotNull()
        java.util.Set<org.platypus.orm.OrmConstraint<org.platypus.entity.Record<TM>>> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.Boolean getCopy() {
            return null;
        }
        
        @java.lang.Override()
        public void setCopy(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public org.platypus.entity.Record<TM> getDefault() {
            return null;
        }
        
        @java.lang.Override()
        public void setDefault(@org.jetbrains.annotations.Nullable()
        org.platypus.entity.Record<TM> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public kotlin.jvm.functions.Function1<org.platypus.PlatypusEnvironment, org.platypus.entity.Record<TM>> getDefaultValueFun() {
            return null;
        }
        
        @java.lang.Override()
        public void setDefaultValueFun(@org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super org.platypus.PlatypusEnvironment, ? extends org.platypus.entity.Record<TM>> p0) {
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
        public void setHelp(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.Boolean getIndex() {
            return null;
        }
        
        @java.lang.Override()
        public void setIndex(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.String getLabel() {
            return null;
        }
        
        @java.lang.Override()
        public void setLabel(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.Boolean getReadonly() {
            return null;
        }
        
        @java.lang.Override()
        public void setReadonly(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.Boolean getRequired() {
            return null;
        }
        
        @java.lang.Override()
        public void setRequired(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.Boolean getStore() {
            return null;
        }
        
        @java.lang.Override()
        public void setStore(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.Set<org.platypus.model.field.api.FieldTransformer<org.platypus.entity.Record<TM>>> getTransformer() {
            return null;
        }
        
        @java.lang.Override()
        public void setTransformer(@org.jetbrains.annotations.NotNull()
        java.util.Set<org.platypus.model.field.api.FieldTransformer<org.platypus.entity.Record<TM>>> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.Boolean getUnique() {
            return null;
        }
        
        @java.lang.Override()
        public void setUnique(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public org.platypus.UIWidget getWidget() {
            return null;
        }
        
        @java.lang.Override()
        public void setWidget(@org.jetbrains.annotations.Nullable()
        org.platypus.UIWidget p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.platypus.model.field.api.FieldSlotsImpl<org.platypus.entity.Record<TM>> toSlots() {
            return null;
        }
    }
}