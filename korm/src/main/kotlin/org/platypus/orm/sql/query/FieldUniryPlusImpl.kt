package org.platypus.orm.sql.query

import org.platypus.model.Model
import org.platypus.model.field.api.IModelField
import org.platypus.model.field.impl.Many2OneField
import org.platypus.model.field.impl.RealModelField

class FieldUniryPlusImpl : FieldUnaryPlus {
    override fun <MM : Model<MM>, TM : Model<TM>, F : IModelField<TM, T>, T : Any> Many2OneField<MM, TM>.get(getter: TM.() -> F): F {
        TODO("not implemented")
    }

    override fun <MM : Model<MM>> RealModelField<MM, *>.unaryPlus() {
        TODO("not implemented")
    }
}