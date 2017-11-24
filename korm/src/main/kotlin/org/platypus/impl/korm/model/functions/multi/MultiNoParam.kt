package org.platypus.impl.korm.model.functions.empty

import org.platypus.impl.korm.entity.Bag
import org.platypus.impl.korm.entity.Entity
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.model.functions.ApiNoParam
import org.platypus.impl.korm.model.functions.ApiNoParamExtends
import org.platypus.impl.korm.model.functions.ApiNoParamOriginal
import org.platypus.impl.korm.model.functions.ApiNoParamStacker

class ApiMultiExtends<
    RECEIVER : Entity<RECEIVER, MODEL_RECEIVER>,
    MODEL_RECEIVER : BaseModel<MODEL_RECEIVER, RECEIVER>,
    RETURN : Any?>(
    funn: ApiNoParamExtends<Bag<RECEIVER>,
        RECEIVER, MODEL_RECEIVER, RETURN>.(Bag<RECEIVER>) -> RETURN,
    superStack: ApiNoParam<Bag<RECEIVER>, RECEIVER, MODEL_RECEIVER, RETURN>
) : ApiNoParamExtends<
    Bag<RECEIVER>,
    RECEIVER,
    MODEL_RECEIVER,
    RETURN>(funn, superStack)

class ApiMultiNoParamOriginal<
    RECEIVER : Entity<RECEIVER, MODEL_RECEIVER>,
    MODEL_RECEIVER : BaseModel<MODEL_RECEIVER, RECEIVER>,
    RETURN : Any?>
(originalFunction: (Bag<RECEIVER>) -> RETURN)
    : ApiNoParamOriginal<
    Bag<RECEIVER>,
    RECEIVER,
    MODEL_RECEIVER,
    RETURN>(originalFunction)

class ApiMultiNoParamStacker<
    RECEIVER : Entity<RECEIVER, MODEL_RECEIVER>,
    MODEL_RECEIVER : BaseModel<MODEL_RECEIVER, RECEIVER>,
    RETURN : Any?>(
    originalFunction: (Bag<RECEIVER>) -> RETURN
) : ApiNoParamStacker<
    Bag<RECEIVER>,
    RECEIVER,
    MODEL_RECEIVER,
    RETURN>(originalFunction) {

    override fun createApiNoParamOriginal(funn: (Bag<RECEIVER>) -> RETURN) = ApiMultiNoParamOriginal(funn)

    override fun createApiNoParamExtends(
        funn: ApiNoParamExtends<
            Bag<RECEIVER>,
            RECEIVER,
            MODEL_RECEIVER,
            RETURN>.(Bag<RECEIVER>) -> RETURN,
        superStack: ApiNoParam<
            Bag<RECEIVER>,
            RECEIVER,
            MODEL_RECEIVER,
            RETURN>) = ApiMultiExtends(funn, superStack)

}