package org.platypus.v2.model.field.api

import org.platypus.model.IModel

interface SearchableField<M : IModel<M>, T : Any> {
    val searchable: Boolean
}