package org.platypus.impl.korm.model.functions.empty

import org.platypus.impl.korm.entity.Entity
import org.platypus.impl.korm.entity.PlatypusEntity
import org.platypus.impl.korm.entity.PlatypusEntityGetter
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.model.functions.ApiNoParam
import org.platypus.impl.korm.model.functions.ApiNoParamExtends
import org.platypus.impl.korm.model.functions.ApiNoParamOriginal
import org.platypus.impl.korm.model.functions.ApiNoParamStacker

class ApiEmptyExtends<T : PlatypusEntityGetter<E, M>, E : Entity<E, M>, M : BaseModel<M, E>, R : Any?>(
    funn: ApiNoParamExtends<T, E, M, R>.(T) -> R,
    superStack: ApiNoParam<T, E, M, R>
) : ApiNoParamExtends<T, E, M, R>(funn, superStack)

class ApiEmptyNoParamOriginal<T : PlatypusEntityGetter<E, M>, E : Entity<E, M>, M : BaseModel<M, E>, out R : Any?>
(originalFunction: (T) -> R)
    : ApiNoParamOriginal<T, E, M, R>(originalFunction)

class ApiEmptyNoParamStacker<T : PlatypusEntityGetter<E, M>, E : Entity<E, M>, M : BaseModel<M, E>, R : Any?>(
    originalFunction: (T) -> R
) : ApiNoParamStacker<T, E, M, R>(originalFunction) {

    override fun createApiNoParamOriginal(funn: (T) -> R) = ApiEmptyNoParamOriginal(funn)

    override fun createApiNoParamExtends(
        funn: ApiNoParamExtends<T, E, M, R>.(T) -> R,
        superStack: ApiNoParam<T, E, M, R>) = ApiEmptyExtends(funn, superStack)

}