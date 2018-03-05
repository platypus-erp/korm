package org.platypus.model.field.impl

import org.platypus.entity.PlatypusSelection
import org.platypus.entity.PlatypusSelectionCompanion
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

class SelectionField<M : Model<M>, D : PlatypusSelection<M>>(
        name: String, model: M, val selection: PlatypusSelectionCompanion<M, D>, slots: FieldSlotsImpl<D>
) : SimpleField<M, D>(model, name, slots) {

    override val type: SqlFieldType
        get() = SelectionFieldType(required)

    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)

    fun extends(ext: SelectionField.Builder<M, D>.() -> Unit) {
        val f = SelectionField.Builder(this@SelectionField.model, this@SelectionField.fieldName, this@SelectionField.selection)
        f.ext()
        this@SelectionField.slots.merge(f)
    }

    class Builder<M : Model<M>, D : PlatypusSelection<M>>
    private constructor(val model: M, val fieldName: String, val selection: PlatypusSelectionCompanion<M, D>, private val slots: MutableFieldSlotsImpl<D>)
        : ModelField.Builder<M, SelectionField<M, D>>, MutableFieldSlots<D> by slots {
        constructor(model: M, fieldName: String, selection: PlatypusSelectionCompanion<M, D>) : this(model, fieldName, selection, MutableFieldSlotsImpl())

        fun add(constraint: OrmConstraint<D>) {
            slots.constraint.add(constraint)
        }

        override fun build(): SelectionField<M, D> {
            return SelectionField(fieldName, model, selection, slots.toSlots())
        }
    }
}




