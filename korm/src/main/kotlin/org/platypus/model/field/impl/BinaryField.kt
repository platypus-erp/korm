package org.platypus.model.field.impl

import org.platypus.model.IModel
import org.platypus.model.field.api.FieldSlotsImpl
import org.platypus.model.field.api.FieldVisitor
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.api.MutableFieldSlots
import org.platypus.model.field.api.MutableFieldSlotsImpl
import org.platypus.model.field.api.type.BinarySqlFieldType
import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.orm.OrmConstraint
import org.platypus.orm.sql.expression.ExpressionVisitor

class BinaryField<M : IModel<M>>(
        name: String, model: M, slots: FieldSlotsImpl<ByteArray>
) : RealModelField<M, ByteArray>(model, name, slots) {
    override val type: SqlFieldType
        get() = BinarySqlFieldType(required)

    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)

    internal fun merge(f: Builder<M>) {
        this.slots.merge(f)
    }

    class Builder<M : IModel<M>>
    private constructor(val model: M, val fieldName: String, private val slots: MutableFieldSlotsImpl<ByteArray>)
        : ModelField.Builder<M, BinaryField<M>>, MutableFieldSlots<ByteArray> by slots {
        constructor(model: M, fieldName: String) : this(model, fieldName, MutableFieldSlotsImpl())

        var attachement: Boolean? = null
        fun add(constraint: OrmConstraint<ByteArray>) {
            slots.constraint.add(constraint)
        }

        override fun build(): BinaryField<M> {
            return BinaryField(fieldName, model, toSlots())
        }
    }
}




