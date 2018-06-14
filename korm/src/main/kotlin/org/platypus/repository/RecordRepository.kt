package org.platypus.repository

import org.platypus.ContextAble
import org.platypus.Environmentable
import org.platypus.INeedToDocumentThis
import org.platypus.INeedToTestThis
import org.platypus.PlatypusEnvironment
import org.platypus.SudoAble
import org.platypus.bag.Bag
import org.platypus.bag.MutableBag
import org.platypus.data.DataRef
import org.platypus.entity.Record
import org.platypus.model.Model
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.query.Query
import org.platypus.orm.sql.query.SmartQueryBuilder
import org.platypus.utils.EntityNotFoundById

interface RecordRepository<M : Model<M>> : Environmentable, SudoAble<RecordRepository<M>>, ContextAble<RecordRepository<M>> {

    val datas: DataRef<M>

    val model: M

    /**
     * Create Record with the given [id]
     * 1. If the [id] > 0
     *      1. If the Id is in the cache then the cached record is returned
     *      1. If the Id is not in the cache and not in the persitence layer an [EntityNotFoundById] is throw
     *      if [throwError] is true otherwise return an empty Record
     * 2. If the [id] < 0
     *      1. If the [id] exist in the cache then the cached record is returned
     *      1. If the [id] don't exist in the cache then a [EntityNotFoundById] is throw
     *      if [throwError] is true otherwise return an empty Record
     * 3. If the [id] == 0 then a empty Record is return
     */
    fun browse(id: Int, throwError:Boolean = true): Record<M>

    /**
     * Create Bag of Record with only the valid ids
     * For each id in [ids] this rule are applied
     * 1. If the [id] > 0
     *      1. If the Id is in the cache then the cached record is returned
     *      1. If the Id is not in the cache and not in the persitence layer the Id is removed from the [Bag.ids]
     * 2. If the [id] < 0
     *      1. If the [id] exist in the cache then the cached record is returned
     *      1. If the [id] don't exist the Id is removed from the [Bag.ids]
     * 3. If the [id] == 0 the Id is removed from the [Bag.ids]
     *
     * NOTE : If all the ids is equal to 0 or don't exist an empty [Bag] is returned
     */
    fun browse(ids: Collection<Int>): Bag<M>

    /**
     * Create Record with the given [ref]
     * 1. If the [ref] is in cache then the cached record is returned
     * 1. If the Id is not in the cache and not in the persitence layer an [EntityNotFoundByRef] is throw
     * if [throwError] is true otherwise return an empty Record
     */
    @INeedToDocumentThis
    @INeedToTestThis
    fun byRef(ref: String, throwError:Boolean = true): Record<M>

    /**
     * Query only in the perstence layer without testing the cache before
     * If an entity is found then all the cache value will be erased by the new persitence value
     * @see browse if you want to test the cache before
     * @see fetchOrNull if you're not sure about the existence of your id
     * @throws EntityNotFoundById If no record is found in the cache and in the persitence layer
     */
    @INeedToDocumentThis
    @INeedToTestThis
    fun fetch(id: Int): Record<M>

    /**
     * Query only in the perstence layer without testing the cache before
     * If an entity is found then all the cache value will be erased by the new persitence value
     * @see browse if you want to test the cache before
     * @see fetchOrNull if you're not sure about the existence of your id
     * @throws EntityNotFoundById If no record is found in the cache and in the persitence layer
     */
    @INeedToDocumentThis
    @INeedToTestThis
    fun fetch(where: M.() -> Expression<Boolean>): Bag<M>

    @INeedToDocumentThis
    @INeedToTestThis
    fun fetchFirst(where: M.() -> Expression<Boolean>): Record<M>
    @INeedToDocumentThis
    @INeedToTestThis
    fun fetchOrNull(where: M.() -> Expression<Boolean>): Record<M>?

    /**
     * Query only in the perstence layer without testing the cache before
     * @see browse if you want to test the cache before
     */
    /**
     * Query only in the perstence layer without testing the cache before
     * If an entity is found then all the cache value will be erased by the new persitence value
     * @see browse if you want to test the cache before
     * @see fetch if you're sure about the existence of your id
     */
    @INeedToDocumentThis
    @INeedToTestThis
    fun fetchOrNull(id: Int): Record<M>?

    /**
     * Return a [Bag] of the current [ids] a [fetch] can be execute depending of the implementation
     */
    @INeedToDocumentThis
    @INeedToTestThis
    fun bagOf(ids: Collection<Int>): Bag<M>

    /**
     * Execute the [query] and return the result as a [Bag] or an empty [Bag] if the query return 0 row
     */
    @INeedToDocumentThis
    @INeedToTestThis
    fun bagOf(query: Query): Bag<M>

    /**
     * Return a [MutableBag] of the current [ids] a [fetch] can be execute depending of the implementation
     */
    @INeedToDocumentThis
    @INeedToTestThis
    fun mutableBagOf(ids: Collection<Int>): MutableBag<M>

    /**
     * Execute the [query] and return the result as a [MutableBag] or an empty [MutableBag] if the query return 0 row
     */
    @INeedToDocumentThis
    @INeedToTestThis
    fun mutableBagOf(query: Query): MutableBag<M>

    /**
     * Find the all the models with the given predicate
     */
    fun find(where: M.() -> Expression<Boolean>): Bag<M>


    /**
     * Create a new temporaty record with the [init] values
     * Then the [create] is called
     *
     * @see create
     */
    fun new(useDefault: Boolean = true, init: Record<M>.() -> Unit): Record<M>

    /**
     * Mark this entity to be persisted in the next flush call
     * The new record will not be create inside the database automatically
     * The real insert in the database will be done in the flush step
     *
     * @see newTmp if you want to create a temporary Record
     * @see StoredModel.create This method is automatically called
     * @see PlatypusEnvironment.flush when this method is call the entity will be inserted in the database
     */
    fun create(entity: Record<M>): Record<M>

    /**
     * Create a new record with the [init] values
     * Warning you need to call [PlatypusEntity.create] to create this record in database
     *
     * @see create
     * @see new
     */
    fun newTmp(useDefault: Boolean = true, init: Record<M>.() -> Unit): Record<M>

    /**
     * Execute a [search] with the given [predicate] and return the first row or throw an [EntityNoFound] if 0 row is return by the [Query]
     */
    fun findFirst(op: M.() -> Expression<Boolean>): Record<M>

//    /**
//     * Search in the database with the given where, all ir.rule for this models are applied
//     * if [orderBy] is unset then the orderby of the models is applied
//     * If [fields] is unset the all stored (not the related) field are selected
//     */
//    fun search(fields: MutableSet<ModelField<M, *, *>> = mutableSetOf(),
//               limit: Int = -1,
//               orderBy: MutableList<Pair<ModelField<M, *, *>, ORDERBY_TYPE>> = mutableListOf(),
//               offset: Int = 0,
//               where: (M.() -> Expression<Boolean>)? = null): Bag<M>

    fun search(query: SmartQueryBuilder<M>.(M) -> Unit): Bag<M>
    fun execute(query: SmartQueryBuilder<M>): Bag<M>
    fun executeFirst(query: SmartQueryBuilder<M>): Record<M>

    /**
     * Delete the current record with the given Id in the caceh and the persitence layer
     */
    fun delete(id: Int)

    /**
     * Delete the current record in the cache and the persitence layer
     */
    fun delete(id: Record<M>)

}