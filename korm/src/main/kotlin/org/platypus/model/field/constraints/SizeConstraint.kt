package org.platypus.model.field.constraints

import org.platypus.model.Model
import org.platypus.model.field.impl.StringField
import org.platypus.orm.OrmConstraint
import org.platypus.orm.sql.QueryBuilder

var <M : Model<M>> StringField.Builder<M>.maxSize: Int
    set(value) = add(MaxSizeConstraint(this.model, this.fieldName, value))
    get() = 0

var <M : Model<M>> StringField.Builder<M>.minSize: Int
    set(value) = add(MinSizeConstraint(this.model, this.fieldName, value))
    get() = 0

class MaxSizeConstraint(val model: Model<*>, val fieldName: String, val max: Int) : OrmConstraint<String> {
    override val name: String = "maxSize"

    override fun toSQL(query: QueryBuilder): String {
        TODO("not implemented")
    }

    override fun validate(value: String) = if (value.length > this.max) {
        setOf("${name.toUpperCase()} : ${model.modelName}.$fieldName value.length > $max")
    } else {
        emptySet()
    }
}

class MinSizeConstraint(val model: Model<*>, val fieldName: String, val min: Int) : OrmConstraint<String> {
    override val name: String = "minSize"

    override fun toSQL(query: QueryBuilder): String {
        TODO("not implemented")
    }

    override fun validate(value: String) = if (value.length > this.min) {
        setOf("${name.toUpperCase()} : ${model.modelName}.$fieldName value.length > $min")
    } else {
        emptySet()
    }
}
