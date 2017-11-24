package org.platypus.api.context


interface ContextKey<T : Any?> {
    val default: T
    val name: String
    infix fun of(value: T): KeyContextValue<T>
}

class ContextKeyNonNull<T : Any>(override val name: String, override val default: T) : ContextKey<T> {
    override fun of(value: T) = KeyContextValue(this, value)
}

class ContextKeyNull<T : Any?>(override val name: String) : ContextKey<T?> {
    override val default: T? = null
    override fun of(value: T?) = KeyContextValue(this, value)
}

data class KeyContextValue<T : Any?>(val key: ContextKey<T>, val value: T)

val throwError = ContextKeyNonNull("throwError", false)

class PlatypusContext(newCtx: Array<out KeyContextValue<*>> = emptyArray()) {
    private val context = HashMap<ContextKey<*>, Any?>()

    init {
        for ((k, v) in newCtx) {
            context[k] = v
        }
    }


    operator fun <T : Any?> get(key: ContextKey<T>): T {
        @Suppress("UNCHECKED_CAST")
        return context[key] as T? ?: key.default
    }

    operator fun <T : Any?> set(key: ContextKey<T>, value: T) {
        @Suppress("UNCHECKED_CAST")
        context[key] = value
    }

    internal fun copy(): PlatypusContext {
        val copy = PlatypusContext()
        @Suppress("UNCHECKED_CAST")
        copy.context.clear()
        copy.context.putAll(this.context.clone() as HashMap<ContextKey<*>, Any?>)
        return copy
    }

    fun update(ctx: PlatypusContext): PlatypusContext {
        this.context.putAll(ctx.context)
        return this
    }
}
