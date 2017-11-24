package org.platypus.impl.korm.model.functions.one

import org.platypus.impl.korm.entity.Bag
import org.platypus.impl.korm.entity.Entity
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.model.functions.ApiParam
import org.platypus.impl.korm.model.functions.ApiParamExtends
import org.platypus.impl.korm.model.functions.ApiParamOriginal
import org.platypus.impl.korm.model.functions.ApiParamStacker
import org.platypus.impl.korm.model.functions.empty.ApiMultiParamStacker

class ApiOneParamExtends<
        RECEIVER : Entity<RECEIVER, MODEL_RECEIVER>,
        MODEL_RECEIVER : BaseModel<MODEL_RECEIVER, RECEIVER>,
        in PARAM : Any,
        out RETURN : Any?>(
        funn: ApiParamExtends<
                RECEIVER,
                RECEIVER,
                MODEL_RECEIVER,
                PARAM,
                RETURN>.(RECEIVER, PARAM) -> RETURN,
        superStack: ApiParam<
                RECEIVER,
                RECEIVER,
                MODEL_RECEIVER,
                PARAM,
                RETURN>
) : ApiParamExtends<
        RECEIVER,
        RECEIVER,
        MODEL_RECEIVER,
        PARAM,
        RETURN>(
        funn, superStack
)

class ApiOneParamOriginal<
        RECEIVER : Entity<RECEIVER, MODEL_RECEIVER>,
        MODEL_RECEIVER : BaseModel<MODEL_RECEIVER, RECEIVER>,
        in PARAM : Any,
        out RETURN : Any?>
(originalFunction: (RECEIVER, PARAM) -> RETURN)
    : ApiParamOriginal<
        RECEIVER,
        RECEIVER,
        MODEL_RECEIVER,
        PARAM,
        RETURN>(originalFunction)

data class OneToMultiReturn<out RETURN : Any?>(val res: Map<Long, RETURN>)

class ApiOneParamStacker<
        RECEIVER : Entity<RECEIVER, MODEL_RECEIVER>,
        MODEL_RECEIVER : BaseModel<MODEL_RECEIVER, RECEIVER>,
        PARAM : Any,
        RETURN : Any?>(
        originalFunction: (RECEIVER, PARAM) -> RETURN
) : ApiParamStacker<
        RECEIVER,
        RECEIVER,
        MODEL_RECEIVER,
        PARAM,
        RETURN>(originalFunction) {

    var multi: ApiMultiParamStacker<RECEIVER, MODEL_RECEIVER, PARAM, RETURN>? = null
        private set
    val defaultMulti = ApiMultiParamStacker(
            fun(self: Bag<RECEIVER>, param: PARAM): OneToMultiReturn<RETURN> {
                val res = HashMap<Long, RETURN>()
                for (rec in self) {
                    res[rec.id] = originalFunction(rec, param)
                }
                return OneToMultiReturn(res)
            }
    )

    override fun createApiParamOriginal(funn: (RECEIVER, PARAM) -> RETURN) = ApiOneParamOriginal(funn)

    override fun createApiParamExtends(
            funn: ApiParamExtends<
                    RECEIVER,
                    RECEIVER,
                    MODEL_RECEIVER,
                    PARAM,
                    RETURN>.(RECEIVER, PARAM) -> RETURN,
            superStack: ApiParam<
                    RECEIVER,
                    RECEIVER,
                    MODEL_RECEIVER,
                    PARAM,
                    RETURN>) = ApiOneParamExtends(funn, superStack)

    fun onMulti(multiFunction: (Bag<RECEIVER>, PARAM) -> RETURN): ApiOneParamStacker<RECEIVER, MODEL_RECEIVER, PARAM, RETURN> {
        multi = ApiMultiParamStacker(multiFunction)
        return this
    }
}