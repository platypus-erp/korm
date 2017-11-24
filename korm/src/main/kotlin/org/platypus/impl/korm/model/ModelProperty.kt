package org.platypus.impl.korm.model

import org.platypus.api.DecimalPrecision
import org.platypus.impl.korm.entity.Entity
import org.platypus.impl.korm.entity.PlatypusSelection
import org.platypus.impl.korm.entity.PlatypusSelectionCompanion
import org.platypus.impl.korm.model.property.KormBooleanProperty
import org.platypus.impl.korm.model.property.KormDateProperty
import org.platypus.impl.korm.model.property.KormDateTimeProperty
import org.platypus.impl.korm.model.property.KormDecimalProperty
import org.platypus.impl.korm.model.property.KormExternalRefProperty
import org.platypus.impl.korm.model.property.KormFloatProperty
import org.platypus.impl.korm.model.property.KormIntegerProperty
import org.platypus.impl.korm.model.property.KormInternalVersionProperty
import org.platypus.impl.korm.model.property.KormManyToManyProperty
import org.platypus.impl.korm.model.property.KormManyToOneProperty
import org.platypus.impl.korm.model.property.KormNameProperty
import org.platypus.impl.korm.model.property.KormOneToManyProperty
import org.platypus.impl.korm.model.property.KormPkProperty
import org.platypus.impl.korm.model.property.KormProperty
import org.platypus.impl.korm.model.property.KormPropertyConverter
import org.platypus.impl.korm.model.property.KormSelectionProperty
import org.platypus.impl.korm.model.property.KormStringProperty
import org.platypus.impl.korm.model.property.KormTextProperty
import org.platypus.impl.korm.model.property.KormTimeProperty
import org.platypus.impl.korm.model.property.slots.KormSlotImpl
import org.platypus.impl.korm.sql.LiteralOp
import org.platypus.impl.korm.sql.Op
import org.platypus.impl.korm.sql.ReferenceOption
import org.platypus.impl.korm.sql.stringLiteral
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import kotlin.reflect.KType

class ModelPropertyCreatorImpl<MODEL : BaseModel<MODEL, RECIEVER>, RECIEVER : Entity<RECIEVER, MODEL>>(private val m: MODEL) : Iterable<KormProperty<MODEL, out Any>> {

    private val modelProperties = mutableMapOf<String, KormProperty<MODEL, out Any>>()
    val properties: Map<String, KormProperty<MODEL, out Any>>
        get() = modelProperties

    operator fun get(s: String) = modelProperties[s]!!

    operator fun contains(s: String): Boolean = s in modelProperties


    override fun iterator() = modelProperties.values.iterator()

    val id = KormPkProperty(m).apply {
        modelProperties.put("id", this)
    }
    val externalRef = externalRef()
    val name = name()
    val internalVersion = internalVersion()
    val archived = archived()

    internal fun createKormTable(table: ModelTable): ModelTable {
        for (prop in modelProperties.values) {
            prop.createColumn(table)
        }
        return table
    }

    private fun <T : Any, KP : KormProperty<MODEL, T>> createProp(prop: KP): KP = prop.apply {
        if (prop.name in modelProperties) {
            throw IllegalStateException("Can't erased a property with a another ${prop.name}")
        }
        modelProperties[prop.name] = this
    }

    fun string(name: String,
               label: String? = null,
               help: String? = null,
               default: String? = null,
               store: Boolean = true,
               manual: Boolean = false,
               length: Int? = null,
               minSize: Int? = null,
               maxSize: Int? = null,
               collate: String? = null,
               prefix: String? = null,
               suffix: String? = null,
               unique: Boolean? = null,
               index: Boolean? = null,
               required: Boolean = false
    ) = createProp(KormStringProperty(m, KormSlotImpl(
            name = name,
            colType = ModelColumnType.STRING,
            label = label,
            store = store,
            length = length,
            manual = manual,
            collate = collate,
            required = required,
            help = help,
            minSize = minSize,
            maxSize = maxSize,
            index = index,
            default = default,
            unique = unique,
            prefix = prefix,
            suffix = suffix)))

