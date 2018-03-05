package org.platypus.model.field.api.type

import org.platypus.model.field.api.ModelFieldType

class RevOne2OneFieldType(override val required: Boolean) : SqlFieldType {
    override val typeEnum: ModelFieldType = ModelFieldType.REV_ONE_TO_ONE
}