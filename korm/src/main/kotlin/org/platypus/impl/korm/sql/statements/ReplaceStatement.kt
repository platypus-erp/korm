package org.platypus.impl.korm.sql.statements

import org.platypus.impl.korm.sql.KormTable
import org.platypus.impl.korm.sql.Transaction

/**
 * @author max
 */
class ReplaceStatement<Key:Any>(table: KormTable) : InsertStatement<Key>(table) {

    override fun prepareSQL(transaction: Transaction): String = transaction.db.dialect.replace(table, valuesAndDefaults().toList(), transaction)
}
