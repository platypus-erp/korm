package org.platypus.model.field.impl

import org.platypus.bag.Bag
import org.platypus.model.IModel
import org.platypus.model.field.api.FieldSlotsImpl
import org.platypus.model.field.api.FieldVisitor
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.api.MutableFieldSlots
import org.platypus.model.field.api.MutableFieldSlotsImpl
import org.platypus.model.field.api.type.One2ManyFieldType
import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.orm.OrmConstraint
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.expression.ExpressionVisitor

class One2ManyField<
        M : IModel<M>,
        TM : IModel<TM>>
(
        name: String,
        model: M,
        val targetField: () -> Many2OneField<TM, M>,
        slots: FieldSlotsImpl<Bag<TM>>,
        defaultDomain: (TM.() -> Expression<Boolean>)?
) : MutliReferenceField<M, TM>(model, name, slots, defaultDomain) {

    override val store: Boolean = false

    override val type: SqlFieldType
        get() = One2ManyFieldType(required)

    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)

    internal fun merge(f: Builder<M, TM>) {
        this.domain = f.domain ?: this.domain
        this.slots.merge(f)
    }

    class Builder<M : IModel<M>, TM : IModel<TM>> private constructor(
            val model: M,
            val fieldName: String,
            val targetField: () -> Many2OneField<TM, M>,
            private val slots: MutableFieldSlotsImpl<Bag<TM>>
    ) : ModelField.Builder<M, One2ManyField<M, TM>>, MutableFieldSlots<Bag<TM>> by slots {
        constructor(model: M, fieldName: String, targetField: () -> Many2OneField<TM, M>) : this(model, fieldName, targetField, MutableFieldSlotsImpl())

        val domain: (TM.() -> Expression<Boolean>)? = null

        fun add(constraint: OrmConstraint<Bag<TM>>) {
            slots.constraint.add(constraint)
        }

        override fun build(): One2ManyField<M, TM> {
            return One2ManyField(fieldName, model, targetField, toSlots(), domain)
        }
    }
}


