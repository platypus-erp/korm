package org.platypus.impl.korm.entity.memory

import org.platypus.Platypus
import org.platypus.api.env.PlatypusEnvironement
import org.platypus.impl.korm.cache.TransactionCache
import org.platypus.impl.korm.entity.PlatypusEntityGetter
import org.platypus.impl.korm.entity.stored.RWEntity
import org.platypus.impl.korm.entity.stored.RWNamedEntity
import org.platypus.impl.korm.model.MemoryModelNamed
import org.platypus.impl.korm.model.BaseModel

abstract class RWMemoryEntity<SELF : RWMemoryEntity<SELF, SELF_MODEL>, SELF_MODEL : BaseModel<SELF_MODEL, SELF>>(
        _id: Long,
        env: PlatypusEnvironement,
        model: SELF_MODEL,
        factory: (e: PlatypusEnvironement) -> PlatypusEntityGetter<SELF, SELF_MODEL>
) : RWEntity<SELF, SELF_MODEL>(_id, env, model, factory) {
    override fun warmCache(): TransactionCache = Platypus.memoryCache()
}

abstract class RWNamedMemoryEntity<SELF : RWNamedMemoryEntity<SELF, SELF_MODEL>, SELF_MODEL : MemoryModelNamed<SELF_MODEL, SELF>>(
        _id: Long, env: PlatypusEnvironement, model: SELF_MODEL,
        factory: (e: PlatypusEnvironement) -> PlatypusEntityGetter<SELF, SELF_MODEL>)
    : RWNamedEntity<SELF, SELF_MODEL>(_id, env, model, factory) {
    override fun warmCache(): TransactionCache = Platypus.memoryCache()
}