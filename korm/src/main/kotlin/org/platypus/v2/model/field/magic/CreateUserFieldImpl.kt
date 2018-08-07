package org.platypus.v2.model.field.magic

import org.platypus.orm.ReferenceOption
import org.platypus.v2.Users
import org.platypus.v2.env.PlatypusEnvironment
import org.platypus.v2.env.UIWidget
import org.platypus.v2.model.BaseModel
import org.platypus.v2.model.FieldTransformer
import org.platypus.v2.orm.OrmConstraint
import org.platypus.v2.record.one.Record

class CreateUserFieldImpl<M : BaseModel<M>>(override val model: M) : CreateUserField<M> {

    override val fieldName: String = "create_uid"
    override val label: String? = "This Record is created by"
    override val copy: Boolean = false
    override val help: String? = null
    override val defaultValueFun: (env: PlatypusEnvironment) -> Record<Users>? = { null }
    override val unique: Boolean = true
    override val groups: Set<String> = emptySet()
    override val widget: UIWidget? = null
    override val target: Users
        get() = TODO("not implemented")
    override val domain: Boolean = false
    override val referenceOption: ReferenceOption = ReferenceOption.RESTRICT
    override val loadType: Boolean = false
    override val index: Boolean = false
    override val constraint: Set<OrmConstraint<Record<Users>>> = emptySet()
    override val transformer: Set<FieldTransformer<Record<Users>>> = emptySet()
    override val readonly: Boolean = true
    override val required: Boolean = false
    override val store: Boolean = true
}