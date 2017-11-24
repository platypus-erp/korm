package org.platypus.impl.korm.identifiants

import org.platypus.impl.korm.model.BaseModel

class ModelID internal constructor(val model: BaseModel<*, *>, val id: Long) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as ModelID
        if (model != other.model) return false
        if (id != other.id) return false
        return true
    }

    override fun hashCode(): Int {
        var result = model.hashCode()
        result = 31 * result + id.hashCode()
        return result
    }

    fun isEmpty(): Boolean {
        return this.id <= 0
    }

    fun toIds(): ModelIDS = ModelIDS(this.model, mutableSetOf(this.id))

    fun isInDB(): Boolean = this.id >= 0
    fun isNotInDB(): Boolean = !this.isInDB()

    override fun toString(): String {
        return "${model.modelName}($id)"
    }

    operator fun plus(modelIds: ModelIDS): ModelIDS {
        if (this.model != modelIds.model) {
            TODO("Should never happen")
        }
        val copyids = modelIds.ids.toMutableSet()
        copyids.add(this.id)
        return ModelIDS(this.model, copyids)
    }

    operator fun plus(modelId: ModelID): ModelIDS {
        if (this.model != modelId.model) {
            TODO("Should never happen")
        }
        return ModelIDS(this.model, mutableSetOf(this.id, modelId.id))
    }
}