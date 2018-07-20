package org.platypus.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0005J%\u0010\u0006\u001a\u00020\u001e2\u001d\u0010\u001f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\u001e0\u000b\u00a2\u0006\u0002\b J%\u0010!\u001a\u00020\u001e2\u001d\u0010\u001f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\u0004\u0012\u00020\u001e0\u000b\u00a2\u0006\u0002\b J%\u0010\"\u001a\u00020\u001e2\u001d\u0010\u001f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\u0004\u0012\u00020\u001e0\u000b\u00a2\u0006\u0002\b J%\u0010#\u001a\u00020\u001e2\u001d\u0010\u001f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$\u0012\u0004\u0012\u00020\u001e0\u000b\u00a2\u0006\u0002\b J%\u0010\u0016\u001a\u00020\u001e2\u001d\u0010\u001f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\u0004\u0012\u00020\u001e0\u000b\u00a2\u0006\u0002\b R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR2\u0010\n\u001a#\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006%"}, d2 = {"Lorg/platypus/module/ModelDataHolder;", "M", "Lorg/platypus/model/Model;", "", "model", "(Lorg/platypus/model/Model;)V", "actions", "Lorg/platypus/module/ActionHolder;", "getActions", "()Lorg/platypus/module/ActionHolder;", "factory", "Lkotlin/Function1;", "Lorg/platypus/PlatypusEnvironment;", "Lkotlin/ParameterName;", "name", "env", "Lorg/platypus/repository/RecordRepository;", "getFactory", "()Lkotlin/jvm/functions/Function1;", "getModel", "()Lorg/platypus/model/Model;", "Lorg/platypus/model/Model;", "views", "Lorg/platypus/module/ModelViewsHolder;", "getViews", "()Lorg/platypus/module/ModelViewsHolder;", "webRoutes", "Lorg/platypus/module/ModelRouteHolder;", "getWebRoutes", "()Lorg/platypus/module/ModelRouteHolder;", "", "def", "Lkotlin/ExtensionFunctionType;", "menus", "route", "security", "Lorg/platypus/module/ModelSecurityHolder;", "korm"})
public final class ModelDataHolder<M extends org.platypus.model.Model<M>> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<org.platypus.PlatypusEnvironment, org.platypus.repository.RecordRepository<M>> factory = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.module.ModelRouteHolder<M> webRoutes = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.module.ModelViewsHolder<M> views = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.module.ActionHolder<M> actions = null;
    @org.jetbrains.annotations.NotNull()
    private final M model = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<org.platypus.PlatypusEnvironment, org.platypus.repository.RecordRepository<M>> getFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.module.ModelRouteHolder<M> getWebRoutes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.module.ModelViewsHolder<M> getViews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.module.ActionHolder<M> getActions() {
        return null;
    }
    
    public final void route(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.module.ModelRouteHolder<M>, kotlin.Unit> def) {
    }
    
    public final void views(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.module.ModelViewsHolder<M>, kotlin.Unit> def) {
    }
    
    public final void actions(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.module.ActionHolder<M>, kotlin.Unit> def) {
    }
    
    public final void menus(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.module.ModelViewsHolder<M>, kotlin.Unit> def) {
    }
    
    public final void security(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.module.ModelSecurityHolder<M>, kotlin.Unit> def) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final M getModel() {
        return null;
    }
    
    public ModelDataHolder(@org.jetbrains.annotations.NotNull()
    M model) {
        super();
    }
}