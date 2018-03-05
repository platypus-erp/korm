package org.platypus.repository

import org.platypus.ContextAble
import org.platypus.Environmentable
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
import org.platypus.utils.EntityNotFoundByRef

interface RecordRepository<M : Model<M>> : Environmentable, SudoAble<RecordRepository<M>>, ContextAble<RecordRepository<M>> {

    val datas: DataRef<M>

    val model:M
    /**
     * Execute a [fetch] only if the current [id] is not all ready in the cache
     */
    fun browse(id: Int): Record<M>

    /**
     * Execute a [fetch] only if the current [ids] is not all ready in the cache and only for the [ids] not in the cache
     */
    fun browse(ids: Collection<Int>): Bag<M>

    /**
     * Search in the cache first if a record with the field [model.externalRef] is not equal to [ref]
     * overwise execute a search query in the persitence layer
     * The search is case-sentive and exact, this mean "myRef" != "myref" != " MYREF"
     * @throws EntityNotFoundByRef If no record is found in the cache and in the persitence layer
     */
    fun byRef(ref: String): Record<M>

    /**
     * Same as [byRef]
     */
    operator fun get(ref: String): Record<M>

    /**
     * Search in the cache first if a record with the field [model.externalRef] is not equal to [ref]
     * overwise execute a search query in the persitence layer
     * The search is case-sentive and exact, this mean "myRef" != "myref" != " MYREF"
     * If no result is found then return a [null] value
     */
    fun byRefOrNull(ref: String): Record<M>?

    /**
     * Query only in the perstence layer without testing the cache before
     * If an entity is found then all the cache value will be erased by the new persitence value
     * @see browse if you want to test the cache before
     * @see fetchOrNull if you're not sure about the existence of your id
     * @throws EntityNotFoundById If no record is found in the cache and in the persitence layer
     */
    fun fetch(id: Int): Record<M>

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
    fun fetchOrNull(id: Int): Record<M>?

    /**
     * Return a [Bag] of the current [ids] a [fetch] can be execute depending of the implementation
     */
    fun bagOf(ids: Collection<Int>): Bag<M>

    /**
     * Execute the [query] and return the result as a [Bag] or an empty [Bag] if the query return 0 row
     */
    fun bagOf(query: Query): Bag<M>

    /**
     * Return a [MutableBag] of the current [ids] a [fetch] can be execute depending of the implementation
     */
    fun mutableBagOf(ids: Collection<Int>): MutableBag<M>

    /**
     * Execute the [query] and return the result as a [MutableBag] or an empty [MutableBag] if the query return 0 row
     */
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
    fun newTmp(useDefault: Boolean = true, init: Record<M>.() -> Unit) : Record<M>

    /**
     * Execute a [search] with the given [predicate] and return the first row or null if 0 row si return by the [Query]
     */
    fun findFirstOrNull(op: M.() -> Expression<Boolean>): Record<M>?

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

    fun search(query: SmartQueryBuilder<M>.(M) -> Unit):Bag<M>

    /**
     * Delete the current record with the given Id in the caceh and the persitence layer
     */
    fun delete(id: Int)

    /**
     * Delete the current record in the cache and the persitence layer
     */
    fun delete(id: Record<M>)

}