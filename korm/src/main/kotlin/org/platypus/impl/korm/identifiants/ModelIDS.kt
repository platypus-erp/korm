package org.platypus.impl.korm.identifiants

import org.platypus.impl.korm.entity.Entity
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.sql.SizedIterable
import org.platypus.impl.korm.sql.transactions.TransactionManager

class ModelIDS internal constructor(val model: BaseModel<*, *>, val ids: MutableSet<Long>) : Iterable<ModelID> {
    override fun iterator(): Iterator<ModelID> = ModelIDIterator(this)
    class ModelIDIterator(modelIds: ModelIDS) : Iterator<ModelID> {
        val ids: Iterator<Long> = modelIds.ids.iterator()
        val name: BaseModel<*, *> = modelIds.model

        override fun hasNext() = ids.hasNext()

        override fun next(): ModelID = ModelID(name, ids.next())
    }

    fun isEmpty(): Boolean = ids.isEmpty()

    operator fun plus(modelIds: ModelIDS): ModelIDS {
        if (this.model != modelIds.model) {
            TODO("Should never happen")
        }
        val copyids = modelIds.ids.toMutableSet()
        copyids.addAll(this.ids)
        return ModelIDS(this.model, copyids)
    }

    operator fun plus(modelId: ModelID): ModelIDS {
        if (this.model != modelId.model) {
            TODO("Should never happen")
        }
        val newIds = this.ids.toMutableSet()
        newIds.add(modelId.id)
        return ModelIDS(this.model, newIds)
    }
}









