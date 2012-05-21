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
    public static final int RULE_ID=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
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
    public static final int T__13=13;
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
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_STRING=8;
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
    public static final int T__105=105;
    public static final int T__106=106;
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
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_WS=11;

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

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14:7: ( 'real' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14:9: 'real'
            {
            match("real"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:15:7: ( 'default' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:15:9: 'default'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:16:7: ( 'var' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:16:9: 'var'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:17:7: ( 'const' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:17:9: 'const'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:18:7: ( 'SET' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:18:9: 'SET'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:19:7: ( 'ADD' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:19:9: 'ADD'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:20:7: ( 'SUBTRACT' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:20:9: 'SUBTRACT'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:21:7: ( 'AND' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:21:9: 'AND'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:22:7: ( 'OR' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:22:9: 'OR'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:23:7: ( 'XOR' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:23:9: 'XOR'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:24:7: ( 'EQUALS' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:24:9: 'EQUALS'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:25:7: ( 'BRANCH' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:25:9: 'BRANCH'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:26:7: ( 'UC_GOTO' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:26:9: 'UC_GOTO'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:27:7: ( 'NOT' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:27:9: 'NOT'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:28:7: ( 'INDIRECTION' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:28:9: 'INDIRECTION'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:29:7: ( 'CLEAR' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:29:9: 'CLEAR'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:30:7: ( 'INCREMENT' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:30:9: 'INCREMENT'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:31:7: ( 'DECREMENT' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:31:9: 'DECREMENT'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:32:7: ( 'DIV' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:32:9: 'DIV'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:33:7: ( 'MOD' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:33:9: 'MOD'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:34:7: ( 'LT' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:34:9: 'LT'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:35:7: ( 'LTE' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:35:9: 'LTE'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:36:7: ( 'GT' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:36:9: 'GT'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:37:7: ( 'GTE' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:37:9: 'GTE'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:38:7: ( 'intelHexfile' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:38:9: 'intelHexfile'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:39:7: ( 'SRECHexfile' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:39:9: 'SRECHexfile'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:40:7: ( '-' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:40:9: '-'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:41:7: ( '!' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:41:9: '!'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:42:7: ( '&' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:42:9: '&'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:43:7: ( '@' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:43:9: '@'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:44:7: ( '*' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:44:9: '*'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:45:7: ( '/' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:45:9: '/'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:46:7: ( '%' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:46:9: '%'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:47:7: ( '+' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:47:9: '+'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:48:7: ( '==' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:48:9: '=='
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:49:7: ( '!=' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:49:9: '!='
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:50:7: ( '>=' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:50:9: '>='
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:51:7: ( '<=' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:51:9: '<='
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:52:7: ( '>' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:52:9: '>'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:53:7: ( '<' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:53:9: '<'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:54:7: ( '||' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:54:9: '||'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:55:7: ( '&&' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:55:9: '&&'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:56:7: ( '.' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:56:9: '.'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:57:7: ( 'annotation' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:57:9: 'annotation'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:58:7: ( '#' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:58:9: '#'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:59:7: ( 'module' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:59:9: 'module'
            {
            match("module"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:60:7: ( ';' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:60:9: ';'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:61:7: ( 'extends' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:61:9: 'extends'
            {
            match("extends"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:62:7: ( ',' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:62:9: ','
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:63:7: ( 'use' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:63:9: 'use'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:64:7: ( 'ref' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:64:9: 'ref'
            {
            match("ref"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:65:7: ( 'config' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:65:9: 'config'
            {
            match("config"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:66:7: ( 'library' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:66:9: 'library'
            {
            match("library"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:67:7: ( 'overrides' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:67:9: 'overrides'
            {
            match("overrides"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:68:7: ( 'type' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:68:9: 'type'
            {
            match("type"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:69:7: ( 'pointer' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:69:9: 'pointer'
            {
            match("pointer"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:70:7: ( 'of' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:70:9: 'of'
            {
            match("of"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:71:7: ( 'array' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:71:9: 'array'
            {
            match("array"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:72:7: ( '[' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:72:9: '['
            {
            match('['); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:73:7: ( ']' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:73:9: ']'
            {
            match(']'); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:74:7: ( 'bits' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:74:9: 'bits'
            {
            match("bits"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:75:7: ( 'struct' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:75:9: 'struct'
            {
            match("struct"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:76:7: ( '{' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:76:9: '{'
            {
            match('{'); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:77:7: ( '}' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:77:9: '}'
            {
            match('}'); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:78:7: ( 'reg' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:78:9: 'reg'
            {
            match("reg"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:79:7: ( ':' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:79:9: ':'
            {
            match(':'); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:80:7: ( 'label' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:80:9: 'label'
            {
            match("label"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:81:7: ( '(' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:81:9: '('
            {
            match('('); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:82:7: ( ')' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:82:9: ')'
            {
            match(')'); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:83:7: ( 'returns' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:83:9: 'returns'
            {
            match("returns"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:84:7: ( 'operator' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:84:9: 'operator'
            {
            match("operator"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:85:7: ( 'binary' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:85:9: 'binary'
            {
            match("binary"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:86:7: ( 'at' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:86:9: 'at'
            {
            match("at"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:87:7: ( 'program' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:87:9: 'program'
            {
            match("program"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:88:7: ( 'startAddr' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:88:9: 'startAddr'
            {
            match("startAddr"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:89:7: ( 'memwidth' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:89:9: 'memwidth'
            {
            match("memwidth"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:90:7: ( 'pointerType' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:90:9: 'pointerType'
            {
            match("pointerType"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:91:7: ( 'addressType' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:91:9: 'addressType'
            {
            match("addressType"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:92:7: ( 'link' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:92:9: 'link'
            {
            match("link"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:93:7: ( 'lib' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:93:9: 'lib'
            {
            match("lib"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:94:7: ( 'optimize' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:94:9: 'optimize'
            {
            match("optimize"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:95:7: ( 'mem' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:95:9: 'mem'
            {
            match("mem"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:96:7: ( '..' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:96:9: '..'
            {
            match(".."); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:97:7: ( 'data' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:97:9: 'data'
            {
            match("data"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:98:8: ( 'include' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:98:10: 'include'
            {
            match("include"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:99:8: ( 'sizeof' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:99:10: 'sizeof'
            {
            match("sizeof"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:100:8: ( '->' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:100:10: '->'
            {
            match("->"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:101:8: ( 'isliteral' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:101:10: 'isliteral'
            {
            match("isliteral"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:102:8: ( 'if' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:102:10: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:103:8: ( 'else' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:103:10: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:104:8: ( 'while' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:104:10: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "RULE_HEXINT"
    public final void mRULE_HEXINT() throws RecognitionException {
        try {
            int _type = RULE_HEXINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14603:13: ( '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14603:15: '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            match("0x"); 

            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14603:20: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14605:13: ( 'b' ( '0' | '1' )+ )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14605:15: 'b' ( '0' | '1' )+
            {
            match('b'); 
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14605:19: ( '0' | '1' )+
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14607:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14607:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14607:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14607:11: '^'
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

            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14607:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
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
            	    break loop4;
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14609:10: ( ( '0' .. '9' )+ )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14609:12: ( '0' .. '9' )+
            {
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14609:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14609:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14611:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14611:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14611:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14611:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14611:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14611:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14611:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14611:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14611:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14611:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14611:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14613:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14613:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14613:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14613:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14615:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14615:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14615:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14615:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14615:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14615:41: ( '\\r' )? '\\n'
                    {
                    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14615:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14615:41: '\\r'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14617:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14617:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14617:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14619:16: ( . )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14619:18: .
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
        // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | RULE_HEXINT | RULE_BINARY | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=103;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:244: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:250: T__53
                {
                mT__53(); 

                }
                break;
            case 42 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:256: T__54
                {
                mT__54(); 

                }
                break;
            case 43 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:262: T__55
                {
                mT__55(); 

                }
                break;
            case 44 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:268: T__56
                {
                mT__56(); 

                }
                break;
            case 45 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:274: T__57
                {
                mT__57(); 

                }
                break;
            case 46 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:280: T__58
                {
                mT__58(); 

                }
                break;
            case 47 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:286: T__59
                {
                mT__59(); 

                }
                break;
            case 48 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:292: T__60
                {
                mT__60(); 

                }
                break;
            case 49 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:298: T__61
                {
                mT__61(); 

                }
                break;
            case 50 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:304: T__62
                {
                mT__62(); 

                }
                break;
            case 51 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:310: T__63
                {
                mT__63(); 

                }
                break;
            case 52 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:316: T__64
                {
                mT__64(); 

                }
                break;
            case 53 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:322: T__65
                {
                mT__65(); 

                }
                break;
            case 54 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:328: T__66
                {
                mT__66(); 

                }
                break;
            case 55 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:334: T__67
                {
                mT__67(); 

                }
                break;
            case 56 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:340: T__68
                {
                mT__68(); 

                }
                break;
            case 57 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:346: T__69
                {
                mT__69(); 

                }
                break;
            case 58 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:352: T__70
                {
                mT__70(); 

                }
                break;
            case 59 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:358: T__71
                {
                mT__71(); 

                }
                break;
            case 60 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:364: T__72
                {
                mT__72(); 

                }
                break;
            case 61 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:370: T__73
                {
                mT__73(); 

                }
                break;
            case 62 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:376: T__74
                {
                mT__74(); 

                }
                break;
            case 63 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:382: T__75
                {
                mT__75(); 

                }
                break;
            case 64 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:388: T__76
                {
                mT__76(); 

                }
                break;
            case 65 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:394: T__77
                {
                mT__77(); 

                }
                break;
            case 66 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:400: T__78
                {
                mT__78(); 

                }
                break;
            case 67 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:406: T__79
                {
                mT__79(); 

                }
                break;
            case 68 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:412: T__80
                {
                mT__80(); 

                }
                break;
            case 69 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:418: T__81
                {
                mT__81(); 

                }
                break;
            case 70 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:424: T__82
                {
                mT__82(); 

                }
                break;
            case 71 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:430: T__83
                {
                mT__83(); 

                }
                break;
            case 72 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:436: T__84
                {
                mT__84(); 

                }
                break;
            case 73 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:442: T__85
                {
                mT__85(); 

                }
                break;
            case 74 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:448: T__86
                {
                mT__86(); 

                }
                break;
            case 75 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:454: T__87
                {
                mT__87(); 

                }
                break;
            case 76 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:460: T__88
                {
                mT__88(); 

                }
                break;
            case 77 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:466: T__89
                {
                mT__89(); 

                }
                break;
            case 78 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:472: T__90
                {
                mT__90(); 

                }
                break;
            case 79 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:478: T__91
                {
                mT__91(); 

                }
                break;
            case 80 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:484: T__92
                {
                mT__92(); 

                }
                break;
            case 81 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:490: T__93
                {
                mT__93(); 

                }
                break;
            case 82 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:496: T__94
                {
                mT__94(); 

                }
                break;
            case 83 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:502: T__95
                {
                mT__95(); 

                }
                break;
            case 84 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:508: T__96
                {
                mT__96(); 

                }
                break;
            case 85 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:514: T__97
                {
                mT__97(); 

                }
                break;
            case 86 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:520: T__98
                {
                mT__98(); 

                }
                break;
            case 87 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:526: T__99
                {
                mT__99(); 

                }
                break;
            case 88 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:532: T__100
                {
                mT__100(); 

                }
                break;
            case 89 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:539: T__101
                {
                mT__101(); 

                }
                break;
            case 90 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:546: T__102
                {
                mT__102(); 

                }
                break;
            case 91 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:553: T__103
                {
                mT__103(); 

                }
                break;
            case 92 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:560: T__104
                {
                mT__104(); 

                }
                break;
            case 93 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:567: T__105
                {
                mT__105(); 

                }
                break;
            case 94 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:574: T__106
                {
                mT__106(); 

                }
                break;
            case 95 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:581: RULE_HEXINT
                {
                mRULE_HEXINT(); 

                }
                break;
            case 96 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:593: RULE_BINARY
                {
                mRULE_BINARY(); 

                }
                break;
            case 97 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:605: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 98 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:613: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 99 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:622: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 100 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:634: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 101 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:650: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 102 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:666: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 103 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:674: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\77\25\102\1\140\1\142\1\144\2\uffff\1\151\2\uffff\1"+
        "\155\1\157\1\75\1\162\1\102\1\uffff\1\102\1\uffff\1\102\1\uffff"+
        "\4\102\2\uffff\1\102\5\uffff\1\102\1\u0091\1\75\2\uffff\2\75\4\uffff"+
        "\2\102\1\uffff\14\102\1\u00a7\12\102\1\u00b4\1\u00b6\2\102\1\u00ba"+
        "\24\uffff\2\102\1\u00bd\1\102\1\uffff\2\102\1\uffff\2\102\1\uffff"+
        "\3\102\1\u00c7\4\102\2\uffff\1\102\1\u00cf\5\uffff\1\102\4\uffff"+
        "\1\102\1\u00d2\5\102\1\u00d8\1\u00d9\3\102\1\u00dd\1\102\1\u00e0"+
        "\2\102\1\u00e3\1\u00e4\1\uffff\1\u00e5\3\102\1\u00e9\4\102\1\u00ee"+
        "\1\u00ef\1\u00f0\1\uffff\1\u00f1\1\uffff\3\102\1\uffff\2\102\1\uffff"+
        "\2\102\1\u00fa\2\102\1\u00fe\3\102\1\uffff\7\102\1\uffff\2\102\1"+
        "\uffff\4\102\1\u010f\2\uffff\2\102\1\u0112\1\uffff\2\102\1\uffff"+
        "\2\102\3\uffff\3\102\1\uffff\4\102\4\uffff\10\102\1\uffff\1\102"+
        "\1\u0127\1\102\1\uffff\1\u0129\4\102\1\u012e\2\102\1\u0131\7\102"+
        "\1\uffff\2\102\1\uffff\1\u013b\10\102\1\u0144\5\102\1\u014a\4\102"+
        "\1\uffff\1\102\1\uffff\1\u0150\3\102\1\uffff\2\102\1\uffff\1\102"+
        "\1\u0157\1\102\1\u0159\1\u015a\1\u015b\3\102\1\uffff\1\u015f\2\102"+
        "\1\u0162\1\u0163\3\102\1\uffff\5\102\1\uffff\1\102\1\u016d\3\102"+
        "\1\uffff\5\102\1\u0176\1\uffff\1\102\3\uffff\1\102\1\u0179\1\u017a"+
        "\1\uffff\2\102\2\uffff\1\u017d\4\102\1\u0182\3\102\1\uffff\1\102"+
        "\1\u0187\1\u0188\3\102\1\u018d\1\u018e\1\uffff\1\u018f\1\102\2\uffff"+
        "\1\u0191\1\102\1\uffff\4\102\1\uffff\3\102\1\u019a\2\uffff\1\102"+
        "\1\u019c\1\u019d\1\102\3\uffff\1\u019f\1\uffff\2\102\1\u01a2\1\u01a3"+
        "\1\102\1\u01a5\2\102\1\uffff\1\u01a8\2\uffff\1\102\1\uffff\2\102"+
        "\2\uffff\1\102\1\uffff\1\u01ad\1\102\1\uffff\1\102\1\u01b0\1\u01b1"+
        "\1\102\1\uffff\1\u01b3\1\u01b4\2\uffff\1\u01b5\3\uffff";
    static final String DFA14_eofS =
        "\u01b6\uffff";
    static final String DFA14_minS =
        "\1\0\1\75\1\156\1\151\1\145\2\141\1\157\1\105\1\104\1\122\1\117"+
        "\1\121\1\122\1\103\1\117\1\116\1\114\1\105\1\117\2\124\1\146\1\76"+
        "\1\75\1\46\2\uffff\1\52\2\uffff\2\75\1\174\1\56\1\144\1\uffff\1"+
        "\145\1\uffff\1\154\1\uffff\1\141\1\146\1\171\1\157\2\uffff\1\60"+
        "\5\uffff\1\150\1\170\1\101\2\uffff\2\0\4\uffff\1\163\1\145\1\uffff"+
        "\1\147\2\141\1\146\1\164\1\162\1\156\1\124\1\102\1\105\2\104\1\60"+
        "\1\122\1\125\1\101\1\137\1\124\1\103\1\105\1\103\1\126\1\104\2\60"+
        "\1\143\1\154\1\60\24\uffff\1\156\1\162\1\60\1\144\1\uffff\1\144"+
        "\1\155\1\uffff\1\164\1\163\1\uffff\2\142\1\145\1\60\1\145\1\160"+
        "\1\151\1\157\2\uffff\1\156\1\60\5\uffff\1\151\4\uffff\1\151\1\60"+
        "\1\156\1\145\1\165\1\162\1\154\2\60\1\165\2\141\1\60\1\146\1\60"+
        "\1\124\1\103\2\60\1\uffff\1\60\1\101\1\116\1\107\1\60\1\111\1\122"+
        "\1\101\1\122\3\60\1\uffff\1\60\1\uffff\1\145\1\154\1\151\1\uffff"+
        "\1\157\1\141\1\uffff\1\162\1\165\1\60\2\145\1\60\1\153\1\145\1\162"+
        "\1\uffff\1\162\1\151\1\145\1\156\1\147\1\163\1\141\1\uffff\1\154"+
        "\1\147\1\uffff\1\145\1\157\1\143\1\164\1\60\2\uffff\1\162\1\165"+
        "\1\60\1\uffff\1\164\1\151\1\uffff\1\122\1\110\3\uffff\1\114\1\103"+
        "\1\117\1\uffff\1\122\1\105\1\122\1\105\4\uffff\1\154\1\165\2\164"+
        "\1\171\1\145\1\154\1\151\1\uffff\1\156\1\60\1\141\1\uffff\1\60\1"+
        "\154\1\162\1\141\1\155\1\60\1\164\1\162\1\60\1\162\1\145\1\156\1"+
        "\144\1\146\1\164\1\101\1\uffff\1\156\1\154\1\uffff\1\60\1\147\1"+
        "\101\1\145\1\123\1\110\1\124\1\105\1\115\1\60\1\115\1\110\1\144"+
        "\1\145\1\141\1\60\1\163\1\145\2\144\1\uffff\1\162\1\uffff\1\60\1"+
        "\151\1\164\1\151\1\uffff\1\145\1\141\1\uffff\1\171\1\60\1\145\3"+
        "\60\1\144\1\163\1\164\1\uffff\1\60\1\103\1\170\2\60\1\117\1\103"+
        "\1\105\1\uffff\1\105\2\145\1\162\1\164\1\uffff\1\163\1\60\1\164"+
        "\1\163\1\171\1\uffff\1\144\1\157\1\172\1\162\1\155\1\60\1\uffff"+
        "\1\144\3\uffff\1\144\2\60\1\uffff\1\124\1\146\2\uffff\1\60\1\124"+
        "\2\116\1\170\1\60\1\141\1\151\1\124\1\uffff\1\150\2\60\1\145\1\162"+
        "\1\145\2\60\1\uffff\1\60\1\162\2\uffff\1\60\1\151\1\uffff\1\111"+
        "\2\124\1\146\1\uffff\1\154\1\157\1\171\1\60\2\uffff\1\163\2\60\1"+
        "\171\3\uffff\1\60\1\uffff\1\154\1\117\2\60\1\151\1\60\1\156\1\160"+
        "\1\uffff\1\60\2\uffff\1\160\1\uffff\1\145\1\116\2\uffff\1\154\1"+
        "\uffff\1\60\1\145\1\uffff\1\145\2\60\1\145\1\uffff\2\60\2\uffff"+
        "\1\60\3\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\75\1\163\1\164\2\145\1\141\1\157\1\125\1\116\1\122\1"+
        "\117\1\121\1\122\1\103\1\117\1\116\1\114\1\111\1\117\2\124\1\163"+
        "\1\76\1\75\1\46\2\uffff\1\57\2\uffff\2\75\1\174\1\56\1\164\1\uffff"+
        "\1\157\1\uffff\1\170\1\uffff\1\151\1\166\1\171\1\162\2\uffff\1\151"+
        "\5\uffff\1\150\1\170\1\172\2\uffff\2\uffff\4\uffff\1\163\1\145\1"+
        "\uffff\1\172\1\162\1\164\1\146\1\164\1\162\1\156\1\124\1\102\1\105"+
        "\2\104\1\172\1\122\1\125\1\101\1\137\1\124\1\104\1\105\1\103\1\126"+
        "\1\104\2\172\1\164\1\154\1\172\24\uffff\1\156\1\162\1\172\1\144"+
        "\1\uffff\1\144\1\155\1\uffff\1\164\1\163\1\uffff\1\156\1\142\1\145"+
        "\1\172\1\164\1\160\1\151\1\157\2\uffff\1\164\1\172\5\uffff\1\151"+
        "\4\uffff\1\151\1\172\1\156\1\145\1\165\1\162\1\154\2\172\1\165\2"+
        "\141\1\172\1\163\1\172\1\124\1\103\2\172\1\uffff\1\172\1\101\1\116"+
        "\1\107\1\172\1\111\1\122\1\101\1\122\3\172\1\uffff\1\172\1\uffff"+
        "\1\145\1\154\1\151\1\uffff\1\157\1\141\1\uffff\1\162\1\165\1\172"+
        "\2\145\1\172\1\153\1\145\1\162\1\uffff\1\162\1\151\1\145\1\156\1"+
        "\147\1\163\1\141\1\uffff\1\154\1\147\1\uffff\1\145\1\157\1\143\1"+
        "\164\1\172\2\uffff\1\162\1\165\1\172\1\uffff\1\164\1\151\1\uffff"+
        "\1\122\1\110\3\uffff\1\114\1\103\1\117\1\uffff\1\122\1\105\1\122"+
        "\1\105\4\uffff\1\154\1\165\2\164\1\171\1\145\1\154\1\151\1\uffff"+
        "\1\156\1\172\1\141\1\uffff\1\172\1\154\1\162\1\141\1\155\1\172\1"+
        "\164\1\162\1\172\1\162\1\145\1\156\1\144\1\146\1\164\1\101\1\uffff"+
        "\1\156\1\154\1\uffff\1\172\1\147\1\101\1\145\1\123\1\110\1\124\1"+
        "\105\1\115\1\172\1\115\1\110\1\144\1\145\1\141\1\172\1\163\1\145"+
        "\2\144\1\uffff\1\162\1\uffff\1\172\1\151\1\164\1\151\1\uffff\1\145"+
        "\1\141\1\uffff\1\171\1\172\1\145\3\172\1\144\1\163\1\164\1\uffff"+
        "\1\172\1\103\1\170\2\172\1\117\1\103\1\105\1\uffff\1\105\2\145\1"+
        "\162\1\164\1\uffff\1\163\1\172\1\164\1\163\1\171\1\uffff\1\144\1"+
        "\157\1\172\1\162\1\155\1\172\1\uffff\1\144\3\uffff\1\144\2\172\1"+
        "\uffff\1\124\1\146\2\uffff\1\172\1\124\2\116\1\170\1\172\1\141\1"+
        "\151\1\124\1\uffff\1\150\2\172\1\145\1\162\1\145\2\172\1\uffff\1"+
        "\172\1\162\2\uffff\1\172\1\151\1\uffff\1\111\2\124\1\146\1\uffff"+
        "\1\154\1\157\1\171\1\172\2\uffff\1\163\2\172\1\171\3\uffff\1\172"+
        "\1\uffff\1\154\1\117\2\172\1\151\1\172\1\156\1\160\1\uffff\1\172"+
        "\2\uffff\1\160\1\uffff\1\145\1\116\2\uffff\1\154\1\uffff\1\172\1"+
        "\145\1\uffff\1\145\2\172\1\145\1\uffff\2\172\2\uffff\1\172\3\uffff";
    static final String DFA14_acceptS =
        "\32\uffff\1\41\1\42\1\uffff\1\44\1\45\5\uffff\1\60\1\uffff\1\62"+
        "\1\uffff\1\64\4\uffff\1\76\1\77\1\uffff\1\102\1\103\1\105\1\107"+
        "\1\110\3\uffff\1\141\1\142\2\uffff\1\146\1\147\1\46\1\1\2\uffff"+
        "\1\141\34\uffff\1\132\1\36\1\47\1\37\1\55\1\40\1\41\1\42\1\144\1"+
        "\145\1\43\1\44\1\45\1\50\1\52\1\51\1\53\1\54\1\126\1\56\4\uffff"+
        "\1\60\2\uffff\1\62\2\uffff\1\64\10\uffff\1\76\1\77\2\uffff\1\102"+
        "\1\103\1\105\1\107\1\110\1\uffff\1\137\1\142\1\143\1\146\23\uffff"+
        "\1\14\14\uffff\1\30\1\uffff\1\32\3\uffff\1\134\2\uffff\1\114\11"+
        "\uffff\1\74\7\uffff\1\140\2\uffff\1\65\5\uffff\1\66\1\104\3\uffff"+
        "\1\6\2\uffff\1\10\2\uffff\1\11\1\13\1\15\3\uffff\1\21\4\uffff\1"+
        "\26\1\27\1\31\1\33\10\uffff\1\125\3\uffff\1\123\20\uffff\1\4\2\uffff"+
        "\1\127\24\uffff\1\135\1\uffff\1\122\4\uffff\1\72\2\uffff\1\100\11"+
        "\uffff\1\7\10\uffff\1\23\5\uffff\1\75\5\uffff\1\106\6\uffff\1\136"+
        "\1\uffff\1\3\1\131\1\101\3\uffff\1\67\2\uffff\1\16\1\17\11\uffff"+
        "\1\61\10\uffff\1\113\2\uffff\1\111\1\5\2\uffff\1\20\4\uffff\1\130"+
        "\4\uffff\1\63\1\70\4\uffff\1\73\1\115\1\2\1\uffff\1\12\10\uffff"+
        "\1\117\1\uffff\1\112\1\124\1\uffff\1\116\2\uffff\1\24\1\25\1\uffff"+
        "\1\133\2\uffff\1\71\4\uffff\1\57\2\uffff\1\35\1\22\1\uffff\1\121"+
        "\1\120\1\34";
    static final String DFA14_specialS =
        "\1\1\71\uffff\1\2\1\0\u017a\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\75\2\74\2\75\1\74\22\75\1\74\1\30\1\72\1\44\1\75\1\35\1"+
            "\31\1\73\1\63\1\64\1\33\1\36\1\50\1\27\1\42\1\34\1\66\11\71"+
            "\1\62\1\46\1\40\1\1\1\37\1\75\1\32\1\11\1\15\1\21\1\22\1\14"+
            "\1\70\1\25\1\70\1\20\2\70\1\24\1\23\1\17\1\12\3\70\1\10\1\70"+
            "\1\16\2\70\1\13\2\70\1\55\1\75\1\56\1\67\1\70\1\75\1\43\1\57"+
            "\1\7\1\5\1\47\3\70\1\26\2\70\1\51\1\45\1\70\1\52\1\54\1\70\1"+
            "\4\1\3\1\53\1\2\1\6\1\65\3\70\1\60\1\41\1\61\uff82\75",
            "\1\76",
            "\1\100\4\uffff\1\101",
            "\1\103\12\uffff\1\104",
            "\1\105",
            "\1\107\3\uffff\1\106",
            "\1\110",
            "\1\111",
            "\1\112\14\uffff\1\114\2\uffff\1\113",
            "\1\115\11\uffff\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127\3\uffff\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\136\7\uffff\1\134\4\uffff\1\135",
            "\1\137",
            "\1\141",
            "\1\143",
            "",
            "",
            "\1\147\4\uffff\1\150",
            "",
            "",
            "\1\154",
            "\1\156",
            "\1\160",
            "\1\161",
            "\1\166\11\uffff\1\163\3\uffff\1\164\1\uffff\1\165",
            "",
            "\1\171\11\uffff\1\170",
            "",
            "\1\174\13\uffff\1\173",
            "",
            "\1\177\7\uffff\1\176",
            "\1\u0081\11\uffff\1\u0082\5\uffff\1\u0080",
            "\1\u0083",
            "\1\u0084\2\uffff\1\u0085",
            "",
            "",
            "\2\u0089\67\uffff\1\u0088",
            "",
            "",
            "",
            "",
            "",
            "\1\u008f",
            "\1\u0090",
            "\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "",
            "\0\u0092",
            "\0\u0092",
            "",
            "",
            "",
            "",
            "\1\u0094",
            "\1\u0095",
            "",
            "\1\u0096\22\uffff\1\u0097",
            "\1\u0099\20\uffff\1\u0098",
            "\1\u009a\4\uffff\1\u009b\1\u009c\14\uffff\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
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
            "\12\102\7\uffff\4\102\1\u00b3\25\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\4\102\1\u00b5\25\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u00b8\20\uffff\1\u00b7",
            "\1\u00b9",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
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
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u00be",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "\1\u00c3\13\uffff\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u00c8\16\uffff\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "",
            "",
            "\1\u00ce\5\uffff\1\u00cd",
            "\2\u0089\10\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d0",
            "",
            "",
            "",
            "",
            "\1\u00d1",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u00df\14\uffff\1\u00de",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u00e1",
            "\1\u00e2",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "",
            "\1\u00f5",
            "\1\u00f6",
            "",
            "\1\u00f7",
            "\1\u00f8",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\26\102\1\u00f9"+
            "\3\102",
            "\1\u00fb",
            "\1\u00fc",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\21\102\1\u00fd"+
            "\10\102",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "",
            "\1\u0109",
            "\1\u010a",
            "",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "",
            "\1\u0110",
            "\1\u0111",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "\1\u0113",
            "\1\u0114",
            "",
            "\1\u0115",
            "\1\u0116",
            "",
            "",
            "",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "",
            "",
            "",
            "",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "",
            "\1\u0126",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0128",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u012f",
            "\1\u0130",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "",
            "\1\u0139",
            "\1\u013a",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "",
            "\1\u014f",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "",
            "\1\u0154",
            "\1\u0155",
            "",
            "\1\u0156",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0158",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0160",
            "\1\u0161",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "",
            "\1\u016c",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "\1\u0177",
            "",
            "",
            "",
            "\1\u0178",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "\1\u017b",
            "\1\u017c",
            "",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "",
            "\1\u0186",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\12\102\7\uffff\23\102\1\u018c\6\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0190",
            "",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0192",
            "",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "",
            "\1\u019b",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u019e",
            "",
            "",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "\1\u01a0",
            "\1\u01a1",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u01a4",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u01a6",
            "\1\u01a7",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "",
            "\1\u01a9",
            "",
            "\1\u01aa",
            "\1\u01ab",
            "",
            "",
            "\1\u01ac",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u01ae",
            "",
            "\1\u01af",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u01b2",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | RULE_HEXINT | RULE_BINARY | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_59 = input.LA(1);

                        s = -1;
                        if ( ((LA14_59>='\u0000' && LA14_59<='\uFFFF')) ) {s = 146;}

                        else s = 61;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='=') ) {s = 1;}

                        else if ( (LA14_0=='u') ) {s = 2;}

                        else if ( (LA14_0=='s') ) {s = 3;}

                        else if ( (LA14_0=='r') ) {s = 4;}

                        else if ( (LA14_0=='d') ) {s = 5;}

                        else if ( (LA14_0=='v') ) {s = 6;}

                        else if ( (LA14_0=='c') ) {s = 7;}

                        else if ( (LA14_0=='S') ) {s = 8;}

                        else if ( (LA14_0=='A') ) {s = 9;}

                        else if ( (LA14_0=='O') ) {s = 10;}

                        else if ( (LA14_0=='X') ) {s = 11;}

                        else if ( (LA14_0=='E') ) {s = 12;}

                        else if ( (LA14_0=='B') ) {s = 13;}

                        else if ( (LA14_0=='U') ) {s = 14;}

                        else if ( (LA14_0=='N') ) {s = 15;}

                        else if ( (LA14_0=='I') ) {s = 16;}

                        else if ( (LA14_0=='C') ) {s = 17;}

                        else if ( (LA14_0=='D') ) {s = 18;}

                        else if ( (LA14_0=='M') ) {s = 19;}

                        else if ( (LA14_0=='L') ) {s = 20;}

                        else if ( (LA14_0=='G') ) {s = 21;}

                        else if ( (LA14_0=='i') ) {s = 22;}

                        else if ( (LA14_0=='-') ) {s = 23;}

                        else if ( (LA14_0=='!') ) {s = 24;}

                        else if ( (LA14_0=='&') ) {s = 25;}

                        else if ( (LA14_0=='@') ) {s = 26;}

                        else if ( (LA14_0=='*') ) {s = 27;}

                        else if ( (LA14_0=='/') ) {s = 28;}

                        else if ( (LA14_0=='%') ) {s = 29;}

                        else if ( (LA14_0=='+') ) {s = 30;}

                        else if ( (LA14_0=='>') ) {s = 31;}

                        else if ( (LA14_0=='<') ) {s = 32;}

                        else if ( (LA14_0=='|') ) {s = 33;}

                        else if ( (LA14_0=='.') ) {s = 34;}

                        else if ( (LA14_0=='a') ) {s = 35;}

                        else if ( (LA14_0=='#') ) {s = 36;}

                        else if ( (LA14_0=='m') ) {s = 37;}

                        else if ( (LA14_0==';') ) {s = 38;}

                        else if ( (LA14_0=='e') ) {s = 39;}

                        else if ( (LA14_0==',') ) {s = 40;}

                        else if ( (LA14_0=='l') ) {s = 41;}

                        else if ( (LA14_0=='o') ) {s = 42;}

                        else if ( (LA14_0=='t') ) {s = 43;}

                        else if ( (LA14_0=='p') ) {s = 44;}

                        else if ( (LA14_0=='[') ) {s = 45;}

                        else if ( (LA14_0==']') ) {s = 46;}

                        else if ( (LA14_0=='b') ) {s = 47;}

                        else if ( (LA14_0=='{') ) {s = 48;}

                        else if ( (LA14_0=='}') ) {s = 49;}

                        else if ( (LA14_0==':') ) {s = 50;}

                        else if ( (LA14_0=='(') ) {s = 51;}

                        else if ( (LA14_0==')') ) {s = 52;}

                        else if ( (LA14_0=='w') ) {s = 53;}

                        else if ( (LA14_0=='0') ) {s = 54;}

                        else if ( (LA14_0=='^') ) {s = 55;}

                        else if ( (LA14_0=='F'||LA14_0=='H'||(LA14_0>='J' && LA14_0<='K')||(LA14_0>='P' && LA14_0<='R')||LA14_0=='T'||(LA14_0>='V' && LA14_0<='W')||(LA14_0>='Y' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='f' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='k')||LA14_0=='n'||LA14_0=='q'||(LA14_0>='x' && LA14_0<='z')) ) {s = 56;}

                        else if ( ((LA14_0>='1' && LA14_0<='9')) ) {s = 57;}

                        else if ( (LA14_0=='\"') ) {s = 58;}

                        else if ( (LA14_0=='\'') ) {s = 59;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 60;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='$'||LA14_0=='?'||LA14_0=='\\'||LA14_0=='`'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 61;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_58 = input.LA(1);

                        s = -1;
                        if ( ((LA14_58>='\u0000' && LA14_58<='\uFFFF')) ) {s = 146;}

                        else s = 61;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}