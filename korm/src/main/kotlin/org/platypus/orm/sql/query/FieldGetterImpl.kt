package org.platypus.orm.sql.query

import org.platypus.model.Model
import org.platypus.model.field.api.IModelField
import org.platypus.model.field.impl.Many2OneField

class FieldGetterImpl : FieldGetter {
    override fun <MM : Model<MM>, TM : Model<TM>, F : IModelField<TM, T>, T : Any> Many2OneField<MM, TM>.get(getter: TM.() -> F): F {
        TODO("not implemented")
    }
}