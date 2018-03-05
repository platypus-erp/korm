package org.platypus.orm.sql.expression

import org.platypus.model.field.api.FieldVisitor
import org.platypus.orm.sql.predicate.PredicateVisitor


interface ExpressionVisitor<PARAM, RETURN> : PredicateVisitor<PARAM, RETURN>, FieldVisitor<PARAM, RETURN> {
    fun visit(element: LiteralOp<*>, param: PARAM): RETURN
    fun visit(element: NoOpConversion<*, *>, param: PARAM): RETURN
    fun visit(element: NotOp<*>, param: PARAM): RETURN
    fun visit(element: QueryParameter<*>, param: PARAM): RETURN
    fun visit(element: PlusOp<*, *>, param: PARAM): RETURN
    fun visit(element: MinusOp<*, *>, param: PARAM): RETURN
    fun visit(element: MultiplyOp<*, *>, param: PARAM): RETURN
    fun visit(element: DivideOp<*, *>, param: PARAM): RETURN
    fun visit(element: Count, param: PARAM): RETURN
    fun visit(element: Date, param: PARAM): RETURN
    fun visit(element: CurrentDateTime, param: PARAM): RETURN
    fun visit(element: Month, param: PARAM): RETURN
    fun visit(element: LowerCase<*>, param: PARAM): RETURN
    fun visit(element: UpperCase<*>, param: PARAM): RETURN
    fun visit(element: Min<*>, param: PARAM): RETURN
    fun visit(element: Max<*>, param: PARAM): RETURN
    fun visit(element: Avg<*>, param: PARAM): RETURN
    fun visit(element: StdDevPop<*>, param: PARAM): RETURN
    fun visit(element: StdDevSamp<*>, param: PARAM): RETURN
    fun visit(element: VarPop<*>, param: PARAM): RETURN
    fun visit(element: VarSamp<*>, param: PARAM): RETURN
    fun visit(element: Sum<*>, param: PARAM): RETURN
    fun visit(element: Coalesce<*>, param: PARAM): RETURN
    fun visit(element: Trim, param: PARAM): RETURN
    fun visit(element: CaseWhenElse<*>, param: PARAM): RETURN
    fun visit(element: GroupConcat, param: PARAM): RETURN
    fun visit(element: ExpressionAlias<*>, param: PARAM): RETURN
    fun visit(element: ExpressionAliasOnly<*>, param: PARAM): RETURN
}