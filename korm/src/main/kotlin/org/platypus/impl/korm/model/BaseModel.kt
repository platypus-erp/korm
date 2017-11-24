package org.platypus.impl.korm.model

import com.beust.klaxon.JsonBase
import org.platypus.Platypus
import org.platypus.api.env.PlatypusEnvironement
import org.platypus.api.web.JsonEntityConverteur
import org.platypus.impl.korm.entity.*
import org.platypus.impl.korm.entity.stored.EmptyEntity
import org.platypus.impl.korm.exceptions.ColumnNotFound
import org.platypus.impl.korm.exceptions.Many2ManyColumnNotFound
import org.platypus.impl.korm.identifiants.*
import org.platypus.impl.korm.model.functions.PublicApiReturn
import org.platypus.impl.korm.model.functions.createResult
import org.platypus.impl.korm.model.functions.one.ApiOneNoParamStacker
import org.platypus.impl.korm.model.property.*
import org.platypus.impl.korm.sql.*
import org.platypus.impl.korm.sql.statements.DeleteStatement
import org.platypus.impl.korm.sql.statements.InsertStatement
import org.slf4j.LoggerFactory
import java.util.*
import kotlin.collections.ArrayList


class ModelTable(internal val model: BaseModel<*, *>, prop: KormPkProperty<*>) : IdTable(model.modelName) {

    val _id: Column<ModelID>

    init {
        _id = registerColumn<ModelID>(prop.name, prop.columnType).primaryKey()
        prop.setCol(_id)
    }

    override val id: Column<ModelID>
        get() = _id

    fun registerColumn(prop: KormIntegerProperty<*>) = regit(prop)

    private fun <T> regit(prop: KormProperty<*, T>) {
        prop.setCol(registerColumn(prop.name, prop.columnType))
        prop.column.dbDefaultValue = prop.slots.defaultValue ?: prop.asLiteralOrNull(prop.slots.default)
    }

    fun registerColumn(prop: KormFloatProperty<*>) = regit(prop)
    fun registerColumn(prop: KormDateProperty<*>) = regit(prop)
    fun registerColumn(prop: KormDateTimeProperty<*>) = regit(prop)
    fun registerColumn(prop: KormTimeProperty<*>) = regit(prop)

    fun registerColumn(prop: KormInternalVersionProperty<*>) = regit(prop)

    fun registerColumn(prop: KormExternalRefProperty<*>) = regit(prop)

    fun registerColumn(prop: KormBooleanProperty<*>) = regit(prop)

    fun registerColumn(prop: KormDecimalProperty<*>) = regit(prop)

    fun registerColumn(prop: KormLongProperty<*>) = regit(prop)

    fun registerColumn(prop: AbstractKormStringProperty<*>) = regit(prop)

    fun registerColumn(prop: KormSelectionProperty<*, *, *>) = regit(prop)

    fun <M : BaseModel<M, *>, T : BaseModel<T, *>> registerColumn(prop: KormManyToOneProperty<M, T>) {
        prop.setCol(reference(prop.name, prop.target.internalTable))
    }

    fun <M : BaseModel<M, *>, T : BaseModel<T, *>> registerColumn(prop: KormOneToManyProperty<M, T>) {
        prop.target().one2ManyTarget = prop
    }

    fun <M : BaseModel<M, *>, T : BaseModel<T, *>> registerColumn(prop: KormManyToManyProperty<M, T>) {
        Platypus.get().m2mregistry.getOrPut(prop.m2mTableName, { ManyToManyTable(prop.m2mTableName, prop, prop.relProp()) })
    }

}

