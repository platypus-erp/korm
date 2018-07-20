package org.platypus.orm.sql.expression

import org.platypus.model.field.api.type.SqlFieldType
import org.platypus.orm.sql.literal
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