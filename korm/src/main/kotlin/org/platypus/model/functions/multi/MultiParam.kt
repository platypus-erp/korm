package org.platypus.model.functions.multi

import org.platypus.bag.Bag
import org.platypus.model.Model
import org.platypus.model.functions.ApiOneParam
import org.platypus.model.functions.ApiParamExtends
import org.platypus.model.functions.ApiParamOriginal
import org.platypus.model.functions.ApiParamStacker

class ApiMultiParamExtends<M : Model<M>, P, R>(
        funn: ApiMultiParamExtends<M, P, R>.(Bag<M>, P) -> R,
        superStack: ApiOneParam<Bag<M>, M, P, R>
) : ApiParamExtends<Bag<M>, M, P, R,
        ApiMultiParamOriginal<M, P, R>,
        ApiMultiParamExtends<M, P, R>>(
        funn, superStack
)

class ApiMultiParamOriginal<
        M : Model<M>,
        P,
        R>
(originalFunction: (Bag<M>, P) -> R)
    : ApiParamOriginal<Bag<M>, M, P, R,
        ApiMultiParamOriginal<M, P, R>,
        ApiMultiParamExtends<M, P, R>>(originalFunction)

class ApiMultiParamStacker<M : Model<M>, P, R>(
        originalFunction: (Bag<M>, P) -> R
) : ApiParamStacker<Bag<M>, M, P, R,
        ApiMultiParamOriginal<M, P, R>,
        ApiMultiParamExtends<M, P, R>>(originalFunction) {

    override fun createApiParamOriginal(funn: (Bag<M>, P) -> R) = ApiMultiParamOriginal(funn)

    override fun createApiParamExtends(
            funn: ApiMultiParamExtends<M, P, R>.(Bag<M>, P) -> R,
            superStack: ApiOneParam<Bag<M>, M, P, R>
    ) = ApiMultiParamExtends(funn, superStack)
}