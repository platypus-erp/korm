package org.platypus.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004J\b\u0010/\u001a\u000200H&J\u000e\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH&J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH&J\b\u00103\u001a\u000200H&J\u000e\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH&J \u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0010\u00106\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u000307H&J3\u00108\u001a\b\u0012\u0004\u0012\u0002H:09\"\u000e\b\u0001\u0010:*\b\u0012\u0004\u0012\u0002H:0\u00022\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H:0;H\u00a6\u0002J3\u00108\u001a\b\u0012\u0004\u0012\u0002H:0\u000e\"\u000e\b\u0001\u0010:*\b\u0012\u0004\u0012\u0002H:0\u00022\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H:0<H\u00a6\u0002J.\u00108\u001a\u0004\u0018\u0001H=\"\b\b\u0001\u0010=*\u00020>2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H=0?H\u00a6\u0002\u00a2\u0006\u0002\u0010@J\b\u0010A\u001a\u00020\u0006H&J\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00028\u0000092\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u00a6\u0002J\u000e\u0010D\u001a\b\u0012\u0004\u0012\u00028\u000009H&J\u000e\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00140FH&J\b\u0010G\u001a\u00020HH&R\u0012\u0010\u0005\u001a\u00020\u0006X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u0004\u0018\u00010\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u0010X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0006X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\bR\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u0014X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0012\u0010\u001b\u001a\u00020\u001cX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0012\u0010\u001f\u001a\u00020\u0006X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010\bR\u0014\u0010!\u001a\u0004\u0018\u00010\u0014X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u0016R\u001a\u0010#\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010$X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010&R\u0012\u0010\'\u001a\u00020(X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u0004\u0018\u00010\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b,\u0010\fR\u001c\u0010-\u001a\f\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u0010X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b.\u0010\u0012\u00a8\u0006I"}, d2 = {"Lorg/platypus/entity/ImutableRecord;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/Identifiable;", "Lorg/platypus/entity/RecordDelegate;", "archived", "", "getArchived", "()Z", "createDate", "Ljava/time/LocalDateTime;", "getCreateDate", "()Ljava/time/LocalDateTime;", "createUid", "Lorg/platypus/entity/Record;", "Lorg/platypus/module/base/models/Users;", "Lorg/platypus/module/base/entities/User;", "getCreateUid", "()Lorg/platypus/entity/Record;", "displayName", "", "getDisplayName", "()Ljava/lang/String;", "empty", "getEmpty", "externalRef", "getExternalRef", "internalState", "Lorg/platypus/entity/EntityState;", "getInternalState", "()Lorg/platypus/entity/EntityState;", "loaded", "getLoaded", "name", "getName", "query", "Lorg/platypus/orm/sql/query/SearchQuery;", "getQuery", "()Lorg/platypus/orm/sql/query/SearchQuery;", "validateMode", "Lorg/platypus/entity/EntityValidateMode;", "getValidateMode", "()Lorg/platypus/entity/EntityValidateMode;", "writeDate", "getWriteDate", "writeUid", "getWriteUid", "attach", "", "copy", "deepCopy", "detach", "fetch", "fetchIfNeeded", "field", "Lorg/platypus/model/field/api/ModelField;", "get", "Lorg/platypus/bag/Bag;", "MT", "Lorg/platypus/model/field/api/MultiReferencedField;", "Lorg/platypus/model/field/api/ReferencedField;", "T", "", "Lorg/platypus/model/field/api/SimpleModelField;", "(Lorg/platypus/model/field/api/SimpleModelField;)Ljava/lang/Object;", "isStore", "plus", "other", "toBag", "validate", "", "warmCache", "Lorg/platypus/cache/PlatypusCache;", "korm"})
public abstract interface ImutableRecord<M extends org.platypus.model.Model<M>> extends org.platypus.Identifiable, org.platypus.entity.RecordDelegate<M> {
    
