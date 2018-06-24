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

infix fun TypedExpression<String>.like(pattern: String): Expression<Boolean> = LikeOp(this, wrap(pattern))

infix fun TypedExpression<String>.startWith(pattern: String): Expression<Boolean> = LikeOp(this, wrap(pattern))

infix fun TypedExpression<String>.iStartWith(pattern: String): Expression<Boolean> = LikeOp(this, wrap(pattern))

infix fun TypedExpression<String>.notStartWith(pattern: String): Expression<Boolean> = LikeOp(this, wrap(pattern))

infix fun TypedExpression<String>.notIStartWith(pattern: String): Expression<Boolean> = LikeOp(this, wrap(pattern))

infix fun TypedExpression<String>.endWith(pattern: String): Expression<Boolean> = LikeOp(this, wrap(pattern))

infix fun TypedExpression<String>.iEndWith(pattern: String): Expression<Boolean> = LikeOp(this, wrap(pattern))

infix fun TypedExpression<String>.notEndWith(pattern: String): Expression<Boolean> = LikeOp(this, wrap(pattern))

infix fun TypedExpression<String>.notIEndWith(pattern: String): Expression<Boolean> = LikeOp(this, wrap(pattern))

infix fun TypedExpression<String>.ilike(pattern: String): Expression<Boolean> = ILikeOp(this, wrap(pattern))

infix fun TypedExpression<String>.notLike(pattern: String): Expression<Boolean> = NotLikeOp(this, wrap(pattern))
infix fun TypedExpression<String>.notILike(pattern: String): Expression<Boolean> = NotLikeOp(this, wrap(pattern))

infix fun TypedExpression<String>.regexp(pattern: String): Expression<Boolean> = RegexpOp(this, wrap(pattern))

infix fun TypedExpression<String>.notRegexp(pattern: String): Expression<Boolean> = NotRegexpOp(this, wrap(pattern))

//    fun <T : String?> Expression<T>.match(pattern: String, mode: FunctionProvider.MatchMode?): Expression<Boolean> {
//        return with(currentDialect.functionProvider) {
//            this@match.match(pattern, mode)
//        }
//    }

//infix fun match(pattern: String): Expression<Boolean> = match(pattern, null)


fun <T : Any> coalesce(expr: Expression<T?>, alternate: Expression<T>): Expression<T> = Coalesce(expr, alternate)

fun case(value: Expression<*>? = null) = Case(value)
