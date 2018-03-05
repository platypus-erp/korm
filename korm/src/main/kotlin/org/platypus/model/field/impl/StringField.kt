package org.platypus.model.field.impl

import org.platypus.model.Model
import org.platypus.model.field.api.FieldSlotsImpl
import org.platypus.model.field.api.FieldVisitor
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.api.MutableFieldSlots
import org.platypus.model.field.api.MutableFieldSlotsImpl
import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.model.field.api.type.StringSqlFieldType
import org.platypus.orm.OrmConstraint
import org.platypus.orm.sql.StringPredicateOperator
import org.platypus.orm.sql.expression.ExpressionVisitor

class StringField<M : Model<M>>(
        name: String, model: M, slots: FieldSlotsImpl<String>, defaultLength: Int? = null, defaultL10n: Boolean? = null
) : SimpleField<M, String>(model, name, slots), StringPredicateOperator<String> {
    var length: Int = defaultLength ?: 50
        private set
    var l10n: Boolean = defaultL10n ?: false
        private set

    override val type: SqlFieldType
        get() = StringSqlFieldType(required)

    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)

    fun extends(ext: StringField.Builder<M>.() -> Unit) {
        val f = StringField.Builder(this@StringField.model, this@StringField.fieldName)
        f.ext()
        length = f.lenght ?: length
        l10n = f.l10n ?: l10n
        this@StringField.slots.merge(f)
    }

    class Builder<M : Model<M>>
    private constructor(val model: M, val fieldName: String, private val slots: MutableFieldSlotsImpl<String>)
        : ModelField.Builder<M, StringField<M>>, MutableFieldSlots<String> by slots {
        constructor(model: M, fieldName: String) : this(model, fieldName, MutableFieldSlotsImpl())

        var lenght: Int? = null
        var l10n: Boolean? = null

        fun add(constraint: OrmConstraint<String>) {
            slots.constraint.add(constraint)
        }

        override fun build(): StringField<M> {
            return StringField(fieldName, model, slots.toSlots(), lenght)
        }
    }
}