    fun text(name: String,
             label: String? = null,
             help: String? = null,
             store: Boolean = true,
             l10n: Boolean = true,
             manual: Boolean = false,
             length: Int? = null,
             minSize: Int? = null,
             maxSize: Int? = null,
             collate: String? = null,
             prefix: String? = null,
             suffix: String? = null,
             unique: Boolean? = null,
             required: Boolean = false
    ) = createProp(KormTextProperty(m, KormSlotImpl(
            name = name,
            colType = ModelColumnType.STRING,
            label = label,
            help = help,
            store = store,
            l10n = l10n,
            length = length,
            manual = manual,
            collate = collate,
            required = required,
            minSize = minSize,
            maxSize = maxSize,
            index = false,
            unique = unique,
            prefix = prefix,
            suffix = suffix)))


    private fun name() = createProp(KormNameProperty(m))
    private fun archived() = createProp(KormBooleanProperty(m, KormSlotImpl("archived", ModelColumnType.BOOLEAN, label = "Archived")))
    private fun externalRef() = createProp(KormExternalRefProperty(m))
    private fun internalVersion() = createProp(KormInternalVersionProperty(m))

    fun float(name: String,
              label: String? = null,
              help: String? = null,
              required: Boolean = false,
              store: Boolean = true,
              defaultValue: LiteralOp<Float>? = null,
              default: Float? = null,
              min: Float? = null,
              max: Float? = null
    ) = createProp(KormFloatProperty(m, KormSlotImpl(
            name,
            ModelColumnType.FLOAT,
            label = label,
            help = help,
            required = required,
            store = store,
            defaultValue = defaultValue,
            default = default,
            min = min,
            max = max
    )))

    fun integer(name: String,
                label: String? = null,
                help: String? = null,
                required: Boolean = false,
                store: Boolean = true,
                defaultValue: LiteralOp<Int>? = null,
                default: Int? = null,
                min: Int? = null,
                max: Int? = null
    ) = createProp(KormIntegerProperty(m, KormSlotImpl(
            name,
            ModelColumnType.INTEGER,
            label = label,
            help = help,
            required = required,
            store = store,
            defaultValue = defaultValue,
            default = default,
            min = min,
            max = max
    )))

    fun decimal(name: String,
                label: String? = null,
                help: String? = null,
                required: Boolean = false,
                store: Boolean = true,
                precision: DecimalPrecision? = null,
                defaultValue: LiteralOp<BigDecimal>? = null,
                default: BigDecimal? = null,
                min: Int? = null,
                max: Int? = null
    ) = createProp(KormDecimalProperty(m, KormSlotImpl(
            name,
            ModelColumnType.DECIMAL,
            label = label,
            help = help,
            required = required,
            store = store,
            defaultValue = defaultValue,
            precision = precision,
            default = default,
            min = if (min != null) BigDecimal(min) else min,
            max = if (max != null) BigDecimal(max) else max
    )))

    fun date(name: String,
             label: String? = null,
             help: String? = null,
             required: Boolean = false,
             store: Boolean = true,
             precision: DecimalPrecision? = null,
             defaultValue: LiteralOp<LocalDate>? = null,
             default: LocalDate? = null,
             min: LocalDate? = null,
             max: LocalDate? = null
    ) = createProp(KormDateProperty(m, KormSlotImpl(
            name,
            ModelColumnType.DATE,
            label = label,
            help = help,
            required = required,
            store = store,
            defaultValue = defaultValue,
            precision = precision,
            default = default,
            min = min,
            max = max
    )))

    fun datetime(name: String,
                 label: String? = null,
                 help: String? = null,
                 required: Boolean = false,
                 store: Boolean = true,
                 precision: DecimalPrecision? = null,
                 defaultValue: LiteralOp<LocalDateTime>? = null,
                 default: LocalDateTime? = null,
                 min: LocalDateTime? = null,
                 max: LocalDateTime? = null
    ) = createProp(KormDateTimeProperty(m, KormSlotImpl(
            name,
            ModelColumnType.DATE_TIME,
            label = label,
            help = help,
            required = required,
            store = store,
            defaultValue = defaultValue,
            precision = precision,
            default = default,
            min = min,
            max = max
    )))

