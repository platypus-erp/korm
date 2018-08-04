package org.platypus.model.field.impl

import org.platypus.model.IModel
import org.platypus.model.field.api.FieldSlotsImpl
import org.platypus.model.field.api.FieldVisitor
import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.model.field.api.type.StringSqlFieldType
import org.platypus.orm.sql.expression.ExpressionVisitor
import java.util.*
import kotlin.math.absoluteValue

class ExternalRefModelField<M: IModel<M>>(model: M)
    : RealModelField<M, String>(model, "external_ref", FieldSlotsImpl(readonly = true, copy = false, required = true, defaultValueFun = { "${model.tableName}_${Random().nextInt().absoluteValue}" }, store = true)) {

    override val store: Boolean
        get() {
            return true
        }

    override val type: SqlFieldType = StringSqlFieldType(required)
    var length: Int = 50
        private set

    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}