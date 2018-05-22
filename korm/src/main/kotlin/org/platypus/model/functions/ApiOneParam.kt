package org.platypus.model.functions

import org.platypus.Environmentable
import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.exceptions.PlatypusForbiddenAction
import org.platypus.model.IModel
import org.platypus.security.GroupData
import org.platypus.module.base.entities.groups
import org.platypus.security.groupsRepo
import org.platypus.module.base.models.GroupsData
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
    private var methodGroups: Set<Int> = emptySet()
    private val groupsStack = HashSet<GroupData.() -> Bag<GroupsData>>()

    override fun call(r: RT, param: P): R {
        r.env.checkAccessRight()
        return stack.call(r, param)
    }

    internal fun hardCall(r: Any?, param: Any?): R {
        return stack.call(r as RT, param as P)
    }

    fun canBeCalled(env: PlatypusEnvironment): Boolean {
        if (env.sudoUser.externalRef == env.conf.adminUserRef){
            return true
        }
        if (methodGroups.isEmpty() && groupsStack.isEmpty()){
            return true
        }
        if (methodGroups.isEmpty() && groupsStack.isNotEmpty()) {
            val tmpMethodGroups = HashSet<Int>()
            for (s in groupsStack) {
                tmpMethodGroups.addAll(s.invoke(env.groupsRepo.datas).ids)
            }
            methodGroups = HashSet(tmpMethodGroups)
        }
        return env.envUser.groups.ids.any { it in methodGroups }
    }

    private fun PlatypusEnvironment.checkAccessRight(){
        println("$methodName $groupsStack $methodGroups")
        if (!canBeCalled(this)){
            println(methodGroups)
            throw PlatypusForbiddenAction(methodName)
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

    fun M.addGroupsAccess(groups: GroupData.() -> Bag<GroupsData>) {
        groupsStack.add(groups)
    }
}