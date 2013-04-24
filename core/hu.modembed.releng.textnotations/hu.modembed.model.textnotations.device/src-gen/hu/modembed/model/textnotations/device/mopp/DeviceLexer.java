// $ANTLR 3.4

	package hu.modembed.model.textnotations.device.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class DeviceLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int BINARY=4;
    public static final int IDENTIFIER=5;
    public static final int INT=6;
    public static final int ML_COMMENT=7;
    public static final int QUALIFIEDID=8;
    public static final int SL_COMMENT=9;
    public static final int WHITESPACE=10;

    	public java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionPositions = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_4_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionPositions.add(((org.antlr.runtime3_4_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public DeviceLexer() {} 
    public DeviceLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public DeviceLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Device.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:15:7: ( '(' )
            // Device.g:15:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:16:7: ( ')' )
            // Device.g:16:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:17:7: ( '+' )
            // Device.g:17:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:18:7: ( ',' )
            // Device.g:18:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:19:7: ( '->' )
            // Device.g:19:9: '->'
            {
            match("->"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:20:7: ( ':' )
            // Device.g:20:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:21:7: ( ';' )
            // Device.g:21:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:22:7: ( '=' )
            // Device.g:22:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:23:7: ( '@' )
            // Device.g:23:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:24:7: ( '[' )
            // Device.g:24:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:25:7: ( ']' )
            // Device.g:25:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:26:7: ( 'data' )
            // Device.g:26:9: 'data'
            {
            match("data"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:27:7: ( 'device' )
            // Device.g:27:9: 'device'
            {
            match("device"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:28:7: ( 'extends' )
            // Device.g:28:9: 'extends'
            {
            match("extends"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:29:7: ( 'instructionset' )
            // Device.g:29:9: 'instructionset'
            {
            match("instructionset"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:30:7: ( 'minstance' )
            // Device.g:30:9: 'minstance'
            {
            match("minstance"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:31:7: ( 'mtype' )
            // Device.g:31:9: 'mtype'
            {
            match("mtype"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:32:7: ( 'operation' )
            // Device.g:32:9: 'operation'
            {
            match("operation"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:33:7: ( 'program' )
            // Device.g:33:9: 'program'
            {
            match("program"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:34:7: ( 'type' )
            // Device.g:34:9: 'type'
            {
            match("type"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:35:7: ( 'unsigned' )
            // Device.g:35:9: 'unsigned'
            {
            match("unsigned"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:36:7: ( 'volatile' )
            // Device.g:36:9: 'volatile'
            {
            match("volatile"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:37:7: ( '{' )
            // Device.g:37:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:38:7: ( '}' )
            // Device.g:38:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:2806:11: ( ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // Device.g:2807:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // Device.g:2807:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // Device.g:2807:3: '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("//"); 



            // Device.g:2807:7: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Device.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFE') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:2810:11: ( ( '/*' ( . )* '*/' ) )
            // Device.g:2811:2: ( '/*' ( . )* '*/' )
            {
            // Device.g:2811:2: ( '/*' ( . )* '*/' )
            // Device.g:2811:3: '/*' ( . )* '*/'
            {
            match("/*"); 



            // Device.g:2811:7: ( . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1 >= '\u0000' && LA2_1 <= '.')||(LA2_1 >= '0' && LA2_1 <= '\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0 >= '\u0000' && LA2_0 <= ')')||(LA2_0 >= '+' && LA2_0 <= '\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Device.g:2811:7: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match("*/"); 



            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:2814:11: ( ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* ) )
            // Device.g:2815:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )
            {
            // Device.g:2815:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )
            // Device.g:2815:3: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Device.g:2815:22: ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Device.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "QUALIFIEDID"
    public final void mQUALIFIEDID() throws RecognitionException {
        try {
            int _type = QUALIFIEDID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:2817:12: ( ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* ( '\\.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )* ) )
            // Device.g:2818:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* ( '\\.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )* )
            {
            // Device.g:2818:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* ( '\\.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )* )
            // Device.g:2818:3: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* ( '\\.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Device.g:2818:22: ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Device.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            // Device.g:2818:55: ( '\\.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='.') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Device.g:2818:56: '\\.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            	    {
            	    match('.'); 

            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    // Device.g:2818:79: ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // Device.g:
            	    	    {
            	    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	    	        input.consume();
            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;
            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUALIFIEDID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:2820:4: ( ( ( ( '0' .. '9' ) )+ ) )
            // Device.g:2821:2: ( ( ( '0' .. '9' ) )+ )
            {
            // Device.g:2821:2: ( ( ( '0' .. '9' ) )+ )
            // Device.g:2821:3: ( ( '0' .. '9' ) )+
            {
            // Device.g:2821:3: ( ( '0' .. '9' ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Device.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "BINARY"
    public final void mBINARY() throws RecognitionException {
        try {
            int _type = BINARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:2823:7: ( ( '0b' ( '0' | '1' )* ) )
            // Device.g:2824:2: ( '0b' ( '0' | '1' )* )
            {
            // Device.g:2824:2: ( '0b' ( '0' | '1' )* )
            // Device.g:2824:3: '0b' ( '0' | '1' )*
            {
            match("0b"); 



            // Device.g:2824:7: ( '0' | '1' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '1')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Device.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '1') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BINARY"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Device.g:2827:11: ( ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ ) )
            // Device.g:2828:2: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
            {
            // Device.g:2828:2: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
            // Device.g:2828:3: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
            {
            // Device.g:2828:3: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '\t' && LA9_0 <= '\n')||(LA9_0 >= '\f' && LA9_0 <= '\r')||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Device.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    public void mTokens() throws RecognitionException {
        // Device.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | SL_COMMENT | ML_COMMENT | IDENTIFIER | QUALIFIEDID | INT | BINARY | WHITESPACE )
        int alt10=31;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // Device.g:1:10: T__11
                {
                mT__11(); 


                }
                break;
            case 2 :
                // Device.g:1:16: T__12
                {
                mT__12(); 


                }
                break;
            case 3 :
                // Device.g:1:22: T__13
                {
                mT__13(); 


                }
                break;
            case 4 :
                // Device.g:1:28: T__14
                {
                mT__14(); 


                }
                break;
            case 5 :
                // Device.g:1:34: T__15
                {
                mT__15(); 


                }
                break;
            case 6 :
                // Device.g:1:40: T__16
                {
                mT__16(); 


                }
                break;
            case 7 :
                // Device.g:1:46: T__17
                {
                mT__17(); 


                }
                break;
            case 8 :
                // Device.g:1:52: T__18
                {
                mT__18(); 


                }
                break;
            case 9 :
                // Device.g:1:58: T__19
                {
                mT__19(); 


                }
                break;
            case 10 :
                // Device.g:1:64: T__20
                {
                mT__20(); 


                }
                break;
            case 11 :
                // Device.g:1:70: T__21
                {
                mT__21(); 


                }
                break;
            case 12 :
                // Device.g:1:76: T__22
                {
                mT__22(); 


                }
                break;
            case 13 :
                // Device.g:1:82: T__23
                {
                mT__23(); 


                }
                break;
            case 14 :
                // Device.g:1:88: T__24
                {
                mT__24(); 


                }
                break;
            case 15 :
                // Device.g:1:94: T__25
                {
                mT__25(); 


                }
                break;
            case 16 :
                // Device.g:1:100: T__26
                {
                mT__26(); 


                }
                break;
            case 17 :
                // Device.g:1:106: T__27
                {
                mT__27(); 


                }
                break;
            case 18 :
                // Device.g:1:112: T__28
                {
                mT__28(); 


                }
                break;
            case 19 :
                // Device.g:1:118: T__29
                {
                mT__29(); 


                }
                break;
            case 20 :
                // Device.g:1:124: T__30
                {
                mT__30(); 


                }
                break;
            case 21 :
                // Device.g:1:130: T__31
                {
                mT__31(); 


                }
                break;
            case 22 :
                // Device.g:1:136: T__32
                {
                mT__32(); 


                }
                break;
            case 23 :
                // Device.g:1:142: T__33
                {
                mT__33(); 


                }
                break;
            case 24 :
                // Device.g:1:148: T__34
                {
                mT__34(); 


                }
                break;
            case 25 :
                // Device.g:1:154: SL_COMMENT
                {
                mSL_COMMENT(); 


                }
                break;
            case 26 :
                // Device.g:1:165: ML_COMMENT
                {
                mML_COMMENT(); 


                }
                break;
            case 27 :
                // Device.g:1:176: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 28 :
                // Device.g:1:187: QUALIFIEDID
                {
                mQUALIFIEDID(); 


                }
                break;
            case 29 :
                // Device.g:1:199: INT
                {
                mINT(); 


                }
                break;
            case 30 :
                // Device.g:1:203: BINARY
                {
                mBINARY(); 


                }
                break;
            case 31 :
                // Device.g:1:210: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\14\uffff\11\37\3\uffff\1\37\1\32\2\uffff\3\37\2\uffff\11\37\3\uffff"+
        "\13\37\1\103\7\37\1\113\2\37\1\uffff\4\37\1\122\2\37\1\uffff\2\37"+
        "\1\127\3\37\1\uffff\4\37\1\uffff\1\137\3\37\1\143\2\37\1\uffff\3"+
        "\37\1\uffff\1\151\1\152\1\37\1\154\1\155\2\uffff\1\37\2\uffff\3"+
        "\37\1\162\1\uffff";
    static final String DFA10_eofS =
        "\163\uffff";
    static final String DFA10_minS =
        "\1\11\13\uffff\11\56\2\uffff\1\52\1\56\1\142\2\uffff\3\56\2\uffff"+
        "\11\56\3\uffff\26\56\1\uffff\7\56\1\uffff\6\56\1\uffff\4\56\1\uffff"+
        "\7\56\1\uffff\3\56\1\uffff\5\56\2\uffff\1\56\2\uffff\4\56\1\uffff";
    static final String DFA10_maxS =
        "\1\175\13\uffff\11\172\2\uffff\1\57\1\172\1\142\2\uffff\3\172\2"+
        "\uffff\11\172\3\uffff\26\172\1\uffff\7\172\1\uffff\6\172\1\uffff"+
        "\4\172\1\uffff\7\172\1\uffff\3\172\1\uffff\5\172\2\uffff\1\172\2"+
        "\uffff\4\172\1\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\11\uffff"+
        "\1\27\1\30\3\uffff\1\35\1\37\3\uffff\1\33\1\34\11\uffff\1\31\1\32"+
        "\1\36\26\uffff\1\14\7\uffff\1\24\6\uffff\1\21\4\uffff\1\15\7\uffff"+
        "\1\16\3\uffff\1\23\5\uffff\1\25\1\26\1\uffff\1\20\1\22\4\uffff\1"+
        "\17";
    static final String DFA10_specialS =
        "\163\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\33\1\uffff\2\33\22\uffff\1\33\7\uffff\1\1\1\2\1\uffff\1\3"+
            "\1\4\1\5\1\uffff\1\27\1\31\11\32\1\6\1\7\1\uffff\1\10\2\uffff"+
            "\1\11\32\30\1\12\1\uffff\1\13\3\uffff\3\30\1\14\1\15\3\30\1"+
            "\16\3\30\1\17\1\30\1\20\1\21\3\30\1\22\1\23\1\24\4\30\1\25\1"+
            "\uffff\1\26",
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
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\1\34\3\36\1\35\25"+
            "\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\27\36\1\41\2\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\15\36\1\42\14\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\10\36\1\43\12\36"+
            "\1\44\6\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\17\36\1\45\12\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\21\36\1\46\10\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\30\36\1\47\1\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\15\36\1\50\14\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\16\36\1\51\13\36",
            "",
            "",
            "\1\53\4\uffff\1\52",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\32\36",
            "\1\54",
            "",
            "",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\23\36\1\55\6\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\25\36\1\56\4\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\32\36",
            "",
            "",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\23\36\1\57\6\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\22\36\1\60\7\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\15\36\1\61\14\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\30\36\1\62\1\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\4\36\1\63\25\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\16\36\1\64\13\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\17\36\1\65\12\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\22\36\1\66\7\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\13\36\1\67\16\36",
            "",
            "",
            "",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\1\70\31\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\10\36\1\71\21\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\4\36\1\72\25\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\23\36\1\73\6\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\22\36\1\74\7\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\17\36\1\75\12\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\21\36\1\76\10\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\6\36\1\77\23\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\4\36\1\100\25\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\10\36\1\101\21\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\1\102\31\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\32\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\2\36\1\104\27\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\15\36\1\105\14\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\21\36\1\106\10\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\23\36\1\107\6\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\4\36\1\110\25\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\1\111\31\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\21\36\1\112\10\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\32\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\6\36\1\114\23\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\23\36\1\115\6\36",
            "",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\4\36\1\116\25\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\3\36\1\117\26\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\24\36\1\120\5\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\1\121\31\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\32\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\23\36\1\123\6\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\1\124\31\36",
            "",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\15\36\1\125\14\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\10\36\1\126\21\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\32\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\22\36\1\130\7\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\2\36\1\131\27\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\15\36\1\132\14\36",
            "",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\10\36\1\133\21\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\14\36\1\134\15\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\4\36\1\135\25\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\13\36\1\136\16\36",
            "",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\32\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\23\36\1\140\6\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\2\36\1\141\27\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\16\36\1\142\13\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\32\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\3\36\1\144\26\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\4\36\1\145\25\36",
            "",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\10\36\1\146\21\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\4\36\1\147\25\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\15\36\1\150\14\36",
            "",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\32\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\32\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\16\36\1\153\13\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\32\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\32\36",
            "",
            "",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\15\36\1\156\14\36",
            "",
            "",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\22\36\1\157\7\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\4\36\1\160\25\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\23\36\1\161\6\36",
            "\1\40\1\uffff\12\36\7\uffff\32\36\6\uffff\32\36",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | SL_COMMENT | ML_COMMENT | IDENTIFIER | QUALIFIEDID | INT | BINARY | WHITESPACE );";
        }
    }
 

}