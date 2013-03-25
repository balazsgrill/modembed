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
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=8;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int T__28=28;
    public static final int T__65=65;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__59=59;
    public static final int RULE_INT=4;
    public static final int RULE_REAL=7;
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
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_HEXINT=5;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=9;
    public static final int T__33=33;
    public static final int T__71=71;
    public static final int T__34=34;
    public static final int T__72=72;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__70=70;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_BINARY=6;
    public static final int T__76=76;
    public static final int RULE_WS=12;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__77=77;

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11:7: ( 'unsigned' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11:9: 'unsigned'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12:7: ( 'signed' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:12:9: 'signed'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:13:7: ( 'default' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:13:9: 'default'
            {
            match("default"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14:7: ( 'var' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:14:9: 'var'
            {
            match("var"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:15:7: ( 'const' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:15:9: 'const'
            {
            match("const"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:16:7: ( '-' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:16:9: '-'
            {
            match('-'); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:17:7: ( '!' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:17:9: '!'
            {
            match('!'); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:18:7: ( '&' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:18:9: '&'
            {
            match('&'); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:19:7: ( '@' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:19:9: '@'
            {
            match('@'); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:20:7: ( '*' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:20:9: '*'
            {
            match('*'); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:21:7: ( '/' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:21:9: '/'
            {
            match('/'); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:22:7: ( '%' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:22:9: '%'
            {
            match('%'); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:23:7: ( '+' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:23:9: '+'
            {
            match('+'); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:24:7: ( '==' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:24:9: '=='
            {
            match("=="); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:25:7: ( '!=' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:25:9: '!='
            {
            match("!="); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:26:7: ( '>=' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:26:9: '>='
            {
            match(">="); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:27:7: ( '<=' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:27:9: '<='
            {
            match("<="); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:28:7: ( '>' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:28:9: '>'
            {
            match('>'); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:29:7: ( '<' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:29:9: '<'
            {
            match('<'); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:30:7: ( '||' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:30:9: '||'
            {
            match("||"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:31:7: ( '&&' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:31:9: '&&'
            {
            match("&&"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:32:7: ( 'error' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:32:9: 'error'
            {
            match("error"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:33:7: ( 'warning' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:33:9: 'warning'
            {
            match("warning"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:34:7: ( 'info' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:34:9: 'info'
            {
            match("info"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:35:7: ( '=' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:35:9: '='
            {
            match('='); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:36:7: ( '+=' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:36:9: '+='
            {
            match("+="); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:37:7: ( '-=' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:37:9: '-='
            {
            match("-="); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:38:7: ( '.' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:38:9: '.'
            {
            match('.'); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:39:7: ( '::' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:39:9: '::'
            {
            match("::"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:40:7: ( 'annotation' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:40:9: 'annotation'
            {
            match("annotation"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:41:7: ( '#' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:41:9: '#'
            {
            match('#'); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:42:7: ( 'workflow' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:42:9: 'workflow'
            {
            match("workflow"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:43:7: ( ';' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:43:9: ';'
            {
            match(';'); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:44:7: ( '{' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:44:9: '{'
            {
            match('{'); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:45:7: ( '}' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:45:9: '}'
            {
            match('}'); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:46:7: ( 'instructionset' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:46:9: 'instructionset'
            {
            match("instructionset"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:47:7: ( 'extends' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:47:9: 'extends'
            {
            match("extends"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:48:7: ( '?' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:48:9: '?'
            {
            match('?'); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:49:7: ( ':' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:49:9: ':'
            {
            match(':'); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:50:7: ( '$' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:50:9: '$'
            {
            match('$'); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:51:7: ( 'library' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:51:9: 'library'
            {
            match("library"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:52:7: ( 'use' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:52:9: 'use'
            {
            match("use"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:53:7: ( 'type' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:53:9: 'type'
            {
            match("type"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:54:7: ( 'void' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:54:9: 'void'
            {
            match("void"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:55:7: ( 'pointer' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:55:9: 'pointer'
            {
            match("pointer"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:56:7: ( 'array' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:56:9: 'array'
            {
            match("array"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:57:7: ( '[' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:57:9: '['
            {
            match('['); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:58:7: ( ']' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:58:9: ']'
            {
            match(']'); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:59:7: ( 'label' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:59:9: 'label'
            {
            match("label"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:60:7: ( 'fixed' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:60:9: 'fixed'
            {
            match("fixed"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:61:7: ( 'bits' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:61:9: 'bits'
            {
            match("bits"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:62:7: ( 'scale' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:62:9: 'scale'
            {
            match("scale"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:63:7: ( 'struct' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:63:9: 'struct'
            {
            match("struct"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:64:7: ( ',' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:64:9: ','
            {
            match(','); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:65:7: ( 'reg' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:65:9: 'reg'
            {
            match("reg"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:66:7: ( '(' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:66:9: '('
            {
            match('('); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:67:7: ( ')' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:67:9: ')'
            {
            match(')'); 

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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:68:7: ( 'function' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:68:9: 'function'
            {
            match("function"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:69:7: ( 'overrides' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:69:9: 'overrides'
            {
            match("overrides"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:70:7: ( 'lazy' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:70:9: 'lazy'
            {
            match("lazy"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:71:7: ( 'sizeof' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:71:9: 'sizeof'
            {
            match("sizeof"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:72:7: ( '->' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:72:9: '->'
            {
            match("->"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:73:7: ( 'isliteral' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:73:9: 'isliteral'
            {
            match("isliteral"); 


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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:74:7: ( 'result' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:74:9: 'result'
            {
            match("result"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "RULE_HEXINT"
    public final void mRULE_HEXINT() throws RecognitionException {
        try {
            int _type = RULE_HEXINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11225:13: ( '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11225:15: '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            match("0x"); 

            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11225:20: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11227:13: ( 'b' ( '0' | '1' )+ )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11227:15: 'b' ( '0' | '1' )+
            {
            match('b'); 
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11227:19: ( '0' | '1' )+
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11229:11: ( RULE_INT '.' ( RULE_INT )? )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11229:13: RULE_INT '.' ( RULE_INT )?
            {
            mRULE_INT(); 
            match('.'); 
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11229:26: ( RULE_INT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11229:26: RULE_INT
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11231:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11231:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11231:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11231:11: '^'
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

            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11231:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11233:10: ( ( '0' .. '9' )+ )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11233:12: ( '0' .. '9' )+
            {
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11233:12: ( '0' .. '9' )+
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
            	    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11233:13: '0' .. '9'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11235:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11235:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11235:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11235:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11235:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11235:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11235:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11235:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11235:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11235:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11235:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11237:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11237:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11237:24: ( options {greedy=false; } : . )*
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
            	    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11237:52: .
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11239:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11239:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11239:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11239:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11239:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11239:41: ( '\\r' )? '\\n'
                    {
                    // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11239:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11239:41: '\\r'
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11241:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11241:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11241:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11243:16: ( . )
            // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:11243:18: .
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
        // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | RULE_HEXINT | RULE_BINARY | RULE_REAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=74;
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
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:394: RULE_HEXINT
                {
                mRULE_HEXINT(); 

                }
                break;
            case 66 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:406: RULE_BINARY
                {
                mRULE_BINARY(); 

                }
                break;
            case 67 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:418: RULE_REAL
                {
                mRULE_REAL(); 

                }
                break;
            case 68 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:428: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 69 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:436: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 70 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:445: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 71 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:457: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 72 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:473: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 73 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:489: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 74 :
                // ../hu.e.parser.ui/src-gen/hu/e/parser/ui/contentassist/antlr/internal/InternalESyntax.g:1:497: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\5\64\1\76\1\100\1\102\2\uffff\1\107\1\uffff\1\112\1\114"+
        "\1\116\1\120\1\61\3\64\1\uffff\1\132\1\64\6\uffff\3\64\2\uffff\2"+
        "\64\1\uffff\1\64\2\uffff\1\64\2\163\1\61\1\uffff\2\61\2\uffff\2"+
        "\64\1\uffff\7\64\26\uffff\6\64\3\uffff\2\64\6\uffff\4\64\2\uffff"+
        "\3\64\1\u0093\1\uffff\1\64\2\uffff\1\64\3\uffff\1\163\2\uffff\1"+
        "\64\1\u0098\5\64\1\u009e\23\64\1\uffff\1\u00b2\3\64\1\uffff\5\64"+
        "\1\uffff\1\u00bb\5\64\1\u00c1\6\64\1\u00c8\1\u00c9\3\64\1\u00cd"+
        "\1\uffff\5\64\1\u00d3\2\64\1\uffff\1\u00d6\1\u00d7\3\64\1\uffff"+
        "\3\64\1\u00de\1\64\1\u00e0\2\uffff\1\64\1\u00e2\1\64\1\uffff\3\64"+
        "\1\u00e7\1\u00e8\1\uffff\1\u00e9\1\64\2\uffff\6\64\1\uffff\1\64"+
        "\1\uffff\1\64\1\uffff\1\64\1\u00f4\2\64\3\uffff\1\u00f7\1\u00f8"+
        "\1\u00f9\4\64\1\u00fe\1\u00ff\1\64\1\uffff\1\64\1\u0102\3\uffff"+
        "\1\u0103\3\64\2\uffff\1\u0107\1\64\2\uffff\1\64\1\u010a\1\64\1\uffff"+
        "\1\u010c\1\64\1\uffff\1\u010e\1\uffff\1\64\1\uffff\2\64\1\u0112"+
        "\1\uffff";
    static final String DFA15_eofS =
        "\u0113\uffff";
    static final String DFA15_minS =
        "\1\0\1\156\1\143\1\145\1\141\1\157\2\75\1\46\2\uffff\1\52\1\uffff"+
        "\4\75\1\174\1\162\1\141\1\156\1\uffff\1\72\1\156\6\uffff\1\141\1"+
        "\171\1\157\2\uffff\1\151\1\60\1\uffff\1\145\2\uffff\1\166\2\56\1"+
        "\101\1\uffff\2\0\2\uffff\1\163\1\145\1\uffff\1\147\1\141\1\162\1"+
        "\146\1\162\1\151\1\156\26\uffff\1\162\1\164\2\162\1\146\1\154\3"+
        "\uffff\1\156\1\162\6\uffff\2\142\1\160\1\151\2\uffff\1\170\1\156"+
        "\1\164\1\60\1\uffff\1\147\2\uffff\1\145\3\uffff\1\56\2\uffff\1\151"+
        "\1\60\1\156\1\145\1\154\1\165\1\141\1\60\1\144\1\163\1\157\1\145"+
        "\1\156\1\153\1\157\1\164\1\151\1\157\1\141\1\162\1\145\1\171\1\145"+
        "\1\156\1\145\1\143\1\163\1\uffff\1\60\1\165\1\162\1\147\1\uffff"+
        "\1\145\1\157\1\145\1\143\1\165\1\uffff\1\60\1\164\1\162\1\156\1"+
        "\151\1\146\1\60\1\162\2\164\1\171\1\141\1\154\2\60\1\164\1\144\1"+
        "\164\1\60\1\uffff\1\154\1\162\1\156\1\144\1\146\1\60\1\164\1\154"+
        "\1\uffff\2\60\1\144\1\156\1\154\1\uffff\1\165\1\145\1\141\1\60\1"+
        "\162\1\60\2\uffff\1\145\1\60\1\151\1\uffff\1\164\1\151\1\145\2\60"+
        "\1\uffff\1\60\1\164\2\uffff\1\163\1\147\1\157\1\143\1\162\1\164"+
        "\1\uffff\1\171\1\uffff\1\162\1\uffff\1\157\1\60\2\144\3\uffff\3"+
        "\60\1\167\1\164\1\141\1\151\2\60\1\156\1\uffff\1\145\1\60\3\uffff"+
        "\1\60\1\151\1\154\1\157\2\uffff\1\60\1\163\2\uffff\1\157\1\60\1"+
        "\156\1\uffff\1\60\1\156\1\uffff\1\60\1\uffff\1\163\1\uffff\1\145"+
        "\1\164\1\60\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\163\1\164\1\145\2\157\1\76\1\75\1\46\2\uffff\1\57\1"+
        "\uffff\4\75\1\174\1\170\1\157\1\163\1\uffff\1\72\1\162\6\uffff\1"+
        "\151\1\171\1\157\2\uffff\1\165\1\151\1\uffff\1\145\2\uffff\1\166"+
        "\1\170\1\71\1\172\1\uffff\2\uffff\2\uffff\1\163\1\145\1\uffff\1"+
        "\172\1\141\1\162\1\146\1\162\1\151\1\156\26\uffff\1\162\1\164\2"+
        "\162\1\163\1\154\3\uffff\1\156\1\162\6\uffff\1\142\1\172\1\160\1"+
        "\151\2\uffff\1\170\1\156\1\164\1\172\1\uffff\1\163\2\uffff\1\145"+
        "\3\uffff\1\71\2\uffff\1\151\1\172\1\156\1\145\1\154\1\165\1\141"+
        "\1\172\1\144\1\163\1\157\1\145\1\156\1\153\1\157\1\164\1\151\1\157"+
        "\1\141\1\162\1\145\1\171\1\145\1\156\1\145\1\143\1\163\1\uffff\1"+
        "\172\1\165\1\162\1\147\1\uffff\1\145\1\157\1\145\1\143\1\165\1\uffff"+
        "\1\172\1\164\1\162\1\156\1\151\1\146\1\172\1\162\2\164\1\171\1\141"+
        "\1\154\2\172\1\164\1\144\1\164\1\172\1\uffff\1\154\1\162\1\156\1"+
        "\144\1\146\1\172\1\164\1\154\1\uffff\2\172\1\144\1\156\1\154\1\uffff"+
        "\1\165\1\145\1\141\1\172\1\162\1\172\2\uffff\1\145\1\172\1\151\1"+
        "\uffff\1\164\1\151\1\145\2\172\1\uffff\1\172\1\164\2\uffff\1\163"+
        "\1\147\1\157\1\143\1\162\1\164\1\uffff\1\171\1\uffff\1\162\1\uffff"+
        "\1\157\1\172\2\144\3\uffff\3\172\1\167\1\164\1\141\1\151\2\172\1"+
        "\156\1\uffff\1\145\1\172\3\uffff\1\172\1\151\1\154\1\157\2\uffff"+
        "\1\172\1\163\2\uffff\1\157\1\172\1\156\1\uffff\1\172\1\156\1\uffff"+
        "\1\172\1\uffff\1\163\1\uffff\1\145\1\164\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\11\uffff\1\11\1\12\1\uffff\1\14\10\uffff\1\34\2\uffff\1\37\1\41"+
        "\1\42\1\43\1\46\1\50\3\uffff\1\57\1\60\2\uffff\1\66\1\uffff\1\70"+
        "\1\71\4\uffff\1\104\2\uffff\1\111\1\112\2\uffff\1\104\7\uffff\1"+
        "\33\1\76\1\6\1\17\1\7\1\25\1\10\1\11\1\12\1\107\1\110\1\13\1\14"+
        "\1\32\1\15\1\16\1\31\1\20\1\22\1\21\1\23\1\24\6\uffff\1\34\1\35"+
        "\1\47\2\uffff\1\37\1\41\1\42\1\43\1\46\1\50\4\uffff\1\57\1\60\4"+
        "\uffff\1\66\1\uffff\1\70\1\71\1\uffff\1\101\1\105\1\103\1\uffff"+
        "\1\106\1\111\33\uffff\1\102\4\uffff\1\52\5\uffff\1\4\23\uffff\1"+
        "\67\10\uffff\1\54\5\uffff\1\30\6\uffff\1\74\1\53\3\uffff\1\63\5"+
        "\uffff\1\64\2\uffff\1\5\1\26\6\uffff\1\56\1\uffff\1\61\1\uffff\1"+
        "\62\4\uffff\1\2\1\75\1\65\12\uffff\1\100\2\uffff\1\3\1\45\1\27\4"+
        "\uffff\1\51\1\55\2\uffff\1\1\1\40\3\uffff\1\72\2\uffff\1\77\1\uffff"+
        "\1\73\1\uffff\1\36\3\uffff\1\44";
    static final String DFA15_specialS =
        "\1\2\55\uffff\1\1\1\0\u00e3\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\61\2\60\2\61\1\60\22\61\1\60\1\7\1\56\1\30\1\35\1\14\1"+
            "\10\1\57\1\47\1\50\1\12\1\15\1\45\1\6\1\25\1\13\1\52\11\53\1"+
            "\26\1\31\1\20\1\16\1\17\1\34\1\11\32\55\1\41\1\61\1\42\1\54"+
            "\1\55\1\61\1\27\1\44\1\5\1\3\1\22\1\43\2\55\1\24\2\55\1\36\2"+
            "\55\1\51\1\40\1\55\1\46\1\2\1\37\1\1\1\4\1\23\3\55\1\32\1\21"+
            "\1\33\uff82\61",
            "\1\62\4\uffff\1\63",
            "\1\66\5\uffff\1\65\12\uffff\1\67",
            "\1\70",
            "\1\71\15\uffff\1\72",
            "\1\73",
            "\1\74\1\75",
            "\1\77",
            "\1\101",
            "",
            "",
            "\1\105\4\uffff\1\106",
            "",
            "\1\111",
            "\1\113",
            "\1\115",
            "\1\117",
            "\1\121",
            "\1\122\5\uffff\1\123",
            "\1\124\15\uffff\1\125",
            "\1\126\4\uffff\1\127",
            "",
            "\1\131",
            "\1\133\3\uffff\1\134",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\144\7\uffff\1\143",
            "\1\145",
            "\1\146",
            "",
            "",
            "\1\151\13\uffff\1\152",
            "\2\154\67\uffff\1\153",
            "",
            "\1\156",
            "",
            "",
            "\1\161",
            "\1\164\1\uffff\12\165\76\uffff\1\162",
            "\1\164\1\uffff\12\165",
            "\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\0\166",
            "\0\166",
            "",
            "",
            "\1\170",
            "\1\171",
            "",
            "\1\172\22\uffff\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
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
            "",
            "",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086\14\uffff\1\u0087",
            "\1\u0088",
            "",
            "",
            "",
            "\1\u0089",
            "\1\u008a",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u008b",
            "\1\u008c\27\uffff\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "",
            "",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\2\154\10\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0094\13\uffff\1\u0095",
            "",
            "",
            "\1\u0096",
            "",
            "",
            "",
            "\1\164\1\uffff\12\165",
            "",
            "",
            "\1\u0097",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00d4",
            "\1\u00d5",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00df",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u00e1",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00e3",
            "",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00ea",
            "",
            "",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "",
            "\1\u00f1",
            "",
            "\1\u00f2",
            "",
            "\1\u00f3",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00f5",
            "\1\u00f6",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0100",
            "",
            "\1\u0101",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0108",
            "",
            "",
            "\1\u0109",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u010b",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u010d",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u010f",
            "",
            "\1\u0110",
            "\1\u0111",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
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
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | RULE_HEXINT | RULE_BINARY | RULE_REAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_47 = input.LA(1);

                        s = -1;
                        if ( ((LA15_47>='\u0000' && LA15_47<='\uFFFF')) ) {s = 118;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_46 = input.LA(1);

                        s = -1;
                        if ( ((LA15_46>='\u0000' && LA15_46<='\uFFFF')) ) {s = 118;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='u') ) {s = 1;}

                        else if ( (LA15_0=='s') ) {s = 2;}

                        else if ( (LA15_0=='d') ) {s = 3;}

                        else if ( (LA15_0=='v') ) {s = 4;}

                        else if ( (LA15_0=='c') ) {s = 5;}

                        else if ( (LA15_0=='-') ) {s = 6;}

                        else if ( (LA15_0=='!') ) {s = 7;}

                        else if ( (LA15_0=='&') ) {s = 8;}

                        else if ( (LA15_0=='@') ) {s = 9;}

                        else if ( (LA15_0=='*') ) {s = 10;}

                        else if ( (LA15_0=='/') ) {s = 11;}

                        else if ( (LA15_0=='%') ) {s = 12;}

                        else if ( (LA15_0=='+') ) {s = 13;}

                        else if ( (LA15_0=='=') ) {s = 14;}

                        else if ( (LA15_0=='>') ) {s = 15;}

                        else if ( (LA15_0=='<') ) {s = 16;}

                        else if ( (LA15_0=='|') ) {s = 17;}

                        else if ( (LA15_0=='e') ) {s = 18;}

                        else if ( (LA15_0=='w') ) {s = 19;}

                        else if ( (LA15_0=='i') ) {s = 20;}

                        else if ( (LA15_0=='.') ) {s = 21;}

                        else if ( (LA15_0==':') ) {s = 22;}

                        else if ( (LA15_0=='a') ) {s = 23;}

                        else if ( (LA15_0=='#') ) {s = 24;}

                        else if ( (LA15_0==';') ) {s = 25;}

                        else if ( (LA15_0=='{') ) {s = 26;}

                        else if ( (LA15_0=='}') ) {s = 27;}

                        else if ( (LA15_0=='?') ) {s = 28;}

                        else if ( (LA15_0=='$') ) {s = 29;}

                        else if ( (LA15_0=='l') ) {s = 30;}

                        else if ( (LA15_0=='t') ) {s = 31;}

                        else if ( (LA15_0=='p') ) {s = 32;}

                        else if ( (LA15_0=='[') ) {s = 33;}

                        else if ( (LA15_0==']') ) {s = 34;}

                        else if ( (LA15_0=='f') ) {s = 35;}

                        else if ( (LA15_0=='b') ) {s = 36;}

                        else if ( (LA15_0==',') ) {s = 37;}

                        else if ( (LA15_0=='r') ) {s = 38;}

                        else if ( (LA15_0=='(') ) {s = 39;}

                        else if ( (LA15_0==')') ) {s = 40;}

                        else if ( (LA15_0=='o') ) {s = 41;}

                        else if ( (LA15_0=='0') ) {s = 42;}

                        else if ( ((LA15_0>='1' && LA15_0<='9')) ) {s = 43;}

                        else if ( (LA15_0=='^') ) {s = 44;}

                        else if ( ((LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='g' && LA15_0<='h')||(LA15_0>='j' && LA15_0<='k')||(LA15_0>='m' && LA15_0<='n')||LA15_0=='q'||(LA15_0>='x' && LA15_0<='z')) ) {s = 45;}

                        else if ( (LA15_0=='\"') ) {s = 46;}

                        else if ( (LA15_0=='\'') ) {s = 47;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 48;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='\\'||LA15_0=='`'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 49;}

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