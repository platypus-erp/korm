package org.platypus.model.field.n.api

import org.platypus.bag.Bag
import org.platypus.model.IModel

interface MultiReferencedField<M : IModel<M>, MT : IModel<MT>>: ClassicField<M, Bag<MT>> {
    val target: MT
    val domain: Boolean

    interface Builder<M : IModel<M>, MT : IModel<MT>, F : MultiReferencedField<M, MT>> : FieldBuilder<M, Bag<MT>, F> {
        val target: MT
        var domain: Boolean?
    }
}