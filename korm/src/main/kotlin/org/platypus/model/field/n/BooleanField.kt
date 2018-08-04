package org.platypus.model.field.n

import org.platypus.model.IModel
import org.platypus.model.field.api.IndexableField
import org.platypus.model.field.n.api.ClassicField
import org.platypus.model.field.n.api.FieldBuilder

interface BooleanField<M : IModel<M>> : ClassicField<M, Boolean>, IndexableField {

    interface Builder<M : IModel<M>> : FieldBuilder<M, Boolean, BooleanField<M>>, IndexableField.Mutable
}