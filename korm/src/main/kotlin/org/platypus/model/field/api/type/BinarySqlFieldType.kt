package org.platypus.model.field.api.type

import org.platypus.model.field.api.ModelFieldType
import java.io.InputStream
import java.sql.Blob
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.Types
import javax.sql.rowset.serial.SerialBlob

class BinarySqlFieldType(override val required: Boolean = false) : SqlFieldType {
    override val typeEnum: ModelFieldType = ModelFieldType.BINARY
    override fun nonNullValueToString(value: Any): String = "?"
    override fun readObject(rs: ResultSet, index: Int): Any? {
        return rs.getBlob(index)
//        return if (Platypus.presitenceDialect.blobAsStream)
//            rs.getBytes(index)?.let { SerialBlob(it) }
//        else
//            rs.getBlob(index)
    }

    override fun valueFromDB(value: Any): Any = when (value) {
        is Blob -> value
        is InputStream -> SerialBlob(value.readBytes())
        is ByteArray -> SerialBlob(value)
        else -> error("Unknown type for blob column :${value.javaClass}")
    }

    override fun setParameter(stmt: PreparedStatement, index: Int, value: Any?) {
        when {
//            Platypus.presitenceDialect.blobAsStream && value is InputStream ->
//                stmt.setBinaryStream(index, value, value.available())
            value == null -> stmt.setNull(index, Types.LONGVARBINARY)
            else -> super.setParameter(stmt, index, value)
        }
    }

    override fun notNullValueToDB(value: Any): Any {
        return value
//        return if (Platypus.presitenceDialect.blobAsStream)
//            (value as? Blob)?.binaryStream ?: value
//        else
//            value
    }
}