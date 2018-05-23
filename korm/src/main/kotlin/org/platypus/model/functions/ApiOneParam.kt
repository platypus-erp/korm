package org.platypus.model.functions

import org.platypus.Environmentable
import org.platypus.PlatypusEnvironment
import org.platypus.exceptions.PlatypusForbiddenActionGroup
import org.platypus.model.IModel
import org.platypus.module.base.AdminUser
import org.platypus.security.PlatypusGroup
import java.util.*

interface ApiOneParam<RT : Environmentable,
        M : IModel<M>,
        P,
        R> {
    fun call(r: RT, param: P): R
}



abstract class ApiParamExtends<
        RT: Environmentable,
        M : IModel<M>,
        P,
        R,
        OT : ApiParamOriginal<RT, M, P, R, OT, EXT>,
        EXT : ApiParamExtends<RT, M, P, R, OT, EXT>
        >(
        private val funn: EXT.(RT, P) -> R,
        private val superStack: ApiOneParam<RT, M, P, R>)
    : ApiOneParam<RT, M, P, R> {
    override fun call(r: RT, param: P): R = (this as EXT).funn(r, param)
    fun RT.callSuper(param: P): R = superStack.call(this, param)
}

abstract class ApiParamOriginal<
        RT: Environmentable,
        M : IModel<M>,
        P,
        R,
        OT : ApiParamOriginal<RT, M, P, R, OT, EXT>,
        EXT : ApiParamExtends<RT, M, P, R, OT, EXT>>
(private val originalFunction: (RT, P) -> R)
    : ApiOneParam<RT, M, P, R> {
    override fun call(r: RT, param: P): R = originalFunction(r, param)

}

abstract class ApiParamStacker<
        RT: Environmentable,
        M : IModel<M>,
        P,
        R,
        OT : ApiParamOriginal<RT, M, P, R, OT, EXT>,
        EXT : ApiParamExtends<RT, M, P, R, OT, EXT>
        >(
        protected val originalFunction: (RT, param: P) -> R)
    : ApiOneParam<RT, M, P, R> {

    private val stackFunction = LinkedList<EXT.(RT, P) -> R>()

    var methodName: String = "NO_NAME"
        internal set

    private val stack by lazy { createStackSuperFun(stackFunction) }
    private var methodGroups: Set<PlatypusGroup> = emptySet()

    override fun call(r: RT, param: P): R {
        r.env.checkAccessRight()
        return stack.call(r, param)
    }

    internal fun hardCall(r: Any?, param: Any?): R {
        return stack.call(r as RT, param as P)
    }

    fun canBeCalled(env: PlatypusEnvironment): Boolean {
        return env.sudoUser == AdminUser || methodGroups.isEmpty() || env.sudoUser.groups.containsAll(methodGroups)
    }

    private fun PlatypusEnvironment.checkAccessRight(){
        if (!canBeCalled(this)) {
            println(methodGroups)
            throw PlatypusForbiddenActionGroup(methodName)
        }
    }

    fun createStackSuperFun(stack: LinkedList<EXT.(RT, P) -> R>): ApiOneParam<RT, M, P, R> {
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

    abstract fun createApiParamOriginal(funn: (RT, P) -> R)
            : OT

    abstract fun createApiParamExtends(funn: EXT.(RT, P) -> R, superStack: ApiOneParam<RT, M, P, R>): EXT

    internal fun addExtend(extendFunction: EXT.(RT, P) -> R) {
        stackFunction.add(extendFunction)
    }

    internal fun addGroupsAccess(vararg groups: PlatypusGroup) {
        println("addGroupsAccess ${this}")
        methodGroups += groups
    }

    internal fun removeGroupsAccess(vararg groups: PlatypusGroup) {
        println("removeGroupsAccess ${this}")
        methodGroups -= groups
    }

    internal fun replaceGroupsAccess(vararg groups: PlatypusGroup) {
        println("replaceGroupsAccess ${this}")
        methodGroups = groups.toSet()
    }
}