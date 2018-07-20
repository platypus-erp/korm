package org.platypus.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J#\u0010\u0017\u001a\u00020\u0012*\u00020\u00182\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00120\u001a\u00a2\u0006\u0002\b\u001cJ#\u0010\u0017\u001a\u00020\u0012*\u00020\u001d2\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00120\u001a\u00a2\u0006\u0002\b\u001cJM\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H!0 \"\u000e\b\u0000\u0010!*\b\u0012\u0004\u0012\u0002H!0\"*\b\u0012\u0004\u0012\u0002H!0#2\u0006\u0010$\u001a\u00020\u000b2\u001d\u0010\u0019\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H!0 \u0012\u0004\u0012\u00020\u00120\u001a\u00a2\u0006\u0002\b\u001cJ0\u0010%\u001a\u00020\u0012\"\u000e\b\u0000\u0010!*\b\u0012\u0004\u0012\u0002H!0\"*\b\u0012\u0004\u0012\u0002H!0#2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lorg/platypus/module/ModuleData;", "", "module", "Lorg/platypus/module/PlatypusModuleInfo;", "env", "Lorg/platypus/PlatypusEnvironment;", "type", "Lorg/platypus/module/ModuleDataType;", "noUpdate", "Lorg/platypus/module/UpdateDataType;", "version", "", "(Lorg/platypus/module/PlatypusModuleInfo;Lorg/platypus/PlatypusEnvironment;Lorg/platypus/module/ModuleDataType;Lorg/platypus/module/UpdateDataType;Ljava/lang/String;)V", "getEnv", "()Lorg/platypus/PlatypusEnvironment;", "getModule", "()Lorg/platypus/module/PlatypusModuleInfo;", "dependsOfData", "", "depends", "", "Lorg/platypus/module/ModuleDataHolder;", "([Lorg/platypus/module/ModuleDataHolder;)V", "addData", "Lorg/platypus/security/PlatypusGroup;", "init", "Lkotlin/Function1;", "Lorg/platypus/security/PlatypusGroupBuilderData;", "Lkotlin/ExtensionFunctionType;", "Lorg/platypus/security/PlatypusUser;", "Lorg/platypus/security/PlatypusUserBuilderData;", "newData", "Lorg/platypus/entity/Record;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/repository/RecordRepository;", "ref", "readResource", "dataReader", "Lorg/platypus/data/importer/PlatypusDataImporter;", "resourcePath", "korm"})
public final class ModuleData {
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.module.PlatypusModuleInfo module = null;
    @org.jetbrains.annotations.NotNull()
    private final org.platypus.PlatypusEnvironment env = null;
    private final org.platypus.module.ModuleDataType type = null;
    private final org.platypus.module.UpdateDataType noUpdate = null;
    private final java.lang.String version = null;
    
    public final void dependsOfData(@org.jetbrains.annotations.NotNull()
    org.platypus.module.ModuleDataHolder... depends) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <M extends org.platypus.model.Model<M>>org.platypus.entity.Record<M> newData(@org.jetbrains.annotations.NotNull()
    org.platypus.repository.RecordRepository<M> $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String ref, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.entity.Record<M>, kotlin.Unit> init) {
        return null;
    }
    
    public final <M extends org.platypus.model.Model<M>>void readResource(@org.jetbrains.annotations.NotNull()
    org.platypus.repository.RecordRepository<M> $receiver, @org.jetbrains.annotations.NotNull()
    org.platypus.data.importer.PlatypusDataImporter dataReader, @org.jetbrains.annotations.NotNull()
    java.lang.String resourcePath) {
    }
    
    public final void addData(@org.jetbrains.annotations.NotNull()
    org.platypus.security.PlatypusGroup $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.security.PlatypusGroupBuilderData, kotlin.Unit> init) {
    }
    
    public final void addData(@org.jetbrains.annotations.NotNull()
    org.platypus.security.PlatypusUser $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.security.PlatypusUserBuilderData, kotlin.Unit> init) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.module.PlatypusModuleInfo getModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.platypus.PlatypusEnvironment getEnv() {
        return null;
    }
    
    public ModuleData(@org.jetbrains.annotations.NotNull()
    org.platypus.module.PlatypusModuleInfo module, @org.jetbrains.annotations.NotNull()
    org.platypus.PlatypusEnvironment env, @org.jetbrains.annotations.NotNull()
    org.platypus.module.ModuleDataType type, @org.jetbrains.annotations.NotNull()
    org.platypus.module.UpdateDataType noUpdate, @org.jetbrains.annotations.NotNull()
    java.lang.String version) {
        super();
    }
}