    fun time(name: String,
             label: String? = null,
             help: String? = null,
             required: Boolean = false,
             store: Boolean = true,
             precision: DecimalPrecision? = null,
             defaultValue: LiteralOp<LocalTime>? = null,
             default: LocalTime? = null,
             min: LocalTime? = null,
             max: LocalTime? = null
    ) = createProp(KormTimeProperty(m, KormSlotImpl(
            name,
            ModelColumnType.TIME,
            label = label,
            help = help,
            required = required,
            store = store,
            defaultValue = defaultValue,
            precision = precision,
            default = default,
            min = min,
            max = max
    )))

    fun <PSC : PlatypusSelectionCompanion<MODEL, RECIEVER, KS>, KS : PlatypusSelection<MODEL, RECIEVER>> selection(name: String,
                                                                                                                   label: String? = null,
                                                                                                                   help: String? = null,
                                                                                                                   required: Boolean = false,
                                                                                                                   selection: PSC,
                                                                                                                   store: Boolean = true,
                                                                                                                   defaultValue: KS? = null,
                                                                                                                   min: Int? = null,
                                                                                                                   max: Int? = null
    ) = createProp(KormSelectionProperty(m, selection, KormSlotImpl(
            name,
            ModelColumnType.STRING,
            label = label,
            help = help,
            required = required,
            store = store,
            defaultValue = if (defaultValue != null) stringLiteral(defaultValue.value) else null
    )))

    fun boolean(name: String,
                label: String? = null,
                help: String? = null,
                required: Boolean = false,
                store: Boolean = true,
                defaultValue: LiteralOp<Boolean>? = null
    ) = createProp(KormBooleanProperty(m, KormSlotImpl(
            name,
            ModelColumnType.INTEGER,
            label = label,
            help = help,
            required = required,
            store = store,
            defaultValue = defaultValue
    )))

    fun <T : BaseModel<T, TE>, TE : Entity<TE, T>>
            many2one(name: String,
                     label: String? = null,
                     required: Boolean = false,
                     readonly: Boolean = false,
                     index: Boolean = false,
                     onDelete: ReferenceOption? = null,
                     help: String? = null,
                     domain: (() -> Op<Boolean>)? = null,
                     defaultFun: ((self: RECIEVER) -> TE)? = null,
                     target: T
    ) = createProp(KormManyToOneProperty(m, target, KormSlotImpl(
            name,
            ModelColumnType.MANY_TO_MANY,
            label = label,
            help = help,
            required = required,
            readonly = readonly,
            domain = domain,
            index = index,
            onDelete = onDelete
    )))

    fun <T : BaseModel<T, *>>
            one2many(name: String,
                     label: String? = null,
                     help: String? = null,
                     required: Boolean = false,
                     store: Boolean = true,
                     onDelete: ReferenceOption? = null,
                     target: () -> KormManyToOneProperty<T, MODEL>
    ) = createProp(KormOneToManyProperty(m, target, KormSlotImpl(
            name,
            ModelColumnType.MANY_TO_MANY,
            label = label,
            help = help,
            required = required,
            store = store,
            onDelete = onDelete
    )))

    fun <T : BaseModel<T, *>>
            many2many(name: String,
                      label: String? = null,
                      help: String? = null,
                      required: Boolean = false,
                      store: Boolean = true,
                      onDelete: ReferenceOption? = null,
                      propGet: () -> KormManyToManyProperty<T, MODEL>
    ): KormManyToManyProperty<MODEL, T> = createProp(KormManyToManyProperty(m, propGet, KormSlotImpl(
            name,
            ModelColumnType.MANY_TO_MANY,
            label = label,
            help = help,
            required = required,
            store = store,
            onDelete = onDelete
    )))

    fun <T : BaseModel<T, *>>
            many2many(name: String,
                      label: String? = null,
                      help: String? = null,
                      required: Boolean = false,
                      store: Boolean = true,
                      onDelete: ReferenceOption? = null,
                      target: T,
                      targetField: String
    ): KormManyToManyProperty<MODEL, T> {
        assert(targetField in target) {
            "Field $targetField not found in $target"
        }
        return createProp(KormManyToManyProperty(m, { target.getColM2M(m) }, KormSlotImpl(
                name,
                ModelColumnType.MANY_TO_MANY,
                label = label,
                help = help,
                required = required,
                store = store,
                onDelete = onDelete
        )))
    }
}




