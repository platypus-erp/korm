package org.platypus.cache

import com.beust.klaxon.internal.firstNotNullResult
import org.platypus.cache.CacheState.FETCHED
import org.platypus.cache.CacheState.NONE
import org.platypus.cache.CacheState.PARTIALLY
import org.platypus.cache.CacheState.UPDATED
import org.platypus.entity.PlatypusSelection
import org.platypus.entity.Record
import org.platypus.model.IModel
import org.platypus.model.LinkModel
import org.platypus.model.Model
import org.platypus.model.ModelMany2Many
import org.platypus.model.ReferenceModel
import org.platypus.model.field.api.FieldVisitor
import org.platypus.model.field.api.IModelField
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.api.ModelFieldType
import org.platypus.model.field.api.ReferencedField
import org.platypus.model.field.api.isRelationalField
import org.platypus.model.field.impl.ArchivedModelField
import org.platypus.model.field.impl.BinaryField
import org.platypus.model.field.impl.BooleanField
import org.platypus.model.field.impl.CreateDateModelField
import org.platypus.model.field.impl.CreateUID
import org.platypus.model.field.impl.DateField
import org.platypus.model.field.impl.DateTimeField
import org.platypus.model.field.impl.DecimalField
import org.platypus.model.field.impl.ExternalRefModelField
import org.platypus.model.field.impl.FieldAlias
import org.platypus.model.field.impl.IntField
import org.platypus.model.field.impl.Many2ManyField
import org.platypus.model.field.impl.Many2OneField
import org.platypus.model.field.impl.Many2OneFieldLink
import org.platypus.model.field.impl.NameModelField
import org.platypus.model.field.impl.One2ManyField
import org.platypus.model.field.impl.One2OneField
import org.platypus.model.field.impl.PKModelField
import org.platypus.model.field.impl.RevOne2OneField
import org.platypus.model.field.impl.SelectionField
import org.platypus.model.field.impl.StringField
import org.platypus.model.field.impl.TextField
import org.platypus.model.field.impl.TimeField
import org.platypus.model.field.impl.WriteDateModelField
import org.platypus.model.field.impl.WriteUID
import org.platypus.orm.ReferenceOption
import org.platypus.orm.exceptions.OnDeleteRestrictError
import org.platypus.orm.sql.dml.RefereeFinder
import org.platypus.orm.sql.dml.storeFields
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.query.ResultRow
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime


data class ModelID(val model: IModel<*>, val id: Int)
data class ModelIDS(val model: IModel<*>, val ids: List<Int>)

fun ModelIDS.isNotEmpty(): Boolean = ids.isNotEmpty()
fun ModelIDS.isEmpty(): Boolean = ids.isEmpty()
fun ModelIDS.toListID(): List<ModelID> = this.ids.map { this.model of it }

infix fun IModel<*>.of(id: Int): ModelID = ModelID(this, id)
fun ModelID.toModelIDS(): ModelIDS = model of listOf(id)

infix fun IModel<*>.of(ids: List<Int>): ModelIDS = ModelIDS(this, ids)
val Record<*>.modelID: ModelID get() = ModelID(this.model, this.id)

data class ToUpdate(val modelId: ModelID, val props: MutableSet<IModelField<*, *>>)

enum class VisitCacheType {
    SET, GET
}

private interface CacheVisitorSetter : FieldVisitor<Pair<ModelID, Any?>, Unit> {

    fun warmCache(): PlatypusCache

    override fun visit(field: StringField<*>, p: Pair<ModelID, Any?>) {
        warmCache()[p.first, field] = p.second as String?
    }

    override fun visit(field: DateField<*>, p: Pair<ModelID, Any?>) {
        warmCache()[p.first, field] = p.second as LocalDate?
    }

    override fun visit(field: DateTimeField<*>, p: Pair<ModelID, Any?>) {
        warmCache()[p.first, field] = p.second as LocalDateTime?
    }

    override fun visit(field: TimeField<*>, p: Pair<ModelID, Any?>) {
        warmCache()[p.first, field] = p.second as LocalTime?
    }

    override fun visit(field: BooleanField<*>, p: Pair<ModelID, Any?>) {
        warmCache()[p.first, field] = p.second as Boolean
    }

    override fun visit(field: TextField<*>, p: Pair<ModelID, Any?>) {
        warmCache()[p.first, field] = p.second as String?
    }

    override fun visit(field: DecimalField<*>, p: Pair<ModelID, Any?>) {
        warmCache()[p.first, field] = p.second as BigDecimal?
    }

    override fun visit(field: IntField<*>, p: Pair<ModelID, Any?>) {
        warmCache()[p.first, field] = p.second as Int?
    }

    override fun visit(field: BinaryField<*>, p: Pair<ModelID, Any?>) {
        warmCache()[p.first, field] = p.second as ByteArray?
    }

