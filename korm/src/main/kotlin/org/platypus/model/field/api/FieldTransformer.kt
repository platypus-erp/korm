package org.platypus.model.field.api

import org.platypus.orm.Sqlable


interface FieldTransformer<T> : Sqlable {

    fun transform(value: T): T
}
