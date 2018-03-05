package org.platypus.entity

import org.platypus.ContextAble
import org.platypus.Identifiable
import org.platypus.SudoAble
import org.platypus.bag.Bag
import org.platypus.bag.MutableBag
import org.platypus.cache.PlatypusCache
import org.platypus.model.Model
import org.platypus.model.field.api.ModelField
import org.platypus.module.base.entities.User
import java.time.LocalDateTime

interface Record<M : Model<M>> :
        SudoAble<Record<M>>,
        Identifiable,
        ContextAble<Record<M>>,
        MutableRecordDelegate<M> {


    /**
     * The string representation of the current Record
     */
    val displayName: String

//    TODO To remove ?
    var name:String?

    val createDate: LocalDateTime?
    val writeDate: LocalDateTime?
    val createUid: User
    val writeUid: User
    val externalRef: String?
    var archived: Boolean

    /**
     * Detach the current entity of the [env] cache
     * put the [internalState] to [EntityState.DETACH]
     *
     * A record in [EntityState.DETACH] mode will no longer trigger Update, delete or insert statement in the persitence layer
     * All the modification will be loss at the end of the environment
     */
    fun detach()

    /**
     * Attach the current entity to the [env] cache
     * put the [internalState] to [EntityState.MANAGED]
     *
     * A record in [EntityState.MANAGED] mode will be watched to trigger Update, delete or insert statement in the persitence layer
     * All the modification will be persisted at the end of the environment
     */
    fun attach()

    /**
     * Return the current state of the entity
     */
    val internalState: EntityState

    /**
     * Convert this Record to a bog with only one elemement witch is the current record
     * The implementation should guarantee that code is correct [this.toBag().first() === this]
     */
    fun toBag(): Bag<M>

    /**
     * Return the cache instance used by this Record
     */
    fun warmCache(): PlatypusCache

    /**
     * Return a bag with only the current StoredEntity in it
     * The implementation should guarantee that code is correct [this.toBag().first() === this]
     */
    abstract fun toMutableBag(): MutableBag<M>


    /**
     * An handly method to add the current Record to a [bag] with an other record of the same [Model]
     */
    operator fun plus(other: Record<M>): Bag<M>

    /**
     * Validate the entity and return a [Set] of [String] if some error exist
     * No [Exception] will fire
     *
     * The [Set] can be empty if no error is detected
     * See the current Implementation to see what is validated in the current record
     */
    fun validate(): Set<String>

    /**
     * Return the Validate strategy used
     * @see EntityValidateMode
     */
    val validateMode: EntityValidateMode

    /**
     * Return [true] if the current record is in persitence layer or will be at the end of the [PlatypusEnvironement]
     */
    fun isStore(): Boolean

    /**
     * Fetch the current entity with the current [predicate] and erase the value in the cache with the new one
     * Before a flush only for this record is processed
     * Can throw a [MissingRecordException] if the entity don't exist anymore in the persitence layer
     */
    fun fetch(): Record<M>

    /**
     * Execute a fetch if the current field is not in the [PlatypusCache] retreive by [warmCache]
     *
     * If the field is in cache the nothing appen,
     * overrise fetch the current field and all the other field withch is not in cache for the current [Record] only
     */
    fun fetchIfNeeded(field: ModelField<M, *>): Record<M>

    /**
     * Remove the entity of the database
     * put the [internalState] to [EntityState.DELETED]
     */
    fun delete()

    /**
     * Create a copy of it self
     * The copy is always in the state [EntityState.MANAGED]
     *
     * By default the copy only copey the field with the [FieldSlot.copy] == true
     * The relation of the current record will no be copy
     */
    fun copy(): Record<M>


    /**
     * Same as copy but copy the linked object too
     * @see copy
     */
    fun deepCopy(): Record<M>

}