    override fun visit(field: Many2OneFieldLink<*, *>, p: Pair<ModelID, Any?>) {
        warmCache()[p.first, field] = p.second as ModelID?
    }

    override fun visit(field: One2ManyField<*, *>, p: Pair<ModelID, Any?>) {
        warmCache()[p.first, field] = p.second as Pair<CacheState, ModelIDS?>
    }

    override fun visit(field: Many2OneField<*, *>, p: Pair<ModelID, Any?>) {
        warmCache()[p.first, field] = p.second as ModelID?
    }

    override fun visit(field: One2OneField<*, *>, p: Pair<ModelID, Any?>) {
        warmCache()[p.first, field] = p.second as ModelID?
    }

    override fun visit(field: RevOne2OneField<*, *>, p: Pair<ModelID, Any?>) {
        warmCache()[p.first, field] = p.second as ModelID?
    }

    override fun visit(field: Many2ManyField<*, *>, p: Pair<ModelID, Any?>) {
        warmCache()[p.first, field] = p.second as Pair<CacheState, ModelIDS?>
    }

    override fun visit(field: PKModelField<*>, p: Pair<ModelID, Any?>) {
        warmCache().forceSet(p.first, field, p.second as Int)
    }

    override fun visit(field: SelectionField<*, *>, p: Pair<ModelID, Any?>) {
        warmCache()[p.first, field] = p.second as PlatypusSelection<*>?
    }

    override fun visit(field: NameModelField<*>, p: Pair<ModelID, Any?>) {
        warmCache()[p.first, field] = p.second as String?
    }

    override fun visit(field: ExternalRefModelField<*>, p: Pair<ModelID, Any?>) {
        warmCache()[p.first, field] = p.second as String?
    }

    override fun visit(field: WriteDateModelField<*>, p: Pair<ModelID, Any?>) {
        warmCache()[p.first, field] = p.second as LocalDateTime?
    }

    override fun visit(field: CreateDateModelField<*>, p: Pair<ModelID, Any?>) {
        warmCache()[p.first, field] = p.second as LocalDateTime?
    }

    override fun visit(field: ArchivedModelField<*>, p: Pair<ModelID, Any?>) {
        warmCache()[p.first, field] = p.second as Boolean
    }

    override fun visit(field: FieldAlias<*, *>, p: Pair<ModelID, Any?>) {
        field.delegate.accept(this, p)
    }

    override fun visit(field: CreateUID<*>, p: Pair<ModelID, Any?>) {
        warmCache()[p.first, field] = p.second as ModelID
    }

    override fun visit(field: WriteUID<*>, p: Pair<ModelID, Any?>) {
        warmCache()[p.first, field] = p.second as ModelID
    }
}

class PlatypusCache : AutoCloseable {

    private val data: MutableMap<IModel<*>, MutableMap<Int, MutableMap<IModelField<*, *>, Any?>>> = HashMap()
    private val dataState: MutableMap<IModel<*>, MutableMap<Int, MutableMap<IModelField<*, *>, CacheState>>> = HashMap()
    private val scheduledUpdate: MutableMap<IModel<*>, MutableMap<Int, MutableSet<IModelField<*, *>>>> = HashMap()
    private val scheduledInsert: MutableMap<ModelID, ModelID?> = HashMap()
    private val scheduledDelete: MutableList<ModelID> = ArrayList()
    var counter: Int = 0

    val toInsert: Set<ModelID>
        get() = scheduledInsert.filter { it.value == null }.keys

    val toUpdate: Map<IModel<*>, Map<Int, Set<IModelField<*, *>>>>
        get() = scheduledUpdate

    val toDelete: List<ModelID>
        get() = scheduledDelete

    fun reset() {
        println("Clear reset cache")
        scheduledUpdate.clear()
        scheduledDelete.clear()
        for (a in dataState) {
            for (b in a.value) {
                for (c in b.value) {
                    c.setValue(FETCHED)
                }
            }
        }
    }

    private val visitorSetter: FieldVisitor<Pair<ModelID, Any?>, Unit> = object : CacheVisitorSetter {
        override fun warmCache(): PlatypusCache {
            return this@PlatypusCache
        }
    }

    fun put(field: ModelField<*, *>, modelId: ModelID, value: Any?) {
        field.accept(visitorSetter, modelId to field.toCacheValue(value))
    }

    override fun close() {
        reset()
    }

    internal fun replaceData(modelId: ModelID, values: Map<IModelField<*, *>, Any?>) {
        data.getOrPut(modelId.model, { HashMap() })[modelId.id] = values.toMutableMap()
    }


    operator fun get(modelId: ModelID): Map<IModelField<*, *>, Any?> {
        return getData(modelId)
    }

    operator fun get(modelRef: Pair<Model<*>, String>): ModelID? {
        return data[modelRef.first]
                ?.filter { it.value[modelRef.first.externalRef] == modelRef.second }
                ?.map { it.key }
                ?.firstNotNullResult { modelRef.first of it }
    }

