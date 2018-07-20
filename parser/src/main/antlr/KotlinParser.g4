/**
 * Kotlin language Antl4 grammar
 * based on Kotlin's official grammar https://kotlinlang.org/docs/reference/grammar.html
 */


parser grammar KotlinParser;

options { tokenVocab=KotlinLexer; }


kotlinFile
    :    preamble toplevelObject*;

preamble
    :    packageHeader? importHeader*;

packageHeader
    :    'package' identifier ('.' identifier)* SEMI* ;

importHeader
    :    'import' identifier ('.' identifier )* ('.' '*' | 'as' SimpleName)? SEMI*
    ;

toplevelObject
    : propertyDeclaration
    | functionDeclaration
    | classDeclaration
    | interfaceDeclaration
    | objectDeclaration
    | typealiasDeclaration
    ;

memberDeclaration
  : companionObject
  | objectDeclaration
  | functionDeclaration
  | propertyDeclaration
  | classDeclaration
  | interfaceDeclaration
//  | typeAlias
  | anonymousInitializer
  | secondaryConstructor
  ;

optionalProjection
  : varianceAnnotation?
  ;


typeParameters
  : '<' typeParameter (',' typeParameter)* '>'
  ;

typeParameter
  : modifiers SimpleName (':' userType)?
  ;

typeArguments
  : '<' ( type? (',' type)* ) '>'
  ;

typeConstraints
  : ('where' typeConstraint (',' typeConstraint)*)?
  ;

typeConstraint
  : annotations? SimpleName ':' type
  ;

type
  : annotations? typeDescriptor
  ;

typeDescriptor
  : '(' typeDescriptor ')' '?'? extensionFunctionTypeNoReceiver?
  | functionTypeNoReceiver extensionFunctionTypeNoReceiver?
  | userType '?'? extensionFunctionTypeNoReceiver?
//  | nullableType
  | 'dynamic' '?'? extensionFunctionTypeNoReceiver?
  ;

userType
  : ('package' '.')? simpleUserType ('.' simpleUserType)*
  ;

simpleUserType_typeParam
  : ('*' | (optionalProjection type))
  ;

simpleUserType
  : SimpleName ('<' simpleUserType_typeParam (',' simpleUserType_typeParam)* '>')?
  ;

variableDeclarationEntry
  : SimpleName (':' type)?
  ;

functionType_paramOrType
    : parameter
    | modifiers type
    ;

extensionFunctionTypeNoReceiver
    : '.' functionTypeNoReceiver
    ;

functionTypeNoReceiver
  : '(' (functionType_paramOrType (',' functionType_paramOrType)*)? ')' '->' type
  ;

multipleVariableDeclarations
  : '(' variableDeclarationEntry (',' variableDeclarationEntry)* ')'
  ;



modifiers
    : modifier*
    ;

modifier
  : modifierKeyword
  ;

modifierKeyword
  : hierarchyModifier
  | accessModifier
  | varianceAnnotation
  | annotations
  | classModifier
  | keyWordModifier
  | 'vararg'
  ;

annotations
  : annotation+
  ;

annotation
  : '@' (annotationUseSiteTarget ':')?  unescapedAnnotation
  ;

annotationUseSiteTarget
  : 'file'
  | 'choice'
  | 'property'
  | 'get'
  | 'set'
  | 'param'
  | 'sparam'
  ;

valueArgument
    : (identifier '=')? '*'? expression
    ;

valueArguments
  : '(' (valueArgument (',' valueArgument)*)?')'
  ;

unescapedAnnotation
  : identifier ('.' identifier)* typeArguments? valueArguments?
  ;

jump
  : 'throw' expression
  | 'return'  labelReference? expression?
  | 'continue'  labelReference?
  | 'break'  labelReference?
  ;

labelReference
  : '@' (identifier | 'for' | 'while' | 'when')// TODO: + more control flow keywords
  ;

labelDefinition
  : identifier '@'
  ;

parameter
  : SimpleName ':' type
  ;

functionParameter
  : funcParameterWithoutDefault | funcParameterWithDefault
  ;

funcParameterWithoutDefault
  : modifiers parameter
  ;

funcParameterWithDefault
  : funcParameterWithoutDefault '=' expression
  ;

