// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.la.lexico;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LALexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CADEIA=1, NOVA_LINHA=2, ESPACO_EM_BRANCO=3, TAB=4, COMENTARIO=5, PALAVRAS_CHAVES=6, 
		IDENT=7, NUM_INT=8, NUM_REAL=9, COMENTARIO_NAO_FECHADO=10, CADEIA_NAO_FECHADA=11, 
		ERRO=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "CARACTERE_ESPECIAL", "TEXTO", "CADEIA", "NOVA_LINHA", 
			"ESPACO_EM_BRANCO", "TAB", "COMENTARIO", "PALAVRAS_CHAVES", "IDENT", 
			"NUM_INT", "NUM_REAL", "COMENTARIO_NAO_FECHADO", "CADEIA_NAO_FECHADA", 
			"ERRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'\\n'", "' '", "'\\t'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CADEIA", "NOVA_LINHA", "ESPACO_EM_BRANCO", "TAB", "COMENTARIO", 
			"PALAVRAS_CHAVES", "IDENT", "NUM_INT", "NUM_REAL", "COMENTARIO_NAO_FECHADO", 
			"CADEIA_NAO_FECHADA", "ERRO"
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


	public LALexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LALexer.g4"; }

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
		case 5:
			NOVA_LINHA_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			ESPACO_EM_BRANCO_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			TAB_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NOVA_LINHA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}
	private void ESPACO_EM_BRANCO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 skip(); 
			break;
		}
	}
	private void TAB_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 skip(); 
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\f\u0183\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0003\u0000#\b\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003,\b\u0003\n\u0003\f\u0003/\t\u0003\u0001\u0004\u0001\u0004\u0005"+
		"\u00043\b\u0004\n\u0004\f\u00046\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b"+
		"G\b\b\n\b\f\bJ\t\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0153\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u0159\b\n\n\n\f\n\u015c\t\n\u0001\u000b\u0004\u000b"+
		"\u015f\b\u000b\u000b\u000b\f\u000b\u0160\u0001\f\u0004\f\u0164\b\f\u000b"+
		"\f\f\f\u0165\u0001\f\u0001\f\u0004\f\u016a\b\f\u000b\f\f\f\u016b\u0003"+
		"\f\u016e\b\f\u0001\r\u0001\r\u0005\r\u0172\b\r\n\r\f\r\u0175\t\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0005\u000e\u017b\b\u000e\n\u000e\f"+
		"\u000e\u017e\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0000"+
		"\u0000\u0010\u0001\u0000\u0003\u0000\u0005\u0000\u0007\u0000\t\u0001\u000b"+
		"\u0002\r\u0003\u000f\u0004\u0011\u0005\u0013\u0006\u0015\u0007\u0017\b"+
		"\u0019\t\u001b\n\u001d\u000b\u001f\f\u0001\u0000\b\u0002\u0000AZaz\u0002"+
		"\u0000  ()\u0002\u0000\n\n\"\"\u0002\u0000\n\n}}\u0004\u0000%%(-//::\u0003"+
		"\u0000&&>>^^\u0002\u0000[[]]\u0002\u0000$$}~\u01ba\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001\"\u0001\u0000\u0000\u0000"+
		"\u0003$\u0001\u0000\u0000\u0000\u0005&\u0001\u0000\u0000\u0000\u0007-"+
		"\u0001\u0000\u0000\u0000\t0\u0001\u0000\u0000\u0000\u000b9\u0001\u0000"+
		"\u0000\u0000\r<\u0001\u0000\u0000\u0000\u000f?\u0001\u0000\u0000\u0000"+
		"\u0011B\u0001\u0000\u0000\u0000\u0013\u0152\u0001\u0000\u0000\u0000\u0015"+
		"\u0154\u0001\u0000\u0000\u0000\u0017\u015e\u0001\u0000\u0000\u0000\u0019"+
		"\u0163\u0001\u0000\u0000\u0000\u001b\u016f\u0001\u0000\u0000\u0000\u001d"+
		"\u0178\u0001\u0000\u0000\u0000\u001f\u0181\u0001\u0000\u0000\u0000!#\u0007"+
		"\u0000\u0000\u0000\"!\u0001\u0000\u0000\u0000#\u0002\u0001\u0000\u0000"+
		"\u0000$%\u000209\u0000%\u0004\u0001\u0000\u0000\u0000&\'\u0007\u0001\u0000"+
		"\u0000\'\u0006\u0001\u0000\u0000\u0000(,\u0003\u0001\u0000\u0000),\u0003"+
		"\u0003\u0001\u0000*,\u0003\u0005\u0002\u0000+(\u0001\u0000\u0000\u0000"+
		"+)\u0001\u0000\u0000\u0000+*\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000"+
		"\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.\b\u0001\u0000"+
		"\u0000\u0000/-\u0001\u0000\u0000\u000004\u0005\"\u0000\u000013\b\u0002"+
		"\u0000\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001"+
		"\u0000\u0000\u000045\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u0000"+
		"64\u0001\u0000\u0000\u000078\u0005\"\u0000\u00008\n\u0001\u0000\u0000"+
		"\u00009:\u0005\n\u0000\u0000:;\u0006\u0005\u0000\u0000;\f\u0001\u0000"+
		"\u0000\u0000<=\u0005 \u0000\u0000=>\u0006\u0006\u0001\u0000>\u000e\u0001"+
		"\u0000\u0000\u0000?@\u0005\t\u0000\u0000@A\u0006\u0007\u0002\u0000A\u0010"+
		"\u0001\u0000\u0000\u0000BC\u0005{\u0000\u0000CD\u0005 \u0000\u0000DH\u0001"+
		"\u0000\u0000\u0000EG\b\u0003\u0000\u0000FE\u0001\u0000\u0000\u0000GJ\u0001"+
		"\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000"+
		"IK\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KL\u0005}\u0000\u0000"+
		"LM\u0006\b\u0003\u0000M\u0012\u0001\u0000\u0000\u0000NO\u0005a\u0000\u0000"+
		"OP\u0005l\u0000\u0000PQ\u0005g\u0000\u0000QR\u0005o\u0000\u0000RS\u0005"+
		"r\u0000\u0000ST\u0005i\u0000\u0000TU\u0005t\u0000\u0000UV\u0005m\u0000"+
		"\u0000V\u0153\u0005o\u0000\u0000WX\u0005f\u0000\u0000XY\u0005i\u0000\u0000"+
		"YZ\u0005m\u0000\u0000Z[\u0005_\u0000\u0000[\\\u0005a\u0000\u0000\\]\u0005"+
		"l\u0000\u0000]^\u0005g\u0000\u0000^_\u0005o\u0000\u0000_`\u0005r\u0000"+
		"\u0000`a\u0005i\u0000\u0000ab\u0005t\u0000\u0000bc\u0005m\u0000\u0000"+
		"c\u0153\u0005o\u0000\u0000de\u0005d\u0000\u0000ef\u0005e\u0000\u0000f"+
		"g\u0005c\u0000\u0000gh\u0005l\u0000\u0000hi\u0005a\u0000\u0000ij\u0005"+
		"r\u0000\u0000j\u0153\u0005e\u0000\u0000kl\u0005t\u0000\u0000lm\u0005i"+
		"\u0000\u0000mn\u0005p\u0000\u0000n\u0153\u0005o\u0000\u0000op\u0005l\u0000"+
		"\u0000pq\u0005e\u0000\u0000qr\u0005i\u0000\u0000r\u0153\u0005a\u0000\u0000"+
		"st\u0005e\u0000\u0000tu\u0005s\u0000\u0000uv\u0005c\u0000\u0000vw\u0005"+
		"r\u0000\u0000wx\u0005e\u0000\u0000xy\u0005v\u0000\u0000y\u0153\u0005a"+
		"\u0000\u0000z{\u0005i\u0000\u0000{|\u0005n\u0000\u0000|}\u0005t\u0000"+
		"\u0000}~\u0005e\u0000\u0000~\u007f\u0005i\u0000\u0000\u007f\u0080\u0005"+
		"r\u0000\u0000\u0080\u0153\u0005o\u0000\u0000\u0081\u0082\u0005r\u0000"+
		"\u0000\u0082\u0083\u0005e\u0000\u0000\u0083\u0084\u0005a\u0000\u0000\u0084"+
		"\u0153\u0005l\u0000\u0000\u0085\u0086\u0005l\u0000\u0000\u0086\u0087\u0005"+
		"o\u0000\u0000\u0087\u0088\u0005g\u0000\u0000\u0088\u0089\u0005i\u0000"+
		"\u0000\u0089\u008a\u0005c\u0000\u0000\u008a\u0153\u0005o\u0000\u0000\u008b"+
		"\u008c\u0005l\u0000\u0000\u008c\u008d\u0005i\u0000\u0000\u008d\u008e\u0005"+
		"t\u0000\u0000\u008e\u008f\u0005e\u0000\u0000\u008f\u0090\u0005r\u0000"+
		"\u0000\u0090\u0091\u0005a\u0000\u0000\u0091\u0153\u0005l\u0000\u0000\u0092"+
		"\u0093\u0005v\u0000\u0000\u0093\u0094\u0005a\u0000\u0000\u0094\u0153\u0005"+
		"r\u0000\u0000\u0095\u0096\u0005c\u0000\u0000\u0096\u0097\u0005o\u0000"+
		"\u0000\u0097\u0098\u0005n\u0000\u0000\u0098\u0099\u0005s\u0000\u0000\u0099"+
		"\u009a\u0005t\u0000\u0000\u009a\u009b\u0005a\u0000\u0000\u009b\u009c\u0005"+
		"n\u0000\u0000\u009c\u009d\u0005t\u0000\u0000\u009d\u0153\u0005e\u0000"+
		"\u0000\u009e\u0153\u0005e\u0000\u0000\u009f\u00a0\u0005o\u0000\u0000\u00a0"+
		"\u0153\u0005u\u0000\u0000\u00a1\u00a2\u0005n\u0000\u0000\u00a2\u00a3\u0005"+
		"a\u0000\u0000\u00a3\u0153\u0005o\u0000\u0000\u00a4\u00a5\u0005s\u0000"+
		"\u0000\u00a5\u0153\u0005e\u0000\u0000\u00a6\u00a7\u0005e\u0000\u0000\u00a7"+
		"\u00a8\u0005n\u0000\u0000\u00a8\u00a9\u0005t\u0000\u0000\u00a9\u00aa\u0005"+
		"a\u0000\u0000\u00aa\u0153\u0005o\u0000\u0000\u00ab\u00ac\u0005s\u0000"+
		"\u0000\u00ac\u00ad\u0005e\u0000\u0000\u00ad\u00ae\u0005n\u0000\u0000\u00ae"+
		"\u00af\u0005a\u0000\u0000\u00af\u0153\u0005o\u0000\u0000\u00b0\u00b1\u0005"+
		"f\u0000\u0000\u00b1\u00b2\u0005i\u0000\u0000\u00b2\u00b3\u0005m\u0000"+
		"\u0000\u00b3\u00b4\u0005_\u0000\u0000\u00b4\u00b5\u0005s\u0000\u0000\u00b5"+
		"\u0153\u0005e\u0000\u0000\u00b6\u00b7\u0005c\u0000\u0000\u00b7\u00b8\u0005"+
		"a\u0000\u0000\u00b8\u00b9\u0005s\u0000\u0000\u00b9\u0153\u0005o\u0000"+
		"\u0000\u00ba\u00bb\u0005f\u0000\u0000\u00bb\u00bc\u0005i\u0000\u0000\u00bc"+
		"\u00bd\u0005m\u0000\u0000\u00bd\u00be\u0005_\u0000\u0000\u00be\u00bf\u0005"+
		"c\u0000\u0000\u00bf\u00c0\u0005a\u0000\u0000\u00c0\u00c1\u0005s\u0000"+
		"\u0000\u00c1\u0153\u0005o\u0000\u0000\u00c2\u00c3\u0005s\u0000\u0000\u00c3"+
		"\u00c4\u0005e\u0000\u0000\u00c4\u00c5\u0005j\u0000\u0000\u00c5\u0153\u0005"+
		"a\u0000\u0000\u00c6\u00c7\u0005p\u0000\u0000\u00c7\u00c8\u0005a\u0000"+
		"\u0000\u00c8\u00c9\u0005r\u0000\u0000\u00c9\u0153\u0005a\u0000\u0000\u00ca"+
		"\u00cb\u0005a\u0000\u0000\u00cb\u00cc\u0005t\u0000\u0000\u00cc\u0153\u0005"+
		"e\u0000\u0000\u00cd\u00ce\u0005f\u0000\u0000\u00ce\u00cf\u0005a\u0000"+
		"\u0000\u00cf\u00d0\u0005c\u0000\u0000\u00d0\u0153\u0005a\u0000\u0000\u00d1"+
		"\u00d2\u0005f\u0000\u0000\u00d2\u00d3\u0005i\u0000\u0000\u00d3\u00d4\u0005"+
		"m\u0000\u0000\u00d4\u00d5\u0005_\u0000\u0000\u00d5\u00d6\u0005p\u0000"+
		"\u0000\u00d6\u00d7\u0005a\u0000\u0000\u00d7\u00d8\u0005r\u0000\u0000\u00d8"+
		"\u0153\u0005a\u0000\u0000\u00d9\u00da\u0005e\u0000\u0000\u00da\u00db\u0005"+
		"n\u0000\u0000\u00db\u00dc\u0005q\u0000\u0000\u00dc\u00dd\u0005u\u0000"+
		"\u0000\u00dd\u00de\u0005a\u0000\u0000\u00de\u00df\u0005n\u0000\u0000\u00df"+
		"\u00e0\u0005t\u0000\u0000\u00e0\u0153\u0005o\u0000\u0000\u00e1\u00e2\u0005"+
		"f\u0000\u0000\u00e2\u00e3\u0005i\u0000\u0000\u00e3\u00e4\u0005m\u0000"+
		"\u0000\u00e4\u00e5\u0005_\u0000\u0000\u00e5\u00e6\u0005e\u0000\u0000\u00e6"+
		"\u00e7\u0005n\u0000\u0000\u00e7\u00e8\u0005q\u0000\u0000\u00e8\u00e9\u0005"+
		"u\u0000\u0000\u00e9\u00ea\u0005a\u0000\u0000\u00ea\u00eb\u0005n\u0000"+
		"\u0000\u00eb\u00ec\u0005t\u0000\u0000\u00ec\u0153\u0005o\u0000\u0000\u00ed"+
		"\u00ee\u0005r\u0000\u0000\u00ee\u00ef\u0005e\u0000\u0000\u00ef\u00f0\u0005"+
		"g\u0000\u0000\u00f0\u00f1\u0005i\u0000\u0000\u00f1\u00f2\u0005s\u0000"+
		"\u0000\u00f2\u00f3\u0005t\u0000\u0000\u00f3\u00f4\u0005r\u0000\u0000\u00f4"+
		"\u0153\u0005o\u0000\u0000\u00f5\u00f6\u0005f\u0000\u0000\u00f6\u00f7\u0005"+
		"i\u0000\u0000\u00f7\u00f8\u0005m\u0000\u0000\u00f8\u00f9\u0005_\u0000"+
		"\u0000\u00f9\u00fa\u0005r\u0000\u0000\u00fa\u00fb\u0005e\u0000\u0000\u00fb"+
		"\u00fc\u0005g\u0000\u0000\u00fc\u00fd\u0005i\u0000\u0000\u00fd\u00fe\u0005"+
		"s\u0000\u0000\u00fe\u00ff\u0005t\u0000\u0000\u00ff\u0100\u0005r\u0000"+
		"\u0000\u0100\u0153\u0005o\u0000\u0000\u0101\u0102\u0005p\u0000\u0000\u0102"+
		"\u0103\u0005r\u0000\u0000\u0103\u0104\u0005o\u0000\u0000\u0104\u0105\u0005"+
		"c\u0000\u0000\u0105\u0106\u0005e\u0000\u0000\u0106\u0107\u0005d\u0000"+
		"\u0000\u0107\u0108\u0005i\u0000\u0000\u0108\u0109\u0005m\u0000\u0000\u0109"+
		"\u010a\u0005e\u0000\u0000\u010a\u010b\u0005n\u0000\u0000\u010b\u010c\u0005"+
		"t\u0000\u0000\u010c\u0153\u0005o\u0000\u0000\u010d\u010e\u0005f\u0000"+
		"\u0000\u010e\u010f\u0005i\u0000\u0000\u010f\u0110\u0005m\u0000\u0000\u0110"+
		"\u0111\u0005_\u0000\u0000\u0111\u0112\u0005p\u0000\u0000\u0112\u0113\u0005"+
		"r\u0000\u0000\u0113\u0114\u0005o\u0000\u0000\u0114\u0115\u0005c\u0000"+
		"\u0000\u0115\u0116\u0005e\u0000\u0000\u0116\u0117\u0005d\u0000\u0000\u0117"+
		"\u0118\u0005i\u0000\u0000\u0118\u0119\u0005m\u0000\u0000\u0119\u011a\u0005"+
		"e\u0000\u0000\u011a\u011b\u0005n\u0000\u0000\u011b\u011c\u0005t\u0000"+
		"\u0000\u011c\u0153\u0005o\u0000\u0000\u011d\u011e\u0005.\u0000\u0000\u011e"+
		"\u0153\u0005.\u0000\u0000\u011f\u0153\u0007\u0004\u0000\u0000\u0120\u0121"+
		"\u0005<\u0000\u0000\u0121\u0153\u0005=\u0000\u0000\u0122\u0123\u0005>"+
		"\u0000\u0000\u0123\u0153\u0005=\u0000\u0000\u0124\u0153\u0002<=\u0000"+
		"\u0125\u0126\u0005<\u0000\u0000\u0126\u0153\u0005>\u0000\u0000\u0127\u0153"+
		"\u0007\u0005\u0000\u0000\u0128\u0129\u0005<\u0000\u0000\u0129\u0153\u0005"+
		"-\u0000\u0000\u012a\u012b\u0005f\u0000\u0000\u012b\u012c\u0005u\u0000"+
		"\u0000\u012c\u012d\u0005n\u0000\u0000\u012d\u012e\u0005c\u0000\u0000\u012e"+
		"\u012f\u0005a\u0000\u0000\u012f\u0153\u0005o\u0000\u0000\u0130\u0131\u0005"+
		"r\u0000\u0000\u0131\u0132\u0005e\u0000\u0000\u0132\u0133\u0005t\u0000"+
		"\u0000\u0133\u0134\u0005o\u0000\u0000\u0134\u0135\u0005r\u0000\u0000\u0135"+
		"\u0136\u0005n\u0000\u0000\u0136\u0153\u0005e\u0000\u0000\u0137\u0138\u0005"+
		"f\u0000\u0000\u0138\u0139\u0005i\u0000\u0000\u0139\u013a\u0005m\u0000"+
		"\u0000\u013a\u013b\u0005_\u0000\u0000\u013b\u013c\u0005f\u0000\u0000\u013c"+
		"\u013d\u0005u\u0000\u0000\u013d\u013e\u0005n\u0000\u0000\u013e\u013f\u0005"+
		"c\u0000\u0000\u013f\u0140\u0005a\u0000\u0000\u0140\u0153\u0005o\u0000"+
		"\u0000\u0141\u0153\u0007\u0006\u0000\u0000\u0142\u0143\u0005f\u0000\u0000"+
		"\u0143\u0144\u0005a\u0000\u0000\u0144\u0145\u0005l\u0000\u0000\u0145\u0146"+
		"\u0005s\u0000\u0000\u0146\u0153\u0005o\u0000\u0000\u0147\u0148\u0005v"+
		"\u0000\u0000\u0148\u0149\u0005e\u0000\u0000\u0149\u014a\u0005r\u0000\u0000"+
		"\u014a\u014b\u0005d\u0000\u0000\u014b\u014c\u0005a\u0000\u0000\u014c\u014d"+
		"\u0005d\u0000\u0000\u014d\u014e\u0005e\u0000\u0000\u014e\u014f\u0005i"+
		"\u0000\u0000\u014f\u0150\u0005r\u0000\u0000\u0150\u0153\u0005o\u0000\u0000"+
		"\u0151\u0153\u0005.\u0000\u0000\u0152N\u0001\u0000\u0000\u0000\u0152W"+
		"\u0001\u0000\u0000\u0000\u0152d\u0001\u0000\u0000\u0000\u0152k\u0001\u0000"+
		"\u0000\u0000\u0152o\u0001\u0000\u0000\u0000\u0152s\u0001\u0000\u0000\u0000"+
		"\u0152z\u0001\u0000\u0000\u0000\u0152\u0081\u0001\u0000\u0000\u0000\u0152"+
		"\u0085\u0001\u0000\u0000\u0000\u0152\u008b\u0001\u0000\u0000\u0000\u0152"+
		"\u0092\u0001\u0000\u0000\u0000\u0152\u0095\u0001\u0000\u0000\u0000\u0152"+
		"\u009e\u0001\u0000\u0000\u0000\u0152\u009f\u0001\u0000\u0000\u0000\u0152"+
		"\u00a1\u0001\u0000\u0000\u0000\u0152\u00a4\u0001\u0000\u0000\u0000\u0152"+
		"\u00a6\u0001\u0000\u0000\u0000\u0152\u00ab\u0001\u0000\u0000\u0000\u0152"+
		"\u00b0\u0001\u0000\u0000\u0000\u0152\u00b6\u0001\u0000\u0000\u0000\u0152"+
		"\u00ba\u0001\u0000\u0000\u0000\u0152\u00c2\u0001\u0000\u0000\u0000\u0152"+
		"\u00c6\u0001\u0000\u0000\u0000\u0152\u00ca\u0001\u0000\u0000\u0000\u0152"+
		"\u00cd\u0001\u0000\u0000\u0000\u0152\u00d1\u0001\u0000\u0000\u0000\u0152"+
		"\u00d9\u0001\u0000\u0000\u0000\u0152\u00e1\u0001\u0000\u0000\u0000\u0152"+
		"\u00ed\u0001\u0000\u0000\u0000\u0152\u00f5\u0001\u0000\u0000\u0000\u0152"+
		"\u0101\u0001\u0000\u0000\u0000\u0152\u010d\u0001\u0000\u0000\u0000\u0152"+
		"\u011d\u0001\u0000\u0000\u0000\u0152\u011f\u0001\u0000\u0000\u0000\u0152"+
		"\u0120\u0001\u0000\u0000\u0000\u0152\u0122\u0001\u0000\u0000\u0000\u0152"+
		"\u0124\u0001\u0000\u0000\u0000\u0152\u0125\u0001\u0000\u0000\u0000\u0152"+
		"\u0127\u0001\u0000\u0000\u0000\u0152\u0128\u0001\u0000\u0000\u0000\u0152"+
		"\u012a\u0001\u0000\u0000\u0000\u0152\u0130\u0001\u0000\u0000\u0000\u0152"+
		"\u0137\u0001\u0000\u0000\u0000\u0152\u0141\u0001\u0000\u0000\u0000\u0152"+
		"\u0142\u0001\u0000\u0000\u0000\u0152\u0147\u0001\u0000\u0000\u0000\u0152"+
		"\u0151\u0001\u0000\u0000\u0000\u0153\u0014\u0001\u0000\u0000\u0000\u0154"+
		"\u015a\u0003\u0001\u0000\u0000\u0155\u0159\u0003\u0001\u0000\u0000\u0156"+
		"\u0159\u0003\u0003\u0001\u0000\u0157\u0159\u0005_\u0000\u0000\u0158\u0155"+
		"\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0157"+
		"\u0001\u0000\u0000\u0000\u0159\u015c\u0001\u0000\u0000\u0000\u015a\u0158"+
		"\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u0016"+
		"\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015d\u015f"+
		"\u000209\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000"+
		"\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000"+
		"\u0000\u0000\u0161\u0018\u0001\u0000\u0000\u0000\u0162\u0164\u000209\u0000"+
		"\u0163\u0162\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000"+
		"\u0165\u0163\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000"+
		"\u0166\u016d\u0001\u0000\u0000\u0000\u0167\u0169\u0005.\u0000\u0000\u0168"+
		"\u016a\u000209\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u016a\u016b\u0001"+
		"\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016b\u016c\u0001"+
		"\u0000\u0000\u0000\u016c\u016e\u0001\u0000\u0000\u0000\u016d\u0167\u0001"+
		"\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u001a\u0001"+
		"\u0000\u0000\u0000\u016f\u0173\u0005{\u0000\u0000\u0170\u0172\b\u0003"+
		"\u0000\u0000\u0171\u0170\u0001\u0000\u0000\u0000\u0172\u0175\u0001\u0000"+
		"\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000"+
		"\u0000\u0000\u0174\u0176\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000"+
		"\u0000\u0000\u0176\u0177\u0005\n\u0000\u0000\u0177\u001c\u0001\u0000\u0000"+
		"\u0000\u0178\u017c\u0005\"\u0000\u0000\u0179\u017b\b\u0002\u0000\u0000"+
		"\u017a\u0179\u0001\u0000\u0000\u0000\u017b\u017e\u0001\u0000\u0000\u0000"+
		"\u017c\u017a\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000"+
		"\u017d\u017f\u0001\u0000\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0005\n\u0000\u0000\u0180\u001e\u0001\u0000\u0000\u0000\u0181"+
		"\u0182\u0007\u0007\u0000\u0000\u0182 \u0001\u0000\u0000\u0000\u000f\u0000"+
		"\"+-4H\u0152\u0158\u015a\u0160\u0165\u016b\u016d\u0173\u017c\u0004\u0001"+
		"\u0005\u0000\u0001\u0006\u0001\u0001\u0007\u0002\u0001\b\u0003";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}