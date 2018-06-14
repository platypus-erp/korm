package org.platypus.orm.sql.expression

import org.platypus.model.IModel
import org.platypus.model.Model
import org.platypus.model.field.api.ReferencedField
import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.orm.sql.literal
import org.platypus.orm.sql.or
import org.platypus.orm.sql.predicate.BetweenOp
import org.platypus.orm.sql.predicate.EqOp
import org.platypus.orm.sql.predicate.GreaterEqOp
import org.platypus.orm.sql.predicate.GreaterOp
import org.platypus.orm.sql.predicate.InList
import org.platypus.orm.sql.predicate.IsNotNullOp
import org.platypus.orm.sql.predicate.IsNullOp
import org.platypus.orm.sql.predicate.LessEqOp
import org.platypus.orm.sql.predicate.LessOp
import org.platypus.orm.sql.predicate.NeqOp
import org.platypus.orm.sql.predicate.NotInList
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*

interface Expression<T> {
    fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN
}

interface TypedExpression<T> : Expression<T> {
    val type: SqlFieldType
}

infix fun <S : T, T> Expression<T>.eq(other: Expression<S>): Expression<Boolean> = EqOp(this, other)
infix fun <S : T, T> Expression<T>.eqOrNull(other: Expression<S>): Expression<Boolean> = EqOp(this, other) or this.isNull()

fun <S : T, T> Expression<T>.isNull(): Expression<Boolean> = IsNullOp(this)

fun <S : T, T> Expression<T>.isNotNull(): Expression<Boolean> = IsNotNullOp(this)

fun <S : T, T> Expression<T>.less(other: Expression<S>): Expression<Boolean> = LessOp(this, other)

fun <S : T, T> Expression<T>.lessEq(other: Expression<S>): Expression<Boolean> = LessEqOp(this, other)

fun <S : T, T> Expression<T>.greater(other: Expression<S>): Expression<Boolean> = GreaterOp(this, other)

fun <S : T, T> Expression<T>.greaterEq(other: Expression<S>): Expression<Boolean> = GreaterEqOp(this, other)

operator fun <S : T, T> Expression<T>.plus(other: Expression<S>): Expression<T> = PlusOp(this, other)

operator fun <S : T, T> Expression<T>.minus(other: Expression<S>): Expression<T> = MinusOp(this, other)

operator fun <S : T, T> Expression<T>.times(other: Expression<S>): Expression<T> = MultiplyOp(this, other)

operator fun <S : T, T> Expression<T>.div(other: Expression<S>): Expression<T> = DivideOp(this, other)


infix fun <M : IModel<M>, TM : Model<TM>> ReferencedField<M, TM>.eq(t: Int?): Expression<Boolean> {
    if (t == null) {
        return isNull()
    }
    return EqOp(this, QueryParameter(this.type, t))
}

infix fun <T> TypedExpression<T>.eq(t: T?): Expression<Boolean> {
    if (t == null) {
        return isNull()
    }
    return EqOp(this, wrap(t))
}

fun <T> TypedExpression<T>.wrap(value: T): Expression<T> = QueryParameter(this.type, value)

infix fun <T> TypedExpression<T>.neq(other: T): Expression<Boolean> {
    if (other == null) {
        return isNotNull()
    }

    return NeqOp(this, wrap(other))
}

infix fun <T> TypedExpression<T>.eqOrNull(t: T): Expression<Boolean> = EqOp(this, wrap(t)) or this.isNull()

infix fun <T> TypedExpression<T>.less(t: T): Expression<Boolean> = LessOp(this, wrap(t))

infix fun <T> TypedExpression<T>.lessEq(t: T): Expression<Boolean> = LessEqOp(this, wrap(t))

infix fun <T> TypedExpression<T>.greater(t: T): Expression<Boolean> = GreaterOp(this, wrap(t))

infix fun <T> TypedExpression<T>.greaterEq(t: T): Expression<Boolean> = GreaterEqOp(this, wrap(t))

operator fun <T> TypedExpression<T>.plus(t: T): Expression<T> = PlusOp(this, wrap(t))

operator fun <T> TypedExpression<T>.minus(t: T): Expression<T> = MinusOp(this, wrap(t))

operator fun <T> TypedExpression<T>.times(t: T): Expression<T> = MultiplyOp(this, wrap(t))

operator fun <T> TypedExpression<T>.div(t: T): Expression<T> = DivideOp(this, wrap(t))

