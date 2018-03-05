package org.platypus.model.field.api.type

import org.platypus.model.field.api.ModelFieldType

class One2ManyFieldType(override val required: Boolean) : SqlFieldType {
    override val typeEnum: ModelFieldType = ModelFieldType.ONE_TO_MANY
}

