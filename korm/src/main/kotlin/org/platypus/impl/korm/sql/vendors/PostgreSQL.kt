package org.platypus.impl.korm.sql.vendors

import org.platypus.impl.korm.sql.Column
import org.platypus.impl.korm.sql.Expression
import org.platypus.impl.korm.sql.transactions.TransactionManager
import java.util.*

internal object PostgreSQLDataTypeProvider : DataTypeProvider {

    override fun shortAutoincType(): String = "SERIAL"

    override fun longAutoincType(): String = "BIGSERIAL"

    override fun dateTimeType(): String = "TIMESTAMP"

    override fun uuidType(): String = "uuid"

    override fun blobType(): String = "bytea"

    override fun binaryType(length: Int): String = "bytea"

    override fun uuidToDB(value: UUID): Any = value

    override val blobAsStream: Boolean = true
}

internal class PostgreSQLDialect : VendorDialect(dialectName, PostgreSQLDataTypeProvider) {
    override fun isAllowedAsColumnDefault(e: Expression<*>): Boolean = true

    override fun modifyColumn(column: Column<*>): String = buildString {
        val colName = TransactionManager.current().identity(column)
        append("ALTER COLUMN $colName TYPE ${column.columnType.sqlType()},")
        append("ALTER COLUMN $colName ")
        if (column.columnType.required)
            append("DROP ")
        else
            append("SET ")
        append("NOT NULL")
        column.dbDefaultValue.let {
            append(", ALTER COLUMN $colName SET DEFAULT ${PostgreSQLDataTypeProvider.processForDefaultValue(it!!)}")
        }
    }


    companion object {
        const val dialectName = "postgresql"
    }
}