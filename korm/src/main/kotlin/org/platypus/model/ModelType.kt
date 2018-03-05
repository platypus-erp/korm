package org.platypus.model

/**
 * All the models type supported by Platypus orm
 */
enum class ModelType {
    /**
     * A classic models in the database
     */
    CLASSIC_MODEL,
    /**
     * This is a [CLASSIC_MODEL] but you can't create execute insert, update on it
     * To insert Data you need to use the PlatypusDataApi
     * This equivalent to a view but a real models in the database is created
     */
    READ_ONLY_MODEL,
    /**
     * This is a [CLASSIC_MODEL] but nothing is create in the Database
     * all the data are created when the [PlatypusServer] is initialized
     * and nothing is persisted at any time.
     * The data is deleted when the [platypusServer] is stoped
     */
    MEMORY_MODEL,
    /**
     * No models is created for this models but a query is executed on each select
     * No insert/update/delete can execute on this models type
     */
    MODEL_VIEW,
    /**
     * Like a view but need a manual reflesh
     * The select query is quicker than with a [MODEL_VIEW] but you don't have real time data
     */
    MODEL_STORED_VIEW,
    /**
     * A classic models but with two fieldsExpression
     * - parent witch is a foreign key to itself
     * - children witch is a [Bag] of all the children
     * A [MODEL_VIEW] is created to get the top parent with a single select
     */
    RECURSIVE_MODEL,
    /**
     * A models with some contextual unique field
     * @see PlatypusContext and PlatypusContextKeyTable for more information
     */
    CONTEXTUAL_MODEL,
    /**
     * Not a real models
     * This is used to abstract some generic behavior and re-use it one other [CLASSIC_MODEL]
     */
    ABSTRACT_MODEL,
    /**
     * This is a real Model created by Platypus to create the relation between [Model] when your create
     * [ModelFieldType.Type.MANY_TO_MANY] field
     */
    LINK_MODEL
}