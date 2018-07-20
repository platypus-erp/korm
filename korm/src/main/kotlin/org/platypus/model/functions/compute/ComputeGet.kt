package org.platypus.model.functions.compute

import io.ktor.http.HttpMethod
import org.platypus.bag.Bag
import org.platypus.entity.Record
import org.platypus.model.IModel
import org.platypus.model.field.api.ModelField
import org.platypus.model.functions.ApiNoParam
import org.platypus.model.functions.ApiNoParamExtends
import org.platypus.model.functions.ApiNoParamOriginal
import org.platypus.model.functions.ApiNoParamStacker
import org.platypus.model.functions.PublicApiReturn
import org.platypus.model.functions.asResult
import org.platypus.model.functions.multi.ApiMultiNoParamStacker

class ComputeGetExtends<M : IModel<M>, R>
(
        funn: ComputeGetExtends<M, R>.(Record<M>) -> R,
        superStack: ApiNoParam<Record<M>, M, R>
) : ApiNoParamExtends<Record<M>, M, R, ComputeGetOriginal<M, R>, ComputeGetExtends<M, R>>(funn, superStack)

class ComputeGetOriginal<M : IModel<M>, R>
(
        originalFunction: (Record<M>) -> R
) : ApiNoParamOriginal<Record<M>, M, R, ComputeGetOriginal<M, R>, ComputeGetExtends<M, R>>(originalFunction)

class ComputeGetStacker<M : IModel<M>, R : Any>
(
        originalFunction: (Record<M>) -> R,
        private val field: ModelField<M, R>
) : ApiNoParamStacker<Record<M>, M, R, ComputeGetOriginal<M, R>, ComputeGetExtends<M, R>>
(originalFunction, HttpMethod.Post) {

    var multi: ApiMultiNoParamStacker<M, R>? = null
        private set
    val defaultMulti = ApiMultiNoParamStacker(
            fun(self: Bag<M>): PublicApiReturn<R> {
                val res = HashMap<Int, R>()
                for (rec in self) {
                    res[rec.id] = originalFunction(rec)
                }
                return res.asResult()
            }
    )

    override fun createApiNoParamOriginal(function: (Record<M>) -> R) =
            ComputeGetOriginal(function)

    override fun createApiNoParamExtends(function: ComputeGetExtends<M, R>.(Record<M>) -> R,
                                         superStack: ApiNoParam<Record<M>, M, R>) =
            ComputeGetExtends(function, superStack)

    fun onMulti(multiFunction: (Bag<M>) -> R): ComputeGetStacker<M, R> {
        multi = ApiMultiNoParamStacker(multiFunction)
        return this
    }

}