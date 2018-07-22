package org.platypus.model.field.impl

import org.platypus.model.IModel
import org.platypus.model.field.api.FieldSlotsImpl
import org.platypus.model.field.api.FieldVisitor
import org.platypus.model.field.api.type.DateTimeSqlFieldType
import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.orm.sql.expression.ExpressionVisitor
import java.time.LocalDateTime

class WriteDateModelField<M: IModel<M>>(model: M)
    : RealModelField<M, LocalDateTime>(model, "write_date", FieldSlotsImpl(readonly = true, copy = false, default = LocalDateTime.now())) {

    override val store: Boolean
        get() {
            return model.slots.type in needCommonField
        }

    override val required: Boolean = false

    override val type: SqlFieldType = DateTimeSqlFieldType(false)

    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}