package org.platypus.entity

import org.platypus.PlatypusEnvironment
import org.platypus.bag.ArrayBag
import org.platypus.bag.Bag
import org.platypus.bag.MutableBag
import org.platypus.bag.relation.getMany2ManyBag
import org.platypus.bag.relation.getOne2ManyBag
import org.platypus.cache.CacheState
import org.platypus.cache.ModelID
import org.platypus.cache.PlatypusCache
import org.platypus.cache.of
import org.platypus.context.ContextKey
import org.platypus.model.Model
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.impl.ArchivedModelField
import org.platypus.model.field.impl.BinaryField
import org.platypus.model.field.impl.BooleanField
import org.platypus.model.field.impl.CreateDateModelField
import org.platypus.model.field.impl.CreateUID
import org.platypus.model.field.impl.DateField
import org.platypus.model.field.impl.DateTimeField
import org.platypus.model.field.impl.DecimalField
import org.platypus.model.field.impl.ExternalRefModelField
import org.platypus.model.field.impl.IntField
import org.platypus.model.field.impl.Many2ManyField
import org.platypus.model.field.impl.Many2OneField
import org.platypus.model.field.impl.MutliReferenceField
import org.platypus.model.field.impl.NameModelField
import org.platypus.model.field.impl.One2ManyField
import org.platypus.model.field.impl.One2OneField
import org.platypus.model.field.impl.RevOne2OneField
import org.platypus.model.field.impl.SelectionField
import org.platypus.model.field.impl.StringField
import org.platypus.model.field.impl.TextField
import org.platypus.model.field.impl.TimeField
import org.platypus.model.field.impl.WriteDateModelField
import org.platypus.model.field.impl.WriteUID
import org.platypus.module.base.entities.User
import org.platypus.module.base.entities.users
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import kotlin.reflect.KProperty

