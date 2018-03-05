package org.platypus.orm

import org.platypus.orm.sql.QueryBuilder

interface Sqlable {
    fun toSQL(query: QueryBuilder): String
}