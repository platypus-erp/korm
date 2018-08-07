package org.platypus.v2.model.field

import org.platypus.v2.model.BaseModel
import org.platypus.v2.model.field.api.MultiReferencedField
import org.platypus.v2.visitor.BaseFieldVisitor

interface One2ManyField<M : BaseModel<M>, MT : BaseModel<MT>>: MultiReferencedField<M, MT> {
    val targetField : () -> Many2OneField<MT, M>

    override fun <PARAM_TYPE, RETURN> accept(visitor: BaseFieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)

    interface Builder<M : BaseModel<M>, MT : BaseModel<MT>> : MultiReferencedField.Builder<M, MT, One2ManyField<M, MT>>{
        val targetField : () -> Many2OneField<MT, M>
    }
}