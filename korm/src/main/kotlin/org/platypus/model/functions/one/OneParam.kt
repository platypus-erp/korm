package org.platypus.model.functions.one

import org.platypus.bag.Bag
import org.platypus.entity.Record
import org.platypus.model.Model
import org.platypus.model.functions.ApiOneParam
import org.platypus.model.functions.ApiParamExtends
import org.platypus.model.functions.ApiParamOriginal
import org.platypus.model.functions.ApiParamStacker
import org.platypus.model.functions.multi.ApiMultiParamStacker

class ApiOneParamExtends<M : Model<M>, P, R>(
        funn: ApiOneParamExtends<M, P, R>.(Record<M>, P) -> R,
        superStack: ApiOneParam<Record<M>, M, P, R>
) : ApiParamExtends<Record<M>, M, P, R,
        ApiOneParamOriginal<M, P, R>,
        ApiOneParamExtends<M, P, R>>(
        funn, superStack
)

class ApiOneParamOriginal<M : Model<M>, P, R>
(originalFunction: (Record<M>, P) -> R)
    : ApiParamOriginal<Record<M>, M, P, R, ApiOneParamOriginal<M, P, R>, ApiOneParamExtends<M, P, R>>(originalFunction)

data class OneToMultiReturn<out RETURN : Any?>(val res: Map<Int, RETURN>)

class ApiOneParamStacker<M : Model<M>, P, R>(
        originalFunction: (Record<M>, P) -> R
) : ApiParamStacker<Record<M>, M, P, R, ApiOneParamOriginal<M, P, R>, ApiOneParamExtends<M, P, R>>(originalFunction) {

    var multi: ApiMultiParamStacker<M, P, R>? = null
        private set
    val defaultMulti = ApiMultiParamStacker(
            fun(self: Bag<M>, param: P): OneToMultiReturn<R> {
                val res = HashMap<Int, R>()
                for (rec in self) {
                    res[rec.id] = originalFunction(rec, param)
                }
                return OneToMultiReturn(res)
            }
    )

    override fun createApiParamOriginal(funn: (Record<M>, P) -> R) = ApiOneParamOriginal(funn)

    override fun createApiParamExtends(
            funn: ApiOneParamExtends<M, P, R>.(Record<M>, P) -> R,
            superStack: ApiOneParam<Record<M>, M, P, R>) = ApiOneParamExtends(funn, superStack)

    fun onMulti(multiFunction: (Bag<M>, P) -> R): ApiOneParamStacker<M, P, R> {
        multi = ApiMultiParamStacker(multiFunction)
        return this
    }


}