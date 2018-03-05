package org.platypus.model

class ModelSlotsImpl(override val type: ModelType) : ModelSlots {
    override var help: String? = null
        internal set
    override var label: String? = null
        internal set
}