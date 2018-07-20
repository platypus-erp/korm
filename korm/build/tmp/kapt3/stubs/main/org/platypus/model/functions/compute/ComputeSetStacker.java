package org.platypus.model.functions.compute;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042D\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0006\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\t0\u0005B9\u0012\u001e\u0010\n\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\u00a2\u0006\u0002\u0010\u000eJq\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t25\u0010\u0010\u001a1\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0011\u00a2\u0006\u0002\b\u00122$\u0010\u0013\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0014H\u0016J4\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b2\u001e\u0010\u0010\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u000bH\u0016R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lorg/platypus/model/functions/compute/ComputeSetStacker;", "M", "Lorg/platypus/model/Model;", "P", "", "Lorg/platypus/model/functions/ApiParamStacker;", "Lorg/platypus/entity/Record;", "", "Lorg/platypus/model/functions/compute/ComputeSetOriginal;", "Lorg/platypus/model/functions/compute/ComputeSetExtends;", "originalFunction", "Lkotlin/Function2;", "field", "Lorg/platypus/model/field/api/ModelField;", "(Lkotlin/jvm/functions/Function2;Lorg/platypus/model/field/api/ModelField;)V", "createApiParamExtends", "funn", "Lkotlin/Function3;", "Lkotlin/ExtensionFunctionType;", "superStack", "Lorg/platypus/model/functions/ApiOneParam;", "createApiParamOriginal", "korm"})
public final class ComputeSetStacker<M extends org.platypus.model.Model<M>, P extends java.lang.Object> extends org.platypus.model.functions.ApiParamStacker<org.platypus.entity.Record<M>, M, P, kotlin.Unit, org.platypus.model.functions.compute.ComputeSetOriginal<M, P>, org.platypus.model.functions.compute.ComputeSetExtends<M, P>> {
    private final org.platypus.model.field.api.ModelField<M, P> field = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.functions.compute.ComputeSetOriginal<M, P> createApiParamOriginal(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.entity.Record<M>, ? super P, kotlin.Unit> funn) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.functions.compute.ComputeSetExtends<M, P> createApiParamExtends(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super org.platypus.model.functions.compute.ComputeSetExtends<M, P>, ? super org.platypus.entity.Record<M>, ? super P, kotlin.Unit> funn, @org.jetbrains.annotations.NotNull()
    org.platypus.model.functions.ApiOneParam<org.platypus.entity.Record<M>, M, P, kotlin.Unit> superStack) {
        return null;
    }
    
    public ComputeSetStacker(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.entity.Record<M>, ? super P, kotlin.Unit> originalFunction, @org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ModelField<M, P> field) {
        super(null);
    }
}