    private fun getData(modelId: ModelID): Map<IModelField<*, *>, Any?> =
            data.getOrPut(modelId.model, { HashMap() }).getOrPut(modelId.id, { HashMap() })

    private infix fun ModelID.valueOf(prop: IModelField<*, *>): Any? =
            data.getOrPut(model, { HashMap() }).getOrPut(id, { HashMap() })[prop]

    private infix fun ModelID.stateOf(prop: IModelField<*, *>): CacheState =
            dataState[model]?.get(id)?.get(prop) ?: NONE

    fun setState(id: ModelID, prop: IModelField<*, *>, state: CacheState): CacheState {
        val oldState = id stateOf prop
        id.setState(prop, state)
        return oldState
    }

    private fun ModelID.setState(prop: IModelField<*, *>, state: CacheState) {
        dataState.getOrPut(model, { HashMap() }).getOrPut(id, { HashMap() })[prop] = state
    }

    private infix fun ModelID.updateState(prop: IModelField<*, *>) {
        setState(prop, stateOf(prop).update())
    }

    fun <M : Model<M>> scheduleInsert(model: M, entity: Record<M>): Record<M> {
        scheduledInsert[model of entity.id] = null
        return entity
    }

    operator fun MutableMap<LinkModel<*, *>, ArrayList<Pair<Int, Int>>>.get(model: LinkModel<*, *>, defaultValue: ArrayList<Pair<Int, Int>>): ArrayList<Pair<Int, Int>> {
        return this.getOrDefault(model, defaultValue)
    }


    /**
     * Add the value to the cache without any check or any logic
     * The modelId will not be flag as ToInsert ou ToUpdate
     * The sate of the field will be [UPDATED] OR [PARTIALLY]
     */
    fun forceSet(modelId: ModelID, f: IModelField<*, *>, value: Any?, forceState: CacheState? = null) {
        val state = modelId stateOf f
        when (state) {
            FETCHED, UPDATED -> modelId.setState(f, forceState ?: UPDATED)
            NONE, PARTIALLY -> modelId.setState(f, forceState ?: PARTIALLY)
        }
        val valueConverted = value?.let {
            when (f.type.typeEnum) {
                ModelFieldType.MANY_TO_ONE, ModelFieldType.ONE_TO_ONE -> {
                    (f as ReferencedField<*, *>).target of (value as Int)
                }
                else -> value
            }
        }
        data.getOrPut(modelId.model, { HashMap() }).getOrPut(modelId.id, { HashMap() })[f] = valueConverted
    }

    operator fun contains(id: ModelID): Boolean {
        return id.model in data.keys && id.id in data[id.model]!!.keys
                && data[id.model]?.get(id.id)?.isNotEmpty() ?: false
    }

    fun createFakeRecordIfNeeded(model: IModel<*>, id: Int?): ModelID {
        val modelId = if (id == null) model of --counter else model of id
        getData(modelId)
        return modelId
    }

    /**
     * Store the current [row] in the cache all existing value will be erased
     * and all the state of the field will be [FETCHED]
     * The [fields] should containt only [ModelField] as expression
     * The [modelId] must be in the database
     */
    fun store(modelId: ModelID, fieldsToStore: Set<Expression<*>>, row: ResultRow) {
        if (isNotInDB(modelId)) {
            throw IllegalStateException("You can't create a record not currently in the persitence layer")
        }

        val mapFields = fieldsToStore.map { it as ModelField<*, *> }.groupBy { it.model }
        for ((mo, fields) in mapFields) {
            val idF = fields.first { it == mo.id }
            val id = row.tryGet(mo.id)
            for (field in fields) {
                val value: Any? = row[field]
                forceSet(modelId, field, value, FETCHED)
                val refere = field.accept(RefereeFinder, Unit)
                if (refere != null && value != null) {
                    forceSet(refere.of(value as Int), refere.id, value)
                }
            }
        }
    }

    fun store(row: ResultRow) {
        val mapFields = row.expr.map { it as IModelField<*, *> }.groupBy { it.model }
        for ((mo, fields) in mapFields) {
            val id = row.tryGet(mo.id)
                    ?: throw IllegalStateException("Can't find an id for the model ${mo.modelName} in the result Row")
            if (fields.containsAll(mo.storeFields)) {
                forceSet(mo of id, mo.id, id, FETCHED)
            } else {
                forceSet(mo of id, mo.id, id, PARTIALLY)
            }
            for (field in fields) {
                val value: Any? = row[field]
                if (field != mo.id) {
                    forceSet(mo of id, field, value, FETCHED)
                    val refere = field.accept(RefereeFinder, Unit)
                    if (refere != null && value != null) {
                        forceSet(refere.of(value as Int), refere.id, value)
                    }
                }
            }
        }
    }

