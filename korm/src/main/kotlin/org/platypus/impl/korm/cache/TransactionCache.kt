package org.platypus.impl.korm.cache

import org.platypus.impl.korm.entity.Entity
import org.platypus.impl.korm.identifiants.ModelID
import org.platypus.impl.korm.identifiants.ModelIDS
import org.platypus.impl.korm.identifiants.emptyModelIds
import org.platypus.impl.korm.identifiants.withId
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.model.property.*
import org.platypus.impl.korm.sql.Column
import org.platypus.impl.korm.sql.Expression
import org.platypus.impl.korm.sql.ResultRow

@Suppress("UNCHECKED_CAST")
class TransactionCache {

    internal val map: MutableMap<ModelID, MutableMap<Column<*>, Any?>> = HashMap()
    internal val mapOne2Many: MutableMap<ModelID, MutableMap<KormOneToManyProperty<*, *>, ModelIDS>> = HashMap()
    internal val mapMany2Many: MutableMap<ModelID, MutableMap<KormManyToManyProperty<*, *>, ModelIDS>> = HashMap()
    internal val scheduledInsert: MutableSet<ModelID> = HashSet()
    internal val scheduledUpdate: MutableSet<ToUpdate> = HashSet()
    internal val mapFakeInserted: MutableMap<ModelID, ModelID> = HashMap()

    val toInsert: Set<ModelID>
        get() = scheduledInsert

    val toUpdate: Set<ToUpdate>
        get() = scheduledUpdate

    val data: Map<ModelID, Map<Column<*>, Any?>>
        get() = map

    fun isEmpty(): Boolean {
        return map.isEmpty()
                && mapOne2Many.isEmpty()
                && mapMany2Many.isEmpty()
                && mapFakeInserted.isEmpty()
                && scheduledInsert.isEmpty()
                && scheduledUpdate.isEmpty()
    }


    internal operator fun get(id: ModelID): MutableMap<Column<*>, Any?> = map.computeIfAbsent(id.real, { _ -> HashMap() })

    val ModelID.real get() = realID(this)

    fun realID(modelID: ModelID) = mapFakeInserted[modelID] ?: modelID

    internal fun createFakeRecordIfNeeded(id: ModelID) = map.putIfAbsent(id, HashMap(mapOf(id.model.id.column to id.id)))

    internal fun addnewId(oldId: ModelID, newId: ModelID) {
        if (oldId.real.isInDB()) {
            throw IllegalStateException("You try to insert et inserted Id that already exist ${oldId.real}")
        }
        if (oldId.real == newId) {
            throw IllegalStateException("You try to insert an Id that already exist $oldId.real!=$newId")
        }
        mapFakeInserted[oldId] = newId
        map[newId] = map.remove(oldId)!!
    }


    operator fun contains(id: ModelID): Boolean = map.containsKey(id)

    override fun toString(): String {
        return map.toString()
    }

    fun store(modelID: ModelID, fields: List<Expression<*>>, row: ResultRow) {
        fields.forEach { this[modelID].put(it as Column<*>, row[it]) }
    }


    operator fun <T : Any> set(modelID: ModelID, prop: KormProperty<*, T>, value: T?) {
        forceSet(modelID, prop.column, value)
    }

    operator fun set(modelID: ModelID, prop: KormInternalVersionProperty<*>, value: Int) {
        forceSet(modelID, prop.column, value)
    }

    fun forceSet(modelID: ModelID, col: Column<*>, value: Any?): Boolean {
        var result = false
        if (modelID.isInDB() && this[modelID][col] != value) {
            modelID.getToUpdate().props.add(col)
            result = true
        }
        this[modelID][col] = value
        return result
    }

    operator fun get(modelID: ModelID, prop: KormInternalVersionProperty<*>): Int {
        return this[modelID][prop.column] as Int? ?: 0
    }

    operator fun <T : Any?> get(modelID: ModelID, prop: KormProperty<*, T>): T? {
        return this[modelID][prop.column] as T?
    }

    operator fun set(modelID: ModelID, prop: KormSelectionProperty<*, *, *>, value: String?) {
        this[modelID][prop.column] = value
    }

    operator fun get(modelID: ModelID, prop: KormSelectionProperty<*, *, *>): String? {
        return this[modelID][prop.column] as String?
    }

