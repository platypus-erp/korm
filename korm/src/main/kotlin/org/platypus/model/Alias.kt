package org.platypus.model

import org.platypus.model.field.impl.FieldAlias
import org.platypus.model.field.impl.RealModelField
import org.platypus.orm.sql.dml.ColumnSet
import org.platypus.orm.sql.dml.Join
import org.platypus.orm.sql.dml.JoinType
import org.platypus.orm.sql.expression.Expression

class Alias<M : Model<M>>(val delegate: M, val alias: String) : IModel<M> by delegate {

//    override val id: PKModelField<T, E>
//        get() = delegate.id
//    override val name: NameModelField<T, E>
//        get() = delegate.name

    override val modelName: String
        get() = alias

    override fun targetTables(): List<IModel<*>> {
        return listOf(delegate)
    }

    override fun join(otherTable: ColumnSet, joinType: JoinType, onColumn: Expression<*>?, otherColumn: Expression<*>?, additionalConstraint: (() -> Expression<Boolean>)?): Join {
        TODO("not implemented")
    }

    override fun innerJoin(otherTable: ColumnSet): Join {
        TODO("not implemented")
    }

    override fun leftJoin(otherTable: ColumnSet): Join {
        TODO("not implemented")
    }

    override fun crossJoin(otherTable: ColumnSet): Join {
        TODO("not implemented")
    }

    override fun <PARAM : Any, RETURN : Any> accept(visitor: ModelVisitor<PARAM, RETURN>, p: PARAM): RETURN = visitor.visit(this, p)


    val tableNameWithAlias: String = "${delegate.tableName} AS $alias"

    @Suppress("UNCHECKED_CAST")
    operator fun <T1 : Any> get(original: RealModelField<M, T1>): FieldAlias<M, T1> {
        return FieldAlias(original, this)
    }


    override fun equals(other: Any?): Boolean {
        if (other !is Alias<*>) return false
        return this.tableNameWithAlias == other.tableNameWithAlias
    }

    override fun hashCode(): Int = tableNameWithAlias.hashCode()
}