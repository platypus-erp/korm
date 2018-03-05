package org.platypus

import org.platypus.context.ContextKey

interface ContextAble<out T>{
    fun withContext(vararg vals: ContextKey.Value<*>):T
}