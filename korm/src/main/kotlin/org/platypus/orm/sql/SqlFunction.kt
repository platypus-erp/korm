package org.platypus.orm.sql

import org.platypus.model.field.api.ModelField
import org.platypus.orm.sql.expression.Avg
import org.platypus.orm.sql.expression.Count
import org.platypus.orm.sql.expression.Date
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.expression.LowerCase
import org.platypus.orm.sql.expression.Max
import org.platypus.orm.sql.expression.Min
import org.platypus.orm.sql.expression.Month
import org.platypus.orm.sql.expression.NotOp
import org.platypus.orm.sql.expression.StdDevPop
import org.platypus.orm.sql.expression.StdDevSamp
import org.platypus.orm.sql.expression.Sum
import org.platypus.orm.sql.expression.Trim
import org.platypus.orm.sql.expression.UpperCase
import org.platypus.orm.sql.expression.VarPop
import org.platypus.orm.sql.expression.VarSamp
import java.time.LocalDate

fun ModelField<*, *>.count() = Count(this)
//
fun Expression<LocalDate?>.date() = Date(this)

fun Expression<LocalDate?>.month() = Month(this)

fun ModelField<*, *>.countDistinct() = Count(this, true)

fun ModelField<*, *>.min() = Min(this)

fun ModelField<*, *>.max() = Max(this)

fun ModelField<*, *>.avg(scale: Int = 2) = Avg(this, scale)

fun ModelField<*, *>.stdDevPop(scale: Int = 2) = StdDevPop(this, scale)

fun ModelField<*, *>.stdDevSamp(scale: Int = 2) = StdDevSamp(this, scale)

fun ModelField<*, *>.varPop(scale: Int = 2) = VarPop(this, scale)

fun ModelField<*, *>.varSamp(scale: Int = 2) = VarSamp(this, scale)

fun ModelField<*, *>.sum() = Sum(this)

//fun <R : Any> Expression<*>.castTo(columnType: SqlFieldType) = Cast<R>(this, columnType)

//fun <T : String?> Expression<T>.substring(start: Int, length: Int): Substring =
//        Substring(this, LiteralOp(IntegerSqlFieldType(), start), LiteralOp(IntegerSqlFieldType(), length))

fun <T : String?> Expression<T>.trim() = Trim(this)

fun <T : String?> upper(expr: Expression<T>) = UpperCase(expr)
fun <T : String?> lower(expr: Expression<T>) = LowerCase(expr)
fun <T> not(expr: Expression<T>) = NotOp(expr)

//fun <T : Any?> Column<T>.groupConcat(separator: String? = null, distinct: Boolean = false, vararg orderBy: Pair<Expression<*>, Boolean>): GroupConcat =
//        GroupConcat(this, separator, distinct, *orderBy)