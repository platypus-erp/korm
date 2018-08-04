package org.platypus.model.field.n

import org.platypus.model.IModel
import org.platypus.model.field.api.IndexableField
import org.platypus.model.field.n.api.ClassicField
import org.platypus.model.field.n.api.FieldBuilder
import java.time.LocalDateTime

interface DateTimeField<M : IModel<M>> : ClassicField<M, LocalDateTime>, IndexableField {

    interface Builder<M : IModel<M>> : FieldBuilder<M, LocalDateTime, DateTimeField<M>>, IndexableField.Mutable
}