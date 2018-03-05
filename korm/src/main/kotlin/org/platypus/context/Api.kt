package org.platypus.context

import org.platypus.model.field.api.ModelField

interface ContextKey<T : Any?> {
    val default: T
    val name: String
    infix fun of(value: T): ContextKey.Value<T>

    data class Value<T : Any?>(val key: ContextKey<T>, val value: T)
}

fun newContext(vararg ctx: ContextKey.Value<*>): PlatypusContext {
    return PlatypusContext(ctx.associate { it.key to it.value })
}

infix fun <T1 : Any> ModelField<*, T1>.withDefault(value: T1):ContextKey.Value<T1> = DefaultKeyContextNonNull(this, value).of(value)