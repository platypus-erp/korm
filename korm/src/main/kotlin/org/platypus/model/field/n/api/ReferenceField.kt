package org.platypus.model.field.n.api

import org.platypus.entity.Record
import org.platypus.model.IModel
import org.platypus.model.field.api.IndexableField
import org.platypus.orm.ReferenceOption

interface ReferenceField<M : IModel<M>, MT : IModel<MT>> : ClassicField<M, Record<MT>>, IndexableField {
    val target: MT
    val domain: Boolean
    val referenceOption: ReferenceOption
    val loadType: Boolean

    interface Builder<M : IModel<M>, MT : IModel<MT>, F : ReferenceField<M, MT>> : FieldBuilder<M, Record<MT>, F>, IndexableField.Mutable {
        val target: MT
        var domain: Boolean?
        var referenceOption: ReferenceOption?
        var loadType: Boolean?
    }
}