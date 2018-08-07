package org.platypus.v2.orm

import org.platypus.Namable
import org.platypus.Validatable
import org.platypus.orm.Sqlable
import org.platypus.orm.sql.predicate.PredicateField
import org.platypus.v2.model.BaseModel
import org.platypus.v2.model.field.api.BaseField

interface OrmConstraint<T> : Namable, Sqlable, Validatable<T>


class CheckConstraint<M : BaseModel<M>>(val name: String, private val msg: String?, val check: M.() -> PredicateField) {
    val errorMsg: String by lazy {
        msg ?: name
    }
}

class UniqueConstraint<M : BaseModel<M>>(val name: String, private val msg: String?, val fields: Set<BaseField<M, *>>) {
    val errorMsg: String by lazy {
        msg ?: name
    }
}