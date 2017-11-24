package org.platypus.impl.korm.model.functions.empty

import org.platypus.impl.korm.entity.Entity
import org.platypus.impl.korm.entity.PlatypusEntity
import org.platypus.impl.korm.entity.PlatypusEntityGetter
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.model.functions.ApiParam
import org.platypus.impl.korm.model.functions.ApiParamExtends
import org.platypus.impl.korm.model.functions.ApiParamOriginal
import org.platypus.impl.korm.model.functions.ApiParamStacker

class ApiEmptyParamExtends<T : PlatypusEntityGetter<E, M>, E : Entity<E, M>, M : BaseModel<M, E>, in P : Any, out R : Any?>(
    funn: ApiParamExtends<T, E, M, P, R>.(T, P) -> R,
    superStack: ApiParam<T, E, M, P, R>
) : ApiParamExtends<T, E, M, P, R>(funn, superStack)

class ApiEmptyParamOriginal<T : PlatypusEntityGetter<E, M>, E : Entity<E, M>, M : BaseModel<M, E>, in P : Any, out R : Any?>
(originalFunction: (T, P) -> R)
    : ApiParamOriginal<T, E, M, P, R>(originalFunction)

class ApiEmptyParamStacker<T : PlatypusEntityGetter<E, M>, E : Entity<E, M>, M : BaseModel<M, E>, P : Any, R : Any?>(
    originalFunction: (T, P) -> R
) : ApiParamStacker<T, E, M, P, R>(originalFunction) {

    override fun createApiParamOriginal(funn: (T, P) -> R) = ApiEmptyParamOriginal(funn)

    override fun createApiParamExtends(
        funn: ApiParamExtends<T, E, M, P, R>.(T, P) -> R,
        superStack: ApiParam<T, E, M, P, R>) = ApiEmptyParamExtends(funn, superStack)
}