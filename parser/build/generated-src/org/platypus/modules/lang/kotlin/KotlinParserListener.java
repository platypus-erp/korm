// Generated from /home/apasquier/WorkSpace/Kotlin/platypus/parser/src/main/antlr/KotlinParser.g4 by ANTLR 4.2.2
package org.platypus.modules.lang.kotlin;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KotlinParser}.
 */
public interface KotlinParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KotlinParser#preamble}.
	 * @param ctx the parse tree
	 */
	void enterPreamble(@NotNull KotlinParser.PreambleContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#preamble}.
	 * @param ctx the parse tree
	 */
	void exitPreamble(@NotNull KotlinParser.PreambleContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(@NotNull KotlinParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(@NotNull KotlinParser.MemberDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#enumEntries}.
	 * @param ctx the parse tree
	 */
	void enterEnumEntries(@NotNull KotlinParser.EnumEntriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#enumEntries}.
	 * @param ctx the parse tree
	 */
	void exitEnumEntries(@NotNull KotlinParser.EnumEntriesContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#isOperation}.
	 * @param ctx the parse tree
	 */
	void enterIsOperation(@NotNull KotlinParser.IsOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#isOperation}.
	 * @param ctx the parse tree
	 */
	void exitIsOperation(@NotNull KotlinParser.IsOperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#toplevelObject}.
	 * @param ctx the parse tree
	 */
	void enterToplevelObject(@NotNull KotlinParser.ToplevelObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#toplevelObject}.
	 * @param ctx the parse tree
	 */
	void exitToplevelObject(@NotNull KotlinParser.ToplevelObjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#enumEntry}.
	 * @param ctx the parse tree
	 */
	void enterEnumEntry(@NotNull KotlinParser.EnumEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#enumEntry}.
	 * @param ctx the parse tree
	 */
	void exitEnumEntry(@NotNull KotlinParser.EnumEntryContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull KotlinParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull KotlinParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#labelReference}.
	 * @param ctx the parse tree
	 */
	void enterLabelReference(@NotNull KotlinParser.LabelReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#labelReference}.
	 * @param ctx the parse tree
	 */
	void exitLabelReference(@NotNull KotlinParser.LabelReferenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#when}.
	 * @param ctx the parse tree
	 */
	void enterWhen(@NotNull KotlinParser.WhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#when}.
	 * @param ctx the parse tree
	 */
	void exitWhen(@NotNull KotlinParser.WhenContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#infixFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterInfixFunctionCall(@NotNull KotlinParser.InfixFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#infixFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitInfixFunctionCall(@NotNull KotlinParser.InfixFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#namedInfix}.
	 * @param ctx the parse tree
	 */
	void enterNamedInfix(@NotNull KotlinParser.NamedInfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#namedInfix}.
	 * @param ctx the parse tree
	 */
	void exitNamedInfix(@NotNull KotlinParser.NamedInfixContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull KotlinParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull KotlinParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#equalityComparison}.
	 * @param ctx the parse tree
	 */
	void enterEqualityComparison(@NotNull KotlinParser.EqualityComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#equalityComparison}.
	 * @param ctx the parse tree
	 */
	void exitEqualityComparison(@NotNull KotlinParser.EqualityComparisonContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#prefixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixUnaryExpression(@NotNull KotlinParser.PrefixUnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#prefixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixUnaryExpression(@NotNull KotlinParser.PrefixUnaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#funcParameterWithoutDefault}.
	 * @param ctx the parse tree
	 */
	void enterFuncParameterWithoutDefault(@NotNull KotlinParser.FuncParameterWithoutDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#funcParameterWithoutDefault}.
	 * @param ctx the parse tree
	 */
	void exitFuncParameterWithoutDefault(@NotNull KotlinParser.FuncParameterWithoutDefaultContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#jump}.
	 * @param ctx the parse tree
	 */
	void enterJump(@NotNull KotlinParser.JumpContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#jump}.
	 * @param ctx the parse tree
	 */
	void exitJump(@NotNull KotlinParser.JumpContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#catchBlock}.
	 * @param ctx the parse tree
	 */
	void enterCatchBlock(@NotNull KotlinParser.CatchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#catchBlock}.
	 * @param ctx the parse tree
	 */
	void exitCatchBlock(@NotNull KotlinParser.CatchBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull KotlinParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull KotlinParser.IdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#inOperation}.
	 * @param ctx the parse tree
	 */
	void enterInOperation(@NotNull KotlinParser.InOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#inOperation}.
	 * @param ctx the parse tree
	 */
	void exitInOperation(@NotNull KotlinParser.InOperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#explicitDelegation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitDelegation(@NotNull KotlinParser.ExplicitDelegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#explicitDelegation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitDelegation(@NotNull KotlinParser.ExplicitDelegationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#typealiasDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypealiasDeclaration(@NotNull KotlinParser.TypealiasDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#typealiasDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypealiasDeclaration(@NotNull KotlinParser.TypealiasDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(@NotNull KotlinParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(@NotNull KotlinParser.StringLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void enterRangeExpression(@NotNull KotlinParser.RangeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void exitRangeExpression(@NotNull KotlinParser.RangeExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#valueParameters}.
	 * @param ctx the parse tree
	 */
	void enterValueParameters(@NotNull KotlinParser.ValueParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#valueParameters}.
	 * @param ctx the parse tree
	 */
	void exitValueParameters(@NotNull KotlinParser.ValueParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterObjectDeclaration(@NotNull KotlinParser.ObjectDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitObjectDeclaration(@NotNull KotlinParser.ObjectDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(@NotNull KotlinParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(@NotNull KotlinParser.TypeArgumentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(@NotNull KotlinParser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(@NotNull KotlinParser.PropertyDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(@NotNull KotlinParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(@NotNull KotlinParser.ClassModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull KotlinParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull KotlinParser.AdditiveExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#typeRHS}.
	 * @param ctx the parse tree
	 */
	void enterTypeRHS(@NotNull KotlinParser.TypeRHSContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#typeRHS}.
	 * @param ctx the parse tree
	 */
	void exitTypeRHS(@NotNull KotlinParser.TypeRHSContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#annotatedLambda}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedLambda(@NotNull KotlinParser.AnnotatedLambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#annotatedLambda}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedLambda(@NotNull KotlinParser.AnnotatedLambdaContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#keyWordModifier}.
	 * @param ctx the parse tree
	 */
	void enterKeyWordModifier(@NotNull KotlinParser.KeyWordModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#keyWordModifier}.
	 * @param ctx the parse tree
	 */
	void exitKeyWordModifier(@NotNull KotlinParser.KeyWordModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#postfixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixUnaryExpression(@NotNull KotlinParser.PostfixUnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#postfixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixUnaryExpression(@NotNull KotlinParser.PostfixUnaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(@NotNull KotlinParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(@NotNull KotlinParser.FinallyBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(@NotNull KotlinParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(@NotNull KotlinParser.TypeParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#equalityOperation}.
	 * @param ctx the parse tree
	 */
	void enterEqualityOperation(@NotNull KotlinParser.EqualityOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#equalityOperation}.
	 * @param ctx the parse tree
	 */
	void exitEqualityOperation(@NotNull KotlinParser.EqualityOperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(@NotNull KotlinParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(@NotNull KotlinParser.ConjunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#primaryConstructor}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryConstructor(@NotNull KotlinParser.PrimaryConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#primaryConstructor}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryConstructor(@NotNull KotlinParser.PrimaryConstructorContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#constructorParameter}.
	 * @param ctx the parse tree
	 */
	void enterConstructorParameter(@NotNull KotlinParser.ConstructorParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#constructorParameter}.
	 * @param ctx the parse tree
	 */
	void exitConstructorParameter(@NotNull KotlinParser.ConstructorParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(@NotNull KotlinParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(@NotNull KotlinParser.ClassBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void enterIfExpression(@NotNull KotlinParser.IfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void exitIfExpression(@NotNull KotlinParser.IfExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#comparisonOperation}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperation(@NotNull KotlinParser.ComparisonOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#comparisonOperation}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperation(@NotNull KotlinParser.ComparisonOperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(@NotNull KotlinParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(@NotNull KotlinParser.AnnotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull KotlinParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull KotlinParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(@NotNull KotlinParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(@NotNull KotlinParser.ObjectLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(@NotNull KotlinParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(@NotNull KotlinParser.MultiplicativeExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull KotlinParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull KotlinParser.DeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#typeConstraint}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstraint(@NotNull KotlinParser.TypeConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#typeConstraint}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstraint(@NotNull KotlinParser.TypeConstraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#delegationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDelegationSpecifier(@NotNull KotlinParser.DelegationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#delegationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDelegationSpecifier(@NotNull KotlinParser.DelegationSpecifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#simpleUserType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleUserType(@NotNull KotlinParser.SimpleUserTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#simpleUserType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleUserType(@NotNull KotlinParser.SimpleUserTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#multipleVariableDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterMultipleVariableDeclarations(@NotNull KotlinParser.MultipleVariableDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#multipleVariableDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitMultipleVariableDeclarations(@NotNull KotlinParser.MultipleVariableDeclarationsContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#varianceAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterVarianceAnnotation(@NotNull KotlinParser.VarianceAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#varianceAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitVarianceAnnotation(@NotNull KotlinParser.VarianceAnnotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterSetter(@NotNull KotlinParser.SetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitSetter(@NotNull KotlinParser.SetterContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#elvisExpression}.
	 * @param ctx the parse tree
	 */
	void enterElvisExpression(@NotNull KotlinParser.ElvisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#elvisExpression}.
	 * @param ctx the parse tree
	 */
	void exitElvisExpression(@NotNull KotlinParser.ElvisExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(@NotNull KotlinParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(@NotNull KotlinParser.FunctionDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#doWhileLoop}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileLoop(@NotNull KotlinParser.DoWhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#doWhileLoop}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileLoop(@NotNull KotlinParser.DoWhileLoopContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#extensionFunctionTypeNoReceiver}.
	 * @param ctx the parse tree
	 */
	void enterExtensionFunctionTypeNoReceiver(@NotNull KotlinParser.ExtensionFunctionTypeNoReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#extensionFunctionTypeNoReceiver}.
	 * @param ctx the parse tree
	 */
	void exitExtensionFunctionTypeNoReceiver(@NotNull KotlinParser.ExtensionFunctionTypeNoReceiverContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#getter}.
	 * @param ctx the parse tree
	 */
	void enterGetter(@NotNull KotlinParser.GetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#getter}.
	 * @param ctx the parse tree
	 */
	void exitGetter(@NotNull KotlinParser.GetterContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(@NotNull KotlinParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(@NotNull KotlinParser.ModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(@NotNull KotlinParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(@NotNull KotlinParser.AssignmentOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#annotations}.
	 * @param ctx the parse tree
	 */
	void enterAnnotations(@NotNull KotlinParser.AnnotationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#annotations}.
	 * @param ctx the parse tree
	 */
	void exitAnnotations(@NotNull KotlinParser.AnnotationsContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#whenEntry}.
	 * @param ctx the parse tree
	 */
	void enterWhenEntry(@NotNull KotlinParser.WhenEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#whenEntry}.
	 * @param ctx the parse tree
	 */
	void exitWhenEntry(@NotNull KotlinParser.WhenEntryContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#secondaryConstructor}.
	 * @param ctx the parse tree
	 */
	void enterSecondaryConstructor(@NotNull KotlinParser.SecondaryConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#secondaryConstructor}.
	 * @param ctx the parse tree
	 */
	void exitSecondaryConstructor(@NotNull KotlinParser.SecondaryConstructorContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#variableDeclarationEntry}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationEntry(@NotNull KotlinParser.VariableDeclarationEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#variableDeclarationEntry}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationEntry(@NotNull KotlinParser.VariableDeclarationEntryContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#valueArgument}.
	 * @param ctx the parse tree
	 */
	void enterValueArgument(@NotNull KotlinParser.ValueArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#valueArgument}.
	 * @param ctx the parse tree
	 */
	void exitValueArgument(@NotNull KotlinParser.ValueArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#valueArguments}.
	 * @param ctx the parse tree
	 */
	void enterValueArguments(@NotNull KotlinParser.ValueArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#valueArguments}.
	 * @param ctx the parse tree
	 */
	void exitValueArguments(@NotNull KotlinParser.ValueArgumentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#constructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterConstructorInvocation(@NotNull KotlinParser.ConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#constructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitConstructorInvocation(@NotNull KotlinParser.ConstructorInvocationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(@NotNull KotlinParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(@NotNull KotlinParser.LoopContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#members}.
	 * @param ctx the parse tree
	 */
	void enterMembers(@NotNull KotlinParser.MembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#members}.
	 * @param ctx the parse tree
	 */
	void exitMembers(@NotNull KotlinParser.MembersContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#hierarchyModifier}.
	 * @param ctx the parse tree
	 */
	void enterHierarchyModifier(@NotNull KotlinParser.HierarchyModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#hierarchyModifier}.
	 * @param ctx the parse tree
	 */
	void exitHierarchyModifier(@NotNull KotlinParser.HierarchyModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#functionType_paramOrType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType_paramOrType(@NotNull KotlinParser.FunctionType_paramOrTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#functionType_paramOrType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType_paramOrType(@NotNull KotlinParser.FunctionType_paramOrTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(@NotNull KotlinParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(@NotNull KotlinParser.ArrayAccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#optionalProjection}.
	 * @param ctx the parse tree
	 */
	void enterOptionalProjection(@NotNull KotlinParser.OptionalProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#optionalProjection}.
	 * @param ctx the parse tree
	 */
	void exitOptionalProjection(@NotNull KotlinParser.OptionalProjectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(@NotNull KotlinParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(@NotNull KotlinParser.ForLoopContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#enumClassBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumClassBody(@NotNull KotlinParser.EnumClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#enumClassBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumClassBody(@NotNull KotlinParser.EnumClassBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(@NotNull KotlinParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(@NotNull KotlinParser.ComparisonContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#typeOperation}.
	 * @param ctx the parse tree
	 */
	void enterTypeOperation(@NotNull KotlinParser.TypeOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#typeOperation}.
	 * @param ctx the parse tree
	 */
	void exitTypeOperation(@NotNull KotlinParser.TypeOperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#companionObject}.
	 * @param ctx the parse tree
	 */
	void enterCompanionObject(@NotNull KotlinParser.CompanionObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#companionObject}.
	 * @param ctx the parse tree
	 */
	void exitCompanionObject(@NotNull KotlinParser.CompanionObjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#supertypesSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterSupertypesSpecifiers(@NotNull KotlinParser.SupertypesSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#supertypesSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitSupertypesSpecifiers(@NotNull KotlinParser.SupertypesSpecifiersContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#importHeader}.
	 * @param ctx the parse tree
	 */
	void enterImportHeader(@NotNull KotlinParser.ImportHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#importHeader}.
	 * @param ctx the parse tree
	 */
	void exitImportHeader(@NotNull KotlinParser.ImportHeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#memberAccessOperation}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessOperation(@NotNull KotlinParser.MemberAccessOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#memberAccessOperation}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessOperation(@NotNull KotlinParser.MemberAccessOperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#functionLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFunctionLiteral(@NotNull KotlinParser.FunctionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#functionLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFunctionLiteral(@NotNull KotlinParser.FunctionLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#annotationUseSiteTarget}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationUseSiteTarget(@NotNull KotlinParser.AnnotationUseSiteTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#annotationUseSiteTarget}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationUseSiteTarget(@NotNull KotlinParser.AnnotationUseSiteTargetContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#userType}.
	 * @param ctx the parse tree
	 */
	void enterUserType(@NotNull KotlinParser.UserTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#userType}.
	 * @param ctx the parse tree
	 */
	void exitUserType(@NotNull KotlinParser.UserTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#constructorParameterWithDefault}.
	 * @param ctx the parse tree
	 */
	void enterConstructorParameterWithDefault(@NotNull KotlinParser.ConstructorParameterWithDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#constructorParameterWithDefault}.
	 * @param ctx the parse tree
	 */
	void exitConstructorParameterWithDefault(@NotNull KotlinParser.ConstructorParameterWithDefaultContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#postfixUnaryOperation}.
	 * @param ctx the parse tree
	 */
	void enterPostfixUnaryOperation(@NotNull KotlinParser.PostfixUnaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#postfixUnaryOperation}.
	 * @param ctx the parse tree
	 */
	void exitPostfixUnaryOperation(@NotNull KotlinParser.PostfixUnaryOperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#anonymousInitializer}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousInitializer(@NotNull KotlinParser.AnonymousInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#anonymousInitializer}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousInitializer(@NotNull KotlinParser.AnonymousInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(@NotNull KotlinParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(@NotNull KotlinParser.TypeParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(@NotNull KotlinParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(@NotNull KotlinParser.WhileLoopContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#unescapedAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterUnescapedAnnotation(@NotNull KotlinParser.UnescapedAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#unescapedAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitUnescapedAnnotation(@NotNull KotlinParser.UnescapedAnnotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#functionLiteralparameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionLiteralparameter(@NotNull KotlinParser.FunctionLiteralparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#functionLiteralparameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionLiteralparameter(@NotNull KotlinParser.FunctionLiteralparameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#modifierKeyword}.
	 * @param ctx the parse tree
	 */
	void enterModifierKeyword(@NotNull KotlinParser.ModifierKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#modifierKeyword}.
	 * @param ctx the parse tree
	 */
	void exitModifierKeyword(@NotNull KotlinParser.ModifierKeywordContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#labelDefinition}.
	 * @param ctx the parse tree
	 */
	void enterLabelDefinition(@NotNull KotlinParser.LabelDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#labelDefinition}.
	 * @param ctx the parse tree
	 */
	void exitLabelDefinition(@NotNull KotlinParser.LabelDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull KotlinParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull KotlinParser.StatementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#additiveOperation}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOperation(@NotNull KotlinParser.AdditiveOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#additiveOperation}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOperation(@NotNull KotlinParser.AdditiveOperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#simpleUserType_typeParam}.
	 * @param ctx the parse tree
	 */
	void enterSimpleUserType_typeParam(@NotNull KotlinParser.SimpleUserType_typeParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#simpleUserType_typeParam}.
	 * @param ctx the parse tree
	 */
	void exitSimpleUserType_typeParam(@NotNull KotlinParser.SimpleUserType_typeParamContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(@NotNull KotlinParser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(@NotNull KotlinParser.ModifiersContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#packageHeader}.
	 * @param ctx the parse tree
	 */
	void enterPackageHeader(@NotNull KotlinParser.PackageHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#packageHeader}.
	 * @param ctx the parse tree
	 */
	void exitPackageHeader(@NotNull KotlinParser.PackageHeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull KotlinParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull KotlinParser.ClassDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#constructorParameterWithoutDefault}.
	 * @param ctx the parse tree
	 */
	void enterConstructorParameterWithoutDefault(@NotNull KotlinParser.ConstructorParameterWithoutDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#constructorParameterWithoutDefault}.
	 * @param ctx the parse tree
	 */
	void exitConstructorParameterWithoutDefault(@NotNull KotlinParser.ConstructorParameterWithoutDefaultContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#typeConstraints}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstraints(@NotNull KotlinParser.TypeConstraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#typeConstraints}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstraints(@NotNull KotlinParser.TypeConstraintsContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifier(@NotNull KotlinParser.AccessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifier(@NotNull KotlinParser.AccessModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#tryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTryExpression(@NotNull KotlinParser.TryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#tryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTryExpression(@NotNull KotlinParser.TryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull KotlinParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull KotlinParser.ParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull KotlinParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull KotlinParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#prefixUnaryOperation}.
	 * @param ctx the parse tree
	 */
	void enterPrefixUnaryOperation(@NotNull KotlinParser.PrefixUnaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#prefixUnaryOperation}.
	 * @param ctx the parse tree
	 */
	void exitPrefixUnaryOperation(@NotNull KotlinParser.PrefixUnaryOperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#lastArgLambda}.
	 * @param ctx the parse tree
	 */
	void enterLastArgLambda(@NotNull KotlinParser.LastArgLambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#lastArgLambda}.
	 * @param ctx the parse tree
	 */
	void exitLastArgLambda(@NotNull KotlinParser.LastArgLambdaContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#typeDescriptor}.
	 * @param ctx the parse tree
	 */
	void enterTypeDescriptor(@NotNull KotlinParser.TypeDescriptorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#typeDescriptor}.
	 * @param ctx the parse tree
	 */
	void exitTypeDescriptor(@NotNull KotlinParser.TypeDescriptorContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#funcParameterWithDefault}.
	 * @param ctx the parse tree
	 */
	void enterFuncParameterWithDefault(@NotNull KotlinParser.FuncParameterWithDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#funcParameterWithDefault}.
	 * @param ctx the parse tree
	 */
	void exitFuncParameterWithDefault(@NotNull KotlinParser.FuncParameterWithDefaultContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#atomicExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtomicExpression(@NotNull KotlinParser.AtomicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#atomicExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtomicExpression(@NotNull KotlinParser.AtomicExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#constructorDelegationCall}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDelegationCall(@NotNull KotlinParser.ConstructorDelegationCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#constructorDelegationCall}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDelegationCall(@NotNull KotlinParser.ConstructorDelegationCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void enterDisjunction(@NotNull KotlinParser.DisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void exitDisjunction(@NotNull KotlinParser.DisjunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#functionTypeNoReceiver}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeNoReceiver(@NotNull KotlinParser.FunctionTypeNoReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#functionTypeNoReceiver}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeNoReceiver(@NotNull KotlinParser.FunctionTypeNoReceiverContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#multiplicativeOperation}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOperation(@NotNull KotlinParser.MultiplicativeOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#multiplicativeOperation}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOperation(@NotNull KotlinParser.MultiplicativeOperationContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#callableReference}.
	 * @param ctx the parse tree
	 */
	void enterCallableReference(@NotNull KotlinParser.CallableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#callableReference}.
	 * @param ctx the parse tree
	 */
	void exitCallableReference(@NotNull KotlinParser.CallableReferenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#whenCondition}.
	 * @param ctx the parse tree
	 */
	void enterWhenCondition(@NotNull KotlinParser.WhenConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#whenCondition}.
	 * @param ctx the parse tree
	 */
	void exitWhenCondition(@NotNull KotlinParser.WhenConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#callSuffix}.
	 * @param ctx the parse tree
	 */
	void enterCallSuffix(@NotNull KotlinParser.CallSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#callSuffix}.
	 * @param ctx the parse tree
	 */
	void exitCallSuffix(@NotNull KotlinParser.CallSuffixContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#kotlinFile}.
	 * @param ctx the parse tree
	 */
	void enterKotlinFile(@NotNull KotlinParser.KotlinFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#kotlinFile}.
	 * @param ctx the parse tree
	 */
	void exitKotlinFile(@NotNull KotlinParser.KotlinFileContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#literalConstant}.
	 * @param ctx the parse tree
	 */
	void enterLiteralConstant(@NotNull KotlinParser.LiteralConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#literalConstant}.
	 * @param ctx the parse tree
	 */
	void exitLiteralConstant(@NotNull KotlinParser.LiteralConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(@NotNull KotlinParser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(@NotNull KotlinParser.FunctionParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link KotlinParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(@NotNull KotlinParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(@NotNull KotlinParser.FunctionBodyContext ctx);
}