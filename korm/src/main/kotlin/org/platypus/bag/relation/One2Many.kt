package org.platypus.bag.relation

import org.platypus.PlatypusEnvironment
import org.platypus.bag.AbstractBag
import org.platypus.bag.Bag
import org.platypus.bag.MutableBag
import org.platypus.cache.CacheState
import org.platypus.cache.ModelID
import org.platypus.cache.ModelIDS
import org.platypus.cache.PlatypusCache
import org.platypus.cache.of
import org.platypus.model.Model
import org.platypus.model.field.impl.One2ManyField
import org.platypus.repository.RecordRepositoryImpl


fun <M : Model<M>,        TM : Model<TM>>
        getOne2ManyBag(modelID: ModelID,
                       prop: One2ManyField<M, TM>,
                       env: PlatypusEnvironment,
                       cacheProvider: () -> PlatypusCache = { env.internal.cache }): Bag<TM> {
    return One2ManyBagCache(modelID, prop,env, cacheProvider)
}

private abstract class One2ManyBag<
        OM : Model<OM>,
        TM : Model<TM>>
(
        protected val modelID: ModelID,
        protected val prop: One2ManyField<OM, TM>,
        env: PlatypusEnvironment,
        val cacheProvider: () -> PlatypusCache = { env.internal.cache }
) : AbstractBag<TM>(env, prop.targetField().model) {

    override val model: TM
        get() = prop.targetField().model

    override val _ids: ArrayList<Int>
        get() = ArrayList(values()?.ids ?: emptyList())

    abstract fun values(): ModelIDS?

    override fun addId(modelId: ModelID): Boolean {
        cacheProvider().add(this.modelID, prop, modelId)
        return true
    }

    override fun removeId(modelId: ModelID): Boolean {
        cacheProvider().remove(this.modelID, prop, modelId)
        return true
    }

    override fun delete(): Int {
        TODO("not implemented")
    }

    override fun createFiltredBag(filtredIds: Collection<Int>): Bag<TM> {
        TODO("not implemented")
    }
}

private class One2ManyBagCache<
        M : Model<M>,
        TM : Model<TM>>
(modelID: ModelID,
 prop: One2ManyField<M, TM>,
 env: PlatypusEnvironment,
 cacheProvider: () -> PlatypusCache = { env.internal.cache }
) : One2ManyBag<M, TM>(modelID, prop, env, cacheProvider) {

    override fun values(): ModelIDS? {
        val res = cacheProvider()[modelID, prop]
        return when (res.first) {
            CacheState.NONE, CacheState.PARTIALLY -> {
                if (env.internal.cache.isInDB(modelID)) {
                    val ids = RecordRepositoryImpl(env, model). find { prop.targetField().asExpr() eq modelID.id }.ids.toList()
                    cacheProvider()[modelID, prop] = CacheState.FETCHED to (prop.model of ids)
                    prop.model of ids
                } else {
                    res.second
                }
            }
            CacheState.FETCHED, CacheState.UPDATED -> res.second
        }

    }

    override fun toMutableBag(): MutableBag<TM> {
        return One2ManyBagCache(modelID, prop,env, cacheProvider)
    }

    override fun createFiltredBag(filtredIds: Collection<Int>): Bag<TM> {
        return One2ManyBagCacheFiltred(modelID, prop,env, cacheProvider, filtredIds)
    }
}

private class One2ManyBagCacheFiltred<
        M : Model<M>,
        TM : Model<TM>>
(modelID: ModelID,
 prop: One2ManyField<M, TM>,
 env: PlatypusEnvironment,
 cacheProvider: () -> PlatypusCache = { env.internal.cache },
 ids: Collection<Int>
) : One2ManyBag<M, TM>(modelID, prop,env, cacheProvider) {

    override fun toMutableBag(): MutableBag<TM> {
        return One2ManyBagCacheFiltred(modelID, prop,env, cacheProvider, filtredIds)
    }

    private val filtredIds: MutableList<Int> = ids.toMutableList()

    override fun values(): ModelIDS? {
        return model of filtredIds.toList()
    }

    override fun addId(modelId: ModelID): Boolean {
        filtredIds.add(modelId.id)
        return super.addId(modelId)
    }

    override fun removeId(modelId: ModelID): Boolean {
        filtredIds.remove(modelId.id)
        return super.removeId(modelId)
    }

    override fun createFiltredBag(filtredIds: Collection<Int>): Bag<TM> {
        return One2ManyBagCacheFiltred(modelID, prop,env, cacheProvider, filtredIds)
    }
}