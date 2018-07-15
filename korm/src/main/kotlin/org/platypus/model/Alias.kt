package org.platypus.model

import org.platypus.PlatypusEnvironment
import org.platypus.model.field.api.IModelField
import org.platypus.model.field.impl.FieldAlias
import org.platypus.orm.sql.dml.ColumnSet
import org.platypus.orm.sql.dml.FieldSet
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.query.Join

class Alias<M : IModel<M>>(val delegate: M, val alias: String) : IModel<M> by delegate {

//    override val id: PKModelField<T, E>
//        get() = delegate.id
//    override val name: NameModelField<T, E>
//        get() = delegate.name

    override val modelName: String
        get() = alias

    override fun describe(env: PlatypusEnvironment): String {
        return tableNameWithAlias
    }

    override fun targetTables(): List<IModel<*>> {
        return listOf(delegate)
    }

    override val source: ColumnSet
        get() = this

    override fun join(otherTable: ColumnSet, joinType: Join.JoinType, onColumn: Expression<*>?, otherColumn: Expression<*>?, additionalConstraint: (() -> Expression<Boolean>)?): Join {
        return super.join(otherTable, joinType, onColumn, otherColumn, additionalConstraint)
    }

    override fun innerJoin(otherTable: ColumnSet): Join {
        return super.innerJoin(otherTable)
    }

    override fun leftJoin(otherTable: ColumnSet): Join {
        return super.leftJoin(otherTable)
    }

    override fun crossJoin(otherTable: ColumnSet): Join {
        return super.crossJoin(otherTable)
    }

    override fun slice(vararg columns: Expression<*>): FieldSet {
        return super.slice(*columns)
    }

    override fun slice(columns: Set<Expression<*>>): FieldSet {
        return super.slice(columns)
    }

    override fun <PARAM : Any, RETURN : Any> accept(visitor: ModelVisitor<PARAM, RETURN>, p: PARAM): RETURN = visitor.visit(this, p)


    val tableNameWithAlias: String = "${delegate.tableName} AS $alias"

    @Suppress("UNCHECKED_CAST")
    operator fun <T1 : Any, F : IModelField<M, T1>> get(original: F): FieldAlias<M, T1> {
        return FieldAlias(original, this)
    }

    fun <T:Any>getExpression(original: IModelField<M,T>): Expression<*> {
        return FieldAlias(original, this)
    }




    override fun equals(other: Any?): Boolean {
        if (other !is Alias<*>) return false
        return this.tableNameWithAlias == other.tableNameWithAlias
    }

    override fun toString(): String {
        return tableNameWithAlias
    }

    override fun hashCode(): Int = tableNameWithAlias.hashCode()
}