    fun realID(modelId: ModelID): ModelID {
        if (isNotInDB(modelId)) {
            throw IllegalStateException("Please call isInDB before")
        }
        var id = modelId.model of 0
        if (modelId.id > 0) {
            id = modelId
        } else {
            val insertedRef = scheduledInsert[modelId]!!
            if (insertedRef.id > 0) {
                id = insertedRef
            }
        }
        return id
    }

    fun isNotInDB(modelId: ModelID): Boolean {
        return modelId.id <= 0 && scheduledInsert[modelId] == null
    }

    fun isToUpdate(modelId: ModelID, prop: IModelField<*, *>): Boolean {
        return prop in scheduledUpdate[modelId.model]?.get(modelId.id) ?: emptySet<IModelField<*, *>>()
    }

    fun isInDB(modelId: ModelID): Boolean {
        return !isNotInDB(modelId)
    }

    internal fun <T : Any> getValue(modelId: ModelID, prop: ModelField<*, T>): Pair<CacheState, T?> {
        return (modelId stateOf prop) to (modelId valueOf prop) as T?
    }

    operator fun get(modelId: ModelID, prop: StringField<*>): Pair<CacheState, String?> {
        return getValue(modelId, prop)
    }

    operator fun set(modelId: ModelID, prop: StringField<*>, value: String?) {
        updateValue(modelId, prop, value)
    }

    operator fun get(modelId: ModelID, prop: IntField<*>): Pair<CacheState, Int?> {
        return getValue(modelId, prop)
    }

    operator fun set(modelId: ModelID, prop: IntField<*>, value: Int?) {
        updateValue(modelId, prop, value)
    }

    operator fun get(modelId: ModelID, prop: BooleanField<*>): Pair<CacheState, Boolean> {
        return (modelId stateOf prop) to ((modelId valueOf prop) as Boolean? ?: false)
    }

    operator fun set(modelId: ModelID, prop: BooleanField<*>, value: Boolean) {
        updateValue(modelId, prop, value)
    }

    operator fun get(modelId: ModelID, prop: DecimalField<*>): Pair<CacheState, BigDecimal?> {
        return getValue(modelId, prop)
    }

    operator fun set(modelId: ModelID, prop: DecimalField<*>, value: BigDecimal?) {
        updateValue(modelId, prop, value)
    }

    operator fun get(modelId: ModelID, prop: DateField<*>): Pair<CacheState, LocalDate?> {
        return getValue(modelId, prop)
    }

    operator fun set(modelId: ModelID, prop: DateField<*>, value: LocalDate?) {
        updateValue(modelId, prop, value)
    }

    operator fun get(modelId: ModelID, prop: SelectionField<*, *>): Pair<CacheState, String?> {
        return (modelId stateOf prop) to ((modelId valueOf prop) as String?)
    }

    operator fun set(modelId: ModelID, prop: SelectionField<*, *>, value: PlatypusSelection<*>?) {
        updateValue(modelId, prop, value?.value)
    }

    operator fun get(modelId: ModelID, prop: DateTimeField<*>): Pair<CacheState, LocalDateTime?> {
        return getValue(modelId, prop)
    }

    operator fun set(modelId: ModelID, prop: DateTimeField<*>, value: LocalDateTime?) {
        updateValue(modelId, prop, value)
    }

    operator fun get(modelId: ModelID, prop: NameModelField<*>): Pair<CacheState, String?> {
        return getValue(modelId, prop)
    }

    operator fun set(modelId: ModelID, prop: NameModelField<*>, value: String?) {
        updateValue(modelId, prop, value)
    }

    operator fun get(modelId: ModelID, prop: ExternalRefModelField<*>): Pair<CacheState, String?> {
        return getValue(modelId, prop)
    }

    internal operator fun set(modelId: ModelID, prop: ExternalRefModelField<*>, value: String?) {
        updateValue(modelId, prop, value)
    }

    operator fun get(modelId: ModelID, prop: CreateDateModelField<*>): Pair<CacheState, LocalDateTime?> {
        return getValue(modelId, prop)
    }

    operator fun set(modelId: ModelID, prop: CreateDateModelField<*>, value: LocalDateTime?) {
        updateValue(modelId, prop, value)
    }

    operator fun get(modelId: ModelID, prop: WriteDateModelField<*>): Pair<CacheState, LocalDateTime?> {
        return getValue(modelId, prop)
    }

    operator fun set(modelId: ModelID, prop: WriteDateModelField<*>, value: LocalDateTime?) {
        updateValue(modelId, prop, value)
    }

    operator fun get(modelId: ModelID, prop: TimeField<*>): Pair<CacheState, LocalTime?> {
        return getValue(modelId, prop)
    }

    operator fun set(modelId: ModelID, prop: TimeField<*>, value: LocalTime?) {
        updateValue(modelId, prop, value)
    }

    operator fun get(modelId: ModelID, prop: TextField<*>): Pair<CacheState, String?> {
        return getValue(modelId, prop)
    }

