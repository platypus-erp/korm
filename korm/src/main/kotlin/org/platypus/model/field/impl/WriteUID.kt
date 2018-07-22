package org.platypus.model.field.impl

import org.platypus.model.IModel
import org.platypus.model.field.api.FieldSlotsImpl
import org.platypus.model.field.api.FieldVisitor
import org.platypus.model.field.api.type.Many2OneFieldType
import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.module.base.models.Users
import org.platypus.orm.ReferenceOption
import org.platypus.orm.sql.expression.ExpressionVisitor

class WriteUID<M: IModel<M>>(model: M)
    : ReferenceField<M, Users>(model, "write_uid", FieldSlotsImpl(readonly = true, copy = false), ReferenceOption.RESTRICT, null) {

    override val required: Boolean = false

    override val store: Boolean = true

    override val type: SqlFieldType by lazy { Many2OneFieldType(true, Users) }

    override val target: Users
        get() = Users

    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}