constructorParameter
: constructorParameterWithoutDefault | constructorParameterWithDefault
;

constructorParameterWithoutDefault
: modifiers ('val' | 'var')? parameter
;

constructorParameterWithDefault
: constructorParameterWithoutDefault '=' expression
;

primaryConstructor
  : (accessModifier? 'constructor')? ('(' (constructorParameter (',' constructorParameter)*)? ')')
  ;

secondaryConstructor
  : accessModifier? 'constructor' ('(' (constructorParameter (',' constructorParameter)*)? ')') (':' constructorDelegationCall)? block? SEMI*
  ;

constructorDelegationCall
  : 'this' valueArguments
  | 'super' valueArguments
  ;

callSuffix
  : typeArguments? valueArguments annotatedLambda?
  | typeArguments annotatedLambda
  | annotatedLambda
  ;

constructorInvocation
    : userType typeArguments? valueArguments
    ;

explicitDelegation
  : userType 'by' expression
  ;

delegationSpecifier
  : constructorInvocation
  | userType
  | explicitDelegation
  ;

supertypesSpecifiers
    : ':' delegationSpecifier (',' delegationSpecifier)*
    ;

typealiasDeclaration
  : modifiers 'typealias' SimpleName '=' simpleUserType SEMI*
  ;

companionObject
  : modifiers 'companion' 'object' supertypesSpecifiers? classBody SEMI*
  ;

classBody
  : ('{' members '}')?
  ;

members
  : memberDeclaration*
  ;




statements
  : SEMI* (statement (SEMI* statement)*)? SEMI*
  ;


functionBody
  : block
  | '=' expression
  ;

block
  : '{' statements '}'
  ;

anonymousInitializer
  : 'init' block SEMI*
  ;


enumClassBody
  : '{' enumEntries (';' members)? '}'
  ;

enumEntries
  : (enumEntry ','? )*
  ;

enumEntry
  : modifiers SimpleName ((':' annotations? constructorInvocation) | valueArguments)? classBody
  ;

ifExpression
    : 'if' '(' expression ')'  expression SEMI* ('else' expression)?
    ;

tryExpression
  : 'try' block catchBlock* finallyBlock?
  ;

catchBlock
  : 'catch' '(' annotations? SimpleName ':' userType ')' block
  ;

finallyBlock
  : 'finally' block
  ;

loop
  : forLoop
  | whileLoop
  | doWhileLoop
  ;

forLoop
  : 'for' '(' annotations? (multipleVariableDeclarations | variableDeclarationEntry) 'in' expression ')' expression
  ;

whileLoop
  : 'while' '(' expression ')' expression
  ;

doWhileLoop
  : 'do' expression 'while' '(' expression ')'
  ;

expression
  : disjunction (assignmentOperator disjunction)*
  ;

disjunction
  : conjunction ('||' conjunction)*
  ;

conjunction
  : equalityComparison ('&&' equalityComparison)*
  ;

equalityComparison
  : comparison (equalityOperation comparison)*
  ;

comparison
  : namedInfix (comparisonOperation namedInfix)*
  ;

namedInfix
  : elvisExpression (inOperation elvisExpression)*
  | elvisExpression (isOperation type)?
  ;

elvisExpression
  : infixFunctionCall ('?:' infixFunctionCall)*
  ;

infixFunctionCall
  : rangeExpression (SimpleName rangeExpression)*
  ;

rangeExpression
  : additiveExpression ('..' additiveExpression)*
  ;

additiveExpression
  : multiplicativeExpression (additiveOperation multiplicativeExpression)*
  ;

multiplicativeExpression
  : typeRHS (multiplicativeOperation typeRHS)*
  ;

typeRHS
  : prefixUnaryExpression (typeOperation prefixUnaryExpression)*
  ;

prefixUnaryExpression
  : prefixUnaryOperation* postfixUnaryExpression
  ;

postfixUnaryExpression
  : atomicExpression callSuffix lastArgLambda?
  | atomicExpression postfixUnaryOperation*
  | callableReference postfixUnaryOperation*
  ;

callableReference
  : ((userType '?'*)? | 'this') '::' (identifier | 'class') typeArguments?
  ;

