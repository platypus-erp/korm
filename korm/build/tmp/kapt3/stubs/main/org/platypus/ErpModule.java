package org.platypus;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00060(H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006H\u0016J7\u0010\u0015\u001a1\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012#\u0012!\u0012\u0013\u0012\u00110\u0017\u00a2\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b0\u00160\u0004H\u0016J\u0012\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u000bH\u0016J\u001e\u0010\"\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u000b0\u0004H\u0016J\"\u0010%\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030&0\u000b0\u0004H\u0016R+\u0010\u0003\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR@\u0010\u0015\u001a1\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012#\u0012!\u0012\u0013\u0012\u00110\u0017\u00a2\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b0\u00160\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\tR\u001b\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000eR\u0014\u0010\u0019\u001a\u00020\u001fX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\'\u0010\"\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u000b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\tR+\u0010%\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030&0\u000b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\t\u00a8\u0006)"}, d2 = {"Lorg/platypus/ErpModule;", "Lorg/platypus/module/PlatypusModuleInfo;", "()V", "actions", "", "Lorg/platypus/model/Model;", "", "Lorg/platypus/ui/action/UIMenuAction;", "getActions", "()Ljava/util/Map;", "datas", "", "Lorg/platypus/module/ModuleDataHolder;", "getDatas", "()Ljava/util/Set;", "depends", "Lorg/platypus/module/ModuleDef;", "getDepends", "menus", "Lorg/platypus/ui/menu/UIMenu;", "getMenus", "modelFactory", "Lkotlin/Function1;", "Lorg/platypus/PlatypusEnvironment;", "Lkotlin/ParameterName;", "name", "env", "Lorg/platypus/repository/RecordRepository;", "getModelFactory", "models", "getModels", "", "getName", "()Ljava/lang/String;", "routes", "Lorg/platypus/web/RouteFactory;", "getRoutes", "views", "Lorg/platypus/ui/ToViewApi;", "getViews", "", "korm"})
public final class ErpModule implements org.platypus.module.PlatypusModuleInfo {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String name = "platypus-erp-module";
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Set<org.platypus.model.Model<?>> models = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Set<org.platypus.module.ModuleDef> depends = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Set<org.platypus.module.ModuleDataHolder> datas = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<org.platypus.model.Model<?>, java.util.Set<org.platypus.web.RouteFactory>> routes = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<org.platypus.model.Model<?>, kotlin.jvm.functions.Function1<org.platypus.PlatypusEnvironment, org.platypus.repository.RecordRepository<?>>> modelFactory = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<org.platypus.model.Model<?>, java.util.Set<org.platypus.ui.ToViewApi<?>>> views = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<org.platypus.model.Model<?>, java.util.Set<org.platypus.ui.action.UIMenuAction<?>>> actions = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Set<org.platypus.ui.menu.UIMenu> menus = null;
    public static final org.platypus.ErpModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.platypus.model.Model<?>> getModels() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.platypus.module.ModuleDef> getDepends() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.platypus.module.ModuleDataHolder> getDatas() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<org.platypus.model.Model<?>, java.util.Set<org.platypus.web.RouteFactory>> getRoutes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<org.platypus.model.Model<?>, kotlin.jvm.functions.Function1<org.platypus.PlatypusEnvironment, org.platypus.repository.RecordRepository<?>>> getModelFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<org.platypus.model.Model<?>, java.util.Set<org.platypus.ui.ToViewApi<?>>> getViews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<org.platypus.model.Model<?>, java.util.Set<org.platypus.ui.action.UIMenuAction<?>>> getActions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.platypus.ui.menu.UIMenu> getMenus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<org.platypus.model.Model<?>, java.util.Set<org.platypus.ui.action.UIMenuAction<?>>> actions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<org.platypus.ui.menu.UIMenu> menus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<org.platypus.model.Model<?>> models() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<org.platypus.module.PlatypusModuleInfo> depends() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Set<org.platypus.module.ModuleDataHolder> datas() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<org.platypus.model.Model<?>, java.util.Set<org.platypus.web.RouteFactory>> routes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<org.platypus.model.Model<?>, kotlin.jvm.functions.Function1<org.platypus.PlatypusEnvironment, org.platypus.repository.RecordRepository<?>>> modelFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<org.platypus.model.Model<?>, java.util.Set<org.platypus.ui.ToViewApi<?>>> views() {
        return null;
    }
    
    private ErpModule() {
        super();
    }
}