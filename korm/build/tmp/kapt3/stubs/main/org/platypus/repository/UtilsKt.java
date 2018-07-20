package org.platypus.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a;\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002\u00a2\u0006\u0002\u0010\b\u001aY\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\n\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u001d\u0010\u000e\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\n\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0002\b\u0011H\u0000\u00a8\u0006\u0012"}, d2 = {"createFakeRecord", "Lorg/platypus/cache/ModelID;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/repository/RecordRepository;", "model", "id", "", "(Lorg/platypus/repository/RecordRepository;Lorg/platypus/model/Model;Ljava/lang/Integer;)Lorg/platypus/cache/ModelID;", "newTmpWithId", "Lorg/platypus/entity/Record;", "useDefault", "", "forceMagicField", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "korm"})
public final class UtilsKt {
    
    /**
     * * Update or create a Record with the [init] values
     * *
     * * if the [id] is null the a new record is created et the [init] is applyed on it
     * * if the [id] not null then the corresponding record is update with the [init] values
     * * if the [id] don't exist in the cache then a new record is created,
     * * if you want to update the corresponding database record then call [PlatypusEntity.store] on it
     * *
     * * @param id the optianal id of the record
     * * @param init the function applyed on the record
     */
    @org.jetbrains.annotations.NotNull()
    public static final <M extends org.platypus.model.Model<M>>org.platypus.entity.Record<M> newTmpWithId(@org.jetbrains.annotations.NotNull()
    org.platypus.repository.RecordRepository<M> $receiver, boolean useDefault, boolean forceMagicField, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.entity.Record<M>, kotlin.Unit> init) {
        return null;
    }
    
    /**
     * * Create a fake record inside the cache and a fake id if needed
     * * if the [id] is not null et not fake the the cache is not altered
     */
    private static final <M extends org.platypus.model.Model<M>>org.platypus.cache.ModelID createFakeRecord(@org.jetbrains.annotations.NotNull()
    org.platypus.repository.RecordRepository<M> $receiver, M model, java.lang.Integer id) {
        return null;
    }
}