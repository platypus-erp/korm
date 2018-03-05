package org.platypus.orm.sql.dml.statements

import org.platypus.PlatypusEnvironment
import org.platypus.model.IModel
import org.platypus.model.field.api.IModelField
import org.platypus.orm.sql.dml.Statement
import org.platypus.orm.sql.dml.StatementType
import org.platypus.orm.sql.expression.Expression
import java.util.*

/**
 * @author max
 */

abstract class UpdateBuilder<out T>(protected val env: PlatypusEnvironment, type: StatementType, targets: List<IModel<*>>) : Statement<T>(env.internal.cr, type, targets) {
    protected val values: MutableMap<IModelField<*, *>, Any?> = LinkedHashMap()

    open operator fun <S : Any> set(column: IModelField<*,  S>, value: S) {
        forceSet(column, value)
    }

    fun containsKey(column: IModelField<*, *>): Boolean = values.containsKey(column)

    internal fun forceSet(column: IModelField<*, *>, value: Any?) {
        if (!column.required && value == null) {
            error("Trying to fieldSet null to not required column $column")
        }
        if (value != null && containsKey(column)) {
            error("$column is already initialized")
        }
        if (value != null) {
            values[column] = value
        }
    }

    open fun <S : Any> update(column: IModelField<*,  S>, value: Expression<S>) {
        if (values.containsKey(column)) {
            error("$column is already initialized")
        }
        values[column] = value
    }
}
