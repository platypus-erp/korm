package org.platypus.impl.korm.sql

import org.platypus.impl.korm.sql.column.type.BooleanColumnType
import org.platypus.impl.korm.sql.column.type.DateColumnType
import org.platypus.impl.korm.sql.column.type.DateTimeColumnType
import org.platypus.impl.korm.sql.column.type.DecimalColumnType
import org.platypus.impl.korm.sql.column.type.IColumnType
import org.platypus.impl.korm.sql.column.type.IntegerColumnType
import org.platypus.impl.korm.sql.column.type.LongColumnType
import org.platypus.impl.korm.sql.column.type.StringColumnType
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime

abstract class Op<out T> : Expression<T>() {
    companion object {
        inline fun <T> build(op: () -> Op<T>): Op<T> = op()
    }
}

infix fun Op<Boolean>.and(op: Expression<Boolean>): Op<Boolean> = AndOp(this, op)

infix fun Op<Boolean>.or(op: Expression<Boolean>): Op<Boolean> = OrOp(this, op)

class IsNullOp(val expr: Expression<*>) : Op<Boolean>() {
    override fun toSQL(queryBuilder: QueryBuilder): String = "${expr.toSQL(queryBuilder)} IS NULL"
}

class IsNotNullOp(val expr: Expression<*>) : Op<Boolean>() {
    override fun toSQL(queryBuilder: QueryBuilder): String = "${expr.toSQL(queryBuilder)} IS NOT NULL"
}

class LiteralOp<out T>(override val columnType: IColumnType, val value: T) : ExpressionWithColumnType<T>() {
    override fun toSQL(queryBuilder: QueryBuilder): String = columnType.valueToString(value)
}

class Between(val expr: Expression<*>, val from: LiteralOp<*>, val to: LiteralOp<*>) : Op<Boolean>() {
    override fun toSQL(queryBuilder: QueryBuilder): String =
        "${expr.toSQL(queryBuilder)} BETWEEN ${from.toSQL(queryBuilder)} AND ${to.toSQL(queryBuilder)}"
}

class NoOpConversion<out T, out S>(val expr: Expression<T>, override val columnType: IColumnType) : ExpressionWithColumnType<S>() {
    override fun toSQL(queryBuilder: QueryBuilder): String = expr.toSQL(queryBuilder)
}

class InListOrNotInListOp<out T>(val expr: ExpressionWithColumnType<T>, val list: Iterable<T>, val isInList: Boolean = true) : Op<Boolean>() {

    override fun toSQL(queryBuilder: QueryBuilder): String = buildString {
        list.iterator().let { i ->
            if (!i.hasNext()) {
                val expr = build { booleanLiteral(!isInList) eq booleanLiteral(true) }
                append(expr.toSQL(queryBuilder))
            } else {
                val first = i.next()
                if (!i.hasNext()) {
                    append(expr.toSQL(queryBuilder))
                    when {
                        isInList -> append(" = ")
                        else -> append(" != ")
                    }
                    append(queryBuilder.registerArgument(expr.columnType, first))
                } else {
                    append(expr.toSQL(queryBuilder))
                    when {
                        isInList -> append(" IN (")
                        else -> append(" NOT IN (")
                    }

                    queryBuilder.registerArguments(expr.columnType, list).joinTo(this)

                    append(")")
                }
            }
        }
    }
}

class QueryParameter<out T>(val value: T, val sqlType: IColumnType) : Expression<T>() {
    override fun toSQL(queryBuilder: QueryBuilder): String = queryBuilder.registerArgument(sqlType, value)
}

<<<<<<< HEAD
//fun <T:Any> idParam(value: EntityID<T>, column: TableColumn<EntityID<T>>): Expression<EntityID<T>> = QueryParameter(value, EntityIdColumnType(column))
=======
//fun <T:Any> idParam(value: EntityID<T>, column: Column<EntityID<T>>): Expression<EntityID<T>> = QueryParameter(value, EntityIDColumnType(column))
>>>>>>> parent of b2af04b... fixup! Commit
//fun booleanParam(value: Boolean): Expression<Boolean> = QueryParameter(value, BooleanColumnType())
//fun intParam(value: Int): Expression<Int> = QueryParameter(value, IntegerColumnType())
//fun longParam(value: Long): Expression<Long> = QueryParameter(value, LongColumnType())
//fun stringParam(value: String): Expression<String> = QueryParameter(value, StringColumnType())
//fun dateParam(value: LocalDate): Expression<LocalDate> = QueryParameter(value, DateColumnType())
//fun dateParam(value: LocalDateTime): Expression<LocalDate> = QueryParameter(value.toLocalDate(), DateColumnType())
//fun dateTimeParam(value: LocalDateTime): Expression<LocalDateTime> = QueryParameter(value, DateTimeColumnType())

fun booleanLiteral(value: Boolean): LiteralOp<Boolean> = LiteralOp(BooleanColumnType(), value)
fun intLiteral(value: Int): LiteralOp<Int> = LiteralOp(IntegerColumnType(), value)
fun decimalLiteral(value: BigDecimal): LiteralOp<BigDecimal> = LiteralOp(DecimalColumnType(10, 10), value)
fun longLiteral(value: Long): LiteralOp<Long> = LiteralOp(LongColumnType(), value)
fun stringLiteral(value: String): LiteralOp<String> = LiteralOp(StringColumnType(), value)
fun dateLiteral(value: LocalDate): LiteralOp<LocalDate> = LiteralOp(DateColumnType(), value)
fun dateLiteral(value: LocalDateTime): LiteralOp<LocalDate> = LiteralOp(DateColumnType(), value.toLocalDate())
fun dateTimeLiteral(value: LocalDateTime): LiteralOp<LocalDateTime> = LiteralOp(DateTimeColumnType(), value)

