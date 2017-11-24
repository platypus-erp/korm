package org.platypus.impl.korm.model.functions

import io.ktor.http.HttpMethod
import org.platypus.impl.korm.entity.Entity
import org.platypus.impl.korm.model.BaseModel
import java.util.*

@FunctionalInterface
interface ApiNoParam<
    REAL_TYPE,
    RECIEVER : Entity<RECIEVER, MODEL_RECEIVER>,
    MODEL_RECEIVER : BaseModel<MODEL_RECEIVER, RECIEVER>,
    out RETURN : Any?> {
    fun call(r: REAL_TYPE): RETURN
}

abstract class ApiNoParamExtends<
    REAL_TYPE,
    RECEIVER : Entity<RECEIVER, MODEL_RECEIVER>,
    MODEL_RECEIVER : BaseModel<MODEL_RECEIVER, RECEIVER>,
    RETURN : Any?>(
    val funn: ApiNoParamExtends<REAL_TYPE, RECEIVER, MODEL_RECEIVER, RETURN>.(REAL_TYPE) -> RETURN,
    val superStack: ApiNoParam<REAL_TYPE, RECEIVER, MODEL_RECEIVER, RETURN>
) : ApiNoParam<REAL_TYPE, RECEIVER, MODEL_RECEIVER, RETURN> {
    override fun call(r: REAL_TYPE): RETURN = funn(r)

    fun REAL_TYPE.callSuper(): RETURN = superStack.call(this)

}

abstract class ApiNoParamOriginal<
    REAL_TYPE,
    RECIEVER : Entity<RECIEVER, MODEL_RECEIVER>,
    MODEL_RECEIVER : BaseModel<MODEL_RECEIVER, RECIEVER>,
    out RETURN : Any?>
(private val originalFunction: (REAL_TYPE) -> RETURN)
    : ApiNoParam<REAL_TYPE, RECIEVER, MODEL_RECEIVER, RETURN> {
    override fun call(r: REAL_TYPE): RETURN = originalFunction(r)

}

abstract class ApiNoParamStacker<
    REAL_TYPE,
    RECEIVER : Entity<RECEIVER, MODEL_RECEIVER>,
    MODEL_RECEIVER : BaseModel<MODEL_RECEIVER, RECEIVER>,
    RETURN : Any?>(
    private val originalFunction: (REAL_TYPE) -> RETURN,
    val visibilityType: HttpMethod = HttpMethod.Post
) : ApiNoParam<REAL_TYPE, RECEIVER, MODEL_RECEIVER, RETURN> {

    private val stackFunction = LinkedList<ApiNoParamExtends<REAL_TYPE, RECEIVER, MODEL_RECEIVER, RETURN>.(REAL_TYPE) -> RETURN>()

    private val stack by lazy { createStackSuperFun(stackFunction) }

    override fun call(r: REAL_TYPE): RETURN {
        return stack.call(r)
    }

    internal fun hardCall(r: Any?): RETURN {
        return stack.call(r as REAL_TYPE)
    }

    fun createStackSuperFun(stack: LinkedList<ApiNoParamExtends<REAL_TYPE, RECEIVER, MODEL_RECEIVER, RETURN>.(REAL_TYPE) -> RETURN>)
        : ApiNoParam<REAL_TYPE, RECEIVER, MODEL_RECEIVER, RETURN> {
        val last = stack.pollLast()
        return if (last == null) {
            createApiNoParamOriginal(this.originalFunction)
        } else {
            val inside = if (stack.isEmpty()) {
                createApiNoParamOriginal(this.originalFunction)
            } else {
                createStackSuperFun(stack)
            }
            createApiNoParamExtends(last, inside)
        }
    }

    abstract fun createApiNoParamOriginal(funn: (REAL_TYPE) -> RETURN)
        : ApiNoParam<REAL_TYPE, RECEIVER, MODEL_RECEIVER, RETURN>

    abstract fun createApiNoParamExtends(
        funn: ApiNoParamExtends<REAL_TYPE, RECEIVER, MODEL_RECEIVER, RETURN>.(REAL_TYPE) -> RETURN,
        superStack: ApiNoParam<REAL_TYPE, RECEIVER, MODEL_RECEIVER, RETURN>)
        : ApiNoParam<REAL_TYPE, RECEIVER, MODEL_RECEIVER, RETURN>

    internal fun addExtend(extendFunction: ApiNoParamExtends<REAL_TYPE, RECEIVER, MODEL_RECEIVER, RETURN>.(REAL_TYPE) -> RETURN) {
        stackFunction.add(extendFunction)
    }
}