package org.platypus.model

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.entity.Record
import org.platypus.entity.Selection
import org.platypus.entity.SelectionValue
import org.platypus.model.field.api.IModelField
import org.platypus.model.field.impl.ArchivedModelField
import org.platypus.model.field.impl.BinaryField
import org.platypus.model.field.impl.BooleanField
import org.platypus.model.field.impl.CreateDateModelField
import org.platypus.model.field.impl.CreateUID
import org.platypus.model.field.impl.DateField
import org.platypus.model.field.impl.DateTimeField
import org.platypus.model.field.impl.DecimalField
import org.platypus.model.field.impl.ExternalRefModelField
import org.platypus.model.field.impl.FieldAlias
import org.platypus.model.field.impl.IntField
import org.platypus.model.field.impl.Many2ManyField
import org.platypus.model.field.impl.Many2OneField
import org.platypus.model.field.impl.NameModelField
import org.platypus.model.field.impl.One2ManyField
import org.platypus.model.field.impl.One2OneField
import org.platypus.model.field.impl.RevOne2OneField
import org.platypus.model.field.impl.SelectionField
import org.platypus.model.field.impl.StringField
import org.platypus.model.field.impl.TextField
import org.platypus.model.field.impl.TimeField
import org.platypus.model.field.impl.WriteDateModelField
import org.platypus.model.field.impl.WriteUID
import org.platypus.module.base.entities.User
import org.platypus.orm.sql.dml.ColumnSet
import org.platypus.orm.sql.dml.FieldSet
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.query.Join
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import kotlin.reflect.KProperty

class Alias<M : IModel<M>>(val delegate: M, val alias: String) : IModel<M> by delegate {

//    override val id: PKModelField<T, E>
//        get() = delegate.id
//    override val name: NameModelField<T, E>
//        get() = delegate.name

    override val modelName: String
        get() = alias

    override fun describe(env: PlatypusEnvironment): String {
        return tableNameWithAlias
    }

    override fun targetTables(): List<IModel<*>> {
        return listOf(delegate)
    }

    override val source: ColumnSet
        get() = this

    override fun join(otherTable: ColumnSet, joinType: Join.JoinType, onColumn: Expression<*>?, otherColumn: Expression<*>?, additionalConstraint: (() -> Expression<Boolean>)?): Join {
        return super.join(otherTable, joinType, onColumn, otherColumn, additionalConstraint)
    }

    override fun innerJoin(otherTable: ColumnSet): Join {
        return super.innerJoin(otherTable)
    }

    override fun leftJoin(otherTable: ColumnSet): Join {
        return super.leftJoin(otherTable)
    }

    override fun crossJoin(otherTable: ColumnSet): Join {
        return super.crossJoin(otherTable)
    }

    override fun slice(vararg columns: Expression<*>): FieldSet {
        return super.slice(*columns)
    }

    override fun slice(columns: Set<Expression<*>>): FieldSet {
        return super.slice(columns)
    }

    override fun <PARAM : Any, RETURN : Any> accept(visitor: ModelVisitor<PARAM, RETURN>, p: PARAM): RETURN = visitor.visit(this, p)


    val tableNameWithAlias: String = "${delegate.tableName} AS $alias"

    @Suppress("UNCHECKED_CAST")
    operator fun <T1 : Any, F : IModelField<M, T1>> get(original: F): FieldAlias<M, T1> {
        return FieldAlias(original, this)
    }

    operator fun TimeField<M>.getValue(o: M, desc: KProperty<*>): FieldAlias<M, LocalTime> = FieldAlias(this, this@Alias)

