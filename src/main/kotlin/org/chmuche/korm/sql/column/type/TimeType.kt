package org.chmuche.korm.sql.column.type

import org.chmuche.korm.sql.vendors.currentDialect
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

private val DEFAULT_DATE_STRING_FORMATTER = DateTimeFormatter.ofPattern("YYYY-MM-dd", Locale.ROOT)
private val DEFAULT_DATE_TIME_STRING_FORMATTER = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss.SSSSSS", Locale.ROOT)

class DateTimeColumnType() : ColumnType() {
    override fun sqlType(): String = currentDialect.dataTypeProvider.dateTimeType()
}

class TimeColumnType() : ColumnType() {
    override fun sqlType(): String = currentDialect.dataTypeProvider.dateType()
}

class DateColumnType : ColumnType() {
    override fun sqlType(): String = currentDialect.dataTypeProvider.timeType()

    override fun nonNullValueToString(value: Any): String {
        if (value is String) return value

        val dateTime = when (value) {
            is LocalDate -> value
            is LocalDateTime -> value.toLocalDate()
            is java.sql.Date -> value.toLocalDate()
            is java.sql.Timestamp -> value.toLocalDateTime().toLocalDate()
            else -> error("Unexpected value: $value")
        }

        return "'${DEFAULT_DATE_STRING_FORMATTER.format(dateTime)}'"
    }

    override fun valueFromDB(value: Any): Any = when (value) {
        is LocalDate -> value
        is LocalDateTime -> value.toLocalDate()
        is java.sql.Date -> value.toLocalDate()
        is java.sql.Timestamp -> value.toLocalDateTime().toLocalDate()
        is Int -> LocalDate.ofEpochDay(value.toLong())
        is Long -> LocalDate.ofEpochDay(value)
        is String -> DEFAULT_DATE_STRING_FORMATTER.parse(value)
        else -> DEFAULT_DATE_TIME_STRING_FORMATTER.parse(value.toString())
    }

    override fun notNullValueToDB(value: Any): Any = when (value) {
        is LocalDate -> java.sql.Date(value.toEpochDay())
        is LocalDateTime -> java.sql.Date(value.toLocalDate().toEpochDay())
        else -> error("Unexpected value: $value")
    }
}