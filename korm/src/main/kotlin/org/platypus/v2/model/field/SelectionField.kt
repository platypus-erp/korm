package org.platypus.v2.model.field

import org.platypus.entity.Selection
import org.platypus.model.field.api.IndexableField
import org.platypus.v2.model.BaseModel
import org.platypus.v2.model.field.api.ClassicField
import org.platypus.v2.model.field.api.FieldBuilder
import org.platypus.v2.visitor.BaseFieldVisitor

interface SelectionField<M : BaseModel<M>, D : Selection<D>> : ClassicField<M, D>, IndexableField {
    val selection: D

    override fun <PARAM_TYPE, RETURN> accept(visitor: BaseFieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)

    interface Builder<M : BaseModel<M>, D : Selection<D>> : FieldBuilder<M, D, SelectionField<M, D>>, IndexableField.Mutable{
        val selection: D
    }
}