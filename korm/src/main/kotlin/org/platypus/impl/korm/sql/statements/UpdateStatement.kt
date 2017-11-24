package org.platypus.impl.korm.sql.statements

import org.platypus.impl.korm.sql.Column
import org.platypus.impl.korm.sql.ColumnSet
import org.platypus.impl.korm.sql.Op
import org.platypus.impl.korm.sql.QueryBuilder
import org.platypus.impl.korm.sql.Transaction
import org.platypus.impl.korm.sql.column.type.IColumnType
import org.platypus.impl.korm.sql.targetTables
import java.sql.PreparedStatement

open class UpdateStatement(val targetsSet: ColumnSet, val where: Op<Boolean>? = null, val limit: Int? = null): UpdateBuilder<Int>(StatementType.UPDATE, targetsSet.targetTables()) {

    open val firstDataSet: List<Pair<Column<*>, Any?>> get() = values.toList()

    override fun PreparedStatement.executeInternal(transaction: Transaction): Int {
        if (values.isEmpty()) return 0
        return executeUpdate()
    }

    override fun prepareSQL(transaction: Transaction): String = buildString {
        val builder = QueryBuilder(true)
        append("UPDATE ${targetsSet.describe(transaction)}")
        append(" SET ")
        append(firstDataSet.joinToString { (col, value) ->
            "${transaction.identity(col)}=" + builder.registerArgument(col, value)
        })

        where.let { append(" WHERE " + it!!.toSQL(builder)) }
        limit?.let { append(" LIMIT $it")}
    }


    override fun arguments(): Iterable<Iterable<Pair<IColumnType, Any?>>> = QueryBuilder(true).run {
        values.forEach {
            registerArgument(it.key, it.value)
        }
        where?.toSQL(this)
        if (args.isNotEmpty()) listOf(args) else emptyList()
    }

}
