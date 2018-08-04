package org.platypus.model.field.api

import org.platypus.model.IModel
import org.platypus.orm.PersistenceDialect
import org.platypus.orm.sql.expression.TypedExpression

interface IModelField<M : IModel<M>, T : Any> :
        Comparable<IModelField<*, *>>,
        FieldSlots<T>,
        TypedExpression<T>,
        ValidatableValue<T>, Comparator<T>,
        ValidatableValueThrow<T> {
    val model: M
    val fieldName: String

    val completeName: String
        get() = "${model.modelName}.$fieldName"

    fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN

    fun anyToType(value: Any): T = value as T

    fun describeDML(dialect: PersistenceDialect): String = ""
    fun describeDDL(env: PersistenceDialect): String = ""

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