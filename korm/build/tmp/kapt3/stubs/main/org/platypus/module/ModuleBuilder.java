package org.platypus.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\b\b\u00a2\u0006\u0002\u0010\tR\u001f\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\b\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lorg/platypus/module/ModuleBuilder;", "", "name", "", "init", "Lkotlin/Function1;", "Lorg/platypus/module/ModuleDef;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "module", "getModule", "()Lorg/platypus/module/ModuleDef;", "module$delegate", "Lkotlin/Lazy;", "getName", "()Ljava/lang/String;", "korm"})
public abstract class ModuleBuilder {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy module$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final kotlin.jvm.functions.Function1<org.platypus.module.ModuleDef, kotlin.Unit> init = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.module.ModuleDef getModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public ModuleBuilder(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.module.ModuleDef, kotlin.Unit> init) {
        super();
    }
}