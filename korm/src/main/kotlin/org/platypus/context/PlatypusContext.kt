package org.platypus.context


class PlatypusContext(initialContext: Map<ContextKey<*>, Any?> = emptyMap()) {
    private val context = HashMap(initialContext)

    operator fun contains(key: ContextKey<*>): Boolean = key in context

    operator fun <T : Any> get(key: ContextKey<T>): T {
        @Suppress("UNCHECKED_CAST")
        return context[key] as T? ?: key.default
    }

    fun copy(newCtx: Array<out ContextKey.Value<*>> = emptyArray()): PlatypusContext {
        val copy = PlatypusContext(this.context)
        for ((k, v) in newCtx) {
            context[k] = v
        }
        return copy
    }
}