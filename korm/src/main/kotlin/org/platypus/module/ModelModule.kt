package org.platypus.module

import org.platypus.model.Model

class ModelModule {
    private val internalModels: MutableSet<ModelDataHolder<*>> = HashSet()

    val models: Set<ModelDataHolder<*>>
        get() = internalModels

    operator fun <M : Model<M>> M.unaryPlus(){
        internalModels.add(ModelDataHolder(this))
    }

    infix fun <M : Model<M>> M.config(def: ModelDataHolder<M>.() -> Unit) {
        internalModels.add(ModelDataHolder(this).apply { def() })
    }
}