    operator fun set(modelId: ModelID, prop: TextField<*>, value: String?) {
        updateValue(modelId, prop, value)
    }

    operator fun get(modelId: ModelID, prop: BinaryField<*>): Pair<CacheState, ByteArray?> {
        return getValue(modelId, prop)
    }

    operator fun set(modelId: ModelID, prop: BinaryField<*>, value: ByteArray?) {
        updateValue(modelId, prop, value)
    }

    operator fun set(modelId: ModelID, prop: ArchivedModelField<*>, value: Boolean) {
        updateValue(modelId, prop, value)
    }

    operator fun get(modelId: ModelID, prop: ArchivedModelField<*>): Pair<CacheState, Boolean> {
        return (modelId stateOf prop) to ((modelId valueOf prop) as Boolean? ?: false)
    }

    private fun ModelID.filterDeleted(): ModelID? {
        return if (this in scheduledDelete) return null else this
    }

    private fun ModelIDS.filterDeleted(): ModelIDS? {
        return this.model of this.ids.filter { (this.model of it) !in this@PlatypusCache.scheduledDelete }
    }

    operator fun get(modelId: ModelID, prop: One2ManyField<*, *>): Pair<CacheState, ModelIDS?> {
        val state = modelId stateOf prop
        return state to (when (state) {
            FETCHED, PARTIALLY -> data[modelId.model]?.get(modelId.id)?.get(prop) as ModelIDS
            NONE, UPDATED -> null
        })?.filterDeleted()
    }

    operator fun set(modelId: ModelID, prop: One2ManyField<*, *>, value: Pair<CacheState, ModelIDS?>) {
        val (state, ids) = value
        ((modelId valueOf prop) as ModelIDS?)?.toListID()?.forEach { remove(modelId, prop, it) }
        ids?.toListID()?.forEach { add(modelId, prop, it) }
        modelId.setState(prop, state)
    }

    operator fun get(modelId: ModelID, prop: Many2OneField<*, *>): Pair<CacheState, ModelID?> {
        return (modelId stateOf prop) to (getData(modelId)[prop] as ModelID?)?.filterDeleted()
    }

    operator fun get(modelId: ModelID, prop: CreateUID<*>): Pair<CacheState, ModelID?> {
        return (modelId stateOf prop) to (getData(modelId)[prop] as ModelID?)?.filterDeleted()
    }

    operator fun get(modelId: ModelID, prop: WriteUID<*>): Pair<CacheState, ModelID?> {
        return (modelId stateOf prop) to (getData(modelId)[prop] as ModelID?)?.filterDeleted()
    }

    operator fun set(modelId: ModelID, prop: CreateUID<*>, value: ModelID) {
        updateValue(modelId, prop, value)
    }

    operator fun set(modelId: ModelID, prop: WriteUID<*>, value: ModelID) {
        updateValue(modelId, prop, value)
    }


    operator fun set(modelId: ModelID, prop: Many2OneField<*, *>, value: ModelID?) {
        val targetProp = prop.targetOneToMany
        if (targetProp != null) {
            if (value != null) {
                add(value, targetProp, modelId)
            } else {
                val currentValue = this[modelId, prop].second
                if (currentValue != null) {
                    remove(currentValue, targetProp, modelId)
                }
            }
        }
        updateValue(modelId, prop, value)
    }

    operator fun set(modelId: ModelID, prop: Many2OneFieldLink<*, *>, value: ModelID?) {
        updateValue(modelId, prop, value)
    }

    private fun ModelID.deleteInCache() {
        scheduledDelete.add(this)
        for (ref in ReferenceModel[this.model]) {
            when (ref.onDelete) {
                ReferenceOption.RESTRICT -> {
                    val g: MutableMap<Int, MutableMap<IModelField<*, *>, Any?>>? = data[ref.model]
                    if (data[ref.model]?.any<Int, MutableMap<IModelField<*, *>, Any?>> {
                                it.value[ref] == this
                            } == true) {
                        throw OnDeleteRestrictError()
                    }
                }
                ReferenceOption.CASCADE -> {
                    data[ref.model]
                            ?.filter { it.value[ref] == this }
                            ?.map { ref.model of it.key }
                            ?.forEach { it.deleteInCache() }
                }
                ReferenceOption.SET_NULL -> {
                    for (d in data[ref.model]?.entries
                            ?: emptyList<Map.Entry<Int, MutableMap<IModelField<*, *>, Any?>>>()) {
                        if (d.value[ref] == this) {
                            when (ref.type.typeEnum) {
                                ModelFieldType.MANY_TO_ONE -> {
                                    set(ref.model of d.key, ref as Many2OneField<*, *>, null)
                                }
                                ModelFieldType.ONE_TO_ONE -> {
                                    set(ref.model of d.key, ref as One2OneField<*, *>, null)
                                }
                                else -> IllegalStateException("Unmaanger reference type ${ref::class}")
                            }

                        }
                    }
                    data[ref.model]
                            ?.filter { it.value[ref] == this }
                            ?.forEach { it.value[ref] = null }

                }
                ReferenceOption.NO_ACTION -> TODO()
            }
        }
        data[model]?.remove(id)
    }

