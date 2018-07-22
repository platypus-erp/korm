package org.platypus.model.field.impl

import org.platypus.model.IModel
import org.platypus.model.field.api.FieldSlotsImpl
import org.platypus.model.field.api.FieldVisitor
import org.platypus.model.field.api.type.DateTimeSqlFieldType
import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.orm.sql.expression.ExpressionVisitor

class ArchivedModelField<M: IModel<M>>(model: M)
    : RealModelField<M, Boolean>(model, "archived", FieldSlotsImpl(readonly = true, copy = false, required = true, default = false)) {

    override var store: Boolean = false
        private set

    fun enable() {
        this@ArchivedModelField.store = true
    }

    fun disable() {
        this@ArchivedModelField.store = false
    }

    override val type: SqlFieldType = DateTimeSqlFieldType(required)

    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}