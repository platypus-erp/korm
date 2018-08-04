package org.platypus.visitor

import org.platypus.orm.sql.expression.Avg
import org.platypus.orm.sql.expression.CaseWhenElse
import org.platypus.orm.sql.expression.Coalesce
import org.platypus.orm.sql.expression.Count
import org.platypus.orm.sql.expression.CurrentDateTime
import org.platypus.orm.sql.expression.Date
import org.platypus.orm.sql.expression.DivideOp
import org.platypus.orm.sql.expression.ExpressionAlias
import org.platypus.orm.sql.expression.ExpressionAliasOnly
import org.platypus.orm.sql.expression.ExpressionVisitor
import org.platypus.orm.sql.expression.GroupConcat
import org.platypus.orm.sql.expression.LiteralOp
import org.platypus.orm.sql.expression.LowerCase
import org.platypus.orm.sql.expression.Max
import org.platypus.orm.sql.expression.Min
import org.platypus.orm.sql.expression.MinusOp
import org.platypus.orm.sql.expression.Month
import org.platypus.orm.sql.expression.MultiplyOp
import org.platypus.orm.sql.expression.NoOpConversion
import org.platypus.orm.sql.expression.NotOp
import org.platypus.orm.sql.expression.PlusOp
import org.platypus.orm.sql.expression.QueryParameter
import org.platypus.orm.sql.expression.StdDevPop
import org.platypus.orm.sql.expression.StdDevSamp
import org.platypus.orm.sql.expression.Sum
import org.platypus.orm.sql.expression.Trim
import org.platypus.orm.sql.expression.UpperCase
import org.platypus.orm.sql.expression.VarPop
import org.platypus.orm.sql.expression.VarSamp
import org.platypus.orm.sql.predicate.AndOp
import org.platypus.orm.sql.predicate.BetweenOp
import org.platypus.orm.sql.predicate.EqOp
import org.platypus.orm.sql.predicate.Exists
import org.platypus.orm.sql.predicate.GreaterEqOp
import org.platypus.orm.sql.predicate.GreaterOp
import org.platypus.orm.sql.predicate.ILikeOp
import org.platypus.orm.sql.predicate.InListOp
import org.platypus.orm.sql.predicate.IsNotNullOp
import org.platypus.orm.sql.predicate.IsNullOp
import org.platypus.orm.sql.predicate.LessEqOp
import org.platypus.orm.sql.predicate.LessOp
import org.platypus.orm.sql.predicate.LikeOp
import org.platypus.orm.sql.predicate.NeqOp
import org.platypus.orm.sql.predicate.NotExists
import org.platypus.orm.sql.predicate.NotILikeOp
import org.platypus.orm.sql.predicate.NotInListOp
import org.platypus.orm.sql.predicate.NotLikeOp
import org.platypus.orm.sql.predicate.NotRegexpOp
import org.platypus.orm.sql.predicate.OrOp
import org.platypus.orm.sql.predicate.RegexpOp

interface ExpressionVisitorDefault<PARAM, DEFAULT> : FieldVisitorDefault<PARAM, DEFAULT>, ExpressionVisitor<PARAM, DEFAULT> {

    override fun visit(element: LiteralOp<*>, param: PARAM): DEFAULT = default

    override fun visit(element: NoOpConversion<*, *>, param: PARAM): DEFAULT = default

    override fun visit(element: NotOp<*>, param: PARAM): DEFAULT = default

    override fun visit(element: QueryParameter<*>, param: PARAM): DEFAULT = default

    override fun visit(element: PlusOp<*, *>, param: PARAM): DEFAULT = default

    override fun visit(element: MinusOp<*, *>, param: PARAM): DEFAULT = default

    override fun visit(element: MultiplyOp<*, *>, param: PARAM): DEFAULT = default

    override fun visit(element: DivideOp<*, *>, param: PARAM): DEFAULT = default

    override fun visit(element: Count, param: PARAM): DEFAULT = default

    override fun visit(element: Date, param: PARAM): DEFAULT = default

    override fun visit(element: CurrentDateTime, param: PARAM): DEFAULT = default

    override fun visit(element: Month, param: PARAM): DEFAULT = default

    override fun visit(element: LowerCase<*>, param: PARAM): DEFAULT = default

    override fun visit(element: UpperCase<*>, param: PARAM): DEFAULT = default

    override fun visit(element: Min<*>, param: PARAM): DEFAULT = default

    override fun visit(element: Max<*>, param: PARAM): DEFAULT = default

    override fun visit(element: Avg<*>, param: PARAM): DEFAULT = default

    override fun visit(element: StdDevPop<*>, param: PARAM): DEFAULT = default

    override fun visit(element: StdDevSamp<*>, param: PARAM): DEFAULT = default

    override fun visit(element: VarPop<*>, param: PARAM): DEFAULT = default

    override fun visit(element: VarSamp<*>, param: PARAM): DEFAULT = default

    override fun visit(element: Sum<*>, param: PARAM): DEFAULT = default

    override fun visit(element: Coalesce<*>, param: PARAM): DEFAULT = default

    override fun visit(element: Trim, param: PARAM): DEFAULT = default

    override fun visit(element: CaseWhenElse<*>, param: PARAM): DEFAULT = default

    override fun visit(element: GroupConcat, param: PARAM): DEFAULT = default

    override fun visit(element: ExpressionAlias<*>, param: PARAM): DEFAULT = default

    override fun visit(element: ExpressionAliasOnly<*>, param: PARAM): DEFAULT = default

    override fun visit(element: IsNullOp, param: PARAM): DEFAULT = default

    override fun visit(element: IsNotNullOp, param: PARAM): DEFAULT = default

    override fun visit(element: BetweenOp, param: PARAM): DEFAULT = default

    override fun visit(element: InListOp<*>, param: PARAM): DEFAULT = default

    override fun visit(element: NotInListOp<*>, param: PARAM): DEFAULT = default

    override fun visit(element: EqOp, param: PARAM): DEFAULT = default

    override fun visit(element: NeqOp, param: PARAM): DEFAULT = default

    override fun visit(element: LessOp, param: PARAM): DEFAULT = default

    override fun visit(element: LessEqOp, param: PARAM): DEFAULT = default

    override fun visit(element: GreaterEqOp, param: PARAM): DEFAULT = default

    override fun visit(element: LikeOp, param: PARAM): DEFAULT = default

    override fun visit(element: GreaterOp, param: PARAM): DEFAULT = default

    override fun visit(element: ILikeOp, param: PARAM): DEFAULT = default
    override fun visit(element: NotILikeOp, param: PARAM): DEFAULT = default

    override fun visit(element: NotLikeOp, param: PARAM): DEFAULT = default

    override fun visit(element: RegexpOp, param: PARAM): DEFAULT = default

    override fun visit(element: NotRegexpOp, param: PARAM): DEFAULT = default

    override fun visit(element: AndOp, param: PARAM): DEFAULT = default

    override fun visit(element: OrOp, param: PARAM): DEFAULT = default

    override fun visit(element: Exists, param: PARAM): DEFAULT = default

    override fun visit(element: NotExists, param: PARAM): DEFAULT = default
}