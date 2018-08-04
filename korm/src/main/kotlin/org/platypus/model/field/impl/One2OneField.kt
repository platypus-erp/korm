package org.platypus.model.field.impl

import org.platypus.entity.Record
import org.platypus.model.IModel
import org.platypus.model.ReferenceModel
import org.platypus.model.field.api.FieldSlotsImpl
import org.platypus.model.field.api.FieldVisitor
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.api.MutableFieldSlots
import org.platypus.model.field.api.MutableFieldSlotsImpl
import org.platypus.model.field.api.type.One2OneFieldType
import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.orm.OrmConstraint
import org.platypus.orm.ReferenceOption
import org.platypus.orm.sql.expression.ExpressionVisitor
import org.platypus.orm.sql.expression.TypedExpression
import org.platypus.orm.sql.predicate.PredicateField

class One2OneField<
        M : IModel<M>,
        TM : IModel<TM>
        >
(
        name: String,
        model: M,
        private val privateTarget: TM,
        slots: FieldSlotsImpl<Record<TM>>,
        defaultOnDelete: ReferenceOption?,
        defaultDomain: (TM.() -> PredicateField)?
) : ReferenceField<M, TM>(model, name, slots, defaultOnDelete, defaultDomain) {

    init {
        ReferenceModel.referencedBy(target, this)
    }

    override val unique: Boolean = true

    override val target: TM
        get() = privateTarget
    val targetRevOneToOne: RevOne2OneField<TM, M>? by lazy {
        target.fields.firstOrNull { it.accept(InverseOneToOneTarget, this) } as RevOne2OneField<TM, M>?
    }

    internal fun merge(f: Builder<M, TM>) {
        this.domain = f.domain ?: this.domain
        this.onDelete = f.onDelete ?: this.onDelete
        this.slots.merge(f)
    }

    override val type: SqlFieldType
        get() = One2OneFieldType(required)


    fun asExpr(): TypedExpression<Int> = IntField(this.fieldName, this.model, FieldSlotsImpl())

    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)

    class Builder<
            M : IModel<M>,
            TM : IModel<TM>>
    private constructor(
            val model: M,
            val fieldName: String,
            val target: TM,
            slots: MutableFieldSlots<Record<TM>>
    ) : ModelField.Builder<M, One2OneField<M, TM>>, MutableFieldSlots<Record<TM>> by slots {
        constructor(model: M, fieldName: String, target: TM) : this(model, fieldName, target, MutableFieldSlotsImpl())

        var onDelete: ReferenceOption? = null
        var domain: (TM.() -> PredicateField)? = null

        fun add(constraint: OrmConstraint<Record<TM>>) {
            throw UnsupportedOperationException()
        }

        override fun build(): One2OneField<M, TM> {
            return One2OneField(fieldName, model, target, toSlots(), onDelete, domain)
        }
    }
}


