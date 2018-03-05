package org.platypus.model.field.api.type

import org.platypus.model.field.api.ModelFieldType

class DateTimeSqlFieldType(override val required: Boolean = false) : SqlFieldType {
    override val typeEnum: ModelFieldType = ModelFieldType.DATE_TIME
}