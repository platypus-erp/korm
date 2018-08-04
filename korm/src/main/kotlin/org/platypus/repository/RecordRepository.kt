package org.platypus.repository

import org.platypus.ContextAble
import org.platypus.Environmentable
import org.platypus.IShouldRefractorThis
import org.platypus.PlatypusEnvironment
import org.platypus.SudoAble
import org.platypus.bag.Bag
import org.platypus.data.DataRef
import org.platypus.entity.Record
import org.platypus.model.Model
import org.platypus.orm.sql.predicate.PredicateField
import org.platypus.orm.sql.query.Query
import org.platypus.orm.sql.query.SearchQuery
import org.platypus.orm.sql.query.SearchQueryImpl
import org.platypus.orm.sql.query.SearchQueryWherePart

/**
 * A Repository is the class used to access to the persitence layer
 * You can add method to the Repository of a Model by using [ModelFunction.empty](api.empty)
 */
interface RecordRepository<M : Model<M>> : Environmentable, SudoAble<RecordRepository<M>>, ContextAble<RecordRepository<M>> {

    val datas: DataRef<M>

    val model: M

    /**
     * Create Record with the given [id]
     * 1. If the [id] > 0
     *      1. If the Id is in the cache then the cached record is returned
     *      1. If the Id is not in the cache and not in the persitence layer an [EntityNotFoundById] is throw
     * 2. If the [id] < 0
     *      1. If the [id] exist in the cache then the cached record is returned
     *      1. If the [id] don't exist in the cache then a [EntityNotFoundById] is throw
     * 3. If the [id] == 0 then a empty Record is return
     */
    fun byId(id: Int): Record<M>

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
    fun byIds(ids: Collection<Int>): Bag<M>

    /**
     * Create Record with the given [ref]
     * 1. If the [ref] is in cache then the cached record is returned
     * 1. If the [ref] is not in the cache and not in the persitence layer an [EntityNotFoundByRef] is throw
     * if [throwError] is true otherwise return an empty Record
     */
    fun byRef(ref: String, throwError: Boolean = true): Record<M>

    /**
     * Don't use it internal use only
     * @see bagOf
     */
    @IShouldRefractorThis("I don't like it because a query is not always link to the current Model")
    @Deprecated("prefer use bagOf(q:SearchQueryImpl)")
    fun bagOf(query: Query): Bag<M>


    /**
     * Create a Bag from te given query
     */
    fun bagOf(query: SearchQuery<M>): Bag<M>

    /**
     * Create a Record from te given query
     * automaticaly add limit = 1 to the query
     */
    fun recordOf(query: SearchQuery<M>): Record<M>

    /**
     * Return A query for the current model
     */
    fun buildQuery(): SearchQuery<M>

    /**
     * Create a bag with the given where expression
     * This expression will be evaluated only if needed
     */
    fun where(predicate: SearchQueryWherePart<M>.(M) -> PredicateField): Bag<M>

    /**
     * Find the first record with the given where expression
     * Automatically a Limit 1 will be added to the query
     */
    fun whereFirst(predicate: SearchQueryWherePart<M>.(M) -> PredicateField): Record<M>

    /**
     * Create a [SearchQueryImpl] initialized with [init]
     */
    fun search(init: SearchQuery<M>.(M) -> Unit): Bag<M>

    /**
     * Create a Record initialized with [init]
     */
    fun searchFirst(init: SearchQuery<M>.(M) -> Unit): Record<M>

    /**
     * Create a new temporaty record with the [init] values
     * Then the [create] is called on it
     *
     * @see newTmpWithDefault if you want to create a temporary Record with default values
     * @see newTmp if you want to create a temporary Record without default values
     * @see newWithDefault if you want to create a Record with default values
     */
    fun new(init: Record<M>.() -> Unit): Record<M>

    /**
     * Create a new temporaty record with the [init] values
     * The [Model.defaultGet] is called before the [init]
     * Then the [create] function is applied on it
     *
     * @see newTmpWithDefault if you want to create a temporary Record with default values
     * @see newTmp if you want to create a temporary Record without default values
     * @see new if you want to create a Record without default values
     */
    fun newWithDefault(init: Record<M>.() -> Unit): Record<M>

    /**
     * Mark this entity to be persisted in the next flush call
     * The new record will not be create inside the database automatically
     * The real insert in the database will be done in the flush step
     *
     * @see newTmp if you want to create a temporary Record
     * @see Model.create This method is automatically called
     * @see PlatypusEnvironment.flush when this method is call the entity will be inserted in the database
     */
    fun create(entity: Record<M>): Record<M>

    /**
     * Create a new record with the [init] values
     * Warning you need to call [PlatypusEntity.create]
     *
     * @see create if you want to create this record in database
     * @see new if you want to create a new record with [create] automaticaly applied
     */
    fun newTmp(init: Record<M>.() -> Unit): Record<M>


    /**
     * Create a new record with the [init] values
     * The [Model.defaultGet] is called before the [init]
     * Warning you need to call [create] if you want to mark this temporary record to be persisted in the next flush
     *
     * @see create if you want to create this record in database
     * @see new if you want to create a new record with [create] automaticaly applied
     */
    fun newTmpWithDefault(init: Record<M>.() -> Unit): Record<M>

    /**
     * Delete the current record with the given Id
     * @return true if a record is effectively deleted otherwise false
     */
    fun delete(id: Int): Boolean

    /**
     * Delete the current record
     * @return true if a record is effectively deleted otherwise false
     */
    fun delete(id: Record<M>): Boolean

}