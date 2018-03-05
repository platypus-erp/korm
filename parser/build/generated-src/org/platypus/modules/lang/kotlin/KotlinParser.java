// Generated from /home/apasquier/WorkSpace/Kotlin/platypus/parser/src/main/antlr/KotlinParser.g4 by ANTLR 4.2.2
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
		"'var'", "'vararg'", "'by'", "'dynamic'", "'where'", "'get'", "'fieldSet'",
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
		RULE_multipleVariableDeclarations = 21, RULE_propertyDeclaration = 22, 
		RULE_getter = 23, RULE_setter = 24, RULE_modifiers = 25, RULE_modifier = 26, 
		RULE_modifierKeyword = 27, RULE_hierarchyModifier = 28, RULE_classModifier = 29, 
		RULE_keyWordModifier = 30, RULE_accessModifier = 31, RULE_varianceAnnotation = 32, 
		RULE_annotations = 33, RULE_annotation = 34, RULE_annotationUseSiteTarget = 35, 
		RULE_valueArgument = 36, RULE_valueArguments = 37, RULE_unescapedAnnotation = 38, 
		RULE_jump = 39, RULE_labelReference = 40, RULE_labelDefinition = 41, RULE_parameter = 42, 
		RULE_functionParameter = 43, RULE_funcParameterWithoutDefault = 44, RULE_funcParameterWithDefault = 45, 
		RULE_constructorParameter = 46, RULE_constructorParameterWithoutDefault = 47, 
		RULE_constructorParameterWithDefault = 48, RULE_primaryConstructor = 49, 
		RULE_secondaryConstructor = 50, RULE_constructorDelegationCall = 51, RULE_callSuffix = 52, 
		RULE_constructorInvocation = 53, RULE_explicitDelegation = 54, RULE_delegationSpecifier = 55, 
		RULE_classDeclaration = 56, RULE_supertypesSpecifiers = 57, RULE_objectDeclaration = 58, 
		RULE_typealiasDeclaration = 59, RULE_companionObject = 60, RULE_classBody = 61, 
		RULE_members = 62, RULE_valueParameters = 63, RULE_functionDeclaration = 64, 
		RULE_statements = 65, RULE_functionBody = 66, RULE_block = 67, RULE_anonymousInitializer = 68, 
		RULE_enumClassBody = 69, RULE_enumEntries = 70, RULE_enumEntry = 71, RULE_ifExpression = 72, 
		RULE_tryExpression = 73, RULE_catchBlock = 74, RULE_finallyBlock = 75, 
		RULE_loop = 76, RULE_forLoop = 77, RULE_whileLoop = 78, RULE_doWhileLoop = 79, 
		RULE_expression = 80, RULE_disjunction = 81, RULE_conjunction = 82, RULE_equalityComparison = 83, 
		RULE_comparison = 84, RULE_namedInfix = 85, RULE_elvisExpression = 86, 
		RULE_infixFunctionCall = 87, RULE_rangeExpression = 88, RULE_additiveExpression = 89, 
		RULE_multiplicativeExpression = 90, RULE_typeRHS = 91, RULE_prefixUnaryExpression = 92, 
		RULE_postfixUnaryExpression = 93, RULE_callableReference = 94, RULE_identifier = 95, 
		RULE_stringLiteral = 96, RULE_atomicExpression = 97, RULE_literalConstant = 98, 
		RULE_declaration = 99, RULE_statement = 100, RULE_multiplicativeOperation = 101, 
		RULE_additiveOperation = 102, RULE_inOperation = 103, RULE_typeOperation = 104, 
		RULE_isOperation = 105, RULE_comparisonOperation = 106, RULE_equalityOperation = 107, 
		RULE_assignmentOperator = 108, RULE_prefixUnaryOperation = 109, RULE_postfixUnaryOperation = 110, 
		RULE_annotatedLambda = 111, RULE_memberAccessOperation = 112, RULE_functionLiteral = 113, 
		RULE_functionLiteralparameter = 114, RULE_arrayAccess = 115, RULE_objectLiteral = 116, 
		RULE_when = 117, RULE_whenEntry = 118, RULE_whenCondition = 119, RULE_lastArgLambda = 120;
	public static final String[] ruleNames = {
		"kotlinFile", "preamble", "packageHeader", "importHeader", "toplevelObject", 
		"memberDeclaration", "optionalProjection", "typeParameters", "typeParameter", 
		"typeArguments", "typeConstraints", "typeConstraint", "type", "typeDescriptor", 
		"userType", "simpleUserType_typeParam", "simpleUserType", "variableDeclarationEntry", 
		"functionType_paramOrType", "extensionFunctionTypeNoReceiver", "functionTypeNoReceiver", 
		"multipleVariableDeclarations", "propertyDeclaration", "getter", "setter", 
		"modifiers", "modifier", "modifierKeyword", "hierarchyModifier", "classModifier", 
		"keyWordModifier", "accessModifier", "varianceAnnotation", "annotations", 
		"annotation", "annotationUseSiteTarget", "valueArgument", "valueArguments", 
		"unescapedAnnotation", "jump", "labelReference", "labelDefinition", "parameter", 
		"functionParameter", "funcParameterWithoutDefault", "funcParameterWithDefault", 
		"constructorParameter", "constructorParameterWithoutDefault", "constructorParameterWithDefault", 
		"primaryConstructor", "secondaryConstructor", "constructorDelegationCall", 
		"callSuffix", "constructorInvocation", "explicitDelegation", "delegationSpecifier", 
		"classDeclaration", "supertypesSpecifiers", "objectDeclaration", "typealiasDeclaration", 
		"companionObject", "classBody", "members", "valueParameters", "functionDeclaration", 
		"statements", "functionBody", "block", "anonymousInitializer", "enumClassBody", 
		"enumEntries", "enumEntry", "ifExpression", "tryExpression", "catchBlock", 
		"finallyBlock", "loop", "forLoop", "whileLoop", "doWhileLoop", "expression", 
		"disjunction", "conjunction", "equalityComparison", "comparison", "namedInfix", 
		"elvisExpression", "infixFunctionCall", "rangeExpression", "additiveExpression", 
		"multiplicativeExpression", "typeRHS", "prefixUnaryExpression", "postfixUnaryExpression", 
		"callableReference", "identifier", "stringLiteral", "atomicExpression", 
		"literalConstant", "declaration", "statement", "multiplicativeOperation", 
		"additiveOperation", "inOperation", "typeOperation", "isOperation", "comparisonOperation", 
		"equalityOperation", "assignmentOperator", "prefixUnaryOperation", "postfixUnaryOperation", 
		"annotatedLambda", "memberAccessOperation", "functionLiteral", "functionLiteralparameter", 
		"arrayAccess", "objectLiteral", "when", "whenEntry", "whenCondition", 
		"lastArgLambda"
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
			setState(242); preamble();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (OP_IN - 44)) | (1L << (KEYWORD_val - 44)) | (1L << (KEYWORD_var - 44)) | (1L << (KEYWORD_vararg - 44)) | (1L << (HierarchyModifier_abstract - 44)) | (1L << (HierarchyModifier_open - 44)) | (1L << (HierarchyModifier_final - 44)) | (1L << (HierarchyModifier_override - 44)) | (1L << (KeyWordModifier_operator - 44)) | (1L << (KeyWordModifier_infix - 44)) | (1L << (KeyWordModifier_inline - 44)) | (1L << (ClassModifier_enum - 44)) | (1L << (ClassModifier_annotation - 44)) | (1L << (ClassModifier_data - 44)) | (1L << (ClassModifier_sealed - 44)) | (1L << (AccessModifier_private - 44)) | (1L << (AccessModifier_protected - 44)) | (1L << (AccessModifier_public - 44)) | (1L << (AccessModifier_internal - 44)) | (1L << (Modifier_const - 44)) | (1L << (VarianceAnnotation_out - 44)) | (1L << (DOG - 44)) | (1L << (Declaration_class - 44)) | (1L << (Declaration_interface - 44)) | (1L << (Declaration_object - 44)) | (1L << (Declaration_fun - 44)) | (1L << (Declaration_typealias - 44)))) != 0)) {
				{
				{
				setState(243); toplevelObject();
				}
				}
				setState(248);
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
			setState(250);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(249); packageHeader();
				}
			}

			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(252); importHeader();
				}
				}
				setState(257);
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
			setState(258); match(PACKAGE);
			setState(259); identifier();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(260); match(DOT);
				setState(261); identifier();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(267); match(SEMI);
				}
				}
				setState(272);
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
			setState(273); match(IMPORT);
			setState(274); identifier();
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(275); match(DOT);
					setState(276); identifier();
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(286);
			switch (_input.LA(1)) {
			case DOT:
				{
				setState(282); match(DOT);
				setState(283); match(STAR);
				}
				break;
			case OP_AS:
				{
				setState(284); match(OP_AS);
				setState(285); match(SimpleName);
				}
				break;
			case EOF:
			case SEMI:
			case IMPORT:
			case OP_IN:
			case KEYWORD_val:
			case KEYWORD_var:
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
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(288); match(SEMI);
				}
				}
				setState(293);
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
			setState(299);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294); propertyDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295); functionDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296); classDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(297); objectDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(298); typealiasDeclaration();
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
			setState(308);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301); companionObject();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302); objectDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(303); functionDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(304); propertyDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(305); classDeclaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(306); anonymousInitializer();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(307); secondaryConstructor();
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
			setState(311);
			_la = _input.LA(1);
			if (_la==OP_IN || _la==VarianceAnnotation_out) {
				{
				setState(310); varianceAnnotation();
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
			setState(313); match(LT);
			setState(314); typeParameter();
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(315); match(COMMA);
				setState(316); typeParameter();
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(322); match(GT);
			}
		}
		catch (RecognitionException re) {
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
			setState(324); modifiers();
			setState(325); match(SimpleName);
			setState(328);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(326); match(COLON);
				setState(327); userType();
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
			setState(330); match(LT);
			{
			setState(332);
			_la = _input.LA(1);
			if (_la==PACKAGE || _la==BRACE_OPEN || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (KEYWORD_dynamic - 65)) | (1L << (DOG - 65)) | (1L << (SimpleName - 65)))) != 0)) {
				{
				setState(331); type();
				}
			}

			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(334); match(COMMA);
				setState(335); type();
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(341); match(GT);
			}
		}
		catch (RecognitionException re) {
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_la = _input.LA(1);
			if (_la==KEYWORD_where) {
				{
				setState(343); match(KEYWORD_where);
				setState(344); typeConstraint();
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(345); match(COMMA);
					setState(346); typeConstraint();
					}
					}
					setState(351);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
			setState(355);
			_la = _input.LA(1);
			if (_la==DOG) {
				{
				setState(354); annotations();
				}
			}

			setState(357); match(SimpleName);
			setState(358); match(COLON);
			setState(359); type();
			}
		}
		catch (RecognitionException re) {
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
			setState(362);
			_la = _input.LA(1);
			if (_la==DOG) {
				{
				setState(361); annotations();
				}
			}

			setState(364); typeDescriptor();
			}
		}
		catch (RecognitionException re) {
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
			setState(393);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(366); match(BRACE_OPEN);
				setState(367); typeDescriptor();
				setState(368); match(BRACE_CLOSE);
				setState(370);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(369); match(Q);
					}
					break;
				}
				setState(373);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(372); extensionFunctionTypeNoReceiver();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375); functionTypeNoReceiver();
				setState(377);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(376); extensionFunctionTypeNoReceiver();
					}
					break;
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(379); userType();
				setState(381);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(380); match(Q);
					}
					break;
				}
				setState(384);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(383); extensionFunctionTypeNoReceiver();
					}
					break;
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(386); match(KEYWORD_dynamic);
				setState(388);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(387); match(Q);
					}
					break;
				}
				setState(391);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(390); extensionFunctionTypeNoReceiver();
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
			setState(397);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(395); match(PACKAGE);
				setState(396); match(DOT);
				}
			}

			setState(399); simpleUserType();
			setState(404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(400); match(DOT);
					setState(401); simpleUserType();
					}
					} 
				}
				setState(406);
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
			setState(411);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(407); match(STAR);
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
				setState(408); optionalProjection();
				setState(409); type();
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
			setState(413); match(SimpleName);
			setState(425);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(414); match(LT);
				setState(415); simpleUserType_typeParam();
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(416); match(COMMA);
					setState(417); simpleUserType_typeParam();
					}
					}
					setState(422);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(423); match(GT);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427); match(SimpleName);
			setState(430);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(428); match(COLON);
				setState(429); type();
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
			setState(436);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432); parameter();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(433); modifiers();
				setState(434); type();
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
			setState(438); match(DOT);
			setState(439); functionTypeNoReceiver();
			}
		}
		catch (RecognitionException re) {
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
			setState(441); match(BRACE_OPEN);
			setState(450);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PACKAGE) | (1L << BRACE_OPEN) | (1L << OP_IN) | (1L << KEYWORD_vararg))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (KEYWORD_dynamic - 65)) | (1L << (HierarchyModifier_abstract - 65)) | (1L << (HierarchyModifier_open - 65)) | (1L << (HierarchyModifier_final - 65)) | (1L << (HierarchyModifier_override - 65)) | (1L << (KeyWordModifier_operator - 65)) | (1L << (KeyWordModifier_infix - 65)) | (1L << (KeyWordModifier_inline - 65)) | (1L << (ClassModifier_enum - 65)) | (1L << (ClassModifier_annotation - 65)) | (1L << (ClassModifier_data - 65)) | (1L << (ClassModifier_sealed - 65)) | (1L << (AccessModifier_private - 65)) | (1L << (AccessModifier_protected - 65)) | (1L << (AccessModifier_public - 65)) | (1L << (AccessModifier_internal - 65)) | (1L << (Modifier_const - 65)) | (1L << (VarianceAnnotation_out - 65)) | (1L << (DOG - 65)) | (1L << (SimpleName - 65)))) != 0)) {
				{
				setState(442); functionType_paramOrType();
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(443); match(COMMA);
					setState(444); functionType_paramOrType();
					}
					}
					setState(449);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(452); match(BRACE_CLOSE);
			setState(453); match(OP_ASTERISK);
			setState(454); type();
			}
		}
		catch (RecognitionException re) {
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
			setState(456); match(BRACE_OPEN);
			setState(457); variableDeclarationEntry();
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(458); match(COMMA);
				setState(459); variableDeclarationEntry();
				}
				}
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(465); match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
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
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public MultipleVariableDeclarationsContext multipleVariableDeclarations() {
			return getRuleContext(MultipleVariableDeclarationsContext.class,0);
		}
		public VariableDeclarationEntryContext variableDeclarationEntry() {
			return getRuleContext(VariableDeclarationEntryContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(KotlinParser.SEMI); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode SEMI(int i) {
			return getToken(KotlinParser.SEMI, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public TypeConstraintsContext typeConstraints() {
			return getRuleContext(TypeConstraintsContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
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
		enterRule(_localctx, 44, RULE_propertyDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(467); modifiers();
			setState(468);
			_la = _input.LA(1);
			if ( !(_la==KEYWORD_val || _la==KEYWORD_var) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(470);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(469); typeParameters();
				}
			}

			setState(475);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(472); type();
				setState(473); match(DOT);
				}
				break;
			}
			setState(479);
			switch (_input.LA(1)) {
			case BRACE_OPEN:
				{
				setState(477); multipleVariableDeclarations();
				}
				break;
			case SimpleName:
				{
				setState(478); variableDeclarationEntry();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(481); typeConstraints();
			setState(490);
			_la = _input.LA(1);
			if (_la==EQ || _la==KEYWORD_by) {
				{
				setState(482);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==KEYWORD_by) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(483); expression();
				setState(487);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(484); match(SEMI);
						}
						} 
					}
					setState(489);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				}
			}

			setState(504);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				{
				setState(493);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(492); getter();
					}
					break;
				}
				setState(496);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(495); setter();
					}
					break;
				}
				}
				}
				break;

			case 2:
				{
				{
				setState(499);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(498); setter();
					}
					break;
				}
				setState(502);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(501); getter();
					}
					break;
				}
				}
				}
				break;
			}
			setState(509);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(506); match(SEMI);
					}
					} 
				}
				setState(511);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
		enterRule(_localctx, 46, RULE_getter);
		int _la;
		try {
			setState(525);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(512); modifiers();
				setState(513); match(GET);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(515); modifiers();
				setState(516); match(GET);
				setState(517); match(BRACE_OPEN);
				setState(518); match(BRACE_CLOSE);
				setState(521);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(519); match(COLON);
					setState(520); type();
					}
				}

				setState(523); functionBody();
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
		enterRule(_localctx, 48, RULE_setter);
		try {
			setState(541);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(527); modifiers();
				setState(528); match(SET);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(530); modifiers();
				setState(531); match(SET);
				setState(532); match(BRACE_OPEN);
				setState(533); modifiers();
				setState(536);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(534); match(SimpleName);
					}
					break;

				case 2:
					{
					setState(535); parameter();
					}
					break;
				}
				setState(538); match(BRACE_CLOSE);
				setState(539); functionBody();
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
		enterRule(_localctx, 50, RULE_modifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(543); modifier();
					}
					} 
				}
				setState(548);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		enterRule(_localctx, 52, RULE_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549); modifierKeyword();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 54, RULE_modifierKeyword);
		try {
			setState(558);
			switch (_input.LA(1)) {
			case HierarchyModifier_abstract:
			case HierarchyModifier_open:
			case HierarchyModifier_final:
			case HierarchyModifier_override:
				enterOuterAlt(_localctx, 1);
				{
				setState(551); hierarchyModifier();
				}
				break;
			case AccessModifier_private:
			case AccessModifier_protected:
			case AccessModifier_public:
			case AccessModifier_internal:
			case Modifier_const:
				enterOuterAlt(_localctx, 2);
				{
				setState(552); accessModifier();
				}
				break;
			case OP_IN:
			case VarianceAnnotation_out:
				enterOuterAlt(_localctx, 3);
				{
				setState(553); varianceAnnotation();
				}
				break;
			case DOG:
				enterOuterAlt(_localctx, 4);
				{
				setState(554); annotations();
				}
				break;
			case ClassModifier_enum:
			case ClassModifier_annotation:
			case ClassModifier_data:
			case ClassModifier_sealed:
				enterOuterAlt(_localctx, 5);
				{
				setState(555); classModifier();
				}
				break;
			case KeyWordModifier_operator:
			case KeyWordModifier_infix:
			case KeyWordModifier_inline:
				enterOuterAlt(_localctx, 6);
				{
				setState(556); keyWordModifier();
				}
				break;
			case KEYWORD_vararg:
				enterOuterAlt(_localctx, 7);
				{
				setState(557); match(KEYWORD_vararg);
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
		enterRule(_localctx, 56, RULE_hierarchyModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
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
		enterRule(_localctx, 58, RULE_classModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
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
		enterRule(_localctx, 60, RULE_keyWordModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
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
		enterRule(_localctx, 62, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
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
		enterRule(_localctx, 64, RULE_varianceAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
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
		enterRule(_localctx, 66, RULE_annotations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(571); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(570); annotation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(573); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
		enterRule(_localctx, 68, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575); match(DOG);
			setState(579);
			_la = _input.LA(1);
			if (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (GET - 67)) | (1L << (SET - 67)) | (1L << (AnnotationUseSiteTarget_file - 67)) | (1L << (AnnotationUseSiteTarget_field - 67)) | (1L << (AnnotationUseSiteTarget_property - 67)) | (1L << (AnnotationUseSiteTarget_param - 67)) | (1L << (AnnotationUseSiteTarget_sparam - 67)))) != 0)) {
				{
				setState(576); annotationUseSiteTarget();
				setState(577); match(COLON);
				}
			}

			setState(581); unescapedAnnotation();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 70, RULE_annotationUseSiteTarget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
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
		enterRule(_localctx, 72, RULE_valueArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(585); identifier();
				setState(586); match(EQ);
				}
				break;
			}
			setState(591);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(590); match(STAR);
				}
			}

			setState(593); expression();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 74, RULE_valueArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595); match(BRACE_OPEN);
			setState(604);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << OPEN_BLOCK) | (1L << HexadecimalLiteral) | (1L << CharacterLiteral) | (1L << TRIPLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << PACKAGE) | (1L << IMPORT) | (1L << STAR) | (1L << BRACE_OPEN) | (1L << REFERENCE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << OP_PLUS) | (1L << OP_MUNUS) | (1L << OP_DECREMENT) | (1L << OP_INCREMENT) | (1L << OP_NOT))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (ClassModifier_enum - 76)) | (1L << (DOG - 76)) | (1L << (Jump_throw - 76)) | (1L << (Jump_continue - 76)) | (1L << (Jump_return - 76)) | (1L << (Jump_break - 76)) | (1L << (ConstructorDelegationCall_this - 76)) | (1L << (ConstructorDelegationCall_super - 76)) | (1L << (Declaration_object - 76)) | (1L << (Declaration_companion - 76)) | (1L << (Declaration_init - 76)) | (1L << (CF_if - 76)) | (1L << (CF_when - 76)) | (1L << (CF_while - 76)) | (1L << (CF_for - 76)) | (1L << (CF_do - 76)) | (1L << (CF_try - 76)) | (1L << (BAX - 76)) | (1L << (SimpleName - 76)))) != 0)) {
				{
				setState(596); valueArgument();
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(597); match(COMMA);
					setState(598); valueArgument();
					}
					}
					setState(603);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(606); match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 76, RULE_unescapedAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608); identifier();
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(609); match(DOT);
				setState(610); identifier();
				}
				}
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(617);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(616); typeArguments();
				}
			}

			setState(620);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(619); valueArguments();
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
		enterRule(_localctx, 78, RULE_jump);
		try {
			setState(639);
			switch (_input.LA(1)) {
			case Jump_throw:
				enterOuterAlt(_localctx, 1);
				{
				setState(622); match(Jump_throw);
				setState(623); expression();
				}
				break;
			case Jump_return:
				enterOuterAlt(_localctx, 2);
				{
				setState(624); match(Jump_return);
				setState(626);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(625); labelReference();
					}
					break;
				}
				setState(629);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(628); expression();
					}
					break;
				}
				}
				break;
			case Jump_continue:
				enterOuterAlt(_localctx, 3);
				{
				setState(631); match(Jump_continue);
				setState(633);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(632); labelReference();
					}
					break;
				}
				}
				break;
			case Jump_break:
				enterOuterAlt(_localctx, 4);
				{
				setState(635); match(Jump_break);
				setState(637);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(636); labelReference();
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
		enterRule(_localctx, 80, RULE_labelReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641); match(DOG);
			setState(646);
			switch (_input.LA(1)) {
			case IMPORT:
			case ClassModifier_enum:
			case Declaration_companion:
			case Declaration_init:
			case SimpleName:
				{
				setState(642); identifier();
				}
				break;
			case CF_for:
				{
				setState(643); match(CF_for);
				}
				break;
			case CF_while:
				{
				setState(644); match(CF_while);
				}
				break;
			case CF_when:
				{
				setState(645); match(CF_when);
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
		enterRule(_localctx, 82, RULE_labelDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648); identifier();
			setState(649); match(DOG);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 84, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651); match(SimpleName);
			setState(652); match(COLON);
			setState(653); type();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 86, RULE_functionParameter);
		try {
			setState(657);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(655); funcParameterWithoutDefault();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(656); funcParameterWithDefault();
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
		enterRule(_localctx, 88, RULE_funcParameterWithoutDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659); modifiers();
			setState(660); parameter();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 90, RULE_funcParameterWithDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662); funcParameterWithoutDefault();
			setState(663); match(EQ);
			setState(664); expression();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 92, RULE_constructorParameter);
		try {
			setState(668);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(666); constructorParameterWithoutDefault();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(667); constructorParameterWithDefault();
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
		enterRule(_localctx, 94, RULE_constructorParameterWithoutDefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670); modifiers();
			setState(672);
			_la = _input.LA(1);
			if (_la==KEYWORD_val || _la==KEYWORD_var) {
				{
				setState(671);
				_la = _input.LA(1);
				if ( !(_la==KEYWORD_val || _la==KEYWORD_var) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(674); parameter();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 96, RULE_constructorParameterWithDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676); constructorParameterWithoutDefault();
			setState(677); match(EQ);
			setState(678); expression();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 98, RULE_primaryConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			_la = _input.LA(1);
			if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (AccessModifier_private - 80)) | (1L << (AccessModifier_protected - 80)) | (1L << (AccessModifier_public - 80)) | (1L << (AccessModifier_internal - 80)) | (1L << (Modifier_const - 80)) | (1L << (KEYWORD_constructor - 80)))) != 0)) {
				{
				setState(681);
				_la = _input.LA(1);
				if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (AccessModifier_private - 80)) | (1L << (AccessModifier_protected - 80)) | (1L << (AccessModifier_public - 80)) | (1L << (AccessModifier_internal - 80)) | (1L << (Modifier_const - 80)))) != 0)) {
					{
					setState(680); accessModifier();
					}
				}

				setState(683); match(KEYWORD_constructor);
				}
			}

			{
			setState(686); match(BRACE_OPEN);
			setState(695);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_IN) | (1L << KEYWORD_val) | (1L << KEYWORD_var) | (1L << KEYWORD_vararg))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (HierarchyModifier_abstract - 69)) | (1L << (HierarchyModifier_open - 69)) | (1L << (HierarchyModifier_final - 69)) | (1L << (HierarchyModifier_override - 69)) | (1L << (KeyWordModifier_operator - 69)) | (1L << (KeyWordModifier_infix - 69)) | (1L << (KeyWordModifier_inline - 69)) | (1L << (ClassModifier_enum - 69)) | (1L << (ClassModifier_annotation - 69)) | (1L << (ClassModifier_data - 69)) | (1L << (ClassModifier_sealed - 69)) | (1L << (AccessModifier_private - 69)) | (1L << (AccessModifier_protected - 69)) | (1L << (AccessModifier_public - 69)) | (1L << (AccessModifier_internal - 69)) | (1L << (Modifier_const - 69)) | (1L << (VarianceAnnotation_out - 69)) | (1L << (DOG - 69)) | (1L << (SimpleName - 69)))) != 0)) {
				{
				setState(687); constructorParameter();
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(688); match(COMMA);
					setState(689); constructorParameter();
					}
					}
					setState(694);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(697); match(BRACE_CLOSE);
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
		enterRule(_localctx, 100, RULE_secondaryConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			_la = _input.LA(1);
			if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (AccessModifier_private - 80)) | (1L << (AccessModifier_protected - 80)) | (1L << (AccessModifier_public - 80)) | (1L << (AccessModifier_internal - 80)) | (1L << (Modifier_const - 80)))) != 0)) {
				{
				setState(699); accessModifier();
				}
			}

			setState(702); match(KEYWORD_constructor);
			{
			setState(703); match(BRACE_OPEN);
			setState(712);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_IN) | (1L << KEYWORD_val) | (1L << KEYWORD_var) | (1L << KEYWORD_vararg))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (HierarchyModifier_abstract - 69)) | (1L << (HierarchyModifier_open - 69)) | (1L << (HierarchyModifier_final - 69)) | (1L << (HierarchyModifier_override - 69)) | (1L << (KeyWordModifier_operator - 69)) | (1L << (KeyWordModifier_infix - 69)) | (1L << (KeyWordModifier_inline - 69)) | (1L << (ClassModifier_enum - 69)) | (1L << (ClassModifier_annotation - 69)) | (1L << (ClassModifier_data - 69)) | (1L << (ClassModifier_sealed - 69)) | (1L << (AccessModifier_private - 69)) | (1L << (AccessModifier_protected - 69)) | (1L << (AccessModifier_public - 69)) | (1L << (AccessModifier_internal - 69)) | (1L << (Modifier_const - 69)) | (1L << (VarianceAnnotation_out - 69)) | (1L << (DOG - 69)) | (1L << (SimpleName - 69)))) != 0)) {
				{
				setState(704); constructorParameter();
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(705); match(COMMA);
					setState(706); constructorParameter();
					}
					}
					setState(711);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(714); match(BRACE_CLOSE);
			}
			setState(718);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(716); match(COLON);
				setState(717); constructorDelegationCall();
				}
			}

			setState(721);
			_la = _input.LA(1);
			if (_la==OPEN_BLOCK) {
				{
				setState(720); block();
				}
			}

			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(723); match(SEMI);
				}
				}
				setState(728);
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
		enterRule(_localctx, 102, RULE_constructorDelegationCall);
		try {
			setState(733);
			switch (_input.LA(1)) {
			case ConstructorDelegationCall_this:
				enterOuterAlt(_localctx, 1);
				{
				setState(729); match(ConstructorDelegationCall_this);
				setState(730); valueArguments();
				}
				break;
			case ConstructorDelegationCall_super:
				enterOuterAlt(_localctx, 2);
				{
				setState(731); match(ConstructorDelegationCall_super);
				setState(732); valueArguments();
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
		enterRule(_localctx, 104, RULE_callSuffix);
		int _la;
		try {
			setState(746);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(736);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(735); typeArguments();
					}
				}

				setState(738); valueArguments();
				setState(740);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(739); annotatedLambda();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(742); typeArguments();
				setState(743); annotatedLambda();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(745); annotatedLambda();
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
		enterRule(_localctx, 106, RULE_constructorInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748); userType();
			setState(750);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(749); typeArguments();
				}
			}

			setState(752); valueArguments();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 108, RULE_explicitDelegation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754); userType();
			setState(755); match(KEYWORD_by);
			setState(756); expression();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 110, RULE_delegationSpecifier);
		try {
			setState(761);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(758); constructorInvocation();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(759); userType();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(760); explicitDelegation();
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
		enterRule(_localctx, 112, RULE_classDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(763); modifiers();
			setState(764);
			_la = _input.LA(1);
			if ( !(_la==Declaration_class || _la==Declaration_interface) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(765); match(SimpleName);
			setState(767);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(766); typeParameters();
				}
			}

			setState(770);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(769); primaryConstructor();
				}
				break;
			}
			setState(784);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(772); match(COLON);
				setState(774);
				_la = _input.LA(1);
				if (_la==DOG) {
					{
					setState(773); annotations();
					}
				}

				setState(776); delegationSpecifier();
				setState(781);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(777); match(COMMA);
					setState(778); delegationSpecifier();
					}
					}
					setState(783);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(786); typeConstraints();
			setState(789);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(787); classBody();
				}
				break;

			case 2:
				{
				setState(788); enumClassBody();
				}
				break;
			}
			setState(794);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(791); match(SEMI);
					}
					} 
				}
				setState(796);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
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
		enterRule(_localctx, 114, RULE_supertypesSpecifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797); match(COLON);
			setState(798); delegationSpecifier();
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(799); match(COMMA);
				setState(800); delegationSpecifier();
				}
				}
				setState(805);
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
		enterRule(_localctx, 116, RULE_objectDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(806); modifiers();
			setState(807); match(Declaration_object);
			setState(808); match(SimpleName);
			setState(810);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(809); primaryConstructor();
				}
				break;
			}
			setState(813);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(812); supertypesSpecifiers();
				}
			}

			setState(815); classBody();
			setState(819);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(816); match(SEMI);
					}
					} 
				}
				setState(821);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
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
		enterRule(_localctx, 118, RULE_typealiasDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822); modifiers();
			setState(823); match(Declaration_typealias);
			setState(824); match(SimpleName);
			setState(825); match(EQ);
			setState(826); simpleUserType();
			setState(830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(827); match(SEMI);
				}
				}
				setState(832);
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
		enterRule(_localctx, 120, RULE_companionObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833); modifiers();
			setState(834); match(Declaration_companion);
			setState(835); match(Declaration_object);
			setState(837);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(836); supertypesSpecifiers();
				}
			}

			setState(839); classBody();
			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(840); match(SEMI);
				}
				}
				setState(845);
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
		enterRule(_localctx, 122, RULE_classBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(846); match(OPEN_BLOCK);
				setState(847); members();
				setState(848); match(CLOSE_BLOCK);
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
		enterRule(_localctx, 124, RULE_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (OP_IN - 44)) | (1L << (KEYWORD_val - 44)) | (1L << (KEYWORD_var - 44)) | (1L << (KEYWORD_vararg - 44)) | (1L << (HierarchyModifier_abstract - 44)) | (1L << (HierarchyModifier_open - 44)) | (1L << (HierarchyModifier_final - 44)) | (1L << (HierarchyModifier_override - 44)) | (1L << (KeyWordModifier_operator - 44)) | (1L << (KeyWordModifier_infix - 44)) | (1L << (KeyWordModifier_inline - 44)) | (1L << (ClassModifier_enum - 44)) | (1L << (ClassModifier_annotation - 44)) | (1L << (ClassModifier_data - 44)) | (1L << (ClassModifier_sealed - 44)) | (1L << (AccessModifier_private - 44)) | (1L << (AccessModifier_protected - 44)) | (1L << (AccessModifier_public - 44)) | (1L << (AccessModifier_internal - 44)) | (1L << (Modifier_const - 44)) | (1L << (VarianceAnnotation_out - 44)) | (1L << (DOG - 44)) | (1L << (KEYWORD_constructor - 44)) | (1L << (Declaration_class - 44)) | (1L << (Declaration_interface - 44)) | (1L << (Declaration_object - 44)) | (1L << (Declaration_companion - 44)) | (1L << (Declaration_fun - 44)) | (1L << (Declaration_init - 44)))) != 0)) {
				{
				{
				setState(852); memberDeclaration();
				}
				}
				setState(857);
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
		enterRule(_localctx, 126, RULE_valueParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858); match(BRACE_OPEN);
			setState(867);
			_la = _input.LA(1);
			if (_la==OP_IN || _la==KEYWORD_vararg || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (HierarchyModifier_abstract - 69)) | (1L << (HierarchyModifier_open - 69)) | (1L << (HierarchyModifier_final - 69)) | (1L << (HierarchyModifier_override - 69)) | (1L << (KeyWordModifier_operator - 69)) | (1L << (KeyWordModifier_infix - 69)) | (1L << (KeyWordModifier_inline - 69)) | (1L << (ClassModifier_enum - 69)) | (1L << (ClassModifier_annotation - 69)) | (1L << (ClassModifier_data - 69)) | (1L << (ClassModifier_sealed - 69)) | (1L << (AccessModifier_private - 69)) | (1L << (AccessModifier_protected - 69)) | (1L << (AccessModifier_public - 69)) | (1L << (AccessModifier_internal - 69)) | (1L << (Modifier_const - 69)) | (1L << (VarianceAnnotation_out - 69)) | (1L << (DOG - 69)) | (1L << (SimpleName - 69)))) != 0)) {
				{
				setState(859); functionParameter();
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(860); match(COMMA);
					setState(861); functionParameter();
					}
					}
					setState(866);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(869); match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 128, RULE_functionDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(871); modifiers();
			setState(872); match(Declaration_fun);
			setState(874);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(873); typeParameters();
				}
			}

			setState(880);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(876); type();
				setState(877); match(DOT);
				}
				break;

			case 2:
				{
				setState(879); annotations();
				}
				break;
			}
			setState(882); match(SimpleName);
			setState(884);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(883); typeParameters();
				}
			}

			setState(886); valueParameters();
			setState(889);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(887); match(COLON);
				setState(888); type();
				}
			}

			setState(891); typeConstraints();
			setState(893);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(892); functionBody();
				}
				break;
			}
			setState(898);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(895); match(SEMI);
					}
					} 
				}
				setState(900);
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
		enterRule(_localctx, 130, RULE_statements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(901); match(SEMI);
					}
					} 
				}
				setState(906);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			}
			setState(920);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << OPEN_BLOCK) | (1L << HexadecimalLiteral) | (1L << CharacterLiteral) | (1L << TRIPLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << PACKAGE) | (1L << IMPORT) | (1L << BRACE_OPEN) | (1L << REFERENCE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << OP_PLUS) | (1L << OP_MUNUS) | (1L << OP_IN) | (1L << OP_DECREMENT) | (1L << OP_INCREMENT) | (1L << OP_NOT) | (1L << KEYWORD_val) | (1L << KEYWORD_var) | (1L << KEYWORD_vararg))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (HierarchyModifier_abstract - 69)) | (1L << (HierarchyModifier_open - 69)) | (1L << (HierarchyModifier_final - 69)) | (1L << (HierarchyModifier_override - 69)) | (1L << (KeyWordModifier_operator - 69)) | (1L << (KeyWordModifier_infix - 69)) | (1L << (KeyWordModifier_inline - 69)) | (1L << (ClassModifier_enum - 69)) | (1L << (ClassModifier_annotation - 69)) | (1L << (ClassModifier_data - 69)) | (1L << (ClassModifier_sealed - 69)) | (1L << (AccessModifier_private - 69)) | (1L << (AccessModifier_protected - 69)) | (1L << (AccessModifier_public - 69)) | (1L << (AccessModifier_internal - 69)) | (1L << (Modifier_const - 69)) | (1L << (VarianceAnnotation_out - 69)) | (1L << (DOG - 69)) | (1L << (Jump_throw - 69)) | (1L << (Jump_continue - 69)) | (1L << (Jump_return - 69)) | (1L << (Jump_break - 69)) | (1L << (ConstructorDelegationCall_this - 69)) | (1L << (ConstructorDelegationCall_super - 69)) | (1L << (Declaration_class - 69)) | (1L << (Declaration_interface - 69)) | (1L << (Declaration_object - 69)) | (1L << (Declaration_companion - 69)) | (1L << (Declaration_fun - 69)) | (1L << (Declaration_init - 69)) | (1L << (CF_if - 69)) | (1L << (CF_when - 69)) | (1L << (CF_while - 69)) | (1L << (CF_for - 69)) | (1L << (CF_do - 69)) | (1L << (CF_try - 69)) | (1L << (BAX - 69)) | (1L << (SimpleName - 69)))) != 0)) {
				{
				setState(907); statement();
				setState(917);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(911);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SEMI) {
							{
							{
							setState(908); match(SEMI);
							}
							}
							setState(913);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(914); statement();
						}
						} 
					}
					setState(919);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
				}
				}
			}

			setState(925);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(922); match(SEMI);
				}
				}
				setState(927);
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
		enterRule(_localctx, 132, RULE_functionBody);
		try {
			setState(931);
			switch (_input.LA(1)) {
			case OPEN_BLOCK:
				enterOuterAlt(_localctx, 1);
				{
				setState(928); block();
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(929); match(EQ);
				setState(930); expression();
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
		enterRule(_localctx, 134, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933); match(OPEN_BLOCK);
			setState(934); statements();
			setState(935); match(CLOSE_BLOCK);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 136, RULE_anonymousInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937); match(Declaration_init);
			setState(938); block();
			setState(942);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(939); match(SEMI);
				}
				}
				setState(944);
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
		enterRule(_localctx, 138, RULE_enumClassBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945); match(OPEN_BLOCK);
			setState(946); enumEntries();
			setState(949);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(947); match(SEMI);
				setState(948); members();
				}
			}

			setState(951); match(CLOSE_BLOCK);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 140, RULE_enumEntries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_IN || _la==KEYWORD_vararg || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (HierarchyModifier_abstract - 69)) | (1L << (HierarchyModifier_open - 69)) | (1L << (HierarchyModifier_final - 69)) | (1L << (HierarchyModifier_override - 69)) | (1L << (KeyWordModifier_operator - 69)) | (1L << (KeyWordModifier_infix - 69)) | (1L << (KeyWordModifier_inline - 69)) | (1L << (ClassModifier_enum - 69)) | (1L << (ClassModifier_annotation - 69)) | (1L << (ClassModifier_data - 69)) | (1L << (ClassModifier_sealed - 69)) | (1L << (AccessModifier_private - 69)) | (1L << (AccessModifier_protected - 69)) | (1L << (AccessModifier_public - 69)) | (1L << (AccessModifier_internal - 69)) | (1L << (Modifier_const - 69)) | (1L << (VarianceAnnotation_out - 69)) | (1L << (DOG - 69)) | (1L << (SimpleName - 69)))) != 0)) {
				{
				{
				setState(953); enumEntry();
				setState(955);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(954); match(COMMA);
					}
				}

				}
				}
				setState(961);
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
		enterRule(_localctx, 142, RULE_enumEntry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962); modifiers();
			setState(963); match(SimpleName);
			setState(970);
			switch (_input.LA(1)) {
			case COLON:
				{
				{
				setState(964); match(COLON);
				setState(966);
				_la = _input.LA(1);
				if (_la==DOG) {
					{
					setState(965); annotations();
					}
				}

				setState(968); constructorInvocation();
				}
				}
				break;
			case BRACE_OPEN:
				{
				setState(969); valueArguments();
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
			setState(972); classBody();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 144, RULE_ifExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(974); match(CF_if);
			setState(975); match(BRACE_OPEN);
			setState(976); expression();
			setState(977); match(BRACE_CLOSE);
			setState(978); expression();
			setState(982);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(979); match(SEMI);
					}
					} 
				}
				setState(984);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			}
			setState(987);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(985); match(CF_else);
				setState(986); expression();
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
		enterRule(_localctx, 146, RULE_tryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989); match(CF_try);
			setState(990); block();
			setState(994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CF_catch) {
				{
				{
				setState(991); catchBlock();
				}
				}
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(998);
			_la = _input.LA(1);
			if (_la==CF_FINALLY) {
				{
				setState(997); finallyBlock();
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
		enterRule(_localctx, 148, RULE_catchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000); match(CF_catch);
			setState(1001); match(BRACE_OPEN);
			setState(1003);
			_la = _input.LA(1);
			if (_la==DOG) {
				{
				setState(1002); annotations();
				}
			}

			setState(1005); match(SimpleName);
			setState(1006); match(COLON);
			setState(1007); userType();
			setState(1008); match(BRACE_CLOSE);
			setState(1009); block();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 150, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011); match(CF_FINALLY);
			setState(1012); block();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 152, RULE_loop);
		try {
			setState(1017);
			switch (_input.LA(1)) {
			case CF_for:
				enterOuterAlt(_localctx, 1);
				{
				setState(1014); forLoop();
				}
				break;
			case CF_while:
				enterOuterAlt(_localctx, 2);
				{
				setState(1015); whileLoop();
				}
				break;
			case CF_do:
				enterOuterAlt(_localctx, 3);
				{
				setState(1016); doWhileLoop();
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
		enterRule(_localctx, 154, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019); match(CF_for);
			setState(1020); match(BRACE_OPEN);
			setState(1022);
			_la = _input.LA(1);
			if (_la==DOG) {
				{
				setState(1021); annotations();
				}
			}

			setState(1026);
			switch (_input.LA(1)) {
			case BRACE_OPEN:
				{
				setState(1024); multipleVariableDeclarations();
				}
				break;
			case SimpleName:
				{
				setState(1025); variableDeclarationEntry();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1028); match(OP_IN);
			setState(1029); expression();
			setState(1030); match(BRACE_CLOSE);
			setState(1031); expression();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 156, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033); match(CF_while);
			setState(1034); match(BRACE_OPEN);
			setState(1035); expression();
			setState(1036); match(BRACE_CLOSE);
			setState(1037); expression();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 158, RULE_doWhileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039); match(CF_do);
			setState(1040); expression();
			setState(1041); match(CF_while);
			setState(1042); match(BRACE_OPEN);
			setState(1043); expression();
			setState(1044); match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 160, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1046); disjunction();
			setState(1052);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1047); assignmentOperator();
					setState(1048); disjunction();
					}
					} 
				}
				setState(1054);
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
		enterRule(_localctx, 162, RULE_disjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1055); conjunction();
			setState(1060);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1056); match(DISJ);
					setState(1057); conjunction();
					}
					} 
				}
				setState(1062);
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
		enterRule(_localctx, 164, RULE_conjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1063); equalityComparison();
			setState(1068);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1064); match(CONJ);
					setState(1065); equalityComparison();
					}
					} 
				}
				setState(1070);
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
		enterRule(_localctx, 166, RULE_equalityComparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1071); comparison();
			setState(1077);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1072); equalityOperation();
					setState(1073); comparison();
					}
					} 
				}
				setState(1079);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
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
		enterRule(_localctx, 168, RULE_comparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1080); namedInfix();
			setState(1086);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1081); comparisonOperation();
					setState(1082); namedInfix();
					}
					} 
				}
				setState(1088);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
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
		enterRule(_localctx, 170, RULE_namedInfix);
		try {
			int _alt;
			setState(1104);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1089); elvisExpression();
				setState(1095);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1090); inOperation();
						setState(1091); elvisExpression();
						}
						} 
					}
					setState(1097);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1098); elvisExpression();
				setState(1102);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(1099); isOperation();
					setState(1100); type();
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
		enterRule(_localctx, 172, RULE_elvisExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1106); infixFunctionCall();
			setState(1111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1107); match(ELVIS);
					setState(1108); infixFunctionCall();
					}
					} 
				}
				setState(1113);
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
		enterRule(_localctx, 174, RULE_infixFunctionCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1114); rangeExpression();
			setState(1119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1115); match(SimpleName);
					setState(1116); rangeExpression();
					}
					} 
				}
				setState(1121);
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
		enterRule(_localctx, 176, RULE_rangeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1122); additiveExpression();
			setState(1127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1123); match(RANGE);
					setState(1124); additiveExpression();
					}
					} 
				}
				setState(1129);
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
		enterRule(_localctx, 178, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1130); multiplicativeExpression();
			setState(1136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1131); additiveOperation();
					setState(1132); multiplicativeExpression();
					}
					} 
				}
				setState(1138);
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
		enterRule(_localctx, 180, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1139); typeRHS();
			setState(1145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1140); multiplicativeOperation();
					setState(1141); typeRHS();
					}
					} 
				}
				setState(1147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
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
		enterRule(_localctx, 182, RULE_typeRHS);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1148); prefixUnaryExpression();
			setState(1154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1149); typeOperation();
					setState(1150); prefixUnaryExpression();
					}
					} 
				}
				setState(1156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
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
		enterRule(_localctx, 184, RULE_prefixUnaryExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1157); prefixUnaryOperation();
					}
					} 
				}
				setState(1162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			}
			setState(1163); postfixUnaryExpression();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 186, RULE_postfixUnaryExpression);
		try {
			int _alt;
			setState(1184);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1165); atomicExpression();
				setState(1166); callSuffix();
				setState(1168);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1167); lastArgLambda();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1170); atomicExpression();
				setState(1174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1171); postfixUnaryOperation();
						}
						} 
					}
					setState(1176);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1177); callableReference();
				setState(1181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1178); postfixUnaryOperation();
						}
						} 
					}
					setState(1183);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
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
		enterRule(_localctx, 188, RULE_callableReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1196);
			switch (_input.LA(1)) {
			case PACKAGE:
			case REFERENCE:
			case SimpleName:
				{
				setState(1193);
				_la = _input.LA(1);
				if (_la==PACKAGE || _la==SimpleName) {
					{
					setState(1186); userType();
					setState(1190);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Q) {
						{
						{
						setState(1187); match(Q);
						}
						}
						setState(1192);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case ConstructorDelegationCall_this:
				{
				setState(1195); match(ConstructorDelegationCall_this);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1198); match(REFERENCE);
			setState(1201);
			switch (_input.LA(1)) {
			case IMPORT:
			case ClassModifier_enum:
			case Declaration_companion:
			case Declaration_init:
			case SimpleName:
				{
				setState(1199); identifier();
				}
				break;
			case Declaration_class:
				{
				setState(1200); match(Declaration_class);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1204);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				{
				setState(1203); typeArguments();
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
		enterRule(_localctx, 190, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			_la = _input.LA(1);
			if ( !(_la==IMPORT || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (ClassModifier_enum - 76)) | (1L << (Declaration_companion - 76)) | (1L << (Declaration_init - 76)) | (1L << (SimpleName - 76)))) != 0)) ) {
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
		enterRule(_localctx, 192, RULE_stringLiteral);
		int _la;
		try {
			setState(1235);
			switch (_input.LA(1)) {
			case SINGLE_QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1208); match(SINGLE_QUOTE);
				setState(1218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTILINE_COMMENT) | (1L << SINGLELINE_COMMENT) | (1L << WHITESPACE) | (1L << IntegerLiteral) | (1L << SEMI) | (1L << OPEN_BLOCK) | (1L << CLOSE_BLOCK) | (1L << HexadecimalLiteral) | (1L << CharacterLiteral) | (1L << TRIPLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << PACKAGE) | (1L << IMPORT) | (1L << DOT) | (1L << STAR) | (1L << COMMA) | (1L << LT) | (1L << LTE) | (1L << GT) | (1L << GTE) | (1L << EQ) | (1L << EQ_EQ) | (1L << EQ_EQ_EQ) | (1L << NEQ) | (1L << COLON) | (1L << BRACE_OPEN) | (1L << BRACE_CLOSE) | (1L << Q) | (1L << DA) | (1L << DISJ) | (1L << CONJ) | (1L << ELVIS) | (1L << LONG_RANGE) | (1L << RANGE) | (1L << REFERENCE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << OP_ASTERISK) | (1L << OP_DIV) | (1L << OP_MOD) | (1L << OP_PLUS) | (1L << OP_MUNUS) | (1L << OP_IN) | (1L << OP_NOT_IN) | (1L << OP_IS) | (1L << OP_NOT_IS) | (1L << OP_AS) | (1L << OP_AS_SAFE) | (1L << OP_PLUS_ASSIGN) | (1L << OP_MINUS_ASSIGN) | (1L << OP_MULT_ASSIGN) | (1L << OP_DIV_ASSIGN) | (1L << OP_MOD_ASSIGN) | (1L << OP_DECREMENT) | (1L << OP_INCREMENT) | (1L << OP_NULL_ASSERT) | (1L << OP_NOT) | (1L << SQ_OPEN) | (1L << SQ_CLOSE) | (1L << KEYWORD_val) | (1L << KEYWORD_var) | (1L << KEYWORD_vararg))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KEYWORD_by - 64)) | (1L << (KEYWORD_dynamic - 64)) | (1L << (KEYWORD_where - 64)) | (1L << (GET - 64)) | (1L << (SET - 64)) | (1L << (HierarchyModifier_abstract - 64)) | (1L << (HierarchyModifier_open - 64)) | (1L << (HierarchyModifier_final - 64)) | (1L << (HierarchyModifier_override - 64)) | (1L << (KeyWordModifier_operator - 64)) | (1L << (KeyWordModifier_infix - 64)) | (1L << (KeyWordModifier_inline - 64)) | (1L << (ClassModifier_enum - 64)) | (1L << (ClassModifier_annotation - 64)) | (1L << (ClassModifier_data - 64)) | (1L << (ClassModifier_sealed - 64)) | (1L << (AccessModifier_private - 64)) | (1L << (AccessModifier_protected - 64)) | (1L << (AccessModifier_public - 64)) | (1L << (AccessModifier_internal - 64)) | (1L << (Modifier_const - 64)) | (1L << (VarianceAnnotation_out - 64)) | (1L << (DOG - 64)) | (1L << (AnnotationUseSiteTarget_file - 64)) | (1L << (AnnotationUseSiteTarget_field - 64)) | (1L << (AnnotationUseSiteTarget_property - 64)) | (1L << (AnnotationUseSiteTarget_param - 64)) | (1L << (AnnotationUseSiteTarget_sparam - 64)) | (1L << (Jump_throw - 64)) | (1L << (Jump_continue - 64)) | (1L << (Jump_return - 64)) | (1L << (Jump_break - 64)) | (1L << (KEYWORD_constructor - 64)) | (1L << (ConstructorDelegationCall_this - 64)) | (1L << (ConstructorDelegationCall_super - 64)) | (1L << (Declaration_class - 64)) | (1L << (Declaration_interface - 64)) | (1L << (Declaration_object - 64)) | (1L << (Declaration_companion - 64)) | (1L << (Declaration_fun - 64)) | (1L << (Declaration_typealias - 64)) | (1L << (Declaration_init - 64)) | (1L << (CF_if - 64)) | (1L << (CF_else - 64)) | (1L << (CF_when - 64)) | (1L << (CF_while - 64)) | (1L << (CF_for - 64)) | (1L << (CF_do - 64)) | (1L << (CF_try - 64)) | (1L << (CF_catch - 64)) | (1L << (CF_FINALLY - 64)) | (1L << (BAX - 64)) | (1L << (SimpleName - 64)) | (1L << (SINLE_QUOTE_WHITESPACE - 64)) | (1L << (SINGLE_TEXT - 64)) | (1L << (SINLE_QUOTE_ESCAPED_CHAR - 64)) | (1L << (SINLE_QUOTE_EXPRESSION_START - 64)) | (1L << (SINGLE_QUOTE_REF - 64)) | (1L << (MULTILINE_QUOTE_TEXT - 64)) | (1L << (MULTILINE_QUOTE_CLOSE - 64)) | (1L << (MULTILINE_QUOTES - 64)) | (1L << (MULTILINE_QUOTE_EXPRESSION_START - 64)) | (1L << (MULTILINE_QUOTE_REF - 64)))) != 0)) {
					{
					setState(1216);
					switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
					case 1:
						{
						setState(1209); match(SINLE_QUOTE_ESCAPED_CHAR);
						}
						break;

					case 2:
						{
						setState(1210); match(SINLE_QUOTE_EXPRESSION_START);
						setState(1211); expression();
						setState(1212); match(CLOSE_BLOCK);
						}
						break;

					case 3:
						{
						setState(1214); match(SINGLE_QUOTE_REF);
						}
						break;

					case 4:
						{
						setState(1215);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==SINLE_QUOTE_CLOSE) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					}
					}
					setState(1220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1221); match(SINLE_QUOTE_CLOSE);
				}
				break;
			case TRIPLE_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1222); match(TRIPLE_QUOTE);
				setState(1231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTILINE_COMMENT) | (1L << SINGLELINE_COMMENT) | (1L << WHITESPACE) | (1L << IntegerLiteral) | (1L << SEMI) | (1L << OPEN_BLOCK) | (1L << CLOSE_BLOCK) | (1L << HexadecimalLiteral) | (1L << CharacterLiteral) | (1L << TRIPLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << PACKAGE) | (1L << IMPORT) | (1L << DOT) | (1L << STAR) | (1L << COMMA) | (1L << LT) | (1L << LTE) | (1L << GT) | (1L << GTE) | (1L << EQ) | (1L << EQ_EQ) | (1L << EQ_EQ_EQ) | (1L << NEQ) | (1L << COLON) | (1L << BRACE_OPEN) | (1L << BRACE_CLOSE) | (1L << Q) | (1L << DA) | (1L << DISJ) | (1L << CONJ) | (1L << ELVIS) | (1L << LONG_RANGE) | (1L << RANGE) | (1L << REFERENCE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << OP_ASTERISK) | (1L << OP_DIV) | (1L << OP_MOD) | (1L << OP_PLUS) | (1L << OP_MUNUS) | (1L << OP_IN) | (1L << OP_NOT_IN) | (1L << OP_IS) | (1L << OP_NOT_IS) | (1L << OP_AS) | (1L << OP_AS_SAFE) | (1L << OP_PLUS_ASSIGN) | (1L << OP_MINUS_ASSIGN) | (1L << OP_MULT_ASSIGN) | (1L << OP_DIV_ASSIGN) | (1L << OP_MOD_ASSIGN) | (1L << OP_DECREMENT) | (1L << OP_INCREMENT) | (1L << OP_NULL_ASSERT) | (1L << OP_NOT) | (1L << SQ_OPEN) | (1L << SQ_CLOSE) | (1L << KEYWORD_val) | (1L << KEYWORD_var) | (1L << KEYWORD_vararg))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KEYWORD_by - 64)) | (1L << (KEYWORD_dynamic - 64)) | (1L << (KEYWORD_where - 64)) | (1L << (GET - 64)) | (1L << (SET - 64)) | (1L << (HierarchyModifier_abstract - 64)) | (1L << (HierarchyModifier_open - 64)) | (1L << (HierarchyModifier_final - 64)) | (1L << (HierarchyModifier_override - 64)) | (1L << (KeyWordModifier_operator - 64)) | (1L << (KeyWordModifier_infix - 64)) | (1L << (KeyWordModifier_inline - 64)) | (1L << (ClassModifier_enum - 64)) | (1L << (ClassModifier_annotation - 64)) | (1L << (ClassModifier_data - 64)) | (1L << (ClassModifier_sealed - 64)) | (1L << (AccessModifier_private - 64)) | (1L << (AccessModifier_protected - 64)) | (1L << (AccessModifier_public - 64)) | (1L << (AccessModifier_internal - 64)) | (1L << (Modifier_const - 64)) | (1L << (VarianceAnnotation_out - 64)) | (1L << (DOG - 64)) | (1L << (AnnotationUseSiteTarget_file - 64)) | (1L << (AnnotationUseSiteTarget_field - 64)) | (1L << (AnnotationUseSiteTarget_property - 64)) | (1L << (AnnotationUseSiteTarget_param - 64)) | (1L << (AnnotationUseSiteTarget_sparam - 64)) | (1L << (Jump_throw - 64)) | (1L << (Jump_continue - 64)) | (1L << (Jump_return - 64)) | (1L << (Jump_break - 64)) | (1L << (KEYWORD_constructor - 64)) | (1L << (ConstructorDelegationCall_this - 64)) | (1L << (ConstructorDelegationCall_super - 64)) | (1L << (Declaration_class - 64)) | (1L << (Declaration_interface - 64)) | (1L << (Declaration_object - 64)) | (1L << (Declaration_companion - 64)) | (1L << (Declaration_fun - 64)) | (1L << (Declaration_typealias - 64)) | (1L << (Declaration_init - 64)) | (1L << (CF_if - 64)) | (1L << (CF_else - 64)) | (1L << (CF_when - 64)) | (1L << (CF_while - 64)) | (1L << (CF_for - 64)) | (1L << (CF_do - 64)) | (1L << (CF_try - 64)) | (1L << (CF_catch - 64)) | (1L << (CF_FINALLY - 64)) | (1L << (BAX - 64)) | (1L << (SimpleName - 64)) | (1L << (SINLE_QUOTE_WHITESPACE - 64)) | (1L << (SINGLE_TEXT - 64)) | (1L << (SINLE_QUOTE_CLOSE - 64)) | (1L << (SINLE_QUOTE_ESCAPED_CHAR - 64)) | (1L << (SINLE_QUOTE_EXPRESSION_START - 64)) | (1L << (SINGLE_QUOTE_REF - 64)) | (1L << (MULTILINE_QUOTE_TEXT - 64)) | (1L << (MULTILINE_QUOTES - 64)) | (1L << (MULTILINE_QUOTE_EXPRESSION_START - 64)) | (1L << (MULTILINE_QUOTE_REF - 64)))) != 0)) {
					{
					setState(1229);
					switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
					case 1:
						{
						setState(1223); match(MULTILINE_QUOTE_EXPRESSION_START);
						setState(1224); expression();
						setState(1225); match(CLOSE_BLOCK);
						}
						break;

					case 2:
						{
						setState(1227); match(MULTILINE_QUOTE_REF);
						}
						break;

					case 3:
						{
						setState(1228);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==MULTILINE_QUOTE_CLOSE) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					}
					}
					setState(1233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1234); match(MULTILINE_QUOTE_CLOSE);
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
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
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
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 194, RULE_atomicExpression);
		try {
			setState(1267);
			switch (_input.LA(1)) {
			case BRACE_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1237); match(BRACE_OPEN);
				setState(1238); expression();
				setState(1239); match(BRACE_CLOSE);
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
				setState(1241); literalConstant();
				}
				break;
			case OPEN_BLOCK:
				enterOuterAlt(_localctx, 3);
				{
				setState(1242); functionLiteral();
				}
				break;
			case ConstructorDelegationCall_this:
				enterOuterAlt(_localctx, 4);
				{
				setState(1243); match(ConstructorDelegationCall_this);
				setState(1245);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1244); labelReference();
					}
					break;
				}
				}
				break;
			case ConstructorDelegationCall_super:
				enterOuterAlt(_localctx, 5);
				{
				setState(1247); match(ConstructorDelegationCall_super);
				setState(1252);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1248); match(LT);
					setState(1249); type();
					setState(1250); match(GT);
					}
					break;
				}
				setState(1255);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1254); labelReference();
					}
					break;
				}
				}
				break;
			case CF_if:
				enterOuterAlt(_localctx, 6);
				{
				setState(1257); ifExpression();
				}
				break;
			case CF_when:
				enterOuterAlt(_localctx, 7);
				{
				setState(1258); when();
				}
				break;
			case CF_try:
				enterOuterAlt(_localctx, 8);
				{
				setState(1259); tryExpression();
				}
				break;
			case Declaration_object:
				enterOuterAlt(_localctx, 9);
				{
				setState(1260); objectLiteral();
				}
				break;
			case Jump_throw:
			case Jump_continue:
			case Jump_return:
			case Jump_break:
				enterOuterAlt(_localctx, 10);
				{
				setState(1261); jump();
				}
				break;
			case CF_while:
			case CF_for:
			case CF_do:
				enterOuterAlt(_localctx, 11);
				{
				setState(1262); loop();
				}
				break;
			case IMPORT:
			case ClassModifier_enum:
			case Declaration_companion:
			case Declaration_init:
			case SimpleName:
				enterOuterAlt(_localctx, 12);
				{
				setState(1263); identifier();
				}
				break;
			case BAX:
				enterOuterAlt(_localctx, 13);
				{
				setState(1264); match(BAX);
				setState(1265); identifier();
				}
				break;
			case PACKAGE:
				enterOuterAlt(_localctx, 14);
				{
				setState(1266); match(PACKAGE);
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
		enterRule(_localctx, 196, RULE_literalConstant);
		try {
			setState(1276);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1269); match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1270); match(FALSE);
				}
				break;
			case TRIPLE_QUOTE:
			case SINGLE_QUOTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1271); stringLiteral();
				}
				break;
			case IntegerLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(1272); match(IntegerLiteral);
				}
				break;
			case HexadecimalLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(1273); match(HexadecimalLiteral);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(1274); match(CharacterLiteral);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1275); match(NULL);
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
		enterRule(_localctx, 198, RULE_declaration);
		try {
			setState(1282);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1278); functionDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1279); propertyDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1280); classDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1281); objectDeclaration();
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
		enterRule(_localctx, 200, RULE_statement);
		try {
			setState(1286);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1284); declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1285); expression();
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
		enterRule(_localctx, 202, RULE_multiplicativeOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
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
		enterRule(_localctx, 204, RULE_additiveOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
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
		enterRule(_localctx, 206, RULE_inOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
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
		enterRule(_localctx, 208, RULE_typeOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
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
		enterRule(_localctx, 210, RULE_isOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
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
		enterRule(_localctx, 212, RULE_comparisonOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1298);
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
		enterRule(_localctx, 214, RULE_equalityOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1300);
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
		enterRule(_localctx, 216, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
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
		enterRule(_localctx, 218, RULE_prefixUnaryOperation);
		try {
			setState(1311);
			switch (_input.LA(1)) {
			case OP_MUNUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1304); match(OP_MUNUS);
				}
				break;
			case OP_PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1305); match(OP_PLUS);
				}
				break;
			case OP_INCREMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1306); match(OP_INCREMENT);
				}
				break;
			case OP_DECREMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1307); match(OP_DECREMENT);
				}
				break;
			case OP_NOT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1308); match(OP_NOT);
				}
				break;
			case DOG:
				enterOuterAlt(_localctx, 6);
				{
				setState(1309); annotations();
				}
				break;
			case IMPORT:
			case ClassModifier_enum:
			case Declaration_companion:
			case Declaration_init:
			case SimpleName:
				enterOuterAlt(_localctx, 7);
				{
				setState(1310); labelDefinition();
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
		enterRule(_localctx, 220, RULE_postfixUnaryOperation);
		try {
			setState(1321);
			switch (_input.LA(1)) {
			case OP_INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1313); match(OP_INCREMENT);
				}
				break;
			case OP_DECREMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1314); match(OP_DECREMENT);
				}
				break;
			case OP_NULL_ASSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1315); match(OP_NULL_ASSERT);
				}
				break;
			case OPEN_BLOCK:
			case IMPORT:
			case LT:
			case BRACE_OPEN:
			case ClassModifier_enum:
			case DOG:
			case Declaration_companion:
			case Declaration_init:
			case SimpleName:
				enterOuterAlt(_localctx, 4);
				{
				setState(1316); callSuffix();
				}
				break;
			case SQ_OPEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(1317); arrayAccess();
				}
				break;
			case DOT:
			case Q:
				enterOuterAlt(_localctx, 6);
				{
				setState(1318); memberAccessOperation();
				setState(1319); postfixUnaryExpression();
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
		enterRule(_localctx, 222, RULE_annotatedLambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOG) {
				{
				{
				setState(1323); match(DOG);
				setState(1324); unescapedAnnotation();
				}
				}
				setState(1329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1331);
			_la = _input.LA(1);
			if (_la==IMPORT || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (ClassModifier_enum - 76)) | (1L << (Declaration_companion - 76)) | (1L << (Declaration_init - 76)) | (1L << (SimpleName - 76)))) != 0)) {
				{
				setState(1330); labelDefinition();
				}
			}

			setState(1333); functionLiteral();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 224, RULE_memberAccessOperation);
		int _la;
		try {
			setState(1340);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1335); match(DOT);
				}
				break;
			case Q:
				enterOuterAlt(_localctx, 2);
				{
				setState(1336); match(Q);
				setState(1338);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(1337); match(DOT);
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
		enterRule(_localctx, 226, RULE_functionLiteral);
		int _la;
		try {
			setState(1361);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1342); match(OPEN_BLOCK);
				setState(1343); statements();
				setState(1344); match(CLOSE_BLOCK);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1346); match(OPEN_BLOCK);
				setState(1355);
				_la = _input.LA(1);
				if (_la==SimpleName) {
					{
					{
					setState(1347); functionLiteralparameter();
					}
					setState(1352);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1348); match(COMMA);
						setState(1349); functionLiteralparameter();
						}
						}
						setState(1354);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1357); match(OP_ASTERISK);
				setState(1358); statements();
				setState(1359); match(CLOSE_BLOCK);
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
		enterRule(_localctx, 228, RULE_functionLiteralparameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363); match(SimpleName);
			setState(1366);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1364); match(COLON);
				setState(1365); type();
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
		enterRule(_localctx, 230, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1368); match(SQ_OPEN);
			setState(1377);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << OPEN_BLOCK) | (1L << HexadecimalLiteral) | (1L << CharacterLiteral) | (1L << TRIPLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << PACKAGE) | (1L << IMPORT) | (1L << BRACE_OPEN) | (1L << REFERENCE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << OP_PLUS) | (1L << OP_MUNUS) | (1L << OP_DECREMENT) | (1L << OP_INCREMENT) | (1L << OP_NOT))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (ClassModifier_enum - 76)) | (1L << (DOG - 76)) | (1L << (Jump_throw - 76)) | (1L << (Jump_continue - 76)) | (1L << (Jump_return - 76)) | (1L << (Jump_break - 76)) | (1L << (ConstructorDelegationCall_this - 76)) | (1L << (ConstructorDelegationCall_super - 76)) | (1L << (Declaration_object - 76)) | (1L << (Declaration_companion - 76)) | (1L << (Declaration_init - 76)) | (1L << (CF_if - 76)) | (1L << (CF_when - 76)) | (1L << (CF_while - 76)) | (1L << (CF_for - 76)) | (1L << (CF_do - 76)) | (1L << (CF_try - 76)) | (1L << (BAX - 76)) | (1L << (SimpleName - 76)))) != 0)) {
				{
				setState(1369); expression();
				setState(1374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1370); match(COMMA);
					setState(1371); expression();
					}
					}
					setState(1376);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1379); match(SQ_CLOSE);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 232, RULE_objectLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1381); match(Declaration_object);
			setState(1391);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1382); match(COLON);
				setState(1383); delegationSpecifier();
				setState(1388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1384); match(COMMA);
						setState(1385); delegationSpecifier();
						}
						} 
					}
					setState(1390);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				}
				}
				break;
			}
			setState(1393); classBody();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 234, RULE_when);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1395); match(CF_when);
			setState(1400);
			_la = _input.LA(1);
			if (_la==BRACE_OPEN) {
				{
				setState(1396); match(BRACE_OPEN);
				setState(1397); expression();
				setState(1398); match(BRACE_CLOSE);
				}
			}

			setState(1402); match(OPEN_BLOCK);
			setState(1406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << OPEN_BLOCK) | (1L << HexadecimalLiteral) | (1L << CharacterLiteral) | (1L << TRIPLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << PACKAGE) | (1L << IMPORT) | (1L << BRACE_OPEN) | (1L << REFERENCE) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << OP_PLUS) | (1L << OP_MUNUS) | (1L << OP_IN) | (1L << OP_NOT_IN) | (1L << OP_IS) | (1L << OP_NOT_IS) | (1L << OP_DECREMENT) | (1L << OP_INCREMENT) | (1L << OP_NOT))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (ClassModifier_enum - 76)) | (1L << (DOG - 76)) | (1L << (Jump_throw - 76)) | (1L << (Jump_continue - 76)) | (1L << (Jump_return - 76)) | (1L << (Jump_break - 76)) | (1L << (ConstructorDelegationCall_this - 76)) | (1L << (ConstructorDelegationCall_super - 76)) | (1L << (Declaration_object - 76)) | (1L << (Declaration_companion - 76)) | (1L << (Declaration_init - 76)) | (1L << (CF_if - 76)) | (1L << (CF_else - 76)) | (1L << (CF_when - 76)) | (1L << (CF_while - 76)) | (1L << (CF_for - 76)) | (1L << (CF_do - 76)) | (1L << (CF_try - 76)) | (1L << (BAX - 76)) | (1L << (SimpleName - 76)))) != 0)) {
				{
				{
				setState(1403); whenEntry();
				}
				}
				setState(1408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1409); match(CLOSE_BLOCK);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 236, RULE_whenEntry);
		int _la;
		try {
			setState(1436);
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
			case DOG:
			case Jump_throw:
			case Jump_continue:
			case Jump_return:
			case Jump_break:
			case ConstructorDelegationCall_this:
			case ConstructorDelegationCall_super:
			case Declaration_object:
			case Declaration_companion:
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
				setState(1411); whenCondition();
				setState(1416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1412); match(COMMA);
					setState(1413); whenCondition();
					}
					}
					setState(1418);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1419); match(OP_ASTERISK);
				setState(1420); expression();
				setState(1424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(1421); match(SEMI);
					}
					}
					setState(1426);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CF_else:
				enterOuterAlt(_localctx, 2);
				{
				setState(1427); match(CF_else);
				setState(1428); match(OP_ASTERISK);
				setState(1429); expression();
				setState(1433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(1430); match(SEMI);
					}
					}
					setState(1435);
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
		enterRule(_localctx, 238, RULE_whenCondition);
		int _la;
		try {
			setState(1443);
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
			case DOG:
			case Jump_throw:
			case Jump_continue:
			case Jump_return:
			case Jump_break:
			case ConstructorDelegationCall_this:
			case ConstructorDelegationCall_super:
			case Declaration_object:
			case Declaration_companion:
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
				setState(1438); expression();
				}
				break;
			case OP_IN:
			case OP_NOT_IN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1439);
				_la = _input.LA(1);
				if ( !(_la==OP_IN || _la==OP_NOT_IN) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1440); expression();
				}
				break;
			case OP_IS:
			case OP_NOT_IS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1441);
				_la = _input.LA(1);
				if ( !(_la==OP_IS || _la==OP_NOT_IS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1442); type();
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
		enterRule(_localctx, 240, RULE_lastArgLambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1445); match(OPEN_BLOCK);
			setState(1447);
			_la = _input.LA(1);
			if (_la==BRACE_OPEN) {
				{
				setState(1446); match(BRACE_OPEN);
				}
			}

			setState(1457);
			_la = _input.LA(1);
			if (_la==SimpleName) {
				{
				setState(1449); variableDeclarationEntry();
				setState(1454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1450); match(COMMA);
					setState(1451); variableDeclarationEntry();
					}
					}
					setState(1456);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1460);
			_la = _input.LA(1);
			if (_la==BRACE_CLOSE) {
				{
				setState(1459); match(BRACE_CLOSE);
				}
			}

			setState(1462); match(OP_ASTERISK);
			setState(1463); statements();
			setState(1464); match(CLOSE_BLOCK);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0081\u05bd\4\2\t"+
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
		"w\tw\4x\tx\4y\ty\4z\tz\3\2\3\2\7\2\u00f7\n\2\f\2\16\2\u00fa\13\2\3\3\5"+
		"\3\u00fd\n\3\3\3\7\3\u0100\n\3\f\3\16\3\u0103\13\3\3\4\3\4\3\4\3\4\7\4"+
		"\u0109\n\4\f\4\16\4\u010c\13\4\3\4\7\4\u010f\n\4\f\4\16\4\u0112\13\4\3"+
		"\5\3\5\3\5\3\5\7\5\u0118\n\5\f\5\16\5\u011b\13\5\3\5\3\5\3\5\3\5\5\5\u0121"+
		"\n\5\3\5\7\5\u0124\n\5\f\5\16\5\u0127\13\5\3\6\3\6\3\6\3\6\3\6\5\6\u012e"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0137\n\7\3\b\5\b\u013a\n\b\3\t\3"+
		"\t\3\t\3\t\7\t\u0140\n\t\f\t\16\t\u0143\13\t\3\t\3\t\3\n\3\n\3\n\3\n\5"+
		"\n\u014b\n\n\3\13\3\13\5\13\u014f\n\13\3\13\3\13\7\13\u0153\n\13\f\13"+
		"\16\13\u0156\13\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u015e\n\f\f\f\16\f\u0161"+
		"\13\f\5\f\u0163\n\f\3\r\5\r\u0166\n\r\3\r\3\r\3\r\3\r\3\16\5\16\u016d"+
		"\n\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u0175\n\17\3\17\5\17\u0178\n"+
		"\17\3\17\3\17\5\17\u017c\n\17\3\17\3\17\5\17\u0180\n\17\3\17\5\17\u0183"+
		"\n\17\3\17\3\17\5\17\u0187\n\17\3\17\5\17\u018a\n\17\5\17\u018c\n\17\3"+
		"\20\3\20\5\20\u0190\n\20\3\20\3\20\3\20\7\20\u0195\n\20\f\20\16\20\u0198"+
		"\13\20\3\21\3\21\3\21\3\21\5\21\u019e\n\21\3\22\3\22\3\22\3\22\3\22\7"+
		"\22\u01a5\n\22\f\22\16\22\u01a8\13\22\3\22\3\22\5\22\u01ac\n\22\3\23\3"+
		"\23\3\23\5\23\u01b1\n\23\3\24\3\24\3\24\3\24\5\24\u01b7\n\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\7\26\u01c0\n\26\f\26\16\26\u01c3\13\26\5\26"+
		"\u01c5\n\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u01cf\n\27\f"+
		"\27\16\27\u01d2\13\27\3\27\3\27\3\30\3\30\3\30\5\30\u01d9\n\30\3\30\3"+
		"\30\3\30\5\30\u01de\n\30\3\30\3\30\5\30\u01e2\n\30\3\30\3\30\3\30\3\30"+
		"\7\30\u01e8\n\30\f\30\16\30\u01eb\13\30\5\30\u01ed\n\30\3\30\5\30\u01f0"+
		"\n\30\3\30\5\30\u01f3\n\30\3\30\5\30\u01f6\n\30\3\30\5\30\u01f9\n\30\5"+
		"\30\u01fb\n\30\3\30\7\30\u01fe\n\30\f\30\16\30\u0201\13\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u020c\n\31\3\31\3\31\5\31\u0210"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u021b\n\32\3\32"+
		"\3\32\3\32\5\32\u0220\n\32\3\33\7\33\u0223\n\33\f\33\16\33\u0226\13\33"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0231\n\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\6#\u023e\n#\r#\16#\u023f\3$\3$\3$\3"+
		"$\5$\u0246\n$\3$\3$\3%\3%\3&\3&\3&\5&\u024f\n&\3&\5&\u0252\n&\3&\3&\3"+
		"\'\3\'\3\'\3\'\7\'\u025a\n\'\f\'\16\'\u025d\13\'\5\'\u025f\n\'\3\'\3\'"+
		"\3(\3(\3(\7(\u0266\n(\f(\16(\u0269\13(\3(\5(\u026c\n(\3(\5(\u026f\n(\3"+
		")\3)\3)\3)\5)\u0275\n)\3)\5)\u0278\n)\3)\3)\5)\u027c\n)\3)\3)\5)\u0280"+
		"\n)\5)\u0282\n)\3*\3*\3*\3*\3*\5*\u0289\n*\3+\3+\3+\3,\3,\3,\3,\3-\3-"+
		"\5-\u0294\n-\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\5\60\u029f\n\60\3\61\3\61"+
		"\5\61\u02a3\n\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\5\63\u02ac\n\63\3"+
		"\63\5\63\u02af\n\63\3\63\3\63\3\63\3\63\7\63\u02b5\n\63\f\63\16\63\u02b8"+
		"\13\63\5\63\u02ba\n\63\3\63\3\63\3\64\5\64\u02bf\n\64\3\64\3\64\3\64\3"+
		"\64\3\64\7\64\u02c6\n\64\f\64\16\64\u02c9\13\64\5\64\u02cb\n\64\3\64\3"+
		"\64\3\64\3\64\5\64\u02d1\n\64\3\64\5\64\u02d4\n\64\3\64\7\64\u02d7\n\64"+
		"\f\64\16\64\u02da\13\64\3\65\3\65\3\65\3\65\5\65\u02e0\n\65\3\66\5\66"+
		"\u02e3\n\66\3\66\3\66\5\66\u02e7\n\66\3\66\3\66\3\66\3\66\5\66\u02ed\n"+
		"\66\3\67\3\67\5\67\u02f1\n\67\3\67\3\67\38\38\38\38\39\39\39\59\u02fc"+
		"\n9\3:\3:\3:\3:\5:\u0302\n:\3:\5:\u0305\n:\3:\3:\5:\u0309\n:\3:\3:\3:"+
		"\7:\u030e\n:\f:\16:\u0311\13:\5:\u0313\n:\3:\3:\3:\5:\u0318\n:\3:\7:\u031b"+
		"\n:\f:\16:\u031e\13:\3;\3;\3;\3;\7;\u0324\n;\f;\16;\u0327\13;\3<\3<\3"+
		"<\3<\5<\u032d\n<\3<\5<\u0330\n<\3<\3<\7<\u0334\n<\f<\16<\u0337\13<\3="+
		"\3=\3=\3=\3=\3=\7=\u033f\n=\f=\16=\u0342\13=\3>\3>\3>\3>\5>\u0348\n>\3"+
		">\3>\7>\u034c\n>\f>\16>\u034f\13>\3?\3?\3?\3?\5?\u0355\n?\3@\7@\u0358"+
		"\n@\f@\16@\u035b\13@\3A\3A\3A\3A\7A\u0361\nA\fA\16A\u0364\13A\5A\u0366"+
		"\nA\3A\3A\3B\3B\3B\5B\u036d\nB\3B\3B\3B\3B\5B\u0373\nB\3B\3B\5B\u0377"+
		"\nB\3B\3B\3B\5B\u037c\nB\3B\3B\5B\u0380\nB\3B\7B\u0383\nB\fB\16B\u0386"+
		"\13B\3C\7C\u0389\nC\fC\16C\u038c\13C\3C\3C\7C\u0390\nC\fC\16C\u0393\13"+
		"C\3C\7C\u0396\nC\fC\16C\u0399\13C\5C\u039b\nC\3C\7C\u039e\nC\fC\16C\u03a1"+
		"\13C\3D\3D\3D\5D\u03a6\nD\3E\3E\3E\3E\3F\3F\3F\7F\u03af\nF\fF\16F\u03b2"+
		"\13F\3G\3G\3G\3G\5G\u03b8\nG\3G\3G\3H\3H\5H\u03be\nH\7H\u03c0\nH\fH\16"+
		"H\u03c3\13H\3I\3I\3I\3I\5I\u03c9\nI\3I\3I\5I\u03cd\nI\3I\3I\3J\3J\3J\3"+
		"J\3J\3J\7J\u03d7\nJ\fJ\16J\u03da\13J\3J\3J\5J\u03de\nJ\3K\3K\3K\7K\u03e3"+
		"\nK\fK\16K\u03e6\13K\3K\5K\u03e9\nK\3L\3L\3L\5L\u03ee\nL\3L\3L\3L\3L\3"+
		"L\3L\3M\3M\3M\3N\3N\3N\5N\u03fc\nN\3O\3O\3O\5O\u0401\nO\3O\3O\5O\u0405"+
		"\nO\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R"+
		"\7R\u041d\nR\fR\16R\u0420\13R\3S\3S\3S\7S\u0425\nS\fS\16S\u0428\13S\3"+
		"T\3T\3T\7T\u042d\nT\fT\16T\u0430\13T\3U\3U\3U\3U\7U\u0436\nU\fU\16U\u0439"+
		"\13U\3V\3V\3V\3V\7V\u043f\nV\fV\16V\u0442\13V\3W\3W\3W\3W\7W\u0448\nW"+
		"\fW\16W\u044b\13W\3W\3W\3W\3W\5W\u0451\nW\5W\u0453\nW\3X\3X\3X\7X\u0458"+
		"\nX\fX\16X\u045b\13X\3Y\3Y\3Y\7Y\u0460\nY\fY\16Y\u0463\13Y\3Z\3Z\3Z\7"+
		"Z\u0468\nZ\fZ\16Z\u046b\13Z\3[\3[\3[\3[\7[\u0471\n[\f[\16[\u0474\13[\3"+
		"\\\3\\\3\\\3\\\7\\\u047a\n\\\f\\\16\\\u047d\13\\\3]\3]\3]\3]\7]\u0483"+
		"\n]\f]\16]\u0486\13]\3^\7^\u0489\n^\f^\16^\u048c\13^\3^\3^\3_\3_\3_\5"+
		"_\u0493\n_\3_\3_\7_\u0497\n_\f_\16_\u049a\13_\3_\3_\7_\u049e\n_\f_\16"+
		"_\u04a1\13_\5_\u04a3\n_\3`\3`\7`\u04a7\n`\f`\16`\u04aa\13`\5`\u04ac\n"+
		"`\3`\5`\u04af\n`\3`\3`\3`\5`\u04b4\n`\3`\5`\u04b7\n`\3a\3a\3b\3b\3b\3"+
		"b\3b\3b\3b\3b\7b\u04c3\nb\fb\16b\u04c6\13b\3b\3b\3b\3b\3b\3b\3b\3b\7b"+
		"\u04d0\nb\fb\16b\u04d3\13b\3b\5b\u04d6\nb\3c\3c\3c\3c\3c\3c\3c\3c\5c\u04e0"+
		"\nc\3c\3c\3c\3c\3c\5c\u04e7\nc\3c\5c\u04ea\nc\3c\3c\3c\3c\3c\3c\3c\3c"+
		"\3c\3c\5c\u04f6\nc\3d\3d\3d\3d\3d\3d\3d\5d\u04ff\nd\3e\3e\3e\3e\5e\u0505"+
		"\ne\3f\3f\5f\u0509\nf\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3n\3n"+
		"\3o\3o\3o\3o\3o\3o\3o\5o\u0522\no\3p\3p\3p\3p\3p\3p\3p\3p\5p\u052c\np"+
		"\3q\3q\7q\u0530\nq\fq\16q\u0533\13q\3q\5q\u0536\nq\3q\3q\3r\3r\3r\5r\u053d"+
		"\nr\5r\u053f\nr\3s\3s\3s\3s\3s\3s\3s\3s\7s\u0549\ns\fs\16s\u054c\13s\5"+
		"s\u054e\ns\3s\3s\3s\3s\5s\u0554\ns\3t\3t\3t\5t\u0559\nt\3u\3u\3u\3u\7"+
		"u\u055f\nu\fu\16u\u0562\13u\5u\u0564\nu\3u\3u\3v\3v\3v\3v\3v\7v\u056d"+
		"\nv\fv\16v\u0570\13v\5v\u0572\nv\3v\3v\3w\3w\3w\3w\3w\5w\u057b\nw\3w\3"+
		"w\7w\u057f\nw\fw\16w\u0582\13w\3w\3w\3x\3x\3x\7x\u0589\nx\fx\16x\u058c"+
		"\13x\3x\3x\3x\7x\u0591\nx\fx\16x\u0594\13x\3x\3x\3x\3x\7x\u059a\nx\fx"+
		"\16x\u059d\13x\5x\u059f\nx\3y\3y\3y\3y\3y\5y\u05a6\ny\3z\3z\5z\u05aa\n"+
		"z\3z\3z\3z\7z\u05af\nz\fz\16z\u05b2\13z\5z\u05b4\nz\3z\5z\u05b7\nz\3z"+
		"\3z\3z\3z\3z\2\2{\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"+
		"\u00ea\u00ec\u00ee\u00f0\u00f2\2\26\3\2?@\4\2\27\27BB\3\2GJ\3\2NQ\3\2"+
		"KM\3\2RV\4\2..WW\4\2EFY]\3\2ef\7\2\17\17NNhhkkvv\3\2yy\3\2~~\4\2\21\21"+
		"*+\3\2,-\3\2./\4\2\33\33\62\63\3\2\60\61\3\2\23\26\4\2\30\30\32\32\4\2"+
		"\27\27\648\u063e\2\u00f4\3\2\2\2\4\u00fc\3\2\2\2\6\u0104\3\2\2\2\b\u0113"+
		"\3\2\2\2\n\u012d\3\2\2\2\f\u0136\3\2\2\2\16\u0139\3\2\2\2\20\u013b\3\2"+
		"\2\2\22\u0146\3\2\2\2\24\u014c\3\2\2\2\26\u0162\3\2\2\2\30\u0165\3\2\2"+
		"\2\32\u016c\3\2\2\2\34\u018b\3\2\2\2\36\u018f\3\2\2\2 \u019d\3\2\2\2\""+
		"\u019f\3\2\2\2$\u01ad\3\2\2\2&\u01b6\3\2\2\2(\u01b8\3\2\2\2*\u01bb\3\2"+
		"\2\2,\u01ca\3\2\2\2.\u01d5\3\2\2\2\60\u020f\3\2\2\2\62\u021f\3\2\2\2\64"+
		"\u0224\3\2\2\2\66\u0227\3\2\2\28\u0230\3\2\2\2:\u0232\3\2\2\2<\u0234\3"+
		"\2\2\2>\u0236\3\2\2\2@\u0238\3\2\2\2B\u023a\3\2\2\2D\u023d\3\2\2\2F\u0241"+
		"\3\2\2\2H\u0249\3\2\2\2J\u024e\3\2\2\2L\u0255\3\2\2\2N\u0262\3\2\2\2P"+
		"\u0281\3\2\2\2R\u0283\3\2\2\2T\u028a\3\2\2\2V\u028d\3\2\2\2X\u0293\3\2"+
		"\2\2Z\u0295\3\2\2\2\\\u0298\3\2\2\2^\u029e\3\2\2\2`\u02a0\3\2\2\2b\u02a6"+
		"\3\2\2\2d\u02ae\3\2\2\2f\u02be\3\2\2\2h\u02df\3\2\2\2j\u02ec\3\2\2\2l"+
		"\u02ee\3\2\2\2n\u02f4\3\2\2\2p\u02fb\3\2\2\2r\u02fd\3\2\2\2t\u031f\3\2"+
		"\2\2v\u0328\3\2\2\2x\u0338\3\2\2\2z\u0343\3\2\2\2|\u0354\3\2\2\2~\u0359"+
		"\3\2\2\2\u0080\u035c\3\2\2\2\u0082\u0369\3\2\2\2\u0084\u038a\3\2\2\2\u0086"+
		"\u03a5\3\2\2\2\u0088\u03a7\3\2\2\2\u008a\u03ab\3\2\2\2\u008c\u03b3\3\2"+
		"\2\2\u008e\u03c1\3\2\2\2\u0090\u03c4\3\2\2\2\u0092\u03d0\3\2\2\2\u0094"+
		"\u03df\3\2\2\2\u0096\u03ea\3\2\2\2\u0098\u03f5\3\2\2\2\u009a\u03fb\3\2"+
		"\2\2\u009c\u03fd\3\2\2\2\u009e\u040b\3\2\2\2\u00a0\u0411\3\2\2\2\u00a2"+
		"\u0418\3\2\2\2\u00a4\u0421\3\2\2\2\u00a6\u0429\3\2\2\2\u00a8\u0431\3\2"+
		"\2\2\u00aa\u043a\3\2\2\2\u00ac\u0452\3\2\2\2\u00ae\u0454\3\2\2\2\u00b0"+
		"\u045c\3\2\2\2\u00b2\u0464\3\2\2\2\u00b4\u046c\3\2\2\2\u00b6\u0475\3\2"+
		"\2\2\u00b8\u047e\3\2\2\2\u00ba\u048a\3\2\2\2\u00bc\u04a2\3\2\2\2\u00be"+
		"\u04ae\3\2\2\2\u00c0\u04b8\3\2\2\2\u00c2\u04d5\3\2\2\2\u00c4\u04f5\3\2"+
		"\2\2\u00c6\u04fe\3\2\2\2\u00c8\u0504\3\2\2\2\u00ca\u0508\3\2\2\2\u00cc"+
		"\u050a\3\2\2\2\u00ce\u050c\3\2\2\2\u00d0\u050e\3\2\2\2\u00d2\u0510\3\2"+
		"\2\2\u00d4\u0512\3\2\2\2\u00d6\u0514\3\2\2\2\u00d8\u0516\3\2\2\2\u00da"+
		"\u0518\3\2\2\2\u00dc\u0521\3\2\2\2\u00de\u052b\3\2\2\2\u00e0\u0531\3\2"+
		"\2\2\u00e2\u053e\3\2\2\2\u00e4\u0553\3\2\2\2\u00e6\u0555\3\2\2\2\u00e8"+
		"\u055a\3\2\2\2\u00ea\u0567\3\2\2\2\u00ec\u0575\3\2\2\2\u00ee\u059e\3\2"+
		"\2\2\u00f0\u05a5\3\2\2\2\u00f2\u05a7\3\2\2\2\u00f4\u00f8\5\4\3\2\u00f5"+
		"\u00f7\5\n\6\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f8\u00f9\3\2\2\2\u00f9\3\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd"+
		"\5\6\4\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0101\3\2\2\2\u00fe"+
		"\u0100\5\b\5\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102\5\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105"+
		"\7\16\2\2\u0105\u010a\5\u00c0a\2\u0106\u0107\7\20\2\2\u0107\u0109\5\u00c0"+
		"a\2\u0108\u0106\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u0110\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010f\7\7"+
		"\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\7\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7\17\2"+
		"\2\u0114\u0119\5\u00c0a\2\u0115\u0116\7\20\2\2\u0116\u0118\5\u00c0a\2"+
		"\u0117\u0115\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a"+
		"\3\2\2\2\u011a\u0120\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\7\20\2\2"+
		"\u011d\u0121\7\21\2\2\u011e\u011f\7\62\2\2\u011f\u0121\7v\2\2\u0120\u011c"+
		"\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0125\3\2\2\2\u0122"+
		"\u0124\7\7\2\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0125\u0126\3\2\2\2\u0126\t\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012e"+
		"\5.\30\2\u0129\u012e\5\u0082B\2\u012a\u012e\5r:\2\u012b\u012e\5v<\2\u012c"+
		"\u012e\5x=\2\u012d\u0128\3\2\2\2\u012d\u0129\3\2\2\2\u012d\u012a\3\2\2"+
		"\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e\13\3\2\2\2\u012f\u0137"+
		"\5z>\2\u0130\u0137\5v<\2\u0131\u0137\5\u0082B\2\u0132\u0137\5.\30\2\u0133"+
		"\u0137\5r:\2\u0134\u0137\5\u008aF\2\u0135\u0137\5f\64\2\u0136\u012f\3"+
		"\2\2\2\u0136\u0130\3\2\2\2\u0136\u0131\3\2\2\2\u0136\u0132\3\2\2\2\u0136"+
		"\u0133\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137\r\3\2\2\2"+
		"\u0138\u013a\5B\"\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\17\3"+
		"\2\2\2\u013b\u013c\7\23\2\2\u013c\u0141\5\22\n\2\u013d\u013e\7\22\2\2"+
		"\u013e\u0140\5\22\n\2\u013f\u013d\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f"+
		"\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144"+
		"\u0145\7\25\2\2\u0145\21\3\2\2\2\u0146\u0147\5\64\33\2\u0147\u014a\7v"+
		"\2\2\u0148\u0149\7\33\2\2\u0149\u014b\5\36\20\2\u014a\u0148\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\23\3\2\2\2\u014c\u014e\7\23\2\2\u014d\u014f\5\32"+
		"\16\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0154\3\2\2\2\u0150"+
		"\u0151\7\22\2\2\u0151\u0153\5\32\16\2\u0152\u0150\3\2\2\2\u0153\u0156"+
		"\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0157\u0158\7\25\2\2\u0158\25\3\2\2\2\u0159\u015a\7D\2"+
		"\2\u015a\u015f\5\30\r\2\u015b\u015c\7\22\2\2\u015c\u015e\5\30\r\2\u015d"+
		"\u015b\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2"+
		"\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0159\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\27\3\2\2\2\u0164\u0166\5D#\2\u0165\u0164\3\2\2\2"+
		"\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\7v\2\2\u0168\u0169"+
		"\7\33\2\2\u0169\u016a\5\32\16\2\u016a\31\3\2\2\2\u016b\u016d\5D#\2\u016c"+
		"\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\5\34"+
		"\17\2\u016f\33\3\2\2\2\u0170\u0171\7\34\2\2\u0171\u0172\5\34\17\2\u0172"+
		"\u0174\7\35\2\2\u0173\u0175\7\36\2\2\u0174\u0173\3\2\2\2\u0174\u0175\3"+
		"\2\2\2\u0175\u0177\3\2\2\2\u0176\u0178\5(\25\2\u0177\u0176\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u018c\3\2\2\2\u0179\u017b\5*\26\2\u017a\u017c\5("+
		"\25\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u018c\3\2\2\2\u017d"+
		"\u017f\5\36\20\2\u017e\u0180\7\36\2\2\u017f\u017e\3\2\2\2\u017f\u0180"+
		"\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u0183\5(\25\2\u0182\u0181\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u018c\3\2\2\2\u0184\u0186\7C\2\2\u0185\u0187\7\36"+
		"\2\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189\3\2\2\2\u0188"+
		"\u018a\5(\25\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2"+
		"\2\2\u018b\u0170\3\2\2\2\u018b\u0179\3\2\2\2\u018b\u017d\3\2\2\2\u018b"+
		"\u0184\3\2\2\2\u018c\35\3\2\2\2\u018d\u018e\7\16\2\2\u018e\u0190\7\20"+
		"\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0196\5\"\22\2\u0192\u0193\7\20\2\2\u0193\u0195\5\"\22\2\u0194\u0192"+
		"\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\37\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019e\7\21\2\2\u019a\u019b\5\16"+
		"\b\2\u019b\u019c\5\32\16\2\u019c\u019e\3\2\2\2\u019d\u0199\3\2\2\2\u019d"+
		"\u019a\3\2\2\2\u019e!\3\2\2\2\u019f\u01ab\7v\2\2\u01a0\u01a1\7\23\2\2"+
		"\u01a1\u01a6\5 \21\2\u01a2\u01a3\7\22\2\2\u01a3\u01a5\5 \21\2\u01a4\u01a2"+
		"\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01a9\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa\7\25\2\2\u01aa\u01ac\3"+
		"\2\2\2\u01ab\u01a0\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac#\3\2\2\2\u01ad\u01b0"+
		"\7v\2\2\u01ae\u01af\7\33\2\2\u01af\u01b1\5\32\16\2\u01b0\u01ae\3\2\2\2"+
		"\u01b0\u01b1\3\2\2\2\u01b1%\3\2\2\2\u01b2\u01b7\5V,\2\u01b3\u01b4\5\64"+
		"\33\2\u01b4\u01b5\5\32\16\2\u01b5\u01b7\3\2\2\2\u01b6\u01b2\3\2\2\2\u01b6"+
		"\u01b3\3\2\2\2\u01b7\'\3\2\2\2\u01b8\u01b9\7\20\2\2\u01b9\u01ba\5*\26"+
		"\2\u01ba)\3\2\2\2\u01bb\u01c4\7\34\2\2\u01bc\u01c1\5&\24\2\u01bd\u01be"+
		"\7\22\2\2\u01be\u01c0\5&\24\2\u01bf\u01bd\3\2\2\2\u01c0\u01c3\3\2\2\2"+
		"\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1"+
		"\3\2\2\2\u01c4\u01bc\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u01c7\7\35\2\2\u01c7\u01c8\7)\2\2\u01c8\u01c9\5\32\16\2\u01c9+\3\2\2"+
		"\2\u01ca\u01cb\7\34\2\2\u01cb\u01d0\5$\23\2\u01cc\u01cd\7\22\2\2\u01cd"+
		"\u01cf\5$\23\2\u01ce\u01cc\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2"+
		"\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3"+
		"\u01d4\7\35\2\2\u01d4-\3\2\2\2\u01d5\u01d6\5\64\33\2\u01d6\u01d8\t\2\2"+
		"\2\u01d7\u01d9\5\20\t\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		"\u01dd\3\2\2\2\u01da\u01db\5\32\16\2\u01db\u01dc\7\20\2\2\u01dc\u01de"+
		"\3\2\2\2\u01dd\u01da\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e1\3\2\2\2\u01df"+
		"\u01e2\5,\27\2\u01e0\u01e2\5$\23\2\u01e1\u01df\3\2\2\2\u01e1\u01e0\3\2"+
		"\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01ec\5\26\f\2\u01e4\u01e5\t\3\2\2\u01e5"+
		"\u01e9\5\u00a2R\2\u01e6\u01e8\7\7\2\2\u01e7\u01e6\3\2\2\2\u01e8\u01eb"+
		"\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb"+
		"\u01e9\3\2\2\2\u01ec\u01e4\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01fa\3\2"+
		"\2\2\u01ee\u01f0\5\60\31\2\u01ef\u01ee\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"\u01f2\3\2\2\2\u01f1\u01f3\5\62\32\2\u01f2\u01f1\3\2\2\2\u01f2\u01f3\3"+
		"\2\2\2\u01f3\u01fb\3\2\2\2\u01f4\u01f6\5\62\32\2\u01f5\u01f4\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01f9\5\60\31\2\u01f8\u01f7\3"+
		"\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01ef\3\2\2\2\u01fa"+
		"\u01f5\3\2\2\2\u01fb\u01ff\3\2\2\2\u01fc\u01fe\7\7\2\2\u01fd\u01fc\3\2"+
		"\2\2\u01fe\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200"+
		"/\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\u0203\5\64\33\2\u0203\u0204\7E\2\2"+
		"\u0204\u0210\3\2\2\2\u0205\u0206\5\64\33\2\u0206\u0207\7E\2\2\u0207\u0208"+
		"\7\34\2\2\u0208\u020b\7\35\2\2\u0209\u020a\7\33\2\2\u020a\u020c\5\32\16"+
		"\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e"+
		"\5\u0086D\2\u020e\u0210\3\2\2\2\u020f\u0202\3\2\2\2\u020f\u0205\3\2\2"+
		"\2\u0210\61\3\2\2\2\u0211\u0212\5\64\33\2\u0212\u0213\7F\2\2\u0213\u0220"+
		"\3\2\2\2\u0214\u0215\5\64\33\2\u0215\u0216\7F\2\2\u0216\u0217\7\34\2\2"+
		"\u0217\u021a\5\64\33\2\u0218\u021b\7v\2\2\u0219\u021b\5V,\2\u021a\u0218"+
		"\3\2\2\2\u021a\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d\7\35\2\2"+
		"\u021d\u021e\5\u0086D\2\u021e\u0220\3\2\2\2\u021f\u0211\3\2\2\2\u021f"+
		"\u0214\3\2\2\2\u0220\63\3\2\2\2\u0221\u0223\5\66\34\2\u0222\u0221\3\2"+
		"\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225"+
		"\65\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u0228\58\35\2\u0228\67\3\2\2\2\u0229"+
		"\u0231\5:\36\2\u022a\u0231\5@!\2\u022b\u0231\5B\"\2\u022c\u0231\5D#\2"+
		"\u022d\u0231\5<\37\2\u022e\u0231\5> \2\u022f\u0231\7A\2\2\u0230\u0229"+
		"\3\2\2\2\u0230\u022a\3\2\2\2\u0230\u022b\3\2\2\2\u0230\u022c\3\2\2\2\u0230"+
		"\u022d\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u022f\3\2\2\2\u02319\3\2\2\2"+
		"\u0232\u0233\t\4\2\2\u0233;\3\2\2\2\u0234\u0235\t\5\2\2\u0235=\3\2\2\2"+
		"\u0236\u0237\t\6\2\2\u0237?\3\2\2\2\u0238\u0239\t\7\2\2\u0239A\3\2\2\2"+
		"\u023a\u023b\t\b\2\2\u023bC\3\2\2\2\u023c\u023e\5F$\2\u023d\u023c\3\2"+
		"\2\2\u023e\u023f\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240"+
		"E\3\2\2\2\u0241\u0245\7X\2\2\u0242\u0243\5H%\2\u0243\u0244\7\33\2\2\u0244"+
		"\u0246\3\2\2\2\u0245\u0242\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247\3\2"+
		"\2\2\u0247\u0248\5N(\2\u0248G\3\2\2\2\u0249\u024a\t\t\2\2\u024aI\3\2\2"+
		"\2\u024b\u024c\5\u00c0a\2\u024c\u024d\7\27\2\2\u024d\u024f\3\2\2\2\u024e"+
		"\u024b\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0251\3\2\2\2\u0250\u0252\7\21"+
		"\2\2\u0251\u0250\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\3\2\2\2\u0253"+
		"\u0254\5\u00a2R\2\u0254K\3\2\2\2\u0255\u025e\7\34\2\2\u0256\u025b\5J&"+
		"\2\u0257\u0258\7\22\2\2\u0258\u025a\5J&\2\u0259\u0257\3\2\2\2\u025a\u025d"+
		"\3\2\2\2\u025b\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025f\3\2\2\2\u025d"+
		"\u025b\3\2\2\2\u025e\u0256\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260\3\2"+
		"\2\2\u0260\u0261\7\35\2\2\u0261M\3\2\2\2\u0262\u0267\5\u00c0a\2\u0263"+
		"\u0264\7\20\2\2\u0264\u0266\5\u00c0a\2\u0265\u0263\3\2\2\2\u0266\u0269"+
		"\3\2\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u026b\3\2\2\2\u0269"+
		"\u0267\3\2\2\2\u026a\u026c\5\24\13\2\u026b\u026a\3\2\2\2\u026b\u026c\3"+
		"\2\2\2\u026c\u026e\3\2\2\2\u026d\u026f\5L\'\2\u026e\u026d\3\2\2\2\u026e"+
		"\u026f\3\2\2\2\u026fO\3\2\2\2\u0270\u0271\7^\2\2\u0271\u0282\5\u00a2R"+
		"\2\u0272\u0274\7`\2\2\u0273\u0275\5R*\2\u0274\u0273\3\2\2\2\u0274\u0275"+
		"\3\2\2\2\u0275\u0277\3\2\2\2\u0276\u0278\5\u00a2R\2\u0277\u0276\3\2\2"+
		"\2\u0277\u0278\3\2\2\2\u0278\u0282\3\2\2\2\u0279\u027b\7_\2\2\u027a\u027c"+
		"\5R*\2\u027b\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u0282\3\2\2\2\u027d"+
		"\u027f\7a\2\2\u027e\u0280\5R*\2\u027f\u027e\3\2\2\2\u027f\u0280\3\2\2"+
		"\2\u0280\u0282\3\2\2\2\u0281\u0270\3\2\2\2\u0281\u0272\3\2\2\2\u0281\u0279"+
		"\3\2\2\2\u0281\u027d\3\2\2\2\u0282Q\3\2\2\2\u0283\u0288\7X\2\2\u0284\u0289"+
		"\5\u00c0a\2\u0285\u0289\7p\2\2\u0286\u0289\7o\2\2\u0287\u0289\7n\2\2\u0288"+
		"\u0284\3\2\2\2\u0288\u0285\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0287\3\2"+
		"\2\2\u0289S\3\2\2\2\u028a\u028b\5\u00c0a\2\u028b\u028c\7X\2\2\u028cU\3"+
		"\2\2\2\u028d\u028e\7v\2\2\u028e\u028f\7\33\2\2\u028f\u0290\5\32\16\2\u0290"+
		"W\3\2\2\2\u0291\u0294\5Z.\2\u0292\u0294\5\\/\2\u0293\u0291\3\2\2\2\u0293"+
		"\u0292\3\2\2\2\u0294Y\3\2\2\2\u0295\u0296\5\64\33\2\u0296\u0297\5V,\2"+
		"\u0297[\3\2\2\2\u0298\u0299\5Z.\2\u0299\u029a\7\27\2\2\u029a\u029b\5\u00a2"+
		"R\2\u029b]\3\2\2\2\u029c\u029f\5`\61\2\u029d\u029f\5b\62\2\u029e\u029c"+
		"\3\2\2\2\u029e\u029d\3\2\2\2\u029f_\3\2\2\2\u02a0\u02a2\5\64\33\2\u02a1"+
		"\u02a3\t\2\2\2\u02a2\u02a1\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\3\2"+
		"\2\2\u02a4\u02a5\5V,\2\u02a5a\3\2\2\2\u02a6\u02a7\5`\61\2\u02a7\u02a8"+
		"\7\27\2\2\u02a8\u02a9\5\u00a2R\2\u02a9c\3\2\2\2\u02aa\u02ac\5@!\2\u02ab"+
		"\u02aa\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02af\7b"+
		"\2\2\u02ae\u02ab\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0"+
		"\u02b9\7\34\2\2\u02b1\u02b6\5^\60\2\u02b2\u02b3\7\22\2\2\u02b3\u02b5\5"+
		"^\60\2\u02b4\u02b2\3\2\2\2\u02b5\u02b8\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b6"+
		"\u02b7\3\2\2\2\u02b7\u02ba\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b9\u02b1\3\2"+
		"\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\7\35\2\2\u02bc"+
		"e\3\2\2\2\u02bd\u02bf\5@!\2\u02be\u02bd\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf"+
		"\u02c0\3\2\2\2\u02c0\u02c1\7b\2\2\u02c1\u02ca\7\34\2\2\u02c2\u02c7\5^"+
		"\60\2\u02c3\u02c4\7\22\2\2\u02c4\u02c6\5^\60\2\u02c5\u02c3\3\2\2\2\u02c6"+
		"\u02c9\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02cb\3\2"+
		"\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02c2\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb"+
		"\u02cc\3\2\2\2\u02cc\u02cd\7\35\2\2\u02cd\u02d0\3\2\2\2\u02ce\u02cf\7"+
		"\33\2\2\u02cf\u02d1\5h\65\2\u02d0\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1"+
		"\u02d3\3\2\2\2\u02d2\u02d4\5\u0088E\2\u02d3\u02d2\3\2\2\2\u02d3\u02d4"+
		"\3\2\2\2\u02d4\u02d8\3\2\2\2\u02d5\u02d7\7\7\2\2\u02d6\u02d5\3\2\2\2\u02d7"+
		"\u02da\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9g\3\2\2\2"+
		"\u02da\u02d8\3\2\2\2\u02db\u02dc\7c\2\2\u02dc\u02e0\5L\'\2\u02dd\u02de"+
		"\7d\2\2\u02de\u02e0\5L\'\2\u02df\u02db\3\2\2\2\u02df\u02dd\3\2\2\2\u02e0"+
		"i\3\2\2\2\u02e1\u02e3\5\24\13\2\u02e2\u02e1\3\2\2\2\u02e2\u02e3\3\2\2"+
		"\2\u02e3\u02e4\3\2\2\2\u02e4\u02e6\5L\'\2\u02e5\u02e7\5\u00e0q\2\u02e6"+
		"\u02e5\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02ed\3\2\2\2\u02e8\u02e9\5\24"+
		"\13\2\u02e9\u02ea\5\u00e0q\2\u02ea\u02ed\3\2\2\2\u02eb\u02ed\5\u00e0q"+
		"\2\u02ec\u02e2\3\2\2\2\u02ec\u02e8\3\2\2\2\u02ec\u02eb\3\2\2\2\u02edk"+
		"\3\2\2\2\u02ee\u02f0\5\36\20\2\u02ef\u02f1\5\24\13\2\u02f0\u02ef\3\2\2"+
		"\2\u02f0\u02f1\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\5L\'\2\u02f3m\3"+
		"\2\2\2\u02f4\u02f5\5\36\20\2\u02f5\u02f6\7B\2\2\u02f6\u02f7\5\u00a2R\2"+
		"\u02f7o\3\2\2\2\u02f8\u02fc\5l\67\2\u02f9\u02fc\5\36\20\2\u02fa\u02fc"+
		"\5n8\2\u02fb\u02f8\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fa\3\2\2\2\u02fc"+
		"q\3\2\2\2\u02fd\u02fe\5\64\33\2\u02fe\u02ff\t\n\2\2\u02ff\u0301\7v\2\2"+
		"\u0300\u0302\5\20\t\2\u0301\u0300\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0304"+
		"\3\2\2\2\u0303\u0305\5d\63\2\u0304\u0303\3\2\2\2\u0304\u0305\3\2\2\2\u0305"+
		"\u0312\3\2\2\2\u0306\u0308\7\33\2\2\u0307\u0309\5D#\2\u0308\u0307\3\2"+
		"\2\2\u0308\u0309\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030f\5p9\2\u030b\u030c"+
		"\7\22\2\2\u030c\u030e\5p9\2\u030d\u030b\3\2\2\2\u030e\u0311\3\2\2\2\u030f"+
		"\u030d\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0313\3\2\2\2\u0311\u030f\3\2"+
		"\2\2\u0312\u0306\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0314\3\2\2\2\u0314"+
		"\u0317\5\26\f\2\u0315\u0318\5|?\2\u0316\u0318\5\u008cG\2\u0317\u0315\3"+
		"\2\2\2\u0317\u0316\3\2\2\2\u0318\u031c\3\2\2\2\u0319\u031b\7\7\2\2\u031a"+
		"\u0319\3\2\2\2\u031b\u031e\3\2\2\2\u031c\u031a\3\2\2\2\u031c\u031d\3\2"+
		"\2\2\u031ds\3\2\2\2\u031e\u031c\3\2\2\2\u031f\u0320\7\33\2\2\u0320\u0325"+
		"\5p9\2\u0321\u0322\7\22\2\2\u0322\u0324\5p9\2\u0323\u0321\3\2\2\2\u0324"+
		"\u0327\3\2\2\2\u0325\u0323\3\2\2\2\u0325\u0326\3\2\2\2\u0326u\3\2\2\2"+
		"\u0327\u0325\3\2\2\2\u0328\u0329\5\64\33\2\u0329\u032a\7g\2\2\u032a\u032c"+
		"\7v\2\2\u032b\u032d\5d\63\2\u032c\u032b\3\2\2\2\u032c\u032d\3\2\2\2\u032d"+
		"\u032f\3\2\2\2\u032e\u0330\5t;\2\u032f\u032e\3\2\2\2\u032f\u0330\3\2\2"+
		"\2\u0330\u0331\3\2\2\2\u0331\u0335\5|?\2\u0332\u0334\7\7\2\2\u0333\u0332"+
		"\3\2\2\2\u0334\u0337\3\2\2\2\u0335\u0333\3\2\2\2\u0335\u0336\3\2\2\2\u0336"+
		"w\3\2\2\2\u0337\u0335\3\2\2\2\u0338\u0339\5\64\33\2\u0339\u033a\7j\2\2"+
		"\u033a\u033b\7v\2\2\u033b\u033c\7\27\2\2\u033c\u0340\5\"\22\2\u033d\u033f"+
		"\7\7\2\2\u033e\u033d\3\2\2\2\u033f\u0342\3\2\2\2\u0340\u033e\3\2\2\2\u0340"+
		"\u0341\3\2\2\2\u0341y\3\2\2\2\u0342\u0340\3\2\2\2\u0343\u0344\5\64\33"+
		"\2\u0344\u0345\7h\2\2\u0345\u0347\7g\2\2\u0346\u0348\5t;\2\u0347\u0346"+
		"\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034d\5|?\2\u034a"+
		"\u034c\7\7\2\2\u034b\u034a\3\2\2\2\u034c\u034f\3\2\2\2\u034d\u034b\3\2"+
		"\2\2\u034d\u034e\3\2\2\2\u034e{\3\2\2\2\u034f\u034d\3\2\2\2\u0350\u0351"+
		"\7\b\2\2\u0351\u0352\5~@\2\u0352\u0353\7\t\2\2\u0353\u0355\3\2\2\2\u0354"+
		"\u0350\3\2\2\2\u0354\u0355\3\2\2\2\u0355}\3\2\2\2\u0356\u0358\5\f\7\2"+
		"\u0357\u0356\3\2\2\2\u0358\u035b\3\2\2\2\u0359\u0357\3\2\2\2\u0359\u035a"+
		"\3\2\2\2\u035a\177\3\2\2\2\u035b\u0359\3\2\2\2\u035c\u0365\7\34\2\2\u035d"+
		"\u0362\5X-\2\u035e\u035f\7\22\2\2\u035f\u0361\5X-\2\u0360\u035e\3\2\2"+
		"\2\u0361\u0364\3\2\2\2\u0362\u0360\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0366"+
		"\3\2\2\2\u0364\u0362\3\2\2\2\u0365\u035d\3\2\2\2\u0365\u0366\3\2\2\2\u0366"+
		"\u0367\3\2\2\2\u0367\u0368\7\35\2\2\u0368\u0081\3\2\2\2\u0369\u036a\5"+
		"\64\33\2\u036a\u036c\7i\2\2\u036b\u036d\5\20\t\2\u036c\u036b\3\2\2\2\u036c"+
		"\u036d\3\2\2\2\u036d\u0372\3\2\2\2\u036e\u036f\5\32\16\2\u036f\u0370\7"+
		"\20\2\2\u0370\u0373\3\2\2\2\u0371\u0373\5D#\2\u0372\u036e\3\2\2\2\u0372"+
		"\u0371\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0376\7v"+
		"\2\2\u0375\u0377\5\20\t\2\u0376\u0375\3\2\2\2\u0376\u0377\3\2\2\2\u0377"+
		"\u0378\3\2\2\2\u0378\u037b\5\u0080A\2\u0379\u037a\7\33\2\2\u037a\u037c"+
		"\5\32\16\2\u037b\u0379\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037d\3\2\2\2"+
		"\u037d\u037f\5\26\f\2\u037e\u0380\5\u0086D\2\u037f\u037e\3\2\2\2\u037f"+
		"\u0380\3\2\2\2\u0380\u0384\3\2\2\2\u0381\u0383\7\7\2\2\u0382\u0381\3\2"+
		"\2\2\u0383\u0386\3\2\2\2\u0384\u0382\3\2\2\2\u0384\u0385\3\2\2\2\u0385"+
		"\u0083\3\2\2\2\u0386\u0384\3\2\2\2\u0387\u0389\7\7\2\2\u0388\u0387\3\2"+
		"\2\2\u0389\u038c\3\2\2\2\u038a\u0388\3\2\2\2\u038a\u038b\3\2\2\2\u038b"+
		"\u039a\3\2\2\2\u038c\u038a\3\2\2\2\u038d\u0397\5\u00caf\2\u038e\u0390"+
		"\7\7\2\2\u038f\u038e\3\2\2\2\u0390\u0393\3\2\2\2\u0391\u038f\3\2\2\2\u0391"+
		"\u0392\3\2\2\2\u0392\u0394\3\2\2\2\u0393\u0391\3\2\2\2\u0394\u0396\5\u00ca"+
		"f\2\u0395\u0391\3\2\2\2\u0396\u0399\3\2\2\2\u0397\u0395\3\2\2\2\u0397"+
		"\u0398\3\2\2\2\u0398\u039b\3\2\2\2\u0399\u0397\3\2\2\2\u039a\u038d\3\2"+
		"\2\2\u039a\u039b\3\2\2\2\u039b\u039f\3\2\2\2\u039c\u039e\7\7\2\2\u039d"+
		"\u039c\3\2\2\2\u039e\u03a1\3\2\2\2\u039f\u039d\3\2\2\2\u039f\u03a0\3\2"+
		"\2\2\u03a0\u0085\3\2\2\2\u03a1\u039f\3\2\2\2\u03a2\u03a6\5\u0088E\2\u03a3"+
		"\u03a4\7\27\2\2\u03a4\u03a6\5\u00a2R\2\u03a5\u03a2\3\2\2\2\u03a5\u03a3"+
		"\3\2\2\2\u03a6\u0087\3\2\2\2\u03a7\u03a8\7\b\2\2\u03a8\u03a9\5\u0084C"+
		"\2\u03a9\u03aa\7\t\2\2\u03aa\u0089\3\2\2\2\u03ab\u03ac\7k\2\2\u03ac\u03b0"+
		"\5\u0088E\2\u03ad\u03af\7\7\2\2\u03ae\u03ad\3\2\2\2\u03af\u03b2\3\2\2"+
		"\2\u03b0\u03ae\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u008b\3\2\2\2\u03b2\u03b0"+
		"\3\2\2\2\u03b3\u03b4\7\b\2\2\u03b4\u03b7\5\u008eH\2\u03b5\u03b6\7\7\2"+
		"\2\u03b6\u03b8\5~@\2\u03b7\u03b5\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03b9"+
		"\3\2\2\2\u03b9\u03ba\7\t\2\2\u03ba\u008d\3\2\2\2\u03bb\u03bd\5\u0090I"+
		"\2\u03bc\u03be\7\22\2\2\u03bd\u03bc\3\2\2\2\u03bd\u03be\3\2\2\2\u03be"+
		"\u03c0\3\2\2\2\u03bf\u03bb\3\2\2\2\u03c0\u03c3\3\2\2\2\u03c1\u03bf\3\2"+
		"\2\2\u03c1\u03c2\3\2\2\2\u03c2\u008f\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c4"+
		"\u03c5\5\64\33\2\u03c5\u03cc\7v\2\2\u03c6\u03c8\7\33\2\2\u03c7\u03c9\5"+
		"D#\2\u03c8\u03c7\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca"+
		"\u03cd\5l\67\2\u03cb\u03cd\5L\'\2\u03cc\u03c6\3\2\2\2\u03cc\u03cb\3\2"+
		"\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03cf\5|?\2\u03cf\u0091"+
		"\3\2\2\2\u03d0\u03d1\7l\2\2\u03d1\u03d2\7\34\2\2\u03d2\u03d3\5\u00a2R"+
		"\2\u03d3\u03d4\7\35\2\2\u03d4\u03d8\5\u00a2R\2\u03d5\u03d7\7\7\2\2\u03d6"+
		"\u03d5\3\2\2\2\u03d7\u03da\3\2\2\2\u03d8\u03d6\3\2\2\2\u03d8\u03d9\3\2"+
		"\2\2\u03d9\u03dd\3\2\2\2\u03da\u03d8\3\2\2\2\u03db\u03dc\7m\2\2\u03dc"+
		"\u03de\5\u00a2R\2\u03dd\u03db\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u0093"+
		"\3\2\2\2\u03df\u03e0\7r\2\2\u03e0\u03e4\5\u0088E\2\u03e1\u03e3\5\u0096"+
		"L\2\u03e2\u03e1\3\2\2\2\u03e3\u03e6\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e4"+
		"\u03e5\3\2\2\2\u03e5\u03e8\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e7\u03e9\5\u0098"+
		"M\2\u03e8\u03e7\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u0095\3\2\2\2\u03ea"+
		"\u03eb\7s\2\2\u03eb\u03ed\7\34\2\2\u03ec\u03ee\5D#\2\u03ed\u03ec\3\2\2"+
		"\2\u03ed\u03ee\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f0\7v\2\2\u03f0\u03f1"+
		"\7\33\2\2\u03f1\u03f2\5\36\20\2\u03f2\u03f3\7\35\2\2\u03f3\u03f4\5\u0088"+
		"E\2\u03f4\u0097\3\2\2\2\u03f5\u03f6\7t\2\2\u03f6\u03f7\5\u0088E\2\u03f7"+
		"\u0099\3\2\2\2\u03f8\u03fc\5\u009cO\2\u03f9\u03fc\5\u009eP\2\u03fa\u03fc"+
		"\5\u00a0Q\2\u03fb\u03f8\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fb\u03fa\3\2\2"+
		"\2\u03fc\u009b\3\2\2\2\u03fd\u03fe\7p\2\2\u03fe\u0400\7\34\2\2\u03ff\u0401"+
		"\5D#\2\u0400\u03ff\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0404\3\2\2\2\u0402"+
		"\u0405\5,\27\2\u0403\u0405\5$\23\2\u0404\u0402\3\2\2\2\u0404\u0403\3\2"+
		"\2\2\u0405\u0406\3\2\2\2\u0406\u0407\7.\2\2\u0407\u0408\5\u00a2R\2\u0408"+
		"\u0409\7\35\2\2\u0409\u040a\5\u00a2R\2\u040a\u009d\3\2\2\2\u040b\u040c"+
		"\7o\2\2\u040c\u040d\7\34\2\2\u040d\u040e\5\u00a2R\2\u040e\u040f\7\35\2"+
		"\2\u040f\u0410\5\u00a2R\2\u0410\u009f\3\2\2\2\u0411\u0412\7q\2\2\u0412"+
		"\u0413\5\u00a2R\2\u0413\u0414\7o\2\2\u0414\u0415\7\34\2\2\u0415\u0416"+
		"\5\u00a2R\2\u0416\u0417\7\35\2\2\u0417\u00a1\3\2\2\2\u0418\u041e\5\u00a4"+
		"S\2\u0419\u041a\5\u00dan\2\u041a\u041b\5\u00a4S\2\u041b\u041d\3\2\2\2"+
		"\u041c\u0419\3\2\2\2\u041d\u0420\3\2\2\2\u041e\u041c\3\2\2\2\u041e\u041f"+
		"\3\2\2\2\u041f\u00a3\3\2\2\2\u0420\u041e\3\2\2\2\u0421\u0426\5\u00a6T"+
		"\2\u0422\u0423\7 \2\2\u0423\u0425\5\u00a6T\2\u0424\u0422\3\2\2\2\u0425"+
		"\u0428\3\2\2\2\u0426\u0424\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u00a5\3\2"+
		"\2\2\u0428\u0426\3\2\2\2\u0429\u042e\5\u00a8U\2\u042a\u042b\7!\2\2\u042b"+
		"\u042d\5\u00a8U\2\u042c\u042a\3\2\2\2\u042d\u0430\3\2\2\2\u042e\u042c"+
		"\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u00a7\3\2\2\2\u0430\u042e\3\2\2\2\u0431"+
		"\u0437\5\u00aaV\2\u0432\u0433\5\u00d8m\2\u0433\u0434\5\u00aaV\2\u0434"+
		"\u0436\3\2\2\2\u0435\u0432\3\2\2\2\u0436\u0439\3\2\2\2\u0437\u0435\3\2"+
		"\2\2\u0437\u0438\3\2\2\2\u0438\u00a9\3\2\2\2\u0439\u0437\3\2\2\2\u043a"+
		"\u0440\5\u00acW\2\u043b\u043c\5\u00d6l\2\u043c\u043d\5\u00acW\2\u043d"+
		"\u043f\3\2\2\2\u043e\u043b\3\2\2\2\u043f\u0442\3\2\2\2\u0440\u043e\3\2"+
		"\2\2\u0440\u0441\3\2\2\2\u0441\u00ab\3\2\2\2\u0442\u0440\3\2\2\2\u0443"+
		"\u0449\5\u00aeX\2\u0444\u0445\5\u00d0i\2\u0445\u0446\5\u00aeX\2\u0446"+
		"\u0448\3\2\2\2\u0447\u0444\3\2\2\2\u0448\u044b\3\2\2\2\u0449\u0447\3\2"+
		"\2\2\u0449\u044a\3\2\2\2\u044a\u0453\3\2\2\2\u044b\u0449\3\2\2\2\u044c"+
		"\u0450\5\u00aeX\2\u044d\u044e\5\u00d4k\2\u044e\u044f\5\32\16\2\u044f\u0451"+
		"\3\2\2\2\u0450\u044d\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u0453\3\2\2\2\u0452"+
		"\u0443\3\2\2\2\u0452\u044c\3\2\2\2\u0453\u00ad\3\2\2\2\u0454\u0459\5\u00b0"+
		"Y\2\u0455\u0456\7\"\2\2\u0456\u0458\5\u00b0Y\2\u0457\u0455\3\2\2\2\u0458"+
		"\u045b\3\2\2\2\u0459\u0457\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u00af\3\2"+
		"\2\2\u045b\u0459\3\2\2\2\u045c\u0461\5\u00b2Z\2\u045d\u045e\7v\2\2\u045e"+
		"\u0460\5\u00b2Z\2\u045f\u045d\3\2\2\2\u0460\u0463\3\2\2\2\u0461\u045f"+
		"\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u00b1\3\2\2\2\u0463\u0461\3\2\2\2\u0464"+
		"\u0469\5\u00b4[\2\u0465\u0466\7$\2\2\u0466\u0468\5\u00b4[\2\u0467\u0465"+
		"\3\2\2\2\u0468\u046b\3\2\2\2\u0469\u0467\3\2\2\2\u0469\u046a\3\2\2\2\u046a"+
		"\u00b3\3\2\2\2\u046b\u0469\3\2\2\2\u046c\u0472\5\u00b6\\\2\u046d\u046e"+
		"\5\u00ceh\2\u046e\u046f\5\u00b6\\\2\u046f\u0471\3\2\2\2\u0470\u046d\3"+
		"\2\2\2\u0471\u0474\3\2\2\2\u0472\u0470\3\2\2\2\u0472\u0473\3\2\2\2\u0473"+
		"\u00b5\3\2\2\2\u0474\u0472\3\2\2\2\u0475\u047b\5\u00b8]\2\u0476\u0477"+
		"\5\u00ccg\2\u0477\u0478\5\u00b8]\2\u0478\u047a\3\2\2\2\u0479\u0476\3\2"+
		"\2\2\u047a\u047d\3\2\2\2\u047b\u0479\3\2\2\2\u047b\u047c\3\2\2\2\u047c"+
		"\u00b7\3\2\2\2\u047d\u047b\3\2\2\2\u047e\u0484\5\u00ba^\2\u047f\u0480"+
		"\5\u00d2j\2\u0480\u0481\5\u00ba^\2\u0481\u0483\3\2\2\2\u0482\u047f\3\2"+
		"\2\2\u0483\u0486\3\2\2\2\u0484\u0482\3\2\2\2\u0484\u0485\3\2\2\2\u0485"+
		"\u00b9\3\2\2\2\u0486\u0484\3\2\2\2\u0487\u0489\5\u00dco\2\u0488\u0487"+
		"\3\2\2\2\u0489\u048c\3\2\2\2\u048a\u0488\3\2\2\2\u048a\u048b\3\2\2\2\u048b"+
		"\u048d\3\2\2\2\u048c\u048a\3\2\2\2\u048d\u048e\5\u00bc_\2\u048e\u00bb"+
		"\3\2\2\2\u048f\u0490\5\u00c4c\2\u0490\u0492\5j\66\2\u0491\u0493\5\u00f2"+
		"z\2\u0492\u0491\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u04a3\3\2\2\2\u0494"+
		"\u0498\5\u00c4c\2\u0495\u0497\5\u00dep\2\u0496\u0495\3\2\2\2\u0497\u049a"+
		"\3\2\2\2\u0498\u0496\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u04a3\3\2\2\2\u049a"+
		"\u0498\3\2\2\2\u049b\u049f\5\u00be`\2\u049c\u049e\5\u00dep\2\u049d\u049c"+
		"\3\2\2\2\u049e\u04a1\3\2\2\2\u049f\u049d\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0"+
		"\u04a3\3\2\2\2\u04a1\u049f\3\2\2\2\u04a2\u048f\3\2\2\2\u04a2\u0494\3\2"+
		"\2\2\u04a2\u049b\3\2\2\2\u04a3\u00bd\3\2\2\2\u04a4\u04a8\5\36\20\2\u04a5"+
		"\u04a7\7\36\2\2\u04a6\u04a5\3\2\2\2\u04a7\u04aa\3\2\2\2\u04a8\u04a6\3"+
		"\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04ac\3\2\2\2\u04aa\u04a8\3\2\2\2\u04ab"+
		"\u04a4\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04af\3\2\2\2\u04ad\u04af\7c"+
		"\2\2\u04ae\u04ab\3\2\2\2\u04ae\u04ad\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0"+
		"\u04b3\7%\2\2\u04b1\u04b4\5\u00c0a\2\u04b2\u04b4\7e\2\2\u04b3\u04b1\3"+
		"\2\2\2\u04b3\u04b2\3\2\2\2\u04b4\u04b6\3\2\2\2\u04b5\u04b7\5\24\13\2\u04b6"+
		"\u04b5\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u00bf\3\2\2\2\u04b8\u04b9\t\13"+
		"\2\2\u04b9\u00c1\3\2\2\2\u04ba\u04c4\7\r\2\2\u04bb\u04c3\7z\2\2\u04bc"+
		"\u04bd\7{\2\2\u04bd\u04be\5\u00a2R\2\u04be\u04bf\7\t\2\2\u04bf\u04c3\3"+
		"\2\2\2\u04c0\u04c3\7|\2\2\u04c1\u04c3\n\f\2\2\u04c2\u04bb\3\2\2\2\u04c2"+
		"\u04bc\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c2\u04c1\3\2\2\2\u04c3\u04c6\3\2"+
		"\2\2\u04c4\u04c2\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c7\3\2\2\2\u04c6"+
		"\u04c4\3\2\2\2\u04c7\u04d6\7y\2\2\u04c8\u04d1\7\f\2\2\u04c9\u04ca\7\u0080"+
		"\2\2\u04ca\u04cb\5\u00a2R\2\u04cb\u04cc\7\t\2\2\u04cc\u04d0\3\2\2\2\u04cd"+
		"\u04d0\7\u0081\2\2\u04ce\u04d0\n\r\2\2\u04cf\u04c9\3\2\2\2\u04cf\u04cd"+
		"\3\2\2\2\u04cf\u04ce\3\2\2\2\u04d0\u04d3\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d1"+
		"\u04d2\3\2\2\2\u04d2\u04d4\3\2\2\2\u04d3\u04d1\3\2\2\2\u04d4\u04d6\7~"+
		"\2\2\u04d5\u04ba\3\2\2\2\u04d5\u04c8\3\2\2\2\u04d6\u00c3\3\2\2\2\u04d7"+
		"\u04d8\7\34\2\2\u04d8\u04d9\5\u00a2R\2\u04d9\u04da\7\35\2\2\u04da\u04f6"+
		"\3\2\2\2\u04db\u04f6\5\u00c6d\2\u04dc\u04f6\5\u00e4s\2\u04dd\u04df\7c"+
		"\2\2\u04de\u04e0\5R*\2\u04df\u04de\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04f6"+
		"\3\2\2\2\u04e1\u04e6\7d\2\2\u04e2\u04e3\7\23\2\2\u04e3\u04e4\5\32\16\2"+
		"\u04e4\u04e5\7\25\2\2\u04e5\u04e7\3\2\2\2\u04e6\u04e2\3\2\2\2\u04e6\u04e7"+
		"\3\2\2\2\u04e7\u04e9\3\2\2\2\u04e8\u04ea\5R*\2\u04e9\u04e8\3\2\2\2\u04e9"+
		"\u04ea\3\2\2\2\u04ea\u04f6\3\2\2\2\u04eb\u04f6\5\u0092J\2\u04ec\u04f6"+
		"\5\u00ecw\2\u04ed\u04f6\5\u0094K\2\u04ee\u04f6\5\u00eav\2\u04ef\u04f6"+
		"\5P)\2\u04f0\u04f6\5\u009aN\2\u04f1\u04f6\5\u00c0a\2\u04f2\u04f3\7u\2"+
		"\2\u04f3\u04f6\5\u00c0a\2\u04f4\u04f6\7\16\2\2\u04f5\u04d7\3\2\2\2\u04f5"+
		"\u04db\3\2\2\2\u04f5\u04dc\3\2\2\2\u04f5\u04dd\3\2\2\2\u04f5\u04e1\3\2"+
		"\2\2\u04f5\u04eb\3\2\2\2\u04f5\u04ec\3\2\2\2\u04f5\u04ed\3\2\2\2\u04f5"+
		"\u04ee\3\2\2\2\u04f5\u04ef\3\2\2\2\u04f5\u04f0\3\2\2\2\u04f5\u04f1\3\2"+
		"\2\2\u04f5\u04f2\3\2\2\2\u04f5\u04f4\3\2\2\2\u04f6\u00c5\3\2\2\2\u04f7"+
		"\u04ff\7&\2\2\u04f8\u04ff\7\'\2\2\u04f9\u04ff\5\u00c2b\2\u04fa\u04ff\7"+
		"\6\2\2\u04fb\u04ff\7\n\2\2\u04fc\u04ff\7\13\2\2\u04fd\u04ff\7(\2\2\u04fe"+
		"\u04f7\3\2\2\2\u04fe\u04f8\3\2\2\2\u04fe\u04f9\3\2\2\2\u04fe\u04fa\3\2"+
		"\2\2\u04fe\u04fb\3\2\2\2\u04fe\u04fc\3\2\2\2\u04fe\u04fd\3\2\2\2\u04ff"+
		"\u00c7\3\2\2\2\u0500\u0505\5\u0082B\2\u0501\u0505\5.\30\2\u0502\u0505"+
		"\5r:\2\u0503\u0505\5v<\2\u0504\u0500\3\2\2\2\u0504\u0501\3\2\2\2\u0504"+
		"\u0502\3\2\2\2\u0504\u0503\3\2\2\2\u0505\u00c9\3\2\2\2\u0506\u0509\5\u00c8"+
		"e\2\u0507\u0509\5\u00a2R\2\u0508\u0506\3\2\2\2\u0508\u0507\3\2\2\2\u0509"+
		"\u00cb\3\2\2\2\u050a\u050b\t\16\2\2\u050b\u00cd\3\2\2\2\u050c\u050d\t"+
		"\17\2\2\u050d\u00cf\3\2\2\2\u050e\u050f\t\20\2\2\u050f\u00d1\3\2\2\2\u0510"+
		"\u0511\t\21\2\2\u0511\u00d3\3\2\2\2\u0512\u0513\t\22\2\2\u0513\u00d5\3"+
		"\2\2\2\u0514\u0515\t\23\2\2\u0515\u00d7\3\2\2\2\u0516\u0517\t\24\2\2\u0517"+
		"\u00d9\3\2\2\2\u0518\u0519\t\25\2\2\u0519\u00db\3\2\2\2\u051a\u0522\7"+
		"-\2\2\u051b\u0522\7,\2\2\u051c\u0522\7:\2\2\u051d\u0522\79\2\2\u051e\u0522"+
		"\7<\2\2\u051f\u0522\5D#\2\u0520\u0522\5T+\2\u0521\u051a\3\2\2\2\u0521"+
		"\u051b\3\2\2\2\u0521\u051c\3\2\2\2\u0521\u051d\3\2\2\2\u0521\u051e\3\2"+
		"\2\2\u0521\u051f\3\2\2\2\u0521\u0520\3\2\2\2\u0522\u00dd\3\2\2\2\u0523"+
		"\u052c\7:\2\2\u0524\u052c\79\2\2\u0525\u052c\7;\2\2\u0526\u052c\5j\66"+
		"\2\u0527\u052c\5\u00e8u\2\u0528\u0529\5\u00e2r\2\u0529\u052a\5\u00bc_"+
		"\2\u052a\u052c\3\2\2\2\u052b\u0523\3\2\2\2\u052b\u0524\3\2\2\2\u052b\u0525"+
		"\3\2\2\2\u052b\u0526\3\2\2\2\u052b\u0527\3\2\2\2\u052b\u0528\3\2\2\2\u052c"+
		"\u00df\3\2\2\2\u052d\u052e\7X\2\2\u052e\u0530\5N(\2\u052f\u052d\3\2\2"+
		"\2\u0530\u0533\3\2\2\2\u0531\u052f\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0535"+
		"\3\2\2\2\u0533\u0531\3\2\2\2\u0534\u0536\5T+\2\u0535\u0534\3\2\2\2\u0535"+
		"\u0536\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u0538\5\u00e4s\2\u0538\u00e1"+
		"\3\2\2\2\u0539\u053f\7\20\2\2\u053a\u053c\7\36\2\2\u053b\u053d\7\20\2"+
		"\2\u053c\u053b\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u053f\3\2\2\2\u053e\u0539"+
		"\3\2\2\2\u053e\u053a\3\2\2\2\u053f\u00e3\3\2\2\2\u0540\u0541\7\b\2\2\u0541"+
		"\u0542\5\u0084C\2\u0542\u0543\7\t\2\2\u0543\u0554\3\2\2\2\u0544\u054d"+
		"\7\b\2\2\u0545\u054a\5\u00e6t\2\u0546\u0547\7\22\2\2\u0547\u0549\5\u00e6"+
		"t\2\u0548\u0546\3\2\2\2\u0549\u054c\3\2\2\2\u054a\u0548\3\2\2\2\u054a"+
		"\u054b\3\2\2\2\u054b\u054e\3\2\2\2\u054c\u054a\3\2\2\2\u054d\u0545\3\2"+
		"\2\2\u054d\u054e\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0550\7)\2\2\u0550"+
		"\u0551\5\u0084C\2\u0551\u0552\7\t\2\2\u0552\u0554\3\2\2\2\u0553\u0540"+
		"\3\2\2\2\u0553\u0544\3\2\2\2\u0554\u00e5\3\2\2\2\u0555\u0558\7v\2\2\u0556"+
		"\u0557\7\33\2\2\u0557\u0559\5\32\16\2\u0558\u0556\3\2\2\2\u0558\u0559"+
		"\3\2\2\2\u0559\u00e7\3\2\2\2\u055a\u0563\7=\2\2\u055b\u0560\5\u00a2R\2"+
		"\u055c\u055d\7\22\2\2\u055d\u055f\5\u00a2R\2\u055e\u055c\3\2\2\2\u055f"+
		"\u0562\3\2\2\2\u0560\u055e\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u0564\3\2"+
		"\2\2\u0562\u0560\3\2\2\2\u0563\u055b\3\2\2\2\u0563\u0564\3\2\2\2\u0564"+
		"\u0565\3\2\2\2\u0565\u0566\7>\2\2\u0566\u00e9\3\2\2\2\u0567\u0571\7g\2"+
		"\2\u0568\u0569\7\33\2\2\u0569\u056e\5p9\2\u056a\u056b\7\22\2\2\u056b\u056d"+
		"\5p9\2\u056c\u056a\3\2\2\2\u056d\u0570\3\2\2\2\u056e\u056c\3\2\2\2\u056e"+
		"\u056f\3\2\2\2\u056f\u0572\3\2\2\2\u0570\u056e\3\2\2\2\u0571\u0568\3\2"+
		"\2\2\u0571\u0572\3\2\2\2\u0572\u0573\3\2\2\2\u0573\u0574\5|?\2\u0574\u00eb"+
		"\3\2\2\2\u0575\u057a\7n\2\2\u0576\u0577\7\34\2\2\u0577\u0578\5\u00a2R"+
		"\2\u0578\u0579\7\35\2\2\u0579\u057b\3\2\2\2\u057a\u0576\3\2\2\2\u057a"+
		"\u057b\3\2\2\2\u057b\u057c\3\2\2\2\u057c\u0580\7\b\2\2\u057d\u057f\5\u00ee"+
		"x\2\u057e\u057d\3\2\2\2\u057f\u0582\3\2\2\2\u0580\u057e\3\2\2\2\u0580"+
		"\u0581\3\2\2\2\u0581\u0583\3\2\2\2\u0582\u0580\3\2\2\2\u0583\u0584\7\t"+
		"\2\2\u0584\u00ed\3\2\2\2\u0585\u058a\5\u00f0y\2\u0586\u0587\7\22\2\2\u0587"+
		"\u0589\5\u00f0y\2\u0588\u0586\3\2\2\2\u0589\u058c\3\2\2\2\u058a\u0588"+
		"\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u058d\3\2\2\2\u058c\u058a\3\2\2\2\u058d"+
		"\u058e\7)\2\2\u058e\u0592\5\u00a2R\2\u058f\u0591\7\7\2\2\u0590\u058f\3"+
		"\2\2\2\u0591\u0594\3\2\2\2\u0592\u0590\3\2\2\2\u0592\u0593\3\2\2\2\u0593"+
		"\u059f\3\2\2\2\u0594\u0592\3\2\2\2\u0595\u0596\7m\2\2\u0596\u0597\7)\2"+
		"\2\u0597\u059b\5\u00a2R\2\u0598\u059a\7\7\2\2\u0599\u0598\3\2\2\2\u059a"+
		"\u059d\3\2\2\2\u059b\u0599\3\2\2\2\u059b\u059c\3\2\2\2\u059c\u059f\3\2"+
		"\2\2\u059d\u059b\3\2\2\2\u059e\u0585\3\2\2\2\u059e\u0595\3\2\2\2\u059f"+
		"\u00ef\3\2\2\2\u05a0\u05a6\5\u00a2R\2\u05a1\u05a2\t\20\2\2\u05a2\u05a6"+
		"\5\u00a2R\2\u05a3\u05a4\t\22\2\2\u05a4\u05a6\5\32\16\2\u05a5\u05a0\3\2"+
		"\2\2\u05a5\u05a1\3\2\2\2\u05a5\u05a3\3\2\2\2\u05a6\u00f1\3\2\2\2\u05a7"+
		"\u05a9\7\b\2\2\u05a8\u05aa\7\34\2\2\u05a9\u05a8\3\2\2\2\u05a9\u05aa\3"+
		"\2\2\2\u05aa\u05b3\3\2\2\2\u05ab\u05b0\5$\23\2\u05ac\u05ad\7\22\2\2\u05ad"+
		"\u05af\5$\23\2\u05ae\u05ac\3\2\2\2\u05af\u05b2\3\2\2\2\u05b0\u05ae\3\2"+
		"\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b4\3\2\2\2\u05b2\u05b0\3\2\2\2\u05b3"+
		"\u05ab\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b6\3\2\2\2\u05b5\u05b7\7\35"+
		"\2\2\u05b6\u05b5\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8"+
		"\u05b9\7)\2\2\u05b9\u05ba\5\u0084C\2\u05ba\u05bb\7\t\2\2\u05bb\u00f3\3"+
		"\2\2\2\u00c3\u00f8\u00fc\u0101\u010a\u0110\u0119\u0120\u0125\u012d\u0136"+
		"\u0139\u0141\u014a\u014e\u0154\u015f\u0162\u0165\u016c\u0174\u0177\u017b"+
		"\u017f\u0182\u0186\u0189\u018b\u018f\u0196\u019d\u01a6\u01ab\u01b0\u01b6"+
		"\u01c1\u01c4\u01d0\u01d8\u01dd\u01e1\u01e9\u01ec\u01ef\u01f2\u01f5\u01f8"+
		"\u01fa\u01ff\u020b\u020f\u021a\u021f\u0224\u0230\u023f\u0245\u024e\u0251"+
		"\u025b\u025e\u0267\u026b\u026e\u0274\u0277\u027b\u027f\u0281\u0288\u0293"+
		"\u029e\u02a2\u02ab\u02ae\u02b6\u02b9\u02be\u02c7\u02ca\u02d0\u02d3\u02d8"+
		"\u02df\u02e2\u02e6\u02ec\u02f0\u02fb\u0301\u0304\u0308\u030f\u0312\u0317"+
		"\u031c\u0325\u032c\u032f\u0335\u0340\u0347\u034d\u0354\u0359\u0362\u0365"+
		"\u036c\u0372\u0376\u037b\u037f\u0384\u038a\u0391\u0397\u039a\u039f\u03a5"+
		"\u03b0\u03b7\u03bd\u03c1\u03c8\u03cc\u03d8\u03dd\u03e4\u03e8\u03ed\u03fb"+
		"\u0400\u0404\u041e\u0426\u042e\u0437\u0440\u0449\u0450\u0452\u0459\u0461"+
		"\u0469\u0472\u047b\u0484\u048a\u0492\u0498\u049f\u04a2\u04a8\u04ab\u04ae"+
		"\u04b3\u04b6\u04c2\u04c4\u04cf\u04d1\u04d5\u04df\u04e6\u04e9\u04f5\u04fe"+
		"\u0504\u0508\u0521\u052b\u0531\u0535\u053c\u053e\u054a\u054d\u0553\u0558"+
		"\u0560\u0563\u056e\u0571\u057a\u0580\u058a\u0592\u059b\u059e\u05a5\u05a9"+
		"\u05b0\u05b3\u05b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}