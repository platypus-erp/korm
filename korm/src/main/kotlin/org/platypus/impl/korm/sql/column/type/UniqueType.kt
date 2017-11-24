package org.platypus.impl.korm.sql.column.type

import org.platypus.impl.korm.identifiants.ModelID
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.model.ModelColumnType
import org.platypus.impl.korm.sql.vendors.currentDialect
import java.nio.ByteBuffer
import java.util.*

class AutoIncColumnType(val delegate: ColumnType, private val _autoincSeq: String? = null) : IColumnType by delegate {
    override val isAutoInc = true
    val autoincSeq: String? get() = if (currentDialect.needsSequenceToAutoInc) _autoincSeq else null

    private fun resolveAutIncType(columnType: IColumnType): String = when (columnType) {
        is EntityIDColumnType -> TODO("Don't want to manage this type now")
        is IntegerColumnType -> currentDialect.dataTypeProvider.shortAutoincType()
        is LongColumnType -> currentDialect.dataTypeProvider.longAutoincType()
        else -> error("Unsupported type $delegate for auto-increment")
    }

    override fun valueToDB(value: Any?): Any? {
        return when (value) {
            is ModelID -> value.id
            is Long -> value
            is Int -> value.toLong()
            else -> error("Unsupported type $delegate for auto-increment")
        }
    }

    override fun sqlType(): String = resolveAutIncType(delegate)
}

<<<<<<< HEAD

class EntityIdColumnType(private val model: BaseModel<*, *>, val colType:IColumnType) : IColumnType by colType {
=======
class EntityIDColumnType(private val model: BaseModel<*, *>) : IColumnType by AutoIncColumnType(LongColumnType(true)) {
    override val modelColumnType = ModelColumnType.ENTITY_ID
>>>>>>> parent of b2af04b... fixup! Commit

    override val isAutoInc = true

    override fun notNullValueToDB(value: Any): Any =
            notNullValueToDB(when (value) {
                is ModelID -> value.id
                else -> value
            })

    override fun valueFromDB(value: Any): Any {
        @Suppress("UNCHECKED_CAST")
        return when (value) {
            is ModelID -> ModelID(model, value.id)
            else -> ModelID(model, value as Long)
        }
    }
}

class UUIDColumnType(required: Boolean) : ColumnType(required) {
    override val modelColumnType = ModelColumnType.UUID
    override fun sqlType(): String = currentDialect.dataTypeProvider.uuidType()

    override fun notNullValueToDB(value: Any): Any = currentDialect.dataTypeProvider.uuidToDB(when (value) {
        is UUID -> value
        is String -> UUID.fromString(value)
        is ByteArray -> ByteBuffer.wrap(value).let { UUID(it.long, it.long) }
        else -> error("Unexpected value of type UUID: ${value.javaClass.canonicalName}")
    })

    override fun valueFromDB(value: Any): Any = when (value) {
        is UUID -> value
        is ByteArray -> ByteBuffer.wrap(value).let { b -> UUID(b.long, b.long) }
        is String -> ByteBuffer.wrap(value.toByteArray()).let { b -> UUID(b.long, b.long) }
        else -> error("Unexpected value of type UUID: $value")
    }

}