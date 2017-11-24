package org.platypus.impl.korm.model.functions.empty

import org.platypus.impl.korm.entity.Bag
import org.platypus.impl.korm.entity.Entity
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.model.functions.ApiParam
import org.platypus.impl.korm.model.functions.ApiParamExtends
import org.platypus.impl.korm.model.functions.ApiParamOriginal
import org.platypus.impl.korm.model.functions.ApiParamStacker

class ApiMultiParamExtends<
        RECEIVER : Entity<RECEIVER, MODEL_RECEIVER>,
        MODEL_RECEIVER : BaseModel<MODEL_RECEIVER, RECEIVER>,
        in PARAM : Any,
        out RETURN : Any?>(
        funn: ApiParamExtends<
                Bag<RECEIVER>,
                RECEIVER,
                MODEL_RECEIVER,
                PARAM,
                RETURN>.(Bag<RECEIVER>, PARAM) -> RETURN,
        superStack: ApiParam<
                Bag<RECEIVER>,
                RECEIVER,
                MODEL_RECEIVER,
                PARAM,
                RETURN>
) : ApiParamExtends<
        Bag<RECEIVER>,
        RECEIVER,
        MODEL_RECEIVER,
        PARAM,
        RETURN>(
        funn, superStack
)

class ApiMultiParamOriginal<
        RECEIVER : Entity<RECEIVER, MODEL_RECEIVER>,
        MODEL_RECEIVER : BaseModel<MODEL_RECEIVER, RECEIVER>,
        in PARAM : Any,
        out RETURN : Any?>
(originalFunction: (Bag<RECEIVER>, PARAM) -> RETURN)
    : ApiParamOriginal<
        Bag<RECEIVER>,
        RECEIVER,
        MODEL_RECEIVER,
        PARAM,
        RETURN>(originalFunction)

class ApiMultiParamStacker<
        RECEIVER : Entity<RECEIVER, MODEL_RECEIVER>,
        MODEL_RECEIVER : BaseModel<MODEL_RECEIVER, RECEIVER>,
        PARAM : Any,
        RETURN : Any?>(
        originalFunction: (Bag<RECEIVER>, PARAM) -> RETURN
) : ApiParamStacker<
        Bag<RECEIVER>,
        RECEIVER,
        MODEL_RECEIVER,
        PARAM,
        RETURN>(originalFunction) {

    override fun createApiParamOriginal(funn: (Bag<RECEIVER>, PARAM) -> RETURN)
            = ApiMultiParamOriginal(funn)

    override fun createApiParamExtends(
            funn: ApiParamExtends<
                    Bag<RECEIVER>,
                    RECEIVER,
                    MODEL_RECEIVER,
                    PARAM,
                    RETURN>.(Bag<RECEIVER>, PARAM) -> RETURN,
            superStack: ApiParam<
                    Bag<RECEIVER>,
                    RECEIVER,
                    MODEL_RECEIVER,
                    PARAM,
                    RETURN>)
            = ApiMultiParamExtends(funn, superStack)
}