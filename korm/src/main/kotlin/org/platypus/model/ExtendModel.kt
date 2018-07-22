package org.platypus.model

import org.platypus.bag.Bag
import org.platypus.entity.Record
import org.platypus.entity.Selection
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.api.OnChangeType
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
import org.platypus.model.field.impl.ReferenceField
import org.platypus.model.field.impl.RevOne2OneField
import org.platypus.model.field.impl.SelectionField
import org.platypus.model.field.impl.StringField
import org.platypus.model.field.impl.TextField
import org.platypus.model.field.impl.TimeField
import org.platypus.model.functions.empty.ApiEmptyNoParamExtends
import org.platypus.model.functions.empty.ApiEmptyNoParamStacker
import org.platypus.model.functions.empty.ApiEmptyParamExtends
import org.platypus.model.functions.empty.ApiEmptyParamStacker
import org.platypus.model.functions.multi.ApiMultiNoParamExtends
import org.platypus.model.functions.multi.ApiMultiNoParamStacker
import org.platypus.model.functions.multi.ApiMultiParamExtends
import org.platypus.model.functions.multi.ApiMultiParamStacker
import org.platypus.model.functions.one.ApiOneNoParamExtends
import org.platypus.model.functions.one.ApiOneNoParamStacker
import org.platypus.model.functions.one.ApiOneParamExtends
import org.platypus.model.functions.one.ApiOneParamStacker
import org.platypus.repository.RecordRepository

abstract class ExtendModel<M : Model<M>>(val original: M) : IModel<M> by original {

    protected fun string(name: String, info: StringField.Builder<M>.() -> Unit = {}): StringField<M> =
            original.applyBuilder(StringField.Builder(original, name), info)

    protected fun date(name: String, info: DateField.Builder<M>.() -> Unit = {}): DateField<M> =
            original.applyBuilder(DateField.Builder(original, name), info)

    protected fun dateTime(name: String, info: DateTimeField.Builder<M>.() -> Unit = {}): DateTimeField<M> =
            original.applyBuilder(DateTimeField.Builder(original, name), info)

    protected fun time(name: String, info: TimeField.Builder<M>.() -> Unit = {}): TimeField<M> =
            original.applyBuilder(TimeField.Builder(original, name), info)

    protected fun boolean(name: String, info: BooleanField.Builder<M>.() -> Unit = {}): BooleanField<M> =
            original.applyBuilder(BooleanField.Builder(original, name), info)

    protected fun text(name: String, info: TextField.Builder<M>.() -> Unit = {}): TextField<M> =
            original.applyBuilder(TextField.Builder(original, name), info)

    protected fun decimal(name: String, info: DecimalField.Builder<M>.() -> Unit = {}): DecimalField<M> =
            original.applyBuilder(DecimalField.Builder(original, name), info)

    protected fun integer(name: String, info: IntField.Builder<M>.() -> Unit = {}): IntField<M> =
            original.applyBuilder(IntField.Builder(original, name), info)

    protected fun binary(name: String, info: BinaryField.Builder<M>.() -> Unit = {}): BinaryField<M> =
            original.applyBuilder(BinaryField.Builder(original, name), info)

    protected fun <TM : Model<TM>> many2many(name: String, target: ModelMany2Many.() -> LinkModel<M, TM>, info: Many2ManyField.Builder<M, TM>.() -> Unit = {}): Many2ManyField<M, TM> {
        return original.applyBuilder(Many2ManyField.Builder(original, name, target), info)
    }

    protected fun <TM : Model<TM>> many2manyR(name: String, target: ModelMany2Many.() -> LinkModel<TM, M>, info: Many2ManyField.Builder<M, TM>.() -> Unit = {}): Many2ManyField<M, TM> {
        return original.applyBuilder(Many2ManyField.Builder(original, name, { target(ModelMany2Many).reverse }), info)
    }

