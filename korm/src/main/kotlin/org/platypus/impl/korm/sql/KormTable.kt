package org.platypus.impl.korm.sql

import org.platypus.impl.korm.identifiants.ModelID
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.model.ModelTable
import org.platypus.impl.korm.sql.column.type.EntityIDColumnType
import org.platypus.impl.korm.sql.column.type.EnumerationColumnType
import org.platypus.impl.korm.sql.column.type.EnumerationNameColumnType
import org.platypus.impl.korm.sql.column.type.IColumnType
import org.platypus.impl.korm.sql.transactions.TransactionManager
import org.platypus.impl.korm.sql.vendors.currentDialect
import org.platypus.impl.korm.sql.vendors.inProperCase
import java.util.*

typealias JoinCondition = Pair<Expression<*>, Expression<*>>

interface FieldSet {
    val fields: List<Expression<*>>
    val source: ColumnSet
}

interface ColumnSet : FieldSet {
    val columns: List<Column<*>>
    override val fields: List<Expression<*>> get() = columns
    override val source
        get() = this

    fun describe(s: Transaction): String

    fun join(otherTable: ColumnSet, joinType: JoinType, onColumn: Expression<*>? = null, otherColumn: Expression<*>? = null, additionalConstraint: (() -> Op<Boolean>)? = null): Join
    fun innerJoin(otherTable: ColumnSet): Join
    fun leftJoin(otherTable: ColumnSet): Join
    fun crossJoin(otherTable: ColumnSet): Join

    fun slice(vararg columns: Expression<*>): FieldSet = Slice(this, listOf(*columns))
    fun slice(columns: List<Expression<*>>): FieldSet = Slice(this, columns)
}

fun <C1 : ColumnSet, C2 : ColumnSet> C1.innerJoin(otherTable: C2, onColumn: C1.() -> Expression<*>, otherColumn: C2.() -> Expression<*>) = join(otherTable, JoinType.INNER, onColumn(this), otherColumn(otherTable))

fun <C1 : ColumnSet, C2 : ColumnSet> C1.leftJoin(otherTable: C2, onColumn: C1.() -> Expression<*>, otherColumn: C2.() -> Expression<*>) = join(otherTable, JoinType.LEFT, onColumn(), otherTable.otherColumn())

class Slice(override val source: ColumnSet, override val fields: List<Expression<*>>) : FieldSet

enum class JoinType {
    INNER,
    LEFT,
    RIGHT,
    FULL,
    CROSS
}

class Join(val table: ColumnSet) : ColumnSet {

    constructor(table: ColumnSet, otherTable: ColumnSet, joinType: JoinType = JoinType.INNER, onColumn: Expression<*>? = null, otherColumn: Expression<*>? = null, additionalConstraint: (() -> Op<Boolean>)? = null) : this(table) {
        val new = if (onColumn != null && otherColumn != null) {
            join(otherTable, joinType, onColumn, otherColumn, additionalConstraint)
        } else {
            join(otherTable, joinType, additionalConstraint)
        }
        joinParts.addAll(new.joinParts)
    }

    internal class JoinPart(val joinType: JoinType, val joinPart: ColumnSet, val conditions: List<JoinCondition>, val additionalConstraint: (() -> Op<Boolean>)? = null) {
        init {
            if (joinType != JoinType.CROSS && conditions.isEmpty() && additionalConstraint == null)
                error("Missing join condition on $${this.joinPart}")
        }
    }

    internal val joinParts: ArrayList<JoinPart> = ArrayList()

    override infix fun innerJoin(otherTable: ColumnSet): Join = join(otherTable, JoinType.INNER)

    override infix fun leftJoin(otherTable: ColumnSet): Join = join(otherTable, JoinType.LEFT)

    override infix fun crossJoin(otherTable: ColumnSet): Join = join(otherTable, JoinType.CROSS)

    private fun join(otherTable: ColumnSet, joinType: JoinType = JoinType.INNER, additionalConstraint: (() -> Op<Boolean>)? = null): Join {
        val fkKeys = findKeys(this, otherTable) ?: findKeys(otherTable, this) ?: emptyList()
        when {
            joinType != JoinType.CROSS && fkKeys.isEmpty() && additionalConstraint == null ->
                error("Cannot join with $otherTable as there is no matching primary key/ foreign key pair and constraint missing")

            fkKeys.any { it.second.count() > 1 } && additionalConstraint == null -> {
                val references = fkKeys.joinToString(" & ") { "${it.first} -> ${it.second.joinToString { it.toString() }}" }
                error("Cannot join with $otherTable as there is multiple primary key <-> foreign key references.\n$references")
            }
            else -> return join(otherTable, joinType, fkKeys.map { it.first to it.second.single() }, additionalConstraint)
        }
    }

