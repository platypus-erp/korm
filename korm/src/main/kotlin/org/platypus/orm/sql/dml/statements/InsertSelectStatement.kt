package org.platypus.orm.sql.dml.statements

import org.platypus.PlatypusEnvironment
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.orm.sql.dml.Statement
import org.platypus.orm.sql.dml.StatementType
import org.platypus.orm.sql.query.Query
import java.sql.PreparedStatement

class InsertSelectStatement(env: PlatypusEnvironment,
                            val columns: List<ModelField<*, *>>,
                            val selectQuery: Query, val isIgnore: Boolean = false) : Statement<Int>(env.internal.cr, StatementType.INSERT, listOf(columns.first().model)) {

    init {
        if (columns.isEmpty()) error("Can't insert without provided fields")
        val tables = columns.distinctBy { it.model }
        if (tables.count() > 1) error("Can't insert to different tables ${tables.joinToString { it.completeName }} from single select")
        if (columns.size != selectQuery.fieldSet.fieldsExpression.size) error("Columns count doesn't equal to query fields count")
    }


    override fun PreparedStatement.executeInternal(): Int? = executeUpdate()

    override fun arguments(): Iterable<Iterable<Pair<SqlFieldType, Any?>>> = selectQuery.arguments()

    override fun prepareSQL(): String =
            dialect.insert(targets.single(), columns, selectQuery.prepareSQL(), cr)
}
