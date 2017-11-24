package org.platypus.impl.korm.model.functions

import org.platypus.impl.korm.entity.Entity
import org.platypus.impl.korm.model.BaseModel
import java.util.*

@FunctionalInterface
interface ApiParam<
    in REAL_TYPE,
    RECEIVER : Entity<RECEIVER, MODEL_RECEIVER>,
    MODEL_RECEIVER : BaseModel<MODEL_RECEIVER, RECEIVER>,
    in PARAM : Any,
    out RETURN : Any?> {
    fun call(r: REAL_TYPE, param: PARAM): RETURN
}

abstract class ApiParamExtends<
    REAL_TYPE,
    RECEIVER : Entity<RECEIVER, MODEL_RECEIVER>,
    MODEL_RECEIVER : BaseModel<MODEL_RECEIVER, RECEIVER>,
    in PARAM : Any,
    out RETURN : Any?
    >(
    private val funn: ApiParamExtends<REAL_TYPE, RECEIVER, MODEL_RECEIVER, PARAM, RETURN>.(REAL_TYPE, PARAM) -> RETURN,
    private val superStack: ApiParam<REAL_TYPE, RECEIVER, MODEL_RECEIVER, PARAM, RETURN>)
    : ApiParam<REAL_TYPE, RECEIVER, MODEL_RECEIVER, PARAM, RETURN> {
    override fun call(r: REAL_TYPE, param: PARAM): RETURN = funn(r, param)
    fun REAL_TYPE.callSuper(param: PARAM): RETURN = superStack.call(this, param)
}

abstract class ApiParamOriginal<
    REAL_TYPE,
    RECIEVER : Entity<RECIEVER, MODEL_RECEIVER>,
    MODEL_RECEIVER : BaseModel<MODEL_RECEIVER, RECIEVER>,
    in PARAM : Any,
    out RETURN : Any?>
(private val originalFunction: (REAL_TYPE, PARAM) -> RETURN)
    : ApiParam<REAL_TYPE, RECIEVER, MODEL_RECEIVER, PARAM, RETURN> {
    override fun call(r: REAL_TYPE, param: PARAM): RETURN = originalFunction(r, param)

}

abstract class ApiParamStacker<
    REAL_TYPE,
    RECIEVER : Entity<RECIEVER, MODEL_RECEIVER>,
    MODEL_RECEIVER : BaseModel<MODEL_RECEIVER, RECIEVER>,
    PARAM : Any,
    RETURN : Any?
    >(
    protected val originalFunction: (REAL_TYPE, param: PARAM) -> RETURN)
    : ApiParam<REAL_TYPE, RECIEVER, MODEL_RECEIVER, PARAM, RETURN> {

    private val stackFunction = LinkedList<ApiParamExtends<REAL_TYPE, RECIEVER, MODEL_RECEIVER, PARAM, RETURN>.(REAL_TYPE, PARAM) -> RETURN>()

    private val stack by lazy { createStackSuperFun(stackFunction) }

    override fun call(r: REAL_TYPE, param: PARAM): RETURN {
        return stack.call(r, param)
    }

    internal fun hardCall(r: Any?, param: Any?): RETURN {
        return stack.call(r as REAL_TYPE, param as PARAM)
    }

    fun createStackSuperFun(stack: LinkedList<ApiParamExtends<REAL_TYPE, RECIEVER, MODEL_RECEIVER, PARAM, RETURN>.(REAL_TYPE, PARAM) -> RETURN>)
        : ApiParam<REAL_TYPE, RECIEVER, MODEL_RECEIVER, PARAM, RETURN> {
        val last = stack.pollLast()
        return if (last == null) {
            createApiParamOriginal(this.originalFunction)
        } else {
            val inside = if (stack.isEmpty()) {
                createApiParamOriginal(this.originalFunction)
            } else {
                createStackSuperFun(stack)
            }
            createApiParamExtends(last, inside)
        }
    }

    abstract fun createApiParamOriginal(funn: (REAL_TYPE, PARAM) -> RETURN)
        : ApiParam<REAL_TYPE, RECIEVER, MODEL_RECEIVER, PARAM, RETURN>

    abstract fun createApiParamExtends(
        funn: ApiParamExtends<REAL_TYPE, RECIEVER, MODEL_RECEIVER, PARAM, RETURN>.(REAL_TYPE, PARAM) -> RETURN,
        superStack: ApiParam<REAL_TYPE, RECIEVER, MODEL_RECEIVER, PARAM, RETURN>)
        : ApiParam<REAL_TYPE, RECIEVER, MODEL_RECEIVER, PARAM, RETURN>

    internal fun addExtend(extendFunction: ApiParamExtends<REAL_TYPE, RECIEVER, MODEL_RECEIVER, PARAM, RETURN>.(REAL_TYPE, PARAM) -> RETURN) {
        stackFunction.add(extendFunction)
    }
}