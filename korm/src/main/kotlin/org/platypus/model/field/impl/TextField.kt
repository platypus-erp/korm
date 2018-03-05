package org.platypus.model.field.impl

import org.platypus.model.IModel
import org.platypus.model.Model
import org.platypus.model.field.api.FieldSlotsImpl
import org.platypus.model.field.api.FieldVisitor
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.api.MutableFieldSlots
import org.platypus.model.field.api.MutableFieldSlotsImpl
import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.model.field.api.type.StringSqlFieldType
import org.platypus.orm.OrmConstraint
import org.platypus.orm.sql.expression.ExpressionVisitor

class TextField<M : Model<M>>(
        name: String, model: M, slots: FieldSlotsImpl<String>
) : SimpleField<M, String>(model, name, slots) {

    override val type: SqlFieldType
        get() = StringSqlFieldType(required)

    internal fun merge(f: Builder<M>) {
        this.slots.merge(f)
    }

    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)

    class Builder<M : Model<M>>
    private constructor(val model: M, val fieldName: String, private val slots: MutableFieldSlotsImpl<String>)
        : ModelField.Builder<M, TextField<M>>, MutableFieldSlots<String> by slots {
        constructor(model: M, fieldName: String) : this(model, fieldName, MutableFieldSlotsImpl())

        fun add(constraint: OrmConstraint<String>) {
            slots.constraint.add(constraint)
        }

        override fun build(): TextField<M> {
            return TextField(fieldName, model, toSlots())
        }
    }
}



