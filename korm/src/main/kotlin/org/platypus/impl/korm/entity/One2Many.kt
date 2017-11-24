package org.platypus.impl.korm.entity

import org.platypus.api.env.PlatypusEnvironement
import org.platypus.impl.korm.identifiants.ModelID
import org.platypus.impl.korm.identifiants.ModelIDS
import org.platypus.impl.korm.cache.TransactionCache
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.model.property.KormOneToManyProperty
import org.platypus.impl.korm.sql.eq


class OneToManyDelegate<OM : BaseModel<OM, *>, TM : BaseModel<TM, TE>, TE : Entity<TE, TM>>(val prop: KormOneToManyProperty<OM, TM>, val factory: (env: PlatypusEnvironement) -> PlatypusEntityGetter<TE, TM>)

infix fun <OM : BaseModel<OM, *>, TM : BaseModel<TM, TE>, TE : Entity<TE, TM>> KormOneToManyProperty<OM, TM>.one2many(factory: (env: PlatypusEnvironement) -> PlatypusEntityGetter<TE, TM>) = OneToManyDelegate(this, factory)

class One2ManyBag<M : BaseModel<M, *>, TE : Entity<TE, T>, T : BaseModel<T, TE>>(
        private val modelID: ModelID,
        private val prop: KormOneToManyProperty<M, T>,
        env: PlatypusEnvironement,
        factory: (env: PlatypusEnvironement) -> PlatypusEntityGetter<TE, T>,
        val cacheProvider: () -> TransactionCache = { env.cr.cache }
) : AbstractBag<TE, T>(env, factory) {

    override val model: BaseModel<T, TE>
        get() = modelID.model as BaseModel<T, TE>

    override fun values(): ModelIDS {
        return cacheProvider().getOrExecute(modelID, prop) {
            this.factory(env).findIds { this.prop.target() eq modelID }
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