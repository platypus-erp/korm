package org.platypus.impl.korm.sql

import org.platypus.impl.korm.identifiants.ModelID
import org.platypus.impl.korm.model.property.AbstractKormStringProperty
import org.platypus.impl.korm.model.property.KormManyToOneProperty
import org.platypus.impl.korm.model.property.KormPkProperty
import org.platypus.impl.korm.model.property.KormProperty
import org.platypus.impl.korm.sql.column.type.DecimalColumnType
import org.platypus.impl.korm.sql.vendors.FunctionProvider
import org.platypus.impl.korm.sql.vendors.currentDialect
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime


fun <T : Any> coalesce(expr: ExpressionWithColumnType<T?>, alternate: ExpressionWithColumnType<T>): ExpressionWithColumnType<T> =
        Coalesce(expr, alternate)

fun case(value: Expression<*>? = null) = Case(value)

fun <T> ExpressionWithColumnType<T>.wrap(value: T): Expression<T> = QueryParameter(value, columnType)
fun <T> KormProperty<*, T>.wrap(value: T): Expression<T> = QueryParameter(value, this.column.columnType)

infix fun <T> ExpressionWithColumnType<T>.eq(t: T): Op<Boolean> {
    if (t == null) {
        return isNull()
    }
    return EqOp(this, wrap(t))
}

infix fun KormPkProperty<*>.eq(t: Long): Op<Boolean> = this.column eq wrap(ModelID(this.model, t))

infix fun AbstractKormStringProperty<*>.eq(s: String): Op<Boolean> = this.column eq s

infix fun KormManyToOneProperty<*, *>.eq(modelID: ModelID) = this.column eq modelID

infix fun KormPkProperty<*>.inList(list: Iterable<Long>): Op<Boolean> = this.column inList list

infix fun KormPkProperty<*>.eq(t: Int): Op<Boolean> {
    return EqOp(this.column, wrap(ModelID(this.model, t.toLong())))
}

infix fun KormPkProperty<*>.eq(t: ModelID): Op<Boolean> {
    return EqOp(this.column, wrap(t))
}

fun <T, S : T> Expression<T>.eq(other: Expression<S>): Op<Boolean> = EqOp(this, other)

infix fun <T, S : T> ExpressionWithColumnType<T>.eq(other: Expression<S>): Op<Boolean> = EqOp(this, other)

infix fun <T> ExpressionWithColumnType<T>.neq(other: T): Op<Boolean> {
    if (other == null) {
        return isNotNull()
    }

    return NeqOp(this, wrap(other))
}

fun <T, S : T> ExpressionWithColumnType<T>.neq(other: Expression<S>): Op<Boolean> = NeqOp(this, other)

fun <T> ExpressionWithColumnType<T>.isNull(): Op<Boolean> = IsNullOp(this)
fun <T> KormProperty<*, T>.isNull(): Op<Boolean> = IsNullOp(this.column)

fun <T> ExpressionWithColumnType<T>.isNotNull(): Op<Boolean> = IsNotNullOp(this)

infix fun <T> ExpressionWithColumnType<T>.less(t: T): Op<Boolean> = LessOp(this, wrap(t))

fun <T, S : T> ExpressionWithColumnType<T>.less(other: Expression<S>): Op<Boolean> = LessOp(this, other)

infix fun <T> ExpressionWithColumnType<T>.lessEq(t: T): Op<Boolean> = LessEqOp(this, wrap(t))

fun <T, S : T> ExpressionWithColumnType<T>.lessEq(other: Expression<S>): Op<Boolean> = LessEqOp(this, other)

infix fun <T> ExpressionWithColumnType<T>.greater(t: T): Op<Boolean> = GreaterOp(this, wrap(t))

fun <T, S : T> ExpressionWithColumnType<T>.greater(other: Expression<S>): Op<Boolean> = GreaterOp(this, other)

infix fun <T> ExpressionWithColumnType<T>.greaterEq(t: T): Op<Boolean> = GreaterEqOp(this, wrap(t))

fun <T, S : T> ExpressionWithColumnType<T>.greaterEq(other: Expression<S>): Op<Boolean> = GreaterEqOp(this, other)

