package org.platypus.model.field.impl

import org.platypus.entity.Record
import org.platypus.model.Model
import org.platypus.model.field.api.FieldSlotsImpl
import org.platypus.model.field.api.FieldVisitor
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.api.MutableFieldSlots
import org.platypus.model.field.api.MutableFieldSlotsImpl
import org.platypus.model.field.api.type.RevOne2OneFieldType
import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.orm.OrmConstraint
import org.platypus.orm.ReferenceOption
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.expression.ExpressionVisitor
import org.platypus.orm.sql.expression.TypedExpression


class RevOne2OneField<
        M : Model<M>,
        TM : Model<TM>
        >
(
        name: String,
        model: M,
        val targetField: () -> One2OneField<TM, M>,
        slots: FieldSlotsImpl<Record<TM>>,
        defaultOnDelete: ReferenceOption?,
        defaultDomain: (() -> Expression<Boolean>)?
) : ModelField<M, Record<TM>>(model, name, slots) {

    override val store: Boolean = false
    var domain: (() -> Expression<Boolean>)? = defaultDomain
        private set

    var onDelete: ReferenceOption = defaultOnDelete ?: ReferenceOption.SET_NULL
        private set

    internal fun merge(f: Builder<M, TM>) {
        this.domain = f.domain ?: this.domain
        this.onDelete = f.onDelete ?: this.onDelete
        this.slots.merge(f)
    }

    override val type: SqlFieldType
        get() = RevOne2OneFieldType(required)


    fun asExpr(): TypedExpression<Int> = IntField(this.fieldName, this.model, FieldSlotsImpl())

    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)

    class Builder<
            M : Model<M>,
            TM : Model<TM>>
    private constructor(
            val model: M,
            val fieldName: String,
            val targetField: () -> One2OneField<TM, M>,
            slots: MutableFieldSlots<Record<TM>>
    ) : ModelField.Builder<M, RevOne2OneField<M, TM>>, MutableFieldSlots<Record<TM>> by slots {
        constructor(model: M, fieldName: String, targetField: () -> One2OneField<TM, M>) : this(model, fieldName, targetField, MutableFieldSlotsImpl())

        var onDelete: ReferenceOption? = null
        var domain: (() -> Expression<Boolean>)? = null

        fun add(constraint: OrmConstraint<Record<TM>>) {
            throw UnsupportedOperationException()
        }

        override fun build(): RevOne2OneField<M, TM> {
            return RevOne2OneField(fieldName, model, targetField, toSlots(), onDelete, domain)
        }
    }
}

