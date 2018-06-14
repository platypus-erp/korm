package org.platypus.model.functions

import io.ktor.http.HttpMethod
import org.platypus.Environmentable
import org.platypus.PlatypusEnvironment
import org.platypus.exceptions.PlatypusForbiddenActionGroup
import org.platypus.model.IModel
import org.platypus.security.PlatypusGroup
import org.platypus.security.ROOT_USER
import java.util.*

interface ApiNoParam<in RT : Environmentable, M : IModel<M>, out R> {
    fun call(r: RT): R
}

abstract class ApiNoParamExtends<
        RT : Environmentable, M : IModel<M>, R,
        OT : ApiNoParamOriginal<RT, M, R, OT, EXT>,
        EXT : ApiNoParamExtends<RT, M, R, OT, EXT>>
(
        val funn: EXT.(RT) -> R,
        val superStack: ApiNoParam<RT, M, R>
) : ApiNoParam<RT, M, R> {
    override fun call(r: RT): R = (this as EXT).funn(r)
    fun RT.callSuper(): R = superStack.call(this)

}

abstract class ApiNoParamOriginal<
        RT : Environmentable, M : IModel<M>, R,
        OT : ApiNoParamOriginal<RT, M, R, OT, EXT>,
        EXT : ApiNoParamExtends<RT, M, R, OT, EXT>>
(
        private val originalFunction: (RT) -> R) : ApiNoParam<RT, M, R> {
    override fun call(r: RT): R = originalFunction(r)
}

abstract class ApiNoParamStacker<
        RT : Environmentable,
        M : IModel<M>,
        R,
        OT : ApiNoParamOriginal<RT, M, R, OT, EXT>,
        EXT : ApiNoParamExtends<RT, M, R, OT, EXT>
        >(
        private val originalFunction: (RT) -> R,
        val visibilityType: HttpMethod = HttpMethod.Post
) : ApiNoParam<RT, M, R> {

    private val stackFunction = LinkedList<EXT.(RT) -> R>()

    var methodName: String = "NO_NAME"
        internal set

    private val stack by lazy { createStackSuperFun(stackFunction) }
    private var methodGroups: Set<PlatypusGroup> = emptySet()


    override fun call(r: RT): R {
        r.env.checkAccessRight()
        return stack.call(r)
    }

    fun canBeCalled(env: PlatypusEnvironment): Boolean {
        return env.sudoUser == ROOT_USER || methodGroups.isEmpty() || env.sudoUser.groups.containsAll(methodGroups)
    }

    private fun PlatypusEnvironment.checkAccessRight() {
        if (!canBeCalled(this)) {
            println(methodGroups)
            throw PlatypusForbiddenActionGroup(methodName)
        }
    }

    internal fun hardCall(r: Environmentable?): R {
        return call(r as RT)
    }

    private fun createStackSuperFun(stack: LinkedList<EXT.(RT) -> R>)
            : ApiNoParam<RT, M, R> {
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

    abstract fun createApiNoParamOriginal(function: (RT) -> R): OT

    abstract fun createApiNoParamExtends(function: EXT.(RT) -> R, superStack: ApiNoParam<RT, M, R>): EXT

    internal open fun addExtend(extendFunction: EXT.(RT) -> R) {
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