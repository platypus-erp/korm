package org.platypus.v2.model.field

import org.platypus.model.field.api.IndexableField
import org.platypus.v2.model.BaseModel
import org.platypus.v2.model.field.api.ClassicField
import org.platypus.v2.model.field.api.FieldBuilder
import org.platypus.v2.visitor.BaseFieldVisitor
import java.time.LocalDate

interface DateField<M : BaseModel<M>> : ClassicField<M, LocalDate>, IndexableField {

    override fun <PARAM_TYPE, RETURN> accept(visitor: BaseFieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)

    interface Builder<M : BaseModel<M>> : FieldBuilder<M, LocalDate, DateField<M>>, IndexableField.Mutable
}