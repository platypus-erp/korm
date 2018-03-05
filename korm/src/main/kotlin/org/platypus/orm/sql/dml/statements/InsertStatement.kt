package org.platypus.orm.sql.dml.statements

import org.platypus.PlatypusEnvironment
import org.platypus.model.IModel
import org.platypus.model.field.api.IModelField
import org.platypus.model.field.impl.PKModelField
import org.platypus.orm.sql.QueryBuilder
import org.platypus.orm.sql.dml.DefaultValueMarker
import org.platypus.orm.sql.dml.Statement
import org.platypus.orm.sql.dml.StatementType
import org.platypus.orm.sql.dml.storeFields
import java.sql.PreparedStatement
import java.sql.ResultSet

/**
 * isIgnore is supported for mysql only
 */
open class InsertStatement<Key : Any>(
        env: PlatypusEnvironment,
        val table: IModel<*>,
        val avoidAutoInc: Boolean = true) : UpdateBuilder<Int>(env, StatementType.INSERT, listOf(table)) {
    open protected val flushCache = true
    var generatedKey: Key? = null

    infix operator fun get(idPk: PKModelField<*>): Int = generatedKey as? Int ?: error("No key generated")

    private val postStatement: MutableMap<String, (selfId: Long) -> Statement<*>> = HashMap()

    fun addPostExecute(uniqueKey: String, stmt: (selfId: Long) -> Statement<*>) {
        postStatement[uniqueKey] = stmt
    }


    open protected fun generatedKeyFun(rs: ResultSet?, inserted: Int): Key? {
        return autoIncColumns.firstOrNull().let { column ->
            if (rs?.next() == true) {
                @Suppress("UNCHECKED_CAST")
                column!!.type.valueFromDB(rs.getObject(1)) as Key
            } else null
        }
    }

    open protected fun valuesAndDefaults(values: Map<IModelField<*, *>, Any?> = this.values): Map<IModelField<*, *>, Any?> {
        val columnsWithNotNullDefault = targets.flatMap { it.storeFields }.filter {
            it.required && it.defaultValueFun(env) != null && it !in values.keys
        }
        return values + columnsWithNotNullDefault.map {
            it to (it.defaultValueFun.invoke(env) ?: DefaultValueMarker)
        }
    }

    override fun prepareSQL(): String {
        val builder = QueryBuilder(true)
        val values = if (avoidAutoInc) {
            arguments!!.first().filter { !it.first.type.isAutoInc }
        } else {
            arguments!!.first()
        }
        val sql = if (values.isEmpty()) {
            ""
        } else values.joinToString(prefix = "VALUES (", postfix = ")") { (col, value) ->
            println("insert $col $value")
            builder.registerArgument(cr, col, value)
        }
        return dialect.insert(table, values.map { it.first }, sql, cr)
    }

    override fun PreparedStatement.executeInternal(): Int {
        val inserted = if (arguments().count() > 1 || isAlwaysBatch) executeBatch().sum() else executeUpdate()
        return inserted.apply {
            val rs = if (autoIncColumns.isNotEmpty()) {
                generatedKeys
            } else null
            generatedKey = generatedKeyFun(rs, this)
        }
    }

    protected val autoIncColumns = targets.flatMap { it.fields }.filter { it.type.isAutoInc && it.store }

    override fun prepared(sql: String): PreparedStatement {
        return if (autoIncColumns.isNotEmpty()) {
            // http://viralpatel.net/blogs/oracle-java-jdbc-get-primary-key-insert-sql/
            cr.connection.prepareStatement(sql, autoIncColumns.map { cr.identity(it) }.toTypedArray())!!
        } else {
            cr.connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)!!
        }
    }

    open protected var arguments: List<List<Pair<IModelField<*, *>, Any?>>>? = null
        get() = field ?: run {
            val nullableColumns = table.storeFields.filter { !it.required && !it.type.isAutoInc }
            val valuesAndDefaults = valuesAndDefaults()
            val result = (valuesAndDefaults + (nullableColumns - valuesAndDefaults.keys).associate { it to null })
                    .toList()
                    .sortedBy { it.first }
            listOf(result).apply { field = this }
        }

    override fun arguments() = arguments!!.map { it.map { it.first.type to it.second }.filter { it.second != DefaultValueMarker } }
}
