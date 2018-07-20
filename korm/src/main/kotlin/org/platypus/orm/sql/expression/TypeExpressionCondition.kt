package org.platypus.orm.sql.expression

import org.platypus.orm.sql.or
import org.platypus.orm.sql.predicate.BetweenOp
import org.platypus.orm.sql.predicate.EqOp
import org.platypus.orm.sql.predicate.GreaterEqOp
import org.platypus.orm.sql.predicate.GreaterOp
import org.platypus.orm.sql.predicate.InList
import org.platypus.orm.sql.predicate.LessEqOp
import org.platypus.orm.sql.predicate.LessOp
import org.platypus.orm.sql.predicate.NeqOp
import org.platypus.orm.sql.predicate.NotInList

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