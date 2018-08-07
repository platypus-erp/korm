package org.platypus.v2.model.field.magic

import org.platypus.v2.model.BaseModel
import org.platypus.v2.model.field.api.MagicField
import org.platypus.v2.visitor.BaseFieldVisitor

interface IdField<M : BaseModel<M>> : MagicField<M, Int>{
    override fun <PARAM_TYPE, RETURN> accept(visitor: BaseFieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
}
