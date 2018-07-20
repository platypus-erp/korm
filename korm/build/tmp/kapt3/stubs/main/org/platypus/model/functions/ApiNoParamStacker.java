package org.platypus.model.functions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004*\u0004\b\u0002\u0010\u0005*&\b\u0003\u0010\u0006* \u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\b0\u0007*&\b\u0004\u0010\b* \u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\b0\t2\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00050\nB#\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ,\u0010%\u001a\u00020&2\u001d\u0010\'\u001a\u0019\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020!\u00a2\u0006\u0002\b\"H\u0010\u00a2\u0006\u0002\b(J#\u0010)\u001a\u00020&2\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120+\"\u00020\u0012H\u0000\u00a2\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00028\u00022\u0006\u0010/\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u00100J\u000e\u00101\u001a\u0002022\u0006\u00103\u001a\u000204JF\u00105\u001a\u00028\u00042\u001d\u00106\u001a\u0019\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020!\u00a2\u0006\u0002\b\"2\u0018\u00107\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\nH&\u00a2\u0006\u0002\u00108J!\u00109\u001a\u00028\u00032\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\fH&\u00a2\u0006\u0002\u0010:J?\u0010;\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\n2#\u0010\u001a\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020!\u00a2\u0006\u0002\b\"0 H\u0002J\u0019\u0010<\u001a\u00028\u00022\b\u0010/\u001a\u0004\u0018\u00010\u0002H\u0000\u00a2\u0006\u0004\b=\u00100J#\u0010>\u001a\u00020&2\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120+\"\u00020\u0012H\u0000\u00a2\u0006\u0004\b?\u0010-J#\u0010@\u001a\u00020&2\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120+\"\u00020\u0012H\u0000\u00a2\u0006\u0004\bA\u0010-J\f\u0010B\u001a\u00020&*\u000204H\u0002R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R-\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR+\u0010\u001f\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020!\u00a2\u0006\u0002\b\"0 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$\u00a8\u0006C"}, d2 = {"Lorg/platypus/model/functions/ApiNoParamStacker;", "RT", "Lorg/platypus/Environmentable;", "M", "Lorg/platypus/model/IModel;", "R", "OT", "Lorg/platypus/model/functions/ApiNoParamOriginal;", "EXT", "Lorg/platypus/model/functions/ApiNoParamExtends;", "Lorg/platypus/model/functions/ApiNoParam;", "originalFunction", "Lkotlin/Function1;", "visibilityType", "Lio/ktor/http/HttpMethod;", "(Lkotlin/jvm/functions/Function1;Lio/ktor/http/HttpMethod;)V", "methodGroups", "", "Lorg/platypus/security/PlatypusGroup;", "<set-?>", "", "methodName", "getMethodName", "()Ljava/lang/String;", "setMethodName$korm", "(Ljava/lang/String;)V", "stack", "getStack", "()Lorg/platypus/model/functions/ApiNoParam;", "stack$delegate", "Lkotlin/Lazy;", "stackFunction", "Ljava/util/LinkedList;", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "getVisibilityType", "()Lio/ktor/http/HttpMethod;", "addExtend", "", "extendFunction", "addExtend$korm", "addGroupsAccess", "groups", "", "addGroupsAccess$korm", "([Lorg/platypus/security/PlatypusGroup;)V", "call", "r", "(Lorg/platypus/Environmentable;)Ljava/lang/Object;", "canBeCalled", "", "env", "Lorg/platypus/PlatypusEnvironment;", "createApiNoParamExtends", "function", "superStack", "(Lkotlin/jvm/functions/Function2;Lorg/platypus/model/functions/ApiNoParam;)Lorg/platypus/model/functions/ApiNoParamExtends;", "createApiNoParamOriginal", "(Lkotlin/jvm/functions/Function1;)Lorg/platypus/model/functions/ApiNoParamOriginal;", "createStackSuperFun", "hardCall", "hardCall$korm", "removeGroupsAccess", "removeGroupsAccess$korm", "replaceGroupsAccess", "replaceGroupsAccess$korm", "checkAccessRight", "korm"})
public abstract class ApiNoParamStacker<RT extends org.platypus.Environmentable, M extends org.platypus.model.IModel<M>, R extends java.lang.Object, OT extends org.platypus.model.functions.ApiNoParamOriginal<RT, M, R, OT, EXT>, EXT extends org.platypus.model.functions.ApiNoParamExtends<RT, M, R, OT, EXT>> implements org.platypus.model.functions.ApiNoParam<RT, M, R> {
    private final java.util.LinkedList<kotlin.jvm.functions.Function2<EXT, RT, R>> stackFunction = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String methodName;
    private final kotlin.Lazy stack$delegate = null;
    private java.util.Set<org.platypus.security.PlatypusGroup> methodGroups;
    private final kotlin.jvm.functions.Function1<RT, R> originalFunction = null;
    @org.jetbrains.annotations.NotNull()
    private final io.ktor.http.HttpMethod visibilityType = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMethodName() {
        return null;
    }
    
    public final void setMethodName$korm(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    private final org.platypus.model.functions.ApiNoParam<RT, M, R> getStack() {
        return null;
    }
    
    @java.lang.Override()
    public R call(@org.jetbrains.annotations.NotNull()
    RT r) {
        return null;
    }
    
    public final boolean canBeCalled(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env) {
        return false;
    }
    
    private final void checkAccessRight(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment $receiver) {
    }
    
    public final R hardCall$korm(@org.jetbrains.annotations.Nullable()
    org.platypus.Environmentable r) {
        return null;
    }
    
    private final org.platypus.model.functions.ApiNoParam<RT, M, R> createStackSuperFun(java.util.LinkedList<kotlin.jvm.functions.Function2<EXT, RT, R>> stack) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract OT createApiNoParamOriginal(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super RT, ? extends R> function);
    
    @org.jetbrains.annotations.NotNull()
    public abstract EXT createApiNoParamExtends(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super EXT, ? super RT, ? extends R> function, @org.jetbrains.annotations.NotNull()
    org.platypus.model.functions.ApiNoParam<? super RT, M, ? extends R> superStack);
    
    public void addExtend$korm(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super EXT, ? super RT, ? extends R> extendFunction) {
    }
    
    public final void addGroupsAccess$korm(@org.jetbrains.annotations.NotNull()
    org.platypus.security.PlatypusGroup... groups) {
    }
    
    public final void removeGroupsAccess$korm(@org.jetbrains.annotations.NotNull()
    org.platypus.security.PlatypusGroup... groups) {
    }
    
    public final void replaceGroupsAccess$korm(@org.jetbrains.annotations.NotNull()
    org.platypus.security.PlatypusGroup... groups) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.ktor.http.HttpMethod getVisibilityType() {
        return null;
    }
    
    public ApiNoParamStacker(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super RT, ? extends R> originalFunction, @org.jetbrains.annotations.NotNull()
    io.ktor.http.HttpMethod visibilityType) {
        super();
    }
}