package org.platypus.entity

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.cache.PlatypusCache
import org.platypus.context.ContextKey
import org.platypus.model.IModel
import org.platypus.model.Model
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.api.MultiReferencedField
import org.platypus.model.field.api.ReferencedField
import org.platypus.model.field.api.SimpleModelField
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
import org.platypus.orm.sql.query.SearchQuery
import org.platypus.security.PlatypusUser
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import kotlin.reflect.KProperty

class FakeRecordImpl<M : IModel<M>>(override val id: Int, override val model: M) : Record<M> {


    override var name: String?
        get() = TODO("not implemented")
        set(value) {}
    override val archived: Boolean
        get() = TODO("not implemented")
    override val api: PrivateApi<M>
        get() = TODO("not implemented")

    override fun delete() {
        TODO("not implemented")
    }

    override fun set(fieldName: String, value: Any?) {
        TODO("not implemented")
    }

    override fun sudo(user: PlatypusUser): Record<M> {
        TODO("not implemented")
    }

    override val displayName: String
        get() = TODO("not implemented")
    override val createDate: LocalDateTime?
        get() = TODO("not implemented")
    override val writeDate: LocalDateTime?
        get() = TODO("not implemented")
    override val createUid: User
        get() = TODO("not implemented")
    override val writeUid: User
        get() = TODO("not implemented")
    override val externalRef: String?
        get() = TODO("not implemented")
    override val empty: Boolean
        get() = TODO("not implemented")
    override val loaded: Boolean
        get() = TODO("not implemented")
    override val query: SearchQuery<M>?
        get() = TODO("not implemented")

    override fun <T : Any> get(field: SimpleModelField<M, T>): T? {
        TODO("not implemented")
    }

    override fun <MT : Model<MT>> get(field: ReferencedField<M, MT>): Record<MT> {
        TODO("not implemented")
    }

    override fun <MT : Model<MT>> get(field: MultiReferencedField<M, MT>): Bag<MT> {
        TODO("not implemented")
    }

    override fun detach() {
        TODO("not implemented")
    }

    override fun attach() {
        TODO("not implemented")
    }

    override val internalState: EntityState
        get() = TODO("not implemented")

    override fun toBag(): Bag<M> {
        TODO("not implemented")
    }

    override fun warmCache(): PlatypusCache {
        TODO("not implemented")
    }

    override fun plus(other: Record<M>): Bag<M> {
        TODO("not implemented")
    }

    override fun validate(): Set<String> {
        TODO("not implemented")
    }

    override val validateMode: EntityValidateMode
        get() = TODO("not implemented")

    override fun isStore(): Boolean {
        TODO("not implemented")
    }

    override fun fetch(): Record<M> {
        TODO("not implemented")
    }

    override fun fetchIfNeeded(field: ModelField<M, *>): Record<M> {
        TODO("not implemented")
    }

    override fun copy(): Record<M> {
        TODO("not implemented")
    }

    override fun deepCopy(): Record<M> {
        TODO("not implemented")
    }

    override fun TimeField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): LocalTime? {
        TODO("not implemented")
    }

    override fun NameModelField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): String? {
        TODO("not implemented")
    }

    override fun ExternalRefModelField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): String? {
        TODO("not implemented")
    }

    override fun StringField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): String? {
        TODO("not implemented")
    }

    override fun TextField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): String? {
        TODO("not implemented")
    }

    override fun DateField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): LocalDate? {
        TODO("not implemented")
    }

    override fun DateTimeField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): LocalDateTime? {
        TODO("not implemented")
    }

    override fun BooleanField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): Boolean {
        TODO("not implemented")
    }

    override fun DecimalField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): BigDecimal {
        TODO("not implemented")
    }

    override fun IntField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): Int {
        TODO("not implemented")
    }

    override fun <D : Selection<D>> SelectionField<M, D>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): SelectionValue<D>? {
        TODO("not implemented")
    }

    override fun BinaryField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): ByteArray? {
        TODO("not implemented")
    }

    override fun CreateUID<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): User {
        TODO("not implemented")
    }

    override fun WriteUID<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): User {
        TODO("not implemented")
    }

    override fun <TM : Model<TM>> One2ManyField<M, TM>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): Bag<TM> {
        TODO("not implemented")
    }

    override fun <TM : Model<TM>> Many2ManyField<M, TM>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): Bag<TM> {
        TODO("not implemented")
    }

    override fun <TM : Model<TM>> Many2OneField<M, TM>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): Record<TM> {
        TODO("not implemented")
    }

    override fun <TM : Model<TM>> One2OneField<M, TM>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): Record<TM> {
        TODO("not implemented")
    }

    override fun <TM : Model<TM>> RevOne2OneField<M, TM>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): Record<TM> {
        TODO("not implemented")
    }

    override fun CreateDateModelField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): LocalDateTime {
        TODO("not implemented")
    }

    override fun WriteDateModelField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): LocalDateTime? {
        TODO("not implemented")
    }

    override fun ArchivedModelField<M>.getValue(o: RecordDelegate<M>, desc: KProperty<*>): Boolean {
        TODO("not implemented")
    }

    override fun withContext(vararg vals: ContextKey.Value<*>): Record<M> {
        TODO("not implemented")
    }

    override fun NameModelField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: String?) {
        TODO("not implemented")
    }

    override fun IntField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: Int?) {
        TODO("not implemented")
    }

    override fun StringField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: String?) {
        TODO("not implemented")
    }

    override fun <D : Selection<D>> SelectionField<M, D>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: SelectionValue<D>?) {
        TODO("not implemented")
    }

    override fun TextField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: String?) {
        TODO("not implemented")
    }

    override fun DateField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: LocalDate?) {
        TODO("not implemented")
    }

    override fun DateTimeField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: LocalDateTime?) {
        TODO("not implemented")
    }

    override fun TimeField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: LocalTime?) {
        TODO("not implemented")
    }

    override fun BooleanField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: Boolean?) {
        TODO("not implemented")
    }

    override fun DecimalField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: BigDecimal?) {
        TODO("not implemented")
    }

    override fun BinaryField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: ByteArray?) {
        TODO("not implemented")
    }

    override fun ArchivedModelField<M>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: Boolean?) {
        TODO("not implemented")
    }

    override fun <TM : Model<TM>> Many2OneField<M, TM>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: Record<TM>?) {
        TODO("not implemented")
    }

    override fun <TM : Model<TM>> One2OneField<M, TM>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: Record<TM>?) {
        TODO("not implemented")
    }

    override fun <TM : Model<TM>> RevOne2OneField<M, TM>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: Record<TM>?) {
        TODO("not implemented")
    }

    override fun <TM : Model<TM>> One2ManyField<M, TM>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: Iterable<Record<TM>>) {
        TODO("not implemented")
    }

    override fun <TM : Model<TM>> Many2ManyField<M, TM>.setValue(o: MutableRecordDelegate<M>, desc: KProperty<*>, value: Iterable<Record<TM>>) {
        TODO("not implemented")
    }

    override val env: PlatypusEnvironment
        get() = TODO("not implemented")
}