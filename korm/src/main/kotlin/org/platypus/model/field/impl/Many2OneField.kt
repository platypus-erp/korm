package org.platypus.model.field.impl

import org.platypus.entity.Record
import org.platypus.model.Model
import org.platypus.model.ReferenceModel
import org.platypus.model.field.api.FieldSlotsImpl
import org.platypus.model.field.api.FieldVisitor
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.api.MutableFieldSlots
import org.platypus.model.field.api.MutableFieldSlotsImpl
import org.platypus.model.field.api.type.Many2OneFieldType
import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.orm.OrmConstraint
import org.platypus.orm.ReferenceOption
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.expression.ExpressionVisitor
import org.platypus.orm.sql.expression.TypedExpression


class Many2OneField<
        M : Model<M>,
        TM : Model<TM>
        >
(
        name: String,
        model: M,
        private val privateTarget: TM,
        slots: FieldSlotsImpl<Record<TM>>,
        defaultOnDelete: ReferenceOption?,
        defaultDomain: (TM.() -> Expression<Boolean>)?
) : ReferenceField<M, TM>(model, name, slots, defaultOnDelete, defaultDomain) {

    init {
        ReferenceModel.referencedBy(target, this)
    }

    override val target: TM
        get() = privateTarget
    val targetOneToMany: One2ManyField<TM, M>? by lazy {
        target.fields.firstOrNull { it.accept(OneToManyTarget, this) } as One2ManyField<TM, M>?
    }

    override val type: SqlFieldType
        get() = Many2OneFieldType(required)


    fun asExpr(): TypedExpression<Int> = IntField(this.fieldName, this.model, FieldSlotsImpl())

    internal fun merge(f: Builder<M, TM>) {
        this.onDelete = f.onDelete ?: this.onDelete
        this.domain = f.domain ?: this.domain
        this.slots.merge(f)
    }

    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)

    class Builder<
            M : Model<M>,
            TM : Model<TM>>
    private constructor(
            val model: M,
            val fieldName: String,
            val target: TM,
            slots: MutableFieldSlots<Record<TM>>
    ) : ModelField.Builder<M, Many2OneField<M, TM>>, MutableFieldSlots<Record<TM>> by slots {
        constructor(model: M, fieldName: String, target: TM) : this(model, fieldName, target, MutableFieldSlotsImpl())

        var onDelete: ReferenceOption? = null
        var domain: (TM.() -> Expression<Boolean>)? = null

        fun add(constraint: OrmConstraint<Record<TM>>) {
            throw UnsupportedOperationException()
        }

        override fun build(): Many2OneField<M, TM> {
            return Many2OneField(fieldName, model, target, toSlots(), onDelete, domain)
        }
    }
}
