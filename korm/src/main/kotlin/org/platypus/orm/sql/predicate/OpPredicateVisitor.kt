package org.platypus.orm.sql.predicate

interface PredicateVisitor<PARAM, RETURN> {

    fun visit(element: IsNullOp, param: PARAM): RETURN
    fun visit(element: IsNotNullOp, param: PARAM): RETURN
    fun visit(element: BetweenOp, param: PARAM): RETURN
    fun visit(element: InList<*>, param: PARAM): RETURN
    fun visit(element: NotInList<*>, param: PARAM): RETURN
    fun visit(element: EqOp, param: PARAM): RETURN
    fun visit(element: NeqOp, param: PARAM): RETURN
    fun visit(element: LessOp, param: PARAM): RETURN
    fun visit(element: LessEqOp, param: PARAM): RETURN
    fun visit(element: GreaterEqOp, param: PARAM): RETURN
    fun visit(element: LikeOp, param: PARAM): RETURN
    fun visit(element: GreaterOp, param: PARAM): RETURN
    fun visit(element: ILikeOp, param: PARAM): RETURN
    fun visit(element: NotLikeOp, param: PARAM): RETURN
    fun visit(element: RegexpOp, param: PARAM): RETURN
    fun visit(element: NotRegexpOp, param: PARAM): RETURN
    fun visit(element: AndOp, param: PARAM): RETURN
    fun visit(element: OrOp, param: PARAM): RETURN
    fun visit(element: Exists, param: PARAM): RETURN
    fun visit(element: NotExists, param: PARAM): RETURN

}