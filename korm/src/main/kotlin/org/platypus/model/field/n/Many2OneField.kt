package org.platypus.model.field.n

import org.platypus.model.IModel
import org.platypus.model.field.n.api.ReferenceField

interface Many2OneField<M : IModel<M>, MT : IModel<MT>> : ReferenceField<M, MT> {

    val revertOne2Many : One2ManyField<MT, M>

    interface Builder<M : IModel<M>, MT : IModel<MT>> : ReferenceField.Builder<M, MT, Many2OneField<M, MT>>
}