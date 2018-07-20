package org.platypus.model.functions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\b\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004*\u0004\b\u0002\u0010\u0005*\u0004\b\u0003\u0010\u0006*,\b\u0004\u0010\u0007*&\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\t0\b*,\b\u0005\u0010\t*&\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\t0\n2\u001a\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u000bB.\u0012\'\u0010\f\u001a#\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0002\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00028\u00030\r\u00a2\u0006\u0002\u0010\u0011J2\u0010\'\u001a\u00020(2#\u0010)\u001a\u001f\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030%\u00a2\u0006\u0002\b&H\u0000\u00a2\u0006\u0002\b*J#\u0010+\u001a\u00020(2\u0012\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140-\"\u00020\u0014H\u0000\u00a2\u0006\u0004\b.\u0010/J\u001d\u00100\u001a\u00028\u00032\u0006\u00101\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0002H\u0016\u00a2\u0006\u0002\u00102J\u000e\u00103\u001a\u0002042\u0006\u00105\u001a\u000206JR\u00107\u001a\u00028\u00052#\u00108\u001a\u001f\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030%\u00a2\u0006\u0002\b&2\u001e\u00109\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000bH&\u00a2\u0006\u0002\u0010:J\'\u0010;\u001a\u00028\u00042\u0018\u00108\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\rH&\u00a2\u0006\u0002\u0010<JI\u0010=\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000b2)\u0010\u001e\u001a%\u0012!\u0012\u001f\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030%\u00a2\u0006\u0002\b&0$J#\u0010>\u001a\u00028\u00032\b\u00101\u001a\u0004\u0018\u00010?2\b\u0010\u0010\u001a\u0004\u0018\u00010?H\u0000\u00a2\u0006\u0004\b@\u0010AJ#\u0010B\u001a\u00020(2\u0012\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140-\"\u00020\u0014H\u0000\u00a2\u0006\u0004\bC\u0010/J#\u0010D\u001a\u00020(2\u0012\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140-\"\u00020\u0014H\u0000\u00a2\u0006\u0004\bE\u0010/J\f\u0010F\u001a\u00020(*\u000206H\u0002R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR5\u0010\f\u001a#\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0002\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00028\u00030\rX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR3\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R1\u0010#\u001a%\u0012!\u0012\u001f\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030%\u00a2\u0006\u0002\b&0$X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006G"}, d2 = {"Lorg/platypus/model/functions/ApiParamStacker;", "RT", "Lorg/platypus/Environmentable;", "M", "Lorg/platypus/model/IModel;", "P", "R", "OT", "Lorg/platypus/model/functions/ApiParamOriginal;", "EXT", "Lorg/platypus/model/functions/ApiParamExtends;", "Lorg/platypus/model/functions/ApiOneParam;", "originalFunction", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "param", "(Lkotlin/jvm/functions/Function2;)V", "methodGroups", "", "Lorg/platypus/security/PlatypusGroup;", "<set-?>", "", "methodName", "getMethodName", "()Ljava/lang/String;", "setMethodName$korm", "(Ljava/lang/String;)V", "getOriginalFunction", "()Lkotlin/jvm/functions/Function2;", "stack", "getStack", "()Lorg/platypus/model/functions/ApiOneParam;", "stack$delegate", "Lkotlin/Lazy;", "stackFunction", "Ljava/util/LinkedList;", "Lkotlin/Function3;", "Lkotlin/ExtensionFunctionType;", "addExtend", "", "extendFunction", "addExtend$korm", "addGroupsAccess", "groups", "", "addGroupsAccess$korm", "([Lorg/platypus/security/PlatypusGroup;)V", "call", "r", "(Lorg/platypus/Environmentable;Ljava/lang/Object;)Ljava/lang/Object;", "canBeCalled", "", "env", "Lorg/platypus/PlatypusEnvironment;", "createApiParamExtends", "funn", "superStack", "(Lkotlin/jvm/functions/Function3;Lorg/platypus/model/functions/ApiOneParam;)Lorg/platypus/model/functions/ApiParamExtends;", "createApiParamOriginal", "(Lkotlin/jvm/functions/Function2;)Lorg/platypus/model/functions/ApiParamOriginal;", "createStackSuperFun", "hardCall", "", "hardCall$korm", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "removeGroupsAccess", "removeGroupsAccess$korm", "replaceGroupsAccess", "replaceGroupsAccess$korm", "checkAccessRight", "korm"})
public abstract class ApiParamStacker<RT extends org.platypus.Environmentable, M extends org.platypus.model.IModel<M>, P extends java.lang.Object, R extends java.lang.Object, OT extends org.platypus.model.functions.ApiParamOriginal<RT, M, P, R, OT, EXT>, EXT extends org.platypus.model.functions.ApiParamExtends<RT, M, P, R, OT, EXT>> implements org.platypus.model.functions.ApiOneParam<RT, M, P, R> {
    private final java.util.LinkedList<kotlin.jvm.functions.Function3<EXT, RT, P, R>> stackFunction = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String methodName;
    private final kotlin.Lazy stack$delegate = null;
    private java.util.Set<org.platypus.security.PlatypusGroup> methodGroups;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<RT, P, R> originalFunction = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMethodName() {
        return null;
    }
    
    public final void setMethodName$korm(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    private final org.platypus.model.functions.ApiOneParam<RT, M, P, R> getStack() {
        return null;
    }
    
    @java.lang.Override()
    public R call(@org.jetbrains.annotations.NotNull()
    RT r, P param) {
        return null;
    }
    
    public final R hardCall$korm(@org.jetbrains.annotations.Nullable()
    java.lang.Object r, @org.jetbrains.annotations.Nullable()
    java.lang.Object param) {
        return null;
    }
    
    public final boolean canBeCalled(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env) {
        return false;
    }
    
    private final void checkAccessRight(@org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment $receiver) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.model.functions.ApiOneParam<RT, M, P, R> createStackSuperFun(@org.jetbrains.annotations.NotNull()
    java.util.LinkedList<kotlin.jvm.functions.Function3<EXT, RT, P, R>> stack) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract OT createApiParamOriginal(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super RT, ? super P, ? extends R> funn);
    
    @org.jetbrains.annotations.NotNull()
    public abstract EXT createApiParamExtends(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super EXT, ? super RT, ? super P, ? extends R> funn, @org.jetbrains.annotations.NotNull()
    org.platypus.model.functions.ApiOneParam<RT, M, P, R> superStack);
    
    public final void addExtend$korm(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super EXT, ? super RT, ? super P, ? extends R> extendFunction) {
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
    protected final kotlin.jvm.functions.Function2<RT, P, R> getOriginalFunction() {
        return null;
    }
    
    public ApiParamStacker(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super RT, ? super P, ? extends R> originalFunction) {
        super();
    }
}