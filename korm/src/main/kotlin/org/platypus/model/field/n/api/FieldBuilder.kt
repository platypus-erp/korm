package org.platypus.model.field.n.api

import org.platypus.model.IModel
import org.platypus.model.field.api.MutableFieldSlots

interface FieldBuilder<M : IModel<M>, T : Any, F : BaseField<M, T>>: MutableFieldSlots<T> {

    fun build(): F
}