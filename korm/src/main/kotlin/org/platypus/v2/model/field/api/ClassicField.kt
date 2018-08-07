package org.platypus.v2.model.field.api

import org.platypus.v2.model.BaseModel

interface ClassicField<M : BaseModel<M>, T : Any> : BaseField<M, T>
interface MagicField<M : BaseModel<M>, T : Any> : BaseField<M, T>