package org.platypus.model.field.impl

import org.platypus.model.IModel
import org.platypus.model.field.api.FieldSlots
import org.platypus.model.field.api.FieldSlotsImpl
import org.platypus.model.field.api.FieldVisitor
import org.platypus.model.field.api.IModelField
import org.platypus.model.field.api.comparatorField
import org.platypus.model.field.api.type.PKFieldType
import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.expression.ExpressionVisitor
import org.platypus.orm.sql.expression.FieldExpression

class PKModelField<M : IModel<M>>(override val model: M) :
        IModelField<M, Int>,
        FieldSlots<Int> by FieldSlotsImpl("ID", readonly = true, copy = false, store = true),
        FieldExpression<Int>,
        Expression<Int> {

    override fun compare(o1: Int?, o2: Int?): Int {
        TODO("not implemented")
    }

    override fun compareTo(other: IModelField<*, *>): Int = comparatorField.compare(this, other)

    override val fieldName: String
        get() = "id"

    override val type: SqlFieldType = PKFieldType()

    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)

}