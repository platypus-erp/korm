package org.platypus.model.field.impl

import org.platypus.DecimalPrecision
import org.platypus.model.IModel
import org.platypus.model.field.api.FieldSlotsImpl
import org.platypus.model.field.api.FieldVisitor
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.api.MutableFieldSlots
import org.platypus.model.field.api.MutableFieldSlotsImpl
import org.platypus.model.field.api.type.DecimalSqlFieldType
import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.orm.OrmConstraint
import org.platypus.orm.sql.expression.ExpressionVisitor
import java.math.BigDecimal

class DecimalField<M : IModel<M>>(
        name: String, model: M, slots: FieldSlotsImpl<BigDecimal>, defaultPrecision: DecimalPrecision?
) : SimpleField<M, BigDecimal>(model, name, slots) {


    var precision: DecimalPrecision = defaultPrecision ?: DecimalPrecision()
        private set

    override val type: SqlFieldType
        get() = DecimalSqlFieldType(required, precision.precision, precision.scale)

    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)

    internal fun merge(f: Builder<M>) {
        this.precision = f.precision ?: this.precision
        this.slots.merge(f)
    }

    class Builder<M : IModel<M>>
    private constructor(val model: M, val fieldName: String, private val slots: MutableFieldSlotsImpl<BigDecimal>)
        : ModelField.Builder<M, DecimalField<M>>, MutableFieldSlots<BigDecimal> by slots {
        constructor(model: M, fieldName: String) : this(model, fieldName, MutableFieldSlotsImpl())

        var precision: DecimalPrecision? = null
        fun add(constraint: OrmConstraint<BigDecimal>) {
            slots.constraint.add(constraint)
        }

        override fun build(): DecimalField<M> {
            return DecimalField(fieldName, model, toSlots(), precision)
        }
    }
}




