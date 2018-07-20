// Generated from /home/chmuche/workspace/kotlin/korm/parser/src/main/antlr/KotlinParser.g4 by ANTLR 4.2.2
package org.platypus.modules.lang.kotlin;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KotlinParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ClassModifier_data=78, SimpleName=116, OP_AS_SAFE=49, ELVIS=32, ConstructorDelegationCall_this=97, 
		SINLE_QUOTE_ESCAPED_CHAR=120, KEYWORD_where=66, OP_DIV_ASSIGN=53, HierarchyModifier_abstract=69, 
		WHITESPACE=3, OP_MUNUS=43, OP_ASTERISK=39, MULTILINE_COMMENT=1, SINGLE_TEXT=118, 
		Jump_break=95, OP_DECREMENT=55, DOG=86, OP_MINUS_ASSIGN=51, AnnotationUseSiteTarget_param=90, 
		KeyWordModifier_infix=74, DOT=14, KEYWORD_constructor=96, OP_AS=48, HierarchyModifier_open=70, 
		MULTILINE_QUOTE_TEXT=123, CF_do=111, CONJ=31, OP_IS=46, OP_NOT=58, GET=67, 
		ClassModifier_sealed=79, AccessModifier_public=82, Modifier_const=84, 
		HierarchyModifier_final=71, AnnotationUseSiteTarget_field=88, OP_IN=44, 
		OP_NULL_ASSERT=57, AccessModifier_private=80, OP_MULT_ASSIGN=52, SET=68, 
		ConstructorDelegationCall_super=98, SINLE_QUOTE_EXPRESSION_START=121, 
		SEMI=5, AnnotationUseSiteTarget_property=89, VarianceAnnotation_out=85, 
		Jump_continue=93, Jump_return=94, IMPORT=13, Q=28, MULTILINE_QUOTE_REF=127, 
		EQ_EQ_EQ=23, SINLE_QUOTE_WHITESPACE=117, COMMA=16, KEYWORD_by=64, BRACE_CLOSE=27, 
		ClassModifier_annotation=77, ClassModifier_enum=76, SINGLE_QUOTE=11, OP_DIV=40, 
		STAR=15, Declaration_class=99, NEQ=24, Declaration_init=105, DA=29, SQ_CLOSE=60, 
		MULTILINE_QUOTES=125, Jump_throw=92, CharacterLiteral=9, CF_catch=113, 
		SINLE_QUOTE_CLOSE=119, CF_try=112, KEYWORD_vararg=63, Declaration_typealias=104, 
		LT=17, Declaration_interface=100, CF_else=107, MULTILINE_QUOTE_CLOSE=124, 
		AccessModifier_protected=81, BRACE_OPEN=26, Declaration_companion=102, 
		PACKAGE=12, AnnotationUseSiteTarget_sparam=91, IntegerLiteral=4, NULL=38, 
		CF_if=106, TRUE=36, KEYWORD_val=61, EQ=21, KEYWORD_var=62, CF_when=108, 
		HierarchyModifier_override=72, OP_PLUS_ASSIGN=50, SQ_OPEN=59, CF_for=110, 
		OP_INCREMENT=56, LONG_RANGE=33, AnnotationUseSiteTarget_file=87, TRIPLE_QUOTE=10, 
		KeyWordModifier_inline=75, LTE=18, DISJ=30, KEYWORD_dynamic=65, RANGE=34, 
		SINGLELINE_COMMENT=2, OP_PLUS=42, OP_NOT_IN=45, HexadecimalLiteral=8, 
		AccessModifier_internal=83, Declaration_object=101, MULTILINE_QUOTE_EXPRESSION_START=126, 
		Declaration_fun=103, OP_NOT_IS=47, REFERENCE=35, OP_MOD_ASSIGN=54, OP_MOD=41, 
		CF_while=109, CF_FINALLY=114, COLON=25, GT=19, EQ_EQ=22, KeyWordModifier_operator=73, 
		SINGLE_QUOTE_REF=122, GTE=20, BAX=115, FALSE=37, OPEN_BLOCK=6, CLOSE_BLOCK=7;
	public static final String[] tokenNames = {
		"<INVALID>", "MULTILINE_COMMENT", "SINGLELINE_COMMENT", "WHITESPACE", 
		"IntegerLiteral", "';'", "'{'", "'}'", "HexadecimalLiteral", "CharacterLiteral", 
		"TRIPLE_QUOTE", "SINGLE_QUOTE", "'package'", "'import'", "'.'", "'*'", 
		"','", "'<'", "'<='", "'>'", "'>='", "'='", "'=='", "'==='", "'!='", "':'", 
		"'('", "')'", "'?'", "'!!.'", "'||'", "'&&'", "'?:'", "'...'", "'..'", 
		"'::'", "'true'", "'false'", "'null'", "'->'", "'/'", "'%'", "'+'", "'-'", 
		"'in'", "'!in'", "'is'", "'!is'", "'as'", "'as?'", "'+='", "'-='", "'*='", 
		"'/='", "'%='", "'--'", "'++'", "'!!'", "'!'", "'['", "']'", "'val'", 
		"'var'", "'vararg'", "'by'", "'dynamic'", "'where'", "'get'", "'set'", 
		"'abstract'", "'open'", "'final'", "'override'", "'operator'", "'infix'", 
		"'inline'", "'enum'", "'annotation'", "'data'", "'sealed'", "'private'", 
		"'protected'", "'public'", "'internal'", "'const'", "'out'", "'@'", "'file'", 
		"'choice'", "'property'", "'param'", "'sparam'", "'throw'", "'continue'", 
		"'return'", "'break'", "'constructor'", "'this'", "'super'", "'class'", 
		"'interface'", "'object'", "'companion'", "'fun'", "'typealias'", "'init'", 
		"'if'", "'else'", "'when'", "'while'", "'for'", "'do'", "'try'", "'catch'", 
		"'finally'", "'$'", "SimpleName", "SINLE_QUOTE_WHITESPACE", "SINGLE_TEXT", 
		"SINLE_QUOTE_CLOSE", "SINLE_QUOTE_ESCAPED_CHAR", "SINLE_QUOTE_EXPRESSION_START", 
		"SINGLE_QUOTE_REF", "MULTILINE_QUOTE_TEXT", "MULTILINE_QUOTE_CLOSE", "MULTILINE_QUOTES", 
		"MULTILINE_QUOTE_EXPRESSION_START", "MULTILINE_QUOTE_REF"
	};
	public static final int
		RULE_kotlinFile = 0, RULE_preamble = 1, RULE_packageHeader = 2, RULE_importHeader = 3, 
		RULE_toplevelObject = 4, RULE_memberDeclaration = 5, RULE_optionalProjection = 6, 
		RULE_typeParameters = 7, RULE_typeParameter = 8, RULE_typeArguments = 9, 
		RULE_typeConstraints = 10, RULE_typeConstraint = 11, RULE_type = 12, RULE_typeDescriptor = 13, 
		RULE_userType = 14, RULE_simpleUserType_typeParam = 15, RULE_simpleUserType = 16, 
		RULE_variableDeclarationEntry = 17, RULE_functionType_paramOrType = 18, 
		RULE_extensionFunctionTypeNoReceiver = 19, RULE_functionTypeNoReceiver = 20, 
		RULE_multipleVariableDeclarations = 21, RULE_modifiers = 22, RULE_modifier = 23, 
		RULE_modifierKeyword = 24, RULE_annotations = 25, RULE_annotation = 26, 
		RULE_annotationUseSiteTarget = 27, RULE_valueArgument = 28, RULE_valueArguments = 29, 
		RULE_unescapedAnnotation = 30, RULE_jump = 31, RULE_labelReference = 32, 
		RULE_labelDefinition = 33, RULE_parameter = 34, RULE_functionParameter = 35, 
		RULE_funcParameterWithoutDefault = 36, RULE_funcParameterWithDefault = 37, 
		RULE_constructorParameter = 38, RULE_constructorParameterWithoutDefault = 39, 
		RULE_constructorParameterWithDefault = 40, RULE_primaryConstructor = 41, 
		RULE_secondaryConstructor = 42, RULE_constructorDelegationCall = 43, RULE_callSuffix = 44, 
		RULE_constructorInvocation = 45, RULE_explicitDelegation = 46, RULE_delegationSpecifier = 47, 
		RULE_classDeclaration = 48, RULE_interfaceDeclaration = 49, RULE_supertypesSpecifiers = 50, 
		RULE_objectDeclaration = 51, RULE_typealiasDeclaration = 52, RULE_companionObject = 53, 
		RULE_classBody = 54, RULE_members = 55, RULE_valueParameters = 56, RULE_functionDeclaration = 57, 
		RULE_lambdaFunction = 58, RULE_statements = 59, RULE_functionBody = 60, 
		RULE_block = 61, RULE_anonymousInitializer = 62, RULE_enumClassBody = 63, 
		RULE_enumEntries = 64, RULE_enumEntry = 65, RULE_ifExpression = 66, RULE_tryExpression = 67, 
		RULE_catchBlock = 68, RULE_finallyBlock = 69, RULE_loop = 70, RULE_forLoop = 71, 
		RULE_whileLoop = 72, RULE_doWhileLoop = 73, RULE_expression = 74, RULE_disjunction = 75, 
		RULE_conjunction = 76, RULE_equalityComparison = 77, RULE_comparison = 78, 
		RULE_namedInfix = 79, RULE_elvisExpression = 80, RULE_infixFunctionCall = 81, 
		RULE_rangeExpression = 82, RULE_additiveExpression = 83, RULE_multiplicativeExpression = 84, 
		RULE_typeRHS = 85, RULE_prefixUnaryExpression = 86, RULE_postfixUnaryExpression = 87, 
		RULE_callableReference = 88, RULE_identifier = 89, RULE_stringLiteral = 90, 
		RULE_atomicExpression = 91, RULE_literalConstant = 92, RULE_declaration = 93, 
		RULE_statement = 94, RULE_multiplicativeOperation = 95, RULE_additiveOperation = 96, 
		RULE_inOperation = 97, RULE_typeOperation = 98, RULE_isOperation = 99, 
		RULE_comparisonOperation = 100, RULE_equalityOperation = 101, RULE_assignmentOperator = 102, 
		RULE_prefixUnaryOperation = 103, RULE_postfixUnaryOperation = 104, RULE_annotatedLambda = 105, 
		RULE_memberAccessOperation = 106, RULE_functionLiteral = 107, RULE_functionLiteralparameter = 108, 
		RULE_arrayAccess = 109, RULE_objectLiteral = 110, RULE_when = 111, RULE_whenEntry = 112, 
		RULE_whenCondition = 113, RULE_lastArgLambda = 114, RULE_propertyDeclaration = 115, 
		RULE_readonlyPropertyDeclaration = 116, RULE_mutablePropertyDeclaration = 117, 
		RULE_extensionPropertyDelegateDeclaration = 118, RULE_readonlyExtensionPropertyNoDelegateDeclaration = 119, 
		RULE_parameterType = 120, RULE_mutableExtensionPropertyNoDelegateDeclaration = 121, 
		RULE_readonlyPropertyNoDelegateDeclaration = 122, RULE_propertyDelegateDeclaration = 123, 
		RULE_mutablePropertyNoDelegateDeclaration = 124, RULE_delegateExpression = 125, 
		RULE_assignExpression = 126, RULE_getterSetterDeclaration = 127, RULE_getter = 128, 
		RULE_setter = 129, RULE_functionModifier = 130, RULE_propertyModifier = 131, 
		RULE_hierarchyModifier = 132, RULE_classModifier = 133, RULE_keyWordModifier = 134, 
		RULE_accessModifier = 135, RULE_varianceAnnotation = 136;
	public static final String[] ruleNames = {
		"kotlinFile", "preamble", "packageHeader", "importHeader", "toplevelObject", 
		"memberDeclaration", "optionalProjection", "typeParameters", "typeParameter", 
		"typeArguments", "typeConstraints", "typeConstraint", "type", "typeDescriptor", 
		"userType", "simpleUserType_typeParam", "simpleUserType", "variableDeclarationEntry", 
		"functionType_paramOrType", "extensionFunctionTypeNoReceiver", "functionTypeNoReceiver", 
		"multipleVariableDeclarations", "modifiers", "modifier", "modifierKeyword", 
		"annotations", "annotation", "annotationUseSiteTarget", "valueArgument", 
		"valueArguments", "unescapedAnnotation", "jump", "labelReference", "labelDefinition", 
		"parameter", "functionParameter", "funcParameterWithoutDefault", "funcParameterWithDefault", 
		"constructorParameter", "constructorParameterWithoutDefault", "constructorParameterWithDefault", 
		"primaryConstructor", "secondaryConstructor", "constructorDelegationCall", 
		"callSuffix", "constructorInvocation", "explicitDelegation", "delegationSpecifier", 
		"classDeclaration", "interfaceDeclaration", "supertypesSpecifiers", "objectDeclaration", 
		"typealiasDeclaration", "companionObject", "classBody", "members", "valueParameters", 
		"functionDeclaration", "lambdaFunction", "statements", "functionBody", 
		"block", "anonymousInitializer", "enumClassBody", "enumEntries", "enumEntry", 
		"ifExpression", "tryExpression", "catchBlock", "finallyBlock", "loop", 
		"forLoop", "whileLoop", "doWhileLoop", "expression", "disjunction", "conjunction", 
		"equalityComparison", "comparison", "namedInfix", "elvisExpression", "infixFunctionCall", 
		"rangeExpression", "additiveExpression", "multiplicativeExpression", "typeRHS", 
		"prefixUnaryExpression", "postfixUnaryExpression", "callableReference", 
		"identifier", "stringLiteral", "atomicExpression", "literalConstant", 
		"declaration", "statement", "multiplicativeOperation", "additiveOperation", 
		"inOperation", "typeOperation", "isOperation", "comparisonOperation", 
		"equalityOperation", "assignmentOperator", "prefixUnaryOperation", "postfixUnaryOperation", 
		"annotatedLambda", "memberAccessOperation", "functionLiteral", "functionLiteralparameter", 
		"arrayAccess", "objectLiteral", "when", "whenEntry", "whenCondition", 
		"lastArgLambda", "propertyDeclaration", "readonlyPropertyDeclaration", 
		"mutablePropertyDeclaration", "extensionPropertyDelegateDeclaration", 
		"readonlyExtensionPropertyNoDelegateDeclaration", "parameterType", "mutableExtensionPropertyNoDelegateDeclaration", 
		"readonlyPropertyNoDelegateDeclaration", "propertyDelegateDeclaration", 
		"mutablePropertyNoDelegateDeclaration", "delegateExpression", "assignExpression", 
		"getterSetterDeclaration", "getter", "setter", "functionModifier", "propertyModifier", 
		"hierarchyModifier", "classModifier", "keyWordModifier", "accessModifier", 
		"varianceAnnotation"
	};

	@Override
	public String getGrammarFileName() { return "KotlinParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KotlinParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class KotlinFileContext extends ParserRuleContext {
		public PreambleContext preamble() {
			return getRuleContext(PreambleContext.class,0);
		}
		public ToplevelObjectContext toplevelObject(int i) {
			return getRuleContext(ToplevelObjectContext.class,i);
		}
		public List<ToplevelObjectContext> toplevelObject() {
			return getRuleContexts(ToplevelObjectContext.class);
		}
		public KotlinFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kotlinFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterKotlinFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitKotlinFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitKotlinFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KotlinFileContext kotlinFile() throws RecognitionException {
		KotlinFileContext _localctx = new KotlinFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_kotlinFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); preamble();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (OP_IN - 44)) | (1L << (KEYWORD_val - 44)) | (1L << (KEYWORD_vararg - 44)) | (1L << (HierarchyModifier_abstract - 44)) | (1L << (HierarchyModifier_open - 44)) | (1L << (HierarchyModifier_final - 44)) | (1L << (HierarchyModifier_override - 44)) | (1L << (KeyWordModifier_operator - 44)) | (1L << (KeyWordModifier_infix - 44)) | (1L << (KeyWordModifier_inline - 44)) | (1L << (ClassModifier_enum - 44)) | (1L << (ClassModifier_annotation - 44)) | (1L << (ClassModifier_data - 44)) | (1L << (ClassModifier_sealed - 44)) | (1L << (AccessModifier_private - 44)) | (1L << (AccessModifier_protected - 44)) | (1L << (AccessModifier_public - 44)) | (1L << (AccessModifier_internal - 44)) | (1L << (Modifier_const - 44)) | (1L << (VarianceAnnotation_out - 44)) | (1L << (DOG - 44)) | (1L << (Declaration_class - 44)) | (1L << (Declaration_interface - 44)) | (1L << (Declaration_object - 44)) | (1L << (Declaration_fun - 44)) | (1L << (Declaration_typealias - 44)))) != 0)) {
				{
				{
				setState(275); toplevelObject();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreambleContext extends ParserRuleContext {
		public List<ImportHeaderContext> importHeader() {
			return getRuleContexts(ImportHeaderContext.class);
		}
		public PackageHeaderContext packageHeader() {
			return getRuleContext(PackageHeaderContext.class,0);
		}
		public ImportHeaderContext importHeader(int i) {
			return getRuleContext(ImportHeaderContext.class,i);
		}
		public PreambleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preamble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPreamble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPreamble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitPreamble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreambleContext preamble() throws RecognitionException {
		PreambleContext _localctx = new PreambleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_preamble);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(281); packageHeader();
				}
			}

			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(284); importHeader();
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageHeaderContext extends ParserRuleContext {
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public PackageHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPackageHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPackageHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitPackageHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageHeaderContext packageHeader() throws RecognitionException {
		PackageHeaderContext _localctx = new PackageHeaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_packageHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290); match(PACKAGE);
			setState(291); identifier();
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(292); match(DOT);
				setState(293); identifier();
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(299); match(SEMI);
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportHeaderContext extends ParserRuleContext {
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode SimpleName() { return getToken(KotlinParser.SimpleName, 0); }
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public ImportHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterImportHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitImportHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitImportHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportHeaderContext importHeader() throws RecognitionException {
		ImportHeaderContext _localctx = new ImportHeaderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importHeader);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(305); match(IMPORT);
			setState(306); identifier();
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(307); match(DOT);
					setState(308); identifier();
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(318);
			switch (_input.LA(1)) {
			case DOT:
				{
				setState(314); match(DOT);
				setState(315); match(STAR);
				}
				break;
			case OP_AS:
				{
				setState(316); match(OP_AS);
				setState(317); match(SimpleName);
				}
				break;
			case EOF:
			case SEMI:
			case IMPORT:
			case OP_IN:
			case KEYWORD_val:
			case KEYWORD_vararg:
			case HierarchyModifier_abstract:
			case HierarchyModifier_open:
			case HierarchyModifier_final:
			case HierarchyModifier_override:
			case KeyWordModifier_operator:
			case KeyWordModifier_infix:
			case KeyWordModifier_inline:
			case ClassModifier_enum:
			case ClassModifier_annotation:
			case ClassModifier_data:
			case ClassModifier_sealed:
			case AccessModifier_private:
			case AccessModifier_protected:
			case AccessModifier_public:
			case AccessModifier_internal:
			case Modifier_const:
			case VarianceAnnotation_out:
			case DOG:
			case Declaration_class:
			case Declaration_interface:
			case Declaration_object:
			case Declaration_fun:
			case Declaration_typealias:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(320); match(SEMI);
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ToplevelObjectContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TypealiasDeclarationContext typealiasDeclaration() {
			return getRuleContext(TypealiasDeclarationContext.class,0);
		}
		public ToplevelObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toplevelObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterToplevelObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitToplevelObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitToplevelObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToplevelObjectContext toplevelObject() throws RecognitionException {
		ToplevelObjectContext _localctx = new ToplevelObjectContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_toplevelObject);
		try {
			setState(332);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326); propertyDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327); functionDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(328); classDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(329); interfaceDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(330); objectDeclaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(331); typealiasDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public CompanionObjectContext companionObject() {
			return getRuleContext(CompanionObjectContext.class,0);
		}
		public AnonymousInitializerContext anonymousInitializer() {
			return getRuleContext(AnonymousInitializerContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public SecondaryConstructorContext secondaryConstructor() {
			return getRuleContext(SecondaryConstructorContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_memberDeclaration);
		try {
			setState(342);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334); companionObject();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335); objectDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(336); functionDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(337); propertyDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(338); classDeclaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(339); interfaceDeclaration();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(340); anonymousInitializer();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(341); secondaryConstructor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalProjectionContext extends ParserRuleContext {
		public VarianceAnnotationContext varianceAnnotation() {
			return getRuleContext(VarianceAnnotationContext.class,0);
		}
		public OptionalProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalProjection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterOptionalProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitOptionalProjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitOptionalProjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalProjectionContext optionalProjection() throws RecognitionException {
		OptionalProjectionContext _localctx = new OptionalProjectionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_optionalProjection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_la = _input.LA(1);
			if (_la==OP_IN || _la==VarianceAnnotation_out) {
				{
				setState(344); varianceAnnotation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347); match(LT);
			setState(348); typeParameter();
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(349); match(COMMA);
				setState(350); typeParameter();
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(356); match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode SimpleName() { return getToken(KotlinParser.SimpleName, 0); }
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358); modifiers();
			setState(359); match(SimpleName);
			setState(362);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(360); match(COLON);
				setState(361); userType();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364); match(LT);
			{
			setState(366);
			_la = _input.LA(1);
			if (_la==PACKAGE || _la==BRACE_OPEN || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (KEYWORD_dynamic - 65)) | (1L << (DOG - 65)) | (1L << (SimpleName - 65)))) != 0)) {
				{
				setState(365); type();
				}
			}

			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(368); match(COMMA);
				setState(369); type();
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(375); match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeConstraintsContext extends ParserRuleContext {
		public List<TypeConstraintContext> typeConstraint() {
			return getRuleContexts(TypeConstraintContext.class);
		}
		public TypeConstraintContext typeConstraint(int i) {
			return getRuleContext(TypeConstraintContext.class,i);
		}
		public TypeConstraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeConstraints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeConstraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeConstraints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitTypeConstraints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeConstraintsContext typeConstraints() throws RecognitionException {
		TypeConstraintsContext _localctx = new TypeConstraintsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeConstraints);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(377); match(KEYWORD_where);
				setState(378); typeConstraint();
				setState(383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(379); match(COMMA);
						setState(380); typeConstraint();
						}
						} 
					}
					setState(385);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeConstraintContext extends ParserRuleContext {
		public TerminalNode SimpleName() { return getToken(KotlinParser.SimpleName, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TypeConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitTypeConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeConstraintContext typeConstraint() throws RecognitionException {
		TypeConstraintContext _localctx = new TypeConstraintContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_la = _input.LA(1);
			if (_la==DOG) {
				{
				setState(388); annotations();
				}
			}

			setState(391); match(SimpleName);
			setState(392); match(COLON);
			setState(393); type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TypeDescriptorContext typeDescriptor() {
			return getRuleContext(TypeDescriptorContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_la = _input.LA(1);
			if (_la==DOG) {
				{
				setState(395); annotations();
				}
			}

			setState(398); typeDescriptor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDescriptorContext extends ParserRuleContext {
		public FunctionTypeNoReceiverContext functionTypeNoReceiver() {
			return getRuleContext(FunctionTypeNoReceiverContext.class,0);
		}
		public ExtensionFunctionTypeNoReceiverContext extensionFunctionTypeNoReceiver() {
			return getRuleContext(ExtensionFunctionTypeNoReceiverContext.class,0);
		}
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public TypeDescriptorContext typeDescriptor() {
			return getRuleContext(TypeDescriptorContext.class,0);
		}
		public TypeDescriptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDescriptor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeDescriptor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeDescriptor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitTypeDescriptor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDescriptorContext typeDescriptor() throws RecognitionException {
		TypeDescriptorContext _localctx = new TypeDescriptorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeDescriptor);
		try {
			setState(427);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(400); match(BRACE_OPEN);
				setState(401); typeDescriptor();
				setState(402); match(BRACE_CLOSE);
				setState(404);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(403); match(Q);
					}
					break;
				}
				setState(407);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(406); extensionFunctionTypeNoReceiver();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(409); functionTypeNoReceiver();
				setState(411);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(410); extensionFunctionTypeNoReceiver();
					}
					break;
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(413); userType();
				setState(415);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(414); match(Q);
					}
					break;
				}
				setState(418);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(417); extensionFunctionTypeNoReceiver();
					}
					break;
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(420); match(KEYWORD_dynamic);
				setState(422);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(421); match(Q);
					}
					break;
				}
				setState(425);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(424); extensionFunctionTypeNoReceiver();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserTypeContext extends ParserRuleContext {
		public SimpleUserTypeContext simpleUserType(int i) {
			return getRuleContext(SimpleUserTypeContext.class,i);
		}
		public List<SimpleUserTypeContext> simpleUserType() {
			return getRuleContexts(SimpleUserTypeContext.class);
		}
		public UserTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterUserType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitUserType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitUserType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserTypeContext userType() throws RecognitionException {
		UserTypeContext _localctx = new UserTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_userType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(429); match(PACKAGE);
				setState(430); match(DOT);
				}
			}

			setState(433); simpleUserType();
			setState(438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(434); match(DOT);
					setState(435); simpleUserType();
					}
					} 
				}
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleUserType_typeParamContext extends ParserRuleContext {
		public OptionalProjectionContext optionalProjection() {
			return getRuleContext(OptionalProjectionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SimpleUserType_typeParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleUserType_typeParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterSimpleUserType_typeParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitSimpleUserType_typeParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitSimpleUserType_typeParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleUserType_typeParamContext simpleUserType_typeParam() throws RecognitionException {
		SimpleUserType_typeParamContext _localctx = new SimpleUserType_typeParamContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_simpleUserType_typeParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(441); match(STAR);
				}
				break;
			case PACKAGE:
			case BRACE_OPEN:
			case OP_IN:
			case KEYWORD_dynamic:
			case VarianceAnnotation_out:
			case DOG:
			case SimpleName:
				{
				{
				setState(442); optionalProjection();
				setState(443); type();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleUserTypeContext extends ParserRuleContext {
		public TerminalNode SimpleName() { return getToken(KotlinParser.SimpleName, 0); }
		public List<SimpleUserType_typeParamContext> simpleUserType_typeParam() {
			return getRuleContexts(SimpleUserType_typeParamContext.class);
		}
		public SimpleUserType_typeParamContext simpleUserType_typeParam(int i) {
			return getRuleContext(SimpleUserType_typeParamContext.class,i);
		}
		public SimpleUserTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleUserType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterSimpleUserType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitSimpleUserType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitSimpleUserType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleUserTypeContext simpleUserType() throws RecognitionException {
		SimpleUserTypeContext _localctx = new SimpleUserTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_simpleUserType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447); match(SimpleName);
			setState(459);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(448); match(LT);
				setState(449); simpleUserType_typeParam();
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(450); match(COMMA);
					setState(451); simpleUserType_typeParam();
					}
					}
					setState(456);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(457); match(GT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationEntryContext extends ParserRuleContext {
		public TerminalNode SimpleName() { return getToken(KotlinParser.SimpleName, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclarationEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterVariableDeclarationEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitVariableDeclarationEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitVariableDeclarationEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationEntryContext variableDeclarationEntry() throws RecognitionException {
		VariableDeclarationEntryContext _localctx = new VariableDeclarationEntryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableDeclarationEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461); match(SimpleName);
			setState(464);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(462); match(COLON);
				setState(463); type();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionType_paramOrTypeContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public FunctionType_paramOrTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType_paramOrType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionType_paramOrType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionType_paramOrType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitFunctionType_paramOrType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionType_paramOrTypeContext functionType_paramOrType() throws RecognitionException {
		FunctionType_paramOrTypeContext _localctx = new FunctionType_paramOrTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functionType_paramOrType);
		try {
			setState(470);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(466); parameter();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(467); modifiers();
				setState(468); type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionFunctionTypeNoReceiverContext extends ParserRuleContext {
		public FunctionTypeNoReceiverContext functionTypeNoReceiver() {
			return getRuleContext(FunctionTypeNoReceiverContext.class,0);
		}
		public ExtensionFunctionTypeNoReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionFunctionTypeNoReceiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterExtensionFunctionTypeNoReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitExtensionFunctionTypeNoReceiver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitExtensionFunctionTypeNoReceiver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtensionFunctionTypeNoReceiverContext extensionFunctionTypeNoReceiver() throws RecognitionException {
		ExtensionFunctionTypeNoReceiverContext _localctx = new ExtensionFunctionTypeNoReceiverContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_extensionFunctionTypeNoReceiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472); match(DOT);
			setState(473); functionTypeNoReceiver();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeNoReceiverContext extends ParserRuleContext {
		public List<FunctionType_paramOrTypeContext> functionType_paramOrType() {
			return getRuleContexts(FunctionType_paramOrTypeContext.class);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionType_paramOrTypeContext functionType_paramOrType(int i) {
			return getRuleContext(FunctionType_paramOrTypeContext.class,i);
		}
		public FunctionTypeNoReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeNoReceiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionTypeNoReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionTypeNoReceiver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitFunctionTypeNoReceiver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeNoReceiverContext functionTypeNoReceiver() throws RecognitionException {
		FunctionTypeNoReceiverContext _localctx = new FunctionTypeNoReceiverContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionTypeNoReceiver);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475); match(BRACE_OPEN);
			setState(484);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PACKAGE) | (1L << BRACE_OPEN) | (1L << OP_IN) | (1L << KEYWORD_vararg))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (KEYWORD_dynamic - 65)) | (1L << (HierarchyModifier_abstract - 65)) | (1L << (HierarchyModifier_open - 65)) | (1L << (HierarchyModifier_final - 65)) | (1L << (HierarchyModifier_override - 65)) | (1L << (KeyWordModifier_operator - 65)) | (1L << (KeyWordModifier_infix - 65)) | (1L << (KeyWordModifier_inline - 65)) | (1L << (ClassModifier_enum - 65)) | (1L << (ClassModifier_annotation - 65)) | (1L << (ClassModifier_data - 65)) | (1L << (ClassModifier_sealed - 65)) | (1L << (AccessModifier_private - 65)) | (1L << (AccessModifier_protected - 65)) | (1L << (AccessModifier_public - 65)) | (1L << (AccessModifier_internal - 65)) | (1L << (Modifier_const - 65)) | (1L << (VarianceAnnotation_out - 65)) | (1L << (DOG - 65)) | (1L << (SimpleName - 65)))) != 0)) {
				{
				setState(476); functionType_paramOrType();
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(477); match(COMMA);
					setState(478); functionType_paramOrType();
					}
					}
					setState(483);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(486); match(BRACE_CLOSE);
			setState(487); match(OP_ASTERISK);
			setState(488); type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipleVariableDeclarationsContext extends ParserRuleContext {
		public List<VariableDeclarationEntryContext> variableDeclarationEntry() {
			return getRuleContexts(VariableDeclarationEntryContext.class);
		}
		public VariableDeclarationEntryContext variableDeclarationEntry(int i) {
			return getRuleContext(VariableDeclarationEntryContext.class,i);
		}
		public MultipleVariableDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleVariableDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMultipleVariableDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMultipleVariableDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitMultipleVariableDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleVariableDeclarationsContext multipleVariableDeclarations() throws RecognitionException {
		MultipleVariableDeclarationsContext _localctx = new MultipleVariableDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_multipleVariableDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490); match(BRACE_OPEN);
			setState(491); variableDeclarationEntry();
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(492); match(COMMA);
				setState(493); variableDeclarationEntry();
				}
				}
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(499); match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifiersContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_modifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(501); modifier();
					}
					} 
				}
				setState(506);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public ModifierKeywordContext modifierKeyword() {
			return getRuleContext(ModifierKeywordContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507); modifierKeyword();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierKeywordContext extends ParserRuleContext {
		public ClassModifierContext classModifier() {
			return getRuleContext(ClassModifierContext.class,0);
		}
		public KeyWordModifierContext keyWordModifier() {
			return getRuleContext(KeyWordModifierContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public HierarchyModifierContext hierarchyModifier() {
			return getRuleContext(HierarchyModifierContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public VarianceAnnotationContext varianceAnnotation() {
			return getRuleContext(VarianceAnnotationContext.class,0);
		}
		public ModifierKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterModifierKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitModifierKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitModifierKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierKeywordContext modifierKeyword() throws RecognitionException {
		ModifierKeywordContext _localctx = new ModifierKeywordContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_modifierKeyword);
		try {
			setState(516);
			switch (_input.LA(1)) {
			case HierarchyModifier_abstract:
			case HierarchyModifier_open:
			case HierarchyModifier_final:
			case HierarchyModifier_override:
				enterOuterAlt(_localctx, 1);
				{
				setState(509); hierarchyModifier();
				}
				break;
			case AccessModifier_private:
			case AccessModifier_protected:
			case AccessModifier_public:
			case AccessModifier_internal:
			case Modifier_const:
				enterOuterAlt(_localctx, 2);
				{
				setState(510); accessModifier();
				}
				break;
			case OP_IN:
			case VarianceAnnotation_out:
				enterOuterAlt(_localctx, 3);
				{
				setState(511); varianceAnnotation();
				}
				break;
			case DOG:
				enterOuterAlt(_localctx, 4);
				{
				setState(512); annotations();
				}
				break;
			case ClassModifier_enum:
			case ClassModifier_annotation:
			case ClassModifier_data:
			case ClassModifier_sealed:
				enterOuterAlt(_localctx, 5);
				{
				setState(513); classModifier();
				}
				break;
			case KeyWordModifier_operator:
			case KeyWordModifier_infix:
			case KeyWordModifier_inline:
				enterOuterAlt(_localctx, 6);
				{
				setState(514); keyWordModifier();
				}
				break;
			case KEYWORD_vararg:
				enterOuterAlt(_localctx, 7);
				{
				setState(515); match(KEYWORD_vararg);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationsContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAnnotations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAnnotations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_annotations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(519); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(518); annotation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(521); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public UnescapedAnnotationContext unescapedAnnotation() {
			return getRuleContext(UnescapedAnnotationContext.class,0);
		}
		public AnnotationUseSiteTargetContext annotationUseSiteTarget() {
			return getRuleContext(AnnotationUseSiteTargetContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523); match(DOG);
			setState(527);
			_la = _input.LA(1);
			if (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (GET - 67)) | (1L << (SET - 67)) | (1L << (AnnotationUseSiteTarget_file - 67)) | (1L << (AnnotationUseSiteTarget_field - 67)) | (1L << (AnnotationUseSiteTarget_property - 67)) | (1L << (AnnotationUseSiteTarget_param - 67)) | (1L << (AnnotationUseSiteTarget_sparam - 67)))) != 0)) {
				{
				setState(524); annotationUseSiteTarget();
				setState(525); match(COLON);
				}
			}

			setState(529); unescapedAnnotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationUseSiteTargetContext extends ParserRuleContext {
		public AnnotationUseSiteTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationUseSiteTarget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAnnotationUseSiteTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAnnotationUseSiteTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAnnotationUseSiteTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationUseSiteTargetContext annotationUseSiteTarget() throws RecognitionException {
		AnnotationUseSiteTargetContext _localctx = new AnnotationUseSiteTargetContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_annotationUseSiteTarget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (GET - 67)) | (1L << (SET - 67)) | (1L << (AnnotationUseSiteTarget_file - 67)) | (1L << (AnnotationUseSiteTarget_field - 67)) | (1L << (AnnotationUseSiteTarget_property - 67)) | (1L << (AnnotationUseSiteTarget_param - 67)) | (1L << (AnnotationUseSiteTarget_sparam - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueArgumentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterValueArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitValueArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitValueArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueArgumentContext valueArgument() throws RecognitionException {
		ValueArgumentContext _localctx = new ValueArgumentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_valueArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(533); identifier();
				setState(534); match(EQ);
				}
				break;
			}
			setState(539);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(538); match(STAR);
				}
			}

			setState(541); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueArgumentsContext extends ParserRuleContext {
		public List<ValueArgumentContext> valueArgument() {
			return getRuleContexts(ValueArgumentContext.class);
		}
		public ValueArgumentContext valueArgument(int i) {
			return getRuleContext(ValueArgumentContext.class,i);
		}
		public ValueArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterValueArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitValueArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitValueArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueArgumentsContext valueArguments() throws RecognitionException {
		ValueArgumentsContext _localctx = new ValueArgumentsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_valueArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543); match(BRACE_OPEN);
			setState(552);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << OPEN_BLOCK) | (1L << HexadecimalLiteral) | (1L << CharacterLiteral) | (1L << TRIPLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << PACKAGE) | (1L << IMPORT) | (1L << STAR) | (1L << BRACE_OPEN) | (1L << REFERENCE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << OP_PLUS) | (1L << OP_MUNUS) | (1L << OP_DECREMENT) | (1L << OP_INCREMENT) | (1L << OP_NOT))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (ClassModifier_enum - 76)) | (1L << (ClassModifier_data - 76)) | (1L << (AccessModifier_private - 76)) | (1L << (AccessModifier_protected - 76)) | (1L << (AccessModifier_public - 76)) | (1L << (AccessModifier_internal - 76)) | (1L << (Modifier_const - 76)) | (1L << (DOG - 76)) | (1L << (Jump_throw - 76)) | (1L << (Jump_continue - 76)) | (1L << (Jump_return - 76)) | (1L << (Jump_break - 76)) | (1L << (ConstructorDelegationCall_this - 76)) | (1L << (ConstructorDelegationCall_super - 76)) | (1L << (Declaration_object - 76)) | (1L << (Declaration_companion - 76)) | (1L << (Declaration_fun - 76)) | (1L << (Declaration_init - 76)) | (1L << (CF_if - 76)) | (1L << (CF_when - 76)) | (1L << (CF_while - 76)) | (1L << (CF_for - 76)) | (1L << (CF_do - 76)) | (1L << (CF_try - 76)) | (1L << (BAX - 76)) | (1L << (SimpleName - 76)))) != 0)) {
				{
				setState(544); valueArgument();
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(545); match(COMMA);
					setState(546); valueArgument();
					}
					}
					setState(551);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(554); match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnescapedAnnotationContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public UnescapedAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unescapedAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterUnescapedAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitUnescapedAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitUnescapedAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnescapedAnnotationContext unescapedAnnotation() throws RecognitionException {
		UnescapedAnnotationContext _localctx = new UnescapedAnnotationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_unescapedAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556); identifier();
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(557); match(DOT);
				setState(558); identifier();
				}
				}
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(565);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(564); typeArguments();
				}
				break;
			}
			setState(568);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(567); valueArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LabelReferenceContext labelReference() {
			return getRuleContext(LabelReferenceContext.class,0);
		}
		public JumpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterJump(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitJump(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitJump(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpContext jump() throws RecognitionException {
		JumpContext _localctx = new JumpContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_jump);
		try {
			setState(587);
			switch (_input.LA(1)) {
			case Jump_throw:
				enterOuterAlt(_localctx, 1);
				{
				setState(570); match(Jump_throw);
				setState(571); expression();
				}
				break;
			case Jump_return:
				enterOuterAlt(_localctx, 2);
				{
				setState(572); match(Jump_return);
				setState(574);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(573); labelReference();
					}
					break;
				}
				setState(577);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(576); expression();
					}
					break;
				}
				}
				break;
			case Jump_continue:
				enterOuterAlt(_localctx, 3);
				{
				setState(579); match(Jump_continue);
				setState(581);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(580); labelReference();
					}
					break;
				}
				}
				break;
			case Jump_break:
				enterOuterAlt(_localctx, 4);
				{
				setState(583); match(Jump_break);
				setState(585);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(584); labelReference();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelReferenceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LabelReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterLabelReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitLabelReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitLabelReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelReferenceContext labelReference() throws RecognitionException {
		LabelReferenceContext _localctx = new LabelReferenceContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_labelReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589); match(DOG);
			setState(594);
			switch (_input.LA(1)) {
			case IMPORT:
			case ClassModifier_enum:
			case ClassModifier_data:
			case AccessModifier_private:
			case AccessModifier_protected:
			case AccessModifier_public:
			case AccessModifier_internal:
			case Modifier_const:
			case Declaration_companion:
			case Declaration_init:
			case SimpleName:
				{
				setState(590); identifier();
				}
				break;
			case CF_for:
				{
				setState(591); match(CF_for);
				}
				break;
			case CF_while:
				{
				setState(592); match(CF_while);
				}
				break;
			case CF_when:
				{
				setState(593); match(CF_when);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LabelDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterLabelDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitLabelDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitLabelDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelDefinitionContext labelDefinition() throws RecognitionException {
		LabelDefinitionContext _localctx = new LabelDefinitionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_labelDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596); identifier();
			setState(597); match(DOG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode SimpleName() { return getToken(KotlinParser.SimpleName, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599); match(SimpleName);
			setState(600); match(COLON);
			setState(601); type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionParameterContext extends ParserRuleContext {
		public FuncParameterWithoutDefaultContext funcParameterWithoutDefault() {
			return getRuleContext(FuncParameterWithoutDefaultContext.class,0);
		}
		public FuncParameterWithDefaultContext funcParameterWithDefault() {
			return getRuleContext(FuncParameterWithDefaultContext.class,0);
		}
		public FunctionParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitFunctionParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterContext functionParameter() throws RecognitionException {
		FunctionParameterContext _localctx = new FunctionParameterContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_functionParameter);
		try {
			setState(605);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(603); funcParameterWithoutDefault();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(604); funcParameterWithDefault();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncParameterWithoutDefaultContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public FuncParameterWithoutDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParameterWithoutDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFuncParameterWithoutDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFuncParameterWithoutDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitFuncParameterWithoutDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncParameterWithoutDefaultContext funcParameterWithoutDefault() throws RecognitionException {
		FuncParameterWithoutDefaultContext _localctx = new FuncParameterWithoutDefaultContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_funcParameterWithoutDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607); modifiers();
			setState(608); parameter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncParameterWithDefaultContext extends ParserRuleContext {
		public FuncParameterWithoutDefaultContext funcParameterWithoutDefault() {
			return getRuleContext(FuncParameterWithoutDefaultContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FuncParameterWithDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParameterWithDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFuncParameterWithDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFuncParameterWithDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitFuncParameterWithDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncParameterWithDefaultContext funcParameterWithDefault() throws RecognitionException {
		FuncParameterWithDefaultContext _localctx = new FuncParameterWithDefaultContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_funcParameterWithDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610); funcParameterWithoutDefault();
			setState(611); match(EQ);
			setState(612); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorParameterContext extends ParserRuleContext {
		public ConstructorParameterWithDefaultContext constructorParameterWithDefault() {
			return getRuleContext(ConstructorParameterWithDefaultContext.class,0);
		}
		public ConstructorParameterWithoutDefaultContext constructorParameterWithoutDefault() {
			return getRuleContext(ConstructorParameterWithoutDefaultContext.class,0);
		}
		public ConstructorParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterConstructorParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitConstructorParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitConstructorParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorParameterContext constructorParameter() throws RecognitionException {
		ConstructorParameterContext _localctx = new ConstructorParameterContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_constructorParameter);
		try {
			setState(616);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(614); constructorParameterWithoutDefault();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(615); constructorParameterWithDefault();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorParameterWithoutDefaultContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public ConstructorParameterWithoutDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorParameterWithoutDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterConstructorParameterWithoutDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitConstructorParameterWithoutDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitConstructorParameterWithoutDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorParameterWithoutDefaultContext constructorParameterWithoutDefault() throws RecognitionException {
		ConstructorParameterWithoutDefaultContext _localctx = new ConstructorParameterWithoutDefaultContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_constructorParameterWithoutDefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618); modifiers();
			setState(620);
			_la = _input.LA(1);
			if (_la==KEYWORD_val || _la==KEYWORD_var) {
				{
				setState(619);
				_la = _input.LA(1);
				if ( !(_la==KEYWORD_val || _la==KEYWORD_var) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(622); parameter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorParameterWithDefaultContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstructorParameterWithoutDefaultContext constructorParameterWithoutDefault() {
			return getRuleContext(ConstructorParameterWithoutDefaultContext.class,0);
		}
		public ConstructorParameterWithDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorParameterWithDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterConstructorParameterWithDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitConstructorParameterWithDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitConstructorParameterWithDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorParameterWithDefaultContext constructorParameterWithDefault() throws RecognitionException {
		ConstructorParameterWithDefaultContext _localctx = new ConstructorParameterWithDefaultContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_constructorParameterWithDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624); constructorParameterWithoutDefault();
			setState(625); match(EQ);
			setState(626); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryConstructorContext extends ParserRuleContext {
		public ConstructorParameterContext constructorParameter(int i) {
			return getRuleContext(ConstructorParameterContext.class,i);
		}
		public List<ConstructorParameterContext> constructorParameter() {
			return getRuleContexts(ConstructorParameterContext.class);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public PrimaryConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPrimaryConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPrimaryConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitPrimaryConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryConstructorContext primaryConstructor() throws RecognitionException {
		PrimaryConstructorContext _localctx = new PrimaryConstructorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_primaryConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			_la = _input.LA(1);
			if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (AccessModifier_private - 80)) | (1L << (AccessModifier_protected - 80)) | (1L << (AccessModifier_public - 80)) | (1L << (AccessModifier_internal - 80)) | (1L << (Modifier_const - 80)) | (1L << (KEYWORD_constructor - 80)))) != 0)) {
				{
				setState(629);
				_la = _input.LA(1);
				if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (AccessModifier_private - 80)) | (1L << (AccessModifier_protected - 80)) | (1L << (AccessModifier_public - 80)) | (1L << (AccessModifier_internal - 80)) | (1L << (Modifier_const - 80)))) != 0)) {
					{
					setState(628); accessModifier();
					}
				}

				setState(631); match(KEYWORD_constructor);
				}
			}

			{
			setState(634); match(BRACE_OPEN);
			setState(643);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_IN) | (1L << KEYWORD_val) | (1L << KEYWORD_var) | (1L << KEYWORD_vararg))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (HierarchyModifier_abstract - 69)) | (1L << (HierarchyModifier_open - 69)) | (1L << (HierarchyModifier_final - 69)) | (1L << (HierarchyModifier_override - 69)) | (1L << (KeyWordModifier_operator - 69)) | (1L << (KeyWordModifier_infix - 69)) | (1L << (KeyWordModifier_inline - 69)) | (1L << (ClassModifier_enum - 69)) | (1L << (ClassModifier_annotation - 69)) | (1L << (ClassModifier_data - 69)) | (1L << (ClassModifier_sealed - 69)) | (1L << (AccessModifier_private - 69)) | (1L << (AccessModifier_protected - 69)) | (1L << (AccessModifier_public - 69)) | (1L << (AccessModifier_internal - 69)) | (1L << (Modifier_const - 69)) | (1L << (VarianceAnnotation_out - 69)) | (1L << (DOG - 69)) | (1L << (SimpleName - 69)))) != 0)) {
				{
				setState(635); constructorParameter();
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(636); match(COMMA);
					setState(637); constructorParameter();
					}
					}
					setState(642);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(645); match(BRACE_CLOSE);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SecondaryConstructorContext extends ParserRuleContext {
		public ConstructorParameterContext constructorParameter(int i) {
			return getRuleContext(ConstructorParameterContext.class,i);
		}
		public List<ConstructorParameterContext> constructorParameter() {
			return getRuleContexts(ConstructorParameterContext.class);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ConstructorDelegationCallContext constructorDelegationCall() {
			return getRuleContext(ConstructorDelegationCallContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SecondaryConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondaryConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterSecondaryConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitSecondaryConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitSecondaryConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecondaryConstructorContext secondaryConstructor() throws RecognitionException {
		SecondaryConstructorContext _localctx = new SecondaryConstructorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_secondaryConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			_la = _input.LA(1);
			if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (AccessModifier_private - 80)) | (1L << (AccessModifier_protected - 80)) | (1L << (AccessModifier_public - 80)) | (1L << (AccessModifier_internal - 80)) | (1L << (Modifier_const - 80)))) != 0)) {
				{
				setState(647); accessModifier();
				}
			}

			setState(650); match(KEYWORD_constructor);
			{
			setState(651); match(BRACE_OPEN);
			setState(660);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_IN) | (1L << KEYWORD_val) | (1L << KEYWORD_var) | (1L << KEYWORD_vararg))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (HierarchyModifier_abstract - 69)) | (1L << (HierarchyModifier_open - 69)) | (1L << (HierarchyModifier_final - 69)) | (1L << (HierarchyModifier_override - 69)) | (1L << (KeyWordModifier_operator - 69)) | (1L << (KeyWordModifier_infix - 69)) | (1L << (KeyWordModifier_inline - 69)) | (1L << (ClassModifier_enum - 69)) | (1L << (ClassModifier_annotation - 69)) | (1L << (ClassModifier_data - 69)) | (1L << (ClassModifier_sealed - 69)) | (1L << (AccessModifier_private - 69)) | (1L << (AccessModifier_protected - 69)) | (1L << (AccessModifier_public - 69)) | (1L << (AccessModifier_internal - 69)) | (1L << (Modifier_const - 69)) | (1L << (VarianceAnnotation_out - 69)) | (1L << (DOG - 69)) | (1L << (SimpleName - 69)))) != 0)) {
				{
				setState(652); constructorParameter();
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(653); match(COMMA);
					setState(654); constructorParameter();
					}
					}
					setState(659);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(662); match(BRACE_CLOSE);
			}
			setState(666);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(664); match(COLON);
				setState(665); constructorDelegationCall();
				}
			}

			setState(669);
			_la = _input.LA(1);
			if (_la==OPEN_BLOCK) {
				{
				setState(668); block();
				}
			}

			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(671); match(SEMI);
				}
				}
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDelegationCallContext extends ParserRuleContext {
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public ConstructorDelegationCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDelegationCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterConstructorDelegationCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitConstructorDelegationCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitConstructorDelegationCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDelegationCallContext constructorDelegationCall() throws RecognitionException {
		ConstructorDelegationCallContext _localctx = new ConstructorDelegationCallContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_constructorDelegationCall);
		try {
			setState(681);
			switch (_input.LA(1)) {
			case ConstructorDelegationCall_this:
				enterOuterAlt(_localctx, 1);
				{
				setState(677); match(ConstructorDelegationCall_this);
				setState(678); valueArguments();
				}
				break;
			case ConstructorDelegationCall_super:
				enterOuterAlt(_localctx, 2);
				{
				setState(679); match(ConstructorDelegationCall_super);
				setState(680); valueArguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallSuffixContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public AnnotatedLambdaContext annotatedLambda() {
			return getRuleContext(AnnotatedLambdaContext.class,0);
		}
		public CallSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterCallSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitCallSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitCallSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallSuffixContext callSuffix() throws RecognitionException {
		CallSuffixContext _localctx = new CallSuffixContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_callSuffix);
		int _la;
		try {
			setState(694);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(684);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(683); typeArguments();
					}
				}

				setState(686); valueArguments();
				setState(688);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(687); annotatedLambda();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(690); typeArguments();
				setState(691); annotatedLambda();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(693); annotatedLambda();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorInvocationContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public ConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitConstructorInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitConstructorInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorInvocationContext constructorInvocation() throws RecognitionException {
		ConstructorInvocationContext _localctx = new ConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_constructorInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696); userType();
			setState(698);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(697); typeArguments();
				}
			}

			setState(700); valueArguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitDelegationContext extends ParserRuleContext {
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExplicitDelegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitDelegation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterExplicitDelegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitExplicitDelegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitExplicitDelegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitDelegationContext explicitDelegation() throws RecognitionException {
		ExplicitDelegationContext _localctx = new ExplicitDelegationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_explicitDelegation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702); userType();
			setState(703); match(KEYWORD_by);
			setState(704); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DelegationSpecifierContext extends ParserRuleContext {
		public ConstructorInvocationContext constructorInvocation() {
			return getRuleContext(ConstructorInvocationContext.class,0);
		}
		public ExplicitDelegationContext explicitDelegation() {
			return getRuleContext(ExplicitDelegationContext.class,0);
		}
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public DelegationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegationSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterDelegationSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitDelegationSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitDelegationSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelegationSpecifierContext delegationSpecifier() throws RecognitionException {
		DelegationSpecifierContext _localctx = new DelegationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_delegationSpecifier);
		try {
			setState(709);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(706); constructorInvocation();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(707); userType();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(708); explicitDelegation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode SimpleName() { return getToken(KotlinParser.SimpleName, 0); }
		public EnumClassBodyContext enumClassBody() {
			return getRuleContext(EnumClassBodyContext.class,0);
		}
		public List<DelegationSpecifierContext> delegationSpecifier() {
			return getRuleContexts(DelegationSpecifierContext.class);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public PrimaryConstructorContext primaryConstructor() {
			return getRuleContext(PrimaryConstructorContext.class,0);
		}
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public DelegationSpecifierContext delegationSpecifier(int i) {
			return getRuleContext(DelegationSpecifierContext.class,i);
		}
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_classDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(711); modifiers();
			setState(712); match(Declaration_class);
			setState(713); match(SimpleName);
			setState(715);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(714); typeParameters();
				}
			}

			setState(718);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(717); primaryConstructor();
				}
				break;
			}
			setState(732);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(720); match(COLON);
				setState(722);
				_la = _input.LA(1);
				if (_la==DOG) {
					{
					setState(721); annotations();
					}
				}

				setState(724); delegationSpecifier();
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(725); match(COMMA);
					setState(726); delegationSpecifier();
					}
					}
					setState(731);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(734); typeConstraints();
			setState(737);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(735); classBody();
				}
				break;

			case 2:
				{
				setState(736); enumClassBody();
				}
				break;
			}
			setState(742);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(739); match(SEMI);
					}
					} 
				}
				setState(744);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode SimpleName() { return getToken(KotlinParser.SimpleName, 0); }
		public EnumClassBodyContext enumClassBody() {
			return getRuleContext(EnumClassBodyContext.class,0);
		}
		public List<DelegationSpecifierContext> delegationSpecifier() {
			return getRuleContexts(DelegationSpecifierContext.class);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public PrimaryConstructorContext primaryConstructor() {
			return getRuleContext(PrimaryConstructorContext.class,0);
		}
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public DelegationSpecifierContext delegationSpecifier(int i) {
			return getRuleContext(DelegationSpecifierContext.class,i);
		}
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_interfaceDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(745); modifiers();
			setState(746); match(Declaration_interface);
			setState(747); match(SimpleName);
			setState(749);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(748); typeParameters();
				}
			}

			setState(752);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(751); primaryConstructor();
				}
				break;
			}
			setState(766);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(754); match(COLON);
				setState(756);
				_la = _input.LA(1);
				if (_la==DOG) {
					{
					setState(755); annotations();
					}
				}

				setState(758); delegationSpecifier();
				setState(763);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(759); match(COMMA);
					setState(760); delegationSpecifier();
					}
					}
					setState(765);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(768); typeConstraints();
			setState(771);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(769); classBody();
				}
				break;

			case 2:
				{
				setState(770); enumClassBody();
				}
				break;
			}
			setState(776);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(773); match(SEMI);
					}
					} 
				}
				setState(778);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SupertypesSpecifiersContext extends ParserRuleContext {
		public List<DelegationSpecifierContext> delegationSpecifier() {
			return getRuleContexts(DelegationSpecifierContext.class);
		}
		public DelegationSpecifierContext delegationSpecifier(int i) {
			return getRuleContext(DelegationSpecifierContext.class,i);
		}
		public SupertypesSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supertypesSpecifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterSupertypesSpecifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitSupertypesSpecifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitSupertypesSpecifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupertypesSpecifiersContext supertypesSpecifiers() throws RecognitionException {
		SupertypesSpecifiersContext _localctx = new SupertypesSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_supertypesSpecifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779); match(COLON);
			setState(780); delegationSpecifier();
			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(781); match(COMMA);
				setState(782); delegationSpecifier();
				}
				}
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectDeclarationContext extends ParserRuleContext {
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode SimpleName() { return getToken(KotlinParser.SimpleName, 0); }
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public PrimaryConstructorContext primaryConstructor() {
			return getRuleContext(PrimaryConstructorContext.class,0);
		}
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public SupertypesSpecifiersContext supertypesSpecifiers() {
			return getRuleContext(SupertypesSpecifiersContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public ObjectDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterObjectDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitObjectDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitObjectDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectDeclarationContext objectDeclaration() throws RecognitionException {
		ObjectDeclarationContext _localctx = new ObjectDeclarationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_objectDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(788); modifiers();
			setState(789); match(Declaration_object);
			setState(790); match(SimpleName);
			setState(792);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(791); primaryConstructor();
				}
				break;
			}
			setState(795);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(794); supertypesSpecifiers();
				}
			}

			setState(797); classBody();
			setState(801);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(798); match(SEMI);
					}
					} 
				}
				setState(803);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypealiasDeclarationContext extends ParserRuleContext {
		public TerminalNode SimpleName() { return getToken(KotlinParser.SimpleName, 0); }
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public SimpleUserTypeContext simpleUserType() {
			return getRuleContext(SimpleUserTypeContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TypealiasDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealiasDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypealiasDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypealiasDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitTypealiasDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypealiasDeclarationContext typealiasDeclaration() throws RecognitionException {
		TypealiasDeclarationContext _localctx = new TypealiasDeclarationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_typealiasDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804); modifiers();
			setState(805); match(Declaration_typealias);
			setState(806); match(SimpleName);
			setState(807); match(EQ);
			setState(808); simpleUserType();
			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(809); match(SEMI);
				}
				}
				setState(814);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompanionObjectContext extends ParserRuleContext {
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public SupertypesSpecifiersContext supertypesSpecifiers() {
			return getRuleContext(SupertypesSpecifiersContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public CompanionObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_companionObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterCompanionObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitCompanionObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitCompanionObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompanionObjectContext companionObject() throws RecognitionException {
		CompanionObjectContext _localctx = new CompanionObjectContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_companionObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815); modifiers();
			setState(816); match(Declaration_companion);
			setState(817); match(Declaration_object);
			setState(819);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(818); supertypesSpecifiers();
				}
			}

			setState(821); classBody();
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(822); match(SEMI);
				}
				}
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public MembersContext members() {
			return getRuleContext(MembersContext.class,0);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_classBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(828); match(OPEN_BLOCK);
				setState(829); members();
				setState(830); match(CLOSE_BLOCK);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MembersContext extends ParserRuleContext {
		public List<MemberDeclarationContext> memberDeclaration() {
			return getRuleContexts(MemberDeclarationContext.class);
		}
		public MemberDeclarationContext memberDeclaration(int i) {
			return getRuleContext(MemberDeclarationContext.class,i);
		}
		public MembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMembers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitMembers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MembersContext members() throws RecognitionException {
		MembersContext _localctx = new MembersContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (OP_IN - 44)) | (1L << (KEYWORD_val - 44)) | (1L << (KEYWORD_vararg - 44)) | (1L << (HierarchyModifier_abstract - 44)) | (1L << (HierarchyModifier_open - 44)) | (1L << (HierarchyModifier_final - 44)) | (1L << (HierarchyModifier_override - 44)) | (1L << (KeyWordModifier_operator - 44)) | (1L << (KeyWordModifier_infix - 44)) | (1L << (KeyWordModifier_inline - 44)) | (1L << (ClassModifier_enum - 44)) | (1L << (ClassModifier_annotation - 44)) | (1L << (ClassModifier_data - 44)) | (1L << (ClassModifier_sealed - 44)) | (1L << (AccessModifier_private - 44)) | (1L << (AccessModifier_protected - 44)) | (1L << (AccessModifier_public - 44)) | (1L << (AccessModifier_internal - 44)) | (1L << (Modifier_const - 44)) | (1L << (VarianceAnnotation_out - 44)) | (1L << (DOG - 44)) | (1L << (KEYWORD_constructor - 44)) | (1L << (Declaration_class - 44)) | (1L << (Declaration_interface - 44)) | (1L << (Declaration_object - 44)) | (1L << (Declaration_companion - 44)) | (1L << (Declaration_fun - 44)) | (1L << (Declaration_init - 44)))) != 0)) {
				{
				{
				setState(834); memberDeclaration();
				}
				}
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueParametersContext extends ParserRuleContext {
		public FunctionParameterContext functionParameter(int i) {
			return getRuleContext(FunctionParameterContext.class,i);
		}
		public List<FunctionParameterContext> functionParameter() {
			return getRuleContexts(FunctionParameterContext.class);
		}
		public ValueParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterValueParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitValueParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitValueParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueParametersContext valueParameters() throws RecognitionException {
		ValueParametersContext _localctx = new ValueParametersContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_valueParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840); match(BRACE_OPEN);
			setState(849);
			_la = _input.LA(1);
			if (_la==OP_IN || _la==KEYWORD_vararg || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (HierarchyModifier_abstract - 69)) | (1L << (HierarchyModifier_open - 69)) | (1L << (HierarchyModifier_final - 69)) | (1L << (HierarchyModifier_override - 69)) | (1L << (KeyWordModifier_operator - 69)) | (1L << (KeyWordModifier_infix - 69)) | (1L << (KeyWordModifier_inline - 69)) | (1L << (ClassModifier_enum - 69)) | (1L << (ClassModifier_annotation - 69)) | (1L << (ClassModifier_data - 69)) | (1L << (ClassModifier_sealed - 69)) | (1L << (AccessModifier_private - 69)) | (1L << (AccessModifier_protected - 69)) | (1L << (AccessModifier_public - 69)) | (1L << (AccessModifier_internal - 69)) | (1L << (Modifier_const - 69)) | (1L << (VarianceAnnotation_out - 69)) | (1L << (DOG - 69)) | (1L << (SimpleName - 69)))) != 0)) {
				{
				setState(841); functionParameter();
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(842); match(COMMA);
					setState(843); functionParameter();
					}
					}
					setState(848);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(851); match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode SimpleName() { return getToken(KotlinParser.SimpleName, 0); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public ValueParametersContext valueParameters() {
			return getRuleContext(ValueParametersContext.class,0);
		}
		public List<TypeParametersContext> typeParameters() {
			return getRuleContexts(TypeParametersContext.class);
		}
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TypeParametersContext typeParameters(int i) {
			return getRuleContext(TypeParametersContext.class,i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_functionDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(853); modifiers();
			setState(854); match(Declaration_fun);
			setState(856);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(855); typeParameters();
				}
			}

			setState(862);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(858); type();
				setState(859); match(DOT);
				}
				break;

			case 2:
				{
				setState(861); annotations();
				}
				break;
			}
			setState(864); match(SimpleName);
			setState(866);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(865); typeParameters();
				}
			}

			setState(868); valueParameters();
			setState(871);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(869); match(COLON);
				setState(870); type();
				}
			}

			setState(873); typeConstraints();
			setState(875);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(874); functionBody();
				}
				break;
			}
			setState(880);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(877); match(SEMI);
					}
					} 
				}
				setState(882);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaFunctionContext extends ParserRuleContext {
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public ValueParametersContext valueParameters() {
			return getRuleContext(ValueParametersContext.class,0);
		}
		public List<TypeParametersContext> typeParameters() {
			return getRuleContexts(TypeParametersContext.class);
		}
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public TypeParametersContext typeParameters(int i) {
			return getRuleContext(TypeParametersContext.class,i);
		}
		public LambdaFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterLambdaFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitLambdaFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitLambdaFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaFunctionContext lambdaFunction() throws RecognitionException {
		LambdaFunctionContext _localctx = new LambdaFunctionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_lambdaFunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(883); match(Declaration_fun);
			setState(885);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(884); typeParameters();
				}
				break;
			}
			setState(891);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(887); type();
				setState(888); match(DOT);
				}
				break;

			case 2:
				{
				setState(890); annotations();
				}
				break;
			}
			setState(894);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(893); typeParameters();
				}
			}

			setState(896); valueParameters();
			setState(899);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(897); match(COLON);
				setState(898); type();
				}
				break;
			}
			setState(901); typeConstraints();
			setState(903);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(902); functionBody();
				}
				break;
			}
			setState(908);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(905); match(SEMI);
					}
					} 
				}
				setState(910);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_statements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(911); match(SEMI);
					}
					} 
				}
				setState(916);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			}
			setState(930);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << OPEN_BLOCK) | (1L << HexadecimalLiteral) | (1L << CharacterLiteral) | (1L << TRIPLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << PACKAGE) | (1L << IMPORT) | (1L << BRACE_OPEN) | (1L << REFERENCE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << OP_PLUS) | (1L << OP_MUNUS) | (1L << OP_IN) | (1L << OP_DECREMENT) | (1L << OP_INCREMENT) | (1L << OP_NOT) | (1L << KEYWORD_val) | (1L << KEYWORD_vararg))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (HierarchyModifier_abstract - 69)) | (1L << (HierarchyModifier_open - 69)) | (1L << (HierarchyModifier_final - 69)) | (1L << (HierarchyModifier_override - 69)) | (1L << (KeyWordModifier_operator - 69)) | (1L << (KeyWordModifier_infix - 69)) | (1L << (KeyWordModifier_inline - 69)) | (1L << (ClassModifier_enum - 69)) | (1L << (ClassModifier_annotation - 69)) | (1L << (ClassModifier_data - 69)) | (1L << (ClassModifier_sealed - 69)) | (1L << (AccessModifier_private - 69)) | (1L << (AccessModifier_protected - 69)) | (1L << (AccessModifier_public - 69)) | (1L << (AccessModifier_internal - 69)) | (1L << (Modifier_const - 69)) | (1L << (VarianceAnnotation_out - 69)) | (1L << (DOG - 69)) | (1L << (Jump_throw - 69)) | (1L << (Jump_continue - 69)) | (1L << (Jump_return - 69)) | (1L << (Jump_break - 69)) | (1L << (ConstructorDelegationCall_this - 69)) | (1L << (ConstructorDelegationCall_super - 69)) | (1L << (Declaration_class - 69)) | (1L << (Declaration_interface - 69)) | (1L << (Declaration_object - 69)) | (1L << (Declaration_companion - 69)) | (1L << (Declaration_fun - 69)) | (1L << (Declaration_init - 69)) | (1L << (CF_if - 69)) | (1L << (CF_when - 69)) | (1L << (CF_while - 69)) | (1L << (CF_for - 69)) | (1L << (CF_do - 69)) | (1L << (CF_try - 69)) | (1L << (BAX - 69)) | (1L << (SimpleName - 69)))) != 0)) {
				{
				setState(917); statement();
				setState(927);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(921);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SEMI) {
							{
							{
							setState(918); match(SEMI);
							}
							}
							setState(923);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(924); statement();
						}
						} 
					}
					setState(929);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				}
				}
			}

			setState(935);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(932); match(SEMI);
				}
				}
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_functionBody);
		try {
			setState(941);
			switch (_input.LA(1)) {
			case OPEN_BLOCK:
				enterOuterAlt(_localctx, 1);
				{
				setState(938); block();
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(939); match(EQ);
				setState(940); expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943); match(OPEN_BLOCK);
			setState(944); statements();
			setState(945); match(CLOSE_BLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnonymousInitializerContext extends ParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AnonymousInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAnonymousInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAnonymousInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAnonymousInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousInitializerContext anonymousInitializer() throws RecognitionException {
		AnonymousInitializerContext _localctx = new AnonymousInitializerContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_anonymousInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947); match(Declaration_init);
			setState(948); block();
			setState(952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(949); match(SEMI);
				}
				}
				setState(954);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumClassBodyContext extends ParserRuleContext {
		public EnumEntriesContext enumEntries() {
			return getRuleContext(EnumEntriesContext.class,0);
		}
		public MembersContext members() {
			return getRuleContext(MembersContext.class,0);
		}
		public EnumClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumClassBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterEnumClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitEnumClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitEnumClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumClassBodyContext enumClassBody() throws RecognitionException {
		EnumClassBodyContext _localctx = new EnumClassBodyContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_enumClassBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955); match(OPEN_BLOCK);
			setState(956); enumEntries();
			setState(959);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(957); match(SEMI);
				setState(958); members();
				}
			}

			setState(961); match(CLOSE_BLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumEntriesContext extends ParserRuleContext {
		public EnumEntryContext enumEntry(int i) {
			return getRuleContext(EnumEntryContext.class,i);
		}
		public List<EnumEntryContext> enumEntry() {
			return getRuleContexts(EnumEntryContext.class);
		}
		public EnumEntriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumEntries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterEnumEntries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitEnumEntries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitEnumEntries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumEntriesContext enumEntries() throws RecognitionException {
		EnumEntriesContext _localctx = new EnumEntriesContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_enumEntries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_IN || _la==KEYWORD_vararg || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (HierarchyModifier_abstract - 69)) | (1L << (HierarchyModifier_open - 69)) | (1L << (HierarchyModifier_final - 69)) | (1L << (HierarchyModifier_override - 69)) | (1L << (KeyWordModifier_operator - 69)) | (1L << (KeyWordModifier_infix - 69)) | (1L << (KeyWordModifier_inline - 69)) | (1L << (ClassModifier_enum - 69)) | (1L << (ClassModifier_annotation - 69)) | (1L << (ClassModifier_data - 69)) | (1L << (ClassModifier_sealed - 69)) | (1L << (AccessModifier_private - 69)) | (1L << (AccessModifier_protected - 69)) | (1L << (AccessModifier_public - 69)) | (1L << (AccessModifier_internal - 69)) | (1L << (Modifier_const - 69)) | (1L << (VarianceAnnotation_out - 69)) | (1L << (DOG - 69)) | (1L << (SimpleName - 69)))) != 0)) {
				{
				{
				setState(963); enumEntry();
				setState(965);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(964); match(COMMA);
					}
				}

				}
				}
				setState(971);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumEntryContext extends ParserRuleContext {
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public ConstructorInvocationContext constructorInvocation() {
			return getRuleContext(ConstructorInvocationContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode SimpleName() { return getToken(KotlinParser.SimpleName, 0); }
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public EnumEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterEnumEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitEnumEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitEnumEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumEntryContext enumEntry() throws RecognitionException {
		EnumEntryContext _localctx = new EnumEntryContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_enumEntry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972); modifiers();
			setState(973); match(SimpleName);
			setState(980);
			switch (_input.LA(1)) {
			case COLON:
				{
				{
				setState(974); match(COLON);
				setState(976);
				_la = _input.LA(1);
				if (_la==DOG) {
					{
					setState(975); annotations();
					}
				}

				setState(978); constructorInvocation();
				}
				}
				break;
			case BRACE_OPEN:
				{
				setState(979); valueArguments();
				}
				break;
			case SEMI:
			case OPEN_BLOCK:
			case CLOSE_BLOCK:
			case COMMA:
			case OP_IN:
			case KEYWORD_vararg:
			case HierarchyModifier_abstract:
			case HierarchyModifier_open:
			case HierarchyModifier_final:
			case HierarchyModifier_override:
			case KeyWordModifier_operator:
			case KeyWordModifier_infix:
			case KeyWordModifier_inline:
			case ClassModifier_enum:
			case ClassModifier_annotation:
			case ClassModifier_data:
			case ClassModifier_sealed:
			case AccessModifier_private:
			case AccessModifier_protected:
			case AccessModifier_public:
			case AccessModifier_internal:
			case Modifier_const:
			case VarianceAnnotation_out:
			case DOG:
			case SimpleName:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(982); classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfExpressionContext extends ParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public IfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterIfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitIfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitIfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExpressionContext ifExpression() throws RecognitionException {
		IfExpressionContext _localctx = new IfExpressionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_ifExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(984); match(CF_if);
			setState(985); match(BRACE_OPEN);
			setState(986); expression();
			setState(987); match(BRACE_CLOSE);
			setState(988); expression();
			setState(992);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(989); match(SEMI);
					}
					} 
				}
				setState(994);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			}
			setState(997);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(995); match(CF_else);
				setState(996); expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryExpressionContext extends ParserRuleContext {
		public CatchBlockContext catchBlock(int i) {
			return getRuleContext(CatchBlockContext.class,i);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchBlockContext> catchBlock() {
			return getRuleContexts(CatchBlockContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitTryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryExpressionContext tryExpression() throws RecognitionException {
		TryExpressionContext _localctx = new TryExpressionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_tryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999); match(CF_try);
			setState(1000); block();
			setState(1004);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CF_catch) {
				{
				{
				setState(1001); catchBlock();
				}
				}
				setState(1006);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1008);
			_la = _input.LA(1);
			if (_la==CF_FINALLY) {
				{
				setState(1007); finallyBlock();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchBlockContext extends ParserRuleContext {
		public TerminalNode SimpleName() { return getToken(KotlinParser.SimpleName, 0); }
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterCatchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitCatchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitCatchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchBlockContext catchBlock() throws RecognitionException {
		CatchBlockContext _localctx = new CatchBlockContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_catchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010); match(CF_catch);
			setState(1011); match(BRACE_OPEN);
			setState(1013);
			_la = _input.LA(1);
			if (_la==DOG) {
				{
				setState(1012); annotations();
				}
			}

			setState(1015); match(SimpleName);
			setState(1016); match(COLON);
			setState(1017); userType();
			setState(1018); match(BRACE_CLOSE);
			setState(1019); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFinallyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021); match(CF_FINALLY);
			setState(1022); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public DoWhileLoopContext doWhileLoop() {
			return getRuleContext(DoWhileLoopContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_loop);
		try {
			setState(1027);
			switch (_input.LA(1)) {
			case CF_for:
				enterOuterAlt(_localctx, 1);
				{
				setState(1024); forLoop();
				}
				break;
			case CF_while:
				enterOuterAlt(_localctx, 2);
				{
				setState(1025); whileLoop();
				}
				break;
			case CF_do:
				enterOuterAlt(_localctx, 3);
				{
				setState(1026); doWhileLoop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForLoopContext extends ParserRuleContext {
		public MultipleVariableDeclarationsContext multipleVariableDeclarations() {
			return getRuleContext(MultipleVariableDeclarationsContext.class,0);
		}
		public VariableDeclarationEntryContext variableDeclarationEntry() {
			return getRuleContext(VariableDeclarationEntryContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029); match(CF_for);
			setState(1030); match(BRACE_OPEN);
			setState(1032);
			_la = _input.LA(1);
			if (_la==DOG) {
				{
				setState(1031); annotations();
				}
			}

			setState(1036);
			switch (_input.LA(1)) {
			case BRACE_OPEN:
				{
				setState(1034); multipleVariableDeclarations();
				}
				break;
			case SimpleName:
				{
				setState(1035); variableDeclarationEntry();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1038); match(OP_IN);
			setState(1039); expression();
			setState(1040); match(BRACE_CLOSE);
			setState(1041); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileLoopContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043); match(CF_while);
			setState(1044); match(BRACE_OPEN);
			setState(1045); expression();
			setState(1046); match(BRACE_CLOSE);
			setState(1047); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileLoopContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public DoWhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterDoWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitDoWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitDoWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileLoopContext doWhileLoop() throws RecognitionException {
		DoWhileLoopContext _localctx = new DoWhileLoopContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_doWhileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049); match(CF_do);
			setState(1050); expression();
			setState(1051); match(CF_while);
			setState(1052); match(BRACE_OPEN);
			setState(1053); expression();
			setState(1054); match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public DisjunctionContext disjunction(int i) {
			return getRuleContext(DisjunctionContext.class,i);
		}
		public AssignmentOperatorContext assignmentOperator(int i) {
			return getRuleContext(AssignmentOperatorContext.class,i);
		}
		public List<AssignmentOperatorContext> assignmentOperator() {
			return getRuleContexts(AssignmentOperatorContext.class);
		}
		public List<DisjunctionContext> disjunction() {
			return getRuleContexts(DisjunctionContext.class);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1056); disjunction();
			setState(1062);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1057); assignmentOperator();
					setState(1058); disjunction();
					}
					} 
				}
				setState(1064);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisjunctionContext extends ParserRuleContext {
		public List<ConjunctionContext> conjunction() {
			return getRuleContexts(ConjunctionContext.class);
		}
		public ConjunctionContext conjunction(int i) {
			return getRuleContext(ConjunctionContext.class,i);
		}
		public DisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterDisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitDisjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitDisjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisjunctionContext disjunction() throws RecognitionException {
		DisjunctionContext _localctx = new DisjunctionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_disjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1065); conjunction();
			setState(1070);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1066); match(DISJ);
					setState(1067); conjunction();
					}
					} 
				}
				setState(1072);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConjunctionContext extends ParserRuleContext {
		public List<EqualityComparisonContext> equalityComparison() {
			return getRuleContexts(EqualityComparisonContext.class);
		}
		public EqualityComparisonContext equalityComparison(int i) {
			return getRuleContext(EqualityComparisonContext.class,i);
		}
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitConjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitConjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_conjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1073); equalityComparison();
			setState(1078);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1074); match(CONJ);
					setState(1075); equalityComparison();
					}
					} 
				}
				setState(1080);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityComparisonContext extends ParserRuleContext {
		public List<EqualityOperationContext> equalityOperation() {
			return getRuleContexts(EqualityOperationContext.class);
		}
		public EqualityOperationContext equalityOperation(int i) {
			return getRuleContext(EqualityOperationContext.class,i);
		}
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public EqualityComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityComparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterEqualityComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitEqualityComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitEqualityComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityComparisonContext equalityComparison() throws RecognitionException {
		EqualityComparisonContext _localctx = new EqualityComparisonContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_equalityComparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1081); comparison();
			setState(1087);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1082); equalityOperation();
					setState(1083); comparison();
					}
					} 
				}
				setState(1089);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public List<NamedInfixContext> namedInfix() {
			return getRuleContexts(NamedInfixContext.class);
		}
		public NamedInfixContext namedInfix(int i) {
			return getRuleContext(NamedInfixContext.class,i);
		}
		public ComparisonOperationContext comparisonOperation(int i) {
			return getRuleContext(ComparisonOperationContext.class,i);
		}
		public List<ComparisonOperationContext> comparisonOperation() {
			return getRuleContexts(ComparisonOperationContext.class);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_comparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1090); namedInfix();
			setState(1096);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1091); comparisonOperation();
					setState(1092); namedInfix();
					}
					} 
				}
				setState(1098);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedInfixContext extends ParserRuleContext {
		public List<InOperationContext> inOperation() {
			return getRuleContexts(InOperationContext.class);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ElvisExpressionContext elvisExpression(int i) {
			return getRuleContext(ElvisExpressionContext.class,i);
		}
		public InOperationContext inOperation(int i) {
			return getRuleContext(InOperationContext.class,i);
		}
		public List<ElvisExpressionContext> elvisExpression() {
			return getRuleContexts(ElvisExpressionContext.class);
		}
		public IsOperationContext isOperation() {
			return getRuleContext(IsOperationContext.class,0);
		}
		public NamedInfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedInfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterNamedInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitNamedInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitNamedInfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedInfixContext namedInfix() throws RecognitionException {
		NamedInfixContext _localctx = new NamedInfixContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_namedInfix);
		try {
			int _alt;
			setState(1114);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1099); elvisExpression();
				setState(1105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1100); inOperation();
						setState(1101); elvisExpression();
						}
						} 
					}
					setState(1107);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1108); elvisExpression();
				setState(1112);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(1109); isOperation();
					setState(1110); type();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElvisExpressionContext extends ParserRuleContext {
		public InfixFunctionCallContext infixFunctionCall(int i) {
			return getRuleContext(InfixFunctionCallContext.class,i);
		}
		public List<InfixFunctionCallContext> infixFunctionCall() {
			return getRuleContexts(InfixFunctionCallContext.class);
		}
		public ElvisExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elvisExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterElvisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitElvisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitElvisExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElvisExpressionContext elvisExpression() throws RecognitionException {
		ElvisExpressionContext _localctx = new ElvisExpressionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_elvisExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1116); infixFunctionCall();
			setState(1121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1117); match(ELVIS);
					setState(1118); infixFunctionCall();
					}
					} 
				}
				setState(1123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfixFunctionCallContext extends ParserRuleContext {
		public RangeExpressionContext rangeExpression(int i) {
			return getRuleContext(RangeExpressionContext.class,i);
		}
		public List<TerminalNode> SimpleName() { return getTokens(KotlinParser.SimpleName); }
		public TerminalNode SimpleName(int i) {
			return getToken(KotlinParser.SimpleName, i);
		}
		public List<RangeExpressionContext> rangeExpression() {
			return getRuleContexts(RangeExpressionContext.class);
		}
		public InfixFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixFunctionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterInfixFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitInfixFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitInfixFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixFunctionCallContext infixFunctionCall() throws RecognitionException {
		InfixFunctionCallContext _localctx = new InfixFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_infixFunctionCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1124); rangeExpression();
			setState(1129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1125); match(SimpleName);
					setState(1126); rangeExpression();
					}
					} 
				}
				setState(1131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public RangeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterRangeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitRangeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitRangeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeExpressionContext rangeExpression() throws RecognitionException {
		RangeExpressionContext _localctx = new RangeExpressionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_rangeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1132); additiveExpression();
			setState(1137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1133); match(RANGE);
					setState(1134); additiveExpression();
					}
					} 
				}
				setState(1139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public AdditiveOperationContext additiveOperation(int i) {
			return getRuleContext(AdditiveOperationContext.class,i);
		}
		public List<AdditiveOperationContext> additiveOperation() {
			return getRuleContexts(AdditiveOperationContext.class);
		}
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1140); multiplicativeExpression();
			setState(1146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1141); additiveOperation();
					setState(1142); multiplicativeExpression();
					}
					} 
				}
				setState(1148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<MultiplicativeOperationContext> multiplicativeOperation() {
			return getRuleContexts(MultiplicativeOperationContext.class);
		}
		public TypeRHSContext typeRHS(int i) {
			return getRuleContext(TypeRHSContext.class,i);
		}
		public MultiplicativeOperationContext multiplicativeOperation(int i) {
			return getRuleContext(MultiplicativeOperationContext.class,i);
		}
		public List<TypeRHSContext> typeRHS() {
			return getRuleContexts(TypeRHSContext.class);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1149); typeRHS();
			setState(1155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1150); multiplicativeOperation();
					setState(1151); typeRHS();
					}
					} 
				}
				setState(1157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeRHSContext extends ParserRuleContext {
		public List<TypeOperationContext> typeOperation() {
			return getRuleContexts(TypeOperationContext.class);
		}
		public TypeOperationContext typeOperation(int i) {
			return getRuleContext(TypeOperationContext.class,i);
		}
		public PrefixUnaryExpressionContext prefixUnaryExpression(int i) {
			return getRuleContext(PrefixUnaryExpressionContext.class,i);
		}
		public List<PrefixUnaryExpressionContext> prefixUnaryExpression() {
			return getRuleContexts(PrefixUnaryExpressionContext.class);
		}
		public TypeRHSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeRHS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeRHS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeRHS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitTypeRHS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeRHSContext typeRHS() throws RecognitionException {
		TypeRHSContext _localctx = new TypeRHSContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_typeRHS);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1158); prefixUnaryExpression();
			setState(1164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1159); typeOperation();
					setState(1160); prefixUnaryExpression();
					}
					} 
				}
				setState(1166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixUnaryExpressionContext extends ParserRuleContext {
		public PrefixUnaryOperationContext prefixUnaryOperation(int i) {
			return getRuleContext(PrefixUnaryOperationContext.class,i);
		}
		public PostfixUnaryExpressionContext postfixUnaryExpression() {
			return getRuleContext(PostfixUnaryExpressionContext.class,0);
		}
		public List<PrefixUnaryOperationContext> prefixUnaryOperation() {
			return getRuleContexts(PrefixUnaryOperationContext.class);
		}
		public PrefixUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPrefixUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPrefixUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitPrefixUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixUnaryExpressionContext prefixUnaryExpression() throws RecognitionException {
		PrefixUnaryExpressionContext _localctx = new PrefixUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_prefixUnaryExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1167); prefixUnaryOperation();
					}
					} 
				}
				setState(1172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			}
			setState(1173); postfixUnaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixUnaryExpressionContext extends ParserRuleContext {
		public CallableReferenceContext callableReference() {
			return getRuleContext(CallableReferenceContext.class,0);
		}
		public AtomicExpressionContext atomicExpression() {
			return getRuleContext(AtomicExpressionContext.class,0);
		}
		public CallSuffixContext callSuffix() {
			return getRuleContext(CallSuffixContext.class,0);
		}
		public LastArgLambdaContext lastArgLambda() {
			return getRuleContext(LastArgLambdaContext.class,0);
		}
		public List<PostfixUnaryOperationContext> postfixUnaryOperation() {
			return getRuleContexts(PostfixUnaryOperationContext.class);
		}
		public PostfixUnaryOperationContext postfixUnaryOperation(int i) {
			return getRuleContext(PostfixUnaryOperationContext.class,i);
		}
		public PostfixUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPostfixUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPostfixUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitPostfixUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixUnaryExpressionContext postfixUnaryExpression() throws RecognitionException {
		PostfixUnaryExpressionContext _localctx = new PostfixUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_postfixUnaryExpression);
		try {
			int _alt;
			setState(1194);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1175); atomicExpression();
				setState(1176); callSuffix();
				setState(1178);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1177); lastArgLambda();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1180); atomicExpression();
				setState(1184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1181); postfixUnaryOperation();
						}
						} 
					}
					setState(1186);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1187); callableReference();
				setState(1191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1188); postfixUnaryOperation();
						}
						} 
					}
					setState(1193);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallableReferenceContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public CallableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterCallableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitCallableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitCallableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallableReferenceContext callableReference() throws RecognitionException {
		CallableReferenceContext _localctx = new CallableReferenceContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_callableReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			switch (_input.LA(1)) {
			case PACKAGE:
			case REFERENCE:
			case SimpleName:
				{
				setState(1203);
				_la = _input.LA(1);
				if (_la==PACKAGE || _la==SimpleName) {
					{
					setState(1196); userType();
					setState(1200);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Q) {
						{
						{
						setState(1197); match(Q);
						}
						}
						setState(1202);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case ConstructorDelegationCall_this:
				{
				setState(1205); match(ConstructorDelegationCall_this);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1208); match(REFERENCE);
			setState(1211);
			switch (_input.LA(1)) {
			case IMPORT:
			case ClassModifier_enum:
			case ClassModifier_data:
			case AccessModifier_private:
			case AccessModifier_protected:
			case AccessModifier_public:
			case AccessModifier_internal:
			case Modifier_const:
			case Declaration_companion:
			case Declaration_init:
			case SimpleName:
				{
				setState(1209); identifier();
				}
				break;
			case Declaration_class:
				{
				setState(1210); match(Declaration_class);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1214);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1213); typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode SimpleName() { return getToken(KotlinParser.SimpleName, 0); }
		public TerminalNode Declaration_companion() { return getToken(KotlinParser.Declaration_companion, 0); }
		public TerminalNode ClassModifier_enum() { return getToken(KotlinParser.ClassModifier_enum, 0); }
		public TerminalNode IMPORT() { return getToken(KotlinParser.IMPORT, 0); }
		public TerminalNode Declaration_init() { return getToken(KotlinParser.Declaration_init, 0); }
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public TerminalNode ClassModifier_data() { return getToken(KotlinParser.ClassModifier_data, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_identifier);
		try {
			setState(1223);
			switch (_input.LA(1)) {
			case SimpleName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1216); match(SimpleName);
				}
				break;
			case ClassModifier_enum:
				enterOuterAlt(_localctx, 2);
				{
				setState(1217); match(ClassModifier_enum);
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1218); match(IMPORT);
				}
				break;
			case Declaration_companion:
				enterOuterAlt(_localctx, 4);
				{
				setState(1219); match(Declaration_companion);
				}
				break;
			case Declaration_init:
				enterOuterAlt(_localctx, 5);
				{
				setState(1220); match(Declaration_init);
				}
				break;
			case AccessModifier_private:
			case AccessModifier_protected:
			case AccessModifier_public:
			case AccessModifier_internal:
			case Modifier_const:
				enterOuterAlt(_localctx, 6);
				{
				setState(1221); accessModifier();
				}
				break;
			case ClassModifier_data:
				enterOuterAlt(_localctx, 7);
				{
				setState(1222); match(ClassModifier_data);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> SINLE_QUOTE_EXPRESSION_START() { return getTokens(KotlinParser.SINLE_QUOTE_EXPRESSION_START); }
		public TerminalNode SINLE_QUOTE_ESCAPED_CHAR(int i) {
			return getToken(KotlinParser.SINLE_QUOTE_ESCAPED_CHAR, i);
		}
		public List<TerminalNode> CLOSE_BLOCK() { return getTokens(KotlinParser.CLOSE_BLOCK); }
		public TerminalNode MULTILINE_QUOTE_CLOSE(int i) {
			return getToken(KotlinParser.MULTILINE_QUOTE_CLOSE, i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> MULTILINE_QUOTE_REF() { return getTokens(KotlinParser.MULTILINE_QUOTE_REF); }
		public TerminalNode TRIPLE_QUOTE() { return getToken(KotlinParser.TRIPLE_QUOTE, 0); }
		public TerminalNode SINGLE_QUOTE_REF(int i) {
			return getToken(KotlinParser.SINGLE_QUOTE_REF, i);
		}
		public List<TerminalNode> MULTILINE_QUOTE_CLOSE() { return getTokens(KotlinParser.MULTILINE_QUOTE_CLOSE); }
		public TerminalNode SINLE_QUOTE_EXPRESSION_START(int i) {
			return getToken(KotlinParser.SINLE_QUOTE_EXPRESSION_START, i);
		}
		public List<TerminalNode> MULTILINE_QUOTE_EXPRESSION_START() { return getTokens(KotlinParser.MULTILINE_QUOTE_EXPRESSION_START); }
		public TerminalNode MULTILINE_QUOTE_REF(int i) {
			return getToken(KotlinParser.MULTILINE_QUOTE_REF, i);
		}
		public TerminalNode CLOSE_BLOCK(int i) {
			return getToken(KotlinParser.CLOSE_BLOCK, i);
		}
		public TerminalNode MULTILINE_QUOTE_EXPRESSION_START(int i) {
			return getToken(KotlinParser.MULTILINE_QUOTE_EXPRESSION_START, i);
		}
		public TerminalNode SINLE_QUOTE_CLOSE(int i) {
			return getToken(KotlinParser.SINLE_QUOTE_CLOSE, i);
		}
		public List<TerminalNode> SINLE_QUOTE_CLOSE() { return getTokens(KotlinParser.SINLE_QUOTE_CLOSE); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public List<TerminalNode> SINLE_QUOTE_ESCAPED_CHAR() { return getTokens(KotlinParser.SINLE_QUOTE_ESCAPED_CHAR); }
		public List<TerminalNode> SINGLE_QUOTE_REF() { return getTokens(KotlinParser.SINGLE_QUOTE_REF); }
		public TerminalNode SINGLE_QUOTE() { return getToken(KotlinParser.SINGLE_QUOTE, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_stringLiteral);
		int _la;
		try {
			setState(1252);
			switch (_input.LA(1)) {
			case SINGLE_QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1225); match(SINGLE_QUOTE);
				setState(1235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTILINE_COMMENT) | (1L << SINGLELINE_COMMENT) | (1L << WHITESPACE) | (1L << IntegerLiteral) | (1L << SEMI) | (1L << OPEN_BLOCK) | (1L << CLOSE_BLOCK) | (1L << HexadecimalLiteral) | (1L << CharacterLiteral) | (1L << TRIPLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << PACKAGE) | (1L << IMPORT) | (1L << DOT) | (1L << STAR) | (1L << COMMA) | (1L << LT) | (1L << LTE) | (1L << GT) | (1L << GTE) | (1L << EQ) | (1L << EQ_EQ) | (1L << EQ_EQ_EQ) | (1L << NEQ) | (1L << COLON) | (1L << BRACE_OPEN) | (1L << BRACE_CLOSE) | (1L << Q) | (1L << DA) | (1L << DISJ) | (1L << CONJ) | (1L << ELVIS) | (1L << LONG_RANGE) | (1L << RANGE) | (1L << REFERENCE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << OP_ASTERISK) | (1L << OP_DIV) | (1L << OP_MOD) | (1L << OP_PLUS) | (1L << OP_MUNUS) | (1L << OP_IN) | (1L << OP_NOT_IN) | (1L << OP_IS) | (1L << OP_NOT_IS) | (1L << OP_AS) | (1L << OP_AS_SAFE) | (1L << OP_PLUS_ASSIGN) | (1L << OP_MINUS_ASSIGN) | (1L << OP_MULT_ASSIGN) | (1L << OP_DIV_ASSIGN) | (1L << OP_MOD_ASSIGN) | (1L << OP_DECREMENT) | (1L << OP_INCREMENT) | (1L << OP_NULL_ASSERT) | (1L << OP_NOT) | (1L << SQ_OPEN) | (1L << SQ_CLOSE) | (1L << KEYWORD_val) | (1L << KEYWORD_var) | (1L << KEYWORD_vararg))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KEYWORD_by - 64)) | (1L << (KEYWORD_dynamic - 64)) | (1L << (KEYWORD_where - 64)) | (1L << (GET - 64)) | (1L << (SET - 64)) | (1L << (HierarchyModifier_abstract - 64)) | (1L << (HierarchyModifier_open - 64)) | (1L << (HierarchyModifier_final - 64)) | (1L << (HierarchyModifier_override - 64)) | (1L << (KeyWordModifier_operator - 64)) | (1L << (KeyWordModifier_infix - 64)) | (1L << (KeyWordModifier_inline - 64)) | (1L << (ClassModifier_enum - 64)) | (1L << (ClassModifier_annotation - 64)) | (1L << (ClassModifier_data - 64)) | (1L << (ClassModifier_sealed - 64)) | (1L << (AccessModifier_private - 64)) | (1L << (AccessModifier_protected - 64)) | (1L << (AccessModifier_public - 64)) | (1L << (AccessModifier_internal - 64)) | (1L << (Modifier_const - 64)) | (1L << (VarianceAnnotation_out - 64)) | (1L << (DOG - 64)) | (1L << (AnnotationUseSiteTarget_file - 64)) | (1L << (AnnotationUseSiteTarget_field - 64)) | (1L << (AnnotationUseSiteTarget_property - 64)) | (1L << (AnnotationUseSiteTarget_param - 64)) | (1L << (AnnotationUseSiteTarget_sparam - 64)) | (1L << (Jump_throw - 64)) | (1L << (Jump_continue - 64)) | (1L << (Jump_return - 64)) | (1L << (Jump_break - 64)) | (1L << (KEYWORD_constructor - 64)) | (1L << (ConstructorDelegationCall_this - 64)) | (1L << (ConstructorDelegationCall_super - 64)) | (1L << (Declaration_class - 64)) | (1L << (Declaration_interface - 64)) | (1L << (Declaration_object - 64)) | (1L << (Declaration_companion - 64)) | (1L << (Declaration_fun - 64)) | (1L << (Declaration_typealias - 64)) | (1L << (Declaration_init - 64)) | (1L << (CF_if - 64)) | (1L << (CF_else - 64)) | (1L << (CF_when - 64)) | (1L << (CF_while - 64)) | (1L << (CF_for - 64)) | (1L << (CF_do - 64)) | (1L << (CF_try - 64)) | (1L << (CF_catch - 64)) | (1L << (CF_FINALLY - 64)) | (1L << (BAX - 64)) | (1L << (SimpleName - 64)) | (1L << (SINLE_QUOTE_WHITESPACE - 64)) | (1L << (SINGLE_TEXT - 64)) | (1L << (SINLE_QUOTE_ESCAPED_CHAR - 64)) | (1L << (SINLE_QUOTE_EXPRESSION_START - 64)) | (1L << (SINGLE_QUOTE_REF - 64)) | (1L << (MULTILINE_QUOTE_TEXT - 64)) | (1L << (MULTILINE_QUOTE_CLOSE - 64)) | (1L << (MULTILINE_QUOTES - 64)) | (1L << (MULTILINE_QUOTE_EXPRESSION_START - 64)) | (1L << (MULTILINE_QUOTE_REF - 64)))) != 0)) {
					{
					setState(1233);
					switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
					case 1:
						{
						setState(1226); match(SINLE_QUOTE_ESCAPED_CHAR);
						}
						break;

					case 2:
						{
						setState(1227); match(SINLE_QUOTE_EXPRESSION_START);
						setState(1228); expression();
						setState(1229); match(CLOSE_BLOCK);
						}
						break;

					case 3:
						{
						setState(1231); match(SINGLE_QUOTE_REF);
						}
						break;

					case 4:
						{
						setState(1232);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==SINLE_QUOTE_CLOSE) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					}
					}
					setState(1237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1238); match(SINLE_QUOTE_CLOSE);
				}
				break;
			case TRIPLE_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1239); match(TRIPLE_QUOTE);
				setState(1248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTILINE_COMMENT) | (1L << SINGLELINE_COMMENT) | (1L << WHITESPACE) | (1L << IntegerLiteral) | (1L << SEMI) | (1L << OPEN_BLOCK) | (1L << CLOSE_BLOCK) | (1L << HexadecimalLiteral) | (1L << CharacterLiteral) | (1L << TRIPLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << PACKAGE) | (1L << IMPORT) | (1L << DOT) | (1L << STAR) | (1L << COMMA) | (1L << LT) | (1L << LTE) | (1L << GT) | (1L << GTE) | (1L << EQ) | (1L << EQ_EQ) | (1L << EQ_EQ_EQ) | (1L << NEQ) | (1L << COLON) | (1L << BRACE_OPEN) | (1L << BRACE_CLOSE) | (1L << Q) | (1L << DA) | (1L << DISJ) | (1L << CONJ) | (1L << ELVIS) | (1L << LONG_RANGE) | (1L << RANGE) | (1L << REFERENCE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << OP_ASTERISK) | (1L << OP_DIV) | (1L << OP_MOD) | (1L << OP_PLUS) | (1L << OP_MUNUS) | (1L << OP_IN) | (1L << OP_NOT_IN) | (1L << OP_IS) | (1L << OP_NOT_IS) | (1L << OP_AS) | (1L << OP_AS_SAFE) | (1L << OP_PLUS_ASSIGN) | (1L << OP_MINUS_ASSIGN) | (1L << OP_MULT_ASSIGN) | (1L << OP_DIV_ASSIGN) | (1L << OP_MOD_ASSIGN) | (1L << OP_DECREMENT) | (1L << OP_INCREMENT) | (1L << OP_NULL_ASSERT) | (1L << OP_NOT) | (1L << SQ_OPEN) | (1L << SQ_CLOSE) | (1L << KEYWORD_val) | (1L << KEYWORD_var) | (1L << KEYWORD_vararg))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KEYWORD_by - 64)) | (1L << (KEYWORD_dynamic - 64)) | (1L << (KEYWORD_where - 64)) | (1L << (GET - 64)) | (1L << (SET - 64)) | (1L << (HierarchyModifier_abstract - 64)) | (1L << (HierarchyModifier_open - 64)) | (1L << (HierarchyModifier_final - 64)) | (1L << (HierarchyModifier_override - 64)) | (1L << (KeyWordModifier_operator - 64)) | (1L << (KeyWordModifier_infix - 64)) | (1L << (KeyWordModifier_inline - 64)) | (1L << (ClassModifier_enum - 64)) | (1L << (ClassModifier_annotation - 64)) | (1L << (ClassModifier_data - 64)) | (1L << (ClassModifier_sealed - 64)) | (1L << (AccessModifier_private - 64)) | (1L << (AccessModifier_protected - 64)) | (1L << (AccessModifier_public - 64)) | (1L << (AccessModifier_internal - 64)) | (1L << (Modifier_const - 64)) | (1L << (VarianceAnnotation_out - 64)) | (1L << (DOG - 64)) | (1L << (AnnotationUseSiteTarget_file - 64)) | (1L << (AnnotationUseSiteTarget_field - 64)) | (1L << (AnnotationUseSiteTarget_property - 64)) | (1L << (AnnotationUseSiteTarget_param - 64)) | (1L << (AnnotationUseSiteTarget_sparam - 64)) | (1L << (Jump_throw - 64)) | (1L << (Jump_continue - 64)) | (1L << (Jump_return - 64)) | (1L << (Jump_break - 64)) | (1L << (KEYWORD_constructor - 64)) | (1L << (ConstructorDelegationCall_this - 64)) | (1L << (ConstructorDelegationCall_super - 64)) | (1L << (Declaration_class - 64)) | (1L << (Declaration_interface - 64)) | (1L << (Declaration_object - 64)) | (1L << (Declaration_companion - 64)) | (1L << (Declaration_fun - 64)) | (1L << (Declaration_typealias - 64)) | (1L << (Declaration_init - 64)) | (1L << (CF_if - 64)) | (1L << (CF_else - 64)) | (1L << (CF_when - 64)) | (1L << (CF_while - 64)) | (1L << (CF_for - 64)) | (1L << (CF_do - 64)) | (1L << (CF_try - 64)) | (1L << (CF_catch - 64)) | (1L << (CF_FINALLY - 64)) | (1L << (BAX - 64)) | (1L << (SimpleName - 64)) | (1L << (SINLE_QUOTE_WHITESPACE - 64)) | (1L << (SINGLE_TEXT - 64)) | (1L << (SINLE_QUOTE_CLOSE - 64)) | (1L << (SINLE_QUOTE_ESCAPED_CHAR - 64)) | (1L << (SINLE_QUOTE_EXPRESSION_START - 64)) | (1L << (SINGLE_QUOTE_REF - 64)) | (1L << (MULTILINE_QUOTE_TEXT - 64)) | (1L << (MULTILINE_QUOTES - 64)) | (1L << (MULTILINE_QUOTE_EXPRESSION_START - 64)) | (1L << (MULTILINE_QUOTE_REF - 64)))) != 0)) {
					{
					setState(1246);
					switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
					case 1:
						{
						setState(1240); match(MULTILINE_QUOTE_EXPRESSION_START);
						setState(1241); expression();
						setState(1242); match(CLOSE_BLOCK);
						}
						break;

					case 2:
						{
						setState(1244); match(MULTILINE_QUOTE_REF);
						}
						break;

					case 3:
						{
						setState(1245);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==MULTILINE_QUOTE_CLOSE) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					}
					}
					setState(1250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1251); match(MULTILINE_QUOTE_CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomicExpressionContext extends ParserRuleContext {
		public LiteralConstantContext literalConstant() {
			return getRuleContext(LiteralConstantContext.class,0);
		}
		public FunctionLiteralContext functionLiteral() {
			return getRuleContext(FunctionLiteralContext.class,0);
		}
		public WhenContext when() {
			return getRuleContext(WhenContext.class,0);
		}
		public TryExpressionContext tryExpression() {
			return getRuleContext(TryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LambdaFunctionContext lambdaFunction() {
			return getRuleContext(LambdaFunctionContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public JumpContext jump() {
			return getRuleContext(JumpContext.class,0);
		}
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LabelReferenceContext labelReference() {
			return getRuleContext(LabelReferenceContext.class,0);
		}
		public AtomicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAtomicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAtomicExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAtomicExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicExpressionContext atomicExpression() throws RecognitionException {
		AtomicExpressionContext _localctx = new AtomicExpressionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_atomicExpression);
		try {
			setState(1285);
			switch (_input.LA(1)) {
			case BRACE_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1254); match(BRACE_OPEN);
				setState(1255); expression();
				setState(1256); match(BRACE_CLOSE);
				}
				break;
			case IntegerLiteral:
			case HexadecimalLiteral:
			case CharacterLiteral:
			case TRIPLE_QUOTE:
			case SINGLE_QUOTE:
			case TRUE:
			case FALSE:
			case NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1258); literalConstant();
				}
				break;
			case OPEN_BLOCK:
				enterOuterAlt(_localctx, 3);
				{
				setState(1259); functionLiteral();
				}
				break;
			case Declaration_fun:
				enterOuterAlt(_localctx, 4);
				{
				setState(1260); lambdaFunction();
				}
				break;
			case ConstructorDelegationCall_this:
				enterOuterAlt(_localctx, 5);
				{
				setState(1261); match(ConstructorDelegationCall_this);
				setState(1263);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1262); labelReference();
					}
					break;
				}
				}
				break;
			case ConstructorDelegationCall_super:
				enterOuterAlt(_localctx, 6);
				{
				setState(1265); match(ConstructorDelegationCall_super);
				setState(1270);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1266); match(LT);
					setState(1267); type();
					setState(1268); match(GT);
					}
					break;
				}
				setState(1273);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1272); labelReference();
					}
					break;
				}
				}
				break;
			case CF_if:
				enterOuterAlt(_localctx, 7);
				{
				setState(1275); ifExpression();
				}
				break;
			case CF_when:
				enterOuterAlt(_localctx, 8);
				{
				setState(1276); when();
				}
				break;
			case CF_try:
				enterOuterAlt(_localctx, 9);
				{
				setState(1277); tryExpression();
				}
				break;
			case Declaration_object:
				enterOuterAlt(_localctx, 10);
				{
				setState(1278); objectLiteral();
				}
				break;
			case Jump_throw:
			case Jump_continue:
			case Jump_return:
			case Jump_break:
				enterOuterAlt(_localctx, 11);
				{
				setState(1279); jump();
				}
				break;
			case CF_while:
			case CF_for:
			case CF_do:
				enterOuterAlt(_localctx, 12);
				{
				setState(1280); loop();
				}
				break;
			case IMPORT:
			case ClassModifier_enum:
			case ClassModifier_data:
			case AccessModifier_private:
			case AccessModifier_protected:
			case AccessModifier_public:
			case AccessModifier_internal:
			case Modifier_const:
			case Declaration_companion:
			case Declaration_init:
			case SimpleName:
				enterOuterAlt(_localctx, 13);
				{
				setState(1281); identifier();
				}
				break;
			case BAX:
				enterOuterAlt(_localctx, 14);
				{
				setState(1282); match(BAX);
				setState(1283); identifier();
				}
				break;
			case PACKAGE:
				enterOuterAlt(_localctx, 15);
				{
				setState(1284); match(PACKAGE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralConstantContext extends ParserRuleContext {
		public TerminalNode HexadecimalLiteral() { return getToken(KotlinParser.HexadecimalLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(KotlinParser.IntegerLiteral, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode CharacterLiteral() { return getToken(KotlinParser.CharacterLiteral, 0); }
		public LiteralConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterLiteralConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitLiteralConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitLiteralConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralConstantContext literalConstant() throws RecognitionException {
		LiteralConstantContext _localctx = new LiteralConstantContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_literalConstant);
		try {
			setState(1294);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1287); match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1288); match(FALSE);
				}
				break;
			case TRIPLE_QUOTE:
			case SINGLE_QUOTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1289); stringLiteral();
				}
				break;
			case IntegerLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(1290); match(IntegerLiteral);
				}
				break;
			case HexadecimalLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(1291); match(HexadecimalLiteral);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(1292); match(CharacterLiteral);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1293); match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_declaration);
		try {
			setState(1301);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1296); functionDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1297); propertyDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1298); classDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1299); interfaceDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1300); objectDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_statement);
		try {
			setState(1305);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1303); declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1304); expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeOperationContext extends ParserRuleContext {
		public MultiplicativeOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMultiplicativeOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMultiplicativeOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitMultiplicativeOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeOperationContext multiplicativeOperation() throws RecognitionException {
		MultiplicativeOperationContext _localctx = new MultiplicativeOperationContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_multiplicativeOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1307);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << OP_DIV) | (1L << OP_MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveOperationContext extends ParserRuleContext {
		public AdditiveOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAdditiveOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAdditiveOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAdditiveOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveOperationContext additiveOperation() throws RecognitionException {
		AdditiveOperationContext _localctx = new AdditiveOperationContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_additiveOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1309);
			_la = _input.LA(1);
			if ( !(_la==OP_PLUS || _la==OP_MUNUS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InOperationContext extends ParserRuleContext {
		public TerminalNode OP_IN() { return getToken(KotlinParser.OP_IN, 0); }
		public InOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterInOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitInOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitInOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InOperationContext inOperation() throws RecognitionException {
		InOperationContext _localctx = new InOperationContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_inOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1311);
			_la = _input.LA(1);
			if ( !(_la==OP_IN || _la==OP_NOT_IN) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeOperationContext extends ParserRuleContext {
		public TerminalNode OP_AS() { return getToken(KotlinParser.OP_AS, 0); }
		public TypeOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterTypeOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitTypeOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitTypeOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeOperationContext typeOperation() throws RecognitionException {
		TypeOperationContext _localctx = new TypeOperationContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_typeOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1313);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << OP_AS) | (1L << OP_AS_SAFE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsOperationContext extends ParserRuleContext {
		public IsOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterIsOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitIsOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitIsOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsOperationContext isOperation() throws RecognitionException {
		IsOperationContext _localctx = new IsOperationContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_isOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1315);
			_la = _input.LA(1);
			if ( !(_la==OP_IS || _la==OP_NOT_IS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperationContext extends ParserRuleContext {
		public ComparisonOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterComparisonOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitComparisonOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitComparisonOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperationContext comparisonOperation() throws RecognitionException {
		ComparisonOperationContext _localctx = new ComparisonOperationContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_comparisonOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1317);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LTE) | (1L << GT) | (1L << GTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityOperationContext extends ParserRuleContext {
		public EqualityOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterEqualityOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitEqualityOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitEqualityOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityOperationContext equalityOperation() throws RecognitionException {
		EqualityOperationContext _localctx = new EqualityOperationContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_equalityOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1319);
			_la = _input.LA(1);
			if ( !(_la==EQ_EQ || _la==NEQ) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1321);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << OP_PLUS_ASSIGN) | (1L << OP_MINUS_ASSIGN) | (1L << OP_MULT_ASSIGN) | (1L << OP_DIV_ASSIGN) | (1L << OP_MOD_ASSIGN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixUnaryOperationContext extends ParserRuleContext {
		public LabelDefinitionContext labelDefinition() {
			return getRuleContext(LabelDefinitionContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public PrefixUnaryOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixUnaryOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPrefixUnaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPrefixUnaryOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitPrefixUnaryOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixUnaryOperationContext prefixUnaryOperation() throws RecognitionException {
		PrefixUnaryOperationContext _localctx = new PrefixUnaryOperationContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_prefixUnaryOperation);
		try {
			setState(1330);
			switch (_input.LA(1)) {
			case OP_MUNUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1323); match(OP_MUNUS);
				}
				break;
			case OP_PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1324); match(OP_PLUS);
				}
				break;
			case OP_INCREMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1325); match(OP_INCREMENT);
				}
				break;
			case OP_DECREMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1326); match(OP_DECREMENT);
				}
				break;
			case OP_NOT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1327); match(OP_NOT);
				}
				break;
			case DOG:
				enterOuterAlt(_localctx, 6);
				{
				setState(1328); annotations();
				}
				break;
			case IMPORT:
			case ClassModifier_enum:
			case ClassModifier_data:
			case AccessModifier_private:
			case AccessModifier_protected:
			case AccessModifier_public:
			case AccessModifier_internal:
			case Modifier_const:
			case Declaration_companion:
			case Declaration_init:
			case SimpleName:
				enterOuterAlt(_localctx, 7);
				{
				setState(1329); labelDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixUnaryOperationContext extends ParserRuleContext {
		public CallSuffixContext callSuffix() {
			return getRuleContext(CallSuffixContext.class,0);
		}
		public MemberAccessOperationContext memberAccessOperation() {
			return getRuleContext(MemberAccessOperationContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public PostfixUnaryExpressionContext postfixUnaryExpression() {
			return getRuleContext(PostfixUnaryExpressionContext.class,0);
		}
		public PostfixUnaryOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixUnaryOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPostfixUnaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPostfixUnaryOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitPostfixUnaryOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixUnaryOperationContext postfixUnaryOperation() throws RecognitionException {
		PostfixUnaryOperationContext _localctx = new PostfixUnaryOperationContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_postfixUnaryOperation);
		try {
			setState(1340);
			switch (_input.LA(1)) {
			case OP_INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1332); match(OP_INCREMENT);
				}
				break;
			case OP_DECREMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1333); match(OP_DECREMENT);
				}
				break;
			case OP_NULL_ASSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1334); match(OP_NULL_ASSERT);
				}
				break;
			case OPEN_BLOCK:
			case IMPORT:
			case LT:
			case BRACE_OPEN:
			case ClassModifier_enum:
			case ClassModifier_data:
			case AccessModifier_private:
			case AccessModifier_protected:
			case AccessModifier_public:
			case AccessModifier_internal:
			case Modifier_const:
			case DOG:
			case Declaration_companion:
			case Declaration_init:
			case SimpleName:
				enterOuterAlt(_localctx, 4);
				{
				setState(1335); callSuffix();
				}
				break;
			case SQ_OPEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(1336); arrayAccess();
				}
				break;
			case DOT:
			case Q:
				enterOuterAlt(_localctx, 6);
				{
				setState(1337); memberAccessOperation();
				setState(1338); postfixUnaryExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotatedLambdaContext extends ParserRuleContext {
		public List<UnescapedAnnotationContext> unescapedAnnotation() {
			return getRuleContexts(UnescapedAnnotationContext.class);
		}
		public FunctionLiteralContext functionLiteral() {
			return getRuleContext(FunctionLiteralContext.class,0);
		}
		public LabelDefinitionContext labelDefinition() {
			return getRuleContext(LabelDefinitionContext.class,0);
		}
		public UnescapedAnnotationContext unescapedAnnotation(int i) {
			return getRuleContext(UnescapedAnnotationContext.class,i);
		}
		public AnnotatedLambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotatedLambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAnnotatedLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAnnotatedLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAnnotatedLambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotatedLambdaContext annotatedLambda() throws RecognitionException {
		AnnotatedLambdaContext _localctx = new AnnotatedLambdaContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_annotatedLambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOG) {
				{
				{
				setState(1342); match(DOG);
				setState(1343); unescapedAnnotation();
				}
				}
				setState(1348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1350);
			_la = _input.LA(1);
			if (_la==IMPORT || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (ClassModifier_enum - 76)) | (1L << (ClassModifier_data - 76)) | (1L << (AccessModifier_private - 76)) | (1L << (AccessModifier_protected - 76)) | (1L << (AccessModifier_public - 76)) | (1L << (AccessModifier_internal - 76)) | (1L << (Modifier_const - 76)) | (1L << (Declaration_companion - 76)) | (1L << (Declaration_init - 76)) | (1L << (SimpleName - 76)))) != 0)) {
				{
				setState(1349); labelDefinition();
				}
			}

			setState(1352); functionLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberAccessOperationContext extends ParserRuleContext {
		public MemberAccessOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAccessOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMemberAccessOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMemberAccessOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitMemberAccessOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberAccessOperationContext memberAccessOperation() throws RecognitionException {
		MemberAccessOperationContext _localctx = new MemberAccessOperationContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_memberAccessOperation);
		int _la;
		try {
			setState(1359);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1354); match(DOT);
				}
				break;
			case Q:
				enterOuterAlt(_localctx, 2);
				{
				setState(1355); match(Q);
				setState(1357);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(1356); match(DOT);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionLiteralContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public FunctionLiteralparameterContext functionLiteralparameter(int i) {
			return getRuleContext(FunctionLiteralparameterContext.class,i);
		}
		public List<FunctionLiteralparameterContext> functionLiteralparameter() {
			return getRuleContexts(FunctionLiteralparameterContext.class);
		}
		public FunctionLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitFunctionLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionLiteralContext functionLiteral() throws RecognitionException {
		FunctionLiteralContext _localctx = new FunctionLiteralContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_functionLiteral);
		int _la;
		try {
			setState(1380);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1361); match(OPEN_BLOCK);
				setState(1362); statements();
				setState(1363); match(CLOSE_BLOCK);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1365); match(OPEN_BLOCK);
				setState(1374);
				_la = _input.LA(1);
				if (_la==SimpleName) {
					{
					{
					setState(1366); functionLiteralparameter();
					}
					setState(1371);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1367); match(COMMA);
						setState(1368); functionLiteralparameter();
						}
						}
						setState(1373);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1376); match(OP_ASTERISK);
				setState(1377); statements();
				setState(1378); match(CLOSE_BLOCK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionLiteralparameterContext extends ParserRuleContext {
		public TerminalNode SimpleName() { return getToken(KotlinParser.SimpleName, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionLiteralparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionLiteralparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionLiteralparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionLiteralparameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitFunctionLiteralparameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionLiteralparameterContext functionLiteralparameter() throws RecognitionException {
		FunctionLiteralparameterContext _localctx = new FunctionLiteralparameterContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_functionLiteralparameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1382); match(SimpleName);
			setState(1385);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1383); match(COLON);
				setState(1384); type();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccessContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1387); match(SQ_OPEN);
			setState(1396);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << OPEN_BLOCK) | (1L << HexadecimalLiteral) | (1L << CharacterLiteral) | (1L << TRIPLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << PACKAGE) | (1L << IMPORT) | (1L << BRACE_OPEN) | (1L << REFERENCE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << OP_PLUS) | (1L << OP_MUNUS) | (1L << OP_DECREMENT) | (1L << OP_INCREMENT) | (1L << OP_NOT))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (ClassModifier_enum - 76)) | (1L << (ClassModifier_data - 76)) | (1L << (AccessModifier_private - 76)) | (1L << (AccessModifier_protected - 76)) | (1L << (AccessModifier_public - 76)) | (1L << (AccessModifier_internal - 76)) | (1L << (Modifier_const - 76)) | (1L << (DOG - 76)) | (1L << (Jump_throw - 76)) | (1L << (Jump_continue - 76)) | (1L << (Jump_return - 76)) | (1L << (Jump_break - 76)) | (1L << (ConstructorDelegationCall_this - 76)) | (1L << (ConstructorDelegationCall_super - 76)) | (1L << (Declaration_object - 76)) | (1L << (Declaration_companion - 76)) | (1L << (Declaration_fun - 76)) | (1L << (Declaration_init - 76)) | (1L << (CF_if - 76)) | (1L << (CF_when - 76)) | (1L << (CF_while - 76)) | (1L << (CF_for - 76)) | (1L << (CF_do - 76)) | (1L << (CF_try - 76)) | (1L << (BAX - 76)) | (1L << (SimpleName - 76)))) != 0)) {
				{
				setState(1388); expression();
				setState(1393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1389); match(COMMA);
					setState(1390); expression();
					}
					}
					setState(1395);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1398); match(SQ_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectLiteralContext extends ParserRuleContext {
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<DelegationSpecifierContext> delegationSpecifier() {
			return getRuleContexts(DelegationSpecifierContext.class);
		}
		public DelegationSpecifierContext delegationSpecifier(int i) {
			return getRuleContext(DelegationSpecifierContext.class,i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_objectLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1400); match(Declaration_object);
			setState(1410);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1401); match(COLON);
				setState(1402); delegationSpecifier();
				setState(1407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1403); match(COMMA);
						setState(1404); delegationSpecifier();
						}
						} 
					}
					setState(1409);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				}
				}
				break;
			}
			setState(1412); classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenContext extends ParserRuleContext {
		public WhenEntryContext whenEntry(int i) {
			return getRuleContext(WhenEntryContext.class,i);
		}
		public List<WhenEntryContext> whenEntry() {
			return getRuleContexts(WhenEntryContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitWhen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitWhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenContext when() throws RecognitionException {
		WhenContext _localctx = new WhenContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_when);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1414); match(CF_when);
			setState(1419);
			_la = _input.LA(1);
			if (_la==BRACE_OPEN) {
				{
				setState(1415); match(BRACE_OPEN);
				setState(1416); expression();
				setState(1417); match(BRACE_CLOSE);
				}
			}

			setState(1421); match(OPEN_BLOCK);
			setState(1425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << OPEN_BLOCK) | (1L << HexadecimalLiteral) | (1L << CharacterLiteral) | (1L << TRIPLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << PACKAGE) | (1L << IMPORT) | (1L << BRACE_OPEN) | (1L << REFERENCE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << OP_PLUS) | (1L << OP_MUNUS) | (1L << OP_IN) | (1L << OP_NOT_IN) | (1L << OP_IS) | (1L << OP_NOT_IS) | (1L << OP_DECREMENT) | (1L << OP_INCREMENT) | (1L << OP_NOT))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (ClassModifier_enum - 76)) | (1L << (ClassModifier_data - 76)) | (1L << (AccessModifier_private - 76)) | (1L << (AccessModifier_protected - 76)) | (1L << (AccessModifier_public - 76)) | (1L << (AccessModifier_internal - 76)) | (1L << (Modifier_const - 76)) | (1L << (DOG - 76)) | (1L << (Jump_throw - 76)) | (1L << (Jump_continue - 76)) | (1L << (Jump_return - 76)) | (1L << (Jump_break - 76)) | (1L << (ConstructorDelegationCall_this - 76)) | (1L << (ConstructorDelegationCall_super - 76)) | (1L << (Declaration_object - 76)) | (1L << (Declaration_companion - 76)) | (1L << (Declaration_fun - 76)) | (1L << (Declaration_init - 76)) | (1L << (CF_if - 76)) | (1L << (CF_else - 76)) | (1L << (CF_when - 76)) | (1L << (CF_while - 76)) | (1L << (CF_for - 76)) | (1L << (CF_do - 76)) | (1L << (CF_try - 76)) | (1L << (BAX - 76)) | (1L << (SimpleName - 76)))) != 0)) {
				{
				{
				setState(1422); whenEntry();
				}
				}
				setState(1427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1428); match(CLOSE_BLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenEntryContext extends ParserRuleContext {
		public List<WhenConditionContext> whenCondition() {
			return getRuleContexts(WhenConditionContext.class);
		}
		public WhenConditionContext whenCondition(int i) {
			return getRuleContext(WhenConditionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhenEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterWhenEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitWhenEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitWhenEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenEntryContext whenEntry() throws RecognitionException {
		WhenEntryContext _localctx = new WhenEntryContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_whenEntry);
		int _la;
		try {
			setState(1455);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case OPEN_BLOCK:
			case HexadecimalLiteral:
			case CharacterLiteral:
			case TRIPLE_QUOTE:
			case SINGLE_QUOTE:
			case PACKAGE:
			case IMPORT:
			case BRACE_OPEN:
			case REFERENCE:
			case TRUE:
			case FALSE:
			case NULL:
			case OP_PLUS:
			case OP_MUNUS:
			case OP_IN:
			case OP_NOT_IN:
			case OP_IS:
			case OP_NOT_IS:
			case OP_DECREMENT:
			case OP_INCREMENT:
			case OP_NOT:
			case ClassModifier_enum:
			case ClassModifier_data:
			case AccessModifier_private:
			case AccessModifier_protected:
			case AccessModifier_public:
			case AccessModifier_internal:
			case Modifier_const:
			case DOG:
			case Jump_throw:
			case Jump_continue:
			case Jump_return:
			case Jump_break:
			case ConstructorDelegationCall_this:
			case ConstructorDelegationCall_super:
			case Declaration_object:
			case Declaration_companion:
			case Declaration_fun:
			case Declaration_init:
			case CF_if:
			case CF_when:
			case CF_while:
			case CF_for:
			case CF_do:
			case CF_try:
			case BAX:
			case SimpleName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1430); whenCondition();
				setState(1435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1431); match(COMMA);
					setState(1432); whenCondition();
					}
					}
					setState(1437);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1438); match(OP_ASTERISK);
				setState(1439); expression();
				setState(1443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(1440); match(SEMI);
					}
					}
					setState(1445);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CF_else:
				enterOuterAlt(_localctx, 2);
				{
				setState(1446); match(CF_else);
				setState(1447); match(OP_ASTERISK);
				setState(1448); expression();
				setState(1452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(1449); match(SEMI);
					}
					}
					setState(1454);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenConditionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhenConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterWhenCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitWhenCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitWhenCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenConditionContext whenCondition() throws RecognitionException {
		WhenConditionContext _localctx = new WhenConditionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_whenCondition);
		int _la;
		try {
			setState(1462);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case OPEN_BLOCK:
			case HexadecimalLiteral:
			case CharacterLiteral:
			case TRIPLE_QUOTE:
			case SINGLE_QUOTE:
			case PACKAGE:
			case IMPORT:
			case BRACE_OPEN:
			case REFERENCE:
			case TRUE:
			case FALSE:
			case NULL:
			case OP_PLUS:
			case OP_MUNUS:
			case OP_DECREMENT:
			case OP_INCREMENT:
			case OP_NOT:
			case ClassModifier_enum:
			case ClassModifier_data:
			case AccessModifier_private:
			case AccessModifier_protected:
			case AccessModifier_public:
			case AccessModifier_internal:
			case Modifier_const:
			case DOG:
			case Jump_throw:
			case Jump_continue:
			case Jump_return:
			case Jump_break:
			case ConstructorDelegationCall_this:
			case ConstructorDelegationCall_super:
			case Declaration_object:
			case Declaration_companion:
			case Declaration_fun:
			case Declaration_init:
			case CF_if:
			case CF_when:
			case CF_while:
			case CF_for:
			case CF_do:
			case CF_try:
			case BAX:
			case SimpleName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1457); expression();
				}
				break;
			case OP_IN:
			case OP_NOT_IN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1458);
				_la = _input.LA(1);
				if ( !(_la==OP_IN || _la==OP_NOT_IN) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1459); expression();
				}
				break;
			case OP_IS:
			case OP_NOT_IS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1460);
				_la = _input.LA(1);
				if ( !(_la==OP_IS || _la==OP_NOT_IS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1461); type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastArgLambdaContext extends ParserRuleContext {
		public List<VariableDeclarationEntryContext> variableDeclarationEntry() {
			return getRuleContexts(VariableDeclarationEntryContext.class);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public VariableDeclarationEntryContext variableDeclarationEntry(int i) {
			return getRuleContext(VariableDeclarationEntryContext.class,i);
		}
		public LastArgLambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastArgLambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterLastArgLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitLastArgLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitLastArgLambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastArgLambdaContext lastArgLambda() throws RecognitionException {
		LastArgLambdaContext _localctx = new LastArgLambdaContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_lastArgLambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1464); match(OPEN_BLOCK);
			setState(1466);
			_la = _input.LA(1);
			if (_la==BRACE_OPEN) {
				{
				setState(1465); match(BRACE_OPEN);
				}
			}

			setState(1476);
			_la = _input.LA(1);
			if (_la==SimpleName) {
				{
				setState(1468); variableDeclarationEntry();
				setState(1473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1469); match(COMMA);
					setState(1470); variableDeclarationEntry();
					}
					}
					setState(1475);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1479);
			_la = _input.LA(1);
			if (_la==BRACE_CLOSE) {
				{
				setState(1478); match(BRACE_CLOSE);
				}
			}

			setState(1481); match(OP_ASTERISK);
			setState(1482); statements();
			setState(1483); match(CLOSE_BLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyDeclarationContext extends ParserRuleContext {
		public MutablePropertyDeclarationContext mutablePropertyDeclaration() {
			return getRuleContext(MutablePropertyDeclarationContext.class,0);
		}
		public ReadonlyPropertyDeclarationContext readonlyPropertyDeclaration() {
			return getRuleContext(ReadonlyPropertyDeclarationContext.class,0);
		}
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_propertyDeclaration);
		try {
			setState(1487);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1485); readonlyPropertyDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1486); mutablePropertyDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadonlyPropertyDeclarationContext extends ParserRuleContext {
		public ExtensionPropertyDelegateDeclarationContext extensionPropertyDelegateDeclaration() {
			return getRuleContext(ExtensionPropertyDelegateDeclarationContext.class,0);
		}
		public ReadonlyExtensionPropertyNoDelegateDeclarationContext readonlyExtensionPropertyNoDelegateDeclaration() {
			return getRuleContext(ReadonlyExtensionPropertyNoDelegateDeclarationContext.class,0);
		}
		public PropertyModifierContext propertyModifier() {
			return getRuleContext(PropertyModifierContext.class,0);
		}
		public ReadonlyPropertyNoDelegateDeclarationContext readonlyPropertyNoDelegateDeclaration() {
			return getRuleContext(ReadonlyPropertyNoDelegateDeclarationContext.class,0);
		}
		public PropertyDelegateDeclarationContext propertyDelegateDeclaration() {
			return getRuleContext(PropertyDelegateDeclarationContext.class,0);
		}
		public ReadonlyPropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readonlyPropertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterReadonlyPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitReadonlyPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitReadonlyPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadonlyPropertyDeclarationContext readonlyPropertyDeclaration() throws RecognitionException {
		ReadonlyPropertyDeclarationContext _localctx = new ReadonlyPropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_readonlyPropertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1490);
			_la = _input.LA(1);
			if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (AccessModifier_private - 80)) | (1L << (AccessModifier_protected - 80)) | (1L << (AccessModifier_public - 80)) | (1L << (AccessModifier_internal - 80)))) != 0)) {
				{
				setState(1489); propertyModifier();
				}
			}

			setState(1492); match(KEYWORD_val);
			setState(1497);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1493); extensionPropertyDelegateDeclaration();
				}
				break;

			case 2:
				{
				setState(1494); readonlyExtensionPropertyNoDelegateDeclaration();
				}
				break;

			case 3:
				{
				setState(1495); propertyDelegateDeclaration();
				}
				break;

			case 4:
				{
				setState(1496); readonlyPropertyNoDelegateDeclaration();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MutablePropertyDeclarationContext extends ParserRuleContext {
		public ExtensionPropertyDelegateDeclarationContext extensionPropertyDelegateDeclaration() {
			return getRuleContext(ExtensionPropertyDelegateDeclarationContext.class,0);
		}
		public FunctionModifierContext functionModifier() {
			return getRuleContext(FunctionModifierContext.class,0);
		}
		public MutableExtensionPropertyNoDelegateDeclarationContext mutableExtensionPropertyNoDelegateDeclaration() {
			return getRuleContext(MutableExtensionPropertyNoDelegateDeclarationContext.class,0);
		}
		public PropertyDelegateDeclarationContext propertyDelegateDeclaration() {
			return getRuleContext(PropertyDelegateDeclarationContext.class,0);
		}
		public MutablePropertyNoDelegateDeclarationContext mutablePropertyNoDelegateDeclaration() {
			return getRuleContext(MutablePropertyNoDelegateDeclarationContext.class,0);
		}
		public MutablePropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutablePropertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMutablePropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMutablePropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitMutablePropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MutablePropertyDeclarationContext mutablePropertyDeclaration() throws RecognitionException {
		MutablePropertyDeclarationContext _localctx = new MutablePropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_mutablePropertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1499); functionModifier();
			setState(1500); match(KEYWORD_var);
			setState(1505);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1501); extensionPropertyDelegateDeclaration();
				}
				break;

			case 2:
				{
				setState(1502); mutableExtensionPropertyNoDelegateDeclaration();
				}
				break;

			case 3:
				{
				setState(1503); propertyDelegateDeclaration();
				}
				break;

			case 4:
				{
				setState(1504); mutablePropertyNoDelegateDeclaration();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionPropertyDelegateDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PropertyDelegateDeclarationContext propertyDelegateDeclaration() {
			return getRuleContext(PropertyDelegateDeclarationContext.class,0);
		}
		public ExtensionPropertyDelegateDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionPropertyDelegateDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterExtensionPropertyDelegateDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitExtensionPropertyDelegateDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitExtensionPropertyDelegateDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtensionPropertyDelegateDeclarationContext extensionPropertyDelegateDeclaration() throws RecognitionException {
		ExtensionPropertyDelegateDeclarationContext _localctx = new ExtensionPropertyDelegateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_extensionPropertyDelegateDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1508);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1507); typeParameters();
				}
			}

			setState(1510); type();
			setState(1511); match(DOT);
			setState(1512); propertyDelegateDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadonlyExtensionPropertyNoDelegateDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public ParameterTypeContext parameterType() {
			return getRuleContext(ParameterTypeContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public ReadonlyExtensionPropertyNoDelegateDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readonlyExtensionPropertyNoDelegateDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterReadonlyExtensionPropertyNoDelegateDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitReadonlyExtensionPropertyNoDelegateDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitReadonlyExtensionPropertyNoDelegateDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadonlyExtensionPropertyNoDelegateDeclarationContext readonlyExtensionPropertyNoDelegateDeclaration() throws RecognitionException {
		ReadonlyExtensionPropertyNoDelegateDeclarationContext _localctx = new ReadonlyExtensionPropertyNoDelegateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_readonlyExtensionPropertyNoDelegateDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1515);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1514); typeParameters();
				}
			}

			setState(1517); type();
			setState(1518); match(DOT);
			setState(1519); parameterType();
			setState(1521);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(1520); getter();
				}
				break;
			}
			setState(1526);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1523); match(SEMI);
					}
					} 
				}
				setState(1528);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterParameterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitParameterType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitParameterType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterTypeContext parameterType() throws RecognitionException {
		ParameterTypeContext _localctx = new ParameterTypeContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_parameterType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1531);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1529); match(COLON);
				setState(1530); type();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MutableExtensionPropertyNoDelegateDeclarationContext extends ParserRuleContext {
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public VariableDeclarationEntryContext variableDeclarationEntry() {
			return getRuleContext(VariableDeclarationEntryContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public ParameterTypeContext parameterType() {
			return getRuleContext(ParameterTypeContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public MutableExtensionPropertyNoDelegateDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutableExtensionPropertyNoDelegateDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMutableExtensionPropertyNoDelegateDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMutableExtensionPropertyNoDelegateDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitMutableExtensionPropertyNoDelegateDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MutableExtensionPropertyNoDelegateDeclarationContext mutableExtensionPropertyNoDelegateDeclaration() throws RecognitionException {
		MutableExtensionPropertyNoDelegateDeclarationContext _localctx = new MutableExtensionPropertyNoDelegateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_mutableExtensionPropertyNoDelegateDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1534);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1533); typeParameters();
				}
			}

			setState(1536); type();
			setState(1537); match(DOT);
			setState(1538); variableDeclarationEntry();
			setState(1539); parameterType();
			setState(1543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(1540); match(SEMI);
				}
				}
				setState(1545);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1552);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				{
				setState(1546); getter();
				setState(1547); setter();
				}
				}
				break;

			case 2:
				{
				{
				setState(1549); setter();
				setState(1550); getter();
				}
				}
				break;
			}
			setState(1557);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1554); match(SEMI);
					}
					} 
				}
				setState(1559);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadonlyPropertyNoDelegateDeclarationContext extends ParserRuleContext {
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public MultipleVariableDeclarationsContext multipleVariableDeclarations() {
			return getRuleContext(MultipleVariableDeclarationsContext.class,0);
		}
		public VariableDeclarationEntryContext variableDeclarationEntry() {
			return getRuleContext(VariableDeclarationEntryContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public ReadonlyPropertyNoDelegateDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readonlyPropertyNoDelegateDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterReadonlyPropertyNoDelegateDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitReadonlyPropertyNoDelegateDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitReadonlyPropertyNoDelegateDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadonlyPropertyNoDelegateDeclarationContext readonlyPropertyNoDelegateDeclaration() throws RecognitionException {
		ReadonlyPropertyNoDelegateDeclarationContext _localctx = new ReadonlyPropertyNoDelegateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_readonlyPropertyNoDelegateDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1562);
			switch (_input.LA(1)) {
			case BRACE_OPEN:
				{
				setState(1560); multipleVariableDeclarations();
				}
				break;
			case SimpleName:
				{
				setState(1561); variableDeclarationEntry();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1564); typeConstraints();
			setState(1565); assignExpression();
			setState(1567);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1566); getter();
				}
				break;
			}
			setState(1572);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1569); match(SEMI);
					}
					} 
				}
				setState(1574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyDelegateDeclarationContext extends ParserRuleContext {
		public VariableDeclarationEntryContext variableDeclarationEntry() {
			return getRuleContext(VariableDeclarationEntryContext.class,0);
		}
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public DelegateExpressionContext delegateExpression() {
			return getRuleContext(DelegateExpressionContext.class,0);
		}
		public PropertyDelegateDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDelegateDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPropertyDelegateDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPropertyDelegateDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitPropertyDelegateDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDelegateDeclarationContext propertyDelegateDeclaration() throws RecognitionException {
		PropertyDelegateDeclarationContext _localctx = new PropertyDelegateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_propertyDelegateDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1575); variableDeclarationEntry();
			setState(1576); typeConstraints();
			setState(1577); delegateExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MutablePropertyNoDelegateDeclarationContext extends ParserRuleContext {
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public MultipleVariableDeclarationsContext multipleVariableDeclarations() {
			return getRuleContext(MultipleVariableDeclarationsContext.class,0);
		}
		public VariableDeclarationEntryContext variableDeclarationEntry() {
			return getRuleContext(VariableDeclarationEntryContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public MutablePropertyNoDelegateDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutablePropertyNoDelegateDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterMutablePropertyNoDelegateDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitMutablePropertyNoDelegateDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitMutablePropertyNoDelegateDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MutablePropertyNoDelegateDeclarationContext mutablePropertyNoDelegateDeclaration() throws RecognitionException {
		MutablePropertyNoDelegateDeclarationContext _localctx = new MutablePropertyNoDelegateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_mutablePropertyNoDelegateDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1581);
			switch (_input.LA(1)) {
			case BRACE_OPEN:
				{
				setState(1579); multipleVariableDeclarations();
				}
				break;
			case SimpleName:
				{
				setState(1580); variableDeclarationEntry();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1583); typeConstraints();
			setState(1584); assignExpression();
			setState(1588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(1585); match(SEMI);
				}
				}
				setState(1590);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1597);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				{
				setState(1591); getter();
				setState(1592); setter();
				}
				}
				break;

			case 2:
				{
				{
				setState(1594); setter();
				setState(1595); getter();
				}
				}
				break;
			}
			setState(1602);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1599); match(SEMI);
					}
					} 
				}
				setState(1604);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DelegateExpressionContext extends ParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DelegateExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegateExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterDelegateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitDelegateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitDelegateExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelegateExpressionContext delegateExpression() throws RecognitionException {
		DelegateExpressionContext _localctx = new DelegateExpressionContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_delegateExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1605); match(KEYWORD_by);
			setState(1606); expression();
			setState(1610);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1607); match(SEMI);
					}
					} 
				}
				setState(1612);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignExpressionContext extends ParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAssignExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAssignExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAssignExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignExpressionContext assignExpression() throws RecognitionException {
		AssignExpressionContext _localctx = new AssignExpressionContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_assignExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1613); match(EQ);
			setState(1614); expression();
			setState(1618);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1615); match(SEMI);
					}
					} 
				}
				setState(1620);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetterSetterDeclarationContext extends ParserRuleContext {
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public GetterSetterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getterSetterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterGetterSetterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitGetterSetterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitGetterSetterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetterSetterDeclarationContext getterSetterDeclaration() throws RecognitionException {
		GetterSetterDeclarationContext _localctx = new GetterSetterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_getterSetterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1633);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				{
				setState(1622);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1621); getter();
					}
					break;
				}
				setState(1625);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (OP_IN - 44)) | (1L << (KEYWORD_vararg - 44)) | (1L << (SET - 44)) | (1L << (HierarchyModifier_abstract - 44)) | (1L << (HierarchyModifier_open - 44)) | (1L << (HierarchyModifier_final - 44)) | (1L << (HierarchyModifier_override - 44)) | (1L << (KeyWordModifier_operator - 44)) | (1L << (KeyWordModifier_infix - 44)) | (1L << (KeyWordModifier_inline - 44)) | (1L << (ClassModifier_enum - 44)) | (1L << (ClassModifier_annotation - 44)) | (1L << (ClassModifier_data - 44)) | (1L << (ClassModifier_sealed - 44)) | (1L << (AccessModifier_private - 44)) | (1L << (AccessModifier_protected - 44)) | (1L << (AccessModifier_public - 44)) | (1L << (AccessModifier_internal - 44)) | (1L << (Modifier_const - 44)) | (1L << (VarianceAnnotation_out - 44)) | (1L << (DOG - 44)))) != 0)) {
					{
					setState(1624); setter();
					}
				}

				}
				}
				break;

			case 2:
				{
				{
				setState(1628);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1627); setter();
					}
					break;
				}
				setState(1631);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (OP_IN - 44)) | (1L << (KEYWORD_vararg - 44)) | (1L << (GET - 44)) | (1L << (HierarchyModifier_abstract - 44)) | (1L << (HierarchyModifier_open - 44)) | (1L << (HierarchyModifier_final - 44)) | (1L << (HierarchyModifier_override - 44)) | (1L << (KeyWordModifier_operator - 44)) | (1L << (KeyWordModifier_infix - 44)) | (1L << (KeyWordModifier_inline - 44)) | (1L << (ClassModifier_enum - 44)) | (1L << (ClassModifier_annotation - 44)) | (1L << (ClassModifier_data - 44)) | (1L << (ClassModifier_sealed - 44)) | (1L << (AccessModifier_private - 44)) | (1L << (AccessModifier_protected - 44)) | (1L << (AccessModifier_public - 44)) | (1L << (AccessModifier_internal - 44)) | (1L << (Modifier_const - 44)) | (1L << (VarianceAnnotation_out - 44)) | (1L << (DOG - 44)))) != 0)) {
					{
					setState(1630); getter();
					}
				}

				}
				}
				break;
			}
			setState(1638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(1635); match(SEMI);
				}
				}
				setState(1640);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetterContext extends ParserRuleContext {
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public GetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterGetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitGetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitGetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetterContext getter() throws RecognitionException {
		GetterContext _localctx = new GetterContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_getter);
		int _la;
		try {
			setState(1654);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1641); modifiers();
				setState(1642); match(GET);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1644); modifiers();
				setState(1645); match(GET);
				setState(1646); match(BRACE_OPEN);
				setState(1647); match(BRACE_CLOSE);
				setState(1650);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1648); match(COLON);
					setState(1649); type();
					}
				}

				setState(1652); functionBody();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetterContext extends ParserRuleContext {
		public ModifiersContext modifiers(int i) {
			return getRuleContext(ModifiersContext.class,i);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode SimpleName() { return getToken(KotlinParser.SimpleName, 0); }
		public List<ModifiersContext> modifiers() {
			return getRuleContexts(ModifiersContext.class);
		}
		public SetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterSetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitSetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitSetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetterContext setter() throws RecognitionException {
		SetterContext _localctx = new SetterContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_setter);
		try {
			setState(1670);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1656); modifiers();
				setState(1657); match(SET);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1659); modifiers();
				setState(1660); match(SET);
				setState(1661); match(BRACE_OPEN);
				setState(1662); modifiers();
				setState(1665);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1663); match(SimpleName);
					}
					break;

				case 2:
					{
					setState(1664); parameter();
					}
					break;
				}
				setState(1667); match(BRACE_CLOSE);
				setState(1668); functionBody();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionModifierContext extends ParserRuleContext {
		public FunctionModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitFunctionModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionModifierContext functionModifier() throws RecognitionException {
		FunctionModifierContext _localctx = new FunctionModifierContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_functionModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1672);
			_la = _input.LA(1);
			if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (AccessModifier_private - 80)) | (1L << (AccessModifier_protected - 80)) | (1L << (AccessModifier_public - 80)) | (1L << (AccessModifier_internal - 80)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyModifierContext extends ParserRuleContext {
		public PropertyModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterPropertyModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitPropertyModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitPropertyModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyModifierContext propertyModifier() throws RecognitionException {
		PropertyModifierContext _localctx = new PropertyModifierContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_propertyModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1674);
			_la = _input.LA(1);
			if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (AccessModifier_private - 80)) | (1L << (AccessModifier_protected - 80)) | (1L << (AccessModifier_public - 80)) | (1L << (AccessModifier_internal - 80)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HierarchyModifierContext extends ParserRuleContext {
		public HierarchyModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hierarchyModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterHierarchyModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitHierarchyModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitHierarchyModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HierarchyModifierContext hierarchyModifier() throws RecognitionException {
		HierarchyModifierContext _localctx = new HierarchyModifierContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_hierarchyModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1676);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (HierarchyModifier_abstract - 69)) | (1L << (HierarchyModifier_open - 69)) | (1L << (HierarchyModifier_final - 69)) | (1L << (HierarchyModifier_override - 69)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassModifierContext extends ParserRuleContext {
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitClassModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitClassModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_classModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1678);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (ClassModifier_enum - 76)) | (1L << (ClassModifier_annotation - 76)) | (1L << (ClassModifier_data - 76)) | (1L << (ClassModifier_sealed - 76)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyWordModifierContext extends ParserRuleContext {
		public KeyWordModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyWordModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterKeyWordModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitKeyWordModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitKeyWordModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyWordModifierContext keyWordModifier() throws RecognitionException {
		KeyWordModifierContext _localctx = new KeyWordModifierContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_keyWordModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1680);
			_la = _input.LA(1);
			if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (KeyWordModifier_operator - 73)) | (1L << (KeyWordModifier_infix - 73)) | (1L << (KeyWordModifier_inline - 73)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessModifierContext extends ParserRuleContext {
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterAccessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitAccessModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitAccessModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1682);
			_la = _input.LA(1);
			if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (AccessModifier_private - 80)) | (1L << (AccessModifier_protected - 80)) | (1L << (AccessModifier_public - 80)) | (1L << (AccessModifier_internal - 80)) | (1L << (Modifier_const - 80)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarianceAnnotationContext extends ParserRuleContext {
		public VarianceAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varianceAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterVarianceAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitVarianceAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitVarianceAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarianceAnnotationContext varianceAnnotation() throws RecognitionException {
		VarianceAnnotationContext _localctx = new VarianceAnnotationContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_varianceAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1684);
			_la = _input.LA(1);
			if ( !(_la==OP_IN || _la==VarianceAnnotation_out) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0081\u0699\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\3\2\3\2\7\2\u0117\n\2\f\2\16\2\u011a\13\2\3\3\5\3\u011d"+
		"\n\3\3\3\7\3\u0120\n\3\f\3\16\3\u0123\13\3\3\4\3\4\3\4\3\4\7\4\u0129\n"+
		"\4\f\4\16\4\u012c\13\4\3\4\7\4\u012f\n\4\f\4\16\4\u0132\13\4\3\5\3\5\3"+
		"\5\3\5\7\5\u0138\n\5\f\5\16\5\u013b\13\5\3\5\3\5\3\5\3\5\5\5\u0141\n\5"+
		"\3\5\7\5\u0144\n\5\f\5\16\5\u0147\13\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u014f"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0159\n\7\3\b\5\b\u015c\n\b\3"+
		"\t\3\t\3\t\3\t\7\t\u0162\n\t\f\t\16\t\u0165\13\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\5\n\u016d\n\n\3\13\3\13\5\13\u0171\n\13\3\13\3\13\7\13\u0175\n\13\f"+
		"\13\16\13\u0178\13\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u0180\n\f\f\f\16\f"+
		"\u0183\13\f\5\f\u0185\n\f\3\r\5\r\u0188\n\r\3\r\3\r\3\r\3\r\3\16\5\16"+
		"\u018f\n\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u0197\n\17\3\17\5\17\u019a"+
		"\n\17\3\17\3\17\5\17\u019e\n\17\3\17\3\17\5\17\u01a2\n\17\3\17\5\17\u01a5"+
		"\n\17\3\17\3\17\5\17\u01a9\n\17\3\17\5\17\u01ac\n\17\5\17\u01ae\n\17\3"+
		"\20\3\20\5\20\u01b2\n\20\3\20\3\20\3\20\7\20\u01b7\n\20\f\20\16\20\u01ba"+
		"\13\20\3\21\3\21\3\21\3\21\5\21\u01c0\n\21\3\22\3\22\3\22\3\22\3\22\7"+
		"\22\u01c7\n\22\f\22\16\22\u01ca\13\22\3\22\3\22\5\22\u01ce\n\22\3\23\3"+
		"\23\3\23\5\23\u01d3\n\23\3\24\3\24\3\24\3\24\5\24\u01d9\n\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\7\26\u01e2\n\26\f\26\16\26\u01e5\13\26\5\26"+
		"\u01e7\n\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u01f1\n\27\f"+
		"\27\16\27\u01f4\13\27\3\27\3\27\3\30\7\30\u01f9\n\30\f\30\16\30\u01fc"+
		"\13\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0207\n\32\3"+
		"\33\6\33\u020a\n\33\r\33\16\33\u020b\3\34\3\34\3\34\3\34\5\34\u0212\n"+
		"\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\5\36\u021b\n\36\3\36\5\36\u021e"+
		"\n\36\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u0226\n\37\f\37\16\37\u0229\13"+
		"\37\5\37\u022b\n\37\3\37\3\37\3 \3 \3 \7 \u0232\n \f \16 \u0235\13 \3"+
		" \5 \u0238\n \3 \5 \u023b\n \3!\3!\3!\3!\5!\u0241\n!\3!\5!\u0244\n!\3"+
		"!\3!\5!\u0248\n!\3!\3!\5!\u024c\n!\5!\u024e\n!\3\"\3\"\3\"\3\"\3\"\5\""+
		"\u0255\n\"\3#\3#\3#\3$\3$\3$\3$\3%\3%\5%\u0260\n%\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3(\3(\5(\u026b\n(\3)\3)\5)\u026f\n)\3)\3)\3*\3*\3*\3*\3+\5+\u0278"+
		"\n+\3+\5+\u027b\n+\3+\3+\3+\3+\7+\u0281\n+\f+\16+\u0284\13+\5+\u0286\n"+
		"+\3+\3+\3,\5,\u028b\n,\3,\3,\3,\3,\3,\7,\u0292\n,\f,\16,\u0295\13,\5,"+
		"\u0297\n,\3,\3,\3,\3,\5,\u029d\n,\3,\5,\u02a0\n,\3,\7,\u02a3\n,\f,\16"+
		",\u02a6\13,\3-\3-\3-\3-\5-\u02ac\n-\3.\5.\u02af\n.\3.\3.\5.\u02b3\n.\3"+
		".\3.\3.\3.\5.\u02b9\n.\3/\3/\5/\u02bd\n/\3/\3/\3\60\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\5\61\u02c8\n\61\3\62\3\62\3\62\3\62\5\62\u02ce\n\62\3\62\5"+
		"\62\u02d1\n\62\3\62\3\62\5\62\u02d5\n\62\3\62\3\62\3\62\7\62\u02da\n\62"+
		"\f\62\16\62\u02dd\13\62\5\62\u02df\n\62\3\62\3\62\3\62\5\62\u02e4\n\62"+
		"\3\62\7\62\u02e7\n\62\f\62\16\62\u02ea\13\62\3\63\3\63\3\63\3\63\5\63"+
		"\u02f0\n\63\3\63\5\63\u02f3\n\63\3\63\3\63\5\63\u02f7\n\63\3\63\3\63\3"+
		"\63\7\63\u02fc\n\63\f\63\16\63\u02ff\13\63\5\63\u0301\n\63\3\63\3\63\3"+
		"\63\5\63\u0306\n\63\3\63\7\63\u0309\n\63\f\63\16\63\u030c\13\63\3\64\3"+
		"\64\3\64\3\64\7\64\u0312\n\64\f\64\16\64\u0315\13\64\3\65\3\65\3\65\3"+
		"\65\5\65\u031b\n\65\3\65\5\65\u031e\n\65\3\65\3\65\7\65\u0322\n\65\f\65"+
		"\16\65\u0325\13\65\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u032d\n\66\f\66"+
		"\16\66\u0330\13\66\3\67\3\67\3\67\3\67\5\67\u0336\n\67\3\67\3\67\7\67"+
		"\u033a\n\67\f\67\16\67\u033d\13\67\38\38\38\38\58\u0343\n8\39\79\u0346"+
		"\n9\f9\169\u0349\139\3:\3:\3:\3:\7:\u034f\n:\f:\16:\u0352\13:\5:\u0354"+
		"\n:\3:\3:\3;\3;\3;\5;\u035b\n;\3;\3;\3;\3;\5;\u0361\n;\3;\3;\5;\u0365"+
		"\n;\3;\3;\3;\5;\u036a\n;\3;\3;\5;\u036e\n;\3;\7;\u0371\n;\f;\16;\u0374"+
		"\13;\3<\3<\5<\u0378\n<\3<\3<\3<\3<\5<\u037e\n<\3<\5<\u0381\n<\3<\3<\3"+
		"<\5<\u0386\n<\3<\3<\5<\u038a\n<\3<\7<\u038d\n<\f<\16<\u0390\13<\3=\7="+
		"\u0393\n=\f=\16=\u0396\13=\3=\3=\7=\u039a\n=\f=\16=\u039d\13=\3=\7=\u03a0"+
		"\n=\f=\16=\u03a3\13=\5=\u03a5\n=\3=\7=\u03a8\n=\f=\16=\u03ab\13=\3>\3"+
		">\3>\5>\u03b0\n>\3?\3?\3?\3?\3@\3@\3@\7@\u03b9\n@\f@\16@\u03bc\13@\3A"+
		"\3A\3A\3A\5A\u03c2\nA\3A\3A\3B\3B\5B\u03c8\nB\7B\u03ca\nB\fB\16B\u03cd"+
		"\13B\3C\3C\3C\3C\5C\u03d3\nC\3C\3C\5C\u03d7\nC\3C\3C\3D\3D\3D\3D\3D\3"+
		"D\7D\u03e1\nD\fD\16D\u03e4\13D\3D\3D\5D\u03e8\nD\3E\3E\3E\7E\u03ed\nE"+
		"\fE\16E\u03f0\13E\3E\5E\u03f3\nE\3F\3F\3F\5F\u03f8\nF\3F\3F\3F\3F\3F\3"+
		"F\3G\3G\3G\3H\3H\3H\5H\u0406\nH\3I\3I\3I\5I\u040b\nI\3I\3I\5I\u040f\n"+
		"I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\7"+
		"L\u0427\nL\fL\16L\u042a\13L\3M\3M\3M\7M\u042f\nM\fM\16M\u0432\13M\3N\3"+
		"N\3N\7N\u0437\nN\fN\16N\u043a\13N\3O\3O\3O\3O\7O\u0440\nO\fO\16O\u0443"+
		"\13O\3P\3P\3P\3P\7P\u0449\nP\fP\16P\u044c\13P\3Q\3Q\3Q\3Q\7Q\u0452\nQ"+
		"\fQ\16Q\u0455\13Q\3Q\3Q\3Q\3Q\5Q\u045b\nQ\5Q\u045d\nQ\3R\3R\3R\7R\u0462"+
		"\nR\fR\16R\u0465\13R\3S\3S\3S\7S\u046a\nS\fS\16S\u046d\13S\3T\3T\3T\7"+
		"T\u0472\nT\fT\16T\u0475\13T\3U\3U\3U\3U\7U\u047b\nU\fU\16U\u047e\13U\3"+
		"V\3V\3V\3V\7V\u0484\nV\fV\16V\u0487\13V\3W\3W\3W\3W\7W\u048d\nW\fW\16"+
		"W\u0490\13W\3X\7X\u0493\nX\fX\16X\u0496\13X\3X\3X\3Y\3Y\3Y\5Y\u049d\n"+
		"Y\3Y\3Y\7Y\u04a1\nY\fY\16Y\u04a4\13Y\3Y\3Y\7Y\u04a8\nY\fY\16Y\u04ab\13"+
		"Y\5Y\u04ad\nY\3Z\3Z\7Z\u04b1\nZ\fZ\16Z\u04b4\13Z\5Z\u04b6\nZ\3Z\5Z\u04b9"+
		"\nZ\3Z\3Z\3Z\5Z\u04be\nZ\3Z\5Z\u04c1\nZ\3[\3[\3[\3[\3[\3[\3[\5[\u04ca"+
		"\n[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\7\\\u04d4\n\\\f\\\16\\\u04d7\13\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\7\\\u04e1\n\\\f\\\16\\\u04e4\13\\\3\\"+
		"\5\\\u04e7\n\\\3]\3]\3]\3]\3]\3]\3]\3]\3]\5]\u04f2\n]\3]\3]\3]\3]\3]\5"+
		"]\u04f9\n]\3]\5]\u04fc\n]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\5]\u0508\n]\3"+
		"^\3^\3^\3^\3^\3^\3^\5^\u0511\n^\3_\3_\3_\3_\3_\5_\u0518\n_\3`\3`\5`\u051c"+
		"\n`\3a\3a\3b\3b\3c\3c\3d\3d\3e\3e\3f\3f\3g\3g\3h\3h\3i\3i\3i\3i\3i\3i"+
		"\3i\5i\u0535\ni\3j\3j\3j\3j\3j\3j\3j\3j\5j\u053f\nj\3k\3k\7k\u0543\nk"+
		"\fk\16k\u0546\13k\3k\5k\u0549\nk\3k\3k\3l\3l\3l\5l\u0550\nl\5l\u0552\n"+
		"l\3m\3m\3m\3m\3m\3m\3m\3m\7m\u055c\nm\fm\16m\u055f\13m\5m\u0561\nm\3m"+
		"\3m\3m\3m\5m\u0567\nm\3n\3n\3n\5n\u056c\nn\3o\3o\3o\3o\7o\u0572\no\fo"+
		"\16o\u0575\13o\5o\u0577\no\3o\3o\3p\3p\3p\3p\3p\7p\u0580\np\fp\16p\u0583"+
		"\13p\5p\u0585\np\3p\3p\3q\3q\3q\3q\3q\5q\u058e\nq\3q\3q\7q\u0592\nq\f"+
		"q\16q\u0595\13q\3q\3q\3r\3r\3r\7r\u059c\nr\fr\16r\u059f\13r\3r\3r\3r\7"+
		"r\u05a4\nr\fr\16r\u05a7\13r\3r\3r\3r\3r\7r\u05ad\nr\fr\16r\u05b0\13r\5"+
		"r\u05b2\nr\3s\3s\3s\3s\3s\5s\u05b9\ns\3t\3t\5t\u05bd\nt\3t\3t\3t\7t\u05c2"+
		"\nt\ft\16t\u05c5\13t\5t\u05c7\nt\3t\5t\u05ca\nt\3t\3t\3t\3t\3u\3u\5u\u05d2"+
		"\nu\3v\5v\u05d5\nv\3v\3v\3v\3v\3v\5v\u05dc\nv\3w\3w\3w\3w\3w\3w\5w\u05e4"+
		"\nw\3x\5x\u05e7\nx\3x\3x\3x\3x\3y\5y\u05ee\ny\3y\3y\3y\3y\5y\u05f4\ny"+
		"\3y\7y\u05f7\ny\fy\16y\u05fa\13y\3z\3z\5z\u05fe\nz\3{\5{\u0601\n{\3{\3"+
		"{\3{\3{\3{\7{\u0608\n{\f{\16{\u060b\13{\3{\3{\3{\3{\3{\3{\5{\u0613\n{"+
		"\3{\7{\u0616\n{\f{\16{\u0619\13{\3|\3|\5|\u061d\n|\3|\3|\3|\5|\u0622\n"+
		"|\3|\7|\u0625\n|\f|\16|\u0628\13|\3}\3}\3}\3}\3~\3~\5~\u0630\n~\3~\3~"+
		"\3~\7~\u0635\n~\f~\16~\u0638\13~\3~\3~\3~\3~\3~\3~\5~\u0640\n~\3~\7~\u0643"+
		"\n~\f~\16~\u0646\13~\3\177\3\177\3\177\7\177\u064b\n\177\f\177\16\177"+
		"\u064e\13\177\3\u0080\3\u0080\3\u0080\7\u0080\u0653\n\u0080\f\u0080\16"+
		"\u0080\u0656\13\u0080\3\u0081\5\u0081\u0659\n\u0081\3\u0081\5\u0081\u065c"+
		"\n\u0081\3\u0081\5\u0081\u065f\n\u0081\3\u0081\5\u0081\u0662\n\u0081\5"+
		"\u0081\u0664\n\u0081\3\u0081\7\u0081\u0667\n\u0081\f\u0081\16\u0081\u066a"+
		"\13\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\5\u0082\u0675\n\u0082\3\u0082\3\u0082\5\u0082\u0679\n\u0082\3"+
		"\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\5\u0083\u0684\n\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u0689\n\u0083\3"+
		"\u0084\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0088"+
		"\3\u0088\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\2\2\u008b\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\2\24\4\2EFY]\3\2?@\3\2yy\3\2~~\4\2\21\21"+
		"*+\3\2,-\3\2./\4\2\33\33\62\63\3\2\60\61\3\2\23\26\4\2\30\30\32\32\4\2"+
		"\27\27\648\3\2RU\3\2GJ\3\2NQ\3\2KM\3\2RV\4\2..WW\u0737\2\u0114\3\2\2\2"+
		"\4\u011c\3\2\2\2\6\u0124\3\2\2\2\b\u0133\3\2\2\2\n\u014e\3\2\2\2\f\u0158"+
		"\3\2\2\2\16\u015b\3\2\2\2\20\u015d\3\2\2\2\22\u0168\3\2\2\2\24\u016e\3"+
		"\2\2\2\26\u0184\3\2\2\2\30\u0187\3\2\2\2\32\u018e\3\2\2\2\34\u01ad\3\2"+
		"\2\2\36\u01b1\3\2\2\2 \u01bf\3\2\2\2\"\u01c1\3\2\2\2$\u01cf\3\2\2\2&\u01d8"+
		"\3\2\2\2(\u01da\3\2\2\2*\u01dd\3\2\2\2,\u01ec\3\2\2\2.\u01fa\3\2\2\2\60"+
		"\u01fd\3\2\2\2\62\u0206\3\2\2\2\64\u0209\3\2\2\2\66\u020d\3\2\2\28\u0215"+
		"\3\2\2\2:\u021a\3\2\2\2<\u0221\3\2\2\2>\u022e\3\2\2\2@\u024d\3\2\2\2B"+
		"\u024f\3\2\2\2D\u0256\3\2\2\2F\u0259\3\2\2\2H\u025f\3\2\2\2J\u0261\3\2"+
		"\2\2L\u0264\3\2\2\2N\u026a\3\2\2\2P\u026c\3\2\2\2R\u0272\3\2\2\2T\u027a"+
		"\3\2\2\2V\u028a\3\2\2\2X\u02ab\3\2\2\2Z\u02b8\3\2\2\2\\\u02ba\3\2\2\2"+
		"^\u02c0\3\2\2\2`\u02c7\3\2\2\2b\u02c9\3\2\2\2d\u02eb\3\2\2\2f\u030d\3"+
		"\2\2\2h\u0316\3\2\2\2j\u0326\3\2\2\2l\u0331\3\2\2\2n\u0342\3\2\2\2p\u0347"+
		"\3\2\2\2r\u034a\3\2\2\2t\u0357\3\2\2\2v\u0375\3\2\2\2x\u0394\3\2\2\2z"+
		"\u03af\3\2\2\2|\u03b1\3\2\2\2~\u03b5\3\2\2\2\u0080\u03bd\3\2\2\2\u0082"+
		"\u03cb\3\2\2\2\u0084\u03ce\3\2\2\2\u0086\u03da\3\2\2\2\u0088\u03e9\3\2"+
		"\2\2\u008a\u03f4\3\2\2\2\u008c\u03ff\3\2\2\2\u008e\u0405\3\2\2\2\u0090"+
		"\u0407\3\2\2\2\u0092\u0415\3\2\2\2\u0094\u041b\3\2\2\2\u0096\u0422\3\2"+
		"\2\2\u0098\u042b\3\2\2\2\u009a\u0433\3\2\2\2\u009c\u043b\3\2\2\2\u009e"+
		"\u0444\3\2\2\2\u00a0\u045c\3\2\2\2\u00a2\u045e\3\2\2\2\u00a4\u0466\3\2"+
		"\2\2\u00a6\u046e\3\2\2\2\u00a8\u0476\3\2\2\2\u00aa\u047f\3\2\2\2\u00ac"+
		"\u0488\3\2\2\2\u00ae\u0494\3\2\2\2\u00b0\u04ac\3\2\2\2\u00b2\u04b8\3\2"+
		"\2\2\u00b4\u04c9\3\2\2\2\u00b6\u04e6\3\2\2\2\u00b8\u0507\3\2\2\2\u00ba"+
		"\u0510\3\2\2\2\u00bc\u0517\3\2\2\2\u00be\u051b\3\2\2\2\u00c0\u051d\3\2"+
		"\2\2\u00c2\u051f\3\2\2\2\u00c4\u0521\3\2\2\2\u00c6\u0523\3\2\2\2\u00c8"+
		"\u0525\3\2\2\2\u00ca\u0527\3\2\2\2\u00cc\u0529\3\2\2\2\u00ce\u052b\3\2"+
		"\2\2\u00d0\u0534\3\2\2\2\u00d2\u053e\3\2\2\2\u00d4\u0544\3\2\2\2\u00d6"+
		"\u0551\3\2\2\2\u00d8\u0566\3\2\2\2\u00da\u0568\3\2\2\2\u00dc\u056d\3\2"+
		"\2\2\u00de\u057a\3\2\2\2\u00e0\u0588\3\2\2\2\u00e2\u05b1\3\2\2\2\u00e4"+
		"\u05b8\3\2\2\2\u00e6\u05ba\3\2\2\2\u00e8\u05d1\3\2\2\2\u00ea\u05d4\3\2"+
		"\2\2\u00ec\u05dd\3\2\2\2\u00ee\u05e6\3\2\2\2\u00f0\u05ed\3\2\2\2\u00f2"+
		"\u05fd\3\2\2\2\u00f4\u0600\3\2\2\2\u00f6\u061c\3\2\2\2\u00f8\u0629\3\2"+
		"\2\2\u00fa\u062f\3\2\2\2\u00fc\u0647\3\2\2\2\u00fe\u064f\3\2\2\2\u0100"+
		"\u0663\3\2\2\2\u0102\u0678\3\2\2\2\u0104\u0688\3\2\2\2\u0106\u068a\3\2"+
		"\2\2\u0108\u068c\3\2\2\2\u010a\u068e\3\2\2\2\u010c\u0690\3\2\2\2\u010e"+
		"\u0692\3\2\2\2\u0110\u0694\3\2\2\2\u0112\u0696\3\2\2\2\u0114\u0118\5\4"+
		"\3\2\u0115\u0117\5\n\6\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\3\3\2\2\2\u011a\u0118\3\2\2\2"+
		"\u011b\u011d\5\6\4\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0121"+
		"\3\2\2\2\u011e\u0120\5\b\5\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\5\3\2\2\2\u0123\u0121\3\2\2\2"+
		"\u0124\u0125\7\16\2\2\u0125\u012a\5\u00b4[\2\u0126\u0127\7\20\2\2\u0127"+
		"\u0129\5\u00b4[\2\u0128\u0126\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128"+
		"\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0130\3\2\2\2\u012c\u012a\3\2\2\2\u012d"+
		"\u012f\7\7\2\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2"+
		"\2\2\u0130\u0131\3\2\2\2\u0131\7\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134"+
		"\7\17\2\2\u0134\u0139\5\u00b4[\2\u0135\u0136\7\20\2\2\u0136\u0138\5\u00b4"+
		"[\2\u0137\u0135\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u0140\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7\20"+
		"\2\2\u013d\u0141\7\21\2\2\u013e\u013f\7\62\2\2\u013f\u0141\7v\2\2\u0140"+
		"\u013c\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0145\3\2"+
		"\2\2\u0142\u0144\7\7\2\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\t\3\2\2\2\u0147\u0145\3\2\2\2"+
		"\u0148\u014f\5\u00e8u\2\u0149\u014f\5t;\2\u014a\u014f\5b\62\2\u014b\u014f"+
		"\5d\63\2\u014c\u014f\5h\65\2\u014d\u014f\5j\66\2\u014e\u0148\3\2\2\2\u014e"+
		"\u0149\3\2\2\2\u014e\u014a\3\2\2\2\u014e\u014b\3\2\2\2\u014e\u014c\3\2"+
		"\2\2\u014e\u014d\3\2\2\2\u014f\13\3\2\2\2\u0150\u0159\5l\67\2\u0151\u0159"+
		"\5h\65\2\u0152\u0159\5t;\2\u0153\u0159\5\u00e8u\2\u0154\u0159\5b\62\2"+
		"\u0155\u0159\5d\63\2\u0156\u0159\5~@\2\u0157\u0159\5V,\2\u0158\u0150\3"+
		"\2\2\2\u0158\u0151\3\2\2\2\u0158\u0152\3\2\2\2\u0158\u0153\3\2\2\2\u0158"+
		"\u0154\3\2\2\2\u0158\u0155\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2"+
		"\2\2\u0159\r\3\2\2\2\u015a\u015c\5\u0112\u008a\2\u015b\u015a\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\17\3\2\2\2\u015d\u015e\7\23\2\2\u015e\u0163\5\22"+
		"\n\2\u015f\u0160\7\22\2\2\u0160\u0162\5\22\n\2\u0161\u015f\3\2\2\2\u0162"+
		"\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2"+
		"\2\2\u0165\u0163\3\2\2\2\u0166\u0167\7\25\2\2\u0167\21\3\2\2\2\u0168\u0169"+
		"\5.\30\2\u0169\u016c\7v\2\2\u016a\u016b\7\33\2\2\u016b\u016d\5\36\20\2"+
		"\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\23\3\2\2\2\u016e\u0170"+
		"\7\23\2\2\u016f\u0171\5\32\16\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2\2"+
		"\2\u0171\u0176\3\2\2\2\u0172\u0173\7\22\2\2\u0173\u0175\5\32\16\2\u0174"+
		"\u0172\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2"+
		"\2\2\u0177\u0179\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017a\7\25\2\2\u017a"+
		"\25\3\2\2\2\u017b\u017c\7D\2\2\u017c\u0181\5\30\r\2\u017d\u017e\7\22\2"+
		"\2\u017e\u0180\5\30\r\2\u017f\u017d\3\2\2\2\u0180\u0183\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2"+
		"\2\2\u0184\u017b\3\2\2\2\u0184\u0185\3\2\2\2\u0185\27\3\2\2\2\u0186\u0188"+
		"\5\64\33\2\u0187\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\3\2\2\2"+
		"\u0189\u018a\7v\2\2\u018a\u018b\7\33\2\2\u018b\u018c\5\32\16\2\u018c\31"+
		"\3\2\2\2\u018d\u018f\5\64\33\2\u018e\u018d\3\2\2\2\u018e\u018f\3\2\2\2"+
		"\u018f\u0190\3\2\2\2\u0190\u0191\5\34\17\2\u0191\33\3\2\2\2\u0192\u0193"+
		"\7\34\2\2\u0193\u0194\5\34\17\2\u0194\u0196\7\35\2\2\u0195\u0197\7\36"+
		"\2\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2\2\2\u0198"+
		"\u019a\5(\25\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u01ae\3\2"+
		"\2\2\u019b\u019d\5*\26\2\u019c\u019e\5(\25\2\u019d\u019c\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u01ae\3\2\2\2\u019f\u01a1\5\36\20\2\u01a0\u01a2\7"+
		"\36\2\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3"+
		"\u01a5\5(\25\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01ae\3\2"+
		"\2\2\u01a6\u01a8\7C\2\2\u01a7\u01a9\7\36\2\2\u01a8\u01a7\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01ac\5(\25\2\u01ab\u01aa\3\2"+
		"\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u0192\3\2\2\2\u01ad"+
		"\u019b\3\2\2\2\u01ad\u019f\3\2\2\2\u01ad\u01a6\3\2\2\2\u01ae\35\3\2\2"+
		"\2\u01af\u01b0\7\16\2\2\u01b0\u01b2\7\20\2\2\u01b1\u01af\3\2\2\2\u01b1"+
		"\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b8\5\"\22\2\u01b4\u01b5\7"+
		"\20\2\2\u01b5\u01b7\5\"\22\2\u01b6\u01b4\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8"+
		"\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\37\3\2\2\2\u01ba\u01b8\3\2\2"+
		"\2\u01bb\u01c0\7\21\2\2\u01bc\u01bd\5\16\b\2\u01bd\u01be\5\32\16\2\u01be"+
		"\u01c0\3\2\2\2\u01bf\u01bb\3\2\2\2\u01bf\u01bc\3\2\2\2\u01c0!\3\2\2\2"+
		"\u01c1\u01cd\7v\2\2\u01c2\u01c3\7\23\2\2\u01c3\u01c8\5 \21\2\u01c4\u01c5"+
		"\7\22\2\2\u01c5\u01c7\5 \21\2\u01c6\u01c4\3\2\2\2\u01c7\u01ca\3\2\2\2"+
		"\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01c8"+
		"\3\2\2\2\u01cb\u01cc\7\25\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01c2\3\2\2\2"+
		"\u01cd\u01ce\3\2\2\2\u01ce#\3\2\2\2\u01cf\u01d2\7v\2\2\u01d0\u01d1\7\33"+
		"\2\2\u01d1\u01d3\5\32\16\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"%\3\2\2\2\u01d4\u01d9\5F$\2\u01d5\u01d6\5.\30\2\u01d6\u01d7\5\32\16\2"+
		"\u01d7\u01d9\3\2\2\2\u01d8\u01d4\3\2\2\2\u01d8\u01d5\3\2\2\2\u01d9\'\3"+
		"\2\2\2\u01da\u01db\7\20\2\2\u01db\u01dc\5*\26\2\u01dc)\3\2\2\2\u01dd\u01e6"+
		"\7\34\2\2\u01de\u01e3\5&\24\2\u01df\u01e0\7\22\2\2\u01e0\u01e2\5&\24\2"+
		"\u01e1\u01df\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4"+
		"\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01de\3\2\2\2\u01e6"+
		"\u01e7\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\7\35\2\2\u01e9\u01ea\7"+
		")\2\2\u01ea\u01eb\5\32\16\2\u01eb+\3\2\2\2\u01ec\u01ed\7\34\2\2\u01ed"+
		"\u01f2\5$\23\2\u01ee\u01ef\7\22\2\2\u01ef\u01f1\5$\23\2\u01f0\u01ee\3"+
		"\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"\u01f5\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f6\7\35\2\2\u01f6-\3\2\2\2"+
		"\u01f7\u01f9\5\60\31\2\u01f8\u01f7\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8"+
		"\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb/\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd"+
		"\u01fe\5\62\32\2\u01fe\61\3\2\2\2\u01ff\u0207\5\u010a\u0086\2\u0200\u0207"+
		"\5\u0110\u0089\2\u0201\u0207\5\u0112\u008a\2\u0202\u0207\5\64\33\2\u0203"+
		"\u0207\5\u010c\u0087\2\u0204\u0207\5\u010e\u0088\2\u0205\u0207\7A\2\2"+
		"\u0206\u01ff\3\2\2\2\u0206\u0200\3\2\2\2\u0206\u0201\3\2\2\2\u0206\u0202"+
		"\3\2\2\2\u0206\u0203\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0205\3\2\2\2\u0207"+
		"\63\3\2\2\2\u0208\u020a\5\66\34\2\u0209\u0208\3\2\2\2\u020a\u020b\3\2"+
		"\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\65\3\2\2\2\u020d\u0211"+
		"\7X\2\2\u020e\u020f\58\35\2\u020f\u0210\7\33\2\2\u0210\u0212\3\2\2\2\u0211"+
		"\u020e\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\5>"+
		" \2\u0214\67\3\2\2\2\u0215\u0216\t\2\2\2\u02169\3\2\2\2\u0217\u0218\5"+
		"\u00b4[\2\u0218\u0219\7\27\2\2\u0219\u021b\3\2\2\2\u021a\u0217\3\2\2\2"+
		"\u021a\u021b\3\2\2\2\u021b\u021d\3\2\2\2\u021c\u021e\7\21\2\2\u021d\u021c"+
		"\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\5\u0096L"+
		"\2\u0220;\3\2\2\2\u0221\u022a\7\34\2\2\u0222\u0227\5:\36\2\u0223\u0224"+
		"\7\22\2\2\u0224\u0226\5:\36\2\u0225\u0223\3\2\2\2\u0226\u0229\3\2\2\2"+
		"\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227"+
		"\3\2\2\2\u022a\u0222\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\3\2\2\2\u022c"+
		"\u022d\7\35\2\2\u022d=\3\2\2\2\u022e\u0233\5\u00b4[\2\u022f\u0230\7\20"+
		"\2\2\u0230\u0232\5\u00b4[\2\u0231\u022f\3\2\2\2\u0232\u0235\3\2\2\2\u0233"+
		"\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0233\3\2"+
		"\2\2\u0236\u0238\5\24\13\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"\u023a\3\2\2\2\u0239\u023b\5<\37\2\u023a\u0239\3\2\2\2\u023a\u023b\3\2"+
		"\2\2\u023b?\3\2\2\2\u023c\u023d\7^\2\2\u023d\u024e\5\u0096L\2\u023e\u0240"+
		"\7`\2\2\u023f\u0241\5B\"\2\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0243\3\2\2\2\u0242\u0244\5\u0096L\2\u0243\u0242\3\2\2\2\u0243\u0244"+
		"\3\2\2\2\u0244\u024e\3\2\2\2\u0245\u0247\7_\2\2\u0246\u0248\5B\"\2\u0247"+
		"\u0246\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u024e\3\2\2\2\u0249\u024b\7a"+
		"\2\2\u024a\u024c\5B\"\2\u024b\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c"+
		"\u024e\3\2\2\2\u024d\u023c\3\2\2\2\u024d\u023e\3\2\2\2\u024d\u0245\3\2"+
		"\2\2\u024d\u0249\3\2\2\2\u024eA\3\2\2\2\u024f\u0254\7X\2\2\u0250\u0255"+
		"\5\u00b4[\2\u0251\u0255\7p\2\2\u0252\u0255\7o\2\2\u0253\u0255\7n\2\2\u0254"+
		"\u0250\3\2\2\2\u0254\u0251\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0253\3\2"+
		"\2\2\u0255C\3\2\2\2\u0256\u0257\5\u00b4[\2\u0257\u0258\7X\2\2\u0258E\3"+
		"\2\2\2\u0259\u025a\7v\2\2\u025a\u025b\7\33\2\2\u025b\u025c\5\32\16\2\u025c"+
		"G\3\2\2\2\u025d\u0260\5J&\2\u025e\u0260\5L\'\2\u025f\u025d\3\2\2\2\u025f"+
		"\u025e\3\2\2\2\u0260I\3\2\2\2\u0261\u0262\5.\30\2\u0262\u0263\5F$\2\u0263"+
		"K\3\2\2\2\u0264\u0265\5J&\2\u0265\u0266\7\27\2\2\u0266\u0267\5\u0096L"+
		"\2\u0267M\3\2\2\2\u0268\u026b\5P)\2\u0269\u026b\5R*\2\u026a\u0268\3\2"+
		"\2\2\u026a\u0269\3\2\2\2\u026bO\3\2\2\2\u026c\u026e\5.\30\2\u026d\u026f"+
		"\t\3\2\2\u026e\u026d\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\3\2\2\2\u0270"+
		"\u0271\5F$\2\u0271Q\3\2\2\2\u0272\u0273\5P)\2\u0273\u0274\7\27\2\2\u0274"+
		"\u0275\5\u0096L\2\u0275S\3\2\2\2\u0276\u0278\5\u0110\u0089\2\u0277\u0276"+
		"\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027b\7b\2\2\u027a"+
		"\u0277\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u0285\7\34"+
		"\2\2\u027d\u0282\5N(\2\u027e\u027f\7\22\2\2\u027f\u0281\5N(\2\u0280\u027e"+
		"\3\2\2\2\u0281\u0284\3\2\2\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283"+
		"\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0285\u027d\3\2\2\2\u0285\u0286\3\2"+
		"\2\2\u0286\u0287\3\2\2\2\u0287\u0288\7\35\2\2\u0288U\3\2\2\2\u0289\u028b"+
		"\5\u0110\u0089\2\u028a\u0289\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028c\3"+
		"\2\2\2\u028c\u028d\7b\2\2\u028d\u0296\7\34\2\2\u028e\u0293\5N(\2\u028f"+
		"\u0290\7\22\2\2\u0290\u0292\5N(\2\u0291\u028f\3\2\2\2\u0292\u0295\3\2"+
		"\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0297\3\2\2\2\u0295"+
		"\u0293\3\2\2\2\u0296\u028e\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0298\3\2"+
		"\2\2\u0298\u0299\7\35\2\2\u0299\u029c\3\2\2\2\u029a\u029b\7\33\2\2\u029b"+
		"\u029d\5X-\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029f\3\2\2"+
		"\2\u029e\u02a0\5|?\2\u029f\u029e\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a4"+
		"\3\2\2\2\u02a1\u02a3\7\7\2\2\u02a2\u02a1\3\2\2\2\u02a3\u02a6\3\2\2\2\u02a4"+
		"\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5W\3\2\2\2\u02a6\u02a4\3\2\2\2"+
		"\u02a7\u02a8\7c\2\2\u02a8\u02ac\5<\37\2\u02a9\u02aa\7d\2\2\u02aa\u02ac"+
		"\5<\37\2\u02ab\u02a7\3\2\2\2\u02ab\u02a9\3\2\2\2\u02acY\3\2\2\2\u02ad"+
		"\u02af\5\24\13\2\u02ae\u02ad\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b0\3"+
		"\2\2\2\u02b0\u02b2\5<\37\2\u02b1\u02b3\5\u00d4k\2\u02b2\u02b1\3\2\2\2"+
		"\u02b2\u02b3\3\2\2\2\u02b3\u02b9\3\2\2\2\u02b4\u02b5\5\24\13\2\u02b5\u02b6"+
		"\5\u00d4k\2\u02b6\u02b9\3\2\2\2\u02b7\u02b9\5\u00d4k\2\u02b8\u02ae\3\2"+
		"\2\2\u02b8\u02b4\3\2\2\2\u02b8\u02b7\3\2\2\2\u02b9[\3\2\2\2\u02ba\u02bc"+
		"\5\36\20\2\u02bb\u02bd\5\24\13\2\u02bc\u02bb\3\2\2\2\u02bc\u02bd\3\2\2"+
		"\2\u02bd\u02be\3\2\2\2\u02be\u02bf\5<\37\2\u02bf]\3\2\2\2\u02c0\u02c1"+
		"\5\36\20\2\u02c1\u02c2\7B\2\2\u02c2\u02c3\5\u0096L\2\u02c3_\3\2\2\2\u02c4"+
		"\u02c8\5\\/\2\u02c5\u02c8\5\36\20\2\u02c6\u02c8\5^\60\2\u02c7\u02c4\3"+
		"\2\2\2\u02c7\u02c5\3\2\2\2\u02c7\u02c6\3\2\2\2\u02c8a\3\2\2\2\u02c9\u02ca"+
		"\5.\30\2\u02ca\u02cb\7e\2\2\u02cb\u02cd\7v\2\2\u02cc\u02ce\5\20\t\2\u02cd"+
		"\u02cc\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02d0\3\2\2\2\u02cf\u02d1\5T"+
		"+\2\u02d0\u02cf\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02de\3\2\2\2\u02d2"+
		"\u02d4\7\33\2\2\u02d3\u02d5\5\64\33\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5"+
		"\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02db\5`\61\2\u02d7\u02d8\7\22\2\2"+
		"\u02d8\u02da\5`\61\2\u02d9\u02d7\3\2\2\2\u02da\u02dd\3\2\2\2\u02db\u02d9"+
		"\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd\u02db\3\2\2\2\u02de"+
		"\u02d2\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e3\5\26"+
		"\f\2\u02e1\u02e4\5n8\2\u02e2\u02e4\5\u0080A\2\u02e3\u02e1\3\2\2\2\u02e3"+
		"\u02e2\3\2\2\2\u02e4\u02e8\3\2\2\2\u02e5\u02e7\7\7\2\2\u02e6\u02e5\3\2"+
		"\2\2\u02e7\u02ea\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9"+
		"c\3\2\2\2\u02ea\u02e8\3\2\2\2\u02eb\u02ec\5.\30\2\u02ec\u02ed\7f\2\2\u02ed"+
		"\u02ef\7v\2\2\u02ee\u02f0\5\20\t\2\u02ef\u02ee\3\2\2\2\u02ef\u02f0\3\2"+
		"\2\2\u02f0\u02f2\3\2\2\2\u02f1\u02f3\5T+\2\u02f2\u02f1\3\2\2\2\u02f2\u02f3"+
		"\3\2\2\2\u02f3\u0300\3\2\2\2\u02f4\u02f6\7\33\2\2\u02f5\u02f7\5\64\33"+
		"\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02fd"+
		"\5`\61\2\u02f9\u02fa\7\22\2\2\u02fa\u02fc\5`\61\2\u02fb\u02f9\3\2\2\2"+
		"\u02fc\u02ff\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u0301"+
		"\3\2\2\2\u02ff\u02fd\3\2\2\2\u0300\u02f4\3\2\2\2\u0300\u0301\3\2\2\2\u0301"+
		"\u0302\3\2\2\2\u0302\u0305\5\26\f\2\u0303\u0306\5n8\2\u0304\u0306\5\u0080"+
		"A\2\u0305\u0303\3\2\2\2\u0305\u0304\3\2\2\2\u0306\u030a\3\2\2\2\u0307"+
		"\u0309\7\7\2\2\u0308\u0307\3\2\2\2\u0309\u030c\3\2\2\2\u030a\u0308\3\2"+
		"\2\2\u030a\u030b\3\2\2\2\u030be\3\2\2\2\u030c\u030a\3\2\2\2\u030d\u030e"+
		"\7\33\2\2\u030e\u0313\5`\61\2\u030f\u0310\7\22\2\2\u0310\u0312\5`\61\2"+
		"\u0311\u030f\3\2\2\2\u0312\u0315\3\2\2\2\u0313\u0311\3\2\2\2\u0313\u0314"+
		"\3\2\2\2\u0314g\3\2\2\2\u0315\u0313\3\2\2\2\u0316\u0317\5.\30\2\u0317"+
		"\u0318\7g\2\2\u0318\u031a\7v\2\2\u0319\u031b\5T+\2\u031a\u0319\3\2\2\2"+
		"\u031a\u031b\3\2\2\2\u031b\u031d\3\2\2\2\u031c\u031e\5f\64\2\u031d\u031c"+
		"\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0323\5n8\2\u0320"+
		"\u0322\7\7\2\2\u0321\u0320\3\2\2\2\u0322\u0325\3\2\2\2\u0323\u0321\3\2"+
		"\2\2\u0323\u0324\3\2\2\2\u0324i\3\2\2\2\u0325\u0323\3\2\2\2\u0326\u0327"+
		"\5.\30\2\u0327\u0328\7j\2\2\u0328\u0329\7v\2\2\u0329\u032a\7\27\2\2\u032a"+
		"\u032e\5\"\22\2\u032b\u032d\7\7\2\2\u032c\u032b\3\2\2\2\u032d\u0330\3"+
		"\2\2\2\u032e\u032c\3\2\2\2\u032e\u032f\3\2\2\2\u032fk\3\2\2\2\u0330\u032e"+
		"\3\2\2\2\u0331\u0332\5.\30\2\u0332\u0333\7h\2\2\u0333\u0335\7g\2\2\u0334"+
		"\u0336\5f\64\2\u0335\u0334\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0337\3\2"+
		"\2\2\u0337\u033b\5n8\2\u0338\u033a\7\7\2\2\u0339\u0338\3\2\2\2\u033a\u033d"+
		"\3\2\2\2\u033b\u0339\3\2\2\2\u033b\u033c\3\2\2\2\u033cm\3\2\2\2\u033d"+
		"\u033b\3\2\2\2\u033e\u033f\7\b\2\2\u033f\u0340\5p9\2\u0340\u0341\7\t\2"+
		"\2\u0341\u0343\3\2\2\2\u0342\u033e\3\2\2\2\u0342\u0343\3\2\2\2\u0343o"+
		"\3\2\2\2\u0344\u0346\5\f\7\2\u0345\u0344\3\2\2\2\u0346\u0349\3\2\2\2\u0347"+
		"\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348q\3\2\2\2\u0349\u0347\3\2\2\2"+
		"\u034a\u0353\7\34\2\2\u034b\u0350\5H%\2\u034c\u034d\7\22\2\2\u034d\u034f"+
		"\5H%\2\u034e\u034c\3\2\2\2\u034f\u0352\3\2\2\2\u0350\u034e\3\2\2\2\u0350"+
		"\u0351\3\2\2\2\u0351\u0354\3\2\2\2\u0352\u0350\3\2\2\2\u0353\u034b\3\2"+
		"\2\2\u0353\u0354\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0356\7\35\2\2\u0356"+
		"s\3\2\2\2\u0357\u0358\5.\30\2\u0358\u035a\7i\2\2\u0359\u035b\5\20\t\2"+
		"\u035a\u0359\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u0360\3\2\2\2\u035c\u035d"+
		"\5\32\16\2\u035d\u035e\7\20\2\2\u035e\u0361\3\2\2\2\u035f\u0361\5\64\33"+
		"\2\u0360\u035c\3\2\2\2\u0360\u035f\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0362"+
		"\3\2\2\2\u0362\u0364\7v\2\2\u0363\u0365\5\20\t\2\u0364\u0363\3\2\2\2\u0364"+
		"\u0365\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0369\5r:\2\u0367\u0368\7\33"+
		"\2\2\u0368\u036a\5\32\16\2\u0369\u0367\3\2\2\2\u0369\u036a\3\2\2\2\u036a"+
		"\u036b\3\2\2\2\u036b\u036d\5\26\f\2\u036c\u036e\5z>\2\u036d\u036c\3\2"+
		"\2\2\u036d\u036e\3\2\2\2\u036e\u0372\3\2\2\2\u036f\u0371\7\7\2\2\u0370"+
		"\u036f\3\2\2\2\u0371\u0374\3\2\2\2\u0372\u0370\3\2\2\2\u0372\u0373\3\2"+
		"\2\2\u0373u\3\2\2\2\u0374\u0372\3\2\2\2\u0375\u0377\7i\2\2\u0376\u0378"+
		"\5\20\t\2\u0377\u0376\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u037d\3\2\2\2"+
		"\u0379\u037a\5\32\16\2\u037a\u037b\7\20\2\2\u037b\u037e\3\2\2\2\u037c"+
		"\u037e\5\64\33\2\u037d\u0379\3\2\2\2\u037d\u037c\3\2\2\2\u037d\u037e\3"+
		"\2\2\2\u037e\u0380\3\2\2\2\u037f\u0381\5\20\t\2\u0380\u037f\3\2\2\2\u0380"+
		"\u0381\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0385\5r:\2\u0383\u0384\7\33"+
		"\2\2\u0384\u0386\5\32\16\2\u0385\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386"+
		"\u0387\3\2\2\2\u0387\u0389\5\26\f\2\u0388\u038a\5z>\2\u0389\u0388\3\2"+
		"\2\2\u0389\u038a\3\2\2\2\u038a\u038e\3\2\2\2\u038b\u038d\7\7\2\2\u038c"+
		"\u038b\3\2\2\2\u038d\u0390\3\2\2\2\u038e\u038c\3\2\2\2\u038e\u038f\3\2"+
		"\2\2\u038fw\3\2\2\2\u0390\u038e\3\2\2\2\u0391\u0393\7\7\2\2\u0392\u0391"+
		"\3\2\2\2\u0393\u0396\3\2\2\2\u0394\u0392\3\2\2\2\u0394\u0395\3\2\2\2\u0395"+
		"\u03a4\3\2\2\2\u0396\u0394\3\2\2\2\u0397\u03a1\5\u00be`\2\u0398\u039a"+
		"\7\7\2\2\u0399\u0398\3\2\2\2\u039a\u039d\3\2\2\2\u039b\u0399\3\2\2\2\u039b"+
		"\u039c\3\2\2\2\u039c\u039e\3\2\2\2\u039d\u039b\3\2\2\2\u039e\u03a0\5\u00be"+
		"`\2\u039f\u039b\3\2\2\2\u03a0\u03a3\3\2\2\2\u03a1\u039f\3\2\2\2\u03a1"+
		"\u03a2\3\2\2\2\u03a2\u03a5\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a4\u0397\3\2"+
		"\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a9\3\2\2\2\u03a6\u03a8\7\7\2\2\u03a7"+
		"\u03a6\3\2\2\2\u03a8\u03ab\3\2\2\2\u03a9\u03a7\3\2\2\2\u03a9\u03aa\3\2"+
		"\2\2\u03aay\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ac\u03b0\5|?\2\u03ad\u03ae"+
		"\7\27\2\2\u03ae\u03b0\5\u0096L\2\u03af\u03ac\3\2\2\2\u03af\u03ad\3\2\2"+
		"\2\u03b0{\3\2\2\2\u03b1\u03b2\7\b\2\2\u03b2\u03b3\5x=\2\u03b3\u03b4\7"+
		"\t\2\2\u03b4}\3\2\2\2\u03b5\u03b6\7k\2\2\u03b6\u03ba\5|?\2\u03b7\u03b9"+
		"\7\7\2\2\u03b8\u03b7\3\2\2\2\u03b9\u03bc\3\2\2\2\u03ba\u03b8\3\2\2\2\u03ba"+
		"\u03bb\3\2\2\2\u03bb\177\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bd\u03be\7\b\2"+
		"\2\u03be\u03c1\5\u0082B\2\u03bf\u03c0\7\7\2\2\u03c0\u03c2\5p9\2\u03c1"+
		"\u03bf\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c4\7\t"+
		"\2\2\u03c4\u0081\3\2\2\2\u03c5\u03c7\5\u0084C\2\u03c6\u03c8\7\22\2\2\u03c7"+
		"\u03c6\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03ca\3\2\2\2\u03c9\u03c5\3\2"+
		"\2\2\u03ca\u03cd\3\2\2\2\u03cb\u03c9\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc"+
		"\u0083\3\2\2\2\u03cd\u03cb\3\2\2\2\u03ce\u03cf\5.\30\2\u03cf\u03d6\7v"+
		"\2\2\u03d0\u03d2\7\33\2\2\u03d1\u03d3\5\64\33\2\u03d2\u03d1\3\2\2\2\u03d2"+
		"\u03d3\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d7\5\\/\2\u03d5\u03d7\5<\37"+
		"\2\u03d6\u03d0\3\2\2\2\u03d6\u03d5\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d8"+
		"\3\2\2\2\u03d8\u03d9\5n8\2\u03d9\u0085\3\2\2\2\u03da\u03db\7l\2\2\u03db"+
		"\u03dc\7\34\2\2\u03dc\u03dd\5\u0096L\2\u03dd\u03de\7\35\2\2\u03de\u03e2"+
		"\5\u0096L\2\u03df\u03e1\7\7\2\2\u03e0\u03df\3\2\2\2\u03e1\u03e4\3\2\2"+
		"\2\u03e2\u03e0\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e7\3\2\2\2\u03e4\u03e2"+
		"\3\2\2\2\u03e5\u03e6\7m\2\2\u03e6\u03e8\5\u0096L\2\u03e7\u03e5\3\2\2\2"+
		"\u03e7\u03e8\3\2\2\2\u03e8\u0087\3\2\2\2\u03e9\u03ea\7r\2\2\u03ea\u03ee"+
		"\5|?\2\u03eb\u03ed\5\u008aF\2\u03ec\u03eb\3\2\2\2\u03ed\u03f0\3\2\2\2"+
		"\u03ee\u03ec\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f2\3\2\2\2\u03f0\u03ee"+
		"\3\2\2\2\u03f1\u03f3\5\u008cG\2\u03f2\u03f1\3\2\2\2\u03f2\u03f3\3\2\2"+
		"\2\u03f3\u0089\3\2\2\2\u03f4\u03f5\7s\2\2\u03f5\u03f7\7\34\2\2\u03f6\u03f8"+
		"\5\64\33\2\u03f7\u03f6\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03f9\3\2\2\2"+
		"\u03f9\u03fa\7v\2\2\u03fa\u03fb\7\33\2\2\u03fb\u03fc\5\36\20\2\u03fc\u03fd"+
		"\7\35\2\2\u03fd\u03fe\5|?\2\u03fe\u008b\3\2\2\2\u03ff\u0400\7t\2\2\u0400"+
		"\u0401\5|?\2\u0401\u008d\3\2\2\2\u0402\u0406\5\u0090I\2\u0403\u0406\5"+
		"\u0092J\2\u0404\u0406\5\u0094K\2\u0405\u0402\3\2\2\2\u0405\u0403\3\2\2"+
		"\2\u0405\u0404\3\2\2\2\u0406\u008f\3\2\2\2\u0407\u0408\7p\2\2\u0408\u040a"+
		"\7\34\2\2\u0409\u040b\5\64\33\2\u040a\u0409\3\2\2\2\u040a\u040b\3\2\2"+
		"\2\u040b\u040e\3\2\2\2\u040c\u040f\5,\27\2\u040d\u040f\5$\23\2\u040e\u040c"+
		"\3\2\2\2\u040e\u040d\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0411\7.\2\2\u0411"+
		"\u0412\5\u0096L\2\u0412\u0413\7\35\2\2\u0413\u0414\5\u0096L\2\u0414\u0091"+
		"\3\2\2\2\u0415\u0416\7o\2\2\u0416\u0417\7\34\2\2\u0417\u0418\5\u0096L"+
		"\2\u0418\u0419\7\35\2\2\u0419\u041a\5\u0096L\2\u041a\u0093\3\2\2\2\u041b"+
		"\u041c\7q\2\2\u041c\u041d\5\u0096L\2\u041d\u041e\7o\2\2\u041e\u041f\7"+
		"\34\2\2\u041f\u0420\5\u0096L\2\u0420\u0421\7\35\2\2\u0421\u0095\3\2\2"+
		"\2\u0422\u0428\5\u0098M\2\u0423\u0424\5\u00ceh\2\u0424\u0425\5\u0098M"+
		"\2\u0425\u0427\3\2\2\2\u0426\u0423\3\2\2\2\u0427\u042a\3\2\2\2\u0428\u0426"+
		"\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u0097\3\2\2\2\u042a\u0428\3\2\2\2\u042b"+
		"\u0430\5\u009aN\2\u042c\u042d\7 \2\2\u042d\u042f\5\u009aN\2\u042e\u042c"+
		"\3\2\2\2\u042f\u0432\3\2\2\2\u0430\u042e\3\2\2\2\u0430\u0431\3\2\2\2\u0431"+
		"\u0099\3\2\2\2\u0432\u0430\3\2\2\2\u0433\u0438\5\u009cO\2\u0434\u0435"+
		"\7!\2\2\u0435\u0437\5\u009cO\2\u0436\u0434\3\2\2\2\u0437\u043a\3\2\2\2"+
		"\u0438\u0436\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u009b\3\2\2\2\u043a\u0438"+
		"\3\2\2\2\u043b\u0441\5\u009eP\2\u043c\u043d\5\u00ccg\2\u043d\u043e\5\u009e"+
		"P\2\u043e\u0440\3\2\2\2\u043f\u043c\3\2\2\2\u0440\u0443\3\2\2\2\u0441"+
		"\u043f\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u009d\3\2\2\2\u0443\u0441\3\2"+
		"\2\2\u0444\u044a\5\u00a0Q\2\u0445\u0446\5\u00caf\2\u0446\u0447\5\u00a0"+
		"Q\2\u0447\u0449\3\2\2\2\u0448\u0445\3\2\2\2\u0449\u044c\3\2\2\2\u044a"+
		"\u0448\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u009f\3\2\2\2\u044c\u044a\3\2"+
		"\2\2\u044d\u0453\5\u00a2R\2\u044e\u044f\5\u00c4c\2\u044f\u0450\5\u00a2"+
		"R\2\u0450\u0452\3\2\2\2\u0451\u044e\3\2\2\2\u0452\u0455\3\2\2\2\u0453"+
		"\u0451\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u045d\3\2\2\2\u0455\u0453\3\2"+
		"\2\2\u0456\u045a\5\u00a2R\2\u0457\u0458\5\u00c8e\2\u0458\u0459\5\32\16"+
		"\2\u0459\u045b\3\2\2\2\u045a\u0457\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u045d"+
		"\3\2\2\2\u045c\u044d\3\2\2\2\u045c\u0456\3\2\2\2\u045d\u00a1\3\2\2\2\u045e"+
		"\u0463\5\u00a4S\2\u045f\u0460\7\"\2\2\u0460\u0462\5\u00a4S\2\u0461\u045f"+
		"\3\2\2\2\u0462\u0465\3\2\2\2\u0463\u0461\3\2\2\2\u0463\u0464\3\2\2\2\u0464"+
		"\u00a3\3\2\2\2\u0465\u0463\3\2\2\2\u0466\u046b\5\u00a6T\2\u0467\u0468"+
		"\7v\2\2\u0468\u046a\5\u00a6T\2\u0469\u0467\3\2\2\2\u046a\u046d\3\2\2\2"+
		"\u046b\u0469\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u00a5\3\2\2\2\u046d\u046b"+
		"\3\2\2\2\u046e\u0473\5\u00a8U\2\u046f\u0470\7$\2\2\u0470\u0472\5\u00a8"+
		"U\2\u0471\u046f\3\2\2\2\u0472\u0475\3\2\2\2\u0473\u0471\3\2\2\2\u0473"+
		"\u0474\3\2\2\2\u0474\u00a7\3\2\2\2\u0475\u0473\3\2\2\2\u0476\u047c\5\u00aa"+
		"V\2\u0477\u0478\5\u00c2b\2\u0478\u0479\5\u00aaV\2\u0479\u047b\3\2\2\2"+
		"\u047a\u0477\3\2\2\2\u047b\u047e\3\2\2\2\u047c\u047a\3\2\2\2\u047c\u047d"+
		"\3\2\2\2\u047d\u00a9\3\2\2\2\u047e\u047c\3\2\2\2\u047f\u0485\5\u00acW"+
		"\2\u0480\u0481\5\u00c0a\2\u0481\u0482\5\u00acW\2\u0482\u0484\3\2\2\2\u0483"+
		"\u0480\3\2\2\2\u0484\u0487\3\2\2\2\u0485\u0483\3\2\2\2\u0485\u0486\3\2"+
		"\2\2\u0486\u00ab\3\2\2\2\u0487\u0485\3\2\2\2\u0488\u048e\5\u00aeX\2\u0489"+
		"\u048a\5\u00c6d\2\u048a\u048b\5\u00aeX\2\u048b\u048d\3\2\2\2\u048c\u0489"+
		"\3\2\2\2\u048d\u0490\3\2\2\2\u048e\u048c\3\2\2\2\u048e\u048f\3\2\2\2\u048f"+
		"\u00ad\3\2\2\2\u0490\u048e\3\2\2\2\u0491\u0493\5\u00d0i\2\u0492\u0491"+
		"\3\2\2\2\u0493\u0496\3\2\2\2\u0494\u0492\3\2\2\2\u0494\u0495\3\2\2\2\u0495"+
		"\u0497\3\2\2\2\u0496\u0494\3\2\2\2\u0497\u0498\5\u00b0Y\2\u0498\u00af"+
		"\3\2\2\2\u0499\u049a\5\u00b8]\2\u049a\u049c\5Z.\2\u049b\u049d\5\u00e6"+
		"t\2\u049c\u049b\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u04ad\3\2\2\2\u049e"+
		"\u04a2\5\u00b8]\2\u049f\u04a1\5\u00d2j\2\u04a0\u049f\3\2\2\2\u04a1\u04a4"+
		"\3\2\2\2\u04a2\u04a0\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04ad\3\2\2\2\u04a4"+
		"\u04a2\3\2\2\2\u04a5\u04a9\5\u00b2Z\2\u04a6\u04a8\5\u00d2j\2\u04a7\u04a6"+
		"\3\2\2\2\u04a8\u04ab\3\2\2\2\u04a9\u04a7\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa"+
		"\u04ad\3\2\2\2\u04ab\u04a9\3\2\2\2\u04ac\u0499\3\2\2\2\u04ac\u049e\3\2"+
		"\2\2\u04ac\u04a5\3\2\2\2\u04ad\u00b1\3\2\2\2\u04ae\u04b2\5\36\20\2\u04af"+
		"\u04b1\7\36\2\2\u04b0\u04af\3\2\2\2\u04b1\u04b4\3\2\2\2\u04b2\u04b0\3"+
		"\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b6\3\2\2\2\u04b4\u04b2\3\2\2\2\u04b5"+
		"\u04ae\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b9\3\2\2\2\u04b7\u04b9\7c"+
		"\2\2\u04b8\u04b5\3\2\2\2\u04b8\u04b7\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba"+
		"\u04bd\7%\2\2\u04bb\u04be\5\u00b4[\2\u04bc\u04be\7e\2\2\u04bd\u04bb\3"+
		"\2\2\2\u04bd\u04bc\3\2\2\2\u04be\u04c0\3\2\2\2\u04bf\u04c1\5\24\13\2\u04c0"+
		"\u04bf\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u00b3\3\2\2\2\u04c2\u04ca\7v"+
		"\2\2\u04c3\u04ca\7N\2\2\u04c4\u04ca\7\17\2\2\u04c5\u04ca\7h\2\2\u04c6"+
		"\u04ca\7k\2\2\u04c7\u04ca\5\u0110\u0089\2\u04c8\u04ca\7P\2\2\u04c9\u04c2"+
		"\3\2\2\2\u04c9\u04c3\3\2\2\2\u04c9\u04c4\3\2\2\2\u04c9\u04c5\3\2\2\2\u04c9"+
		"\u04c6\3\2\2\2\u04c9\u04c7\3\2\2\2\u04c9\u04c8\3\2\2\2\u04ca\u00b5\3\2"+
		"\2\2\u04cb\u04d5\7\r\2\2\u04cc\u04d4\7z\2\2\u04cd\u04ce\7{\2\2\u04ce\u04cf"+
		"\5\u0096L\2\u04cf\u04d0\7\t\2\2\u04d0\u04d4\3\2\2\2\u04d1\u04d4\7|\2\2"+
		"\u04d2\u04d4\n\4\2\2\u04d3\u04cc\3\2\2\2\u04d3\u04cd\3\2\2\2\u04d3\u04d1"+
		"\3\2\2\2\u04d3\u04d2\3\2\2\2\u04d4\u04d7\3\2\2\2\u04d5\u04d3\3\2\2\2\u04d5"+
		"\u04d6\3\2\2\2\u04d6\u04d8\3\2\2\2\u04d7\u04d5\3\2\2\2\u04d8\u04e7\7y"+
		"\2\2\u04d9\u04e2\7\f\2\2\u04da\u04db\7\u0080\2\2\u04db\u04dc\5\u0096L"+
		"\2\u04dc\u04dd\7\t\2\2\u04dd\u04e1\3\2\2\2\u04de\u04e1\7\u0081\2\2\u04df"+
		"\u04e1\n\5\2\2\u04e0\u04da\3\2\2\2\u04e0\u04de\3\2\2\2\u04e0\u04df\3\2"+
		"\2\2\u04e1\u04e4\3\2\2\2\u04e2\u04e0\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3"+
		"\u04e5\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e5\u04e7\7~\2\2\u04e6\u04cb\3\2"+
		"\2\2\u04e6\u04d9\3\2\2\2\u04e7\u00b7\3\2\2\2\u04e8\u04e9\7\34\2\2\u04e9"+
		"\u04ea\5\u0096L\2\u04ea\u04eb\7\35\2\2\u04eb\u0508\3\2\2\2\u04ec\u0508"+
		"\5\u00ba^\2\u04ed\u0508\5\u00d8m\2\u04ee\u0508\5v<\2\u04ef\u04f1\7c\2"+
		"\2\u04f0\u04f2\5B\"\2\u04f1\u04f0\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u0508"+
		"\3\2\2\2\u04f3\u04f8\7d\2\2\u04f4\u04f5\7\23\2\2\u04f5\u04f6\5\32\16\2"+
		"\u04f6\u04f7\7\25\2\2\u04f7\u04f9\3\2\2\2\u04f8\u04f4\3\2\2\2\u04f8\u04f9"+
		"\3\2\2\2\u04f9\u04fb\3\2\2\2\u04fa\u04fc\5B\"\2\u04fb\u04fa\3\2\2\2\u04fb"+
		"\u04fc\3\2\2\2\u04fc\u0508\3\2\2\2\u04fd\u0508\5\u0086D\2\u04fe\u0508"+
		"\5\u00e0q\2\u04ff\u0508\5\u0088E\2\u0500\u0508\5\u00dep\2\u0501\u0508"+
		"\5@!\2\u0502\u0508\5\u008eH\2\u0503\u0508\5\u00b4[\2\u0504\u0505\7u\2"+
		"\2\u0505\u0508\5\u00b4[\2\u0506\u0508\7\16\2\2\u0507\u04e8\3\2\2\2\u0507"+
		"\u04ec\3\2\2\2\u0507\u04ed\3\2\2\2\u0507\u04ee\3\2\2\2\u0507\u04ef\3\2"+
		"\2\2\u0507\u04f3\3\2\2\2\u0507\u04fd\3\2\2\2\u0507\u04fe\3\2\2\2\u0507"+
		"\u04ff\3\2\2\2\u0507\u0500\3\2\2\2\u0507\u0501\3\2\2\2\u0507\u0502\3\2"+
		"\2\2\u0507\u0503\3\2\2\2\u0507\u0504\3\2\2\2\u0507\u0506\3\2\2\2\u0508"+
		"\u00b9\3\2\2\2\u0509\u0511\7&\2\2\u050a\u0511\7\'\2\2\u050b\u0511\5\u00b6"+
		"\\\2\u050c\u0511\7\6\2\2\u050d\u0511\7\n\2\2\u050e\u0511\7\13\2\2\u050f"+
		"\u0511\7(\2\2\u0510\u0509\3\2\2\2\u0510\u050a\3\2\2\2\u0510\u050b\3\2"+
		"\2\2\u0510\u050c\3\2\2\2\u0510\u050d\3\2\2\2\u0510\u050e\3\2\2\2\u0510"+
		"\u050f\3\2\2\2\u0511\u00bb\3\2\2\2\u0512\u0518\5t;\2\u0513\u0518\5\u00e8"+
		"u\2\u0514\u0518\5b\62\2\u0515\u0518\5d\63\2\u0516\u0518\5h\65\2\u0517"+
		"\u0512\3\2\2\2\u0517\u0513\3\2\2\2\u0517\u0514\3\2\2\2\u0517\u0515\3\2"+
		"\2\2\u0517\u0516\3\2\2\2\u0518\u00bd\3\2\2\2\u0519\u051c\5\u00bc_\2\u051a"+
		"\u051c\5\u0096L\2\u051b\u0519\3\2\2\2\u051b\u051a\3\2\2\2\u051c\u00bf"+
		"\3\2\2\2\u051d\u051e\t\6\2\2\u051e\u00c1\3\2\2\2\u051f\u0520\t\7\2\2\u0520"+
		"\u00c3\3\2\2\2\u0521\u0522\t\b\2\2\u0522\u00c5\3\2\2\2\u0523\u0524\t\t"+
		"\2\2\u0524\u00c7\3\2\2\2\u0525\u0526\t\n\2\2\u0526\u00c9\3\2\2\2\u0527"+
		"\u0528\t\13\2\2\u0528\u00cb\3\2\2\2\u0529\u052a\t\f\2\2\u052a\u00cd\3"+
		"\2\2\2\u052b\u052c\t\r\2\2\u052c\u00cf\3\2\2\2\u052d\u0535\7-\2\2\u052e"+
		"\u0535\7,\2\2\u052f\u0535\7:\2\2\u0530\u0535\79\2\2\u0531\u0535\7<\2\2"+
		"\u0532\u0535\5\64\33\2\u0533\u0535\5D#\2\u0534\u052d\3\2\2\2\u0534\u052e"+
		"\3\2\2\2\u0534\u052f\3\2\2\2\u0534\u0530\3\2\2\2\u0534\u0531\3\2\2\2\u0534"+
		"\u0532\3\2\2\2\u0534\u0533\3\2\2\2\u0535\u00d1\3\2\2\2\u0536\u053f\7:"+
		"\2\2\u0537\u053f\79\2\2\u0538\u053f\7;\2\2\u0539\u053f\5Z.\2\u053a\u053f"+
		"\5\u00dco\2\u053b\u053c\5\u00d6l\2\u053c\u053d\5\u00b0Y\2\u053d\u053f"+
		"\3\2\2\2\u053e\u0536\3\2\2\2\u053e\u0537\3\2\2\2\u053e\u0538\3\2\2\2\u053e"+
		"\u0539\3\2\2\2\u053e\u053a\3\2\2\2\u053e\u053b\3\2\2\2\u053f\u00d3\3\2"+
		"\2\2\u0540\u0541\7X\2\2\u0541\u0543\5> \2\u0542\u0540\3\2\2\2\u0543\u0546"+
		"\3\2\2\2\u0544\u0542\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0548\3\2\2\2\u0546"+
		"\u0544\3\2\2\2\u0547\u0549\5D#\2\u0548\u0547\3\2\2\2\u0548\u0549\3\2\2"+
		"\2\u0549\u054a\3\2\2\2\u054a\u054b\5\u00d8m\2\u054b\u00d5\3\2\2\2\u054c"+
		"\u0552\7\20\2\2\u054d\u054f\7\36\2\2\u054e\u0550\7\20\2\2\u054f\u054e"+
		"\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u0552\3\2\2\2\u0551\u054c\3\2\2\2\u0551"+
		"\u054d\3\2\2\2\u0552\u00d7\3\2\2\2\u0553\u0554\7\b\2\2\u0554\u0555\5x"+
		"=\2\u0555\u0556\7\t\2\2\u0556\u0567\3\2\2\2\u0557\u0560\7\b\2\2\u0558"+
		"\u055d\5\u00dan\2\u0559\u055a\7\22\2\2\u055a\u055c\5\u00dan\2\u055b\u0559"+
		"\3\2\2\2\u055c\u055f\3\2\2\2\u055d\u055b\3\2\2\2\u055d\u055e\3\2\2\2\u055e"+
		"\u0561\3\2\2\2\u055f\u055d\3\2\2\2\u0560\u0558\3\2\2\2\u0560\u0561\3\2"+
		"\2\2\u0561\u0562\3\2\2\2\u0562\u0563\7)\2\2\u0563\u0564\5x=\2\u0564\u0565"+
		"\7\t\2\2\u0565\u0567\3\2\2\2\u0566\u0553\3\2\2\2\u0566\u0557\3\2\2\2\u0567"+
		"\u00d9\3\2\2\2\u0568\u056b\7v\2\2\u0569\u056a\7\33\2\2\u056a\u056c\5\32"+
		"\16\2\u056b\u0569\3\2\2\2\u056b\u056c\3\2\2\2\u056c\u00db\3\2\2\2\u056d"+
		"\u0576\7=\2\2\u056e\u0573\5\u0096L\2\u056f\u0570\7\22\2\2\u0570\u0572"+
		"\5\u0096L\2\u0571\u056f\3\2\2\2\u0572\u0575\3\2\2\2\u0573\u0571\3\2\2"+
		"\2\u0573\u0574\3\2\2\2\u0574\u0577\3\2\2\2\u0575\u0573\3\2\2\2\u0576\u056e"+
		"\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u0578\3\2\2\2\u0578\u0579\7>\2\2\u0579"+
		"\u00dd\3\2\2\2\u057a\u0584\7g\2\2\u057b\u057c\7\33\2\2\u057c\u0581\5`"+
		"\61\2\u057d\u057e\7\22\2\2\u057e\u0580\5`\61\2\u057f\u057d\3\2\2\2\u0580"+
		"\u0583\3\2\2\2\u0581\u057f\3\2\2\2\u0581\u0582\3\2\2\2\u0582\u0585\3\2"+
		"\2\2\u0583\u0581\3\2\2\2\u0584\u057b\3\2\2\2\u0584\u0585\3\2\2\2\u0585"+
		"\u0586\3\2\2\2\u0586\u0587\5n8\2\u0587\u00df\3\2\2\2\u0588\u058d\7n\2"+
		"\2\u0589\u058a\7\34\2\2\u058a\u058b\5\u0096L\2\u058b\u058c\7\35\2\2\u058c"+
		"\u058e\3\2\2\2\u058d\u0589\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u058f\3\2"+
		"\2\2\u058f\u0593\7\b\2\2\u0590\u0592\5\u00e2r\2\u0591\u0590\3\2\2\2\u0592"+
		"\u0595\3\2\2\2\u0593\u0591\3\2\2\2\u0593\u0594\3\2\2\2\u0594\u0596\3\2"+
		"\2\2\u0595\u0593\3\2\2\2\u0596\u0597\7\t\2\2\u0597\u00e1\3\2\2\2\u0598"+
		"\u059d\5\u00e4s\2\u0599\u059a\7\22\2\2\u059a\u059c\5\u00e4s\2\u059b\u0599"+
		"\3\2\2\2\u059c\u059f\3\2\2\2\u059d\u059b\3\2\2\2\u059d\u059e\3\2\2\2\u059e"+
		"\u05a0\3\2\2\2\u059f\u059d\3\2\2\2\u05a0\u05a1\7)\2\2\u05a1\u05a5\5\u0096"+
		"L\2\u05a2\u05a4\7\7\2\2\u05a3\u05a2\3\2\2\2\u05a4\u05a7\3\2\2\2\u05a5"+
		"\u05a3\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u05b2\3\2\2\2\u05a7\u05a5\3\2"+
		"\2\2\u05a8\u05a9\7m\2\2\u05a9\u05aa\7)\2\2\u05aa\u05ae\5\u0096L\2\u05ab"+
		"\u05ad\7\7\2\2\u05ac\u05ab\3\2\2\2\u05ad\u05b0\3\2\2\2\u05ae\u05ac\3\2"+
		"\2\2\u05ae\u05af\3\2\2\2\u05af\u05b2\3\2\2\2\u05b0\u05ae\3\2\2\2\u05b1"+
		"\u0598\3\2\2\2\u05b1\u05a8\3\2\2\2\u05b2\u00e3\3\2\2\2\u05b3\u05b9\5\u0096"+
		"L\2\u05b4\u05b5\t\b\2\2\u05b5\u05b9\5\u0096L\2\u05b6\u05b7\t\n\2\2\u05b7"+
		"\u05b9\5\32\16\2\u05b8\u05b3\3\2\2\2\u05b8\u05b4\3\2\2\2\u05b8\u05b6\3"+
		"\2\2\2\u05b9\u00e5\3\2\2\2\u05ba\u05bc\7\b\2\2\u05bb\u05bd\7\34\2\2\u05bc"+
		"\u05bb\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05c6\3\2\2\2\u05be\u05c3\5$"+
		"\23\2\u05bf\u05c0\7\22\2\2\u05c0\u05c2\5$\23\2\u05c1\u05bf\3\2\2\2\u05c2"+
		"\u05c5\3\2\2\2\u05c3\u05c1\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4\u05c7\3\2"+
		"\2\2\u05c5\u05c3\3\2\2\2\u05c6\u05be\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7"+
		"\u05c9\3\2\2\2\u05c8\u05ca\7\35\2\2\u05c9\u05c8\3\2\2\2\u05c9\u05ca\3"+
		"\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05cc\7)\2\2\u05cc\u05cd\5x=\2\u05cd"+
		"\u05ce\7\t\2\2\u05ce\u00e7\3\2\2\2\u05cf\u05d2\5\u00eav\2\u05d0\u05d2"+
		"\5\u00ecw\2\u05d1\u05cf\3\2\2\2\u05d1\u05d0\3\2\2\2\u05d2\u00e9\3\2\2"+
		"\2\u05d3\u05d5\5\u0108\u0085\2\u05d4\u05d3\3\2\2\2\u05d4\u05d5\3\2\2\2"+
		"\u05d5\u05d6\3\2\2\2\u05d6\u05db\7?\2\2\u05d7\u05dc\5\u00eex\2\u05d8\u05dc"+
		"\5\u00f0y\2\u05d9\u05dc\5\u00f8}\2\u05da\u05dc\5\u00f6|\2\u05db\u05d7"+
		"\3\2\2\2\u05db\u05d8\3\2\2\2\u05db\u05d9\3\2\2\2\u05db\u05da\3\2\2\2\u05dc"+
		"\u00eb\3\2\2\2\u05dd\u05de\5\u0106\u0084\2\u05de\u05e3\7@\2\2\u05df\u05e4"+
		"\5\u00eex\2\u05e0\u05e4\5\u00f4{\2\u05e1\u05e4\5\u00f8}\2\u05e2\u05e4"+
		"\5\u00fa~\2\u05e3\u05df\3\2\2\2\u05e3\u05e0\3\2\2\2\u05e3\u05e1\3\2\2"+
		"\2\u05e3\u05e2\3\2\2\2\u05e4\u00ed\3\2\2\2\u05e5\u05e7\5\20\t\2\u05e6"+
		"\u05e5\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u05e9\5\32"+
		"\16\2\u05e9\u05ea\7\20\2\2\u05ea\u05eb\5\u00f8}\2\u05eb\u00ef\3\2\2\2"+
		"\u05ec\u05ee\5\20\t\2\u05ed\u05ec\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee\u05ef"+
		"\3\2\2\2\u05ef\u05f0\5\32\16\2\u05f0\u05f1\7\20\2\2\u05f1\u05f3\5\u00f2"+
		"z\2\u05f2\u05f4\5\u0102\u0082\2\u05f3\u05f2\3\2\2\2\u05f3\u05f4\3\2\2"+
		"\2\u05f4\u05f8\3\2\2\2\u05f5\u05f7\7\7\2\2\u05f6\u05f5\3\2\2\2\u05f7\u05fa"+
		"\3\2\2\2\u05f8\u05f6\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u00f1\3\2\2\2\u05fa"+
		"\u05f8\3\2\2\2\u05fb\u05fc\7\33\2\2\u05fc\u05fe\5\32\16\2\u05fd\u05fb"+
		"\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe\u00f3\3\2\2\2\u05ff\u0601\5\20\t\2"+
		"\u0600\u05ff\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0603"+
		"\5\32\16\2\u0603\u0604\7\20\2\2\u0604\u0605\5$\23\2\u0605\u0609\5\u00f2"+
		"z\2\u0606\u0608\7\7\2\2\u0607\u0606\3\2\2\2\u0608\u060b\3\2\2\2\u0609"+
		"\u0607\3\2\2\2\u0609\u060a\3\2\2\2\u060a\u0612\3\2\2\2\u060b\u0609\3\2"+
		"\2\2\u060c\u060d\5\u0102\u0082\2\u060d\u060e\5\u0104\u0083\2\u060e\u0613"+
		"\3\2\2\2\u060f\u0610\5\u0104\u0083\2\u0610\u0611\5\u0102\u0082\2\u0611"+
		"\u0613\3\2\2\2\u0612\u060c\3\2\2\2\u0612\u060f\3\2\2\2\u0613\u0617\3\2"+
		"\2\2\u0614\u0616\7\7\2\2\u0615\u0614\3\2\2\2\u0616\u0619\3\2\2\2\u0617"+
		"\u0615\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u00f5\3\2\2\2\u0619\u0617\3\2"+
		"\2\2\u061a\u061d\5,\27\2\u061b\u061d\5$\23\2\u061c\u061a\3\2\2\2\u061c"+
		"\u061b\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u061f\5\26\f\2\u061f\u0621\5"+
		"\u00fe\u0080\2\u0620\u0622\5\u0102\u0082\2\u0621\u0620\3\2\2\2\u0621\u0622"+
		"\3\2\2\2\u0622\u0626\3\2\2\2\u0623\u0625\7\7\2\2\u0624\u0623\3\2\2\2\u0625"+
		"\u0628\3\2\2\2\u0626\u0624\3\2\2\2\u0626\u0627\3\2\2\2\u0627\u00f7\3\2"+
		"\2\2\u0628\u0626\3\2\2\2\u0629\u062a\5$\23\2\u062a\u062b\5\26\f\2\u062b"+
		"\u062c\5\u00fc\177\2\u062c\u00f9\3\2\2\2\u062d\u0630\5,\27\2\u062e\u0630"+
		"\5$\23\2\u062f\u062d\3\2\2\2\u062f\u062e\3\2\2\2\u0630\u0631\3\2\2\2\u0631"+
		"\u0632\5\26\f\2\u0632\u0636\5\u00fe\u0080\2\u0633\u0635\7\7\2\2\u0634"+
		"\u0633\3\2\2\2\u0635\u0638\3\2\2\2\u0636\u0634\3\2\2\2\u0636\u0637\3\2"+
		"\2\2\u0637\u063f\3\2\2\2\u0638\u0636\3\2\2\2\u0639\u063a\5\u0102\u0082"+
		"\2\u063a\u063b\5\u0104\u0083\2\u063b\u0640\3\2\2\2\u063c\u063d\5\u0104"+
		"\u0083\2\u063d\u063e\5\u0102\u0082\2\u063e\u0640\3\2\2\2\u063f\u0639\3"+
		"\2\2\2\u063f\u063c\3\2\2\2\u0640\u0644\3\2\2\2\u0641\u0643\7\7\2\2\u0642"+
		"\u0641\3\2\2\2\u0643\u0646\3\2\2\2\u0644\u0642\3\2\2\2\u0644\u0645\3\2"+
		"\2\2\u0645\u00fb\3\2\2\2\u0646\u0644\3\2\2\2\u0647\u0648\7B\2\2\u0648"+
		"\u064c\5\u0096L\2\u0649\u064b\7\7\2\2\u064a\u0649\3\2\2\2\u064b\u064e"+
		"\3\2\2\2\u064c\u064a\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u00fd\3\2\2\2\u064e"+
		"\u064c\3\2\2\2\u064f\u0650\7\27\2\2\u0650\u0654\5\u0096L\2\u0651\u0653"+
		"\7\7\2\2\u0652\u0651\3\2\2\2\u0653\u0656\3\2\2\2\u0654\u0652\3\2\2\2\u0654"+
		"\u0655\3\2\2\2\u0655\u00ff\3\2\2\2\u0656\u0654\3\2\2\2\u0657\u0659\5\u0102"+
		"\u0082\2\u0658\u0657\3\2\2\2\u0658\u0659\3\2\2\2\u0659\u065b\3\2\2\2\u065a"+
		"\u065c\5\u0104\u0083\2\u065b\u065a\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u0664"+
		"\3\2\2\2\u065d\u065f\5\u0104\u0083\2\u065e\u065d\3\2\2\2\u065e\u065f\3"+
		"\2\2\2\u065f\u0661\3\2\2\2\u0660\u0662\5\u0102\u0082\2\u0661\u0660\3\2"+
		"\2\2\u0661\u0662\3\2\2\2\u0662\u0664\3\2\2\2\u0663\u0658\3\2\2\2\u0663"+
		"\u065e\3\2\2\2\u0664\u0668\3\2\2\2\u0665\u0667\7\7\2\2\u0666\u0665\3\2"+
		"\2\2\u0667\u066a\3\2\2\2\u0668\u0666\3\2\2\2\u0668\u0669\3\2\2\2\u0669"+
		"\u0101\3\2\2\2\u066a\u0668\3\2\2\2\u066b\u066c\5.\30\2\u066c\u066d\7E"+
		"\2\2\u066d\u0679\3\2\2\2\u066e\u066f\5.\30\2\u066f\u0670\7E\2\2\u0670"+
		"\u0671\7\34\2\2\u0671\u0674\7\35\2\2\u0672\u0673\7\33\2\2\u0673\u0675"+
		"\5\32\16\2\u0674\u0672\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u0676\3\2\2\2"+
		"\u0676\u0677\5z>\2\u0677\u0679\3\2\2\2\u0678\u066b\3\2\2\2\u0678\u066e"+
		"\3\2\2\2\u0679\u0103\3\2\2\2\u067a\u067b\5.\30\2\u067b\u067c\7F\2\2\u067c"+
		"\u0689\3\2\2\2\u067d\u067e\5.\30\2\u067e\u067f\7F\2\2\u067f\u0680\7\34"+
		"\2\2\u0680\u0683\5.\30\2\u0681\u0684\7v\2\2\u0682\u0684\5F$\2\u0683\u0681"+
		"\3\2\2\2\u0683\u0682\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0686\7\35\2\2"+
		"\u0686\u0687\5z>\2\u0687\u0689\3\2\2\2\u0688\u067a\3\2\2\2\u0688\u067d"+
		"\3\2\2\2\u0689\u0105\3\2\2\2\u068a\u068b\t\16\2\2\u068b\u0107\3\2\2\2"+
		"\u068c\u068d\t\16\2\2\u068d\u0109\3\2\2\2\u068e\u068f\t\17\2\2\u068f\u010b"+
		"\3\2\2\2\u0690\u0691\t\20\2\2\u0691\u010d\3\2\2\2\u0692\u0693\t\21\2\2"+
		"\u0693\u010f\3\2\2\2\u0694\u0695\t\22\2\2\u0695\u0111\3\2\2\2\u0696\u0697"+
		"\t\23\2\2\u0697\u0113\3\2\2\2\u00e2\u0118\u011c\u0121\u012a\u0130\u0139"+
		"\u0140\u0145\u014e\u0158\u015b\u0163\u016c\u0170\u0176\u0181\u0184\u0187"+
		"\u018e\u0196\u0199\u019d\u01a1\u01a4\u01a8\u01ab\u01ad\u01b1\u01b8\u01bf"+
		"\u01c8\u01cd\u01d2\u01d8\u01e3\u01e6\u01f2\u01fa\u0206\u020b\u0211\u021a"+
		"\u021d\u0227\u022a\u0233\u0237\u023a\u0240\u0243\u0247\u024b\u024d\u0254"+
		"\u025f\u026a\u026e\u0277\u027a\u0282\u0285\u028a\u0293\u0296\u029c\u029f"+
		"\u02a4\u02ab\u02ae\u02b2\u02b8\u02bc\u02c7\u02cd\u02d0\u02d4\u02db\u02de"+
		"\u02e3\u02e8\u02ef\u02f2\u02f6\u02fd\u0300\u0305\u030a\u0313\u031a\u031d"+
		"\u0323\u032e\u0335\u033b\u0342\u0347\u0350\u0353\u035a\u0360\u0364\u0369"+
		"\u036d\u0372\u0377\u037d\u0380\u0385\u0389\u038e\u0394\u039b\u03a1\u03a4"+
		"\u03a9\u03af\u03ba\u03c1\u03c7\u03cb\u03d2\u03d6\u03e2\u03e7\u03ee\u03f2"+
		"\u03f7\u0405\u040a\u040e\u0428\u0430\u0438\u0441\u044a\u0453\u045a\u045c"+
		"\u0463\u046b\u0473\u047c\u0485\u048e\u0494\u049c\u04a2\u04a9\u04ac\u04b2"+
		"\u04b5\u04b8\u04bd\u04c0\u04c9\u04d3\u04d5\u04e0\u04e2\u04e6\u04f1\u04f8"+
		"\u04fb\u0507\u0510\u0517\u051b\u0534\u053e\u0544\u0548\u054f\u0551\u055d"+
		"\u0560\u0566\u056b\u0573\u0576\u0581\u0584\u058d\u0593\u059d\u05a5\u05ae"+
		"\u05b1\u05b8\u05bc\u05c3\u05c6\u05c9\u05d1\u05d4\u05db\u05e3\u05e6\u05ed"+
		"\u05f3\u05f8\u05fd\u0600\u0609\u0612\u0617\u061c\u0621\u0626\u062f\u0636"+
		"\u063f\u0644\u064c\u0654\u0658\u065b\u065e\u0661\u0663\u0668\u0674\u0678"+
		"\u0683\u0688";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}