package org.platypus.model.field.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\b\u0012\u0004\u0012\u0002H\u00030\u00062\b\u0012\u0004\u0012\u0002H\u00030\u0007:\u0001aB#\u0012\u0006\u0010\b\u001a\u00028\u0000\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\f\u00a2\u0006\u0002\u0010\rJ\u001d\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00028\u00012\u0006\u0010S\u001a\u00028\u0001H\u0016\u00a2\u0006\u0002\u0010TJ\u0019\u0010U\u001a\u00020Q2\u000e\u0010V\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005H\u0096\u0002J\u0013\u0010W\u001a\u00020\u00142\b\u0010V\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010X\u001a\u00020QH\u0016J?\u0010Y\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020100*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010Z\u001a\u00020/2\u0012\u0010[\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020100H\u0000\u00a2\u0006\u0002\b\\J7\u0010]\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000105*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000105H\u0000\u00a2\u0006\u0002\b^J7\u0010_\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000107*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000107H\u0000\u00a2\u0006\u0002\b`R\u001e\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u000fX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R/\u0010\u0017\u001a\u001f\u0012\u0013\u0012\u00110\u0019\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0018X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\u000fX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b#\u0010\u0012R\u0014\u0010$\u001a\u0004\u0018\u00010\nX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b%\u0010!R\u0012\u0010&\u001a\u00020\u0014X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\'\u0010\u0016R\u0014\u0010(\u001a\u0004\u0018\u00010\nX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b)\u0010!R\u0016\u0010\b\u001a\u00028\u0000X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R2\u0010-\u001a \u0012\u0004\u0012\u00020/\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u000201000\u000f0.8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b2\u00103R\u001c\u00104\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u000105X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u00106\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u000107X\u0082\u000e\u00a2\u0006\u0002\n\u0000R,\u00108\u001a \u0012\u0004\u0012\u00020/\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u000201000:09X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010;\u001a\u00020\u0014X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b<\u0010\u0016R\u0012\u0010=\u001a\u00020\u0014X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b>\u0010\u0016R\u0011\u0010?\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\b@\u0010\u0016R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\fX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0012\u0010E\u001a\u00020\u0014X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bF\u0010\u0016R\u001e\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010H0\u000fX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bI\u0010\u0012R\u0012\u0010J\u001a\u00020\u0014X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bK\u0010\u0016R\u0014\u0010L\u001a\u0004\u0018\u00010MX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\bN\u0010O\u00a8\u0006b"}, d2 = {"Lorg/platypus/model/field/api/ModelField;", "M", "Lorg/platypus/model/Model;", "KOTLIN_TYPE", "", "Lorg/platypus/model/field/api/IModelField;", "Lorg/platypus/orm/sql/expression/FieldExpression;", "Lorg/platypus/model/field/api/FieldSlots;", "model", "nameField", "", "slots", "Lorg/platypus/model/field/api/FieldSlotsImpl;", "(Lorg/platypus/model/Model;Ljava/lang/String;Lorg/platypus/model/field/api/FieldSlotsImpl;)V", "constraint", "", "Lorg/platypus/orm/OrmConstraint;", "getConstraint", "()Ljava/util/Set;", "copy", "", "getCopy", "()Z", "defaultValueFun", "Lkotlin/Function1;", "Lorg/platypus/PlatypusEnvironment;", "Lkotlin/ParameterName;", "name", "env", "getDefaultValueFun", "()Lkotlin/jvm/functions/Function1;", "fieldName", "getFieldName", "()Ljava/lang/String;", "groups", "getGroups", "help", "getHelp", "index", "getIndex", "label", "getLabel", "getModel", "()Lorg/platypus/model/Model;", "Lorg/platypus/model/Model;", "onChange", "", "Lorg/platypus/model/field/api/OnChangeType;", "Lorg/platypus/model/functions/one/ApiOneNoParamStacker;", "", "getOnChange", "()Ljava/util/Map;", "onGet", "Lorg/platypus/model/functions/compute/ComputeGetStacker;", "onSet", "Lorg/platypus/model/functions/compute/ComputeSetStacker;", "privateOnChange", "Ljava/util/EnumMap;", "", "readonly", "getReadonly", "required", "getRequired", "searchable", "getSearchable", "getSlots$korm", "()Lorg/platypus/model/field/api/FieldSlotsImpl;", "setSlots$korm", "(Lorg/platypus/model/field/api/FieldSlotsImpl;)V", "store", "getStore", "transformer", "Lorg/platypus/model/field/api/FieldTransformer;", "getTransformer", "unique", "getUnique", "widget", "Lorg/platypus/UIWidget;", "getWidget", "()Lorg/platypus/UIWidget;", "compare", "", "o1", "o2", "(Ljava/lang/Object;Ljava/lang/Object;)I", "compareTo", "other", "equals", "hashCode", "addOnChange", "type", "onChangeFunction", "addOnChange$korm", "setOnGet", "setOnGet$korm", "setOnSet", "setOnSet$korm", "Builder", "korm"})
public abstract class ModelField<M extends org.platypus.model.Model<M>, KOTLIN_TYPE extends java.lang.Object> implements org.platypus.model.field.api.IModelField<M, KOTLIN_TYPE>, org.platypus.orm.sql.expression.FieldExpression<KOTLIN_TYPE>, org.platypus.model.field.api.FieldSlots<KOTLIN_TYPE> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String fieldName = null;
    private org.platypus.model.functions.compute.ComputeGetStacker<M, KOTLIN_TYPE> onGet;
    private org.platypus.model.functions.compute.ComputeSetStacker<M, KOTLIN_TYPE> onSet;
    private final java.util.EnumMap<org.platypus.model.field.api.OnChangeType, java.util.Set<org.platypus.model.functions.one.ApiOneNoParamStacker<M, kotlin.Unit>>> privateOnChange = null;
    @org.jetbrains.annotations.NotNull()
    private final M model = null;
    @org.jetbrains.annotations.NotNull()
    private org.platypus.model.field.api.FieldSlotsImpl<KOTLIN_TYPE> slots;
    
    @java.lang.Override()
    public int compare(@org.jetbrains.annotations.NotNull()
    KOTLIN_TYPE o1, @org.jetbrains.annotations.NotNull()
    KOTLIN_TYPE o2) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFieldName() {
        return null;
    }
    
    public final boolean getSearchable() {
        return false;
    }
    
    private final java.util.Map<org.platypus.model.field.api.OnChangeType, java.util.Set<org.platypus.model.functions.one.ApiOneNoParamStacker<M, kotlin.Unit>>> getOnChange() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.functions.compute.ComputeSetStacker<M, KOTLIN_TYPE> setOnSet$korm(@org.jetbrains.annotations.NotNull()
    org.platypus.model.Model<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.model.functions.compute.ComputeSetStacker<M, KOTLIN_TYPE> onSet) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.functions.compute.ComputeGetStacker<M, KOTLIN_TYPE> setOnGet$korm(@org.jetbrains.annotations.NotNull()
    org.platypus.model.Model<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.model.functions.compute.ComputeGetStacker<M, KOTLIN_TYPE> onGet) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.functions.one.ApiOneNoParamStacker<M, kotlin.Unit> addOnChange$korm(@org.jetbrains.annotations.NotNull()
    org.platypus.model.Model<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.OnChangeType type, @org.jetbrains.annotations.NotNull()
    org.platypus.model.functions.one.ApiOneNoParamStacker<M, kotlin.Unit> onChangeFunction) {
        return null;
    }
    
    @java.lang.Override()
    public int compareTo(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.IModelField<?, ?> other) {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public M getModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.field.api.FieldSlotsImpl<KOTLIN_TYPE> getSlots$korm() {
        return null;
    }
    
    public final void setSlots$korm(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.FieldSlotsImpl<KOTLIN_TYPE> p0) {
    }
    
    public ModelField(@org.jetbrains.annotations.NotNull()
    M model, @org.jetbrains.annotations.NotNull()
    java.lang.String nameField, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.FieldSlotsImpl<KOTLIN_TYPE> slots) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getCompleteName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public KOTLIN_TYPE anyToType(@org.jetbrains.annotations.NotNull()
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
    KOTLIN_TYPE value) {
        return null;
    }
    
    @java.lang.Override()
    public void validateAndThrow(@org.jetbrains.annotations.Nullable()
    KOTLIN_TYPE value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<org.platypus.orm.OrmConstraint<KOTLIN_TYPE>> getConstraint() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getCopy() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.jvm.functions.Function1<org.platypus.PlatypusEnvironment, KOTLIN_TYPE> getDefaultValueFun() {
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
    public java.util.Set<org.platypus.model.field.api.FieldTransformer<KOTLIN_TYPE>> getTransformer() {
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
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u0000*\u000e\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0014\b\u0003\u0010\u0003 \u0001*\f\u0012\u0004\u0012\u0002H\u0001\u0012\u0002\b\u00030\u00042\u00020\u0005J\r\u0010\u0006\u001a\u00028\u0003H&\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lorg/platypus/model/field/api/ModelField$Builder;", "M", "Lorg/platypus/model/Model;", "FIELD", "Lorg/platypus/model/field/api/ModelField;", "", "build", "()Lorg/platypus/model/field/api/ModelField;", "korm"})
    public static abstract interface Builder<M extends org.platypus.model.Model<M>, FIELD extends org.platypus.model.field.api.ModelField<M, ?>> {
        
        @org.jetbrains.annotations.NotNull()
        public abstract FIELD build();
    }
}