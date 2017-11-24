package org.platypus.impl.korm.sql.statements

import org.platypus.impl.korm.model.property.KormProperty
import org.platypus.impl.korm.sql.Column
import org.platypus.impl.korm.sql.Expression
import org.platypus.impl.korm.sql.KormTable
import java.util.*

/**
 * @author max
 */

abstract class UpdateBuilder<out T>(type: StatementType, targets: List<KormTable>) : Statement<T>(type, targets) {
    protected val values: MutableMap<Column<*>, Any?> = LinkedHashMap()

    open operator fun <S> set(column: Column<S>, value: S) {
        forceSet(column, value)
    }

    fun containsKey(column: Column<*>): Boolean = values.containsKey(column)
    fun containsKey(prop: KormProperty<*, out Any>): Boolean = containsKey(prop.column)

    internal fun forceSet(column: Column<*>, value: Any?) {
        if (!column.columnType.required && value == null) {
            error("Trying to set null to not required column $column")
        }
        if (value != null && containsKey(column)) {
            error("$column is already initialized")
        }
        if (value != null){
            values[column] = value
        }
    }

    open fun <S> update(column: Column<S>, value: Expression<S>) {
        if (values.containsKey(column)) {
            error("$column is already initialized")
        }
        values[column] = value
    }

    open fun <S> update(prop: KormProperty<*, S>, value: Expression<S>) {
        update(prop.column, value)
    }
}