class ManyToManyTable<M1 : BaseModel<M1, *>, M2 : BaseModel<M2, *>>
(tableName: String, prop1: KormManyToManyProperty<M1, M2>, prop2: KormManyToManyProperty<M2, M1>) : KormTable(tableName) {
    internal val col1 = reference(prop1.name, prop1.relProp().model.internalTable, onDelete = ReferenceOption.RESTRICT)
    internal val col2 = reference(prop2.name, prop2.relProp().model.internalTable, onDelete = ReferenceOption.RESTRICT)

    init {
        index(true, col1, col2)
        Platypus.get().m2mregistry[tableName] = this
    }

    private fun getCol(name: String): Column<ModelID> {
        return if (col1.name == name) {
            col1
        } else {
            col2
        }
    }

    fun insertRelation(prop1: KormManyToManyProperty<*, *>,
                       v1: Long,
                       prop2: KormManyToManyProperty<*, *>,
                       v2: Long): InsertStatement<Number> {
        return this.insert {
            it[getCol(prop1.name)] = ModelID(prop1.model, v1)
            it[getCol(prop2.name)] = ModelID(prop2.model, v2)
        }
    }


    fun insertRelation(prop1: Pair<KormManyToManyProperty<M1, M2>, Long>,
                       prop2: Pair<KormManyToManyProperty<M2, M1>, Long>) {
        this.insert {
            it[getCol(prop1.first.name)] = ModelID(prop1.first.model, prop1.second)
            it[getCol(prop2.first.name)] = ModelID(prop2.first.model, prop2.second)
        }
    }

    fun findIds(env: PlatypusEnvironement, prop: KormManyToManyProperty<*, *>, modelID: ModelID): ModelIDS {
        val id = env.cr.cache.realID(modelID)
        return if (id.isNotInDB()) {
            val col = getCol(prop.name)
            val relCol = getCol(prop.relProp().name)
            val q = this.slice(col).select { relCol eq id }
            q.map { it[col] }.toModelIds()
        } else {
            prop.model.emptyModelIds()
        }
    }
}

interface Model {
    val modelName: String
}

abstract class ColumnSetModel : ColumnSet, DdlAware {

    internal abstract val internalTable: ModelTable
    override val columns: List<Column<*>>
        get() = internalTable.columns

    override fun describe(s: Transaction): String {
        return internalTable.describe(s)
    }

    override fun join(otherTable: ColumnSet, joinType: JoinType, onColumn: Expression<*>?, otherColumn: Expression<*>?, additionalConstraint: (() -> Op<Boolean>)?): Join {
        return internalTable.join(otherTable, joinType, onColumn, otherColumn, additionalConstraint)
    }

    override fun innerJoin(otherTable: ColumnSet): Join {
        return internalTable.innerJoin(otherTable)
    }

    override fun leftJoin(otherTable: ColumnSet): Join {
        return internalTable.leftJoin(otherTable)
    }

    override fun crossJoin(otherTable: ColumnSet): Join {
        return internalTable.leftJoin(otherTable)
    }

    override fun createStatement(): List<String> {
        return internalTable.createStatement()
    }

    override fun modifyStatement(): List<String> {
        return internalTable.modifyStatement()
    }

    override fun dropStatement(): List<String> {
        return internalTable.dropStatement()
    }

    override fun toString(): String {
        return internalTable.toString()
    }

    val tableName
        get() = internalTable.tableName

    override fun equals(other: Any?): Boolean {
        return other is BaseModel<*, *> && this.internalTable == other.internalTable
    }

    override fun hashCode(): Int {
        return internalTable.hashCode()
    }
}

abstract class BaseModel<M : BaseModel<M, E>, E : Entity<E, M>>(override val modelName: String) : ColumnSetModel(), Model {

    protected val LOGGER = LoggerFactory.getLogger(modelName)

    private val sqlConstraints: MutableSet<SqlConstraint> = HashSet()
    @Suppress("UNCHECKED_CAST")
    protected val field by lazy { ModelPropertyCreatorImpl(this as M) }

    @Suppress("UNCHECKED_CAST")
    protected val api by lazy { ModelFunction(this as M) }
    val id = field.id
    override val internalTable = ModelTable(this, id)
    val externalRef = field.externalRef
    val internalVersion = field.internalVersion
    protected open val autoCreate = true
    open val displayNameExpr: Expression<String> = SqlConcat(externalRef, id)

    internal var _description: String = modelName
    open val modelHelp: String = _description

    fun checkConstaint(name: String, check: Op<Boolean>, msgError: String): SqlConstraint {
        val sqlConstraint = SqlConstraint(name, check, msgError)
        sqlConstraints.add(sqlConstraint)
        return sqlConstraint
    }


    //    TODO to take care, how to take mutli order like, name asc and code desc ?
    open val order: KormProperty<M, *> = id


    init {
        LOGGER.info("load $modelName")
    }

    val properties: Map<String, KormProperty<M, out Any>>
        get() = this@BaseModel.field.properties


    operator fun contains(f: String): Boolean = f in field


    internal fun freezeDDL() {
        val t = field.createKormTable(internalTable)
        if (this.autoCreate) {
            Platypus.get().tableRegistry[tableName] = t
        }
    }