    operator fun NameModelField<M>.getValue(o: Alias<M>, desc: KProperty<*>): FieldAlias<M, String> = FieldAlias(this, this@Alias)
    operator fun ExternalRefModelField<M>.getValue(o: Alias<M>, desc: KProperty<*>): FieldAlias<M, String> = FieldAlias(this, this@Alias)
    operator fun StringField<M>.getValue(o: Alias<M>, desc: KProperty<*>): FieldAlias<M, String> = FieldAlias(this, this@Alias)
    operator fun TextField<M>.getValue(o: Alias<M>, desc: KProperty<*>): FieldAlias<M, String> = FieldAlias(this, this@Alias)
    operator fun DateField<M>.getValue(o: Alias<M>, desc: KProperty<*>): FieldAlias<M, LocalDate> = FieldAlias(this, this@Alias)
    operator fun DateTimeField<M>.getValue(o: Alias<M>, desc: KProperty<*>): FieldAlias<M, LocalDateTime> = FieldAlias(this, this@Alias)
    operator fun BooleanField<M>.getValue(o: Alias<M>, desc: KProperty<*>): FieldAlias<M, Boolean> = FieldAlias(this, this@Alias)
    operator fun DecimalField<M>.getValue(o: Alias<M>, desc: KProperty<*>): FieldAlias<M, BigDecimal> = FieldAlias(this, this@Alias)
    operator fun IntField<M>.getValue(o: Alias<M>, desc: KProperty<*>): FieldAlias<M, Int> = FieldAlias(this, this@Alias)
    operator fun <D : Selection<D>> SelectionField<M, D>.getValue(o: Alias<M>, desc: KProperty<*>): FieldAlias<M, SelectionValue<D>> = FieldAlias(this, this@Alias)
    operator fun BinaryField<M>.getValue(o: Alias<M>, desc: KProperty<*>): FieldAlias<M, ByteArray> = FieldAlias(this, this@Alias)
    operator fun CreateUID<M>.getValue(o: Alias<M>, desc: KProperty<*>): FieldAlias<M, User> = FieldAlias(this, this@Alias)
    operator fun WriteUID<M>.getValue(o: Alias<M>, desc: KProperty<*>): FieldAlias<M, User> = FieldAlias(this, this@Alias)
    operator fun <TM : Model<TM>> One2ManyField<M, TM>.getValue(o: Alias<M>, desc: KProperty<*>): FieldAlias<M, Bag<TM>> = FieldAlias(this, this@Alias)
    operator fun <TM : Model<TM>> Many2ManyField<M, TM>.getValue(o: Alias<M>, desc: KProperty<*>): FieldAlias<M, Bag<TM>> = FieldAlias(this, this@Alias)
    operator fun <TM : Model<TM>> Many2OneField<M, TM>.getValue(o: Alias<M>, desc: KProperty<*>): FieldAlias<M, Record<TM>> = FieldAlias(this, this@Alias)
    operator fun <TM : Model<TM>> One2OneField<M, TM>.getValue(o: Alias<M>, desc: KProperty<*>): FieldAlias<M, Record<TM>> = FieldAlias(this, this@Alias)
    operator fun <TM : Model<TM>> RevOne2OneField<M, TM>.getValue(o: Alias<M>, desc: KProperty<*>): FieldAlias<M, Record<TM>> = FieldAlias(this, this@Alias)
    operator fun CreateDateModelField<M>.getValue(o: Alias<M>, desc: KProperty<*>): FieldAlias<M, LocalDateTime> = FieldAlias(this, this@Alias)
    operator fun WriteDateModelField<M>.getValue(o: Alias<M>, desc: KProperty<*>): FieldAlias<M, LocalDateTime> = FieldAlias(this, this@Alias)
    operator fun ArchivedModelField<M>.getValue(o: Alias<M>, desc: KProperty<*>): FieldAlias<M, Boolean> = FieldAlias(this, this@Alias)

    fun <T : Any> getExpression(original: IModelField<M, T>): Expression<*> {
        return FieldAlias(original, this)
    }


    override fun equals(other: Any?): Boolean {
        if (other !is Alias<*>) return false
        return this.tableNameWithAlias == other.tableNameWithAlias
    }

    override fun toString(): String {
        return tableNameWithAlias
    }

    override fun hashCode(): Int = tableNameWithAlias.hashCode()
}

val <M : Model<M>> Alias<M>.externalRef
    get() = this[delegate.externalRef]

val <M : Model<M>> Alias<M>.createDate
    get() = this[delegate.createDate]

val <M : Model<M>> Alias<M>.createUid
    get() = this[delegate.createUid]

val <M : Model<M>> Alias<M>.writeDate
    get() = this[delegate.writeDate]

val <M : Model<M>> Alias<M>.writeUid
    get() = this[delegate.writeUid]