    override fun join(otherTable: ColumnSet, joinType: JoinType, onColumn: Expression<*>?, otherColumn: Expression<*>?, additionalConstraint: (() -> Op<Boolean>)?): Join {
        val cond = if (onColumn != null && otherColumn != null) {
            listOf(JoinCondition(onColumn, otherColumn))
        } else emptyList()
        return join(otherTable, joinType, cond, additionalConstraint)
    }

    private fun join(otherTable: ColumnSet, joinType: JoinType, cond: List<JoinCondition>, additionalConstraint: (() -> Op<Boolean>)?): Join =
            Join(table).also {
                it.joinParts.addAll(this.joinParts)
                it.joinParts.add(JoinPart(joinType, otherTable, cond, additionalConstraint))
            }


    private fun findKeys(a: ColumnSet, b: ColumnSet): List<Pair<Column<*>, List<Column<*>>>>? {
        val pkToFKeys = a.columns.map { a_pk ->
            a_pk to b.columns.filter { it.referee == a_pk }
        }.filter { it.second.isNotEmpty() }

        return if (pkToFKeys.isNotEmpty()) pkToFKeys else null
    }

    override fun describe(s: Transaction): String = buildString {
        append(table.describe(s))
        for (p in joinParts) {
            append(" ${p.joinType} JOIN ${p.joinPart.describe(s)}")
            if (p.joinType != JoinType.CROSS) {
                append(" ON ")
                val queryBuilder = QueryBuilder(false)
                append(p.conditions.joinToString(" AND ") { (pkColumn, fkColumn) ->
                    "${pkColumn.toSQL(queryBuilder)} = ${fkColumn.toSQL(queryBuilder)}"
                })

                if (p.additionalConstraint != null) {
                    if (p.conditions.isNotEmpty()) append(" AND ")
                    append(" (${(p.additionalConstraint)().toSQL(queryBuilder)})")
                }
            }
        }
    }

    override val columns: List<Column<*>>
        get() = joinParts.fold(table.columns) { r, j ->
            r + j.joinPart.columns
        }

    fun alreadyInJoin(table: KormTable) = joinParts.any { it.joinPart == table }
}

private fun String.normalize(): String {
    return this.replace('.', '_')
}

abstract class KormTable(name: String = "") : ColumnSet, DdlAware {
    val tableName = (if (name.isNotEmpty()) name.normalize() else this.javaClass.simpleName.removeSuffix("Table"))

    fun nameInDatabaseCase() = tableName.inProperCase()

    internal val _columns = HashMap<String, Column<*>>()
    override val columns: List<Column<*>>
        get() = _columns.values.toList()

    val autoIncColumn: Column<*>? get() = columns.firstOrNull { it.columnType.isAutoInc }


    override fun describe(s: Transaction): String = s.identity(this)

    val indices = ArrayList<Pair<Array<out Column<*>>, Boolean>>()

    override val fields: List<Expression<*>>
        get() = columns

    override fun join(otherTable: ColumnSet, joinType: JoinType, onColumn: Expression<*>?, otherColumn: Expression<*>?, additionalConstraint: (() -> Op<Boolean>)?): Join
            = Join(this, otherTable, joinType, onColumn, otherColumn, additionalConstraint)

    override infix fun innerJoin(otherTable: ColumnSet): Join = Join(this, otherTable, JoinType.INNER)

    override infix fun leftJoin(otherTable: ColumnSet): Join = Join(this, otherTable, JoinType.LEFT)

    override infix fun crossJoin(otherTable: ColumnSet): Join = Join(this, otherTable, JoinType.CROSS)

    fun <T> registerColumn(name: String, type: IColumnType): Column<T> = Column<T>(this, name, type).apply {
        _columns[name] = this
    }

    fun <TColumn : Column<*>> replaceColumn(oldColumn: Column<*>, newColumn: TColumn): TColumn {
        _columns.remove(oldColumn.name)
        _columns[newColumn.name] = newColumn
        return newColumn
    }

    fun Column<ModelID>.primaryKey(indx: Int? = null): Column<ModelID> {
        if (indx != null && table.columns.any { it.indexInPK == indx }) throw IllegalArgumentException("KormTable $tableName already contains PK at $indx")
        indexInPK = indx ?: table.columns.count { it.indexInPK != null } + 1
        return this
    }

    fun entityId(name: String, table: ModelTable): Column<ModelID> {
        val answer = Column<ModelID>(this, name, EntityIDColumnType(table.model))
        _columns[answer.name] = answer
        return answer
    }


    private fun <T> Column<T>.clone(columntype: IColumnType): Column<T> = Column(this@KormTable, this.name, columntype)

    fun <T : Enum<T>> enumeration(name: String, klass: Class<T>): Column<T> = registerColumn(name, EnumerationColumnType(klass))

    fun <T : Enum<T>> enumerationByName(name: String, length: Int, klass: Class<T>): Column<T> = registerColumn(name, EnumerationNameColumnType(klass, length))

