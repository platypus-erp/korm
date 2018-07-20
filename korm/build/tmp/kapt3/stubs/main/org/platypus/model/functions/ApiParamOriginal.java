package org.platypus.model.functions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004*\u0004\b\u0002\u0010\u0005*\u0004\b\u0003\u0010\u0006*,\b\u0004\u0010\u0007*&\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u0000*,\b\u0005\u0010\b*&\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\t2\u001a\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\nB\u001f\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\f\u00a2\u0006\u0002\u0010\rJ\u001d\u0010\u000e\u001a\u00028\u00032\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0002H\u0016\u00a2\u0006\u0002\u0010\u0011R \u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/platypus/model/functions/ApiParamOriginal;", "RT", "Lorg/platypus/Environmentable;", "M", "Lorg/platypus/model/IModel;", "P", "R", "OT", "EXT", "Lorg/platypus/model/functions/ApiParamExtends;", "Lorg/platypus/model/functions/ApiOneParam;", "originalFunction", "Lkotlin/Function2;", "(Lkotlin/jvm/functions/Function2;)V", "call", "r", "param", "(Lorg/platypus/Environmentable;Ljava/lang/Object;)Ljava/lang/Object;", "korm"})
public abstract class ApiParamOriginal<RT extends org.platypus.Environmentable, M extends org.platypus.model.IModel<M>, P extends java.lang.Object, R extends java.lang.Object, OT extends org.platypus.model.functions.ApiParamOriginal<RT, M, P, R, OT, EXT>, EXT extends org.platypus.model.functions.ApiParamExtends<RT, M, P, R, OT, EXT>> implements org.platypus.model.functions.ApiOneParam<RT, M, P, R> {
    private final kotlin.jvm.functions.Function2<RT, P, R> originalFunction = null;
    
    @java.lang.Override()
    public R call(@org.jetbrains.annotations.NotNull()
    RT r, P param) {
        return null;
    }
    
    public ApiParamOriginal(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super RT, ? super P, ? extends R> originalFunction) {
        super();
    }
}