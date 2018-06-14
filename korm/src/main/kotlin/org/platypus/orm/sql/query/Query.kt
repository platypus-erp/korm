package org.platypus.orm.sql.query


import org.platypus.PlatypusEnvironment
import org.platypus.model.field.api.ModelField
import org.platypus.orm.sql.QueryBuilder
import org.platypus.orm.sql.SizedIterable
import org.platypus.orm.sql.alias
import org.platypus.orm.sql.dml.ColumnSet
import org.platypus.orm.sql.dml.FieldSet
import org.platypus.orm.sql.dml.Statement
import org.platypus.orm.sql.dml.StatementType
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.expression.ExpressionAlias
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.util.*

enum class ORDERBY_TYPE {
    ASC, DESC
}

open class Query(private val env: PlatypusEnvironment, set: FieldSet, where: Expression<Boolean>?) : SizedIterable<ResultRow>, Statement<ResultSet>(env.internal.cr, StatementType.SELECT, set.source.targetTables()) {
    var groupedByColumns: List<Expression<*>> = mutableListOf()
        private set
    val orderByColumns: List<Pair<Expression<*>, ORDERBY_TYPE>>
        get() = _orderByColumns
    private var _orderByColumns: MutableList<Pair<Expression<*>, ORDERBY_TYPE>> = mutableListOf()
    var having: Expression<Boolean>? = null
        private set
    var distinct: Boolean = false
        private set
    private var forUpdate: Boolean? = null
    var fieldSet: FieldSet = set
        private set
    var where: Expression<Boolean>? = where
        private set
    var limit: Int? = null
        private set
    var offset: Int = 0
        private set

    /**
     * Changes [fieldSet.fields] field of a Query, [fieldSet.source] will be preserved
     * @param body builder for new column fieldSet, current [fieldSet.source] used as a receiver, you are expected to slice it
     * @sample org.chmuche.korm.sql.tests.shared.DMLTests.testAdjustQuerySlice
     */
    fun adjustSlice(body: ColumnSet.() -> FieldSet): Query = apply { fieldSet = fieldSet.source.body() }

    /**
     * Changes [fieldSet.source] field of a Query, [fieldSet.fields] will be preserved
     * @param body builder for new column fieldSet, previous value used as a receiver
     * @sample org.chmuche.korm.sql.tests.shared.DMLTests.testAdjustQueryColumnSet
     */
    fun adjustColumnSet(body: ColumnSet.() -> ColumnSet): Query {
        val oldSlice = fieldSet.fieldsExpression
        return adjustSlice { body().slice(oldSlice) }
    }

    /**
     * Changes [where] field of a Query.
     * @param body new WHERE condition builder, previous value used as a receiver
     * @sample org.chmuche.korm.sql.tests.shared.DMLTests.testAdjustQueryWhere
     */
    fun adjustWhere(body: (Expression<Boolean>?) -> Expression<Boolean>?): Query = apply { where = body(where) }

    fun hasCustomForUpdateState() = forUpdate != null
    fun isForUpdate() = (forUpdate
            ?: env.internal.cr.selectsForUpdate) && env.internal.dialect.supportsSelectForUpdate()

    override fun PreparedStatement.executeInternal(): ResultSet? = executeQuery()

    override fun arguments() = QueryBuilder(true).let {
        prepareSQL(it)
        if (it.args.isNotEmpty()) listOf(it.args) else emptyList()
    }

    override fun prepareSQL(): String = prepareSQL(QueryBuilder(true))

    fun prepareSQL(builder: QueryBuilder): String = buildString {
        append("SELECT ")

        if (count) {
            append("COUNT(*)")
        } else {
            if (distinct) {
                append("DISTINCT ")
            }
            append(fieldSet.fieldsExpression.joinToString { it.accept(dialect.expressionVisitor, builder) })
        }
        append(" FROM ")
        append(fieldSet.source.describe(env))

        where?.let {
            append(" WHERE ")
            append(it.accept(dialect.expressionVisitor, builder))
        }

        if (!count) {
            if (groupedByColumns.isNotEmpty()) {
                append(" GROUP BY ")
                append(groupedByColumns.joinToString {
                    ((it as? ExpressionAlias)?.aliasOnlyExpression()
                            ?: it).accept(dialect.expressionVisitor, builder)
                })
            }
            having?.let {
                append(" HAVING ")
                append(it.accept(dialect.expressionVisitor, builder))
            }
            if (orderByColumns.isNotEmpty()) {
                append(" ORDER BY ")
                orderByColumns.forEach {
                    append(it.first.accept(dialect.expressionVisitor, builder))
                    append(" ")
                    append(it.toString())
                }
            }
            limit?.let {
                append(" ")
                append(dialect.limit(it, offset, orderByColumns.isNotEmpty()))
            }
        }

        if (isForUpdate()) {
            append(" FOR UPDATE")
        }
    }

