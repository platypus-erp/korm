package org.platypus.orm.sql.dml

import org.platypus.PlatypusEnvironment
import org.platypus.model.IModel
import org.platypus.model.field.api.IModelField
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.query.Join


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


    fun join(otherTable: ColumnSet, joinType: Join.JoinType, onColumn: Expression<*>? = null, otherColumn: Expression<*>? = null, additionalConstraint: (() -> Expression<Boolean>)? = null): Join {
        return Join(this, otherTable, joinType, onColumn, otherColumn, additionalConstraint)
    }

    fun innerJoin(otherTable: ColumnSet): Join {
        return Join(this, otherTable)
    }

    fun leftJoin(otherTable: ColumnSet): Join {
        return Join(this, otherTable, Join.JoinType.LEFT)
    }

    fun crossJoin(otherTable: ColumnSet): Join {
        return Join(this, otherTable, Join.JoinType.CROSS)
    }


    fun slice(vararg columns: Expression<*>): FieldSet = Slice(this, setOf(*columns))
    fun slice(columns: Set<Expression<*>>): FieldSet = Slice(this, columns)
}

fun <C1 : ColumnSet, C2 : ColumnSet> C1.innerJoin(otherTable: C2, onColumn: C1.() -> Expression<*>, otherColumn: C2.() -> Expression<*>) = join(otherTable, Join.JoinType.INNER, onColumn(this), otherColumn(otherTable))

fun <C1 : ColumnSet, C2 : ColumnSet> C1.leftJoin(otherTable: C2, onColumn: C1.() -> Expression<*>, otherColumn: C2.() -> Expression<*>) = join(otherTable, Join.JoinType.LEFT, onColumn(), otherTable.otherColumn())

class Slice(override val source: ColumnSet, override val fieldsExpression: Set<Expression<*>>) : FieldSet

enum class UnionType {
    ALL,
}

