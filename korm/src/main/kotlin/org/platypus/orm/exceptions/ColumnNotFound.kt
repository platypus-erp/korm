package org.platypus.orm.exceptions

import org.platypus.model.IModel

class ColumnNotFound(model: IModel<*>, colName: String) : RuntimeException("Can't find the column $colName inside $model")