    protected fun <D : Selection<D>> selection(name: String, selection: D, info: SelectionField.Builder<M, D>.() -> Unit = {}): SelectionField<M, D> =
            original.applyBuilder(SelectionField.Builder(original, name, selection), info)

    protected fun <MT : Model<MT>, KT, F : ModelField<MT, KT>>
            ReferenceField<M, MT>.related(label: String? = null, help: String? = null, store: Boolean = false, readonly: Boolean = true, getter: MT.() -> F): F {
        return this.target.getter()
    }

//    fun native(name: String, info: NativeField.Builder<M>.() -> Unit = {}): NativeField<M> =
//            TODO("not yet implemented")

    /**
     * Create a Reverse link between to entity.
     * This field don't really exist in the database.
     * @param name The name of the field
     * @param targetField A lambda with the targeted [Many2OneField]
     * @param info The builder to fieldSet additional info
     */
    protected fun <TM : Model<TM>> one2many(name: String, targetField: () -> Many2OneField<TM, M>,
                                            info: One2ManyField.Builder<M, TM>.() -> Unit = {}): One2ManyField<M, TM> =
            original.applyBuilder(One2ManyField.Builder(original, name, targetField), info)

    /**
     * Create a real link between to [StoredEntity]
     * @param name The name of the field/column in the database
     * @param target the Target  entity to use to create the link.
     * The field id is used to create de link
     * @param info The builder to fieldSet additionnal info
     */
    protected fun <TM : Model<TM>> many2one(name: String, target: TM, info: Many2OneField.Builder<M, TM>.() -> Unit = {}): Many2OneField<M, TM> =
            original.applyBuilder(Many2OneField.Builder(original, name, target), info)


    /**
     * Create a real link between two [StoredEntity], this link unique
     * @param name The name of the field/column in the database
     * @param target the Target  entity to use to create the link.
     * The field id is used to create de link
     * @param info The builder to fieldSet additional info
     * @see many2one if you don't wan't an unique link
     */
    protected fun <TM : Model<TM>> one2one(name: String, target: TM, info: One2OneField.Builder<M, TM>.() -> Unit = {}): One2OneField<M, TM> =
            original.applyBuilder(One2OneField.Builder(original, name, target), info)

    /**
     * Create a Reverse link between to entity.
     * This field don't really exist in the database.
     * @param name The name of the field
     * @param targetField A lambda with the targeted [Many2OneField]
     * @param info The builder to fieldSet additional info
     */
    protected fun <TM : Model<TM>> revOne2one(name: String, targetField: () -> One2OneField<TM, M>, info: RevOne2OneField.Builder<M, TM>.() -> Unit = {}): RevOne2OneField<M, TM> =
            original.applyBuilder(RevOne2OneField.Builder(original, name, targetField), info)


    protected infix fun NameModelField<M>.extends(function: NameModelField.Builder<M>.() -> Unit) {
        original.extends(function)
    }

    protected fun <KT : Any> ModelField<M, KT>.constraint(function: (Record<M>) -> Unit): ApiOneNoParamStacker<M, Unit> {
        return original.addOnChange(OnChangeType.SERVER, ApiOneNoParamStacker(function))
    }

    protected infix fun <R> ApiOneNoParamStacker<M, R>.extend(function: ApiOneNoParamExtends<M, R>.(Record<M>) -> R) {
        this.addExtend(function)
    }

    protected infix fun <P, R> ApiOneParamStacker<M, P, R>.extend(function: ApiOneParamExtends<M, P, R>.(Record<M>, P) -> R) {
        this.addExtend(function)
    }

    protected infix fun <R> ApiMultiNoParamStacker<M, R>.extend(function: ApiMultiNoParamExtends<M, R>.(Bag<M>) -> R) {
        this.addExtend(function)
    }

    protected infix fun <P, R> ApiMultiParamStacker<M, P, R>.extend(function: ApiMultiParamExtends<M, P, R>.(Bag<M>, P) -> R) {
        this.addExtend(function)
    }

