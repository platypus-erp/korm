package org.platypus.v2.model.field.magic

import org.platypus.v2.env.PlatypusEnvironment
import org.platypus.v2.env.UIWidget
import org.platypus.v2.model.BaseModel
import org.platypus.v2.model.FieldTransformer
import org.platypus.v2.orm.OrmConstraint
import java.time.LocalDateTime

class WriteDateFieldImpl<M : BaseModel<M>>(override val model: M) : WriteDateField<M> {

    override val fieldName: String = "write_date"
    override val label: String? = "Last update on this Record"
    override val copy: Boolean = false
    override val help: String? = null
    override val defaultValueFun: (env: PlatypusEnvironment) -> LocalDateTime? = { null }
    override val unique: Boolean = true
    override val groups: Set<String> = emptySet()
    override val widget: UIWidget? = null
    override val constraint: Set<OrmConstraint<LocalDateTime>> = emptySet()
    override val transformer: Set<FieldTransformer<LocalDateTime>> = emptySet()
    override val readonly: Boolean = true
    override val required: Boolean = false
    override val store: Boolean = true
}