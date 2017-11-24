package org.platypus.impl.korm.model.property

import org.platypus.impl.korm.identifiants.ModelID
import org.platypus.impl.korm.identifiants.ModelIDS
import org.platypus.impl.korm.entity.PlatypusSelectionCompanion
import org.platypus.impl.korm.entity.PlatypusSelection
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.model.ManyToManyTable
import org.platypus.impl.korm.model.ModelColumnType
import org.platypus.impl.korm.model.ModelTable
import org.platypus.impl.korm.model.determineNameM2M
import org.platypus.impl.korm.model.property.slots.KormSlotImpl
import org.platypus.impl.korm.sql.Column
import org.platypus.impl.korm.sql.DdlAware
import org.platypus.impl.korm.sql.ExpressionWithColumnType
import org.platypus.impl.korm.sql.IColumn
import org.platypus.impl.korm.sql.KormTable
import org.platypus.impl.korm.sql.LiteralOp
import org.platypus.impl.korm.sql.QueryBuilder
import org.platypus.impl.korm.sql.column.type.BooleanColumnType
import org.platypus.impl.korm.sql.column.type.DateColumnType
import org.platypus.impl.korm.sql.column.type.DateTimeColumnType
import org.platypus.impl.korm.sql.column.type.DecimalColumnType
import org.platypus.impl.korm.sql.column.type.EntityIDColumnType
import org.platypus.impl.korm.sql.column.type.FloatColumnType
import org.platypus.impl.korm.sql.column.type.IColumnType
import org.platypus.impl.korm.sql.column.type.IntegerColumnType
import org.platypus.impl.korm.sql.column.type.LongColumnType
import org.platypus.impl.korm.sql.column.type.ManyToManyColumnType
import org.platypus.impl.korm.sql.column.type.StringColumnType
import org.platypus.impl.korm.sql.column.type.TimeColumnType
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

interface KormPropertyConverter<T, FT> {

    fun from(value: FT?): T?

    fun to(value: T?): FT?
}

sealed class KormProperty<M : BaseModel<M, *>, T>(val model: M) :
        ExpressionWithColumnType<T>(),
        DdlAware,
        IColumn<T> {

    private var _column: Column<T>? = null

    open val column: Column<T>
        get() = _column!!

    fun setCol(column: Column<T>) {
        println("Set Column ${model.modelName}#${column.name}")
        this._column = column
    }

    open val readOnlyDB: Boolean = false

    abstract val slots: KormSlotImpl<T>

    override val name
        get() = slots.name


    override fun equals(other: Any?) = when (other) {
        is KormProperty<*, *> -> other.column == this.column
        is Column<*> -> other == this.column
        else -> false
    }


    override fun hashCode() = column.hashCode()

    override fun toString() = this.javaClass.toString()

    internal open fun createColumn(table: ModelTable) {
        this.slots.freeze()
    }

    override fun toSQL(queryBuilder: QueryBuilder) = column.toSQL(queryBuilder)
    override fun createStatement() = column.createStatement()
    override fun modifyStatement() = column.modifyStatement()
    override fun dropStatement() = column.dropStatement()
    override val table: KormTable = model.internalTable
}

class KormPkProperty<M : BaseModel<M, *>>(model: M) : KormProperty<M, ModelID>(model) {
    override val columnType: IColumnType = EntityIDColumnType(model)
    override val slots: KormSlotImpl<ModelID> = KormSlotImpl(
            name = "id",
            colType = ModelColumnType.ENTITY_ID,
            required = true
    )
    override val readOnlyDB: Boolean = true
}

abstract class AbstractKormStringProperty<M : BaseModel<M, *>>(model: M, override val slots: KormSlotImpl<String>) :
        KormProperty<M, String>(model) {

    override val columnType get() = StringColumnType(slots.length ?: slots.maxSize, slots.collate, slots.required)

    override fun createColumn(table: ModelTable) {
        println("register ${slots.name}")
        table.registerColumn(this)
    }

}

class KormStringProperty<M : BaseModel<M, *>>(model: M, slots: KormSlotImpl<String>)
    : AbstractKormStringProperty<M>(model, slots)

class KormTextProperty<M : BaseModel<M, *>>(model: M, slots: KormSlotImpl<String>)
    : AbstractKormStringProperty<M>(model, slots)

class KormNameProperty<M : BaseModel<M, *>>(model: M) :
        AbstractKormStringProperty<M>(model, KormSlotImpl("name", ModelColumnType.STRING, maxSize = 50, label = "name"))

class KormExternalRefProperty<M : BaseModel<M, *>>(model: M)
    : AbstractKormStringProperty<M>(model, KormSlotImpl("external_ref", ModelColumnType.STRING, maxSize = 50, required = true)) {
    override fun createColumn(table: ModelTable) = table.registerColumn(this)
}

class KormInternalVersionProperty<M : BaseModel<M, *>>(model: M) : KormProperty<M, Int>(model) {
    override val slots: KormSlotImpl<Int> = KormSlotImpl("internal_version", ModelColumnType.INTEGER, min = 0, required = true, defaultValue = LiteralOp(IntegerColumnType(true), 0))
    override val columnType: IColumnType = IntegerColumnType(true)
    override fun createColumn(table: ModelTable) = table.registerColumn(this)
}