    internal fun <M1 : BaseModel<M1, *>> getColM2M(model: M1): KormManyToManyProperty<M, M1> {
        return field.filter {
            it.columnType.modelColumnType == ModelColumnType.MANY_TO_MANY
                    && it is KormManyToManyProperty<*, *>
                    && it.relProp().model == model
        }.map { it as KormManyToManyProperty<M, M1> }.firstOrNull() ?: throw Many2ManyColumnNotFound(this, model)
    }

    internal fun getColM2MForName(colName: String): KormManyToManyProperty<M, *> {
        return field.filter {
            it.columnType.modelColumnType == ModelColumnType.MANY_TO_MANY
                    && it is KormManyToManyProperty<*, *>
                    && it.relProp().name == colName
        }.map { it as KormManyToManyProperty<M, *> }.firstOrNull() ?: throw ColumnNotFound(this, colName)
    }


    val store = api.public(
            fun(receiver: E): PublicApiReturn<E> {
                return createResult(receiver.env.cr.cache.scheduleInsert(this@BaseModel, receiver))
            }
    )

    val getById = api.public(
            fun(receiver: PlatypusEntityGetter<E, M>, id: Long): PublicApiReturn<E> {
                return createResult(receiver.loadInCache(this withId id))
            }
    )

    val delete = api.public(
            fun(receiver: E): PublicApiReturn<Int> {
                val stmt = DeleteStatement(internalTable, id eq receiver.id)
                return createResult(stmt.execute(receiver.env.cr) ?: 0)
            }
    ).onMulti(
            fun(receiver: Bag<E>): PublicApiReturn<Int> {
                val ids = receiver.values()
                val stmt = DeleteStatement(internalTable, id inList ids.ids)
                return createResult(stmt.execute(receiver.env.cr) ?: 0)
            }
    )

    val update = api.private(
            fun(self: E, param: Collection<Pair<KormProperty<*, *>, *>>) {
                for (prop in param) {
                    self.env.cr.cache.forceSet(this@BaseModel withId self.id, prop.first.column, prop.second)
                }
            }
    ).onMulti(
            fun(self: Bag<E>, param: Collection<Pair<KormProperty<*, *>, *>>) {
                for (rec in self) {
                    for (prop in param) {
                        rec.env.cr.cache.forceSet(this@BaseModel withId rec.id, prop.first.column, prop.second)
                    }
                }
            }
    )

    val toJson = api.private(
            fun(self: E, param: ToJsonParam): JsonBase {
                return JsonEntityConverteur.toJsonObj(self, param.lazy, param.pretty)
            }
    ).onMulti { bag, param ->
        JsonEntityConverteur.toJsonArray(bag, param.lazy, param.pretty)
    }

    val search = api.public(
            fun(empty: EmptyEntity<E, M>, param: SearchQueryParam<M>): PublicApiReturn<Bag<E>> {
                val query = if (param.fields.isNotEmpty()) {
                    val fieldToLoad = param.fields.toMutableSet()
                    fieldToLoad.add(id)
                    this@BaseModel.slice(fieldToLoad.map { it.column }).select(param.where)
                } else {
                    this@BaseModel.select(param.where)
                }
                if (param.limit > 0 && param.offset > 0) {
                    query.limit(param.limit, param.offset)
                }
                for ((col, asc) in param.orderBy) {
                    query.orderBy(col.column, asc)
                }
                return createResult(empty.bagOf(query))
            }
    )

    val defaulGet = api.private(
            fun(empty: PlatypusEntityGetter<E, M>): E {
                return empty.updateWith(false, null) { }
            }
    )

    internal open val _nameGet = api.public(
            fun(self: E): PublicApiReturn<String> {
                return PublicApiReturn(self.externalRef ?: modelName+self.id)
            }
    )
    val nameGet
        get() = _nameGet

    internal open val _nameSearch = api.public(
            fun(self: EmptyEntity<E, M>, param: NameSearchParam): PublicApiReturn<Bag<E>> {
                return search.call(self, SearchQueryParam(where = { param.where and param.operator(externalRef, param.value) }))
            }
    )
    val nameSearch
        get() = _nameSearch


}

data class NameSearchParam(val value: String,
                           val where: Op<Boolean> = intLiteral(1) eq 1,
                           val operator: (prop: AbstractKormStringProperty<*>, value: String) -> Op<Boolean> = { prop, value -> prop.ilike(value) },
                           val limit: Int = 20)

data class ToJsonParam(
        val lazy: LazyLoadType = LazyLoadType.NONE,
        val pretty: Boolean = false
)

enum class LazyLoadType {
    NONE, CHILDREN_ONLY, LINK, FULL, CHILDREN_AND_LINK
}

