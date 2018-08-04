package org.platypus.model.field.n

import org.platypus.model.IModel
import org.platypus.model.field.api.IndexableField
import org.platypus.model.field.n.api.ClassicField
import org.platypus.model.field.n.api.FieldBuilder

interface StringField<M : IModel<M>> : ClassicField<M, String>, IndexableField {

    interface Builder<M : IModel<M>> : FieldBuilder<M, String, StringField<M>>, IndexableField.Mutable
}