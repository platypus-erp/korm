package org.platypus.orm.transaction

import org.platypus.orm.sql.dml.StatementContext
import org.platypus.orm.sql.dml.StatementType
import org.platypus.orm.sql.dml.statements.StatementInterceptor
import java.sql.PreparedStatement
import java.util.*

class TransactionStat : StatementInterceptor {
    val map = EnumMap<StatementType, Int>(StatementType::class.java)

    fun reset() {
        map.clear()
    }

    val nbSelect: Int get() = map[StatementType.SELECT] ?: 0
    val nbDelete: Int get() = map[StatementType.DELETE] ?: 0
    val nbInsert: Int get() = map[StatementType.INSERT] ?: 0
    val nbUpdate: Int get() = map[StatementType.UPDATE] ?: 0

    override fun afterExecution(contexts: List<StatementContext>, executedStatement: PreparedStatement) {
        contexts.forEach {
            map.compute(it.statement.type, { _, nb -> (nb ?: 0) + 1 })
        }
    }
}