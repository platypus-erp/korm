package org.platypus.modules.parser.visitor

import org.antlr.v4.runtime.tree.RuleNode
import org.platypus.modules.data.ParseResultObject
import org.platypus.modules.data.annotationModel
import org.platypus.modules.data.mapName
import org.platypus.modules.lang.kotlin.KotlinParser
import org.platypus.modules.lang.kotlin.KotlinParserBaseVisitor

object ValidatorObject : KotlinParserBaseVisitor<Boolean>() {

    override fun visitObjectDeclaration(ctx: KotlinParser.ObjectDeclarationContext?): Boolean {
        return super.visitObjectDeclaration(ctx)
    }

    override fun visitSupertypesSpecifiers(ctx: KotlinParser.SupertypesSpecifiersContext): Boolean {
        return ctx.delegationSpecifier()
                ?.first()
                ?.constructorInvocation()
                ?.userType()
                ?.simpleUserType()
                ?.first()
                ?.SimpleName()
                ?.text ?: "no_valid" in mapName
    }

    override fun visitUnescapedAnnotation(ctx: KotlinParser.UnescapedAnnotationContext): Boolean {
        return ctx.identifier(0)?.SimpleName()?.text == annotationModel
    }

    override fun defaultResult(): Boolean {
        return false
    }

    override fun shouldVisitNextChild(node: RuleNode?, currentResult: Boolean): Boolean {
        return !currentResult
    }

    override fun aggregateResult(aggregate: Boolean, nextResult: Boolean): Boolean {
        return aggregate || (nextResult)
    }
}