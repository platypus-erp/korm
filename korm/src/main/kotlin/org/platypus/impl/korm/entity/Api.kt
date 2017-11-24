package org.platypus.impl.korm.entity

import com.beust.klaxon.JsonBase
import org.platypus.api.data.DataRef
import org.platypus.api.context.KeyContextValue
import org.platypus.api.env.PlatypusEnvironement
import org.platypus.impl.korm.identifiants.ModelID
import org.platypus.impl.korm.identifiants.ModelIDS
import org.platypus.impl.korm.cache.TransactionCache
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.model.HierarchyModel
import org.platypus.impl.korm.model.LazyLoadType
import org.platypus.impl.korm.model.ToJsonParam
import org.platypus.impl.korm.model.property.KormExternalRefProperty
import org.platypus.impl.korm.model.property.KormInternalVersionProperty
import org.platypus.impl.korm.sql.Op
import org.platypus.impl.korm.identifiants.withId
import kotlin.reflect.KProperty

interface PlatypusJsonConverter<T : Entity<T, M>, M : BaseModel<M, T>> {
    fun fromJson(json: String): T
    fun fromMultiJson(json: String): Bag<T>
    fun toJson(obj: T): String
}

interface NamedEntity<E : Entity<E, M>, M : BaseModel<M, E>> : Entity<E, M> {
    val name: String
}

interface HierarchicNamedEntity<E : HierarchicNamedEntity<E, M>, M : HierarchyModel<M, E>> : NamedEntity<E, M> {
    val parent: E
    val children: Bag<E>
}

interface Entity<E : Entity<E, M>, M : BaseModel<M, E>> {
    val env: PlatypusEnvironement
    val externalRef: String?
    val internalVersion: Int
    val id: Long

    fun store(): E
    fun delete(): Int
    fun withContext(vararg newCtx: KeyContextValue<*>): E
    fun isEmpty() = id == 0L


}

interface PlatypusEntityGetter<ENTITY : Entity<ENTITY, MODEL>, MODEL : BaseModel<MODEL, ENTITY>>
    : PlatypusJsonConverter<ENTITY, MODEL> {

    val env: PlatypusEnvironement
    val dataRef: DataRef<ENTITY, MODEL>
    operator fun get(id: Long): ENTITY

    fun byRefOrNull(ref: String): ENTITY?

    fun lazyGetById(modelID: ModelID): ENTITY

    /**
     * Smart load of the [modelID]
     * first test in cache if the [modelID] exist and if not query the record in the data provider
     *
     * @param modelID the id you want to load
     */
    fun loadInCache(modelID: ModelID): ENTITY

    /**
     * Smart load of the [ids]
     * first test in cache if the [ids] exist and if not query the missing record in the data provider
     *
     * @param ids the ids you want to load in cache
     */
    fun loadInCache(ids: ModelIDS)

    fun findIds(op: () -> Op<Boolean>): ModelIDS

    fun updateWith(useDefault: Boolean = true, id: Long?, init: ENTITY.() -> Unit): ENTITY
}


abstract class PlatypusEntity<SELF : PlatypusEntity<SELF, SELF_MODEL>, SELF_MODEL : BaseModel<SELF_MODEL, SELF>>(
        _id: Long,
        override val env: PlatypusEnvironement,
        internal val model: SELF_MODEL,
        internal val factory: (e: PlatypusEnvironement) -> PlatypusEntityGetter<SELF, SELF_MODEL>) : Entity<SELF, SELF_MODEL> {
    override val externalRef by model.externalRef
    override val internalVersion by model.internalVersion
    override val id get() = env.cr.cache.realID(modelID).id
    internal val modelID: ModelID = model withId _id

    internal open fun warmCache(): TransactionCache {
        factory(env).loadInCache(modelID)
        return env.cr.cache
    }

    fun load(): SELF {
        return factory(env).loadInCache(modelID)
    }

    override fun store(): SELF = model.store.call(this as SELF).result

    private fun toBag(): Bag<SELF> = ArrayBag(env, model, factory, modelID.toIds())


    override fun delete(): Int = model.delete.call((this as SELF)).result

    override fun withContext(vararg newCtx: KeyContextValue<*>): SELF {
        val newEnv = env.withContext(*newCtx)
        return factory(newEnv)[id]
    }

    operator fun KormExternalRefProperty<*>.getValue(o: PlatypusEntity<SELF, SELF_MODEL>, desc: KProperty<*>): String? {
        return warmCache()[o.modelID, this]
    }

    operator fun KormInternalVersionProperty<*>.getValue(o: PlatypusEntity<SELF, SELF_MODEL>, desc: KProperty<*>): Int {
        return warmCache()[o.modelID, this]
    }

    fun toJson(lazy: LazyLoadType = LazyLoadType.NONE, pretty: Boolean = false): JsonBase {
        return model.toJson.call(this as SELF, ToJsonParam(lazy, pretty))
    }

}