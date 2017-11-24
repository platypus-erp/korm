package org.platypus.modules.parser.visitor

import org.platypus.modules.lang.kotlin.KotlinParser
import org.platypus.modules.lang.kotlin.KotlinParserBaseVisitor

object Many2OnePropertyVisitor : KotlinParserBaseVisitor<NewReletationFieldAntlr>() {
    override fun visitInfixFunctionCall(ctx: KotlinParser.InfixFunctionCallContext): NewReletationFieldAntlr? {
        if (ctx.SimpleName().isNotEmpty() && ctx.SimpleName(0).text == "of") {
            val m = SimplePropertyVisitor.visitRangeExpression(ctx.rangeExpression(0))
            val m2 = RelationPropertyVisitor.visitRangeExpression(ctx.rangeExpression(1))
            return NewReletationFieldAntlr(m, m2)
        }
        return super.visitInfixFunctionCall(ctx)
    }
}