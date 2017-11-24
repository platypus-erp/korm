package org.platypus.impl.korm.entity

import org.platypus.api.env.PlatypusEnvironement
import org.platypus.impl.korm.identifiants.ModelID
import org.platypus.impl.korm.identifiants.ModelIDS
import org.platypus.impl.korm.cache.TransactionCache
import org.platypus.impl.korm.entity.stored.EmptyEntity
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.model.property.KormManyToManyProperty

class ManyToManyDelegate<OM : BaseModel<OM, *>, TM : BaseModel<TM, TE>, TE : PlatypusEntity<TE, TM>>(val prop: KormManyToManyProperty<OM, TM>, val factory: (env: PlatypusEnvironement) -> EmptyEntity<TE, TM>)

infix fun <OM : BaseModel<OM, *>, TM : BaseModel<TM, TE>, TE : PlatypusEntity<TE, TM>> KormManyToManyProperty<OM, TM>.many2many(factory: (env: PlatypusEnvironement) -> EmptyEntity<TE, TM>) = ManyToManyDelegate(this, factory)


class Many2ManyBag<M : BaseModel<M, *>, TE : PlatypusEntity<TE, T>, T : BaseModel<T, TE>>(
        private val modelID: ModelID,
        private val prop: KormManyToManyProperty<M, T>,
        env: PlatypusEnvironement,
        factory: (env: PlatypusEnvironement) -> EmptyEntity<TE, T>,
        val cacheProvider: () -> TransactionCache = { env.cr.cache }
) : AbstractBag<TE, T>(env, factory) {

    override val model: BaseModel<T, TE>
        get() = modelID.model as BaseModel<T, TE>

    override fun values(): ModelIDS {
        return cacheProvider().getOrExecute(modelID, prop) {
            this.prop.relationTable.findIds(env, this.prop, modelID)
        }
    }

    override fun addId(modelID: ModelID): Boolean {
        cacheProvider().add(this.modelID, prop, modelID)
        return true
    }

    override fun removeId(modelID: ModelID): Boolean {
        cacheProvider().remove(this.modelID, prop, modelID)
        return true
    }

    override fun filter(predicate: (TE) -> Boolean): Bag<TE> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}