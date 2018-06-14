package org.platypus.orm.sql

import org.platypus.orm.sql.expression.Case
import org.platypus.orm.sql.expression.Coalesce
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.expression.TypedExpression
import org.platypus.orm.sql.expression.wrap
import org.platypus.orm.sql.predicate.ILikeOp
import org.platypus.orm.sql.predicate.LikeOp
import org.platypus.orm.sql.predicate.NotLikeOp
import org.platypus.orm.sql.predicate.NotRegexpOp
import org.platypus.orm.sql.predicate.RegexpOp


interface StringPredicateOperator<T : CharSequence> : TypedExpression<T> {

    infix fun like(pattern: T): Expression<Boolean> = LikeOp(this, wrap(pattern))

    infix fun startWith(pattern: T): Expression<Boolean> = LikeOp(this, wrap(pattern))

    infix fun iStartWith(pattern: T): Expression<Boolean> = LikeOp(this, wrap(pattern))

    infix fun notStartWith(pattern: T): Expression<Boolean> = LikeOp(this, wrap(pattern))

    infix fun notIStartWith(pattern: T): Expression<Boolean> = LikeOp(this, wrap(pattern))

    infix fun endWith(pattern: T): Expression<Boolean> = LikeOp(this, wrap(pattern))

    infix fun iEndWith(pattern: T): Expression<Boolean> = LikeOp(this, wrap(pattern))

    infix fun notEndWith(pattern: T): Expression<Boolean> = LikeOp(this, wrap(pattern))

    infix fun notIEndWith(pattern: T): Expression<Boolean> = LikeOp(this, wrap(pattern))

    infix fun ilike(pattern: T): Expression<Boolean> = ILikeOp(this, wrap(pattern))

    infix fun notLike(pattern: T): Expression<Boolean> = NotLikeOp(this, wrap(pattern))
    infix fun notILike(pattern: T): Expression<Boolean> = NotLikeOp(this, wrap(pattern))

    infix fun regexp(pattern: T): Expression<Boolean> = RegexpOp(this, wrap(pattern))

    infix fun notRegexp(pattern: T): Expression<Boolean> = NotRegexpOp(this, wrap(pattern))

//    fun <T : String?> Expression<T>.match(pattern: String, mode: FunctionProvider.MatchMode?): Expression<Boolean> {
//        return with(currentDialect.functionProvider) {
//            this@match.match(pattern, mode)
//        }
//    }

    //infix fun match(pattern: String): Expression<Boolean> = match(pattern, null)
}


fun <T : Any> coalesce(expr: Expression<T?>, alternate: Expression<T>): Expression<T> = Coalesce(expr, alternate)

fun case(value: Expression<*>? = null) = Case(value)
