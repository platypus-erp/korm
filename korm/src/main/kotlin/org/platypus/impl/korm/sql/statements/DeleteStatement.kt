package org.platypus.impl.korm.sql.statements

import org.platypus.impl.korm.sql.KormTable
import org.platypus.impl.korm.sql.Op
import org.platypus.impl.korm.sql.QueryBuilder
import org.platypus.impl.korm.sql.Transaction
import org.platypus.impl.korm.sql.column.type.IColumnType
import java.sql.PreparedStatement

class DeleteStatement(val table: KormTable, val where: Op<Boolean>? = null, val isIgnore: Boolean = false): Statement<Int>(StatementType.DELETE, listOf(table)) {

    override fun PreparedStatement.executeInternal(transaction: Transaction): Int {
        transaction.flushCache()
        return executeUpdate()
    }

    override fun prepareSQL(transaction: Transaction): String = transaction.db.dialect.delete(isIgnore, table, where?.toSQL(QueryBuilder(true)), transaction)

    override fun arguments(): Iterable<Iterable<Pair<IColumnType, Any?>>> = QueryBuilder(true).run {
        where?.toSQL(this)
        listOf(args)
    }

    companion object {

        fun where(transaction: Transaction, table: KormTable, op: Op<Boolean>, isIgnore: Boolean = false): Int
            = DeleteStatement(table, op, isIgnore).execute(transaction) ?: 0

        fun all(transaction: Transaction, table: KormTable): Int = DeleteStatement(table).execute(transaction) ?: 0
    }
}