operator fun <T, S : T> ExpressionWithColumnType<T>.plus(other: Expression<S>): ExpressionWithColumnType<T> = PlusOp(this, other, columnType)

operator fun <T> ExpressionWithColumnType<T>.plus(t: T): ExpressionWithColumnType<T> = PlusOp(this, wrap(t), columnType)

operator fun <T, S : T> ExpressionWithColumnType<T>.minus(other: Expression<S>): ExpressionWithColumnType<T> = MinusOp(this, other, columnType)

operator fun <T> ExpressionWithColumnType<T>.minus(t: T): ExpressionWithColumnType<T> = MinusOp(this, wrap(t), columnType)

operator fun <T, S : T> ExpressionWithColumnType<T>.times(other: Expression<S>): ExpressionWithColumnType<T> = TimesOp(this, other, columnType)

operator fun <T> ExpressionWithColumnType<T>.times(t: T): ExpressionWithColumnType<T> = TimesOp(this, wrap(t), columnType)

operator fun <T, S : T> ExpressionWithColumnType<T>.div(other: Expression<S>): ExpressionWithColumnType<T> = DivideOp(this, other, columnType)

operator fun <T> ExpressionWithColumnType<T>.div(t: T): ExpressionWithColumnType<T> = DivideOp(this, wrap(t), columnType)

infix fun <T : String?> ExpressionWithColumnType<T>.like(pattern: String): Op<Boolean> = LikeOp(this, QueryParameter(pattern, columnType))
infix fun <T : String?> ExpressionWithColumnType<T>.ilike(pattern: String): Op<Boolean> = ILikeOp(this, QueryParameter(pattern, columnType))

infix fun <T : String?> ExpressionWithColumnType<T>.notLike(pattern: String): Op<Boolean> = NotLikeOp(this, QueryParameter(pattern, columnType))

infix fun <T : String?> ExpressionWithColumnType<T>.regexp(pattern: String): Op<Boolean> = RegexpOp(this, QueryParameter(pattern, columnType))

infix fun <T : String?> ExpressionWithColumnType<T>.notRegexp(pattern: String): Op<Boolean> = NotRegexpOp(this, QueryParameter(pattern, columnType))

infix fun <T> ExpressionWithColumnType<T>.inList(list: Iterable<T>): Op<Boolean> = InListOrNotInListOp(this, list, isInList = true)

infix fun <T> ExpressionWithColumnType<T>.notInList(list: Iterable<T>): Op<Boolean> = InListOrNotInListOp(this, list, isInList = false)

@Suppress("UNCHECKED_CAST")
fun <T, S : T> ExpressionWithColumnType<T>.asLiteral(value: S) = when (value) {
    is Boolean -> booleanLiteral(value)
    is Int -> intLiteral(value)
    is Long -> longLiteral(value)
    is String -> stringLiteral(value)
    is LocalDate -> dateLiteral(value)
    is LocalDateTime -> dateTimeLiteral(value)
    else -> LiteralOp<T>(columnType, value)
} as LiteralOp<T>

@Suppress("UNCHECKED_CAST")
fun <T, S : T> ExpressionWithColumnType<T>.asLiteralOrNull(value: S?) = when (value) {
    is Boolean -> booleanLiteral(value)
    is Int -> intLiteral(value)
    is Long -> longLiteral(value)
    is String -> stringLiteral(value)
    is LocalDate -> dateLiteral(value)
    is LocalDateTime -> dateTimeLiteral(value)
    null -> null
    else -> LiteralOp<T>(columnType, value)
} as LiteralOp<T>?

fun <T, S : Any> ExpressionWithColumnType<T>.between(from: S, to: S): Op<Boolean> = Between(this, asLiteral(from), asLiteral(to))

fun ExpressionWithColumnType<Int>.intToDecimal(): ExpressionWithColumnType<BigDecimal> = NoOpConversion(this, DecimalColumnType(15, 0))

fun <T : String?> ExpressionWithColumnType<T>.match(pattern: String, mode: FunctionProvider.MatchMode?): Op<Boolean> {
    return with(currentDialect.functionProvider) {
        this@match.match(pattern, mode)
    }
}

infix fun <T : String?> ExpressionWithColumnType<T>.match(pattern: String): Op<Boolean> = match(pattern, null)
