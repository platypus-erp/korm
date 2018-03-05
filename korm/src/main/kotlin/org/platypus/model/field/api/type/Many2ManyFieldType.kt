package org.platypus.model.field.api.type

import org.platypus.model.field.api.ModelFieldType

class Many2ManyFieldType(override val required: Boolean) : SqlFieldType {
    override val typeEnum: ModelFieldType = ModelFieldType.MANY_TO_MANY
}