    private fun ModelIDS.deleteInCache() {
        this.toListID().forEach { it.deleteInCache() }
    }

    operator fun get(modelId: ModelID, prop: One2OneField<*, *>): Pair<CacheState, ModelID?> {
        return (modelId stateOf prop) to (getData(modelId)[prop] as ModelID?)
    }

    operator fun set(modelId: ModelID, prop: One2OneField<*, *>, value: ModelID?) {
        val targetF = prop.targetRevOneToOne
        val currentValue = modelId valueOf prop
        if (targetF != null) {
            if (value != null) {
                updateValue(value, targetF, modelId)
            } else {
                if (currentValue != null) {
                    updateValue(currentValue as ModelID, targetF, null)
                }
            }
        }
        updateValue(modelId, prop, value)
    }

    operator fun get(modelId: ModelID, prop: RevOne2OneField<*, *>): Pair<CacheState, ModelID?> {
        val state = modelId stateOf prop
        return state to when (state) {
            FETCHED, PARTIALLY -> (modelId valueOf prop) as ModelID
            NONE, UPDATED -> null
        }
    }

    operator fun set(modelId: ModelID, prop: RevOne2OneField<*, *>, value: ModelID?) {
        val targetF = prop.targetField()
        val currentValue = modelId valueOf prop
        if (value != null) {
            updateValue(value, targetF, modelId)
        } else {
            if (currentValue != null) {
                updateValue(currentValue as ModelID, targetF, null)
            }
        }
        updateValue(modelId, prop, value)
    }

    fun getValue(model: IModel<*>, id: Int, prop: IModelField<*, *>): Pair<CacheState, Any?> {
        val state = dataState[model]?.get(id)?.get(prop) ?: NONE
        return state to data[model]?.get(id)?.get(prop)
    }

    /**
     * Return the value of the field and the current state  in the cache.
     */
    operator fun get(modelId: ModelID, prop: Many2ManyField<*, *>): Pair<CacheState, ModelIDS?> {
        val res = modelId stateOf prop
        return res to when (res) {
            FETCHED, PARTIALLY, UPDATED -> data[modelId.model]?.get(modelId.id)?.get(prop) as ModelIDS
            NONE -> null
        }
    }

    operator fun set(modelId: ModelID, prop: Many2ManyField<*, *>, value: Pair<CacheState, ModelIDS?>): ModelIDS? {
        val (state, ids) = value
        return if (state == FETCHED) {
            modelId.setState(prop, FETCHED)
            ids?.toListID()?.forEach { add(modelId, prop, it) }
            null
        } else {
            val toRemove = modelId.getAllLink(prop)
            ((modelId valueOf prop) as ModelIDS?)?.toListID()?.forEach { remove(modelId, prop, it) }
            ids?.toListID()?.forEach { add(modelId, prop, it) }
            modelId.setState(prop, state)
            toRemove
        }
    }

    fun add(modelId: ModelID, prop: Many2ManyField<*, *>, targetModelID: ModelID): ModelIDS {
        checkConsitencyOfManyToMany(prop, modelId, targetModelID)
        val idsState = modelId stateOf prop
        when (idsState) {
            NONE -> {
                if (isInDB(modelId) && isInDB(targetModelID)) {
                    throw IllegalStateException("Both ManyToMany exist in PersitenceLayer but the actual values are not cached," +
                            "there is no way I can guaranty his relation does not exist yet")
                }
                createlink(prop, modelId, targetModelID)
            }
            FETCHED, UPDATED -> {
                if (isInDB(modelId) && isInDB(targetModelID)) {
                    val linkDontExist = modelId.getExistingLink(prop, targetModelID) == null
                    if (linkDontExist) {
                        createlink(prop, modelId, targetModelID)
                    } else if (modelId.valueOf(prop) == null) {
                        updateValueMany2Many(modelId, prop, targetModelID)
                    }
                } else {
                    createlink(prop, modelId, targetModelID)
                }
            }
            PARTIALLY -> {
                if (isInDB(modelId) && isInDB(targetModelID)) {
                    throw IllegalStateException("Both ManyToMany exist in PersitenceLayer but the actual values are not cached," +
                            "there is no way I can guaranty his relation does not exist yet")
                }
                createlink(prop, modelId, targetModelID)
            }
        }
        return modelId.valueOf(prop) as ModelIDS
    }

    private fun ModelID.getExistingLink(prop: Many2ManyField<*, *>, targetModelID: ModelID): ModelID? {
        val m2mModel: LinkModel<*, *> = prop.target(ModelMany2Many)
        for (m in data[m2mModel] ?: emptyMap<Int, Map<IModelField<*, *>, Any?>>()) {
            if ((m.value[m2mModel.m1M2O]!! == this && m.value[m2mModel.m2M2O]!! == targetModelID)
                    || (m.value[m2mModel.m1M2O]!! == targetModelID && m.value[m2mModel.m2M2O]!! == this)) {
                return m2mModel of m.key
            }
        }
        return null
    }

