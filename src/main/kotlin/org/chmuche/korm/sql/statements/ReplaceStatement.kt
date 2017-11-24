package org.chmuche.korm.sql.statements

import org.chmuche.korm.sql.Table
import org.chmuche.korm.sql.Transaction

/**
 * @author max
 */
class ReplaceStatement<Key:Any>(table: Table) : InsertStatement<Key>(table) {

    override fun prepareSQL(transaction: Transaction): String = transaction.db.dialect.replace(table, valuesAndDefaults().toList(), transaction)
}
