package org.platypus.v2.orm.database.dialect

import java.sql.DatabaseMetaData

interface SqlDialectFactory {
    fun create(meta: DatabaseMetaData): SqlDialect
}