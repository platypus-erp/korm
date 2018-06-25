package org.platypus.orm.sql.query

import org.platypus.orm.PersistenceDialect
import org.platypus.orm.sql.QueryBuilder

interface StatementPart{
    fun prepareSQL(dialect:PersistenceDialect, builder: QueryBuilder): String
}