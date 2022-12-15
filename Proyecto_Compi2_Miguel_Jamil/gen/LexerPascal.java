// Generated from /Users/miguel/Documents/UNITEC/4 year/Trimestre 14/Compiladores II/Proyecto/Proyecto_Compiladores_2/Proyecto_Compi2_Miguel_Jamil/src/LexerPascal.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexerPascal extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		P_PROGRAM=1, BEGIN=2, END=3, VAR=4, BOOLEAN=5, CHAR=6, INTEGER=7, WHILE=8, 
		DO=9, WRITE=10, WRITELN=11, READ=12, READLN=13, IF=14, ELSE=15, FOR=16, 
		REPEAT=17, THEN=18, UNTIL=19, NIL=20, DIV=21, MOD=22, AND=23, OR=24, NOT=25, 
		TO=26, ID=27, INTEGER_VAL=28, BOOLEAN_VAL=29, OPSUM=30, OPMULT=31, OPREL=32, 
		EQUALS=33, OPBOOL=34, ASIGNACION=35, PUNTOCOMA=36, PUNTO=37, COMMA=38, 
		COLON=39, LPAR=40, RPAR=41, R_BRACKET=42, L_BRACKET=43, CARACTERES_ESP=44, 
		CHAR_VAL=45, CONSTSTRING=46, INICIO_COMMENT=47, LEX_ERROR_SYMBOL=48, WS=49, 
		FIN_COMMENT=50, NL=51, VALOR=52;
	public static final int
		COMMENT=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "COMMENT"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"P_PROGRAM", "BEGIN", "END", "VAR", "BOOLEAN", "CHAR", "INTEGER", "WHILE", 
			"DO", "WRITE", "WRITELN", "READ", "READLN", "IF", "ELSE", "FOR", "REPEAT", 
			"THEN", "UNTIL", "NIL", "DIV", "MOD", "AND", "OR", "NOT", "TO", "DIGITO", 
			"LETRA", "ID", "INTEGER_VAL", "BOOLEAN_VAL", "OPSUM", "OPMULT", "OPREL", 
			"EQUALS", "OPBOOL", "ASIGNACION", "PUNTOCOMA", "PUNTO", "COMMA", "COLON", 
			"LPAR", "RPAR", "R_BRACKET", "L_BRACKET", "CARACTERES_ESP", "CHAR_VAL", 
			"CONSTSTRING", "INICIO_COMMENT", "LEX_ERROR_SYMBOL", "WS", "FIN_COMMENT", 
			"NL", "VALOR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'begin'", "'end'", "'var'", "'boolean'", "'char'", 
			"'integer'", "'while'", "'do'", "'write'", "'writeln'", "'read'", "'readln'", 
			"'if'", "'else'", "'for'", "'repeat'", "'then'", "'until'", "'nil'", 
			"'div'", "'mod'", "'and'", "'or'", "'not'", "'to'", null, null, null, 
			null, null, null, "'='", null, "':='", "';'", "'.'", "','", "':'", "'('", 
			"')'", "']'", "'['", null, null, null, "'{'", null, null, "'}'", "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "P_PROGRAM", "BEGIN", "END", "VAR", "BOOLEAN", "CHAR", "INTEGER", 
			"WHILE", "DO", "WRITE", "WRITELN", "READ", "READLN", "IF", "ELSE", "FOR", 
			"REPEAT", "THEN", "UNTIL", "NIL", "DIV", "MOD", "AND", "OR", "NOT", "TO", 
			"ID", "INTEGER_VAL", "BOOLEAN_VAL", "OPSUM", "OPMULT", "OPREL", "EQUALS", 
			"OPBOOL", "ASIGNACION", "PUNTOCOMA", "PUNTO", "COMMA", "COLON", "LPAR", 
			"RPAR", "R_BRACKET", "L_BRACKET", "CARACTERES_ESP", "CHAR_VAL", "CONSTSTRING", 
			"INICIO_COMMENT", "LEX_ERROR_SYMBOL", "WS", "FIN_COMMENT", "NL", "VALOR"
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


	public LexerPascal(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexerPascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 49:
			LEX_ERROR_SYMBOL_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void LEX_ERROR_SYMBOL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("Error Lexico. Token invalido: < en linea: ");
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u00004\u0176\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000\u0007"+
		"\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007"+
		"\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007"+
		"\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n"+
		"\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002"+
		"\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002"+
		"\u0011\u0007\u0011\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002"+
		"\u0014\u0007\u0014\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002"+
		"\u0017\u0007\u0017\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002"+
		"\u001a\u0007\u001a\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002"+
		"\u001d\u0007\u001d\u0002\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002"+
		" \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002"+
		"%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002"+
		"*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002"+
		"/\u0007/\u00020\u00070\u00021\u00071\u00022\u00072\u00023\u00073\u0002"+
		"4\u00074\u00025\u00075\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0003\u001b\u00f8\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u00fd\b\u001c\n\u001c\f\u001c"+
		"\u0100\t\u001c\u0001\u001d\u0004\u001d\u0103\b\u001d\u000b\u001d\f\u001d"+
		"\u0104\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0110\b\u001e\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0003 \u0117\b \u0001!\u0001!"+
		"\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u0120\b!\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0003#\u0126\b#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001"+
		"+\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0003-\u0147\b-\u0001.\u0001.\u0001.\u0001"+
		".\u0003.\u014d\b.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0004/\u0155"+
		"\b/\u000b/\f/\u0156\u0001/\u0001/\u00010\u00010\u00010\u00010\u00010\u0001"+
		"1\u00011\u00011\u00012\u00042\u0164\b2\u000b2\f2\u0165\u00012\u00012\u0001"+
		"3\u00013\u00013\u00013\u00013\u00014\u00014\u00014\u00014\u00015\u0001"+
		"5\u00015\u00015\u0000\u00006\u0002\u0001\u0004\u0002\u0006\u0003\b\u0004"+
		"\n\u0005\f\u0006\u000e\u0007\u0010\b\u0012\t\u0014\n\u0016\u000b\u0018"+
		"\f\u001a\r\u001c\u000e\u001e\u000f \u0010\"\u0011$\u0012&\u0013(\u0014"+
		"*\u0015,\u0016.\u00170\u00182\u00194\u001a6\u00008\u0000:\u001b<\u001c"+
		">\u001d@\u001eB\u001fD F!H\"J#L$N%P&R\'T(V)X*Z+\\,^-`.b/d0f1h2j3l4\u0002"+
		"\u0000\u0001\u0007\u0001\u000009\u0003\u0000AZ__az\u0002\u0000++--\u0002"+
		"\u0000**//\u0002\u0000<<>>\u0005\u0000!!#\'--?@^^\u0003\u0000\t\n\r\r"+
		"  \u018d\u0000\u0002\u0001\u0000\u0000\u0000\u0000\u0004\u0001\u0000\u0000"+
		"\u0000\u0000\u0006\u0001\u0000\u0000\u0000\u0000\b\u0001\u0000\u0000\u0000"+
		"\u0000\n\u0001\u0000\u0000\u0000\u0000\f\u0001\u0000\u0000\u0000\u0000"+
		"\u000e\u0001\u0000\u0000\u0000\u0000\u0010\u0001\u0000\u0000\u0000\u0000"+
		"\u0012\u0001\u0000\u0000\u0000\u0000\u0014\u0001\u0000\u0000\u0000\u0000"+
		"\u0016\u0001\u0000\u0000\u0000\u0000\u0018\u0001\u0000\u0000\u0000\u0000"+
		"\u001a\u0001\u0000\u0000\u0000\u0000\u001c\u0001\u0000\u0000\u0000\u0000"+
		"\u001e\u0001\u0000\u0000\u0000\u0000 \u0001\u0000\u0000\u0000\u0000\""+
		"\u0001\u0000\u0000\u0000\u0000$\u0001\u0000\u0000\u0000\u0000&\u0001\u0000"+
		"\u0000\u0000\u0000(\u0001\u0000\u0000\u0000\u0000*\u0001\u0000\u0000\u0000"+
		"\u0000,\u0001\u0000\u0000\u0000\u0000.\u0001\u0000\u0000\u0000\u00000"+
		"\u0001\u0000\u0000\u0000\u00002\u0001\u0000\u0000\u0000\u00004\u0001\u0000"+
		"\u0000\u0000\u0000:\u0001\u0000\u0000\u0000\u0000<\u0001\u0000\u0000\u0000"+
		"\u0000>\u0001\u0000\u0000\u0000\u0000@\u0001\u0000\u0000\u0000\u0000B"+
		"\u0001\u0000\u0000\u0000\u0000D\u0001\u0000\u0000\u0000\u0000F\u0001\u0000"+
		"\u0000\u0000\u0000H\u0001\u0000\u0000\u0000\u0000J\u0001\u0000\u0000\u0000"+
		"\u0000L\u0001\u0000\u0000\u0000\u0000N\u0001\u0000\u0000\u0000\u0000P"+
		"\u0001\u0000\u0000\u0000\u0000R\u0001\u0000\u0000\u0000\u0000T\u0001\u0000"+
		"\u0000\u0000\u0000V\u0001\u0000\u0000\u0000\u0000X\u0001\u0000\u0000\u0000"+
		"\u0000Z\u0001\u0000\u0000\u0000\u0000\\\u0001\u0000\u0000\u0000\u0000"+
		"^\u0001\u0000\u0000\u0000\u0000`\u0001\u0000\u0000\u0000\u0000b\u0001"+
		"\u0000\u0000\u0000\u0000d\u0001\u0000\u0000\u0000\u0000f\u0001\u0000\u0000"+
		"\u0000\u0001h\u0001\u0000\u0000\u0000\u0001j\u0001\u0000\u0000\u0000\u0001"+
		"l\u0001\u0000\u0000\u0000\u0002n\u0001\u0000\u0000\u0000\u0004v\u0001"+
		"\u0000\u0000\u0000\u0006|\u0001\u0000\u0000\u0000\b\u0080\u0001\u0000"+
		"\u0000\u0000\n\u0084\u0001\u0000\u0000\u0000\f\u008c\u0001\u0000\u0000"+
		"\u0000\u000e\u0091\u0001\u0000\u0000\u0000\u0010\u0099\u0001\u0000\u0000"+
		"\u0000\u0012\u009f\u0001\u0000\u0000\u0000\u0014\u00a2\u0001\u0000\u0000"+
		"\u0000\u0016\u00a8\u0001\u0000\u0000\u0000\u0018\u00b0\u0001\u0000\u0000"+
		"\u0000\u001a\u00b5\u0001\u0000\u0000\u0000\u001c\u00bc\u0001\u0000\u0000"+
		"\u0000\u001e\u00bf\u0001\u0000\u0000\u0000 \u00c4\u0001\u0000\u0000\u0000"+
		"\"\u00c8\u0001\u0000\u0000\u0000$\u00cf\u0001\u0000\u0000\u0000&\u00d4"+
		"\u0001\u0000\u0000\u0000(\u00da\u0001\u0000\u0000\u0000*\u00de\u0001\u0000"+
		"\u0000\u0000,\u00e2\u0001\u0000\u0000\u0000.\u00e6\u0001\u0000\u0000\u0000"+
		"0\u00ea\u0001\u0000\u0000\u00002\u00ed\u0001\u0000\u0000\u00004\u00f1"+
		"\u0001\u0000\u0000\u00006\u00f4\u0001\u0000\u0000\u00008\u00f7\u0001\u0000"+
		"\u0000\u0000:\u00f9\u0001\u0000\u0000\u0000<\u0102\u0001\u0000\u0000\u0000"+
		">\u010f\u0001\u0000\u0000\u0000@\u0111\u0001\u0000\u0000\u0000B\u0116"+
		"\u0001\u0000\u0000\u0000D\u011f\u0001\u0000\u0000\u0000F\u0121\u0001\u0000"+
		"\u0000\u0000H\u0125\u0001\u0000\u0000\u0000J\u0127\u0001\u0000\u0000\u0000"+
		"L\u012a\u0001\u0000\u0000\u0000N\u012c\u0001\u0000\u0000\u0000P\u012e"+
		"\u0001\u0000\u0000\u0000R\u0130\u0001\u0000\u0000\u0000T\u0132\u0001\u0000"+
		"\u0000\u0000V\u0134\u0001\u0000\u0000\u0000X\u0136\u0001\u0000\u0000\u0000"+
		"Z\u0138\u0001\u0000\u0000\u0000\\\u0146\u0001\u0000\u0000\u0000^\u0148"+
		"\u0001\u0000\u0000\u0000`\u0150\u0001\u0000\u0000\u0000b\u015a\u0001\u0000"+
		"\u0000\u0000d\u015f\u0001\u0000\u0000\u0000f\u0163\u0001\u0000\u0000\u0000"+
		"h\u0169\u0001\u0000\u0000\u0000j\u016e\u0001\u0000\u0000\u0000l\u0172"+
		"\u0001\u0000\u0000\u0000no\u0005p\u0000\u0000op\u0005r\u0000\u0000pq\u0005"+
		"o\u0000\u0000qr\u0005g\u0000\u0000rs\u0005r\u0000\u0000st\u0005a\u0000"+
		"\u0000tu\u0005m\u0000\u0000u\u0003\u0001\u0000\u0000\u0000vw\u0005b\u0000"+
		"\u0000wx\u0005e\u0000\u0000xy\u0005g\u0000\u0000yz\u0005i\u0000\u0000"+
		"z{\u0005n\u0000\u0000{\u0005\u0001\u0000\u0000\u0000|}\u0005e\u0000\u0000"+
		"}~\u0005n\u0000\u0000~\u007f\u0005d\u0000\u0000\u007f\u0007\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0005v\u0000\u0000\u0081\u0082\u0005a\u0000\u0000"+
		"\u0082\u0083\u0005r\u0000\u0000\u0083\t\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0005b\u0000\u0000\u0085\u0086\u0005o\u0000\u0000\u0086\u0087\u0005"+
		"o\u0000\u0000\u0087\u0088\u0005l\u0000\u0000\u0088\u0089\u0005e\u0000"+
		"\u0000\u0089\u008a\u0005a\u0000\u0000\u008a\u008b\u0005n\u0000\u0000\u008b"+
		"\u000b\u0001\u0000\u0000\u0000\u008c\u008d\u0005c\u0000\u0000\u008d\u008e"+
		"\u0005h\u0000\u0000\u008e\u008f\u0005a\u0000\u0000\u008f\u0090\u0005r"+
		"\u0000\u0000\u0090\r\u0001\u0000\u0000\u0000\u0091\u0092\u0005i\u0000"+
		"\u0000\u0092\u0093\u0005n\u0000\u0000\u0093\u0094\u0005t\u0000\u0000\u0094"+
		"\u0095\u0005e\u0000\u0000\u0095\u0096\u0005g\u0000\u0000\u0096\u0097\u0005"+
		"e\u0000\u0000\u0097\u0098\u0005r\u0000\u0000\u0098\u000f\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0005w\u0000\u0000\u009a\u009b\u0005h\u0000\u0000\u009b"+
		"\u009c\u0005i\u0000\u0000\u009c\u009d\u0005l\u0000\u0000\u009d\u009e\u0005"+
		"e\u0000\u0000\u009e\u0011\u0001\u0000\u0000\u0000\u009f\u00a0\u0005d\u0000"+
		"\u0000\u00a0\u00a1\u0005o\u0000\u0000\u00a1\u0013\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0005w\u0000\u0000\u00a3\u00a4\u0005r\u0000\u0000\u00a4\u00a5"+
		"\u0005i\u0000\u0000\u00a5\u00a6\u0005t\u0000\u0000\u00a6\u00a7\u0005e"+
		"\u0000\u0000\u00a7\u0015\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005w\u0000"+
		"\u0000\u00a9\u00aa\u0005r\u0000\u0000\u00aa\u00ab\u0005i\u0000\u0000\u00ab"+
		"\u00ac\u0005t\u0000\u0000\u00ac\u00ad\u0005e\u0000\u0000\u00ad\u00ae\u0005"+
		"l\u0000\u0000\u00ae\u00af\u0005n\u0000\u0000\u00af\u0017\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0005r\u0000\u0000\u00b1\u00b2\u0005e\u0000\u0000\u00b2"+
		"\u00b3\u0005a\u0000\u0000\u00b3\u00b4\u0005d\u0000\u0000\u00b4\u0019\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0005r\u0000\u0000\u00b6\u00b7\u0005e\u0000"+
		"\u0000\u00b7\u00b8\u0005a\u0000\u0000\u00b8\u00b9\u0005d\u0000\u0000\u00b9"+
		"\u00ba\u0005l\u0000\u0000\u00ba\u00bb\u0005n\u0000\u0000\u00bb\u001b\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0005i\u0000\u0000\u00bd\u00be\u0005f\u0000"+
		"\u0000\u00be\u001d\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005e\u0000\u0000"+
		"\u00c0\u00c1\u0005l\u0000\u0000\u00c1\u00c2\u0005s\u0000\u0000\u00c2\u00c3"+
		"\u0005e\u0000\u0000\u00c3\u001f\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005"+
		"f\u0000\u0000\u00c5\u00c6\u0005o\u0000\u0000\u00c6\u00c7\u0005r\u0000"+
		"\u0000\u00c7!\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005r\u0000\u0000\u00c9"+
		"\u00ca\u0005e\u0000\u0000\u00ca\u00cb\u0005p\u0000\u0000\u00cb\u00cc\u0005"+
		"e\u0000\u0000\u00cc\u00cd\u0005a\u0000\u0000\u00cd\u00ce\u0005t\u0000"+
		"\u0000\u00ce#\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005t\u0000\u0000\u00d0"+
		"\u00d1\u0005h\u0000\u0000\u00d1\u00d2\u0005e\u0000\u0000\u00d2\u00d3\u0005"+
		"n\u0000\u0000\u00d3%\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005u\u0000"+
		"\u0000\u00d5\u00d6\u0005n\u0000\u0000\u00d6\u00d7\u0005t\u0000\u0000\u00d7"+
		"\u00d8\u0005i\u0000\u0000\u00d8\u00d9\u0005l\u0000\u0000\u00d9\'\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0005n\u0000\u0000\u00db\u00dc\u0005i\u0000"+
		"\u0000\u00dc\u00dd\u0005l\u0000\u0000\u00dd)\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\u0005d\u0000\u0000\u00df\u00e0\u0005i\u0000\u0000\u00e0\u00e1\u0005"+
		"v\u0000\u0000\u00e1+\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005m\u0000"+
		"\u0000\u00e3\u00e4\u0005o\u0000\u0000\u00e4\u00e5\u0005d\u0000\u0000\u00e5"+
		"-\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005a\u0000\u0000\u00e7\u00e8\u0005"+
		"n\u0000\u0000\u00e8\u00e9\u0005d\u0000\u0000\u00e9/\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u0005o\u0000\u0000\u00eb\u00ec\u0005r\u0000\u0000\u00ec"+
		"1\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005n\u0000\u0000\u00ee\u00ef\u0005"+
		"o\u0000\u0000\u00ef\u00f0\u0005t\u0000\u0000\u00f03\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f2\u0005t\u0000\u0000\u00f2\u00f3\u0005o\u0000\u0000\u00f3"+
		"5\u0001\u0000\u0000\u0000\u00f4\u00f5\u0007\u0000\u0000\u0000\u00f57\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f8\u0007\u0001\u0000\u0000\u00f7\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f89\u0001\u0000\u0000\u0000\u00f9\u00fe\u00038\u001b"+
		"\u0000\u00fa\u00fd\u00038\u001b\u0000\u00fb\u00fd\u00036\u001a\u0000\u00fc"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd"+
		"\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ff\u0001\u0000\u0000\u0000\u00ff;\u0001\u0000\u0000\u0000\u0100\u00fe"+
		"\u0001\u0000\u0000\u0000\u0101\u0103\u00036\u001a\u0000\u0102\u0101\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0102\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105=\u0001\u0000"+
		"\u0000\u0000\u0106\u0107\u0005t\u0000\u0000\u0107\u0108\u0005r\u0000\u0000"+
		"\u0108\u0109\u0005u\u0000\u0000\u0109\u0110\u0005e\u0000\u0000\u010a\u010b"+
		"\u0005f\u0000\u0000\u010b\u010c\u0005a\u0000\u0000\u010c\u010d\u0005l"+
		"\u0000\u0000\u010d\u010e\u0005s\u0000\u0000\u010e\u0110\u0005e\u0000\u0000"+
		"\u010f\u0106\u0001\u0000\u0000\u0000\u010f\u010a\u0001\u0000\u0000\u0000"+
		"\u0110?\u0001\u0000\u0000\u0000\u0111\u0112\u0007\u0002\u0000\u0000\u0112"+
		"A\u0001\u0000\u0000\u0000\u0113\u0117\u0007\u0003\u0000\u0000\u0114\u0117"+
		"\u0003*\u0014\u0000\u0115\u0117\u0003,\u0015\u0000\u0116\u0113\u0001\u0000"+
		"\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0115\u0001\u0000"+
		"\u0000\u0000\u0117C\u0001\u0000\u0000\u0000\u0118\u0119\u0005<\u0000\u0000"+
		"\u0119\u0120\u0005>\u0000\u0000\u011a\u0120\u0007\u0004\u0000\u0000\u011b"+
		"\u011c\u0005>\u0000\u0000\u011c\u0120\u0005=\u0000\u0000\u011d\u011e\u0005"+
		"<\u0000\u0000\u011e\u0120\u0005=\u0000\u0000\u011f\u0118\u0001\u0000\u0000"+
		"\u0000\u011f\u011a\u0001\u0000\u0000\u0000\u011f\u011b\u0001\u0000\u0000"+
		"\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u0120E\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0005=\u0000\u0000\u0122G\u0001\u0000\u0000\u0000\u0123\u0126"+
		"\u0003.\u0016\u0000\u0124\u0126\u00030\u0017\u0000\u0125\u0123\u0001\u0000"+
		"\u0000\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0126I\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\u0005:\u0000\u0000\u0128\u0129\u0005=\u0000\u0000\u0129"+
		"K\u0001\u0000\u0000\u0000\u012a\u012b\u0005;\u0000\u0000\u012bM\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u0005.\u0000\u0000\u012dO\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0005,\u0000\u0000\u012fQ\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\u0005:\u0000\u0000\u0131S\u0001\u0000\u0000\u0000\u0132\u0133\u0005"+
		"(\u0000\u0000\u0133U\u0001\u0000\u0000\u0000\u0134\u0135\u0005)\u0000"+
		"\u0000\u0135W\u0001\u0000\u0000\u0000\u0136\u0137\u0005]\u0000\u0000\u0137"+
		"Y\u0001\u0000\u0000\u0000\u0138\u0139\u0005[\u0000\u0000\u0139[\u0001"+
		"\u0000\u0000\u0000\u013a\u0147\u0003N&\u0000\u013b\u0147\u0007\u0005\u0000"+
		"\u0000\u013c\u0147\u0003P\'\u0000\u013d\u0147\u0003L%\u0000\u013e\u0147"+
		"\u0003T)\u0000\u013f\u0147\u0003V*\u0000\u0140\u0147\u0003X+\u0000\u0141"+
		"\u0147\u0003Z,\u0000\u0142\u0147\u0003R(\u0000\u0143\u0147\u0003H#\u0000"+
		"\u0144\u0147\u0003D!\u0000\u0145\u0147\u0003@\u001f\u0000\u0146\u013a"+
		"\u0001\u0000\u0000\u0000\u0146\u013b\u0001\u0000\u0000\u0000\u0146\u013c"+
		"\u0001\u0000\u0000\u0000\u0146\u013d\u0001\u0000\u0000\u0000\u0146\u013e"+
		"\u0001\u0000\u0000\u0000\u0146\u013f\u0001\u0000\u0000\u0000\u0146\u0140"+
		"\u0001\u0000\u0000\u0000\u0146\u0141\u0001\u0000\u0000\u0000\u0146\u0142"+
		"\u0001\u0000\u0000\u0000\u0146\u0143\u0001\u0000\u0000\u0000\u0146\u0144"+
		"\u0001\u0000\u0000\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0147]\u0001"+
		"\u0000\u0000\u0000\u0148\u014c\u0005\'\u0000\u0000\u0149\u014d\u00038"+
		"\u001b\u0000\u014a\u014d\u00036\u001a\u0000\u014b\u014d\u0003\\-\u0000"+
		"\u014c\u0149\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000"+
		"\u014c\u014b\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000"+
		"\u014e\u014f\u0005\'\u0000\u0000\u014f_\u0001\u0000\u0000\u0000\u0150"+
		"\u0154\u0005\'\u0000\u0000\u0151\u0155\u00038\u001b\u0000\u0152\u0155"+
		"\u00036\u001a\u0000\u0153\u0155\u0003\\-\u0000\u0154\u0151\u0001\u0000"+
		"\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0154\u0153\u0001\u0000"+
		"\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000"+
		"\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000"+
		"\u0000\u0000\u0158\u0159\u0005\'\u0000\u0000\u0159a\u0001\u0000\u0000"+
		"\u0000\u015a\u015b\u0005{\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000"+
		"\u015c\u015d\u00060\u0000\u0000\u015d\u015e\u00060\u0001\u0000\u015ec"+
		"\u0001\u0000\u0000\u0000\u015f\u0160\t\u0000\u0000\u0000\u0160\u0161\u0006"+
		"1\u0002\u0000\u0161e\u0001\u0000\u0000\u0000\u0162\u0164\u0007\u0006\u0000"+
		"\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000"+
		"\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000"+
		"\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0168\u00062\u0000\u0000"+
		"\u0168g\u0001\u0000\u0000\u0000\u0169\u016a\u0005}\u0000\u0000\u016a\u016b"+
		"\u0001\u0000\u0000\u0000\u016b\u016c\u00063\u0000\u0000\u016c\u016d\u0006"+
		"3\u0003\u0000\u016di\u0001\u0000\u0000\u0000\u016e\u016f\u0005\n\u0000"+
		"\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0171\u00064\u0000\u0000"+
		"\u0171k\u0001\u0000\u0000\u0000\u0172\u0173\t\u0000\u0000\u0000\u0173"+
		"\u0174\u0001\u0000\u0000\u0000\u0174\u0175\u00065\u0000\u0000\u0175m\u0001"+
		"\u0000\u0000\u0000\u000f\u0000\u0001\u00f7\u00fc\u00fe\u0104\u010f\u0116"+
		"\u011f\u0125\u0146\u014c\u0154\u0156\u0165\u0004\u0006\u0000\u0000\u0005"+
		"\u0001\u0000\u00011\u0000\u0004\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}