package org.platypus.orm.transaction

import org.platypus.orm.PersistenceDialect
import java.sql.DatabaseMetaData

interface SqlDialectFactory {
    fun create(meta: DatabaseMetaData): PersistenceDialect
}