package org.platypus.model.field.impl

import org.platypus.model.Alias
import org.platypus.model.Model
import org.platypus.model.field.api.FieldVisitor
import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.orm.sql.expression.ExpressionVisitor

class FieldAlias<M : Model<M>, T : Any>(val delegate: RealModelField<M, T>, val newModel: Alias<M>) :
        RealModelField<M, T>(delegate.model, delegate.fieldName, delegate.slots) {


    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN =
            visitor.visit(this, p)

    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN =
            visitor.visit(this, param)

    override val type: SqlFieldType
        get() = delegate.type
}
