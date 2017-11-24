package org.platypus.impl.korm.sql

import org.platypus.impl.korm.sql.column.type.IColumnType
import org.platypus.impl.korm.sql.column.type.IntegerColumnType
import java.time.LocalDate

fun Column<*>.count() = Count(this)

fun <T : LocalDate?> Expression<T>.date() = Date(this)

fun <T : LocalDate?> Expression<T>.month() = Month(this)

fun Column<*>.countDistinct() = Count(this, true)

fun <T : Any?> Column<T>.min() = Min(this, this.columnType)

fun <T : Any?> Column<T>.max() = Max(this, this.columnType)

fun <T : Any?> Column<T>.avg(scale: Int = 2) = Avg(this, scale)

fun <T : Any?> Column<T>.stdDevPop(scale: Int = 2) = StdDevPop(this, scale)

fun <T : Any?> Column<T>.stdDevSamp(scale: Int = 2) = StdDevSamp(this, scale)

fun <T : Any?> Column<T>.varPop(scale: Int = 2) = VarPop(this, scale)

fun <T : Any?> Column<T>.varSamp(scale: Int = 2) = VarSamp(this, scale)

fun <T : Any?> Column<T>.sum() = Sum(this, this.columnType)

fun <R : Any> Expression<*>.castTo(columnType: IColumnType) = Cast<R>(this, columnType)

fun <T : String?> Expression<T>.substring(start: Int, length: Int): Substring =
        Substring(this, LiteralOp(IntegerColumnType(), start), LiteralOp(IntegerColumnType(), length))

fun <T : String?> Expression<T>.trim() = Trim(this)

fun <T : String?> Expression<T>.lowerCase() = LowerCase(this)
fun <T : String?> Expression<T>.upperCase() = UpperCase(this)

fun <T : Any?> Column<T>.groupConcat(separator: String? = null, distinct: Boolean = false, vararg orderBy: Pair<Expression<*>, Boolean>): GroupConcat =
        GroupConcat(this, separator, distinct, *orderBy)