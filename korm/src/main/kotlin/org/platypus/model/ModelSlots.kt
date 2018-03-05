package org.platypus.model

/**
 * Contains all additional information for a specfic models
 */
interface ModelSlots {
    /**
     * The display fieldName of the models
     */
    val label: String?
    /**
     * A little help of what this models is used for
     */
    val help: String?
    /**
     * The type of the models
     * @see ModelType for more information
     */
    val type: ModelType
}