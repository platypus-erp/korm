package org.platypus.api.data

import org.platypus.api.env.PlatypusEnvironement
import org.platypus.impl.korm.entity.Entity
import org.platypus.impl.korm.entity.PlatypusEntity
import org.platypus.impl.korm.entity.PlatypusEntityGetter
import org.platypus.impl.korm.model.BaseModel
import kotlin.reflect.KProperty

fun <T : PlatypusEntity<T, M>, M : BaseModel<M, T>> dataRef(ref: String, loader: (e: PlatypusEnvironement) -> T): PlatypusRefData<T, M> {
    return PlatypusRefData(ref, loader)
}

class PlatypusRefData<T : Entity<T, M>, M : BaseModel<M, T>>(
        private val ref: String,
        private val loader: (e: PlatypusEnvironement) -> T) {
    var element: T? = null

    operator fun invoke(env: PlatypusEnvironement, entityGetter: PlatypusEntityGetter<T, M>): T {
        if (element == null) {
            element = entityGetter.byRefOrNull(ref)
            if (element == null) {
                element = loader(env)
            }
        }
        return element!!
    }
}

class DataRef<T : Entity<T, M>, M : BaseModel<M, T>>(
        val env: PlatypusEnvironement, val entityGetter: PlatypusEntityGetter<T, M>
) {
    operator fun PlatypusRefData<T, M>.getValue(t: DataRef<T, M>, property: KProperty<*>): T {
        return this(env, entityGetter)
    }
}