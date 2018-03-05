package org.platypus.context

import org.platypus.model.field.api.ModelField

class ContextKeyNonNull<T : Any>(override val name: String, override val default: T) : ContextKey<T> {
    override fun of(value: T) = ContextKey.Value(this, value)
}

class DefaultKeyContextNonNull<T : Any>(field: ModelField<*, T>, override val default: T) : ContextKey<T> {
    override val name: String = "default_${field.completeName}"

    override fun of(value: T) = ContextKey.Value(this, value)
}

class DefaultKeyContextNull<T : Any>(field: ModelField<*, T>, override val default: T?) : ContextKey<T?> {
    override val name: String = "default_${field.completeName}"

    override fun of(value: T?) = ContextKey.Value(this, value)
}

class ContextKeyNull<T : Any?>(override val name: String) : ContextKey<T?> {
    override val default: T? = null
    override fun of(value: T?) = ContextKey.Value(this, value)
}