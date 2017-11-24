package org.chmuche.korm.dao

import org.chmuche.korm.dao.Entity
import org.chmuche.korm.dao.EntityClass
import org.chmuche.korm.dao.EntityID
import org.chmuche.korm.dao.IdTable
import org.chmuche.korm.sql.Column


open class LongIdTable(name: String = "", columnName: String = "id") : IdTable<Long>(name) {
    override val id: Column<EntityID<Long>> = long(columnName).autoIncrement().primaryKey().entityId()
}

abstract class LongEntity(id: EntityID<Long>) : Entity<Long>(id)

abstract class LongEntityClass<out E:LongEntity>(table: IdTable<Long>, entityType: Class<E>? = null) : EntityClass<Long, E>(table, entityType)

