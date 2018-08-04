package org.platypus.model.field.n.api

import org.platypus.model.IModel
import org.platypus.model.field.api.FieldSlots
import org.platypus.model.field.api.IModelField
import org.platypus.model.field.api.ValidatableValue
import org.platypus.model.field.api.ValidatableValueThrow
import org.platypus.model.field.api.ValidateException

interface BaseField<M : IModel<M>, T : Any> :
        Comparable<IModelField<*, *>>,
        FieldSlots<T>,
        ValidatableValue<T>,
        ValidatableValueThrow<T> {
    val model: M
    val fieldName: String


//    fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN

    fun anyToType(value: Any): T = value as T

    private val completeName
        get() = "$model.$fieldName"

    fun validateUnsafe(value: Any?): Set<String> {
        val errors = HashSet<String>()
        if (value == null) {
            if (required) {
                errors.add("The field $completeName can't be null")
            }
        } else {
            errors.addAll(constraint.flatMap { it.validate(anyToType(value)) })
        }
        return errors
    }

    override fun validateNullable(value: T?): Set<String> {
        val errors = HashSet<String>()
        if (value == null) {
            if (required) {
                errors.add("The field $completeName can't be null")
            }
        } else {
            errors.addAll(constraint.flatMap { it.validate(value) })
        }
        return errors
    }

    override fun validateAndThrow(value: T?) {
        val res = this.validateUnsafe(value)
        if (res.isNotEmpty()) {
            throw ValidateException(res)
        }
    }
}