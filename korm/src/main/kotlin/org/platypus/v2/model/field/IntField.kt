package org.platypus.v2.model.field

import org.platypus.model.field.api.IndexableField
import org.platypus.v2.model.BaseModel
import org.platypus.v2.model.field.api.ClassicField
import org.platypus.v2.model.field.api.FieldBuilder
import org.platypus.v2.visitor.BaseFieldVisitor

interface IntField<M : BaseModel<M>> : ClassicField<M, Int>, IndexableField {

    override fun <PARAM_TYPE, RETURN> accept(visitor: BaseFieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)

    interface Builder<M : BaseModel<M>> : FieldBuilder<M, Int, IntField<M>>, IndexableField.Mutable
}