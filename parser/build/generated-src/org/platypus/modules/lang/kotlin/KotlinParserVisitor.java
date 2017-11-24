// Generated from /home/apasquier/WorkSpace/Kotlin/platypus/parser/src/main/antlr/KotlinParser.g4 by ANTLR 4.2.2
package org.platypus.modules.lang.kotlin;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KotlinParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KotlinParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KotlinParser#preamble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreamble(@NotNull KotlinParser.PreambleContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(@NotNull KotlinParser.MemberDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#enumEntries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumEntries(@NotNull KotlinParser.EnumEntriesContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#isOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsOperation(@NotNull KotlinParser.IsOperationContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#toplevelObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToplevelObject(@NotNull KotlinParser.ToplevelObjectContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#enumEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumEntry(@NotNull KotlinParser.EnumEntryContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull KotlinParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#labelReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelReference(@NotNull KotlinParser.LabelReferenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#when}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen(@NotNull KotlinParser.WhenContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#infixFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixFunctionCall(@NotNull KotlinParser.InfixFunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#namedInfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedInfix(@NotNull KotlinParser.NamedInfixContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull KotlinParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#equalityComparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityComparison(@NotNull KotlinParser.EqualityComparisonContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#prefixUnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixUnaryExpression(@NotNull KotlinParser.PrefixUnaryExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#funcParameterWithoutDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParameterWithoutDefault(@NotNull KotlinParser.FuncParameterWithoutDefaultContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#jump}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump(@NotNull KotlinParser.JumpContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#catchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchBlock(@NotNull KotlinParser.CatchBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull KotlinParser.IdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#inOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInOperation(@NotNull KotlinParser.InOperationContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#explicitDelegation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitDelegation(@NotNull KotlinParser.ExplicitDelegationContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#typealiasDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypealiasDeclaration(@NotNull KotlinParser.TypealiasDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(@NotNull KotlinParser.StringLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#rangeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeExpression(@NotNull KotlinParser.RangeExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#valueParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueParameters(@NotNull KotlinParser.ValueParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#objectDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDeclaration(@NotNull KotlinParser.ObjectDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(@NotNull KotlinParser.TypeArgumentsContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(@NotNull KotlinParser.PropertyDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(@NotNull KotlinParser.ClassModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(@NotNull KotlinParser.AdditiveExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#typeRHS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeRHS(@NotNull KotlinParser.TypeRHSContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#annotatedLambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotatedLambda(@NotNull KotlinParser.AnnotatedLambdaContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#keyWordModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyWordModifier(@NotNull KotlinParser.KeyWordModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#postfixUnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixUnaryExpression(@NotNull KotlinParser.PostfixUnaryExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(@NotNull KotlinParser.FinallyBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(@NotNull KotlinParser.TypeParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#equalityOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityOperation(@NotNull KotlinParser.EqualityOperationContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(@NotNull KotlinParser.ConjunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#primaryConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryConstructor(@NotNull KotlinParser.PrimaryConstructorContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#constructorParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorParameter(@NotNull KotlinParser.ConstructorParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(@NotNull KotlinParser.ClassBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#ifExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpression(@NotNull KotlinParser.IfExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#comparisonOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperation(@NotNull KotlinParser.ComparisonOperationContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(@NotNull KotlinParser.AnnotationContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull KotlinParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(@NotNull KotlinParser.ObjectLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(@NotNull KotlinParser.MultiplicativeExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull KotlinParser.DeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#typeConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstraint(@NotNull KotlinParser.TypeConstraintContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#delegationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelegationSpecifier(@NotNull KotlinParser.DelegationSpecifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#simpleUserType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleUserType(@NotNull KotlinParser.SimpleUserTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#multipleVariableDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleVariableDeclarations(@NotNull KotlinParser.MultipleVariableDeclarationsContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#varianceAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarianceAnnotation(@NotNull KotlinParser.VarianceAnnotationContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#setter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter(@NotNull KotlinParser.SetterContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#elvisExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElvisExpression(@NotNull KotlinParser.ElvisExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(@NotNull KotlinParser.FunctionDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#doWhileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileLoop(@NotNull KotlinParser.DoWhileLoopContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#extensionFunctionTypeNoReceiver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtensionFunctionTypeNoReceiver(@NotNull KotlinParser.ExtensionFunctionTypeNoReceiverContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#getter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter(@NotNull KotlinParser.GetterContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(@NotNull KotlinParser.ModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(@NotNull KotlinParser.AssignmentOperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#annotations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotations(@NotNull KotlinParser.AnnotationsContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#whenEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenEntry(@NotNull KotlinParser.WhenEntryContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#secondaryConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondaryConstructor(@NotNull KotlinParser.SecondaryConstructorContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#variableDeclarationEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationEntry(@NotNull KotlinParser.VariableDeclarationEntryContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#valueArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueArgument(@NotNull KotlinParser.ValueArgumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#valueArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueArguments(@NotNull KotlinParser.ValueArgumentsContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#constructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorInvocation(@NotNull KotlinParser.ConstructorInvocationContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(@NotNull KotlinParser.LoopContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#members}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMembers(@NotNull KotlinParser.MembersContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#hierarchyModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchyModifier(@NotNull KotlinParser.HierarchyModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#functionType_paramOrType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType_paramOrType(@NotNull KotlinParser.FunctionType_paramOrTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(@NotNull KotlinParser.ArrayAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#optionalProjection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalProjection(@NotNull KotlinParser.OptionalProjectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(@NotNull KotlinParser.ForLoopContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#enumClassBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumClassBody(@NotNull KotlinParser.EnumClassBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(@NotNull KotlinParser.ComparisonContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#typeOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeOperation(@NotNull KotlinParser.TypeOperationContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#companionObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompanionObject(@NotNull KotlinParser.CompanionObjectContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#supertypesSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupertypesSpecifiers(@NotNull KotlinParser.SupertypesSpecifiersContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#importHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportHeader(@NotNull KotlinParser.ImportHeaderContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#memberAccessOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccessOperation(@NotNull KotlinParser.MemberAccessOperationContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#functionLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionLiteral(@NotNull KotlinParser.FunctionLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#annotationUseSiteTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationUseSiteTarget(@NotNull KotlinParser.AnnotationUseSiteTargetContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#userType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserType(@NotNull KotlinParser.UserTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#constructorParameterWithDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorParameterWithDefault(@NotNull KotlinParser.ConstructorParameterWithDefaultContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#postfixUnaryOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixUnaryOperation(@NotNull KotlinParser.PostfixUnaryOperationContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#anonymousInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousInitializer(@NotNull KotlinParser.AnonymousInitializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(@NotNull KotlinParser.TypeParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(@NotNull KotlinParser.WhileLoopContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#unescapedAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnescapedAnnotation(@NotNull KotlinParser.UnescapedAnnotationContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#functionLiteralparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionLiteralparameter(@NotNull KotlinParser.FunctionLiteralparameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#modifierKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifierKeyword(@NotNull KotlinParser.ModifierKeywordContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#labelDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelDefinition(@NotNull KotlinParser.LabelDefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull KotlinParser.StatementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#additiveOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOperation(@NotNull KotlinParser.AdditiveOperationContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#simpleUserType_typeParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleUserType_typeParam(@NotNull KotlinParser.SimpleUserType_typeParamContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiers(@NotNull KotlinParser.ModifiersContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#packageHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageHeader(@NotNull KotlinParser.PackageHeaderContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull KotlinParser.ClassDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#constructorParameterWithoutDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorParameterWithoutDefault(@NotNull KotlinParser.ConstructorParameterWithoutDefaultContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#typeConstraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstraints(@NotNull KotlinParser.TypeConstraintsContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifier(@NotNull KotlinParser.AccessModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#tryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryExpression(@NotNull KotlinParser.TryExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull KotlinParser.ParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull KotlinParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#prefixUnaryOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixUnaryOperation(@NotNull KotlinParser.PrefixUnaryOperationContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#lastArgLambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastArgLambda(@NotNull KotlinParser.LastArgLambdaContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#typeDescriptor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDescriptor(@NotNull KotlinParser.TypeDescriptorContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#funcParameterWithDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParameterWithDefault(@NotNull KotlinParser.FuncParameterWithDefaultContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#atomicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicExpression(@NotNull KotlinParser.AtomicExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#constructorDelegationCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDelegationCall(@NotNull KotlinParser.ConstructorDelegationCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#disjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjunction(@NotNull KotlinParser.DisjunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#functionTypeNoReceiver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypeNoReceiver(@NotNull KotlinParser.FunctionTypeNoReceiverContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#multiplicativeOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeOperation(@NotNull KotlinParser.MultiplicativeOperationContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#callableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallableReference(@NotNull KotlinParser.CallableReferenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#whenCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenCondition(@NotNull KotlinParser.WhenConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#callSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallSuffix(@NotNull KotlinParser.CallSuffixContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#kotlinFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKotlinFile(@NotNull KotlinParser.KotlinFileContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#literalConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralConstant(@NotNull KotlinParser.LiteralConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#functionParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameter(@NotNull KotlinParser.FunctionParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link KotlinParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(@NotNull KotlinParser.FunctionBodyContext ctx);
}