class RecordImpl<M : Model<M>>(
        internal val _id: Int,
        override val env: PlatypusEnvironment,
        override val model: M) : Record<M> {



    override val id: Int
        get() {
            val modId = model of _id
            return if (env.internal.cache.isInDB(modId)) {
                env.internal.cache.realID(modId).id
            } else {
                _id
            }
        }

    private fun repository(e: PlatypusEnvironment = env): RecordRepository<M> = RecordRepositoryImpl(e, model)

    override val displayName: String
        get() = model.nameGet.call(this).result

    override var name: String? by model.name
    override val createDate: LocalDateTime? by model.createDate
    override val writeDate: LocalDateTime? by model.writeDate
    override val createUid: User by model.createUid
    override val writeUid: User by model.writeUid
    //    val internalVersion: Int? by models.internalVersion
    override val externalRef: String? by model.externalRef
    override var archived: Boolean by model.archived

    fun nameGet(): String {
        return model.nameGet.call(this).result
    }

    internal val modelID: ModelID
        get() = model of _id

    override fun detach() {
        internalState = EntityState.DETACH
    }

    private val cacheState: CacheState
        get() = warmCache().state(modelID)

    /**
     * Attach the current entity to the [env] cache
     * put the [internalState] to [EntityState.MANAGED]
     */
    override fun attach() {
        internalState = EntityState.MANAGED
    }

    override fun validate(): Set<String> {
        val data = warmCache()[this.model of this.id]
        val res = HashSet<String>()
        for (f in model.fields) {
            if (f in data) {
                f.validateUnsafe(data[f])
            }
        }
        return res
    }

    override fun fetch(): Record<M> {
        return fetchForce(false)
    }

    override fun delete() {
        model.delete.call(this)
    }

    override fun copy(): Record<M> {
        TODO("not implemented")
    }

    override fun deepCopy(): Record<M> {
        TODO("not implemented")
    }

    fun fetchForce(force: Boolean): Record<M> {
        return if (!force) {
            repository().browse(id)
        } else {
            repository().fetch(id)
        }
    }

    override fun isStore(): Boolean {
        return env.internal.cache.isInDB(this.model of this._id)
    }

    /**
     * Return the Validate strategy used
     */
    override var validateMode: EntityValidateMode = EntityValidateMode.AUTO
        private set

    /**
     * Return the current state of the entity
     */
    override var internalState: EntityState = EntityState.MANAGED
        private set

    var readWriteMode: ReadWriteMode = ReadWriteMode.RW

    /**
     * Return a new Entity with the [sudoUser] = [user] and the same [id]
     * The data of the entity are still the same
     * @see PlatypusEnvironment.sudo
     */
    override fun sudo(user: User): Record<M> = repository(env.sudo(user)).browse(this._id)

    /**
     * Return a new Entity with the same [id]
     * the new Entity context equal to current [env.context] + [vals]
     * The data of the entity are still the same
     * @see PlatypusEnvironment.withContext
     */
    override fun withContext(vararg vals: ContextKey.Value<*>): Record<M> = repository(env.withContext(*vals)).browse(this.id)

    /**
     * Return an [PlatypusCache] to create all the min.
     */
    override fun warmCache(): PlatypusCache = env.internal.cache

    /**
     * Return a read only bag with only the current StoredEntity in it
     */
    override fun toBag(): Bag<M> = toMutableBag()

    /**
     * Return a bag with only the current StoredEntity in it
     */
    override fun toMutableBag(): MutableBag<M> = ArrayBag(env, model, listOf(id))

    override fun fetchIfNeeded(field: ModelField<M, *>): Record<M> = this

    override operator fun TimeField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): LocalTime? {
        fetchIfNeeded(this)
        return warmCache()[o.model of o.id, this].second
    }

    override operator fun NameModelField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): String? {
        fetchIfNeeded(this)
        return warmCache()[o.model of o.id, this].second
    }

    override operator fun ExternalRefModelField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): String? {
        fetchIfNeeded(this)
        return warmCache()[o.model of o.id, this].second
    }

    override operator fun StringField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): String? {
        fetchIfNeeded(this)
        return warmCache()[o.model of o.id, this].second
    }

    override operator fun TextField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): String? {
        fetchIfNeeded(this)
        return warmCache()[o.model of o.id, this].second
    }

    override operator fun DateField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): LocalDate? {
        fetchIfNeeded(this)
        return warmCache()[o.model of o.id, this].second
    }

    override operator fun DateTimeField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): LocalDateTime? {
        fetchIfNeeded(this)
        return warmCache()[o.model of o.id, this].second
    }

    override fun CreateDateModelField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): LocalDateTime {
        fetchIfNeeded(this)
        return warmCache()[o.model of o.id, this].second ?: LocalDateTime.now()
    }

    override fun WriteDateModelField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): LocalDateTime? {
        fetchIfNeeded(this)
        return warmCache()[o.model of o.id, this].second
    }


    override operator fun BooleanField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): Boolean {
        fetchIfNeeded(this)
        return warmCache()[o.model of o.id, this].second
    }

    override operator fun DecimalField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): BigDecimal? {
        fetchIfNeeded(this)
        return warmCache()[o.model of o.id, this].second
    }

    override operator fun IntField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): Int? {
        fetchIfNeeded(this)
        return warmCache()[o.model of o.id, this].second
    }

    override operator fun <D : PlatypusSelection<M>> SelectionField<M, D>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): D? {
        fetchIfNeeded(this)
        return this.selection.getUnsafe(warmCache()[o.model of o.id, this].second)
    }

    override operator fun BinaryField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): ByteArray? {
        return warmCache()[o.model of o.id, this].second
    }

    override operator fun <TM : Model<TM>> Many2ManyField<M, TM>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): Bag<TM> {
        return getMany2ManyBag(o.model of o.id, this, o.env, { warmCache() })
    }

    override operator fun CreateUID<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): User {
        return env.users.browse(warmCache()[modelID, this].second!!.id)
    }

    override operator fun WriteUID<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): User {
        return env.users.browse(warmCache()[modelID, this].second?.id ?: env.envUser.id)
    }

    override operator fun <TM : Model<TM>> One2ManyField<M, TM>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): Bag<TM> {
        return getOne2ManyBag(o.model of o.id, this, o.env, { warmCache() })
    }

    override operator fun <TM : Model<TM>> Many2OneField<M, TM>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): Record<TM>? {
        val modelID = o.model of o.id
        val res = warmCache()[modelID, this].second
        return if (res == null) {
            if (env.internal.cache.isNotInDB(modelID)) {
                null
            } else {
                repository(o.env).browse(o.id)
                val newRes = warmCache()[o.model of o.id, this].second
                        ?: throw IllegalStateException("Can't find the value of the field ${this.completeName}")
                RecordRepositoryImpl(o.env, this.target).browse(newRes.id)
            }
        } else {
            RecordRepositoryImpl(o.env, this.target).browse(res.id)
        }
    }

    override operator fun <TM : Model<TM>> One2OneField<M, TM>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): Record<TM>? {
        val modelID = o.model of o.id
        val res = warmCache()[modelID, this].second
        return if (res == null) {
            if (env.internal.cache.isNotInDB(modelID)) {
                null
            } else {
                repository(env).browse(o.id)
                val newRes = warmCache()[o.model of o.id, this].second
                        ?: throw IllegalStateException("Can't find the value of the field ${this.completeName}")
                RecordRepositoryImpl(o.env, this.target).browse(newRes.id)
            }
        } else {
            RecordRepositoryImpl(o.env, this.target).browse(res.id)
        }
    }

    override operator fun <TM : Model<TM>> RevOne2OneField<M, TM>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): Record<TM>? {
        val modelID = o.model of o.id
        val res = warmCache()[modelID, this].second
        return if (res == null) {
            null
        } else {
            RecordRepositoryImpl(o.env, this.targetField().model).browse(res.id)
        }
    }

    override operator fun NameModelField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: String?) {
        o.performUpdate(this, value)
    }

    override operator fun IntField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: Int?) {
        o.performUpdate(this, value)
    }

    override operator fun StringField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: String?) {
        o.performUpdate(this, value)
    }

    override operator fun <D : PlatypusSelection<M>> SelectionField<M, D>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: D?) {
        o.performUpdate(this, value)
    }

    override operator fun TextField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: String?) {
        o.performUpdate(this, value)
    }


    override operator fun DateField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: LocalDate?) {
        o.performUpdate(this, value)
    }


    override operator fun DateTimeField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: LocalDateTime?) {
        o.performUpdate(this, value)
    }


    override operator fun TimeField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: LocalTime?) {
        o.performUpdate(this, value)
    }


    override operator fun BooleanField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: Boolean?) {
        o.performUpdate(this, value)
    }


    override operator fun DecimalField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: BigDecimal?) {
        o.performUpdate(this, value)
    }


    override operator fun BinaryField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: ByteArray?) {
        o.performUpdate(this, value)
    }

    override operator fun ArchivedModelField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: Boolean?) {
        o.performUpdate(this, value)
    }

    override operator fun ArchivedModelField<M>.getValue(o: MutableRecordDelegate<M>, desc: KProperty<*>): Boolean {
        return warmCache()[o.model of o.id, this].second
    }

    override operator fun <TM : Model<TM>> Many2OneField<M, TM>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: Record<TM>?) {
        o.performUpdate(this, value)
    }

    override operator fun <TM : Model<TM>> One2OneField<M, TM>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: Record<TM>?) {
        o.performUpdate(this, value)
    }

    override operator fun <TM : Model<TM>> RevOne2OneField<M, TM>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: Record<TM>?) {
        o.performUpdate(this, value)
    }

    override operator fun <TM : Model<TM>> One2ManyField<M, TM>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: Iterable<Record<TM>>) {
        o.performUpdate(this, this.asBag(value))
    }


    override operator fun <TM : Model<TM>> Many2ManyField<M, TM>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: Iterable<Record<TM>>) {
        o.performUpdate(this, this.asBag(value))
    }

    fun checkAccessWrite(field: ModelField<M, *>) {
        if (readWriteMode == ReadWriteMode.RO) {
            throw IllegalStateException("You can't mutate an entity in ReadOnly mode")
        }
    }

    private fun <TM : Model<TM>> MutliReferenceField<M, TM>.asBag(iterable: Iterable<Record<TM>>): Bag<TM> {
        return when (iterable) {
            is Bag<*> -> iterable as Bag<TM>
            else -> {
                ArrayBag(this@RecordImpl.env, iterable.model, iterable.ids)
            }
        }
    }

    internal fun update(fieldWrite: FieldsWrite<M>) {
        val oldMode = this.readWriteMode
        this.readWriteMode = ReadWriteMode.RO
        model.update.call(this, fieldWrite)
        this.readWriteMode = oldMode
    }

    fun <KT : Any> MutableRecordDelegate<M>.performUpdate(field: ModelField<M, KT>, value: KT?) {
        checkAccessWrite(field)
        field.validateAndThrow(value)
        if (warmCache().isNotInDB(this.modelID)) {
            println("Direct Set in cache $field, $value")
            warmCache().put(field, this.modelID, value)
        } else {
            println("Call Update Set in cache $field, $value")
            update(FieldsWrite<M>(mapOf(field to value)))
        }
    }

    val <M : Model<M>> MutableRecordDelegate<M>.modelID:ModelID
            get() = model of id



    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Record<*>

        if (id != other.id) return false
        if (model != other.model) return false

        return true
    }

    override fun hashCode(): Int {
        var result = _id
        result = 31 * result + model.hashCode()
        return result
    }

    override fun toString(): String {
        return "${model.modelName}($_id)"
    }

    override operator fun plus(other: Record<M>): Bag<M> {
        return ArrayBag(env, model, listOf(this.id, other.id))
    }
}

val <TM : Model<TM>> Iterable<Record<TM>>.model: TM
    get() = if (this is Bag<*>) {
        this.model as TM
    } else {
        this.first().model
    }

val <TM : Model<TM>> Iterable<Record<TM>>.ids: List<Int>
    get() {
        return if (this is Bag<*>) {
            this.ids.toList()
        } else {
            val ids = ArrayList<Int>()
            for (rec in this) {
                ids.add(rec.id)
            }
            ids
        }

    }


