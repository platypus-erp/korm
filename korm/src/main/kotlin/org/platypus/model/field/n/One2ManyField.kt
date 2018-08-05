package org.platypus.model.field.n

import org.platypus.model.IModel
import org.platypus.model.field.n.api.MultiReferencedField

interface One2ManyField<M : IModel<M>, MT : IModel<MT>>: MultiReferencedField<M,MT>{
    val revMany2One : Many2OneField<MT, M>

    interface Builder<M : IModel<M>, MT : IModel<MT>> : MultiReferencedField.Builder<M, MT, One2ManyField<M, MT>>
}