abstract class ComparisonOp(val expr1: Expression<*>, val expr2: Expression<*>, val opSign: String) : Op<Boolean>() {
    override fun toSQL(queryBuilder: QueryBuilder) = buildString {
        if (expr1 is OrOp<*>) {
            append("(").append(expr1.toSQL(queryBuilder)).append(")")
        } else {
            append(expr1.toSQL(queryBuilder))
        }
        append(" $opSign ")
        if (expr2 is OrOp<*>) {
            append("(").append(expr2.toSQL(queryBuilder)).append(")")
        } else {
            append(expr2.toSQL(queryBuilder))
        }
    }
}

class EqOp(expr1: Expression<*>, expr2: Expression<*>) : ComparisonOp(expr1, expr2, "=")
class NeqOp(expr1: Expression<*>, expr2: Expression<*>) : ComparisonOp(expr1, expr2, "<>")
class LessOp(expr1: Expression<*>, expr2: Expression<*>) : ComparisonOp(expr1, expr2, "<")
class LessEqOp(expr1: Expression<*>, expr2: Expression<*>) : ComparisonOp(expr1, expr2, "<=")
class GreaterOp(expr1: Expression<*>, expr2: Expression<*>) : ComparisonOp(expr1, expr2, ">")
class GreaterEqOp(expr1: Expression<*>, expr2: Expression<*>) : ComparisonOp(expr1, expr2, ">=")
class LikeOp(expr1: Expression<*>, expr2: Expression<*>) : ComparisonOp(expr1, expr2, "LIKE")
class ILikeOp(expr1: Expression<*>, expr2: Expression<*>) : ComparisonOp(expr1, expr2, "ILIKE")
class NotLikeOp(expr1: Expression<*>, expr2: Expression<*>) : ComparisonOp(expr1, expr2, "NOT LIKE")
class RegexpOp(expr1: Expression<*>, expr2: Expression<*>) : ComparisonOp(expr1, expr2, "REGEXP")
class NotRegexpOp(expr1: Expression<*>, expr2: Expression<*>) : ComparisonOp(expr1, expr2, "NOT REGEXP")

class AndOp(val expr1: Expression<Boolean>, val expr2: Expression<Boolean>) : Op<Boolean>() {
    override fun toSQL(queryBuilder: QueryBuilder): String = buildString {
        if (expr1 is OrOp<*>) {
            append("(").append(expr1.toSQL(queryBuilder)).append(")")
        } else {
            append(expr1.toSQL(queryBuilder))
        }
        append(" and ")
        if (expr2 is OrOp<*>) {
            append("(").append(expr2.toSQL(queryBuilder)).append(")")
        } else {
            append(expr2.toSQL(queryBuilder))
        }
    }
}

class OrOp<out T>(val expr1: Expression<T>, val expr2: Expression<T>) : Op<Boolean>() {
    override fun toSQL(queryBuilder: QueryBuilder) = "(${expr1.toSQL(queryBuilder)}) OR (${expr2.toSQL(queryBuilder)})"
}

class exists(val query: Query) : Op<Boolean>() {
    override fun toSQL(queryBuilder: QueryBuilder) = "EXISTS (${query.prepareSQL(queryBuilder)})"
}

class notExists(val query: Query) : Op<Boolean>() {
    override fun toSQL(queryBuilder: QueryBuilder) = "NOT EXISTS (${query.prepareSQL(queryBuilder)})"
}

class PlusOp<out T, out S : T>(val expr1: Expression<T>, val expr2: Expression<S>, override val columnType: IColumnType) : ExpressionWithColumnType<T>() {
    override fun toSQL(queryBuilder: QueryBuilder) = "${expr1.toSQL(queryBuilder)}+${expr2.toSQL(queryBuilder)}"
}

class MinusOp<out T, out S : T>(val expr1: Expression<T>, val expr2: Expression<S>, override val columnType: IColumnType) : ExpressionWithColumnType<T>() {
    override fun toSQL(queryBuilder: QueryBuilder) = "${expr1.toSQL(queryBuilder)}-${expr2.toSQL(queryBuilder)}"
}

class TimesOp<out T, out S : T>(val expr1: Expression<T>, val expr2: Expression<S>, override val columnType: IColumnType) : ExpressionWithColumnType<T>() {
    override fun toSQL(queryBuilder: QueryBuilder): String = "(${expr1.toSQL(queryBuilder)}) * (${expr2.toSQL(queryBuilder)})"
}

class DivideOp<out T, out S : T>(val expr1: Expression<T>, val expr2: Expression<S>, override val columnType: IColumnType) : ExpressionWithColumnType<T>() {
    override fun toSQL(queryBuilder: QueryBuilder): String =
        "(${expr1.toSQL(queryBuilder)}) / (${expr2.toSQL(queryBuilder)})"
}