    override fun forUpdate(): Query {
        this.forUpdate = true
        return this
    }

    override fun notForUpdate(): Query {
        forUpdate = false
        return this
    }

    fun withDistinct(value: Boolean = true): Query {
        distinct = value
        return this
    }

    fun groupBy(vararg columns: Expression<*>): Query {
        for (column in columns) {
            (groupedByColumns as MutableList).add(column)
        }
        return this
    }

    fun having(op: () -> Expression<Boolean>): Query {
        val oop = op()
        if (having != null) {
            val fake = QueryBuilder(false)
            error(buildString {
                append("HAVING clause is specified twice. Old value = '")
                append(append(having!!.accept(dialect.expressionVisitor, fake)))
                append("', new value = '")
                append(append(oop.accept(dialect.expressionVisitor, fake)))
                append("'")
            })
        }
        having = oop
        return this
    }

    fun orderBy(column: Expression<*>, orderBy: ORDERBY_TYPE = ORDERBY_TYPE.ASC): Query {
        _orderByColumns.add(column to orderBy)
        return this
    }

    fun orderBy(vararg columns: Pair<ModelField<*, *>, ORDERBY_TYPE>): Query {
        for (pair in columns) {
            _orderByColumns.add(pair)
        }
        return this
    }

    override fun limit(limit: Int, offset: Int): Query {
        this.limit = limit
        this.offset = offset
        return this
    }

    private inner class ResultIterator(val rs: ResultSet) : Iterator<ResultRow> {
        private var hasNext: Boolean? = null
        private val fieldsIndex = HashMap<Expression<*>, Int>()

        init {
            fieldSet.fieldsExpression.forEachIndexed { idx, field ->
                fieldsIndex[field] = idx
            }
        }

        operator override fun next(): ResultRow {
            if (hasNext == null) hasNext()
            if (hasNext == false) throw NoSuchElementException()
            hasNext = null
            return ResultRow.create(dialect, rs, fieldSet.fieldsExpression, fieldsIndex)
        }

        override fun hasNext(): Boolean {
            if (hasNext == null) hasNext = rs.next()
            if (hasNext == false) rs.close()
            return hasNext!!
        }
    }

    operator override fun iterator(): Iterator<ResultRow> {
        val resultIterator = ResultIterator(env.internal.cr.exec(this)!!)
        return if (dialect.supportsMultipleResultSets)
            resultIterator
        else {
            arrayListOf<ResultRow>().apply {
                resultIterator.forEach {
                    this += it
                }
            }.iterator()
        }
    }

    private var count: Boolean = false
    override fun count(): Int {
        return if (distinct || groupedByColumns.isNotEmpty()) {
            fun ModelField<*, *>.makeAlias() = alias(env.internal.cr.quoteIfNecessary(env.internal.cr.fullIdentity(this)))

            val originalSet = fieldSet
            val originalGroupBy = groupedByColumns
            try {
                var expInx = 0
                adjustSlice {
                    slice(originalSet.fieldsExpression.map {
                        (it as? ModelField<*, *>)?.makeAlias() ?: it.alias("exp${expInx++}")
                    }.toSet())
                }
                groupedByColumns = originalGroupBy.map {
                    (it as? ModelField<*, *>)?.takeIf { it in originalSet.fieldsExpression }?.makeAlias()?.aliasOnlyExpression()
                            ?: it
                }

//                alias("subquery")
                TODO("Test this because I don't know how this works")
                0
            } finally {
                fieldSet = originalSet
                groupedByColumns = originalGroupBy
            }
        } else {
            try {
                count = true
                env.internal.cr.exec(this) {
                    it.next()
                    it.getInt(1)
                }!!
            } finally {
                count = false
            }
        }
    }

    override fun empty(): Boolean {
        val oldLimit = limit
        try {
            limit = 1
            return !env.internal.cr.exec(this)!!.next()
        } finally {
            limit = oldLimit
        }
    }
}
