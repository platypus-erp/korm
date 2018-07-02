package org.platypus.model

import org.platypus.PlatypusEnvironment
import org.platypus.model.field.api.IModelField
import org.platypus.model.field.impl.FieldAlias

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

    override fun <PARAM : Any, RETURN : Any> accept(visitor: ModelVisitor<PARAM, RETURN>, p: PARAM): RETURN = visitor.visit(this, p)


    val tableNameWithAlias: String = "${delegate.tableName} AS $alias"

    @Suppress("UNCHECKED_CAST")
    operator fun <T1 : Any, F : IModelField<M, T1>> get(original: F): FieldAlias<M, T1> {
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