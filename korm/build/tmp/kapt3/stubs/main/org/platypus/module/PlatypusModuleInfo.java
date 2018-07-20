package org.platypus.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\t0\u0007H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\tH&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\tH&J7\u0010\u0010\u001a1\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012#\u0012!\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\f\b\u0013\u0012\b\b\u0002\u0012\u0004\b\b(\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u00110\u0007H&J\u0012\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\tH&J\u001e\u0010\u0017\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\t0\u0007H&J\"\u0010\u0019\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a0\t0\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u001b"}, d2 = {"Lorg/platypus/module/PlatypusModuleInfo;", "", "name", "", "getName", "()Ljava/lang/String;", "actions", "", "Lorg/platypus/model/Model;", "", "Lorg/platypus/ui/action/UIMenuAction;", "datas", "Lorg/platypus/module/ModuleDataHolder;", "depends", "menus", "Lorg/platypus/ui/menu/UIMenu;", "modelFactory", "Lkotlin/Function1;", "Lorg/platypus/PlatypusEnvironment;", "Lkotlin/ParameterName;", "env", "Lorg/platypus/repository/RecordRepository;", "models", "routes", "Lorg/platypus/web/RouteFactory;", "views", "Lorg/platypus/ui/ToViewApi;", "korm"})
public abstract interface PlatypusModuleInfo {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getName();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Set<org.platypus.model.Model<?>> models();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Set<org.platypus.module.PlatypusModuleInfo> depends();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Set<org.platypus.module.ModuleDataHolder> datas();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<org.platypus.model.Model<?>, java.util.Set<org.platypus.web.RouteFactory>> routes();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<org.platypus.model.Model<?>, java.util.Set<org.platypus.ui.ToViewApi<?>>> views();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<org.platypus.model.Model<?>, java.util.Set<org.platypus.ui.action.UIMenuAction<?>>> actions();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Set<org.platypus.ui.menu.UIMenu> menus();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<org.platypus.model.Model<?>, kotlin.jvm.functions.Function1<org.platypus.PlatypusEnvironment, org.platypus.repository.RecordRepository<?>>> modelFactory();
}