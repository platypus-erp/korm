package org.platypus.impl.korm.sql.statements

import org.platypus.impl.korm.sql.Column
import org.platypus.impl.korm.sql.Query
import org.platypus.impl.korm.sql.Transaction
import org.platypus.impl.korm.sql.column.type.IColumnType
import java.sql.PreparedStatement

class InsertSelectStatement(val columns: List<Column<*>>, val selectQuery: Query, val isIgnore: Boolean = false): Statement<Int>(StatementType.INSERT, listOf(columns.first().table)) {

    init {
        if (columns.isEmpty()) error("Can't insert without provided columns")
        val tables = columns.distinctBy { it.table }
        if (tables.count() > 1) error("Can't insert to different tables ${tables.joinToString { it.name }} from single select")
        if (columns.size != selectQuery.set.fields.size) error("Columns count doesn't equal to query columns count")
    }


    override fun PreparedStatement.executeInternal(transaction: Transaction): Int? = executeUpdate()

    override fun arguments(): Iterable<Iterable<Pair<IColumnType, Any?>>> = selectQuery.arguments()

    override fun prepareSQL(transaction: Transaction): String =
        transaction.db.dialect.insert(isIgnore, targets.single(), columns, selectQuery.prepareSQL(transaction), transaction)
}
