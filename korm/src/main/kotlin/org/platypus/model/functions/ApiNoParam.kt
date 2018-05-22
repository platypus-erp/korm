package org.platypus.model.functions

import io.ktor.http.HttpMethod
import org.platypus.Environmentable
import org.platypus.PlatypusEnvironment
import org.platypus.exceptions.PlatypusForbiddenActionGroup
import org.platypus.model.IModel
import org.platypus.module.base.entities.groups
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
    private var methodGroups: Set<Int> = emptySet()
//    private val groupsStack = HashSet<GroupData.() -> Bag<GroupsData>>()


    override fun call(r: RT): R {
        r.env.checkAccessRight()
        return stack.call(r)
    }

    fun canBeCalled(env: PlatypusEnvironment): Boolean {
        if (env.sudoUser.externalRef == env.conf.adminUserRef) {
            return true
        }
//        if (methodGroups.isEmpty() && groupsStack.isEmpty()) {
//            return true
//        }
//        if (methodGroups.isEmpty() && groupsStack.isNotEmpty()) {
//            val tmpMethodGroups = HashSet<Int>()
//            for (s in groupsStack) {
//                tmpMethodGroups.addAll(s.invoke(env.groupsRepo.datas).ids)
//            }
//            methodGroups = HashSet(tmpMethodGroups)
//        }
        return env.sudoUser.groups.ids.any { it in methodGroups }
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

//    fun M.addGroupsAccess(groups: GroupData.() -> Bag<GroupsData>) {
//        println("AddGroup ${this@ApiNoParamStacker}")
//        groupsStack.add(groups)
//    }
}