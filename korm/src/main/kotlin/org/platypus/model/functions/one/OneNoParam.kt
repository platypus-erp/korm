package org.platypus.model.functions.one

import io.ktor.http.HttpMethod
import org.platypus.entity.Record
import org.platypus.model.IModel
import org.platypus.model.functions.ApiNoParam
import org.platypus.model.functions.ApiNoParamExtends
import org.platypus.model.functions.ApiNoParamOriginal
import org.platypus.model.functions.ApiNoParamStacker
import org.platypus.model.functions.multi.ApiMultiNoParamStacker

class ApiOneNoParamExtends<M : IModel<M>, R>
(
        funn: ApiOneNoParamExtends<M, R>.(Record<M>) -> R,
        superStack: ApiNoParam<Record<M>, M, R>
) : ApiNoParamExtends<Record<M>, M, R, ApiOneNoParamOriginal<M, R>, ApiOneNoParamExtends<M, R>>(funn, superStack)

class ApiOneNoParamOriginal<M : IModel<M>, R>
(
        originalFunction: (Record<M>) -> R
) : ApiNoParamOriginal<Record<M>, M, R, ApiOneNoParamOriginal<M, R>, ApiOneNoParamExtends<M, R>>(originalFunction)

class ApiOneNoParamStacker<M : IModel<M>, R>
(
        originalFunction: (Record<M>) -> R,
        visibilityType: HttpMethod = HttpMethod.Post
) : ApiNoParamStacker<Record<M>, M, R, ApiOneNoParamOriginal<M, R>, ApiOneNoParamExtends<M, R>>
(originalFunction, visibilityType) {

    val onMulti:ApiMultiNoParamStacker<M, Map<Record<M>, R>> = ApiMultiNoParamStacker {
        it.associate { it to call(it) }
    }


    override fun createApiNoParamOriginal(function: (Record<M>) -> R) =
            ApiOneNoParamOriginal(function)

    override fun createApiNoParamExtends(function: ApiOneNoParamExtends<M, R>.(Record<M>) -> R, superStack: ApiNoParam<Record<M>, M, R>): ApiOneNoParamExtends<M, R> =
            ApiOneNoParamExtends(function, superStack)
}