    fun <T, S : T, C : Column<S>> C.references(ref: Column<T>, onDelete: ReferenceOption?): C = apply {
        referee = ref
        this.onDelete = onDelete
    }

    infix fun <T, S : T, C : Column<S>> C.references(ref: Column<T>): C = references(ref, null)

    fun reference(name: String, foreign: ModelTable, onDelete: ReferenceOption? = null): Column<ModelID> =
            entityId(name, foreign).references(foreign.id, onDelete)

    fun <T> reference(name: String, pkColumn: Column<T>): Column<T> {
        val column = Column<T>(this, name, pkColumn.columnType) references pkColumn
        _columns[column.name] = column
        return column
    }

    fun <T : Any> Column<T>.default(defaultValue: T): Column<T> {
        this.dbDefaultValue = run {
            asLiteral(defaultValue)
        }
        this.defaultValueFun = { defaultValue }
        return this
    }

    fun <T : Any> Column<T>.defaultExpression(defaultValue: Expression<T>): Column<T> {
        this.dbDefaultValue = defaultValue
        this.defaultValueFun = null
        return this
    }

    fun <T : Any> Column<T>.clientDefault(defaultValue: () -> T): Column<T> {
        this.defaultValueFun = defaultValue
        this.dbDefaultValue = null
        return this
    }

    fun index(isUnique: Boolean = false, vararg columns: Column<*>) {
        indices.add(columns to isUnique)
    }

    fun <T> Column<T>.index(isUnique: Boolean = false): Column<T> = apply {
        table.index(isUnique, this)
    }

    fun <T> Column<T>.uniqueIndex(): Column<T> = index(true)

    fun uniqueIndex(vararg columns: Column<*>) {
        index(true, *columns)
    }

    val ddl: List<String>
        get() = createStatement()

    override fun toString(): String {
        return tableName
    }

    override fun createStatement(): List<String> {
        val seqDDL = autoIncColumn?.autoIncSeqName?.let {
            Seq(it).createStatement()
        }.orEmpty()

        val createTableDDL = buildString {
            append("CREATE TABLE ")
            if (currentDialect.supportsIfNotExists) {
                append("IF NOT EXISTS ")
            }
            append(TransactionManager.current().identity(this@KormTable))
            if (columns.any()) {
                append(columns.joinToString(prefix = " (") { it.descriptionDdl() })
                if (columns.none { it.isOneColumnPK() }) {
                    primaryKeyConstraint()?.let {
                        append(", $it")
                    }
                }
                columns.filter { it.referee != null }.let { references ->
                    if (references.isNotEmpty()) {
                        append(references.joinToString(prefix = ", ", separator = ", ") { ForeignKeyConstraint.from(it).foreignKeyPart })
                    }
                }

                append(")")
            }
        }
        return seqDDL + createTableDDL
    }

    internal fun primaryKeyConstraint(): String? {
        var pkey = columns.filter { it.indexInPK != null }.sortedBy { it.indexInPK }
        if (pkey.isEmpty()) {
            pkey = columns.filter { it.columnType.isAutoInc }
        }
        if (pkey.isNotEmpty()) {
            return pkey.joinToString(
                    prefix = "CONSTRAINT ${TransactionManager.current().quoteIfNecessary("pk_$tableName")} PRIMARY KEY (", postfix = ")") {
                TransactionManager.current().identity(it)
            }
        }
        return null
    }

    override fun dropStatement(): List<String> {
        val dropTableDDL = buildString {
            append("DROP TABLE ")
            if (currentDialect.supportsIfNotExists) {
                append(" IF EXISTS ")
            }
            append(TransactionManager.current().identity(this@KormTable))
        }
        val seqDDL = autoIncColumn?.autoIncSeqName?.let {
            Seq(it).dropStatement()
        }.orEmpty()

        return listOf(dropTableDDL) + seqDDL
    }

    override fun modifyStatement() = throw UnsupportedOperationException("Use modify on columns and indices")

    override fun equals(other: Any?): Boolean {
        if (other !is KormTable) return false
        return other.tableName == tableName
    }

    override fun hashCode(): Int = tableName.hashCode()

}

data class Seq(private val name: String) {
    fun createStatement() = listOf("CREATE SEQUENCE $name")
    fun dropStatement() = listOf("DROP SEQUENCE $name")
}

fun ColumnSet.targetTables(): List<KormTable> = when (this) {
    is Alias<*> -> listOf(this.delegate)
    is QueryAlias -> this.query.set.source.targetTables()
    is KormTable -> listOf(this)
    is Join -> this.table.targetTables() + this.joinParts.flatMap { it.joinPart.targetTables() }
    is BaseModel<*,*> -> listOf(this.internalTable)
    else -> error("No target provided for update")
}