identifier
    : SimpleName
    | ClassModifier_enum
    | IMPORT
    | Declaration_companion
    | Declaration_init
    | accessModifier
    | ClassModifier_data
    ;

stringLiteral
    : SINGLE_QUOTE (SINLE_QUOTE_ESCAPED_CHAR | SINLE_QUOTE_EXPRESSION_START expression CLOSE_BLOCK | SINGLE_QUOTE_REF | ~SINLE_QUOTE_CLOSE)* SINLE_QUOTE_CLOSE
    | TRIPLE_QUOTE (MULTILINE_QUOTE_EXPRESSION_START expression CLOSE_BLOCK | MULTILINE_QUOTE_REF | ~MULTILINE_QUOTE_CLOSE)* MULTILINE_QUOTE_CLOSE
    ;

atomicExpression
  : '(' expression ')'
  | literalConstant
  | functionLiteral
  | lambdaFunction
  | 'this' labelReference?
  | 'super' ('<' type '>')? labelReference?
  | ifExpression
  | when
  | tryExpression
  | objectLiteral
  | jump
  | loop
  | identifier
  | '$' identifier
  | 'package'
  ;

literalConstant
  : 'true' | 'false'
  | stringLiteral
  | IntegerLiteral
  | HexadecimalLiteral
  | CharacterLiteral
//  | FloatLiteral
  | 'null'
  ;

declaration
  : functionDeclaration
  | propertyDeclaration
  | classDeclaration
  | interfaceDeclaration
  | objectDeclaration
  ;

statement
  : declaration
  | expression
  ;

multiplicativeOperation
  : '*' | '/' | '%'
  ;

additiveOperation
  : '+' | '-'
  ;

inOperation
  : OP_IN | '!in'
  ;

typeOperation
  : OP_AS | 'as?' | ':'
  ;

isOperation
  : 'is' | '!is'
  ;


comparisonOperation
  : '<' | '>' | '>=' | '<='
  ;

equalityOperation
  : '!=' | '=='
  ;

assignmentOperator
  : '=' | '+=' | '-=' | '*=' | '/=' | '%='
  ;

prefixUnaryOperation
  : '-' | '+'
  | '++' | '--'
  | '!'
  | annotations
  | labelDefinition
  ;

postfixUnaryOperation
  : '++' | '--' | '!!'
  | callSuffix
  | arrayAccess
  | memberAccessOperation postfixUnaryExpression
  ;

annotatedLambda
  : ('@' unescapedAnnotation)* labelDefinition? functionLiteral
  ;

memberAccessOperation
  : '.'
  | '?' '.'?
  ;

functionLiteral
  : '{' statements '}'
  | '{' ((functionLiteralparameter) (',' functionLiteralparameter)*)? '->' statements '}'
  ;

functionLiteralparameter
  : SimpleName (':' type)?
  ;

arrayAccess
  : '[' (expression (',' expression)*)? ']'
  ;

objectLiteral
  : 'object' (':' delegationSpecifier (',' delegationSpecifier)*)? classBody
  ;

when
  : 'when' ('(' expression ')')? '{'
        whenEntry*
    '}'
  ;

whenEntry
  : whenCondition (',' whenCondition)* '->' expression SEMI*
  | 'else' '->' expression SEMI*
  ;

whenCondition
  : expression
  | ('in' | '!in') expression
  | ('is' | '!is') type
  ;

lastArgLambda
  : '{' '('? (variableDeclarationEntry (',' variableDeclarationEntry)*)? ')'? '->' statements '}'
  ;


//-------------------------------------------------------Class------------------------------------------------------
classDeclaration
    : modifiers 'class' SimpleName
    typeParameters?
    primaryConstructor?
    (':' annotations? delegationSpecifier (',' delegationSpecifier)*)?
    typeConstraints
    (classBody | enumClassBody)
    SEMI*
    ;

//-------------------------------------------------------Interface------------------------------------------------------
interfaceDeclaration
: objectModifier? 'interface' SimpleName typeParameters? (':' annotations? simpleUserType (',' simpleUserType)*)? typeConstraints classBody SEMI*
;

