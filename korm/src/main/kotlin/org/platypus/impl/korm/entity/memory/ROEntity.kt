package org.platypus.impl.korm.entity.memory

import org.platypus.Platypus
import org.platypus.api.env.PlatypusEnvironement
import org.platypus.impl.korm.cache.TransactionCache
import org.platypus.impl.korm.entity.NamedEntity
import org.platypus.impl.korm.entity.stored.EmptyEntity
import org.platypus.impl.korm.entity.stored.ROEntity
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.model.ModelNamed

abstract class ROMemoryEntity<SELF : ROMemoryEntity<SELF, SELF_MODEL>, SELF_MODEL : BaseModel<SELF_MODEL, SELF>>(
        _id: Long,
        env: PlatypusEnvironement,
        model: SELF_MODEL,
        factory: (e: PlatypusEnvironement) -> EmptyEntity<SELF, SELF_MODEL>
) : ROEntity<SELF, SELF_MODEL>(_id, env, model, factory) {
    override fun warmCache(): TransactionCache = Platypus.memoryCache()
}

abstract class RONamedMemoryEntity<E : RONamedMemoryEntity<E, M>, M : ModelNamed<M, E>>(
        _id: Long,
        env: PlatypusEnvironement,
        model: M,
        factory: (e: PlatypusEnvironement) -> EmptyEntity<E, M>
) : ROMemoryEntity<E, M>(_id, env, model, factory), NamedEntity<E, M> {

    override fun warmCache(): TransactionCache = Platypus.memoryCache()
}