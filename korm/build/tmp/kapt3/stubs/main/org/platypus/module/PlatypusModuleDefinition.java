package org.platypus.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lorg/platypus/module/PlatypusModuleDefinition;", "", "info", "Lorg/platypus/module/PlatypusModuleInfo;", "getInfo", "()Lorg/platypus/module/PlatypusModuleInfo;", "korm"})
public abstract interface PlatypusModuleDefinition {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.module.PlatypusModuleInfo getInfo();
}