data class SearchQueryParam<SELF : BaseModel<SELF, *>>(
        val fields: MutableSet<KormProperty<SELF, *>> = mutableSetOf(),
        val where: () -> Op<Boolean> = { longLiteral(1).eq(1) },
        val limit: Int = 0,
        val orderBy: MutableList<Pair<KormProperty<SELF, *>, Boolean>> = mutableListOf(),
        val offset: Int = 0
)

data class BatchUpdateParam(
        var query: Op<Boolean>,
        var vals: Collection<Pair<KormProperty<*, *>, *>>
)


abstract class ModelNamed<M : ModelNamed<M, E>, E : NamedEntity<E, M>>(modelName: String) : BaseModel<M, E>(modelName) {
    val name = field.name
    val archived = field.archived
    override val displayNameExpr: Expression<String> = name

    fun KormNameProperty<M>.extend(
            label: String? = null,
            required: Boolean? = null,
            index: Boolean? = null,
            length: Int? = null,
            collate: String? = null,
            l10n: Boolean? = null) {
        this.slots.required = required ?: this.slots.required
        this.slots.label = label ?: this.slots.label
        this.slots.store = required ?: this.slots.store
        this.slots.length = length ?: this.slots.length
        this.slots.collate = collate ?: this.slots.collate
        this.slots.l10n = l10n ?: this.slots.l10n
        this.slots.index = index ?: this.slots.index
    }

    override val _nameSearch = api.public(
            fun(self: EmptyEntity<E, M>, param: NameSearchParam): PublicApiReturn<Bag<E>> {
                return search.call(self, SearchQueryParam(where = { param.where and param.operator(name, param.value) }))
            }
    )

    override val _nameGet: ApiOneNoParamStacker<E, M, PublicApiReturn<String>>
        get() = api.public(
                fun(self: E): PublicApiReturn<String> {
                    return PublicApiReturn(self.name)
                }
        )


//    fun ApiOneNoParamStacker<E, M, PublicApiReturn<E>>.extend(
//        funn:ApiNoParamExtends<E, E,M,PublicApiReturn<E>>.(E) -> PublicApiReturn<E>
//    ){
//        this.addExtend(funn)
//    }
}

abstract class MemoryModelNamed<SELF : MemoryModelNamed<SELF, RECEIVER>, RECEIVER : NamedEntity<RECEIVER, SELF>>(modelName: String) :
        ModelNamed<SELF, RECEIVER>(modelName) {
    override val autoCreate: Boolean = false
}

abstract class HierarchyModel<M : HierarchyModel<M, E>, E : HierarchicNamedEntity<E, M>>(modelName: String) : ModelNamed<M, E>(modelName) {

    abstract val parent: KormManyToOneProperty<M, M>
    abstract val children: KormOneToManyProperty<M, M>
    open val separator: String = "/"

    //TODO Implement he most efficient way (multiple join ? in ids ?)
    override val _nameSearch = api.public(
            fun(self: EmptyEntity<E, M>, param: NameSearchParam): PublicApiReturn<Bag<E>> {
                val (value, where, operator, limit) = param
                if (value.isNotBlank()) {
                    val names = LinkedList(value.split(separator).map { it.trim() })
                    val child = names.removeLast()
                    var domain = operator(this@HierarchyModel.name, child)
//                val j = Join(this)
//                this.join(this, JoinType.INNER, this.parent eq this.id)
                    return search.call(self, SearchQueryParam(where = { param.where and param.operator(name, value) }))
                }
                return PublicApiReturn(ArrayBag(self.env, this, { _ -> self }, emptyModelIds()))
            }
    )

    override val _nameGet: ApiOneNoParamStacker<E, M, PublicApiReturn<String>>
        get() = api.public(
                fun(self: E): PublicApiReturn<String> {
                    val res = ArrayList<String>()
                    var e: E = self
                    while (e.isEmpty()) {
                        res.add(e.name)
                        e = e.parent
                    }
                    return PublicApiReturn(res.reversed().joinToString(separator, " ", " "))
                }
        )
}


enum class ModelColumnType {
    MANY_TO_MANY,
    MANY_TO_ONE,
    ONE_TO_MANY,
    STRING,
    CHAR,
    INTEGER,
    LONG,
    FLOAT,
    DECIMAL,
    ENTITY_ID,
    UUID,
    DATE_TIME,
    TIME,
    DATE,
    ENUM,
    BOOLEAN,
    BLOB,
    BINARY
}
