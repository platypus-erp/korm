package org.platypus.entity

import org.platypus.Identifiable
import org.platypus.bag.Bag
import org.platypus.model.IModel
import org.platypus.model.Model
import org.platypus.model.field.impl.ArchivedModelField
import org.platypus.model.field.impl.BinaryField
import org.platypus.model.field.impl.BooleanField
import org.platypus.model.field.impl.CreateDateModelField
import org.platypus.model.field.impl.CreateUID
import org.platypus.model.field.impl.DateField
import org.platypus.model.field.impl.DateTimeField
import org.platypus.model.field.impl.DecimalField
import org.platypus.model.field.impl.ExternalRefModelField
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
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import kotlin.reflect.KProperty

interface RecordDelegate<M : IModel<M>> : Identifiable {
    val model: M

    operator fun TimeField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): LocalTime?
    operator fun NameModelField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): String?
    operator fun ExternalRefModelField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): String?
    operator fun StringField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): String?
    operator fun TextField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): String?
    operator fun DateField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): LocalDate?
    operator fun DateTimeField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): LocalDateTime?
    operator fun BooleanField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): Boolean
    operator fun DecimalField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): BigDecimal
    operator fun IntField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): Int
    operator fun <D : Selection<D>> SelectionField<M, D>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): SelectionValue<D>?
    operator fun BinaryField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): ByteArray?
    operator fun CreateUID<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): User
    operator fun WriteUID<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): User
    operator fun <TM : Model<TM>> One2ManyField<M, TM>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): Bag<TM>
    operator fun <TM : Model<TM>> Many2ManyField<M, TM>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): Bag<TM>
    operator fun <TM : Model<TM>> Many2OneField<M, TM>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): Record<TM>
    operator fun <TM : Model<TM>> One2OneField<M, TM>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): Record<TM>
    operator fun <TM : Model<TM>> RevOne2OneField<M, TM>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): Record<TM>
    operator fun CreateDateModelField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): LocalDateTime
    operator fun WriteDateModelField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): LocalDateTime?
    operator fun ArchivedModelField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): Boolean
}