    private fun ModelID.getAllLink(prop: Many2ManyField<*, *>): ModelIDS {
        val m2mModel: LinkModel<*, *> = prop.target(ModelMany2Many)
        val ids = ArrayList<Int>()
        for (m in data[m2mModel] ?: emptyMap<Int, Map<IModelField<*, *>, Any?>>()) {
            if (m.value[m2mModel.m1M2O]!! == this || m.value[m2mModel.m2M2O]!! == this) {
                ids.add(m.key)
            }
        }
        return m2mModel of ids
    }

    private fun createlink(prop: Many2ManyField<*, *>, modelId: ModelID, targetModelID: ModelID) {
        val m2mModel = prop.target(ModelMany2Many)
        val m2mModelID = createFakeRecordIfNeeded(m2mModel, null)
        scheduledInsert[m2mModelID] = null
        when {
            modelId.model == m2mModel.m1M2O.target -> {
                updateValue(m2mModelID, m2mModel.m1M2O, m2mModel.m1M2O.target of modelId.id)
                updateValue(m2mModelID, m2mModel.m2M2O, targetModelID)
            }
            modelId.model == m2mModel.m2M2O.target -> {
                updateValue(m2mModelID, m2mModel.m1M2O, targetModelID)
                updateValue(m2mModelID, m2mModel.m2M2O, m2mModel.m1M2O.target of modelId.id)
            }
            else -> throw IllegalStateException("Can't find for which models you try to insert")
        }
        updateValueMany2Many(modelId, prop, targetModelID)

    }

    private fun updateValueMany2Many(modelId: ModelID, prop: Many2ManyField<*, *>, targetModelID: ModelID) {
        val currentids = (getData(modelId)[prop] as ModelIDS?) ?: targetModelID.model of emptyList()
        updateValue(modelId, prop, currentids.model of currentids.ids + targetModelID.id)
        modelId updateState prop

        val reverseTargetProp = prop.targetField
        if (reverseTargetProp != null) {
            val targetIds = (getData(targetModelID)[reverseTargetProp] as ModelIDS?) ?: modelId.model of emptyList()
            updateValue(targetModelID, reverseTargetProp, targetIds.model of targetIds.ids + modelId.id)
            targetModelID updateState reverseTargetProp
        }
    }

    /**
     * The goal of this function is to remove a Mant 2 Many link between to Entity
     * How I'm doing that:
     * First get the [LinkModel] from [modelId]
     * I query witch Id of the [LinkModel] I need to remove
     * Remove [targetModelID] of the value in the cache for [modelId] and [prop]
     * Remove [modelId] of the value in the cache for [targetModelID] and is reverse [Many2ManyField]
     * And flag the [LinkModel] Id to delete in the next flush
     * @param modelId the right part of the Many 2 Many
     * @param prop the Many 2 Many field in [modelId]
     * @param targetModelID the left part of the Many 2 Many
     */
    fun remove(modelId: ModelID, prop: Many2ManyField<*, *>, targetModelID: ModelID): ModelID? {
        val m2mModel = prop.target(ModelMany2Many)
        var modelIdToDelete: ModelID? = null
        for (dataM2M in data[m2mModel]!!) {
            if (dataM2M.value[m2mModel.m2M2O] == modelId && dataM2M.value[m2mModel.m1M2O] == targetModelID) {
                modelIdToDelete = m2mModel of dataM2M.key
            } else if (dataM2M.value[m2mModel.m1M2O] == modelId && dataM2M.value[m2mModel.m2M2O] == targetModelID) {
                modelIdToDelete = m2mModel of dataM2M.key
            }
        }
        if (modelIdToDelete == null) {
            throw IllegalStateException("Trying to remove a link between $modelId and $targetModelID, but I can't find it")
        }
        if (modelIdToDelete in scheduledDelete) {
            throw IllegalStateException("Trying to remove a link between $modelId and $targetModelID, but this link is already deleted")
        }
        scheduledDelete.add(modelIdToDelete)
        scheduledInsert.remove(modelIdToDelete)

        val currentids = getData(modelId)[prop] as ModelIDS
        updateValue(modelId, prop, currentids.model of currentids.ids - targetModelID.id)
        modelId updateState prop

        val reverseTargetProp = prop.targetField
        if (reverseTargetProp != null) {
            val targetState = targetModelID stateOf reverseTargetProp
            if (targetState != NONE) {
                val targetIds = getData(targetModelID)[reverseTargetProp] as ModelIDS
                updateValue(targetModelID, reverseTargetProp, targetIds.model of targetIds.ids - modelId.id)
                targetModelID updateState reverseTargetProp
            }
        }
        modelIdToDelete.deleteInCache()
        return modelIdToDelete
    }

