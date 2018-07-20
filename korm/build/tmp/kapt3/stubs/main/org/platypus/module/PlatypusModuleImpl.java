package org.platypus.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u00e2\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u001c\u0010\u000b\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\f\u00125\u0010\u000e\u001a1\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012#\u0012!\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u0011\u0012\b\b\u0002\u0012\u0004\b\b(\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u000f0\f\u0012 \u0010\u0014\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u00050\f\u0012 \u0010\u0016\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u00050\f\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0005\u00a2\u0006\u0002\u0010\u001aJ\"\u0010\u0016\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u00050\fH\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0005H\u0016J7\u0010\u000e\u001a1\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012#\u0012!\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u0011\u0012\b\b\u0002\u0012\u0004\b\b(\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u000f0\fH\u0016J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005H\u0016J\u001e\u0010\u000b\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\fH\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016J\"\u0010\u0014\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u00050\fH\u0016R(\u0010\u0016\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u00050\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R=\u0010\u000e\u001a1\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012#\u0012!\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u0011\u0012\b\b\u0002\u0012\u0004\b\b(\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u000b\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0014\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u00050\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lorg/platypus/module/PlatypusModuleImpl;", "Lorg/platypus/module/PlatypusModuleInfo;", "name", "", "models", "", "Lorg/platypus/model/Model;", "depends", "Lorg/platypus/module/ModuleBuilder;", "datas", "Lorg/platypus/module/ModuleDataHolder;", "routes", "", "Lorg/platypus/web/RouteFactory;", "modelFactory", "Lkotlin/Function1;", "Lorg/platypus/PlatypusEnvironment;", "Lkotlin/ParameterName;", "env", "Lorg/platypus/repository/RecordRepository;", "views", "Lorg/platypus/ui/ToViewApi;", "actions", "Lorg/platypus/ui/action/UIMenuAction;", "menus", "Lorg/platypus/ui/menu/UIMenu;", "(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)V", "getName", "()Ljava/lang/String;", "toString", "korm"})
public final class PlatypusModuleImpl implements org.platypus.module.PlatypusModuleInfo {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final java.util.Set<org.platypus.model.Model<?>> models = null;
    private final java.util.Set<org.platypus.module.ModuleBuilder> depends = null;
    private final java.util.Set<org.platypus.module.ModuleDataHolder> datas = null;
    private final java.util.Map<org.platypus.model.Model<?>, java.util.Set<org.platypus.web.RouteFactory>> routes = null;
    private final java.util.Map<org.platypus.model.Model<?>, kotlin.jvm.functions.Function1<org.platypus.PlatypusEnvironment, org.platypus.repository.RecordRepository<?>>> modelFactory = null;
    private final java.util.Map<org.platypus.model.Model<?>, java.util.Set<org.platypus.ui.ToViewApi<?>>> views = null;
    private final java.util.Map<org.platypus.model.Model<?>, java.util.Set<org.platypus.ui.action.UIMenuAction<?>>> actions = null;
    private final java.util.Set<org.platypus.ui.menu.UIMenu> menus = null;
    
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
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
    
    public PlatypusModuleImpl(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends org.platypus.model.Model<?>> models, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends org.platypus.module.ModuleBuilder> depends, @org.jetbrains.annotations.NotNull()
    java.util.Set<org.platypus.module.ModuleDataHolder> datas, @org.jetbrains.annotations.NotNull()
    java.util.Map<org.platypus.model.Model<?>, ? extends java.util.Set<? extends org.platypus.web.RouteFactory>> routes, @org.jetbrains.annotations.NotNull()
    java.util.Map<org.platypus.model.Model<?>, ? extends kotlin.jvm.functions.Function1<? super org.platypus.PlatypusEnvironment, ? extends org.platypus.repository.RecordRepository<?>>> modelFactory, @org.jetbrains.annotations.NotNull()
    java.util.Map<org.platypus.model.Model<?>, ? extends java.util.Set<? extends org.platypus.ui.ToViewApi<?>>> views, @org.jetbrains.annotations.NotNull()
    java.util.Map<org.platypus.model.Model<?>, ? extends java.util.Set<? extends org.platypus.ui.action.UIMenuAction<?>>> actions, @org.jetbrains.annotations.NotNull()
    java.util.Set<org.platypus.ui.menu.UIMenu> menus) {
        super();
    }
}