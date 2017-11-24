package org.chmuche.korm.sql.column.type

import org.chmuche.korm.dao.EntityID
import org.chmuche.korm.dao.IdTable
import org.chmuche.korm.sql.Column
import org.chmuche.korm.sql.vendors.currentDialect
import java.nio.ByteBuffer
import java.util.*

class AutoIncColumnType(val delegate: ColumnType, private val _autoincSeq: String) : IColumnType by delegate {

    val autoincSeq : String? get() = if (currentDialect.needsSequenceToAutoInc) _autoincSeq else null

    private fun resolveAutIncType(columnType: IColumnType) : String = when (columnType) {
        is EntityIDColumnType<*> -> resolveAutIncType(columnType.idColumn.columnType)
        is IntegerColumnType -> currentDialect.dataTypeProvider.shortAutoincType()
        is LongColumnType -> currentDialect.dataTypeProvider.longAutoincType()
        else -> error("Unsupported type $delegate for auto-increment")
    }

    override fun sqlType(): String = resolveAutIncType(delegate)
}

class EntityIDColumnType<T:Any>(val idColumn: Column<T>) : ColumnType(false) {

    init {
        assert(idColumn.table is IdTable<*>){"EntityId supported only for IdTables"}
    }

    override fun sqlType(): String = idColumn.columnType.sqlType()

    override fun notNullValueToDB(value: Any): Any =
            idColumn.columnType.notNullValueToDB(when (value) {
                is EntityID<*> -> value.value
                else -> value
            })

    override fun valueFromDB(value: Any): Any {
        @Suppress("UNCHECKED_CAST")
        return when (value) {
            is EntityID<*> -> EntityID(value.value as T, idColumn.table as IdTable<T>)
            else -> EntityID(idColumn.columnType.valueFromDB(value) as T, idColumn.table as IdTable<T>)
        }
    }
}

class UUIDColumnType : ColumnType() {
    override fun sqlType(): String = currentDialect.dataTypeProvider.uuidType()

    override fun notNullValueToDB(value: Any): Any = currentDialect.dataTypeProvider.uuidToDB(when (value) {
        is UUID -> value
        is String -> UUID.fromString(value)
        is ByteArray -> ByteBuffer.wrap(value).let { UUID(it.long, it.long ) }
        else -> error("Unexpected value of type UUID: ${value.javaClass.canonicalName}")
    })

    override fun valueFromDB(value: Any): Any = when(value) {
        is UUID -> value
        is ByteArray -> ByteBuffer.wrap(value).let { b -> UUID(b.long, b.long) }
        is String -> ByteBuffer.wrap(value.toByteArray()).let { b -> UUID(b.long, b.long) }
        else -> error("Unexpected value of type UUID: $value")
    }

}