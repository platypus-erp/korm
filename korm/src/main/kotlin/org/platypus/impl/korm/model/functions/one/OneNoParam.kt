package org.platypus.impl.korm.model.functions.one

import io.ktor.http.HttpMethod
import org.platypus.impl.korm.entity.Bag
import org.platypus.impl.korm.entity.Entity
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.model.functions.ApiNoParam
import org.platypus.impl.korm.model.functions.ApiNoParamExtends
import org.platypus.impl.korm.model.functions.ApiNoParamOriginal
import org.platypus.impl.korm.model.functions.ApiNoParamStacker
import org.platypus.impl.korm.model.functions.PublicApiReturn
import org.platypus.impl.korm.model.functions.createMultiResult
import org.platypus.impl.korm.model.functions.empty.ApiMultiNoParamStacker

class ApiOneExtends<
    RECEIVER : Entity<RECEIVER, MODEL_RECEIVER>,
    MODEL_RECEIVER : BaseModel<MODEL_RECEIVER, RECEIVER>,
    RETURN : Any?>(
    funn: ApiNoParamExtends<RECEIVER,
        RECEIVER, MODEL_RECEIVER, RETURN>.(RECEIVER) -> RETURN,
    superStack: ApiNoParam<RECEIVER, RECEIVER, MODEL_RECEIVER, RETURN>
) : ApiNoParamExtends<
    RECEIVER,
    RECEIVER,
    MODEL_RECEIVER,
    RETURN>(funn, superStack)

class ApiOneNoParamOriginal<
    RECEIVER : Entity<RECEIVER, MODEL_RECEIVER>,
    MODEL_RECEIVER : BaseModel<MODEL_RECEIVER, RECEIVER>,
    out RETURN : Any?>
(originalFunction: (RECEIVER) -> RETURN)
    : ApiNoParamOriginal<
    RECEIVER,
    RECEIVER,
    MODEL_RECEIVER,
    RETURN>(originalFunction)

class ApiOneNoParamStacker<
    RECEIVER : Entity<RECEIVER, MODEL_RECEIVER>,
    MODEL_RECEIVER : BaseModel<MODEL_RECEIVER, RECEIVER>,
    RETURN : Any?>(
    originalFunction: (RECEIVER) -> RETURN,
    visibilityType: HttpMethod = HttpMethod.Post
) : ApiNoParamStacker<
    RECEIVER,
    RECEIVER,
    MODEL_RECEIVER,
    RETURN>(originalFunction, visibilityType) {

    var multi: ApiMultiNoParamStacker<RECEIVER, MODEL_RECEIVER, RETURN>? = null
        private set
    val defaultMulti = ApiMultiNoParamStacker(
        fun(self: Bag<RECEIVER>): PublicApiReturn<RETURN> {
            val res = HashMap<Long, RETURN>()
            for (rec in self) {
                res[rec.id] = originalFunction(rec)
            }
            return createMultiResult(res)
        }
    )

    override fun createApiNoParamOriginal(funn: (RECEIVER) -> RETURN) = ApiOneNoParamOriginal(funn)

    override fun createApiNoParamExtends(
        funn: ApiNoParamExtends<
            RECEIVER,
            RECEIVER,
            MODEL_RECEIVER,
            RETURN>.(RECEIVER) -> RETURN,
        superStack: ApiNoParam<
            RECEIVER,
            RECEIVER,
            MODEL_RECEIVER,
            RETURN>) = ApiOneExtends(funn, superStack)

    fun onMulti(multiFunction: (Bag<RECEIVER>) -> RETURN): ApiOneNoParamStacker<RECEIVER, MODEL_RECEIVER, RETURN> {
        multi = ApiMultiNoParamStacker(multiFunction)
        return this
    }

}