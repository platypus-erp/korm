package org.platypus.model.field.impl

import org.platypus.model.IModel
import org.platypus.model.Model
import org.platypus.model.ModelType
import org.platypus.model.field.api.FieldSlots
import org.platypus.model.field.api.FieldSlotsImpl
import org.platypus.model.field.api.FieldVisitor
import org.platypus.model.field.api.IModelField
import org.platypus.model.field.api.MutableFieldSlots
import org.platypus.model.field.api.MutableFieldSlotsImpl
import org.platypus.model.field.api.comparatorField
import org.platypus.model.field.api.type.DateTimeSqlFieldType
import org.platypus.model.field.api.type.Many2OneFieldType
import org.platypus.model.field.api.type.PKFieldType
import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.model.field.api.type.StringSqlFieldType
import org.platypus.module.base.models.Users
import org.platypus.orm.OrmConstraint
import org.platypus.orm.ReferenceOption
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.expression.ExpressionVisitor
import org.platypus.orm.sql.expression.FieldExpression
import java.time.LocalDateTime
import java.util.*
import kotlin.math.absoluteValue

private val needPkField = setOf(
        ModelType.CLASSIC_MODEL,
        ModelType.RECURSIVE_MODEL,
        ModelType.MODEL_STORED_VIEW,
        ModelType.LINK_MODEL,
        ModelType.MODEL_VIEW)

class PKModelField<M : IModel<M>>(override val model: M) :
        IModelField<M, Int>,
        FieldSlots<Int> by FieldSlotsImpl("ID", readonly = true, copy = false, store = true),
        FieldExpression<Int>,
        Expression<Int> {

    override fun compare(o1: Int?, o2: Int?): Int {
        TODO("not implemented")
    }

    override fun compareTo(other: IModelField<*, *>): Int = comparatorField.compare(this, other)

    override val fieldName: String
        get() = "id"

    override val type: SqlFieldType = PKFieldType()

    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)

}

private val needCommonField = setOf(ModelType.CLASSIC_MODEL, ModelType.RECURSIVE_MODEL)

class NameModelField<M : Model<M>
        >(model: M)
    : RealModelField<M, String>(model, "name", FieldSlotsImpl("name")) {

    override val store: Boolean
        get() {
            return model.slots.type in needCommonField
        }
    override val type: SqlFieldType
        get() = StringSqlFieldType(required)

    var length: Int = 50
        private set
    var l10n: Boolean = false
        private set

    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)

    fun Model<M>.extends(ext: NameModelField.Builder<M>.() -> Unit) {
        val f = NameModelField.Builder(this@NameModelField.model, this@NameModelField.fieldName)
        f.ext()
        this@NameModelField.length = f.lenght ?: this@NameModelField.length
        this@NameModelField.l10n = f.l10n ?: this@NameModelField.l10n
        this@NameModelField.slots.merge(f.slots)
    }

    class Builder<M : Model<M>>
    private constructor(val model: M, val fieldName: String, val slots: MutableFieldSlotsImpl<String>) : MutableFieldSlots<String> by slots {
        constructor(model: M, fieldName: String) : this(model, fieldName, MutableFieldSlotsImpl())

        var lenght: Int? = null
        var l10n: Boolean? = null

        fun add(constraint: OrmConstraint<String>) {
            slots.constraint.add(constraint)
        }
    }
}

class ExternalRefModelField<M : Model<M>>(model: M)
    : RealModelField<M, String>(model, "external_ref", FieldSlotsImpl(readonly = true, copy = false, required = true, defaultValueFun = { "${model.tableName}_${Random().nextInt().absoluteValue}" }, store = true)) {

    override val store: Boolean
        get() {
            return model.slots.type in needCommonField
        }

    override val type: SqlFieldType = StringSqlFieldType(required)
    var length: Int = 50
        private set

    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class WriteDateModelField<M : Model<M>>(model: M)
    : RealModelField<M, LocalDateTime>(model, "write_date", FieldSlotsImpl(readonly = true, copy = false, default = LocalDateTime.now())) {

    override val store: Boolean
        get() {
            return model.slots.type in needCommonField
        }

    override val required: Boolean = false

    override val type: SqlFieldType = DateTimeSqlFieldType(false)

    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class CreateDateModelField<M : Model<M>>(model: M)
    : RealModelField<M, LocalDateTime>(model, "create_date", FieldSlotsImpl(readonly = true, copy = false, required = true, default = LocalDateTime.now())) {

    override val store: Boolean
        get() {
            return model.slots.type in needCommonField
        }

    override val type: SqlFieldType = DateTimeSqlFieldType(required)

    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class WriteUID<M : Model<M>>(model: M)
    : ReferenceField<M, Users>(model, "write_uid", FieldSlotsImpl(readonly = true, copy = false), ReferenceOption.RESTRICT, null) {

    override val required: Boolean = false

    override val store: Boolean = true

    override val type: SqlFieldType by lazy { Many2OneFieldType(true, Users) }

    override val target: Users
        get() = Users

    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class CreateUID<M : Model<M>>(model: M)
    : ReferenceField<M, Users>(model, "create_uid", FieldSlotsImpl(readonly = true, copy = false, required = true), ReferenceOption.RESTRICT, null) {

    override val store: Boolean
        get() {
            return model.slots.type in needCommonField
        }

    override val target: Users
        get() = Users
    override val type: SqlFieldType by lazy { Many2OneFieldType(true, Users) }

    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class ArchivedModelField<M : Model<M>>(model: M)
    : RealModelField<M, Boolean>(model, "archived", FieldSlotsImpl(readonly = true, copy = false, required = true, default = false)) {

    override var store: Boolean = false
        private set

    fun enable() {
        this@ArchivedModelField.store = true
    }

    fun disable() {
        this@ArchivedModelField.store = false
    }

    override val type: SqlFieldType = DateTimeSqlFieldType(required)

    override fun <PARAM_TYPE, RETURN> accept(visitor: FieldVisitor<PARAM_TYPE, RETURN>, p: PARAM_TYPE): RETURN = visitor.visit(this, p)
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}