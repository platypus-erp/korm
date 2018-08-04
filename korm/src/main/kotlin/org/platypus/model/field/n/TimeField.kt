package org.platypus.model.field.n

import org.platypus.model.IModel
import org.platypus.model.field.api.IndexableField
import org.platypus.model.field.n.api.ClassicField
import org.platypus.model.field.n.api.FieldBuilder
import java.time.LocalTime

interface TimeField<M : IModel<M>> : ClassicField<M, LocalTime>, IndexableField {

    interface Builder<M : IModel<M>> : FieldBuilder<M, LocalTime, TimeField<M>>, IndexableField.Mutable
}