class KormIntegerProperty<M : BaseModel<M, *>>(model: M, override val slots: KormSlotImpl<Int>) : KormProperty<M, Int>(model) {

    override fun createColumn(table: ModelTable) = table.registerColumn(this)
    override val columnType get() = IntegerColumnType(slots.required)
}

class KormFloatProperty<M : BaseModel<M, *>>(model: M, override val slots: KormSlotImpl<Float>) : KormProperty<M, Float>(model) {

    override fun createColumn(table: ModelTable) = table.registerColumn(this)
    override val columnType get() = FloatColumnType(slots.required)
}

class KormDecimalProperty<M : BaseModel<M, *>>(model: M, override val slots: KormSlotImpl<BigDecimal>) : KormProperty<M, BigDecimal>(model) {

    override fun createColumn(table: ModelTable) = table.registerColumn(this)
    override val columnType
        get() = DecimalColumnType(slots.precision?.precision ?: 6, slots.precision?.scale ?: 10, slots.required)
}

class KormLongProperty<M : BaseModel<M, *>>(model: M, override val slots: KormSlotImpl<Long>) : KormProperty<M, Long>(model) {

    override fun createColumn(table: ModelTable) = table.registerColumn(this)
    override val columnType get() = LongColumnType(slots.required)
}

class KormDateProperty<M : BaseModel<M, *>>(model: M, override val slots: KormSlotImpl<LocalDate>) : KormProperty<M, LocalDate>(model) {

    override fun createColumn(table: ModelTable) = table.registerColumn(this)
    override val columnType get() = DateColumnType(slots.required)
}

class KormDateTimeProperty<M : BaseModel<M, *>>(model: M, override val slots: KormSlotImpl<LocalDateTime>) : KormProperty<M, LocalDateTime>(model) {

    override fun createColumn(table: ModelTable) = table.registerColumn(this)
    override val columnType get() = DateTimeColumnType(slots.required)
}

class KormTimeProperty<M : BaseModel<M, *>>(model: M, override val slots: KormSlotImpl<LocalTime>) : KormProperty<M, LocalTime>(model) {

    override fun createColumn(table: ModelTable) = table.registerColumn(this)
    override val columnType get() = TimeColumnType(slots.required)
}

class KormSelectionProperty<M : BaseModel<M, *>, S : PlatypusSelectionCompanion<M, *, KS>, KS : PlatypusSelection<M, *>>(model: M, val selection: S, override val slots: KormSlotImpl<String>) : KormProperty<M, String>(model) {

    override fun createColumn(table: ModelTable) = table.registerColumn(this)
    override val columnType get() = StringColumnType(slots.length ?: slots.maxSize, slots.collate, slots.required)
}

class KormBooleanProperty<M : BaseModel<M, *>>(model: M, override val slots: KormSlotImpl<Boolean>) : KormProperty<M, Boolean>(model) {

    override fun createColumn(table: ModelTable) = table.registerColumn(this)
    override val columnType get() = BooleanColumnType(slots.required)
}

class KormManyToOneProperty<M : BaseModel<M, *>, T : BaseModel<T, *>>(model: M, val target: T, override val slots: KormSlotImpl<ModelID>) : KormProperty<M, ModelID>(model) {
    override fun createColumn(table: ModelTable) = table.registerColumn(this)
    override val columnType get() = LongColumnType(slots.required)
    internal var one2ManyTarget: KormOneToManyProperty<T, M>? = null
}

class KormOneToManyProperty<M : BaseModel<M, *>, T : BaseModel<T, *>>(model: M, val target: () -> KormManyToOneProperty<T, M>, override val slots: KormSlotImpl<ModelIDS>) : KormProperty<M, ModelIDS>(model) {
    override val columnType get() = LongColumnType(slots.required)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        if (!super.equals(other)) return false
        other as KormOneToManyProperty<*, *>
        if (model != other.model) return false
        if (name != other.name) return false
        return true
    }

    override fun hashCode(): Int {
        return model.hashCode() + name.hashCode()
    }

    override fun toString(): String {
        return model.internalTable.tableName + "." + name
    }

    override fun createColumn(table: ModelTable) {
        table.registerColumn(this)
    }
}

class KormManyToManyProperty<M : BaseModel<M, *>, T : BaseModel<T, *>>(
        model: M, val relProp: (() -> KormManyToManyProperty<T, M>), override val slots: KormSlotImpl<ModelID>
) : KormProperty<M, ModelID>(model) {
    override val columnType: IColumnType by lazy { ManyToManyColumnType(slots.required) }


    val m2mTableName by lazy { determineNameM2M(model, relProp().model) }
    internal val relationTable: ManyToManyTable<M, T> by lazy { ManyToManyTable(m2mTableName, this, relProp()) }

    override val column: Column<ModelID>
        get() = relationTable.col1

    override fun createColumn(table: ModelTable) {
        table.registerColumn(this)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        if (!super.equals(other)) return false
        other as KormOneToManyProperty<*, *>
        if (model != other.model) return false
        if (name != other.name) return false
        return true
    }

    override fun hashCode(): Int {
        return m2mTableName.hashCode() + name.hashCode()
    }

    override fun toString(): String {
        return model.internalTable.tableName + "." + name
    }
}