//-------------------------------------------------------Object---------------------------------------------------------
objectDeclaration
: objectModifier? 'object' SimpleName supertypesSpecifiers? classBody SEMI*
;

//-------------------------------------------------------Function-------------------------------------------------------

functionDeclaration
: extensionFunctionDeclaration | classicFunctionDeclaration
;

extensionFunctionDeclaration
: modifierAnnotation 'fun' typeParameters? type '.' functionName functionParameters returnType? typeConstraints functionBody? SEMI*
;

classicFunctionDeclaration
: modifierAnnotation 'fun' typeParameters? functionName functionParameters returnType? typeConstraints functionBody? SEMI*
;

lambdaFunction
: 'fun' typeParameters? functionParameters returnType? typeConstraints functionBody? SEMI*
;

functionParameters
: '(' (functionParameter (',' functionParameter)*)?')'
;

modifierAnnotation
: (functionModifier? annotations?) | (annotations? functionModifier?)
;

functionName
: SimpleName | functionModifier | 'init' | 'data'
;


returnType: ':' type ;

//-------------------------------------------------------Property-------------------------------------------------------
propertyDeclaration
    : readonlyPropertyDeclaration | mutablePropertyDeclaration | lateinitVarPropertyDeclaration
    ;

readonlyPropertyDeclaration
    : propertyModifier? 'val'
    (extensionPropertyDelegateDeclaration
    | readonlyExtensionPropertyNoDelegateDeclaration
    | propertyDelegateDeclaration
    | readonlyPropertyNoDelegateDeclaration)
    ;

mutablePropertyDeclaration
    : functionModifier 'var'
            (extensionPropertyDelegateDeclaration
                | mutableExtensionPropertyNoDelegateDeclaration
                | propertyDelegateDeclaration
                | mutablePropertyNoDelegateDeclaration)
        ;

lateinitVarPropertyDeclaration
    : functionModifier? 'lateinit var' variableDeclarationEntry SEMI*;

extensionPropertyDelegateDeclaration
    : typeParameters? type '.' propertyDelegateDeclaration
    ;

readonlyExtensionPropertyNoDelegateDeclaration
    : typeParameters? type '.' parameterType getter? SEMI*
    ;

parameterType
    : (':' type)?
    ;

mutableExtensionPropertyNoDelegateDeclaration
    : typeParameters? type '.' variableDeclarationEntry parameterType SEMI*  ((getter setter) | (setter getter)) SEMI*
    ;

readonlyPropertyNoDelegateDeclaration
    : (multipleVariableDeclarations | variableDeclarationEntry)  typeConstraints assignExpression getter? SEMI*
    ;

propertyDelegateDeclaration
    : variableDeclarationEntry typeConstraints delegateExpression
    ;

mutablePropertyNoDelegateDeclaration
    : (multipleVariableDeclarations | variableDeclarationEntry) typeConstraints assignExpression SEMI*  ((getter setter) | (setter getter)) SEMI*
    ;

delegateExpression
    : 'by' expression SEMI*
    ;

assignExpression
    : '=' expression SEMI*
    ;

getterSetterDeclaration
    : ((getter? setter?) | (setter? getter?)) SEMI*
    ;

getter
  : modifiers 'get'
  | modifiers 'get' '(' ')' (':' type)? functionBody
  ;

setter
  : modifiers 'set'
  | modifiers 'set' '(' modifiers (SimpleName | parameter) ')' functionBody
  ;

//-------------------------------------------------------Modifier-------------------------------------------------------
functionModifier
    : 'private'
    | 'protected'
    | 'public'
    | 'internal'
    ;

propertyModifier
    : 'private'
    | 'protected'
    | 'public'
    | 'internal'
    ;

hierarchyModifier
    : 'abstract'
    | 'open'
    | 'final'
    | 'override'
    ;

classModifier
  : 'enum'
  | 'annotation'
  | 'data'
  | 'sealed'
  ;

keyWordModifier
  : 'operator'
  | 'inline'
  | 'infix'
  ;

accessModifier
  : 'private'
  | 'protected'
  | 'public'
  | 'internal'
  | 'const'
  ;

objectModifier
: 'private' | 'public' | 'internal'
;

varianceAnnotation
  : 'in'
  | 'out'
  ;