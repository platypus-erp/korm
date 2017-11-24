package org.platypus.impl.korm.entity

import org.platypus.api.env.PlatypusEnvironement
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.model.property.KormManyToOneProperty

class ManyToOneDelegate<M : BaseModel<M, E>, E : Entity<E, M>>(val prop: KormManyToOneProperty<*, *>, val factory: (env: PlatypusEnvironement) -> PlatypusEntityGetter<E, M>)

infix fun <T : BaseModel<T, TE>, TE : Entity<TE, T>> KormManyToOneProperty<*, *>.many2one(factory: (env: PlatypusEnvironement) -> PlatypusEntityGetter<TE, T>)
        = ManyToOneDelegate(this, factory)