package org.platypus.orm.exceptions

import org.platypus.model.IModel
import org.platypus.model.Model


class Many2ManyColumnNotFound(model: IModel<*>, target: Model<*>) : RuntimeException("Can't find the column many to many inside $model and $target")