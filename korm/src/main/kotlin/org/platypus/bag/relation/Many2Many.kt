package org.platypus.bag.relation

import org.platypus.PlatypusEnvironment
import org.platypus.bag.AbstractBag
import org.platypus.bag.Bag
import org.platypus.cache.CacheState
import org.platypus.cache.ModelID
import org.platypus.cache.ModelIDS
import org.platypus.cache.PlatypusCache
import org.platypus.cache.isNotEmpty
import org.platypus.cache.of
import org.platypus.entity.Record
import org.platypus.model.Model
import org.platypus.model.ModelMany2Many
import org.platypus.model.field.impl.Many2ManyField
import org.platypus.orm.sql.dml.statements.DeleteStatement
import org.platypus.orm.sql.expression.eq
import org.platypus.orm.sql.expression.inList

fun <M : Model<M>, TM : Model<TM>>
        getMany2ManyBag(modelID: ModelID,
                        prop: Many2ManyField<M, TM>,
                        env: PlatypusEnvironment,
                        cacheProvider: () -> PlatypusCache = { env.internal.cache }): Bag<TM> {
    return Many2ManyBagCache(modelID, prop, env, cacheProvider)
}


private abstract class Many2ManyBag<M : Model<M>, TM : Model<TM>>(
        protected val modelID: ModelID,
        protected val prop: Many2ManyField<M, TM>,
        env: PlatypusEnvironment,
        protected val cacheProvider: () -> PlatypusCache = { env.internal.cache }
) : AbstractBag<TM>(env, prop.target(ModelMany2Many).m2M2O.target) {


    override val model: TM
        get() = prop.target(ModelMany2Many).m2M2O.target

    override fun addId(modelId: ModelID): Boolean {
        if (cacheProvider().state(this.modelID, prop) == CacheState.NONE) {
            val ids = this.prop.target(ModelMany2Many).findIds(env, this.prop, modelID)
            cacheProvider()[modelID, prop] = CacheState.FETCHED to ids
            val toRemove = cacheProvider().set(modelID, prop, CacheState.FETCHED to ids)
            if (toRemove != null && toRemove.isNotEmpty()) {
                DeleteStatement(env, toRemove.model, this.prop.target(ModelMany2Many).id inList toRemove.ids).execute()
            }
        }
        cacheProvider().add(this.modelID, prop, modelId)
        return true
    }

    override fun removeId(modelId: ModelID): Boolean {
        val idToDelete = cacheProvider().remove(this.modelID, prop, modelId)
        if (idToDelete != null && cacheProvider().isInDB(idToDelete)) {
            DeleteStatement(env, idToDelete.model, idToDelete.model.id eq idToDelete.id).execute()
        }
        return true
    }

//    override fun clear() {
//        super.clear()
//    }

    override val _ids: ArrayList<Int>
        get() = ArrayList(values()?.ids ?: emptyList())

    abstract fun values(): ModelIDS?

    override fun delete(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createFiltredBag(filtredIds: Collection<Int>): Bag<TM> {
        TODO("not implemented")
    }

    override fun get(index: Int): Record<TM> {
        TODO("not implemented")
    }

    override fun indexOf(element: Record<TM>): Int {
        TODO("not implemented")
    }

    override fun lastIndexOf(element: Record<TM>): Int {
        TODO("not implemented")
    }

    override fun listIterator(): ListIterator<Record<TM>> {
        TODO("not implemented")
    }

    override fun listIterator(index: Int): ListIterator<Record<TM>> {
        TODO("not implemented")
    }

    override fun subList(fromIndex: Int, toIndex: Int): List<Record<TM>> {
        TODO("not implemented")
    }
}


private class Many2ManyBagCache<M : Model<M>,TM : Model<TM>>
(modelID: ModelID,
 prop: Many2ManyField<M, TM>,
 env: PlatypusEnvironment,
 cacheProvider: () -> PlatypusCache = { env.internal.cache }
) : Many2ManyBag<M, TM>(modelID, prop, env, cacheProvider) {

    override fun values(): ModelIDS? {
        val res = cacheProvider()[modelID, prop]
        return when (res.first) {
            CacheState.NONE, CacheState.PARTIALLY -> {
                if (env.internal.cache.isInDB(modelID)) {
                    val ids = this.prop.target(ModelMany2Many).findIds(env, this.prop, modelID)
                    cacheProvider()[modelID, prop] = CacheState.FETCHED to ids
                    val toRemove = cacheProvider().set(modelID, prop, CacheState.FETCHED to ids)
                    if (toRemove != null && toRemove.isNotEmpty()) {
                        DeleteStatement(env, toRemove.model, this.prop.target(ModelMany2Many).id inList toRemove.ids).execute()
                    }
                    ids
                } else {
                    res.second
                }
            }
            CacheState.FETCHED, CacheState.UPDATED -> res.second
        }
    }

    override fun createFiltredBag(filtredIds: Collection<Int>): Bag<TM> {
        return Many2ManyBagCacheFiltred(modelID, prop, env, cacheProvider, filtredIds)
    }
}

private class Many2ManyBagCacheFiltred<
        M : Model<M>,
        TM : Model<TM>>
(modelID: ModelID,
 prop: Many2ManyField<M, TM>,
 env: PlatypusEnvironment,
 cacheProvider: () -> PlatypusCache = { env.internal.cache },
 ids: Collection<Int>
) : Many2ManyBag<M, TM>(modelID, prop, env, cacheProvider) {

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
        return Many2ManyBagCacheFiltred(modelID, prop, env, cacheProvider, filtredIds)
    }
}