    protected infix fun <R> ApiEmptyNoParamStacker<M, R>.extend(function: ApiEmptyNoParamExtends<M, R>.(RecordRepository<M>) -> R) {
        this.addExtend(function)
    }

    protected infix fun <P, R> ApiEmptyParamStacker<M, P, R>.extend(function: ApiEmptyParamExtends<M, P, R>.(RecordRepository<M>, P) -> R) {
        this.addExtend(function)
    }

//    protected fun <R> ApiMultiNoParamStacker<M, R>.addGroups(groups: GroupData.() -> Bag<GroupsData>) {
//        thisModel.addGroupsAccess(groups)
//    }
//
//    protected fun <R> ApiOneNoParamStacker<M, R>.addGroups(groups: GroupData.() -> Bag<GroupsData>) {
//        thisModel.addGroupsAccess(groups)
//    }
//
//    protected fun <R> ApiEmptyNoParamStacker<M, R>.addGroups(groups: GroupData.() -> Bag<GroupsData>) {
//        thisModel.addGroupsAccess(groups)
//    }
//
//
//    protected fun <P, R> ApiOneParamStacker<M, P, R>.addGroups(groups: GroupData.() -> Bag<GroupsData>) {
//        thisModel.addGroupsAccess(groups)
//    }
//
//    protected fun <P, R> ApiMultiParamStacker<M, P, R>.addGroups(groups: GroupData.() -> Bag<GroupsData>) {
//        thisModel.addGroupsAccess(groups)
//    }
//
//    protected fun <P, R> ApiEmptyParamStacker<M, P, R>.addGroups(groups: GroupData.() -> Bag<GroupsData>) {
//
//        thisModel.addGroupsAccess(groups)
//    }

    infix fun BinaryField<M>.extend(ext: BinaryField.Builder<M>.() -> Unit) {

    }

    infix fun BooleanField<M>.extend(ext: BooleanField.Builder<M>.() -> Unit) {

    }

    infix fun DateField<M>.extend(ext: DateField.Builder<M>.() -> Unit) {

    }

    infix fun DateTimeField<M>.extend(ext: DateTimeField.Builder<M>.() -> Unit) {

    }

    infix fun DecimalField<M>.extend(ext: DecimalField.Builder<M>.() -> Unit) {

    }

    infix fun IntField<M>.extend(ext: IntField.Builder<M>.() -> Unit) {

    }

    infix fun <TM : Model<TM>> Many2ManyField<M, TM>.extend(ext: Many2ManyField.Builder<M, TM>.() -> Unit) {

    }

    infix fun <TM : Model<TM>> Many2OneField<M, TM>.extend(ext: Many2OneField.Builder<M, TM>.() -> Unit) {

    }

    infix fun NameModelField<M>.extend(ext: NameModelField.Builder<M>.() -> Unit) {

    }

    infix fun <TM : Model<TM>> One2ManyField<M, TM>.extend(ext: One2ManyField.Builder<M, TM>.() -> Unit) {

    }

    infix fun <TM : Model<TM>> One2OneField<M, TM>.extend(ext: One2OneField.Builder<M, TM>.() -> Unit) {

    }

    infix fun <TM : Model<TM>> RevOne2OneField<M, TM>.extend(ext: RevOne2OneField.Builder<M, TM>.() -> Unit) {

    }

    infix fun <D : Selection<D>> SelectionField<M, D>.extend(ext: SelectionField.Builder<M, D>.() -> Unit) {

    }

    infix fun StringField<M>.extend(ext: StringField.Builder<M>.() -> Unit) {

    }

    infix fun TextField<M>.extend(ext: TextField.Builder<M>.() -> Unit) {

    }

    infix fun TimeField<M>.extend(ext: TimeField.Builder<M>.() -> Unit) {

    }

}