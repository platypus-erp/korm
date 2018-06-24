package org.platypus.model.field.impl

import org.platypus.entity.Record
import org.platypus.model.IModel
import org.platypus.model.Model
import org.platypus.model.ReferenceModel
import org.platypus.model.field.api.FieldSlots
import org.platypus.model.field.api.FieldSlotsImpl
import org.platypus.model.field.api.FieldVisitor
import org.platypus.model.field.api.IModelField
import org.platypus.model.field.api.ReferencedField
import org.platypus.model.field.api.comparatorField
import org.platypus.model.field.api.type.Many2OneFieldType
import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.orm.ReferenceOption
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.expression.ExpressionVisitor
import org.platypus.orm.sql.expression.FieldExpression


class Many2OneFieldLink<M : IModel<M>, TM : Model<TM>>(
        name: String,
        override val model: M,
        override val target: TM,
        defaultOnDelete: ReferenceOption,
        defaultDomain: (TM.() -> Expression<Boolean>)?
) : IModelField<M, Record<TM>>,
        FieldSlots<Record<TM>> by FieldSlotsImpl("ID", readonly = true, copy = false, store = true, required = true),
        FieldExpression<Record<TM>>, ReferencedField<M,  TM> {

    override fun compare(o1: Record<TM>?, o2: Record<TM>?): Int {
        TODO("not implemented")
    }

    override fun compareTo(other: IModelField<*, *>): Int = comparatorField.compare(this, other)

    override val fieldName: String = name

    override val onDelete = defaultOnDelete

    override val type: SqlFieldType = Many2OneFieldType(true, target)

    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)

    init {
        ReferenceModel.referencedBy(target, this)
    }
}

