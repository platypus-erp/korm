package org.platypus.orm.sql

import org.platypus.model.field.api.IModelField
import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.orm.sql.dml.DefaultValueMarker
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.transaction.TransactionExecutor
import java.util.*

class QueryBuilder(val prepared: Boolean = false) {
    val args = ArrayList<Pair<SqlFieldType, Any?>>()

    fun <T> registerArgument(executor: TransactionExecutor, column: IModelField<*, *>, argument: T): String = when (argument) {
        is Expression<*> -> argument.accept(executor.dialect.expressionVisitor, this)
//        DefaultValueMarker -> asLiteral(column.default!!).accept(executor.dialect.expressionVisitor, this)
        DefaultValueMarker -> TODO("Find a way to remove DefaultValueMarker")
        else -> registerArgument(column.type, argument)
    }

    fun <T> registerArgument(sqlType: SqlFieldType, argument: T) = registerArguments(sqlType, listOf(argument)).single()

    fun <T> registerArguments(sqlType: SqlFieldType, arguments: Iterable<T>): List<String> {
        val argumentsAndStrings = arguments.map { it to sqlType.valueToString(it) }.sortedBy { it.second }

        return argumentsAndStrings.map {
            if (prepared) {
                args.add(sqlType to it.first)
                "?"
            } else {
                it.second
            }
        }
    }
}

