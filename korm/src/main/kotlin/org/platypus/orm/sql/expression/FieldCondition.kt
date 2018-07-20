package org.platypus.orm.sql.expression

import org.platypus.model.IModel
import org.platypus.model.field.api.ReferencedField
import org.platypus.model.field.impl.PKModelField
import org.platypus.orm.sql.predicate.EqOp

infix fun <M : IModel<M>, TM : IModel<TM>> ReferencedField<M, TM>.eq(t: Int?): Expression<Boolean> {
    if (t == null) {
        return isNull()
    }
    return EqOp(this, QueryParameter(this.type, t))
}


infix fun <M : IModel<M>, TM : IModel<TM>> ReferencedField<M, TM>.eq(t: PKModelField<TM>?): Expression<Boolean> {
    if (t == null) {
        return isNull()
    }
    return EqOp(this, QueryParameter(this.type, t))
}