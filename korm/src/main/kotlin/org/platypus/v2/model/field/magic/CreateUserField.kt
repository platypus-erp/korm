package org.platypus.v2.model.field.magic

import org.platypus.v2.Users
import org.platypus.v2.model.BaseModel
import org.platypus.v2.model.field.api.MagicField
import org.platypus.v2.model.field.api.ReferenceField
import org.platypus.v2.record.one.Record
import org.platypus.v2.visitor.BaseFieldVisitor

interface CreateUserField<M : BaseModel<M>> : MagicField<M, Record<Users>>, ReferenceField<M, Users> {
    override fun <PARAM_TYPE, RETURN> accept(visitor: BaseFieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
}

