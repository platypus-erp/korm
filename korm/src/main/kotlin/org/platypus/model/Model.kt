package org.platypus.model

import org.platypus.PlatypusEnvironment
import org.platypus.PlatypusHandleAsField
import org.platypus.bag.Bag
import org.platypus.cache.modelID
import org.platypus.context.ContextKeyNonNull
import org.platypus.entity.FieldsWrite
import org.platypus.entity.PlatypusSelection
import org.platypus.entity.PlatypusSelectionCompanion
import org.platypus.entity.Record
import org.platypus.model.field.api.IModelField
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.api.OnChangeType
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
import org.platypus.model.field.impl.PKModelField
import org.platypus.model.field.impl.RealModelField
import org.platypus.model.field.impl.ReferenceField
import org.platypus.model.field.impl.RevOne2OneField
import org.platypus.model.field.impl.SelectionField
import org.platypus.model.field.impl.StringField
import org.platypus.model.field.impl.TextField
import org.platypus.model.field.impl.TimeField
import org.platypus.model.field.impl.WriteDateModelField
import org.platypus.model.field.impl.WriteUID
import org.platypus.model.functions.ModelFunction
import org.platypus.model.functions.PublicApiReturn
import org.platypus.model.functions.asResult
import org.platypus.model.functions.empty.ApiEmptyNoParamStacker
import org.platypus.model.functions.empty.ApiEmptyParamStacker
import org.platypus.model.functions.multi.ApiMultiNoParamStacker
import org.platypus.model.functions.multi.ApiMultiParamStacker
import org.platypus.model.functions.one.ApiOneNoParamExtends
import org.platypus.model.functions.one.ApiOneNoParamStacker
import org.platypus.model.functions.one.ApiOneParamExtends
import org.platypus.model.functions.one.ApiOneParamStacker
import org.platypus.module.base.entities.GroupData
import org.platypus.module.base.models.Groups
import org.platypus.orm.CheckConstraint
import org.platypus.orm.UniqueConstraint
import org.platypus.orm.sql.and
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.expression.TypedExpression
import org.platypus.orm.sql.query.SmartQueryBuilder
import org.platypus.orm.sql.select
import org.platypus.repository.RecordRepository
import org.platypus.repository.newTmpWithId
import org.platypus.utils.to_sneak_case
import java.util.*


/**
 * This is the base class of all Model in platypus
 * You need to choose a spacific impl for this models.
 * A Model is the representation a SQL Table DDL
 * @see ModelImplementations and it's chidren to pickup the best implementation
 * @constructor [modelName] the name of the should be valid against the regex [modelNameVadatorRegex]
 */
abstract class Model<M : Model<M>>(baseModelName: String, type: ModelType = ModelType.CLASSIC_MODEL) : IModel<M> {
    init {
//        if (!modelName.matches(modelNameValidatorRegex)) {
//            throw UnValidModelName(modelName)
//        }
    }



    protected val thisModel: M
        get() = this as M

    override val modelName: String = baseModelName.to_sneak_case().toLowerCase()

    private val privateReference: MutableSet<ReferenceField<*, M>> = HashSet()
    val reference: Set<ReferenceField<*, M>>
        get() = privateReference

    internal val internalFields = HashSet<IModelField<M, *>>()
    override val fields: Set<IModelField<M, *>>
        get() = internalFields

    override val fieldsExpression: Set<Expression<*>>
        get() = internalFields.filter { it.store }.toSet()

    internal val storeFields: Set<RealModelField<M, *>>
        get() = internalFields.filter { it.store }.map { it as RealModelField<M, *> }.toSet()

    private val mixin = HashMap<MixinModel<M>, MixinType>()

    override val id: PKModelField<M> = PKModelField(thisModel)
    val name: NameModelField<M> = NameModelField(thisModel)
    val externalRef: ExternalRefModelField<M> = ExternalRefModelField(thisModel)
    val archived = ArchivedModelField(thisModel)
    val createUid = CreateUID(thisModel)
    val writeUid = WriteUID(thisModel)
    val createDate: CreateDateModelField<M> = CreateDateModelField(thisModel)
    val writeDate: WriteDateModelField<M> = WriteDateModelField(thisModel)

