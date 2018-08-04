package org.platypus.model.field.n

import org.platypus.model.IModel
import org.platypus.model.field.n.api.ClassicField
import org.platypus.model.field.n.api.FieldBuilder

interface BinaryField<M : IModel<M>> : ClassicField<M, ByteArray> {
    val attachment: Boolean

    interface Builder<M : IModel<M>> : FieldBuilder<M, ByteArray, BinaryField<M>> {
        var attachment: Boolean?
    }
}