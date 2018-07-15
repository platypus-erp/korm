package org.platypus.orm.sql.visitor

import org.platypus.model.field.impl.PKModelField
import org.platypus.visitor.ExpressionVisitorPredicate

object IdPkVisitor : ExpressionVisitorPredicate<Any?>{
    override fun visit(field: PKModelField<*>, p: Any?): Boolean = true
}