    private fun checkConsitencyOfManyToMany(prop: Many2ManyField<*, *>, modelId: ModelID, id: ModelID) {
        val m1 = prop.target(ModelMany2Many).m1M2O.target
        val m2 = prop.target(ModelMany2Many).m2M2O.target
        if (modelId.model != m1 && modelId.model != m2) {
            throw IllegalStateException("""You're trying to do black stuff,
                    | your modelId is not a FK of your ManyToMany Model
                    | ${modelId.model.modelName} != $m1 && != $m2""".trimMargin())
        }
        if (id.model != m1 && id.model != m2) {
            throw IllegalStateException("""You're trying to do black stuff,
                    | your modelId target is not a FK of your ManyToMany Model
                    | ${id.model.modelName} != $m1 && != $m2""".trimMargin())
        }

    }

    fun add(modelId: ModelID, prop: One2ManyField<*, *>, targetModelID: ModelID): ModelIDS {
        val idsState = modelId stateOf prop
        val currentids = (getData(modelId)[prop] ?: targetModelID.model of emptyList()) as ModelIDS
        val result = currentids.model of currentids.ids + targetModelID.id
        updateValue(modelId, prop, result)
        updateValue(targetModelID, prop.targetField(), modelId)
        when (idsState) {
            CacheState.FETCHED, CacheState.UPDATED -> {
                modelId.setState(prop, UPDATED)
            }
            CacheState.NONE, CacheState.PARTIALLY -> {
                modelId.setState(prop, PARTIALLY)
            }
        }
        return result
    }


    fun remove(modelId: ModelID, prop: One2ManyField<*, *>, targetModelID: ModelID): ModelIDS? {
        val idsState = modelId stateOf prop
        val currentids = (getData(modelId)[prop] ?: targetModelID.model of emptyList()) as ModelIDS
        val result = currentids.model of currentids.ids - targetModelID.id
        updateValue(modelId, prop, result)
        updateValue(targetModelID, prop.targetField(), null)
        when (idsState) {
            CacheState.FETCHED, CacheState.UPDATED -> {
                modelId.setState(prop, UPDATED)

            }
            CacheState.NONE, CacheState.PARTIALLY -> {
                modelId.setState(prop, PARTIALLY)
            }
        }
        return result
    }

    fun updateValue(modelId: ModelID, prop: IModelField<*, *>, value: Any?) {
        println("updateValue $modelId, ${prop.completeName}, $value")
        if (modelId.model != prop.model) {
            throw IllegalStateException("You can't set a value for a field that don't belong to the correct models" +
                    "${modelId.model} != ${prop.model} for value $value")
        }
        if (isNotInDB(modelId)) {
            scheduledInsert.putIfAbsent(modelId, null)
        } else {
            markAsUpdate(modelId, prop)
        }
        if (prop.store && isNotInDB(modelId) && prop.type.typeEnum.isRelationalField() && !prop.required) {
            markAsUpdate(modelId, prop)
        }
        data.getOrPut(modelId.model, { HashMap() }).getOrPut(modelId.id, { HashMap() })[prop] = value
        val state = modelId stateOf prop
        when (state) {
            CacheState.FETCHED, CacheState.UPDATED -> modelId.setState(prop, UPDATED)
            CacheState.NONE, CacheState.PARTIALLY -> modelId.setState(prop, PARTIALLY)
        }
    }

    fun markAsUpdate(modelId: ModelID, prop: IModelField<*, *>) {
        if (prop.store) {
            scheduledUpdate.getOrPut(modelId.model, { HashMap() }).getOrPut(modelId.id, { HashSet() }).add(prop)
        }
    }

    fun addnewId(toinsert: ModelID, newId: Int) {
        println("addnewId $toinsert, $newId")
        scheduledInsert[toinsert] = toinsert.model of newId
    }

    fun state(modelID: ModelID, prop: IModelField<*, *>): CacheState {
        return modelID stateOf prop
    }

    fun state(modelID: ModelID): CacheState {
        return modelID stateOf modelID.model.id
    }

    fun remove(modelID: ModelID) {
        modelID.deleteInCache()
    }

    fun remove(modelID: ModelIDS) {
        modelID.deleteInCache()
    }


}

enum class CacheState {
    /**
     * Mean that value come from the persistence layer and have not been changed
     */
    FETCHED,
    /**
     * Only used for the [OneToManyModelFieldApi] and the [ManyToManyModelFieldApi]
     * to indicate that value is mutate in the cache but the pertistence layer have not been fetched
     */
    PARTIALLY,
    /**
     * Mean the value have been updated in the cache
     */
    UPDATED,
    /**
     * No value in the cache
     */
    NONE;

    fun update(): CacheState {
        return when (this) {
            FETCHED -> UPDATED
            NONE -> PARTIALLY
            else -> this
        }
    }
}