    fun ModelID.getToUpdate(): ToUpdate {
        val updateStmt = this@TransactionCache.scheduledUpdate.firstOrNull { it.modelID == this }
        if (updateStmt == null) {
            this@TransactionCache.scheduledUpdate.add(ToUpdate(this, HashSet()))
        }
        return this@TransactionCache.scheduledUpdate.first { it.modelID == this }
    }

    operator fun get(modelID: ModelID, prop: KormOneToManyProperty<*, *>): ModelIDS {
        return warmOneToMany(modelID, prop)
    }

    operator fun get(modelID: ModelID, prop: KormManyToManyProperty<*, *>): ModelIDS {
        return warmManyToMany(modelID, prop)
    }

    fun add(modelID: ModelID, prop: KormManyToManyProperty<*, *>, id: ModelID): ModelIDS {
        warmManyToMany(modelID, prop).ids.add(id.id)
        warmManyToMany(id, prop.relProp()).ids.add(modelID.id)
        return mapMany2Many[modelID]!![prop]!!
    }


    fun remove(modelID: ModelID, prop: KormManyToManyProperty<*, *>, id: ModelID): ModelIDS {
        warmManyToMany(modelID, prop).ids.remove(id.id)
        warmManyToMany(id, prop.relProp()).ids.remove(modelID.id)
        return mapMany2Many[modelID]!![prop]!!
    }

    fun add(modelID: ModelID, prop: KormOneToManyProperty<*, *>, id: ModelID): ModelIDS {
        warmOneToMany(modelID, prop).ids.add(id.id)
        this[id][prop.target().column] = modelID.real
        return mapOne2Many[modelID]!![prop]!!
    }

    fun remove(modelID: ModelID, prop: KormOneToManyProperty<*, *>, id: ModelID): ModelIDS {
        warmOneToMany(modelID, prop).ids.remove(id.id)
        this[id].remove(prop.target().column)
        return mapOne2Many[modelID]!![prop]!!
    }

    fun warmManyToMany(modelID: ModelID, prop: KormManyToManyProperty<*, *>,
                       notFoundExecute: () -> ModelIDS = { prop.model.emptyModelIds() }): ModelIDS {
        return mapMany2Many.computeIfAbsent(modelID, { _ -> HashMap() })
                .computeIfAbsent(prop, { notFoundExecute() })
    }

    fun warmOneToMany(modelID: ModelID, prop: KormOneToManyProperty<*, *>,
                      notFoundExecute: () -> ModelIDS = { prop.model.emptyModelIds() }): ModelIDS {
        return mapOne2Many.computeIfAbsent(modelID, { _ -> HashMap() })
                .computeIfAbsent(prop, { _ -> notFoundExecute() })
    }

    fun getOrExecute(modelID: ModelID, prop: KormManyToManyProperty<*, *>,
                     notFoundExecute: () -> ModelIDS = { prop.model.emptyModelIds() }): ModelIDS {
        return warmManyToMany(modelID, prop, notFoundExecute)
    }

    fun getOrExecute(modelID: ModelID, prop: KormOneToManyProperty<*, *>, notFoundExecute: () -> ModelIDS): ModelIDS {
        return warmOneToMany(modelID, prop, notFoundExecute)
    }

    operator fun set(modelID: ModelID, prop: KormOneToManyProperty<*, *>, value: ModelIDS) {
        forceSet(modelID, prop.column, value)
    }

    operator fun get(modelID: ModelID, prop: KormManyToOneProperty<*, *>): ModelID {
        return this[modelID][prop.column] as ModelID
    }

    operator fun set(modelID: ModelID, prop: KormManyToOneProperty<*, *>, value: ModelID) {
        if (forceSet(modelID, prop.column, value)) {
            prop.one2ManyTarget?.let {
                warmOneToMany(value, it).ids.add(modelID.id)
            }
        }
    }

    fun <M : BaseModel<M, T>, T : Entity<T, M>> scheduleInsert(model:BaseModel<M, T>, newUser: T): T {
        scheduledInsert.add(model withId newUser.id)
        return newUser
    }

    fun flush() {
        scheduledInsert.clear()
        scheduledUpdate.clear()
    }

    internal fun getValueToUpdate(modelID: ModelID, fieldToUpdate: Column<*>): Any? = map[modelID]!![fieldToUpdate]
}
