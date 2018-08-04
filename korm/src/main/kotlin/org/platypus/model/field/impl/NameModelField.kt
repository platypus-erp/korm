package org.platypus.model.field.impl

import org.platypus.model.IModel
import org.platypus.model.field.api.FieldSlotsImpl
import org.platypus.model.field.api.FieldVisitor
import org.platypus.model.field.api.MutableFieldSlots
import org.platypus.model.field.api.MutableFieldSlotsImpl
import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.model.field.api.type.StringSqlFieldType
import org.platypus.orm.OrmConstraint
import org.platypus.orm.sql.expression.ExpressionVisitor

class NameModelField<M : IModel<M>>(model: M)
    : RealModelField<M, String>(model, "name", FieldSlotsImpl("name")) {

    //    override val store: Boolean
//        get() {
//            return model.slots.type in needCommonField
//        }
    override val type: SqlFieldType
        get() = StringSqlFieldType(required)

    var length: Int = 50
        private set
    var l10n: Boolean = false
        private set

    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)

    fun IModel<M>.extends(ext: NameModelField.Builder<M>.() -> Unit) {
        val f = NameModelField.Builder(this@NameModelField.model, this@NameModelField.fieldName)
        f.ext()
        this@NameModelField.length = f.lenght ?: this@NameModelField.length
        this@NameModelField.l10n = f.l10n ?: this@NameModelField.l10n
        this@NameModelField.slots.merge(f.slots)
    }

    class Builder<M : IModel<M>>
    private constructor(val model: M, val fieldName: String, val slots: MutableFieldSlotsImpl<String>) : MutableFieldSlots<String> by slots {
        constructor(model: M, fieldName: String) : this(model, fieldName, MutableFieldSlotsImpl())

        var lenght: Int? = null
        var l10n: Boolean? = null

        fun add(constraint: OrmConstraint<String>) {
            slots.constraint.add(constraint)
        }
    }
}