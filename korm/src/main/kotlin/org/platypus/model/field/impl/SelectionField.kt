package org.platypus.model.field.impl

import org.platypus.entity.Selection
import org.platypus.entity.SelectionValue
import org.platypus.model.Model
import org.platypus.model.field.api.FieldSlotsImpl
import org.platypus.model.field.api.FieldVisitor
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.api.MutableFieldSlots
import org.platypus.model.field.api.MutableFieldSlotsImpl
import org.platypus.model.field.api.type.SelectionFieldType
import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.orm.OrmConstraint
import org.platypus.orm.sql.expression.ExpressionVisitor

class SelectionField<M : Model<M>, D : Selection<D>>(
        name: String, model: M, val selection: D, slots: FieldSlotsImpl<SelectionValue<D>>
) : SimpleField<M, SelectionValue<D>>(model, name, slots) {

    override val type: SqlFieldType
        get() = SelectionFieldType(required)

    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)

    fun extends(ext: SelectionField.Builder<M, D>.() -> Unit) {
        val f = SelectionField.Builder(this@SelectionField.model, this@SelectionField.fieldName, this@SelectionField.selection)
        f.ext()
        this@SelectionField.slots.merge(f)
    }

    class Builder<M : Model<M>, D : Selection<D>>
    private constructor(val model: M, val fieldName: String, val selection: D, private val slots: MutableFieldSlotsImpl<SelectionValue<D>>)
        : ModelField.Builder<M, SelectionField<M, D>>, MutableFieldSlots<SelectionValue<D>> by slots {
        constructor(model: M, fieldName: String, selection: D) : this(model, fieldName, selection, MutableFieldSlotsImpl())

        fun add(constraint: OrmConstraint<SelectionValue<D>>) {
            slots.constraint.add(constraint)
        }

        override fun build(): SelectionField<M, D> {
            return SelectionField(fieldName, model, selection, slots.toSlots())
        }
    }
}