    init {
        internalFields.add(id)
        internalFields.add(name)
        internalFields.add(externalRef)
        internalFields.add(archived)
        internalFields.add(createUid)
        internalFields.add(writeUid)
        internalFields.add(createDate)
        internalFields.add(writeDate)
    }

    protected fun <MIX : MixinModel<M>> mixin(mixin: MIX, mixinType: MixinType = MixinType.EMBEDDED): MIX {
        this.mixin[mixin] = mixinType
        return mixin
    }

    internal fun referencedBy(field: ReferenceField<*, M>) {
        privateReference.add(field)
    }


    override fun describe(env: PlatypusEnvironment): String {
        return env.internal.dialect.identity(thisModel)
    }

    override fun targetTables(): List<IModel<*>> {
        return listOf(this)
    }

    private val _slots = ModelSlotsImpl(type)
    /**
     * Some additional information of the models
     */
    override val slots: ModelSlots
        get() = _slots

    var modelHelp: String
        get() = _slots.help ?: "Contains all the $modelLabel of the ERP"
        protected set(value) {
            _slots.help = value
        }

    var modelLabel: String
        get() = _slots.label ?: modelName
        protected set(value) {
            _slots.label = value
        }

    override fun <PARAM : Any, RETURN : Any> accept(visitor: ModelVisitor<PARAM, RETURN>, p: PARAM): RETURN = visitor.visit(this, p)


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Model<*>

        if (modelName != other.modelName) return false