infix fun <T> TypedExpression<T>.inList(list: Iterable<T>): Expression<Boolean> = InList(this, list)

infix fun <T> TypedExpression<T>.notInList(list: Iterable<T>): Expression<Boolean> = NotInList(this, list)


fun <T> TypedExpression<T>.asLiteralOrNull(value: T?) = if (value == null) null else asLiteral(value)

fun <T> TypedExpression<T>.between(from: T, to: T): Expression<Boolean> = BetweenOp(this, asLiteral(from), asLiteral(to))


fun <S> asLiteral(value: S) = when (value) {
    is Boolean -> value.literal()
    is Int -> value.literal()
    is Long -> value.literal()
    is String -> value.literal()
    is LocalDate -> value.literal()
    is LocalDateTime -> value.literal()
    else -> LiteralOp<S>(value)
} as LiteralOp<S>


interface FieldExpression<T> : TypedExpression<T>

class LiteralOp<T>(val value: T) : Expression<T> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class ExpressionAlias<T : Any?>(val delegate: Expression<T>, val alias: String) : Expression<T> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)

    fun aliasOnlyExpression(): Expression<T> = ExpressionAliasOnly(alias)
}

class ExpressionAliasOnly<T : Any?>(val alias: String) : Expression<T> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class NoOpConversion<T, S : T>(val expr: Expression<T>, val colType: SqlFieldType) : Expression<S> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class QueryParameter<T>(val colType: SqlFieldType, val value: T) : Expression<T> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class PlusOp<T, S : T>(val expr1: Expression<T>, val expr2: Expression<S>) : Expression<T> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class MinusOp<T, S : T>(val expr1: Expression<T>, val expr2: Expression<S>) : Expression<T> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class MultiplyOp<T, S : T>(val expr1: Expression<T>, val expr2: Expression<S>) : Expression<T> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class DivideOp<T, S : T>(val expr1: Expression<T>, val expr2: Expression<S>) : Expression<T> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class NotOp<T>(val expr: Expression<T>) : Expression<T> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN =
            visitor.visit(this, param)
}

sealed class Function<T> : Expression<T>

class Count(val expr: Expression<*>, val distinct: Boolean = false) : Function<Int>() {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class Date(val expr: Expression<LocalDate?>) : Function<LocalDate>() {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class CurrentDateTime : Function<LocalDateTime>() {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class Month(val expr: Expression<LocalDate?>) : Function<LocalDate>() {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class LowerCase<T : String?>(val expr: Expression<T>) : Function<T>() {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class UpperCase<T : String?>(val expr: Expression<T>) : Function<T>() {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class Min<T>(val expr: Expression<T>) : Function<T?>() {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class Max<T>(val expr: Expression<T>) : Function<T?>() {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class Avg<T>(val expr: Expression<T>, scale: Int) : Function<BigDecimal?>() {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class StdDevPop<T>(val expr: Expression<T>, scale: Int) : Function<BigDecimal?>() {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class StdDevSamp<T>(val expr: Expression<T>, scale: Int) : Function<BigDecimal?>() {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class VarPop<T>(val expr: Expression<T>, scale: Int) : Function<BigDecimal?>() {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class VarSamp<T>(val expr: Expression<T>, scale: Int) : Function<BigDecimal?>() {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class Sum<T>(val expr: Expression<T>) : Function<T?>() {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class Coalesce<T>(val expr: Expression<T?>, val alternate: Expression<T>) : Function<T>() {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class Trim(val expr: Expression<*>) : Function<String>() {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class Case(val value: Expression<*>? = null) {
    fun <T> When(cond: Expression<Boolean>, result: Expression<T>): CaseWhen<T> =
            CaseWhen<T>(value).When(cond, result)
}

class CaseWhen<T>(val value: Expression<*>?) {
    val cases: ArrayList<Pair<Expression<Boolean>, Expression<T>>> = ArrayList()
    fun When(cond: Expression<Boolean>, result: Expression<T>): CaseWhen<T> {
        cases.add(cond to result)
        return this
    }

    fun Else(e: Expression<T>): Expression<T> = CaseWhenElse(this, e)
}

class CaseWhenElse<T>(val caseWhen: CaseWhen<T>, val elseResult: Expression<T>) : Expression<T> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class GroupConcat(val expr: Expression<*>, val separator: String?, val distinct: Boolean, vararg val orderBy: Pair<Expression<*>, Boolean>) : Function<String?>() {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}