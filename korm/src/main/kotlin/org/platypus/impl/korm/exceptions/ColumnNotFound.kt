package org.platypus.impl.korm.exceptions

import org.platypus.impl.korm.model.BaseModel

class ColumnNotFound(model: BaseModel<*, *>, colName: String): RuntimeException("Can't find the column $colName inside $model")