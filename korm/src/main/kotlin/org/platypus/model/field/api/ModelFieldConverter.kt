package org.platypus.model.field.api

interface ModelFieldConverter<SQL_TYPE, KOTLIN_TYPE> {
    fun fromSql(value: SQL_TYPE?): KOTLIN_TYPE?
    fun toSql(value: KOTLIN_TYPE?): SQL_TYPE?
    fun sqlToString(value: SQL_TYPE): String
    fun kotlinToString(value: KOTLIN_TYPE): String
    fun anyToString(value: Any?): String
    fun nullToSql(): SQL_TYPE?
    fun nullToKotlin(): KOTLIN_TYPE?
}