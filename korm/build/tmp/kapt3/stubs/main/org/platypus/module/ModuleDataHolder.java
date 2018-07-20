package org.platypus.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B6\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u00a2\u0006\u0002\b\f\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aR\"\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u00a2\u0006\u0002\b\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001b"}, d2 = {"Lorg/platypus/module/ModuleDataHolder;", "", "type", "Lorg/platypus/module/ModuleDataType;", "noUpdate", "Lorg/platypus/module/UpdateDataType;", "version", "", "data", "Lkotlin/Function1;", "Lorg/platypus/module/ModuleData;", "", "Lkotlin/ExtensionFunctionType;", "(Lorg/platypus/module/ModuleDataType;Lorg/platypus/module/UpdateDataType;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getData", "()Lkotlin/jvm/functions/Function1;", "getNoUpdate", "()Lorg/platypus/module/UpdateDataType;", "getType", "()Lorg/platypus/module/ModuleDataType;", "getVersion", "()Ljava/lang/String;", "loadData", "module", "Lorg/platypus/module/PlatypusModuleInfo;", "env", "Lorg/platypus/PlatypusEnvironment;", "korm"})
public final class ModuleDataHolder {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.module.ModuleDataType type = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.module.UpdateDataType noUpdate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String version = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<org.platypus.module.ModuleData, kotlin.Unit> data = null;
    
    public final void loadData(@org.jetbrains.annotations.NotNull()
    org.platypus.module.PlatypusModuleInfo module, @org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.module.ModuleDataType getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.module.UpdateDataType getNoUpdate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVersion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<org.platypus.module.ModuleData, kotlin.Unit> getData() {
        return null;
    }
    
    public ModuleDataHolder(@org.jetbrains.annotations.NotNull()
    org.platypus.module.ModuleDataType type, @org.jetbrains.annotations.NotNull()
    org.platypus.module.UpdateDataType noUpdate, @org.jetbrains.annotations.NotNull()
    java.lang.String version, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.module.ModuleData, kotlin.Unit> data) {
        super();
    }
}