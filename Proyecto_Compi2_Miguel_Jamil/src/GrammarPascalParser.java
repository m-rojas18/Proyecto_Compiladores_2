// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarPascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		P_PROGRAM=1, BEGIN=2, END=3, VAR=4, BOOLEAN=5, CHAR=6, INTEGER=7, WHILE=8, 
		DO=9, WRITE=10, WRITELN=11, READ=12, READLN=13, IF=14, ELSE=15, FOR=16, 
		REPEAT=17, THEN=18, UNTIL=19, NIL=20, DIV=21, MOD=22, NOT=23, TO=24, OPBOOL=25, 
		BOOLEAN_VAL=26, ID=27, INTEGER_VAL=28, OPSUM=29, OPMULT=30, OPREL=31, 
		EQUALS=32, ASIGNACION=33, PUNTOCOMA=34, PUNTO=35, COMMA=36, COLON=37, 
		LPAR=38, RPAR=39, R_BRACKET=40, L_BRACKET=41, CARACTERES_ESP=42, CHAR_VAL=43, 
		CONSTSTRING=44, WS=45, COMMENT=46;
	public static final int
		RULE_programa = 0, RULE_inicioPrograma = 1, RULE_listaIdentificadores = 2, 
		RULE_identificador = 3, RULE_declaraciones = 4, RULE_espacioDeclaracionVar = 5, 
		RULE_listaDeclaracionVar = 6, RULE_sentencia_compuesta = 7, RULE_sentencia = 8, 
		RULE_sentenciaAsignacion = 9, RULE_sentencia_condicional = 10, RULE_sentencia_ciclo = 11, 
		RULE_sentencia_funciones = 12, RULE_expresion = 13, RULE_condicion = 14, 
		RULE_expresionBooleana = 15, RULE_expresionRelacional = 16, RULE_expresionIgual = 17, 
		RULE_expresion_Simple = 18, RULE_termino = 19, RULE_operando = 20, RULE_constanteVariable = 21, 
		RULE_especificadorTipo = 22, RULE_signo = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "inicioPrograma", "listaIdentificadores", "identificador", 
			"declaraciones", "espacioDeclaracionVar", "listaDeclaracionVar", "sentencia_compuesta", 
			"sentencia", "sentenciaAsignacion", "sentencia_condicional", "sentencia_ciclo", 
			"sentencia_funciones", "expresion", "condicion", "expresionBooleana", 
			"expresionRelacional", "expresionIgual", "expresion_Simple", "termino", 
			"operando", "constanteVariable", "especificadorTipo", "signo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'begin'", "'end'", "'var'", "'boolean'", "'char'", 
			"'integer'", "'while'", "'do'", "'write'", "'writeln'", "'read'", "'readln'", 
			"'if'", "'else'", "'for'", "'repeat'", "'then'", "'until'", "'nil'", 
			"'div'", "'mod'", "'not'", "'to'", null, null, null, null, null, null, 
			null, "'='", "':='", "';'", "'.'", "','", "':'", "'('", "')'", "']'", 
			"'['"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "P_PROGRAM", "BEGIN", "END", "VAR", "BOOLEAN", "CHAR", "INTEGER", 
			"WHILE", "DO", "WRITE", "WRITELN", "READ", "READLN", "IF", "ELSE", "FOR", 
			"REPEAT", "THEN", "UNTIL", "NIL", "DIV", "MOD", "NOT", "TO", "OPBOOL", 
			"BOOLEAN_VAL", "ID", "INTEGER_VAL", "OPSUM", "OPMULT", "OPREL", "EQUALS", 
			"ASIGNACION", "PUNTOCOMA", "PUNTO", "COMMA", "COLON", "LPAR", "RPAR", 
			"R_BRACKET", "L_BRACKET", "CARACTERES_ESP", "CHAR_VAL", "CONSTSTRING", 
			"WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarPascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public InicioProgramaContext inicioPrograma() {
			return getRuleContext(InicioProgramaContext.class,0);
		}
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarPascalVisitor ) return ((GrammarPascalVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			inicioPrograma();
			setState(49);
			declaraciones();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicioProgramaContext extends ParserRuleContext {
		public TerminalNode P_PROGRAM() { return getToken(GrammarPascalParser.P_PROGRAM, 0); }
		public TerminalNode ID() { return getToken(GrammarPascalParser.ID, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(GrammarPascalParser.PUNTOCOMA, 0); }
		public TerminalNode LPAR() { return getToken(GrammarPascalParser.LPAR, 0); }
		public ListaIdentificadoresContext listaIdentificadores() {
			return getRuleContext(ListaIdentificadoresContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(GrammarPascalParser.RPAR, 0); }
		public InicioProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicioPrograma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).enterInicioPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).exitInicioPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarPascalVisitor ) return ((GrammarPascalVisitor<? extends T>)visitor).visitInicioPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioProgramaContext inicioPrograma() throws RecognitionException {
		InicioProgramaContext _localctx = new InicioProgramaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inicioPrograma);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(P_PROGRAM);
				setState(52);
				match(ID);
				setState(53);
				match(PUNTOCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(P_PROGRAM);
				setState(55);
				match(ID);
				setState(56);
				match(LPAR);
				setState(57);
				listaIdentificadores(0);
				setState(58);
				match(RPAR);
				setState(59);
				match(PUNTOCOMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaIdentificadoresContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ListaIdentificadoresContext listaIdentificadores() {
			return getRuleContext(ListaIdentificadoresContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GrammarPascalParser.COMMA, 0); }
		public ListaIdentificadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaIdentificadores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).enterListaIdentificadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).exitListaIdentificadores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarPascalVisitor ) return ((GrammarPascalVisitor<? extends T>)visitor).visitListaIdentificadores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaIdentificadoresContext listaIdentificadores() throws RecognitionException {
		return listaIdentificadores(0);
	}

	private ListaIdentificadoresContext listaIdentificadores(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListaIdentificadoresContext _localctx = new ListaIdentificadoresContext(_ctx, _parentState);
		ListaIdentificadoresContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_listaIdentificadores, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(64);
			identificador();
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListaIdentificadoresContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_listaIdentificadores);
					setState(66);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(67);
					match(COMMA);
					setState(68);
					identificador();
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentificadorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarPascalParser.ID, 0); }
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarPascalVisitor ) return ((GrammarPascalVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionesContext extends ParserRuleContext {
		public EspacioDeclaracionVarContext espacioDeclaracionVar() {
			return getRuleContext(EspacioDeclaracionVarContext.class,0);
		}
		public Sentencia_compuestaContext sentencia_compuesta() {
			return getRuleContext(Sentencia_compuestaContext.class,0);
		}
		public DeclaracionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).enterDeclaraciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).exitDeclaraciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarPascalVisitor ) return ((GrammarPascalVisitor<? extends T>)visitor).visitDeclaraciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionesContext declaraciones() throws RecognitionException {
		DeclaracionesContext _localctx = new DeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaraciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			espacioDeclaracionVar();
			setState(77);
			sentencia_compuesta();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EspacioDeclaracionVarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GrammarPascalParser.VAR, 0); }
		public ListaDeclaracionVarContext listaDeclaracionVar() {
			return getRuleContext(ListaDeclaracionVarContext.class,0);
		}
		public EspacioDeclaracionVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_espacioDeclaracionVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).enterEspacioDeclaracionVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).exitEspacioDeclaracionVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarPascalVisitor ) return ((GrammarPascalVisitor<? extends T>)visitor).visitEspacioDeclaracionVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EspacioDeclaracionVarContext espacioDeclaracionVar() throws RecognitionException {
		EspacioDeclaracionVarContext _localctx = new EspacioDeclaracionVarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_espacioDeclaracionVar);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(VAR);
				setState(80);
				listaDeclaracionVar();
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaDeclaracionVarContext extends ParserRuleContext {
		public ListaIdentificadoresContext listaIdentificadores() {
			return getRuleContext(ListaIdentificadoresContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GrammarPascalParser.COLON, 0); }
		public EspecificadorTipoContext especificadorTipo() {
			return getRuleContext(EspecificadorTipoContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(GrammarPascalParser.PUNTOCOMA, 0); }
		public ListaDeclaracionVarContext listaDeclaracionVar() {
			return getRuleContext(ListaDeclaracionVarContext.class,0);
		}
		public ListaDeclaracionVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaDeclaracionVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).enterListaDeclaracionVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).exitListaDeclaracionVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarPascalVisitor ) return ((GrammarPascalVisitor<? extends T>)visitor).visitListaDeclaracionVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaDeclaracionVarContext listaDeclaracionVar() throws RecognitionException {
		ListaDeclaracionVarContext _localctx = new ListaDeclaracionVarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listaDeclaracionVar);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				listaIdentificadores(0);
				setState(85);
				match(COLON);
				setState(86);
				especificadorTipo();
				setState(87);
				match(PUNTOCOMA);
				setState(88);
				listaDeclaracionVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				listaIdentificadores(0);
				setState(91);
				match(COLON);
				setState(92);
				especificadorTipo();
				setState(93);
				match(PUNTOCOMA);
				System.out.println("Declarando variable");
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

	@SuppressWarnings("CheckReturnValue")
	public static class Sentencia_compuestaContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(GrammarPascalParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(GrammarPascalParser.END, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public TerminalNode PUNTOCOMA() { return getToken(GrammarPascalParser.PUNTOCOMA, 0); }
		public Sentencia_compuestaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_compuesta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).enterSentencia_compuesta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).exitSentencia_compuesta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarPascalVisitor ) return ((GrammarPascalVisitor<? extends T>)visitor).visitSentencia_compuesta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_compuestaContext sentencia_compuesta() throws RecognitionException {
		Sentencia_compuestaContext _localctx = new Sentencia_compuestaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sentencia_compuesta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(BEGIN);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 134438148L) != 0) {
				{
				{
				setState(99);
				sentencia();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(END);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNTOCOMA) {
				{
				setState(106);
				match(PUNTOCOMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public SentenciaAsignacionContext sentenciaAsignacion() {
			return getRuleContext(SentenciaAsignacionContext.class,0);
		}
		public Sentencia_compuestaContext sentencia_compuesta() {
			return getRuleContext(Sentencia_compuestaContext.class,0);
		}
		public Sentencia_condicionalContext sentencia_condicional() {
			return getRuleContext(Sentencia_condicionalContext.class,0);
		}
		public Sentencia_cicloContext sentencia_ciclo() {
			return getRuleContext(Sentencia_cicloContext.class,0);
		}
		public Sentencia_funcionesContext sentencia_funciones() {
			return getRuleContext(Sentencia_funcionesContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarPascalVisitor ) return ((GrammarPascalVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sentencia);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				sentenciaAsignacion();
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				sentencia_compuesta();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				sentencia_condicional();
				}
				break;
			case WHILE:
			case FOR:
			case REPEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				sentencia_ciclo();
				}
				break;
			case WRITE:
			case WRITELN:
			case READ:
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				sentencia_funciones();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaAsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarPascalParser.ID, 0); }
		public TerminalNode ASIGNACION() { return getToken(GrammarPascalParser.ASIGNACION, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(GrammarPascalParser.PUNTOCOMA, 0); }
		public SentenciaAsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaAsignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).enterSentenciaAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).exitSentenciaAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarPascalVisitor ) return ((GrammarPascalVisitor<? extends T>)visitor).visitSentenciaAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaAsignacionContext sentenciaAsignacion() throws RecognitionException {
		SentenciaAsignacionContext _localctx = new SentenciaAsignacionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sentenciaAsignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(ID);
			setState(117);
			match(ASIGNACION);
			setState(118);
			expresion();
			setState(119);
			match(PUNTOCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sentencia_condicionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GrammarPascalParser.IF, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(GrammarPascalParser.THEN, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(GrammarPascalParser.ELSE, 0); }
		public Sentencia_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).enterSentencia_condicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).exitSentencia_condicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarPascalVisitor ) return ((GrammarPascalVisitor<? extends T>)visitor).visitSentencia_condicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_condicionalContext sentencia_condicional() throws RecognitionException {
		Sentencia_condicionalContext _localctx = new Sentencia_condicionalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sentencia_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(IF);
			setState(122);
			expresion();
			setState(123);
			match(THEN);
			setState(124);
			sentencia();
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(125);
				match(ELSE);
				}
				break;
			}
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(128);
				sentencia();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Sentencia_cicloContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GrammarPascalParser.WHILE, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode DO() { return getToken(GrammarPascalParser.DO, 0); }
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public TerminalNode FOR() { return getToken(GrammarPascalParser.FOR, 0); }
		public TerminalNode ID() { return getToken(GrammarPascalParser.ID, 0); }
		public TerminalNode ASIGNACION() { return getToken(GrammarPascalParser.ASIGNACION, 0); }
		public TerminalNode TO() { return getToken(GrammarPascalParser.TO, 0); }
		public TerminalNode REPEAT() { return getToken(GrammarPascalParser.REPEAT, 0); }
		public TerminalNode UNTIL() { return getToken(GrammarPascalParser.UNTIL, 0); }
		public Sentencia_cicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_ciclo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).enterSentencia_ciclo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).exitSentencia_ciclo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarPascalVisitor ) return ((GrammarPascalVisitor<? extends T>)visitor).visitSentencia_ciclo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_cicloContext sentencia_ciclo() throws RecognitionException {
		Sentencia_cicloContext _localctx = new Sentencia_cicloContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sentencia_ciclo);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(WHILE);
				setState(132);
				expresion();
				setState(133);
				match(DO);
				setState(134);
				sentencia();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(FOR);
				setState(137);
				match(ID);
				setState(138);
				match(ASIGNACION);
				setState(139);
				expresion();
				setState(140);
				match(TO);
				setState(141);
				expresion();
				setState(142);
				match(DO);
				setState(143);
				sentencia();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				match(REPEAT);
				setState(146);
				sentencia();
				setState(147);
				match(UNTIL);
				setState(148);
				expresion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Sentencia_funcionesContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(GrammarPascalParser.READ, 0); }
		public TerminalNode LPAR() { return getToken(GrammarPascalParser.LPAR, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarPascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarPascalParser.ID, i);
		}
		public TerminalNode RPAR() { return getToken(GrammarPascalParser.RPAR, 0); }
		public TerminalNode WRITE() { return getToken(GrammarPascalParser.WRITE, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(GrammarPascalParser.PUNTOCOMA, 0); }
		public TerminalNode CONSTSTRING() { return getToken(GrammarPascalParser.CONSTSTRING, 0); }
		public TerminalNode COMMA() { return getToken(GrammarPascalParser.COMMA, 0); }
		public TerminalNode WRITELN() { return getToken(GrammarPascalParser.WRITELN, 0); }
		public Sentencia_funcionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_funciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).enterSentencia_funciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).exitSentencia_funciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarPascalVisitor ) return ((GrammarPascalVisitor<? extends T>)visitor).visitSentencia_funciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_funcionesContext sentencia_funciones() throws RecognitionException {
		Sentencia_funcionesContext _localctx = new Sentencia_funcionesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sentencia_funciones);
		int _la;
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(READ);
				setState(153);
				match(LPAR);
				setState(154);
				match(ID);
				setState(155);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(WRITE);
				setState(157);
				match(LPAR);
				setState(158);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==CONSTSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(159);
				match(RPAR);
				setState(160);
				match(PUNTOCOMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(WRITE);
				setState(162);
				match(LPAR);
				setState(163);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==CONSTSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(164);
				match(COMMA);
				setState(165);
				match(ID);
				setState(166);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				match(WRITELN);
				setState(168);
				match(PUNTOCOMA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				match(WRITELN);
				setState(170);
				match(LPAR);
				setState(171);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==CONSTSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(172);
				match(RPAR);
				setState(173);
				match(PUNTOCOMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public Expresion_SimpleContext expresion_Simple() {
			return getRuleContext(Expresion_SimpleContext.class,0);
		}
		public ExpresionIgualContext expresionIgual() {
			return getRuleContext(ExpresionIgualContext.class,0);
		}
		public ExpresionRelacionalContext expresionRelacional() {
			return getRuleContext(ExpresionRelacionalContext.class,0);
		}
		public ExpresionBooleanaContext expresionBooleana() {
			return getRuleContext(ExpresionBooleanaContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarPascalVisitor ) return ((GrammarPascalVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expresion);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				expresion_Simple(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				expresionIgual();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				expresionRelacional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				expresionBooleana();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionContext extends ParserRuleContext {
		public Expresion_SimpleContext expresion_Simple() {
			return getRuleContext(Expresion_SimpleContext.class,0);
		}
		public ExpresionIgualContext expresionIgual() {
			return getRuleContext(ExpresionIgualContext.class,0);
		}
		public ExpresionRelacionalContext expresionRelacional() {
			return getRuleContext(ExpresionRelacionalContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarPascalVisitor ) return ((GrammarPascalVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condicion);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				expresion_Simple(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				expresionIgual();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				expresionRelacional();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionBooleanaContext extends ParserRuleContext {
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public TerminalNode OPBOOL() { return getToken(GrammarPascalParser.OPBOOL, 0); }
		public TerminalNode NOT() { return getToken(GrammarPascalParser.NOT, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ExpresionBooleanaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionBooleana; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).enterExpresionBooleana(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).exitExpresionBooleana(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarPascalVisitor ) return ((GrammarPascalVisitor<? extends T>)visitor).visitExpresionBooleana(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionBooleanaContext expresionBooleana() throws RecognitionException {
		ExpresionBooleanaContext _localctx = new ExpresionBooleanaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expresionBooleana);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				condicion();
				setState(188);
				match(OPBOOL);
				setState(189);
				condicion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(NOT);
				setState(192);
				expresion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionRelacionalContext extends ParserRuleContext {
		public List<Expresion_SimpleContext> expresion_Simple() {
			return getRuleContexts(Expresion_SimpleContext.class);
		}
		public Expresion_SimpleContext expresion_Simple(int i) {
			return getRuleContext(Expresion_SimpleContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(GrammarPascalParser.OPREL, 0); }
		public ExpresionRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).enterExpresionRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).exitExpresionRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarPascalVisitor ) return ((GrammarPascalVisitor<? extends T>)visitor).visitExpresionRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionRelacionalContext expresionRelacional() throws RecognitionException {
		ExpresionRelacionalContext _localctx = new ExpresionRelacionalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expresionRelacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			expresion_Simple(0);
			setState(196);
			match(OPREL);
			setState(197);
			expresion_Simple(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionIgualContext extends ParserRuleContext {
		public List<Expresion_SimpleContext> expresion_Simple() {
			return getRuleContexts(Expresion_SimpleContext.class);
		}
		public Expresion_SimpleContext expresion_Simple(int i) {
			return getRuleContext(Expresion_SimpleContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(GrammarPascalParser.EQUALS, 0); }
		public ExpresionIgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionIgual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).enterExpresionIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).exitExpresionIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarPascalVisitor ) return ((GrammarPascalVisitor<? extends T>)visitor).visitExpresionIgual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionIgualContext expresionIgual() throws RecognitionException {
		ExpresionIgualContext _localctx = new ExpresionIgualContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expresionIgual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			expresion_Simple(0);
			setState(200);
			match(EQUALS);
			setState(201);
			expresion_Simple(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expresion_SimpleContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public Expresion_SimpleContext expresion_Simple() {
			return getRuleContext(Expresion_SimpleContext.class,0);
		}
		public TerminalNode OPSUM() { return getToken(GrammarPascalParser.OPSUM, 0); }
		public Expresion_SimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_Simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).enterExpresion_Simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).exitExpresion_Simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarPascalVisitor ) return ((GrammarPascalVisitor<? extends T>)visitor).visitExpresion_Simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_SimpleContext expresion_Simple() throws RecognitionException {
		return expresion_Simple(0);
	}

	private Expresion_SimpleContext expresion_Simple(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expresion_SimpleContext _localctx = new Expresion_SimpleContext(_ctx, _parentState);
		Expresion_SimpleContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expresion_Simple, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(204);
			termino(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expresion_SimpleContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresion_Simple);
					setState(206);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(207);
					match(OPSUM);
					setState(208);
					termino(0);
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerminoContext extends ParserRuleContext {
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public TerminalNode OPMULT() { return getToken(GrammarPascalParser.OPMULT, 0); }
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarPascalVisitor ) return ((GrammarPascalVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		return termino(0);
	}

	private TerminoContext termino(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TerminoContext _localctx = new TerminoContext(_ctx, _parentState);
		TerminoContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_termino, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(215);
			operando();
			}
			_ctx.stop = _input.LT(-1);
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TerminoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_termino);
					setState(217);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(218);
					match(OPMULT);
					setState(219);
					operando();
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperandoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarPascalParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(GrammarPascalParser.LPAR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(GrammarPascalParser.RPAR, 0); }
		public SignoContext signo() {
			return getRuleContext(SignoContext.class,0);
		}
		public TerminalNode NIL() { return getToken(GrammarPascalParser.NIL, 0); }
		public TerminalNode NOT() { return getToken(GrammarPascalParser.NOT, 0); }
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public ConstanteVariableContext constanteVariable() {
			return getRuleContext(ConstanteVariableContext.class,0);
		}
		public OperandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).enterOperando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).exitOperando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarPascalVisitor ) return ((GrammarPascalVisitor<? extends T>)visitor).visitOperando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandoContext operando() throws RecognitionException {
		OperandoContext _localctx = new OperandoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_operando);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(LPAR);
				setState(227);
				expresion();
				setState(228);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				signo();
				setState(231);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				match(NIL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(234);
				match(NOT);
				setState(235);
				operando();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(236);
				constanteVariable();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstanteVariableContext extends ParserRuleContext {
		public TerminalNode INTEGER_VAL() { return getToken(GrammarPascalParser.INTEGER_VAL, 0); }
		public TerminalNode CHAR_VAL() { return getToken(GrammarPascalParser.CHAR_VAL, 0); }
		public TerminalNode BOOLEAN_VAL() { return getToken(GrammarPascalParser.BOOLEAN_VAL, 0); }
		public SignoContext signo() {
			return getRuleContext(SignoContext.class,0);
		}
		public ConstanteVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constanteVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).enterConstanteVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).exitConstanteVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarPascalVisitor ) return ((GrammarPascalVisitor<? extends T>)visitor).visitConstanteVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstanteVariableContext constanteVariable() throws RecognitionException {
		ConstanteVariableContext _localctx = new ConstanteVariableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constanteVariable);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(INTEGER_VAL);
				}
				break;
			case CHAR_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(CHAR_VAL);
				}
				break;
			case BOOLEAN_VAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				match(BOOLEAN_VAL);
				}
				break;
			case OPSUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				signo();
				setState(243);
				match(INTEGER_VAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EspecificadorTipoContext extends ParserRuleContext {
		public String tipo;
		public TerminalNode INTEGER() { return getToken(GrammarPascalParser.INTEGER, 0); }
		public TerminalNode CHAR() { return getToken(GrammarPascalParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(GrammarPascalParser.BOOLEAN, 0); }
		public EspecificadorTipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_especificadorTipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).enterEspecificadorTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).exitEspecificadorTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarPascalVisitor ) return ((GrammarPascalVisitor<? extends T>)visitor).visitEspecificadorTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EspecificadorTipoContext especificadorTipo() throws RecognitionException {
		EspecificadorTipoContext _localctx = new EspecificadorTipoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_especificadorTipo);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(INTEGER);
				((EspecificadorTipoContext)_localctx).tipo =  "integer";
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(CHAR);
				((EspecificadorTipoContext)_localctx).tipo =  "char";
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				match(BOOLEAN);
				((EspecificadorTipoContext)_localctx).tipo =  "boolean";
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

	@SuppressWarnings("CheckReturnValue")
	public static class SignoContext extends ParserRuleContext {
		public TerminalNode OPSUM() { return getToken(GrammarPascalParser.OPSUM, 0); }
		public SignoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).enterSigno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarPascalListener ) ((GrammarPascalListener)listener).exitSigno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarPascalVisitor ) return ((GrammarPascalVisitor<? extends T>)visitor).visitSigno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignoContext signo() throws RecognitionException {
		SignoContext _localctx = new SignoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_signo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(OPSUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return listaIdentificadores_sempred((ListaIdentificadoresContext)_localctx, predIndex);
		case 18:
			return expresion_Simple_sempred((Expresion_SimpleContext)_localctx, predIndex);
		case 19:
			return termino_sempred((TerminoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean listaIdentificadores_sempred(ListaIdentificadoresContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expresion_Simple_sempred(Expresion_SimpleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean termino_sempred(TerminoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001.\u0102\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		">\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002F\b\u0002\n\u0002\f\u0002I\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005S\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006a\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0005\u0007e\b\u0007\n\u0007\f\u0007h\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007l\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\bs\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u007f\b\n\u0001\n\u0003\n\u0082\b\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u0097\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00af\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b5\b\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00ba\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00c2\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00d2\b\u0012\n\u0012"+
		"\f\u0012\u00d5\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u00dd\b\u0013\n\u0013\f\u0013\u00e0"+
		"\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u00ee\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00f6\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00fe"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0000\u0003\u0004$&\u0018"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.\u0000\u0001\u0002\u0000\u001b\u001b,,\u010d\u0000"+
		"0\u0001\u0000\u0000\u0000\u0002=\u0001\u0000\u0000\u0000\u0004?\u0001"+
		"\u0000\u0000\u0000\u0006J\u0001\u0000\u0000\u0000\bL\u0001\u0000\u0000"+
		"\u0000\nR\u0001\u0000\u0000\u0000\f`\u0001\u0000\u0000\u0000\u000eb\u0001"+
		"\u0000\u0000\u0000\u0010r\u0001\u0000\u0000\u0000\u0012t\u0001\u0000\u0000"+
		"\u0000\u0014y\u0001\u0000\u0000\u0000\u0016\u0096\u0001\u0000\u0000\u0000"+
		"\u0018\u00ae\u0001\u0000\u0000\u0000\u001a\u00b4\u0001\u0000\u0000\u0000"+
		"\u001c\u00b9\u0001\u0000\u0000\u0000\u001e\u00c1\u0001\u0000\u0000\u0000"+
		" \u00c3\u0001\u0000\u0000\u0000\"\u00c7\u0001\u0000\u0000\u0000$\u00cb"+
		"\u0001\u0000\u0000\u0000&\u00d6\u0001\u0000\u0000\u0000(\u00ed\u0001\u0000"+
		"\u0000\u0000*\u00f5\u0001\u0000\u0000\u0000,\u00fd\u0001\u0000\u0000\u0000"+
		".\u00ff\u0001\u0000\u0000\u000001\u0003\u0002\u0001\u000012\u0003\b\u0004"+
		"\u00002\u0001\u0001\u0000\u0000\u000034\u0005\u0001\u0000\u000045\u0005"+
		"\u001b\u0000\u00005>\u0005\"\u0000\u000067\u0005\u0001\u0000\u000078\u0005"+
		"\u001b\u0000\u000089\u0005&\u0000\u00009:\u0003\u0004\u0002\u0000:;\u0005"+
		"\'\u0000\u0000;<\u0005\"\u0000\u0000<>\u0001\u0000\u0000\u0000=3\u0001"+
		"\u0000\u0000\u0000=6\u0001\u0000\u0000\u0000>\u0003\u0001\u0000\u0000"+
		"\u0000?@\u0006\u0002\uffff\uffff\u0000@A\u0003\u0006\u0003\u0000AG\u0001"+
		"\u0000\u0000\u0000BC\n\u0001\u0000\u0000CD\u0005$\u0000\u0000DF\u0003"+
		"\u0006\u0003\u0000EB\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000"+
		"GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000H\u0005\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000JK\u0005\u001b\u0000\u0000K\u0007"+
		"\u0001\u0000\u0000\u0000LM\u0003\n\u0005\u0000MN\u0003\u000e\u0007\u0000"+
		"N\t\u0001\u0000\u0000\u0000OP\u0005\u0004\u0000\u0000PS\u0003\f\u0006"+
		"\u0000QS\u0001\u0000\u0000\u0000RO\u0001\u0000\u0000\u0000RQ\u0001\u0000"+
		"\u0000\u0000S\u000b\u0001\u0000\u0000\u0000TU\u0003\u0004\u0002\u0000"+
		"UV\u0005%\u0000\u0000VW\u0003,\u0016\u0000WX\u0005\"\u0000\u0000XY\u0003"+
		"\f\u0006\u0000Ya\u0001\u0000\u0000\u0000Z[\u0003\u0004\u0002\u0000[\\"+
		"\u0005%\u0000\u0000\\]\u0003,\u0016\u0000]^\u0005\"\u0000\u0000^_\u0006"+
		"\u0006\uffff\uffff\u0000_a\u0001\u0000\u0000\u0000`T\u0001\u0000\u0000"+
		"\u0000`Z\u0001\u0000\u0000\u0000a\r\u0001\u0000\u0000\u0000bf\u0005\u0002"+
		"\u0000\u0000ce\u0003\u0010\b\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ik\u0005\u0003\u0000\u0000"+
		"jl\u0005\"\u0000\u0000kj\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000"+
		"l\u000f\u0001\u0000\u0000\u0000ms\u0003\u0012\t\u0000ns\u0003\u000e\u0007"+
		"\u0000os\u0003\u0014\n\u0000ps\u0003\u0016\u000b\u0000qs\u0003\u0018\f"+
		"\u0000rm\u0001\u0000\u0000\u0000rn\u0001\u0000\u0000\u0000ro\u0001\u0000"+
		"\u0000\u0000rp\u0001\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000s\u0011"+
		"\u0001\u0000\u0000\u0000tu\u0005\u001b\u0000\u0000uv\u0005!\u0000\u0000"+
		"vw\u0003\u001a\r\u0000wx\u0005\"\u0000\u0000x\u0013\u0001\u0000\u0000"+
		"\u0000yz\u0005\u000e\u0000\u0000z{\u0003\u001a\r\u0000{|\u0005\u0012\u0000"+
		"\u0000|~\u0003\u0010\b\u0000}\u007f\u0005\u000f\u0000\u0000~}\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0081\u0001\u0000\u0000"+
		"\u0000\u0080\u0082\u0003\u0010\b\u0000\u0081\u0080\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0015\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0005\b\u0000\u0000\u0084\u0085\u0003\u001a\r\u0000\u0085"+
		"\u0086\u0005\t\u0000\u0000\u0086\u0087\u0003\u0010\b\u0000\u0087\u0097"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0010\u0000\u0000\u0089\u008a"+
		"\u0005\u001b\u0000\u0000\u008a\u008b\u0005!\u0000\u0000\u008b\u008c\u0003"+
		"\u001a\r\u0000\u008c\u008d\u0005\u0018\u0000\u0000\u008d\u008e\u0003\u001a"+
		"\r\u0000\u008e\u008f\u0005\t\u0000\u0000\u008f\u0090\u0003\u0010\b\u0000"+
		"\u0090\u0097\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0011\u0000\u0000"+
		"\u0092\u0093\u0003\u0010\b\u0000\u0093\u0094\u0005\u0013\u0000\u0000\u0094"+
		"\u0095\u0003\u001a\r\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0083"+
		"\u0001\u0000\u0000\u0000\u0096\u0088\u0001\u0000\u0000\u0000\u0096\u0091"+
		"\u0001\u0000\u0000\u0000\u0097\u0017\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0005\f\u0000\u0000\u0099\u009a\u0005&\u0000\u0000\u009a\u009b\u0005"+
		"\u001b\u0000\u0000\u009b\u00af\u0005\'\u0000\u0000\u009c\u009d\u0005\n"+
		"\u0000\u0000\u009d\u009e\u0005&\u0000\u0000\u009e\u009f\u0007\u0000\u0000"+
		"\u0000\u009f\u00a0\u0005\'\u0000\u0000\u00a0\u00af\u0005\"\u0000\u0000"+
		"\u00a1\u00a2\u0005\n\u0000\u0000\u00a2\u00a3\u0005&\u0000\u0000\u00a3"+
		"\u00a4\u0007\u0000\u0000\u0000\u00a4\u00a5\u0005$\u0000\u0000\u00a5\u00a6"+
		"\u0005\u001b\u0000\u0000\u00a6\u00af\u0005\'\u0000\u0000\u00a7\u00a8\u0005"+
		"\u000b\u0000\u0000\u00a8\u00af\u0005\"\u0000\u0000\u00a9\u00aa\u0005\u000b"+
		"\u0000\u0000\u00aa\u00ab\u0005&\u0000\u0000\u00ab\u00ac\u0007\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0005\'\u0000\u0000\u00ad\u00af\u0005\"\u0000\u0000"+
		"\u00ae\u0098\u0001\u0000\u0000\u0000\u00ae\u009c\u0001\u0000\u0000\u0000"+
		"\u00ae\u00a1\u0001\u0000\u0000\u0000\u00ae\u00a7\u0001\u0000\u0000\u0000"+
		"\u00ae\u00a9\u0001\u0000\u0000\u0000\u00af\u0019\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b5\u0003$\u0012\u0000\u00b1\u00b5\u0003\"\u0011\u0000\u00b2"+
		"\u00b5\u0003 \u0010\u0000\u00b3\u00b5\u0003\u001e\u000f\u0000\u00b4\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u001b"+
		"\u0001\u0000\u0000\u0000\u00b6\u00ba\u0003$\u0012\u0000\u00b7\u00ba\u0003"+
		"\"\u0011\u0000\u00b8\u00ba\u0003 \u0010\u0000\u00b9\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00b8\u0001\u0000"+
		"\u0000\u0000\u00ba\u001d\u0001\u0000\u0000\u0000\u00bb\u00bc\u0003\u001c"+
		"\u000e\u0000\u00bc\u00bd\u0005\u0019\u0000\u0000\u00bd\u00be\u0003\u001c"+
		"\u000e\u0000\u00be\u00c2\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0017"+
		"\u0000\u0000\u00c0\u00c2\u0003\u001a\r\u0000\u00c1\u00bb\u0001\u0000\u0000"+
		"\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u001f\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0003$\u0012\u0000\u00c4\u00c5\u0005\u001f\u0000\u0000"+
		"\u00c5\u00c6\u0003$\u0012\u0000\u00c6!\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0003$\u0012\u0000\u00c8\u00c9\u0005 \u0000\u0000\u00c9\u00ca\u0003$"+
		"\u0012\u0000\u00ca#\u0001\u0000\u0000\u0000\u00cb\u00cc\u0006\u0012\uffff"+
		"\uffff\u0000\u00cc\u00cd\u0003&\u0013\u0000\u00cd\u00d3\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\n\u0001\u0000\u0000\u00cf\u00d0\u0005\u001d\u0000\u0000"+
		"\u00d0\u00d2\u0003&\u0013\u0000\u00d1\u00ce\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d4%\u0001\u0000\u0000\u0000\u00d5\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d7\u0006\u0013\uffff\uffff\u0000\u00d7"+
		"\u00d8\u0003(\u0014\u0000\u00d8\u00de\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\n\u0001\u0000\u0000\u00da\u00db\u0005\u001e\u0000\u0000\u00db\u00dd\u0003"+
		"(\u0014\u0000\u00dc\u00d9\u0001\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000"+
		"\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000"+
		"\u0000\u0000\u00df\'\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000"+
		"\u0000\u00e1\u00ee\u0005\u001b\u0000\u0000\u00e2\u00e3\u0005&\u0000\u0000"+
		"\u00e3\u00e4\u0003\u001a\r\u0000\u00e4\u00e5\u0005\'\u0000\u0000\u00e5"+
		"\u00ee\u0001\u0000\u0000\u0000\u00e6\u00e7\u0003.\u0017\u0000\u00e7\u00e8"+
		"\u0005\u001b\u0000\u0000\u00e8\u00ee\u0001\u0000\u0000\u0000\u00e9\u00ee"+
		"\u0005\u0014\u0000\u0000\u00ea\u00eb\u0005\u0017\u0000\u0000\u00eb\u00ee"+
		"\u0003(\u0014\u0000\u00ec\u00ee\u0003*\u0015\u0000\u00ed\u00e1\u0001\u0000"+
		"\u0000\u0000\u00ed\u00e2\u0001\u0000\u0000\u0000\u00ed\u00e6\u0001\u0000"+
		"\u0000\u0000\u00ed\u00e9\u0001\u0000\u0000\u0000\u00ed\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee)\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f6\u0005\u001c\u0000\u0000\u00f0\u00f6\u0005+\u0000\u0000"+
		"\u00f1\u00f6\u0005\u001a\u0000\u0000\u00f2\u00f3\u0003.\u0017\u0000\u00f3"+
		"\u00f4\u0005\u001c\u0000\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5"+
		"\u00ef\u0001\u0000\u0000\u0000\u00f5\u00f0\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f5\u00f2\u0001\u0000\u0000\u0000\u00f6"+
		"+\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\u0007\u0000\u0000\u00f8\u00fe"+
		"\u0006\u0016\uffff\uffff\u0000\u00f9\u00fa\u0005\u0006\u0000\u0000\u00fa"+
		"\u00fe\u0006\u0016\uffff\uffff\u0000\u00fb\u00fc\u0005\u0005\u0000\u0000"+
		"\u00fc\u00fe\u0006\u0016\uffff\uffff\u0000\u00fd\u00f7\u0001\u0000\u0000"+
		"\u0000\u00fd\u00f9\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fe-\u0001\u0000\u0000\u0000\u00ff\u0100\u0005\u001d\u0000\u0000"+
		"\u0100/\u0001\u0000\u0000\u0000\u0013=GR`fkr~\u0081\u0096\u00ae\u00b4"+
		"\u00b9\u00c1\u00d3\u00de\u00ed\u00f5\u00fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}