package org.platypus.model.field.n.api

import org.platypus.model.IModel

interface SearchableField<M : IModel<M>, T : Any> {
    val searchable: Boolean
}