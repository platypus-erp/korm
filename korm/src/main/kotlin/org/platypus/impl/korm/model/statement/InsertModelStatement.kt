package org.platypus.impl.korm.model.statement

import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.sql.Transaction
import org.platypus.impl.korm.sql.statements.InsertStatement
import org.platypus.impl.korm.sql.statements.Statement
import java.util.*

class InsertModelStatement(private val model: BaseModel<*, *>, externalRef: String? = null, isIgnore: Boolean = false)
    : InsertStatement<Long>(model.internalTable, isIgnore) {

    init {
        externalRef?.let { set(model.externalRef.column, it) }
    }

    private fun getID(): Long = get(model.id).id
    private val postStatement: MutableMap<String, (selfId: Long) -> Statement<*>> = HashMap()

    override fun postExecute(transaction: Transaction) {
        postStatement.values.forEach { it(getID()) }
    }

    internal fun addPostExecute(id: String, postStmt: (selfId: Long) -> Statement<*>) {
        postStatement[id] = postStmt
    }
}