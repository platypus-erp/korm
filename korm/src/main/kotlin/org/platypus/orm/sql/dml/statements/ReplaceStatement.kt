package org.platypus.orm.sql.dml.statements

import org.platypus.PlatypusEnvironment
import org.platypus.model.Model

/**
 * @author max
 */
class ReplaceStatement<Key : Any>(env: PlatypusEnvironment, model: Model<*>) : InsertStatement<Key>(env, model) {

    override fun prepareSQL(): String = dialect.replace(table, valuesAndDefaults().toList(), cr)
}
