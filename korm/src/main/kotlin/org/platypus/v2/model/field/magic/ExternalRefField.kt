package org.platypus.v2.model.field.magic

import org.platypus.v2.model.BaseModel
import org.platypus.v2.model.field.api.MagicField
import org.platypus.v2.visitor.BaseFieldVisitor

interface ExternalRefField<M : BaseModel<M>> : MagicField<M, String>{
    override fun <PARAM_TYPE, RETURN> accept(visitor: BaseFieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
}
