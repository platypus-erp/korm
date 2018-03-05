package org.platypus.model.field.impl

import org.platypus.model.Model
import org.platypus.model.field.api.FieldSlotsImpl
import org.platypus.model.field.api.FieldVisitor
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.api.MutableFieldSlots
import org.platypus.model.field.api.MutableFieldSlotsImpl
import org.platypus.model.field.api.type.DateSqlFieldType
import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.orm.OrmConstraint
import org.platypus.orm.sql.expression.ExpressionVisitor
import java.time.LocalDate

class DateField<M : Model<M>>(
        name: String, model: M, slots: FieldSlotsImpl<LocalDate>
) : SimpleField<M, LocalDate>(model, name, slots) {

    override val type: SqlFieldType
        get() = DateSqlFieldType(required)

    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)

    internal fun merge(f: Builder<M>) {
        this.slots.merge(f)
    }

    class Builder<M : Model<M>>
    private constructor(val model: M, val fieldName: String, private val slots: MutableFieldSlotsImpl<LocalDate>)
        : ModelField.Builder<M, DateField<M>>, MutableFieldSlots<LocalDate> by slots {
        constructor(model: M, fieldName: String) : this(model, fieldName, MutableFieldSlotsImpl())

        fun add(constraint: OrmConstraint<LocalDate>) {
            slots.constraint.add(constraint)
        }

        override fun build(): DateField<M> {
            return DateField(fieldName, model, toSlots())
        }
    }
}



