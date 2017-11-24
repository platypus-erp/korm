package org.chmuche.korm.sql.statements

import org.chmuche.korm.sql.Column
import org.chmuche.korm.sql.ColumnSet
import org.chmuche.korm.sql.Op
import org.chmuche.korm.sql.QueryBuilder
import org.chmuche.korm.sql.Transaction
import org.chmuche.korm.sql.column.type.IColumnType
import org.chmuche.korm.sql.targetTables
import java.sql.PreparedStatement

open class UpdateStatement(val targetsSet: ColumnSet, val limit: Int?, val where: Op<Boolean>? = null): UpdateBuilder<Int>(StatementType.UPDATE, targetsSet.targetTables()) {

    open val firstDataSet: List<Pair<Column<*>, Any?>> get() = values.toList()

    override fun PreparedStatement.executeInternal(transaction: Transaction): Int {
        if (values.isEmpty()) return 0
        transaction.flushCache()
        return executeUpdate().apply {
            transaction.entityCache.removeTablesReferrers(targetsSet.targetTables())
        }
    }

    override fun prepareSQL(transaction: Transaction): String = buildString {
        val builder = QueryBuilder(true)
        append("UPDATE ${targetsSet.describe(transaction)}")
        append(" SET ")
        append(firstDataSet.joinToString { (col, value) ->
            "${transaction.identity(col)}=" + builder.registerArgument(col, value)
        })

        where?.let { append(" WHERE " + it.toSQL(builder)) }
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
