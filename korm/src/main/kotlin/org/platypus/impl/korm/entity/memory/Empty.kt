package org.platypus.impl.korm.entity.memory

import com.beust.klaxon.JsonArray
import com.beust.klaxon.JsonObject
import com.beust.klaxon.Parser
import org.platypus.*
import org.platypus.api.data.DataRef
import org.platypus.api.env.PlatypusEnvironement
import org.platypus.impl.korm.entity.ArrayBag
import org.platypus.impl.korm.entity.Bag
import org.platypus.impl.korm.entity.PlatypusEntity
import org.platypus.impl.korm.entity.PlatypusEntityGetter
import org.platypus.impl.korm.identifiants.*
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.sql.Op
import java.io.StringReader

class EmptyMemoryEntity<ENTITY : PlatypusEntity<ENTITY, MODEL>, MODEL : BaseModel<MODEL, ENTITY>>(
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

    override operator fun get(id: Long): ENTITY =
            model.withId(id).testCache() ?: throw EntityNotFoundById(id, model.modelName)

    operator fun get(ref: String): ENTITY = byRef(ref)

    override fun lazyGetById(modelID: ModelID): ENTITY = modelID.testCache() ?: modelID.emptyEntity()


    override fun fromJson(json: String): ENTITY {
        return fromJsonObject(parser.parse(StringReader(json)) as JsonObject)
    }

    private fun fromJsonObject(jsonObj: JsonObject): ENTITY {
        val tmpModelId = model.emptyModelId()
        for ((propName, prop) in model.properties) {
            Platypus.memoryCache().createFakeRecordIfNeeded(tmpModelId)
            Platypus.memoryCache().forceSet(tmpModelId, prop.column, jsonObj[propName])
        }
        return this.lazyGetById(tmpModelId)
    }

    override fun toJson(value: ENTITY): String {

        val res = JsonObject()
        for ((propCol, propValue) in Platypus.memoryCache()[value.modelID]) {
            res[propCol.name] = propValue
        }
        res[value.model.id.name] = Platypus.memoryCache().realID(value.modelID).id
        return res.toJsonString()
    }

    override fun fromMultiJson(json: String): Bag<ENTITY> {
        val jv = parser.parse(StringReader(json)) as JsonArray<JsonObject>
        val values = ArrayBag(env, model, { _ -> this }, model.emptyModelIds())
        jv.mapTo(values) { fromJsonObject(it) }
        return values
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

    override fun loadInCache(modelID: ModelIDS) {}

    private fun ModelID.testCache(): ENTITY? = if (this in Platypus.memoryCache()) factory(this.id, env) else null

    /**
     * Create a new record with the [init] values
     * The new record will be store inside the database automatically
     *
     * @see newTmp if you want to create a temporary Record
     * @see PlatypusEntity.store This methode is automatically called
     */
    fun create(init: ENTITY.() -> Unit) = updateWith(true, null, init)

    override fun findIds(op: () -> Op<Boolean>): ModelIDS {
        TODO("not implemented")
    }

    /**
     * Create a new record with the [init] values
     * Warning you need to call [PlatypusEntity.store] to store this record in database
     *
     * @see create
     */
    fun newTmp(init: ENTITY.() -> Unit) = updateWith(true, null, init)

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
        Platypus.memoryCache().createFakeRecordIfNeeded(modelId)
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
        for (d in Platypus.memoryCache().map) {
            if (d.value[d.key.model.externalRef.column] == reference) {
                id = d.key.id
            }
        }
        return if (id != null) factory(id, env) else null
    }

    private fun ModelID.findById(): ENTITY = findById(id)

    private fun ModelID.emptyEntity(): ENTITY = factory(this.id, env)

    fun findById(id: Long): ENTITY {
        if ((model withId id) in Platypus.memoryCache()) {
            return factory(id, env)
        }
        throw EntityNotFoundById(id, model.modelName)
    }


}