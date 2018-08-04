package org.platypus.orm.sql.predicate

import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.expression.ExpressionVisitor
import org.platypus.orm.sql.expression.LiteralOp
import org.platypus.orm.sql.expression.TypedExpression
import org.platypus.orm.sql.query.Query


class IsNullOp(val expr: Expression<*>) : Expression<Boolean> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class IsNotNullOp(val expr: Expression<*>) : Expression<Boolean> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class BetweenOp(val expr: Expression<*>, val from: LiteralOp<*>, val to: LiteralOp<*>) : Expression<Boolean> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}


class InListOp<T>(val expr: TypedExpression<T>, val list: Iterable<T>) : Expression<Boolean> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)
}

class NotInListOp<T>(val expr: TypedExpression<T>, val list: Iterable<T>) : Expression<Boolean> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.visit(this, param)

}


class EqOp(val expr1: Expression<*>, val expr2: Expression<*>) : Expression<Boolean> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN =
            visitor.visit(this, param)
}

class NeqOp(val expr1: Expression<*>, val expr2: Expression<*>) : Expression<Boolean> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN =
            visitor.visit(this, param)
}

class LessOp(val expr1: Expression<*>, val expr2: Expression<*>) : Expression<Boolean> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN =
            visitor.visit(this, param)
}

class LessEqOp(val expr1: Expression<*>, val expr2: Expression<*>) : Expression<Boolean> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN =
            visitor.visit(this, param)
}

class GreaterOp(val expr1: Expression<*>, val expr2: Expression<*>) : Expression<Boolean> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN =
            visitor.visit(this, param)
}

class GreaterEqOp(val expr1: Expression<*>, val expr2: Expression<*>) : Expression<Boolean> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN =
            visitor.visit(this, param)
}

class LikeOp(val expr1: Expression<*>, val expr2: Expression<*>) : Expression<Boolean> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN =
            visitor.visit(this, param)
}

class ILikeOp(val expr1: Expression<*>, val expr2: Expression<*>) : Expression<Boolean> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN =
            visitor.visit(this, param)
}

class NotILikeOp(val expr1: Expression<*>, val expr2: Expression<*>) : Expression<Boolean> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN =
            visitor.visit(this, param)
}


class NotLikeOp(val expr1: Expression<*>, val expr2: Expression<*>) : Expression<Boolean> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN =
            visitor.visit(this, param)
}

class RegexpOp(val expr1: Expression<*>, val expr2: Expression<*>) : Expression<Boolean> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN =
            visitor.visit(this, param)
}

class NotRegexpOp(val expr1: Expression<*>, val expr2: Expression<*>) : Expression<Boolean> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN =
            visitor.visit(this, param)
}

class Exists(val query: Query) : Expression<Boolean> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN =
            visitor.visit(this, param)
}

class NotExists(val query: Query) : Expression<Boolean> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN =
            visitor.visit(this, param)
}

class AndOp(val expr1: Expression<Boolean>, val expr2: Expression<Boolean>) : Expression<Boolean> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN =
            visitor.visit(this, param)
}

class OrOp(val expr1: Expression<Boolean>, val expr2: Expression<Boolean>) : Expression<Boolean> {
    override fun <PARAM, RETURN> accept(visitor: ExpressionVisitor<PARAM, RETURN>, param: PARAM): RETURN =
            visitor.visit(this, param)
}