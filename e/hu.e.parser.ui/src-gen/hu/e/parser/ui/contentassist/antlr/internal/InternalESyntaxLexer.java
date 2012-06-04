package hu.e.parser.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalESyntaxLexer extends Lexer {
    public static final int RULE_ID=8;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__90=90;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int RULE_REAL=7;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_STRING=9;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int RULE_INT=4;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_HEXINT=5;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_BINARY=6;
    public static final int RULE_WS=12;

    // delegates
    // delegators

    public InternalESyntaxLexer() {;} 
    public InternalESyntaxLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalESyntaxLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11:7: ( '=' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12:7: ( 'unsigned' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12:9: 'unsigned'
            {
            match("unsigned"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:13:7: ( 'signed' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:13:9: 'signed'
            {
            match("signed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14:7: ( 'default' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:15:7: ( 'var' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:15:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:16:7: ( 'const' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:16:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:17:7: ( 'SET' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:17:9: 'SET'
            {
            match("SET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:18:7: ( 'ADD' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:18:9: 'ADD'
            {
            match("ADD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:19:7: ( 'SUBTRACT' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:19:9: 'SUBTRACT'
            {
            match("SUBTRACT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:20:7: ( 'AND' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:20:9: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:21:7: ( 'OR' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:21:9: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:22:7: ( 'XOR' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:22:9: 'XOR'
            {
            match("XOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:23:7: ( 'EQUALS' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:23:9: 'EQUALS'
            {
            match("EQUALS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:24:7: ( 'BRANCH' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:24:9: 'BRANCH'
            {
            match("BRANCH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:25:7: ( 'UC_GOTO' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:25:9: 'UC_GOTO'
            {
            match("UC_GOTO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:26:7: ( 'NOT' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:26:9: 'NOT'
            {
            match("NOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:27:7: ( 'INDIRECTION' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:27:9: 'INDIRECTION'
            {
            match("INDIRECTION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:28:7: ( 'CLEAR' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:28:9: 'CLEAR'
            {
            match("CLEAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:29:7: ( 'INCREMENT' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:29:9: 'INCREMENT'
            {
            match("INCREMENT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:30:7: ( 'DECREMENT' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:30:9: 'DECREMENT'
            {
            match("DECREMENT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:31:7: ( 'DIV' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:31:9: 'DIV'
            {
            match("DIV"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:32:7: ( 'MOD' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:32:9: 'MOD'
            {
            match("MOD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:33:7: ( 'LT' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:33:9: 'LT'
            {
            match("LT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:34:7: ( 'LTE' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:34:9: 'LTE'
            {
            match("LTE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:35:7: ( 'GT' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:35:9: 'GT'
            {
            match("GT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:36:7: ( 'GTE' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:36:9: 'GTE'
            {
            match("GTE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:37:7: ( 'intelHexfile' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:37:9: 'intelHexfile'
            {
            match("intelHexfile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:38:7: ( 'SRECHexfile' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:38:9: 'SRECHexfile'
            {
            match("SRECHexfile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:39:7: ( '-' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:39:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:40:7: ( '!' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:40:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:41:7: ( '&' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:41:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:42:7: ( '@' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:42:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:43:7: ( '*' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:43:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:44:7: ( '/' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:44:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:45:7: ( '%' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:45:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:46:7: ( '+' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:46:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:47:7: ( '==' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:47:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:48:7: ( '!=' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:48:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:49:7: ( '>=' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:49:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:50:7: ( '<=' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:50:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:51:7: ( '>' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:51:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:52:7: ( '<' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:52:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:53:7: ( '||' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:53:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:54:7: ( '&&' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:54:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:55:7: ( '.' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:55:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:56:7: ( 'annotation' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:56:9: 'annotation'
            {
            match("annotation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:57:7: ( '#' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:57:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:58:7: ( 'library' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:58:9: 'library'
            {
            match("library"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:59:7: ( ';' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:59:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:60:7: ( 'overrides' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:60:9: 'overrides'
            {
            match("overrides"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:61:7: ( ',' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:61:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:62:7: ( 'use' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:62:9: 'use'
            {
            match("use"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:63:7: ( 'type' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:63:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:64:7: ( 'pointer' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:64:9: 'pointer'
            {
            match("pointer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:65:7: ( 'of' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:65:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:66:7: ( 'array' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:66:9: 'array'
            {
            match("array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:67:7: ( '[' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:67:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:68:7: ( ']' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:68:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:69:7: ( 'fixed' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:69:9: 'fixed'
            {
            match("fixed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:70:7: ( 'bits' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:70:9: 'bits'
            {
            match("bits"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:71:7: ( 'scale' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:71:9: 'scale'
            {
            match("scale"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:72:7: ( 'struct' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:72:9: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:73:7: ( '{' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:73:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:74:7: ( '}' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:74:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:75:7: ( 'reg' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:75:9: 'reg'
            {
            match("reg"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:76:7: ( ':' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:76:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:77:7: ( 'label' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:77:9: 'label'
            {
            match("label"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:78:7: ( '(' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:78:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:79:7: ( ')' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:79:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:80:7: ( 'returns' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:80:9: 'returns'
            {
            match("returns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:81:7: ( 'operator' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:81:9: 'operator'
            {
            match("operator"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:82:7: ( 'binary' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:82:9: 'binary'
            {
            match("binary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:83:7: ( 'at' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:83:9: 'at'
            {
            match("at"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:84:7: ( 'program' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:84:9: 'program'
            {
            match("program"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:85:7: ( 'startAddr' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:85:9: 'startAddr'
            {
            match("startAddr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:86:7: ( 'memwidth' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:86:9: 'memwidth'
            {
            match("memwidth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:87:7: ( 'pointerType' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:87:9: 'pointerType'
            {
            match("pointerType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:88:7: ( 'addressType' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:88:9: 'addressType'
            {
            match("addressType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:89:7: ( 'link' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:89:9: 'link'
            {
            match("link"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:90:7: ( 'lib' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:90:9: 'lib'
            {
            match("lib"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:91:7: ( 'optimize' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:91:9: 'optimize'
            {
            match("optimize"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:92:7: ( 'mem' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:92:9: 'mem'
            {
            match("mem"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:93:7: ( '..' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:93:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:94:7: ( 'data' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:94:9: 'data'
            {
            match("data"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:95:7: ( 'include' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:95:9: 'include'
            {
            match("include"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:96:7: ( 'sizeof' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:96:9: 'sizeof'
            {
            match("sizeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:97:8: ( '->' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:97:10: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:98:8: ( 'isliteral' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:98:10: 'isliteral'
            {
            match("isliteral"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:99:8: ( 'if' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:99:10: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:100:8: ( 'else' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:100:10: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:101:8: ( 'while' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:101:10: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "RULE_HEXINT"
    public final void mRULE_HEXINT() throws RecognitionException {
        try {
            int _type = RULE_HEXINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12986:13: ( '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12986:15: '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            match("0x"); 

            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12986:20: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='F')||(LA1_0>='a' && LA1_0<='f')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEXINT"

    // $ANTLR start "RULE_BINARY"
    public final void mRULE_BINARY() throws RecognitionException {
        try {
            int _type = RULE_BINARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12988:13: ( 'b' ( '0' | '1' )+ )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12988:15: 'b' ( '0' | '1' )+
            {
            match('b'); 
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12988:19: ( '0' | '1' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='1')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BINARY"

    // $ANTLR start "RULE_REAL"
    public final void mRULE_REAL() throws RecognitionException {
        try {
            int _type = RULE_REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12990:11: ( RULE_INT '.' ( RULE_INT )? )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12990:13: RULE_INT '.' ( RULE_INT )?
            {
            mRULE_INT(); 
            match('.'); 
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12990:26: ( RULE_INT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12990:26: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12992:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12992:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12992:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12992:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12992:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12994:10: ( ( '0' .. '9' )+ )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12994:12: ( '0' .. '9' )+
            {
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12994:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12994:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12996:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12996:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12996:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12996:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12996:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12996:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12996:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12996:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12996:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12996:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12996:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12998:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12998:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12998:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12998:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:13000:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:13000:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:13000:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:13000:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:13000:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:13000:41: ( '\\r' )? '\\n'
                    {
                    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:13000:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:13000:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:13002:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:13002:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:13002:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:13004:16: ( . )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:13004:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | RULE_HEXINT | RULE_BINARY | RULE_REAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=101;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:310: T__64
                {
                mT__64(); 

                }
                break;
            case 52 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:316: T__65
                {
                mT__65(); 

                }
                break;
            case 53 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:322: T__66
                {
                mT__66(); 

                }
                break;
            case 54 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:328: T__67
                {
                mT__67(); 

                }
                break;
            case 55 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:334: T__68
                {
                mT__68(); 

                }
                break;
            case 56 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:340: T__69
                {
                mT__69(); 

                }
                break;
            case 57 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:346: T__70
                {
                mT__70(); 

                }
                break;
            case 58 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:352: T__71
                {
                mT__71(); 

                }
                break;
            case 59 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:358: T__72
                {
                mT__72(); 

                }
                break;
            case 60 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:364: T__73
                {
                mT__73(); 

                }
                break;
            case 61 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:370: T__74
                {
                mT__74(); 

                }
                break;
            case 62 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:376: T__75
                {
                mT__75(); 

                }
                break;
            case 63 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:382: T__76
                {
                mT__76(); 

                }
                break;
            case 64 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:388: T__77
                {
                mT__77(); 

                }
                break;
            case 65 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:394: T__78
                {
                mT__78(); 

                }
                break;
            case 66 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:400: T__79
                {
                mT__79(); 

                }
                break;
            case 67 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:406: T__80
                {
                mT__80(); 

                }
                break;
            case 68 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:412: T__81
                {
                mT__81(); 

                }
                break;
            case 69 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:418: T__82
                {
                mT__82(); 

                }
                break;
            case 70 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:424: T__83
                {
                mT__83(); 

                }
                break;
            case 71 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:430: T__84
                {
                mT__84(); 

                }
                break;
            case 72 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:436: T__85
                {
                mT__85(); 

                }
                break;
            case 73 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:442: T__86
                {
                mT__86(); 

                }
                break;
            case 74 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:448: T__87
                {
                mT__87(); 

                }
                break;
            case 75 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:454: T__88
                {
                mT__88(); 

                }
                break;
            case 76 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:460: T__89
                {
                mT__89(); 

                }
                break;
            case 77 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:466: T__90
                {
                mT__90(); 

                }
                break;
            case 78 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:472: T__91
                {
                mT__91(); 

                }
                break;
            case 79 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:478: T__92
                {
                mT__92(); 

                }
                break;
            case 80 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:484: T__93
                {
                mT__93(); 

                }
                break;
            case 81 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:490: T__94
                {
                mT__94(); 

                }
                break;
            case 82 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:496: T__95
                {
                mT__95(); 

                }
                break;
            case 83 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:502: T__96
                {
                mT__96(); 

                }
                break;
            case 84 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:508: T__97
                {
                mT__97(); 

                }
                break;
            case 85 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:514: T__98
                {
                mT__98(); 

                }
                break;
            case 86 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:520: T__99
                {
                mT__99(); 

                }
                break;
            case 87 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:526: T__100
                {
                mT__100(); 

                }
                break;
            case 88 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:533: T__101
                {
                mT__101(); 

                }
                break;
            case 89 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:540: T__102
                {
                mT__102(); 

                }
                break;
            case 90 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:547: T__103
                {
                mT__103(); 

                }
                break;
            case 91 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:554: T__104
                {
                mT__104(); 

                }
                break;
            case 92 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:561: RULE_HEXINT
                {
                mRULE_HEXINT(); 

                }
                break;
            case 93 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:573: RULE_BINARY
                {
                mRULE_BINARY(); 

                }
                break;
            case 94 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:585: RULE_REAL
                {
                mRULE_REAL(); 

                }
                break;
            case 95 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:595: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 96 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:603: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 97 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:612: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 98 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:624: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 99 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:640: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 100 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:656: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 101 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:664: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\100\24\103\1\141\1\143\1\145\2\uffff\1\152\2\uffff\1"+
        "\156\1\160\1\76\1\163\1\103\1\uffff\1\103\1\uffff\1\103\1\uffff"+
        "\2\103\2\uffff\2\103\2\uffff\1\103\3\uffff\3\103\2\u0092\1\76\1"+
        "\uffff\2\76\4\uffff\2\103\1\uffff\14\103\1\u00a7\12\103\1\u00b4"+
        "\1\u00b6\2\103\1\u00ba\24\uffff\2\103\1\u00bd\1\103\1\uffff\2\103"+
        "\1\uffff\1\103\1\u00c3\1\103\1\uffff\3\103\2\uffff\2\103\1\u00cc"+
        "\2\uffff\1\103\3\uffff\3\103\2\uffff\1\u0092\3\uffff\1\103\1\u00d3"+
        "\7\103\1\u00db\1\103\1\u00dd\2\103\1\u00e0\1\u00e1\1\uffff\1\u00e2"+
        "\3\103\1\u00e6\4\103\1\u00eb\1\u00ec\1\u00ed\1\uffff\1\u00ee\1\uffff"+
        "\3\103\1\uffff\2\103\1\uffff\1\103\1\u00f6\3\103\1\uffff\10\103"+
        "\1\uffff\1\u0102\1\103\1\u0105\3\103\1\uffff\6\103\1\u010f\1\uffff"+
        "\1\103\1\uffff\2\103\3\uffff\3\103\1\uffff\4\103\4\uffff\7\103\1"+
        "\uffff\1\u0121\4\103\1\u0126\3\103\1\u012a\1\103\1\uffff\2\103\1"+
        "\uffff\1\u012e\4\103\1\u0133\3\103\1\uffff\1\u0137\7\103\1\u013f"+
        "\5\103\1\u0145\2\103\1\uffff\1\u0148\3\103\1\uffff\2\103\1\u014e"+
        "\1\uffff\3\103\1\uffff\1\u0152\1\103\1\u0154\1\u0155\1\uffff\1\u0156"+
        "\2\103\1\uffff\2\103\1\u015b\1\u015c\3\103\1\uffff\5\103\1\uffff"+
        "\2\103\1\uffff\5\103\1\uffff\1\u016c\2\103\1\uffff\1\103\3\uffff"+
        "\1\103\1\u0171\2\103\2\uffff\1\u0174\4\103\1\u0179\3\103\1\u017d"+
        "\3\103\1\u0182\1\u0183\1\uffff\1\u0184\1\103\1\u0186\1\103\1\uffff"+
        "\1\u0188\1\103\1\uffff\4\103\1\uffff\3\103\1\uffff\1\103\1\u0192"+
        "\1\u0193\1\103\3\uffff\1\u0195\1\uffff\1\u0196\1\uffff\2\103\1\u0199"+
        "\1\u019a\1\103\1\u019c\2\103\1\u019f\2\uffff\1\103\2\uffff\2\103"+
        "\2\uffff\1\103\1\uffff\1\u01a4\1\103\1\uffff\1\103\1\u01a7\1\u01a8"+
        "\1\103\1\uffff\1\u01aa\1\u01ab\2\uffff\1\u01ac\3\uffff";
    static final String DFA15_eofS =
        "\u01ad\uffff";
    static final String DFA15_minS =
        "\1\0\1\75\1\156\1\143\2\141\1\157\1\105\1\104\1\122\1\117\1\121"+
        "\1\122\1\103\1\117\1\116\1\114\1\105\1\117\2\124\1\146\1\76\1\75"+
        "\1\46\2\uffff\1\52\2\uffff\2\75\1\174\1\56\1\144\1\uffff\1\141\1"+
        "\uffff\1\146\1\uffff\1\171\1\157\2\uffff\1\151\1\60\2\uffff\1\145"+
        "\3\uffff\1\145\1\154\1\150\2\56\1\101\1\uffff\2\0\4\uffff\1\163"+
        "\1\145\1\uffff\1\147\2\141\1\146\1\164\1\162\1\156\1\124\1\102\1"+
        "\105\2\104\1\60\1\122\1\125\1\101\1\137\1\124\1\103\1\105\1\103"+
        "\1\126\1\104\2\60\1\143\1\154\1\60\24\uffff\1\156\1\162\1\60\1\144"+
        "\1\uffff\2\142\1\uffff\1\145\1\60\1\145\1\uffff\1\160\1\151\1\157"+
        "\2\uffff\1\170\1\156\1\60\2\uffff\1\147\3\uffff\1\155\1\163\1\151"+
        "\2\uffff\1\56\3\uffff\1\151\1\60\1\156\1\145\1\154\1\165\1\162\2"+
        "\141\1\60\1\163\1\60\1\124\1\103\2\60\1\uffff\1\60\1\101\1\116\1"+
        "\107\1\60\1\111\1\122\1\101\1\122\3\60\1\uffff\1\60\1\uffff\1\145"+
        "\1\154\1\151\1\uffff\1\157\1\141\1\uffff\1\162\1\60\1\153\1\145"+
        "\1\162\1\uffff\1\162\1\151\1\145\1\156\1\147\1\145\1\163\1\141\1"+
        "\uffff\1\60\1\165\1\60\1\145\1\154\1\147\1\uffff\1\145\1\157\1\145"+
        "\1\143\1\164\1\165\1\60\1\uffff\1\164\1\uffff\1\122\1\110\3\uffff"+
        "\1\114\1\103\1\117\1\uffff\1\122\1\105\1\122\1\105\4\uffff\1\154"+
        "\1\165\2\164\1\171\1\145\1\141\1\uffff\1\60\1\154\1\162\1\141\1"+
        "\155\1\60\1\164\1\162\1\144\1\60\1\162\1\uffff\1\162\1\151\1\uffff"+
        "\1\60\1\145\1\156\1\144\1\146\1\60\1\164\1\101\1\154\1\uffff\1\60"+
        "\1\101\1\145\1\123\1\110\1\124\1\105\1\115\1\60\1\115\1\110\1\144"+
        "\1\145\1\141\1\60\1\163\1\162\1\uffff\1\60\1\151\1\164\1\151\1\uffff"+
        "\1\145\1\141\1\60\1\uffff\1\171\1\156\1\144\1\uffff\1\60\1\145\2"+
        "\60\1\uffff\1\60\1\144\1\164\1\uffff\1\103\1\170\2\60\1\117\1\103"+
        "\1\105\1\uffff\1\105\2\145\1\162\1\164\1\uffff\1\163\1\171\1\uffff"+
        "\1\144\1\157\1\172\1\162\1\155\1\uffff\1\60\1\163\1\164\1\uffff"+
        "\1\144\3\uffff\1\144\1\60\1\124\1\146\2\uffff\1\60\1\124\2\116\1"+
        "\170\1\60\1\141\1\151\1\124\1\60\1\145\1\162\1\145\2\60\1\uffff"+
        "\1\60\1\150\1\60\1\162\1\uffff\1\60\1\151\1\uffff\1\111\2\124\1"+
        "\146\1\uffff\1\154\1\157\1\171\1\uffff\1\163\2\60\1\171\3\uffff"+
        "\1\60\1\uffff\1\60\1\uffff\1\154\1\117\2\60\1\151\1\60\1\156\1\160"+
        "\1\60\2\uffff\1\160\2\uffff\1\145\1\116\2\uffff\1\154\1\uffff\1"+
        "\60\1\145\1\uffff\1\145\2\60\1\145\1\uffff\2\60\2\uffff\1\60\3\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\75\1\163\1\164\1\145\1\141\1\157\1\125\1\116\1\122\1"+
        "\117\1\121\1\122\1\103\1\117\1\116\1\114\1\111\1\117\2\124\1\163"+
        "\1\76\1\75\1\46\2\uffff\1\57\2\uffff\2\75\1\174\1\56\1\164\1\uffff"+
        "\1\151\1\uffff\1\166\1\uffff\1\171\1\162\2\uffff\2\151\2\uffff\1"+
        "\145\3\uffff\1\145\1\154\1\150\1\170\1\71\1\172\1\uffff\2\uffff"+
        "\4\uffff\1\163\1\145\1\uffff\1\172\1\141\1\162\1\146\1\164\1\162"+
        "\1\156\1\124\1\102\1\105\2\104\1\172\1\122\1\125\1\101\1\137\1\124"+
        "\1\104\1\105\1\103\1\126\1\104\2\172\1\164\1\154\1\172\24\uffff"+
        "\1\156\1\162\1\172\1\144\1\uffff\1\156\1\142\1\uffff\1\145\1\172"+
        "\1\164\1\uffff\1\160\1\151\1\157\2\uffff\1\170\1\164\1\172\2\uffff"+
        "\1\164\3\uffff\1\155\1\163\1\151\2\uffff\1\71\3\uffff\1\151\1\172"+
        "\1\156\1\145\1\154\1\165\1\162\2\141\1\172\1\163\1\172\1\124\1\103"+
        "\2\172\1\uffff\1\172\1\101\1\116\1\107\1\172\1\111\1\122\1\101\1"+
        "\122\3\172\1\uffff\1\172\1\uffff\1\145\1\154\1\151\1\uffff\1\157"+
        "\1\141\1\uffff\1\162\1\172\1\153\1\145\1\162\1\uffff\1\162\1\151"+
        "\1\145\1\156\1\147\1\145\1\163\1\141\1\uffff\1\172\1\165\1\172\1"+
        "\145\1\154\1\147\1\uffff\1\145\1\157\1\145\1\143\1\164\1\165\1\172"+
        "\1\uffff\1\164\1\uffff\1\122\1\110\3\uffff\1\114\1\103\1\117\1\uffff"+
        "\1\122\1\105\1\122\1\105\4\uffff\1\154\1\165\2\164\1\171\1\145\1"+
        "\141\1\uffff\1\172\1\154\1\162\1\141\1\155\1\172\1\164\1\162\1\144"+
        "\1\172\1\162\1\uffff\1\162\1\151\1\uffff\1\172\1\145\1\156\1\144"+
        "\1\146\1\172\1\164\1\101\1\154\1\uffff\1\172\1\101\1\145\1\123\1"+
        "\110\1\124\1\105\1\115\1\172\1\115\1\110\1\144\1\145\1\141\1\172"+
        "\1\163\1\162\1\uffff\1\172\1\151\1\164\1\151\1\uffff\1\145\1\141"+
        "\1\172\1\uffff\1\171\1\156\1\144\1\uffff\1\172\1\145\2\172\1\uffff"+
        "\1\172\1\144\1\164\1\uffff\1\103\1\170\2\172\1\117\1\103\1\105\1"+
        "\uffff\1\105\2\145\1\162\1\164\1\uffff\1\163\1\171\1\uffff\1\144"+
        "\1\157\1\172\1\162\1\155\1\uffff\1\172\1\163\1\164\1\uffff\1\144"+
        "\3\uffff\1\144\1\172\1\124\1\146\2\uffff\1\172\1\124\2\116\1\170"+
        "\1\172\1\141\1\151\1\124\1\172\1\145\1\162\1\145\2\172\1\uffff\1"+
        "\172\1\150\1\172\1\162\1\uffff\1\172\1\151\1\uffff\1\111\2\124\1"+
        "\146\1\uffff\1\154\1\157\1\171\1\uffff\1\163\2\172\1\171\3\uffff"+
        "\1\172\1\uffff\1\172\1\uffff\1\154\1\117\2\172\1\151\1\172\1\156"+
        "\1\160\1\172\2\uffff\1\160\2\uffff\1\145\1\116\2\uffff\1\154\1\uffff"+
        "\1\172\1\145\1\uffff\1\145\2\172\1\145\1\uffff\2\172\2\uffff\1\172"+
        "\3\uffff";
    static final String DFA15_acceptS =
        "\31\uffff\1\40\1\41\1\uffff\1\43\1\44\5\uffff\1\57\1\uffff\1\61"+
        "\1\uffff\1\63\2\uffff\1\71\1\72\2\uffff\1\77\1\100\1\uffff\1\102"+
        "\1\104\1\105\6\uffff\1\137\2\uffff\1\144\1\145\1\45\1\1\2\uffff"+
        "\1\137\34\uffff\1\127\1\35\1\46\1\36\1\54\1\37\1\40\1\41\1\142\1"+
        "\143\1\42\1\43\1\44\1\47\1\51\1\50\1\52\1\53\1\123\1\55\4\uffff"+
        "\1\57\2\uffff\1\61\3\uffff\1\63\3\uffff\1\71\1\72\3\uffff\1\77\1"+
        "\100\1\uffff\1\102\1\104\1\105\3\uffff\1\134\1\140\1\uffff\1\136"+
        "\1\141\1\144\20\uffff\1\13\14\uffff\1\27\1\uffff\1\31\3\uffff\1"+
        "\131\2\uffff\1\111\5\uffff\1\67\10\uffff\1\135\6\uffff\1\64\7\uffff"+
        "\1\5\1\uffff\1\7\2\uffff\1\10\1\12\1\14\3\uffff\1\20\4\uffff\1\25"+
        "\1\26\1\30\1\32\7\uffff\1\120\13\uffff\1\101\2\uffff\1\122\11\uffff"+
        "\1\124\21\uffff\1\117\4\uffff\1\65\3\uffff\1\74\3\uffff\1\132\4"+
        "\uffff\1\75\3\uffff\1\6\7\uffff\1\22\5\uffff\1\70\2\uffff\1\103"+
        "\5\uffff\1\73\3\uffff\1\133\1\uffff\1\3\1\126\1\76\4\uffff\1\15"+
        "\1\16\17\uffff\1\110\4\uffff\1\4\2\uffff\1\17\4\uffff\1\125\3\uffff"+
        "\1\60\4\uffff\1\66\1\112\1\106\1\uffff\1\2\1\uffff\1\11\11\uffff"+
        "\1\107\1\121\1\uffff\1\114\1\113\2\uffff\1\23\1\24\1\uffff\1\130"+
        "\2\uffff\1\62\4\uffff\1\56\2\uffff\1\34\1\21\1\uffff\1\116\1\115"+
        "\1\33";
    static final String DFA15_specialS =
        "\1\1\72\uffff\1\0\1\2\u0170\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\76\2\75\2\76\1\75\22\76\1\75\1\27\1\73\1\43\1\76\1\34\1"+
            "\30\1\74\1\62\1\63\1\32\1\35\1\47\1\26\1\41\1\33\1\67\11\70"+
            "\1\61\1\45\1\37\1\1\1\36\1\76\1\31\1\10\1\14\1\20\1\21\1\13"+
            "\1\72\1\24\1\72\1\17\2\72\1\23\1\22\1\16\1\11\3\72\1\7\1\72"+
            "\1\15\2\72\1\12\2\72\1\52\1\76\1\53\1\71\1\72\1\76\1\42\1\55"+
            "\1\6\1\4\1\65\1\54\2\72\1\25\2\72\1\44\1\64\1\72\1\46\1\51\1"+
            "\72\1\60\1\3\1\50\1\2\1\5\1\66\3\72\1\56\1\40\1\57\uff82\76",
            "\1\77",
            "\1\101\4\uffff\1\102",
            "\1\105\5\uffff\1\104\12\uffff\1\106",
            "\1\110\3\uffff\1\107",
            "\1\111",
            "\1\112",
            "\1\113\14\uffff\1\115\2\uffff\1\114",
            "\1\116\11\uffff\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130\3\uffff\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\137\7\uffff\1\135\4\uffff\1\136",
            "\1\140",
            "\1\142",
            "\1\144",
            "",
            "",
            "\1\150\4\uffff\1\151",
            "",
            "",
            "\1\155",
            "\1\157",
            "\1\161",
            "\1\162",
            "\1\167\11\uffff\1\164\3\uffff\1\165\1\uffff\1\166",
            "",
            "\1\172\7\uffff\1\171",
            "",
            "\1\175\11\uffff\1\176\5\uffff\1\174",
            "",
            "\1\u0080",
            "\1\u0081\2\uffff\1\u0082",
            "",
            "",
            "\1\u0085",
            "\2\u0087\67\uffff\1\u0086",
            "",
            "",
            "\1\u008a",
            "",
            "",
            "",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0094\1\uffff\12\u0093\76\uffff\1\u0091",
            "\1\u0094\1\uffff\12\u0093",
            "\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "\0\u0095",
            "\0\u0095",
            "",
            "",
            "",
            "",
            "\1\u0097",
            "\1\u0098",
            "",
            "\1\u0099\22\uffff\1\u009a",
            "\1\u009b",
            "\1\u009d\20\uffff\1\u009c",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ae\1\u00ad",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\12\103\7\uffff\4\103\1\u00b3\25\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\12\103\7\uffff\4\103\1\u00b5\25\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u00b8\20\uffff\1\u00b7",
            "\1\u00b9",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bb",
            "\1\u00bc",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u00be",
            "",
            "\1\u00bf\13\uffff\1\u00c0",
            "\1\u00c1",
            "",
            "\1\u00c2",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u00c4\16\uffff\1\u00c5",
            "",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "",
            "",
            "\1\u00c9",
            "\1\u00cb\5\uffff\1\u00ca",
            "\2\u0087\10\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "",
            "\1\u00cd\14\uffff\1\u00ce",
            "",
            "",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "",
            "\1\u0094\1\uffff\12\u0093",
            "",
            "",
            "",
            "\1\u00d2",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u00dc",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u00de",
            "\1\u00df",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "",
            "\1\u00f2",
            "\1\u00f3",
            "",
            "\1\u00f4",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\21\103\1\u00f5"+
            "\10\103",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u0103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\26\103\1\u0104"+
            "\3\103",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "\1\u0110",
            "",
            "\1\u0111",
            "\1\u0112",
            "",
            "",
            "",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "",
            "",
            "",
            "",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u012b",
            "",
            "\1\u012c",
            "\1\u012d",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u0146",
            "\1\u0147",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "",
            "\1\u014c",
            "\1\u014d",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u0153",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u0157",
            "\1\u0158",
            "",
            "\1\u0159",
            "\1\u015a",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "",
            "\1\u0165",
            "\1\u0166",
            "",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u016d",
            "\1\u016e",
            "",
            "\1\u016f",
            "",
            "",
            "",
            "\1\u0170",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u0172",
            "\1\u0173",
            "",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\12\103\7\uffff\23\103\1\u0181\6\103\4\uffff\1\103\1\uffff"+
            "\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u0185",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u0187",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u0189",
            "",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "",
            "\1\u0191",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u0194",
            "",
            "",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "\1\u0197",
            "\1\u0198",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u019b",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u019d",
            "\1\u019e",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "",
            "\1\u01a0",
            "",
            "",
            "\1\u01a1",
            "\1\u01a2",
            "",
            "",
            "\1\u01a3",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u01a5",
            "",
            "\1\u01a6",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u01a9",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | RULE_HEXINT | RULE_BINARY | RULE_REAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_59 = input.LA(1);

                        s = -1;
                        if ( ((LA15_59>='\u0000' && LA15_59<='\uFFFF')) ) {s = 149;}

                        else s = 62;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='=') ) {s = 1;}

                        else if ( (LA15_0=='u') ) {s = 2;}

                        else if ( (LA15_0=='s') ) {s = 3;}

                        else if ( (LA15_0=='d') ) {s = 4;}

                        else if ( (LA15_0=='v') ) {s = 5;}

                        else if ( (LA15_0=='c') ) {s = 6;}

                        else if ( (LA15_0=='S') ) {s = 7;}

                        else if ( (LA15_0=='A') ) {s = 8;}

                        else if ( (LA15_0=='O') ) {s = 9;}

                        else if ( (LA15_0=='X') ) {s = 10;}

                        else if ( (LA15_0=='E') ) {s = 11;}

                        else if ( (LA15_0=='B') ) {s = 12;}

                        else if ( (LA15_0=='U') ) {s = 13;}

                        else if ( (LA15_0=='N') ) {s = 14;}

                        else if ( (LA15_0=='I') ) {s = 15;}

                        else if ( (LA15_0=='C') ) {s = 16;}

                        else if ( (LA15_0=='D') ) {s = 17;}

                        else if ( (LA15_0=='M') ) {s = 18;}

                        else if ( (LA15_0=='L') ) {s = 19;}

                        else if ( (LA15_0=='G') ) {s = 20;}

                        else if ( (LA15_0=='i') ) {s = 21;}

                        else if ( (LA15_0=='-') ) {s = 22;}

                        else if ( (LA15_0=='!') ) {s = 23;}

                        else if ( (LA15_0=='&') ) {s = 24;}

                        else if ( (LA15_0=='@') ) {s = 25;}

                        else if ( (LA15_0=='*') ) {s = 26;}

                        else if ( (LA15_0=='/') ) {s = 27;}

                        else if ( (LA15_0=='%') ) {s = 28;}

                        else if ( (LA15_0=='+') ) {s = 29;}

                        else if ( (LA15_0=='>') ) {s = 30;}

                        else if ( (LA15_0=='<') ) {s = 31;}

                        else if ( (LA15_0=='|') ) {s = 32;}

                        else if ( (LA15_0=='.') ) {s = 33;}

                        else if ( (LA15_0=='a') ) {s = 34;}

                        else if ( (LA15_0=='#') ) {s = 35;}

                        else if ( (LA15_0=='l') ) {s = 36;}

                        else if ( (LA15_0==';') ) {s = 37;}

                        else if ( (LA15_0=='o') ) {s = 38;}

                        else if ( (LA15_0==',') ) {s = 39;}

                        else if ( (LA15_0=='t') ) {s = 40;}

                        else if ( (LA15_0=='p') ) {s = 41;}

                        else if ( (LA15_0=='[') ) {s = 42;}

                        else if ( (LA15_0==']') ) {s = 43;}

                        else if ( (LA15_0=='f') ) {s = 44;}

                        else if ( (LA15_0=='b') ) {s = 45;}

                        else if ( (LA15_0=='{') ) {s = 46;}

                        else if ( (LA15_0=='}') ) {s = 47;}

                        else if ( (LA15_0=='r') ) {s = 48;}

                        else if ( (LA15_0==':') ) {s = 49;}

                        else if ( (LA15_0=='(') ) {s = 50;}

                        else if ( (LA15_0==')') ) {s = 51;}

                        else if ( (LA15_0=='m') ) {s = 52;}

                        else if ( (LA15_0=='e') ) {s = 53;}

                        else if ( (LA15_0=='w') ) {s = 54;}

                        else if ( (LA15_0=='0') ) {s = 55;}

                        else if ( ((LA15_0>='1' && LA15_0<='9')) ) {s = 56;}

                        else if ( (LA15_0=='^') ) {s = 57;}

                        else if ( (LA15_0=='F'||LA15_0=='H'||(LA15_0>='J' && LA15_0<='K')||(LA15_0>='P' && LA15_0<='R')||LA15_0=='T'||(LA15_0>='V' && LA15_0<='W')||(LA15_0>='Y' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='g' && LA15_0<='h')||(LA15_0>='j' && LA15_0<='k')||LA15_0=='n'||LA15_0=='q'||(LA15_0>='x' && LA15_0<='z')) ) {s = 58;}

                        else if ( (LA15_0=='\"') ) {s = 59;}

                        else if ( (LA15_0=='\'') ) {s = 60;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 61;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='$'||LA15_0=='?'||LA15_0=='\\'||LA15_0=='`'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 62;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_60 = input.LA(1);

                        s = -1;
                        if ( ((LA15_60>='\u0000' && LA15_60<='\uFFFF')) ) {s = 149;}

                        else s = 62;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}