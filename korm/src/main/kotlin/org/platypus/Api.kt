package org.platypus

import org.platypus.context.ContextKey
import org.platypus.context.PlatypusContext
import org.platypus.security.PlatypusUser
import org.platypus.security.ROOT_USER

interface Identifiable {
    val id: Int
}

interface TypedCloneable<T> : Cloneable {
    fun typedClone(): T
    override fun clone(): Any = typedClone() as Any
}

interface Mergable<M : Mergable<M>> {

    /**
     * Merge two object of the same type
     * The return object object can be [this] or a new instance
     * see the doc of the impl to be sure
     */
    fun merge(other: M): M
}

interface Namable {
    val name: String
}

interface Environmentable {
    val env: PlatypusEnvironment
}

interface ContextAble<out T> {
    fun withContext(vararg vals: ContextKey.Value<*>): T
}

interface SudoAble<out T> {
    fun sudo(user: PlatypusUser = ROOT_USER): T
}

interface Validatable<T> {
    fun validate(value: T): Set<String>
}

interface ValidatableNullable<in T> {
    fun validateNullable(value: T): Set<String>
}

interface EnvironementFactory {

    fun newEnv(user: PlatypusUser? = null, ctx: PlatypusContext? = null): PlatypusEnvironment

    fun newReadOnlyEnv(user: PlatypusUser? = null, ctx: PlatypusContext? = null): ReadOnlyPlatypusEnvironment

    fun newFakeEnv(user: PlatypusUser? = null, ctx: PlatypusContext? = null): PlatypusEnvironment
}