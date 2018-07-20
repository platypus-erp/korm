package org.platypus.model.field.impl

import org.platypus.model.IModel
import org.platypus.model.field.api.FieldSlotsImpl
import org.platypus.model.field.api.FieldVisitor
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.api.MutableFieldSlots
import org.platypus.model.field.api.MutableFieldSlotsImpl
import org.platypus.model.field.api.type.IntegerSqlFieldType
import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.orm.OrmConstraint
import org.platypus.orm.sql.expression.ExpressionVisitor

class IntField<M : IModel<M>>(
        name: String, model: M, slots: FieldSlotsImpl<Int>
) : SimpleField<M, Int>(model, name, slots) {
    override val type: SqlFieldType
        get() = IntegerSqlFieldType(required)

    internal fun merge(f: Builder<M>) {
        this.slots.merge(f)
    }

    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)

    class Builder<M : IModel<M>>
    private constructor(val model: M, val fieldName: String, private val slots: MutableFieldSlotsImpl<Int>)
        : ModelField.Builder<M, IntField<M>>, MutableFieldSlots<Int> by slots {
        constructor(model: M, fieldName: String) : this(model, fieldName, MutableFieldSlotsImpl())

        fun add(constraint: OrmConstraint<Int>) {
            slots.constraint.add(constraint)
        }

        override fun build(): IntField<M> {
            return IntField(fieldName, model, toSlots())
        }
    }
}




