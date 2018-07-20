package org.platypus.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002JA\u0010\n\u001a\u00020\u000b\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\r*\u0002H\f2\u001d\u0010\u000e\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u0005\u0012\u0004\u0012\u00020\u000b0\u000f\u00a2\u0006\u0002\b\u0010H\u0086\u0004\u00a2\u0006\u0002\u0010\u0011J\"\u0010\u0012\u001a\u00020\u000b\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\r*\u0002H\fH\u0086\u0002\u00a2\u0006\u0002\u0010\u0013R\u0018\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00078F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lorg/platypus/module/ModelModule;", "", "()V", "internalModels", "", "Lorg/platypus/module/ModelDataHolder;", "models", "", "getModels", "()Ljava/util/Set;", "config", "", "M", "Lorg/platypus/model/Model;", "def", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lorg/platypus/model/Model;Lkotlin/jvm/functions/Function1;)V", "unaryPlus", "(Lorg/platypus/model/Model;)V", "korm"})
public final class ModelModule {
    private final java.util.Set<org.platypus.module.ModelDataHolder<?>> internalModels = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<org.platypus.module.ModelDataHolder<?>> getModels() {
        return null;
    }
    
    public final <M extends org.platypus.model.Model<M>>void unaryPlus(@org.jetbrains.annotations.NotNull()
    M $receiver) {
    }
    
    public final <M extends org.platypus.model.Model<M>>void config(@org.jetbrains.annotations.NotNull()
    M $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.module.ModelDataHolder<M>, kotlin.Unit> def) {
    }
    
    public ModelModule() {
        super();
    }
}