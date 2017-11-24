package org.platypus.impl.korm.sql

import org.platypus.impl.korm.sql.column.type.IColumnType
import org.platypus.impl.korm.sql.transactions.TransactionManager
import org.platypus.impl.korm.sql.vendors.currentDialect
import org.platypus.impl.korm.sql.vendors.currentDialectIfAvailable

private val comparator = compareBy<Column<*>>({ it.table.tableName }, { it.name })

interface IColumn<T> {
    val table: KormTable
    val name: String
    val columnType: IColumnType
}

open class Column<T>(override val table: KormTable, override val name: String, override val columnType: IColumnType) :
        ExpressionWithColumnType<T>(),
        DdlAware,
        Comparable<Column<*>>,
        IColumn<T> {

    var referee: Column<*>? = null
    internal var onDelete: ReferenceOption? = null
        get() = field ?: currentDialectIfAvailable?.defaultReferenceOption
    internal var indexInPK: Int? = null
    internal var defaultValueFun: (() -> T)? = null
    internal var dbDefaultValue: Expression<T>? = null


    val autoIncSeqName: String? = null


    override fun equals(other: Any?): Boolean {
        return (other as? Column<*>)?.let {
            it.table == table && it.name == name
        } ?: false
    }

    override fun hashCode(): Int = table.hashCode() * 31 + name.hashCode()

    override fun toString(): String = "$table.$name"

    override fun toSQL(queryBuilder: QueryBuilder): String = TransactionManager.current().fullIdentity(this)

    val ddl: List<String>
        get() = createStatement()

    override fun createStatement(): List<String> {
        val alterTablePrefix = "ALTER TABLE ${TransactionManager.current().identity(table)} ADD"
        val isLastColumnInPK = indexInPK != null && indexInPK == table.columns.mapNotNull { indexInPK }.max()
        val columnDefinition = when {
            isOneColumnPK() -> descriptionDdl().removeSuffix(" PRIMARY KEY")
            !isOneColumnPK() && isLastColumnInPK -> ", ADD ${table.primaryKeyConstraint()}"
            else -> descriptionDdl()
        }

        val addConstr = if (isLastColumnInPK) {
            "$alterTablePrefix ${table.primaryKeyConstraint()}"
        } else null
        return listOfNotNull("$alterTablePrefix $columnDefinition", addConstr)
    }

    override fun modifyStatement() = listOf("ALTER TABLE ${TransactionManager.current().identity(table)} ${currentDialect.modifyColumn(this)}")

    override fun dropStatement() = listOf(TransactionManager.current().let { "ALTER TABLE ${it.identity(table)} DROP COLUMN ${it.identity(this)}" })

    internal fun isOneColumnPK() = table.columns.singleOrNull { it.indexInPK != null } == this

    fun descriptionDdl(): String = buildString {
        val tr = TransactionManager.current()
        append(tr.identity(this@Column))
        append(" ")
        val isPKColumn = indexInPK != null
        val colType = columnType
        if (isOneColumnPK() && colType.isAutoInc) {
            append(colType.sqlType().removeSuffix(" AUTO_INCREMENT")) // Workaround as SQLite Doesn't support both PK and autoInc in DDL
        } else {
            append(colType.sqlType())
        }

        val _dbDefaultValue = dbDefaultValue
        if (!isPKColumn && _dbDefaultValue != null) {
            val expressionSQL = currentDialect.dataTypeProvider.processForDefaultValue(_dbDefaultValue)
            if (!currentDialect.isAllowedAsColumnDefault(_dbDefaultValue)) {
                val clientDefault = when {
                    defaultValueFun != null -> " Expression will be evaluated on client."
                    colType.required -> " TableColumn will be created with NULL marker."
                    else -> ""
                }
                exposedLogger.error("${currentDialect.name} ${tr.db.version} doesn't support expression '$expressionSQL' as default value.$clientDefault")
            } else {
                append(" DEFAULT $expressionSQL")
            }
        }
        if (!colType.required || (_dbDefaultValue != null && defaultValueFun == null && !currentDialect.isAllowedAsColumnDefault(_dbDefaultValue))) {
            append(" NULL")
        } else if (!isPKColumn) {
            append(" NOT NULL")
        }


        if (isOneColumnPK()) {
            append(" PRIMARY KEY")
        }
    }

    override fun compareTo(other: Column<*>): Int = comparator.compare(this, other)
}