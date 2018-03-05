package org.platypus.model.field.impl

import org.platypus.bag.Bag
import org.platypus.model.IModel
import org.platypus.model.LinkModel
import org.platypus.model.Model
import org.platypus.model.ModelMany2Many
import org.platypus.model.field.api.FieldSlotsImpl
import org.platypus.model.field.api.FieldVisitor
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.api.ModelFieldType
import org.platypus.model.field.api.MutableFieldSlots
import org.platypus.model.field.api.MutableFieldSlotsImpl
import org.platypus.model.field.api.type.Many2ManyFieldType
import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.orm.OrmConstraint
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.expression.ExpressionVisitor

class Many2ManyField<M : Model<M>, TM : Model<TM>>
(
        name: String,
        model: M,
        val target: ModelMany2Many.() -> LinkModel<M, TM>,
        slots: FieldSlotsImpl<Bag<TM>>,
        defaultDomain: (TM.() -> Expression<Boolean>)?

) : MutliReferenceField<M, TM>(model, name, slots, defaultDomain) {

    override val store: Boolean = false

    val targetField: Many2ManyField<TM, M>? by lazy {
        target(ModelMany2Many).m2M2O.target.fields
                .filter { it.type.typeEnum == ModelFieldType.MANY_TO_MANY }
                .map { it as Many2ManyField<TM, *> }
                .filter { it.target(ModelMany2Many).modelName == this.target(ModelMany2Many).modelName }
                .map { it as Many2ManyField<TM, M> }
                .firstOrNull()
    }

    override val type: SqlFieldType
        get() = Many2ManyFieldType(required)

    internal fun merge(f: Builder<M, TM>) {
        this.domain = f.domain ?: this.domain
        this.slots.merge(f)
    }

    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)

    class Builder<M : Model<M>,TM : Model<TM>>
    private constructor(val model: M, val fieldName: String,
                        val target: ModelMany2Many.() -> LinkModel<M, TM>,
                        private val slots: MutableFieldSlotsImpl<Bag<TM>>)
        : ModelField.Builder<M, Many2ManyField<M, TM>>, MutableFieldSlots<Bag< TM>> by slots {
        constructor(model: M, fieldName: String, target: ModelMany2Many.() -> LinkModel<M, TM>) : this(model, fieldName, target, MutableFieldSlotsImpl())

        val domain: (TM.() -> Expression<Boolean>)? = null

        fun add(constraint: OrmConstraint<Bag<TM>>) {
            slots.constraint.add(constraint)
        }

        override fun build(): Many2ManyField<M, TM> {
            return Many2ManyField(fieldName, model, target, toSlots(), domain)
        }
    }
}


