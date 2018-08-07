package org.platypus.v2.model.field.magic

import org.platypus.v2.env.PlatypusEnvironment
import org.platypus.v2.env.UIWidget
import org.platypus.v2.model.BaseModel
import org.platypus.v2.model.FieldTransformer
import org.platypus.v2.model.field.api.BaseField
import org.platypus.v2.orm.OrmConstraint

class IdFieldImpl<M : BaseModel<M>>(override val model: M) : IdField<M> {

    override fun compareTo(other: BaseField<*, *>): Int {
        TODO("not implemented")
    }

    override val fieldName: String = "id"
    override val label: String? = "Technical Identifier"
    override val copy: Boolean = false
    override val help: String? = null
    override val defaultValueFun: (env: PlatypusEnvironment) -> Int? = { null }
    override val unique: Boolean = true
    override val groups: Set<String> = emptySet()
    override val widget: UIWidget? = null
    override val constraint: Set<OrmConstraint<Int>> = emptySet()
    override val transformer: Set<FieldTransformer<Int>> = emptySet()
    override val readonly: Boolean = true
    override val required: Boolean = false
    override val store: Boolean = true
}