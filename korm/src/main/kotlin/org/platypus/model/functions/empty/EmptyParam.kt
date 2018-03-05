package org.platypus.model.functions.empty

import org.platypus.model.Model
import org.platypus.model.functions.ApiOneParam
import org.platypus.model.functions.ApiParamExtends
import org.platypus.model.functions.ApiParamOriginal
import org.platypus.model.functions.ApiParamStacker
import org.platypus.repository.RecordRepository

class ApiEmptyParamExtends<M : Model<M>, P, R>(
        funn: ApiEmptyParamExtends<M, P, R>.(RecordRepository<M>, P) -> R,
        superStack: ApiOneParam<RecordRepository<M>, M, P, R>
) : ApiParamExtends<RecordRepository<M>, M, P, R,
        ApiEmptyParamOriginal<M, P, R>,
        ApiEmptyParamExtends<M, P, R>>(funn, superStack)

class ApiEmptyParamOriginal<M : Model<M>, P, R>(originalFunction: (RecordRepository<M>, P) -> R) : ApiParamOriginal<RecordRepository<M>, M, P, R,
        ApiEmptyParamOriginal<M, P, R>,
        ApiEmptyParamExtends<M, P, R>>(originalFunction)

class ApiEmptyParamStacker<M : Model<M>, P, R>(originalFunction: (RecordRepository<M>, P) -> R) : ApiParamStacker<RecordRepository<M>, M, P, R, ApiEmptyParamOriginal<M, P, R>, ApiEmptyParamExtends<M, P, R>>(originalFunction) {

    override fun createApiParamOriginal(funn: (RecordRepository<M>, P) -> R) = ApiEmptyParamOriginal(funn)

    override fun createApiParamExtends(
            funn: ApiEmptyParamExtends<M, P, R>.(RecordRepository<M>, P) -> R,
            superStack: ApiOneParam<RecordRepository<M>, M, P, R>) = ApiEmptyParamExtends(funn, superStack)


}