        return true
    }

    override fun toString(): String {
        return "Model[$modelName]"
    }

    override fun hashCode(): Int {
        return modelName.hashCode()
    }


    protected val api = ModelFunction(thisModel)


    private val sqlCheck = HashMap<String, CheckConstraint<M>>()
    private val sqlUnique = HashMap<String, UniqueConstraint<M>>()


    protected fun check(name: String, errorMsg: String? = null, checkPredicate: M.() -> Expression<Boolean>) {
        sqlCheck[name] = CheckConstraint(name, errorMsg, checkPredicate)
    }

    protected fun unique(name: String, errorMsg: String? = null, vararg fields: RealModelField<M, *>) {
        sqlUnique[name] = UniqueConstraint(name, errorMsg, fields.toSet())
    }

    val nameGet = api.public("nameGet",
            fun(self: Record<M>): PublicApiReturn<String> {
                return (self.name ?: "").asResult()
            }
    )

    @PlatypusHandleAsField
    val nameExpr = api.private("nameExpr",
            fun(self: RecordRepository<M>): Set<ModelField<M, *>> {
                return setOf(self.model.name)
            }
    )

    val getById = api.public("getById",
            fun(repo: RecordRepository<M>, id: Int): PublicApiReturn<Record<M>> {
                return repo.fetch(id).asResult()
            }
    )

    val create = api.public("create",
            fun(self: Record<M>): PublicApiReturn<Record<M>> {
                return self.asResult()
            }
    )

    val update = api.private("update",
            fun(self: Record<M>, fieldsWrited: FieldsWrite<M>) {
                for (d in fieldsWrited) {
                    self.warmCache().put(d.key, self.modelID, d.value)
                }
            }
    )

    val delete = api.public("delete",
            fun(self: Record<M>): PublicApiReturn<Int> {
                return 0.asResult()
            }
    )

    /**Search for records that have a display name matching the given
     * ``name`` pattern when compared with the given ``operator``, while also
     * matching the optional search domain (``args``).
     *
     * This is used for example to provide suggestions based on a partial
     * value for a relational field. Sometimes be seen as the inverse
     * function of :meth:`~.name_get`, but it is not guaranteed to be.
     *
     * This method is equivalent to calling :meth:`~.search` with a search
     * domain based on ``display_name`` and then :meth:`~.name_get` on the
     * result of the search.
     *
     * :param str name: the name pattern to match
     * :param list args: optional search domain (see :meth:`~.search` for
     * syntax), specifying further restrictions
     * :param str operator: domain operator for matching ``name``, such as
     * ``'like'`` or ``'='``.
     * @param int limit: optional max number of records to return
     * @rtype: list
     * @return: list of pairs ``(id, text_repr)`` for all matching records.
     **/
    val nameSearch = api.public("nameSearch",
            fun(self: RecordRepository<M>, param: NameSearchParam): PublicApiReturn<String> {
                val op = param.operator(this@Model.name, param.value)
//                TODO test if value is not blank and operator is not like
//                See Odoo v9 impl
                val where = if (param.where != null) {
                    param.where.and(op)
                } else {
                    op
                }

                //TODO create a field extractor from an expression with a visitor
                val res = self.search {
                    limit(param.limit)
                    where {
                        where
                    }
                }
                return res.associate { it.id to it.displayName }.asResult()
            }
    )

    val search = api.public("search",
            fun(empty: RecordRepository<M>, param: SearchQueryParam<M>): PublicApiReturn<Bag<M>> {
                val query = if (param.fields.isNotEmpty()) {
                    val fieldToLoad :MutableSet<Expression<*>> = param.fields.filter { it.store }.toMutableSet()
                    fieldToLoad.add(id)
                    thisModel.slice(fieldToLoad).select(empty.env, param.where)
                } else {
                    thisModel.select(empty.env, param.where)
                }
                if (param.limit > 0 && param.offset > 0) {
                    query.limit(param.limit, param.offset)
                }
                for ((col, asc) in param.orderBy) {
                    query.orderBy(col, asc)
                }
                return empty.bagOf(query).asResult()
            }
    )

    val otherSearch = api.public("otherSearch",
            fun(empty: RecordRepository<M>, query: SmartQueryBuilder<M>.(M) -> Unit): PublicApiReturn<Bag<M>> {
                val q = SmartQueryBuilder(empty.model)
                q.query(empty.model)
                return empty.bagOf(q.buildQuery(empty.env)).asResult()
            }
    )

    val defaulGet = api.private("defaulGet",
            fun(empty: RecordRepository<M>): Record<M> {
                return empty.newTmpWithId(false, null) { }
            }
    )


    fun string(name: String, info: StringField.Builder<M>.() -> Unit = {}): StringField<M> =
            StringField.Builder(thisModel, name).registerField(info)

    fun date(name: String, info: DateField.Builder<M>.() -> Unit = {}): DateField<M> =
            DateField.Builder(thisModel, name).registerField(info)

    fun dateTime(name: String, info: DateTimeField.Builder<M>.() -> Unit = {}): DateTimeField<M> =
            DateTimeField.Builder(thisModel, name).registerField(info)

    fun time(name: String, info: TimeField.Builder<M>.() -> Unit = {}): TimeField<M> =
            TimeField.Builder(thisModel, name).registerField(info)

    fun boolean(name: String, info: BooleanField.Builder<M>.() -> Unit = {}): BooleanField<M> =
            BooleanField.Builder(thisModel, name).registerField(info)

    fun text(name: String, info: TextField.Builder<M>.() -> Unit = {}): TextField<M> =
            TextField.Builder(thisModel, name).registerField(info)

    fun decimal(name: String, info: DecimalField.Builder<M>.() -> Unit = {}): DecimalField<M> =
            DecimalField.Builder(thisModel, name).registerField(info)

    fun integer(name: String, info: IntField.Builder<M>.() -> Unit = {}): IntField<M> =
            IntField.Builder(thisModel, name).registerField(info)

    fun binary(name: String, info: BinaryField.Builder<M>.() -> Unit = {}): BinaryField<M> =
            BinaryField.Builder(thisModel, name).registerField(info)

    fun <TM : Model<TM>> many2many(name: String, target: ModelMany2Many.() -> LinkModel<M, TM>, info: Many2ManyField.Builder<M, TM>.() -> Unit = {}): Many2ManyField<M, TM> {
        return Many2ManyField.Builder(thisModel, name, target).registerField(info)
    }

    fun <TM : Model<TM>> many2manyR(name: String, target: ModelMany2Many.() -> LinkModel<TM, M>, info: Many2ManyField.Builder<M, TM>.() -> Unit = {}): Many2ManyField<M, TM> {
        return Many2ManyField.Builder(thisModel, name, { target(ModelMany2Many).reverse }).registerField(info)
    }

    fun <D : PlatypusSelection<M>> selection(name: String, selection: PlatypusSelectionCompanion<M, D>, info: SelectionField.Builder<M, D>.() -> Unit = {}): SelectionField<M, D> =
            SelectionField.Builder(thisModel, name, selection).registerField(info)

    fun <MT : Model<MT>, KT, F : ModelField<MT, KT>>
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
    fun <TM : Model<TM>> one2many(name: String, targetField: () -> Many2OneField<TM, M>,
                                  info: One2ManyField.Builder<M, TM>.() -> Unit = {}): One2ManyField<M, TM> =
            One2ManyField.Builder(thisModel, name, targetField).registerField(info)

    /**
     * Create a real link between to [StoredEntity]
     * @param name The name of the field/column in the database
     * @param target the Target  entity to use to create the link.
     * The field id is used to create de link
     * @param info The builder to fieldSet additionnal info
     */
    fun <TM : Model<TM>> many2one(name: String, target: TM, info: Many2OneField.Builder<M, TM>.() -> Unit = {}): Many2OneField<M, TM> =
            Many2OneField.Builder(thisModel, name, target).registerField(info)


    /**
     * Create a real link between two [StoredEntity], this link unique
     * @param name The name of the field/column in the database
     * @param target the Target  entity to use to create the link.
     * The field id is used to create de link
     * @param info The builder to fieldSet additional info
     * @see many2one if you don't wan't an unique link
     */
    fun <TM : Model<TM>> one2one(name: String, target: TM, info: One2OneField.Builder<M, TM>.() -> Unit = {}): One2OneField<M, TM> =
            One2OneField.Builder(thisModel, name, target).registerField(info)

    /**
     * Create a Reverse link between to entity.
     * This field don't really exist in the database.
     * @param name The name of the field
     * @param targetField A lambda with the targeted [Many2OneField]
     * @param info The builder to fieldSet additional info
     */
    fun <TM : Model<TM>> revOne2many(name: String, targetField: () -> One2OneField<TM, M>, info: RevOne2OneField.Builder<M, TM>.() -> Unit = {}): RevOne2OneField<M, TM> =
            RevOne2OneField.Builder(thisModel, name, targetField).registerField(info)


    private fun <B : ModelField.Builder<M, FIELD>,
            FIELD : ModelField<M, *>>
            B.registerField(info: B.() -> Unit): FIELD {
        this.info()
        val f = this.build()
        internalFields.add(f)
        return f
    }


    infix fun NameModelField<M>.extends(function: NameModelField.Builder<M>.() -> Unit) {
        this@Model.extends(function)
    }

    fun <KT : Any> ModelField<M, KT>.constraint(function: (Record<M>) -> Unit): ApiOneNoParamStacker<M, Unit> {
        return this@Model.addOnChange(OnChangeType.SERVER, ApiOneNoParamStacker(function))
    }

    protected infix fun <R> ApiOneNoParamStacker<M, R>.extends(function: ApiOneNoParamExtends<M, R>.(Record<M>) -> R) {
        this.addExtend(function)
    }

    protected infix fun <P, R> ApiOneParamStacker<M, P, R>.extends(function: ApiOneParamExtends<M, P, R>.(Record<M>, P) -> R) {
        this.addExtend(function)
    }

    protected fun <R> ApiMultiNoParamStacker<M, R>.addGroups(groups: GroupData.() -> Bag<Groups>) {
        thisModel.addGroupsAccess(groups)
    }

    protected fun <R> ApiOneNoParamStacker<M, R>.addGroups(groups: GroupData.() -> Bag<Groups>) {
        thisModel.addGroupsAccess(groups)
    }

    protected fun <R> ApiEmptyNoParamStacker<M, R>.addGroups(groups: GroupData.() -> Bag<Groups>) {
        thisModel.addGroupsAccess(groups)
    }


    protected fun <P, R> ApiOneParamStacker<M, P, R>.addGroups(groups: GroupData.() -> Bag<Groups>) {
        thisModel.addGroupsAccess(groups)
    }

    protected fun <P, R> ApiMultiParamStacker<M, P, R>.addGroups(groups: GroupData.() -> Bag<Groups>) {
        thisModel.addGroupsAccess(groups)
    }

    protected fun <P, R> ApiEmptyParamStacker<M, P, R>.addGroups(groups: GroupData.() -> Bag<Groups>) {

        thisModel.addGroupsAccess(groups)
    }


}

data class NameSearchParam(
        val value: String = "",
        val where: Expression<Boolean>? = null,
        val operator: (nameExpr: TypedExpression<String>, value: String) -> Expression<Boolean> = { e, v -> e.eq(v) },
        val limit: Int = 100
)

val RecursiveDisplayName = ContextKeyNonNull("recursive_diplay_name", "short")


