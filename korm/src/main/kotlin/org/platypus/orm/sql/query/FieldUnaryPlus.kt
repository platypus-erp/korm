package org.platypus.orm.sql.query

import org.platypus.model.Model
import org.platypus.model.field.impl.RealModelField

interface FieldUnaryPlus<M:Model<M>>: FieldGetter<M> {

    operator fun <MM: Model<MM>> RealModelField<MM, *>.unaryPlus()

}