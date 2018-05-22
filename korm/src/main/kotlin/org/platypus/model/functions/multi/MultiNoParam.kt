package org.platypus.model.functions.multi

import org.platypus.bag.Bag
import org.platypus.model.Model
import org.platypus.model.functions.ApiNoParam
import org.platypus.model.functions.ApiNoParamExtends
import org.platypus.model.functions.ApiNoParamOriginal
import org.platypus.model.functions.ApiNoParamStacker

class ApiMultiNoParamExtends<
        M : Model<M>,
        R>(
        funn: ApiMultiNoParamExtends<M, R>.(Bag<M>) -> R,
        superStack: ApiNoParam<Bag<M>, M, R>
) : ApiNoParamExtends<
        Bag<M>,
        M,
        R,
        ApiMultiNoParamOriginal<M, R>,
        ApiMultiNoParamExtends<M, R>
        >(funn, superStack)

class ApiMultiNoParamOriginal<M : Model<M>, R>
(originalFunction: (Bag<M>) -> R)
    : ApiNoParamOriginal<
        Bag<M>,
        M,
        R,
        ApiMultiNoParamOriginal<M, R>,
        ApiMultiNoParamExtends<M, R>
        >(originalFunction)

class ApiMultiNoParamStacker<M : Model<M>, R>(
        originalFunction: (Bag<M>) -> R
) : ApiNoParamStacker<Bag<M>, M, R, ApiMultiNoParamOriginal<M, R>, ApiMultiNoParamExtends<M, R>>(originalFunction) {

    override fun createApiNoParamOriginal(funn: (Bag<M>) -> R) = ApiMultiNoParamOriginal(funn)

    override fun createApiNoParamExtends(
            funn: ApiMultiNoParamExtends<M, R>.(Bag<M>) -> R,
            superStack: ApiNoParam<Bag<M>, M, R>) = ApiMultiNoParamExtends(funn, superStack)

}