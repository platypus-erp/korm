package org.platypus.orm

import org.platypus.Namable
import org.platypus.Validatable
import org.platypus.model.Model
import org.platypus.model.field.api.ModelField
import org.platypus.orm.sql.predicate.PredicateField

interface OrmConstraint<T> : Namable, Sqlable, Validatable<T>


class CheckConstraint<M : Model<M>>(val name: String, private val msg: String?, val check: M.() -> PredicateField) {
    val errorMsg: String by lazy {
        msg ?: name
    }
}

class UniqueConstraint<M : Model<M>>(val name: String, private val msg: String?, val fields: Set<ModelField<M, *>>) {
    val errorMsg: String by lazy {
        msg ?: name
    }
}