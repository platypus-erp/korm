package org.platypus.impl.korm.identifiants

import org.platypus.impl.korm.entity.Entity
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.sql.SizedIterable
import org.platypus.impl.korm.sql.transactions.TransactionManager

infix fun BaseModel<*, *>.withId(id: Long) = ModelID(this, id)
infix fun BaseModel<*, *>.withIds(ids: Collection<Long>): ModelIDS = ModelIDS(this, ids.toMutableSet())


fun BaseModel<*, *>.emptyModelId(): ModelID = ModelID(this, --TransactionManager.current().counter)

infix fun <E : Entity<E, *>> SizedIterable<E>.toModelIds(m: BaseModel<*, *>): ModelIDS = m withIds this.map { it.id }

fun BaseModel<*, *>.emptyModelIds(): ModelIDS = ModelIDS(this, HashSet(0))

fun Collection<ModelID>.toModelIds(): ModelIDS {
    return ModelIDS(this.first().model, this.map { it.id }.toMutableSet())
}