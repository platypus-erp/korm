package org.platypus.orm.sql.dml

import org.platypus.model.IModel
import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.orm.PersistenceDialect
import org.platypus.orm.transaction.TransactionExecutor
import java.sql.PreparedStatement
import java.util.*


internal object DefaultValueMarker {
    override fun toString(): String = "DEFAULT"
}

abstract class Statement<out T>(protected val cr: TransactionExecutor, val type: StatementType, val targets: List<IModel<*>>) {

    abstract fun PreparedStatement.executeInternal(): T?

    abstract fun prepareSQL(): String

    abstract fun arguments(): Iterable<Iterable<Pair<SqlFieldType, Any?>>>

    open fun prepared(sql: String): PreparedStatement =
            cr.connection.prepareStatement(sql, PreparedStatement.NO_GENERATED_KEYS)!!

    open val isAlwaysBatch: Boolean get() = false

    protected val dialect: PersistenceDialect
        get() = cr.dialect

    fun execute(): T? {
        preExecute()
        val result = cr.exec(this)
        postExecute()
        return result
    }

    protected open fun postExecute() {}
    protected open fun preExecute() {}

    internal fun executeIn(): Pair<T?, List<StatementContext>> {
        val arguments = arguments()
        val contexts = if (arguments.count() > 0) {
            arguments.map { args ->
                val context = StatementContext(this, args)
                cr.monitor.notifyBeforeExecution(context)
                context
            }
        } else {
            val context = StatementContext(this, emptyList())
            cr.monitor.notifyBeforeExecution(context)
            listOf(context)
        }
        val result: T?
        try {
            val sql = prepareSQL()
            val statement = prepared(sql)
            contexts.forEachIndexed { _, context ->
                statement.fillParameters(context.args)
                // REVIEW
                if (contexts.size > 1 || isAlwaysBatch) statement.addBatch()
            }
            if (!cr.dialect.supportsMultipleResultSets) cr.closeExecutedStatements()
            cr.currentStatement = statement
            result = statement.executeInternal()
            cr.currentStatement = null
            cr.executedStatements.add(statement)
            cr.monitor.notifyAfterExecution(contexts, statement)
        } catch (e: Exception) {
            cr.monitor.notifyOnError(contexts, e)
            throw e
        }


        return result to contexts
    }
}

class StatementContext(val statement: Statement<*>, val args: Iterable<Pair<SqlFieldType, Any?>>) {
    fun sql() = statement.prepareSQL()

    fun expandArgs(): String {
        val sql = sql()
        val iterator = args.iterator()
        if (!iterator.hasNext())
            return sql

        return buildString {
            val quoteStack = Stack<Char>()
            var lastPos = 0
            for (i in 0..sql.length - 1) {
                val char = sql[i]
                if (char == '?') {
                    if (quoteStack.isEmpty()) {
                        append(sql.substring(lastPos, i))
                        lastPos = i + 1
                        val (col, value) = iterator.next()
                        append(col.valueToString(value))
                    }
                    continue
                }

                if (char == '\'' || char == '\"') {
                    if (quoteStack.isEmpty()) {
                        quoteStack.push(char)
                    } else {
                        val currentQuote = quoteStack.peek()
                        if (currentQuote == char)
                            quoteStack.pop()
                        else
                            quoteStack.push(char)
                    }
                }
            }

            if (lastPos < sql.length)
                append(sql.substring(lastPos))
        }
    }
}




enum class StatementGroup {
    DDL, DML
}

enum class StatementType(val group: StatementGroup) {
    INSERT(StatementGroup.DML), UPDATE(StatementGroup.DML), DELETE(StatementGroup.DML), SELECT(StatementGroup.DML),
    CREATE(StatementGroup.DDL), ALTER(StatementGroup.DDL), TRUNCATE(StatementGroup.DDL), DROP(StatementGroup.DDL),
    GRANT(StatementGroup.DDL), OTHER(StatementGroup.DDL)
}