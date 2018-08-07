package org.platypus.v2.model

import org.platypus.orm.Sqlable


interface FieldTransformer<T : Any> : Sqlable {

    fun transform(value: T): T
}
