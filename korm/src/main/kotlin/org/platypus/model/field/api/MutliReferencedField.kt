package org.platypus.model.field.api

import org.platypus.entity.Record
import org.platypus.model.IModel
import org.platypus.model.Model
import org.platypus.orm.ReferenceOption

interface MutliReferencedField<M : IModel<M>, TM : Model<TM>> : IModelField<M, Record<TM>> {
    val target: TM
    val onDelete: ReferenceOption
}