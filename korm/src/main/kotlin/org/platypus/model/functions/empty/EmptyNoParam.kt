package org.platypus.model.functions.empty

import org.platypus.model.Model
import org.platypus.model.functions.ApiNoParam
import org.platypus.model.functions.ApiNoParamExtends
import org.platypus.model.functions.ApiNoParamOriginal
import org.platypus.model.functions.ApiNoParamStacker
import org.platypus.repository.RecordRepository

class ApiEmptyNoParamExtends<M : Model<M>, R>(
        funn: ApiEmptyNoParamExtends<M, R>.(RecordRepository<M>) -> R,
        superStack: ApiNoParam<RecordRepository<M>, M, R>
) : ApiNoParamExtends<RecordRepository<M>, M, R, ApiEmptyNoParamOriginal<M, R>, ApiEmptyNoParamExtends<M, R>>(funn, superStack)

class ApiEmptyNoParamOriginal<M : Model<M>, R>
(originalFunction: (RecordRepository<M>) -> R)
    : ApiNoParamOriginal<RecordRepository<M>, M, R,
        ApiEmptyNoParamOriginal<M, R>,
        ApiEmptyNoParamExtends<M, R>>(originalFunction)

class ApiEmptyNoParamStacker<M : Model<M>, R>(
        originalFunction: (RecordRepository<M>) -> R
) : ApiNoParamStacker<RecordRepository<M>, M, R, ApiEmptyNoParamOriginal<M, R>, ApiEmptyNoParamExtends<M, R>>(originalFunction) {

    override fun createApiNoParamOriginal(function: (RecordRepository<M>) -> R) = ApiEmptyNoParamOriginal(function)

    override fun createApiNoParamExtends(
            function: ApiEmptyNoParamExtends<M, R>.(RecordRepository<M>) -> R,
            superStack: ApiNoParam<RecordRepository<M>, M, R>) = ApiEmptyNoParamExtends(function, superStack)

}