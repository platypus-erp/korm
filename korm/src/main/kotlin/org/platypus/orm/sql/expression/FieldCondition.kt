package org.platypus.orm.sql.expression

//infix fun <M : IModel<M>, TM : IModel<TM>> ReferencedField<M, TM>.eq(t: Int?): Expression<Boolean> {
//    if (t == null) {
//        return isNull()
//    }
//    return EqOp(this, QueryParameter(this.type, t))
//}
//
//
//infix fun <M : IModel<M>, TM : IModel<TM>> ReferencedField<M, TM>.eq(t: PKModelField<TM>?): Expression<Boolean> {
//    if (t == null) {
//        return isNull()
//    }
//    return EqOp(this, QueryParameter(this.type, t))
//}