package org.platypus.repository;

import java.lang.System;

/**
 * * A Repository is the class used to access to the persitence layer
 * * You can add method to the Repository of a Model by using [ModelFunction.empty](api.empty)
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u00032\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00000\u00042\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00000\u0005J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\'J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H&J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H&J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u0015\u001a\u00020\u0016H&J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u0019H&J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001eH&J\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H&J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0016\u0010!\u001a\u00020\u001e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H&J-\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u001d\u0010#\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0004\u0012\u00020%0$\u00a2\u0006\u0002\b&H&J-\u0010\'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u001d\u0010#\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0004\u0012\u00020%0$\u00a2\u0006\u0002\b&H&J-\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u001d\u0010#\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0004\u0012\u00020%0$\u00a2\u0006\u0002\b&H&J-\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u001d\u0010#\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0004\u0012\u00020%0$\u00a2\u0006\u0002\b&H&J\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H&J3\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2#\u0010#\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020%0,\u00a2\u0006\u0002\b&H&J3\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142#\u0010#\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020%0,\u00a2\u0006\u0002\b&H&J9\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2)\u0010/\u001a%\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000000\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e010,\u00a2\u0006\u0002\b&H&J9\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142)\u0010/\u001a%\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000000\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e010,\u00a2\u0006\u0002\b&H&R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00028\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u00063"}, d2 = {"Lorg/platypus/repository/RecordRepository;", "M", "Lorg/platypus/model/Model;", "Lorg/platypus/Environmentable;", "Lorg/platypus/SudoAble;", "Lorg/platypus/ContextAble;", "datas", "Lorg/platypus/data/DataRef;", "getDatas", "()Lorg/platypus/data/DataRef;", "model", "getModel", "()Lorg/platypus/model/Model;", "bagOf", "Lorg/platypus/bag/Bag;", "query", "Lorg/platypus/orm/sql/query/Query;", "Lorg/platypus/orm/sql/query/SearchQuery;", "buildQuery", "byId", "Lorg/platypus/entity/Record;", "id", "", "byIds", "ids", "", "byRef", "ref", "", "throwError", "", "create", "entity", "delete", "new", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "newTmp", "newTmpWithDefault", "newWithDefault", "recordOf", "search", "Lkotlin/Function2;", "searchFirst", "where", "predicate", "Lorg/platypus/orm/sql/query/SearchQueryWherePart;", "Lorg/platypus/orm/sql/expression/Expression;", "whereFirst", "korm"})
public abstract interface RecordRepository<M extends org.platypus.model.Model<M>> extends org.platypus.Environmentable, org.platypus.SudoAble<org.platypus.repository.RecordRepository<M>>, org.platypus.ContextAble<org.platypus.repository.RecordRepository<M>> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.data.DataRef<M> getDatas();
    
    @org.jetbrains.annotations.NotNull()
    public abstract M getModel();
    
    /**
     * * Create Record with the given [id]
     *     * 1. If the [id] > 0
     *     *      1. If the Id is in the cache then the cached record is returned
     *     *      1. If the Id is not in the cache and not in the persitence layer an [EntityNotFoundById] is throw
     *     * 2. If the [id] < 0
     *     *      1. If the [id] exist in the cache then the cached record is returned
     *     *      1. If the [id] don't exist in the cache then a [EntityNotFoundById] is throw
     *     * 3. If the [id] == 0 then a empty Record is return
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.entity.Record<M> byId(int id);
    
    /**
     * * Create Bag of Record with only the valid ids
     *     * For each id in [ids] this rule are applied
     *     * 1. If the [id] > 0
     *     *      1. If the Id is in the cache then the cached record is returned
     *     *      1. If the Id is not in the cache and not in the persitence layer the Id is removed from the [Bag.ids]
     *     * 2. If the [id] < 0
     *     *      1. If the [id] exist in the cache then the cached record is returned
     *     *      1. If the [id] don't exist the Id is removed from the [Bag.ids]
     *     * 3. If the [id] == 0 the Id is removed from the [Bag.ids]
     *     *
     *     * NOTE : If all the ids is equal to 0 or don't exist an empty [Bag] is returned
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.bag.Bag<M> byIds(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Integer> ids);
    
    /**
     * * Create Record with the given [ref]
     *     * 1. If the [ref] is in cache then the cached record is returned
     *     * 1. If the [ref] is not in the cache and not in the persitence layer an [EntityNotFoundByRef] is throw
     *     * if [throwError] is true otherwise return an empty Record
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.entity.Record<M> byRef(@org.jetbrains.annotations.NotNull()
    java.lang.String ref, boolean throwError);
    
    /**
     * * Don't use it internal use only
     *     * @see bagOf
     */
    @org.jetbrains.annotations.NotNull()
    @org.platypus.IShouldRefractorThis(why = "I don\'t like it because a query is not always link to the current Model")
    public abstract org.platypus.bag.Bag<M> bagOf(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.Query query);
    
    /**
     * * Create a Bag from te given query
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.bag.Bag<M> bagOf(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.SearchQuery<M> query);
    
    /**
     * * Create a Record from te given query
     *     * automaticaly add limit = 1 to the query
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.entity.Record<M> recordOf(@org.jetbrains.annotations.NotNull()
    org.platypus.orm.sql.query.SearchQuery<M> query);
    
    /**
     * * Return A query for the current model
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.orm.sql.query.SearchQuery<M> buildQuery();
    
    /**
     * * Create a bag with the given where expression
     *     * This expression will be evaluated only if needed
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.bag.Bag<M> where(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.orm.sql.query.SearchQueryWherePart<M>, ? super M, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> predicate);
    
    /**
     * * Find the first record with the given where expression
     *     * Automatically a Limit 1 will be added to the query
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.entity.Record<M> whereFirst(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.orm.sql.query.SearchQueryWherePart<M>, ? super M, ? extends org.platypus.orm.sql.expression.Expression<java.lang.Boolean>> predicate);
    
    /**
     * * Create a [SearchQueryImpl] initialized with [init]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.bag.Bag<M> search(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.orm.sql.query.SearchQuery<M>, ? super M, kotlin.Unit> init);
    
    /**
     * * Create a Record initialized with [init]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.entity.Record<M> searchFirst(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super org.platypus.orm.sql.query.SearchQuery<M>, ? super M, kotlin.Unit> init);
    
    /**
     * * Create a new temporaty record with the [init] values
     *     * The [Model.defaultGet] is called before the [init]
     *     * Then the [create] function is applied on it
     *     *
     *     * @see newTmpWithDefault if you want to create a temporary Record with default values
     *     * @see newTmp if you want to create a temporary Record without default values
     *     * @see new if you want to create a Record without default values
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.entity.Record<M> newWithDefault(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.entity.Record<M>, kotlin.Unit> init);
    
    /**
     * * Mark this entity to be persisted in the next flush call
     *     * The new record will not be create inside the database automatically
     *     * The real insert in the database will be done in the flush step
     *     *
     *     * @see newTmp if you want to create a temporary Record
     *     * @see Model.create This method is automatically called
     *     * @see PlatypusEnvironment.flush when this method is call the entity will be inserted in the database
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.entity.Record<M> create(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<M> entity);
    
    /**
     * * Create a new record with the [init] values
     *     * Warning you need to call [PlatypusEntity.create]
     *     *
     *     * @see create if you want to create this record in database
     *     * @see new if you want to create a new record with [create] automaticaly applied
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.entity.Record<M> newTmp(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.entity.Record<M>, kotlin.Unit> init);
    
    /**
     * * Create a new record with the [init] values
     *     * The [Model.defaultGet] is called before the [init]
     *     * Warning you need to call [create] if you want to mark this temporary record to be persisted in the next flush
     *     *
     *     * @see create if you want to create this record in database
     *     * @see new if you want to create a new record with [create] automaticaly applied
     */
    @org.jetbrains.annotations.NotNull()
    public abstract org.platypus.entity.Record<M> newTmpWithDefault(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.platypus.entity.Record<M>, kotlin.Unit> init);
    
    /**
     * * Delete the current record with the given Id
     *     * @return true if a record is effectively deleted otherwise false
     */
    public abstract boolean delete(int id);
    
    /**
     * * Delete the current record
     *     * @return true if a record is effectively deleted otherwise false
     */
    public abstract boolean delete(@org.jetbrains.annotations.NotNull()
    org.platypus.entity.Record<M> id);
    
    /**
     * * A Repository is the class used to access to the persitence layer
     * * You can add method to the Repository of a Model by using [ModelFunction.empty](api.empty)
     */
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
    }
}