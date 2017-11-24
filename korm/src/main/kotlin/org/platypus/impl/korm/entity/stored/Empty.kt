package org.platypus.impl.korm.entity.stored

import com.beust.klaxon.JsonArray
import com.beust.klaxon.JsonObject
import com.beust.klaxon.Parser
import org.platypus.api.data.DataRef
import org.platypus.EntityNotFoundById
import org.platypus.EntityNotFoundByRef
import org.platypus.api.env.PlatypusEnvironement
import org.platypus.impl.korm.entity.*
import org.platypus.impl.korm.identifiants.*
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.model.SearchQueryParam
import org.platypus.impl.korm.model.property.KormProperty
import org.platypus.impl.korm.model.selectIds
import org.platypus.impl.korm.sql.*
import java.io.StringReader

class EmptyEntity<ENTITY : Entity<ENTITY, MODEL>, MODEL : BaseModel<MODEL, ENTITY>>(
        override val env: PlatypusEnvironement,
        internal val model: MODEL,
        private val factory: (id: Long, env: PlatypusEnvironement) -> ENTITY
) : PlatypusEntityGetter<ENTITY, MODEL> {
    private val parser = Parser()

    init {
        env.register(model, this)
    }

    override val dataRef: DataRef<ENTITY, MODEL>
        get() = DataRef(env, this)

    override operator fun get(id: Long): ENTITY = model.getById.call(this, id).result

    operator fun get(ref: String): ENTITY = byRef(ref)

    override fun lazyGetById(modelID: ModelID): ENTITY = modelID.testCache() ?: modelID.emptyEntity()


    override fun fromJson(json: String): ENTITY {
        val jv = parser.parse(StringReader(json)) as JsonObject
        return fromJsonObject(jv)
    }

    private fun fromJsonObject(jsonObj: JsonObject): ENTITY {
        val tmpModelId = model.emptyModelId()
        for ((propName, prop) in model.properties) {
            env.cr.cache.createFakeRecordIfNeeded(tmpModelId)
            env.cr.cache.forceSet(tmpModelId, prop.column, jsonObj[propName])
        }
        return this.lazyGetById(tmpModelId)
    }

    override fun toJson(value: ENTITY): String {
        val res = JsonObject()
        for ((propCol, propValue) in env.cr.cache[model withId value.id]) {
            res[propCol.name] = propValue
        }
        res[model.id.name] = env.cr.cache.realID(model withId value.id).id
        return res.toJsonString()
    }

    override fun fromMultiJson(json: String): Bag<ENTITY> {
        val jv = parser.parse(StringReader(json)) as JsonArray<JsonObject>
        val values = ArrayBag(env, model, { _ -> this }, model.emptyModelIds())
        jv.mapTo(values) { fromJsonObject(it) }
        return values
    }

    fun bagOf(ids: ModelIDS): Bag<ENTITY> {
        return ArrayBag(this.env, this.model, { _ -> this }, ids)
    }

    fun bagOf(query: Query): Bag<ENTITY> {
        return ArrayBag(this.env, this.model, { _ -> this }, wrapRows(query) toModelIds model)
    }

    /**
     * Smart load of the [modelID]
     * first test in cache if the [modelID] exist and not query the record in database
     *
     * @param modelID the id you want to load
     */
    override fun loadInCache(modelID: ModelID): ENTITY {
        return modelID.testCache() ?: findById(modelID.id)
    }

    override fun loadInCache(modelID: ModelIDS) {
        val idsPartition = modelID.partition { it.testCache() == null }
        search(where = { model.id inList idsPartition.first.map { it.id } })
    }

    private fun ModelID.testCache(): ENTITY? = if (this in env.cr.cache) factory(this.id, env) else null

    /**
     * Create a new record with the [init] values
     * The new record will be store inside the database automatically
     *
     * @see newTmp if you want to create a temporary Record
     * @see PlatypusEntity.store This methode is automatically called
     */
    fun create(useDefault: Boolean = true, init: ENTITY.() -> Unit) = updateWith(useDefault, null, init).store()

    /**
     * Create a new record with the [init] values
     * Warning you need to call [PlatypusEntity.store] to store this record in database
     *
     * @see create
     */
    fun newTmp(useDefault: Boolean = true, init: ENTITY.() -> Unit) = updateWith(useDefault, null, init)

    /**
     * Update or create a Record with the [init] values
     *
     * if the [id] is null the a new record is created et the [init] is applyed on it
     * if the [id] not null then the corresponding record is update with the [init] values
     * if the [id] don't exist in the cache then a new record is created,
     * if you want to update the corresponding database record then call [PlatypusEntity.store] on it
     *
     * @param id the optianal id of the record
     * @param init the function applyed on the record
     */
    override fun updateWith(useDefault: Boolean, id: Long?, init: ENTITY.() -> Unit): ENTITY {
        val prototype: ENTITY = if (useDefault) {
            model.defaulGet.call(this)
        } else {
            factory(this.model.createFakeRecord(id).id, env)
        }
        prototype.init()
        return prototype
    }

    /**
     * Create a fake record inside the cache and a fake id if needed
     * if the [id] is not null et not fake the the cache is not altered
     */
    private fun MODEL.createFakeRecord(id: Long? = null): ModelID {
        val modelId = if (id == null) this.emptyModelId() else this withId id
        env.cr.cache.createFakeRecordIfNeeded(modelId)
        return modelId
    }

    /**
     * Query the record by the
     * equivalent to : [find] with [BaseModel.externalRef] eq [reference]
     *
     * @throws EntityNotFoundByRef if the reference don't exist
     * @see byRefOrNull if you're not sure if the reference exist
     */
    fun byRef(reference: String): ENTITY {
        return byRefOrNull(reference) ?: throw EntityNotFoundByRef(reference, model.modelName)
    }

    /**
     * Query the record by the
     * equivalent to : [find] with [BaseModel.externalRef] eq [reference]
     *
     * @return the corresponding entity or `null`
     */
    override fun byRefOrNull(reference: String): ENTITY? {
        var id: Long? = null
        for (d in env.cr.cache.map) {
            if (d.value[d.key.model.externalRef.column] == reference) {
                id = d.key.id
            }
        }
        return if (id != null) {
            factory(id, env)
        } else {
            search(where = { model.externalRef eq reference }).firstOrNull()
        }
    }

    private fun ModelID.findById(): ENTITY = findById(id)

    private fun ModelID.emptyEntity(): ENTITY = factory(this.id, env)

    fun findById(id: Long): ENTITY {
        return search(where = { model.id eq id }).firstOrNull() ?: throw EntityNotFoundById(id, model.modelName)
    }

    internal fun deleteById(id: Long): ENTITY {
        return search(where = { model.id eq id }).firstOrNull() ?: throw EntityNotFoundById(id, model.modelName)
    }

    fun findById(id: Collection<Long>): Bag<ENTITY> {
        return search(where = { model.id inList id })
    }

    fun findFirst(op: () -> Op<Boolean>): ENTITY? {
        return search(where = op).firstOrNull()
    }

    override fun findIds(op: () -> Op<Boolean>): ModelIDS {
        return findIds(op())
    }

    private fun findIds(op: Op<Boolean>): ModelIDS {
        val ids = HashSet<ModelID>()
        for (res in model.selectIds { op }) {
            ids += res[model.id]
        }
        return ids.toModelIds()
    }

    fun search(where: () -> Op<Boolean>,
               fields: MutableSet<KormProperty<MODEL, *>> = mutableSetOf(),
               limit: Int = 0,
               orderBy: MutableList<Pair<KormProperty<MODEL, *>, Boolean>> = mutableListOf(),
               offset: Int = 0): Bag<ENTITY> {
        return model.search.call(this, SearchQueryParam(fields, where, limit, orderBy, offset)).result
    }

    private fun wrapRows(query: Query): SizedIterable<ENTITY> {
        val col = ArrayList<ENTITY>()
        for (row in query) {
            col.add(wrapRow(row, query.set))
        }
        return SizedCollection(col)
    }

    private fun wrapRow(row: ResultRow, fs: FieldSet): ENTITY {
        env.cr.cache.store(row[model.id], fs.fields, row)
        return factory(row[model.id].id, env)
    }

    fun delete(id: Long): Int = model.delete.call(newTmp(false) {}).result


}