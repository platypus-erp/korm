package org.platypus.model.field.n

import org.platypus.model.IModel
import org.platypus.model.field.n.api.ClassicField
import org.platypus.model.field.n.api.FieldBuilder

interface TextField<M : IModel<M>> : ClassicField<M, String> {

    interface Builder<M : IModel<M>> : FieldBuilder<M, String, TextField<M>>
}