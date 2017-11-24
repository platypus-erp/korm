package org.chmuche.korm.dao

import org.chmuche.korm.sql.Column
import org.chmuche.korm.sql.Table

abstract class IdTable<T:Any>(name: String): Table(name) {
    abstract val id : Column<EntityID<T>>

}
