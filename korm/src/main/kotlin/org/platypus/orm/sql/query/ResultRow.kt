package org.platypus.orm.sql.query

import org.platypus.cache.ModelID
import org.platypus.model.field.api.IModelField
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.api.ReferencedField
import org.platypus.model.field.api.SimpleModelField
import org.platypus.model.field.impl.PKModelField
import org.platypus.orm.PersistenceDialect
import org.platypus.orm.sql.QueryBuilder
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.expression.ExpressionAlias
import org.platypus.orm.sql.expression.TypedExpression
import org.platypus.orm.sql.logging.exposedLogger
import java.sql.ResultSet

class ResultRow(val dialect: PersistenceDialect, size: Int, private val fieldIndex: Map<Expression<*>, Int>) {
    val data = arrayOfNulls<Any?>(size)

    fun getAny(field: IModelField<*,*>): Any? {
        return when (field) {
            is SimpleModelField<*, *> -> get(field)!!
            is ReferencedField<*, *> -> get(field)
            is PKModelField<*> -> get(field)
            else -> getExpr(field)
        }
    }

    fun <T : Any> get(field: SimpleModelField<*, T>): T? {
        return getRaw(field)!!
    }

    fun get(field: PKModelField<*>): Int {
        return getRaw(field)!!
    }

    fun get(field: ReferencedField<*,*>): ModelID? {
        val id = getRawAny(field) ?: return null
        return field.type.valueFromDB(id) as ModelID
    }


    /**
     * Function might returns null. Use @tryGet if you don't sure of nullability (e.g. in left-join cases)
     */
    @Suppress("UNCHECKED_CAST")
    @Deprecated(message = "Deprecated Method prefer use a real get or wait until the new Expression API")
    fun <T> getExpr(c: Expression<T>): T {
        val d = getRaw(c)
        return when {
            d == null && c is IModelField<*, *> && c.required -> {
                exposedLogger.warn("Column ${dialect.identity(c)} is marked as not null, " +
                        "has default db value, but returns null. Possible have to re-read it from DB.")
                null
            }
            d == null -> null
            d == NotInitializedValue -> error("${c.accept(dialect.expressionVisitor, QueryBuilder(false))} is not initialized yet")
            c is ExpressionAlias<T> && c.delegate is TypedExpression<T> -> c.delegate.type.valueFromDB(d)
            c is TypedExpression<T> -> c.type.valueFromDB(d)
            else -> d
        } as T
    }


    operator fun <T> set(c: Expression<T>, value: T) {
        val index = fieldIndex[c]
                ?: error("${c.accept(dialect.expressionVisitor, QueryBuilder(false))} is not in record fieldSet")
        data[index] = value
    }

    fun <T> hasValue(c: Expression<T>): Boolean = fieldIndex[c]?.let { data[it] != NotInitializedValue } ?: false

    fun <T> tryGet(c: Expression<T>): T? = if (hasValue(c)) getExpr(c) else null
    fun tryGetAny(c: Expression<*>): Any? = if (hasValue(c)) getExpr(c) else null

    @Suppress("UNCHECKED_CAST")
    private fun <T> getRaw(c: Expression<T>): T? {
        return data[fieldIndex[c]
                ?: error("${c.accept(dialect.expressionVisitor, QueryBuilder(false))} is not in record fieldSet")] as T?
    }

    private fun getRawAny(c: Expression<*>): Any? {
        return data[fieldIndex[c]
                ?: error("${c.accept(dialect.expressionVisitor, QueryBuilder(false))} is not in record fieldSet")]
    }

    val expr: Set<Expression<*>>
        get() = fieldIndex.keys

    override fun toString(): String =
            fieldIndex.entries.joinToString { "${it.key.accept(dialect.expressionVisitor, QueryBuilder(false))}=${data[it.value]}" }

    internal object NotInitializedValue

    companion object {
        fun create(dialect: PersistenceDialect, rs: ResultSet, fields: Set<Expression<*>>, fieldsIndex: Map<Expression<*>, Int>): ResultRow {
            val size = fieldsIndex.size
            val answer = ResultRow(dialect, size, fieldsIndex)

            fields.forEachIndexed { i, f ->
                answer.data[i] = (f as? ModelField<*, *>)?.type?.readObject(rs, i + 1) ?: rs.getObject(i + 1)
            }
            return answer
        }
    }
}