package org.platypus.model.functions.one;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0004\b\u0001\u0010\u00032>\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0005\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00070\u0004B)\u0012\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00028\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJe\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072/\u0010\u0013\u001a+\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00028\u00010\u0014\u00a2\u0006\u0002\b\u00152\u001e\u0010\u0016\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017H\u0016J.\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00028\u00010\tH\u0016R/\u0010\r\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00028\u00010\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0019"}, d2 = {"Lorg/platypus/model/functions/one/ApiOneNoParamStacker;", "M", "Lorg/platypus/model/Model;", "R", "Lorg/platypus/model/functions/ApiNoParamStacker;", "Lorg/platypus/entity/Record;", "Lorg/platypus/model/functions/one/ApiOneNoParamOriginal;", "Lorg/platypus/model/functions/one/ApiOneNoParamExtends;", "originalFunction", "Lkotlin/Function1;", "visibilityType", "Lio/ktor/http/HttpMethod;", "(Lkotlin/jvm/functions/Function1;Lio/ktor/http/HttpMethod;)V", "onMulti", "Lorg/platypus/model/functions/multi/ApiMultiNoParamStacker;", "", "getOnMulti", "()Lorg/platypus/model/functions/multi/ApiMultiNoParamStacker;", "createApiNoParamExtends", "function", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "superStack", "Lorg/platypus/model/functions/ApiNoParam;", "createApiNoParamOriginal", "korm"})
public final class ApiOneNoParamStacker<M extends org.platypus.model.Model<M>, R extends java.lang.Object> extends org.platypus.model.functions.ApiNoParamStacker<org.platypus.entity.Record<M>, M, R, org.platypus.model.functions.one.ApiOneNoParamOriginal<M, R>, org.platypus.model.functions.one.ApiOneNoParamExtends<M, R>> {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.model.functions.multi.ApiMultiNoParamStacker<M, java.util.Map<org.platypus.entity.Record<M>, R>> onMulti = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.functions.multi.ApiMultiNoParamStacker<M, java.util.Map<org.platypus.entity.Record<M>, R>> getOnMulti() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.functions.one.ApiOneNoParamOriginal<M, R> createApiNoParamOriginal(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.entity.Record<M>, ? extends R> function) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.platypus.model.functions.one.ApiOneNoParamExtends<M, R> createApiNoParamExtends(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.model.functions.one.ApiOneNoParamExtends<M, R>, ? super org.platypus.entity.Record<M>, ? extends R> function, @org.jetbrains.annotations.NotNull()
    org.platypus.model.functions.ApiNoParam<? super org.platypus.entity.Record<M>, M, ? extends R> superStack) {
        return null;
    }
    
    public ApiOneNoParamStacker(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.entity.Record<M>, ? extends R> originalFunction, @org.jetbrains.annotations.NotNull()
    io.ktor.http.HttpMethod visibilityType) {
        super(null, null);
    }
}