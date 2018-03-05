package org.platypus.orm.sql.dml

import org.platypus.PlatypusEnvironment
import org.platypus.model.IModel
import org.platypus.model.field.api.IModelField
import org.platypus.orm.sql.QueryBuilder
import org.platypus.orm.sql.expression.Expression
import java.util.*


typealias JoinCondition = Pair<Expression<*>, Expression<*>>

interface FieldSet {
    val fieldsExpression: Set<Expression<*>>
    val source: ColumnSet
}

val ColumnSet.storeFields: Set<IModelField<*, *>>
    get() = fields.filter { it.store }.toSet()

interface ColumnSet : FieldSet {
    val fields: Set<IModelField<*, *>>
    override val fieldsExpression: Set<Expression<*>> get() = fields
    override val source: ColumnSet
        get() = this

    fun targetTables(): List<IModel<*>>


    fun describe(env: PlatypusEnvironment): String {
        TODO("not implemented")
    }


    fun join(otherTable: ColumnSet, joinType: JoinType, onColumn: Expression<*>? = null, otherColumn: Expression<*>? = null, additionalConstraint: (() -> Expression<Boolean>)? = null): Join {
        return Join(this, otherTable, joinType, onColumn, otherColumn, additionalConstraint)
    }

    fun innerJoin(otherTable: ColumnSet): Join {
        return Join(this, otherTable)
    }

    fun leftJoin(otherTable: ColumnSet): Join {
        return Join(this, otherTable, JoinType.LEFT)
    }

    fun crossJoin(otherTable: ColumnSet): Join {
        return Join(this, otherTable, JoinType.CROSS)
    }


    fun slice(vararg columns: Expression<*>): FieldSet = Slice(this, setOf(*columns))
    fun slice(columns: Set<Expression<*>>): FieldSet = Slice(this, columns)
}

fun <C1 : ColumnSet, C2 : ColumnSet> C1.innerJoin(otherTable: C2, onColumn: C1.() -> Expression<*>, otherColumn: C2.() -> Expression<*>) = join(otherTable, JoinType.INNER, onColumn(this), otherColumn(otherTable))

fun <C1 : ColumnSet, C2 : ColumnSet> C1.leftJoin(otherTable: C2, onColumn: C1.() -> Expression<*>, otherColumn: C2.() -> Expression<*>) = join(otherTable, JoinType.LEFT, onColumn(), otherTable.otherColumn())

class Slice(override val source: ColumnSet, override val fieldsExpression: Set<Expression<*>>) : FieldSet

enum class JoinType {
    INNER,
    LEFT,
    RIGHT,
    FULL,
    CROSS
}

enum class UnionType {
    ALL,
}

class Join(val table: ColumnSet) : ColumnSet {

    constructor(table: ColumnSet, otherTable: ColumnSet, joinType: JoinType = JoinType.INNER, onColumn: Expression<*>? = null, otherColumn: Expression<*>? = null, additionalConstraint: (() -> Expression<Boolean>)? = null) : this(table) {
        val new = if (onColumn != null && otherColumn != null) {
            join(otherTable, joinType, onColumn, otherColumn, additionalConstraint)
        } else {
            join(otherTable, joinType, additionalConstraint)
        }
        joinParts.addAll(new.joinParts)
    }

    internal class JoinPart(val joinType: JoinType, val joinPart: ColumnSet, val conditions: List<JoinCondition>, val additionalConstraint: (() -> Expression<Boolean>)? = null) {
        init {
            if (joinType != JoinType.CROSS && conditions.isEmpty() && additionalConstraint == null)
                error("Missing join condition on $${this.joinPart}")
        }
    }

    internal val joinParts: ArrayList<JoinPart> = ArrayList()

    override infix fun innerJoin(otherTable: ColumnSet): Join = join(otherTable, JoinType.INNER)

    override infix fun leftJoin(otherTable: ColumnSet): Join = join(otherTable, JoinType.LEFT)

    override infix fun crossJoin(otherTable: ColumnSet): Join = join(otherTable, JoinType.CROSS)

    private fun join(otherTable: ColumnSet, joinType: JoinType = JoinType.INNER, additionalConstraint: (() -> Expression<Boolean>)? = null): Join {
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

    override fun join(otherTable: ColumnSet, joinType: JoinType, onColumn: Expression<*>?, otherColumn: Expression<*>?, additionalConstraint: (() -> Expression<Boolean>)?): Join {
        val cond = if (onColumn != null && otherColumn != null) {
            listOf(JoinCondition(onColumn, otherColumn))
        } else emptyList()
        return join(otherTable, joinType, cond, additionalConstraint)
    }

    private fun join(otherTable: ColumnSet, joinType: JoinType, cond: List<JoinCondition>, additionalConstraint: (() -> Expression<Boolean>)?): Join =
            Join(table).also {
                it.joinParts.addAll(this.joinParts)
                it.joinParts.add(JoinPart(joinType, otherTable, cond, additionalConstraint))
            }


    private fun findKeys(a: ColumnSet, b: ColumnSet): List<Pair<IModelField<*, *>, List<IModelField<*, *>>>>? {
        val pkToFKeys = a.fields.map { a_pk ->
            a_pk to b.fields.filter { it.accept(RefereeExistFinder, a_pk) }
        }.filter { it.second.isNotEmpty() }

        return if (pkToFKeys.isNotEmpty()) pkToFKeys else null
    }

    override fun describe(env: PlatypusEnvironment): String = buildString {
        append(table.describe(env))
        for (p in joinParts) {
            append(" ${p.joinType} JOIN ${p.joinPart.describe(env)}")
            if (p.joinType != JoinType.CROSS) {
                append(" ON ")
                val queryBuilder = QueryBuilder(false)
                append(p.conditions.joinToString(" AND ") { (pkColumn, fkColumn) ->
                    "${pkColumn.accept(env.internal.dialect.expressionVisitor, queryBuilder)} = ${fkColumn.accept(env.internal.dialect.expressionVisitor, queryBuilder)}"
                })

                if (p.additionalConstraint != null) {
                    if (p.conditions.isNotEmpty()) {
                        append(" AND ")
                    }
                    append("(")
                    (p.additionalConstraint)().accept(env.internal.dialect.expressionVisitor, queryBuilder)
                    append(")")
                }
            }
        }
    }

    override val fields: Set<IModelField<*, *>>
        get() = joinParts.fold(table.fields) { r, j ->
            r + j.joinPart.fields
        }

    fun alreadyInJoin(table: ColumnSet) = joinParts.any { it.joinPart == table }

    override fun targetTables(): List<IModel<*>> =
            this.table.targetTables() + this.joinParts.flatMap { it.joinPart.targetTables() }

}