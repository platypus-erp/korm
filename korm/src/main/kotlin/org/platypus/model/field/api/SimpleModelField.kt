package org.platypus.model.field.api

import org.platypus.model.Model

interface SimpleModelField<M : Model<M>, T : Any> : IModelField<M, T> {

}