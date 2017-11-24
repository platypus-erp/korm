package org.chmuche.korm.sql.column.type

import org.chmuche.korm.sql.vendors.currentDialect
import java.io.InputStream
import java.sql.Blob
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.Types
import javax.sql.rowset.serial.SerialBlob

class BinaryColumnType(val length: Int) : ColumnType() {
    override fun sqlType(): String  = currentDialect.dataTypeProvider.binaryType(length)

    // REVIEW
    override fun valueFromDB(value: Any): Any {
        if (value is java.sql.Blob) {
            return value.binaryStream.readBytes()
        }
        return value
    }
}

class BlobColumnType : ColumnType() {
    override fun sqlType(): String  = currentDialect.dataTypeProvider.blobType()

    override fun nonNullValueToString(value: Any): String = "?"

    override fun readObject(rs: ResultSet, index: Int): Any? {
        return if (currentDialect.dataTypeProvider.blobAsStream)
            rs.getBytes(index)?.let { SerialBlob(it) }
        else
            rs.getBlob(index)
    }

    override fun valueFromDB(value: Any): Any = when (value) {
        is Blob -> value
        is InputStream -> SerialBlob(value.readBytes())
        is ByteArray -> SerialBlob(value)
        else -> error("Unknown type for blob column :${value.javaClass}")
    }

    override fun setParameter(stmt: PreparedStatement, index: Int, value: Any?) {
        when {
            currentDialect.dataTypeProvider.blobAsStream && value is InputStream ->
                stmt.setBinaryStream(index, value, value.available())
            value == null -> stmt.setNull(index, Types.LONGVARBINARY)
            else -> super.setParameter(stmt, index, value)
        }
    }

    override fun notNullValueToDB(value: Any): Any {
        return if (currentDialect.dataTypeProvider.blobAsStream)
            (value as? Blob)?.binaryStream ?: value
        else
            value
    }
}

class BooleanColumnType : ColumnType() {
    override fun sqlType(): String  = currentDialect.dataTypeProvider.booleanType()

    override fun valueFromDB(value: Any) = when (value) {
        is Number -> value.toLong() != 0L
        is String -> currentDialect.dataTypeProvider.booleanFromStringToBoolean(value)
        else -> value.toString().toBoolean()
    }

    override fun nonNullValueToString(value: Any) = currentDialect.dataTypeProvider.booleanToStatementString(value as Boolean)
}