package org.platypus.impl.korm.sql.statements

import org.platypus.impl.korm.sql.KormTable
import org.platypus.impl.korm.sql.Transaction
import org.platypus.impl.korm.sql.column.type.IColumnType
import java.sql.PreparedStatement
import java.util.*


internal object DefaultValueMarker {
    override fun toString(): String = "DEFAULT"
}

abstract class Statement<out T>(val type: StatementType, val targets: List<KormTable>) {

    abstract fun PreparedStatement.executeInternal(transaction: Transaction): T?

    abstract fun prepareSQL(transaction: Transaction): String

    abstract fun arguments(): Iterable<Iterable<Pair<IColumnType, Any?>>>

    open fun prepared(transaction: Transaction, sql: String): PreparedStatement =
            transaction.connection.prepareStatement(sql, PreparedStatement.NO_GENERATED_KEYS)!!

    open val isAlwaysBatch: Boolean get() = false

    fun execute(transaction: Transaction): T? {
        preExecute(transaction)
        val result = transaction.exec(this)
        postExecute(transaction)
        return result
    }

    open protected fun postExecute(transaction: Transaction) {}
    open protected fun preExecute(transaction: Transaction) {}

    internal fun executeIn(transaction: Transaction): Pair<T?, List<StatementContext>> {
        val arguments = arguments()
        val contexts = if (arguments.count() > 0) {
            arguments.map { args ->
                val context = StatementContext(this, args)
                transaction.monitor.notifyBeforeExecution(transaction, context)
                context
            }
        } else {
            val context = StatementContext(this, emptyList())
            transaction.monitor.notifyBeforeExecution(transaction, context)
            listOf(context)
        }
        val result: T?
        try {
            val sql = prepareSQL(transaction)
            val statement = prepared(transaction, sql)
            contexts.forEachIndexed { i, context ->
                statement.fillParameters(context.args)
                // REVIEW
                if (contexts.size > 1 || isAlwaysBatch) statement.addBatch()
            }
            if (!transaction.db.supportsMultipleResultSets) transaction.closeExecutedStatements()
            transaction.currentStatement = statement
            result = statement.executeInternal(transaction)
            transaction.currentStatement = null
            transaction.executedStatements.add(statement)
            transaction.monitor.notifyAfterExecution(transaction, contexts, statement)
        } catch (e: Exception) {
            transaction.monitor.notifyOnError(transaction, contexts, e)
            throw e
        }


        return result to contexts
    }
}

class StatementContext(val statement: Statement<*>, val args: Iterable<Pair<IColumnType, Any?>>) {
    fun sql(transaction: Transaction) = statement.prepareSQL(transaction)
}

fun StatementContext.expandArgs(transaction: Transaction): String {
    val sql = sql(transaction)
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

fun PreparedStatement.fillParameters(args: Iterable<Pair<IColumnType, Any?>>): Int {
    args.forEachIndexed { index, (c, v) ->
        c.setParameter(this, index + 1, c.valueToDB(v))
    }

    return args.count() + 1
}

enum class StatementGroup {
    DDL, DML
}

enum class StatementType(val group: StatementGroup) {
    INSERT(StatementGroup.DML), UPDATE(StatementGroup.DML), DELETE(StatementGroup.DML), SELECT(StatementGroup.DML),
    CREATE(StatementGroup.DDL), ALTER(StatementGroup.DDL), TRUNCATE(StatementGroup.DDL), DROP(StatementGroup.DDL),
    GRANT(StatementGroup.DDL), OTHER(StatementGroup.DDL)
}