    /**
     * * The string representation of the current Record
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getDisplayName();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getName();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.time.LocalDateTime getCreateDate();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.time.LocalDateTime getWriteDate();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.entity.Record<org.platypus.module.base.models.Users> getCreateUid();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.entity.Record<org.platypus.module.base.models.Users> getWriteUid();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getExternalRef();
    
    public abstract boolean getArchived();
    
    public abstract boolean getEmpty();
    
    public abstract boolean getLoaded();
    
    @org.jetbrains.annotations.Nullable()
    public abstract org.platypus.orm.sql.query.SearchQuery<M> getQuery();
    
    @org.jetbrains.annotations.Nullable()
    public abstract <T extends java.lang.Object>T get(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.SimpleModelField<M, T> field);
    
    @org.jetbrains.annotations.NotNull()
    public abstract <MT extends org.platypus.model.Model<MT>>org.platypus.entity.Record<MT> get(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ReferencedField<M, MT> field);
    
    @org.jetbrains.annotations.NotNull()
    public abstract <MT extends org.platypus.model.Model<MT>>org.platypus.bag.Bag<MT> get(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.MultiReferencedField<M, MT> field);
    
    /**
     * * Detach the current entity of the [env] cache
     *     * put the [internalState] to [EntityState.DETACH]
     *     *
     *     * A record in [EntityState.DETACH] mode will no longer trigger Update, delete or insert statement in the persitence layer
     *     * All the modification will be loss at the end of the environment
     */
    public abstract void detach();
    
    /**
     * * Attach the current entity to the [env] cache
     *     * put the [internalState] to [EntityState.MANAGED]
     *     *
     *     * A record in [EntityState.MANAGED] mode will be watched to trigger Update, delete or insert statement in the persitence layer
     *     * All the modification will be persisted at the end of the environment
     */
    public abstract void attach();
    
    /**
     * * Return the current state of the entity
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.entity.EntityState getInternalState();
    
    /**
     * * Convert this Record to a bog with only one elemement witch is the current record
     *     * The implementation should guarantee that code is correct [this.toBag().first() === this]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.bag.Bag<M> toBag();
    
    /**
     * * Return the cache instance used by this Record
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.cache.PlatypusCache warmCache();
    
    /**
     * * An handly method to add the current Record to a [bag] with an other record of the same [Model]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.bag.Bag<M> plus(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<M> other);
    
    /**
     * * Validate the entity and return a [Set] of [String] if some error exist
     *     * No [Exception] will fire
     *     *
     *     * The [Set] can be empty if no error is detected
     *     * See the current Implementation to see what is validated in the current record
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Set<java.lang.String> validate();
    
    /**
     * * Return the Validate strategy used
     *     * @see EntityValidateMode
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.entity.EntityValidateMode getValidateMode();
    
    /**
     * * Return [true] if the current record is in persitence layer or will be at the end of the [PlatypusEnvironement]
     */
    public abstract boolean isStore();
    
    /**
     * * Fetch the current entity with the current [predicate] and erase the value in the cache with the new one
     *     * Before a flush only for this record is processed
     *     * Can throw a [MissingRecordException] if the entity don't exist anymore in the persitence layer
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.entity.Record<M> fetch();
    
    /**
     * * Execute a fetch if the current field is not in the [PlatypusCache] retreive by [warmCache]
     *     *
     *     * If the field is in cache the nothing append,
     *     * overrise fetch the current field and all the other field withch is not in cache for the current [Record] only
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.entity.Record<M> fetchIfNeeded(@org.jetbrains.annotations.NotNull()
    org.platypus.model.field.api.ModelField<M, ?> field);
    
    /**
     * * Create a copy of it self
     *     * The copy is always in the state [EntityState.MANAGED]
     *     *
     *     * By default the copy only copey the field with the [FieldSlot.copy] == true
     *     * The relation of the current record will no be copy
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.entity.Record<M> copy();
    
    /**
     * * Same as copy but copy the linked object too
     *     * @see copy
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.entity.Record<M> deepCopy();
}