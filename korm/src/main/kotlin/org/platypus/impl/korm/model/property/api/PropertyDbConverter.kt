package org.platypus.impl.korm.model.property.api

/**
 * This interface is use to convert a SQL type to a valid Kolin type
 */
interface PropertyDbConverter<KOTLIN_TYPE, SQL_TYPE> {
    /**
     * This method convert an SQL value to a valid kotlin value
     */
    fun toKotlin(value: SQL_TYPE?): KOTLIN_TYPE?

    /**
     * This method convert an Kotlin value to a valid SQL value
     */
    fun toSql(value: KOTLIN_TYPE?): SQL_TYPE?
}