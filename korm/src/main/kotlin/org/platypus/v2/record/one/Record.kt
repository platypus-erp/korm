package org.platypus.v2.record.one

import org.platypus.ContextAble
import org.platypus.Environmentable
import org.platypus.SudoAble
import org.platypus.cache.PlatypusCache
import org.platypus.entity.EntityState
import org.platypus.entity.EntityValidateMode
import org.platypus.entity.Selection
import org.platypus.entity.SelectionValue
import org.platypus.model.Model
import org.platypus.module.base.entities.User
import org.platypus.v2.model.BaseModel
import org.platypus.v2.model.field.BinaryField
import org.platypus.v2.model.field.BooleanField
import org.platypus.v2.model.field.DateField
import org.platypus.v2.model.field.DateTimeField
import org.platypus.v2.model.field.DecimalField
import org.platypus.v2.model.field.IntField
import org.platypus.v2.model.field.Many2ManyField
import org.platypus.v2.model.field.Many2OneField
import org.platypus.v2.model.field.One2ManyField
import org.platypus.v2.model.field.SelectionField
import org.platypus.v2.model.field.StringField
import org.platypus.v2.model.field.TextField
import org.platypus.v2.model.field.TimeField
import org.platypus.v2.model.field.api.BaseField
import org.platypus.v2.model.field.magic.CreateDateField
import org.platypus.v2.model.field.magic.CreateUserField
import org.platypus.v2.model.field.magic.ExternalRefField
import org.platypus.v2.model.field.magic.WriteDateField
import org.platypus.v2.model.field.magic.WriteUserField
import org.platypus.v2.record.bag.Bag
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import kotlin.reflect.KProperty

interface Record<M : BaseModel<M>> : SudoAble<Record<M>>,ContextAble<Record<M>>, Environmentable {

    /**
     * The string representation of the current Record
     */
    val displayName: String
    val createDate: LocalDateTime?
    val writeDate: LocalDateTime?
    val createUid: User
    val writeUid: User
    val externalRef: String?

    /**
     * Convert this Record to a bag with only one element witch is the current record
     * The implementation should guarantee that code is correct [this.toBag().first() === this]
     */
    fun toBag(): Bag<M>

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
     * If the field is in cache the nothing append,
     * overrise fetch the current field and all the other field withch is not in cache for the current [Record] only
     */
    fun fetchIfNeeded(field: BaseField<M, *>): Record<M>

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
    /**
     * Remove the entity of the database
     * put the [internalState] to [EntityState.DELETED]
     */
    fun delete()

    operator fun set(fieldName:String, value:Any?)

    //region GETTER
    operator fun TimeField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): LocalTime?
    operator fun ExternalRefField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): String?
    operator fun StringField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): String?
    operator fun TextField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): String?
    operator fun DateField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): LocalDate?
    operator fun DateTimeField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): LocalDateTime?
    operator fun BooleanField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): Boolean
    operator fun DecimalField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): BigDecimal
    operator fun IntField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): Int
    operator fun <D : Selection<D>> SelectionField<M, D>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): SelectionValue<D>?
    operator fun BinaryField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): ByteArray?
    operator fun CreateUserField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): User
    operator fun WriteUserField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): User
    operator fun <TM : BaseModel<TM>> One2ManyField<M, TM>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): Bag<TM>
    operator fun <TM : BaseModel<TM>> Many2ManyField<M, TM>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): Bag<TM>
    operator fun <TM : BaseModel<TM>> Many2OneField<M, TM>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): Record<TM>
    operator fun CreateDateField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): LocalDateTime
    operator fun WriteDateField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): LocalDateTime?
    //endregion

    //region SETTER
    operator fun IntField<M>.setValue(o: MutableRecord<M>, desc: KProperty<*>, value: Int?)
    operator fun StringField<M>.setValue(o: MutableRecord<M>, desc: KProperty<*>, value: String?)
    operator fun <D : Selection<D>> SelectionField<M, D>.setValue(o: MutableRecord<M>, desc: KProperty<*>, value: SelectionValue<D>?)
    operator fun TextField<M>.setValue(o: MutableRecord<M>, desc: KProperty<*>, value: String?)
    operator fun DateField<M>.setValue(o: MutableRecord<M>, desc: KProperty<*>, value: LocalDate?)
    operator fun DateTimeField<M>.setValue(o: MutableRecord<M>, desc: KProperty<*>, value: LocalDateTime?)
    operator fun TimeField<M>.setValue(o: MutableRecord<M>, desc: KProperty<*>, value: LocalTime?)
    operator fun BooleanField<M>.setValue(o: MutableRecord<M>, desc: KProperty<*>, value: Boolean?)
    operator fun DecimalField<M>.setValue(o: MutableRecord<M>, desc: KProperty<*>, value: BigDecimal?)
    operator fun BinaryField<M>.setValue(o: MutableRecord<M>, desc: KProperty<*>, value: ByteArray?)
    operator fun <TM : BaseModel<TM>> Many2OneField<M, TM>.setValue(o: MutableRecord<M>, desc: KProperty<*>, value: Record<TM>?)
    operator fun <TM : BaseModel<TM>> One2ManyField<M, TM>.setValue(o: MutableRecord<M>, desc: KProperty<*>, value: Iterable<Record<TM>>)
    operator fun <TM : BaseModel<TM>> Many2ManyField<M, TM>.setValue(o: MutableRecord<M>, desc: KProperty<*>, value: Iterable<Record<TM>>)
    //endregion
}