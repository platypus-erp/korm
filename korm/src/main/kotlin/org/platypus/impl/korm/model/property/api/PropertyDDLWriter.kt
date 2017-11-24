package org.platypus.impl.korm.model.property.api

/**
 * This interface should only used to write a valid database provider ddl for the column
 */
interface PropertyDDLWriter {

    /**
     * The statement to create a column with some additional DDL statement if needed
     */
    fun createStatement(provider: PersitenceProvider): DDLProperty

    /**
     * only [DDLProperty.mainDDL] is used
     * @return the statement to modify a column
     */
    fun modifyStatement(provider: PersitenceProvider): DDLProperty

    /**
     * only [DDLProperty.mainDDL] is used
     * @return the statement DDL to drop a column
     */
    fun dropStatement(provider: PersitenceProvider): DDLProperty

}