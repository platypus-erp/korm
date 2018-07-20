package org.platypus.model.field.api

import org.platypus.model.IModel

interface SimpleModelField<M : IModel<M>, T : Any> : IModelField<M, T>