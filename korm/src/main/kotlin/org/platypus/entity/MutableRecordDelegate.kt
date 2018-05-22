package org.platypus.entity

import org.platypus.model.Model
import org.platypus.model.field.impl.ArchivedModelField
import org.platypus.model.field.impl.BinaryField
import org.platypus.model.field.impl.BooleanField
import org.platypus.model.field.impl.DateField
import org.platypus.model.field.impl.DateTimeField
import org.platypus.model.field.impl.DecimalField
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
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import kotlin.reflect.KProperty

interface MutableRecordDelegate<M : Model<M>> : RecordDelegate<M> {
    operator fun NameModelField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: String?)
    operator fun IntField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: Int?)
    operator fun StringField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: String?)
    operator fun <D : PlatypusSelection<M>> SelectionField<M, D>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: D?)
    operator fun TextField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: String?)
    operator fun DateField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: LocalDate?)
    operator fun DateTimeField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: LocalDateTime?)
    operator fun TimeField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: LocalTime?)
    operator fun BooleanField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: Boolean?)
    operator fun DecimalField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: BigDecimal?)
    operator fun BinaryField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: ByteArray?)
    operator fun ArchivedModelField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: Boolean?)

    operator fun <TM : Model<TM>> Many2OneField<M, TM>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: Record<TM>?)
    operator fun <TM : Model<TM>> One2OneField<M, TM>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: Record<TM>?)
    operator fun <TM : Model<TM>> RevOne2OneField<M, TM>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: Record<TM>?)
    operator fun <TM : Model<TM>> One2ManyField<M, TM>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: Iterable<Record<TM>>)
    operator fun <TM : Model<TM>> Many2ManyField<M, TM>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: Iterable<Record<TM>>)
}