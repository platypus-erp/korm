package org.platypus.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0018\u001a\u00020\u00192\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00190\u001b\u00a2\u0006\u0002\b\u001cJ\u001f\u0010\u001d\u001a\u00020\u00192\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u001f\"\u00020\t\u00a2\u0006\u0002\u0010 J\u0006\u0010\u0012\u001a\u00020!J\u001f\u0010\n\u001a\u00020\u00192\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00190\u001b\u00a2\u0006\u0002\b\u001cJ\u001f\u0010\f\u001a\u00020\u00192\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00190\u001b\u00a2\u0006\u0002\b\u001cJ\u001f\u0010\u000e\u001a\u00020\u00192\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00190\u001b\u00a2\u0006\u0002\b\u001cR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006#"}, d2 = {"Lorg/platypus/module/ModuleDef;", "", "name", "", "(Ljava/lang/String;)V", "data", "Lorg/platypus/module/DataModuleHolder;", "dependsModule", "", "Lorg/platypus/module/ModuleBuilder;", "i18n", "Lorg/platypus/module/I18nModuleHolder;", "menus", "Lorg/platypus/module/MenuHolder;", "models", "Lorg/platypus/module/ModelModule;", "module", "Lorg/platypus/module/PlatypusModuleImpl;", "getModule", "()Lorg/platypus/module/PlatypusModuleImpl;", "module$delegate", "Lkotlin/Lazy;", "getName", "()Ljava/lang/String;", "datas", "", "def", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "dependsOf", "depends", "", "([Lorg/platypus/module/ModuleBuilder;)V", "Lorg/platypus/module/PlatypusModuleInfo;", "menuDef", "korm"})
public final class ModuleDef {
    private final org.platypus.module.ModelModule models = null;
    private final org.platypus.module.DataModuleHolder data = null;
    private final org.platypus.module.I18nModuleHolder i18n = null;
    private final org.platypus.module.MenuHolder menus = null;
    private java.util.Set<? extends org.platypus.module.ModuleBuilder> dependsModule;
    private final kotlin.Lazy module$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    
    private final org.platypus.module.PlatypusModuleImpl getModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.module.PlatypusModuleInfo getModule() {
        return null;
    }
    
    public final void models(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.module.ModelModule, kotlin.Unit> def) {
    }
    
    public final void datas(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.module.DataModuleHolder, kotlin.Unit> def) {
    }
    
    public final void dependsOf(@org.jetbrains.annotations.NotNull()
    org.platypus.module.ModuleBuilder... depends) {
    }
    
    public final void menus(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.module.MenuHolder, kotlin.Unit> menuDef) {
    }
    
    public final void i18n(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.module.I18nModuleHolder, kotlin.Unit> def) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public ModuleDef(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        super();
    }
}