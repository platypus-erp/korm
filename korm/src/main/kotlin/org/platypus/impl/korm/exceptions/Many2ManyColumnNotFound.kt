package org.platypus.impl.korm.exceptions

import org.platypus.impl.korm.model.BaseModel

class Many2ManyColumnNotFound(model: BaseModel<*, *>, target: BaseModel<*, *>) : RuntimeException("Can't find the column many to many inside $model and $target")