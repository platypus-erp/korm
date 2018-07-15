package org.platypus.model.field.impl

import org.platypus.model.Alias
import org.platypus.model.IModel
import org.platypus.model.field.api.FieldVisitor
import org.platypus.model.field.api.IModelField
import org.platypus.orm.sql.expression.ExpressionVisitor

class FieldAlias<M : IModel<M>, T : Any>(
        val delegate: IModelField<M, T>,
        val newModel: Alias<M>
) : IModelField<M, T> by delegate {


    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN =
            visitor.visit(this, p)

    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN =
            visitor.visit(this, param)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as FieldAlias<*, *>

        if (delegate != other.delegate) return false
        if (newModel != other.newModel) return false

        return true
    }

    override fun hashCode(): Int {
        var result = delegate.hashCode()
        result = 31 * result + newModel.hashCode()
        return result
    }


}
