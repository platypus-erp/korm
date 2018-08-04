package org.platypus.orm.sql

import org.platypus.orm.sql.expression.LiteralOp
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

//infix fun Expression<Boolean>.and(op: Expression<Boolean>): Expression<Boolean> = AndOp(this, op)
//
//infix fun Expression<Boolean>.or(op: Expression<Boolean>): Expression<Boolean> = OrOp(this, op)

//fun <T:Any> idParam(value: EntityID<T>, column: TableColumn<EntityID<T>>): Expression<EntityID<T>> = QueryParameter(value, EntityIdColumnType(column))
//fun <T:Any> idParam(value: EntityID<T>, column: Column<EntityID<T>>): Expression<EntityID<T>> = QueryParameter(value, EntityIDColumnType(column))
//fun booleanParam(value: Boolean): Expression<Boolean> = QueryParameter(value, BooleanSqlFieldType())
//fun intParam(value: Int): Expression<Int> = QueryParameter(value, IntegerSqlFieldType())
//fun longParam(value: Long): Expression<Long> = QueryParameter(value, LongSqlFieldType())
//fun stringParam(value: String): Expression<String> = QueryParameter(value, StringSqlFieldType())
//fun dateParam(value: LocalDate): Expression<LocalDate> = QueryParameter(value, DateSqlFieldType())
//fun dateParam(value: LocalDateTime): Expression<LocalDate> = QueryParameter(value.toLocalDate(), DateSqlFieldType())
//fun dateTimeParam(value: LocalDateTime): Expression<LocalDateTime> = QueryParameter(value, DateTimeSqlFieldType())

fun Boolean.literal(): LiteralOp<Boolean> = LiteralOp(this)
fun Int.literal(): LiteralOp<Int> = LiteralOp(this)
fun BigDecimal.literal(): LiteralOp<BigDecimal> = LiteralOp(this)
fun Long.literal(): LiteralOp<Long> = LiteralOp(this)
fun String.literal(): LiteralOp<String> = LiteralOp(this)
fun LocalDate.literal(): LiteralOp<LocalDate> = LiteralOp(this)
fun LocalDateTime.literal(): LiteralOp<LocalDateTime> = LiteralOp(this)
fun LocalTime.literal(): LiteralOp<LocalTime> = LiteralOp(this)

