// Generated from /home/chmuche/workspace/kotlin/korm/parser/src/main/antlr/KotlinParser.g4 by ANTLR 4.7
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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MULTILINE_COMMENT=1, SINGLELINE_COMMENT=2, WHITESPACE=3, IntegerLiteral=4, 
		SEMI=5, OPEN_BLOCK=6, CLOSE_BLOCK=7, HexadecimalLiteral=8, CharacterLiteral=9, 
		TRIPLE_QUOTE=10, SINGLE_QUOTE=11, PACKAGE=12, IMPORT=13, DOT=14, STAR=15, 
		COMMA=16, LT=17, LTE=18, GT=19, GTE=20, EQ=21, EQ_EQ=22, EQ_EQ_EQ=23, 
		NEQ=24, COLON=25, BRACE_OPEN=26, BRACE_CLOSE=27, Q=28, DA=29, DISJ=30, 
		CONJ=31, ELVIS=32, LONG_RANGE=33, RANGE=34, REFERENCE=35, TRUE=36, FALSE=37, 
		NULL=38, OP_ASTERISK=39, OP_DIV=40, OP_MOD=41, OP_PLUS=42, OP_MUNUS=43, 
		OP_IN=44, OP_NOT_IN=45, OP_IS=46, OP_NOT_IS=47, OP_AS=48, OP_AS_SAFE=49, 
		OP_PLUS_ASSIGN=50, OP_MINUS_ASSIGN=51, OP_MULT_ASSIGN=52, OP_DIV_ASSIGN=53, 
		OP_MOD_ASSIGN=54, OP_DECREMENT=55, OP_INCREMENT=56, OP_NULL_ASSERT=57, 
		OP_NOT=58, SQ_OPEN=59, SQ_CLOSE=60, KEYWORD_val=61, KEYWORD_var=62, KEYWORD_lateinit_var=63, 
		KEYWORD_vararg=64, KEYWORD_by=65, KEYWORD_dynamic=66, KEYWORD_where=67, 
		GET=68, SET=69, HierarchyModifier_abstract=70, HierarchyModifier_open=71, 
		HierarchyModifier_final=72, HierarchyModifier_override=73, KeyWordModifier_operator=74, 
		KeyWordModifier_infix=75, KeyWordModifier_inline=76, ClassModifier_enum=77, 
		ClassModifier_annotation=78, ClassModifier_data=79, ClassModifier_sealed=80, 
		AccessModifier_private=81, AccessModifier_protected=82, AccessModifier_public=83, 
		AccessModifier_internal=84, Modifier_const=85, VarianceAnnotation_out=86, 
		DOG=87, AnnotationUseSiteTarget_file=88, AnnotationUseSiteTarget_field=89, 
		AnnotationUseSiteTarget_property=90, AnnotationUseSiteTarget_param=91, 
		AnnotationUseSiteTarget_sparam=92, Jump_throw=93, Jump_continue=94, Jump_return=95, 
		Jump_break=96, KEYWORD_constructor=97, ConstructorDelegationCall_this=98, 
		ConstructorDelegationCall_super=99, Declaration_class=100, Declaration_interface=101, 
		Declaration_object=102, Declaration_companion=103, Declaration_fun=104, 
		Declaration_typealias=105, Declaration_init=106, CF_if=107, CF_else=108, 
		CF_when=109, CF_while=110, CF_for=111, CF_do=112, CF_try=113, CF_catch=114, 
		CF_FINALLY=115, BAX=116, SimpleName=117, SINLE_QUOTE_WHITESPACE=118, SINGLE_TEXT=119, 
		SINLE_QUOTE_CLOSE=120, SINLE_QUOTE_ESCAPED_CHAR=121, SINLE_QUOTE_EXPRESSION_START=122, 
		SINGLE_QUOTE_REF=123, MULTILINE_QUOTE_TEXT=124, MULTILINE_QUOTE_CLOSE=125, 
		MULTILINE_QUOTES=126, MULTILINE_QUOTE_EXPRESSION_START=127, MULTILINE_QUOTE_REF=128;
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
		RULE_supertypesSpecifiers = 48, RULE_typealiasDeclaration = 49, RULE_companionObject = 50, 
		RULE_classBody = 51, RULE_members = 52, RULE_statements = 53, RULE_functionBody = 54, 
		RULE_block = 55, RULE_anonymousInitializer = 56, RULE_enumClassBody = 57, 
		RULE_enumEntries = 58, RULE_enumEntry = 59, RULE_ifExpression = 60, RULE_tryExpression = 61, 
		RULE_catchBlock = 62, RULE_finallyBlock = 63, RULE_loop = 64, RULE_forLoop = 65, 
		RULE_whileLoop = 66, RULE_doWhileLoop = 67, RULE_expression = 68, RULE_disjunction = 69, 
		RULE_conjunction = 70, RULE_equalityComparison = 71, RULE_comparison = 72, 
		RULE_namedInfix = 73, RULE_elvisExpression = 74, RULE_infixFunctionCall = 75, 
		RULE_rangeExpression = 76, RULE_additiveExpression = 77, RULE_multiplicativeExpression = 78, 
		RULE_typeRHS = 79, RULE_prefixUnaryExpression = 80, RULE_postfixUnaryExpression = 81, 
		RULE_callableReference = 82, RULE_identifier = 83, RULE_stringLiteral = 84, 
		RULE_atomicExpression = 85, RULE_literalConstant = 86, RULE_declaration = 87, 
		RULE_statement = 88, RULE_multiplicativeOperation = 89, RULE_additiveOperation = 90, 
		RULE_inOperation = 91, RULE_typeOperation = 92, RULE_isOperation = 93, 
		RULE_comparisonOperation = 94, RULE_equalityOperation = 95, RULE_assignmentOperator = 96, 
		RULE_prefixUnaryOperation = 97, RULE_postfixUnaryOperation = 98, RULE_annotatedLambda = 99, 
		RULE_memberAccessOperation = 100, RULE_functionLiteral = 101, RULE_functionLiteralparameter = 102, 
		RULE_arrayAccess = 103, RULE_objectLiteral = 104, RULE_when = 105, RULE_whenEntry = 106, 
		RULE_whenCondition = 107, RULE_lastArgLambda = 108, RULE_classDeclaration = 109, 
		RULE_interfaceDeclaration = 110, RULE_objectDeclaration = 111, RULE_functionDeclaration = 112, 
		RULE_extensionFunctionDeclaration = 113, RULE_classicFunctionDeclaration = 114, 
		RULE_lambdaFunction = 115, RULE_functionParameters = 116, RULE_modifierAnnotation = 117, 
		RULE_functionName = 118, RULE_returnType = 119, RULE_propertyDeclaration = 120, 
		RULE_readonlyPropertyDeclaration = 121, RULE_mutablePropertyDeclaration = 122, 
		RULE_lateinitVarPropertyDeclaration = 123, RULE_extensionPropertyDelegateDeclaration = 124, 
		RULE_readonlyExtensionPropertyNoDelegateDeclaration = 125, RULE_parameterType = 126, 
		RULE_mutableExtensionPropertyNoDelegateDeclaration = 127, RULE_readonlyPropertyNoDelegateDeclaration = 128, 
		RULE_propertyDelegateDeclaration = 129, RULE_mutablePropertyNoDelegateDeclaration = 130, 
		RULE_delegateExpression = 131, RULE_assignExpression = 132, RULE_getterSetterDeclaration = 133, 
		RULE_getter = 134, RULE_setter = 135, RULE_functionModifier = 136, RULE_propertyModifier = 137, 
		RULE_hierarchyModifier = 138, RULE_classModifier = 139, RULE_keyWordModifier = 140, 
		RULE_accessModifier = 141, RULE_objectModifier = 142, RULE_varianceAnnotation = 143;
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
		"supertypesSpecifiers", "typealiasDeclaration", "companionObject", "classBody", 
		"members", "statements", "functionBody", "block", "anonymousInitializer", 
		"enumClassBody", "enumEntries", "enumEntry", "ifExpression", "tryExpression", 
		"catchBlock", "finallyBlock", "loop", "forLoop", "whileLoop", "doWhileLoop", 
		"expression", "disjunction", "conjunction", "equalityComparison", "comparison", 
		"namedInfix", "elvisExpression", "infixFunctionCall", "rangeExpression", 
		"additiveExpression", "multiplicativeExpression", "typeRHS", "prefixUnaryExpression", 
		"postfixUnaryExpression", "callableReference", "identifier", "stringLiteral", 
		"atomicExpression", "literalConstant", "declaration", "statement", "multiplicativeOperation", 
		"additiveOperation", "inOperation", "typeOperation", "isOperation", "comparisonOperation", 
		"equalityOperation", "assignmentOperator", "prefixUnaryOperation", "postfixUnaryOperation", 
		"annotatedLambda", "memberAccessOperation", "functionLiteral", "functionLiteralparameter", 
		"arrayAccess", "objectLiteral", "when", "whenEntry", "whenCondition", 
		"lastArgLambda", "classDeclaration", "interfaceDeclaration", "objectDeclaration", 
		"functionDeclaration", "extensionFunctionDeclaration", "classicFunctionDeclaration", 
		"lambdaFunction", "functionParameters", "modifierAnnotation", "functionName", 
		"returnType", "propertyDeclaration", "readonlyPropertyDeclaration", "mutablePropertyDeclaration", 
		"lateinitVarPropertyDeclaration", "extensionPropertyDelegateDeclaration", 
		"readonlyExtensionPropertyNoDelegateDeclaration", "parameterType", "mutableExtensionPropertyNoDelegateDeclaration", 
		"readonlyPropertyNoDelegateDeclaration", "propertyDelegateDeclaration", 
		"mutablePropertyNoDelegateDeclaration", "delegateExpression", "assignExpression", 
		"getterSetterDeclaration", "getter", "setter", "functionModifier", "propertyModifier", 
		"hierarchyModifier", "classModifier", "keyWordModifier", "accessModifier", 
		"objectModifier", "varianceAnnotation"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "';'", "'{'", "'}'", null, null, null, null, 
		"'package'", "'import'", "'.'", "'*'", "','", "'<'", "'<='", "'>'", "'>='", 
		"'='", "'=='", "'==='", "'!='", "':'", "'('", "')'", "'?'", "'!!.'", "'||'", 
		"'&&'", "'?:'", "'...'", "'..'", "'::'", "'true'", "'false'", "'null'", 
		"'->'", "'/'", "'%'", "'+'", "'-'", "'in'", "'!in'", "'is'", "'!is'", 
		"'as'", "'as?'", "'+='", "'-='", "'*='", "'/='", "'%='", "'--'", "'++'", 
		"'!!'", "'!'", "'['", "']'", "'val'", "'var'", "'lateinit var'", "'vararg'", 
		"'by'", "'dynamic'", "'where'", "'get'", "'set'", "'abstract'", "'open'", 
		"'final'", "'override'", "'operator'", "'infix'", "'inline'", "'enum'", 
		"'annotation'", "'data'", "'sealed'", "'private'", "'protected'", "'public'", 
		"'internal'", "'const'", "'out'", "'@'", "'file'", "'choice'", "'property'", 
		"'param'", "'sparam'", "'throw'", "'continue'", "'return'", "'break'", 
		"'constructor'", "'this'", "'super'", "'class'", "'interface'", "'object'", 
		"'companion'", "'fun'", "'typealias'", "'init'", "'if'", "'else'", "'when'", 
		"'while'", "'for'", "'do'", "'try'", "'catch'", "'finally'", "'$'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MULTILINE_COMMENT", "SINGLELINE_COMMENT", "WHITESPACE", "IntegerLiteral", 
		"SEMI", "OPEN_BLOCK", "CLOSE_BLOCK", "HexadecimalLiteral", "CharacterLiteral", 
		"TRIPLE_QUOTE", "SINGLE_QUOTE", "PACKAGE", "IMPORT", "DOT", "STAR", "COMMA", 
		"LT", "LTE", "GT", "GTE", "EQ", "EQ_EQ", "EQ_EQ_EQ", "NEQ", "COLON", "BRACE_OPEN", 
		"BRACE_CLOSE", "Q", "DA", "DISJ", "CONJ", "ELVIS", "LONG_RANGE", "RANGE", 
		"REFERENCE", "TRUE", "FALSE", "NULL", "OP_ASTERISK", "OP_DIV", "OP_MOD", 
		"OP_PLUS", "OP_MUNUS", "OP_IN", "OP_NOT_IN", "OP_IS", "OP_NOT_IS", "OP_AS", 
		"OP_AS_SAFE", "OP_PLUS_ASSIGN", "OP_MINUS_ASSIGN", "OP_MULT_ASSIGN", "OP_DIV_ASSIGN", 
		"OP_MOD_ASSIGN", "OP_DECREMENT", "OP_INCREMENT", "OP_NULL_ASSERT", "OP_NOT", 
		"SQ_OPEN", "SQ_CLOSE", "KEYWORD_val", "KEYWORD_var", "KEYWORD_lateinit_var", 
		"KEYWORD_vararg", "KEYWORD_by", "KEYWORD_dynamic", "KEYWORD_where", "GET", 
		"SET", "HierarchyModifier_abstract", "HierarchyModifier_open", "HierarchyModifier_final", 
		"HierarchyModifier_override", "KeyWordModifier_operator", "KeyWordModifier_infix", 
		"KeyWordModifier_inline", "ClassModifier_enum", "ClassModifier_annotation", 
		"ClassModifier_data", "ClassModifier_sealed", "AccessModifier_private", 
		"AccessModifier_protected", "AccessModifier_public", "AccessModifier_internal", 
		"Modifier_const", "VarianceAnnotation_out", "DOG", "AnnotationUseSiteTarget_file", 
		"AnnotationUseSiteTarget_field", "AnnotationUseSiteTarget_property", "AnnotationUseSiteTarget_param", 
		"AnnotationUseSiteTarget_sparam", "Jump_throw", "Jump_continue", "Jump_return", 
		"Jump_break", "KEYWORD_constructor", "ConstructorDelegationCall_this", 
		"ConstructorDelegationCall_super", "Declaration_class", "Declaration_interface", 
		"Declaration_object", "Declaration_companion", "Declaration_fun", "Declaration_typealias", 
		"Declaration_init", "CF_if", "CF_else", "CF_when", "CF_while", "CF_for", 
		"CF_do", "CF_try", "CF_catch", "CF_FINALLY", "BAX", "SimpleName", "SINLE_QUOTE_WHITESPACE", 
		"SINGLE_TEXT", "SINLE_QUOTE_CLOSE", "SINLE_QUOTE_ESCAPED_CHAR", "SINLE_QUOTE_EXPRESSION_START", 
		"SINGLE_QUOTE_REF", "MULTILINE_QUOTE_TEXT", "MULTILINE_QUOTE_CLOSE", "MULTILINE_QUOTES", 
		"MULTILINE_QUOTE_EXPRESSION_START", "MULTILINE_QUOTE_REF"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "KotlinParser.g4"; }

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
		public List<ToplevelObjectContext> toplevelObject() {
			return getRuleContexts(ToplevelObjectContext.class);
		}
		public ToplevelObjectContext toplevelObject(int i) {
			return getRuleContext(ToplevelObjectContext.class,i);
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
			setState(288);
			preamble();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (OP_IN - 44)) | (1L << (KEYWORD_val - 44)) | (1L << (KEYWORD_lateinit_var - 44)) | (1L << (KEYWORD_vararg - 44)) | (1L << (HierarchyModifier_abstract - 44)) | (1L << (HierarchyModifier_open - 44)) | (1L << (HierarchyModifier_final - 44)) | (1L << (HierarchyModifier_override - 44)) | (1L << (KeyWordModifier_operator - 44)) | (1L << (KeyWordModifier_infix - 44)) | (1L << (KeyWordModifier_inline - 44)) | (1L << (ClassModifier_enum - 44)) | (1L << (ClassModifier_annotation - 44)) | (1L << (ClassModifier_data - 44)) | (1L << (ClassModifier_sealed - 44)) | (1L << (AccessModifier_private - 44)) | (1L << (AccessModifier_protected - 44)) | (1L << (AccessModifier_public - 44)) | (1L << (AccessModifier_internal - 44)) | (1L << (Modifier_const - 44)) | (1L << (VarianceAnnotation_out - 44)) | (1L << (DOG - 44)) | (1L << (Declaration_class - 44)) | (1L << (Declaration_interface - 44)) | (1L << (Declaration_object - 44)) | (1L << (Declaration_fun - 44)) | (1L << (Declaration_typealias - 44)))) != 0)) {
				{
				{
				setState(289);
				toplevelObject();
				}
				}
				setState(294);
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
		public PackageHeaderContext packageHeader() {
			return getRuleContext(PackageHeaderContext.class,0);
		}
		public List<ImportHeaderContext> importHeader() {
			return getRuleContexts(ImportHeaderContext.class);
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
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(295);
				packageHeader();
				}
			}

			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(298);
				importHeader();
				}
				}
				setState(303);
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
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
			setState(304);
			match(PACKAGE);
			setState(305);
			identifier();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(306);
				match(DOT);
				setState(307);
				identifier();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(313);
				match(SEMI);
				}
				}
				setState(318);
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode SimpleName() { return getToken(KotlinParser.SimpleName, 0); }
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
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
			setState(319);
			match(IMPORT);
			setState(320);
			identifier();
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(321);
					match(DOT);
					setState(322);
					identifier();
					}
					} 
				}
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				{
				setState(328);
				match(DOT);
				setState(329);
				match(STAR);
				}
				break;
			case OP_AS:
				{
				setState(330);
				match(OP_AS);
				setState(331);
				match(SimpleName);
				}
				break;
			case EOF:
			case SEMI:
			case IMPORT:
			case OP_IN:
			case KEYWORD_val:
			case KEYWORD_lateinit_var:
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
				break;
			}
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(334);
				match(SEMI);
				}
				}
				setState(339);
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
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
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
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				propertyDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(342);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(343);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(344);
				objectDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(345);
				typealiasDeclaration();
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
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnonymousInitializerContext anonymousInitializer() {
			return getRuleContext(AnonymousInitializerContext.class,0);
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
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				companionObject();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				objectDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
				functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
				propertyDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(352);
				classDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(353);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(354);
				anonymousInitializer();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(355);
				secondaryConstructor();
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
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_IN || _la==VarianceAnnotation_out) {
				{
				setState(358);
				varianceAnnotation();
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
			setState(361);
			match(LT);
			setState(362);
			typeParameter();
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(363);
				match(COMMA);
				setState(364);
				typeParameter();
				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(370);
			match(GT);
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
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode SimpleName() { return getToken(KotlinParser.SimpleName, 0); }
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
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
			setState(372);
			modifiers();
			setState(373);
			match(SimpleName);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(374);
				match(COLON);
				setState(375);
				userType();
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
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
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
			setState(378);
			match(LT);
			{
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE || _la==BRACE_OPEN || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (KEYWORD_dynamic - 66)) | (1L << (DOG - 66)) | (1L << (SimpleName - 66)))) != 0)) {
				{
				setState(379);
				type();
				}
			}

			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(382);
				match(COMMA);
				setState(383);
				type();
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(389);
			match(GT);
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
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(391);
				match(KEYWORD_where);
				setState(392);
				typeConstraint();
				setState(397);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(393);
						match(COMMA);
						setState(394);
						typeConstraint();
						}
						} 
					}
					setState(399);
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
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOG) {
				{
				setState(402);
				annotations();
				}
			}

			setState(405);
			match(SimpleName);
			setState(406);
			match(COLON);
			setState(407);
			type();
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
		public TypeDescriptorContext typeDescriptor() {
			return getRuleContext(TypeDescriptorContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
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
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOG) {
				{
				setState(409);
				annotations();
				}
			}

			setState(412);
			typeDescriptor();
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
		public TypeDescriptorContext typeDescriptor() {
			return getRuleContext(TypeDescriptorContext.class,0);
		}
		public ExtensionFunctionTypeNoReceiverContext extensionFunctionTypeNoReceiver() {
			return getRuleContext(ExtensionFunctionTypeNoReceiverContext.class,0);
		}
		public FunctionTypeNoReceiverContext functionTypeNoReceiver() {
			return getRuleContext(FunctionTypeNoReceiverContext.class,0);
		}
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
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
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				match(BRACE_OPEN);
				setState(415);
				typeDescriptor();
				setState(416);
				match(BRACE_CLOSE);
				setState(418);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(417);
					match(Q);
					}
					break;
				}
				setState(421);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(420);
					extensionFunctionTypeNoReceiver();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				functionTypeNoReceiver();
				setState(425);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(424);
					extensionFunctionTypeNoReceiver();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(427);
				userType();
				setState(429);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(428);
					match(Q);
					}
					break;
				}
				setState(432);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(431);
					extensionFunctionTypeNoReceiver();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(434);
				match(KEYWORD_dynamic);
				setState(436);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(435);
					match(Q);
					}
					break;
				}
				setState(439);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(438);
					extensionFunctionTypeNoReceiver();
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
		public List<SimpleUserTypeContext> simpleUserType() {
			return getRuleContexts(SimpleUserTypeContext.class);
		}
		public SimpleUserTypeContext simpleUserType(int i) {
			return getRuleContext(SimpleUserTypeContext.class,i);
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
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(443);
				match(PACKAGE);
				setState(444);
				match(DOT);
				}
			}

			setState(447);
			simpleUserType();
			setState(452);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(448);
					match(DOT);
					setState(449);
					simpleUserType();
					}
					} 
				}
				setState(454);
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
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(455);
				match(STAR);
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
				setState(456);
				optionalProjection();
				setState(457);
				type();
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
			setState(461);
			match(SimpleName);
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(462);
				match(LT);
				setState(463);
				simpleUserType_typeParam();
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(464);
					match(COMMA);
					setState(465);
					simpleUserType_typeParam();
					}
					}
					setState(470);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(471);
				match(GT);
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
			setState(475);
			match(SimpleName);
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(476);
				match(COLON);
				setState(477);
				type();
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
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				parameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				modifiers();
				setState(482);
				type();
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
			setState(486);
			match(DOT);
			setState(487);
			functionTypeNoReceiver();
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<FunctionType_paramOrTypeContext> functionType_paramOrType() {
			return getRuleContexts(FunctionType_paramOrTypeContext.class);
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
			setState(489);
			match(BRACE_OPEN);
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PACKAGE) | (1L << BRACE_OPEN) | (1L << OP_IN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KEYWORD_vararg - 64)) | (1L << (KEYWORD_dynamic - 64)) | (1L << (HierarchyModifier_abstract - 64)) | (1L << (HierarchyModifier_open - 64)) | (1L << (HierarchyModifier_final - 64)) | (1L << (HierarchyModifier_override - 64)) | (1L << (KeyWordModifier_operator - 64)) | (1L << (KeyWordModifier_infix - 64)) | (1L << (KeyWordModifier_inline - 64)) | (1L << (ClassModifier_enum - 64)) | (1L << (ClassModifier_annotation - 64)) | (1L << (ClassModifier_data - 64)) | (1L << (ClassModifier_sealed - 64)) | (1L << (AccessModifier_private - 64)) | (1L << (AccessModifier_protected - 64)) | (1L << (AccessModifier_public - 64)) | (1L << (AccessModifier_internal - 64)) | (1L << (Modifier_const - 64)) | (1L << (VarianceAnnotation_out - 64)) | (1L << (DOG - 64)) | (1L << (SimpleName - 64)))) != 0)) {
				{
				setState(490);
				functionType_paramOrType();
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(491);
					match(COMMA);
					setState(492);
					functionType_paramOrType();
					}
					}
					setState(497);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(500);
			match(BRACE_CLOSE);
			setState(501);
			match(OP_ASTERISK);
			setState(502);
			type();
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
			setState(504);
			match(BRACE_OPEN);
			setState(505);
			variableDeclarationEntry();
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(506);
				match(COMMA);
				setState(507);
				variableDeclarationEntry();
				}
				}
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(513);
			match(BRACE_CLOSE);
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
			setState(518);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(515);
					modifier();
					}
					} 
				}
				setState(520);
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
			setState(521);
			modifierKeyword();
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
		public HierarchyModifierContext hierarchyModifier() {
			return getRuleContext(HierarchyModifierContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public VarianceAnnotationContext varianceAnnotation() {
			return getRuleContext(VarianceAnnotationContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public ClassModifierContext classModifier() {
			return getRuleContext(ClassModifierContext.class,0);
		}
		public KeyWordModifierContext keyWordModifier() {
			return getRuleContext(KeyWordModifierContext.class,0);
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
			setState(530);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HierarchyModifier_abstract:
			case HierarchyModifier_open:
			case HierarchyModifier_final:
			case HierarchyModifier_override:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				hierarchyModifier();
				}
				break;
			case AccessModifier_private:
			case AccessModifier_protected:
			case AccessModifier_public:
			case AccessModifier_internal:
			case Modifier_const:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				accessModifier();
				}
				break;
			case OP_IN:
			case VarianceAnnotation_out:
				enterOuterAlt(_localctx, 3);
				{
				setState(525);
				varianceAnnotation();
				}
				break;
			case DOG:
				enterOuterAlt(_localctx, 4);
				{
				setState(526);
				annotations();
				}
				break;
			case ClassModifier_enum:
			case ClassModifier_annotation:
			case ClassModifier_data:
			case ClassModifier_sealed:
				enterOuterAlt(_localctx, 5);
				{
				setState(527);
				classModifier();
				}
				break;
			case KeyWordModifier_operator:
			case KeyWordModifier_infix:
			case KeyWordModifier_inline:
				enterOuterAlt(_localctx, 6);
				{
				setState(528);
				keyWordModifier();
				}
				break;
			case KEYWORD_vararg:
				enterOuterAlt(_localctx, 7);
				{
				setState(529);
				match(KEYWORD_vararg);
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
			setState(533); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(532);
					annotation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(535); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
			setState(537);
			match(DOG);
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (GET - 68)) | (1L << (SET - 68)) | (1L << (AnnotationUseSiteTarget_file - 68)) | (1L << (AnnotationUseSiteTarget_field - 68)) | (1L << (AnnotationUseSiteTarget_property - 68)) | (1L << (AnnotationUseSiteTarget_param - 68)) | (1L << (AnnotationUseSiteTarget_sparam - 68)))) != 0)) {
				{
				setState(538);
				annotationUseSiteTarget();
				setState(539);
				match(COLON);
				}
			}

			setState(543);
			unescapedAnnotation();
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
			setState(545);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (GET - 68)) | (1L << (SET - 68)) | (1L << (AnnotationUseSiteTarget_file - 68)) | (1L << (AnnotationUseSiteTarget_field - 68)) | (1L << (AnnotationUseSiteTarget_property - 68)) | (1L << (AnnotationUseSiteTarget_param - 68)) | (1L << (AnnotationUseSiteTarget_sparam - 68)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ValueArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(547);
				identifier();
				setState(548);
				match(EQ);
				}
				break;
			}
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(552);
				match(STAR);
				}
			}

			setState(555);
			expression();
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
			setState(557);
			match(BRACE_OPEN);
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << OPEN_BLOCK) | (1L << HexadecimalLiteral) | (1L << CharacterLiteral) | (1L << TRIPLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << PACKAGE) | (1L << IMPORT) | (1L << STAR) | (1L << BRACE_OPEN) | (1L << REFERENCE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << OP_PLUS) | (1L << OP_MUNUS) | (1L << OP_DECREMENT) | (1L << OP_INCREMENT) | (1L << OP_NOT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (ClassModifier_enum - 77)) | (1L << (ClassModifier_data - 77)) | (1L << (AccessModifier_private - 77)) | (1L << (AccessModifier_protected - 77)) | (1L << (AccessModifier_public - 77)) | (1L << (AccessModifier_internal - 77)) | (1L << (Modifier_const - 77)) | (1L << (DOG - 77)) | (1L << (Jump_throw - 77)) | (1L << (Jump_continue - 77)) | (1L << (Jump_return - 77)) | (1L << (Jump_break - 77)) | (1L << (ConstructorDelegationCall_this - 77)) | (1L << (ConstructorDelegationCall_super - 77)) | (1L << (Declaration_object - 77)) | (1L << (Declaration_companion - 77)) | (1L << (Declaration_fun - 77)) | (1L << (Declaration_init - 77)) | (1L << (CF_if - 77)) | (1L << (CF_when - 77)) | (1L << (CF_while - 77)) | (1L << (CF_for - 77)) | (1L << (CF_do - 77)) | (1L << (CF_try - 77)) | (1L << (BAX - 77)) | (1L << (SimpleName - 77)))) != 0)) {
				{
				setState(558);
				valueArgument();
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(559);
					match(COMMA);
					setState(560);
					valueArgument();
					}
					}
					setState(565);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(568);
			match(BRACE_CLOSE);
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
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
			setState(570);
			identifier();
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(571);
				match(DOT);
				setState(572);
				identifier();
				}
				}
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(578);
				typeArguments();
				}
			}

			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(581);
				valueArguments();
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
			setState(601);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Jump_throw:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				match(Jump_throw);
				setState(585);
				expression();
				}
				break;
			case Jump_return:
				enterOuterAlt(_localctx, 2);
				{
				setState(586);
				match(Jump_return);
				setState(588);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(587);
					labelReference();
					}
					break;
				}
				setState(591);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(590);
					expression();
					}
					break;
				}
				}
				break;
			case Jump_continue:
				enterOuterAlt(_localctx, 3);
				{
				setState(593);
				match(Jump_continue);
				setState(595);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(594);
					labelReference();
					}
					break;
				}
				}
				break;
			case Jump_break:
				enterOuterAlt(_localctx, 4);
				{
				setState(597);
				match(Jump_break);
				setState(599);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(598);
					labelReference();
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
			setState(603);
			match(DOG);
			setState(608);
			_errHandler.sync(this);
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
				setState(604);
				identifier();
				}
				break;
			case CF_for:
				{
				setState(605);
				match(CF_for);
				}
				break;
			case CF_while:
				{
				setState(606);
				match(CF_while);
				}
				break;
			case CF_when:
				{
				setState(607);
				match(CF_when);
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
			setState(610);
			identifier();
			setState(611);
			match(DOG);
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
			setState(613);
			match(SimpleName);
			setState(614);
			match(COLON);
			setState(615);
			type();
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
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(617);
				funcParameterWithoutDefault();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(618);
				funcParameterWithDefault();
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
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
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
			setState(621);
			modifiers();
			setState(622);
			parameter();
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
			setState(624);
			funcParameterWithoutDefault();
			setState(625);
			match(EQ);
			setState(626);
			expression();
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
		public ConstructorParameterWithoutDefaultContext constructorParameterWithoutDefault() {
			return getRuleContext(ConstructorParameterWithoutDefaultContext.class,0);
		}
		public ConstructorParameterWithDefaultContext constructorParameterWithDefault() {
			return getRuleContext(ConstructorParameterWithDefaultContext.class,0);
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
			setState(630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(628);
				constructorParameterWithoutDefault();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(629);
				constructorParameterWithDefault();
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
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
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
			setState(632);
			modifiers();
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_val || _la==KEYWORD_var) {
				{
				setState(633);
				_la = _input.LA(1);
				if ( !(_la==KEYWORD_val || _la==KEYWORD_var) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(636);
			parameter();
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
		public ConstructorParameterWithoutDefaultContext constructorParameterWithoutDefault() {
			return getRuleContext(ConstructorParameterWithoutDefaultContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(638);
			constructorParameterWithoutDefault();
			setState(639);
			match(EQ);
			setState(640);
			expression();
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
		public List<ConstructorParameterContext> constructorParameter() {
			return getRuleContexts(ConstructorParameterContext.class);
		}
		public ConstructorParameterContext constructorParameter(int i) {
			return getRuleContext(ConstructorParameterContext.class,i);
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
			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (AccessModifier_private - 81)) | (1L << (AccessModifier_protected - 81)) | (1L << (AccessModifier_public - 81)) | (1L << (AccessModifier_internal - 81)) | (1L << (Modifier_const - 81)) | (1L << (KEYWORD_constructor - 81)))) != 0)) {
				{
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (AccessModifier_private - 81)) | (1L << (AccessModifier_protected - 81)) | (1L << (AccessModifier_public - 81)) | (1L << (AccessModifier_internal - 81)) | (1L << (Modifier_const - 81)))) != 0)) {
					{
					setState(642);
					accessModifier();
					}
				}

				setState(645);
				match(KEYWORD_constructor);
				}
			}

			{
			setState(648);
			match(BRACE_OPEN);
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_IN) | (1L << KEYWORD_val) | (1L << KEYWORD_var))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KEYWORD_vararg - 64)) | (1L << (HierarchyModifier_abstract - 64)) | (1L << (HierarchyModifier_open - 64)) | (1L << (HierarchyModifier_final - 64)) | (1L << (HierarchyModifier_override - 64)) | (1L << (KeyWordModifier_operator - 64)) | (1L << (KeyWordModifier_infix - 64)) | (1L << (KeyWordModifier_inline - 64)) | (1L << (ClassModifier_enum - 64)) | (1L << (ClassModifier_annotation - 64)) | (1L << (ClassModifier_data - 64)) | (1L << (ClassModifier_sealed - 64)) | (1L << (AccessModifier_private - 64)) | (1L << (AccessModifier_protected - 64)) | (1L << (AccessModifier_public - 64)) | (1L << (AccessModifier_internal - 64)) | (1L << (Modifier_const - 64)) | (1L << (VarianceAnnotation_out - 64)) | (1L << (DOG - 64)) | (1L << (SimpleName - 64)))) != 0)) {
				{
				setState(649);
				constructorParameter();
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(650);
					match(COMMA);
					setState(651);
					constructorParameter();
					}
					}
					setState(656);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(659);
			match(BRACE_CLOSE);
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
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ConstructorDelegationCallContext constructorDelegationCall() {
			return getRuleContext(ConstructorDelegationCallContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public List<ConstructorParameterContext> constructorParameter() {
			return getRuleContexts(ConstructorParameterContext.class);
		}
		public ConstructorParameterContext constructorParameter(int i) {
			return getRuleContext(ConstructorParameterContext.class,i);
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
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (AccessModifier_private - 81)) | (1L << (AccessModifier_protected - 81)) | (1L << (AccessModifier_public - 81)) | (1L << (AccessModifier_internal - 81)) | (1L << (Modifier_const - 81)))) != 0)) {
				{
				setState(661);
				accessModifier();
				}
			}

			setState(664);
			match(KEYWORD_constructor);
			{
			setState(665);
			match(BRACE_OPEN);
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_IN) | (1L << KEYWORD_val) | (1L << KEYWORD_var))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KEYWORD_vararg - 64)) | (1L << (HierarchyModifier_abstract - 64)) | (1L << (HierarchyModifier_open - 64)) | (1L << (HierarchyModifier_final - 64)) | (1L << (HierarchyModifier_override - 64)) | (1L << (KeyWordModifier_operator - 64)) | (1L << (KeyWordModifier_infix - 64)) | (1L << (KeyWordModifier_inline - 64)) | (1L << (ClassModifier_enum - 64)) | (1L << (ClassModifier_annotation - 64)) | (1L << (ClassModifier_data - 64)) | (1L << (ClassModifier_sealed - 64)) | (1L << (AccessModifier_private - 64)) | (1L << (AccessModifier_protected - 64)) | (1L << (AccessModifier_public - 64)) | (1L << (AccessModifier_internal - 64)) | (1L << (Modifier_const - 64)) | (1L << (VarianceAnnotation_out - 64)) | (1L << (DOG - 64)) | (1L << (SimpleName - 64)))) != 0)) {
				{
				setState(666);
				constructorParameter();
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(667);
					match(COMMA);
					setState(668);
					constructorParameter();
					}
					}
					setState(673);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(676);
			match(BRACE_CLOSE);
			}
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(678);
				match(COLON);
				setState(679);
				constructorDelegationCall();
				}
			}

			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BLOCK) {
				{
				setState(682);
				block();
				}
			}

			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(685);
				match(SEMI);
				}
				}
				setState(690);
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
			setState(695);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ConstructorDelegationCall_this:
				enterOuterAlt(_localctx, 1);
				{
				setState(691);
				match(ConstructorDelegationCall_this);
				setState(692);
				valueArguments();
				}
				break;
			case ConstructorDelegationCall_super:
				enterOuterAlt(_localctx, 2);
				{
				setState(693);
				match(ConstructorDelegationCall_super);
				setState(694);
				valueArguments();
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
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
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
			setState(708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(697);
					typeArguments();
					}
				}

				setState(700);
				valueArguments();
				setState(702);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(701);
					annotatedLambda();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
				typeArguments();
				setState(705);
				annotatedLambda();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(707);
				annotatedLambda();
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
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
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
			setState(710);
			userType();
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(711);
				typeArguments();
				}
			}

			setState(714);
			valueArguments();
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
			setState(716);
			userType();
			setState(717);
			match(KEYWORD_by);
			setState(718);
			expression();
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
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public ExplicitDelegationContext explicitDelegation() {
			return getRuleContext(ExplicitDelegationContext.class,0);
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
			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				constructorInvocation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
				userType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(722);
				explicitDelegation();
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
		enterRule(_localctx, 96, RULE_supertypesSpecifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			match(COLON);
			setState(726);
			delegationSpecifier();
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(727);
				match(COMMA);
				setState(728);
				delegationSpecifier();
				}
				}
				setState(733);
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

	public static class TypealiasDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode SimpleName() { return getToken(KotlinParser.SimpleName, 0); }
		public SimpleUserTypeContext simpleUserType() {
			return getRuleContext(SimpleUserTypeContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
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
		enterRule(_localctx, 98, RULE_typealiasDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			modifiers();
			setState(735);
			match(Declaration_typealias);
			setState(736);
			match(SimpleName);
			setState(737);
			match(EQ);
			setState(738);
			simpleUserType();
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(739);
				match(SEMI);
				}
				}
				setState(744);
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
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public SupertypesSpecifiersContext supertypesSpecifiers() {
			return getRuleContext(SupertypesSpecifiersContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
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
		enterRule(_localctx, 100, RULE_companionObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			modifiers();
			setState(746);
			match(Declaration_companion);
			setState(747);
			match(Declaration_object);
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(748);
				supertypesSpecifiers();
				}
			}

			setState(751);
			classBody();
			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(752);
				match(SEMI);
				}
				}
				setState(757);
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
		enterRule(_localctx, 102, RULE_classBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(758);
				match(OPEN_BLOCK);
				setState(759);
				members();
				setState(760);
				match(CLOSE_BLOCK);
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
		enterRule(_localctx, 104, RULE_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (OP_IN - 44)) | (1L << (KEYWORD_val - 44)) | (1L << (KEYWORD_lateinit_var - 44)) | (1L << (KEYWORD_vararg - 44)) | (1L << (HierarchyModifier_abstract - 44)) | (1L << (HierarchyModifier_open - 44)) | (1L << (HierarchyModifier_final - 44)) | (1L << (HierarchyModifier_override - 44)) | (1L << (KeyWordModifier_operator - 44)) | (1L << (KeyWordModifier_infix - 44)) | (1L << (KeyWordModifier_inline - 44)) | (1L << (ClassModifier_enum - 44)) | (1L << (ClassModifier_annotation - 44)) | (1L << (ClassModifier_data - 44)) | (1L << (ClassModifier_sealed - 44)) | (1L << (AccessModifier_private - 44)) | (1L << (AccessModifier_protected - 44)) | (1L << (AccessModifier_public - 44)) | (1L << (AccessModifier_internal - 44)) | (1L << (Modifier_const - 44)) | (1L << (VarianceAnnotation_out - 44)) | (1L << (DOG - 44)) | (1L << (KEYWORD_constructor - 44)) | (1L << (Declaration_class - 44)) | (1L << (Declaration_interface - 44)) | (1L << (Declaration_object - 44)) | (1L << (Declaration_companion - 44)) | (1L << (Declaration_fun - 44)) | (1L << (Declaration_init - 44)))) != 0)) {
				{
				{
				setState(764);
				memberDeclaration();
				}
				}
				setState(769);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 106, RULE_statements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(770);
					match(SEMI);
					}
					} 
				}
				setState(775);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			setState(789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << OPEN_BLOCK) | (1L << HexadecimalLiteral) | (1L << CharacterLiteral) | (1L << TRIPLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << PACKAGE) | (1L << IMPORT) | (1L << BRACE_OPEN) | (1L << REFERENCE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << OP_PLUS) | (1L << OP_MUNUS) | (1L << OP_IN) | (1L << OP_DECREMENT) | (1L << OP_INCREMENT) | (1L << OP_NOT) | (1L << KEYWORD_val) | (1L << KEYWORD_lateinit_var))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KEYWORD_vararg - 64)) | (1L << (HierarchyModifier_abstract - 64)) | (1L << (HierarchyModifier_open - 64)) | (1L << (HierarchyModifier_final - 64)) | (1L << (HierarchyModifier_override - 64)) | (1L << (KeyWordModifier_operator - 64)) | (1L << (KeyWordModifier_infix - 64)) | (1L << (KeyWordModifier_inline - 64)) | (1L << (ClassModifier_enum - 64)) | (1L << (ClassModifier_annotation - 64)) | (1L << (ClassModifier_data - 64)) | (1L << (ClassModifier_sealed - 64)) | (1L << (AccessModifier_private - 64)) | (1L << (AccessModifier_protected - 64)) | (1L << (AccessModifier_public - 64)) | (1L << (AccessModifier_internal - 64)) | (1L << (Modifier_const - 64)) | (1L << (VarianceAnnotation_out - 64)) | (1L << (DOG - 64)) | (1L << (Jump_throw - 64)) | (1L << (Jump_continue - 64)) | (1L << (Jump_return - 64)) | (1L << (Jump_break - 64)) | (1L << (ConstructorDelegationCall_this - 64)) | (1L << (ConstructorDelegationCall_super - 64)) | (1L << (Declaration_class - 64)) | (1L << (Declaration_interface - 64)) | (1L << (Declaration_object - 64)) | (1L << (Declaration_companion - 64)) | (1L << (Declaration_fun - 64)) | (1L << (Declaration_init - 64)) | (1L << (CF_if - 64)) | (1L << (CF_when - 64)) | (1L << (CF_while - 64)) | (1L << (CF_for - 64)) | (1L << (CF_do - 64)) | (1L << (CF_try - 64)) | (1L << (BAX - 64)) | (1L << (SimpleName - 64)))) != 0)) {
				{
				setState(776);
				statement();
				setState(786);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(780);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SEMI) {
							{
							{
							setState(777);
							match(SEMI);
							}
							}
							setState(782);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(783);
						statement();
						}
						} 
					}
					setState(788);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				}
				}
			}

			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(791);
				match(SEMI);
				}
				}
				setState(796);
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
		enterRule(_localctx, 108, RULE_functionBody);
		try {
			setState(800);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BLOCK:
				enterOuterAlt(_localctx, 1);
				{
				setState(797);
				block();
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(798);
				match(EQ);
				setState(799);
				expression();
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
		enterRule(_localctx, 110, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			match(OPEN_BLOCK);
			setState(803);
			statements();
			setState(804);
			match(CLOSE_BLOCK);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
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
		enterRule(_localctx, 112, RULE_anonymousInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			match(Declaration_init);
			setState(807);
			block();
			setState(811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(808);
				match(SEMI);
				}
				}
				setState(813);
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
		enterRule(_localctx, 114, RULE_enumClassBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(OPEN_BLOCK);
			setState(815);
			enumEntries();
			setState(818);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(816);
				match(SEMI);
				setState(817);
				members();
				}
			}

			setState(820);
			match(CLOSE_BLOCK);
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
		public List<EnumEntryContext> enumEntry() {
			return getRuleContexts(EnumEntryContext.class);
		}
		public EnumEntryContext enumEntry(int i) {
			return getRuleContext(EnumEntryContext.class,i);
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
		enterRule(_localctx, 116, RULE_enumEntries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_IN || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KEYWORD_vararg - 64)) | (1L << (HierarchyModifier_abstract - 64)) | (1L << (HierarchyModifier_open - 64)) | (1L << (HierarchyModifier_final - 64)) | (1L << (HierarchyModifier_override - 64)) | (1L << (KeyWordModifier_operator - 64)) | (1L << (KeyWordModifier_infix - 64)) | (1L << (KeyWordModifier_inline - 64)) | (1L << (ClassModifier_enum - 64)) | (1L << (ClassModifier_annotation - 64)) | (1L << (ClassModifier_data - 64)) | (1L << (ClassModifier_sealed - 64)) | (1L << (AccessModifier_private - 64)) | (1L << (AccessModifier_protected - 64)) | (1L << (AccessModifier_public - 64)) | (1L << (AccessModifier_internal - 64)) | (1L << (Modifier_const - 64)) | (1L << (VarianceAnnotation_out - 64)) | (1L << (DOG - 64)) | (1L << (SimpleName - 64)))) != 0)) {
				{
				{
				setState(822);
				enumEntry();
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(823);
					match(COMMA);
					}
				}

				}
				}
				setState(830);
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
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode SimpleName() { return getToken(KotlinParser.SimpleName, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ValueArgumentsContext valueArguments() {
			return getRuleContext(ValueArgumentsContext.class,0);
		}
		public ConstructorInvocationContext constructorInvocation() {
			return getRuleContext(ConstructorInvocationContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
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
		enterRule(_localctx, 118, RULE_enumEntry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			modifiers();
			setState(832);
			match(SimpleName);
			setState(839);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				{
				{
				setState(833);
				match(COLON);
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOG) {
					{
					setState(834);
					annotations();
					}
				}

				setState(837);
				constructorInvocation();
				}
				}
				break;
			case BRACE_OPEN:
				{
				setState(838);
				valueArguments();
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
				break;
			}
			setState(841);
			classBody();
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
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
		enterRule(_localctx, 120, RULE_ifExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			match(CF_if);
			setState(844);
			match(BRACE_OPEN);
			setState(845);
			expression();
			setState(846);
			match(BRACE_CLOSE);
			setState(847);
			expression();
			setState(851);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(848);
					match(SEMI);
					}
					} 
				}
				setState(853);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			setState(856);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(854);
				match(CF_else);
				setState(855);
				expression();
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<CatchBlockContext> catchBlock() {
			return getRuleContexts(CatchBlockContext.class);
		}
		public CatchBlockContext catchBlock(int i) {
			return getRuleContext(CatchBlockContext.class,i);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
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
		enterRule(_localctx, 122, RULE_tryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			match(CF_try);
			setState(859);
			block();
			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CF_catch) {
				{
				{
				setState(860);
				catchBlock();
				}
				}
				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CF_FINALLY) {
				{
				setState(866);
				finallyBlock();
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
		public UserTypeContext userType() {
			return getRuleContext(UserTypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
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
		enterRule(_localctx, 124, RULE_catchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			match(CF_catch);
			setState(870);
			match(BRACE_OPEN);
			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOG) {
				{
				setState(871);
				annotations();
				}
			}

			setState(874);
			match(SimpleName);
			setState(875);
			match(COLON);
			setState(876);
			userType();
			setState(877);
			match(BRACE_CLOSE);
			setState(878);
			block();
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
		enterRule(_localctx, 126, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			match(CF_FINALLY);
			setState(881);
			block();
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
		enterRule(_localctx, 128, RULE_loop);
		try {
			setState(886);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CF_for:
				enterOuterAlt(_localctx, 1);
				{
				setState(883);
				forLoop();
				}
				break;
			case CF_while:
				enterOuterAlt(_localctx, 2);
				{
				setState(884);
				whileLoop();
				}
				break;
			case CF_do:
				enterOuterAlt(_localctx, 3);
				{
				setState(885);
				doWhileLoop();
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultipleVariableDeclarationsContext multipleVariableDeclarations() {
			return getRuleContext(MultipleVariableDeclarationsContext.class,0);
		}
		public VariableDeclarationEntryContext variableDeclarationEntry() {
			return getRuleContext(VariableDeclarationEntryContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
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
		enterRule(_localctx, 130, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			match(CF_for);
			setState(889);
			match(BRACE_OPEN);
			setState(891);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOG) {
				{
				setState(890);
				annotations();
				}
			}

			setState(895);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BRACE_OPEN:
				{
				setState(893);
				multipleVariableDeclarations();
				}
				break;
			case SimpleName:
				{
				setState(894);
				variableDeclarationEntry();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(897);
			match(OP_IN);
			setState(898);
			expression();
			setState(899);
			match(BRACE_CLOSE);
			setState(900);
			expression();
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 132, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			match(CF_while);
			setState(903);
			match(BRACE_OPEN);
			setState(904);
			expression();
			setState(905);
			match(BRACE_CLOSE);
			setState(906);
			expression();
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 134, RULE_doWhileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			match(CF_do);
			setState(909);
			expression();
			setState(910);
			match(CF_while);
			setState(911);
			match(BRACE_OPEN);
			setState(912);
			expression();
			setState(913);
			match(BRACE_CLOSE);
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
		public List<DisjunctionContext> disjunction() {
			return getRuleContexts(DisjunctionContext.class);
		}
		public DisjunctionContext disjunction(int i) {
			return getRuleContext(DisjunctionContext.class,i);
		}
		public List<AssignmentOperatorContext> assignmentOperator() {
			return getRuleContexts(AssignmentOperatorContext.class);
		}
		public AssignmentOperatorContext assignmentOperator(int i) {
			return getRuleContext(AssignmentOperatorContext.class,i);
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
		enterRule(_localctx, 136, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			disjunction();
			setState(921);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(916);
					assignmentOperator();
					setState(917);
					disjunction();
					}
					} 
				}
				setState(923);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
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
		enterRule(_localctx, 138, RULE_disjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			conjunction();
			setState(929);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(925);
					match(DISJ);
					setState(926);
					conjunction();
					}
					} 
				}
				setState(931);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
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
		enterRule(_localctx, 140, RULE_conjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			equalityComparison();
			setState(937);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(933);
					match(CONJ);
					setState(934);
					equalityComparison();
					}
					} 
				}
				setState(939);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
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
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public List<EqualityOperationContext> equalityOperation() {
			return getRuleContexts(EqualityOperationContext.class);
		}
		public EqualityOperationContext equalityOperation(int i) {
			return getRuleContext(EqualityOperationContext.class,i);
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
		enterRule(_localctx, 142, RULE_equalityComparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			comparison();
			setState(946);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(941);
					equalityOperation();
					setState(942);
					comparison();
					}
					} 
				}
				setState(948);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
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
		public List<ComparisonOperationContext> comparisonOperation() {
			return getRuleContexts(ComparisonOperationContext.class);
		}
		public ComparisonOperationContext comparisonOperation(int i) {
			return getRuleContext(ComparisonOperationContext.class,i);
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
		enterRule(_localctx, 144, RULE_comparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			namedInfix();
			setState(955);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(950);
					comparisonOperation();
					setState(951);
					namedInfix();
					}
					} 
				}
				setState(957);
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

	public static class NamedInfixContext extends ParserRuleContext {
		public List<ElvisExpressionContext> elvisExpression() {
			return getRuleContexts(ElvisExpressionContext.class);
		}
		public ElvisExpressionContext elvisExpression(int i) {
			return getRuleContext(ElvisExpressionContext.class,i);
		}
		public List<InOperationContext> inOperation() {
			return getRuleContexts(InOperationContext.class);
		}
		public InOperationContext inOperation(int i) {
			return getRuleContext(InOperationContext.class,i);
		}
		public IsOperationContext isOperation() {
			return getRuleContext(IsOperationContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 146, RULE_namedInfix);
		try {
			int _alt;
			setState(973);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(958);
				elvisExpression();
				setState(964);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(959);
						inOperation();
						setState(960);
						elvisExpression();
						}
						} 
					}
					setState(966);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(967);
				elvisExpression();
				setState(971);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(968);
					isOperation();
					setState(969);
					type();
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
		public List<InfixFunctionCallContext> infixFunctionCall() {
			return getRuleContexts(InfixFunctionCallContext.class);
		}
		public InfixFunctionCallContext infixFunctionCall(int i) {
			return getRuleContext(InfixFunctionCallContext.class,i);
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
		enterRule(_localctx, 148, RULE_elvisExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			infixFunctionCall();
			setState(980);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(976);
					match(ELVIS);
					setState(977);
					infixFunctionCall();
					}
					} 
				}
				setState(982);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
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
		public List<RangeExpressionContext> rangeExpression() {
			return getRuleContexts(RangeExpressionContext.class);
		}
		public RangeExpressionContext rangeExpression(int i) {
			return getRuleContext(RangeExpressionContext.class,i);
		}
		public List<TerminalNode> SimpleName() { return getTokens(KotlinParser.SimpleName); }
		public TerminalNode SimpleName(int i) {
			return getToken(KotlinParser.SimpleName, i);
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
		enterRule(_localctx, 150, RULE_infixFunctionCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			rangeExpression();
			setState(988);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(984);
					match(SimpleName);
					setState(985);
					rangeExpression();
					}
					} 
				}
				setState(990);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
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
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
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
		enterRule(_localctx, 152, RULE_rangeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(991);
			additiveExpression();
			setState(996);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(992);
					match(RANGE);
					setState(993);
					additiveExpression();
					}
					} 
				}
				setState(998);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<AdditiveOperationContext> additiveOperation() {
			return getRuleContexts(AdditiveOperationContext.class);
		}
		public AdditiveOperationContext additiveOperation(int i) {
			return getRuleContext(AdditiveOperationContext.class,i);
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
		enterRule(_localctx, 154, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
			multiplicativeExpression();
			setState(1005);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1000);
					additiveOperation();
					setState(1001);
					multiplicativeExpression();
					}
					} 
				}
				setState(1007);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
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
		public List<TypeRHSContext> typeRHS() {
			return getRuleContexts(TypeRHSContext.class);
		}
		public TypeRHSContext typeRHS(int i) {
			return getRuleContext(TypeRHSContext.class,i);
		}
		public List<MultiplicativeOperationContext> multiplicativeOperation() {
			return getRuleContexts(MultiplicativeOperationContext.class);
		}
		public MultiplicativeOperationContext multiplicativeOperation(int i) {
			return getRuleContext(MultiplicativeOperationContext.class,i);
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
		enterRule(_localctx, 156, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			typeRHS();
			setState(1014);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1009);
					multiplicativeOperation();
					setState(1010);
					typeRHS();
					}
					} 
				}
				setState(1016);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
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
		public List<PrefixUnaryExpressionContext> prefixUnaryExpression() {
			return getRuleContexts(PrefixUnaryExpressionContext.class);
		}
		public PrefixUnaryExpressionContext prefixUnaryExpression(int i) {
			return getRuleContext(PrefixUnaryExpressionContext.class,i);
		}
		public List<TypeOperationContext> typeOperation() {
			return getRuleContexts(TypeOperationContext.class);
		}
		public TypeOperationContext typeOperation(int i) {
			return getRuleContext(TypeOperationContext.class,i);
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
		enterRule(_localctx, 158, RULE_typeRHS);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			prefixUnaryExpression();
			setState(1023);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1018);
					typeOperation();
					setState(1019);
					prefixUnaryExpression();
					}
					} 
				}
				setState(1025);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
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
		public PostfixUnaryExpressionContext postfixUnaryExpression() {
			return getRuleContext(PostfixUnaryExpressionContext.class,0);
		}
		public List<PrefixUnaryOperationContext> prefixUnaryOperation() {
			return getRuleContexts(PrefixUnaryOperationContext.class);
		}
		public PrefixUnaryOperationContext prefixUnaryOperation(int i) {
			return getRuleContext(PrefixUnaryOperationContext.class,i);
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
		enterRule(_localctx, 160, RULE_prefixUnaryExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1026);
					prefixUnaryOperation();
					}
					} 
				}
				setState(1031);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			}
			setState(1032);
			postfixUnaryExpression();
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
		public CallableReferenceContext callableReference() {
			return getRuleContext(CallableReferenceContext.class,0);
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
		enterRule(_localctx, 162, RULE_postfixUnaryExpression);
		try {
			int _alt;
			setState(1053);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1034);
				atomicExpression();
				setState(1035);
				callSuffix();
				setState(1037);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1036);
					lastArgLambda();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1039);
				atomicExpression();
				setState(1043);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1040);
						postfixUnaryOperation();
						}
						} 
					}
					setState(1045);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1046);
				callableReference();
				setState(1050);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1047);
						postfixUnaryOperation();
						}
						} 
					}
					setState(1052);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
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
		enterRule(_localctx, 164, RULE_callableReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PACKAGE:
			case REFERENCE:
			case SimpleName:
				{
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PACKAGE || _la==SimpleName) {
					{
					setState(1055);
					userType();
					setState(1059);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Q) {
						{
						{
						setState(1056);
						match(Q);
						}
						}
						setState(1061);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case ConstructorDelegationCall_this:
				{
				setState(1064);
				match(ConstructorDelegationCall_this);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1067);
			match(REFERENCE);
			setState(1070);
			_errHandler.sync(this);
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
				setState(1068);
				identifier();
				}
				break;
			case Declaration_class:
				{
				setState(1069);
				match(Declaration_class);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1073);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1072);
				typeArguments();
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
		public TerminalNode ClassModifier_enum() { return getToken(KotlinParser.ClassModifier_enum, 0); }
		public TerminalNode IMPORT() { return getToken(KotlinParser.IMPORT, 0); }
		public TerminalNode Declaration_companion() { return getToken(KotlinParser.Declaration_companion, 0); }
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
		enterRule(_localctx, 166, RULE_identifier);
		try {
			setState(1082);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SimpleName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1075);
				match(SimpleName);
				}
				break;
			case ClassModifier_enum:
				enterOuterAlt(_localctx, 2);
				{
				setState(1076);
				match(ClassModifier_enum);
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1077);
				match(IMPORT);
				}
				break;
			case Declaration_companion:
				enterOuterAlt(_localctx, 4);
				{
				setState(1078);
				match(Declaration_companion);
				}
				break;
			case Declaration_init:
				enterOuterAlt(_localctx, 5);
				{
				setState(1079);
				match(Declaration_init);
				}
				break;
			case AccessModifier_private:
			case AccessModifier_protected:
			case AccessModifier_public:
			case AccessModifier_internal:
			case Modifier_const:
				enterOuterAlt(_localctx, 6);
				{
				setState(1080);
				accessModifier();
				}
				break;
			case ClassModifier_data:
				enterOuterAlt(_localctx, 7);
				{
				setState(1081);
				match(ClassModifier_data);
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
		public TerminalNode SINGLE_QUOTE() { return getToken(KotlinParser.SINGLE_QUOTE, 0); }
		public List<TerminalNode> SINLE_QUOTE_CLOSE() { return getTokens(KotlinParser.SINLE_QUOTE_CLOSE); }
		public TerminalNode SINLE_QUOTE_CLOSE(int i) {
			return getToken(KotlinParser.SINLE_QUOTE_CLOSE, i);
		}
		public List<TerminalNode> SINLE_QUOTE_ESCAPED_CHAR() { return getTokens(KotlinParser.SINLE_QUOTE_ESCAPED_CHAR); }
		public TerminalNode SINLE_QUOTE_ESCAPED_CHAR(int i) {
			return getToken(KotlinParser.SINLE_QUOTE_ESCAPED_CHAR, i);
		}
		public List<TerminalNode> SINLE_QUOTE_EXPRESSION_START() { return getTokens(KotlinParser.SINLE_QUOTE_EXPRESSION_START); }
		public TerminalNode SINLE_QUOTE_EXPRESSION_START(int i) {
			return getToken(KotlinParser.SINLE_QUOTE_EXPRESSION_START, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> CLOSE_BLOCK() { return getTokens(KotlinParser.CLOSE_BLOCK); }
		public TerminalNode CLOSE_BLOCK(int i) {
			return getToken(KotlinParser.CLOSE_BLOCK, i);
		}
		public List<TerminalNode> SINGLE_QUOTE_REF() { return getTokens(KotlinParser.SINGLE_QUOTE_REF); }
		public TerminalNode SINGLE_QUOTE_REF(int i) {
			return getToken(KotlinParser.SINGLE_QUOTE_REF, i);
		}
		public TerminalNode TRIPLE_QUOTE() { return getToken(KotlinParser.TRIPLE_QUOTE, 0); }
		public List<TerminalNode> MULTILINE_QUOTE_CLOSE() { return getTokens(KotlinParser.MULTILINE_QUOTE_CLOSE); }
		public TerminalNode MULTILINE_QUOTE_CLOSE(int i) {
			return getToken(KotlinParser.MULTILINE_QUOTE_CLOSE, i);
		}
		public List<TerminalNode> MULTILINE_QUOTE_EXPRESSION_START() { return getTokens(KotlinParser.MULTILINE_QUOTE_EXPRESSION_START); }
		public TerminalNode MULTILINE_QUOTE_EXPRESSION_START(int i) {
			return getToken(KotlinParser.MULTILINE_QUOTE_EXPRESSION_START, i);
		}
		public List<TerminalNode> MULTILINE_QUOTE_REF() { return getTokens(KotlinParser.MULTILINE_QUOTE_REF); }
		public TerminalNode MULTILINE_QUOTE_REF(int i) {
			return getToken(KotlinParser.MULTILINE_QUOTE_REF, i);
		}
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
		enterRule(_localctx, 168, RULE_stringLiteral);
		int _la;
		try {
			setState(1111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1084);
				match(SINGLE_QUOTE);
				setState(1094);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (MULTILINE_COMMENT - 1)) | (1L << (SINGLELINE_COMMENT - 1)) | (1L << (WHITESPACE - 1)) | (1L << (IntegerLiteral - 1)) | (1L << (SEMI - 1)) | (1L << (OPEN_BLOCK - 1)) | (1L << (CLOSE_BLOCK - 1)) | (1L << (HexadecimalLiteral - 1)) | (1L << (CharacterLiteral - 1)) | (1L << (TRIPLE_QUOTE - 1)) | (1L << (SINGLE_QUOTE - 1)) | (1L << (PACKAGE - 1)) | (1L << (IMPORT - 1)) | (1L << (DOT - 1)) | (1L << (STAR - 1)) | (1L << (COMMA - 1)) | (1L << (LT - 1)) | (1L << (LTE - 1)) | (1L << (GT - 1)) | (1L << (GTE - 1)) | (1L << (EQ - 1)) | (1L << (EQ_EQ - 1)) | (1L << (EQ_EQ_EQ - 1)) | (1L << (NEQ - 1)) | (1L << (COLON - 1)) | (1L << (BRACE_OPEN - 1)) | (1L << (BRACE_CLOSE - 1)) | (1L << (Q - 1)) | (1L << (DA - 1)) | (1L << (DISJ - 1)) | (1L << (CONJ - 1)) | (1L << (ELVIS - 1)) | (1L << (LONG_RANGE - 1)) | (1L << (RANGE - 1)) | (1L << (REFERENCE - 1)) | (1L << (TRUE - 1)) | (1L << (FALSE - 1)) | (1L << (NULL - 1)) | (1L << (OP_ASTERISK - 1)) | (1L << (OP_DIV - 1)) | (1L << (OP_MOD - 1)) | (1L << (OP_PLUS - 1)) | (1L << (OP_MUNUS - 1)) | (1L << (OP_IN - 1)) | (1L << (OP_NOT_IN - 1)) | (1L << (OP_IS - 1)) | (1L << (OP_NOT_IS - 1)) | (1L << (OP_AS - 1)) | (1L << (OP_AS_SAFE - 1)) | (1L << (OP_PLUS_ASSIGN - 1)) | (1L << (OP_MINUS_ASSIGN - 1)) | (1L << (OP_MULT_ASSIGN - 1)) | (1L << (OP_DIV_ASSIGN - 1)) | (1L << (OP_MOD_ASSIGN - 1)) | (1L << (OP_DECREMENT - 1)) | (1L << (OP_INCREMENT - 1)) | (1L << (OP_NULL_ASSERT - 1)) | (1L << (OP_NOT - 1)) | (1L << (SQ_OPEN - 1)) | (1L << (SQ_CLOSE - 1)) | (1L << (KEYWORD_val - 1)) | (1L << (KEYWORD_var - 1)) | (1L << (KEYWORD_lateinit_var - 1)) | (1L << (KEYWORD_vararg - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (KEYWORD_by - 65)) | (1L << (KEYWORD_dynamic - 65)) | (1L << (KEYWORD_where - 65)) | (1L << (GET - 65)) | (1L << (SET - 65)) | (1L << (HierarchyModifier_abstract - 65)) | (1L << (HierarchyModifier_open - 65)) | (1L << (HierarchyModifier_final - 65)) | (1L << (HierarchyModifier_override - 65)) | (1L << (KeyWordModifier_operator - 65)) | (1L << (KeyWordModifier_infix - 65)) | (1L << (KeyWordModifier_inline - 65)) | (1L << (ClassModifier_enum - 65)) | (1L << (ClassModifier_annotation - 65)) | (1L << (ClassModifier_data - 65)) | (1L << (ClassModifier_sealed - 65)) | (1L << (AccessModifier_private - 65)) | (1L << (AccessModifier_protected - 65)) | (1L << (AccessModifier_public - 65)) | (1L << (AccessModifier_internal - 65)) | (1L << (Modifier_const - 65)) | (1L << (VarianceAnnotation_out - 65)) | (1L << (DOG - 65)) | (1L << (AnnotationUseSiteTarget_file - 65)) | (1L << (AnnotationUseSiteTarget_field - 65)) | (1L << (AnnotationUseSiteTarget_property - 65)) | (1L << (AnnotationUseSiteTarget_param - 65)) | (1L << (AnnotationUseSiteTarget_sparam - 65)) | (1L << (Jump_throw - 65)) | (1L << (Jump_continue - 65)) | (1L << (Jump_return - 65)) | (1L << (Jump_break - 65)) | (1L << (KEYWORD_constructor - 65)) | (1L << (ConstructorDelegationCall_this - 65)) | (1L << (ConstructorDelegationCall_super - 65)) | (1L << (Declaration_class - 65)) | (1L << (Declaration_interface - 65)) | (1L << (Declaration_object - 65)) | (1L << (Declaration_companion - 65)) | (1L << (Declaration_fun - 65)) | (1L << (Declaration_typealias - 65)) | (1L << (Declaration_init - 65)) | (1L << (CF_if - 65)) | (1L << (CF_else - 65)) | (1L << (CF_when - 65)) | (1L << (CF_while - 65)) | (1L << (CF_for - 65)) | (1L << (CF_do - 65)) | (1L << (CF_try - 65)) | (1L << (CF_catch - 65)) | (1L << (CF_FINALLY - 65)) | (1L << (BAX - 65)) | (1L << (SimpleName - 65)) | (1L << (SINLE_QUOTE_WHITESPACE - 65)) | (1L << (SINGLE_TEXT - 65)) | (1L << (SINLE_QUOTE_ESCAPED_CHAR - 65)) | (1L << (SINLE_QUOTE_EXPRESSION_START - 65)) | (1L << (SINGLE_QUOTE_REF - 65)) | (1L << (MULTILINE_QUOTE_TEXT - 65)) | (1L << (MULTILINE_QUOTE_CLOSE - 65)) | (1L << (MULTILINE_QUOTES - 65)) | (1L << (MULTILINE_QUOTE_EXPRESSION_START - 65)) | (1L << (MULTILINE_QUOTE_REF - 65)))) != 0)) {
					{
					setState(1092);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
					case 1:
						{
						setState(1085);
						match(SINLE_QUOTE_ESCAPED_CHAR);
						}
						break;
					case 2:
						{
						setState(1086);
						match(SINLE_QUOTE_EXPRESSION_START);
						setState(1087);
						expression();
						setState(1088);
						match(CLOSE_BLOCK);
						}
						break;
					case 3:
						{
						setState(1090);
						match(SINGLE_QUOTE_REF);
						}
						break;
					case 4:
						{
						setState(1091);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==SINLE_QUOTE_CLOSE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					}
					setState(1096);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1097);
				match(SINLE_QUOTE_CLOSE);
				}
				break;
			case TRIPLE_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1098);
				match(TRIPLE_QUOTE);
				setState(1107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (MULTILINE_COMMENT - 1)) | (1L << (SINGLELINE_COMMENT - 1)) | (1L << (WHITESPACE - 1)) | (1L << (IntegerLiteral - 1)) | (1L << (SEMI - 1)) | (1L << (OPEN_BLOCK - 1)) | (1L << (CLOSE_BLOCK - 1)) | (1L << (HexadecimalLiteral - 1)) | (1L << (CharacterLiteral - 1)) | (1L << (TRIPLE_QUOTE - 1)) | (1L << (SINGLE_QUOTE - 1)) | (1L << (PACKAGE - 1)) | (1L << (IMPORT - 1)) | (1L << (DOT - 1)) | (1L << (STAR - 1)) | (1L << (COMMA - 1)) | (1L << (LT - 1)) | (1L << (LTE - 1)) | (1L << (GT - 1)) | (1L << (GTE - 1)) | (1L << (EQ - 1)) | (1L << (EQ_EQ - 1)) | (1L << (EQ_EQ_EQ - 1)) | (1L << (NEQ - 1)) | (1L << (COLON - 1)) | (1L << (BRACE_OPEN - 1)) | (1L << (BRACE_CLOSE - 1)) | (1L << (Q - 1)) | (1L << (DA - 1)) | (1L << (DISJ - 1)) | (1L << (CONJ - 1)) | (1L << (ELVIS - 1)) | (1L << (LONG_RANGE - 1)) | (1L << (RANGE - 1)) | (1L << (REFERENCE - 1)) | (1L << (TRUE - 1)) | (1L << (FALSE - 1)) | (1L << (NULL - 1)) | (1L << (OP_ASTERISK - 1)) | (1L << (OP_DIV - 1)) | (1L << (OP_MOD - 1)) | (1L << (OP_PLUS - 1)) | (1L << (OP_MUNUS - 1)) | (1L << (OP_IN - 1)) | (1L << (OP_NOT_IN - 1)) | (1L << (OP_IS - 1)) | (1L << (OP_NOT_IS - 1)) | (1L << (OP_AS - 1)) | (1L << (OP_AS_SAFE - 1)) | (1L << (OP_PLUS_ASSIGN - 1)) | (1L << (OP_MINUS_ASSIGN - 1)) | (1L << (OP_MULT_ASSIGN - 1)) | (1L << (OP_DIV_ASSIGN - 1)) | (1L << (OP_MOD_ASSIGN - 1)) | (1L << (OP_DECREMENT - 1)) | (1L << (OP_INCREMENT - 1)) | (1L << (OP_NULL_ASSERT - 1)) | (1L << (OP_NOT - 1)) | (1L << (SQ_OPEN - 1)) | (1L << (SQ_CLOSE - 1)) | (1L << (KEYWORD_val - 1)) | (1L << (KEYWORD_var - 1)) | (1L << (KEYWORD_lateinit_var - 1)) | (1L << (KEYWORD_vararg - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (KEYWORD_by - 65)) | (1L << (KEYWORD_dynamic - 65)) | (1L << (KEYWORD_where - 65)) | (1L << (GET - 65)) | (1L << (SET - 65)) | (1L << (HierarchyModifier_abstract - 65)) | (1L << (HierarchyModifier_open - 65)) | (1L << (HierarchyModifier_final - 65)) | (1L << (HierarchyModifier_override - 65)) | (1L << (KeyWordModifier_operator - 65)) | (1L << (KeyWordModifier_infix - 65)) | (1L << (KeyWordModifier_inline - 65)) | (1L << (ClassModifier_enum - 65)) | (1L << (ClassModifier_annotation - 65)) | (1L << (ClassModifier_data - 65)) | (1L << (ClassModifier_sealed - 65)) | (1L << (AccessModifier_private - 65)) | (1L << (AccessModifier_protected - 65)) | (1L << (AccessModifier_public - 65)) | (1L << (AccessModifier_internal - 65)) | (1L << (Modifier_const - 65)) | (1L << (VarianceAnnotation_out - 65)) | (1L << (DOG - 65)) | (1L << (AnnotationUseSiteTarget_file - 65)) | (1L << (AnnotationUseSiteTarget_field - 65)) | (1L << (AnnotationUseSiteTarget_property - 65)) | (1L << (AnnotationUseSiteTarget_param - 65)) | (1L << (AnnotationUseSiteTarget_sparam - 65)) | (1L << (Jump_throw - 65)) | (1L << (Jump_continue - 65)) | (1L << (Jump_return - 65)) | (1L << (Jump_break - 65)) | (1L << (KEYWORD_constructor - 65)) | (1L << (ConstructorDelegationCall_this - 65)) | (1L << (ConstructorDelegationCall_super - 65)) | (1L << (Declaration_class - 65)) | (1L << (Declaration_interface - 65)) | (1L << (Declaration_object - 65)) | (1L << (Declaration_companion - 65)) | (1L << (Declaration_fun - 65)) | (1L << (Declaration_typealias - 65)) | (1L << (Declaration_init - 65)) | (1L << (CF_if - 65)) | (1L << (CF_else - 65)) | (1L << (CF_when - 65)) | (1L << (CF_while - 65)) | (1L << (CF_for - 65)) | (1L << (CF_do - 65)) | (1L << (CF_try - 65)) | (1L << (CF_catch - 65)) | (1L << (CF_FINALLY - 65)) | (1L << (BAX - 65)) | (1L << (SimpleName - 65)) | (1L << (SINLE_QUOTE_WHITESPACE - 65)) | (1L << (SINGLE_TEXT - 65)) | (1L << (SINLE_QUOTE_CLOSE - 65)) | (1L << (SINLE_QUOTE_ESCAPED_CHAR - 65)) | (1L << (SINLE_QUOTE_EXPRESSION_START - 65)) | (1L << (SINGLE_QUOTE_REF - 65)) | (1L << (MULTILINE_QUOTE_TEXT - 65)) | (1L << (MULTILINE_QUOTES - 65)) | (1L << (MULTILINE_QUOTE_EXPRESSION_START - 65)) | (1L << (MULTILINE_QUOTE_REF - 65)))) != 0)) {
					{
					setState(1105);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
					case 1:
						{
						setState(1099);
						match(MULTILINE_QUOTE_EXPRESSION_START);
						setState(1100);
						expression();
						setState(1101);
						match(CLOSE_BLOCK);
						}
						break;
					case 2:
						{
						setState(1103);
						match(MULTILINE_QUOTE_REF);
						}
						break;
					case 3:
						{
						setState(1104);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==MULTILINE_QUOTE_CLOSE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					}
					setState(1109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1110);
				match(MULTILINE_QUOTE_CLOSE);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralConstantContext literalConstant() {
			return getRuleContext(LiteralConstantContext.class,0);
		}
		public FunctionLiteralContext functionLiteral() {
			return getRuleContext(FunctionLiteralContext.class,0);
		}
		public LambdaFunctionContext lambdaFunction() {
			return getRuleContext(LambdaFunctionContext.class,0);
		}
		public LabelReferenceContext labelReference() {
			return getRuleContext(LabelReferenceContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public WhenContext when() {
			return getRuleContext(WhenContext.class,0);
		}
		public TryExpressionContext tryExpression() {
			return getRuleContext(TryExpressionContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public JumpContext jump() {
			return getRuleContext(JumpContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 170, RULE_atomicExpression);
		try {
			setState(1144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BRACE_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1113);
				match(BRACE_OPEN);
				setState(1114);
				expression();
				setState(1115);
				match(BRACE_CLOSE);
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
				setState(1117);
				literalConstant();
				}
				break;
			case OPEN_BLOCK:
				enterOuterAlt(_localctx, 3);
				{
				setState(1118);
				functionLiteral();
				}
				break;
			case Declaration_fun:
				enterOuterAlt(_localctx, 4);
				{
				setState(1119);
				lambdaFunction();
				}
				break;
			case ConstructorDelegationCall_this:
				enterOuterAlt(_localctx, 5);
				{
				setState(1120);
				match(ConstructorDelegationCall_this);
				setState(1122);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(1121);
					labelReference();
					}
					break;
				}
				}
				break;
			case ConstructorDelegationCall_super:
				enterOuterAlt(_localctx, 6);
				{
				setState(1124);
				match(ConstructorDelegationCall_super);
				setState(1129);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1125);
					match(LT);
					setState(1126);
					type();
					setState(1127);
					match(GT);
					}
					break;
				}
				setState(1132);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1131);
					labelReference();
					}
					break;
				}
				}
				break;
			case CF_if:
				enterOuterAlt(_localctx, 7);
				{
				setState(1134);
				ifExpression();
				}
				break;
			case CF_when:
				enterOuterAlt(_localctx, 8);
				{
				setState(1135);
				when();
				}
				break;
			case CF_try:
				enterOuterAlt(_localctx, 9);
				{
				setState(1136);
				tryExpression();
				}
				break;
			case Declaration_object:
				enterOuterAlt(_localctx, 10);
				{
				setState(1137);
				objectLiteral();
				}
				break;
			case Jump_throw:
			case Jump_continue:
			case Jump_return:
			case Jump_break:
				enterOuterAlt(_localctx, 11);
				{
				setState(1138);
				jump();
				}
				break;
			case CF_while:
			case CF_for:
			case CF_do:
				enterOuterAlt(_localctx, 12);
				{
				setState(1139);
				loop();
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
				setState(1140);
				identifier();
				}
				break;
			case BAX:
				enterOuterAlt(_localctx, 14);
				{
				setState(1141);
				match(BAX);
				setState(1142);
				identifier();
				}
				break;
			case PACKAGE:
				enterOuterAlt(_localctx, 15);
				{
				setState(1143);
				match(PACKAGE);
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
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode IntegerLiteral() { return getToken(KotlinParser.IntegerLiteral, 0); }
		public TerminalNode HexadecimalLiteral() { return getToken(KotlinParser.HexadecimalLiteral, 0); }
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
		enterRule(_localctx, 172, RULE_literalConstant);
		try {
			setState(1153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1146);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1147);
				match(FALSE);
				}
				break;
			case TRIPLE_QUOTE:
			case SINGLE_QUOTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1148);
				stringLiteral();
				}
				break;
			case IntegerLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(1149);
				match(IntegerLiteral);
				}
				break;
			case HexadecimalLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(1150);
				match(HexadecimalLiteral);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(1151);
				match(CharacterLiteral);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1152);
				match(NULL);
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
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
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
		enterRule(_localctx, 174, RULE_declaration);
		try {
			setState(1160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1155);
				functionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1156);
				propertyDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1157);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1158);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1159);
				objectDeclaration();
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
		enterRule(_localctx, 176, RULE_statement);
		try {
			setState(1164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1162);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1163);
				expression();
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
		enterRule(_localctx, 178, RULE_multiplicativeOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1166);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << OP_DIV) | (1L << OP_MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 180, RULE_additiveOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			_la = _input.LA(1);
			if ( !(_la==OP_PLUS || _la==OP_MUNUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 182, RULE_inOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
			_la = _input.LA(1);
			if ( !(_la==OP_IN || _la==OP_NOT_IN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 184, RULE_typeOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << OP_AS) | (1L << OP_AS_SAFE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 186, RULE_isOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			_la = _input.LA(1);
			if ( !(_la==OP_IS || _la==OP_NOT_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 188, RULE_comparisonOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LTE) | (1L << GT) | (1L << GTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 190, RULE_equalityOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1178);
			_la = _input.LA(1);
			if ( !(_la==EQ_EQ || _la==NEQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 192, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << OP_PLUS_ASSIGN) | (1L << OP_MINUS_ASSIGN) | (1L << OP_MULT_ASSIGN) | (1L << OP_DIV_ASSIGN) | (1L << OP_MOD_ASSIGN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PrefixUnaryOperationContext extends ParserRuleContext {
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public LabelDefinitionContext labelDefinition() {
			return getRuleContext(LabelDefinitionContext.class,0);
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
		enterRule(_localctx, 194, RULE_prefixUnaryOperation);
		try {
			setState(1189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_MUNUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1182);
				match(OP_MUNUS);
				}
				break;
			case OP_PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1183);
				match(OP_PLUS);
				}
				break;
			case OP_INCREMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1184);
				match(OP_INCREMENT);
				}
				break;
			case OP_DECREMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1185);
				match(OP_DECREMENT);
				}
				break;
			case OP_NOT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1186);
				match(OP_NOT);
				}
				break;
			case DOG:
				enterOuterAlt(_localctx, 6);
				{
				setState(1187);
				annotations();
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
				setState(1188);
				labelDefinition();
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
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public MemberAccessOperationContext memberAccessOperation() {
			return getRuleContext(MemberAccessOperationContext.class,0);
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
		enterRule(_localctx, 196, RULE_postfixUnaryOperation);
		try {
			setState(1199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1191);
				match(OP_INCREMENT);
				}
				break;
			case OP_DECREMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1192);
				match(OP_DECREMENT);
				}
				break;
			case OP_NULL_ASSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1193);
				match(OP_NULL_ASSERT);
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
				setState(1194);
				callSuffix();
				}
				break;
			case SQ_OPEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(1195);
				arrayAccess();
				}
				break;
			case DOT:
			case Q:
				enterOuterAlt(_localctx, 6);
				{
				setState(1196);
				memberAccessOperation();
				setState(1197);
				postfixUnaryExpression();
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
		public FunctionLiteralContext functionLiteral() {
			return getRuleContext(FunctionLiteralContext.class,0);
		}
		public List<UnescapedAnnotationContext> unescapedAnnotation() {
			return getRuleContexts(UnescapedAnnotationContext.class);
		}
		public UnescapedAnnotationContext unescapedAnnotation(int i) {
			return getRuleContext(UnescapedAnnotationContext.class,i);
		}
		public LabelDefinitionContext labelDefinition() {
			return getRuleContext(LabelDefinitionContext.class,0);
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
		enterRule(_localctx, 198, RULE_annotatedLambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOG) {
				{
				{
				setState(1201);
				match(DOG);
				setState(1202);
				unescapedAnnotation();
				}
				}
				setState(1207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORT || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (ClassModifier_enum - 77)) | (1L << (ClassModifier_data - 77)) | (1L << (AccessModifier_private - 77)) | (1L << (AccessModifier_protected - 77)) | (1L << (AccessModifier_public - 77)) | (1L << (AccessModifier_internal - 77)) | (1L << (Modifier_const - 77)) | (1L << (Declaration_companion - 77)) | (1L << (Declaration_init - 77)) | (1L << (SimpleName - 77)))) != 0)) {
				{
				setState(1208);
				labelDefinition();
				}
			}

			setState(1211);
			functionLiteral();
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
		enterRule(_localctx, 200, RULE_memberAccessOperation);
		int _la;
		try {
			setState(1218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1213);
				match(DOT);
				}
				break;
			case Q:
				enterOuterAlt(_localctx, 2);
				{
				setState(1214);
				match(Q);
				setState(1216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(1215);
					match(DOT);
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
		public List<FunctionLiteralparameterContext> functionLiteralparameter() {
			return getRuleContexts(FunctionLiteralparameterContext.class);
		}
		public FunctionLiteralparameterContext functionLiteralparameter(int i) {
			return getRuleContext(FunctionLiteralparameterContext.class,i);
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
		enterRule(_localctx, 202, RULE_functionLiteral);
		int _la;
		try {
			setState(1239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1220);
				match(OPEN_BLOCK);
				setState(1221);
				statements();
				setState(1222);
				match(CLOSE_BLOCK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1224);
				match(OPEN_BLOCK);
				setState(1233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SimpleName) {
					{
					{
					setState(1225);
					functionLiteralparameter();
					}
					setState(1230);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1226);
						match(COMMA);
						setState(1227);
						functionLiteralparameter();
						}
						}
						setState(1232);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1235);
				match(OP_ASTERISK);
				setState(1236);
				statements();
				setState(1237);
				match(CLOSE_BLOCK);
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
		enterRule(_localctx, 204, RULE_functionLiteralparameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			match(SimpleName);
			setState(1244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1242);
				match(COLON);
				setState(1243);
				type();
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 206, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1246);
			match(SQ_OPEN);
			setState(1255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << OPEN_BLOCK) | (1L << HexadecimalLiteral) | (1L << CharacterLiteral) | (1L << TRIPLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << PACKAGE) | (1L << IMPORT) | (1L << BRACE_OPEN) | (1L << REFERENCE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << OP_PLUS) | (1L << OP_MUNUS) | (1L << OP_DECREMENT) | (1L << OP_INCREMENT) | (1L << OP_NOT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (ClassModifier_enum - 77)) | (1L << (ClassModifier_data - 77)) | (1L << (AccessModifier_private - 77)) | (1L << (AccessModifier_protected - 77)) | (1L << (AccessModifier_public - 77)) | (1L << (AccessModifier_internal - 77)) | (1L << (Modifier_const - 77)) | (1L << (DOG - 77)) | (1L << (Jump_throw - 77)) | (1L << (Jump_continue - 77)) | (1L << (Jump_return - 77)) | (1L << (Jump_break - 77)) | (1L << (ConstructorDelegationCall_this - 77)) | (1L << (ConstructorDelegationCall_super - 77)) | (1L << (Declaration_object - 77)) | (1L << (Declaration_companion - 77)) | (1L << (Declaration_fun - 77)) | (1L << (Declaration_init - 77)) | (1L << (CF_if - 77)) | (1L << (CF_when - 77)) | (1L << (CF_while - 77)) | (1L << (CF_for - 77)) | (1L << (CF_do - 77)) | (1L << (CF_try - 77)) | (1L << (BAX - 77)) | (1L << (SimpleName - 77)))) != 0)) {
				{
				setState(1247);
				expression();
				setState(1252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1248);
					match(COMMA);
					setState(1249);
					expression();
					}
					}
					setState(1254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1257);
			match(SQ_CLOSE);
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
		enterRule(_localctx, 208, RULE_objectLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			match(Declaration_object);
			setState(1269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1260);
				match(COLON);
				setState(1261);
				delegationSpecifier();
				setState(1266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1262);
						match(COMMA);
						setState(1263);
						delegationSpecifier();
						}
						} 
					}
					setState(1268);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
				}
				}
				break;
			}
			setState(1271);
			classBody();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<WhenEntryContext> whenEntry() {
			return getRuleContexts(WhenEntryContext.class);
		}
		public WhenEntryContext whenEntry(int i) {
			return getRuleContext(WhenEntryContext.class,i);
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
		enterRule(_localctx, 210, RULE_when);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
			match(CF_when);
			setState(1278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_OPEN) {
				{
				setState(1274);
				match(BRACE_OPEN);
				setState(1275);
				expression();
				setState(1276);
				match(BRACE_CLOSE);
				}
			}

			setState(1280);
			match(OPEN_BLOCK);
			setState(1284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << OPEN_BLOCK) | (1L << HexadecimalLiteral) | (1L << CharacterLiteral) | (1L << TRIPLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << PACKAGE) | (1L << IMPORT) | (1L << BRACE_OPEN) | (1L << REFERENCE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << OP_PLUS) | (1L << OP_MUNUS) | (1L << OP_IN) | (1L << OP_NOT_IN) | (1L << OP_IS) | (1L << OP_NOT_IS) | (1L << OP_DECREMENT) | (1L << OP_INCREMENT) | (1L << OP_NOT))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (ClassModifier_enum - 77)) | (1L << (ClassModifier_data - 77)) | (1L << (AccessModifier_private - 77)) | (1L << (AccessModifier_protected - 77)) | (1L << (AccessModifier_public - 77)) | (1L << (AccessModifier_internal - 77)) | (1L << (Modifier_const - 77)) | (1L << (DOG - 77)) | (1L << (Jump_throw - 77)) | (1L << (Jump_continue - 77)) | (1L << (Jump_return - 77)) | (1L << (Jump_break - 77)) | (1L << (ConstructorDelegationCall_this - 77)) | (1L << (ConstructorDelegationCall_super - 77)) | (1L << (Declaration_object - 77)) | (1L << (Declaration_companion - 77)) | (1L << (Declaration_fun - 77)) | (1L << (Declaration_init - 77)) | (1L << (CF_if - 77)) | (1L << (CF_else - 77)) | (1L << (CF_when - 77)) | (1L << (CF_while - 77)) | (1L << (CF_for - 77)) | (1L << (CF_do - 77)) | (1L << (CF_try - 77)) | (1L << (BAX - 77)) | (1L << (SimpleName - 77)))) != 0)) {
				{
				{
				setState(1281);
				whenEntry();
				}
				}
				setState(1286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1287);
			match(CLOSE_BLOCK);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
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
		enterRule(_localctx, 212, RULE_whenEntry);
		int _la;
		try {
			setState(1314);
			_errHandler.sync(this);
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
				setState(1289);
				whenCondition();
				setState(1294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1290);
					match(COMMA);
					setState(1291);
					whenCondition();
					}
					}
					setState(1296);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1297);
				match(OP_ASTERISK);
				setState(1298);
				expression();
				setState(1302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(1299);
					match(SEMI);
					}
					}
					setState(1304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CF_else:
				enterOuterAlt(_localctx, 2);
				{
				setState(1305);
				match(CF_else);
				setState(1306);
				match(OP_ASTERISK);
				setState(1307);
				expression();
				setState(1311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(1308);
					match(SEMI);
					}
					}
					setState(1313);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 214, RULE_whenCondition);
		int _la;
		try {
			setState(1321);
			_errHandler.sync(this);
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
				setState(1316);
				expression();
				}
				break;
			case OP_IN:
			case OP_NOT_IN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1317);
				_la = _input.LA(1);
				if ( !(_la==OP_IN || _la==OP_NOT_IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1318);
				expression();
				}
				break;
			case OP_IS:
			case OP_NOT_IS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1319);
				_la = _input.LA(1);
				if ( !(_la==OP_IS || _la==OP_NOT_IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1320);
				type();
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
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public List<VariableDeclarationEntryContext> variableDeclarationEntry() {
			return getRuleContexts(VariableDeclarationEntryContext.class);
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
		enterRule(_localctx, 216, RULE_lastArgLambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1323);
			match(OPEN_BLOCK);
			setState(1325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_OPEN) {
				{
				setState(1324);
				match(BRACE_OPEN);
				}
			}

			setState(1335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SimpleName) {
				{
				setState(1327);
				variableDeclarationEntry();
				setState(1332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1328);
					match(COMMA);
					setState(1329);
					variableDeclarationEntry();
					}
					}
					setState(1334);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_CLOSE) {
				{
				setState(1337);
				match(BRACE_CLOSE);
				}
			}

			setState(1340);
			match(OP_ASTERISK);
			setState(1341);
			statements();
			setState(1342);
			match(CLOSE_BLOCK);
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
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode SimpleName() { return getToken(KotlinParser.SimpleName, 0); }
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumClassBodyContext enumClassBody() {
			return getRuleContext(EnumClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public PrimaryConstructorContext primaryConstructor() {
			return getRuleContext(PrimaryConstructorContext.class,0);
		}
		public List<DelegationSpecifierContext> delegationSpecifier() {
			return getRuleContexts(DelegationSpecifierContext.class);
		}
		public DelegationSpecifierContext delegationSpecifier(int i) {
			return getRuleContext(DelegationSpecifierContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
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
		enterRule(_localctx, 218, RULE_classDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1344);
			modifiers();
			setState(1345);
			match(Declaration_class);
			setState(1346);
			match(SimpleName);
			setState(1348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1347);
				typeParameters();
				}
			}

			setState(1351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1350);
				primaryConstructor();
				}
				break;
			}
			setState(1365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1353);
				match(COLON);
				setState(1355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOG) {
					{
					setState(1354);
					annotations();
					}
				}

				setState(1357);
				delegationSpecifier();
				setState(1362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1358);
					match(COMMA);
					setState(1359);
					delegationSpecifier();
					}
					}
					setState(1364);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1367);
			typeConstraints();
			setState(1370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1368);
				classBody();
				}
				break;
			case 2:
				{
				setState(1369);
				enumClassBody();
				}
				break;
			}
			setState(1375);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1372);
					match(SEMI);
					}
					} 
				}
				setState(1377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
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
		public TerminalNode SimpleName() { return getToken(KotlinParser.SimpleName, 0); }
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ObjectModifierContext objectModifier() {
			return getRuleContext(ObjectModifierContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<SimpleUserTypeContext> simpleUserType() {
			return getRuleContexts(SimpleUserTypeContext.class);
		}
		public SimpleUserTypeContext simpleUserType(int i) {
			return getRuleContext(SimpleUserTypeContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
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
		enterRule(_localctx, 220, RULE_interfaceDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (AccessModifier_private - 81)) | (1L << (AccessModifier_public - 81)) | (1L << (AccessModifier_internal - 81)))) != 0)) {
				{
				setState(1378);
				objectModifier();
				}
			}

			setState(1381);
			match(Declaration_interface);
			setState(1382);
			match(SimpleName);
			setState(1384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1383);
				typeParameters();
				}
			}

			setState(1398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1386);
				match(COLON);
				setState(1388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOG) {
					{
					setState(1387);
					annotations();
					}
				}

				setState(1390);
				simpleUserType();
				setState(1395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1391);
					match(COMMA);
					setState(1392);
					simpleUserType();
					}
					}
					setState(1397);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1400);
			typeConstraints();
			setState(1401);
			classBody();
			setState(1405);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1402);
					match(SEMI);
					}
					} 
				}
				setState(1407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
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
		public TerminalNode SimpleName() { return getToken(KotlinParser.SimpleName, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ObjectModifierContext objectModifier() {
			return getRuleContext(ObjectModifierContext.class,0);
		}
		public SupertypesSpecifiersContext supertypesSpecifiers() {
			return getRuleContext(SupertypesSpecifiersContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
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
		enterRule(_localctx, 222, RULE_objectDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (AccessModifier_private - 81)) | (1L << (AccessModifier_public - 81)) | (1L << (AccessModifier_internal - 81)))) != 0)) {
				{
				setState(1408);
				objectModifier();
				}
			}

			setState(1411);
			match(Declaration_object);
			setState(1412);
			match(SimpleName);
			setState(1414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1413);
				supertypesSpecifiers();
				}
			}

			setState(1416);
			classBody();
			setState(1420);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1417);
					match(SEMI);
					}
					} 
				}
				setState(1422);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public ExtensionFunctionDeclarationContext extensionFunctionDeclaration() {
			return getRuleContext(ExtensionFunctionDeclarationContext.class,0);
		}
		public ClassicFunctionDeclarationContext classicFunctionDeclaration() {
			return getRuleContext(ClassicFunctionDeclarationContext.class,0);
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
		enterRule(_localctx, 224, RULE_functionDeclaration);
		try {
			setState(1425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1423);
				extensionFunctionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1424);
				classicFunctionDeclaration();
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

	public static class ExtensionFunctionDeclarationContext extends ParserRuleContext {
		public ModifierAnnotationContext modifierAnnotation() {
			return getRuleContext(ModifierAnnotationContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public ExtensionFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterExtensionFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitExtensionFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitExtensionFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtensionFunctionDeclarationContext extensionFunctionDeclaration() throws RecognitionException {
		ExtensionFunctionDeclarationContext _localctx = new ExtensionFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_extensionFunctionDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1427);
			modifierAnnotation();
			setState(1428);
			match(Declaration_fun);
			setState(1430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1429);
				typeParameters();
				}
			}

			setState(1432);
			type();
			setState(1433);
			match(DOT);
			setState(1434);
			functionName();
			setState(1435);
			functionParameters();
			setState(1437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1436);
				returnType();
				}
			}

			setState(1439);
			typeConstraints();
			setState(1441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1440);
				functionBody();
				}
				break;
			}
			setState(1446);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1443);
					match(SEMI);
					}
					} 
				}
				setState(1448);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
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

	public static class ClassicFunctionDeclarationContext extends ParserRuleContext {
		public ModifierAnnotationContext modifierAnnotation() {
			return getRuleContext(ModifierAnnotationContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public ClassicFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classicFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterClassicFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitClassicFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitClassicFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassicFunctionDeclarationContext classicFunctionDeclaration() throws RecognitionException {
		ClassicFunctionDeclarationContext _localctx = new ClassicFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_classicFunctionDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1449);
			modifierAnnotation();
			setState(1450);
			match(Declaration_fun);
			setState(1452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1451);
				typeParameters();
				}
			}

			setState(1454);
			functionName();
			setState(1455);
			functionParameters();
			setState(1457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1456);
				returnType();
				}
			}

			setState(1459);
			typeConstraints();
			setState(1461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1460);
				functionBody();
				}
				break;
			}
			setState(1466);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1463);
					match(SEMI);
					}
					} 
				}
				setState(1468);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
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
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
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
		enterRule(_localctx, 230, RULE_lambdaFunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1469);
			match(Declaration_fun);
			setState(1471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1470);
				typeParameters();
				}
			}

			setState(1473);
			functionParameters();
			setState(1475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1474);
				returnType();
				}
				break;
			}
			setState(1477);
			typeConstraints();
			setState(1479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1478);
				functionBody();
				}
				break;
			}
			setState(1484);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1481);
					match(SEMI);
					}
					} 
				}
				setState(1486);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
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

	public static class FunctionParametersContext extends ParserRuleContext {
		public List<FunctionParameterContext> functionParameter() {
			return getRuleContexts(FunctionParameterContext.class);
		}
		public FunctionParameterContext functionParameter(int i) {
			return getRuleContext(FunctionParameterContext.class,i);
		}
		public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_functionParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1487);
			match(BRACE_OPEN);
			setState(1496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_IN || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KEYWORD_vararg - 64)) | (1L << (HierarchyModifier_abstract - 64)) | (1L << (HierarchyModifier_open - 64)) | (1L << (HierarchyModifier_final - 64)) | (1L << (HierarchyModifier_override - 64)) | (1L << (KeyWordModifier_operator - 64)) | (1L << (KeyWordModifier_infix - 64)) | (1L << (KeyWordModifier_inline - 64)) | (1L << (ClassModifier_enum - 64)) | (1L << (ClassModifier_annotation - 64)) | (1L << (ClassModifier_data - 64)) | (1L << (ClassModifier_sealed - 64)) | (1L << (AccessModifier_private - 64)) | (1L << (AccessModifier_protected - 64)) | (1L << (AccessModifier_public - 64)) | (1L << (AccessModifier_internal - 64)) | (1L << (Modifier_const - 64)) | (1L << (VarianceAnnotation_out - 64)) | (1L << (DOG - 64)) | (1L << (SimpleName - 64)))) != 0)) {
				{
				setState(1488);
				functionParameter();
				setState(1493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1489);
					match(COMMA);
					setState(1490);
					functionParameter();
					}
					}
					setState(1495);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1498);
			match(BRACE_CLOSE);
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

	public static class ModifierAnnotationContext extends ParserRuleContext {
		public FunctionModifierContext functionModifier() {
			return getRuleContext(FunctionModifierContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public ModifierAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterModifierAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitModifierAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitModifierAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierAnnotationContext modifierAnnotation() throws RecognitionException {
		ModifierAnnotationContext _localctx = new ModifierAnnotationContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_modifierAnnotation);
		int _la;
		try {
			setState(1512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (AccessModifier_private - 81)) | (1L << (AccessModifier_protected - 81)) | (1L << (AccessModifier_public - 81)) | (1L << (AccessModifier_internal - 81)))) != 0)) {
					{
					setState(1500);
					functionModifier();
					}
				}

				setState(1504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOG) {
					{
					setState(1503);
					annotations();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOG) {
					{
					setState(1506);
					annotations();
					}
				}

				setState(1510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (AccessModifier_private - 81)) | (1L << (AccessModifier_protected - 81)) | (1L << (AccessModifier_public - 81)) | (1L << (AccessModifier_internal - 81)))) != 0)) {
					{
					setState(1509);
					functionModifier();
					}
				}

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

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode SimpleName() { return getToken(KotlinParser.SimpleName, 0); }
		public FunctionModifierContext functionModifier() {
			return getRuleContext(FunctionModifierContext.class,0);
		}
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_functionName);
		try {
			setState(1518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SimpleName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1514);
				match(SimpleName);
				}
				break;
			case AccessModifier_private:
			case AccessModifier_protected:
			case AccessModifier_public:
			case AccessModifier_internal:
				enterOuterAlt(_localctx, 2);
				{
				setState(1515);
				functionModifier();
				}
				break;
			case Declaration_init:
				enterOuterAlt(_localctx, 3);
				{
				setState(1516);
				match(Declaration_init);
				}
				break;
			case ClassModifier_data:
				enterOuterAlt(_localctx, 4);
				{
				setState(1517);
				match(ClassModifier_data);
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

	public static class ReturnTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_returnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1520);
			match(COLON);
			setState(1521);
			type();
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
		public ReadonlyPropertyDeclarationContext readonlyPropertyDeclaration() {
			return getRuleContext(ReadonlyPropertyDeclarationContext.class,0);
		}
		public MutablePropertyDeclarationContext mutablePropertyDeclaration() {
			return getRuleContext(MutablePropertyDeclarationContext.class,0);
		}
		public LateinitVarPropertyDeclarationContext lateinitVarPropertyDeclaration() {
			return getRuleContext(LateinitVarPropertyDeclarationContext.class,0);
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
		enterRule(_localctx, 240, RULE_propertyDeclaration);
		try {
			setState(1526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1523);
				readonlyPropertyDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1524);
				mutablePropertyDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1525);
				lateinitVarPropertyDeclaration();
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
		public PropertyDelegateDeclarationContext propertyDelegateDeclaration() {
			return getRuleContext(PropertyDelegateDeclarationContext.class,0);
		}
		public ReadonlyPropertyNoDelegateDeclarationContext readonlyPropertyNoDelegateDeclaration() {
			return getRuleContext(ReadonlyPropertyNoDelegateDeclarationContext.class,0);
		}
		public PropertyModifierContext propertyModifier() {
			return getRuleContext(PropertyModifierContext.class,0);
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
		enterRule(_localctx, 242, RULE_readonlyPropertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (AccessModifier_private - 81)) | (1L << (AccessModifier_protected - 81)) | (1L << (AccessModifier_public - 81)) | (1L << (AccessModifier_internal - 81)))) != 0)) {
				{
				setState(1528);
				propertyModifier();
				}
			}

			setState(1531);
			match(KEYWORD_val);
			setState(1536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1532);
				extensionPropertyDelegateDeclaration();
				}
				break;
			case 2:
				{
				setState(1533);
				readonlyExtensionPropertyNoDelegateDeclaration();
				}
				break;
			case 3:
				{
				setState(1534);
				propertyDelegateDeclaration();
				}
				break;
			case 4:
				{
				setState(1535);
				readonlyPropertyNoDelegateDeclaration();
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
		public FunctionModifierContext functionModifier() {
			return getRuleContext(FunctionModifierContext.class,0);
		}
		public ExtensionPropertyDelegateDeclarationContext extensionPropertyDelegateDeclaration() {
			return getRuleContext(ExtensionPropertyDelegateDeclarationContext.class,0);
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
		enterRule(_localctx, 244, RULE_mutablePropertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1538);
			functionModifier();
			setState(1539);
			match(KEYWORD_var);
			setState(1544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1540);
				extensionPropertyDelegateDeclaration();
				}
				break;
			case 2:
				{
				setState(1541);
				mutableExtensionPropertyNoDelegateDeclaration();
				}
				break;
			case 3:
				{
				setState(1542);
				propertyDelegateDeclaration();
				}
				break;
			case 4:
				{
				setState(1543);
				mutablePropertyNoDelegateDeclaration();
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

	public static class LateinitVarPropertyDeclarationContext extends ParserRuleContext {
		public VariableDeclarationEntryContext variableDeclarationEntry() {
			return getRuleContext(VariableDeclarationEntryContext.class,0);
		}
		public FunctionModifierContext functionModifier() {
			return getRuleContext(FunctionModifierContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public LateinitVarPropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateinitVarPropertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterLateinitVarPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitLateinitVarPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitLateinitVarPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LateinitVarPropertyDeclarationContext lateinitVarPropertyDeclaration() throws RecognitionException {
		LateinitVarPropertyDeclarationContext _localctx = new LateinitVarPropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_lateinitVarPropertyDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (AccessModifier_private - 81)) | (1L << (AccessModifier_protected - 81)) | (1L << (AccessModifier_public - 81)) | (1L << (AccessModifier_internal - 81)))) != 0)) {
				{
				setState(1546);
				functionModifier();
				}
			}

			setState(1549);
			match(KEYWORD_lateinit_var);
			setState(1550);
			variableDeclarationEntry();
			setState(1554);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1551);
					match(SEMI);
					}
					} 
				}
				setState(1556);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PropertyDelegateDeclarationContext propertyDelegateDeclaration() {
			return getRuleContext(PropertyDelegateDeclarationContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
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
		enterRule(_localctx, 248, RULE_extensionPropertyDelegateDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1557);
				typeParameters();
				}
			}

			setState(1560);
			type();
			setState(1561);
			match(DOT);
			setState(1562);
			propertyDelegateDeclaration();
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterTypeContext parameterType() {
			return getRuleContext(ParameterTypeContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
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
		enterRule(_localctx, 250, RULE_readonlyExtensionPropertyNoDelegateDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1564);
				typeParameters();
				}
			}

			setState(1567);
			type();
			setState(1568);
			match(DOT);
			setState(1569);
			parameterType();
			setState(1571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1570);
				getter();
				}
				break;
			}
			setState(1576);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1573);
					match(SEMI);
					}
					} 
				}
				setState(1578);
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
		enterRule(_localctx, 252, RULE_parameterType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1579);
				match(COLON);
				setState(1580);
				type();
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclarationEntryContext variableDeclarationEntry() {
			return getRuleContext(VariableDeclarationEntryContext.class,0);
		}
		public ParameterTypeContext parameterType() {
			return getRuleContext(ParameterTypeContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
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
		enterRule(_localctx, 254, RULE_mutableExtensionPropertyNoDelegateDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1583);
				typeParameters();
				}
			}

			setState(1586);
			type();
			setState(1587);
			match(DOT);
			setState(1588);
			variableDeclarationEntry();
			setState(1589);
			parameterType();
			setState(1593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(1590);
				match(SEMI);
				}
				}
				setState(1595);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				{
				setState(1596);
				getter();
				setState(1597);
				setter();
				}
				}
				break;
			case 2:
				{
				{
				setState(1599);
				setter();
				setState(1600);
				getter();
				}
				}
				break;
			}
			setState(1607);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1604);
					match(SEMI);
					}
					} 
				}
				setState(1609);
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

	public static class ReadonlyPropertyNoDelegateDeclarationContext extends ParserRuleContext {
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
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
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
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
		enterRule(_localctx, 256, RULE_readonlyPropertyNoDelegateDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1612);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BRACE_OPEN:
				{
				setState(1610);
				multipleVariableDeclarations();
				}
				break;
			case SimpleName:
				{
				setState(1611);
				variableDeclarationEntry();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1614);
			typeConstraints();
			setState(1615);
			assignExpression();
			setState(1617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1616);
				getter();
				}
				break;
			}
			setState(1622);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1619);
					match(SEMI);
					}
					} 
				}
				setState(1624);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
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
		enterRule(_localctx, 258, RULE_propertyDelegateDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1625);
			variableDeclarationEntry();
			setState(1626);
			typeConstraints();
			setState(1627);
			delegateExpression();
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
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
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
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
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
		enterRule(_localctx, 260, RULE_mutablePropertyNoDelegateDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BRACE_OPEN:
				{
				setState(1629);
				multipleVariableDeclarations();
				}
				break;
			case SimpleName:
				{
				setState(1630);
				variableDeclarationEntry();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1633);
			typeConstraints();
			setState(1634);
			assignExpression();
			setState(1638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(1635);
				match(SEMI);
				}
				}
				setState(1640);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				{
				setState(1641);
				getter();
				setState(1642);
				setter();
				}
				}
				break;
			case 2:
				{
				{
				setState(1644);
				setter();
				setState(1645);
				getter();
				}
				}
				break;
			}
			setState(1652);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1649);
					match(SEMI);
					}
					} 
				}
				setState(1654);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
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
		enterRule(_localctx, 262, RULE_delegateExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			match(KEYWORD_by);
			setState(1656);
			expression();
			setState(1660);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1657);
					match(SEMI);
					}
					} 
				}
				setState(1662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
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
		enterRule(_localctx, 264, RULE_assignExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1663);
			match(EQ);
			setState(1664);
			expression();
			setState(1668);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1665);
					match(SEMI);
					}
					} 
				}
				setState(1670);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
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
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
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
		enterRule(_localctx, 266, RULE_getterSetterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				{
				setState(1672);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1671);
					getter();
					}
					break;
				}
				setState(1675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (OP_IN - 44)) | (1L << (KEYWORD_vararg - 44)) | (1L << (SET - 44)) | (1L << (HierarchyModifier_abstract - 44)) | (1L << (HierarchyModifier_open - 44)) | (1L << (HierarchyModifier_final - 44)) | (1L << (HierarchyModifier_override - 44)) | (1L << (KeyWordModifier_operator - 44)) | (1L << (KeyWordModifier_infix - 44)) | (1L << (KeyWordModifier_inline - 44)) | (1L << (ClassModifier_enum - 44)) | (1L << (ClassModifier_annotation - 44)) | (1L << (ClassModifier_data - 44)) | (1L << (ClassModifier_sealed - 44)) | (1L << (AccessModifier_private - 44)) | (1L << (AccessModifier_protected - 44)) | (1L << (AccessModifier_public - 44)) | (1L << (AccessModifier_internal - 44)) | (1L << (Modifier_const - 44)) | (1L << (VarianceAnnotation_out - 44)) | (1L << (DOG - 44)))) != 0)) {
					{
					setState(1674);
					setter();
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(1678);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1677);
					setter();
					}
					break;
				}
				setState(1681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (OP_IN - 44)) | (1L << (KEYWORD_vararg - 44)) | (1L << (GET - 44)) | (1L << (HierarchyModifier_abstract - 44)) | (1L << (HierarchyModifier_open - 44)) | (1L << (HierarchyModifier_final - 44)) | (1L << (HierarchyModifier_override - 44)) | (1L << (KeyWordModifier_operator - 44)) | (1L << (KeyWordModifier_infix - 44)) | (1L << (KeyWordModifier_inline - 44)) | (1L << (ClassModifier_enum - 44)) | (1L << (ClassModifier_annotation - 44)) | (1L << (ClassModifier_data - 44)) | (1L << (ClassModifier_sealed - 44)) | (1L << (AccessModifier_private - 44)) | (1L << (AccessModifier_protected - 44)) | (1L << (AccessModifier_public - 44)) | (1L << (AccessModifier_internal - 44)) | (1L << (Modifier_const - 44)) | (1L << (VarianceAnnotation_out - 44)) | (1L << (DOG - 44)))) != 0)) {
					{
					setState(1680);
					getter();
					}
				}

				}
				}
				break;
			}
			setState(1688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(1685);
				match(SEMI);
				}
				}
				setState(1690);
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
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 268, RULE_getter);
		int _la;
		try {
			setState(1704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1691);
				modifiers();
				setState(1692);
				match(GET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1694);
				modifiers();
				setState(1695);
				match(GET);
				setState(1696);
				match(BRACE_OPEN);
				setState(1697);
				match(BRACE_CLOSE);
				setState(1700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1698);
					match(COLON);
					setState(1699);
					type();
					}
				}

				setState(1702);
				functionBody();
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
		public List<ModifiersContext> modifiers() {
			return getRuleContexts(ModifiersContext.class);
		}
		public ModifiersContext modifiers(int i) {
			return getRuleContext(ModifiersContext.class,i);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode SimpleName() { return getToken(KotlinParser.SimpleName, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
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
		enterRule(_localctx, 270, RULE_setter);
		try {
			setState(1720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1706);
				modifiers();
				setState(1707);
				match(SET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1709);
				modifiers();
				setState(1710);
				match(SET);
				setState(1711);
				match(BRACE_OPEN);
				setState(1712);
				modifiers();
				setState(1715);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(1713);
					match(SimpleName);
					}
					break;
				case 2:
					{
					setState(1714);
					parameter();
					}
					break;
				}
				setState(1717);
				match(BRACE_CLOSE);
				setState(1718);
				functionBody();
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
		enterRule(_localctx, 272, RULE_functionModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1722);
			_la = _input.LA(1);
			if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (AccessModifier_private - 81)) | (1L << (AccessModifier_protected - 81)) | (1L << (AccessModifier_public - 81)) | (1L << (AccessModifier_internal - 81)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 274, RULE_propertyModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1724);
			_la = _input.LA(1);
			if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (AccessModifier_private - 81)) | (1L << (AccessModifier_protected - 81)) | (1L << (AccessModifier_public - 81)) | (1L << (AccessModifier_internal - 81)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 276, RULE_hierarchyModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1726);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (HierarchyModifier_abstract - 70)) | (1L << (HierarchyModifier_open - 70)) | (1L << (HierarchyModifier_final - 70)) | (1L << (HierarchyModifier_override - 70)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 278, RULE_classModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1728);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (ClassModifier_enum - 77)) | (1L << (ClassModifier_annotation - 77)) | (1L << (ClassModifier_data - 77)) | (1L << (ClassModifier_sealed - 77)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 280, RULE_keyWordModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1730);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (KeyWordModifier_operator - 74)) | (1L << (KeyWordModifier_infix - 74)) | (1L << (KeyWordModifier_inline - 74)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 282, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1732);
			_la = _input.LA(1);
			if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (AccessModifier_private - 81)) | (1L << (AccessModifier_protected - 81)) | (1L << (AccessModifier_public - 81)) | (1L << (AccessModifier_internal - 81)) | (1L << (Modifier_const - 81)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ObjectModifierContext extends ParserRuleContext {
		public ObjectModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).enterObjectModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KotlinParserListener ) ((KotlinParserListener)listener).exitObjectModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KotlinParserVisitor ) return ((KotlinParserVisitor<? extends T>)visitor).visitObjectModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectModifierContext objectModifier() throws RecognitionException {
		ObjectModifierContext _localctx = new ObjectModifierContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_objectModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1734);
			_la = _input.LA(1);
			if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (AccessModifier_private - 81)) | (1L << (AccessModifier_public - 81)) | (1L << (AccessModifier_internal - 81)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 286, RULE_varianceAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1736);
			_la = _input.LA(1);
			if ( !(_la==OP_IN || _la==VarianceAnnotation_out) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0082\u06cd\4\2\t"+
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
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\3\2\3\2\7\2\u0125"+
		"\n\2\f\2\16\2\u0128\13\2\3\3\5\3\u012b\n\3\3\3\7\3\u012e\n\3\f\3\16\3"+
		"\u0131\13\3\3\4\3\4\3\4\3\4\7\4\u0137\n\4\f\4\16\4\u013a\13\4\3\4\7\4"+
		"\u013d\n\4\f\4\16\4\u0140\13\4\3\5\3\5\3\5\3\5\7\5\u0146\n\5\f\5\16\5"+
		"\u0149\13\5\3\5\3\5\3\5\3\5\5\5\u014f\n\5\3\5\7\5\u0152\n\5\f\5\16\5\u0155"+
		"\13\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u015d\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7\u0167\n\7\3\b\5\b\u016a\n\b\3\t\3\t\3\t\3\t\7\t\u0170\n\t\f"+
		"\t\16\t\u0173\13\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u017b\n\n\3\13\3\13\5\13"+
		"\u017f\n\13\3\13\3\13\7\13\u0183\n\13\f\13\16\13\u0186\13\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\7\f\u018e\n\f\f\f\16\f\u0191\13\f\5\f\u0193\n\f\3\r\5"+
		"\r\u0196\n\r\3\r\3\r\3\r\3\r\3\16\5\16\u019d\n\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\5\17\u01a5\n\17\3\17\5\17\u01a8\n\17\3\17\3\17\5\17\u01ac\n"+
		"\17\3\17\3\17\5\17\u01b0\n\17\3\17\5\17\u01b3\n\17\3\17\3\17\5\17\u01b7"+
		"\n\17\3\17\5\17\u01ba\n\17\5\17\u01bc\n\17\3\20\3\20\5\20\u01c0\n\20\3"+
		"\20\3\20\3\20\7\20\u01c5\n\20\f\20\16\20\u01c8\13\20\3\21\3\21\3\21\3"+
		"\21\5\21\u01ce\n\21\3\22\3\22\3\22\3\22\3\22\7\22\u01d5\n\22\f\22\16\22"+
		"\u01d8\13\22\3\22\3\22\5\22\u01dc\n\22\3\23\3\23\3\23\5\23\u01e1\n\23"+
		"\3\24\3\24\3\24\3\24\5\24\u01e7\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\7\26\u01f0\n\26\f\26\16\26\u01f3\13\26\5\26\u01f5\n\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\7\27\u01ff\n\27\f\27\16\27\u0202\13\27\3\27"+
		"\3\27\3\30\7\30\u0207\n\30\f\30\16\30\u020a\13\30\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u0215\n\32\3\33\6\33\u0218\n\33\r\33\16"+
		"\33\u0219\3\34\3\34\3\34\3\34\5\34\u0220\n\34\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\36\5\36\u0229\n\36\3\36\5\36\u022c\n\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\7\37\u0234\n\37\f\37\16\37\u0237\13\37\5\37\u0239\n\37\3\37\3"+
		"\37\3 \3 \3 \7 \u0240\n \f \16 \u0243\13 \3 \5 \u0246\n \3 \5 \u0249\n"+
		" \3!\3!\3!\3!\5!\u024f\n!\3!\5!\u0252\n!\3!\3!\5!\u0256\n!\3!\3!\5!\u025a"+
		"\n!\5!\u025c\n!\3\"\3\"\3\"\3\"\3\"\5\"\u0263\n\"\3#\3#\3#\3$\3$\3$\3"+
		"$\3%\3%\5%\u026e\n%\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\5(\u0279\n(\3)\3)\5"+
		")\u027d\n)\3)\3)\3*\3*\3*\3*\3+\5+\u0286\n+\3+\5+\u0289\n+\3+\3+\3+\3"+
		"+\7+\u028f\n+\f+\16+\u0292\13+\5+\u0294\n+\3+\3+\3,\5,\u0299\n,\3,\3,"+
		"\3,\3,\3,\7,\u02a0\n,\f,\16,\u02a3\13,\5,\u02a5\n,\3,\3,\3,\3,\5,\u02ab"+
		"\n,\3,\5,\u02ae\n,\3,\7,\u02b1\n,\f,\16,\u02b4\13,\3-\3-\3-\3-\5-\u02ba"+
		"\n-\3.\5.\u02bd\n.\3.\3.\5.\u02c1\n.\3.\3.\3.\3.\5.\u02c7\n.\3/\3/\5/"+
		"\u02cb\n/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\5\61\u02d6\n\61\3\62"+
		"\3\62\3\62\3\62\7\62\u02dc\n\62\f\62\16\62\u02df\13\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\7\63\u02e7\n\63\f\63\16\63\u02ea\13\63\3\64\3\64\3\64"+
		"\3\64\5\64\u02f0\n\64\3\64\3\64\7\64\u02f4\n\64\f\64\16\64\u02f7\13\64"+
		"\3\65\3\65\3\65\3\65\5\65\u02fd\n\65\3\66\7\66\u0300\n\66\f\66\16\66\u0303"+
		"\13\66\3\67\7\67\u0306\n\67\f\67\16\67\u0309\13\67\3\67\3\67\7\67\u030d"+
		"\n\67\f\67\16\67\u0310\13\67\3\67\7\67\u0313\n\67\f\67\16\67\u0316\13"+
		"\67\5\67\u0318\n\67\3\67\7\67\u031b\n\67\f\67\16\67\u031e\13\67\38\38"+
		"\38\58\u0323\n8\39\39\39\39\3:\3:\3:\7:\u032c\n:\f:\16:\u032f\13:\3;\3"+
		";\3;\3;\5;\u0335\n;\3;\3;\3<\3<\5<\u033b\n<\7<\u033d\n<\f<\16<\u0340\13"+
		"<\3=\3=\3=\3=\5=\u0346\n=\3=\3=\5=\u034a\n=\3=\3=\3>\3>\3>\3>\3>\3>\7"+
		">\u0354\n>\f>\16>\u0357\13>\3>\3>\5>\u035b\n>\3?\3?\3?\7?\u0360\n?\f?"+
		"\16?\u0363\13?\3?\5?\u0366\n?\3@\3@\3@\5@\u036b\n@\3@\3@\3@\3@\3@\3@\3"+
		"A\3A\3A\3B\3B\3B\5B\u0379\nB\3C\3C\3C\5C\u037e\nC\3C\3C\5C\u0382\nC\3"+
		"C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\7F\u039a"+
		"\nF\fF\16F\u039d\13F\3G\3G\3G\7G\u03a2\nG\fG\16G\u03a5\13G\3H\3H\3H\7"+
		"H\u03aa\nH\fH\16H\u03ad\13H\3I\3I\3I\3I\7I\u03b3\nI\fI\16I\u03b6\13I\3"+
		"J\3J\3J\3J\7J\u03bc\nJ\fJ\16J\u03bf\13J\3K\3K\3K\3K\7K\u03c5\nK\fK\16"+
		"K\u03c8\13K\3K\3K\3K\3K\5K\u03ce\nK\5K\u03d0\nK\3L\3L\3L\7L\u03d5\nL\f"+
		"L\16L\u03d8\13L\3M\3M\3M\7M\u03dd\nM\fM\16M\u03e0\13M\3N\3N\3N\7N\u03e5"+
		"\nN\fN\16N\u03e8\13N\3O\3O\3O\3O\7O\u03ee\nO\fO\16O\u03f1\13O\3P\3P\3"+
		"P\3P\7P\u03f7\nP\fP\16P\u03fa\13P\3Q\3Q\3Q\3Q\7Q\u0400\nQ\fQ\16Q\u0403"+
		"\13Q\3R\7R\u0406\nR\fR\16R\u0409\13R\3R\3R\3S\3S\3S\5S\u0410\nS\3S\3S"+
		"\7S\u0414\nS\fS\16S\u0417\13S\3S\3S\7S\u041b\nS\fS\16S\u041e\13S\5S\u0420"+
		"\nS\3T\3T\7T\u0424\nT\fT\16T\u0427\13T\5T\u0429\nT\3T\5T\u042c\nT\3T\3"+
		"T\3T\5T\u0431\nT\3T\5T\u0434\nT\3U\3U\3U\3U\3U\3U\3U\5U\u043d\nU\3V\3"+
		"V\3V\3V\3V\3V\3V\3V\7V\u0447\nV\fV\16V\u044a\13V\3V\3V\3V\3V\3V\3V\3V"+
		"\3V\7V\u0454\nV\fV\16V\u0457\13V\3V\5V\u045a\nV\3W\3W\3W\3W\3W\3W\3W\3"+
		"W\3W\5W\u0465\nW\3W\3W\3W\3W\3W\5W\u046c\nW\3W\5W\u046f\nW\3W\3W\3W\3"+
		"W\3W\3W\3W\3W\3W\3W\5W\u047b\nW\3X\3X\3X\3X\3X\3X\3X\5X\u0484\nX\3Y\3"+
		"Y\3Y\3Y\3Y\5Y\u048b\nY\3Z\3Z\5Z\u048f\nZ\3[\3[\3\\\3\\\3]\3]\3^\3^\3_"+
		"\3_\3`\3`\3a\3a\3b\3b\3c\3c\3c\3c\3c\3c\3c\5c\u04a8\nc\3d\3d\3d\3d\3d"+
		"\3d\3d\3d\5d\u04b2\nd\3e\3e\7e\u04b6\ne\fe\16e\u04b9\13e\3e\5e\u04bc\n"+
		"e\3e\3e\3f\3f\3f\5f\u04c3\nf\5f\u04c5\nf\3g\3g\3g\3g\3g\3g\3g\3g\7g\u04cf"+
		"\ng\fg\16g\u04d2\13g\5g\u04d4\ng\3g\3g\3g\3g\5g\u04da\ng\3h\3h\3h\5h\u04df"+
		"\nh\3i\3i\3i\3i\7i\u04e5\ni\fi\16i\u04e8\13i\5i\u04ea\ni\3i\3i\3j\3j\3"+
		"j\3j\3j\7j\u04f3\nj\fj\16j\u04f6\13j\5j\u04f8\nj\3j\3j\3k\3k\3k\3k\3k"+
		"\5k\u0501\nk\3k\3k\7k\u0505\nk\fk\16k\u0508\13k\3k\3k\3l\3l\3l\7l\u050f"+
		"\nl\fl\16l\u0512\13l\3l\3l\3l\7l\u0517\nl\fl\16l\u051a\13l\3l\3l\3l\3"+
		"l\7l\u0520\nl\fl\16l\u0523\13l\5l\u0525\nl\3m\3m\3m\3m\3m\5m\u052c\nm"+
		"\3n\3n\5n\u0530\nn\3n\3n\3n\7n\u0535\nn\fn\16n\u0538\13n\5n\u053a\nn\3"+
		"n\5n\u053d\nn\3n\3n\3n\3n\3o\3o\3o\3o\5o\u0547\no\3o\5o\u054a\no\3o\3"+
		"o\5o\u054e\no\3o\3o\3o\7o\u0553\no\fo\16o\u0556\13o\5o\u0558\no\3o\3o"+
		"\3o\5o\u055d\no\3o\7o\u0560\no\fo\16o\u0563\13o\3p\5p\u0566\np\3p\3p\3"+
		"p\5p\u056b\np\3p\3p\5p\u056f\np\3p\3p\3p\7p\u0574\np\fp\16p\u0577\13p"+
		"\5p\u0579\np\3p\3p\3p\7p\u057e\np\fp\16p\u0581\13p\3q\5q\u0584\nq\3q\3"+
		"q\3q\5q\u0589\nq\3q\3q\7q\u058d\nq\fq\16q\u0590\13q\3r\3r\5r\u0594\nr"+
		"\3s\3s\3s\5s\u0599\ns\3s\3s\3s\3s\3s\5s\u05a0\ns\3s\3s\5s\u05a4\ns\3s"+
		"\7s\u05a7\ns\fs\16s\u05aa\13s\3t\3t\3t\5t\u05af\nt\3t\3t\3t\5t\u05b4\n"+
		"t\3t\3t\5t\u05b8\nt\3t\7t\u05bb\nt\ft\16t\u05be\13t\3u\3u\5u\u05c2\nu"+
		"\3u\3u\5u\u05c6\nu\3u\3u\5u\u05ca\nu\3u\7u\u05cd\nu\fu\16u\u05d0\13u\3"+
		"v\3v\3v\3v\7v\u05d6\nv\fv\16v\u05d9\13v\5v\u05db\nv\3v\3v\3w\5w\u05e0"+
		"\nw\3w\5w\u05e3\nw\3w\5w\u05e6\nw\3w\5w\u05e9\nw\5w\u05eb\nw\3x\3x\3x"+
		"\3x\5x\u05f1\nx\3y\3y\3y\3z\3z\3z\5z\u05f9\nz\3{\5{\u05fc\n{\3{\3{\3{"+
		"\3{\3{\5{\u0603\n{\3|\3|\3|\3|\3|\3|\5|\u060b\n|\3}\5}\u060e\n}\3}\3}"+
		"\3}\7}\u0613\n}\f}\16}\u0616\13}\3~\5~\u0619\n~\3~\3~\3~\3~\3\177\5\177"+
		"\u0620\n\177\3\177\3\177\3\177\3\177\5\177\u0626\n\177\3\177\7\177\u0629"+
		"\n\177\f\177\16\177\u062c\13\177\3\u0080\3\u0080\5\u0080\u0630\n\u0080"+
		"\3\u0081\5\u0081\u0633\n\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\7\u0081\u063a\n\u0081\f\u0081\16\u0081\u063d\13\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u0645\n\u0081\3\u0081\7\u0081"+
		"\u0648\n\u0081\f\u0081\16\u0081\u064b\13\u0081\3\u0082\3\u0082\5\u0082"+
		"\u064f\n\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u0654\n\u0082\3\u0082\7"+
		"\u0082\u0657\n\u0082\f\u0082\16\u0082\u065a\13\u0082\3\u0083\3\u0083\3"+
		"\u0083\3\u0083\3\u0084\3\u0084\5\u0084\u0662\n\u0084\3\u0084\3\u0084\3"+
		"\u0084\7\u0084\u0667\n\u0084\f\u0084\16\u0084\u066a\13\u0084\3\u0084\3"+
		"\u0084\3\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u0672\n\u0084\3\u0084\7"+
		"\u0084\u0675\n\u0084\f\u0084\16\u0084\u0678\13\u0084\3\u0085\3\u0085\3"+
		"\u0085\7\u0085\u067d\n\u0085\f\u0085\16\u0085\u0680\13\u0085\3\u0086\3"+
		"\u0086\3\u0086\7\u0086\u0685\n\u0086\f\u0086\16\u0086\u0688\13\u0086\3"+
		"\u0087\5\u0087\u068b\n\u0087\3\u0087\5\u0087\u068e\n\u0087\3\u0087\5\u0087"+
		"\u0691\n\u0087\3\u0087\5\u0087\u0694\n\u0087\5\u0087\u0696\n\u0087\3\u0087"+
		"\7\u0087\u0699\n\u0087\f\u0087\16\u0087\u069c\13\u0087\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u06a7"+
		"\n\u0088\3\u0088\3\u0088\5\u0088\u06ab\n\u0088\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u06b6\n\u0089"+
		"\3\u0089\3\u0089\3\u0089\5\u0089\u06bb\n\u0089\3\u008a\3\u008a\3\u008b"+
		"\3\u008b\3\u008c\3\u008c\3\u008d\3\u008d\3\u008e\3\u008e\3\u008f\3\u008f"+
		"\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\2\2\u0092\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c"+
		"\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\2\25\4\2"+
		"FGZ^\3\2?@\3\2zz\3\2\177\177\4\2\21\21*+\3\2,-\3\2./\4\2\33\33\62\63\3"+
		"\2\60\61\3\2\23\26\4\2\30\30\32\32\4\2\27\27\648\3\2SV\3\2HK\3\2OR\3\2"+
		"LN\3\2SW\4\2SSUV\4\2..XX\2\u076d\2\u0122\3\2\2\2\4\u012a\3\2\2\2\6\u0132"+
		"\3\2\2\2\b\u0141\3\2\2\2\n\u015c\3\2\2\2\f\u0166\3\2\2\2\16\u0169\3\2"+
		"\2\2\20\u016b\3\2\2\2\22\u0176\3\2\2\2\24\u017c\3\2\2\2\26\u0192\3\2\2"+
		"\2\30\u0195\3\2\2\2\32\u019c\3\2\2\2\34\u01bb\3\2\2\2\36\u01bf\3\2\2\2"+
		" \u01cd\3\2\2\2\"\u01cf\3\2\2\2$\u01dd\3\2\2\2&\u01e6\3\2\2\2(\u01e8\3"+
		"\2\2\2*\u01eb\3\2\2\2,\u01fa\3\2\2\2.\u0208\3\2\2\2\60\u020b\3\2\2\2\62"+
		"\u0214\3\2\2\2\64\u0217\3\2\2\2\66\u021b\3\2\2\28\u0223\3\2\2\2:\u0228"+
		"\3\2\2\2<\u022f\3\2\2\2>\u023c\3\2\2\2@\u025b\3\2\2\2B\u025d\3\2\2\2D"+
		"\u0264\3\2\2\2F\u0267\3\2\2\2H\u026d\3\2\2\2J\u026f\3\2\2\2L\u0272\3\2"+
		"\2\2N\u0278\3\2\2\2P\u027a\3\2\2\2R\u0280\3\2\2\2T\u0288\3\2\2\2V\u0298"+
		"\3\2\2\2X\u02b9\3\2\2\2Z\u02c6\3\2\2\2\\\u02c8\3\2\2\2^\u02ce\3\2\2\2"+
		"`\u02d5\3\2\2\2b\u02d7\3\2\2\2d\u02e0\3\2\2\2f\u02eb\3\2\2\2h\u02fc\3"+
		"\2\2\2j\u0301\3\2\2\2l\u0307\3\2\2\2n\u0322\3\2\2\2p\u0324\3\2\2\2r\u0328"+
		"\3\2\2\2t\u0330\3\2\2\2v\u033e\3\2\2\2x\u0341\3\2\2\2z\u034d\3\2\2\2|"+
		"\u035c\3\2\2\2~\u0367\3\2\2\2\u0080\u0372\3\2\2\2\u0082\u0378\3\2\2\2"+
		"\u0084\u037a\3\2\2\2\u0086\u0388\3\2\2\2\u0088\u038e\3\2\2\2\u008a\u0395"+
		"\3\2\2\2\u008c\u039e\3\2\2\2\u008e\u03a6\3\2\2\2\u0090\u03ae\3\2\2\2\u0092"+
		"\u03b7\3\2\2\2\u0094\u03cf\3\2\2\2\u0096\u03d1\3\2\2\2\u0098\u03d9\3\2"+
		"\2\2\u009a\u03e1\3\2\2\2\u009c\u03e9\3\2\2\2\u009e\u03f2\3\2\2\2\u00a0"+
		"\u03fb\3\2\2\2\u00a2\u0407\3\2\2\2\u00a4\u041f\3\2\2\2\u00a6\u042b\3\2"+
		"\2\2\u00a8\u043c\3\2\2\2\u00aa\u0459\3\2\2\2\u00ac\u047a\3\2\2\2\u00ae"+
		"\u0483\3\2\2\2\u00b0\u048a\3\2\2\2\u00b2\u048e\3\2\2\2\u00b4\u0490\3\2"+
		"\2\2\u00b6\u0492\3\2\2\2\u00b8\u0494\3\2\2\2\u00ba\u0496\3\2\2\2\u00bc"+
		"\u0498\3\2\2\2\u00be\u049a\3\2\2\2\u00c0\u049c\3\2\2\2\u00c2\u049e\3\2"+
		"\2\2\u00c4\u04a7\3\2\2\2\u00c6\u04b1\3\2\2\2\u00c8\u04b7\3\2\2\2\u00ca"+
		"\u04c4\3\2\2\2\u00cc\u04d9\3\2\2\2\u00ce\u04db\3\2\2\2\u00d0\u04e0\3\2"+
		"\2\2\u00d2\u04ed\3\2\2\2\u00d4\u04fb\3\2\2\2\u00d6\u0524\3\2\2\2\u00d8"+
		"\u052b\3\2\2\2\u00da\u052d\3\2\2\2\u00dc\u0542\3\2\2\2\u00de\u0565\3\2"+
		"\2\2\u00e0\u0583\3\2\2\2\u00e2\u0593\3\2\2\2\u00e4\u0595\3\2\2\2\u00e6"+
		"\u05ab\3\2\2\2\u00e8\u05bf\3\2\2\2\u00ea\u05d1\3\2\2\2\u00ec\u05ea\3\2"+
		"\2\2\u00ee\u05f0\3\2\2\2\u00f0\u05f2\3\2\2\2\u00f2\u05f8\3\2\2\2\u00f4"+
		"\u05fb\3\2\2\2\u00f6\u0604\3\2\2\2\u00f8\u060d\3\2\2\2\u00fa\u0618\3\2"+
		"\2\2\u00fc\u061f\3\2\2\2\u00fe\u062f\3\2\2\2\u0100\u0632\3\2\2\2\u0102"+
		"\u064e\3\2\2\2\u0104\u065b\3\2\2\2\u0106\u0661\3\2\2\2\u0108\u0679\3\2"+
		"\2\2\u010a\u0681\3\2\2\2\u010c\u0695\3\2\2\2\u010e\u06aa\3\2\2\2\u0110"+
		"\u06ba\3\2\2\2\u0112\u06bc\3\2\2\2\u0114\u06be\3\2\2\2\u0116\u06c0\3\2"+
		"\2\2\u0118\u06c2\3\2\2\2\u011a\u06c4\3\2\2\2\u011c\u06c6\3\2\2\2\u011e"+
		"\u06c8\3\2\2\2\u0120\u06ca\3\2\2\2\u0122\u0126\5\4\3\2\u0123\u0125\5\n"+
		"\6\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\3\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012b\5\6\4\2"+
		"\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012f\3\2\2\2\u012c\u012e"+
		"\5\b\5\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\5\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\7\16\2"+
		"\2\u0133\u0138\5\u00a8U\2\u0134\u0135\7\20\2\2\u0135\u0137\5\u00a8U\2"+
		"\u0136\u0134\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139"+
		"\3\2\2\2\u0139\u013e\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013d\7\7\2\2\u013c"+
		"\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\7\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7\17\2\2\u0142\u0147"+
		"\5\u00a8U\2\u0143\u0144\7\20\2\2\u0144\u0146\5\u00a8U\2\u0145\u0143\3"+
		"\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u014e\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\7\20\2\2\u014b\u014f\7"+
		"\21\2\2\u014c\u014d\7\62\2\2\u014d\u014f\7w\2\2\u014e\u014a\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0153\3\2\2\2\u0150\u0152\7\7"+
		"\2\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\t\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u015d\5\u00f2"+
		"z\2\u0157\u015d\5\u00e2r\2\u0158\u015d\5\u00dco\2\u0159\u015d\5\u00de"+
		"p\2\u015a\u015d\5\u00e0q\2\u015b\u015d\5d\63\2\u015c\u0156\3\2\2\2\u015c"+
		"\u0157\3\2\2\2\u015c\u0158\3\2\2\2\u015c\u0159\3\2\2\2\u015c\u015a\3\2"+
		"\2\2\u015c\u015b\3\2\2\2\u015d\13\3\2\2\2\u015e\u0167\5f\64\2\u015f\u0167"+
		"\5\u00e0q\2\u0160\u0167\5\u00e2r\2\u0161\u0167\5\u00f2z\2\u0162\u0167"+
		"\5\u00dco\2\u0163\u0167\5\u00dep\2\u0164\u0167\5r:\2\u0165\u0167\5V,\2"+
		"\u0166\u015e\3\2\2\2\u0166\u015f\3\2\2\2\u0166\u0160\3\2\2\2\u0166\u0161"+
		"\3\2\2\2\u0166\u0162\3\2\2\2\u0166\u0163\3\2\2\2\u0166\u0164\3\2\2\2\u0166"+
		"\u0165\3\2\2\2\u0167\r\3\2\2\2\u0168\u016a\5\u0120\u0091\2\u0169\u0168"+
		"\3\2\2\2\u0169\u016a\3\2\2\2\u016a\17\3\2\2\2\u016b\u016c\7\23\2\2\u016c"+
		"\u0171\5\22\n\2\u016d\u016e\7\22\2\2\u016e\u0170\5\22\n\2\u016f\u016d"+
		"\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0174\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0175\7\25\2\2\u0175\21\3\2\2"+
		"\2\u0176\u0177\5.\30\2\u0177\u017a\7w\2\2\u0178\u0179\7\33\2\2\u0179\u017b"+
		"\5\36\20\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\23\3\2\2\2\u017c"+
		"\u017e\7\23\2\2\u017d\u017f\5\32\16\2\u017e\u017d\3\2\2\2\u017e\u017f"+
		"\3\2\2\2\u017f\u0184\3\2\2\2\u0180\u0181\7\22\2\2\u0181\u0183\5\32\16"+
		"\2\u0182\u0180\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185"+
		"\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0188\7\25\2\2"+
		"\u0188\25\3\2\2\2\u0189\u018a\7E\2\2\u018a\u018f\5\30\r\2\u018b\u018c"+
		"\7\22\2\2\u018c\u018e\5\30\r\2\u018d\u018b\3\2\2\2\u018e\u0191\3\2\2\2"+
		"\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f"+
		"\3\2\2\2\u0192\u0189\3\2\2\2\u0192\u0193\3\2\2\2\u0193\27\3\2\2\2\u0194"+
		"\u0196\5\64\33\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3"+
		"\2\2\2\u0197\u0198\7w\2\2\u0198\u0199\7\33\2\2\u0199\u019a\5\32\16\2\u019a"+
		"\31\3\2\2\2\u019b\u019d\5\64\33\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2"+
		"\2\2\u019d\u019e\3\2\2\2\u019e\u019f\5\34\17\2\u019f\33\3\2\2\2\u01a0"+
		"\u01a1\7\34\2\2\u01a1\u01a2\5\34\17\2\u01a2\u01a4\7\35\2\2\u01a3\u01a5"+
		"\7\36\2\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2"+
		"\u01a6\u01a8\5(\25\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01bc"+
		"\3\2\2\2\u01a9\u01ab\5*\26\2\u01aa\u01ac\5(\25\2\u01ab\u01aa\3\2\2\2\u01ab"+
		"\u01ac\3\2\2\2\u01ac\u01bc\3\2\2\2\u01ad\u01af\5\36\20\2\u01ae\u01b0\7"+
		"\36\2\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1"+
		"\u01b3\5(\25\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01bc\3\2"+
		"\2\2\u01b4\u01b6\7D\2\2\u01b5\u01b7\7\36\2\2\u01b6\u01b5\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01ba\5(\25\2\u01b9\u01b8\3\2"+
		"\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01a0\3\2\2\2\u01bb"+
		"\u01a9\3\2\2\2\u01bb\u01ad\3\2\2\2\u01bb\u01b4\3\2\2\2\u01bc\35\3\2\2"+
		"\2\u01bd\u01be\7\16\2\2\u01be\u01c0\7\20\2\2\u01bf\u01bd\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c6\5\"\22\2\u01c2\u01c3\7"+
		"\20\2\2\u01c3\u01c5\5\"\22\2\u01c4\u01c2\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\37\3\2\2\2\u01c8\u01c6\3\2\2"+
		"\2\u01c9\u01ce\7\21\2\2\u01ca\u01cb\5\16\b\2\u01cb\u01cc\5\32\16\2\u01cc"+
		"\u01ce\3\2\2\2\u01cd\u01c9\3\2\2\2\u01cd\u01ca\3\2\2\2\u01ce!\3\2\2\2"+
		"\u01cf\u01db\7w\2\2\u01d0\u01d1\7\23\2\2\u01d1\u01d6\5 \21\2\u01d2\u01d3"+
		"\7\22\2\2\u01d3\u01d5\5 \21\2\u01d4\u01d2\3\2\2\2\u01d5\u01d8\3\2\2\2"+
		"\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01d6"+
		"\3\2\2\2\u01d9\u01da\7\25\2\2\u01da\u01dc\3\2\2\2\u01db\u01d0\3\2\2\2"+
		"\u01db\u01dc\3\2\2\2\u01dc#\3\2\2\2\u01dd\u01e0\7w\2\2\u01de\u01df\7\33"+
		"\2\2\u01df\u01e1\5\32\16\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1"+
		"%\3\2\2\2\u01e2\u01e7\5F$\2\u01e3\u01e4\5.\30\2\u01e4\u01e5\5\32\16\2"+
		"\u01e5\u01e7\3\2\2\2\u01e6\u01e2\3\2\2\2\u01e6\u01e3\3\2\2\2\u01e7\'\3"+
		"\2\2\2\u01e8\u01e9\7\20\2\2\u01e9\u01ea\5*\26\2\u01ea)\3\2\2\2\u01eb\u01f4"+
		"\7\34\2\2\u01ec\u01f1\5&\24\2\u01ed\u01ee\7\22\2\2\u01ee\u01f0\5&\24\2"+
		"\u01ef\u01ed\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2"+
		"\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01ec\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\7\35\2\2\u01f7\u01f8\7"+
		")\2\2\u01f8\u01f9\5\32\16\2\u01f9+\3\2\2\2\u01fa\u01fb\7\34\2\2\u01fb"+
		"\u0200\5$\23\2\u01fc\u01fd\7\22\2\2\u01fd\u01ff\5$\23\2\u01fe\u01fc\3"+
		"\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201"+
		"\u0203\3\2\2\2\u0202\u0200\3\2\2\2\u0203\u0204\7\35\2\2\u0204-\3\2\2\2"+
		"\u0205\u0207\5\60\31\2\u0206\u0205\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206"+
		"\3\2\2\2\u0208\u0209\3\2\2\2\u0209/\3\2\2\2\u020a\u0208\3\2\2\2\u020b"+
		"\u020c\5\62\32\2\u020c\61\3\2\2\2\u020d\u0215\5\u0116\u008c\2\u020e\u0215"+
		"\5\u011c\u008f\2\u020f\u0215\5\u0120\u0091\2\u0210\u0215\5\64\33\2\u0211"+
		"\u0215\5\u0118\u008d\2\u0212\u0215\5\u011a\u008e\2\u0213\u0215\7B\2\2"+
		"\u0214\u020d\3\2\2\2\u0214\u020e\3\2\2\2\u0214\u020f\3\2\2\2\u0214\u0210"+
		"\3\2\2\2\u0214\u0211\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0213\3\2\2\2\u0215"+
		"\63\3\2\2\2\u0216\u0218\5\66\34\2\u0217\u0216\3\2\2\2\u0218\u0219\3\2"+
		"\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\65\3\2\2\2\u021b\u021f"+
		"\7Y\2\2\u021c\u021d\58\35\2\u021d\u021e\7\33\2\2\u021e\u0220\3\2\2\2\u021f"+
		"\u021c\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0222\5>"+
		" \2\u0222\67\3\2\2\2\u0223\u0224\t\2\2\2\u02249\3\2\2\2\u0225\u0226\5"+
		"\u00a8U\2\u0226\u0227\7\27\2\2\u0227\u0229\3\2\2\2\u0228\u0225\3\2\2\2"+
		"\u0228\u0229\3\2\2\2\u0229\u022b\3\2\2\2\u022a\u022c\7\21\2\2\u022b\u022a"+
		"\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\5\u008aF"+
		"\2\u022e;\3\2\2\2\u022f\u0238\7\34\2\2\u0230\u0235\5:\36\2\u0231\u0232"+
		"\7\22\2\2\u0232\u0234\5:\36\2\u0233\u0231\3\2\2\2\u0234\u0237\3\2\2\2"+
		"\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235"+
		"\3\2\2\2\u0238\u0230\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\3\2\2\2\u023a"+
		"\u023b\7\35\2\2\u023b=\3\2\2\2\u023c\u0241\5\u00a8U\2\u023d\u023e\7\20"+
		"\2\2\u023e\u0240\5\u00a8U\2\u023f\u023d\3\2\2\2\u0240\u0243\3\2\2\2\u0241"+
		"\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0245\3\2\2\2\u0243\u0241\3\2"+
		"\2\2\u0244\u0246\5\24\13\2\u0245\u0244\3\2\2\2\u0245\u0246\3\2\2\2\u0246"+
		"\u0248\3\2\2\2\u0247\u0249\5<\37\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2"+
		"\2\2\u0249?\3\2\2\2\u024a\u024b\7_\2\2\u024b\u025c\5\u008aF\2\u024c\u024e"+
		"\7a\2\2\u024d\u024f\5B\"\2\u024e\u024d\3\2\2\2\u024e\u024f\3\2\2\2\u024f"+
		"\u0251\3\2\2\2\u0250\u0252\5\u008aF\2\u0251\u0250\3\2\2\2\u0251\u0252"+
		"\3\2\2\2\u0252\u025c\3\2\2\2\u0253\u0255\7`\2\2\u0254\u0256\5B\"\2\u0255"+
		"\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u025c\3\2\2\2\u0257\u0259\7b"+
		"\2\2\u0258\u025a\5B\"\2\u0259\u0258\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"\u025c\3\2\2\2\u025b\u024a\3\2\2\2\u025b\u024c\3\2\2\2\u025b\u0253\3\2"+
		"\2\2\u025b\u0257\3\2\2\2\u025cA\3\2\2\2\u025d\u0262\7Y\2\2\u025e\u0263"+
		"\5\u00a8U\2\u025f\u0263\7q\2\2\u0260\u0263\7p\2\2\u0261\u0263\7o\2\2\u0262"+
		"\u025e\3\2\2\2\u0262\u025f\3\2\2\2\u0262\u0260\3\2\2\2\u0262\u0261\3\2"+
		"\2\2\u0263C\3\2\2\2\u0264\u0265\5\u00a8U\2\u0265\u0266\7Y\2\2\u0266E\3"+
		"\2\2\2\u0267\u0268\7w\2\2\u0268\u0269\7\33\2\2\u0269\u026a\5\32\16\2\u026a"+
		"G\3\2\2\2\u026b\u026e\5J&\2\u026c\u026e\5L\'\2\u026d\u026b\3\2\2\2\u026d"+
		"\u026c\3\2\2\2\u026eI\3\2\2\2\u026f\u0270\5.\30\2\u0270\u0271\5F$\2\u0271"+
		"K\3\2\2\2\u0272\u0273\5J&\2\u0273\u0274\7\27\2\2\u0274\u0275\5\u008aF"+
		"\2\u0275M\3\2\2\2\u0276\u0279\5P)\2\u0277\u0279\5R*\2\u0278\u0276\3\2"+
		"\2\2\u0278\u0277\3\2\2\2\u0279O\3\2\2\2\u027a\u027c\5.\30\2\u027b\u027d"+
		"\t\3\2\2\u027c\u027b\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\3\2\2\2\u027e"+
		"\u027f\5F$\2\u027fQ\3\2\2\2\u0280\u0281\5P)\2\u0281\u0282\7\27\2\2\u0282"+
		"\u0283\5\u008aF\2\u0283S\3\2\2\2\u0284\u0286\5\u011c\u008f\2\u0285\u0284"+
		"\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0289\7c\2\2\u0288"+
		"\u0285\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u0293\7\34"+
		"\2\2\u028b\u0290\5N(\2\u028c\u028d\7\22\2\2\u028d\u028f\5N(\2\u028e\u028c"+
		"\3\2\2\2\u028f\u0292\3\2\2\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291"+
		"\u0294\3\2\2\2\u0292\u0290\3\2\2\2\u0293\u028b\3\2\2\2\u0293\u0294\3\2"+
		"\2\2\u0294\u0295\3\2\2\2\u0295\u0296\7\35\2\2\u0296U\3\2\2\2\u0297\u0299"+
		"\5\u011c\u008f\2\u0298\u0297\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a\3"+
		"\2\2\2\u029a\u029b\7c\2\2\u029b\u02a4\7\34\2\2\u029c\u02a1\5N(\2\u029d"+
		"\u029e\7\22\2\2\u029e\u02a0\5N(\2\u029f\u029d\3\2\2\2\u02a0\u02a3\3\2"+
		"\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3"+
		"\u02a1\3\2\2\2\u02a4\u029c\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a6\3\2"+
		"\2\2\u02a6\u02a7\7\35\2\2\u02a7\u02aa\3\2\2\2\u02a8\u02a9\7\33\2\2\u02a9"+
		"\u02ab\5X-\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ad\3\2\2"+
		"\2\u02ac\u02ae\5p9\2\u02ad\u02ac\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b2"+
		"\3\2\2\2\u02af\u02b1\7\7\2\2\u02b0\u02af\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2"+
		"\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3W\3\2\2\2\u02b4\u02b2\3\2\2\2"+
		"\u02b5\u02b6\7d\2\2\u02b6\u02ba\5<\37\2\u02b7\u02b8\7e\2\2\u02b8\u02ba"+
		"\5<\37\2\u02b9\u02b5\3\2\2\2\u02b9\u02b7\3\2\2\2\u02baY\3\2\2\2\u02bb"+
		"\u02bd\5\24\13\2\u02bc\u02bb\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02be\3"+
		"\2\2\2\u02be\u02c0\5<\37\2\u02bf\u02c1\5\u00c8e\2\u02c0\u02bf\3\2\2\2"+
		"\u02c0\u02c1\3\2\2\2\u02c1\u02c7\3\2\2\2\u02c2\u02c3\5\24\13\2\u02c3\u02c4"+
		"\5\u00c8e\2\u02c4\u02c7\3\2\2\2\u02c5\u02c7\5\u00c8e\2\u02c6\u02bc\3\2"+
		"\2\2\u02c6\u02c2\3\2\2\2\u02c6\u02c5\3\2\2\2\u02c7[\3\2\2\2\u02c8\u02ca"+
		"\5\36\20\2\u02c9\u02cb\5\24\13\2\u02ca\u02c9\3\2\2\2\u02ca\u02cb\3\2\2"+
		"\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\5<\37\2\u02cd]\3\2\2\2\u02ce\u02cf"+
		"\5\36\20\2\u02cf\u02d0\7C\2\2\u02d0\u02d1\5\u008aF\2\u02d1_\3\2\2\2\u02d2"+
		"\u02d6\5\\/\2\u02d3\u02d6\5\36\20\2\u02d4\u02d6\5^\60\2\u02d5\u02d2\3"+
		"\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d4\3\2\2\2\u02d6a\3\2\2\2\u02d7\u02d8"+
		"\7\33\2\2\u02d8\u02dd\5`\61\2\u02d9\u02da\7\22\2\2\u02da\u02dc\5`\61\2"+
		"\u02db\u02d9\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd\u02de"+
		"\3\2\2\2\u02dec\3\2\2\2\u02df\u02dd\3\2\2\2\u02e0\u02e1\5.\30\2\u02e1"+
		"\u02e2\7k\2\2\u02e2\u02e3\7w\2\2\u02e3\u02e4\7\27\2\2\u02e4\u02e8\5\""+
		"\22\2\u02e5\u02e7\7\7\2\2\u02e6\u02e5\3\2\2\2\u02e7\u02ea\3\2\2\2\u02e8"+
		"\u02e6\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9e\3\2\2\2\u02ea\u02e8\3\2\2\2"+
		"\u02eb\u02ec\5.\30\2\u02ec\u02ed\7i\2\2\u02ed\u02ef\7h\2\2\u02ee\u02f0"+
		"\5b\62\2\u02ef\u02ee\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1"+
		"\u02f5\5h\65\2\u02f2\u02f4\7\7\2\2\u02f3\u02f2\3\2\2\2\u02f4\u02f7\3\2"+
		"\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6g\3\2\2\2\u02f7\u02f5"+
		"\3\2\2\2\u02f8\u02f9\7\b\2\2\u02f9\u02fa\5j\66\2\u02fa\u02fb\7\t\2\2\u02fb"+
		"\u02fd\3\2\2\2\u02fc\u02f8\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fdi\3\2\2\2"+
		"\u02fe\u0300\5\f\7\2\u02ff\u02fe\3\2\2\2\u0300\u0303\3\2\2\2\u0301\u02ff"+
		"\3\2\2\2\u0301\u0302\3\2\2\2\u0302k\3\2\2\2\u0303\u0301\3\2\2\2\u0304"+
		"\u0306\7\7\2\2\u0305\u0304\3\2\2\2\u0306\u0309\3\2\2\2\u0307\u0305\3\2"+
		"\2\2\u0307\u0308\3\2\2\2\u0308\u0317\3\2\2\2\u0309\u0307\3\2\2\2\u030a"+
		"\u0314\5\u00b2Z\2\u030b\u030d\7\7\2\2\u030c\u030b\3\2\2\2\u030d\u0310"+
		"\3\2\2\2\u030e\u030c\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0311\3\2\2\2\u0310"+
		"\u030e\3\2\2\2\u0311\u0313\5\u00b2Z\2\u0312\u030e\3\2\2\2\u0313\u0316"+
		"\3\2\2\2\u0314\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0318\3\2\2\2\u0316"+
		"\u0314\3\2\2\2\u0317\u030a\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u031c\3\2"+
		"\2\2\u0319\u031b\7\7\2\2\u031a\u0319\3\2\2\2\u031b\u031e\3\2\2\2\u031c"+
		"\u031a\3\2\2\2\u031c\u031d\3\2\2\2\u031dm\3\2\2\2\u031e\u031c\3\2\2\2"+
		"\u031f\u0323\5p9\2\u0320\u0321\7\27\2\2\u0321\u0323\5\u008aF\2\u0322\u031f"+
		"\3\2\2\2\u0322\u0320\3\2\2\2\u0323o\3\2\2\2\u0324\u0325\7\b\2\2\u0325"+
		"\u0326\5l\67\2\u0326\u0327\7\t\2\2\u0327q\3\2\2\2\u0328\u0329\7l\2\2\u0329"+
		"\u032d\5p9\2\u032a\u032c\7\7\2\2\u032b\u032a\3\2\2\2\u032c\u032f\3\2\2"+
		"\2\u032d\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032es\3\2\2\2\u032f\u032d"+
		"\3\2\2\2\u0330\u0331\7\b\2\2\u0331\u0334\5v<\2\u0332\u0333\7\7\2\2\u0333"+
		"\u0335\5j\66\2\u0334\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336\3\2"+
		"\2\2\u0336\u0337\7\t\2\2\u0337u\3\2\2\2\u0338\u033a\5x=\2\u0339\u033b"+
		"\7\22\2\2\u033a\u0339\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033d\3\2\2\2"+
		"\u033c\u0338\3\2\2\2\u033d\u0340\3\2\2\2\u033e\u033c\3\2\2\2\u033e\u033f"+
		"\3\2\2\2\u033fw\3\2\2\2\u0340\u033e\3\2\2\2\u0341\u0342\5.\30\2\u0342"+
		"\u0349\7w\2\2\u0343\u0345\7\33\2\2\u0344\u0346\5\64\33\2\u0345\u0344\3"+
		"\2\2\2\u0345\u0346\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u034a\5\\/\2\u0348"+
		"\u034a\5<\37\2\u0349\u0343\3\2\2\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2"+
		"\2\2\u034a\u034b\3\2\2\2\u034b\u034c\5h\65\2\u034cy\3\2\2\2\u034d\u034e"+
		"\7m\2\2\u034e\u034f\7\34\2\2\u034f\u0350\5\u008aF\2\u0350\u0351\7\35\2"+
		"\2\u0351\u0355\5\u008aF\2\u0352\u0354\7\7\2\2\u0353\u0352\3\2\2\2\u0354"+
		"\u0357\3\2\2\2\u0355\u0353\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u035a\3\2"+
		"\2\2\u0357\u0355\3\2\2\2\u0358\u0359\7n\2\2\u0359\u035b\5\u008aF\2\u035a"+
		"\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035b{\3\2\2\2\u035c\u035d\7s\2\2\u035d"+
		"\u0361\5p9\2\u035e\u0360\5~@\2\u035f\u035e\3\2\2\2\u0360\u0363\3\2\2\2"+
		"\u0361\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0365\3\2\2\2\u0363\u0361"+
		"\3\2\2\2\u0364\u0366\5\u0080A\2\u0365\u0364\3\2\2\2\u0365\u0366\3\2\2"+
		"\2\u0366}\3\2\2\2\u0367\u0368\7t\2\2\u0368\u036a\7\34\2\2\u0369\u036b"+
		"\5\64\33\2\u036a\u0369\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036c\3\2\2\2"+
		"\u036c\u036d\7w\2\2\u036d\u036e\7\33\2\2\u036e\u036f\5\36\20\2\u036f\u0370"+
		"\7\35\2\2\u0370\u0371\5p9\2\u0371\177\3\2\2\2\u0372\u0373\7u\2\2\u0373"+
		"\u0374\5p9\2\u0374\u0081\3\2\2\2\u0375\u0379\5\u0084C\2\u0376\u0379\5"+
		"\u0086D\2\u0377\u0379\5\u0088E\2\u0378\u0375\3\2\2\2\u0378\u0376\3\2\2"+
		"\2\u0378\u0377\3\2\2\2\u0379\u0083\3\2\2\2\u037a\u037b\7q\2\2\u037b\u037d"+
		"\7\34\2\2\u037c\u037e\5\64\33\2\u037d\u037c\3\2\2\2\u037d\u037e\3\2\2"+
		"\2\u037e\u0381\3\2\2\2\u037f\u0382\5,\27\2\u0380\u0382\5$\23\2\u0381\u037f"+
		"\3\2\2\2\u0381\u0380\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0384\7.\2\2\u0384"+
		"\u0385\5\u008aF\2\u0385\u0386\7\35\2\2\u0386\u0387\5\u008aF\2\u0387\u0085"+
		"\3\2\2\2\u0388\u0389\7p\2\2\u0389\u038a\7\34\2\2\u038a\u038b\5\u008aF"+
		"\2\u038b\u038c\7\35\2\2\u038c\u038d\5\u008aF\2\u038d\u0087\3\2\2\2\u038e"+
		"\u038f\7r\2\2\u038f\u0390\5\u008aF\2\u0390\u0391\7p\2\2\u0391\u0392\7"+
		"\34\2\2\u0392\u0393\5\u008aF\2\u0393\u0394\7\35\2\2\u0394\u0089\3\2\2"+
		"\2\u0395\u039b\5\u008cG\2\u0396\u0397\5\u00c2b\2\u0397\u0398\5\u008cG"+
		"\2\u0398\u039a\3\2\2\2\u0399\u0396\3\2\2\2\u039a\u039d\3\2\2\2\u039b\u0399"+
		"\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u008b\3\2\2\2\u039d\u039b\3\2\2\2\u039e"+
		"\u03a3\5\u008eH\2\u039f\u03a0\7 \2\2\u03a0\u03a2\5\u008eH\2\u03a1\u039f"+
		"\3\2\2\2\u03a2\u03a5\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4"+
		"\u008d\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a6\u03ab\5\u0090I\2\u03a7\u03a8"+
		"\7!\2\2\u03a8\u03aa\5\u0090I\2\u03a9\u03a7\3\2\2\2\u03aa\u03ad\3\2\2\2"+
		"\u03ab\u03a9\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u008f\3\2\2\2\u03ad\u03ab"+
		"\3\2\2\2\u03ae\u03b4\5\u0092J\2\u03af\u03b0\5\u00c0a\2\u03b0\u03b1\5\u0092"+
		"J\2\u03b1\u03b3\3\2\2\2\u03b2\u03af\3\2\2\2\u03b3\u03b6\3\2\2\2\u03b4"+
		"\u03b2\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u0091\3\2\2\2\u03b6\u03b4\3\2"+
		"\2\2\u03b7\u03bd\5\u0094K\2\u03b8\u03b9\5\u00be`\2\u03b9\u03ba\5\u0094"+
		"K\2\u03ba\u03bc\3\2\2\2\u03bb\u03b8\3\2\2\2\u03bc\u03bf\3\2\2\2\u03bd"+
		"\u03bb\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u0093\3\2\2\2\u03bf\u03bd\3\2"+
		"\2\2\u03c0\u03c6\5\u0096L\2\u03c1\u03c2\5\u00b8]\2\u03c2\u03c3\5\u0096"+
		"L\2\u03c3\u03c5\3\2\2\2\u03c4\u03c1\3\2\2\2\u03c5\u03c8\3\2\2\2\u03c6"+
		"\u03c4\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03d0\3\2\2\2\u03c8\u03c6\3\2"+
		"\2\2\u03c9\u03cd\5\u0096L\2\u03ca\u03cb\5\u00bc_\2\u03cb\u03cc\5\32\16"+
		"\2\u03cc\u03ce\3\2\2\2\u03cd\u03ca\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03d0"+
		"\3\2\2\2\u03cf\u03c0\3\2\2\2\u03cf\u03c9\3\2\2\2\u03d0\u0095\3\2\2\2\u03d1"+
		"\u03d6\5\u0098M\2\u03d2\u03d3\7\"\2\2\u03d3\u03d5\5\u0098M\2\u03d4\u03d2"+
		"\3\2\2\2\u03d5\u03d8\3\2\2\2\u03d6\u03d4\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7"+
		"\u0097\3\2\2\2\u03d8\u03d6\3\2\2\2\u03d9\u03de\5\u009aN\2\u03da\u03db"+
		"\7w\2\2\u03db\u03dd\5\u009aN\2\u03dc\u03da\3\2\2\2\u03dd\u03e0\3\2\2\2"+
		"\u03de\u03dc\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u0099\3\2\2\2\u03e0\u03de"+
		"\3\2\2\2\u03e1\u03e6\5\u009cO\2\u03e2\u03e3\7$\2\2\u03e3\u03e5\5\u009c"+
		"O\2\u03e4\u03e2\3\2\2\2\u03e5\u03e8\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e6"+
		"\u03e7\3\2\2\2\u03e7\u009b\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e9\u03ef\5\u009e"+
		"P\2\u03ea\u03eb\5\u00b6\\\2\u03eb\u03ec\5\u009eP\2\u03ec\u03ee\3\2\2\2"+
		"\u03ed\u03ea\3\2\2\2\u03ee\u03f1\3\2\2\2\u03ef\u03ed\3\2\2\2\u03ef\u03f0"+
		"\3\2\2\2\u03f0\u009d\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f2\u03f8\5\u00a0Q"+
		"\2\u03f3\u03f4\5\u00b4[\2\u03f4\u03f5\5\u00a0Q\2\u03f5\u03f7\3\2\2\2\u03f6"+
		"\u03f3\3\2\2\2\u03f7\u03fa\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f8\u03f9\3\2"+
		"\2\2\u03f9\u009f\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fb\u0401\5\u00a2R\2\u03fc"+
		"\u03fd\5\u00ba^\2\u03fd\u03fe\5\u00a2R\2\u03fe\u0400\3\2\2\2\u03ff\u03fc"+
		"\3\2\2\2\u0400\u0403\3\2\2\2\u0401\u03ff\3\2\2\2\u0401\u0402\3\2\2\2\u0402"+
		"\u00a1\3\2\2\2\u0403\u0401\3\2\2\2\u0404\u0406\5\u00c4c\2\u0405\u0404"+
		"\3\2\2\2\u0406\u0409\3\2\2\2\u0407\u0405\3\2\2\2\u0407\u0408\3\2\2\2\u0408"+
		"\u040a\3\2\2\2\u0409\u0407\3\2\2\2\u040a\u040b\5\u00a4S\2\u040b\u00a3"+
		"\3\2\2\2\u040c\u040d\5\u00acW\2\u040d\u040f\5Z.\2\u040e\u0410\5\u00da"+
		"n\2\u040f\u040e\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0420\3\2\2\2\u0411"+
		"\u0415\5\u00acW\2\u0412\u0414\5\u00c6d\2\u0413\u0412\3\2\2\2\u0414\u0417"+
		"\3\2\2\2\u0415\u0413\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0420\3\2\2\2\u0417"+
		"\u0415\3\2\2\2\u0418\u041c\5\u00a6T\2\u0419\u041b\5\u00c6d\2\u041a\u0419"+
		"\3\2\2\2\u041b\u041e\3\2\2\2\u041c\u041a\3\2\2\2\u041c\u041d\3\2\2\2\u041d"+
		"\u0420\3\2\2\2\u041e\u041c\3\2\2\2\u041f\u040c\3\2\2\2\u041f\u0411\3\2"+
		"\2\2\u041f\u0418\3\2\2\2\u0420\u00a5\3\2\2\2\u0421\u0425\5\36\20\2\u0422"+
		"\u0424\7\36\2\2\u0423\u0422\3\2\2\2\u0424\u0427\3\2\2\2\u0425\u0423\3"+
		"\2\2\2\u0425\u0426\3\2\2\2\u0426\u0429\3\2\2\2\u0427\u0425\3\2\2\2\u0428"+
		"\u0421\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042c\3\2\2\2\u042a\u042c\7d"+
		"\2\2\u042b\u0428\3\2\2\2\u042b\u042a\3\2\2\2\u042c\u042d\3\2\2\2\u042d"+
		"\u0430\7%\2\2\u042e\u0431\5\u00a8U\2\u042f\u0431\7f\2\2\u0430\u042e\3"+
		"\2\2\2\u0430\u042f\3\2\2\2\u0431\u0433\3\2\2\2\u0432\u0434\5\24\13\2\u0433"+
		"\u0432\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u00a7\3\2\2\2\u0435\u043d\7w"+
		"\2\2\u0436\u043d\7O\2\2\u0437\u043d\7\17\2\2\u0438\u043d\7i\2\2\u0439"+
		"\u043d\7l\2\2\u043a\u043d\5\u011c\u008f\2\u043b\u043d\7Q\2\2\u043c\u0435"+
		"\3\2\2\2\u043c\u0436\3\2\2\2\u043c\u0437\3\2\2\2\u043c\u0438\3\2\2\2\u043c"+
		"\u0439\3\2\2\2\u043c\u043a\3\2\2\2\u043c\u043b\3\2\2\2\u043d\u00a9\3\2"+
		"\2\2\u043e\u0448\7\r\2\2\u043f\u0447\7{\2\2\u0440\u0441\7|\2\2\u0441\u0442"+
		"\5\u008aF\2\u0442\u0443\7\t\2\2\u0443\u0447\3\2\2\2\u0444\u0447\7}\2\2"+
		"\u0445\u0447\n\4\2\2\u0446\u043f\3\2\2\2\u0446\u0440\3\2\2\2\u0446\u0444"+
		"\3\2\2\2\u0446\u0445\3\2\2\2\u0447\u044a\3\2\2\2\u0448\u0446\3\2\2\2\u0448"+
		"\u0449\3\2\2\2\u0449\u044b\3\2\2\2\u044a\u0448\3\2\2\2\u044b\u045a\7z"+
		"\2\2\u044c\u0455\7\f\2\2\u044d\u044e\7\u0081\2\2\u044e\u044f\5\u008aF"+
		"\2\u044f\u0450\7\t\2\2\u0450\u0454\3\2\2\2\u0451\u0454\7\u0082\2\2\u0452"+
		"\u0454\n\5\2\2\u0453\u044d\3\2\2\2\u0453\u0451\3\2\2\2\u0453\u0452\3\2"+
		"\2\2\u0454\u0457\3\2\2\2\u0455\u0453\3\2\2\2\u0455\u0456\3\2\2\2\u0456"+
		"\u0458\3\2\2\2\u0457\u0455\3\2\2\2\u0458\u045a\7\177\2\2\u0459\u043e\3"+
		"\2\2\2\u0459\u044c\3\2\2\2\u045a\u00ab\3\2\2\2\u045b\u045c\7\34\2\2\u045c"+
		"\u045d\5\u008aF\2\u045d\u045e\7\35\2\2\u045e\u047b\3\2\2\2\u045f\u047b"+
		"\5\u00aeX\2\u0460\u047b\5\u00ccg\2\u0461\u047b\5\u00e8u\2\u0462\u0464"+
		"\7d\2\2\u0463\u0465\5B\"\2\u0464\u0463\3\2\2\2\u0464\u0465\3\2\2\2\u0465"+
		"\u047b\3\2\2\2\u0466\u046b\7e\2\2\u0467\u0468\7\23\2\2\u0468\u0469\5\32"+
		"\16\2\u0469\u046a\7\25\2\2\u046a\u046c\3\2\2\2\u046b\u0467\3\2\2\2\u046b"+
		"\u046c\3\2\2\2\u046c\u046e\3\2\2\2\u046d\u046f\5B\"\2\u046e\u046d\3\2"+
		"\2\2\u046e\u046f\3\2\2\2\u046f\u047b\3\2\2\2\u0470\u047b\5z>\2\u0471\u047b"+
		"\5\u00d4k\2\u0472\u047b\5|?\2\u0473\u047b\5\u00d2j\2\u0474\u047b\5@!\2"+
		"\u0475\u047b\5\u0082B\2\u0476\u047b\5\u00a8U\2\u0477\u0478\7v\2\2\u0478"+
		"\u047b\5\u00a8U\2\u0479\u047b\7\16\2\2\u047a\u045b\3\2\2\2\u047a\u045f"+
		"\3\2\2\2\u047a\u0460\3\2\2\2\u047a\u0461\3\2\2\2\u047a\u0462\3\2\2\2\u047a"+
		"\u0466\3\2\2\2\u047a\u0470\3\2\2\2\u047a\u0471\3\2\2\2\u047a\u0472\3\2"+
		"\2\2\u047a\u0473\3\2\2\2\u047a\u0474\3\2\2\2\u047a\u0475\3\2\2\2\u047a"+
		"\u0476\3\2\2\2\u047a\u0477\3\2\2\2\u047a\u0479\3\2\2\2\u047b\u00ad\3\2"+
		"\2\2\u047c\u0484\7&\2\2\u047d\u0484\7\'\2\2\u047e\u0484\5\u00aaV\2\u047f"+
		"\u0484\7\6\2\2\u0480\u0484\7\n\2\2\u0481\u0484\7\13\2\2\u0482\u0484\7"+
		"(\2\2\u0483\u047c\3\2\2\2\u0483\u047d\3\2\2\2\u0483\u047e\3\2\2\2\u0483"+
		"\u047f\3\2\2\2\u0483\u0480\3\2\2\2\u0483\u0481\3\2\2\2\u0483\u0482\3\2"+
		"\2\2\u0484\u00af\3\2\2\2\u0485\u048b\5\u00e2r\2\u0486\u048b\5\u00f2z\2"+
		"\u0487\u048b\5\u00dco\2\u0488\u048b\5\u00dep\2\u0489\u048b\5\u00e0q\2"+
		"\u048a\u0485\3\2\2\2\u048a\u0486\3\2\2\2\u048a\u0487\3\2\2\2\u048a\u0488"+
		"\3\2\2\2\u048a\u0489\3\2\2\2\u048b\u00b1\3\2\2\2\u048c\u048f\5\u00b0Y"+
		"\2\u048d\u048f\5\u008aF\2\u048e\u048c\3\2\2\2\u048e\u048d\3\2\2\2\u048f"+
		"\u00b3\3\2\2\2\u0490\u0491\t\6\2\2\u0491\u00b5\3\2\2\2\u0492\u0493\t\7"+
		"\2\2\u0493\u00b7\3\2\2\2\u0494\u0495\t\b\2\2\u0495\u00b9\3\2\2\2\u0496"+
		"\u0497\t\t\2\2\u0497\u00bb\3\2\2\2\u0498\u0499\t\n\2\2\u0499\u00bd\3\2"+
		"\2\2\u049a\u049b\t\13\2\2\u049b\u00bf\3\2\2\2\u049c\u049d\t\f\2\2\u049d"+
		"\u00c1\3\2\2\2\u049e\u049f\t\r\2\2\u049f\u00c3\3\2\2\2\u04a0\u04a8\7-"+
		"\2\2\u04a1\u04a8\7,\2\2\u04a2\u04a8\7:\2\2\u04a3\u04a8\79\2\2\u04a4\u04a8"+
		"\7<\2\2\u04a5\u04a8\5\64\33\2\u04a6\u04a8\5D#\2\u04a7\u04a0\3\2\2\2\u04a7"+
		"\u04a1\3\2\2\2\u04a7\u04a2\3\2\2\2\u04a7\u04a3\3\2\2\2\u04a7\u04a4\3\2"+
		"\2\2\u04a7\u04a5\3\2\2\2\u04a7\u04a6\3\2\2\2\u04a8\u00c5\3\2\2\2\u04a9"+
		"\u04b2\7:\2\2\u04aa\u04b2\79\2\2\u04ab\u04b2\7;\2\2\u04ac\u04b2\5Z.\2"+
		"\u04ad\u04b2\5\u00d0i\2\u04ae\u04af\5\u00caf\2\u04af\u04b0\5\u00a4S\2"+
		"\u04b0\u04b2\3\2\2\2\u04b1\u04a9\3\2\2\2\u04b1\u04aa\3\2\2\2\u04b1\u04ab"+
		"\3\2\2\2\u04b1\u04ac\3\2\2\2\u04b1\u04ad\3\2\2\2\u04b1\u04ae\3\2\2\2\u04b2"+
		"\u00c7\3\2\2\2\u04b3\u04b4\7Y\2\2\u04b4\u04b6\5> \2\u04b5\u04b3\3\2\2"+
		"\2\u04b6\u04b9\3\2\2\2\u04b7\u04b5\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04bb"+
		"\3\2\2\2\u04b9\u04b7\3\2\2\2\u04ba\u04bc\5D#\2\u04bb\u04ba\3\2\2\2\u04bb"+
		"\u04bc\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04be\5\u00ccg\2\u04be\u00c9"+
		"\3\2\2\2\u04bf\u04c5\7\20\2\2\u04c0\u04c2\7\36\2\2\u04c1\u04c3\7\20\2"+
		"\2\u04c2\u04c1\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c5\3\2\2\2\u04c4\u04bf"+
		"\3\2\2\2\u04c4\u04c0\3\2\2\2\u04c5\u00cb\3\2\2\2\u04c6\u04c7\7\b\2\2\u04c7"+
		"\u04c8\5l\67\2\u04c8\u04c9\7\t\2\2\u04c9\u04da\3\2\2\2\u04ca\u04d3\7\b"+
		"\2\2\u04cb\u04d0\5\u00ceh\2\u04cc\u04cd\7\22\2\2\u04cd\u04cf\5\u00ceh"+
		"\2\u04ce\u04cc\3\2\2\2\u04cf\u04d2\3\2\2\2\u04d0\u04ce\3\2\2\2\u04d0\u04d1"+
		"\3\2\2\2\u04d1\u04d4\3\2\2\2\u04d2\u04d0\3\2\2\2\u04d3\u04cb\3\2\2\2\u04d3"+
		"\u04d4\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d6\7)\2\2\u04d6\u04d7\5l\67"+
		"\2\u04d7\u04d8\7\t\2\2\u04d8\u04da\3\2\2\2\u04d9\u04c6\3\2\2\2\u04d9\u04ca"+
		"\3\2\2\2\u04da\u00cd\3\2\2\2\u04db\u04de\7w\2\2\u04dc\u04dd\7\33\2\2\u04dd"+
		"\u04df\5\32\16\2\u04de\u04dc\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u00cf\3"+
		"\2\2\2\u04e0\u04e9\7=\2\2\u04e1\u04e6\5\u008aF\2\u04e2\u04e3\7\22\2\2"+
		"\u04e3\u04e5\5\u008aF\2\u04e4\u04e2\3\2\2\2\u04e5\u04e8\3\2\2\2\u04e6"+
		"\u04e4\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04ea\3\2\2\2\u04e8\u04e6\3\2"+
		"\2\2\u04e9\u04e1\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb"+
		"\u04ec\7>\2\2\u04ec\u00d1\3\2\2\2\u04ed\u04f7\7h\2\2\u04ee\u04ef\7\33"+
		"\2\2\u04ef\u04f4\5`\61\2\u04f0\u04f1\7\22\2\2\u04f1\u04f3\5`\61\2\u04f2"+
		"\u04f0\3\2\2\2\u04f3\u04f6\3\2\2\2\u04f4\u04f2\3\2\2\2\u04f4\u04f5\3\2"+
		"\2\2\u04f5\u04f8\3\2\2\2\u04f6\u04f4\3\2\2\2\u04f7\u04ee\3\2\2\2\u04f7"+
		"\u04f8\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\u04fa\5h\65\2\u04fa\u00d3\3\2"+
		"\2\2\u04fb\u0500\7o\2\2\u04fc\u04fd\7\34\2\2\u04fd\u04fe\5\u008aF\2\u04fe"+
		"\u04ff\7\35\2\2\u04ff\u0501\3\2\2\2\u0500\u04fc\3\2\2\2\u0500\u0501\3"+
		"\2\2\2\u0501\u0502\3\2\2\2\u0502\u0506\7\b\2\2\u0503\u0505\5\u00d6l\2"+
		"\u0504\u0503\3\2\2\2\u0505\u0508\3\2\2\2\u0506\u0504\3\2\2\2\u0506\u0507"+
		"\3\2\2\2\u0507\u0509\3\2\2\2\u0508\u0506\3\2\2\2\u0509\u050a\7\t\2\2\u050a"+
		"\u00d5\3\2\2\2\u050b\u0510\5\u00d8m\2\u050c\u050d\7\22\2\2\u050d\u050f"+
		"\5\u00d8m\2\u050e\u050c\3\2\2\2\u050f\u0512\3\2\2\2\u0510\u050e\3\2\2"+
		"\2\u0510\u0511\3\2\2\2\u0511\u0513\3\2\2\2\u0512\u0510\3\2\2\2\u0513\u0514"+
		"\7)\2\2\u0514\u0518\5\u008aF\2\u0515\u0517\7\7\2\2\u0516\u0515\3\2\2\2"+
		"\u0517\u051a\3\2\2\2\u0518\u0516\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u0525"+
		"\3\2\2\2\u051a\u0518\3\2\2\2\u051b\u051c\7n\2\2\u051c\u051d\7)\2\2\u051d"+
		"\u0521\5\u008aF\2\u051e\u0520\7\7\2\2\u051f\u051e\3\2\2\2\u0520\u0523"+
		"\3\2\2\2\u0521\u051f\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0525\3\2\2\2\u0523"+
		"\u0521\3\2\2\2\u0524\u050b\3\2\2\2\u0524\u051b\3\2\2\2\u0525\u00d7\3\2"+
		"\2\2\u0526\u052c\5\u008aF\2\u0527\u0528\t\b\2\2\u0528\u052c\5\u008aF\2"+
		"\u0529\u052a\t\n\2\2\u052a\u052c\5\32\16\2\u052b\u0526\3\2\2\2\u052b\u0527"+
		"\3\2\2\2\u052b\u0529\3\2\2\2\u052c\u00d9\3\2\2\2\u052d\u052f\7\b\2\2\u052e"+
		"\u0530\7\34\2\2\u052f\u052e\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u0539\3"+
		"\2\2\2\u0531\u0536\5$\23\2\u0532\u0533\7\22\2\2\u0533\u0535\5$\23\2\u0534"+
		"\u0532\3\2\2\2\u0535\u0538\3\2\2\2\u0536\u0534\3\2\2\2\u0536\u0537\3\2"+
		"\2\2\u0537\u053a\3\2\2\2\u0538\u0536\3\2\2\2\u0539\u0531\3\2\2\2\u0539"+
		"\u053a\3\2\2\2\u053a\u053c\3\2\2\2\u053b\u053d\7\35\2\2\u053c\u053b\3"+
		"\2\2\2\u053c\u053d\3\2\2\2\u053d\u053e\3\2\2\2\u053e\u053f\7)\2\2\u053f"+
		"\u0540\5l\67\2\u0540\u0541\7\t\2\2\u0541\u00db\3\2\2\2\u0542\u0543\5."+
		"\30\2\u0543\u0544\7f\2\2\u0544\u0546\7w\2\2\u0545\u0547\5\20\t\2\u0546"+
		"\u0545\3\2\2\2\u0546\u0547\3\2\2\2\u0547\u0549\3\2\2\2\u0548\u054a\5T"+
		"+\2\u0549\u0548\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u0557\3\2\2\2\u054b"+
		"\u054d\7\33\2\2\u054c\u054e\5\64\33\2\u054d\u054c\3\2\2\2\u054d\u054e"+
		"\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0554\5`\61\2\u0550\u0551\7\22\2\2"+
		"\u0551\u0553\5`\61\2\u0552\u0550\3\2\2\2\u0553\u0556\3\2\2\2\u0554\u0552"+
		"\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u0558\3\2\2\2\u0556\u0554\3\2\2\2\u0557"+
		"\u054b\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u0559\3\2\2\2\u0559\u055c\5\26"+
		"\f\2\u055a\u055d\5h\65\2\u055b\u055d\5t;\2\u055c\u055a\3\2\2\2\u055c\u055b"+
		"\3\2\2\2\u055d\u0561\3\2\2\2\u055e\u0560\7\7\2\2\u055f\u055e\3\2\2\2\u0560"+
		"\u0563\3\2\2\2\u0561\u055f\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u00dd\3\2"+
		"\2\2\u0563\u0561\3\2\2\2\u0564\u0566\5\u011e\u0090\2\u0565\u0564\3\2\2"+
		"\2\u0565\u0566\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u0568\7g\2\2\u0568\u056a"+
		"\7w\2\2\u0569\u056b\5\20\t\2\u056a\u0569\3\2\2\2\u056a\u056b\3\2\2\2\u056b"+
		"\u0578\3\2\2\2\u056c\u056e\7\33\2\2\u056d\u056f\5\64\33\2\u056e\u056d"+
		"\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u0575\5\"\22\2"+
		"\u0571\u0572\7\22\2\2\u0572\u0574\5\"\22\2\u0573\u0571\3\2\2\2\u0574\u0577"+
		"\3\2\2\2\u0575\u0573\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u0579\3\2\2\2\u0577"+
		"\u0575\3\2\2\2\u0578\u056c\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u057a\3\2"+
		"\2\2\u057a\u057b\5\26\f\2\u057b\u057f\5h\65\2\u057c\u057e\7\7\2\2\u057d"+
		"\u057c\3\2\2\2\u057e\u0581\3\2\2\2\u057f\u057d\3\2\2\2\u057f\u0580\3\2"+
		"\2\2\u0580\u00df\3\2\2\2\u0581\u057f\3\2\2\2\u0582\u0584\5\u011e\u0090"+
		"\2\u0583\u0582\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0585\3\2\2\2\u0585\u0586"+
		"\7h\2\2\u0586\u0588\7w\2\2\u0587\u0589\5b\62\2\u0588\u0587\3\2\2\2\u0588"+
		"\u0589\3\2\2\2\u0589\u058a\3\2\2\2\u058a\u058e\5h\65\2\u058b\u058d\7\7"+
		"\2\2\u058c\u058b\3\2\2\2\u058d\u0590\3\2\2\2\u058e\u058c\3\2\2\2\u058e"+
		"\u058f\3\2\2\2\u058f\u00e1\3\2\2\2\u0590\u058e\3\2\2\2\u0591\u0594\5\u00e4"+
		"s\2\u0592\u0594\5\u00e6t\2\u0593\u0591\3\2\2\2\u0593\u0592\3\2\2\2\u0594"+
		"\u00e3\3\2\2\2\u0595\u0596\5\u00ecw\2\u0596\u0598\7j\2\2\u0597\u0599\5"+
		"\20\t\2\u0598\u0597\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u059a\3\2\2\2\u059a"+
		"\u059b\5\32\16\2\u059b\u059c\7\20\2\2\u059c\u059d\5\u00eex\2\u059d\u059f"+
		"\5\u00eav\2\u059e\u05a0\5\u00f0y\2\u059f\u059e\3\2\2\2\u059f\u05a0\3\2"+
		"\2\2\u05a0\u05a1\3\2\2\2\u05a1\u05a3\5\26\f\2\u05a2\u05a4\5n8\2\u05a3"+
		"\u05a2\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u05a8\3\2\2\2\u05a5\u05a7\7\7"+
		"\2\2\u05a6\u05a5\3\2\2\2\u05a7\u05aa\3\2\2\2\u05a8\u05a6\3\2\2\2\u05a8"+
		"\u05a9\3\2\2\2\u05a9\u00e5\3\2\2\2\u05aa\u05a8\3\2\2\2\u05ab\u05ac\5\u00ec"+
		"w\2\u05ac\u05ae\7j\2\2\u05ad\u05af\5\20\t\2\u05ae\u05ad\3\2\2\2\u05ae"+
		"\u05af\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05b1\5\u00eex\2\u05b1\u05b3"+
		"\5\u00eav\2\u05b2\u05b4\5\u00f0y\2\u05b3\u05b2\3\2\2\2\u05b3\u05b4\3\2"+
		"\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b7\5\26\f\2\u05b6\u05b8\5n8\2\u05b7"+
		"\u05b6\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05bc\3\2\2\2\u05b9\u05bb\7\7"+
		"\2\2\u05ba\u05b9\3\2\2\2\u05bb\u05be\3\2\2\2\u05bc\u05ba\3\2\2\2\u05bc"+
		"\u05bd\3\2\2\2\u05bd\u00e7\3\2\2\2\u05be\u05bc\3\2\2\2\u05bf\u05c1\7j"+
		"\2\2\u05c0\u05c2\5\20\t\2\u05c1\u05c0\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2"+
		"\u05c3\3\2\2\2\u05c3\u05c5\5\u00eav\2\u05c4\u05c6\5\u00f0y\2\u05c5\u05c4"+
		"\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c9\5\26\f\2"+
		"\u05c8\u05ca\5n8\2\u05c9\u05c8\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca\u05ce"+
		"\3\2\2\2\u05cb\u05cd\7\7\2\2\u05cc\u05cb\3\2\2\2\u05cd\u05d0\3\2\2\2\u05ce"+
		"\u05cc\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u00e9\3\2\2\2\u05d0\u05ce\3\2"+
		"\2\2\u05d1\u05da\7\34\2\2\u05d2\u05d7\5H%\2\u05d3\u05d4\7\22\2\2\u05d4"+
		"\u05d6\5H%\2\u05d5\u05d3\3\2\2\2\u05d6\u05d9\3\2\2\2\u05d7\u05d5\3\2\2"+
		"\2\u05d7\u05d8\3\2\2\2\u05d8\u05db\3\2\2\2\u05d9\u05d7\3\2\2\2\u05da\u05d2"+
		"\3\2\2\2\u05da\u05db\3\2\2\2\u05db\u05dc\3\2\2\2\u05dc\u05dd\7\35\2\2"+
		"\u05dd\u00eb\3\2\2\2\u05de\u05e0\5\u0112\u008a\2\u05df\u05de\3\2\2\2\u05df"+
		"\u05e0\3\2\2\2\u05e0\u05e2\3\2\2\2\u05e1\u05e3\5\64\33\2\u05e2\u05e1\3"+
		"\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05eb\3\2\2\2\u05e4\u05e6\5\64\33\2\u05e5"+
		"\u05e4\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05e8\3\2\2\2\u05e7\u05e9\5\u0112"+
		"\u008a\2\u05e8\u05e7\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9\u05eb\3\2\2\2\u05ea"+
		"\u05df\3\2\2\2\u05ea\u05e5\3\2\2\2\u05eb\u00ed\3\2\2\2\u05ec\u05f1\7w"+
		"\2\2\u05ed\u05f1\5\u0112\u008a\2\u05ee\u05f1\7l\2\2\u05ef\u05f1\7Q\2\2"+
		"\u05f0\u05ec\3\2\2\2\u05f0\u05ed\3\2\2\2\u05f0\u05ee\3\2\2\2\u05f0\u05ef"+
		"\3\2\2\2\u05f1\u00ef\3\2\2\2\u05f2\u05f3\7\33\2\2\u05f3\u05f4\5\32\16"+
		"\2\u05f4\u00f1\3\2\2\2\u05f5\u05f9\5\u00f4{\2\u05f6\u05f9\5\u00f6|\2\u05f7"+
		"\u05f9\5\u00f8}\2\u05f8\u05f5\3\2\2\2\u05f8\u05f6\3\2\2\2\u05f8\u05f7"+
		"\3\2\2\2\u05f9\u00f3\3\2\2\2\u05fa\u05fc\5\u0114\u008b\2\u05fb\u05fa\3"+
		"\2\2\2\u05fb\u05fc\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u0602\7?\2\2\u05fe"+
		"\u0603\5\u00fa~\2\u05ff\u0603\5\u00fc\177\2\u0600\u0603\5\u0104\u0083"+
		"\2\u0601\u0603\5\u0102\u0082\2\u0602\u05fe\3\2\2\2\u0602\u05ff\3\2\2\2"+
		"\u0602\u0600\3\2\2\2\u0602\u0601\3\2\2\2\u0603\u00f5\3\2\2\2\u0604\u0605"+
		"\5\u0112\u008a\2\u0605\u060a\7@\2\2\u0606\u060b\5\u00fa~\2\u0607\u060b"+
		"\5\u0100\u0081\2\u0608\u060b\5\u0104\u0083\2\u0609\u060b\5\u0106\u0084"+
		"\2\u060a\u0606\3\2\2\2\u060a\u0607\3\2\2\2\u060a\u0608\3\2\2\2\u060a\u0609"+
		"\3\2\2\2\u060b\u00f7\3\2\2\2\u060c\u060e\5\u0112\u008a\2\u060d\u060c\3"+
		"\2\2\2\u060d\u060e\3\2\2\2\u060e\u060f\3\2\2\2\u060f\u0610\7A\2\2\u0610"+
		"\u0614\5$\23\2\u0611\u0613\7\7\2\2\u0612\u0611\3\2\2\2\u0613\u0616\3\2"+
		"\2\2\u0614\u0612\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u00f9\3\2\2\2\u0616"+
		"\u0614\3\2\2\2\u0617\u0619\5\20\t\2\u0618\u0617\3\2\2\2\u0618\u0619\3"+
		"\2\2\2\u0619\u061a\3\2\2\2\u061a\u061b\5\32\16\2\u061b\u061c\7\20\2\2"+
		"\u061c\u061d\5\u0104\u0083\2\u061d\u00fb\3\2\2\2\u061e\u0620\5\20\t\2"+
		"\u061f\u061e\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u0622"+
		"\5\32\16\2\u0622\u0623\7\20\2\2\u0623\u0625\5\u00fe\u0080\2\u0624\u0626"+
		"\5\u010e\u0088\2\u0625\u0624\3\2\2\2\u0625\u0626\3\2\2\2\u0626\u062a\3"+
		"\2\2\2\u0627\u0629\7\7\2\2\u0628\u0627\3\2\2\2\u0629\u062c\3\2\2\2\u062a"+
		"\u0628\3\2\2\2\u062a\u062b\3\2\2\2\u062b\u00fd\3\2\2\2\u062c\u062a\3\2"+
		"\2\2\u062d\u062e\7\33\2\2\u062e\u0630\5\32\16\2\u062f\u062d\3\2\2\2\u062f"+
		"\u0630\3\2\2\2\u0630\u00ff\3\2\2\2\u0631\u0633\5\20\t\2\u0632\u0631\3"+
		"\2\2\2\u0632\u0633\3\2\2\2\u0633\u0634\3\2\2\2\u0634\u0635\5\32\16\2\u0635"+
		"\u0636\7\20\2\2\u0636\u0637\5$\23\2\u0637\u063b\5\u00fe\u0080\2\u0638"+
		"\u063a\7\7\2\2\u0639\u0638\3\2\2\2\u063a\u063d\3\2\2\2\u063b\u0639\3\2"+
		"\2\2\u063b\u063c\3\2\2\2\u063c\u0644\3\2\2\2\u063d\u063b\3\2\2\2\u063e"+
		"\u063f\5\u010e\u0088\2\u063f\u0640\5\u0110\u0089\2\u0640\u0645\3\2\2\2"+
		"\u0641\u0642\5\u0110\u0089\2\u0642\u0643\5\u010e\u0088\2\u0643\u0645\3"+
		"\2\2\2\u0644\u063e\3\2\2\2\u0644\u0641\3\2\2\2\u0645\u0649\3\2\2\2\u0646"+
		"\u0648\7\7\2\2\u0647\u0646\3\2\2\2\u0648\u064b\3\2\2\2\u0649\u0647\3\2"+
		"\2\2\u0649\u064a\3\2\2\2\u064a\u0101\3\2\2\2\u064b\u0649\3\2\2\2\u064c"+
		"\u064f\5,\27\2\u064d\u064f\5$\23\2\u064e\u064c\3\2\2\2\u064e\u064d\3\2"+
		"\2\2\u064f\u0650\3\2\2\2\u0650\u0651\5\26\f\2\u0651\u0653\5\u010a\u0086"+
		"\2\u0652\u0654\5\u010e\u0088\2\u0653\u0652\3\2\2\2\u0653\u0654\3\2\2\2"+
		"\u0654\u0658\3\2\2\2\u0655\u0657\7\7\2\2\u0656\u0655\3\2\2\2\u0657\u065a"+
		"\3\2\2\2\u0658\u0656\3\2\2\2\u0658\u0659\3\2\2\2\u0659\u0103\3\2\2\2\u065a"+
		"\u0658\3\2\2\2\u065b\u065c\5$\23\2\u065c\u065d\5\26\f\2\u065d\u065e\5"+
		"\u0108\u0085\2\u065e\u0105\3\2\2\2\u065f\u0662\5,\27\2\u0660\u0662\5$"+
		"\23\2\u0661\u065f\3\2\2\2\u0661\u0660\3\2\2\2\u0662\u0663\3\2\2\2\u0663"+
		"\u0664\5\26\f\2\u0664\u0668\5\u010a\u0086\2\u0665\u0667\7\7\2\2\u0666"+
		"\u0665\3\2\2\2\u0667\u066a\3\2\2\2\u0668\u0666\3\2\2\2\u0668\u0669\3\2"+
		"\2\2\u0669\u0671\3\2\2\2\u066a\u0668\3\2\2\2\u066b\u066c\5\u010e\u0088"+
		"\2\u066c\u066d\5\u0110\u0089\2\u066d\u0672\3\2\2\2\u066e\u066f\5\u0110"+
		"\u0089\2\u066f\u0670\5\u010e\u0088\2\u0670\u0672\3\2\2\2\u0671\u066b\3"+
		"\2\2\2\u0671\u066e\3\2\2\2\u0672\u0676\3\2\2\2\u0673\u0675\7\7\2\2\u0674"+
		"\u0673\3\2\2\2\u0675\u0678\3\2\2\2\u0676\u0674\3\2\2\2\u0676\u0677\3\2"+
		"\2\2\u0677\u0107\3\2\2\2\u0678\u0676\3\2\2\2\u0679\u067a\7C\2\2\u067a"+
		"\u067e\5\u008aF\2\u067b\u067d\7\7\2\2\u067c\u067b\3\2\2\2\u067d\u0680"+
		"\3\2\2\2\u067e\u067c\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u0109\3\2\2\2\u0680"+
		"\u067e\3\2\2\2\u0681\u0682\7\27\2\2\u0682\u0686\5\u008aF\2\u0683\u0685"+
		"\7\7\2\2\u0684\u0683\3\2\2\2\u0685\u0688\3\2\2\2\u0686\u0684\3\2\2\2\u0686"+
		"\u0687\3\2\2\2\u0687\u010b\3\2\2\2\u0688\u0686\3\2\2\2\u0689\u068b\5\u010e"+
		"\u0088\2\u068a\u0689\3\2\2\2\u068a\u068b\3\2\2\2\u068b\u068d\3\2\2\2\u068c"+
		"\u068e\5\u0110\u0089\2\u068d\u068c\3\2\2\2\u068d\u068e\3\2\2\2\u068e\u0696"+
		"\3\2\2\2\u068f\u0691\5\u0110\u0089\2\u0690\u068f\3\2\2\2\u0690\u0691\3"+
		"\2\2\2\u0691\u0693\3\2\2\2\u0692\u0694\5\u010e\u0088\2\u0693\u0692\3\2"+
		"\2\2\u0693\u0694\3\2\2\2\u0694\u0696\3\2\2\2\u0695\u068a\3\2\2\2\u0695"+
		"\u0690\3\2\2\2\u0696\u069a\3\2\2\2\u0697\u0699\7\7\2\2\u0698\u0697\3\2"+
		"\2\2\u0699\u069c\3\2\2\2\u069a\u0698\3\2\2\2\u069a\u069b\3\2\2\2\u069b"+
		"\u010d\3\2\2\2\u069c\u069a\3\2\2\2\u069d\u069e\5.\30\2\u069e\u069f\7F"+
		"\2\2\u069f\u06ab\3\2\2\2\u06a0\u06a1\5.\30\2\u06a1\u06a2\7F\2\2\u06a2"+
		"\u06a3\7\34\2\2\u06a3\u06a6\7\35\2\2\u06a4\u06a5\7\33\2\2\u06a5\u06a7"+
		"\5\32\16\2\u06a6\u06a4\3\2\2\2\u06a6\u06a7\3\2\2\2\u06a7\u06a8\3\2\2\2"+
		"\u06a8\u06a9\5n8\2\u06a9\u06ab\3\2\2\2\u06aa\u069d\3\2\2\2\u06aa\u06a0"+
		"\3\2\2\2\u06ab\u010f\3\2\2\2\u06ac\u06ad\5.\30\2\u06ad\u06ae\7G\2\2\u06ae"+
		"\u06bb\3\2\2\2\u06af\u06b0\5.\30\2\u06b0\u06b1\7G\2\2\u06b1\u06b2\7\34"+
		"\2\2\u06b2\u06b5\5.\30\2\u06b3\u06b6\7w\2\2\u06b4\u06b6\5F$\2\u06b5\u06b3"+
		"\3\2\2\2\u06b5\u06b4\3\2\2\2\u06b6\u06b7\3\2\2\2\u06b7\u06b8\7\35\2\2"+
		"\u06b8\u06b9\5n8\2\u06b9\u06bb\3\2\2\2\u06ba\u06ac\3\2\2\2\u06ba\u06af"+
		"\3\2\2\2\u06bb\u0111\3\2\2\2\u06bc\u06bd\t\16\2\2\u06bd\u0113\3\2\2\2"+
		"\u06be\u06bf\t\16\2\2\u06bf\u0115\3\2\2\2\u06c0\u06c1\t\17\2\2\u06c1\u0117"+
		"\3\2\2\2\u06c2\u06c3\t\20\2\2\u06c3\u0119\3\2\2\2\u06c4\u06c5\t\21\2\2"+
		"\u06c5\u011b\3\2\2\2\u06c6\u06c7\t\22\2\2\u06c7\u011d\3\2\2\2\u06c8\u06c9"+
		"\t\23\2\2\u06c9\u011f\3\2\2\2\u06ca\u06cb\t\24\2\2\u06cb\u0121\3\2\2\2"+
		"\u00ea\u0126\u012a\u012f\u0138\u013e\u0147\u014e\u0153\u015c\u0166\u0169"+
		"\u0171\u017a\u017e\u0184\u018f\u0192\u0195\u019c\u01a4\u01a7\u01ab\u01af"+
		"\u01b2\u01b6\u01b9\u01bb\u01bf\u01c6\u01cd\u01d6\u01db\u01e0\u01e6\u01f1"+
		"\u01f4\u0200\u0208\u0214\u0219\u021f\u0228\u022b\u0235\u0238\u0241\u0245"+
		"\u0248\u024e\u0251\u0255\u0259\u025b\u0262\u026d\u0278\u027c\u0285\u0288"+
		"\u0290\u0293\u0298\u02a1\u02a4\u02aa\u02ad\u02b2\u02b9\u02bc\u02c0\u02c6"+
		"\u02ca\u02d5\u02dd\u02e8\u02ef\u02f5\u02fc\u0301\u0307\u030e\u0314\u0317"+
		"\u031c\u0322\u032d\u0334\u033a\u033e\u0345\u0349\u0355\u035a\u0361\u0365"+
		"\u036a\u0378\u037d\u0381\u039b\u03a3\u03ab\u03b4\u03bd\u03c6\u03cd\u03cf"+
		"\u03d6\u03de\u03e6\u03ef\u03f8\u0401\u0407\u040f\u0415\u041c\u041f\u0425"+
		"\u0428\u042b\u0430\u0433\u043c\u0446\u0448\u0453\u0455\u0459\u0464\u046b"+
		"\u046e\u047a\u0483\u048a\u048e\u04a7\u04b1\u04b7\u04bb\u04c2\u04c4\u04d0"+
		"\u04d3\u04d9\u04de\u04e6\u04e9\u04f4\u04f7\u0500\u0506\u0510\u0518\u0521"+
		"\u0524\u052b\u052f\u0536\u0539\u053c\u0546\u0549\u054d\u0554\u0557\u055c"+
		"\u0561\u0565\u056a\u056e\u0575\u0578\u057f\u0583\u0588\u058e\u0593\u0598"+
		"\u059f\u05a3\u05a8\u05ae\u05b3\u05b7\u05bc\u05c1\u05c5\u05c9\u05ce\u05d7"+
		"\u05da\u05df\u05e2\u05e5\u05e8\u05ea\u05f0\u05f8\u05fb\u0602\u060a\u060d"+
		"\u0614\u0618\u061f\u0625\u062a\u062f\u0632\u063b\u0644\u0649\u064e\u0653"+
		"\u0658\u0661\u0668\u0671\u0676\u067e\u0686\u068a\u068d\u0690\u0693\u0695"+
		"\u069a\u06a6\u06aa\u06b5\u06ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}