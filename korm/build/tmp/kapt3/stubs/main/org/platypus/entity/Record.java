package org.platypus.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00000\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00000\u00052\b\u0012\u0004\u0012\u0002H\u00010\u00062\u00020\u0007J\b\u0010\u0016\u001a\u00020\u0017H&J\u001b\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00a6\u0002R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001c"}, d2 = {"Lorg/platypus/entity/Record;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/SudoAble;", "Lorg/platypus/entity/ImutableRecord;", "Lorg/platypus/ContextAble;", "Lorg/platypus/entity/MutableRecordDelegate;", "Lorg/platypus/Environmentable;", "api", "Lorg/platypus/entity/PrivateApi;", "getApi", "()Lorg/platypus/entity/PrivateApi;", "archived", "", "getArchived", "()Z", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "delete", "", "set", "fieldName", "value", "", "korm"})
public abstract interface Record<M extends org.platypus.model.Model<M>> extends org.platypus.SudoAble<org.platypus.entity.Record<M>>, org.platypus.entity.ImutableRecord<M>, org.platypus.ContextAble<org.platypus.entity.Record<M>>, org.platypus.entity.MutableRecordDelegate<M>, org.platypus.Environmentable {
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public abstract java.lang.String getName();
    
    public abstract void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0);
    
    @java.lang.Override()
    public abstract boolean getArchived();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.entity.PrivateApi<M> getApi();
    
    /**
     * * Remove the entity of the database
     *     * put the [internalState] to [EntityState.DELETED]
     */
    public abstract void delete();
    
    public abstract void set(@org.jetbrains.annotations.NotNull()
    java.lang.String fieldName, @org.jetbrains.annotations.Nullable()
    java.lang.Object value);
}